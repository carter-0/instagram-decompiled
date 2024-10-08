package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mm0  reason: case insensitive filesystem */
public final class C67324Mm0 implements AnonymousClass4DU, C331117Pq {
    public static final String __redex_internal_original_name = "NotesVideoPlayer";
    public C14044Tol A00;
    public 0sP A01;
    public 0sL A02;
    public final String A03;
    public final Context A04;
    public final UserSession A05;

    public C67324Mm0(Context context, UserSession userSession, String str) {
        0qQ.A0B(userSession, 2);
        this.A04 = context;
        this.A05 = userSession;
        this.A03 = str;
    }

    public final void A01(1Xj r18, C242423Ua r19) {
        C242423Ua r2 = r19;
        0qQ.A0B(r2, 1);
        if (this.A00 == null) {
            Context context = this.A04;
            UserSession userSession = this.A05;
            C14044Tol tol = new C14044Tol(context, userSession, new C252313ou(userSession, this, (String) null, false), this, this.A03);
            this.A00 = tol;
            tol.A02();
        }
        C14044Tol tol2 = this.A00;
        if (tol2 != null) {
            1Xj r0 = r18;
            tol2.A09(r2, r0.A2D(), new C263754Nf((Object) r0, 0), r0.A0M, this.A03, 0.0f, -1, 0, true, true);
        }
    }

    public final void A02(String str) {
        0qQ.A0B(str, 0);
        C14044Tol tol = this.A00;
        if (tol != null) {
            tol.A0B(str);
        }
        this.A00 = null;
    }

    public final /* synthetic */ void DxV(C263754Nf r1) {
    }

    public final /* synthetic */ void Dxx(C263754Nf r1) {
    }

    public final void Dxy(C263754Nf r2) {
        0qQ.A0B(r2, 0);
        0sP r0 = this.A01;
        if (r0 != null) {
            r0.invoke(r2);
        }
    }

    public final /* synthetic */ void Dyj(int i, int i2) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* synthetic */ void onCompletion() {
    }

    public final /* synthetic */ void onCues(List list) {
    }

    public final /* synthetic */ void onLoop(int i) {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final /* synthetic */ void onProgressStateChanged(boolean z) {
    }

    public final /* synthetic */ void onProgressUpdate(int i, int i2, boolean z) {
    }

    public final /* synthetic */ void onStopVideo(String str, boolean z) {
    }

    public final /* synthetic */ void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoPlayerError(C263754Nf r2, String str) {
        0qQ.A0B(r2, 0);
        0sL r0 = this.A02;
        if (r0 != null) {
            r0.invoke(r2, str);
        }
    }

    public final /* synthetic */ void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    public final String getModuleName() {
        return this.A03;
    }

    public static void A00(C67324Mm0 mm0, String str, String str2) {
        String A0R = 002.A0R(str, str2);
        0qQ.A0B(A0R, 0);
        C14044Tol tol = mm0.A00;
        if (tol != null) {
            tol.A0A(A0R);
        }
    }
}
