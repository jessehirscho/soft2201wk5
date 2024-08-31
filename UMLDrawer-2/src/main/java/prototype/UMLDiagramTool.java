package prototype;

public class UMLDiagramTool {
    private final UMLShapeCollection shapeCollection;

    public UMLDiagramTool(UMLShapeCollection shapeCollection) {
        this.shapeCollection = shapeCollection;
    }

    public void createShape(UMLShapeType type) {
        UMLShape shape = shapeCollection.getShape(type);
        if (shape != null) {
            // TO DO: Fill in with relevant method call
            shape.draw();
        } else {
            System.out.println("Shape not found: " + type);
        }
    }
}