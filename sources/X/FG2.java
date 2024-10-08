package X;

import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

public abstract class FG2 {
    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, User user, String str) {
        0qQ.A0B(userSession, 0);
        if (A03(fragmentActivity, r2, userSession, user, false)) {
            AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
            r0.A00 = r2;
            C48734EjJ.A00(r0.A00(), str, "profile");
        }
    }

    public static final boolean A04(User user) {
        Boolean Bva = user.A03.Bva();
        if (Bva == null || !Bva.booleanValue() || DbV.A0d().getBoolean(AnonymousClass000.A00(3233), false)) {
            return false;
        }
        return true;
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("data_ordering", "APPROXIMATED_EARNINGS");
        A1E.put("timeframe", "ONE_YEAR");
        A1E.put("target_id", userSession.A06);
        C46649DiU A04 = C46649DiU.A04("com.instagram.insights.account.media_grid.igtv.container", A1E);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        DbS.A18(fragmentActivity, A0N, 2131964228);
        A04.A0D(fragmentActivity, A0N);
    }

    public static final boolean A03(FragmentActivity fragmentActivity, AnonymousClass0iw r5, UserSession userSession, User user, boolean z) {
        Boolean Bva = user.A03.Bva();
        if (Bva == null || !Bva.booleanValue()) {
            02m.A0p.markerStart(39124996);
            02m.A0p.markerAnnotate(39124996, "insights_type", "redesign");
            C229382nI A01 = C229382nI.A01((SparseArray) null, fragmentActivity, r5, userSession);
            C360678ey A05 = C359988do.A05(userSession, "com.instagram.insights.account.timeframe.summary", (Map) null);
            E85.A00(A05, fragmentActivity, A01, userSession, 1);
            1ES.A00(fragmentActivity, AnonymousClass07i.A00(fragmentActivity), A05);
            return true;
        }
        C66591pU r0 = C66591pU.A01;
        if (r0 == null) {
            throw AnonymousClass7TE.A0y();
        } else if (r0.A00 != null) {
            C309516Yo A0M = DbV.A0M(new C273374mT(), fragmentActivity, userSession);
            if (z) {
                A0M.A0D = false;
            }
            A0M.A04();
            return false;
        } else {
            0qQ.A0F("fragmentFactory");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, Map map, boolean z, boolean z2, boolean z3) {
        int i;
        String string;
        int i2;
        String A00;
        DbY.A1S(userSession, str);
        map.put("target_id", str);
        map.put("origin", str2);
        02m r5 = 02m.A0p;
        if (z2) {
            i = 39130588;
            string = fragmentActivity.getString(2131976490);
            i2 = 1197;
        } else {
            if (z3) {
                i = 39137013;
                string = fragmentActivity.getString(2131955490);
                A00 = "com.instagram.insights.media_refresh.clips.core";
            } else if (z) {
                i = 39124993;
                string = null;
                A00 = C273654mx.A00(72);
            } else {
                i = 39124994;
                string = fragmentActivity.getString(2131969625);
                i2 = 1194;
            }
            r5.markerStart(i);
            r5.markerAnnotate(i, AnonymousClass000.A00(4629), A00);
            r5.markerAnnotate(i, "insights_type", "umi");
            AnonymousClass7TF.A0D().postDelayed(new C51342Fsa(r5, i), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            C46649DiU A04 = C46649DiU.A04(A00, map);
            IgBloksScreenConfig A0N = DbS.A0N(userSession);
            A0N.A0U = string;
            A0N.A03 = new C47543E7g(i, 0);
            A04.A0D(fragmentActivity, A0N);
        }
        A00 = AnonymousClass000.A00(i2);
        r5.markerStart(i);
        r5.markerAnnotate(i, AnonymousClass000.A00(4629), A00);
        r5.markerAnnotate(i, "insights_type", "umi");
        AnonymousClass7TF.A0D().postDelayed(new C51342Fsa(r5, i), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
        C46649DiU A042 = C46649DiU.A04(A00, map);
        IgBloksScreenConfig A0N2 = DbS.A0N(userSession);
        A0N2.A0U = string;
        A0N2.A03 = new C47543E7g(i, 0);
        A042.A0D(fragmentActivity, A0N2);
    }
}
