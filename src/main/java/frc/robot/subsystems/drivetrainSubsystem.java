// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class drivetrainSubsystem extends SubsystemBase {
  /** Creates a new drivetrainSubsytem. */

  CANSparkMax leftLead;
  CANSparkMax leftFollow;
  CANSparkMax rightLead;
  CANSparkMax rightFollow;

  DifferentialDrive drivetrain;

  public drivetrainSubsystem() {
    leftLead = new CANSparkMax(Constants.leftLead, MotorType.kBrushless);
    leftLead.setSmartCurrentLimit(Constants.drivetrainLimit);

    leftFollow = new CANSparkMax(Constants.intakeCenter, MotorType.kBrushless);
    leftFollow.setSmartCurrentLimit(Constants.drivetrainLimit);
    //Makes the left foollowing motor follow the left leading motor
    leftFollow.follow(leftLead);

    rightLead = new CANSparkMax(Constants.intakeCenter, MotorType.kBrushless);
    rightLead.setSmartCurrentLimit(Constants.drivetrainLimit);

    rightFollow = new CANSparkMax(Constants.intakeCenter, MotorType.kBrushless);
    rightFollow.setSmartCurrentLimit(Constants.drivetrainLimit);
    //Makes the right following motor follow the right leading motor
    rightFollow.follow(rightLead);

    //Set up diffrenetial drive
    drivetrain = new DifferentialDrive(leftLead, rightLead);
  }
  
  public void arcadeDrive(double fwd, double rot) {
    drivetrain.arcadeDrive(fwd,rot);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
