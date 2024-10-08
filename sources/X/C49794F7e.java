package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.F7e  reason: case insensitive filesystem */
public abstract class C49794F7e {
    public static final void A00(Context context, UserSession userSession, 1vn r18, String str, 0sP r20, 0sP r21) {
        String fbidV2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        User A0Q = AnonymousClass7TF.A0Q(userSession2);
        AnonymousClass16q C31 = A0Q.A03.C31();
        if (C31 != null && AnonymousClass7TF.A1Y(C31.Cco(), true) && (fbidV2 = A0Q.A03.getFbidV2()) != null) {
            2IS A04 = C41845B3m.A04();
            2IS A042 = C41845B3m.A04();
            A04.A04(AnonymousClass000.A00(1869), fbidV2);
            A04.A04(AnonymousClass000.A00(364), "PENDING");
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(DbU.A0J(A04, "setting_type", str), "GetPendingSettingChangeRequest", A04.getParamsCopy(), A042.getParamsCopy(), BnY.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_get_setting_change_requests", AnonymousClass7TE.A1C());
            1vn r3 = r18;
            r3.ATL(FS3.A00, new FSI(context, r3, fbidV2, str, r20, r21), pandoGraphQLRequest);
        }
    }

    public static final void A01(AnonymousClass4DH r17, UserSession userSession, String str, String str2, String str3, C62320sa r22, C62320sa r23) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        String str4 = str2;
        0qQ.A0B(str4, 2);
        AnonymousClass16q C31 = DbX.A0m(userSession2).C31();
        C62320sa r16 = r23;
        if (C31 == null || !AnonymousClass7TF.A1Y(C31.Cco(), true)) {
            r16.invoke();
            return;
        }
        String str5 = str;
        String A0g = 002.A0g("supervised_user_", str5, "_change_permissions_required");
        AnonymousClass4DH r12 = r17;
        C229382nI A03 = C229382nI.A03(r12, userSession2, (2el) null);
        String str6 = str3;
        C62320sa r172 = r22;
        if (182.A06(0Tu.A05, userSession2, 36320949284447203L)) {
            HashMap A1E = AnonymousClass7TE.A1E();
            HashMap A1E2 = AnonymousClass7TE.A1E();
            BitSet A0w = DbS.A0w(4);
            A1E.put("new_setting_value", str6);
            A0w.set(0);
            A1E.put("previous_setting_value", str4);
            A0w.set(1);
            A1E.put("session_store_permissions_required_key", A0g);
            A0w.set(2);
            A1E.put("setting_type", str5);
            A0w.set(3);
            FragmentActivity requireActivity = r12.requireActivity();
            FVT fvt = new FVT(r12, userSession2, A0g, r16, r22);
            if (A0w.nextClearBit(0) >= 4) {
                FBO.A00(fvt, "com.bloks.www.ig.supervised_user_aware.update_setting.async", A1E, A1E2).A01(requireActivity, A03);
                return;
            }
            throw DbU.A0i();
        }
        C360678ey A02 = C359988do.A02((AnonymousClass1O9) null, userSession2, "com.instagram.portable_settings.supervised_user_aware_update_settings_async_action", 0Yt.A07(AnonymousClass7TH.A0h("new_setting_value", str6, AnonymousClass7TE.A1L("session_store_permissions_required_key", A0g), AnonymousClass7TE.A1L("setting_type", str5), AnonymousClass7TE.A1L("previous_setting_value", str4))));
        A02.A00(new E80(r12, A03, userSession2, A0g, r16, r172));
        r12.schedule(A02);
    }
}
