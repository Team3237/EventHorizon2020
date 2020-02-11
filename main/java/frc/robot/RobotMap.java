/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import edu.wpi.first.wpilibj.drive.*;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
  
  public static WPI_VictorSPX Right1;
  public static WPI_VictorSPX Right2;
  public static WPI_VictorSPX Left1;
  public static WPI_VictorSPX Left2;
  public static WPI_VictorSPX ShooterMotor1;
  public static WPI_VictorSPX ShooterMotor2;
  public static WPI_VictorSPX ClimberMotor;
  public static WPI_VictorSPX GrabberMotor;
  public static WPI_VictorSPX HookMotor;
  public static WPI_VictorSPX ChimneyMotor;

  public static SpeedControllerGroup m_left;
  public static SpeedControllerGroup m_right;


  public static DifferentialDrive drive;
  public static Drivetrain Drivetrain;

  
  public static Chimney chimney;
  public static Shooter shooter;
  public static Grabber grabber;
  public static Climber climber;
  public static Hook hook;

  public RobotMap(){
    Right1 = new WPI_VictorSPX(8);
    Right2 = new WPI_VictorSPX(3);
    Left1 = new WPI_VictorSPX(2);
    Left2 = new WPI_VictorSPX(1);

    m_right = new SpeedControllerGroup (Right1, Right2);
    m_left = new SpeedControllerGroup (Left1, Left2);
    

    drive = new DifferentialDrive(m_right, m_left);
    Drivetrain = new Drivetrain();
    //groups together all of the motors used in drive train and names it Drive

    ShooterMotor1 = new WPI_VictorSPX(24);
    ShooterMotor2 = new WPI_VictorSPX(52);
    ClimberMotor = new WPI_VictorSPX(89);
    GrabberMotor = new WPI_VictorSPX(84);
    HookMotor = new WPI_VictorSPX(93);
    ChimneyMotor = new WPI_VictorSPX(74);
    //calls and labels all the motors used besides drive

    
    chimney = new Chimney();
    climber = new Climber();
    grabber = new Grabber();
    hook = new Hook();
    shooter = new Shooter();
    // Setup all subsystems
  }
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
