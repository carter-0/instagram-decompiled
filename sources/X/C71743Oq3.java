package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.instagram.common.session.UserSession;
import org.webrtc.RendererCommon;

/* renamed from: X.Oq3  reason: case insensitive filesystem */
public final class C71743Oq3 implements C344337rh {
    public static UserSession A0B;
    public C70586OCj A00;
    public C67679MsF A01;
    public C74362Ptc A02;
    public C62320sa A03 = C73877PlE.A00;
    public 0sP A04 = C74152Ppt.A00;
    public RendererCommon.ScalingType A05;
    public boolean A06;
    public boolean A07;
    public final C344337rh A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;

    public final void DZC(C346027uT r1) {
    }

    public final void DZD(C346027uT r1, int i, int i2) {
    }

    public final void DZH(View view) {
    }

    public static final void A00(C71743Oq3 oq3) {
        FrameLayout.LayoutParams layoutParams;
        boolean A1W = AnonymousClass7TF.A1W(oq3.A05, RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        C67679MsF msF = oq3.A01;
        if (msF != null) {
            if (A1W) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
            }
            msF.setLayoutParams(layoutParams);
        }
    }

    public final void A01() {
        C70586OCj oCj = this.A00;
        if (oCj != null) {
            C67679MsF msF = this.A01;
            if (msF != null) {
                VideoRenderApi videoRenderApi = oCj.A00.A01.A0D.A00;
                0JA.A03(videoRenderApi, "VideoRenderProxy setApi must be called");
                videoRenderApi.removeRenderTarget(oCj.A01, msF, new StreamInfo(1, (String) null));
            }
            this.A00 = null;
            C67679MsF msF2 = this.A01;
            if (msF2 != null && msF2.A06) {
                msF2.A0C.release();
                msF2.A06 = false;
            }
        }
    }

    public final void DZB(C346027uT r2) {
        this.A03.invoke();
    }

    public C71743Oq3(Context context) {
        this.A0A = C73894PlV.A00(context, 49);
        this.A09 = C73894PlV.A00(this, 48);
        this.A08 = this;
    }
}
