
import model.HashTable;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HashTableTest {
    @Test
    public void test_hash_constructor() {
        HashTable ht = new HashTable(10);
        assertEquals(10, ht.getTableSize());
    }

    @Test
    public void test_hashFunction() {
        String key = "foo";
        int hashArraySize = 10;
        int expectedHashValue = 3;
        int hashValue = HashTable.hashFunction(key, hashArraySize);

        assertEquals(expectedHashValue, hashValue);
    }

    @Test
    public void test_put_method() {
        HashTable ht = new HashTable(10);
        ht.put("foo", "barski");
        String expectedResult = "barski";
        String actualResult = ht.getHash()[3];
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_get_method(){
        HashTable ht = new HashTable(10);
        ht.put("foo", "barski");
        ht.put("food", "truck");
        String expected1 = "barski";
        String expected2 = "truck";
        String actual1 = ht.get("foo");
        String actual2 = ht.get("food");
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);

    }



}
