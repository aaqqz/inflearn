package hello.itemservice.validation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.ObjectError;

<<<<<<< HEAD
import static org.assertj.core.api.Assertions.*;

=======
>>>>>>> 3bd7315a17ee4b139535baed610677b77ec8c3f7
public class MessageCodesResolverTest {

    MessageCodesResolver codesResolver = new DefaultMessageCodesResolver();

    @Test
    void messageCodesResolverObject(){
        String[] messageCodes = codesResolver.resolveMessageCodes("required", "item");
        for (String messageCode : messageCodes) {
            System.out.println("messageCode = " + messageCode);
        }

<<<<<<< HEAD
        assertThat(messageCodes).containsExactly("required.item", "required");
=======
        Assertions.assertThat(messageCodes).containsExactly("required.item", "required");
>>>>>>> 3bd7315a17ee4b139535baed610677b77ec8c3f7
    }

    @Test
    void messageCodesResolverField(){
        String[] messageCodes = codesResolver.resolveMessageCodes("required", "item", "itemName", String.class);
        for (String messageCode : messageCodes) {
            System.out.println("messageCode = " + messageCode);
        }

<<<<<<< HEAD
        assertThat(messageCodes).containsExactly(
                "required.item.itemName",
                "required.itemName",
                "required.java.lang.String",
                "required"
        );
=======

>>>>>>> 3bd7315a17ee4b139535baed610677b77ec8c3f7
    }


}