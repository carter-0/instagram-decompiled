package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.TextureView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import org.webrtc.MediaStreamTrack;

public final class LVA implements AudioManager.OnAudioFocusChangeListener {
    public final 1vq A00;
    public final STU A01;
    public final UserSession A02;
    public final CameraSpec A03;
    public final SJN A04;
    public boolean isPlaying;

    /* JADX WARNING: type inference failed for: r7v1, types: [X.Tfu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.Q1d, java.lang.Object] */
    public LVA(Context context, TextureView textureView, UserSession userSession, CameraSpec cameraSpec) {
        C10425Rs1 rs1;
        TextureView textureView2 = textureView;
        0qQ.A0B(textureView2, 3);
        UserSession userSession2 = userSession;
        this.A02 = userSession2;
        this.A03 = cameraSpec;
        Context context2 = context;
        Object systemService = context2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        0qQ.A0C(systemService, AnonymousClass000.A00(4));
        this.A00 = new 1vq((AudioManager) systemService, userSession2);
        SJN A012 = C64152LQr.A00.A01(userSession2, 182.A06(0Tu.A05, userSession2, 36316040137346943L), false, false, false);
        this.A04 = A012;
        C8775R9b r9b = new C8775R9b(textureView2, C64152LQr.A00(userSession2), C64152LQr.A00(userSession2));
        C40201AVr A002 = C392569v1.A00(context2, (C312136ds) null, (C343967r6) null, false);
        Q1Q q1q = new Q1Q(userSession2);
        if (A012.A0q) {
            rs1 = AnonymousClass7TG.A0Z();
        } else {
            rs1 = null;
        }
        this.A01 = new STU(context2, q1q, new Object(), new Object(), C64443Lby.A00, rs1, (AnonymousClass8MA) null, A002, A012, r9b, (String) null, (String) null, (String) null, C63220KtR.A00("reels_acr_browser", (String) null), 59040);
    }

    public final void A00() {
        this.isPlaying = true;
        STU stu = this.A01;
        stu.A06();
        Boolean bool = 1GE.A00(this.A02).A01;
        if (bool == null || bool.booleanValue()) {
            this.A00.A04(this);
            stu.A08(1.0f);
            return;
        }
        stu.A08(0.0f);
        this.A00.A03(this);
    }

    public final void onAudioFocusChange(int i) {
        C250563lf.A0g(new C64553Ldu(this, this, new C66300MMj(this, 3), new C66309MMs(this, 5)), i);
    }
}
