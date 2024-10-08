package X;

/* renamed from: X.3jB  reason: invalid class name and case insensitive filesystem */
public final class C249133jB extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C249133jB(2Lk r7) {
        super("FxAppStartMigrateClientImpression", 1652689082, 3, false, false);
        this.A00 = r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loggedRun() {
        /*
            r12 = this;
            X.2Lk r1 = r12.A00
            com.facebook.common.callercontext.CallerContext r0 = X.2Lk.A08
            com.instagram.common.session.UserSession r5 = r1.A04
            r4 = 1
            X.0qQ.A0B(r5, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r7 = 0
            java.lang.String r6 = "IG_LOGOUT_UPSELL"
            r0 = 1279(0x4ff, float:1.792E-42)
            java.lang.String r2 = X.C273654mx.A00(r0)
            r0 = 218(0xda, float:3.05E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String[] r0 = new java.lang.String[]{r6, r2, r1}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x002a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r9 = r11.next()
            java.lang.String r9 = (java.lang.String) r9
            X.0qQ.A0B(r9, r7)
            int r8 = r9.hashCode()
            r0 = -1574224499(0xffffffffa22b3d8d, float:-2.3207406E-18)
            if (r8 == r0) goto L_0x010e
            r0 = -773734548(0xffffffffd1e1bf6c, float:-1.21197396E11)
            if (r8 == r0) goto L_0x00ff
            r0 = 1949671265(0x74359f61, float:5.755849E31)
            if (r8 != r0) goto L_0x002a
            boolean r0 = r9.equals(r6)
            if (r0 == 0) goto L_0x002a
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r10 = r0.A01
            r0 = 293(0x125, float:4.1E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
        L_0x005e:
            boolean r0 = r10.getBoolean(r0, r7)
            if (r0 == 0) goto L_0x002a
            r0 = -1574224499(0xffffffffa22b3d8d, float:-2.3207406E-18)
            if (r8 == r0) goto L_0x00f0
            r0 = -773734548(0xffffffffd1e1bf6c, float:-1.21197396E11)
            if (r8 == r0) goto L_0x00e1
            r0 = 1949671265(0x74359f61, float:5.755849E31)
            if (r8 != r0) goto L_0x008b
            boolean r0 = r9.equals(r6)
            if (r0 == 0) goto L_0x008b
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r10 = r0.A01
            r0 = 3178(0xc6a, float:4.453E-42)
        L_0x0081:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r10.getBoolean(r0, r7)
            if (r0 != 0) goto L_0x002a
        L_0x008b:
            r3.add(r9)
            r0 = -1574224499(0xffffffffa22b3d8d, float:-2.3207406E-18)
            if (r8 == r0) goto L_0x00ce
            r0 = -773734548(0xffffffffd1e1bf6c, float:-1.21197396E11)
            if (r8 == r0) goto L_0x00bb
            r0 = 1949671265(0x74359f61, float:5.755849E31)
            if (r8 != r0) goto L_0x002a
            boolean r0 = r9.equals(r6)
            if (r0 == 0) goto L_0x002a
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r0 = r0.A01
            X.0xY r8 = r0.AR4()
            r0 = 3178(0xc6a, float:4.453E-42)
        L_0x00af:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.E5T(r0, r4)
            r8.apply()
            goto L_0x002a
        L_0x00bb:
            boolean r0 = r9.equals(r1)
            if (r0 == 0) goto L_0x002a
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r0 = r0.A01
            X.0xY r8 = r0.AR4()
            r0 = 3179(0xc6b, float:4.455E-42)
            goto L_0x00af
        L_0x00ce:
            boolean r0 = r9.equals(r2)
            if (r0 == 0) goto L_0x002a
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r0 = r0.A01
            X.0xY r8 = r0.AR4()
            r0 = 3177(0xc69, float:4.452E-42)
            goto L_0x00af
        L_0x00e1:
            boolean r0 = r9.equals(r1)
            if (r0 == 0) goto L_0x008b
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r10 = r0.A01
            r0 = 3179(0xc6b, float:4.455E-42)
            goto L_0x0081
        L_0x00f0:
            boolean r0 = r9.equals(r2)
            if (r0 == 0) goto L_0x008b
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r10 = r0.A01
            r0 = 3177(0xc69, float:4.452E-42)
            goto L_0x0081
        L_0x00ff:
            boolean r0 = r9.equals(r1)
            if (r0 == 0) goto L_0x002a
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r10 = r0.A01
            r0 = 612(0x264, float:8.58E-43)
            goto L_0x011c
        L_0x010e:
            boolean r0 = r9.equals(r2)
            if (r0 == 0) goto L_0x002a
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r10 = r0.A01
            r0 = 291(0x123, float:4.08E-43)
        L_0x011c:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x005e
        L_0x0122:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0153
            X.2IS r2 = new X.2IS
            r2.<init>()
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r3)
            java.lang.String r0 = "upsell_names"
            r2.A05(r0, r1)
            r0 = 0
            if (r1 == 0) goto L_0x013c
            r0 = 1
        L_0x013c:
            X.17k.A0E(r0)
            java.lang.Class<X.B9R> r1 = X.B9R.class
            java.lang.String r0 = "FxIgMigrateClientImpressionForACUpsell"
            X.3Fa r3 = new X.3Fa
            r3.<init>(r2, r1, r0, r4)
            X.8j4 r2 = X.C363088j4.A00(r5)
            X.DFe r1 = X.C45924DFe.A00
            X.DF6 r0 = X.DF6.A00
            r2.ATL(r0, r1, r3)
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249133jB.loggedRun():void");
    }
}
