package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.M3m  reason: case insensitive filesystem */
public final class C65897M3m implements Runnable {
    public final /* synthetic */ K67 A00;

    public C65897M3m(K67 k67) {
        this.A00 = k67;
    }

    public final void run() {
        String str;
        AnonymousClass8JI r3;
        K67 k67 = this.A00;
        String str2 = k67.A0E;
        if (str2 != null) {
            C65707LyM lyM = k67.A06;
            if (lyM != null) {
                0qQ.A0A(str2);
                lyM.A00(str2);
                return;
            }
        } else {
            String str3 = k67.A0D;
            if (str3 != null) {
                C65707LyM lyM2 = k67.A06;
                if (lyM2 != null) {
                    0qQ.A0A(str3);
                    UserSession userSession = lyM2.A02;
                    AnonymousClass3Q2 A0M = JTQ.A0M(userSession, str3);
                    if (A0M == null) {
                        return;
                    }
                    if (A0M.A0r != null) {
                        ViewGroup viewGroup = (ViewGroup) AnonymousClass7TF.A0G(lyM2.A01, R.id.vvp_people_tagging_video_preview_container);
                        viewGroup.setVisibility(0);
                        Context context = lyM2.A00;
                        int A06 = AnonymousClass7TE.A06((float) (0nA.A08(context) / 2), 0.5625f);
                        int A08 = 0nA.A08(context) / 2;
                        AnonymousClass8J0 r0 = A0M.A12;
                        if (r0 != null) {
                            r3 = r0.A03;
                        } else {
                            r3 = null;
                        }
                        new LWf(context, viewGroup, userSession, (ConstrainedTextureView) null, A0M, (C62320sa) null, 0.0f, A06, A08, !AnonymousClass7TF.A1W(r3, AnonymousClass8JI.REMIX), true);
                        RoundedCornerFrameLayout roundedCornerFrameLayout = lyM2.A03.A09;
                        if (roundedCornerFrameLayout != null) {
                            roundedCornerFrameLayout.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    ClipInfo clipInfo = A0M.A1N;
                    if (clipInfo != null && (str = clipInfo.A0F) != null) {
                        lyM2.A00(str);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("clipsPeopleTaggingController");
        throw AnonymousClass00P.createAndThrow();
    }
}
