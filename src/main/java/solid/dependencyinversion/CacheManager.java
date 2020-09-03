package solid.dependencyinversion;

public class CacheManager {

    private final Cacheator cacheator;

    public CacheManager(Cacheator cacheator) {
        this.cacheator = cacheator;
    }

    public void addToCache(int id, Object value){
        cacheator.put(id, value);
    }
}
