package X;

import android.content.Context;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.Aj4  reason: case insensitive filesystem */
public final /* synthetic */ class C40773Aj4 implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;

    public /* synthetic */ C40773Aj4(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass8BA r4 = this.A00;
        C317876nz r0 = C317876nz.A0a;
        C317876nz A06 = C317886o0.A06(C318046oG.VOTING_INFO_CENTER, "voting_info_center_preview_sticker");
        Context A0T = AnonymousClass7TE.A0T(r4);
        TargetViewSizeProvider targetViewSizeProvider = r4.A0z;
        AnonymousClass7TG.A1N(A0T, targetViewSizeProvider);
        C380099Wq r2 = new C380099Wq(A0T, targetViewSizeProvider);
        C39890ADo A002 = C39890ADo.A00();
        A002.A0Q = false;
        AnonymousClass8BG.A00(r2, A06, r4, A002);
    }
}
