/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.*;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Chimney extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	//TODO: Motors should be initialized and controlled within the subsystem instead of in RobotMap
	private final WPI_VictorSPX chimneyMotor = new WPI_VictorSPX(RobotMap.CHIMNEY_MOTOR);

	private static final Chimney INSTANCE = new Chimney();

	private Chimney(){
		//TODO:Here you can do any chimneyMotor setup such as reversing it or setting a current limit
		chimneyMotor.setInverted(false);
	}

	public static Chimney getInstance(){
		return INSTANCE;
	}

	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	//TODO: I would also recommend using one method such as a setPower(double power) method for starting and stopping the motors instead of making an individual method for each power you want
	public void go(){
		chimneyMotor.set(1);
	}

	public void stop(){
		chimneyMotor.set(0);
	}

}
