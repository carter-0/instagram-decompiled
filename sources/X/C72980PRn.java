package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.ui.widget.volume.VolumeIndicator;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.PRn  reason: case insensitive filesystem */
public final class C72980PRn implements C331117Pq {
    public float A00 = -1.0f;
    public int A01 = -1;
    public long A02;
    public long A03;
    public C69224Nhe A04;
    public C14044Tol A05;
    public boolean A06;
    public boolean A07;
    public final UserSession A08;
    public final C69220Nha A09;
    public final String A0A;
    public final WeakReference A0B;
    public final DirectVisualMessageViewerController A0C;

    public final void DxV(C263754Nf r1) {
    }

    public final void onCues(List list) {
    }

    public final void onLoop(int i) {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final void onStopVideo(String str, boolean z) {
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    public final void A00(float f) {
        C14044Tol tol;
        int i = this.A01;
        if (i <= 0 || (tol = this.A05) == null || this.A04 == null) {
            this.A00 = f;
        } else {
            tol.A05(Math.max(0, (int) (f * ((float) i))), true);
        }
    }

    public final void Dxx(C263754Nf r3) {
        C14044Tol tol;
        if (this.A04 != null && (tol = this.A05) != null) {
            this.A01 = tol.A06.AzN();
            float f = this.A00;
            if (f >= 0.0f) {
                A00(f);
                this.A00 = -1.0f;
            }
        }
    }

    public final void Dxy(C263754Nf r5) {
        C14044Tol tol;
        C68167N3h n3h;
        C273404mW r0;
        if (this.A04 != null && (tol = this.A05) != null) {
            this.A01 = tol.A06.AzN();
            C69224Nhe nhe = this.A04;
            Object obj = nhe.A03;
            if (obj != null) {
                n3h = ((P0N) obj).A00;
            } else {
                n3h = null;
            }
            DirectVisualMessageViewerController directVisualMessageViewerController = this.A0C;
            DirectVisualMessageViewerController.A07(n3h, directVisualMessageViewerController.A0G, directVisualMessageViewerController, nhe.A00);
            DirectVisualMessageViewerController.A08(n3h, directVisualMessageViewerController);
            if (n3h != null && (r0 = directVisualMessageViewerController.A0P) != null) {
                r0.DaO(n3h);
            }
        }
    }

    public final void Dyj(int i, int i2) {
        C68167N3h n3h;
        C69224Nhe nhe = this.A04;
        if (nhe != null) {
            Object obj = nhe.A03;
            if (obj != null) {
                n3h = ((P0N) obj).A00;
            } else {
                n3h = null;
            }
            DirectVisualMessageViewerController directVisualMessageViewerController = this.A0C;
            VolumeIndicator volumeIndicator = directVisualMessageViewerController.volumeIndicator;
            if (volumeIndicator != null) {
                volumeIndicator.A00(i, i2);
            }
            DirectVisualMessageViewerController.A08(n3h, directVisualMessageViewerController);
        }
    }

    public final void onCompletion() {
        C68167N3h n3h;
        C69224Nhe nhe = this.A04;
        if (nhe != null) {
            Object obj = nhe.A03;
            if (obj != null) {
                n3h = ((P0N) obj).A00;
            } else {
                n3h = null;
            }
            this.A0C.DaM(n3h);
        }
    }

    public final void onProgressStateChanged(boolean z) {
        C69224Nhe nhe = this.A04;
        if (nhe != null) {
            OIU oiu = nhe.A01;
            int i = 0;
            if (!z) {
                i = 8;
                oiu.A0J.setVisibility(8);
                oiu = nhe.A01;
            }
            oiu.A04.setVisibility(i);
        }
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        C68167N3h n3h;
        C69224Nhe nhe = this.A04;
        if (nhe != null) {
            Object obj = nhe.A03;
            if (obj != null) {
                n3h = ((P0N) obj).A00;
            } else {
                n3h = null;
            }
            this.A0C.DaT(n3h, ((float) i) / ((float) i2));
        }
    }

    public C72980PRn(Context context, UserSession userSession, C69220Nha nha, DirectVisualMessageViewerController directVisualMessageViewerController, String str) {
        this.A0B = C51965G9l.A0v(context);
        this.A0C = directVisualMessageViewerController;
        this.A08 = userSession;
        this.A0A = str;
        this.A09 = nha;
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }
}
