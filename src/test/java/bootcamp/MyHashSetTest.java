package bootcamp;

import org.junit.Test;
import java.util.HashSet;
import static org.junit.Assert.assertEquals;

public class MyHashSetTest {

    @Test
    public void shouldAddEncryptedValueToHashSet(){
        assertEquals(true, new MyHashSet<String>(new HashSet<>()).add("abc"));
    }
}
