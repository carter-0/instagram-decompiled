package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2wm  reason: invalid class name and case insensitive filesystem */
public final class C233972wm implements C229132mt {
    public int A00;
    public long A01;
    public long A02;
    public boolean A03;
    public final UserSession A04;
    public final AnonymousClass2rI A05;
    public final C228552lr A06;
    public final C249763kK A07;
    public final C233902wf A08;
    public final C233992wo A09 = new C233982wn(this);

    public C233972wm(UserSession userSession, AnonymousClass2rI r3, C228552lr r4, C249763kK r5, C233902wf r6) {
        0qQ.A0B(r4, 5);
        this.A04 = userSession;
        this.A07 = r5;
        this.A05 = r3;
        this.A08 = r6;
        this.A06 = r4;
    }

    public final void ACw() {
        C19133WMo wMo;
        if (System.currentTimeMillis() - this.A01 >= 1000 && this.A02 <= 0 && this.A03) {
            AnonymousClass2rI r2 = this.A05;
            if (C242583Vb.A00 == null) {
                if (1Xi.A04(r2.A07())) {
                    wMo = new C19133WMo(1UQ.A0H);
                } else {
                    wMo = null;
                }
                this.A02 = System.currentTimeMillis();
                this.A06.A06(wMo, this.A09, new AnonymousClass46L((int) 182.A01(0Tu.A05, this.A04, 36592580196369016L), 0), r2.A06(), 1, false);
            }
        }
    }
}
