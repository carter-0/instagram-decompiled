package X;

import com.instagram.ui.widget.shutterbutton.ShutterButton;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.AQx  reason: case insensitive filesystem */
public final class C40092AQx implements B2M {
    public final /* synthetic */ A8M A00;
    public final /* synthetic */ AH4 A01;

    public C40092AQx(A8M a8m, AH4 ah4) {
        this.A01 = ah4;
        this.A00 = a8m;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.7sc] */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void Dbz(A9S a9s) {
        String str;
        this.A01.A08.Ddr(new Object());
        C18417VrM vrM = this.A00.A00.A04;
        if (a9s != null) {
            C15331Uag.A00(vrM.A00, AnonymousClass7TE.A0t(a9s.A05), MediaStreamTrack.VIDEO_TRACK_KIND);
        }
        C15331Uag uag = vrM.A00;
        C17667Vby vby = uag.A06;
        if (vby == null) {
            str = "preCaptureUIController";
        } else {
            ShutterButton shutterButton = vby.A01;
            if (shutterButton != null) {
                shutterButton.DnW("ar_ads");
            }
            ShutterButton shutterButton2 = vby.A01;
            if (shutterButton2 != null) {
                shutterButton2.setInnerCircleAlpha(0.0f);
            }
            AnonymousClass7TF.A16(vby.A00);
            String str2 = uag.A0H;
            if (str2 == null) {
                str = "effectId";
            } else {
                C18417VrM.A00(vrM, str2);
                uag.A02().A02(C16612Uy8.VIDEO_CAPTURE_SUCCESS, "", (String) null);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.7sc] */
    public final void Dc0(Exception exc) {
        this.A01.A08.Ddr(new Object());
        this.A00.A00(exc);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.7sc] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void Dc2(A9S a9s) {
        this.A01.A08.Ddr(new Object());
        C17667Vby vby = this.A00.A00.A04.A00.A06;
        if (vby == null) {
            0qQ.A0F("preCaptureUIController");
            throw AnonymousClass00P.createAndThrow();
        }
        ShutterButton shutterButton = vby.A01;
        if (shutterButton != null) {
            shutterButton.A03(AnonymousClass05K.A00);
        }
        ShutterButton shutterButton2 = vby.A01;
        if (shutterButton2 != null) {
            shutterButton2.setInnerCircleAlpha(1.0f);
        }
        AnonymousClass7TH.A0R(vby.A00);
    }
}
