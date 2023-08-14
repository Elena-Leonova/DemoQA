import helpers.HelperStudent;
import models.StudentDTO;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentFormTests extends TestBase implements HelperStudent{
    @BeforeMethod
    public void precondition(){
        hideAds();
        selectItemForms();
        selectPracticeForm();
        hideAds();
        hideFooter();
    }

    @Test
    public void studentFormPositive(){
        StudentDTO studentDTO = StudentDTO.builder()
                .firstName("Elena")
                .lastName("Leonova")
                .email("lena.postrash@gmail.com")
                .gender("Female")
                .phone("0533987231")
                .birthday("09 01 1996")
                .subjects("Maths,Physics")
                .hobbies("Sports,Music")
                .address("Main street, 5")
                .state("NCR")
                .city("Delhi")
                .build();

        fillForm(studentDTO);
        submitForm();
    }
}
