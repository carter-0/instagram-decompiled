package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Jbe  reason: case insensitive filesystem */
public final class C59915Jbe implements C66529MVh {
    public final /* synthetic */ JW7 A00;

    public final void DES(String str) {
        0qQ.A0B(str, 0);
        JW1.A00(this.A00.A0z).A09(str);
    }

    public final void DaQ(int i, int i2) {
    }

    public final void Dmo(JXT jxt) {
        ViewPropertyAnimator animate;
        float f;
        ViewPropertyAnimator duration;
        View view;
        0qQ.A0B(jxt, 0);
        JXT jxt2 = JXT.PAUSED;
        JW7 jw7 = this.A00;
        if (jxt != jxt2) {
            View view2 = jw7.A08;
            if (view2 != null) {
                view2.setVisibility(4);
                animate = view2.animate();
                if (animate != null) {
                    f = 0.0f;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (jw7.A0K == AnonymousClass05K.A0C && (view = jw7.A08) != null) {
            view.setVisibility(0);
            animate = view.animate();
            if (animate != null) {
                f = 1.0f;
            } else {
                return;
            }
        } else {
            return;
        }
        ViewPropertyAnimator alpha = animate.alpha(f);
        if (alpha != null && (duration = alpha.setDuration(300)) != null) {
            duration.start();
        }
    }

    public C59915Jbe(JW7 jw7) {
        this.A00 = jw7;
    }

    public final void DO5(VideoPreviewView videoPreviewView, int i, int i2) {
        AnonymousClass514 r0;
        View inflate;
        AnonymousClass514 r02;
        JW7 jw7 = this.A00;
        jw7.A0T = AnonymousClass7TF.A1S(i, i2);
        jw7.A13.setVisibility(DbW.A01(JW7.A0P(jw7) ? 1 : 0));
        if (jw7.A0T || jw7.A12.A03 != AnonymousClass05K.A0C) {
            r0 = AnonymousClass514.SQUARE;
            JW7.A0D(r0, jw7, false);
        } else {
            if (jw7.getSelectedMediaCount() <= 1) {
                if (JW7.A0T(jw7)) {
                    r02 = C63123Krr.A00(((float) i) / ((float) i2));
                }
                r02 = AnonymousClass514.FOUR_BY_FIVE;
            } else if (!jw7.A14.A0M()) {
                if (i2 <= i) {
                    r02 = AnonymousClass514.SQUARE;
                }
                r02 = AnonymousClass514.FOUR_BY_FIVE;
            } else {
                r0 = JWE.A00(jw7).A06;
                r0.getClass();
                JW7.A0D(r0, jw7, false);
            }
            JW7.A0D(r02, jw7, true);
        }
        jw7.A0a(AnonymousClass05K.A01, false);
        CreationSession A002 = JWE.A00(jw7);
        AnonymousClass36W r1 = A002.A0A;
        r1.getClass();
        if (r1 != AnonymousClass36W.PROFILE_PHOTO) {
            AnonymousClass36W r12 = A002.A0A;
            r12.getClass();
            if (r12 != AnonymousClass36W.GROUP_PHOTO) {
                return;
            }
        }
        ViewGroup viewGroup = jw7.A0n;
        ViewStub A0F = DbS.A0F(viewGroup, R.id.punched_overlay_stub);
        if (A0F == null) {
            inflate = AnonymousClass7TF.A0F(viewGroup, R.id.punched_overlay_view);
        } else {
            inflate = A0F.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.PunchedOverlayView");
        }
        PunchedOverlayView punchedOverlayView = (PunchedOverlayView) inflate;
        punchedOverlayView.A01 = AnonymousClass7TF.A03(jw7.getContext(), R.attr.cropHighlightBackground) | -872415232;
        punchedOverlayView.post(new M2O(punchedOverlayView));
    }

    public final void DXS(VideoPreviewView videoPreviewView) {
        JW7 jw7 = this.A00;
        jw7.A0a(AnonymousClass05K.A0C, true);
        C59862Jae.A00(true, MediaStreamTrack.VIDEO_TRACK_KIND);
        C59847JaN A002 = JW1.A00(jw7.A0z);
        A002.A04 = A002.A0B.A02(288429634, A002.A04);
    }

    public final void DXT(VideoPreviewView videoPreviewView) {
        this.A00.A0a(AnonymousClass05K.A0C, true);
        C59862Jae.A00(false, MediaStreamTrack.VIDEO_TRACK_KIND);
    }

    public final void DZ7(VideoPreviewView videoPreviewView, float f) {
        float A002;
        JW7 jw7 = this.A00;
        IgCaptureVideoPreviewView igCaptureVideoPreviewView = jw7.A0J;
        if (igCaptureVideoPreviewView != null && igCaptureVideoPreviewView.A09()) {
            JX2 jx2 = jw7.A12;
            if (jx2.A03 == AnonymousClass05K.A0C) {
                A002 = f;
            } else {
                A002 = jx2.A00();
            }
            jw7.A04 = A002;
            if (f < 0.5525f || f > 1.92f) {
                0kD.A0A("GalleryPickerView", 002.A0N("Invalid aspect ratio: ", f), (Throwable) null);
            }
        }
    }
}
