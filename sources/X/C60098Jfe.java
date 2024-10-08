package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Jfe  reason: case insensitive filesystem */
public abstract class C60098Jfe extends C361478gI {
    public final UserSession A00;
    public final LTY A01;
    public final C62320sa A02;
    public final 0V2 A03;
    public final 0V2 A04;
    public final C61770pa A05;

    public final void A0I(int i) {
        AnonymousClass7TE.A1Z(new JTZ(this, (Object) null, (AnonymousClass4D7) null, i, 6), C318116oQ.A00(this));
    }

    public final ArrayList A0E() {
        ArrayList A1F = 0Yv.A1F((Iterable) this.A01.A0A.getValue());
        ArrayList A0r = AnonymousClass7TG.A0r(A1F);
        Iterator it = A1F.iterator();
        while (it.hasNext()) {
            A0r.add(C61194Jyn.A02((C61194Jyn) it.next()));
        }
        return 0Yv.A1F(A0r);
    }

    public final void A0F() {
        LTY lty = this.A01;
        lty.A05.clear();
        lty.A06.clear();
    }

    public final void A0G() {
        int A052 = DbS.A05(this.A01.A0A.getValue());
        for (int i = 0; i < A052; i++) {
            A0I(i);
        }
    }

    public final void A0H() {
        LTY lty = this.A01;
        if (C51966G9m.A1a(lty.A04, LTY.A0C)) {
            0eP r0 = lty.A04;
            int A0B = C51970G9q.A0B(r0);
            lty.A0R(A0B, C51969G9p.A0A(r0), false);
            A0I(A0B);
        }
    }

    public final void A0J(int i, int i2) {
        if (this instanceof C61806KMu) {
            C61806KMu kMu = (C61806KMu) this;
            LTY lty = kMu.A01;
            0eP r2 = lty.A04;
            int i3 = lty.A00;
            lty.A0R(i, i2, true);
            if (i3 != -1) {
                kMu.A0T(i3);
            }
            Number number = (Number) r2.A00;
            if (!(number.intValue() == C51970G9q.A0B(LTY.A0C) || number.intValue() == i)) {
                kMu.A0I(number.intValue());
            }
            kMu.A0I(i);
            return;
        }
        LTY lty2 = this.A01;
        0eP r1 = lty2.A04;
        lty2.A0R(i, i2, true);
        Number number2 = (Number) r1.A00;
        if (!(number2.intValue() == C51970G9q.A0B(LTY.A0C) || number2.intValue() == i)) {
            A0I(number2.intValue());
        }
        A0I(i);
    }

    public final void A0K(C61194Jyn jyn) {
        LTY lty = this.A01;
        int A0J = JTR.A0J(lty.A08);
        if (lty.A0X(jyn)) {
            for (int i = 0; i < A0J; i++) {
                A0I(i);
            }
        }
    }

    public final boolean A0L() {
        LTY lty = this.A01;
        if (!C51966G9m.A1a(lty.A04, LTY.A0C)) {
            return false;
        }
        if (lty.A0G(JTR.A0E(lty), JTS.A03(lty)).Ayv() || lty.A0G(JTR.A0E(lty), JTS.A03(lty)).CFq() == AnonymousClass05K.A0N) {
            return true;
        }
        return false;
    }

    public C60098Jfe(Application application, UserSession userSession, C62320sa r6, boolean z) {
        super(application);
        this.A00 = userSession;
        this.A02 = r6;
        this.A01 = new LTY(z);
        Integer num = AnonymousClass05K.A00;
        this.A03 = 10D.A01(num, 0, 0);
        05D A012 = 10D.A01(num, 0, 0);
        this.A04 = A012;
        this.A05 = A012;
    }
}
