package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.TrackSnippet;

public final class AN3 implements View.OnClickListener {
    public final /* synthetic */ C357918a4 A00;

    public AN3(C357918a4 r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        Integer num;
        int A05 = AnonymousClass0fD.A05(277251708);
        C357918a4 r4 = this.A00;
        UserSession userSession = r4.A0v;
        27r A01 = 27p.A01(userSession);
        if (A01.A0J() != null) {
            27r.A08(A01.A04.A0C, A01, "AUDIO_FILTERS_FROM_BROWSER_TAP", false);
        }
        C357918a4.A06(r4);
        View view2 = r4.A04;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = r4.A03;
        if (view3 != null) {
            num = Integer.valueOf(view3.getVisibility());
        } else {
            num = null;
        }
        r4.A0d = num;
        View view4 = r4.A03;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        C19500Wam wam = r4.A0Y;
        if (wam != null) {
            wam.A05.setEnabled(false);
        }
        BottomSheetViewController bottomSheetViewController = r4.A0K;
        if (bottomSheetViewController == null) {
            Context requireContext = r4.A0u.requireContext();
            ViewGroup viewGroup = r4.A08;
            if (viewGroup != null) {
                bottomSheetViewController = new BottomSheetViewController(requireContext, viewGroup, new C40391AbO(r4));
                r4.A0K = bottomSheetViewController;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        String str = "bottomSheetViewController";
        if (r4.A0J == null) {
            r4.A0J = new C61776KLp(r4.A0u, userSession, C357918a4.A00(r4), r4.A0x, new C63663L1z(r4), r4.A16);
        }
        AnonymousClass8II A002 = C357918a4.A00(r4);
        if (A002 != null) {
            MusicAssetModel musicAssetModel = r4.A0P;
            if (musicAssetModel != null) {
                TrackSnippet trackSnippet = r4.A0Q;
                if (trackSnippet != null) {
                    int i = trackSnippet.A01;
                    AnonymousClass8IJ r0 = r4.A0L;
                    A002.A07 = musicAssetModel;
                    A002.A01 = i;
                    AnonymousClass8II.A01(A002, r0);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        C61776KLp kLp = r4.A0J;
        if (kLp == null) {
            str = "audioFilterBottomSheetContentController";
        } else {
            bottomSheetViewController.A03 = kLp;
            BottomSheetViewController bottomSheetViewController2 = r4.A0K;
            if (bottomSheetViewController2 != null) {
                bottomSheetViewController2.A02();
                AnonymousClass0fD.A0C(1727389952, A05);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
