// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveTrainConstant;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class DriveTrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
  public DriveTrain() {
    //
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  
  //Start here
  
  
  private CANSparkMax frontLeft = new CANSparkMax(DriveTrainConstant.frontLeft,MotorType.kBrushless);
  private CANSparkMax frontRight = new CANSparkMax(DriveTrainConstant.frontRight,MotorType.kBrushless);
  private CANSparkMax middleLeft = new CANSparkMax(DriveTrainConstant.middleLeft,MotorType.kBrushless);
  private CANSparkMax middleRight = new CANSparkMax(DriveTrainConstant.middleRight,MotorType.kBrushless);
  private CANSparkMax backLeft = new CANSparkMax(DriveTrainConstant.backLeft,MotorType.kBrushless);
  private CANSparkMax backRight = new CANSparkMax(DriveTrainConstant.backRight,MotorType.kBrushless);

  
  
  public void setMotors(Double rightVelocity, Double leftVelocity){
    frontLeft.set(leftVelocity);
    middleLeft.set(leftVelocity);
    backLeft.set(leftVelocity);

    
    frontRight.set(rightVelocity);
    middleRight.set(rightVelocity);
    backRight.set(rightVelocity);

  }

}
