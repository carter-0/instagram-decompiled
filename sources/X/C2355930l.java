package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.api.schemas.AudienceListIntf;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.30l  reason: invalid class name and case insensitive filesystem */
public final class C2355930l implements C2356030m {
    public static boolean A02;
    public final Activity A00;
    public final UserSession A01;

    public C2355930l(Activity activity, UserSession userSession) {
        0qQ.A0B(activity, 1);
        0qQ.A0B(userSession, 2);
        this.A00 = activity;
        this.A01 = userSession;
    }

    public final void A00(AnonymousClass4DH r7, C62574Ki7 ki7, int i, boolean z) {
        0qQ.A0B(r7, 0);
        Bundle bundle = new Bundle();
        bundle.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, ki7);
        bundle.putString(AnonymousClass000.A00(350), "not_eligible");
        bundle.putBoolean(AnonymousClass000.A00(183), z);
        AnonymousClass6W8 r0 = new AnonymousClass6W8(r7.getRootActivity(), bundle, this.A01, ModalActivity.class, C273654mx.A00(18));
        r0.A07();
        r0.A0D(r7, i);
    }

    public final void A01(AnonymousClass0iw r4, AnonymousClass4D6 r5, C49564Exz exz, User user, boolean z) {
        0sn r0;
        0qQ.A0B(r4, 3);
        0sn A1M = 0sr.A1M(new String[]{user.getId()});
        UserSession userSession = this.A01;
        if (z) {
            r0 = A1M;
            A1M = 0sn.A00;
        } else {
            r0 = 0sn.A00;
        }
        1OC A002 = C48773Ejw.A00(r4, userSession, r0, A1M);
        A002.A00 = new C47663EBx(this, exz, user, z);
        r5.schedule(A002);
    }

    public final void A02(AnonymousClass0iw r7, AnonymousClass4D6 r8, F24 f24, User user, Integer num) {
        0qQ.A0B(r7, 2);
        ArrayList A1M = 0sr.A1M(new String[]{user.getId()});
        1OC A012 = C49274EsH.A00.A01(r7, this.A01, num, A1M, new ArrayList());
        A012.A00 = new C47654EBo(this, f24, user);
        r8.schedule(A012);
    }

    public final void A03(AnonymousClass0iw r7, AnonymousClass4D6 r8, User user, Integer num) {
        0qQ.A0B(user, 1);
        A02(r7, r8, (F24) null, user, num);
    }

    public final void CfX(C62574Ki7 ki7, boolean z, boolean z2) {
        0qQ.A0B(ki7, 0);
        LPM.A01(this.A00, ki7, this.A01, z, z2);
    }

    public final void FMU(AnonymousClass4D6 r5, String str) {
        1NY r2 = new 1NY(this.A01, -2);
        r2.A04();
        r2.A0A(0mp.A06(C273654mx.A00(3005), new Object[]{str}));
        r2.A9m("audience", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        r2.A0Q(C61290K1b.class, C64024LJl.class);
        r2.A0R = true;
        1OC A0M = r2.A0M();
        A0M.A00 = new EBR(this);
        r5.schedule(A0M);
    }

    public final void A04(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("event_source", str3);
        bundle.putString(C273654mx.A00(277), str);
        bundle.putString("ranking_session_id", str2);
        Activity activity = this.A00;
        AnonymousClass6W8 r0 = new AnonymousClass6W8(activity, bundle, this.A01, ModalActivity.class, "feed_favorites");
        r0.A08();
        r0.A0C(activity);
    }

    public final void CfV() {
        LPM.A00(this.A00, (AudienceListIntf) null, this.A01);
    }

    public final void D6c(String str) {
        UserSession userSession = this.A01;
        Activity activity = this.A00;
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(activity, C250563lf.A0C(28D.A1x).A00(), userSession, TransparentModalActivity.class, "clips_camera");
        A022.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
        A022.A0C(activity);
    }
}
