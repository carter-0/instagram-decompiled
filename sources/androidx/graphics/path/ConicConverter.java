package androidx.graphics.path;

public final class ConicConverter {
    public float[] quadraticData = new float[130];

    private final native int internalConicToQuadratics(float[] fArr, int i, float[] fArr2, float f, float f2);
}
