package prototype;

import java.util.List;

public class Container implements UMLShape {
    private static long idCount = 1;
    private List<UMLShape> shapes;
    private String label;
    private final long id;

    public Container(List<UMLShape> shapes, String label) {
        this.shapes = shapes;
        this.label = label;
        this.id = idCount++;
    }

    @Override
    public void draw() {
        System.out.printf("%d: Drawing a container with label %s:\n", this.id, this.label);
        for (UMLShape shape : shapes) {
            shape.draw();
        }
    }

    public List<UMLShape> getShapes() {
        return shapes;
    }

    public void setShapes(List<UMLShape> shapes) {
        this.shapes = shapes;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
