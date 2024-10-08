package X;

import android.app.Activity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.HwQ  reason: case insensitive filesystem */
public abstract class C56313HwQ {
    public static final void A00(Activity activity, UserSession userSession, 1Xj r6, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_scc_upsell_event");
        A0e.AAJ(TraceFieldType.AdhocEventName, "adjust_scc_clicked");
        A0e.AAJ("tab", str2);
        A0e.AAJ("style", str);
        String A2n = r6.A2n();
        if (A2n != null) {
            A0e.A9F("ig_media_id", AnonymousClass7TE.A10(A2n));
            A0e.Cgf();
            C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(560), AnonymousClass7TE.A1E());
            IgBloksScreenConfig A0N = DbS.A0N(userSession);
            DbS.A18(activity, A0N, 2131973115);
            0qQ.A0A(A04);
            DbU.A0w(activity, C49891FBs.A00(A0N, A04), userSession, ModalActivity.class, "bloks");
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A01(Activity activity, UserSession userSession, Integer num) {
        String str;
        if (num.intValue() != 0) {
            str = "not_interested";
        } else {
            str = "overflow_menu";
        }
        C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(2890), DbY.A0m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str));
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        DbS.A18(activity, A0N, 2131974679);
        0qQ.A0A(A04);
        DbU.A0w(activity, C49891FBs.A00(A0N, A04), userSession, ModalActivity.class, "bloks");
    }
}
