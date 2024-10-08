package X;

import java.io.File;

/* renamed from: X.6Uw  reason: invalid class name and case insensitive filesystem */
public final class C308596Uw {
    public final /* synthetic */ C308586Uv A00;

    public C308596Uw(C308586Uv r1) {
        this.A00 = r1;
    }

    public final void A00() {
        C308586Uv r5 = this.A00;
        C308586Uv.A01(C308616Uy.FAILED, r5);
        File file = new File(LOR.A00.getFilesDir(), AnonymousClass000.A00(1866));
        if (file.exists()) {
            AnonymousClass19S A02 = AnonymousClass1HX.A02(2022716810, 3);
            1Eo.A05(19B.A00, new C66161MFy(file, (AnonymousClass4D7) null, 42), A02);
        }
        C308586Uv.A02(r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r2.A00(r3, r1).exists() == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r6 = this;
            X.6Uv r5 = r6.A00
            X.6Uy r1 = X.C308586Uv.A00(r5)
            X.6Uy r0 = X.C308616Uy.STARTED
            if (r1 != r0) goto L_0x005c
            android.view.ViewGroup r0 = r5.A04()
            android.content.Context r0 = r0.getContext()
            X.0qQ.A07(r0)
            boolean r0 = X.C61970qY.A0F(r0)
            if (r0 == 0) goto L_0x005c
            int r0 = r5.A00
            int r1 = r0 + 1
            r5.A00 = r1
            X.6Ux r0 = r5.A08
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            if (r1 != r0) goto L_0x005b
            X.6Uy r0 = X.C308616Uy.COMPLETE
            X.C308586Uv.A01(r0, r5)
            X.LOb r1 = r5.A02
            if (r1 == 0) goto L_0x0068
            r4 = 0
            X.UwR r3 = r1.A04
            X.UwR r0 = X.C16522UwR.END_SUMMARY
            if (r3 == r0) goto L_0x004d
            X.LOR r2 = X.LOR.A01
            java.lang.String r1 = r1.A05
            r0 = 1
            X.0qQ.A0B(r1, r0)
            java.io.File r0 = r2.A00(r3, r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0068
        L_0x004d:
            X.4Cq r2 = r5.A0E
            r0 = 30
            X.MG3 r1 = new X.MG3
            r1.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r4, (int) r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r2)
        L_0x005b:
            return
        L_0x005c:
            X.6Uy r1 = X.C308586Uv.A00(r5)
            X.6Uy r0 = X.C308616Uy.COMPLETE
            if (r1 == r0) goto L_0x005b
            r6.A00()
            return
        L_0x0068:
            X.C308586Uv.A02(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308596Uw.A01():void");
    }
}
