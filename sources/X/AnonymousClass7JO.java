package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.7JO  reason: invalid class name */
public final class AnonymousClass7JO implements AnonymousClass7JJ, AnonymousClass7JP, AnonymousClass7JQ {
    public int A00;
    public int A01;
    public long A02;
    public C68448NIm A03;
    public C63822L8d A04;
    public boolean A05;
    public final AnonymousClass12U A06 = new AnonymousClass12U();
    public final UserSession A07;
    public final C331037Pg A08;
    public final AnonymousClass7JN A09;
    public final AnonymousClass7GP A0A;
    public final C301265yp A0B;
    public final C331157Pu A0C;
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LI(this, 13));
    public final C262224Cq A0E = AnonymousClass1HX.A01(967693919, 3);

    public AnonymousClass7JO(UserSession userSession, C331037Pg r6, AnonymousClass7JN r7, AnonymousClass7GP r8, C301265yp r9) {
        this.A07 = userSession;
        this.A08 = r6;
        this.A0B = r9;
        this.A0A = r8;
        this.A09 = r7;
        C331127Pr r1 = new C331127Pr(userSession);
        r1.A1E = true;
        r1.A0k = false;
        r1.A0U = new AnonymousClass7JR(this);
        this.A0C = r1.A00();
    }

    public final void A00() {
        this.A05 = true;
        this.A0C.A0L((C332277Ui) null);
        AnonymousClass0eM r1 = this.A0D;
        if (((C74493Pvn) r1.getValue()).isRecording()) {
            ((C74493Pvn) r1.getValue()).EyI(true);
            this.A09.A00.A0Q.Dzp();
        }
        this.A09.A00.A0D();
    }

    public final void Cwi(DirectMessageIdentifier directMessageIdentifier) {
        C68448NIm nIm = this.A03;
        if (nIm != null) {
            C68448NIm.A06(nIm, false);
        }
    }

    public final void Cwj() {
        C68448NIm nIm = this.A03;
        if (nIm != null) {
            C68448NIm.A06(nIm, false);
        }
    }

    public final void Cwk(int i, int i2, boolean z) {
        C68448NIm nIm = this.A03;
        if (nIm != null) {
            C68448NIm.A00(nIm).setPlaybackPercentage(((float) i) / ((float) i2));
            C68448NIm.A05(nIm, (long) (i2 - i));
        }
        if (i >= this.A01) {
            this.A08.A0B("finished");
            C68448NIm nIm2 = this.A03;
            if (nIm2 != null) {
                C68448NIm.A06(nIm2, false);
            }
        }
    }

    public final void DCn(Exception exc) {
        C68448NIm nIm = this.A03;
        if (nIm != null) {
            nIm.A07();
        }
        this.A0A.A01(exc);
        this.A09.A00.A0Q.Dzm(exc);
    }

    public final void DPg() {
        C63822L8d AuR = ((C74493Pvn) this.A0D.getValue()).AuR();
        this.A04 = AuR;
        if (AuR != null) {
            AuR.A00 = (int) (System.currentTimeMillis() - this.A02);
        }
        C68448NIm nIm = this.A03;
        if (nIm != null) {
            nIm.A07();
        }
    }

    public final void Dc1(boolean z) {
        if (z) {
            C68448NIm nIm = this.A03;
            if (nIm != null) {
                nIm.A04 = true;
                C68448NIm.A00(nIm).setPlaybackPercentage(1.0f);
                C68448NIm.A00(nIm).A0F.clear();
                C68448NIm.A00(nIm).A0E.clear();
                C68448NIm.A00(nIm).setActiveWindowEnabled(false);
                C68448NIm.A04(nIm);
                C68448NIm.A06(nIm, false);
                C68448NIm.A01(nIm).setVisibility(4);
                Object value = nIm.A0B.getValue();
                0qQ.A07(value);
                ((View) value).setEnabled(false);
                Object value2 = nIm.A08.getValue();
                0qQ.A07(value2);
                ((View) value2).setEnabled(false);
                Object value3 = nIm.A0C.getValue();
                0qQ.A07(value3);
                ((View) value3).setEnabled(false);
            }
            this.A09.A00.A0Q.Dzo(false);
        }
    }

    public final void Dc3() {
        int i;
        C63822L8d AuR = ((C74493Pvn) this.A0D.getValue()).AuR();
        this.A04 = AuR;
        if (AuR != null) {
            AuR.A00 = (int) (System.currentTimeMillis() - this.A02);
        }
        C68448NIm nIm = this.A03;
        if (nIm != null) {
            nIm.A07();
        }
        AnonymousClass7JG r2 = this.A09.A00.A0Q;
        r2.Dzq();
        C63822L8d l8d = this.A04;
        if (l8d != null) {
            i = l8d.A00;
        } else {
            i = 0;
        }
        r2.Dzn(false, i);
    }

    public final void E0F(long j, double d) {
        C63822L8d l8d = this.A04;
        if (l8d != null) {
            l8d.A00 = (int) (System.currentTimeMillis() - this.A02);
        }
        C68448NIm nIm = this.A03;
        if (nIm != null) {
            C68448NIm.A00(nIm).A02((float) d);
            AnonymousClass7JO r0 = nIm.A02;
            if (r0 == null) {
                0qQ.A0F("delegate");
                throw AnonymousClass00P.createAndThrow();
            }
            C63822L8d l8d2 = r0.A04;
            if (l8d2 != null) {
                C68448NIm.A05(nIm, (long) l8d2.A00);
            }
        }
    }
}
