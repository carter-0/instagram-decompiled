package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.H4l  reason: case insensitive filesystem */
public final class C54242H4l extends 1P0 {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass6ST A02;

    public C54242H4l(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
        AnonymousClass6ST r1 = new AnonymousClass6ST(context, true);
        this.A02 = r1;
        DbU.A18(context, r1, 2131969783);
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(-937923061);
        C59689JTv.A01(this.A00, "update_profile_grid_failed", 2131974093, 1);
        AnonymousClass0fD.A0A(-517127371, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1807171479);
        this.A02.dismiss();
        AnonymousClass0fD.A0A(151192865, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1815627910);
        AnonymousClass0fN.A00(this.A02);
        AnonymousClass0fD.A0A(2045877101, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Context context;
        int i;
        List<Object> coauthorProducers;
        int A03 = AnonymousClass0fD.A03(-2057789706);
        C54058Gyh gyh = (C54058Gyh) obj;
        int A032 = AnonymousClass0fD.A03(-377014962);
        0qQ.A0B(gyh, 0);
        1Xj r6 = gyh.A00;
        if (r6 != null) {
            UserSession userSession = this.A01;
            r6.AE7(userSession);
            User A2A = r6.A2A(userSession);
            if (A2A != null) {
                A2A.A0X();
                A2A.A0d(userSession);
                String id = A2A.getId();
                if (r6.A4b() && 182.A06(DbS.A0J(userSession, 0), userSession, 36323165487639498L) && (coauthorProducers = r6.A0C.getCoauthorProducers()) != null) {
                    for (Object A0q : coauthorProducers) {
                        if (2R8.A05(userSession, DbS.A0q(A0q))) {
                            id = userSession.A06;
                        }
                    }
                }
                AnonymousClass1Nd.A00(userSession).A00(new C321786uk(C294255m9.A04, id));
                boolean A64 = r6.A64();
                if (r6.A1t() == AnonymousClass3QO.OPAL) {
                    if (C318996ps.A01()) {
                        context = this.A00;
                        C51967G9n.A0v();
                        i = 2131955702;
                        if (A64) {
                            i = 2131955192;
                        }
                    }
                    AnonymousClass0fD.A0A(91311805, A032);
                    AnonymousClass0fD.A0A(-1253438643, A03);
                    return;
                }
                context = this.A00;
                i = 2131955703;
                if (A64) {
                    i = 2131955193;
                }
                C59689JTv.A06(context, i);
                AnonymousClass0fD.A0A(91311805, A032);
                AnonymousClass0fD.A0A(-1253438643, A03);
                return;
            }
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A0A(-971218760, A032);
            throw A0y;
        }
        0qQ.A0F("updatedMedia");
        throw AnonymousClass00P.createAndThrow();
    }
}
