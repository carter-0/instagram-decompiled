package X;

import java.util.AbstractMap;

public final class GQ0 {
    public Float A00 = null;
    public Float A01 = null;
    public Float A02 = null;
    public Float A03 = null;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;

    public GQ0(int i, int i2, float f, float f2) {
        this.A06 = i;
        this.A07 = i2;
        this.A04 = f;
        this.A05 = f2;
        if (i <= 0 || i2 <= 0) {
            throw AnonymousClass7TE.A0w("Dimensions should be greater than 0");
        }
    }

    public static void A00(GQ0 gq0, Object obj, AbstractMap abstractMap) {
        abstractMap.put("source_of_like", obj);
        float f = gq0.A04;
        int i = gq0.A06;
        abstractMap.put("normalized_position_x", String.valueOf(f / ((float) i)));
        float f2 = gq0.A05;
        int i2 = gq0.A07;
        abstractMap.put("normalized_position_y", String.valueOf(f2 / ((float) i2)));
        abstractMap.put("content_area_dimension_x", String.valueOf(i));
        abstractMap.put("content_area_dimension_y", String.valueOf(i2));
    }
}
