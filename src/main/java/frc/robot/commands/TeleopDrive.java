package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.Chassis;

public class TeleopDrive extends Command {

	private final Chassis chassis = Chassis.getInstance();
	private final OI oi = OI.getInstance();

	private static final double ROTATIONAL_SENSITIVITY = 3;
	private static final double FORWARD_SENSITIVITY = 1.7;

	public TeleopDrive(){
		requires(chassis);
	}

	@Override
	protected void execute() {
		double leftThrottle = oi.getDriverLeftPower();
		double rightThrottle = oi.getDriverRightPower();

		// convert left and right controls to forward and rotate so that each can be
		// desensitized with different values
		double forwardPower = desensitizePowerBased((rightThrottle + leftThrottle) / 2, FORWARD_SENSITIVITY);
		double rotatePower = desensitizePowerBased((rightThrottle - leftThrottle) / 2, ROTATIONAL_SENSITIVITY);

		chassis.setPower(forwardPower - rotatePower, forwardPower + rotatePower);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	private double desensitizePowerBased(double value, double power) {
		return Math.pow(Math.abs(value), power - 1) * value;
	}
}
