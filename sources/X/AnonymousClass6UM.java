package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6UM  reason: invalid class name */
public final class AnonymousClass6UM implements AnonymousClass6WJ {
    public final /* synthetic */ C2365134a A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ AnonymousClass32D A02;
    public final /* synthetic */ AnonymousClass3K2 A03;
    public final /* synthetic */ AnonymousClass3N2 A04;
    public final /* synthetic */ C309416Ye A05;

    public AnonymousClass6UM(C2365134a r1, Reel reel, AnonymousClass32D r3, AnonymousClass3K2 r4, AnonymousClass3N2 r5, C309416Ye r6) {
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = reel;
        this.A04 = r5;
    }

    public final void DaE(float f) {
        this.A04.CLE();
    }

    public final void Dfo(String str) {
        IllegalStateException illegalStateException;
        AnonymousClass6UX r13;
        C2365134a r3 = this.A00;
        C227812jx r5 = r3.A0D;
        if (!r5.isResumed() || !C2365134a.A06(r5, r3)) {
            onCancel();
            return;
        }
        C309416Ye r7 = this.A05;
        AnonymousClass3K2 r8 = this.A03;
        AnonymousClass32D r6 = this.A02;
        Reel reel = this.A01;
        boolean A0d = reel.A0d();
        boolean A0g = reel.A0g();
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedReelTrayController.launchReelViewer", 120708519);
        }
        try {
            UserSession userSession = r3.A0F;
            AnonymousClass3BQ r9 = AnonymousClass3BQ.MAIN_FEED_TRAY;
            boolean A012 = C315676kK.A01(userSession, r9);
            1OI A002 = 1OH.A00(userSession);
            1OI.A05(A002, "STORY_CLICKED");
            1OI.A04(A002, "Story Clicked, in-flight requests cancelled");
            C2372236u.A00(userSession).A06(AnonymousClass05K.A0Y);
            if (A0d || A0g || A012) {
                r3.A09 = true;
                r3.A02 = new ReelViewerConfig(r6);
                r7.A03 = new ReelViewerConfig(r6);
                C2365334c r10 = r3.A0P;
                FragmentActivity requireActivity = r5.requireActivity();
                UserSession userSession2 = r10.A0B;
                if (1NN.A00(1NM.A00(userSession2))) {
                    AnonymousClass0iw r0 = r10.A0A;
                    RecyclerView recyclerView = r10.A03;
                    if (recyclerView != null) {
                        AnonymousClass0iw r16 = r0;
                        r13 = new C14513TxZ(requireActivity, recyclerView, r16, userSession2, r9, r3, false);
                    } else {
                        illegalStateException = new IllegalStateException("Required value was null.");
                        throw illegalStateException;
                    }
                } else {
                    AnonymousClass0iw r02 = r10.A0A;
                    RecyclerView recyclerView2 = r10.A03;
                    if (recyclerView2 != null) {
                        AnonymousClass0iw r162 = r02;
                        r13 = new AnonymousClass6UW(requireActivity, recyclerView2, r162, userSession2, r9, r3, false);
                    } else {
                        illegalStateException = new IllegalStateException("Required value was null.");
                        throw illegalStateException;
                    }
                }
                r3.A05 = r13;
                r7.A07(r13.A03);
                r7.A05(r8.A0x);
                AnonymousClass6W8.A01(r5.getActivity(), r7.A00(), userSession).A0A(r5.getActivity(), 60574);
            } else {
                ReelViewerConfig reelViewerConfig = new ReelViewerConfig(r6);
                r3.A02 = reelViewerConfig;
                r7.A03 = reelViewerConfig;
                ReelViewerFragment A013 = C18280Vp0.A01(r7.A00());
                C309516Yo r1 = new C309516Yo(r5.requireActivity(), userSession);
                r1.A0B((Bundle) null, A013);
                r1.A0A = "ReelViewerFragment.BACK_STACK_NAME";
                r1.A04();
            }
            this.A04.Eu3(r3.A0E);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1814608441);
            }
        }
    }

    public final void onCancel() {
        this.A03.A0R();
        this.A04.Eu3(this.A00.A0E);
    }
}
