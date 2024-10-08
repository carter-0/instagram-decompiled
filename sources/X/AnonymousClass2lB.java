package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2lB  reason: invalid class name */
public final class AnonymousClass2lB implements 27S {
    public final /* synthetic */ AnonymousClass2l3 A00;

    public AnonymousClass2lB(AnonymousClass2l3 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        1xG r3 = (1xG) obj;
        0qQ.A0B(r3, 0);
        if (!"feed_timeline".equals(r3.A02) || "feed_timeline".equals(r3.A01)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C228242l4 r0;
        int A03 = AnonymousClass0fD.A03(1270209062);
        1xG r13 = (1xG) obj;
        int A032 = AnonymousClass0fD.A03(-793007990);
        0qQ.A0B(r13, 0);
        AnonymousClass2l3 r1 = this.A00;
        18q r02 = AnonymousClass2l3.A0V;
        if (!r1.A07) {
            String str = r13.A01;
            long j = r13.A00;
            18g r4 = r1.A0I;
            0rq r5 = r1.A00;
            0qQ.A0B(r5, 4);
            C64331Jv r03 = r4.A05;
            if (r03 == null || (r0 = r03.A02) == null || r0 == r1) {
                r5.markerPoint(25100289, "NAVIGATED_AWAY");
            }
            r5.markerPoint(15335435, "NAVIGATED_AWAY", str, j, TimeUnit.MILLISECONDS);
            r1.A07 = true;
        }
        1xC.A01.A03(this, 1xG.class);
        AnonymousClass0fD.A0A(-585699416, A032);
        AnonymousClass0fD.A0A(1184905014, A03);
    }
}
