package X;

import android.graphics.PointF;
import java.io.IOException;

/* renamed from: X.4nK  reason: invalid class name and case insensitive filesystem */
public abstract class C273874nK {
    public static C273884nL parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C273884nL r0 = new C273884nL();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("filter_type".equals(A0q)) {
                    r0.A0P = Integer.valueOf(r4.A1D());
                } else if ("filter_strength".equals(A0q)) {
                    r0.A07 = new Float(r4.A0U());
                } else if ("border_enabled".equals(A0q)) {
                    r0.A0N = Integer.valueOf(r4.A1D());
                } else if ("lux".equals(A0q)) {
                    r0.A09 = new Float(r4.A0U());
                } else if ("structure".equals(A0q)) {
                    r0.A0G = new Float(r4.A0U());
                } else if ("brightness".equals(A0q)) {
                    r0.A03 = new Float(r4.A0U());
                } else if ("contrast".equals(A0q)) {
                    r0.A04 = new Float(r4.A0U());
                } else if ("temperature".equals(A0q)) {
                    r0.A0H = new Float(r4.A0U());
                } else if ("saturation".equals(A0q)) {
                    r0.A0D = new Float(r4.A0U());
                } else if ("highlights".equals(A0q)) {
                    r0.A08 = new Float(r4.A0U());
                } else if ("shadows".equals(A0q)) {
                    r0.A0E = new Float(r4.A0U());
                } else if ("vignette".equals(A0q)) {
                    r0.A0M = new Float(r4.A0U());
                } else if ("fade".equals(A0q)) {
                    r0.A06 = new Float(r4.A0U());
                } else if ("tintShadows".equals(A0q)) {
                    r0.A0L = new Float(r4.A0U());
                } else if ("tintHighlights".equals(A0q)) {
                    r0.A0K = new Float(r4.A0U());
                } else if ("tintShadowsColor".equals(A0q)) {
                    r0.A0S = Integer.valueOf(r4.A1D());
                } else if ("tintHighlightsColor".equals(A0q)) {
                    r0.A0R = Integer.valueOf(r4.A1D());
                } else if ("sharpen".equals(A0q)) {
                    r0.A0F = new Float(r4.A0U());
                } else if ("tiltshift_type".equals(A0q)) {
                    r0.A0Q = Integer.valueOf(r4.A1D());
                } else if ("tiltshift_center".equals(A0q)) {
                    r0.A02 = C273894nM.A00(r4);
                } else if ("tiltshift_radius".equals(A0q)) {
                    r0.A0J = new Float(r4.A0U());
                } else if ("tiltshift_angle".equals(A0q)) {
                    r0.A0I = new Float(r4.A0U());
                } else if ("crop_original_size".equals(A0q)) {
                    r0.A01 = C273894nM.A00(r4);
                } else if ("crop_center".equals(A0q)) {
                    r0.A00 = C273894nM.A00(r4);
                } else if ("crop_zoom".equals(A0q)) {
                    r0.A05 = new Float(r4.A0U());
                } else if ("crop_orientation_angle".equals(A0q)) {
                    r0.A0O = Integer.valueOf(r4.A1D());
                } else if ("perspective_rotation_x".equals(A0q)) {
                    r0.A0A = new Float(r4.A0U());
                } else if ("perspective_rotation_y".equals(A0q)) {
                    r0.A0B = new Float(r4.A0U());
                } else if ("perspective_rotation_z".equals(A0q)) {
                    r0.A0C = new Float(r4.A0U());
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C273884nL r3) {
        r2.A0c();
        Integer num = r3.A0P;
        if (num != null) {
            r2.A0P("filter_type", num.intValue());
        }
        Float f = r3.A07;
        if (f != null) {
            r2.A0O("filter_strength", f.floatValue());
        }
        Integer num2 = r3.A0N;
        if (num2 != null) {
            r2.A0P("border_enabled", num2.intValue());
        }
        Float f2 = r3.A09;
        if (f2 != null) {
            r2.A0O("lux", f2.floatValue());
        }
        Float f3 = r3.A0G;
        if (f3 != null) {
            r2.A0O("structure", f3.floatValue());
        }
        Float f4 = r3.A03;
        if (f4 != null) {
            r2.A0O("brightness", f4.floatValue());
        }
        Float f5 = r3.A04;
        if (f5 != null) {
            r2.A0O("contrast", f5.floatValue());
        }
        Float f6 = r3.A0H;
        if (f6 != null) {
            r2.A0O("temperature", f6.floatValue());
        }
        Float f7 = r3.A0D;
        if (f7 != null) {
            r2.A0O("saturation", f7.floatValue());
        }
        Float f8 = r3.A08;
        if (f8 != null) {
            r2.A0O("highlights", f8.floatValue());
        }
        Float f9 = r3.A0E;
        if (f9 != null) {
            r2.A0O("shadows", f9.floatValue());
        }
        Float f10 = r3.A0M;
        if (f10 != null) {
            r2.A0O("vignette", f10.floatValue());
        }
        Float f11 = r3.A06;
        if (f11 != null) {
            r2.A0O("fade", f11.floatValue());
        }
        Float f12 = r3.A0L;
        if (f12 != null) {
            r2.A0O("tintShadows", f12.floatValue());
        }
        Float f13 = r3.A0K;
        if (f13 != null) {
            r2.A0O("tintHighlights", f13.floatValue());
        }
        Integer num3 = r3.A0S;
        if (num3 != null) {
            r2.A0P("tintShadowsColor", num3.intValue());
        }
        Integer num4 = r3.A0R;
        if (num4 != null) {
            r2.A0P("tintHighlightsColor", num4.intValue());
        }
        Float f14 = r3.A0F;
        if (f14 != null) {
            r2.A0O("sharpen", f14.floatValue());
        }
        Integer num5 = r3.A0Q;
        if (num5 != null) {
            r2.A0P("tiltshift_type", num5.intValue());
        }
        PointF pointF = r3.A02;
        if (pointF != null) {
            C273894nM.A01(pointF, r2, "tiltshift_center");
        }
        Float f15 = r3.A0J;
        if (f15 != null) {
            r2.A0O("tiltshift_radius", f15.floatValue());
        }
        Float f16 = r3.A0I;
        if (f16 != null) {
            r2.A0O("tiltshift_angle", f16.floatValue());
        }
        PointF pointF2 = r3.A01;
        if (pointF2 != null) {
            C273894nM.A01(pointF2, r2, "crop_original_size");
        }
        PointF pointF3 = r3.A00;
        if (pointF3 != null) {
            C273894nM.A01(pointF3, r2, "crop_center");
        }
        Float f17 = r3.A05;
        if (f17 != null) {
            r2.A0O("crop_zoom", f17.floatValue());
        }
        Integer num6 = r3.A0O;
        if (num6 != null) {
            r2.A0P("crop_orientation_angle", num6.intValue());
        }
        Float f18 = r3.A0A;
        if (f18 != null) {
            r2.A0O("perspective_rotation_x", f18.floatValue());
        }
        Float f19 = r3.A0B;
        if (f19 != null) {
            r2.A0O("perspective_rotation_y", f19.floatValue());
        }
        Float f20 = r3.A0C;
        if (f20 != null) {
            r2.A0O("perspective_rotation_z", f20.floatValue());
        }
        r2.A0Z();
    }
}
