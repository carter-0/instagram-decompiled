package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class KX6 extends C252733pa implements MXR {
    public Object A00;
    public final Context A01;
    public final UserSession A02;
    public final C337257fy A03;
    public final 05G A04;
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final AnonymousClass0Ud A0G;
    public final AnonymousClass0Ud A0H;
    public final AnonymousClass0Ud A0I;
    public final AnonymousClass0Ud A0J;
    public final AnonymousClass0Ud A0K;
    public final AnonymousClass0Ud A0L;
    public final AnonymousClass0Ud A0M;
    public final AnonymousClass0Ud A0N;
    public final AnonymousClass0Ud A0O;
    public final AnonymousClass0Ud A0P;
    public final AnonymousClass0Ud A0Q;
    public final AnonymousClass0Ud A0R;

    public final AnonymousClass0Ud Amr() {
        return this.A0G;
    }

    public final AnonymousClass0Ud B3K() {
        return this.A0I;
    }

    public final AnonymousClass0Ud BjF() {
        return this.A0O;
    }

    public final AnonymousClass0Ud BnG() {
        return this.A0P;
    }

    public final AnonymousClass0Ud BqH() {
        return this.A0Q;
    }

    public final AnonymousClass0Ud Bqp() {
        return this.A0R;
    }

    public final AnonymousClass0Ud CT4() {
        return this.A0K;
    }

    public final AnonymousClass0Ud CWW() {
        return this.A0L;
    }

    public final AnonymousClass0Ud CWY() {
        return this.A0M;
    }

    public final AnonymousClass0Ud CYK() {
        return this.A0N;
    }

    public final void FLH(String str) {
        JTR.A1W(this.A05);
        AnonymousClass7TE.A1Z(new C66187MGy(this, str, (AnonymousClass4D7) null, 22), this.A01);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KX6(Context context, UserSession userSession, C337257fy r11) {
        super("search_interop", AnonymousClass43D.A00(359266386));
        Boolean A0u = AnonymousClass7TE.A0u();
        this.A01 = context;
        this.A03 = r11;
        this.A02 = userSession;
        02z A1J = JTO.A1J();
        this.A06 = A1J;
        this.A0Q = A1J;
        02z A10 = DbS.A10(A0u);
        this.A04 = A10;
        this.A0L = A10;
        02z A0q = JTQ.A0q();
        this.A09 = A0q;
        this.A0I = A0q;
        02z A102 = DbS.A10(A0u);
        this.A05 = A102;
        this.A0M = A102;
        02z A103 = DbS.A10(A0u);
        this.A0B = A103;
        this.A0K = A103;
        02z A012 = 106.A01((Object) null);
        this.A0E = A012;
        this.A0P = A012;
        02z A013 = 106.A01((Object) null);
        this.A07 = A013;
        this.A0G = A013;
        02z A014 = 106.A01((Object) null);
        this.A0D = A014;
        this.A0O = A014;
        02z A015 = 106.A01((Object) null);
        this.A0F = A015;
        this.A0R = A015;
        02z A104 = DbS.A10(A0u);
        this.A0C = A104;
        this.A0N = A104;
        02z A105 = DbS.A10(A0u);
        this.A0A = A105;
        this.A0J = A105;
        02z A0q2 = JTQ.A0q();
        this.A08 = A0q2;
        this.A0H = A0q2;
        Object B3J = r11.B3J();
        if (B3J != null) {
            A0q.Epw(AnonymousClass7TF.A0w("direct_inbox_search_extra_data", B3J));
        }
        A014.Epw(r11.BjE());
        A012.Epw(r11.BnF());
        A015.Epw(r11.Bqo());
        A105.Epw(Boolean.valueOf(r11.BBY()));
    }
}
