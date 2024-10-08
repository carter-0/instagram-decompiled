package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import com.facebook.rsys.screenshare.gen.ScreenShareProxy;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;

public final class OZU {
    public ScreenShareApi A00;
    public OLK A01;
    public Y56 A02;
    public CapturerObserver A03;
    public SurfaceTextureHelper A04;
    public final Context A05;
    public final AudioModule A06;
    public final ScreenShareProxy A07 = new C68370NDd(this);
    public final UserSession A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new C73922Pm2(this, 49));
    public final AnonymousClass0eM A0A = C58685Ivu.A00(this, 0);
    public final AnonymousClass0eM A0B = C58685Ivu.A00(this, 1);
    public final AnonymousClass0eM A0C = C58685Ivu.A00(this, 2);
    public final EglBase.Context A0D;
    public final O9Y A0E;

    public OZU(Context context, AudioModule audioModule, UserSession userSession, O9Y o9y, EglBase.Context context2) {
        this.A05 = context;
        this.A0D = context2;
        this.A0E = o9y;
        this.A08 = userSession;
        this.A06 = audioModule;
    }

    private final void A00() {
        if (AnonymousClass7TF.A1Z(this.A0B)) {
            OLK olk = this.A01;
            if (olk != null) {
                olk.A02.set(false);
            }
            this.A01 = null;
        }
        Y56 y56 = this.A02;
        if (y56 != null) {
            y56.stopCapture();
        }
        Y56 y562 = this.A02;
        if (y562 != null) {
            y562.dispose();
        }
        this.A02 = null;
        ScreenShareApi screenShareApi = this.A00;
        if (screenShareApi != null) {
            screenShareApi.enableScreenShare(false, 0);
        }
    }

    public static final void A01(Intent intent, Point point, OZU ozu) {
        MediaProjection mediaProjection;
        if (ozu.A02 != null) {
            ozu.A02();
        }
        try {
            ozu.A04 = SurfaceTextureHelper.create("rsys_screenshare_capture", ozu.A0D, true);
            Y56 y56 = new Y56(intent, new C67658Mrl(ozu));
            ozu.A02 = y56;
            C73541PeX peX = new C73541PeX(ozu);
            ozu.A03 = peX;
            y56.initialize(ozu.A04, ozu.A05, peX);
            Y56 y562 = ozu.A02;
            if (y562 != null) {
                y562.startCapture(point.x, point.y, 0);
            }
            Y56 y563 = ozu.A02;
            if (y563 != null) {
                synchronized (y563) {
                    mediaProjection = y563.A01;
                }
            } else {
                mediaProjection = null;
            }
            AnonymousClass0eM r1 = ozu.A0B;
            if (AnonymousClass7TF.A1Z(r1) && mediaProjection != null) {
                if (AnonymousClass7TF.A1Z(r1)) {
                    OLK olk = ozu.A01;
                    if (olk != null) {
                        olk.A02.set(false);
                    }
                    ozu.A01 = null;
                }
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                0qQ.A0A(newSingleThreadExecutor);
                OLK olk2 = new OLK(new OB4((float) ((Number) AnonymousClass7TE.A14(ozu.A0C)).doubleValue()), new OAB(ozu), newSingleThreadExecutor, C74001PnS.A00);
                ozu.A01 = olk2;
                olk2.A00(mediaProjection);
            }
        } catch (IllegalStateException e) {
            0KC.A0F("RtcScreenShareClient", "getMediaProjection failed", e);
            new ON9(0wj.A01).A02("RtcScreenShareClient: getMediaProjection error", e);
            C69136NfH nfH = ozu.A0E.A00.A0a;
            0KC.A0D("RtcScreenShareInter", "onEnableScreenShareFailed");
            C69134NfF.A01(nfH.A0A, AnonymousClass05K.A0R, System.currentTimeMillis());
            C69136NfH.A00(nfH, C69307Nj8.IDLE);
            ozu.A02();
        } catch (SecurityException e2) {
            try {
                0KC.A0F("RtcScreenShareClient", "getMediaProjection failed", e2);
                new ON9(0wj.A01).A02("RtcScreenShareClient: getMediaProjection security error", e2);
                C69136NfH nfH2 = ozu.A0E.A00.A0a;
                0KC.A0D("RtcScreenShareInter", "onEnableScreenShareFailed");
                C69134NfF.A01(nfH2.A0A, AnonymousClass05K.A0R, System.currentTimeMillis());
                C69136NfH.A00(nfH2, C69307Nj8.IDLE);
                ozu.A02();
            } catch (Throwable th) {
                C69136NfH nfH3 = ozu.A0E.A00.A0a;
                0KC.A0D("RtcScreenShareInter", "onEnableScreenShareFailed");
                C69134NfF.A01(nfH3.A0A, AnonymousClass05K.A0R, System.currentTimeMillis());
                C69136NfH.A00(nfH3, C69307Nj8.IDLE);
                ozu.A02();
                throw th;
            }
        }
    }

    public final void A02() {
        if (AnonymousClass7TF.A1Z(this.A09)) {
            synchronized (this) {
                A00();
            }
            return;
        }
        A00();
    }
}
