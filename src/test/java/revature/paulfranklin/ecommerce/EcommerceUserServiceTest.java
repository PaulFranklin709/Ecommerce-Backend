package revature.paulfranklin.ecommerce;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import revature.paulfranklin.ecommerce.dao.EcommerceUserDAOInterface;
import revature.paulfranklin.ecommerce.service.EcommerceUserService;

public class EcommerceUserServiceTest {
    private EcommerceUserService sut;
    private final EcommerceUserDAOInterface mockUserRepo = Mockito.mock(EcommerceUserDAOInterface.class);

    @Before
    public void init() {
        sut = new EcommerceUserService(mockUserRepo);
    }

    @Test
    public void test_newUser_givenNewUserRequest() {
    }

    @Test
    public void test_findUser_givenUsername() {
    }
}
