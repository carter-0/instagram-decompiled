package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.30G  reason: invalid class name */
public final class AnonymousClass30G extends C234532y8 {
    public final Activity A00;
    public final UserSession A01;
    public final C233102ux A02;
    public final 1Ua A03;
    public final Context A04;
    public final AnonymousClass4DU A05;
    public final AnonymousClass30R A06;
    public final AnonymousClass2z1 A07;
    public final AnonymousClass2pP A08;

    public final void Csj(C2354830a r2, 1Xj r3, AnonymousClass3W1 r4) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        if (r3.CcK() && AnonymousClass3WX.A02(r3, this.A05)) {
            r2.A00(this.A06);
        }
    }

    public static final void A00(C2354830a r4, 1Xj r5, AnonymousClass30G r6) {
        UserSession userSession = r6.A01;
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36326236389521040L) && r5.CcK() && AnonymousClass3WX.A02(r5, r6.A05)) {
            r4.A00(r6.A07);
        }
    }

    public AnonymousClass30G(Activity activity, Context context, UserSession userSession, AnonymousClass4DU r12, C233102ux r13) {
        this.A04 = context;
        this.A00 = activity;
        this.A01 = userSession;
        this.A05 = r12;
        this.A02 = r13;
        1Ua A002 = 1UX.A00(context, userSession);
        0qQ.A07(A002);
        this.A03 = A002;
        AnonymousClass2pP r3 = new AnonymousClass2pP(C60510iO.A00(userSession), false);
        this.A08 = r3;
        ArrayList arrayList = new ArrayList();
        C233102ux r6 = this.A02;
        if (r6 != null) {
            UserSession userSession2 = this.A01;
            0qQ.A0B(userSession2, 0);
            if (182.A06(0Tu.A05, userSession2, 36314670042319606L)) {
                arrayList.add(new AnonymousClass30H(userSession2, r6, r3));
            }
        }
        UserSession userSession3 = this.A01;
        0qQ.A0B(userSession3, 0);
        0Tu r2 = 0Tu.A05;
        boolean A062 = 182.A06(r2, userSession3, 36323521969794287L);
        0qQ.A0A(Boolean.valueOf(A062));
        if (A062) {
            arrayList.add(new AnonymousClass4KV(userSession3, r3));
        }
        if (r6 != null) {
            boolean A063 = 182.A06(r2, userSession3, 36328736060161598L);
            0qQ.A0A(Boolean.valueOf(A063));
            if (A063) {
                arrayList.add(new IPP(userSession3, r6, r3));
            }
        }
        if (182.A06(r2, userSession3, 36329272931008464L)) {
            arrayList.add(new AnonymousClass30P(this.A00, userSession3, r3));
        }
        this.A06 = new AnonymousClass30R(userSession3, new AnonymousClass30Q(), 00k.A0a(arrayList));
        this.A07 = new AnonymousClass2z1(r3);
    }
}
