/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.OperatingSystem;

/**
 *
 * @author prasa
 */
public class SystemConfig {
    public static OperatingSystem configure(){
        OperatingSystem system = OperatingSystem.getInstance();
        return system;
    }
}
