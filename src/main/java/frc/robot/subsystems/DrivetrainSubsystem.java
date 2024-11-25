package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DrivetrainSubsystem extends SubsystemBase{
    public TalonFX frontleftCIMMotor = new TalonFX(Constants.MotorConstants.kDriveTrainFrontLeftID);
    public TalonFX frontrightCIMMotor = new TalonFX(Constants.MotorConstants.kDriveTrainFrontRightID);
    public TalonFX backleftCIMMotor = new TalonFX(Constants.MotorConstants.kDriveTrainBackLeftID);
    public TalonFX backrightCIMMotor = new TalonFX(Constants.MotorConstants.kDriveTrainBackRightID);

    public DrivetrainSubsystem(){
    }
    public void moveDriveMotors(double leftMotorPower, double rightMotorPower){
        frontleftCIMMotor.set(leftMotorPower);
        frontrightCIMMotor.set(rightMotorPower);
        backleftCIMMotor.set(leftMotorPower);
        backrightCIMMotor.set(rightMotorPower);
    }
    public void periodic(){
        
    }
}