// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFXConfiguration;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {
 
  PWMTalonFX intakeMotor;
  TalonFXConfiguration intakeConfig;
  CANSparkMax intakeCenter;
  CANSparkMax indexer1;
  TalonSRX pooper;

  /** Creates a new intake. */
  public IntakeSubsystem() {
//IntakeMotor 
    intakeMotor = new PWMTalonFX(Constants.intakeMotor);
    // intakeConfig.statorCurrLimit.currentLimit = 40;
   // intakeConfig.statorCurrLimit.triggerThresholdCurrent = 40;
   // intakeConfig.statorCurrLimit.triggerThresholdTime = 0;
    //intakeMotor.configAllSettings(intakeConfig);
//IntakeCenter
    intakeCenter = new CANSparkMax(Constants.intakeCenter, MotorType.kBrushless);
    intakeCenter.setSmartCurrentLimit(Constants.intakeCenterLimit);
//Indexer stage one
    indexer1 = new CANSparkMax(Constants.indexer1, MotorType.kBrushless);
    indexer1.setSmartCurrentLimit(Constants.indexer1Limit);
// pooper
    pooper = new TalonSRX(Constants.pooperMotor);
  




  

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void runIntake() {
    intakeMotor.set(Constants.intakePower);
    intakeCenter.set(Constants.intakeCenterPower);
    indexer1.set(Constants.indexer1Power);
    pooper.set(ControlMode.PercentOutput , Constants.intakePower);
  }
  public void purgeIntake() {
    // intakeCenter.set(-1.0);
    pooper.set(ControlMode.PercentOutput , Constants.purgePower);
    intakeMotor.set(Constants.purgePower);
    indexer1.set(-1.0);
  }
  public void stopIntake() {
    intakeCenter.set(0);
    intakeMotor.set( 0);
    indexer1.set(0);
    pooper.set(ControlMode.PercentOutput , 0);
  }
}
