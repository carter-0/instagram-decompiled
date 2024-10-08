package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.FgY  reason: case insensitive filesystem */
public final class C50673FgY implements C319866rM {
    public final /* synthetic */ C50654FgF A00;

    public final W2P AgR(AnonymousClass4DU r2, User user, String str) {
        return null;
    }

    public final String AyH() {
        return "";
    }

    public final void CzK(User user, String str) {
    }

    public final void CzN(Context context, User user, String str) {
    }

    public final void CzP(User user, String str) {
    }

    public final void CzS(Context context, User user, String str) {
    }

    public final void CzU(User user) {
    }

    public final void CzV(User user) {
    }

    public final void CzW(User user, String str) {
    }

    public final void CzX(User user, String str) {
    }

    public final void CzY(C358248ab r1) {
    }

    public final void CzZ() {
    }

    public final void Cza(User user, String str) {
    }

    public final void Czb(User user, String str) {
    }

    public final void Czc(String str) {
    }

    public final void Czd(User user, String str) {
    }

    public final void Cze(long j, String str) {
    }

    public final void DRZ(boolean z) {
    }

    public final void EC2(View view, User user) {
    }

    public final void Eu8(View view) {
    }

    public final void EuS(View view) {
    }

    public final void EuT(View view) {
    }

    public final void Euv(View view) {
    }

    public final void EvE(View view) {
    }

    public final void EvL(View view) {
    }

    public final void FKA(Class cls, String str) {
    }

    public C50673FgY(C50654FgF fgF) {
        this.A00 = fgF;
    }

    public final void CzO(User user, String str) {
        C50654FgF fgF = this.A00;
        LocationDetailFragment locationDetailFragment = fgF.A03;
        DbZ.A1a(locationDetailFragment.A02, Dba.A0F(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_email");
        Fragment fragment = fgF.A01;
        String A0R = 002.A0R("mailto:", user.A03.BiE());
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setType("text/plain");
        intent.addFlags(268435456);
        intent.setData(0cp.A01(C49841F9g.A00, A0R));
        0kR.A0H(intent, fragment);
    }

    public final void CzQ(User user, String str) {
        C50654FgF fgF = this.A00;
        LocationDetailFragment locationDetailFragment = fgF.A03;
        DbZ.A1a(locationDetailFragment.A02, Dba.A0F(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_call");
        Fragment fragment = fgF.A01;
        String AqG = user.A03.AqG();
        AqG.getClass();
        String A0R = 002.A0R("tel:", AqG.trim());
        Intent A06 = DbY.A06(C66579MXk.A00(10));
        A06.setData(0cp.A01(C49841F9g.A00, A0R));
        0kR.A0H(A06, fragment);
    }

    public final void CzR(User user, String str) {
        C50654FgF fgF = this.A00;
        LocationDetailFragment locationDetailFragment = fgF.A03;
        DbZ.A1a(locationDetailFragment.A02, Dba.A0F(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_text");
        Fragment fragment = fgF.A01;
        String AqG = user.A03.AqG();
        AqG.getClass();
        0qQ.A0B(fragment, 1);
        0kR.A02(C49899FCc.A00(AqG, (String) null), fragment);
    }

    public final void CzT(ArrayList arrayList) {
        C50654FgF fgF = this.A00;
        LocationDetailFragment locationDetailFragment = fgF.A03;
        DbZ.A1a(locationDetailFragment.A02, Dba.A0F(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_contact");
        User user = fgF.A04;
        UserSession userSession = fgF.A02;
        Context context = fgF.A01.getContext();
        context.getClass();
        boolean A0C = AnonymousClass703.A0C(user);
        17i A002 = 17h.A00(userSession);
        0qQ.A0B(user, 0);
        A002.A01(user, true, false);
        String id = user.getId();
        ImmutableList immutableList = C47532E6t.A02;
        C47532E6t A003 = C49067Eol.A00(userSession, this, id, arrayList, A0C);
        C331127Pr A0W = DbS.A0W(userSession);
        DbT.A1C(context.getResources(), A0W, 2131956559);
        A0W.A00().A03(context, A003);
    }

    public final void Czf(User user, String str) {
        SMBPartnerType sMBPartnerType;
        String url;
        C274674os AyK;
        C50654FgF fgF = this.A00;
        LocationDetailFragment locationDetailFragment = fgF.A03;
        DbZ.A1a(locationDetailFragment.A02, Dba.A0F(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_business_support");
        UserSession userSession = fgF.A02;
        User user2 = fgF.A04;
        AnonymousClass4DH r4 = fgF.A01;
        FragmentActivity activity = r4.getActivity();
        activity.getClass();
        C321696ub r8 = new C321696ub(r4, userSession, AnonymousClass7TF.A0b());
        ActionButtonPartnerType actionButtonPartnerType = null;
        try {
            C274674os AyK2 = user.A03.AyK();
            AyK2.getClass();
            sMBPartnerType = C253543qx.A00(AyK2.AmM());
        } catch (IllegalArgumentException unused) {
            sMBPartnerType = null;
        }
        if (sMBPartnerType == SMBPartnerType.GET_QUOTE) {
            FGE.A01(activity, userSession, C16602Uxw.A05, user);
            return;
        }
        C274674os AyK3 = user.A03.AyK();
        if (AyK3 == null) {
            url = "";
        } else {
            url = AyK3.getUrl();
        }
        if (!TextUtils.isEmpty(url)) {
            if (user.A03.AyK() != null) {
                actionButtonPartnerType = user.A03.AyK().Bap();
            }
            if (!C324066yY.A04(activity, actionButtonPartnerType, sMBPartnerType, url)) {
                SUL sul = new SUL(activity, userSession, 2EG.A3U, url);
                sul.A0E(userSession.A06);
                DbW.A1J(r4, sul);
            } else if (C324066yY.A05(user2) && (AyK = user2.A03.AyK()) != null) {
                String Ac5 = AyK.Ac5();
                String Bao = AyK.Bao();
                String url2 = AyK.getUrl();
                String id = user2.getId();
                String AmM = AyK.AmM();
                AmM.getClass();
                r8.A00(Ac5, Bao, url2, id, AmM);
            }
        }
    }

    public final void DRV(String str, boolean z) {
        C50654FgF fgF = this.A00;
        LocationDetailFragment locationDetailFragment = fgF.A03;
        DbZ.A1a(locationDetailFragment.A02, Dba.A0F(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_message");
        UserSession userSession = fgF.A02;
        User user = fgF.A04;
        C49841F9g.A00(fgF.A00, fgF.A01, userSession, user, str);
    }
}
