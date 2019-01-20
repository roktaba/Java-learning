public class Item implements Comparable<Item>{
    private String name;
    private int weight;
    private boolean isLoaded;

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int compareTo(Item o) {
        return Integer.compare(o.weight, this.weight);
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
}
