package X;

import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.Map;

/* renamed from: X.Oi0  reason: case insensitive filesystem */
public final class C71304Oi0 implements View.OnClickListener {
    public final /* synthetic */ C314436iG A00;

    public C71304Oi0(C314436iG r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        IllegalStateException illegalStateException;
        int i;
        String str;
        String str2;
        DirectCameraViewModel A01;
        int A05 = AnonymousClass0fD.A05(-59905565);
        C314436iG r2 = this.A00;
        C314426iF r3 = r2.A0o;
        C250973mM r15 = r2.A08;
        if (r15 != null) {
            C255773uh r7 = r2.A07;
            if (r7 != null) {
                if (r2.A0M) {
                    str = "story_remix_reply";
                } else if (r2.A0O) {
                    str = AnonymousClass000.A00(372);
                } else {
                    str = "story_camera_reply";
                }
                0qQ.A0A(view);
                RectF A0F = 0nA.A0F(view);
                FragmentActivity activity = r3.A02.getActivity();
                if (activity != null) {
                    C273384mU r5 = r3.A07;
                    ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r5;
                    C313056fm r1 = reelViewerFragment.mViewPager;
                    if (r1 != null && r1.isIdle()) {
                        1Xj r8 = r7.A0b;
                        if (r8 != null && "story_remix_reply".equals(str)) {
                            1E7.A00(r3.A03).A03(r8);
                        }
                        if (r15.A0H.A0W instanceof AnonymousClass6YJ) {
                            A01 = AnonymousClass3PQ.A00(r7, str);
                        } else {
                            A01 = AnonymousClass3PQ.A01(r15, str);
                        }
                        C273434mZ r13 = r3.A04;
                        C70354O3g.A00(activity, A0F, 28D.A52, r3.A03, r13, A01, r15, (Integer) null, str, (float) r5.BS0(), reelViewerFragment.A2X);
                    }
                }
                if (r2.A0M) {
                    UserSession userSession = r2.A0e;
                    AnonymousClass0iw r32 = r2.A0d;
                    C255773uh r12 = r2.A07;
                    if (r12 != null) {
                        str2 = r12.A0j;
                    } else {
                        str2 = null;
                    }
                    C67000MgY.A00(r32, userSession, (Long) null, "entrypoint", "tap", AnonymousClass000.A00(797), str2, (Map) null);
                }
                AnonymousClass0fD.A0C(-1139651607, A05);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -1160964781;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -721635815;
        }
        AnonymousClass0fD.A0C(i, A05);
        throw illegalStateException;
    }
}
