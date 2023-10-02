// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivetrainSubsystem;

public class defaultDrive extends CommandBase {
  /** Creates a new defaultDrive. */
  private final drivetrainSubsystem m_drivetrain;

  private final DoubleSupplier m_forward;

  private final DoubleSupplier m_rotation;

  public defaultDrive(drivetrainSubsystem drivetrain, DoubleSupplier fwd, DoubleSupplier rot) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_drivetrain = drivetrain;
    m_forward = fwd;
    m_rotation = rot;
    addRequirements(m_drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrain.arcadeDrive(m_forward.getAsDouble() , m_rotation.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
