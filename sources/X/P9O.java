package X;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.user.model.User;
import java.util.List;

public final class P9O implements AnonymousClass7YQ {
    public final Context A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final C273434mZ A04;
    public final C62320sa A05;

    public P9O(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, C273434mZ r5, C62320sa r6) {
        DbW.A1N(fragment, 3, r5);
        this.A03 = userSession;
        this.A02 = fragmentActivity;
        this.A01 = fragment;
        this.A05 = r6;
        this.A04 = r5;
        this.A00 = fragmentActivity;
    }

    public final void Cq4(RectF rectF, 28D r28, CameraConfiguration cameraConfiguration, String str) {
        28D r8 = r28;
        0qQ.A0B(r8, 1);
        C333517Zg A0W = C66580MXl.A0W(this.A05);
        if (A0W != null) {
            AnonymousClass7S7 C6l = A0W.C6l();
            if (!C6l.CdE()) {
                0wb.A03("DirectThreadFragment.openExpiringMediaCamera", "mThread is null");
                return;
            }
            UserSession userSession = this.A03;
            DirectShareTarget C6Z = C6l.C6Z(this.A00);
            Long A002 = C330007Lb.A00(C66580MXl.A0Z(C6l));
            02V.A03(C6Z, "DirectShareTarget is null");
            AnonymousClass34S A003 = C71046OaO.A00(DbT.A14(C6Z));
            User A0j = DbT.A0j(userSession);
            List A14 = DbT.A14(C6Z);
            C6Z.A0S();
            AnonymousClass34S A022 = AnonymousClass3UE.A02((ImageUrl) null, A0j, (String) null, A14);
            DirectCameraViewModel directCameraViewModel = new DirectCameraViewModel((ImageUrl) A022.A00, (ImageUrl) A022.A01, C6Z, A002, DbT.A0y(C6Z), (String) A003.A01, (String) null, 6, !C6Z.A0S(), AnonymousClass7LY.A00(C6Z.A01), OZA.A00.A01(userSession, C6Z), AnonymousClass7TE.A1a(A003.A00));
            RectF rectF2 = rectF;
            C70033NwB.A00(rectF2, this.A01, this.A02, r8, userSession, (CameraConfiguration) null, (C254933tI) null, this.A04, directCameraViewModel, C6l.B8S(), AnonymousClass7TE.A0u(), C273654mx.A00(659), str, (String) null);
        }
    }
}
