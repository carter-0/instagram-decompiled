package X;

import android.content.Context;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import kotlin.Deprecated;

@Deprecated(message = "This class is being replace with Follow Action Handlers in MVVM")
/* renamed from: X.GIe  reason: case insensitive filesystem */
public final class C52188GIe implements C243853aD {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final 1Xj A03;
    public final H3C A04;
    public final C62320sa A05;

    public C52188GIe(Context context, AnonymousClass0iw r3, UserSession userSession, 1Xj r5, H3C h3c, C62320sa r7) {
        DbW.A1O(r3, 3, r7);
        this.A02 = userSession;
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = context;
        this.A04 = h3c;
        this.A05 = r7;
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        0qQ.A0B(user, 0);
        1Xj r6 = this.A03;
        if (r6 != null) {
            AnonymousClass0iw r1 = this.A01;
            if (r1 instanceof AnonymousClass4DH) {
                UserSession userSession = this.A02;
                GLB.A00(MusicPageTabType.CLIPS, userSession).A01(C51966G9m.A0n(r6), userSession, "follow_creator", r1.getModuleName());
            }
        }
        this.A05.invoke();
        UserSession userSession2 = this.A02;
        boolean z = false;
        int i = 2131975870;
        if (AnonymousClass2f1.A00(userSession2).A0N(user) == FollowStatus.A05) {
            z = true;
            i = 2131962617;
        }
        Context context = this.A00;
        String A0b = DbY.A0b(context, user, i);
        0qQ.A07(A0b);
        C59689JTv.A09(context, A0b);
        if (z) {
            JU5 A002 = C63289KuY.A00(userSession2);
            C51971G9r.A1P(A002, A002.A0N, 1);
            H3C h3c = this.A04;
            if (h3c != null) {
                H3C.A02(h3c, AnonymousClass05K.A00, C51971G9r.A0s(r6));
            }
        }
    }

    public final void D2p(User user) {
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }
}
