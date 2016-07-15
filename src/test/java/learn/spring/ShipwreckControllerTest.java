package learn.spring;

import learn.spring.controller.ShipwreckController;
import learn.spring.model.Shipwreck;
import learn.spring.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Administrator on 7/15/2016.
 */
public class ShipwreckControllerTest {

    @Test
    public void testShipwreckGet()
    {
        Shipwreck temp = new Shipwreck();
        temp.setId(1L);
        when(shipwreckRepository.findOne(1L)).thenReturn(temp);

        Shipwreck shipwreck = shipwreckController.get(1L);
        verify(shipwreckRepository).findOne(1L);

        assertEquals(Long.valueOf(1L),shipwreck.getId());
        assertThat(shipwreck.getId(),is(1L));
    }

    @Before
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
    }

    @InjectMocks
    ShipwreckController shipwreckController;

    @Mock
    ShipwreckRepository shipwreckRepository;
}
