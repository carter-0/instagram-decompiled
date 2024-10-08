package X;

import android.view.View;
import android.view.ViewTreeObserver;
import go.Seq;

/* renamed from: X.6Th  reason: invalid class name and case insensitive filesystem */
public final class C308246Th implements C308256Ti {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public View A0B;
    public ViewTreeObserver.OnPreDrawListener A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r2.endsWith("%") == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b2, code lost:
        if (r1.endsWith("%") != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r2.endsWith("%") == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C276544tV r8, X.C308246Th r9) {
        /*
            java.lang.String r4 = "ViewTransformsExtensionBinderUtils"
            r0 = 141(0x8d, float:1.98E-43)
            r7 = 1065353216(0x3f800000, float:1.0)
            float r0 = r8.A02(r0, r7)
            r9.A00 = r0
            r0 = 38
            r3 = 0
            r5 = 0
            r6 = 1
            r1 = 0
            java.lang.String r2 = r8.A0K(r0)     // Catch:{ 3yO -> 0x004b }
            r0 = 0
            if (r2 == 0) goto L_0x001d
            float r0 = X.AnonymousClass6Su.A01(r2)     // Catch:{ 3yO -> 0x004b }
        L_0x001d:
            r9.A09 = r0     // Catch:{ 3yO -> 0x004b }
            if (r2 == 0) goto L_0x002a
            java.lang.String r0 = "%"
            boolean r2 = r2.endsWith(r0)     // Catch:{ 3yO -> 0x004b }
            r0 = 1
            if (r2 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            r9.A0I = r0     // Catch:{ 3yO -> 0x004b }
            r0 = 40
            java.lang.String r2 = r8.A0K(r0)     // Catch:{ 3yO -> 0x004b }
            r0 = 0
            if (r2 == 0) goto L_0x003a
            float r0 = X.AnonymousClass6Su.A01(r2)     // Catch:{ 3yO -> 0x004b }
        L_0x003a:
            r9.A0A = r0     // Catch:{ 3yO -> 0x004b }
            if (r2 == 0) goto L_0x0047
            java.lang.String r0 = "%"
            boolean r2 = r2.endsWith(r0)     // Catch:{ 3yO -> 0x004b }
            r0 = 1
            if (r2 != 0) goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            r9.A0J = r0     // Catch:{ 3yO -> 0x004b }
            goto L_0x0051
        L_0x004b:
            r2 = move-exception
            java.lang.String r0 = "Could not parse translation value."
            X.1Kn.A00(r3, r4, r0, r2)
        L_0x0051:
            r0 = 35
            float r0 = r8.A02(r0, r7)
            r9.A07 = r0
            r0 = 36
            float r0 = r8.A02(r0, r7)
            r9.A08 = r0
            r0 = 138(0x8a, float:1.93E-43)
            float r0 = r8.A02(r0, r1)
            r9.A04 = r0
            r0 = 44
            float r0 = r8.A02(r0, r1)
            r9.A05 = r0
            r0 = 45
            float r0 = r8.A02(r0, r1)
            r9.A06 = r0
            r1 = 43
            r0 = 1151336448(0x44a00000, float:1280.0)
            float r0 = r8.A02(r1, r0)
            r9.A01 = r0
            r0 = 41
            java.lang.String r1 = r8.A0K(r0)     // Catch:{ 3yO -> 0x00c5 }
            r0 = 42
            java.lang.String r2 = r8.A0K(r0)     // Catch:{ 3yO -> 0x00c5 }
            if (r1 != 0) goto L_0x0093
            if (r2 == 0) goto L_0x00cb
        L_0x0093:
            r9.A0F = r6     // Catch:{ 3yO -> 0x00c5 }
            r0 = 1112014848(0x42480000, float:50.0)
            if (r1 == 0) goto L_0x009d
            float r0 = X.AnonymousClass6Su.A01(r1)     // Catch:{ 3yO -> 0x00c5 }
        L_0x009d:
            r9.A02 = r0     // Catch:{ 3yO -> 0x00c5 }
            r0 = 1112014848(0x42480000, float:50.0)
            if (r2 == 0) goto L_0x00a7
            float r0 = X.AnonymousClass6Su.A01(r2)     // Catch:{ 3yO -> 0x00c5 }
        L_0x00a7:
            r9.A03 = r0     // Catch:{ 3yO -> 0x00c5 }
            if (r1 == 0) goto L_0x00b4
            java.lang.String r0 = "%"
            boolean r1 = r1.endsWith(r0)     // Catch:{ 3yO -> 0x00c5 }
            r0 = 0
            if (r1 == 0) goto L_0x00b5
        L_0x00b4:
            r0 = 1
        L_0x00b5:
            r9.A0G = r0     // Catch:{ 3yO -> 0x00c5 }
            if (r2 == 0) goto L_0x00c1
            java.lang.String r0 = "%"
            boolean r0 = r2.endsWith(r0)     // Catch:{ 3yO -> 0x00c5 }
            if (r0 == 0) goto L_0x00c2
        L_0x00c1:
            r5 = 1
        L_0x00c2:
            r9.A0H = r5     // Catch:{ 3yO -> 0x00c5 }
            return
        L_0x00c5:
            r1 = move-exception
            java.lang.String r0 = "Could not parse pivot value."
            X.1Kn.A00(r3, r4, r0, r1)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308246Th.A00(X.4tV, X.6Th):void");
    }

    public final boolean EOz(C307786Rm r6, Object obj, int i) {
        if (i == 35) {
            float floatValue = ((Number) obj).floatValue();
            this.A07 = floatValue;
            View view = this.A0B;
            if (view == null) {
                return true;
            }
            view.setScaleX(floatValue);
            return true;
        } else if (i == 36) {
            float floatValue2 = ((Number) obj).floatValue();
            this.A08 = floatValue2;
            View view2 = this.A0B;
            if (view2 == null) {
                return true;
            }
            view2.setScaleY(floatValue2);
            return true;
        } else if (i == 38) {
            try {
                String str = (String) obj;
                float f = 0.0f;
                if (str != null) {
                    f = AnonymousClass6Su.A01(str);
                }
                this.A09 = f;
                this.A0I = str.endsWith("%");
            } catch (C258053yO e) {
                1Kn.A00(r6, "ViewTransformsExtensionBinderUtils", "Could not parse translation_x value. ", e);
            }
            View view3 = this.A0B;
            if (view3 == null) {
                return true;
            }
            float width = (float) view3.getWidth();
            float f2 = this.A09;
            if (this.A0I) {
                f2 = (f2 * width) / 100.0f;
            }
            view3.setTranslationX(f2);
            return true;
        } else if (i == 138) {
            float floatValue3 = ((Number) obj).floatValue();
            this.A04 = floatValue3;
            View view4 = this.A0B;
            if (view4 == null) {
                return true;
            }
            view4.setRotation(floatValue3);
            return true;
        } else if (i != 141) {
            switch (i) {
                case 40:
                    try {
                        String str2 = (String) obj;
                        float f3 = 0.0f;
                        if (str2 != null) {
                            f3 = AnonymousClass6Su.A01(str2);
                        }
                        this.A0A = f3;
                        this.A0J = str2.endsWith("%");
                    } catch (C258053yO e2) {
                        1Kn.A00(r6, "ViewTransformsExtensionBinderUtils", "Could not parse translation_y value. ", e2);
                    }
                    View view5 = this.A0B;
                    if (view5 == null) {
                        return true;
                    }
                    float height = (float) view5.getHeight();
                    float f4 = this.A0A;
                    if (this.A0J) {
                        f4 = (f4 * height) / 100.0f;
                    }
                    view5.setTranslationY(f4);
                    return true;
                case Seq.NULL_REFNUM:
                    try {
                        String str3 = (String) obj;
                        this.A02 = AnonymousClass6Su.A01(str3);
                        this.A0G = str3.endsWith("%");
                        this.A0F = true;
                    } catch (C258053yO e3) {
                        1Kn.A00(r6, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_x value. ", e3);
                    }
                    View view6 = this.A0B;
                    if (view6 == null) {
                        return true;
                    }
                    float width2 = (float) view6.getWidth();
                    float f5 = this.A02;
                    if (this.A0G) {
                        f5 = (f5 * width2) / 100.0f;
                    }
                    view6.setPivotX(f5);
                    return true;
                case Seq.RefTracker.REF_OFFSET:
                    try {
                        String str4 = (String) obj;
                        this.A03 = AnonymousClass6Su.A01(str4);
                        this.A0H = str4.endsWith("%");
                        this.A0F = true;
                    } catch (C258053yO e4) {
                        1Kn.A00(r6, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_y value. ", e4);
                    }
                    View view7 = this.A0B;
                    if (view7 == null) {
                        return true;
                    }
                    float height2 = (float) view7.getHeight();
                    float f6 = this.A03;
                    if (this.A0H) {
                        f6 = (f6 * height2) / 100.0f;
                    }
                    view7.setPivotY(f6);
                    return true;
                case 43:
                    float floatValue4 = ((Number) obj).floatValue();
                    this.A01 = floatValue4;
                    View view8 = this.A0B;
                    if (view8 == null) {
                        return true;
                    }
                    view8.setCameraDistance(AnonymousClass6Tj.A00(view8.getContext(), floatValue4));
                    return true;
                case 44:
                    float floatValue5 = ((Number) obj).floatValue();
                    this.A05 = floatValue5;
                    View view9 = this.A0B;
                    if (view9 == null) {
                        return true;
                    }
                    view9.setRotationX(floatValue5);
                    return true;
                case 45:
                    float floatValue6 = ((Number) obj).floatValue();
                    this.A06 = floatValue6;
                    View view10 = this.A0B;
                    if (view10 == null) {
                        return true;
                    }
                    view10.setRotationY(floatValue6);
                    return true;
                default:
                    return false;
            }
        } else {
            float floatValue7 = ((Number) obj).floatValue();
            this.A00 = floatValue7;
            View view11 = this.A0B;
            if (view11 == null) {
                return true;
            }
            view11.setAlpha(floatValue7);
            return true;
        }
    }
}
