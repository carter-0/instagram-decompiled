package X;

/* renamed from: X.H4w  reason: case insensitive filesystem */
public final class C54253H4w extends 1P0 {
    public final 1P0 A00;
    public final C54432HDf A01;

    public C54253H4w(1P0 r1, C54432HDf hDf) {
        this.A00 = r1;
        this.A01 = hDf;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(978823229);
        0qQ.A0B(r5, 0);
        C54432HDf hDf = this.A01;
        if (hDf != null) {
            hDf.A02 = AnonymousClass05K.A0Y;
            hDf.A04 = false;
        }
        C54253H4w.super.onFail(r5);
        this.A00.onFail(r5);
        AnonymousClass0fD.A0A(1290977175, A03);
    }

    public final void onFailInBackground(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 100898563);
        C54253H4w.super.onFailInBackground(r3);
        this.A00.onFailInBackground(r3);
        AnonymousClass0fD.A0A(1129252056, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1699029235);
        C54432HDf hDf = this.A01;
        if (hDf != null) {
            hDf.A01 = null;
        }
        C54253H4w.super.onFinish();
        this.A00.onFinish();
        AnonymousClass0fD.A0A(1949800032, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(2110067693);
        C54253H4w.super.onStart();
        this.A00.onStart();
        AnonymousClass0fD.A0A(1139731788, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r7.A02 == X.AnonymousClass05K.A00) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 37469086(0x23bbb9e, float:1.3792434E-37)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.1XT r11 = (X.AnonymousClass1XT) r11
            r0 = 973599433(0x3a07f2c9, float:5.186019E-4)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r8 = 0
            X.0qQ.A0B(r11, r8)
            X.HDf r7 = r10.A01
            if (r7 == 0) goto L_0x0054
            java.lang.String r9 = r7.A03
            if (r9 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r4 = r7.A05
            X.1Gd r3 = X.1Gc.A00(r4)
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x002d
            java.lang.Integer r2 = r7.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 0
            if (r2 != r1) goto L_0x002e
        L_0x002d:
            r0 = 1
        L_0x002e:
            r3.A03(r9, r0)
            X.1Gd r0 = X.1Gc.A00(r4)
            X.1Gd.A00(r0)
        L_0x0038:
            r4 = r11
            X.1XU r4 = (X.1XU) r4
            X.0nO r3 = X.0nY.A00()
            X.0qQ.A07(r3)
            r0 = r11
            X.1XQ r0 = (X.1XQ) r0
            long r1 = r0.mResponseTimestamp
            X.4Za r0 = new X.4Za
            r0.<init>(r4, r3, r1)
            r7.A00 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r7.A02 = r0
            r7.A04 = r8
        L_0x0054:
            X.C54253H4w.super.onSuccess(r11)
            X.1P0 r0 = r10.A00
            r0.onSuccess(r11)
            r0 = 1383241071(0x5272956f, float:2.60472291E11)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -2121536660(0xffffffff818beb6c, float:-5.139835E-38)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54253H4w.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-2105967354);
        int A0D = AnonymousClass7TG.A0D(obj, 143496342);
        C54253H4w.super.onSuccessInBackground(obj);
        this.A00.onSuccessInBackground(obj);
        AnonymousClass0fD.A0A(-115860635, A0D);
        AnonymousClass0fD.A0A(1573243075, A03);
    }
}
