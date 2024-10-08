package X;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class M0Y implements X9V, C313626gk, X5L, MTA {
    public LEK A00;
    public Integer A01;
    public String A02;
    public Set A03;
    public final Context A04;
    public final AnonymousClass4DH A05;
    public final UserSession A06;
    public final C64514LdG A07;
    public final C313546gc A08;
    public final LGO A09;
    public final AnonymousClass3NV A0A;
    public final C313886hJ A0B;
    public final C65816M0i A0C;
    public final LOO A0D;
    public final C64873LjZ A0E;
    public final LGX A0F;
    public final C62320sa A0G;
    public final C62320sa A0H;
    public final 0sL A0I;
    public final 0sL A0J;

    public final boolean COG() {
        return false;
    }

    public final void Ct1(User user) {
        0qQ.A0B(user, 0);
        C51975G9x.A1E(user, this, DbV.A0J(this.A05), 0);
    }

    public final void D0X(User user) {
        0qQ.A0B(user, 0);
        C51975G9x.A1E(user, this, DbV.A0J(this.A05), 1);
    }

    public final /* synthetic */ void DGW(String str) {
    }

    public final void DLc(User user, Integer num) {
        AnonymousClass7TG.A1N(user, num);
        AnonymousClass0xx A0J2 = DbV.A0J(this.A05);
        AnonymousClass7TE.A1Z(new MHK(user, this, num, (AnonymousClass4D7) null, 20), A0J2);
    }

    public final /* synthetic */ void DNI() {
    }

    public final /* synthetic */ void DSL(G7P g7p, User user) {
    }

    public final void DdZ(User user) {
        0qQ.A0B(user, 0);
        C51975G9x.A1E(user, this, DbV.A0J(this.A05), 2);
    }

    public final /* synthetic */ void Dw8(String str) {
    }

    public final /* synthetic */ void E0E(1P0 r1, C21478XcN xcN, User user, Integer num) {
    }

    public static C59720JVe A00(Object obj) {
        return LKG.A01(((M0Y) obj).A06).A03();
    }

    public static final void A01(M0Y m0y, Integer num) {
        String str;
        String str2;
        m0y.A0F.A00();
        C65816M0i m0i = m0y.A0C;
        String str3 = m0i.A09;
        if (str3 != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("IgLiveWithInviteFragment.ARGUMENTS_KEY_EXTRA_BROADCAST_ID", str3);
            int intValue = num.intValue();
            if (1 != intValue) {
                str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
            } else {
                str = "footer";
            }
            A0a.putString("IgLiveWithInviteFragment.ARGUMENTS_KEY_EXTRA_OPENED_METHOD", str);
            DbU.A1D(A0a, m0y.A06);
            M0X m0x = m0i.A0T;
            1Ln A022 = M0X.A02(m0x, AnonymousClass05K.A0i);
            if (1 - intValue != 0) {
                str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
            } else {
                str2 = "footer";
            }
            A022.A0R("method", str2);
            ConcurrentHashMap concurrentHashMap = m0x.A0U;
            ArrayList A0q = JTT.A0q(A022, concurrentHashMap);
            Iterator A0s = AnonymousClass7TF.A0s(concurrentHashMap);
            while (A0s.hasNext()) {
                JTT.A1T(A0q, A0s);
            }
            M0X.A07(A022, m0x, A0q);
            A022.Cgf();
        }
    }

    public static final void A02(M0Y m0y, boolean z) {
        Window window;
        FragmentActivity activity = m0y.A05.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            if (z) {
                window.addFlags(128);
            } else {
                window.clearFlags(128);
            }
        }
    }

    public final void A03(boolean z, boolean z2) {
        this.A0C.A0T.A0L(z, z2);
        this.A0I.invoke(AnonymousClass7TE.A0v(), (Object) null);
    }

    public final boolean COF() {
        return this.A0C.A05.A00();
    }

    public final void Cfr() {
        this.A0C.A02(AnonymousClass05K.A01, (String) null, true);
    }

    public final void Cu9(User user, String str) {
        this.A0F.A00();
    }

    public final void DMr(int i, boolean z) {
        MXE mxe = this.A07.A00;
        if (i == 0) {
            mxe.CfL();
        } else {
            mxe.CfM();
        }
    }

    public final void DNB(boolean z, boolean z2) {
        this.A0F.A04(z2);
    }

    public final boolean EtF(String str) {
        String str2 = this.A02;
        if (str2 == null || str2.equals(str)) {
            return false;
        }
        return true;
    }

    public M0Y(Context context, AnonymousClass4DH r3, UserSession userSession, C64514LdG ldG, C313546gc r6, LGO lgo, AnonymousClass3NV r8, C313886hJ r9, C65816M0i m0i, LOO loo, C64873LjZ ljZ, LGX lgx, LEK lek, C62320sa r15, C62320sa r16, 0sL r17, 0sL r18, boolean z) {
        Integer num;
        C51972G9s.A1C(userSession, r8);
        this.A04 = context;
        this.A06 = userSession;
        this.A0A = r8;
        this.A09 = lgo;
        this.A0C = m0i;
        this.A0I = r17;
        this.A0F = lgx;
        this.A0E = ljZ;
        this.A0D = loo;
        this.A07 = ldG;
        this.A00 = lek;
        this.A05 = r3;
        this.A0B = r9;
        this.A08 = r6;
        this.A0J = r18;
        this.A0H = r15;
        this.A0G = r16;
        m0i.A06 = this;
        m0i.A07 = this;
        m0i.A08 = this;
        loo.A06 = this;
        ljZ.A00 = this;
        if (r8 == AnonymousClass3NV.A0A) {
            num = AnonymousClass05K.A01;
        } else if (r8 == AnonymousClass3NV.A07) {
            num = AnonymousClass05K.A0N;
        } else if (z) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A00;
        }
        this.A01 = num;
        this.A03 = 0sl.A00;
    }

    public final Integer Bdi(String str) {
        if (EtF(str)) {
            return AnonymousClass05K.A0N;
        }
        return null;
    }
}
