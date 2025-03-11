import ro.mpp2024.model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {

    @Test
    @DisplayName("Test for ComputerRepairRequest")
    public void testComputerRepairRequest() {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest(1, "John", "Str. Mihai Viteazu, nr. 1", "0740123456", "Lenovo", "2021-03-01", "The computer does not start");
        assertEquals(computerRepairRequest.getID(), 1);
        assertEquals(computerRepairRequest.getOwnerName(), "John");
        assertEquals(computerRepairRequest.getOwnerAddress(), "Str. Mihai Viteazu, nr. 1");
        assertEquals(computerRepairRequest.getPhoneNumber(), "0740123456");
        assertEquals(computerRepairRequest.getModel(), "Lenovo");
        assertEquals(computerRepairRequest.getDate(), "2021-03-01");
        assertEquals(computerRepairRequest.getProblemDescription(), "The computer does not start");
    }

    @Test
    @DisplayName("Test for ComputerRepairRequest setters")
    public void testComputerRepairRequestSetters() {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest();
        computerRepairRequest.setID(1);
        computerRepairRequest.setOwnerName("John");
        computerRepairRequest.setOwnerAddress("Str. Mihai Viteazu, nr. 1");
        computerRepairRequest.setPhoneNumber("0740123456");
        computerRepairRequest.setModel("Lenovo");
        computerRepairRequest.setDate("2021-03-01");
        computerRepairRequest.setProblemDescription("The computer does not start");
        assertEquals(computerRepairRequest.getID(), 1);
        assertEquals(computerRepairRequest.getOwnerName(), "John");
        assertEquals(computerRepairRequest.getOwnerAddress(), "Str. Mihai Viteazu, nr. 1");
        assertEquals(computerRepairRequest.getPhoneNumber(), "0740123456");
        assertEquals(computerRepairRequest.getModel(), "Lenovo");
        assertEquals(computerRepairRequest.getDate(), "2021-03-01");
        assertEquals(computerRepairRequest.getProblemDescription(), "The computer does not start");
    }
}