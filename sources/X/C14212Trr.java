package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Trr  reason: case insensitive filesystem */
public final class C14212Trr implements AnonymousClass6WJ {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ AnonymousClass3BQ A01;
    public final /* synthetic */ AnonymousClass32A A02;
    public final /* synthetic */ AnonymousClass3K2 A03;
    public final /* synthetic */ C46470DfY A04;
    public final /* synthetic */ C309416Ye A05;

    public final void DaE(float f) {
    }

    public C14212Trr(Reel reel, AnonymousClass3BQ r2, AnonymousClass32A r3, AnonymousClass3K2 r4, C46470DfY dfY, C309416Ye r6) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = reel;
        this.A04 = dfY;
        this.A05 = r6;
        this.A03 = r4;
    }

    public final void Dfo(String str) {
        C46470DfY dfY;
        AnonymousClass32A r4 = this.A02;
        AnonymousClass329 r6 = r4.A0L;
        if (!r6.isResumed()) {
            onCancel();
            return;
        }
        C20960X6n x6n = r4.A06;
        if (x6n != null) {
            x6n.DVC();
        }
        UserSession userSession = r4.A0K;
        AnonymousClass3BQ r2 = this.A01;
        if (C315676kK.A01(userSession, r2) || this.A00.A0g()) {
            dfY = this.A04;
            AnonymousClass32A.A02(r2, r4, this.A03, dfY, this.A05);
        } else {
            dfY = this.A04;
            C309416Ye r1 = this.A05;
            dfY.A00(r4.A0J);
            Bundle A002 = r1.A00();
            ReelViewerFragment reelViewerFragment = new ReelViewerFragment();
            reelViewerFragment.setArguments(A002);
            FragmentActivity activity = r6.getActivity();
            activity.getClass();
            C309516Yo r12 = new C309516Yo(activity, userSession);
            r12.A0E(reelViewerFragment);
            r12.A0A = C273654mx.A00(36);
            r12.A07 = r4.A01;
            r12.A0B = r4.A09;
            AnonymousClass0iw r0 = r4.A02;
            if (r0 != null) {
                r12.A09 = r0;
            }
            r12.A04();
        }
        dfY.A00(r4.A0J);
    }

    public final void onCancel() {
        this.A04.A00(this.A02.A0J);
    }
}
