package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ib5  reason: case insensitive filesystem */
public final class C57461Ib5 implements C331117Pq {
    public C55741Hmc A00;
    public C14044Tol A01;
    public final Context A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C252323ov A05;

    public final void DxV(C263754Nf r1) {
    }

    public final void Dxx(C263754Nf r1) {
    }

    public final void Dxy(C263754Nf r1) {
    }

    public final void Dyj(int i, int i2) {
    }

    public final void onCues(List list) {
    }

    public final void onLoop(int i) {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final void onProgressStateChanged(boolean z) {
    }

    public final void onStopVideo(String str, boolean z) {
        this.A00 = null;
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public final void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    public final void A00(boolean z) {
        String str;
        C14044Tol tol = this.A01;
        if (tol != null) {
            if (z) {
                str = "tapped";
            } else {
                str = "fragment_paused";
            }
            tol.A0A(str);
        }
        C55741Hmc hmc = this.A00;
        if (hmc != null) {
            C284945Oz r2 = hmc.A00.A00.A02;
            if (r2.getValue() != HM0.Scrubbing) {
                r2.Epw(HM0.Paused);
            }
        }
    }

    public final void onCompletion() {
        C14044Tol tol = this.A01;
        if (tol != null) {
            tol.A0D("finished", true);
        }
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        float f;
        C55741Hmc hmc = this.A00;
        if (hmc != null) {
            C55999Hr5 hr5 = hmc.A00.A00;
            C284945Oz r2 = hr5.A02;
            if (r2.getValue() != HM0.Scrubbing) {
                r2.Epw(HM0.Play);
                if (((long) (i2 - i)) <= 100) {
                    float f2 = (float) i2;
                    hr5.A03.Epw(new C53355Gmf(1.0f, f2, f2, 0));
                    1Eo.A05(AnonymousClass12T.A00.A04, new MFS(hr5, (AnonymousClass4D7) null, 37), hr5.A07);
                    return;
                }
                if (i2 == 0) {
                    f = 0.0f;
                } else {
                    f = ((float) i) / ((float) i2);
                }
                hr5.A03.Epw(new C53355Gmf(f, (float) i, (float) i2, 0));
            }
        }
    }

    public C57461Ib5(Context context, UserSession userSession, AnonymousClass4DU r3, C252323ov r4) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = r3;
        this.A05 = r4;
    }
}
