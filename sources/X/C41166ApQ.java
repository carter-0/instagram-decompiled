package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.camera.DirectCameraViewModel;

/* renamed from: X.ApQ  reason: case insensitive filesystem */
public final class C41166ApQ implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C384909i5 A02;

    public C41166ApQ(Bundle bundle, View view, C384909i5 r3) {
        this.A02 = r3;
        this.A01 = view;
        this.A00 = bundle;
    }

    public final void run() {
        Bundle bundle;
        C384909i5 r6 = this.A02;
        if (r6.mView != null) {
            View view = this.A01;
            Bundle bundle2 = this.A00;
            AnonymousClass80D A002 = AnonymousClass80D.A00();
            WUP wup = new WUP(r6, 6);
            wup.getClass();
            A002.A0l = wup;
            AnonymousClass0eM r3 = r6.A0G;
            UserSession A0l = AnonymousClass7TE.A0l(r3);
            A0l.getClass();
            A002.A0S = A0l;
            Activity rootActivity = r6.getRootActivity();
            rootActivity.getClass();
            A002.A05 = rootActivity;
            A002.A0M = r6;
            AnonymousClass80I r4 = AnonymousClass80H.A02;
            UserSession A0l2 = AnonymousClass7TE.A0l(r3);
            boolean z = true;
            AnonymousClass80M r1 = AnonymousClass80M.A00;
            AnonymousClass80D.A08(A0l2, r4, r1, A002);
            A002.A3h = true;
            A002.A0R = r6.volumeKeyPressController;
            AnonymousClass80C r0 = r6.A01;
            r0.getClass();
            A002.A0t = r0;
            0qQ.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.getClass();
            A002.A09 = viewGroup;
            A002.A0B = 28D.A2T;
            A002.A0O = r6;
            A002.A0V = C358098aM.A00(r1, new C358088aL[0]);
            A002.A3y = true;
            A002.A3F = false;
            A002.A28 = AnonymousClass05K.A01;
            DirectCameraViewModel directCameraViewModel = r6.A02;
            if (directCameraViewModel == null) {
                0qQ.A0F("directCameraViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            A002.A1I = directCameraViewModel;
            A002.A3s = true;
            0lg A0L = AnonymousClass7TF.A0L(r3, 0);
            0Tu r42 = 0Tu.A05;
            A002.A32 = 182.A06(r42, A0L, 36323625050189133L);
            A002.A3t = true;
            A002.A03 = 7;
            A002.A47 = false;
            A002.A2P = r6.A06;
            A002.A17 = new AnonymousClass80F(2131975153, 2131975154, false, true, true);
            A002.A3J = true;
            A002.A3Q = false;
            if (bundle2 == null || !bundle2.getBoolean("SAVE_INSTANCE_KEY_WAS_SHOWING_MG")) {
                z = false;
            }
            A002.A40 = z;
            A002.A48 = 182.A06(r42, AnonymousClass7TF.A0L(r3, 0), 36323625049140543L);
            A002.A0e = new C342837pF(r6.requireActivity(), AnonymousClass7TE.A0l(r3), new C40300AZp(r6), "stories_precapture_camera");
            r6.A00 = new AnonymousClass80Q(A002);
        }
        AnonymousClass80Q r2 = r6.A00;
        if (r2 != null && (bundle = this.A00) != null) {
            r2.A00.A07 = bundle.getBoolean("SAVE_INSTANCE_KEY_DID_USER_CLOSE_FEED_GALLERY_PICKER");
        }
    }
}
