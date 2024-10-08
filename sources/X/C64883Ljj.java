package X;

import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager;
import com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Ljj  reason: case insensitive filesystem */
public abstract class C64883Ljj implements C66529MVh {
    public final void DXT(VideoPreviewView videoPreviewView) {
    }

    public final void Dmo(JXT jxt) {
    }

    public final void DES(String str) {
        MQD mqd;
        if (this instanceof KIK) {
            KIK kik = (KIK) this;
            if (kik.A00 == 0 && (mqd = ((GalleryPreviewMultiselectPager) kik.A01).A00) != null) {
                JW7 jw7 = ((C64978LlH) mqd).A00;
                jw7.A0a(AnonymousClass05K.A0C, true);
                C59862Jae.A00(false, MediaStreamTrack.VIDEO_TRACK_KIND);
                JW1.A00(jw7.A0z).A09(002.A0R("Failed to load from pager: ", str));
            }
        }
    }

    public final void DXS(VideoPreviewView videoPreviewView) {
        MQD mqd;
        if (this instanceof KIK) {
            KIK kik = (KIK) this;
            if (kik.A00 == 0 && (mqd = ((GalleryPreviewMultiselectPager) kik.A01).A00) != null) {
                JW7 jw7 = ((C64978LlH) mqd).A00;
                jw7.A0a(AnonymousClass05K.A0C, true);
                C59862Jae.A00(true, MediaStreamTrack.VIDEO_TRACK_KIND);
                C59847JaN A00 = JW1.A00(jw7.A0z);
                A00.A04 = A00.A0B.A02(288429634, A00.A04);
            }
        }
    }

    public final void DZ7(VideoPreviewView videoPreviewView, float f) {
        if (this instanceof KIL) {
            KIL kil = (KIL) this;
            C61445K7x.A00(kil.A00).EOx(f);
            kil.A01.A00 = f;
            if (!C64138LPn.A02(0, f, false)) {
                0kD.A01(C61445K7x.__redex_internal_original_name, 002.A0N("Invalid aspect ratio: ", f));
            }
        } else if (this instanceof KIK) {
            KIK kik = (KIK) this;
            if (3 - kik.A00 == 0) {
                IgCaptureVideoPreviewView igCaptureVideoPreviewView = ((C61411K6i) kik.A01).A08;
                if (igCaptureVideoPreviewView == null) {
                    0qQ.A0F("videoPreview");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    igCaptureVideoPreviewView.setAspectRatio(0.75f);
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r1 = "videoTimer";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DaQ(int r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.KIK
            if (r0 == 0) goto L_0x000c
            r1 = r4
            X.KIK r1 = (X.KIK) r1
            int r0 = r1.A00
            switch(r0) {
                case 1: goto L_0x002e;
                case 2: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r2 = r1.A01
            X.K6r r2 = (X.C61420K6r) r2
            android.widget.SeekBar r0 = r2.A01
            java.lang.String r1 = "seekBar"
            if (r0 == 0) goto L_0x0038
            r0.setProgress(r5)
            android.widget.SeekBar r0 = r2.A01
            if (r0 == 0) goto L_0x0038
            r0.setMax(r6)
            android.widget.TextView r2 = r2.A02
            if (r2 == 0) goto L_0x0064
            long r0 = (long) r5
            java.lang.String r0 = X.1G0.A02(r0)
            r2.setText(r0)
            return
        L_0x002e:
            java.lang.Object r3 = r1.A01
            X.K6t r3 = (X.C61422K6t) r3
            android.widget.SeekBar r0 = r3.A04
            if (r0 != 0) goto L_0x0040
            java.lang.String r1 = "seekBar"
        L_0x0038:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0040:
            r0.setProgress(r5)
            android.widget.TextView r2 = r3.A05
            if (r2 == 0) goto L_0x0064
            long r0 = (long) r5
            java.lang.String r0 = X.1G0.A02(r0)
            r2.setText(r0)
            int r0 = r3.A01
            if (r5 < r0) goto L_0x000c
            com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r0 = r3.A08
            if (r0 != 0) goto L_0x005a
            java.lang.String r1 = "videoPreviewView"
            goto L_0x0038
        L_0x005a:
            r0.A04()
            android.widget.ImageView r1 = r3.A03
            if (r1 != 0) goto L_0x0067
            java.lang.String r1 = "scrubberButton"
            goto L_0x0038
        L_0x0064:
            java.lang.String r1 = "videoTimer"
            goto L_0x0038
        L_0x0067:
            r0 = 2131237911(0x7f081c17, float:1.8092086E38)
            r1.setImageResource(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64883Ljj.DaQ(int, int):void");
    }
}
