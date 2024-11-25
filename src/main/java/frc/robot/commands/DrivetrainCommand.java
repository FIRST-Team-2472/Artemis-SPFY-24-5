package frc.robot.commands;

import frc.robot.subsystems.DrivetrainSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import java.util.function.Supplier;

public class DrivetrainCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final DrivetrainSubsystem m_subsystem;
  private final Supplier<Double> JstickXSupplier, JstickYSupplier;

  public DrivetrainCommand(DrivetrainSubsystem subsystem, Supplier<Double> JstickXSupplier, Supplier<Double> JstickYSupplier) {
    m_subsystem = subsystem;
    this.JstickXSupplier = JstickXSupplier;
    this.JstickYSupplier = JstickYSupplier;
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    double leftMotorPower = JstickYSupplier.get() + JstickXSupplier.get();
    double rightMotorPower = JstickYSupplier.get() - JstickXSupplier.get();
    m_subsystem.moveDriveMotors(leftMotorPower, rightMotorPower);
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
