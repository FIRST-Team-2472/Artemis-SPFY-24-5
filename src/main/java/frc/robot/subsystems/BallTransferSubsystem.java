package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;

import frc.robot.Constants;
import frc.robot.Constants.MotorConstants;

public class BallTransferSubsystem extends SubsystemBase{
    public TalonFX IntakeMotor1TalonFx = new TalonFX(Constants.MotorConstants.kIntakeWheelsID);
    public TalonFX IntakeMotor2TalonFx = new TalonFX(Constants.MotorConstants.kConveyerID);
    public TalonFX IntakeMotor3TalonFx = new TalonFX(Constants.MotorConstants.kElevatorIDyj);

    public BallTransferSubsystem(){

    }
    public void periodic(){
        
    }
}