package model;

public class HashTable {

    private int tableSize;
    private String[] hash;

    public HashTable(int tableSize) {
        this.tableSize = tableSize;
        this.hash = new String[tableSize];
    }

    public int getTableSize() {
      return tableSize;
    }

    public String[] getHash() {
        return hash;
    }


    public void put(String key, String value) {
        int size = tableSize;
        int hashValue = hashFunction(key, size);
        if (!hash[hashValue].equals(null)) {
            hashValue += 1;
        }
        hash[hashValue] = value;
    }

    public String get(String key) {
        int size = tableSize;
        int hashValue = hashFunction(key, size);
        String value = hash[hashValue];
        return value;
    }

    public static int hashFunction(String key, int tableSize) {
        int index = key.length() % tableSize;
        return index;
    }

}
