package X;

import java.util.concurrent.Callable;

/* renamed from: X.9RY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9RY implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass9RJ A02;
    public final /* synthetic */ C340167ko A03;
    public final /* synthetic */ C342067nz A04;

    public /* synthetic */ AnonymousClass9RY(AnonymousClass9RJ r1, C340167ko r2, C342067nz r3, int i, int i2) {
        this.A02 = r1;
        this.A04 = r3;
        this.A00 = i;
        this.A03 = r2;
        this.A01 = i2;
    }

    public final Object call() {
        Throwable th;
        AnonymousClass9RJ r3 = this.A02;
        C342067nz r7 = this.A04;
        int i = this.A00;
        C340167ko r6 = this.A03;
        int i2 = this.A01;
        try {
            C340577lU.A00(11, 0, (Object) null);
            if (!(r3.A0b == null || r3.A0b == r7.A02)) {
                r3.A0b.ECm(r3.A0b.C3J());
                r3.A0b = null;
            }
            AnonymousClass9RZ r8 = r3.A0H;
            if (r8.A00.A09()) {
                if (AnonymousClass9RZ.A00(r8, i) == -1) {
                    if (r8.A04() > 0) {
                        if (i == 0) {
                            if (r8.A08(1)) {
                                C340577lU.A03("CameraInventory", "Requested back camera doesn't exist, using front instead");
                                i = 1;
                            }
                        } else if (i == 1 && r8.A08(0)) {
                            C340577lU.A03("CameraInventory", "Requested front camera doesn't exist, using back instead");
                            i = 0;
                        }
                        th = AnonymousClass7TE.A15(002.A0c("found ", " cameras with bad facing constants", AnonymousClass9RZ.A03));
                    } else {
                        th = new C382449di();
                    }
                }
                AnonymousClass9RJ.A08(r3, i);
                C343367q6 A022 = AnonymousClass9RJ.A02(r3, r6, r7, i2);
                C340577lU.A00(12, r3.A00, A022);
                return A022;
            }
            th = AnonymousClass7TE.A15("Cannot resolve camera facing, not on the Optic thread");
            throw th;
        } catch (Exception e) {
            C340577lU.A00(13, 0, e);
            AnonymousClass9RJ.A04(r3);
            C378949Rv r1 = r3.A0J;
            r1.A01.A00();
            r1.A02.A00();
            r3.EWv((C365938nv) null);
            r3.A0M.A06.A00();
            r3.A0P.A00();
            r3.A0A();
            throw e;
        }
    }
}
