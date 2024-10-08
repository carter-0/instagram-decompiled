package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import java.io.File;

/* renamed from: X.MfO  reason: case insensitive filesystem */
public final class C66929MfO extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66929MfO(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public static File A00(Object obj, C66929MfO mfO) {
        Picture picture = (Picture) obj;
        Bitmap createBitmap = Bitmap.createBitmap(picture.getWidth(), picture.getHeight(), Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        new Canvas(createBitmap).drawPicture(picture);
        File A04 = 0mb.A04((Context) mfO.A02);
        1MF.A0M(createBitmap, A04);
        return A04;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.MfO] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.4D7, X.MfO] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        return new X.C66929MfO(r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0183, code lost:
        r3 = new X.C66929MfO(r2, r1, r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0196, code lost:
        r3 = new X.C66929MfO(r1, r2, r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019b, code lost:
        r3.A00 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x019d, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            int r0 = r9.A01
            r7 = r11
            switch(r0) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x00ad;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00c2;
                case 5: goto L_0x00c9;
                case 6: goto L_0x0014;
                case 7: goto L_0x00d0;
                case 8: goto L_0x00d7;
                case 9: goto L_0x00df;
                case 10: goto L_0x00e7;
                case 11: goto L_0x001c;
                case 12: goto L_0x00ef;
                case 13: goto L_0x00f7;
                case 14: goto L_0x00ff;
                case 15: goto L_0x0025;
                case 16: goto L_0x002e;
                case 17: goto L_0x0037;
                case 18: goto L_0x0106;
                case 19: goto L_0x0040;
                case 20: goto L_0x0049;
                case 21: goto L_0x010d;
                case 22: goto L_0x0052;
                case 23: goto L_0x0114;
                case 24: goto L_0x011b;
                case 25: goto L_0x005b;
                case 26: goto L_0x0064;
                case 27: goto L_0x0122;
                case 28: goto L_0x006d;
                case 29: goto L_0x0076;
                case 30: goto L_0x0129;
                case 31: goto L_0x0130;
                case 32: goto L_0x0137;
                case 33: goto L_0x013e;
                case 34: goto L_0x0145;
                case 35: goto L_0x014c;
                case 36: goto L_0x0153;
                case 37: goto L_0x007f;
                case 38: goto L_0x015a;
                case 39: goto L_0x0161;
                case 40: goto L_0x0168;
                case 41: goto L_0x0088;
                case 42: goto L_0x0092;
                case 43: goto L_0x016f;
                case 44: goto L_0x009c;
                case 45: goto L_0x0176;
                case 46: goto L_0x017d;
                case 47: goto L_0x0189;
                case 48: goto L_0x0190;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r6 = r9.A03
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A00
            r8 = 49
        L_0x000e:
            X.MfO r3 = new X.MfO
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x0014:
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A00
            java.lang.Object r5 = r9.A02
            r8 = 6
            goto L_0x000e
        L_0x001c:
            java.lang.Object r4 = r9.A00
            java.lang.Object r6 = r9.A03
            java.lang.Object r5 = r9.A02
            r8 = 11
            goto L_0x000e
        L_0x0025:
            java.lang.Object r6 = r9.A03
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A00
            r8 = 15
            goto L_0x000e
        L_0x002e:
            java.lang.Object r6 = r9.A03
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A00
            r8 = 16
            goto L_0x000e
        L_0x0037:
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A00
            java.lang.Object r5 = r9.A02
            r8 = 17
            goto L_0x000e
        L_0x0040:
            java.lang.Object r6 = r9.A03
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A00
            r8 = 19
            goto L_0x000e
        L_0x0049:
            java.lang.Object r4 = r9.A00
            java.lang.Object r5 = r9.A02
            java.lang.Object r6 = r9.A03
            r8 = 20
            goto L_0x000e
        L_0x0052:
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A00
            java.lang.Object r5 = r9.A02
            r8 = 22
            goto L_0x000e
        L_0x005b:
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A00
            java.lang.Object r5 = r9.A02
            r8 = 25
            goto L_0x000e
        L_0x0064:
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A00
            java.lang.Object r5 = r9.A02
            r8 = 26
            goto L_0x000e
        L_0x006d:
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A00
            java.lang.Object r6 = r9.A03
            r8 = 28
            goto L_0x000e
        L_0x0076:
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A00
            java.lang.Object r5 = r9.A02
            r8 = 29
            goto L_0x000e
        L_0x007f:
            java.lang.Object r5 = r9.A02
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A00
            r8 = 37
            goto L_0x000e
        L_0x0088:
            java.lang.Object r6 = r9.A03
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A00
            r8 = 41
            goto L_0x000e
        L_0x0092:
            java.lang.Object r6 = r9.A03
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A00
            r8 = 42
            goto L_0x000e
        L_0x009c:
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A00
            java.lang.Object r6 = r9.A03
            r8 = 44
            goto L_0x000e
        L_0x00a6:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 0
            goto L_0x0183
        L_0x00ad:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 1
            goto L_0x0183
        L_0x00b4:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 2
            goto L_0x0183
        L_0x00bb:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 3
            goto L_0x0183
        L_0x00c2:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 4
            goto L_0x0183
        L_0x00c9:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 5
            goto L_0x0183
        L_0x00d0:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 7
            goto L_0x0183
        L_0x00d7:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 8
            goto L_0x0183
        L_0x00df:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 9
            goto L_0x0183
        L_0x00e7:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 10
            goto L_0x0183
        L_0x00ef:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 12
            goto L_0x0183
        L_0x00f7:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 13
            goto L_0x0183
        L_0x00ff:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 14
            goto L_0x0183
        L_0x0106:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 18
            goto L_0x0183
        L_0x010d:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 21
            goto L_0x0183
        L_0x0114:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 23
            goto L_0x0183
        L_0x011b:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 24
            goto L_0x0183
        L_0x0122:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 27
            goto L_0x0183
        L_0x0129:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 30
            goto L_0x0183
        L_0x0130:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 31
            goto L_0x0183
        L_0x0137:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 32
            goto L_0x0183
        L_0x013e:
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r9.A03
            r0 = 33
            goto L_0x0196
        L_0x0145:
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r9.A03
            r0 = 34
            goto L_0x0196
        L_0x014c:
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r9.A03
            r0 = 35
            goto L_0x0196
        L_0x0153:
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r9.A03
            r0 = 36
            goto L_0x0196
        L_0x015a:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 38
            goto L_0x0183
        L_0x0161:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 39
            goto L_0x0183
        L_0x0168:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 40
            goto L_0x0183
        L_0x016f:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 43
            goto L_0x0183
        L_0x0176:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 45
            goto L_0x0183
        L_0x017d:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 46
        L_0x0183:
            X.MfO r3 = new X.MfO
            r3.<init>(r2, r1, r11, r0)
            goto L_0x019b
        L_0x0189:
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r9.A03
            r0 = 47
            goto L_0x0196
        L_0x0190:
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r9.A03
            r0 = 48
        L_0x0196:
            X.MfO r3 = new X.MfO
            r3.<init>(r1, r2, r11, r0)
        L_0x019b:
            r3.A00 = r10
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66929MfO.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: X.U8y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v150, resolved type: X.MtU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v161, resolved type: X.9i2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: X.U8y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v31, resolved type: X.U8w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v183, resolved type: X.MtU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v184, resolved type: X.MtU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v419, resolved type: android.widget.TextView} */
    /* JADX WARNING: type inference failed for: r6v22 */
    /* JADX WARNING: type inference failed for: r6v24, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r6v91 */
    /* JADX WARNING: type inference failed for: r6v92 */
    /* JADX WARNING: type inference failed for: r6v93 */
    /* JADX WARNING: type inference failed for: r6v94 */
    /* JADX WARNING: type inference failed for: r6v95 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03d5, code lost:
        if (r2 != false) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0447, code lost:
        if (r2 == X.2FW.A17) goto L_0x0449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04ef, code lost:
        if (r8 < r7) goto L_0x04f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05dd, code lost:
        r7 = new X.C66929MfO(r3, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x06bc, code lost:
        r2.markerEnd(r1, r0);
        X.14i.A06(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x074f, code lost:
        if (r2 != null) goto L_0x0751;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0751, code lost:
        r1.A02.setUrl(r4.A03, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0a75, code lost:
        if (r2.A05 != false) goto L_0x0a77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0dcb, code lost:
        r8.A02(r9, r10, r11, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x101d, code lost:
        if (r2 == null) goto L_0x1049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x101f, code lost:
        r9 = (java.lang.Double) r2.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:0x1365, code lost:
        r13 = new X.MEW(r14, r15, r16, r17, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:754:0x1378, code lost:
        r0 = java.lang.Boolean.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:755:0x137c, code lost:
        r1.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:760:0x1415, code lost:
        X.C51968G9o.A1P(r7, r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:789:0x14ef, code lost:
        r0.Epw(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:795:0x1509, code lost:
        X.0qQ.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:796:0x1510, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:826:0x1622, code lost:
        X.AnonymousClass7TE.A1Z(r13, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:853:0x16db, code lost:
        X.0qQ.A0F(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:854:0x16e2, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021b, code lost:
        r8 = "audioAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:930:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x074b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r0 = r27
            int r1 = r0.A01
            r2 = r28
            switch(r1) {
                case 0: goto L_0x001a;
                case 1: goto L_0x0134;
                case 2: goto L_0x0179;
                case 3: goto L_0x021f;
                case 4: goto L_0x03ba;
                case 5: goto L_0x041a;
                case 6: goto L_0x0466;
                case 7: goto L_0x048b;
                case 8: goto L_0x04a6;
                case 9: goto L_0x0594;
                case 10: goto L_0x05c8;
                case 11: goto L_0x05e4;
                case 12: goto L_0x05fb;
                case 13: goto L_0x063a;
                case 14: goto L_0x067c;
                case 15: goto L_0x06c6;
                case 16: goto L_0x0700;
                case 17: goto L_0x075c;
                case 18: goto L_0x1627;
                case 19: goto L_0x0774;
                case 20: goto L_0x079e;
                case 21: goto L_0x07b2;
                case 22: goto L_0x0888;
                case 23: goto L_0x092c;
                case 24: goto L_0x0978;
                case 25: goto L_0x0bd8;
                case 26: goto L_0x0cf3;
                case 27: goto L_0x0e00;
                case 28: goto L_0x16bd;
                case 29: goto L_0x0e46;
                case 30: goto L_0x11f5;
                case 31: goto L_0x1225;
                case 32: goto L_0x12a2;
                case 33: goto L_0x1381;
                case 34: goto L_0x13b9;
                case 35: goto L_0x13d0;
                case 36: goto L_0x13f3;
                case 37: goto L_0x141a;
                case 38: goto L_0x145c;
                case 39: goto L_0x14b6;
                case 40: goto L_0x14d3;
                case 41: goto L_0x0009;
                case 42: goto L_0x0009;
                case 43: goto L_0x14f4;
                case 44: goto L_0x153b;
                case 45: goto L_0x156f;
                case 46: goto L_0x1587;
                case 47: goto L_0x15a1;
                case 48: goto L_0x15d3;
                case 49: goto L_0x160a;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.0eS.A00(r2)
            java.lang.Object r2 = r0.A03
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r0.A02
            java.lang.Object r0 = r0.A00
            r2.invoke(r1, r0)
        L_0x0017:
            X.0gF r7 = X.C60340gF.A00
        L_0x0019:
            return r7
        L_0x001a:
            java.lang.Object r1 = A01(r2, r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r0.A03
            X.H0v r6 = (X.C54151H0v) r6
            java.lang.Object r4 = r0.A02
            android.view.View r4 = (android.view.View) r4
            X.0eM r0 = r6.A07
            X.0lg r0 = X.DbT.A0X(r0)
            X.DbY.A1S(r0, r1)
            X.0wc r2 = X.AnonymousClass0kN.A01(r6, r0)
            java.lang.String r0 = "instagram_organic_creator_inspiration_hub"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x005d
            java.lang.String r2 = r6.getModuleName()
            java.lang.String r0 = "containermodule"
            r3.AAJ(r0, r2)
            X.HOu r2 = X.C54689HOu.A0M
            r0 = 238(0xee, float:3.34E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A8M(r2, r0)
            java.lang.String r0 = "tab_type"
            X.C51973G9u.A14(r3, r0, r1)
            r3.Cgf()
        L_0x005d:
            X.0eM r0 = r6.A06
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0091
            java.util.ArrayList r0 = X.C54151H0v.A00(r6)
            java.util.Iterator r3 = r0.iterator()
        L_0x006e:
            boolean r0 = r3.hasNext()
            r2 = -1
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r3.next()
            X.HOz r0 = (X.C54694HOz) r0
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x008e
            if (r5 == r2) goto L_0x0017
            androidx.viewpager2.widget.ViewPager2 r1 = r6.A00
            if (r1 == 0) goto L_0x0017
            r0 = 1
            r1.A03(r5, r0)
            goto L_0x0017
        L_0x008e:
            int r5 = r5 + 1
            goto L_0x006e
        L_0x0091:
            java.lang.String r0 = "clips"
            boolean r0 = r1.equals(r0)
            r3 = 8
            if (r0 == 0) goto L_0x00cc
            X.H18 r0 = r6.A03
            java.lang.String r10 = "reelsFragmentIntf"
            if (r0 == 0) goto L_0x16db
            boolean r0 = r0.isAdded()
            if (r0 != 0) goto L_0x00b8
            X.0s1 r2 = X.DbW.A0C(r6)
            r1 = 2131431006(0x7f0b0e5e, float:1.848373E38)
            X.H18 r0 = r6.A03
            if (r0 == 0) goto L_0x16db
            r2.A09(r0, r1)
            r2.A00()
        L_0x00b8:
            r0 = 2131431006(0x7f0b0e5e, float:1.848373E38)
            X.C51967G9n.A0x(r4, r0, r5)
            r0 = 2131431004(0x7f0b0e5c, float:1.8483725E38)
        L_0x00c1:
            X.C51967G9n.A0x(r4, r0, r3)
            r0 = 2131431003(0x7f0b0e5b, float:1.8483723E38)
        L_0x00c7:
            X.C51967G9n.A0x(r4, r0, r3)
            goto L_0x0017
        L_0x00cc:
            java.lang.String r0 = "audios"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00fb
            X.H1M r0 = r6.A02
            java.lang.String r10 = "audioFragment"
            if (r0 == 0) goto L_0x16db
            boolean r0 = r0.isAdded()
            if (r0 != 0) goto L_0x00f1
            X.0s1 r2 = X.DbW.A0C(r6)
            r1 = 2131431004(0x7f0b0e5c, float:1.8483725E38)
            X.H1M r0 = r6.A02
            if (r0 == 0) goto L_0x16db
            r2.A09(r0, r1)
            r2.A00()
        L_0x00f1:
            r0 = 2131431004(0x7f0b0e5c, float:1.8483725E38)
            X.C51967G9n.A0x(r4, r0, r5)
            r0 = 2131431006(0x7f0b0e5e, float:1.848373E38)
            goto L_0x00c1
        L_0x00fb:
            r0 = 2563(0xa03, float:3.592E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x16d4
            X.H07 r0 = r6.A01
            java.lang.String r10 = "accountsFragment"
            if (r0 == 0) goto L_0x16db
            boolean r0 = r0.isAdded()
            if (r0 != 0) goto L_0x0124
            X.0s1 r2 = X.DbW.A0C(r6)
            r1 = 2131431003(0x7f0b0e5b, float:1.8483723E38)
            X.H07 r0 = r6.A01
            if (r0 == 0) goto L_0x16db
            r2.A09(r0, r1)
            r2.A00()
        L_0x0124:
            r0 = 2131431003(0x7f0b0e5b, float:1.8483723E38)
            X.C51967G9n.A0x(r4, r0, r5)
            r0 = 2131431006(0x7f0b0e5e, float:1.848373E38)
            X.C51967G9n.A0x(r4, r0, r3)
            r0 = 2131431004(0x7f0b0e5c, float:1.8483725E38)
            goto L_0x00c7
        L_0x0134:
            java.lang.Object r6 = A01(r2, r0)
            X.4Cq r6 = (X.C262224Cq) r6
            java.lang.Object r8 = r0.A03
            X.H1M r8 = (X.H1M) r8
            X.0eM r5 = r8.A06
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r5)
            X.GgG r1 = (X.C52963GgG) r1
            X.0r6 r3 = r1.A0G()
            r4 = 0
            if (r3 == 0) goto L_0x0157
            r2 = 22
            X.ImQ r1 = new X.ImQ
            r1.<init>(r8, r4, r2)
            X.C51968G9o.A1P(r1, r6, r3)
        L_0x0157:
            X.U94 r1 = r8.A04
            if (r1 == 0) goto L_0x021b
            X.0r6 r3 = r1.A02
            java.lang.Object r2 = r0.A02
            r1 = 2
            X.MfO r0 = new X.MfO
            r0.<init>(r8, r2, r4, r1)
            X.C51968G9o.A1P(r0, r6, r3)
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r5)
            X.GgG r0 = (X.C52963GgG) r0
            X.0r6 r5 = r0.A0B
            r0 = 19
            X.MGY r7 = new X.MGY
            r7.<init>(r8, r4, r0)
            goto L_0x1415
        L_0x0179:
            java.lang.Object r9 = A01(r2, r0)
            X.LFx r9 = (X.C63970LFx) r9
            java.lang.Object r2 = r0.A03
            X.H1M r2 = (X.H1M) r2
            X.U94 r1 = r2.A04
            if (r1 == 0) goto L_0x021b
            int r7 = r1.getItemCount()
            X.KzI r6 = r9.A02
            boolean r1 = r6 instanceof X.C60333Jjc
            java.lang.String r8 = "context"
            r5 = 0
            if (r1 == 0) goto L_0x01b0
            X.I4Q r3 = X.I4Q.A00
            android.content.Context r4 = r2.A00
            if (r4 == 0) goto L_0x1509
            java.lang.Object r5 = r0.A02
            android.view.View r5 = (android.view.View) r5
            X.HOz r6 = X.C54694HOz.AUDIO
            boolean r8 = X.AnonymousClass7TF.A1P(r7)
            r0 = 38
            X.GW6 r7 = new X.GW6
            r7.<init>(r2, r0)
            r3.A02(r4, r5, r6, r7, r8)
            goto L_0x0017
        L_0x01b0:
            boolean r1 = r6 instanceof X.C60334Jjd
            java.lang.String r10 = "audioRecyclerView"
            java.lang.String r4 = "loadingSpinner"
            r3 = 8
            if (r1 == 0) goto L_0x01d9
            if (r7 != 0) goto L_0x01d9
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.A05
            if (r1 == 0) goto L_0x16e3
            r1.setVisibility(r5)
            androidx.recyclerview.widget.RecyclerView r1 = r2.A02
            if (r1 == 0) goto L_0x16db
            r1.setVisibility(r3)
        L_0x01ca:
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            X.0qQ.A0B(r1, r5)
            r0 = 2131434784(0x7f0b1d20, float:1.8491392E38)
            X.C51967G9n.A0x(r1, r0, r3)
            goto L_0x0017
        L_0x01d9:
            boolean r1 = r6 instanceof X.C60332Jjb
            if (r1 == 0) goto L_0x020c
            X.KzI r1 = r9.A00
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x020c
            if (r7 != 0) goto L_0x020c
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.A05
            if (r1 == 0) goto L_0x16e3
            r1.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r1 = r2.A02
            if (r1 == 0) goto L_0x16db
            r1.setVisibility(r3)
            X.I4Q r3 = X.I4Q.A00
            android.content.Context r4 = r2.A00
            if (r4 == 0) goto L_0x1509
            java.lang.Object r5 = r0.A02
            android.view.View r5 = (android.view.View) r5
            X.HOz r6 = X.C54694HOz.AUDIO
            r0 = 39
            X.GW6 r8 = new X.GW6
            r8.<init>(r2, r0)
            r7 = 0
            r3.A01(r4, r5, r6, r7, r8)
            goto L_0x0017
        L_0x020c:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.A05
            if (r1 == 0) goto L_0x16e3
            r1.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r1 = r2.A02
            if (r1 == 0) goto L_0x16db
            r1.setVisibility(r5)
            goto L_0x01ca
        L_0x021b:
            java.lang.String r8 = "audioAdapter"
            goto L_0x1509
        L_0x021f:
            java.lang.Object r4 = A01(r2, r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.A03
            X.E32 r5 = (X.E32) r5
            java.lang.Object r7 = r0.A02
            android.view.View r7 = (android.view.View) r7
            java.lang.String r0 = "trending"
            boolean r0 = X.0qQ.A0K(r4, r0)
            r6 = 0
            r8 = 8
            if (r0 == 0) goto L_0x02c4
            X.H1J r3 = r5.A02
            if (r3 == 0) goto L_0x0251
            boolean r0 = r3.isAdded()
            if (r0 != 0) goto L_0x0251
            X.0s1 r2 = X.DbW.A0C(r5)
            r1 = 2131443215(0x7f0b3e0f, float:1.8508492E38)
            java.lang.String r0 = "trending_fragment"
            r2.A0C(r3, r0, r1)
            r2.A00()
        L_0x0251:
            r0 = 2131443215(0x7f0b3e0f, float:1.8508492E38)
            X.C51967G9n.A0x(r7, r0, r6)
            r0 = 2131437920(0x7f0b2960, float:1.8497752E38)
            X.C51967G9n.A0x(r7, r0, r8)
            r0 = 2131443219(0x7f0b3e13, float:1.85085E38)
            X.C51967G9n.A0x(r7, r0, r8)
            r0 = 2131437372(0x7f0b273c, float:1.849664E38)
            X.C51967G9n.A0x(r7, r0, r8)
            X.H1J r0 = r5.A01
            if (r0 == 0) goto L_0x0270
            r0.A00()
        L_0x0270:
            X.H1J r0 = r5.A03
        L_0x0272:
            if (r0 == 0) goto L_0x0277
            r0.A00()
        L_0x0277:
            X.H1J r0 = r5.A00
            if (r0 == 0) goto L_0x027e
            r0.A00()
        L_0x027e:
            X.0eM r0 = r5.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.8ZN r1 = X.AnonymousClass8ZN.CREATOR_INSPIRATION_HUB_AUDIO_TRENDING_LIST_SEE_MORE
            X.HOu r0 = X.C54689HOu.A0K
        L_0x0288:
            X.C63223KtU.A00(r0, r1, r5, r2)
        L_0x028b:
            X.0eM r0 = r5.A06
            X.0lg r0 = X.AnonymousClass7TF.A0L(r0, r6)
            X.0wc r1 = X.AnonymousClass0kN.A01(r5, r0)
            java.lang.String r0 = "instagram_organic_audio_trending_tab_tap"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = r5.getModuleName()
            java.lang.String r0 = "containermodule"
            r2.AAJ(r0, r1)
            java.lang.Long r1 = X.C51971G9r.A0m()
            r0 = 81
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.A9F(r0, r1)
            X.DbY.A1C(r2)
            java.lang.String r0 = "trending_tab_category"
            r2.AAJ(r0, r4)
            r2.Cgf()
            goto L_0x0017
        L_0x02c4:
            r0 = 348(0x15c, float:4.88E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x0322
            X.H1J r3 = r5.A01
            if (r3 == 0) goto L_0x02e9
            boolean r0 = r3.isAdded()
            if (r0 != 0) goto L_0x02e9
            X.0s1 r2 = X.DbW.A0C(r5)
            r1 = 2131437920(0x7f0b2960, float:1.8497752E38)
            java.lang.String r0 = "popular_fragment"
            r2.A0C(r3, r0, r1)
            r2.A00()
        L_0x02e9:
            r0 = 2131443215(0x7f0b3e0f, float:1.8508492E38)
            X.C51967G9n.A0x(r7, r0, r8)
            r0 = 2131443219(0x7f0b3e13, float:1.85085E38)
            X.C51967G9n.A0x(r7, r0, r8)
            r0 = 2131437372(0x7f0b273c, float:1.849664E38)
            X.C51967G9n.A0x(r7, r0, r8)
            r0 = 2131437920(0x7f0b2960, float:1.8497752E38)
            X.C51967G9n.A0x(r7, r0, r6)
            X.H1J r0 = r5.A02
            if (r0 == 0) goto L_0x0308
            r0.A00()
        L_0x0308:
            X.H1J r0 = r5.A03
            if (r0 == 0) goto L_0x030f
            r0.A00()
        L_0x030f:
            X.H1J r0 = r5.A00
            if (r0 == 0) goto L_0x0316
            r0.A00()
        L_0x0316:
            X.0eM r0 = r5.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.8ZN r1 = X.AnonymousClass8ZN.CREATOR_INSPIRATION_HUB_AUDIO_POPULAR_WITH_YOUR_FOLLOWERS_SEE_MORE
            X.HOu r0 = X.C54689HOu.A0I
            goto L_0x0288
        L_0x0322:
            r0 = 383(0x17f, float:5.37E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x036a
            X.H1J r3 = r5.A03
            if (r3 == 0) goto L_0x0347
            boolean r0 = r3.isAdded()
            if (r0 != 0) goto L_0x0347
            X.0s1 r2 = X.DbW.A0C(r5)
            r1 = 2131443219(0x7f0b3e13, float:1.85085E38)
            java.lang.String r0 = "trending_with_similar_accounts_fragment"
            r2.A0C(r3, r0, r1)
            r2.A00()
        L_0x0347:
            r0 = 2131443215(0x7f0b3e0f, float:1.8508492E38)
            X.C51967G9n.A0x(r7, r0, r8)
            r0 = 2131437920(0x7f0b2960, float:1.8497752E38)
            X.C51967G9n.A0x(r7, r0, r8)
            r0 = 2131437372(0x7f0b273c, float:1.849664E38)
            X.C51967G9n.A0x(r7, r0, r8)
            r0 = 2131443219(0x7f0b3e13, float:1.85085E38)
            X.C51967G9n.A0x(r7, r0, r6)
            X.H1J r0 = r5.A02
            if (r0 == 0) goto L_0x0366
            r0.A00()
        L_0x0366:
            X.H1J r0 = r5.A01
            goto L_0x0272
        L_0x036a:
            java.lang.String r0 = "original_audio"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x16eb
            X.H1J r3 = r5.A00
            if (r3 == 0) goto L_0x028b
            boolean r0 = r3.isAdded()
            if (r0 != 0) goto L_0x038b
            X.0s1 r2 = X.DbW.A0C(r5)
            r1 = 2131437372(0x7f0b273c, float:1.849664E38)
            java.lang.String r0 = "original_audio_fragment"
            r2.A0C(r3, r0, r1)
            r2.A00()
        L_0x038b:
            r0 = 2131443215(0x7f0b3e0f, float:1.8508492E38)
            X.C51967G9n.A0x(r7, r0, r8)
            r0 = 2131437920(0x7f0b2960, float:1.8497752E38)
            X.C51967G9n.A0x(r7, r0, r8)
            r0 = 2131443219(0x7f0b3e13, float:1.85085E38)
            X.C51967G9n.A0x(r7, r0, r8)
            r0 = 2131437372(0x7f0b273c, float:1.849664E38)
            X.C51967G9n.A0x(r7, r0, r6)
            X.H1J r0 = r5.A02
            if (r0 == 0) goto L_0x03aa
            r0.A00()
        L_0x03aa:
            X.H1J r0 = r5.A01
            if (r0 == 0) goto L_0x03b1
            r0.A00()
        L_0x03b1:
            X.H1J r0 = r5.A03
            if (r0 == 0) goto L_0x028b
            r0.A00()
            goto L_0x028b
        L_0x03ba:
            java.lang.Object r2 = A01(r2, r0)
            X.PrQ r2 = (X.C74237PrQ) r2
            boolean r1 = r2 instanceof X.P0g
            if (r1 == 0) goto L_0x03e9
            java.lang.Object r1 = r0.A03
            X.LZa r1 = (X.C64300LZa) r1
            java.lang.String r4 = ""
            r2 = 0
        L_0x03cb:
            X.L9i r1 = r1.A03
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r3 = r1.A03
            r3.setText(r4)
            X.JTR.A1F(r3)
            if (r2 == 0) goto L_0x03df
        L_0x03d7:
            X.M42 r2 = new X.M42
            r2.<init>(r1)
        L_0x03dc:
            r3.post(r2)
        L_0x03df:
            java.lang.Object r0 = r0.A02
            X.JjH r0 = (X.C60314JjH) r0
            X.05G r1 = r0.A0C
            X.P0h r0 = X.P0h.A00
            goto L_0x137c
        L_0x03e9:
            boolean r1 = r2 instanceof X.P0f
            if (r1 == 0) goto L_0x03f7
            java.lang.Object r1 = r0.A03
            X.LZa r1 = (X.C64300LZa) r1
            X.P0f r2 = (X.P0f) r2
            java.lang.CharSequence r4 = r2.A00
            r2 = 1
            goto L_0x03cb
        L_0x03f7:
            boolean r1 = r2 instanceof X.C57160IQz
            if (r1 == 0) goto L_0x0404
            java.lang.Object r1 = r0.A03
            X.LZa r1 = (X.C64300LZa) r1
            X.L9i r1 = r1.A03
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r3 = r1.A03
            goto L_0x03d7
        L_0x0404:
            boolean r1 = r2 instanceof X.C57159IQy
            if (r1 == 0) goto L_0x03df
            java.lang.Object r2 = r0.A03
            X.LZa r2 = (X.C64300LZa) r2
            boolean r1 = r2.A00
            if (r1 == 0) goto L_0x03df
            X.L9i r1 = r2.A03
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r3 = r1.A03
            X.M44 r2 = new X.M44
            r2.<init>(r1)
            goto L_0x03dc
        L_0x041a:
            java.lang.Object r2 = A01(r2, r0)
            X.3su r2 = (X.C254703su) r2
            if (r2 == 0) goto L_0x0017
            java.lang.Object r5 = r0.A03
            X.K6q r5 = (X.C61419K6q) r5
            X.0eM r1 = r5.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            boolean r1 = X.AnonymousClass7FM.A01(r1, r2)
            if (r1 == 0) goto L_0x0017
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            java.lang.String r4 = X.AnonymousClass7FM.A00(r1, r2)
            X.2FW r2 = r2.A10
            X.2FW r1 = X.2FW.A1g
            if (r2 == r1) goto L_0x0449
            X.2FW r1 = X.2FW.A1s
            if (r2 == r1) goto L_0x0449
            X.2FW r1 = X.2FW.A17
            r3 = 0
            if (r2 != r1) goto L_0x044a
        L_0x0449:
            r3 = 1
        L_0x044a:
            if (r4 == 0) goto L_0x0017
            android.content.Context r2 = r5.requireContext()
            java.lang.Object r1 = r0.A02
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 0
            r1.setVisibility(r0)
            if (r3 != 0) goto L_0x045f
            r1.setText(r4)
            goto L_0x0017
        L_0x045f:
            X.PbB r0 = new X.PbB
            r0.<init>(r2, r1, r5, r4)
            goto L_0x14b1
        L_0x0466:
            X.0eS.A00(r2)
            java.lang.Object r1 = r0.A03
            X.L6X r1 = (X.L6X) r1
            com.instagram.comments.mvvm.data.MediaCommentListRepository r6 = r1.A00
            java.lang.Object r1 = r0.A00
            X.JwM r1 = (X.C61084JwM) r1
            java.lang.Object r5 = r1.A01
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r4 = r1.A02
            java.util.Set r4 = (java.util.Set) r4
            X.Pqs r3 = X.C74211Pqs.A00
            java.lang.Object r2 = r0.A02
            r1 = 44
            X.PhW r0 = new X.PhW
            r0.<init>(r2, r1)
            r6.A0Q(r5, r4, r0, r3)
            goto L_0x0017
        L_0x048b:
            java.lang.Object r6 = A01(r2, r0)
            X.4Cq r6 = (X.C262224Cq) r6
            java.lang.Object r3 = r0.A03
            X.9i2 r3 = (X.C384879i2) r3
            X.0eM r1 = r3.A0d
            java.lang.Object r1 = r1.getValue()
            X.JgG r1 = (X.C60135JgG) r1
            X.0Ud r5 = r1.A02
            java.lang.Object r2 = r0.A02
            r1 = 0
            r0 = 8
            goto L_0x05dd
        L_0x04a6:
            java.lang.Object r9 = A01(r2, r0)
            java.util.List r9 = (java.util.List) r9
            r4 = 0
            java.lang.Object r1 = X.00k.A0O(r9, r4)
            com.instagram.direct.emojipong.data.EmojiPongUser r1 = (com.instagram.direct.emojipong.data.EmojiPongUser) r1
            if (r1 == 0) goto L_0x0017
            int r8 = r1.A00
            r1 = 1
            java.lang.Object r1 = X.00k.A0O(r9, r1)
            com.instagram.direct.emojipong.data.EmojiPongUser r1 = (com.instagram.direct.emojipong.data.EmojiPongUser) r1
            if (r1 == 0) goto L_0x0017
            int r7 = r1.A00
            java.lang.Object r5 = r0.A03
            X.9i2 r5 = (X.C384879i2) r5
            android.widget.TextView r2 = r5.A0Q
            java.lang.String r6 = "%03d"
            if (r2 == 0) goto L_0x04d7
            java.lang.Integer r1 = X.JTO.A0w(r8)
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r6, r1)
            r2.setText(r1)
        L_0x04d7:
            android.widget.TextView r2 = r5.A0R
            if (r2 == 0) goto L_0x04e6
            java.lang.Integer r1 = X.JTO.A0w(r7)
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r6, r1)
            r2.setText(r1)
        L_0x04e6:
            android.widget.TextView r3 = r5.A0F
            r2 = 8
            if (r3 == 0) goto L_0x04f6
            if (r8 <= 0) goto L_0x04f1
            r1 = 0
            if (r8 >= r7) goto L_0x04f3
        L_0x04f1:
            r1 = 8
        L_0x04f3:
            r3.setVisibility(r1)
        L_0x04f6:
            android.widget.TextView r1 = r5.A0G
            if (r1 == 0) goto L_0x0502
            if (r7 <= 0) goto L_0x04ff
            if (r7 < r8) goto L_0x04ff
            r2 = 0
        L_0x04ff:
            r1.setVisibility(r2)
        L_0x0502:
            android.widget.ImageView r3 = r5.A0C
            if (r3 == 0) goto L_0x0554
            java.lang.Object r8 = r0.A02
            android.content.Context r8 = (android.content.Context) r8
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x0512:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x052d
            java.lang.Object r0 = r2.next()
            com.instagram.direct.emojipong.data.EmojiPongUser r0 = (com.instagram.direct.emojipong.data.EmojiPongUser) r0
            java.lang.String r1 = r0.A02
            if (r1 != 0) goto L_0x0524
            java.lang.String r1 = ""
        L_0x0524:
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
            r7.add(r0)
            goto L_0x0512
        L_0x052d:
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            int r1 = r1.getDimensionPixelSize(r0)
            java.lang.String r0 = "ig_direct_emoji_pong_easter_egg"
            X.ON3 r2 = new X.ON3
            r2.<init>(r8, r0, r7, r1)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165277(0x7f07005d, float:1.7944767E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.A01(r0)
            X.3b0 r0 = r2.A00()
            r3.setImageDrawable(r0)
        L_0x0554:
            android.view.View r0 = r5.A08
            if (r0 == 0) goto L_0x055b
            r0.setVisibility(r4)
        L_0x055b:
            android.widget.TextView r3 = r5.A0M
            if (r3 == 0) goto L_0x057d
            r2 = 2131961598(0x7f1326fe, float:1.9559897E38)
            X.0eM r0 = r5.A0Y
            java.lang.Object r0 = r0.getValue()
            X.1Av r0 = (X.1Av) r0
            X.0xa r1 = r0.A01
            java.lang.String r0 = "emoji_pong_high_score"
            int r0 = r1.getInt(r0, r4)
            java.lang.Integer r0 = X.JTO.A0w(r0)
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r6, r0)
            X.DbX.A1F(r3, r5, r0, r2)
        L_0x057d:
            android.view.View r2 = r5.A05
            if (r2 == 0) goto L_0x058b
            r1 = 64
            X.LYD r0 = new X.LYD
            r0.<init>(r5, r1)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x058b:
            android.view.View r0 = r5.A05
            if (r0 == 0) goto L_0x0017
            r0.setVisibility(r4)
            goto L_0x0017
        L_0x0594:
            java.lang.Object r5 = A01(r2, r0)
            X.OOB r5 = (X.OOB) r5
            java.lang.Object r4 = r0.A03
            X.MtU r4 = (X.C67715MtU) r4
            X.NUa r2 = r4.A03
            java.lang.String r1 = "GDRIVE_RESTORE_ATTEMPT"
            r2.A0B(r1)
            boolean r1 = r5.A04
            if (r1 == 0) goto L_0x05c0
            X.OdW r3 = r5.A01
            X.Nkh r2 = X.C69403Nkh.GOOGLE_DRIVE
            java.lang.String r1 = "fetchTPIDForGDrive"
            X.ObS r3 = X.C71133OdW.A00(r3, r2, r1)
        L_0x05b3:
            java.lang.Object r2 = r0.A02
            r1 = 5
            X.OmL r0 = new X.OmL
            r0.<init>(r1, r4, r5, r2)
            r3.A04(r0)
            goto L_0x0017
        L_0x05c0:
            X.OZI r2 = r5.A00
            r1 = 3
            X.ObS r3 = X.OZI.A00(r2, r1)
            goto L_0x05b3
        L_0x05c8:
            java.lang.Object r6 = A01(r2, r0)
            X.4Cq r6 = (X.C262224Cq) r6
            java.lang.Object r3 = r0.A03
            X.MtU r3 = (X.C67715MtU) r3
            X.0r6 r1 = r3.A08
            X.0r6 r5 = X.AnonymousClass11E.A01(r1)
            java.lang.Object r2 = r0.A02
            r1 = 0
            r0 = 9
        L_0x05dd:
            X.MfO r7 = new X.MfO
            r7.<init>(r3, r2, r1, r0)
            goto L_0x1415
        L_0x05e4:
            java.lang.Object r4 = A01(r2, r0)
            X.2Fk r4 = (X.2Fk) r4
            java.lang.Object r3 = r0.A03
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.Object r2 = r0.A02
            r1 = 1
            X.IHI r0 = new X.IHI
            r0.<init>(r1, r2, r4, r3)
            r4.A06(r3, r0)
            goto L_0x0017
        L_0x05fb:
            java.lang.Object r1 = A01(r2, r0)
            X.N4R r1 = (X.N4R) r1
            java.lang.Object r1 = r1.A02
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0618
            int r2 = r1.intValue()
            r1 = 3
            if (r2 == r1) goto L_0x062b
            r1 = 2
            if (r2 != r1) goto L_0x0618
            java.lang.Object r1 = r0.A03
            X.NV7 r1 = (X.NV7) r1
            X.NV7.A05(r1)
        L_0x0618:
            java.lang.Object r2 = r0.A03
            X.NV7 r2 = (X.NV7) r2
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            X.ODX r0 = X.NV7.A01(r2)
            r2.A04 = r0
            r2.A0J(r1)
            goto L_0x0017
        L_0x062b:
            java.lang.Object r1 = r0.A03
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            r1 = 2131960632(0x7f132338, float:1.9557938E38)
            X.C59689JTv.A07(r2, r1)
            goto L_0x0618
        L_0x063a:
            java.lang.Object r1 = A01(r2, r0)
            X.JTj r1 = (X.C59678JTj) r1
            java.lang.Object r7 = r0.A03
            X.DkL r7 = (X.C46732DkL) r7
            X.05G r2 = r7.A0B
            java.lang.Object r6 = r1.A01
            X.8wd r6 = (X.C370538wd) r6
            X.KQd r1 = new X.KQd
            r1.<init>(r6)
            r2.Epw(r1)
            X.6oS r5 = X.C318116oQ.A00(r7)
            X.12T r2 = X.AnonymousClass12T.A00
            r4 = 0
            r1 = 480314591(0x1ca104df, float:1.0655345E-21)
            r3 = 3
            X.0nV r2 = r2.CO6(r1, r3)
            X.Pfn r1 = new X.Pfn
            r1.<init>(r6, r7, r4, r3)
            X.1Eo.A05(r2, r1, r5)
            r7.A0K(r6)
            java.lang.Object r3 = r0.A02
            X.OE0 r3 = (X.OE0) r3
            X.02m r2 = r3.A00
            r1 = 20128591(0x133234f, float:3.290244E-38)
            java.lang.String r0 = "Join_Channel_Success"
            r2.markerPoint(r1, r0)
            r0 = 2
            goto L_0x06bc
        L_0x067c:
            java.lang.Object r7 = A01(r2, r0)
            X.JTj r7 = (X.C59678JTj) r7
            java.lang.Object r6 = r0.A03
            X.DkL r6 = (X.C46732DkL) r6
            X.05G r2 = r6.A0B
            X.KQf r1 = X.KQf.A00
            r2.Epw(r1)
            X.05G r5 = r6.A0C
            r4 = 0
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r1 = 2131958721(0x7f131bc1, float:1.9554062E38)
            X.GKO r3 = X.DbS.A0Q(r2, r1)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r1 = 2131958720(0x7f131bc0, float:1.955406E38)
            X.GKO r2 = X.DbS.A0Q(r2, r1)
            X.Dti r1 = new X.Dti
            r1.<init>(r3, r2)
            r5.Epw(r1)
            r6.A0J(r7)
            java.lang.Object r3 = r0.A02
            X.OE0 r3 = (X.OE0) r3
            X.02m r2 = r3.A00
            r1 = 20128591(0x133234f, float:3.290244E-38)
            java.lang.String r0 = "Join_Channel_Failed"
            r2.markerPoint(r1, r0)
            r0 = 3
        L_0x06bc:
            r2.markerEnd(r1, r0)
            X.0lV r0 = r3.A01
            X.14i.A06(r0)
            goto L_0x0017
        L_0x06c6:
            X.0eS.A00(r2)
            java.lang.Object r4 = r0.A03
            X.Mv5 r4 = (X.C67801Mv5) r4
            java.lang.Object r5 = r0.A02
            X.1GK r5 = (X.1GK) r5
            r3 = 0
            java.lang.Object r1 = X.OX4.A01(r5)     // Catch:{ Exception -> 0x06f3 }
            X.8Cl r1 = (X.C352218Cl) r1     // Catch:{ Exception -> 0x06f3 }
            if (r1 == 0) goto L_0x06eb
            java.lang.String r2 = r1.A06()     // Catch:{ Exception -> 0x06f3 }
        L_0x06de:
            boolean r1 = r5.A0C()     // Catch:{ Exception -> 0x06f3 }
            if (r1 == 0) goto L_0x06f3
            boolean r1 = r5.A0B()     // Catch:{ Exception -> 0x06f3 }
            if (r1 != 0) goto L_0x06f3
            goto L_0x06ed
        L_0x06eb:
            r2 = r3
            goto L_0x06de
        L_0x06ed:
            if (r2 == 0) goto L_0x06f3
            com.instagram.common.typedurl.SimpleImageUrl r3 = X.JTQ.A0G(r2)     // Catch:{ Exception -> 0x06f3 }
        L_0x06f3:
            if (r3 == 0) goto L_0x0017
            androidx.fragment.app.Fragment r2 = r4.A02
            X.0iw r2 = (X.AnonymousClass0iw) r2
            if (r2 == 0) goto L_0x0017
            java.lang.Object r1 = r0.A00
            X.MyO r1 = (X.C67996MyO) r1
            goto L_0x0751
        L_0x0700:
            X.0eS.A00(r2)
            java.lang.Object r4 = r0.A03
            X.Mv5 r4 = (X.C67801Mv5) r4
            java.lang.Object r5 = r0.A02
            X.1GK r5 = (X.1GK) r5
            r3 = 0
            java.lang.Object r1 = X.OX4.A01(r5)     // Catch:{ Exception -> 0x072b }
            X.L4R r1 = (X.L4R) r1     // Catch:{ Exception -> 0x072b }
            if (r1 == 0) goto L_0x0723
            java.lang.String r2 = r1.A01     // Catch:{ Exception -> 0x072b }
        L_0x0716:
            boolean r1 = r5.A0C()     // Catch:{ Exception -> 0x072b }
            if (r1 == 0) goto L_0x072b
            boolean r1 = r5.A0B()     // Catch:{ Exception -> 0x072b }
            if (r1 != 0) goto L_0x072b
            goto L_0x0725
        L_0x0723:
            r2 = r3
            goto L_0x0716
        L_0x0725:
            if (r2 == 0) goto L_0x072b
            com.instagram.common.typedurl.SimpleImageUrl r3 = X.JTQ.A0G(r2)     // Catch:{ Exception -> 0x072b }
        L_0x072b:
            java.lang.Object r1 = r5.A07()
            X.L4R r1 = (X.L4R) r1
            if (r1 == 0) goto L_0x075a
            com.instagram.pendingmedia.model.ClipInfo r1 = r1.A00
            int r2 = r1.A05
            int r1 = r1.A07
            int r2 = r2 - r1
            if (r2 <= 0) goto L_0x075a
            java.lang.String r2 = X.C347917xa.A01(r2)
        L_0x0740:
            java.lang.Object r1 = r0.A00
            X.MyO r1 = (X.C67996MyO) r1
            android.widget.TextView r0 = r1.A01
            r0.setText(r2)
            if (r3 == 0) goto L_0x0017
            androidx.fragment.app.Fragment r2 = r4.A02
            X.0iw r2 = (X.AnonymousClass0iw) r2
            if (r2 == 0) goto L_0x0017
        L_0x0751:
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r1 = r1.A02
            com.instagram.common.session.UserSession r0 = r4.A03
            r1.setUrl(r0, r3, r2)
            goto L_0x0017
        L_0x075a:
            r2 = 0
            goto L_0x0740
        L_0x075c:
            X.0eS.A00(r2)
            java.lang.Object r2 = r0.A03
            X.7Sj r2 = (X.C331787Sj) r2
            java.lang.Object r1 = r0.A00
            X.7SD r1 = (X.AnonymousClass7SD) r1
            java.lang.Object r0 = r0.A02
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            X.C331787Sj.A01(r2, r1, r0)
            goto L_0x0017
        L_0x0774:
            X.0eS.A00(r2)
            java.lang.Object r1 = r0.A03
            java.io.File r2 = A00(r1, r0)
            java.lang.Object r0 = r0.A00
            X.OJf r0 = (X.OJf) r0
            if (r0 == 0) goto L_0x0017
            X.JTQ.A1K(r2)
            X.NIZ r1 = r0.A00
            X.0eM r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            X.GhI r0 = (X.C53027GhI) r0
            r0.A00(r2)
            X.37D r0 = X.DbX.A0i(r1)
            if (r0 == 0) goto L_0x0017
            r0.A0X()
            goto L_0x0017
        L_0x079e:
            java.lang.Object r1 = A01(r2, r0)
            java.io.File r1 = A00(r1, r0)
            java.lang.Object r0 = r0.A03
            X.GhI r0 = (X.C53027GhI) r0
            X.0qQ.A0A(r1)
            r0.A00(r1)
            goto L_0x0017
        L_0x07b2:
            java.lang.Object r4 = A01(r2, r0)
            X.3lr r4 = (X.C250663lr) r4
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.lang.Class<X.Br7> r6 = X.Br7.class
            r2 = 0
            java.lang.String r5 = "voice_options"
            r1 = -777024975(0xffffffffd1af8a31, float:-9.4242218E10)
            com.google.common.collect.ImmutableList r5 = r4.getRequiredCompactedTreeListField(r2, r5, r6, r1)
            java.util.ArrayList r1 = X.DbV.A15(r5)
            java.util.Iterator r9 = r5.iterator()
        L_0x07d0:
            boolean r5 = r9.hasNext()
            r7 = 0
            if (r5 == 0) goto L_0x082a
            java.lang.Object r6 = r9.next()
            X.3lr r6 = (X.C250663lr) r6
            java.lang.String r5 = "name"
            java.lang.String r12 = r6.A08(r5)
            if (r12 == 0) goto L_0x07d0
            X.NkP r8 = X.C69385NkP.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r5 = "category"
            java.lang.Enum r5 = r6.getOptionalEnumField(r2, r5, r8)
            X.NkP r5 = (X.C69385NkP) r5
            if (r5 == 0) goto L_0x07f5
            java.lang.String r7 = r5.name()
        L_0x07f5:
            r5 = 268(0x10c, float:3.76E-43)
            java.lang.String r5 = X.C273654mx.A00(r5)
            java.lang.String r8 = r6.A0B(r5)
            r5 = 31
            X.N49 r11 = new X.N49
            r11.<init>(r7, r8, r5)
            boolean r5 = r3.contains(r11)
            if (r5 != 0) goto L_0x080f
            r3.add(r11)
        L_0x080f:
            java.lang.String r5 = "subtitle"
            java.lang.String r13 = r6.A09(r5)
            java.lang.String r5 = "identifier"
            java.lang.String r14 = r6.A0C(r5)
            java.lang.String r5 = "sample_audio_url"
            java.lang.String r15 = r6.A0A(r5)
            X.QP8 r10 = new X.QP8
            r10.<init>((X.N49) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15)
            r1.add(r10)
            goto L_0x07d0
        L_0x082a:
            java.lang.Object r0 = r0.A03
            X.JgH r0 = (X.C60136JgH) r0
            X.05G r8 = r0.A01
        L_0x0830:
            java.lang.Object r9 = r8.getValue()
            java.util.Iterator r15 = r1.iterator()
        L_0x0838:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0886
            java.lang.Object r10 = r15.next()
            r6 = r10
            X.QP8 r6 = (X.QP8) r6
            java.lang.String r14 = r6.A01
            java.lang.Class<X.Br6> r13 = X.Br6.class
            java.lang.String r12 = "setting"
            r11 = -1416234770(0xffffffffab95f8ee, float:-1.0656179E-12)
            X.3lr r5 = r4.A02(r13, r12, r11)
            if (r5 == 0) goto L_0x0884
            java.lang.String r0 = "ai_voice_selection"
            java.lang.String r0 = r5.getOptionalStringField(r2, r0)
        L_0x085a:
            boolean r0 = X.0qQ.A0K(r14, r0)
            if (r0 != 0) goto L_0x0874
            java.lang.String r6 = r6.A02
            X.3lr r5 = r4.A02(r13, r12, r11)
            if (r5 == 0) goto L_0x0882
            java.lang.String r0 = "ai_voice_selection"
            java.lang.String r0 = r5.getOptionalStringField(r2, r0)
        L_0x086e:
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x0838
        L_0x0874:
            X.QP8 r10 = (X.QP8) r10
            X.JwM r0 = X.C61084JwM.A01(r10, r1, r3)
            boolean r0 = r8.AIY(r9, r0)
            if (r0 == 0) goto L_0x0830
            goto L_0x0017
        L_0x0882:
            r0 = r7
            goto L_0x086e
        L_0x0884:
            r0 = r7
            goto L_0x085a
        L_0x0886:
            r10 = r7
            goto L_0x0874
        L_0x0888:
            X.0eS.A00(r2)
            java.lang.Object r3 = r0.A03
            X.Ne6 r3 = (X.C69067Ne6) r3
            java.lang.Object r5 = r0.A00
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.A02
            X.F1i r6 = (X.C49676F1i) r6
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r5.iterator()
        L_0x089f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x08b9
            java.lang.Object r0 = r1.next()
            X.3sy r0 = (X.C254743sy) r0
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A04(r0)
            if (r0 == 0) goto L_0x089f
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x089f
            r7.add(r0)
            goto L_0x089f
        L_0x08b9:
            X.02m r2 = r3.A01
            r1 = 834875525(0x31c33085, float:5.680763E-9)
            r2.markerStart(r1)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x08d2
            int r0 = r7.size()
            r6.A00(r0)
            r0 = 2
            r2.markerEnd(r1, r0)
        L_0x08d2:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.C69067Ne6.A00(r3, r0)
            com.instagram.common.session.UserSession r4 = r3.A03
            X.1OC r2 = com.instagram.direct.request.DirectThreadApi.A0G(r4, r7)
            r1 = 5
            X.EDb r0 = new X.EDb
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r3, (java.lang.Object) r6)
            r2.A00 = r0
            X.1ES.A03(r2)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r5.iterator()
        L_0x08f0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0906
            java.lang.Object r0 = r1.next()
            X.3sy r0 = (X.C254743sy) r0
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = X.C66647MaG.A07(r0)
            if (r0 == 0) goto L_0x08f0
            r2.add(r0)
            goto L_0x08f0
        L_0x0906:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0017
            X.4DH r0 = r3.A00
            android.content.Context r0 = r0.requireContext()
            X.Nbt r3 = new X.Nbt
            r3.<init>(r0, r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x091b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r1 = r2.next()
            X.3sy r1 = (X.C254743sy) r1
            r0 = 0
            r3.A05(r1, r0)
            goto L_0x091b
        L_0x092c:
            java.lang.Object r1 = A01(r2, r0)
            X.JwG r1 = (X.C61078JwG) r1
            java.lang.Object r2 = r1.A00
            X.OuB r2 = (X.C71979OuB) r2
            if (r2 == 0) goto L_0x0017
            java.lang.Object r1 = r0.A03
            X.NIf r1 = (X.C68442NIf) r1
            java.lang.Object r3 = r0.A02
            X.MzE r3 = (X.C68047MzE) r3
            java.lang.String r5 = r2.A06
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0972
            X.2Ep r4 = r1.A04
            if (r4 == 0) goto L_0x0972
            X.0eM r0 = r1.A09
            java.lang.Object r6 = r0.getValue()
            X.MfP r6 = (X.C66930MfP) r6
            java.lang.String r7 = r4.C6C()
            java.lang.String r8 = r4.C6k()
            int r14 = r4.AdN()
            java.lang.String r0 = "daily_prompt_submission_id"
            java.util.Map r13 = X.AnonymousClass7TF.A0w(r0, r5)
            java.lang.String r9 = "daily_prompt_response_reply_sheet_rendered"
            java.lang.String r10 = "tap"
            java.lang.String r11 = "reply_button"
            java.lang.String r12 = "daily_prompt_responses_sheet"
            X.C66930MfP.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = 1
            r1.A07 = r0
        L_0x0972:
            r0 = 0
            r3.A00(r1, r2, r0)
            goto L_0x0017
        L_0x0978:
            java.lang.Object r2 = A01(r2, r0)
            X.Prf r2 = (X.C74251Prf) r2
            boolean r3 = r2 instanceof X.C68269N8g
            java.lang.Object r1 = r0.A03
            X.NKp r1 = (X.C68496NKp) r1
            if (r3 == 0) goto L_0x0bb0
            X.N8g r2 = (X.C68269N8g) r2
            long r4 = r2.A00
            long r6 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r6
            r6 = 0
            r23 = 0
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0999
            r23 = r4
        L_0x0999:
            r10 = 0
            int r3 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            boolean r3 = X.AnonymousClass7TF.A1R(r3)
            r1.A0H = r3
            boolean r3 = r1.A0G
            if (r3 != 0) goto L_0x0a15
            X.2Ep r6 = r1.A05
            if (r6 == 0) goto L_0x0a15
            X.MfP r12 = r1.A02
            if (r12 != 0) goto L_0x09b2
            java.lang.String r8 = "dailyPromptsLogger"
            goto L_0x1509
        L_0x09b2:
            java.lang.String r13 = r1.A0C
            if (r13 == 0) goto L_0x0bac
            java.lang.String r14 = r6.C6k()
            java.lang.String r7 = r1.A0A
            if (r7 != 0) goto L_0x09c2
            java.lang.String r8 = "collectionId"
            goto L_0x1509
        L_0x09c2:
            int r22 = r6.AdN()
            X.0eM r3 = r1.A0I
            java.lang.String r5 = X.DbU.A0u(r3)
            int r4 = r6.C6a()
            X.3Te r3 = X.C66580MXl.A0b(r6)
            java.lang.String r6 = X.C329997La.A00(r3, r5, r4)
            boolean r5 = r1.A0H
            X.NjA r3 = r1.A03
            if (r3 == 0) goto L_0x0a12
            int r9 = r3.ordinal()
            r8 = 3
            r4 = 6
            r3 = 4
            if (r9 == r3) goto L_0x0ba6
            if (r9 == r8) goto L_0x0ba0
            if (r9 != r4) goto L_0x0a12
            X.Nmb r11 = X.C69493Nmb.MEMBER_PARTICIPATION_HUB
            java.lang.String r17 = "member_participation_hub_cta_button"
        L_0x09ef:
            java.lang.String r3 = "user_type"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r3, r6)
            if (r5 == 0) goto L_0x0b9c
            java.lang.String r5 = "ACTIVE"
        L_0x09f9:
            java.lang.String r3 = "daily_prompt_status"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r3, r5)
            java.lang.String r3 = "prompt_id"
            java.util.LinkedHashMap r21 = X.DbY.A0q(r3, r7, r4, r5)
            r19 = 0
            java.lang.String r15 = "daily_prompt_responses_sheet_rendered"
            java.lang.String r16 = "tap"
            java.lang.String r18 = "thread_view"
            r20 = r19
            X.C66930MfP.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x0a12:
            r3 = 1
            r1.A0G = r3
        L_0x0a15:
            com.instagram.direct.ui.countdowntimer.CountdownTimerPill r3 = r1.A06
            if (r3 == 0) goto L_0x0a1c
            r3.setVisibility(r10)
        L_0x0a1c:
            boolean r3 = r1.A0H
            if (r3 == 0) goto L_0x0b93
            com.instagram.direct.ui.countdowntimer.CountdownTimerPill r4 = r1.A06
            if (r4 == 0) goto L_0x0a33
            r3 = 32
            X.PgO r22 = X.C66580MXl.A15(r1, r3)
            r21 = r4
            r25 = r10
            r26 = r10
            r21.A02(r22, r23, r25, r26)
        L_0x0a33:
            com.instagram.direct.ui.countdowntimer.CountdownTimerPill r6 = r1.A06
            if (r6 == 0) goto L_0x0a4e
            android.content.Context r5 = r1.requireContext()
            android.content.Context r4 = r1.requireContext()
            X.1QG r3 = X.1QE.A0E()
            int r3 = X.1QE.A05(r4, r3)
            int r3 = r5.getColor(r3)
            r6.setPillColor(r3)
        L_0x0a4e:
            com.instagram.direct.ui.countdowntimer.CountdownTimerPill r6 = r1.A06
            if (r6 == 0) goto L_0x0a69
            android.content.Context r5 = r1.requireContext()
            android.content.Context r4 = r1.requireContext()
            X.1QG r3 = X.1QE.A0E()
            int r3 = X.1QE.A06(r4, r3)
            int r3 = r5.getColor(r3)
            r6.setPillTextColor(r3)
        L_0x0a69:
            boolean r3 = r1.A0F
            r4 = 0
            if (r3 == 0) goto L_0x0a77
            boolean r3 = r1.A0H
            if (r3 == 0) goto L_0x0a77
            boolean r3 = r2.A05
            r7 = 1
            if (r3 == 0) goto L_0x0a78
        L_0x0a77:
            r7 = 0
        L_0x0a78:
            com.instagram.common.ui.base.IgTextView r3 = r1.A01
            if (r3 == 0) goto L_0x0a83
            if (r7 != 0) goto L_0x0a80
            r4 = 8
        L_0x0a80:
            r3.setVisibility(r4)
        L_0x0a83:
            com.instagram.common.ui.base.IgTextView r5 = r1.A01
            if (r5 == 0) goto L_0x0a93
            android.content.Context r4 = r1.requireContext()
            r3 = 0
            android.content.res.ColorStateList r3 = X.1QE.A0B(r4, r3)
            r5.setBackgroundTintList(r3)
        L_0x0a93:
            com.instagram.common.ui.base.IgTextView r6 = r1.A01
            if (r6 == 0) goto L_0x0aaa
            android.content.Context r5 = r1.requireContext()
            android.content.Context r4 = r1.requireContext()
            X.1QG r3 = X.1QE.A0E()
            int r3 = X.1QE.A06(r4, r3)
            X.DbT.A17(r5, r6, r3)
        L_0x0aaa:
            if (r7 == 0) goto L_0x0ab5
            com.instagram.common.ui.base.IgTextView r4 = r1.A01
            if (r4 == 0) goto L_0x0ab5
            r3 = 44
            X.C71408Ok7.A00(r4, r3, r1, r2)
        L_0x0ab5:
            com.instagram.user.model.User r3 = r2.A01
            if (r3 == 0) goto L_0x0b90
            java.lang.String r4 = X.AnonymousClass3ZA.A00(r3)
        L_0x0abd:
            X.0eM r3 = r1.A0J
            java.lang.Object r6 = r3.getValue()
            X.9HW r6 = (X.AnonymousClass9HW) r6
            java.lang.String r3 = r1.A0C
            if (r3 == 0) goto L_0x0bac
            X.3t0 r5 = X.C66580MXl.A0g(r3)
            r3 = 66
            boolean r8 = r6.A00(r5, r3)
            X.0eM r5 = r1.A0I
            java.lang.String r3 = X.DbU.A0u(r5)
            boolean r7 = X.C51966G9m.A1a(r3, r4)
            android.content.Context r9 = r1.requireContext()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r6 = 27
            X.Pm1 r12 = new X.Pm1
            r12.<init>((X.C68496NKp) r1, (int) r6)
            r11 = 0
            r13 = 2131958827(0x7f131c2b, float:1.9554277E38)
            r14 = 2131238164(0x7f081d14, float:1.8092599E38)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            X.8rI r6 = X.C71127OdQ.A04(r9, r10, r11, r12, r13, r14)
            r3.add(r6)
            if (r8 == 0) goto L_0x0b18
            java.lang.Integer r11 = X.C66581MXm.A0m(r9)
            r6 = 28
            X.Pm1 r12 = new X.Pm1
            r12.<init>((X.C68496NKp) r1, (int) r6)
            r13 = 2131960643(0x7f132343, float:1.955796E38)
            r14 = 2131238196(0x7f081d34, float:1.8092664E38)
            X.8rI r6 = X.C71127OdQ.A04(r9, r10, r11, r12, r13, r14)
            r3.add(r6)
        L_0x0b18:
            if (r7 == 0) goto L_0x0b32
            java.lang.Integer r11 = X.C66581MXm.A0m(r9)
            r6 = 47
            X.Phi r12 = new X.Phi
            r12.<init>(r4, r1, r6)
            r13 = 2131972171(0x7f13504b, float:1.9581342E38)
            r14 = 2131238715(0x7f081f3b, float:1.8093717E38)
            X.8rI r4 = X.C71127OdQ.A04(r9, r10, r11, r12, r13, r14)
            r3.add(r4)
        L_0x0b32:
            r1.A0E = r3
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.List r7 = r2.A03
            boolean r3 = X.AnonymousClass7TE.A1b(r7)
            if (r3 == 0) goto L_0x0b68
            java.lang.String r5 = r2.A02
            boolean r4 = r2.A04
            X.NP8 r3 = new X.NP8
            r3.<init>(r5, r4)
            r6.add(r3)
            r6.addAll(r7)
            boolean r2 = r2.A06
            if (r2 == 0) goto L_0x0b64
            X.0eM r2 = r1.A0K
            java.lang.Object r2 = r2.getValue()
            X.Mtw r2 = (X.C67743Mtw) r2
            X.2ms r2 = r2.A05
            X.Toc r3 = X.C14036Toc.A00(r2)
        L_0x0b61:
            r6.add(r3)
        L_0x0b64:
            r1.A0B(r6)
            goto L_0x0bb7
        L_0x0b68:
            java.lang.String r4 = r2.A02
            boolean r2 = r1.A0H
            if (r2 == 0) goto L_0x0b7f
            r3 = 2131960071(0x7f132107, float:1.95568E38)
        L_0x0b71:
            android.content.Context r2 = r1.requireContext()
            java.lang.String r2 = X.AnonymousClass7TE.A16(r2, r3)
            X.NP7 r3 = new X.NP7
            r3.<init>(r4, r2)
            goto L_0x0b61
        L_0x0b7f:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            boolean r2 = X.AnonymousClass7K4.A02(r2)
            r3 = 2131960073(0x7f132109, float:1.9556804E38)
            if (r2 == 0) goto L_0x0b71
            r3 = 2131960072(0x7f132108, float:1.9556802E38)
            goto L_0x0b71
        L_0x0b90:
            r4 = 0
            goto L_0x0abd
        L_0x0b93:
            com.instagram.direct.ui.countdowntimer.CountdownTimerPill r3 = r1.A06
            if (r3 == 0) goto L_0x0a69
            r3.A01()
            goto L_0x0a69
        L_0x0b9c:
            java.lang.String r5 = "ENDED"
            goto L_0x09f9
        L_0x0ba0:
            X.Nmb r11 = X.C69493Nmb.CHANNEL_DAILY_PROMPT_BANNER
            java.lang.String r17 = "daily_prompt_thread_bottom_banner"
            goto L_0x09ef
        L_0x0ba6:
            X.Nmb r11 = X.C69493Nmb.CHANNEL_DAILY_PROMPT_XMA
            java.lang.String r17 = "daily_prompt_thread_xma"
            goto L_0x09ef
        L_0x0bac:
            java.lang.String r8 = "threadId"
            goto L_0x1509
        L_0x0bb0:
            X.JXP r3 = X.JXP.LOADING
            X.0sn r2 = X.0sn.A00
            r1.updateUi(r3, r2)
        L_0x0bb7:
            java.lang.Object r2 = r0.A02
            android.view.View r2 = (android.view.View) r2
            r0 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            android.view.ViewGroup r3 = X.DbX.A0I(r2, r0)
            r2 = 68
            X.Ojw r0 = new X.Ojw
            r0.<init>(r1, r2)
            X.2dZ r3 = X.2dY.A01(r0, r3)
            r2 = 2
            X.FTS r0 = new X.FTS
            r0.<init>(r1, r2)
            r3.A0X(r0)
            goto L_0x0017
        L_0x0bd8:
            X.0eS.A00(r2)
            java.lang.Object r1 = r0.A03
            com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r1 = (com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender) r1
            java.lang.Object r11 = r0.A00
            X.1k7 r11 = (X.C66151k7) r11
            com.instagram.common.session.UserSession r8 = r1.A01
            X.OO5 r4 = X.C70176NyU.A00(r8)
            X.Nl3 r3 = X.C69421Nl3.NOTE
            X.N2G r2 = r11.A07()
            X.Nl2 r1 = X.C69420Nl2.REPLY
            X.N1Z r7 = r4.A00(r3, r1, r2)
            com.instagram.pendingmedia.store.PendingMediaStore r2 = X.28K.A00(r8)
            X.47v r1 = r11.A00
            java.lang.String r1 = r1.A07
            X.0qQ.A07(r1)
            X.3Q2 r1 = r2.A03(r1)
            r10 = 0
            if (r1 == 0) goto L_0x0cd2
            java.lang.String r1 = r1.A2N
            if (r1 == 0) goto L_0x0cd2
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = X.C66834MdS.A03(r1)
            if (r1 == 0) goto L_0x0cd2
            X.NFm r2 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.A00(r1)
            java.lang.String r1 = "audio/mp4"
            r2.A06(r1)
            X.R5b r4 = r2.A02()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r4 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r4
            com.instagram.direct.armadilloexpress.transportpayload.Voice r1 = com.instagram.direct.armadilloexpress.transportpayload.Voice.DEFAULT_INSTANCE
            X.R4O r5 = r1.A0I()
            X.NFn r5 = (X.C68406NFn) r5
            X.R5b r2 = X.C66580MXl.A0L(r5)
            com.instagram.direct.armadilloexpress.transportpayload.Voice r2 = (com.instagram.direct.armadilloexpress.transportpayload.Voice) r2
            r4.getClass()
            r2.mediaTransport_ = r4
            int r1 = r2.bitField0_
            r1 = r1 | 1
            r2.bitField0_ = r1
            X.47v r1 = r11.A00
            java.lang.Integer r1 = r1.A00()
            r6 = 0
            int r3 = X.AnonymousClass7TG.A0A(r1)
            X.R5b r2 = X.C66580MXl.A0L(r5)
            com.instagram.direct.armadilloexpress.transportpayload.Voice r2 = (com.instagram.direct.armadilloexpress.transportpayload.Voice) r2
            int r1 = r2.bitField0_
            r1 = r1 | 2
            r2.bitField0_ = r1
            r2.duration_ = r3
            X.47v r1 = r11.A00
            java.lang.Integer r1 = r1.A01()
            int r3 = X.C51967G9n.A04(r1, r6)
            X.R5b r2 = X.C66580MXl.A0L(r5)
            com.instagram.direct.armadilloexpress.transportpayload.Voice r2 = (com.instagram.direct.armadilloexpress.transportpayload.Voice) r2
            int r1 = r2.bitField0_
            r1 = r1 | 4
            r2.bitField0_ = r1
            r2.waveformSamplingFrequencyHz_ = r3
            X.47v r1 = r11.A00
            java.util.List r1 = r1.A03()
            if (r1 != 0) goto L_0x0c74
            X.0sn r1 = X.0sn.A00
        L_0x0c74:
            java.util.Iterator r3 = r1.iterator()
        L_0x0c78:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0ca9
            java.lang.Object r2 = r3.next()
            java.lang.Float r2 = (java.lang.Float) r2
            r1 = 0
            boolean r1 = X.0qQ.A0I(r2, r1)
            if (r1 == 0) goto L_0x0c9d
            r1 = 841731191(0x322bcc77, float:1.0E-8)
        L_0x0c8e:
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
        L_0x0c92:
            X.0qQ.A0A(r2)
            float r1 = r2.floatValue()
            r5.A06(r1)
            goto L_0x0c78
        L_0x0c9d:
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r1 = X.0qQ.A0I(r2, r1)
            if (r1 == 0) goto L_0x0c92
            r1 = 1065353214(0x3f7ffffe, float:0.9999999)
            goto L_0x0c8e
        L_0x0ca9:
            com.instagram.direct.armadilloexpress.transportpayload.Media r1 = com.instagram.direct.armadilloexpress.transportpayload.Media.DEFAULT_INSTANCE
            X.R4O r3 = r1.A0I()
            X.R5b r1 = r5.A02()
            X.R5b r2 = X.C66580MXl.A0L(r3)
            com.instagram.direct.armadilloexpress.transportpayload.Media r2 = (com.instagram.direct.armadilloexpress.transportpayload.Media) r2
            r1.getClass()
            r2.media_ = r1
            r1 = 2
            r2.mediaCase_ = r1
            X.R5b r9 = r3.A02()
            com.instagram.direct.armadilloexpress.transportpayload.Media r9 = (com.instagram.direct.armadilloexpress.transportpayload.Media) r9
            X.OVn r6 = X.C70992OVn.A00
            r12 = r10
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r1 = r6.A00(r7, r8, r9, r10, r11, r12)
            X.0eP r10 = X.AnonymousClass7TE.A1L(r1, r4)
        L_0x0cd2:
            if (r10 == 0) goto L_0x0017
            java.lang.Object r2 = r0.A02
            X.Pwk r2 = (X.C74551Pwk) r2
            java.lang.Object r9 = r10.A00
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r9 = (com.instagram.direct.armadilloexpress.transportpayload.TransportPayload) r9
            java.lang.Object r1 = r10.A01
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r1
            X.47v r0 = r11.A00
            X.PDF r10 = X.OQS.A00(r8, r1, r0, r2)
            X.Ma7 r8 = X.C70175NyT.A00(r8)
            java.lang.Object r12 = X.C66582MXn.A0q(r11)
            com.instagram.model.direct.DirectThreadKey r12 = (com.instagram.model.direct.DirectThreadKey) r12
            r13 = 0
            goto L_0x0dcb
        L_0x0cf3:
            X.0eS.A00(r2)
            java.lang.Object r1 = r0.A03
            com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r1 = (com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender) r1
            java.lang.Object r11 = r0.A00
            X.1k3 r11 = (X.1k3) r11
            com.instagram.common.session.UserSession r8 = r1.A01
            X.OO5 r4 = X.C70176NyU.A00(r8)
            X.Nl3 r3 = X.C69421Nl3.NOTE
            X.HnA r2 = r11.A07()
            X.Nl2 r1 = X.C69420Nl2.REPLY
            X.N1Z r7 = r4.A00(r3, r1, r2)
            com.instagram.pendingmedia.store.PendingMediaStore r2 = X.28K.A00(r8)
            X.5yB r1 = r11.A08()
            java.lang.String r1 = r1.A06
            if (r1 == 0) goto L_0x16f2
            X.3Q2 r5 = r2.A03(r1)
            r6 = 0
            if (r5 == 0) goto L_0x0da9
            java.lang.String r1 = r5.A2N
            if (r1 == 0) goto L_0x0da9
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r3 = X.C66834MdS.A03(r1)
            if (r3 == 0) goto L_0x0da9
            boolean r1 = r5.A12()
            if (r1 == 0) goto L_0x0dfc
            java.lang.String r2 = "video/mp4"
        L_0x0d35:
            X.NFm r1 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.A00(r3)
            r1.A06(r2)
            X.R5b r3 = r1.A02()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r3 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r3
            boolean r1 = r5.A12()
            if (r1 == 0) goto L_0x0dd0
            java.lang.String r1 = r5.A2M
            if (r1 == 0) goto L_0x0d50
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r6 = X.C66834MdS.A03(r1)
        L_0x0d50:
            com.instagram.direct.armadilloexpress.transportpayload.Video r1 = com.instagram.direct.armadilloexpress.transportpayload.Video.DEFAULT_INSTANCE
            X.R4O r4 = r1.A0I()
            X.NFv r4 = (X.C68414NFv) r4
            r4.A08(r3)
            int r1 = r5.A0R
            r4.A06(r1)
            int r1 = r5.A0S
            r4.A07(r1)
            if (r6 == 0) goto L_0x0d7f
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r1 = com.instagram.direct.armadilloexpress.transportpayload.Thumbnail.DEFAULT_INSTANCE
            X.R4O r2 = r1.A0I()
            X.NFr r2 = (X.C68410NFr) r2
            r2.A08(r6)
            int r1 = r5.A0S
            r2.A07(r1)
            int r1 = r5.A0R
            r2.A06(r1)
            r4.A09(r2)
        L_0x0d7f:
            com.instagram.direct.armadilloexpress.transportpayload.Media r1 = com.instagram.direct.armadilloexpress.transportpayload.Media.DEFAULT_INSTANCE
            X.R4O r5 = r1.A0I()
            X.R5b r1 = r4.A02()
            X.R5b r4 = X.C66580MXl.A0L(r5)
            com.instagram.direct.armadilloexpress.transportpayload.Media r4 = (com.instagram.direct.armadilloexpress.transportpayload.Media) r4
            r1.getClass()
            r4.media_ = r1
            r1 = 3
        L_0x0d95:
            r4.mediaCase_ = r1
            X.R5b r9 = r5.A02()
            com.instagram.direct.armadilloexpress.transportpayload.Media r9 = (com.instagram.direct.armadilloexpress.transportpayload.Media) r9
            X.OVn r6 = X.C70992OVn.A00
            r10 = 0
            r12 = r10
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r1 = r6.A00(r7, r8, r9, r10, r11, r12)
            X.0eP r6 = X.AnonymousClass7TE.A1L(r1, r3)
        L_0x0da9:
            if (r6 == 0) goto L_0x0017
            java.lang.Object r2 = r0.A02
            X.Pwk r2 = (X.C74551Pwk) r2
            java.lang.Object r9 = r6.A00
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r9 = (com.instagram.direct.armadilloexpress.transportpayload.TransportPayload) r9
            java.lang.Object r1 = r6.A01
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r1
            X.5yB r0 = r11.A08()
            X.PDF r10 = X.OQS.A01(r8, r1, r2, r0)
            X.Ma7 r8 = X.C70175NyT.A00(r8)
            java.lang.Object r12 = X.C66582MXn.A0q(r11)
            com.instagram.model.direct.DirectThreadKey r12 = (com.instagram.model.direct.DirectThreadKey) r12
            r13 = 9
        L_0x0dcb:
            r8.A02(r9, r10, r11, r12, r13)
            goto L_0x0017
        L_0x0dd0:
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r1 = com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto.DEFAULT_INSTANCE
            X.R4O r2 = r1.A0I()
            X.NFq r2 = (X.C68409NFq) r2
            r2.A08(r3)
            int r1 = r5.A0R
            r2.A06(r1)
            int r1 = r5.A0S
            r2.A07(r1)
            X.R5b r2 = r2.A02()
            com.instagram.direct.armadilloexpress.transportpayload.Media r1 = com.instagram.direct.armadilloexpress.transportpayload.Media.DEFAULT_INSTANCE
            X.R4O r5 = r1.A0I()
            X.R5b r4 = X.C66580MXl.A0L(r5)
            com.instagram.direct.armadilloexpress.transportpayload.Media r4 = (com.instagram.direct.armadilloexpress.transportpayload.Media) r4
            r2.getClass()
            r4.media_ = r2
            r1 = 1
            goto L_0x0d95
        L_0x0dfc:
            java.lang.String r2 = "image/jpeg"
            goto L_0x0d35
        L_0x0e00:
            java.lang.Object r5 = A01(r2, r0)
            X.Pvg r5 = (X.C74486Pvg) r5
            java.lang.Object r4 = r0.A03
            X.32L r4 = (X.AnonymousClass32L) r4
            java.lang.Object r3 = r0.A02
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            X.Jfs r2 = r4.A0M
            if (r2 == 0) goto L_0x0017
            X.Pvg r0 = r4.A0N
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x0017
            X.Pvg r0 = r4.A0N
            if (r0 == 0) goto L_0x0e21
            r0.onDestroyView()
        L_0x0e21:
            r3.removeAllViews()
            r4.A0N = r5
            if (r5 == 0) goto L_0x0017
            X.GWh r1 = r4.A0C
            if (r1 != 0) goto L_0x0e36
            java.lang.String r0 = "exploreGridDelegate"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0e36:
            com.instagram.common.session.UserSession r0 = r4.getSession()
            r5.D6Z(r0, r1, r2)
            com.instagram.common.session.UserSession r0 = r4.getSession()
            r5.D71(r3, r4, r0)
            goto L_0x0017
        L_0x0e46:
            X.0eS.A00(r2)
            java.lang.Object r5 = r0.A03
            X.KSc r5 = (X.KSc) r5
            java.lang.Object r1 = r0.A00
            X.LsL r1 = (X.C65380LsL) r1
            r13 = 0
            X.0qQ.A0B(r1, r13)
            java.util.List r4 = r1.A05
            java.lang.String r3 = "\n"
            X.PpD r2 = X.C74110PpD.A00
            java.lang.String r1 = ""
            X.00k.A0P(r3, r1, r1, r4, r2)
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x11ce }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x11ce }
        L_0x0e68:
            boolean r1 = r4.hasNext()     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x0e84
            java.lang.Object r2 = r4.next()     // Catch:{ Exception -> 0x11ce }
            com.instagram.igsignals.core.IgSignalsFeature r2 = (com.instagram.igsignals.core.IgSignalsFeature) r2     // Catch:{ Exception -> 0x11ce }
            java.lang.String r1 = r2.A02     // Catch:{ Exception -> 0x11ce }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x11ce }
            double r1 = r2.A00     // Catch:{ Exception -> 0x11ce }
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ Exception -> 0x11ce }
            r8.put(r3, r1)     // Catch:{ Exception -> 0x11ce }
            goto L_0x0e68
        L_0x0e84:
            X.OYr r7 = r5.A00     // Catch:{ Exception -> 0x11ce }
            if (r7 != 0) goto L_0x0e9f
            X.Kmz r2 = r5.A02     // Catch:{ Exception -> 0x11ce }
            boolean r1 = r2 instanceof X.C61933KSi     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x0e9a
            X.KSi r2 = (X.C61933KSi) r2     // Catch:{ Exception -> 0x11ce }
            java.lang.String r1 = r2.A00     // Catch:{ Exception -> 0x11ce }
            X.OYr r7 = new X.OYr     // Catch:{ Exception -> 0x11ce }
            r7.<init>(r1)     // Catch:{ Exception -> 0x11ce }
            r5.A00 = r7     // Catch:{ Exception -> 0x11ce }
            goto L_0x0e9f
        L_0x0e9a:
            X.Wub r1 = X.AnonymousClass7TE.A1K()     // Catch:{ Exception -> 0x11ce }
            throw r1     // Catch:{ Exception -> 0x11ce }
        L_0x0e9f:
            if (r7 == 0) goto L_0x11bd
            boolean r2 = r7.A04     // Catch:{ Exception -> 0x11ce }
            boolean r1 = r7.A05     // Catch:{ Exception -> 0x11ce }
            if (r2 != 0) goto L_0x104e
            if (r1 != 0) goto L_0x0ed3
            java.lang.String r5 = r7.A06     // Catch:{ Exception -> 0x11ce }
            r4 = 1
            boolean r1 = X.00l.A0W(r5)     // Catch:{ Exception -> 0x11ce }
            if (r1 != 0) goto L_0x0ed3
            java.lang.System.nanoTime()     // Catch:{ Exception -> 0x11ce }
            char[] r2 = new char[r4]     // Catch:{ Exception -> 0x11ce }
            r1 = 59
            r2[r13] = r1     // Catch:{ Exception -> 0x11ce }
            java.util.List r11 = X.00l.A0Q(r5, r2, r13)     // Catch:{ Exception -> 0x11ce }
            int r1 = r11.size()     // Catch:{ Exception -> 0x11ce }
            java.lang.String r3 = "TreePredictor"
            r9 = 3
            if (r1 >= r9) goto L_0x0ee2
            java.lang.String r2 = "invalid tree format \""
            r1 = 34
            java.lang.String r1 = X.002.A0S(r2, r5, r1)     // Catch:{ Exception -> 0x11ce }
            X.0KC.A0C(r3, r1)     // Catch:{ Exception -> 0x11ce }
        L_0x0ed3:
            java.util.List r1 = r7.A02     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x0ee0
            int r10 = r1.size()     // Catch:{ Exception -> 0x11ce }
        L_0x0edb:
            java.lang.System.nanoTime()     // Catch:{ Exception -> 0x11ce }
            goto L_0x0fb7
        L_0x0ee0:
            r10 = 0
            goto L_0x0edb
        L_0x0ee2:
            java.lang.String r1 = X.AnonymousClass7TE.A19(r11, r13)     // Catch:{ Exception -> 0x11ce }
            java.lang.CharSequence r1 = X.00l.A0B(r1)     // Catch:{ Exception -> 0x11ce }
            r1.toString()     // Catch:{ Exception -> 0x11ce }
            java.lang.String r1 = X.AnonymousClass7TE.A19(r11, r4)     // Catch:{ Exception -> 0x11ce }
            java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x11ce }
            r1 = 2
            java.lang.Object r2 = r11.get(r1)     // Catch:{ Exception -> 0x11ce }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x11ce }
            java.lang.String r12 = ","
            java.lang.String[] r1 = new java.lang.String[]{r12}     // Catch:{ Exception -> 0x11ce }
            r10 = 0
            java.util.List r2 = X.00l.A0R(r2, r1, r13)     // Catch:{ Exception -> 0x11ce }
            java.lang.String[] r1 = new java.lang.String[r13]     // Catch:{ Exception -> 0x11ce }
            java.lang.Object[] r6 = r2.toArray(r1)     // Catch:{ Exception -> 0x11ce }
            int r5 = r6.length     // Catch:{ Exception -> 0x11ce }
            java.util.ArrayList r3 = X.DbS.A0v(r5)     // Catch:{ Exception -> 0x11ce }
        L_0x0f11:
            if (r10 >= r5) goto L_0x0f25
            r1 = r6[r10]     // Catch:{ Exception -> 0x11ce }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x11ce }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x11ce }
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ Exception -> 0x11ce }
            r3.add(r1)     // Catch:{ Exception -> 0x11ce }
            int r10 = r10 + 1
            goto L_0x0f11
        L_0x0f25:
            r7.A02 = r3     // Catch:{ Exception -> 0x11ce }
            int r1 = r11.size()     // Catch:{ Exception -> 0x11ce }
            r10 = 4
            if (r1 <= r10) goto L_0x0fb0
            java.lang.Object r2 = r11.get(r9)     // Catch:{ Exception -> 0x11ce }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x11ce }
            java.lang.String[] r1 = new java.lang.String[]{r12}     // Catch:{ Exception -> 0x11ce }
            java.util.List r2 = X.00l.A0R(r2, r1, r13)     // Catch:{ Exception -> 0x11ce }
            r9 = 0
            boolean r1 = r2.isEmpty()     // Catch:{ Exception -> 0x11ce }
            if (r1 != 0) goto L_0x0f75
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1D(r2)     // Catch:{ Exception -> 0x11ce }
            int r5 = r6.size()     // Catch:{ Exception -> 0x11ce }
        L_0x0f4b:
            if (r9 >= r5) goto L_0x0f71
            java.lang.Object r1 = r6.get(r9)     // Catch:{ Exception -> 0x11ce }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x11ce }
            java.lang.Integer r3 = X.00y.A0l(r1)     // Catch:{ Exception -> 0x11ce }
            if (r3 == 0) goto L_0x0f6e
            int r2 = r3.intValue()     // Catch:{ Exception -> 0x11ce }
            int r1 = r6.size()     // Catch:{ Exception -> 0x11ce }
            if (r2 >= r1) goto L_0x0f6e
            int r1 = r3.intValue()     // Catch:{ Exception -> 0x11ce }
            java.lang.Object r1 = r6.get(r1)     // Catch:{ Exception -> 0x11ce }
            r6.set(r9, r1)     // Catch:{ Exception -> 0x11ce }
        L_0x0f6e:
            int r9 = r9 + 1
            goto L_0x0f4b
        L_0x0f71:
            java.util.List r2 = X.00k.A0a(r6)     // Catch:{ Exception -> 0x11ce }
        L_0x0f75:
            r7.A01 = r2     // Catch:{ Exception -> 0x11ce }
            java.lang.Object r2 = r11.get(r10)     // Catch:{ Exception -> 0x11ce }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x11ce }
            java.lang.String[] r1 = new java.lang.String[]{r12}     // Catch:{ Exception -> 0x11ce }
            java.util.List r2 = X.00l.A0R(r2, r1, r13)     // Catch:{ Exception -> 0x11ce }
            java.lang.String[] r1 = new java.lang.String[r13]     // Catch:{ Exception -> 0x11ce }
            java.lang.Object[] r6 = r2.toArray(r1)     // Catch:{ Exception -> 0x11ce }
            int r5 = r6.length     // Catch:{ Exception -> 0x11ce }
            java.util.ArrayList r3 = X.DbS.A0v(r5)     // Catch:{ Exception -> 0x11ce }
            r2 = 0
        L_0x0f91:
            if (r2 >= r5) goto L_0x0fae
            r1 = r6[r2]     // Catch:{ Exception -> 0x11ce }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x11ce }
            java.lang.Integer r1 = X.00y.A0l(r1)     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x0fa9
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x11ce }
        L_0x0fa1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x11ce }
            r3.add(r1)     // Catch:{ Exception -> 0x11ce }
            goto L_0x0fab
        L_0x0fa9:
            r1 = -1
            goto L_0x0fa1
        L_0x0fab:
            int r2 = r2 + 1
            goto L_0x0f91
        L_0x0fae:
            r7.A00 = r3     // Catch:{ Exception -> 0x11ce }
        L_0x0fb0:
            r7.A05 = r4     // Catch:{ Exception -> 0x11ce }
            java.lang.System.nanoTime()     // Catch:{ Exception -> 0x11ce }
            goto L_0x0ed3
        L_0x0fb7:
            r1 = 0
        L_0x0fb8:
            java.lang.String r5 = "TreePredictor"
            r9 = 0
            if (r1 < 0) goto L_0x1049
            if (r1 >= r10) goto L_0x1049
            java.util.List r2 = r7.A01     // Catch:{ Exception -> 0x11ce }
            if (r2 == 0) goto L_0x1007
            java.lang.Object r6 = r2.get(r1)     // Catch:{ Exception -> 0x11ce }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x11ce }
            if (r6 == 0) goto L_0x1007
            boolean r2 = X.00l.A0W(r6)     // Catch:{ Exception -> 0x11ce }
            if (r2 != 0) goto L_0x1007
            java.lang.Object r3 = r8.get(r6)     // Catch:{ Exception -> 0x11ce }
            java.lang.Double r3 = (java.lang.Double) r3     // Catch:{ Exception -> 0x11ce }
            java.util.List r2 = r7.A02     // Catch:{ Exception -> 0x11ce }
            if (r2 == 0) goto L_0x0fe2
            java.lang.Object r4 = r2.get(r1)     // Catch:{ Exception -> 0x11ce }
            java.lang.Double r4 = (java.lang.Double) r4     // Catch:{ Exception -> 0x11ce }
            goto L_0x0fe3
        L_0x0fe2:
            r4 = r9
        L_0x0fe3:
            if (r3 == 0) goto L_0x1026
            if (r4 == 0) goto L_0x1026
            double r5 = r3.doubleValue()     // Catch:{ Exception -> 0x11ce }
            double r3 = r4.doubleValue()     // Catch:{ Exception -> 0x11ce }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0ff6
            int r1 = r1 + 1
            goto L_0x0fb8
        L_0x0ff6:
            java.util.List r2 = r7.A00     // Catch:{ Exception -> 0x11ce }
            if (r2 == 0) goto L_0x1005
            java.lang.Object r1 = r2.get(r1)     // Catch:{ Exception -> 0x11ce }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ Exception -> 0x11ce }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x11ce }
            goto L_0x0fb8
        L_0x1005:
            r1 = -1
            goto L_0x0fb8
        L_0x1007:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ Exception -> 0x11ce }
            java.lang.String r2 = "ALEX "
            r3.append(r2)     // Catch:{ Exception -> 0x11ce }
            java.util.List r2 = r7.A02     // Catch:{ Exception -> 0x11ce }
            java.lang.String r3 = X.AnonymousClass7TF.A0i(r2, r3)     // Catch:{ Exception -> 0x11ce }
            java.io.PrintStream r2 = java.lang.System.out     // Catch:{ Exception -> 0x11ce }
            r2.println(r3)     // Catch:{ Exception -> 0x11ce }
            java.util.List r2 = r7.A02     // Catch:{ Exception -> 0x11ce }
            if (r2 == 0) goto L_0x1049
            java.lang.Object r9 = r2.get(r1)     // Catch:{ Exception -> 0x11ce }
            java.lang.Double r9 = (java.lang.Double) r9     // Catch:{ Exception -> 0x11ce }
            goto L_0x1049
        L_0x1026:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ Exception -> 0x11ce }
            java.lang.String r2 = "missing input "
            r3.append(r2)     // Catch:{ Exception -> 0x11ce }
            r3.append(r6)     // Catch:{ Exception -> 0x11ce }
            java.lang.String r2 = " or splitValue = "
            r3.append(r2)     // Catch:{ Exception -> 0x11ce }
            r3.append(r4)     // Catch:{ Exception -> 0x11ce }
            java.lang.String r2 = " for index "
            r3.append(r2)     // Catch:{ Exception -> 0x11ce }
            r3.append(r1)     // Catch:{ Exception -> 0x11ce }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x11ce }
            X.0KC.A0C(r5, r1)     // Catch:{ Exception -> 0x11ce }
        L_0x1049:
            java.lang.System.nanoTime()     // Catch:{ Exception -> 0x11ce }
            goto L_0x1198
        L_0x104e:
            if (r1 != 0) goto L_0x1080
            java.lang.String r5 = "TreePredictor"
            java.lang.String r4 = r7.A06     // Catch:{ Exception -> 0x11ce }
            r2 = 1
            boolean r1 = X.00l.A0W(r4)     // Catch:{ Exception -> 0x11ce }
            if (r1 != 0) goto L_0x1080
            java.lang.System.nanoTime()     // Catch:{ Exception -> 0x11ce }
            org.json.JSONObject r1 = X.C66580MXl.A17(r4)     // Catch:{ JSONException -> 0x1067 }
            r7.A03 = r1     // Catch:{ JSONException -> 0x1067 }
            r7.A05 = r2     // Catch:{ JSONException -> 0x1067 }
            goto L_0x107d
        L_0x1067:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()     // Catch:{ Exception -> 0x11ce }
            java.lang.String r1 = "failed to parse tree from \""
            r2.append(r1)     // Catch:{ Exception -> 0x11ce }
            r2.append(r4)     // Catch:{ Exception -> 0x11ce }
            java.lang.String r1 = "\", "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r3, r1, r2)     // Catch:{ Exception -> 0x11ce }
            X.0KC.A0C(r5, r1)     // Catch:{ Exception -> 0x11ce }
        L_0x107d:
            java.lang.System.nanoTime()     // Catch:{ Exception -> 0x11ce }
        L_0x1080:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x11ce }
            org.json.JSONObject r2 = r7.A03     // Catch:{ Exception -> 0x11ce }
            java.lang.String r1 = "type"
            r6 = 0
            if (r2 == 0) goto L_0x1093
            java.lang.String r3 = r2.optString(r1)     // Catch:{ Exception -> 0x11ce }
        L_0x108f:
            java.lang.System.nanoTime()     // Catch:{ Exception -> 0x11ce }
            goto L_0x1095
        L_0x1093:
            r3 = r6
            goto L_0x108f
        L_0x1095:
            if (r3 == 0) goto L_0x10a0
            int r1 = r3.hashCode()     // Catch:{ Exception -> 0x11ce }
            java.lang.String r2 = "trees"
            switch(r1) {
                case 96978: goto L_0x1162;
                case 108484: goto L_0x1124;
                case 114240: goto L_0x10e7;
                case 114251: goto L_0x10d2;
                default: goto L_0x10a0;
            }     // Catch:{ Exception -> 0x11ce }
        L_0x10a0:
            org.json.JSONObject r2 = r7.A03     // Catch:{ Exception -> 0x11ce }
            if (r2 == 0) goto L_0x10aa
            java.lang.String r1 = "tree"
            org.json.JSONObject r6 = r2.optJSONObject(r1)     // Catch:{ Exception -> 0x11ce }
        L_0x10aa:
            java.lang.Double r9 = X.C71016OYr.A01(r7, r5, r8, r6)     // Catch:{ Exception -> 0x11ce }
        L_0x10ae:
            java.lang.System.nanoTime()     // Catch:{ Exception -> 0x11ce }
            int r1 = r5.size()     // Catch:{ Exception -> 0x11ce }
            char[] r6 = new char[r1]     // Catch:{ Exception -> 0x11ce }
            java.util.Iterator r4 = r5.iterator()     // Catch:{ Exception -> 0x11ce }
            r3 = 0
        L_0x10bc:
            boolean r1 = r4.hasNext()     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x1193
            java.lang.Object r1 = r4.next()     // Catch:{ Exception -> 0x11ce }
            java.lang.Character r1 = (java.lang.Character) r1     // Catch:{ Exception -> 0x11ce }
            char r2 = r1.charValue()     // Catch:{ Exception -> 0x11ce }
            int r1 = r3 + 1
            r6[r3] = r2     // Catch:{ Exception -> 0x11ce }
            r3 = r1
            goto L_0x10bc
        L_0x10d2:
            java.lang.String r1 = "sum"
            boolean r1 = r3.equals(r1)     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x10a0
            org.json.JSONObject r1 = r7.A03     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x10e2
            org.json.JSONArray r6 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x11ce }
        L_0x10e2:
            java.lang.Double r9 = X.C71016OYr.A00(r7, r5, r8, r6)     // Catch:{ Exception -> 0x11ce }
            goto L_0x10ae
        L_0x10e7:
            java.lang.String r1 = "sub"
            boolean r1 = r3.equals(r1)     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x10a0
            org.json.JSONObject r1 = r7.A03     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x10f7
            org.json.JSONArray r6 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x11ce }
        L_0x10f7:
            r9 = 0
            if (r6 == 0) goto L_0x10ae
            int r2 = r6.length()     // Catch:{ Exception -> 0x11ce }
            r1 = 2
            if (r2 != r1) goto L_0x10ae
            org.json.JSONObject r1 = r6.optJSONObject(r13)     // Catch:{ Exception -> 0x11ce }
            java.lang.Double r2 = X.C71016OYr.A01(r7, r5, r8, r1)     // Catch:{ Exception -> 0x11ce }
            r1 = 1
            org.json.JSONObject r1 = r6.optJSONObject(r1)     // Catch:{ Exception -> 0x11ce }
            java.lang.Double r1 = X.C71016OYr.A01(r7, r5, r8, r1)     // Catch:{ Exception -> 0x11ce }
            if (r2 == 0) goto L_0x10ae
            if (r1 == 0) goto L_0x10ae
            double r3 = r2.doubleValue()     // Catch:{ Exception -> 0x11ce }
            double r1 = r1.doubleValue()     // Catch:{ Exception -> 0x11ce }
            double r3 = r3 - r1
            java.lang.Double r9 = java.lang.Double.valueOf(r3)     // Catch:{ Exception -> 0x11ce }
            goto L_0x10ae
        L_0x1124:
            java.lang.String r1 = "mul"
            boolean r1 = r3.equals(r1)     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x10a0
            org.json.JSONObject r1 = r7.A03     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x1134
            org.json.JSONArray r6 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x11ce }
        L_0x1134:
            r9 = 0
            if (r6 == 0) goto L_0x10ae
            int r1 = r6.length()     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x10ae
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4 = 0
            int r1 = r6.length()     // Catch:{ Exception -> 0x11ce }
            int r3 = r1 + -1
            if (r3 < 0) goto L_0x115c
        L_0x1148:
            org.json.JSONObject r1 = r6.optJSONObject(r4)     // Catch:{ Exception -> 0x11ce }
            java.lang.Double r1 = X.C71016OYr.A01(r7, r5, r8, r1)     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x10ae
            double r1 = r1.doubleValue()     // Catch:{ Exception -> 0x11ce }
            double r10 = r10 * r1
            if (r4 == r3) goto L_0x115c
            int r4 = r4 + 1
            goto L_0x1148
        L_0x115c:
            java.lang.Double r9 = java.lang.Double.valueOf(r10)     // Catch:{ Exception -> 0x11ce }
            goto L_0x10ae
        L_0x1162:
            java.lang.String r1 = "avg"
            boolean r1 = r3.equals(r1)     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x10a0
            org.json.JSONObject r1 = r7.A03     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x1172
            org.json.JSONArray r6 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x11ce }
        L_0x1172:
            java.lang.Double r2 = X.C71016OYr.A00(r7, r5, r8, r6)     // Catch:{ Exception -> 0x11ce }
            if (r2 == 0) goto L_0x1190
            if (r6 == 0) goto L_0x1190
            int r1 = r6.length()     // Catch:{ Exception -> 0x11ce }
            if (r1 == 0) goto L_0x1190
            double r3 = r2.doubleValue()     // Catch:{ Exception -> 0x11ce }
            int r1 = r6.length()     // Catch:{ Exception -> 0x11ce }
            double r1 = (double) r1     // Catch:{ Exception -> 0x11ce }
            double r3 = r3 / r1
            java.lang.Double r9 = java.lang.Double.valueOf(r3)     // Catch:{ Exception -> 0x11ce }
            goto L_0x10ae
        L_0x1190:
            r9 = 0
            goto L_0x10ae
        L_0x1193:
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x11ce }
            r1.<init>(r6)     // Catch:{ Exception -> 0x11ce }
        L_0x1198:
            if (r9 == 0) goto L_0x11ac
            double r4 = r9.doubleValue()     // Catch:{ Exception -> 0x11ce }
            X.3uA[] r1 = com.instagram.igsignals.core.IgSignalsModelPrediction.A07     // Catch:{ Exception -> 0x11ce }
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x11ce }
            r2 = 0
            r6 = 1
            com.instagram.igsignals.core.IgSignalsModelPrediction r1 = new com.instagram.igsignals.core.IgSignalsModelPrediction     // Catch:{ Exception -> 0x11ce }
            r1.<init>(r2, r3, r4, r6)     // Catch:{ Exception -> 0x11ce }
            goto L_0x11ee
        L_0x11ac:
            java.lang.String r9 = "Predictor failed"
            X.3uA[] r1 = com.instagram.igsignals.core.IgSignalsModelPrediction.A07     // Catch:{ Exception -> 0x11ce }
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x11ce }
            com.instagram.igsignals.core.IgSignalsModelPrediction r1 = new com.instagram.igsignals.core.IgSignalsModelPrediction     // Catch:{ Exception -> 0x11ce }
            r8 = r1
            r8.<init>(r9, r10, r11, r13)     // Catch:{ Exception -> 0x11ce }
            goto L_0x11ee
        L_0x11bd:
            java.lang.String r9 = "Failed to resolve tree predictor"
            X.3uA[] r1 = com.instagram.igsignals.core.IgSignalsModelPrediction.A07     // Catch:{ Exception -> 0x11ce }
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x11ce }
            com.instagram.igsignals.core.IgSignalsModelPrediction r1 = new com.instagram.igsignals.core.IgSignalsModelPrediction     // Catch:{ Exception -> 0x11ce }
            r8 = r1
            r8.<init>(r9, r10, r11, r13)     // Catch:{ Exception -> 0x11ce }
            goto L_0x11ee
        L_0x11ce:
            r3 = move-exception
            X.3uA[] r1 = com.instagram.igsignals.core.IgSignalsModelPrediction.A07
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Prediction failed with exception: "
            r2.append(r1)
            java.lang.Throwable r1 = r3.getCause()
            java.lang.String r9 = X.AnonymousClass7TF.A0i(r1, r2)
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            com.instagram.igsignals.core.IgSignalsModelPrediction r1 = new com.instagram.igsignals.core.IgSignalsModelPrediction
            r8 = r1
            r8.<init>(r9, r10, r11, r13)
        L_0x11ee:
            java.lang.Object r0 = r0.A02
            X.C51965G9l.A1W(r0, r1)
            goto L_0x0017
        L_0x11f5:
            X.0eS.A00(r2)
            java.lang.Object r1 = r0.A03
            X.LN2 r1 = (X.LN2) r1
            X.LN2.A00(r1)
            X.OYd r6 = r1.A00
            java.lang.Object r5 = r0.A02
            X.ObS r5 = (X.C71087ObS) r5
            if (r6 == 0) goto L_0x1220
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r6.A00
            long r3 = r3 - r0
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            if (r0 != 0) goto L_0x1220
            java.util.HashMap r0 = r6.A01
        L_0x121b:
            r5.A05(r0)
            goto L_0x0017
        L_0x1220:
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            goto L_0x121b
        L_0x1225:
            java.lang.Object r3 = A01(r2, r0)
            X.MQ0 r3 = (X.MQ0) r3
            r7 = 1
            boolean r2 = X.C59678JTj.A01(r7, r3)
            r1 = 1
            r15 = 0
            if (r2 == 0) goto L_0x1287
            X.JTj r3 = (X.C59678JTj) r3
            java.lang.Object r4 = r3.A01
            X.PwW r4 = (X.C74537PwW) r4
            X.N8s r4 = (X.C68281N8s) r4
            X.JtN r2 = r4.A01
            if (r2 == 0) goto L_0x124a
            java.lang.String r2 = r2.A00
            if (r2 == 0) goto L_0x124a
            int r2 = r2.length()
            if (r2 != 0) goto L_0x127e
        L_0x124a:
            com.instagram.leadgen.core.api.LeadForm r3 = r4.A00
            if (r3 == 0) goto L_0x127e
            java.lang.Object r14 = r0.A03
            X.U8w r14 = (X.C14786U8w) r14
            r14.A07()
            java.lang.Object r0 = r0.A02
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r2 = X.AnonymousClass7TF.A0A(r0)
            com.instagram.leadgen.core.api.LeadForm r0 = r3.FEQ()
            r14.A0C(r2, r0)
            r14.A04()
        L_0x1267:
            com.instagram.leadgen.core.api.LeadForm r0 = r4.A00
            if (r0 == 0) goto L_0x126f
            java.lang.String r15 = r0.B7N()
        L_0x126f:
            X.05G r0 = r14.A06
            X.JTR.A1V(r0)
            X.6oS r2 = X.C318116oQ.A00(r14)
            r16 = 0
            r17 = 11
            goto L_0x1365
        L_0x127e:
            r1 = 0
            java.lang.Object r14 = r0.A03
            X.U8w r14 = (X.C14786U8w) r14
            r14.A06()
            goto L_0x1267
        L_0x1287:
            r1 = 0
            boolean r2 = X.C59678JTj.A01(r1, r3)
            if (r2 == 0) goto L_0x1296
            java.lang.Object r14 = r0.A03
            X.U8w r14 = (X.C14786U8w) r14
            r14.A06()
            goto L_0x126f
        L_0x1296:
            boolean r1 = r3 instanceof X.C59702JUj
            if (r1 == 0) goto L_0x16f7
            java.lang.Object r0 = r0.A03
            X.U8w r0 = (X.C14786U8w) r0
            X.05G r1 = r0.A06
            goto L_0x1378
        L_0x12a2:
            java.lang.Object r3 = A01(r2, r0)
            X.MQ0 r3 = (X.MQ0) r3
            r7 = 1
            boolean r2 = X.C59678JTj.A01(r7, r3)
            r1 = 1
            r15 = 0
            if (r2 == 0) goto L_0x132a
            X.JTj r3 = (X.C59678JTj) r3
            java.lang.Object r3 = r3.A01
            X.PwW r3 = (X.C74537PwW) r3
            X.N8s r3 = (X.C68281N8s) r3
            X.JtN r2 = r3.A01
            if (r2 == 0) goto L_0x12c7
            java.lang.String r2 = r2.A00
            if (r2 == 0) goto L_0x12c7
            int r2 = r2.length()
            if (r2 != 0) goto L_0x131b
        L_0x12c7:
            com.instagram.leadgen.core.api.LeadForm r6 = r3.A00
            if (r6 == 0) goto L_0x131b
            java.lang.Object r14 = r0.A03
            X.U8y r14 = (X.C14787U8y) r14
            X.WYZ r5 = r14.A04
            java.lang.Long r4 = r14.A07
            java.lang.String r2 = r14.A08
            r5.A07(r4, r2, r7)
            java.lang.Object r0 = r0.A02
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r0)
            com.instagram.leadgen.core.api.LeadForm r2 = r6.FEQ()
            com.instagram.leadgen.organic.model.LeadGenFormData r6 = r14.A06
            java.util.ArrayList r0 = X.W3L.A04(r0, r6)
            java.lang.String r10 = r2.A02
            java.lang.String r11 = r2.A03
            java.lang.Boolean r9 = r2.A01
            java.lang.String r12 = r2.A04
            java.util.ArrayList r13 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x12fa:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x133f
            java.lang.Object r7 = r8.next()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r7 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r7
            X.Uxp r2 = r7.A03
            X.Uxp r0 = X.C16595Uxp.A06
            r5 = 0
            if (r2 != r0) goto L_0x130e
            r5 = 1
        L_0x130e:
            java.lang.String r4 = r7.A0A
            java.util.List r2 = r7.A0D
            com.instagram.leadgen.core.api.LeadGenInfoFieldData r0 = new com.instagram.leadgen.core.api.LeadGenInfoFieldData
            r0.<init>(r4, r2, r5)
            r13.add(r0)
            goto L_0x12fa
        L_0x131b:
            r1 = 0
            java.lang.Object r14 = r0.A03
            X.U8y r14 = (X.C14787U8y) r14
            X.WYZ r4 = r14.A04
            java.lang.Long r2 = r14.A07
            java.lang.String r0 = r14.A08
            r4.A07(r2, r0, r1)
            goto L_0x1350
        L_0x132a:
            r1 = 0
            boolean r2 = X.C59678JTj.A01(r1, r3)
            if (r2 == 0) goto L_0x136e
            java.lang.Object r14 = r0.A03
            X.U8y r14 = (X.C14787U8y) r14
            X.WYZ r3 = r14.A04
            java.lang.Long r2 = r14.A07
            java.lang.String r0 = r14.A08
            r3.A07(r2, r0, r1)
            goto L_0x1358
        L_0x133f:
            com.instagram.common.typedurl.ImageUrl r8 = r6.A00
            com.instagram.leadgen.core.api.LeadForm r0 = X.VEO.A00(r8, r9, r10, r11, r12, r13)
            com.instagram.leadgen.core.model.LeadGenBaseFormList r2 = r14.A03
            com.instagram.leadgen.core.api.LeadForm r0 = r0.FEQ()
            r2.A01 = r0
            r14.A02()
        L_0x1350:
            com.instagram.leadgen.core.api.LeadForm r0 = r3.A00
            if (r0 == 0) goto L_0x1358
            java.lang.String r15 = r0.B7N()
        L_0x1358:
            X.05G r0 = r14.A0B
            X.JTR.A1V(r0)
            X.6oS r2 = X.C318116oQ.A00(r14)
            r16 = 0
            r17 = 12
        L_0x1365:
            X.MEW r13 = new X.MEW
            r18 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x1622
        L_0x136e:
            boolean r1 = r3 instanceof X.C59702JUj
            if (r1 == 0) goto L_0x16fc
            java.lang.Object r0 = r0.A03
            X.U8y r0 = (X.C14787U8y) r0
            X.05G r1 = r0.A0B
        L_0x1378:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
        L_0x137c:
            r1.Epw(r0)
            goto L_0x0017
        L_0x1381:
            java.lang.Object r6 = A01(r2, r0)
            X.4Cq r6 = (X.C262224Cq) r6
            java.lang.Object r5 = r0.A02
            X.JjW r5 = (X.C60327JjW) r5
            X.0Ud r2 = r5.A0L
            java.lang.Object r4 = r0.A03
            r3 = 0
            r1 = 5
            X.MGW r0 = new X.MGW
            r0.<init>(r4, r3, r1)
            X.C51968G9o.A1P(r0, r6, r2)
            X.0r6 r2 = r5.A0E
            r1 = 6
            X.MGW r0 = new X.MGW
            r0.<init>(r4, r3, r1)
            X.C51968G9o.A1P(r0, r6, r2)
            X.0Ud r2 = r5.A0N
            r1 = 7
            X.MGW r0 = new X.MGW
            r0.<init>(r4, r3, r1)
            X.C51968G9o.A1P(r0, r6, r2)
            X.0Ud r5 = r5.A0M
            r0 = 8
            X.MGW r7 = new X.MGW
            r7.<init>(r4, r3, r0)
            goto L_0x1415
        L_0x13b9:
            java.lang.Object r6 = A01(r2, r0)
            X.4Cq r6 = (X.C262224Cq) r6
            java.lang.Object r1 = r0.A02
            X.JjV r1 = (X.C60326JjV) r1
            X.0pa r5 = r1.A07
            java.lang.Object r2 = r0.A03
            r1 = 0
            r0 = 9
            X.MGW r7 = new X.MGW
            r7.<init>(r2, r1, r0)
            goto L_0x1415
        L_0x13d0:
            java.lang.Object r6 = A01(r2, r0)
            X.4Cq r6 = (X.C262224Cq) r6
            java.lang.Object r5 = r0.A02
            X.JjW r5 = (X.C60327JjW) r5
            X.0Ud r4 = r5.A0K
            java.lang.Object r3 = r0.A03
            r2 = 0
            r1 = 41
            X.MFy r0 = new X.MFy
            r0.<init>(r3, r2, r1)
            X.C51968G9o.A1P(r0, r6, r4)
            X.0Ud r5 = r5.A0M
            r0 = 12
            X.MGW r7 = new X.MGW
            r7.<init>(r3, r2, r0)
            goto L_0x1415
        L_0x13f3:
            java.lang.Object r6 = A01(r2, r0)
            X.4Cq r6 = (X.C262224Cq) r6
            java.lang.Object r5 = r0.A02
            X.JjV r5 = (X.C60326JjV) r5
            X.0pa r4 = r5.A06
            java.lang.Object r3 = r0.A03
            r2 = 0
            r1 = 13
            X.MGW r0 = new X.MGW
            r0.<init>(r3, r2, r1)
            X.C51968G9o.A1P(r0, r6, r4)
            X.0pa r5 = r5.A07
            r0 = 14
            X.MGW r7 = new X.MGW
            r7.<init>(r3, r2, r0)
        L_0x1415:
            X.C51968G9o.A1P(r7, r6, r5)
            goto L_0x0017
        L_0x141a:
            X.0eS.A00(r2)
            java.lang.Object r3 = r0.A02
            X.EaP r3 = (X.C48183EaP) r3
            boolean r1 = r3 instanceof X.EN6
            if (r1 == 0) goto L_0x143a
            java.lang.Object r2 = r0.A03
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.Context r1 = r2.requireContext()
            X.EN6 r3 = (X.EN6) r3
            int r0 = r3.A00
            java.lang.String r0 = X.DbU.A0m(r2, r0)
            X.C59689JTv.A09(r1, r0)
            goto L_0x0017
        L_0x143a:
            boolean r1 = r3 instanceof X.EN5
            if (r1 == 0) goto L_0x1701
            java.lang.Object r2 = r0.A00
            android.view.View r2 = (android.view.View) r2
            r1 = 2131428901(0x7f0b0625, float:1.847946E38)
            X.DbX.A1B(r2, r1)
            java.lang.Object r2 = r0.A03
            X.E2Y r2 = (X.E2Y) r2
            X.0eM r0 = r2.A05
            android.os.Handler r1 = X.JTO.A0E(r0)
            X.M4a r0 = new X.M4a
            r0.<init>(r2)
            r1.post(r0)
            goto L_0x0017
        L_0x145c:
            java.lang.Object r2 = A01(r2, r0)
            X.KUm r1 = X.C61989KUm.A00
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x1489
            java.lang.Object r3 = r0.A03
            X.K52 r3 = (X.K52) r3
            android.content.Context r1 = r3.A00
            if (r1 != 0) goto L_0x1474
            java.lang.String r8 = "context"
            goto L_0x1509
        L_0x1474:
            r2 = 0
            java.lang.String r0 = "MusicOnProfileNetworkError"
            X.C59689JTv.A0B(r1, r0)
            X.2dY r1 = X.2dZ.A0t
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.2dZ r0 = r1.A03(r0)
            r0.setIsLoading(r2)
            goto L_0x0017
        L_0x1489:
            X.KUn r1 = X.C61990KUn.A00
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x1706
            java.lang.Object r3 = r0.A03
            X.K52 r3 = (X.K52) r3
            boolean r1 = r3.A05
            if (r1 == 0) goto L_0x14a8
            com.instagram.music.common.model.AudioOverlayTrack r1 = r3.A01
            r2 = 1359(0x54f, float:1.904E-42)
            if (r1 == 0) goto L_0x14a1
            r2 = 1357(0x54d, float:1.902E-42)
        L_0x14a1:
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            r1.setResult(r2)
        L_0x14a8:
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            X.PWi r0 = new X.PWi
            r0.<init>(r3)
        L_0x14b1:
            r1.post(r0)
            goto L_0x0017
        L_0x14b6:
            java.lang.Object r3 = A01(r2, r0)
            java.lang.Object r2 = r0.A03
            X.JjZ r2 = (X.C60330JjZ) r2
            com.google.common.collect.ImmutableList r1 = X.C60330JjZ.A0E
            X.05G r1 = r2.A0B
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r0 = r0.A02
            X.JjX r0 = (X.C60328JjX) r0
            X.Khg r0 = r0.A01()
            if (r1 != r0) goto L_0x0017
            X.05G r0 = r2.A0A
            goto L_0x14ef
        L_0x14d3:
            java.lang.Object r3 = A01(r2, r0)
            java.lang.Object r2 = r0.A03
            X.JjZ r2 = (X.C60330JjZ) r2
            com.google.common.collect.ImmutableList r1 = X.C60330JjZ.A0E
            X.05G r1 = r2.A0B
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r0 = r0.A02
            X.JjX r0 = (X.C60328JjX) r0
            X.Khg r0 = r0.A01()
            if (r1 != r0) goto L_0x0017
            X.05G r0 = r2.A09
        L_0x14ef:
            r0.Epw(r3)
            goto L_0x0017
        L_0x14f4:
            java.lang.Object r2 = A01(r2, r0)
            X.4Cq r2 = (X.C262224Cq) r2
            java.lang.Object r6 = r0.A03
            X.Luk r6 = (X.C65521Luk) r6
            X.0r6 r5 = r6.A08
            if (r5 == 0) goto L_0x0017
            X.Jfs r4 = r6.A06
            r7 = 0
            if (r4 != 0) goto L_0x1511
            java.lang.String r8 = "viewModel"
        L_0x1509:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x1511:
            boolean r1 = r4 instanceof com.instagram.nido.impl.explore.NidoExploreViewModel
            if (r1 == 0) goto L_0x0017
            com.instagram.nido.impl.explore.NidoExploreViewModel r4 = (com.instagram.nido.impl.explore.NidoExploreViewModel) r4
            if (r4 == 0) goto L_0x0017
            X.0eM r1 = r4.A05
            java.lang.Object r10 = r1.getValue()
            r8 = 36
            X.MGh r3 = new X.MGh
            r3.<init>(r4, r5, r6, r7, r8)
            X.19B r1 = X.19B.A00
            X.1Eo.A05(r1, r3, r2)
            java.lang.Object r9 = r0.A02
            r13 = 37
            X.MGh r8 = new X.MGh
            r11 = r6
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            X.1Eo.A05(r1, r8, r2)
            goto L_0x0017
        L_0x153b:
            X.0eS.A00(r2)
            java.lang.Object r3 = r0.A03
            X.4gU r3 = (X.C270284gU) r3
            X.62O r1 = X.I7S.A00
            java.lang.Object r1 = r3.getValue()
            X.Dry r1 = (X.C47183Dry) r1
            com.instagram.opal.impl.data.OpalProfileData r1 = r1.A05
            X.KhB r2 = r1.A01
            X.KhB r1 = X.C62520KhB.Saving
            if (r2 != r1) goto L_0x155a
            java.lang.Object r2 = r0.A02
            X.5Qa r2 = (X.C285165Qa) r2
            r1 = 1
            r2.AHc(r1)
        L_0x155a:
            java.lang.Object r1 = r3.getValue()
            X.Dry r1 = (X.C47183Dry) r1
            com.instagram.opal.impl.data.OpalProfileData r1 = r1.A05
            X.KhB r2 = r1.A01
            X.KhB r1 = X.C62520KhB.Loaded
            if (r2 != r1) goto L_0x0017
            java.lang.Object r0 = r0.A00
            X.DbS.A1U(r0)
            goto L_0x0017
        L_0x156f:
            X.0eS.A00(r2)
            java.lang.Object r4 = r0.A03
            X.E35 r4 = (X.E35) r4
            X.0eM r1 = r4.A0B
            r1.getValue()
            java.lang.Object r3 = r0.A02
            r2 = 0
            r1 = 46
            X.MfO r0 = new X.MfO
            r0.<init>(r4, r3, r2, r1)
            goto L_0x0017
        L_0x1587:
            java.lang.Object r1 = A01(r2, r0)
            if (r1 == 0) goto L_0x0017
            java.lang.Object r1 = r0.A03
            X.E35 r1 = (X.E35) r1
            X.E35.A01(r1)
            java.lang.Object r0 = r0.A02
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.2Rw r0 = r0.A0A
            if (r0 == 0) goto L_0x0017
            r0.notifyDataSetChanged()
            goto L_0x0017
        L_0x15a1:
            java.lang.Object r6 = A01(r2, r0)
            X.4Cq r6 = (X.C262224Cq) r6
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r0.A03
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r4 = r1.iterator()
        L_0x15b5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            r2 = 0
            r0 = 21
            X.MFV r1 = new X.MFV
            r1.<init>(r5, r3, r2, r0)
            X.19B r0 = X.19B.A00
            X.2Q8 r0 = X.1Eo.A02(r0, r1, r6)
            r7.add(r0)
            goto L_0x15b5
        L_0x15d3:
            java.lang.Object r6 = A01(r2, r0)
            X.4Cq r6 = (X.C262224Cq) r6
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r0.A03
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x15e7:
            boolean r0 = r3.hasNext()
            r7 = 0
            if (r0 == 0) goto L_0x1603
            java.lang.Object r2 = r3.next()
            r0 = 33
            X.MGd r1 = new X.MGd
            r1.<init>(r5, r2, r7, r0)
            X.19B r0 = X.19B.A00
            X.2Q8 r0 = X.1Eo.A02(r0, r1, r6)
            r4.add(r0)
            goto L_0x15e7
        L_0x1603:
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x0019
            return r4
        L_0x160a:
            X.0eS.A00(r2)
            java.lang.Object r5 = r0.A03
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            X.0xx r2 = X.DbV.A0J(r5)
            r7 = 0
            java.lang.Object r4 = r0.A02
            java.lang.Object r6 = r0.A00
            r8 = 37
            X.MH5 r13 = new X.MH5
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x1622:
            X.AnonymousClass7TE.A1Z(r13, r2)
            goto L_0x0017
        L_0x1627:
            java.lang.Object r3 = A01(r2, r0)
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Object r7 = r0.A03
            X.KWZ r7 = (X.KWZ) r7
            java.lang.Object r8 = r0.A02
            com.instagram.model.direct.DirectThreadKey r8 = (com.instagram.model.direct.DirectThreadKey) r8
            java.lang.Class<X.Bi6> r2 = X.C42770Bi6.class
            java.lang.String r1 = "xig_igd_fetch_scheduled_messages(input:$input)"
            r0 = -2088254372(0xffffffff8387c45c, float:-7.979669E-37)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x16bb
            java.lang.Class<X.Bi5> r2 = X.C42769Bi5.class
            r4 = 1
            java.lang.String r1 = "response"
            r0 = 1207038851(0x47f1f383, float:123879.02)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x16bb
            java.lang.Class<X.Bi4> r2 = X.C42768Bi4.class
            java.lang.String r1 = "scheduled_messages"
            r0 = 35124214(0x217f3f6, float:1.1163741E-37)
            com.google.common.collect.ImmutableList r0 = r3.getRequiredCompactedTreeListField(r4, r1, r2, r0)
            if (r0 == 0) goto L_0x16bb
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x1665:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x168d
            java.lang.Object r4 = r5.next()
            X.3lr r4 = (X.C250663lr) r4
            X.0c5 r3 = X.0c9.A04
            com.instagram.common.session.UserSession r2 = r7.A01
            r1 = 0
            java.lang.String r0 = "full_item_dict"
            java.lang.String r0 = r4.getRequiredStringField(r1, r0)
            X.0qQ.A07(r0)
            X.0c9 r0 = r3.A01(r2, r0)
            X.3su r0 = X.C254703su.A00(r0, r8, r1)
            if (r0 == 0) goto L_0x1665
            r6.add(r0)
            goto L_0x1665
        L_0x168d:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r6.iterator()
        L_0x1695:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x16b4
            java.lang.Object r5 = r6.next()
            r0 = r5
            X.3su r0 = (X.C254703su) r0
            java.lang.Long r0 = r0.A1Q
            if (r0 == 0) goto L_0x1695
            r3 = 0
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x1695
            r7.add(r5)
            goto L_0x1695
        L_0x16b4:
            r0 = 17
            java.util.List r7 = X.C73429PcU.A00(r7, r0)
            return r7
        L_0x16bb:
            r7 = 0
            return r7
        L_0x16bd:
            X.0eS.A00(r2)
            java.lang.Object r5 = r0.A02
            X.4Cq r5 = (X.C262224Cq) r5
            r4 = 0
            java.lang.Object r3 = r0.A00
            java.lang.Object r2 = r0.A03
            r1 = 5
            X.Pfo r0 = new X.Pfo
            r0.<init>(r3, r2, r4, r1)
            X.1Er r4 = X.C51966G9m.A1L(r0, r5)
            return r4
        L_0x16d4:
            java.lang.String r0 = "Invalid pill type id "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r1)
            throw r0
        L_0x16db:
            X.0qQ.A0F(r10)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x16e3:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x16eb:
            java.lang.String r0 = "Invalid pill type id "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r4)
            throw r0
        L_0x16f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x16f7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x16fc:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x1701:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x1706:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66929MfO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A01(Object obj, C66929MfO mfO) {
        0eS.A00(obj);
        return mfO.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66929MfO) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66929MfO(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A01 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }
}
