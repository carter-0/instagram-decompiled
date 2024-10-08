package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.AVt  reason: case insensitive filesystem */
public final class C40203AVt implements C13596TdO {
    public final /* synthetic */ C13862Tii A00;
    public final /* synthetic */ STU A01;

    public final void DXY(C390949s6 r18, String str, String str2, Throwable th) {
        AtomicBoolean atomicBoolean;
        C41843B2y b2y;
        C41843B2y b2y2;
        C390949s6 r9 = r18;
        0qQ.A0B(r9, 0);
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        AnonymousClass7TG.A1U(str3, th2, str4);
        C388789oO r7 = this.A01.A07;
        if (r7 != null) {
            if (182.A06(0Tu.A05, r7.A0E, 36316671497212498L)) {
                r7.A06.A08();
                atomicBoolean = r7.A0H;
            } else {
                atomicBoolean = r7.A0H;
                if (!atomicBoolean.get() && (b2y = r7.A05) != null) {
                    b2y.Dff(th2, str3);
                }
                C388779oN r5 = r7.A06;
                r5.A08();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - r7.A02 > 1000) {
                    r5.A09("retry", str3);
                    r7.A02 = currentTimeMillis;
                    if (r9 == C390949s6.PLAYING || r7.A08) {
                        if (r7.A0A) {
                            r7.A0D();
                        } else {
                            r7.A0O();
                        }
                    }
                    C359318cb r0 = r7.A03;
                    if (r0 != null) {
                        AnonymousClass7TF.A1O(r0.A0j.A0B, true);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
            }
            if (!atomicBoolean.get() && (b2y2 = r7.A05) != null) {
                StringBuilder A0n = AnonymousClass7TF.A0n("");
                A0n.append(r9);
                A0n.append('_');
                A0n.append(00R.A03(str4, 800));
                A0n.append('_');
                b2y2.DFv(str3, AnonymousClass7TF.A0l(00R.A03(th2.toString(), 800), A0n), th2);
            }
            C64169LRs.A02(r7.A0B, AnonymousClass05K.A1F, "VVP entered irrecoverable ERROR state", 2131974093);
        }
    }

    public C40203AVt(C13862Tii tii, STU stu) {
        this.A01 = stu;
        this.A00 = tii;
    }
}
