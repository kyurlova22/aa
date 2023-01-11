public class VWDirector implements Director {

    @Override
    public void build(Builder builder) {
        builder.createChassis();
        builder.createEngine();
        builder.createBody();
    }
}
