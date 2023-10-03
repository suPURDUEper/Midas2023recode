// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

//joystick constants
public static final int DriverControllerPort = 0;

//intake constants
public static final int intakeMotor = 0;
public static int intakeCenter = 5;
public static int indexer1 = 6;
public static int pooperMotor = 1;

public static double intakePower = 1.0;
public static double intakeCenterPower = 1.0;
public static double indexer1Power = 1.0;
public static double pooperpower = 1.0;
public static double pooperpurgePower = -1.0;
public static double intakepurgePower = -1.0;
public static double indexer1purgePower = -1.0;

public static int intakeCenterLimit = 20;
public static int indexer1Limit = 20;





//drivetrain constants
public static int leftLead = 1;
public static int leftFollow = 2;
public static int rightLead = 3;
public static int rightFollow = 4;

public static int drivetrainLimit = 60;




}
