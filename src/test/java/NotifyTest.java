
import co.ceiba.service.EmailServices;
import co.ceiba.service.NotifyPersonService;
import co.ceiba.testdatabuilder.PersontestDataBuilder;
import domain.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NotifyTest{
    private NotifyPersonService notifyPersonService;
    private EmailServices emailServices;

@Before
public void setup(){
    emailServices = new EmailServices();
    notifyPersonService=new NotifyPersonService(emailServices);
}
    @Test
    public void notifyTest(){
        //Arrange
       Person person = new PersontestDataBuilder().build();
       //Act

    String message=notifyPersonService.notify(person);
        //Assert
        Assert.assertNotNull(message);
    }


}



/*
@test
public class notifyTest {
//Arrange
    Person person = new pesrsonTestDatabuilder().build();
//Act
    String message =notifyPersonServices.notify(person);

 //Assert
    Assert.assertNotNull(message);

}
*/