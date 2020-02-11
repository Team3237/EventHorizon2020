/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	private static final double DEADBAND_VALUE = 9.0/127.0;

	public static Joystick lStick = new Joystick (0);
	public static Button lButton1 = new JoystickButton (lStick, 1);
	public static Button lButton2 = new JoystickButton (lStick, 2);
	public static Button lButton3 = new JoystickButton (lStick, 3);
	public static Button lButton4 = new JoystickButton (lStick, 4);
	public static Button lButton5 = new JoystickButton (lStick, 5);
	public static Button lButton6 = new JoystickButton (lStick, 6);
	public static Button lButton7 = new JoystickButton (lStick, 7);
	public static Button lButton8 = new JoystickButton (lStick, 8);
	public static Joystick rStick = new Joystick (1);
	public static Button rButton1 = new JoystickButton (rStick, 1);
	public static Button rButton2 = new JoystickButton (rStick, 2);
	public static Button rButton3 = new JoystickButton (rStick, 3);
	public static Button rbutton4 = new JoystickButton (rStick, 4);
	public static Button rButton5 = new JoystickButton (rStick, 5);
	public static Button rButton6 = new JoystickButton (rStick, 6);
	public static Button rButton7 = new JoystickButton (rStick, 7);
	public static Button rButton8 = new JoystickButton (rStick, 8);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	private static final OI INSTANCE = new OI();

	private OI(){

		lButton2.whileHeld(new ChimneyGo());
		rButton2.whileHeld(new GrabberGo());
		rButton1.whileHeld(new ShooterGo());
		//rButton3.whileHeld(new powerMult());
		lButton4.whenPressed(new ClimberGo());
		rButton5.whenPressed(new HookGo());
	}

	public static OI getInstance(){
		return INSTANCE;
	}

	public double getDriverLeftPower(){
		return -deadband(lStick.getY(GenericHID.Hand.kLeft), DEADBAND_VALUE);
	}

	public double getDriverRightPower(){
		return -deadband(rStick.getY(GenericHID.Hand.kRight), DEADBAND_VALUE);
	}

	private double deadband(double value, double deadband){
		double absValue = Math.abs(value);
		return (absValue < deadband) ? 0 : ((absValue - deadband) / (1.0 - deadband) * Math.signum(value));
	}

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());


	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());


	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
