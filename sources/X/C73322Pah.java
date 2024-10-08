package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.camera.DirectCameraViewModel;

/* renamed from: X.Pah  reason: case insensitive filesystem */
public final class C73322Pah implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ 28D A01;
    public final /* synthetic */ C68445NIi A02;

    public C73322Pah(View view, 28D r2, C68445NIi nIi) {
        this.A02 = nIi;
        this.A00 = view;
        this.A01 = r2;
    }

    public final void run() {
        C68445NIi nIi = this.A02;
        AnonymousClass0eM r2 = nIi.A07;
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        FragmentActivity requireActivity = nIi.requireActivity();
        AnonymousClass2Ep r10 = nIi.A03;
        if (r10 == null) {
            0qQ.A0F("thread");
            throw AnonymousClass00P.createAndThrow();
        }
        DirectCameraViewModel A012 = C71046OaO.A01(requireActivity, A0l, (C254933tI) null, r10, r10.C6C(), 0);
        RectF A0Y = AnonymousClass7TE.A0Y();
        int[] iArr = new int[2];
        View view = this.A00;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        A0Y.set((float) i, (float) iArr[1], (float) (i + view.getWidth()), (float) (iArr[1] + view.getHeight()));
        Bundle A0B = C66582MXn.A0B(A012);
        28D r1 = this.A01;
        0qQ.A0B(r1, 0);
        C360908fL.A00(r1);
        A0B.putSerializable("DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT", r1);
        A0B.putBoolean("DirectVisualReplyFragment.REPLY_CAM_ARG_SKIP_ENTRY_ANIMATION", true);
        A0B.putParcelable(AnonymousClass000.A00(24), A0Y);
        A0B.putBoolean("DirectVisualTimelineEnabled.REPLY_CAM_ARG_IS_VISUAL_TIMELINE_ENABLED", true);
        AnonymousClass9PY r3 = new AnonymousClass9PY();
        AnonymousClass0Dg.A00(A0B, DbT.A0X(r2));
        r3.setArguments(A0B);
        0s1 A0C = DbW.A0C(nIi);
        A0C.A0C(r3, nIi.A05, R.id.child_camera_fragment_holder);
        A0C.A00();
    }
}
