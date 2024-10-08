package X;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* renamed from: X.861  reason: invalid class name */
public final class AnonymousClass861 {
    public static final AnonymousClass863 A0O = new AnonymousClass862();
    public 2Fk A00;
    public final 2Fk A01;
    public final AnonymousClass2gB A02;
    public final AnonymousClass2Fj A03;
    public final AnonymousClass2Fj A04;
    public final AnonymousClass2Fj A05;
    public final AnonymousClass2Fj A06;
    public final AnonymousClass2Fj A07;
    public final AnonymousClass2Fj A08;
    public final AnonymousClass2Fj A09;
    public final AnonymousClass2Fj A0A;
    public final AnonymousClass2Fj A0B;
    public final AnonymousClass2Fj A0C;
    public final AnonymousClass2Fj A0D;
    public final AnonymousClass2Fj A0E;
    public final AnonymousClass2Fj A0F;
    public final AnonymousClass2Fj A0G = new 2Fk(A0O);
    public final AnonymousClass2Fj A0H;
    public final AnonymousClass2Fj A0I;
    public final 05G A0J;
    public final AnonymousClass2Fj A0K;
    public final AnonymousClass2Fj A0L;
    public final AnonymousClass866 A0M;
    public final 05G A0N;

    public final void A05() {
        this.A0D.A0B(true);
    }

    public final void A09(2Fk r3) {
        0qQ.A0B(r3, 0);
        2Fk r1 = this.A00;
        if (r1 != null) {
            this.A02.A0D(r1);
        }
        this.A02.A0E(r3, new C40055APl(this));
        this.A00 = r3;
    }

    public final void A0B(List list) {
        0qQ.A0B(list, 0);
        AnonymousClass866 r2 = this.A0M;
        long currentTimeMillis = 100 - (System.currentTimeMillis() - r2.A00);
        if (r2.A02) {
            r2.A03.removeCallbacks(r2.A05);
        }
        r2.A01 = list;
        r2.A02 = true;
        r2.A03.postDelayed(r2.A05, Math.max(0, currentTimeMillis));
    }

    public final int A00() {
        return ((Number) this.A0N.getValue()).intValue();
    }

    public final void A01() {
        this.A09.A0B(new AnonymousClass88W(false));
    }

    public final void A02() {
        Number number;
        int intValue;
        0eP r0 = (0eP) this.A07.A02();
        if (!(r0 == null || (number = (Number) r0.A00) == null || (intValue = number.intValue()) == -1)) {
            A06(intValue);
        }
        A03();
    }

    public final void A03() {
        this.A09.A0B(new AnonymousClass88W(true));
    }

    public final void A04() {
        this.A07.A0B(new 0eP(-1, -1));
    }

    public final void A06(int i) {
        this.A0B.A0B(new AnonymousClass88W(Integer.valueOf(i)));
    }

    public final void A07(int i) {
        this.A0E.A0B(new AnonymousClass88W(Integer.valueOf(i)));
    }

    public final void A08(int i, int i2) {
        StringBuilder sb;
        String str;
        if (i == -1 || i2 == -1) {
            sb = new StringBuilder();
            str = "setLoopStartEndTimeMs is UNSET: ";
        } else if (i >= i2) {
            sb = new StringBuilder();
            str = "setLoopStartEndTimeMs failed: ";
        } else {
            this.A07.A0B(new 0eP(Integer.valueOf(i), Integer.valueOf(i2)));
            return;
        }
        sb.append(str);
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        0kD.A07("VideoPlaybackViewModel", sb.toString(), (Throwable) null);
    }

    public final void A0A(AnonymousClass863 r3) {
        this.A0G.A0B(r3);
        this.A0N.Epw(Integer.valueOf(r3.CEG()));
    }

    public AnonymousClass861() {
        AnonymousClass2gB r3 = new AnonymousClass2gB();
        this.A02 = r3;
        this.A0L = new 2Fk(new Object());
        this.A0C = new 2Fk(0);
        this.A08 = new 2Fk(true);
        this.A0A = new AnonymousClass2Fj();
        this.A0B = new AnonymousClass2Fj();
        this.A0F = new AnonymousClass2Fj();
        AnonymousClass2Fj r4 = new AnonymousClass2Fj();
        this.A03 = r4;
        this.A09 = new AnonymousClass2Fj();
        this.A05 = new 2Fk(false);
        this.A0K = new 2Fk(true);
        this.A0D = new 2Fk(false);
        this.A0H = new 2Fk(Float.valueOf(1.0f));
        this.A0I = new 2Fk(Float.valueOf(0.0f));
        this.A07 = new 2Fk(new 0eP(-1, -1));
        this.A0N = new 02z(-1);
        this.A04 = new 2Fk(false);
        this.A06 = new 2Fk(false);
        this.A0J = new 02z(false);
        this.A0E = new AnonymousClass2Fj();
        this.A01 = r4;
        this.A0M = new AnonymousClass866(new Handler(Looper.getMainLooper()), new AnonymousClass865(this));
        r3.A0B(C361268fw.A00);
    }
}
