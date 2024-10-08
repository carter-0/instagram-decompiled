package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.KNl  reason: case insensitive filesystem */
public final class C61822KNl extends LP2 {
    public C3499582p A00;
    public C3499682q A01;
    public C63877LAg A02;
    public KO3 A03;
    public C64584LeQ A04;
    public C60259JiG A05;
    public C66576MXh A06;
    public MVR A07;
    public C62950Kp2 A08;
    public C60102Jfi A09;
    public G7M A0A;
    public L9K A0B;
    public LP7 A0C;
    public KB3 A0D;
    public final Bundle A0E;
    public final 28D A0F;
    public final AnonymousClass4DH A0G;
    public final AnonymousClass0iw A0H;
    public final UserSession A0I;
    public final C59899JbO A0J;
    public final LO1 A0K;
    public final C367188qK A0L;
    public final String A0M;
    public final AnonymousClass0eM A0N;

    /* JADX WARNING: type inference failed for: r0v8, types: [X.LO1, java.lang.Object] */
    public C61822KNl(Bundle bundle, AnonymousClass4DH r4, AnonymousClass0iw r5, UserSession userSession) {
        28D r1;
        0qQ.A0B(userSession, 3);
        this.A0G = r4;
        this.A0E = bundle;
        this.A0I = userSession;
        this.A0H = r5;
        String A002 = AnonymousClass000.A00(413);
        if (bundle.get(A002) instanceof 28D) {
            Object obj = bundle.get(A002);
            0qQ.A0C(obj, AnonymousClass000.A00(1626));
            r1 = (28D) obj;
        } else {
            r1 = 28D.A5J;
        }
        this.A0F = r1;
        C59899JbO A003 = JZM.A00(userSession);
        this.A0J = A003;
        String str = A003.A02;
        if (str == null) {
            str = AnonymousClass6SR.A02();
            0qQ.A07(str);
        }
        this.A0M = str;
        this.A0L = new C367188qK(userSession);
        this.A0K = new Object();
        this.A07 = new C65174Lod(r4, r5, userSession);
        this.A0N = AnonymousClass0eN.A01(new C66218MIz(this, 18));
    }

    public final C3499682q A06() {
        C3499682q r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("_session");
        throw AnonymousClass00P.createAndThrow();
    }

    public final KO3 A07() {
        KO3 ko3 = this.A03;
        if (ko3 != null) {
            return ko3;
        }
        0qQ.A0F("dataProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    public final LP7 A08() {
        LP7 lp7 = this.A0C;
        if (lp7 != null) {
            return lp7;
        }
        0qQ.A0F("productTagRowController");
        throw AnonymousClass00P.createAndThrow();
    }
}
