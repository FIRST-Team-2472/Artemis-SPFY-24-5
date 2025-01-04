package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;

import frc.robot.Constants;
import frc.robot.Constants.MotorConstants;

public class BallTransferSubsystem extends SubsystemBase{
    public TalonFX IntakeMotor = new TalonFX(Constants.MotorConstants.kIntakeWheelsID);
    public TalonFX ConveyerMotor = new TalonFX(Constants.MotorConstants.kConveyerID);
    public TalonFX ElevatorMotor = new TalonFX(Constants.MotorConstants.kElevatorID);

    public BallTransferSubsystem(){

    }
    public void intakeMotorPower (){
        
    }
    public void periodic(){
        
    }
}