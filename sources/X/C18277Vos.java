package X;

import android.graphics.PointF;
import java.io.IOException;

/* renamed from: X.Vos  reason: case insensitive filesystem */
public abstract class C18277Vos {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.VZx, java.lang.Object] */
    public static C17544VZx parseFromJson(16F r7) {
        String str;
        Integer num;
        0qQ.A0B(r7, 0);
        try {
            ? obj = new Object();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("stroke_type".equals(A17)) {
                    String A1Q = r7.A1Q();
                    Integer[] A00 = AnonymousClass05K.A00(4);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            num = null;
                            break;
                        }
                        num = A00[i];
                        if (0qQ.A0K(VIZ.A00(num), A1Q)) {
                            break;
                        }
                        i++;
                    }
                    obj.A03 = num;
                } else if ("brush_name".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    obj.A04 = str;
                } else if ("brush_color".equals(A17)) {
                    obj.A01 = r7.A1D();
                } else if ("brush_size".equals(A17)) {
                    obj.A00 = (float) r7.A0U();
                } else if ("touch_sample".equals(A17)) {
                    obj.A02 = C17104VIa.parseFromJson(r7);
                }
                r7.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, C17544VZx vZx) {
        r4.A0c();
        Integer num = vZx.A03;
        if (num != null) {
            r4.A0R("stroke_type", VIZ.A00(num));
        }
        String str = vZx.A04;
        if (str != null) {
            r4.A0R("brush_name", str);
        }
        r4.A0P("brush_color", vZx.A01);
        r4.A0O("brush_size", vZx.A00);
        if (vZx.A02 != null) {
            r4.A0q("touch_sample");
            C18735VzF vzF = vZx.A02;
            r4.A0c();
            PointF pointF = vzF.A04;
            if (pointF != null) {
                r4.A0q("position");
                r4.A0b();
                r4.A0f(pointF.x);
                r4.A0f(pointF.y);
                r4.A0Y();
            }
            r4.A0Q("time", vzF.A03);
            r4.A0O("pressure", vzF.A00);
            r4.A0O("radius", vzF.A01);
            r4.A0P("pos", vzF.A02);
            r4.A0Z();
        }
        r4.A0Z();
    }
}
