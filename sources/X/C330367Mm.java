package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;

/* renamed from: X.7Mm  reason: invalid class name and case insensitive filesystem */
public final class C330367Mm extends C252233om implements C230222pE {
    public ReelViewerConfig A00 = ReelViewerConfig.A00();
    public C317766nn A01;
    public AnonymousClass6UX A02;
    public AnonymousClass6VJ A03;
    public final Activity A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final UserSession A06;
    public final C330357Ml A07;
    public final AnonymousClass3BQ A08;
    public final AnonymousClass3PP A09;

    public final void A00(OMU omu, 1Ns r11, 1aV r12, String str, String str2, boolean z, boolean z2) {
        String str3;
        AnonymousClass6VJ r0 = this.A03;
        if (r0 == null || !r0.A07) {
            UserSession userSession = this.A06;
            ReelStore A052 = 1OP.A05(userSession);
            String str4 = userSession.A06;
            User CCd = r11.CCd();
            if (CCd != null) {
                str3 = CCd.getId();
            } else {
                str3 = null;
            }
            Reel A0K = A052.A0K(r11, str2, 0qQ.A0K(str4, str3));
            Activity activity = this.A04;
            AnonymousClass3PP r6 = this.A09;
            if (r6 != null) {
                AnonymousClass6VJ A042 = 1OP.A04(activity, userSession, A0K, new PJM(omu, this, A0K, r12), r6, "", -1);
                A042.A04 = str;
                A042.A06 = z;
                A042.A0A = z2;
                A042.A04();
                this.A03 = A042;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void DFj(Reel reel, AnonymousClass6UY r3) {
        this.A02 = null;
    }

    public final /* synthetic */ void DcC(Reel reel) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }

    public final void onDestroyView() {
        this.A02 = null;
        C317766nn r0 = this.A01;
        if (r0 != null) {
            r0.A01 = null;
            r0.A00 = null;
            this.A01 = null;
        }
    }

    public C330367Mm(Activity activity, UserSession userSession, C330357Ml r5, AnonymousClass3BQ r6) {
        this.A06 = userSession;
        this.A04 = activity;
        this.A07 = r5;
        this.A08 = r6;
        1OP r0 = 1OP.$redex_init_class;
        this.A09 = AnonymousClass3PO.A00(userSession);
    }
}
