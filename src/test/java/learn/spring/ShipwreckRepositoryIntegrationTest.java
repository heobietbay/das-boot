package learn.spring;

import learn.spring.model.Shipwreck;
import learn.spring.repository.ShipwreckRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.core.Is.is;

/**
 * Created by Administrator on 7/15/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class ShipwreckRepositoryIntegrationTest {
    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @Test
    public void testFindAll(){
        List<Shipwreck> shipwreckList = shipwreckRepository.findAll();
        assertThat(shipwreckList.size(), is(greaterThanOrEqualTo(0)));
    }
}
