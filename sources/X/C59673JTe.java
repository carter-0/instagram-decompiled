package X;

import java.util.List;

/* renamed from: X.JTe  reason: case insensitive filesystem */
public final class C59673JTe extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59673JTe(Object obj, AnonymousClass4D7 r3, int i, boolean z) {
        super(2, r3);
        this.A04 = i;
        this.A02 = obj;
        this.A03 = z;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.JTe, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.JTe, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.JTe, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.JTe, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.JTe, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015e, code lost:
        r3 = new X.C59673JTe(r2, r1, r11, r0);
        r3.A02 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0165, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016c, code lost:
        r3 = new X.C59673JTe(r2, r11, r0, r1);
        r3.A01 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0173, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        return new X.C59673JTe(r4, r5, r6, r7, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            int r0 = r9.A04
            r6 = r11
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x001c;
                case 2: goto L_0x0024;
                case 3: goto L_0x002c;
                case 4: goto L_0x0034;
                case 5: goto L_0x003c;
                case 6: goto L_0x0044;
                case 7: goto L_0x004c;
                case 8: goto L_0x0054;
                case 9: goto L_0x005d;
                case 10: goto L_0x0066;
                case 11: goto L_0x013e;
                case 12: goto L_0x006f;
                case 13: goto L_0x0145;
                case 14: goto L_0x0078;
                case 15: goto L_0x0081;
                case 16: goto L_0x0151;
                case 17: goto L_0x008a;
                case 18: goto L_0x0094;
                case 19: goto L_0x009e;
                case 20: goto L_0x00a8;
                case 21: goto L_0x00b2;
                case 22: goto L_0x00bc;
                case 23: goto L_0x00c6;
                case 24: goto L_0x00d0;
                case 25: goto L_0x00da;
                case 26: goto L_0x0158;
                case 27: goto L_0x00e4;
                case 28: goto L_0x00ee;
                case 29: goto L_0x00f8;
                case 30: goto L_0x0102;
                case 31: goto L_0x010c;
                case 32: goto L_0x0116;
                case 33: goto L_0x0166;
                case 34: goto L_0x0174;
                case 35: goto L_0x0120;
                case 36: goto L_0x012a;
                case 37: goto L_0x0134;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            boolean r8 = r9.A03
            r7 = 38
        L_0x000e:
            X.JTe r3 = new X.JTe
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x0014:
            boolean r8 = r9.A03
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A02
            r7 = 0
            goto L_0x000e
        L_0x001c:
            java.lang.Object r4 = r9.A01
            boolean r8 = r9.A03
            java.lang.Object r5 = r9.A02
            r7 = 1
            goto L_0x000e
        L_0x0024:
            java.lang.Object r4 = r9.A01
            boolean r8 = r9.A03
            java.lang.Object r5 = r9.A02
            r7 = 2
            goto L_0x000e
        L_0x002c:
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            boolean r8 = r9.A03
            r7 = 3
            goto L_0x000e
        L_0x0034:
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            java.lang.Object r4 = r9.A01
            r7 = 4
            goto L_0x000e
        L_0x003c:
            boolean r8 = r9.A03
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            r7 = 5
            goto L_0x000e
        L_0x0044:
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            java.lang.Object r4 = r9.A01
            r7 = 6
            goto L_0x000e
        L_0x004c:
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            java.lang.Object r4 = r9.A01
            r7 = 7
            goto L_0x000e
        L_0x0054:
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            java.lang.Object r4 = r9.A01
            r7 = 8
            goto L_0x000e
        L_0x005d:
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            boolean r8 = r9.A03
            r7 = 9
            goto L_0x000e
        L_0x0066:
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            boolean r8 = r9.A03
            r7 = 10
            goto L_0x000e
        L_0x006f:
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            boolean r8 = r9.A03
            r7 = 12
            goto L_0x000e
        L_0x0078:
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            java.lang.Object r4 = r9.A01
            r7 = 14
            goto L_0x000e
        L_0x0081:
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            boolean r8 = r9.A03
            r7 = 15
            goto L_0x000e
        L_0x008a:
            boolean r8 = r9.A03
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            r7 = 17
            goto L_0x000e
        L_0x0094:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            r7 = 18
            goto L_0x000e
        L_0x009e:
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            boolean r8 = r9.A03
            r7 = 19
            goto L_0x000e
        L_0x00a8:
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            boolean r8 = r9.A03
            r7 = 20
            goto L_0x000e
        L_0x00b2:
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            java.lang.Object r4 = r9.A01
            r7 = 21
            goto L_0x000e
        L_0x00bc:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            r7 = 22
            goto L_0x000e
        L_0x00c6:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            r7 = 23
            goto L_0x000e
        L_0x00d0:
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            java.lang.Object r4 = r9.A01
            r7 = 24
            goto L_0x000e
        L_0x00da:
            boolean r8 = r9.A03
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            r7 = 25
            goto L_0x000e
        L_0x00e4:
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            boolean r8 = r9.A03
            r7 = 27
            goto L_0x000e
        L_0x00ee:
            boolean r8 = r9.A03
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            r7 = 28
            goto L_0x000e
        L_0x00f8:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            r7 = 29
            goto L_0x000e
        L_0x0102:
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            boolean r8 = r9.A03
            r7 = 30
            goto L_0x000e
        L_0x010c:
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            java.lang.Object r4 = r9.A01
            r7 = 31
            goto L_0x000e
        L_0x0116:
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            boolean r8 = r9.A03
            r7 = 32
            goto L_0x000e
        L_0x0120:
            boolean r8 = r9.A03
            java.lang.Object r5 = r9.A02
            java.lang.Object r4 = r9.A01
            r7 = 35
            goto L_0x000e
        L_0x012a:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            r7 = 36
            goto L_0x000e
        L_0x0134:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A02
            boolean r8 = r9.A03
            r7 = 37
            goto L_0x000e
        L_0x013e:
            java.lang.Object r2 = r9.A02
            boolean r1 = r9.A03
            r0 = 11
            goto L_0x016c
        L_0x0145:
            java.lang.Object r2 = r9.A02
            boolean r1 = r9.A03
            r0 = 13
            X.JTe r3 = new X.JTe
            r3.<init>((java.lang.Object) r2, (X.AnonymousClass4D7) r11, (int) r0, (boolean) r1)
            return r3
        L_0x0151:
            boolean r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 16
            goto L_0x015e
        L_0x0158:
            boolean r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 26
        L_0x015e:
            X.JTe r3 = new X.JTe
            r3.<init>((boolean) r2, (java.lang.Object) r1, (X.AnonymousClass4D7) r11, (int) r0)
            r3.A02 = r10
            return r3
        L_0x0166:
            java.lang.Object r2 = r9.A02
            boolean r1 = r9.A03
            r0 = 33
        L_0x016c:
            X.JTe r3 = new X.JTe
            r3.<init>((java.lang.Object) r2, (X.AnonymousClass4D7) r11, (int) r0, (boolean) r1)
            r3.A01 = r10
            return r3
        L_0x0174:
            java.lang.Object r1 = r9.A02
            X.Jiv r1 = (X.C60297Jiv) r1
            java.lang.Object r0 = r9.A01
            java.util.List r0 = (java.util.List) r0
            X.JTe r3 = new X.JTe
            r3.<init>(r1, r0, r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59673JTe.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.JTe, X.4D7] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0ec9, code lost:
        if (r0 == r2) goto L_0x0fff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x0ecb, code lost:
        r0 = X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x0ee7, code lost:
        if (r8.A05 != false) goto L_0x0ee9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0eef, code lost:
        if (r1.A03 != false) goto L_0x0ef1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0f99, code lost:
        if (r3 != r2) goto L_0x0f9f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0f9b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x0f9c, code lost:
        X.0eS.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x0f9f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x0fff, code lost:
        if (r0 != r2) goto L_0x1017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x1001, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0287, code lost:
        if (r0 == false) goto L_0x0289;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02f0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x06a1  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x06ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            int r2 = r1.A04
            switch(r2) {
                case 0: goto L_0x1002;
                case 1: goto L_0x0fce;
                case 2: goto L_0x0fa0;
                case 3: goto L_0x0f64;
                case 4: goto L_0x0ecf;
                case 5: goto L_0x0e82;
                case 6: goto L_0x0e3e;
                case 7: goto L_0x0dfc;
                case 8: goto L_0x0d35;
                case 9: goto L_0x0c88;
                case 10: goto L_0x0c59;
                case 11: goto L_0x0be4;
                case 12: goto L_0x0b98;
                case 13: goto L_0x0af8;
                case 14: goto L_0x0a12;
                case 15: goto L_0x0997;
                case 16: goto L_0x0964;
                case 17: goto L_0x091c;
                case 18: goto L_0x0836;
                case 19: goto L_0x0816;
                case 20: goto L_0x07ad;
                case 21: goto L_0x0765;
                case 22: goto L_0x070c;
                case 23: goto L_0x06b6;
                case 24: goto L_0x065d;
                case 25: goto L_0x058b;
                case 26: goto L_0x0555;
                case 27: goto L_0x0514;
                case 28: goto L_0x04bb;
                case 29: goto L_0x0497;
                case 30: goto L_0x0438;
                case 31: goto L_0x03ea;
                case 32: goto L_0x039d;
                case 33: goto L_0x020f;
                case 34: goto L_0x0154;
                case 35: goto L_0x00ff;
                case 36: goto L_0x00a4;
                case 37: goto L_0x004a;
                default: goto L_0x0009;
            }
        L_0x0009:
            r3 = r0
            X.1Hj r2 = X.1Hj.A02
            int r5 = r1.A00
            r4 = 1
            if (r5 == 0) goto L_0x0018
            if (r5 == r4) goto L_0x0f9c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0018:
            X.0eS.A00(r0)
            java.lang.Object r0 = r1.A02
            X.6cd r0 = (X.C311406cd) r0
            java.lang.Object r6 = r1.A01
            X.3uh r6 = (X.C255773uh) r6
            boolean r9 = r1.A03
            r1.A00 = r4
            X.1IW r3 = X.JTS.A0s(r1)
            android.content.Context r4 = r0.A01
            com.instagram.common.session.UserSession r5 = r0.A02
            r0 = 2479(0x9af, float:3.474E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            r8 = 0
            X.5g0 r1 = X.C59730JVo.A02(r4, r5, r6, r7, r8, r9)
            r0 = 22
            X.KH1.A01(r1, r3, r0)
            r0 = 460(0x1cc, float:6.45E-43)
            X.1ES.A06(r1, r0, r8)
            java.lang.Object r3 = r3.A0E()
            goto L_0x0f99
        L_0x004a:
            X.1Hj r2 = X.1Hj.A02
            int r4 = r1.A00
            r7 = 2
            r6 = 1
            r3 = 0
            if (r4 == 0) goto L_0x005c
            if (r4 == r6) goto L_0x0fdc
            if (r4 == r7) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x005c:
            X.0eS.A00(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.clips.audio.model.AudioPageAssetModel r5 = (com.instagram.clips.audio.model.AudioPageAssetModel) r5
            com.instagram.music.common.model.AudioType r0 = r5.A00
            int r0 = r0.ordinal()
            if (r0 == r3) goto L_0x008a
            if (r0 != r6) goto L_0x0085
            java.lang.Object r0 = r1.A02
            X.Gh0 r0 = (X.C53009Gh0) r0
            X.KWw r4 = r0.A08
            boolean r3 = r1.A03
            java.lang.Integer r6 = X.AnonymousClass05K.A0Y
            java.lang.String r0 = r5.A01
            r5 = 0
            r1.A00 = r7
            r7 = r0
            r8 = r1
            r9 = r3
            java.lang.Object r0 = r4.A02(r5, r6, r7, r8, r9)
            goto L_0x0fff
        L_0x0085:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008a:
            java.lang.Object r0 = r1.A02
            X.Gh0 r0 = (X.C53009Gh0) r0
            X.KWw r4 = r0.A08
            boolean r3 = r1.A03
            java.lang.Integer r8 = X.AnonymousClass05K.A0Y
            java.lang.String r0 = r5.A01
            r7 = 0
            r1.A00 = r6
            r6 = r4
            r9 = r0
            r10 = r7
            r11 = r1
            r12 = r3
            java.lang.Object r0 = r6.A01(r7, r8, r9, r10, r11, r12)
            goto L_0x0fff
        L_0x00a4:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r10 = 2
            r9 = 1
            r8 = 0
            if (r3 == 0) goto L_0x00b6
            if (r3 == r9) goto L_0x0fdc
            if (r3 == r10) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00b6:
            X.0eS.A00(r0)
            java.lang.Object r7 = r1.A02
            X.GDI r7 = (X.GDI) r7
            boolean r6 = r1.A03
            java.lang.Object r5 = r1.A01
            X.46i r5 = (X.C2606046i) r5
            X.IXR r4 = new X.IXR
            r4.<init>(r5, r7, r6)
            com.instagram.music.common.model.AudioType r0 = r5.Adv()
            int r3 = r0.ordinal()
            X.0eM r0 = r7.A08
            java.lang.Object r0 = r0.getValue()
            X.KWw r0 = (X.C62037KWw) r0
            if (r3 == r8) goto L_0x00ec
            java.lang.Integer r11 = X.AnonymousClass05K.A15
            java.lang.String r12 = r5.getAssetId()
            r1.A00 = r10
            r9 = r0
            r10 = r4
            r13 = r1
            r14 = r6
            java.lang.Object r0 = r9.A02(r10, r11, r12, r13, r14)
            goto L_0x0fff
        L_0x00ec:
            java.lang.Integer r10 = X.AnonymousClass05K.A15
            java.lang.String r11 = r5.getAssetId()
            r12 = 0
            r1.A00 = r9
            r8 = r0
            r9 = r4
            r13 = r1
            r14 = r6
            java.lang.Object r0 = r8.A01(r9, r10, r11, r12, r13, r14)
            goto L_0x0fff
        L_0x00ff:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r9 = 2
            r8 = 1
            if (r3 == 0) goto L_0x0110
            if (r3 == r8) goto L_0x0fdc
            if (r3 == r9) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0110:
            X.0eS.A00(r0)
            boolean r3 = r1.A03
            java.lang.Object r0 = r1.A02
            X.GDI r0 = (X.GDI) r0
            X.JU4 r7 = r0.A00
            if (r3 == 0) goto L_0x013c
            r5 = 2131963574(0x7f132eb6, float:1.9563905E38)
            r4 = 2131952148(0x7f130214, float:1.954073E38)
            java.lang.Object r0 = r1.A01
            X.46i r0 = (X.C2606046i) r0
            com.instagram.common.typedurl.ImageUrl r3 = r0.AdY()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.Gqm r6 = new X.Gqm
            r6.<init>(r3, r0, r5, r4)
            r1.A00 = r8
        L_0x0134:
            X.3ju r0 = r7.A00
            java.lang.Object r0 = r0.ELH(r6, r1)
            goto L_0x0fff
        L_0x013c:
            r5 = 2131963575(0x7f132eb7, float:1.9563907E38)
            r4 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.Object r0 = r1.A01
            X.46i r0 = (X.C2606046i) r0
            com.instagram.common.typedurl.ImageUrl r3 = r0.AdY()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.Gqm r6 = new X.Gqm
            r6.<init>(r3, r0, r5, r4)
            r1.A00 = r9
            goto L_0x0134
        L_0x0154:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L_0x0165
            if (r3 == r8) goto L_0x01ce
            if (r3 == r7) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0165:
            X.0eS.A00(r0)
            java.lang.Object r9 = r1.A02
            X.Jiv r9 = (X.C60297Jiv) r9
            com.instagram.common.session.UserSession r6 = r9.A00
            X.0Tu r5 = X.0Tu.A05
            r3 = 36319355851709609(0x81084300031ca9, double:3.031845114704071E-306)
            boolean r3 = X.DbY.A1Y(r5, r6, r3)
            r0 = 0
            if (r3 == 0) goto L_0x0207
            r3 = 36319355851906220(0x81084300061cac, double:3.031845114828408E-306)
            boolean r6 = X.182.A06(r5, r6, r3)
            if (r6 == 0) goto L_0x01d3
            X.83e r11 = r9.A01
            java.lang.Object r3 = r1.A01
            java.util.List r3 = X.JTQ.A0i(r3)
            java.util.Iterator r10 = r3.iterator()
        L_0x0193:
            boolean r4 = r10.hasNext()
            r3 = 0
            if (r4 == 0) goto L_0x01cc
            java.lang.Object r7 = r10.next()
            r4 = r7
            com.instagram.common.gallery.Medium r4 = (com.instagram.common.gallery.Medium) r4
            java.util.HashMap r5 = r11.A04
            java.lang.String r4 = r4.A0X
            boolean r4 = r5.containsKey(r4)
            if (r4 == 0) goto L_0x0193
        L_0x01ab:
            com.instagram.common.gallery.Medium r7 = (com.instagram.common.gallery.Medium) r7
            if (r7 == 0) goto L_0x01bb
            java.lang.String r4 = r7.A0X
            if (r4 == 0) goto L_0x01bb
            java.util.HashMap r3 = r11.A04
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
        L_0x01bb:
            if (r3 == 0) goto L_0x01c1
            java.util.LinkedHashMap r0 = X.C60297Jiv.A01(r3)
        L_0x01c1:
            r1.A03 = r6
            r1.A00 = r8
            java.lang.Object r0 = X.C60297Jiv.A00(r9, r0, r1)
            if (r0 != r2) goto L_0x01d3
            return r2
        L_0x01cc:
            r7 = r3
            goto L_0x01ab
        L_0x01ce:
            boolean r6 = r1.A03
            X.0eS.A00(r0)
        L_0x01d3:
            java.lang.Object r1 = r1.A02
            X.Jiv r1 = (X.C60297Jiv) r1
            r0 = 34
            X.Iwj r5 = new X.Iwj
            r5.<init>(r0, r1, r6)
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor()
            X.M8G r0 = new X.M8G     // Catch:{ Exception -> 0x01f4 }
            r0.<init>(r1, r5)     // Catch:{ Exception -> 0x01f4 }
            java.util.concurrent.Future r3 = r4.submit(r0)     // Catch:{ Exception -> 0x01f4 }
            r1 = 2000(0x7d0, double:9.88E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x01f4 }
            r3.get(r1, r0)     // Catch:{ Exception -> 0x01f4 }
            goto L_0x1017
        L_0x01f4:
            X.0wj r2 = X.0wj.A01
            r1 = 817894189(0x30c0132d, float:1.3975289E-9)
            java.lang.String r0 = "Timeout while extracting scene understanding features"
            r2.EFR(r1, r0)
            r0 = 0
            r5.invoke(r0)
            r4.shutdown()
            goto L_0x1017
        L_0x0207:
            r1.A00 = r7
            java.lang.Object r0 = X.C60297Jiv.A00(r9, r0, r1)
            goto L_0x0fff
        L_0x020f:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r10 = 2
            r4 = 0
            r8 = 1
            if (r3 == 0) goto L_0x028f
            if (r3 == r8) goto L_0x02c8
            if (r3 != r10) goto L_0x0398
            X.0eS.A00(r0)
        L_0x021f:
            X.3Ii r0 = (X.C239803Ii) r0
            java.lang.Object r4 = r1.A02
            X.GgN r4 = (X.C52970GgN) r4
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x02f3
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r6 = r0.A00
            X.LOu r6 = (X.C64123LOu) r6
            X.62P r5 = r6.A01
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0317
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            int r12 = r5.size()
            java.util.Iterator r11 = r5.iterator()
            r10 = 1
            r9 = 0
        L_0x0246:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x02fc
            java.lang.Object r2 = r11.next()
            X.LFw r2 = (X.C63969LFw) r2
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.Boolean r1 = r2.A02
            java.lang.String r0 = "is_similar"
            r7.put(r0, r1)
            X.Kiy r1 = r2.A00
            java.lang.String r0 = "orientation"
            r7.put(r0, r1)
            java.lang.Double r1 = r2.A03
            r0 = 5263(0x148f, float:7.375E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.put(r0, r1)
            X.Kj2 r2 = r2.A01
            r0 = 5367(0x14f7, float:7.521E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.put(r0, r2)
            r3.put(r7)
            X.Kj2 r1 = X.C62631Kj2.VERIFIED
            r0 = 0
            if (r2 != r1) goto L_0x0284
            r0 = 1
        L_0x0284:
            if (r10 == 0) goto L_0x0289
            r10 = 1
            if (r0 != 0) goto L_0x028c
        L_0x0289:
            r10 = 0
            if (r0 == 0) goto L_0x0246
        L_0x028c:
            int r9 = r9 + 1
            goto L_0x0246
        L_0x028f:
            X.0eS.A00(r0)
            java.lang.Object r11 = r1.A01
            X.4Cq r11 = (X.C262224Cq) r11
            java.lang.Object r9 = r1.A02
            X.GgN r9 = (X.C52970GgN) r9
            java.util.List r0 = r9.A0E
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x02a4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02bf
            java.lang.Object r5 = r6.next()
            r0 = 43
            X.MGC r3 = new X.MGC
            r3.<init>((java.lang.Object) r5, (java.lang.Object) r9, (X.AnonymousClass4D7) r4, (int) r0)
            X.19B r0 = X.19B.A00
            X.2Q8 r0 = X.1Eo.A02(r0, r3, r11)
            r7.add(r0)
            goto L_0x02a4
        L_0x02bf:
            r1.A00 = r8
            java.lang.Object r0 = X.AnonymousClass42T.A00(r7, r1)
            if (r0 != r2) goto L_0x02cb
            return r2
        L_0x02c8:
            X.0eS.A00(r0)
        L_0x02cb:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r9 = r1.A02
            X.GgN r9 = (X.C52970GgN) r9
            com.meta.metaai.imagine.memu.impl.data.MEmuDataRepository r7 = r9.A0A
            boolean r6 = r9.A0R
            boolean r3 = r1.A03
            if (r3 == 0) goto L_0x02f1
            java.lang.String r5 = r9.A0C
        L_0x02db:
            if (r3 == 0) goto L_0x02df
            java.lang.String r4 = r9.A0D
        L_0x02df:
            boolean r3 = r9.A0S
            r1.A00 = r10
            r9 = r7
            r10 = r5
            r11 = r4
            r12 = r0
            r13 = r1
            r14 = r6
            r15 = r3
            java.lang.Object r0 = r9.A01(r10, r11, r12, r13, r14, r15)
            if (r0 != r2) goto L_0x021f
            return r2
        L_0x02f1:
            r5 = r4
            goto L_0x02db
        L_0x02f3:
            boolean r1 = r0 instanceof X.C297815sO
            if (r1 != 0) goto L_0x0323
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02fc:
            X.I49 r15 = r4.A09
            if (r10 == 0) goto L_0x038a
            X.HOs r10 = X.C54687HOs.A0D
        L_0x0302:
            java.lang.Integer r17 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r12)
            r11 = 0
            r20 = 0
            r12 = r11
            r13 = r11
            r14 = r11
            r16 = r11
            r19 = r3
            X.I49.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0317:
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x034a
            r0 = 3
            X.C52970GgN.A04(r4, r0)
        L_0x031f:
            X.3Ih r0 = X.C51967G9n.A0d()
        L_0x0323:
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0330
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0393
            r0 = 87
            X.C52970GgN.A04(r4, r0)
        L_0x0330:
            java.util.List r2 = r4.A0E
            java.util.Iterator r1 = r2.iterator()
        L_0x0336:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x038e
            java.lang.Object r0 = r1.next()
            X.Hsr r0 = (X.C56104Hsr) r0
            android.graphics.Bitmap r0 = r0.A00
            if (r0 == 0) goto L_0x0336
            r0.recycle()
            goto L_0x0336
        L_0x034a:
            X.62P r0 = r6.A00
            r4.A02 = r0
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x035e
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0372
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0372
        L_0x035e:
            X.6oS r5 = X.C318116oQ.A00(r4)
            X.4CZ r0 = X.AnonymousClass12W.A00
            X.134 r3 = X.AnonymousClass12y.A00
            r2 = 0
            r1 = 42
            X.MG9 r0 = new X.MG9
            r0.<init>(r4, r2, r1, r8)
            X.1Eo.A05(r3, r0, r5)
            goto L_0x031f
        L_0x0372:
            java.util.Iterator r2 = r5.iterator()
        L_0x0376:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x035e
            java.lang.Object r0 = r2.next()
            X.LFw r0 = (X.C63969LFw) r0
            X.Kj2 r1 = r0.A01
            X.Kj2 r0 = X.C62631Kj2.VERIFIED
            if (r1 == r0) goto L_0x0376
            r8 = 0
            goto L_0x035e
        L_0x038a:
            X.HOs r10 = X.C54687HOs.A0C
            goto L_0x0302
        L_0x038e:
            r2.clear()
            goto L_0x1017
        L_0x0393:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0398:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x039d:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L_0x03ae
            if (r3 == r8) goto L_0x03d1
            if (r3 == r7) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03ae:
            X.0eS.A00(r0)
            java.lang.Object r0 = r1.A02
            X.KdN r0 = (X.C62289KdN) r0
            X.3ju r6 = r0.A0A
            X.0t1 r0 = r0.A05
            com.instagram.user.model.User r5 = r0.A00()
            java.lang.Object r4 = r1.A01
            com.instagram.api.schemas.LiveUserPaySupportTier r4 = (com.instagram.api.schemas.LiveUserPaySupportTier) r4
            boolean r3 = r1.A03
            X.KdW r0 = new X.KdW
            r0.<init>(r4, r5, r3)
            r1.A00 = r8
            java.lang.Object r0 = r6.ELH(r0, r1)
            if (r0 != r2) goto L_0x03d4
            return r2
        L_0x03d1:
            X.0eS.A00(r0)
        L_0x03d4:
            java.lang.Object r3 = r1.A02
            X.JiJ r3 = (X.C60262JiJ) r3
            boolean r0 = X.C61027JvR.A01(r3)
            if (r0 == 0) goto L_0x1017
            X.3ju r3 = r3.A0B
            X.KdF r0 = X.C62281KdF.A00
            r1.A00 = r7
            java.lang.Object r0 = r3.ELH(r0, r1)
            goto L_0x0fff
        L_0x03ea:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r7 = 3
            r6 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0421
            if (r3 != r4) goto L_0x0fdc
            X.0eS.A00(r0)
        L_0x03f8:
            boolean r3 = r1.A03
            java.lang.Object r0 = r1.A02
            X.KdN r0 = (X.C62289KdN) r0
            X.3ju r5 = r0.A0A
            java.lang.Object r4 = r1.A01
            X.M0U r4 = (X.M0U) r4
            if (r3 == 0) goto L_0x0416
            r0 = 2131965380(0x7f1335c4, float:1.9567568E38)
            X.KdV r3 = new X.KdV
            r3.<init>(r4, r0)
            r1.A00 = r6
        L_0x0410:
            java.lang.Object r0 = r5.ELH(r3, r1)
            goto L_0x0fff
        L_0x0416:
            r0 = 2131965379(0x7f1335c3, float:1.9567566E38)
            X.KdV r3 = new X.KdV
            r3.<init>(r4, r0)
            r1.A00 = r7
            goto L_0x0410
        L_0x0421:
            X.0eS.A00(r0)
            java.lang.Object r0 = r1.A02
            X.KdN r0 = (X.C62289KdN) r0
            X.3ju r3 = r0.A0A
            X.KdS r0 = new X.KdS
            r0.<init>()
            r1.A00 = r4
            java.lang.Object r0 = r3.ELH(r0, r1)
            if (r0 != r2) goto L_0x03f8
            return r2
        L_0x0438:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r10 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0449
            if (r3 == r5) goto L_0x0fdc
            if (r3 == r10) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0449:
            X.0eS.A00(r0)
            java.lang.Object r4 = r1.A02
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r4 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r4
            X.I4T r0 = r4.A0B
            java.lang.Object r7 = r1.A01
            X.MVF r0 = X.JTS.A0X(r0, r7)
            if (r0 == 0) goto L_0x048c
            X.LSs r3 = r0.B88()
            com.instagram.settings2.core.data.SettingsRepository r8 = r4.A07
            boolean r0 = r1.A03
            if (r3 == 0) goto L_0x0478
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r5
            X.4Cc r0 = r8.A0A
            r9 = 0
            X.JaL r5 = new X.JaL
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0472:
            java.lang.Object r0 = X.1Eo.A00(r1, r0, r5)
            goto L_0x0ec9
        L_0x0478:
            r1.A00 = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            X.4Cc r0 = r8.A0A
            r13 = 0
            r14 = 28
            X.MHL r5 = new X.MHL
            r9 = r5
            r11 = r8
            r12 = r7
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0472
        L_0x048c:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "No setting model found for ID "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r7, r0, r1)
            throw r0
        L_0x0497:
            r3 = r0
            X.1Hj r2 = X.1Hj.A02
            int r4 = r1.A00
            r5 = 1
            if (r4 == 0) goto L_0x04a6
            if (r4 == r5) goto L_0x0f9c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04a6:
            X.0eS.A00(r0)
            java.lang.Object r4 = r1.A01
            X.JtE r4 = (X.C60894JtE) r4
            java.lang.Object r3 = r1.A02
            com.instagram.settings2.core.session.SettingsSession r3 = (com.instagram.settings2.core.session.SettingsSession) r3
            boolean r0 = r1.A03
            r1.A00 = r5
            java.lang.Object r3 = com.instagram.settings2.core.viewmodel.UiStateKt.A03(r4, r3, r1, r0)
            goto L_0x0f99
        L_0x04bb:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r6 = 2
            r5 = 1
            if (r3 == 0) goto L_0x04cc
            if (r3 == r5) goto L_0x0fdc
            if (r3 == r6) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04cc:
            X.0eS.A00(r0)
            boolean r3 = r1.A03
            java.lang.Object r0 = r1.A02
            X.Neg r0 = (X.C69101Neg) r0
            if (r3 == 0) goto L_0x04f5
            X.6dC r6 = r0.A05
            com.instagram.common.session.UserSession r4 = r0.A07
            java.lang.Object r3 = r1.A01
            com.instagram.model.effect.AREffect r3 = (com.instagram.model.effect.AREffect) r3
            X.0iw r0 = r0.A06
            java.lang.String r12 = r0.getModuleName()
            X.9tK r7 = X.C391589tK.EFFECT_FOOTER
            r8 = 0
            r1.A00 = r5
            java.lang.String r11 = "effect_page"
            r9 = r4
            r10 = r3
            r13 = r1
            java.lang.Object r0 = r6.A01(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0fff
        L_0x04f5:
            X.6dC r7 = r0.A05
            com.instagram.common.session.UserSession r4 = r0.A07
            java.lang.Object r3 = r1.A01
            com.instagram.model.effect.AREffect r3 = (com.instagram.model.effect.AREffect) r3
            r9 = 0
            X.0iw r0 = r0.A06
            java.lang.String r14 = r0.getModuleName()
            X.9tK r8 = X.C391589tK.EFFECT_FOOTER
            r1.A00 = r6
            java.lang.String r12 = "effect_page"
            r10 = r4
            r11 = r3
            r13 = r9
            r15 = r1
            java.lang.Object r0 = r7.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0fff
        L_0x0514:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r7 = 1
            if (r3 == 0) goto L_0x052f
            if (r3 != r7) goto L_0x0550
            X.0eS.A00(r0)
        L_0x0520:
            java.lang.Object r3 = r1.A02
            X.6lC r3 = (X.C316156lC) r3
            java.lang.Object r2 = r1.A01
            X.4gK r2 = (X.C270184gK) r2
            boolean r0 = r1.A03
            X.C316156lC.A00(r2, r3, r0)
            goto L_0x1017
        L_0x052f:
            X.0eS.A00(r0)
            java.lang.Object r6 = r1.A02
            java.lang.Object r5 = r1.A01
            r4 = 0
            r3 = 44
            X.MGd r0 = new X.MGd
            r0.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r4, (int) r3)
            X.032 r3 = X.AnonymousClass0Zq.A00(r0)
            r0 = 7
            X.MCk r0 = X.MCk.A00(r6, r0)
            r1.A00 = r7
            java.lang.Object r0 = r3.collect(r0, r1)
            if (r0 != r2) goto L_0x0520
            return r2
        L_0x0550:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0555:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r11 = 1
            if (r3 == 0) goto L_0x0563
            if (r3 == r11) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0563:
            X.0eS.A00(r0)
            java.lang.Object r4 = r1.A02
            X.6FR r4 = (X.AnonymousClass6FR) r4
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x1017
            java.lang.Object r3 = r1.A01
            r0 = 14
            X.JFv r10 = new X.JFv
            r10.<init>(r3, r0)
            r1.A00 = r11
            X.MN5 r9 = X.MN5.A00
            X.MJZ r7 = X.MJZ.A00
            X.MJa r8 = X.C66219MJa.A00
            r6 = 0
            X.IlF r5 = new X.IlF
            r5.<init>((X.AnonymousClass4D7) r6, (X.C62320sa) r7, (X.C62320sa) r8, (X.0sP) r9, (X.0sL) r10, (int) r11)
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A01(r4, r1, r5)
            goto L_0x0ec9
        L_0x058b:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r6 = 1
            if (r3 == 0) goto L_0x0628
            if (r3 != r6) goto L_0x0658
            X.0eS.A00(r0)
        L_0x0597:
            X.3Ii r0 = (X.C239803Ii) r0
            java.lang.Object r4 = r1.A02
            X.Dl2 r4 = (X.C46775Dl2) r4
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x061f
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r3 = r0.A00
            X.CG3 r3 = (X.CG3) r3
            java.lang.String r2 = r3.A00
            boolean r0 = r3.isOk()
            if (r0 == 0) goto L_0x05c1
            if (r2 == 0) goto L_0x05c1
            java.lang.String r1 = r3.A01
            com.instagram.api.schemas.IGRevShareProductType r0 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x060e
            com.instagram.monetization.repository.MonetizationRepository r0 = r4.A03
            r0.A01 = r2
        L_0x05c1:
            X.05G r8 = r4.A08
        L_0x05c3:
            java.lang.Object r7 = r8.getValue()
            r5 = r7
            X.Drv r5 = (X.C47180Drv) r5
            com.instagram.monetization.repository.MonetizationRepository r2 = r4.A03
            com.instagram.api.schemas.IGRevShareProductType r0 = r4.A00
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x060b
            if (r1 == r6) goto L_0x0608
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting.TOGGLED_OFF
            java.lang.String r0 = r0.A00
        L_0x05db:
            java.lang.String r3 = r5.A01
            boolean r2 = r5.A04
            boolean r1 = r5.A03
            X.Drv r0 = X.C47180Drv.A00(r3, r0, r2, r1)
            boolean r0 = r8.AIY(r7, r0)
            if (r0 == 0) goto L_0x05c3
            X.3Ih r0 = X.C51967G9n.A0d()
        L_0x05ef:
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x1017
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0653
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 0
            r1 = 29
            X.Fy6 r0 = new X.Fy6
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            goto L_0x1017
        L_0x0608:
            java.lang.String r0 = r2.A01
            goto L_0x05db
        L_0x060b:
            java.lang.String r0 = r2.A00
            goto L_0x05db
        L_0x060e:
            java.lang.String r1 = r3.A01
            com.instagram.api.schemas.IGRevShareProductType r0 = com.instagram.api.schemas.IGRevShareProductType.REELS_OVERLAY_ADS
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x05c1
            com.instagram.monetization.repository.MonetizationRepository r0 = r4.A03
            r0.A00 = r2
            goto L_0x05c1
        L_0x061f:
            boolean r1 = r0 instanceof X.C297815sO
            if (r1 != 0) goto L_0x05ef
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0628:
            X.0eS.A00(r0)
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0650
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting.TOGGLED_ON
        L_0x0631:
            java.lang.String r5 = r0.A00
            java.lang.Object r0 = r1.A02
            X.Dl2 r0 = (X.C46775Dl2) r0
            X.FAE r4 = r0.A05
            java.lang.Object r0 = r1.A01
            com.instagram.api.schemas.IGRevShareProductType r0 = (com.instagram.api.schemas.IGRevShareProductType) r0
            java.lang.String r3 = r0.A00
            r1.A00 = r6
            X.LCC r0 = r4.A00
            X.1OC r3 = r0.A00(r5, r3)
            r0 = 729(0x2d9, float:1.022E-42)
            java.lang.Object r0 = r3.A00(r0, r1)
            if (r0 != r2) goto L_0x0597
            return r2
        L_0x0650:
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting.TOGGLED_OFF
            goto L_0x0631
        L_0x0653:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0658:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x065d:
            int r2 = r1.A00
            r4 = 2
            r3 = 1
            if (r2 == 0) goto L_0x067f
            if (r2 == r3) goto L_0x067b
            if (r2 != r4) goto L_0x06b1
            X.0eS.A00(r0)
        L_0x066a:
            java.lang.Object r0 = r1.A02
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r0 = (com.instagram.newsfeed.viewmodel.ActivityFeedViewModel) r0
            com.instagram.newsfeed.data.ActivityFeedRepository r0 = r0.A08
            com.instagram.repository.common.MemoryCache r0 = r0.A04
            X.3lq r0 = (X.C250653lq) r0
            android.util.LruCache r0 = r0.A00
            r0.evictAll()
            goto L_0x1017
        L_0x067b:
            X.0eS.A00(r0)
            goto L_0x0693
        L_0x067f:
            X.0eS.A00(r0)
            java.lang.Object r2 = r1.A02
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r2 = (com.instagram.newsfeed.viewmodel.ActivityFeedViewModel) r2
            X.05G r0 = r2.A0E
            java.lang.Object r0 = r0.getValue()
            X.5Gi r0 = (X.C283155Gi) r0
            r1.A00 = r3
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel.A00(r0, r2, r1)
        L_0x0693:
            java.lang.Object r3 = r1.A02
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r3 = (com.instagram.newsfeed.viewmodel.ActivityFeedViewModel) r3
            X.05G r2 = r3.A0E
            r0 = 0
            r2.Epw(r0)
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x06ab
            java.lang.Object r0 = r1.A01
            X.5Gi r0 = (X.C283155Gi) r0
            r1.A00 = r4
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel.A00(r0, r3, r1)
            goto L_0x066a
        L_0x06ab:
            java.lang.Object r0 = r1.A01
            r2.Epw(r0)
            goto L_0x066a
        L_0x06b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06b6:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r7 = 2
            r5 = 1
            if (r3 == 0) goto L_0x06c7
            if (r3 == r5) goto L_0x06e1
            if (r3 == r7) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06c7:
            X.0eS.A00(r0)
            java.lang.Object r4 = r1.A01
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x1017
            java.lang.Object r0 = r1.A02
            X.E7c r0 = (X.C47539E7c) r0
            com.instagram.newsfeed.followrequests.data.FollowRequestsRepository r3 = r0.A01
            boolean r0 = r1.A03
            r1.A00 = r5
            java.lang.Object r0 = r3.A02(r4, r1, r0)
            if (r0 != r2) goto L_0x06e4
            return r2
        L_0x06e1:
            X.0eS.A00(r0)
        L_0x06e4:
            boolean r3 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r1.A02
            X.E7c r0 = (X.C47539E7c) r0
            X.C47539E7c.A01(r0)
            if (r3 != 0) goto L_0x1017
            X.3ju r6 = r0.A06
            boolean r5 = r1.A03
            java.lang.Object r0 = r1.A01
            int r4 = X.DbS.A05(r0)
            r3 = 1
            if (r5 == 0) goto L_0x06ff
            r3 = 0
        L_0x06ff:
            X.Jzr r0 = new X.Jzr
            r0.<init>(r4, r3)
            r1.A00 = r7
            java.lang.Object r0 = r6.ELH(r0, r1)
            goto L_0x0fff
        L_0x070c:
            X.1Hj r2 = X.1Hj.A02
            int r4 = r1.A00
            r7 = 2
            r6 = 1
            r3 = 0
            if (r4 == 0) goto L_0x071e
            if (r4 == r6) goto L_0x0fdc
            if (r4 == r7) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x071e:
            X.0eS.A00(r0)
            java.lang.Object r5 = r1.A01
            X.MWx r5 = (X.C66569MWx) r5
            com.instagram.music.common.model.AudioType r0 = r5.CAc()
            int r0 = r0.ordinal()
            java.lang.Object r4 = r1.A02
            if (r0 == r3) goto L_0x0749
            X.JjY r4 = (X.C60329JjY) r4
            X.KWw r3 = r4.A03
            boolean r0 = r1.A03
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            java.lang.String r9 = r5.BfO()
            r1.A00 = r7
            r6 = r3
            r7 = r4
            r10 = r1
            r11 = r0
            java.lang.Object r0 = r6.A02(r7, r8, r9, r10, r11)
            goto L_0x0fff
        L_0x0749:
            X.JjY r4 = (X.C60329JjY) r4
            X.KWw r3 = r4.A03
            boolean r0 = r1.A03
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            java.lang.String r8 = r5.BfO()
            java.lang.String r9 = r5.getId()
            r1.A00 = r6
            r5 = r3
            r6 = r4
            r10 = r1
            r11 = r0
            java.lang.Object r0 = r5.A01(r6, r7, r8, r9, r10, r11)
            goto L_0x0fff
        L_0x0765:
            X.1Hj r2 = X.1Hj.A02
            int r4 = r1.A00
            r3 = 1
            if (r4 == 0) goto L_0x078a
            if (r4 != r3) goto L_0x07a8
            X.0eS.A00(r0)
        L_0x0771:
            X.L8I r0 = (X.L8I) r0
            if (r0 == 0) goto L_0x1017
            java.lang.Object r3 = r1.A02
            X.4xR r3 = (X.C278734xR) r3
            boolean r7 = r1.A03
            java.lang.Object r1 = r1.A01
            X.540 r1 = (X.AnonymousClass540) r1
            X.1XM r2 = r0.A01
            java.util.List r4 = r0.A03
            long r5 = r0.A00
            X.C278734xR.A01(r1, r2, r3, r4, r5, r7)
            goto L_0x1017
        L_0x078a:
            X.0eS.A00(r0)
            java.lang.Object r0 = r1.A02
            X.4xR r0 = (X.C278734xR) r0
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r0 = r0.A00
            if (r0 != 0) goto L_0x079f
            java.lang.String r0 = "mainFeedLocalDataSource"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x079f:
            r1.A00 = r3
            java.lang.Object r0 = r0.A05(r1, r3)
            if (r0 != r2) goto L_0x0771
            return r2
        L_0x07a8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07ad:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r9 = 3
            r5 = 2
            r6 = 1
            if (r3 != 0) goto L_0x0fdc
            X.0eS.A00(r0)
            java.lang.Object r10 = r1.A02
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r10 = (com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource) r10
            com.instagram.common.session.UserSession r8 = r10.A09
            X.0Tu r7 = X.0Tu.A05
            r3 = 36314914855652239(0x81043900050b8f, double:3.029036610914934E-306)
            boolean r0 = X.DbY.A1Y(r7, r8, r3)
            if (r0 == 0) goto L_0x0808
            boolean r0 = r10.A0J
            if (r0 == 0) goto L_0x07f4
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.A0F
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x07f4
        L_0x07d8:
            r3 = 781540647(0x2e955d27, float:6.792283E-11)
            X.0nL r0 = new X.0nL
            r0.<init>(r3)
            java.lang.Object r9 = r1.A01
            boolean r13 = r1.A03
            r11 = 0
            r12 = 19
            X.JTe r8 = new X.JTe
            r8.<init>(r9, r10, r11, r12, r13)
            r1.A00 = r5
            java.lang.Object r0 = X.1Eo.A00(r1, r0, r8)
            goto L_0x0fff
        L_0x07f4:
            r3 = 36314914855914387(0x81043900090b93, double:3.0290366110807176E-306)
            boolean r0 = X.182.A06(r7, r8, r3)
            if (r0 == 0) goto L_0x07d8
            java.lang.Object r3 = r1.A01
            X.L1t r3 = (X.C63657L1t) r3
            boolean r0 = r1.A03
            r1.A00 = r6
            goto L_0x0810
        L_0x0808:
            java.lang.Object r3 = r1.A01
            X.L1t r3 = (X.C63657L1t) r3
            boolean r0 = r1.A03
            r1.A00 = r9
        L_0x0810:
            X.0gF r0 = com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource.A00(r10, r3, r0)
            goto L_0x0fff
        L_0x0816:
            int r2 = r1.A00
            r4 = 1
            if (r2 == 0) goto L_0x0822
            if (r2 == r4) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0822:
            X.0eS.A00(r0)
            java.lang.Object r3 = r1.A02
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r3 = (com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource) r3
            java.lang.Object r2 = r1.A01
            X.L1t r2 = (X.C63657L1t) r2
            boolean r0 = r1.A03
            r1.A00 = r4
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource.A00(r3, r2, r0)
            goto L_0x1017
        L_0x0836:
            X.1Hj r2 = X.1Hj.A02
            int r4 = r1.A00
            r3 = 1
            r5 = 0
            if (r4 == 0) goto L_0x0846
            if (r4 != r3) goto L_0x0841
            goto L_0x0856
        L_0x0841:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0846:
            X.0eS.A00(r0)
            java.lang.Object r0 = r1.A01     // Catch:{ 3g0 -> 0x08ff }
            X.0sP r0 = (X.0sP) r0     // Catch:{ 3g0 -> 0x08ff }
            r1.A00 = r3     // Catch:{ 3g0 -> 0x08ff }
            java.lang.Object r0 = r0.invoke(r1)     // Catch:{ 3g0 -> 0x08ff }
            if (r0 != r2) goto L_0x0859
            return r2
        L_0x0856:
            X.0eS.A00(r0)     // Catch:{ 3g0 -> 0x08ff }
        L_0x0859:
            java.lang.Object r2 = r1.A02     // Catch:{ 3g0 -> 0x08ff }
            X.Jib r2 = (X.C60280Jib) r2     // Catch:{ 3g0 -> 0x08ff }
            boolean r8 = r1.A03     // Catch:{ 3g0 -> 0x08ff }
            X.K1d r0 = (X.C61292K1d) r0     // Catch:{ 3g0 -> 0x08ff }
            X.K1d r4 = r2.A07     // Catch:{ 3g0 -> 0x08ff }
            com.instagram.common.session.UserSession r7 = r2.A05     // Catch:{ 3g0 -> 0x08ff }
            r4.A02(r7, r0, r5)     // Catch:{ 3g0 -> 0x08ff }
            java.util.List r9 = r0.A0A     // Catch:{ 3g0 -> 0x08ff }
            X.0qQ.A07(r9)     // Catch:{ 3g0 -> 0x08ff }
            java.lang.String r14 = r0.A03     // Catch:{ 3g0 -> 0x08ff }
            java.util.ArrayList r6 = X.DbV.A15(r14)     // Catch:{ 3g0 -> 0x08ff }
            java.util.Iterator r10 = r9.iterator()     // Catch:{ 3g0 -> 0x08ff }
        L_0x0877:
            boolean r9 = r10.hasNext()     // Catch:{ 3g0 -> 0x08ff }
            if (r9 == 0) goto L_0x08de
            java.lang.Object r13 = r10.next()     // Catch:{ 3g0 -> 0x08ff }
            X.1Xj r13 = (X.1Xj) r13     // Catch:{ 3g0 -> 0x08ff }
            X.1Xy r9 = r13.A0C     // Catch:{ 3g0 -> 0x08ff }
            java.lang.String r9 = r9.getTitle()     // Catch:{ 3g0 -> 0x08ff }
            if (r9 == 0) goto L_0x08ce
            int r9 = r9.length()     // Catch:{ 3g0 -> 0x08ff }
            if (r9 == 0) goto L_0x08ce
            X.1Xy r9 = r13.A0C     // Catch:{ 3g0 -> 0x08ff }
            java.lang.String r15 = r9.getTitle()     // Catch:{ 3g0 -> 0x08ff }
        L_0x0897:
            java.lang.String r16 = r13.getId()     // Catch:{ 3g0 -> 0x08ff }
            if (r16 == 0) goto L_0x08d9
            r9 = 600(0x258, float:8.41E-43)
            com.instagram.model.mediasize.ExtendedImageUrl r12 = r13.A1m(r9)     // Catch:{ 3g0 -> 0x08ff }
            com.instagram.user.model.User r9 = r13.A2A(r7)     // Catch:{ 3g0 -> 0x08ff }
            X.0qQ.A0A(r9)     // Catch:{ 3g0 -> 0x08ff }
            java.lang.String r17 = r9.getUsername()     // Catch:{ 3g0 -> 0x08ff }
            long r19 = r13.A1B()     // Catch:{ 3g0 -> 0x08ff }
            X.1Xy r9 = r13.A0C     // Catch:{ 3g0 -> 0x08ff }
            java.lang.Integer r9 = r9.CEg()     // Catch:{ 3g0 -> 0x08ff }
            if (r9 == 0) goto L_0x08cb
            int r18 = r9.intValue()     // Catch:{ 3g0 -> 0x08ff }
        L_0x08be:
            long r21 = r13.A1A()     // Catch:{ 3g0 -> 0x08ff }
            X.LrL r11 = new X.LrL     // Catch:{ 3g0 -> 0x08ff }
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r21)     // Catch:{ 3g0 -> 0x08ff }
            r6.add(r11)     // Catch:{ 3g0 -> 0x08ff }
            goto L_0x0877
        L_0x08cb:
            r18 = 0
            goto L_0x08be
        L_0x08ce:
            X.3gp r9 = r13.A1T()     // Catch:{ 3g0 -> 0x08ff }
            if (r9 == 0) goto L_0x08d7
            java.lang.String r15 = r9.A0d     // Catch:{ 3g0 -> 0x08ff }
            goto L_0x0897
        L_0x08d7:
            r15 = 0
            goto L_0x0897
        L_0x08d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ 3g0 -> 0x08ff }
            throw r0     // Catch:{ 3g0 -> 0x08ff }
        L_0x08de:
            X.2Fj r10 = r2.A04     // Catch:{ 3g0 -> 0x08ff }
            java.lang.String r9 = r4.A08     // Catch:{ 3g0 -> 0x08ff }
            X.0qQ.A07(r9)     // Catch:{ 3g0 -> 0x08ff }
            java.lang.String r7 = r4.A05     // Catch:{ 3g0 -> 0x08ff }
            X.L4e r4 = new X.L4e     // Catch:{ 3g0 -> 0x08ff }
            r4.<init>(r9, r7)     // Catch:{ 3g0 -> 0x08ff }
            r10.A0B(r4)     // Catch:{ 3g0 -> 0x08ff }
            X.2Fj r7 = r2.A03     // Catch:{ 3g0 -> 0x08ff }
            if (r8 != 0) goto L_0x08f4
            r3 = 0
        L_0x08f4:
            boolean r4 = r0.A0D     // Catch:{ 3g0 -> 0x08ff }
            X.KSm r0 = new X.KSm     // Catch:{ 3g0 -> 0x08ff }
            r0.<init>(r6, r3, r4)     // Catch:{ 3g0 -> 0x08ff }
            r7.A0B(r0)     // Catch:{ 3g0 -> 0x08ff }
            goto L_0x0910
        L_0x08ff:
            r3 = move-exception
            java.lang.Object r2 = r1.A02     // Catch:{ all -> 0x0914 }
            X.Jib r2 = (X.C60280Jib) r2     // Catch:{ all -> 0x0914 }
            java.lang.String r0 = r2.A0E     // Catch:{ all -> 0x0914 }
            r3.A00(r0)     // Catch:{ all -> 0x0914 }
            X.2Fj r3 = r2.A03     // Catch:{ all -> 0x0914 }
            X.KSn r0 = X.C61938KSn.A00     // Catch:{ all -> 0x0914 }
            r3.A0B(r0)     // Catch:{ all -> 0x0914 }
        L_0x0910:
            r2.A00 = r5
            goto L_0x1017
        L_0x0914:
            r2 = move-exception
            java.lang.Object r0 = r1.A02
            X.Jib r0 = (X.C60280Jib) r0
            r0.A00 = r5
            throw r2
        L_0x091c:
            X.1Hj r3 = X.1Hj.A02
            int r4 = r1.A00
            r2 = 1
            if (r4 == 0) goto L_0x0944
            if (r4 != r2) goto L_0x095f
            X.0eS.A00(r0)
        L_0x0928:
            java.lang.Object r0 = r1.A02
            X.NdZ r0 = (X.C69041NdZ) r0
            X.OHV r2 = r0.A0Q
            java.lang.Object r0 = r1.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            X.N4t r0 = (X.N4t) r0
            java.lang.String r1 = r0.A0B
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.NdD r0 = r2.A04
            r0.A0a(r1)
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0944:
            X.0eS.A00(r0)
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0928
            java.lang.Object r0 = r1.A02
            X.NdZ r0 = (X.C69041NdZ) r0
            com.instagram.common.session.UserSession r0 = r0.A0O
            int r0 = X.AnonymousClass3HF.A00(r0)
            long r4 = (long) r0
            r1.A00 = r2
            java.lang.Object r0 = X.C241603Pv.A01(r1, r4)
            if (r0 != r3) goto L_0x0928
            return r3
        L_0x095f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0964:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r6 = 1
            if (r3 == 0) goto L_0x0972
            if (r3 == r6) goto L_0x098f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0972:
            X.0eS.A00(r0)
            java.lang.Object r5 = r1.A02
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x1017
            java.lang.Object r4 = r1.A01
            X.0pa r4 = (X.C61770pa) r4
            r3 = 18
            X.IkU r0 = new X.IkU
            r0.<init>(r5, r3)
            r1.A00 = r6
            java.lang.Object r0 = r4.collect(r0, r1)
            if (r0 != r2) goto L_0x0992
            return r2
        L_0x098f:
            X.0eS.A00(r0)
        L_0x0992:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0997:
            X.1Hj r3 = X.1Hj.A02
            int r2 = r1.A00
            r5 = 1
            if (r2 == 0) goto L_0x09c6
            if (r2 != r5) goto L_0x0a08
            X.0eS.A00(r0)
        L_0x09a3:
            X.3Ii r0 = (X.C239803Ii) r0
            boolean r2 = r0 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x09fb
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r0 = r0.A00
            X.MWB r0 = (X.MWB) r0
            X.JxC r0 = (X.C61101JxC) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x09e8
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x09e8
            java.lang.Object r0 = r1.A01
            X.1Xj r0 = (X.1Xj) r0
            X.0qQ.A0B(r0, r5)
            X.KRe r3 = new X.KRe
            r3.<init>(r0)
            return r3
        L_0x09c6:
            X.0eS.A00(r0)
            java.lang.Object r0 = r1.A02
            X.Lip r0 = (X.C64829Lip) r0
            com.instagram.fanclub.api.FanClubApi r4 = r0.A00
            java.lang.Object r0 = r1.A01
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x0a0d
            java.util.List r2 = X.AnonymousClass7TE.A1I(r0)
            boolean r0 = r1.A03
            r1.A00 = r5
            java.lang.Object r0 = r4.A0O(r2, r1, r0)
            if (r0 != r3) goto L_0x09a3
            return r3
        L_0x09e8:
            java.lang.Object r2 = r1.A01
            X.1Xj r2 = (X.1Xj) r2
            X.3X1 r0 = X.AnonymousClass3X1.PREVIEW
            X.1Xy r1 = r2.A0C
            java.lang.String r0 = r0.A00
            r1.EnQ(r0)
            X.KRf r3 = new X.KRf
            r3.<init>(r2)
            return r3
        L_0x09fb:
            java.lang.Object r0 = r1.A01
            X.1Xj r0 = (X.1Xj) r0
            X.0qQ.A0B(r0, r5)
            X.KRd r3 = new X.KRd
            r3.<init>(r0)
            return r3
        L_0x0a08:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a0d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a12:
            X.1Hj r3 = X.1Hj.A02
            int r2 = r1.A00
            r5 = 1
            if (r2 == 0) goto L_0x0aab
            if (r2 != r5) goto L_0x0af3
            X.0eS.A00(r0)
        L_0x0a1e:
            X.3Ii r0 = (X.C239803Ii) r0
            boolean r6 = r1.A03
            java.lang.Object r5 = r1.A02
            X.DlY r5 = (X.C46797DlY) r5
            java.lang.Object r3 = r1.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            boolean r1 = r0 instanceof X.C239793Ih
            r4 = 0
            if (r1 == 0) goto L_0x0aa2
            X.4lm r2 = r5.A02
            java.lang.Integer r1 = X.C46797DlY.A09
            java.lang.String r0 = r3.getId()
            if (r6 == 0) goto L_0x0a9e
            r2.A06(r0, r1)
        L_0x0a3c:
            X.4Cl r1 = r3.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.EW6(r0)
            com.instagram.common.session.UserSession r0 = r5.A01
            r3.A0d(r0)
            r0 = 2131974631(0x7f1359e7, float:1.9586332E38)
            if (r6 == 0) goto L_0x0a52
            r0 = 2131974632(0x7f1359e8, float:1.9586334E38)
        L_0x0a52:
            X.05G r2 = r5.A05
            X.GKO r1 = X.JTP.A0Q(r0)
            X.EKR r0 = new X.EKR
            r0.<init>(r1)
            X.3Ih r0 = X.Dba.A0S(r0, r2)
        L_0x0a61:
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x1017
            boolean r1 = r0 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0aee
            X.4dm r1 = X.JTP.A0N(r0)
            X.05G r2 = r5.A05
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0a8f
            X.4do r1 = (X.C268674do) r1
            if (r1 == 0) goto L_0x0a8f
            java.lang.Object r0 = r1.A00
            X.1XR r0 = (X.1XR) r0
            if (r0 == 0) goto L_0x0a8f
            int r1 = r0.getStatusCode()
            r0 = 405(0x195, float:5.68E-43)
            if (r1 != r0) goto L_0x0a8f
            X.EKQ r1 = new X.EKQ
            r1.<init>(r3)
        L_0x0a8a:
            r2.Epw(r1)
            goto L_0x1017
        L_0x0a8f:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131974630(0x7f1359e6, float:1.958633E38)
            X.GKO r0 = X.DbS.A0Q(r1, r0)
            X.EKR r1 = new X.EKR
            r1.<init>(r0)
            goto L_0x0a8a
        L_0x0a9e:
            r2.A05(r0, r1)
            goto L_0x0a3c
        L_0x0aa2:
            boolean r1 = r0 instanceof X.C297815sO
            if (r1 != 0) goto L_0x0a61
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0aab:
            X.0eS.A00(r0)
            java.lang.Object r0 = r1.A02
            X.DlY r0 = (X.C46797DlY) r0
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r4 = r0.A03
            boolean r2 = r1.A03
            java.lang.Object r0 = r1.A01
            java.lang.String r7 = X.DbS.A0q(r0)
            r1.A00 = r5
            com.instagram.fanclub.api.FanClubApi r0 = r4.A07
            if (r2 == 0) goto L_0x0ae8
            java.lang.String r6 = "favorite_for_exclusive_content"
            r5 = 644696992(0x266d4ba0, float:8.2328384E-16)
        L_0x0ac7:
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1NY r4 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r2 = "friendships/"
            r0 = 47
            java.lang.String r0 = X.002.A0k(r2, r6, r7, r0, r0)
            r4.A0A(r0)
            java.lang.String r0 = "target_user_id"
            X.DbX.A1M(r4, r0, r7)
            X.1OC r0 = r4.A0M()
            java.lang.Object r0 = r0.A00(r5, r1)
            if (r0 != r3) goto L_0x0a1e
            return r3
        L_0x0ae8:
            java.lang.String r6 = "unfavorite_for_exclusive_content"
            r5 = 103134553(0x625b559, float:3.1166284E-35)
            goto L_0x0ac7
        L_0x0aee:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0af3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0af8:
            X.1Hj r3 = X.1Hj.A02
            int r2 = r1.A00
            r4 = 1
            if (r2 == 0) goto L_0x0b62
            if (r2 != r4) goto L_0x0b93
            java.lang.Object r5 = r1.A01
            X.1Xj r5 = (X.1Xj) r5
            X.0eS.A00(r0)
        L_0x0b08:
            X.7dS r0 = (X.C335737dS) r0
            X.7dS r2 = X.C335737dS.DIRECT_CHANNEL_REPLY_NUDGE
            if (r0 != r2) goto L_0x1017
            java.lang.Object r4 = r1.A02
            X.JjH r4 = (X.C60314JjH) r4
            X.7a3 r3 = r4.A04
            com.instagram.user.model.User r2 = X.C51966G9m.A11(r5)
            r3.A02(r2, r0)
            X.LSm r5 = r4.A08
            boolean r1 = r1.A03
            X.2Ep r4 = X.LSm.A00(r5)
            if (r4 == 0) goto L_0x1017
            r0 = r4
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.3Te r0 = r0.A0s
            if (r0 == 0) goto L_0x1017
            X.0eP r3 = X.LSm.A02(r5)
            X.0eP r2 = X.LSm.A03(r5, r0, r4)
            if (r1 == 0) goto L_0x0b5f
            java.lang.String r1 = "True"
        L_0x0b3a:
            java.lang.String r0 = "is_reply"
            java.util.LinkedHashMap r7 = X.JTS.A0p(r0, r1, r3, r2)
            X.0eM r0 = r5.A04
            X.6gx r0 = X.DbZ.A0R(r0)
            int r8 = r4.AdN()
            java.lang.String r5 = r4.C6C()
            java.lang.String r6 = r4.C6k()
            java.lang.String r1 = "view_comments_integrity_nudge"
            java.lang.String r2 = "impression"
            java.lang.String r3 = "comments_sheet"
            java.lang.String r4 = "comments_view"
            r0.A0W(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x1017
        L_0x0b5f:
            java.lang.String r1 = "False"
            goto L_0x0b3a
        L_0x0b62:
            X.0eS.A00(r0)
            java.lang.Object r2 = r1.A02
            X.JjH r2 = (X.C60314JjH) r2
            X.7a5 r0 = r2.A06
            X.1Xl r0 = r0.A00
            if (r0 == 0) goto L_0x1017
            X.1Xj r5 = r0.BPf()
            if (r5 == 0) goto L_0x1017
            com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl r6 = X.C335077cL.A00()
            r11 = 0
            X.0sn r13 = X.0sn.A00
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            com.instagram.common.session.UserSession r8 = r2.A07
            r15 = 0
            X.0wc r7 = X.AnonymousClass0kN.A02(r8)
            r1.A01 = r5
            r1.A00 = r4
            r9 = r5
            r12 = r11
            r14 = r1
            java.lang.Enum r0 = r6.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r0 != r3) goto L_0x0b08
            return r3
        L_0x0b93:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b98:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r4 = 1
            if (r3 == 0) goto L_0x0bc2
            if (r3 != r4) goto L_0x0bdf
            X.0eS.A00(r0)
        L_0x0ba4:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x1017
            java.lang.Object r3 = r1.A02
            X.H2g r3 = (X.C54186H2g) r3
            X.05G r2 = r3.A05
            X.I1G r0 = X.I1G.A00
            r2.Epw(r0)
            boolean r2 = r1.A03
            java.lang.Object r0 = r1.A01
            X.QP8 r0 = (X.QP8) r0
            if (r2 == 0) goto L_0x0bda
            X.C54186H2g.A00(r0, r3)
            goto L_0x1017
        L_0x0bc2:
            X.0eS.A00(r0)
            java.lang.Object r0 = r1.A02
            X.H2g r0 = (X.C54186H2g) r0
            com.instagram.creator.agent.settings.keyword.KeywordRepository r3 = r0.A04
            java.lang.Object r0 = r1.A01
            X.QP8 r0 = (X.QP8) r0
            java.lang.String r0 = r0.A02
            r1.A00 = r4
            java.lang.Object r0 = r3.A05(r0, r1)
            if (r0 != r2) goto L_0x0ba4
            return r2
        L_0x0bda:
            X.C54186H2g.A01(r0, r3)
            goto L_0x1017
        L_0x0bdf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0be4:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r9 = 0
            r8 = 1
            if (r3 == 0) goto L_0x0c23
            if (r3 != r8) goto L_0x0c54
            X.0eS.A00(r0)
        L_0x0bf1:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r0.get(r9)
            boolean r4 = X.AnonymousClass7TE.A1a(r2)
            java.lang.Object r0 = r0.get(r8)
            boolean r3 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r2 = r1.A02
            com.instagram.creator.agent.settings.audience.AudienceUseCase r2 = (com.instagram.creator.agent.settings.audience.AudienceUseCase) r2
            X.05G r0 = r2.A07
            X.AnonymousClass7TF.A1O(r0, r9)
            X.05G r2 = r2.A04
            if (r4 == 0) goto L_0x0c20
            if (r3 == 0) goto L_0x0c20
            boolean r0 = r1.A03
            r1 = r0 ^ 1
            X.Gq3 r0 = new X.Gq3
            r0.<init>(r1)
        L_0x0c1b:
            r2.Epw(r0)
            goto L_0x1017
        L_0x0c20:
            X.IQh r0 = X.IQh.A00
            goto L_0x0c1b
        L_0x0c23:
            X.0eS.A00(r0)
            java.lang.Object r10 = r1.A01
            X.4Cq r10 = (X.C262224Cq) r10
            r7 = 0
            boolean r4 = r1.A03
            java.lang.Object r6 = r1.A02
            r3 = 23
            X.JV6 r0 = new X.JV6
            r0.<init>((java.lang.Object) r6, (X.AnonymousClass4D7) r7, (int) r3, (boolean) r4)
            X.19B r5 = X.19B.A00
            X.2Q8 r4 = X.1Eo.A02(r5, r0, r10)
            r3 = 31
            X.ImO r0 = new X.ImO
            r0.<init>(r6, r7, r3)
            X.2Q8 r0 = X.1Eo.A02(r5, r0, r10)
            X.2Q9[] r0 = new X.AnonymousClass2Q9[]{r4, r0}
            r1.A00 = r8
            java.lang.Object r0 = X.AnonymousClass42T.A02(r1, r0)
            if (r0 != r2) goto L_0x0bf1
            return r2
        L_0x0c54:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c59:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r7 = 1
            if (r3 == 0) goto L_0x0c67
            if (r3 == r7) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c67:
            X.0eS.A00(r0)
            java.lang.Object r6 = r1.A02
            X.GhU r6 = (X.C53038GhU) r6
            X.0V2 r5 = r6.A04
            java.lang.Object r4 = r1.A01
            com.instagram.api.schemas.Challenge r4 = (com.instagram.api.schemas.Challenge) r4
            boolean r0 = r1.A03
            X.Hkg r3 = new X.Hkg
            r3.<init>(r6, r0)
            X.KPw r0 = new X.KPw
            r0.<init>(r4, r3)
            r1.A00 = r7
            java.lang.Object r0 = r5.emit(r0, r1)
            goto L_0x0fff
        L_0x0c88:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r8 = 1
            if (r3 == 0) goto L_0x0c96
            if (r3 == r8) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c96:
            X.0eS.A00(r0)
            java.lang.Object r0 = r1.A02
            X.GhU r0 = (X.C53038GhU) r0
            X.0V2 r9 = r0.A05
            java.util.List r0 = r9.Bm6()
            java.lang.Object r3 = X.00k.A0L(r0)
            X.HPP r3 = (X.HPP) r3
            boolean r0 = r3 instanceof X.H9M
            if (r0 == 0) goto L_0x1017
            X.H9M r3 = (X.H9M) r3
            java.lang.Object r11 = r1.A01
            com.instagram.creator.achievements.modules.models.Badge$ChallengeBadge r11 = (com.instagram.creator.achievements.modules.models.Badge.ChallengeBadge) r11
            boolean r12 = r1.A03
            X.Gmk r10 = r3.A00
            java.lang.Object r14 = r10.A01
            java.util.List r14 = (java.util.List) r14
            if (r12 == 0) goto L_0x0ce3
            java.util.ArrayList r13 = X.AnonymousClass7TF.A0p(r14)
            java.util.Iterator r14 = r14.iterator()
        L_0x0cc5:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0ce2
            java.lang.Object r7 = r14.next()
            com.instagram.creator.achievements.modules.models.Badge r7 = (com.instagram.creator.achievements.modules.models.Badge) r7
            if (r11 == 0) goto L_0x0cde
            long r3 = r11.A00
            long r5 = r7.A00()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0cde
            r7 = r11
        L_0x0cde:
            r13.add(r7)
            goto L_0x0cc5
        L_0x0ce2:
            r14 = r13
        L_0x0ce3:
            java.lang.Object r15 = r10.A03
            java.util.List r15 = (java.util.List) r15
            if (r12 != 0) goto L_0x0d0d
            java.util.ArrayList r12 = X.AnonymousClass7TF.A0p(r15)
            java.util.Iterator r13 = r15.iterator()
        L_0x0cf1:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0d0c
            java.lang.Object r7 = r13.next()
            com.instagram.creator.achievements.modules.models.Badge$ChallengeBadge r7 = (com.instagram.creator.achievements.modules.models.Badge.ChallengeBadge) r7
            if (r11 == 0) goto L_0x0d08
            long r5 = r11.A00
            long r3 = r7.A00
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0d08
            r7 = r11
        L_0x0d08:
            r12.add(r7)
            goto L_0x0cf1
        L_0x0d0c:
            r15 = r12
        L_0x0d0d:
            java.lang.String r11 = r10.A04
            java.lang.String r12 = r10.A06
            java.lang.String r13 = r10.A05
            java.lang.Object r3 = r10.A02
            java.util.List r3 = (java.util.List) r3
            X.Dba.A0j(r8, r11, r14)
            X.C51974G9v.A1M(r12, r15, r13)
            r0 = 5
            X.0qQ.A0B(r3, r0)
            X.Gmk r10 = new X.Gmk
            r16 = r3
            r10.<init>((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.util.List) r14, (java.util.List) r15, (java.util.List) r16)
            X.H9M r0 = new X.H9M
            r0.<init>(r10)
            r1.A00 = r8
            java.lang.Object r0 = r9.emit(r0, r1)
            goto L_0x0fff
        L_0x0d35:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r5 = 1
            if (r3 == 0) goto L_0x0d55
            if (r3 != r5) goto L_0x0df7
            X.0eS.A00(r0)
        L_0x0d41:
            java.lang.Object r6 = r1.A02
            X.K66 r6 = (X.K66) r6
            X.3Q2 r4 = X.C61829KNs.A02(r6)
            if (r4 != 0) goto L_0x0d6e
            java.lang.String r2 = "ClipsPublishScreenFragment"
            java.lang.String r1 = "pendingMedia is null in updatesAfterSaveDraft"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            goto L_0x1017
        L_0x0d55:
            X.0eS.A00(r0)
            java.lang.Object r0 = r1.A02
            X.K66 r0 = (X.K66) r0
            r0.EvY()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r3 = X.K66.A01(r0)
            boolean r0 = r1.A03
            r1.A00 = r5
            java.lang.Object r0 = r3.A05(r1, r0)
            if (r0 != r2) goto L_0x0d41
            return r2
        L_0x0d6e:
            X.0eM r7 = r6.A0T
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r7)
            X.0eM r0 = r6.A0S
            java.lang.Object r2 = r0.getValue()
            X.4MS r2 = (X.AnonymousClass4MS) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 43
            X.MMm r0 = X.C66303MMm.A01(r6, r0)
            X.C64170LRv.A02(r2, r3, r1, r0)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r7)
            X.LFG r0 = X.K66.A04(r6)
            boolean r2 = X.AnonymousClass7TF.A1V(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r0)
            X.AnonymousClass7TF.A1C(r3, r5, r1)
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS
            r4.A0e(r0)
            if (r2 != 0) goto L_0x0da7
            r4.A5U = r5
        L_0x0da7:
            r4.A5S = r5
            java.lang.String r0 = r4.A35
            r1.A0D(r4, r0)
            X.JTP.A1M(r3)
            java.util.List r0 = r4.A4J
            if (r0 == 0) goto L_0x0dc8
            java.util.Iterator r1 = r0.iterator()
        L_0x0db9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0dc8
            java.lang.Object r0 = r1.next()
            X.4aA r0 = (X.C266684aA) r0
            r0.A0K = r5
            goto L_0x0db9
        L_0x0dc8:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.L4H r4 = X.C63209KtG.A00(r0)
            X.1QP r3 = r4.A01
            long r1 = r4.A00
            java.lang.String r0 = "USER_SAVED_CLIPS_DRAFT"
            r3.flowMarkPoint(r1, r0)
            long r0 = r4.A00
            r3.flowEndSuccess(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.AYm r3 = X.C394779yg.A00(r0)
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A00(r2, r1, r0)
            r6.A0F = r5
            goto L_0x1017
        L_0x0df7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0dfc:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r7 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0e0d
            if (r3 == r6) goto L_0x0e2e
            if (r3 == r7) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e0d:
            X.0eS.A00(r0)
            java.lang.Object r0 = r1.A02
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r5 = r0.A07
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A01(r0)
            boolean r4 = r1.A03
            java.lang.Object r0 = r1.A01
            X.9P8 r0 = (X.AnonymousClass9P8) r0
            X.Lnc r3 = new X.Lnc
            r3.<init>(r0, r4)
            r1.A00 = r6
            r0 = 0
            java.lang.Object r0 = r5.A0G(r3, r1, r0)
            if (r0 != r2) goto L_0x0e31
            return r2
        L_0x0e2e:
            X.0eS.A00(r0)
        L_0x0e31:
            java.lang.Object r3 = r1.A02
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r3 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r3
            r1.A00 = r7
            r0 = 0
            java.lang.Object r0 = r3.A05(r1, r0)
            goto L_0x0fff
        L_0x0e3e:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r4 = 1
            if (r3 == 0) goto L_0x0e4c
            if (r3 == r4) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e4c:
            X.0eS.A00(r0)
            java.lang.Object r8 = r1.A02
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r8 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r8
            X.5kq r10 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A00(r8)
            if (r10 == 0) goto L_0x0e7d
            boolean r11 = r1.A03
            java.lang.Object r9 = r1.A01
            r7 = 10
            X.IxD r6 = new X.IxD
            r6.<init>(r7, r8, r9, r10, r11)
            if (r11 != 0) goto L_0x0e6e
            X.JXu r3 = r10.A0G
            X.JXu r0 = X.JXu.A02
            if (r3 != r0) goto L_0x0e6e
            r8.A02 = r4
        L_0x0e6e:
            r9 = r11 ^ 1
            r1.A00 = r4
            r7 = 0
            r3 = r8
            r4 = r10
            r5 = r1
            r8 = r7
            java.lang.Object r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A03(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0fff
        L_0x0e7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0e82:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r8 = 1
            if (r3 == 0) goto L_0x0e90
            if (r3 == r8) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e90:
            X.0eS.A00(r0)
            boolean r5 = r1.A03
            if (r5 == 0) goto L_0x0ea2
            java.lang.Object r0 = r1.A02
            X.8N2 r0 = (X.AnonymousClass8N2) r0
            X.05G r3 = r0.A0A
            X.KK4 r0 = X.KK4.A00
            r3.Epw(r0)
        L_0x0ea2:
            java.lang.Object r4 = r1.A02
            X.8N2 r4 = (X.AnonymousClass8N2) r4
            X.0eM r0 = r4.A0F
            java.lang.Object r7 = r0.getValue()
            X.3pa r7 = (X.C252733pa) r7
            java.lang.Object r3 = r1.A01
            r0 = 6
            X.GN2 r6 = new X.GN2
            r6.<init>(r0, r4, r3, r5)
            r1.A00 = r8
            X.4Cq r0 = r7.A01
            X.4Cc r5 = r0.ArX()
            r4 = 0
            r3 = 0
            X.MH1 r0 = new X.MH1
            r0.<init>(r6, r7, r4, r3)
            java.lang.Object r0 = X.1Eo.A00(r1, r5, r0)
        L_0x0ec9:
            if (r0 == r2) goto L_0x0fff
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0fff
        L_0x0ecf:
            X.1Hj r2 = X.1Hj.A02
            int r4 = r1.A00
            r3 = 0
            r8 = 1
            if (r4 == 0) goto L_0x0f48
            if (r4 != r8) goto L_0x0f5f
            X.0eS.A00(r0)
        L_0x0edc:
            java.lang.Object r8 = r1.A02
            X.Xaw r8 = (X.C21444Xaw) r8
            boolean r0 = r8.A04
            if (r0 != 0) goto L_0x0ee9
            boolean r2 = r8.A05
            r0 = 0
            if (r2 == 0) goto L_0x0eea
        L_0x0ee9:
            r0 = 1
        L_0x0eea:
            if (r0 == 0) goto L_0x0ef1
            boolean r2 = r1.A03
            r0 = 1
            if (r2 == 0) goto L_0x0ef2
        L_0x0ef1:
            r0 = 0
        L_0x0ef2:
            r5 = 2
            if (r0 == 0) goto L_0x0f2a
            r0 = 1022(0x3fe, float:1.432E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
        L_0x0eff:
            X.02m r7 = r8.A02
            r6 = 900937641(0x35b337a9, float:1.3352739E-6)
            r7.markerStart(r6)
            X.YAd r4 = r8.A01
            java.lang.Object r2 = r1.A01
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            X.XH4 r1 = new X.XH4
            r1.<init>(r2)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r1)
            X.A9Y r1 = new X.A9Y
            r1.<init>(r0)
            X.9ta r1 = r4.E3U(r1, r2)
            boolean r0 = r1 instanceof X.AnonymousClass9ZE
            if (r0 != 0) goto L_0x0f24
            r5 = 3
        L_0x0f24:
            r7.markerEnd(r6, r5)
            if (r0 == 0) goto L_0x0f9f
            return r1
        L_0x0f2a:
            boolean r4 = r1.A03
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            if (r4 == 0) goto L_0x0f43
            r0 = 1023(0x3ff, float:1.434E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            goto L_0x0eff
        L_0x0f43:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r2)
            goto L_0x0eff
        L_0x0f48:
            X.0eS.A00(r0)
            r4 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r7 = r1.A02
            r6 = 45
            X.MG7 r0 = new X.MG7
            r0.<init>(r7, r3, r6)
            r1.A00 = r8
            java.lang.Object r0 = X.I3P.A00(r1, r0, r4)
            if (r0 != r2) goto L_0x0edc
            return r2
        L_0x0f5f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0f64:
            r3 = r0
            X.1Hj r2 = X.1Hj.A02
            int r5 = r1.A00
            r4 = 1
            if (r5 == 0) goto L_0x0f73
            if (r5 == r4) goto L_0x0f9c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0f73:
            X.0eS.A00(r0)
            java.lang.Object r0 = r1.A02
            com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository r0 = (com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository) r0
            X.Xaw r8 = r0.A04
            java.lang.Object r7 = r1.A01
            boolean r5 = r1.A03
            r1.A00 = r4
            r3 = 0
            if (r7 == 0) goto L_0x0f99
            X.12T r4 = X.AnonymousClass12T.A00
            r0 = -18
            X.0nV r0 = X.JTP.A0U(r4, r0)
            r10 = 4
            X.JTe r6 = new X.JTe
            r9 = r3
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r3 = X.1Eo.A00(r1, r0, r6)
        L_0x0f99:
            if (r3 != r2) goto L_0x0f9f
            return r2
        L_0x0f9c:
            X.0eS.A00(r0)
        L_0x0f9f:
            return r3
        L_0x0fa0:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r8 = 1
            if (r3 == 0) goto L_0x0fae
            if (r3 == r8) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0fae:
            X.0eS.A00(r0)
            java.lang.Object r3 = r1.A01
            X.IwG r0 = new X.IwG
            r0.<init>((java.lang.Object) r3, (int) r8)
            X.05E r7 = X.C3025664b.A02(r0)
            boolean r6 = r1.A03
            java.lang.Object r5 = r1.A02
            r4 = 0
            r3 = 2
            X.MFU r0 = new X.MFU
            r0.<init>(r5, r4, r3, r6)
            r1.A00 = r8
            java.lang.Object r0 = X.AnonymousClass11O.A00(r1, r0, r7)
            goto L_0x0fff
        L_0x0fce:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r7 = 1
            if (r3 == 0) goto L_0x0fe0
            if (r3 == r7) goto L_0x0fdc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0fdc:
            X.0eS.A00(r0)
            goto L_0x1017
        L_0x0fe0:
            X.0eS.A00(r0)
            java.lang.Object r4 = r1.A01
            r3 = 0
            X.IwG r0 = new X.IwG
            r0.<init>((java.lang.Object) r4, (int) r3)
            X.05E r6 = X.C3025664b.A02(r0)
            boolean r5 = r1.A03
            java.lang.Object r4 = r1.A02
            r3 = 0
            X.MFU r0 = new X.MFU
            r0.<init>(r4, r3, r7, r5)
            r1.A00 = r7
            java.lang.Object r0 = X.AnonymousClass11O.A00(r1, r0, r6)
        L_0x0fff:
            if (r0 != r2) goto L_0x1017
            return r2
        L_0x1002:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r5 = 1
            if (r3 == 0) goto L_0x101a
            if (r3 != r5) goto L_0x1033
            X.0eS.A00(r0)
        L_0x100e:
            java.lang.Object r0 = r1.A02
            X.5Uk r0 = (X.C286225Uk) r0
            if (r0 == 0) goto L_0x1017
            r0.show()
        L_0x1017:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x101a:
            X.0eS.A00(r0)
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x1017
            java.lang.Object r0 = r1.A01
            X.I1b r0 = (X.C56547I1b) r0
            r0.A01()
            r3 = 300(0x12c, double:1.48E-321)
            r1.A00 = r5
            java.lang.Object r0 = X.C241603Pv.A01(r1, r3)
            if (r0 != r2) goto L_0x100e
            return r2
        L_0x1033:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59673JTe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C59673JTe) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59673JTe(C60297Jiv jiv, List list, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A04 = 34;
        this.A02 = jiv;
        this.A01 = list;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59673JTe(Object obj, Object obj2, AnonymousClass4D7 r4, int i, boolean z) {
        super(2, r4);
        this.A04 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59673JTe(boolean z, Object obj, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A04 = i;
        this.A03 = z;
        this.A01 = obj;
    }
}
