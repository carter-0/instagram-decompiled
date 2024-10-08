package X;

import android.graphics.SurfaceTexture;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationApi;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;
import org.webrtc.SurfaceTextureHelper;

/* renamed from: X.AyI  reason: case insensitive filesystem */
public final class C41666AyI extends 0Yg implements 0sP {
    public final /* synthetic */ CameraAREffect A00;
    public final /* synthetic */ C71143Odx A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41666AyI(CameraAREffect cameraAREffect, C71143Odx odx, Boolean bool, String str, C62320sa r6, C62320sa r7, C62320sa r8, C62320sa r9, boolean z, boolean z2) {
        super(1);
        this.A02 = bool;
        this.A01 = odx;
        this.A00 = cameraAREffect;
        this.A03 = str;
        this.A08 = z;
        this.A07 = r6;
        this.A06 = r7;
        this.A04 = r8;
        this.A05 = r9;
        this.A09 = z2;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, X.8yX] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        IgLiteCameraProxy igLiteCameraProxy;
        AnonymousClass8yN r0;
        String str;
        ARRequestAsset aRRequestAsset;
        boolean z;
        NCZ ncz = (NCZ) obj;
        0qQ.A0B(ncz, 0);
        NCn nCn = (NCn) ncz.A0B.getValue();
        if ((nCn instanceof IgLiteCameraProxy) && (igLiteCameraProxy = (IgLiteCameraProxy) nCn) != null) {
            Boolean bool = this.A02;
            C71143Odx odx = this.A01;
            CameraAREffect cameraAREffect = this.A00;
            String str2 = this.A03;
            boolean z2 = this.A08;
            C62320sa r5 = this.A07;
            C62320sa r4 = this.A06;
            C62320sa r14 = this.A04;
            C62320sa r13 = this.A05;
            boolean z3 = this.A09;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                SurfaceTextureHelper surfaceTextureHelper = igLiteCameraProxy.A09;
                if (surfaceTextureHelper != null) {
                    C345577tk r02 = C41397AtJ.A00(igLiteCameraProxy).A02;
                    SurfaceTexture surfaceTexture = surfaceTextureHelper.surfaceTexture;
                    boolean z4 = !booleanValue;
                    0qQ.A0B(surfaceTexture, 0);
                    C346027uT r03 = (C346027uT) ((C345567tj) r02).A04.get(surfaceTexture);
                    if (r03 != null) {
                        r03.A0E = z4;
                    }
                }
            }
            C39870ACr aCr = odx.A0O;
            C343697qe Ape = igLiteCameraProxy.A03().A00.Ape(B3T.A01);
            0qQ.A07(Ape);
            B3T b3t = (B3T) Ape;
            String str3 = null;
            if (cameraAREffect == null || cameraAREffect.A0Z.get("avatarSDK") == null) {
                r0 = null;
            } else {
                r0 = new AnonymousClass8yN(new AQT(r14, r13), cameraAREffect.A0D);
            }
            ? obj2 = new Object();
            obj2.A00 = r0;
            obj2.A03 = z2;
            obj2.A02 = false;
            obj2.A01 = false;
            C352718Eo r2 = new C352718Eo();
            r2.A05 = aCr.A00;
            r2.A03 = "instagram_vc";
            if (cameraAREffect != null) {
                str = cameraAREffect.A0Q;
            } else {
                str = null;
            }
            r2.A04 = str;
            if (str2 != null) {
                r2.A01 = str2;
            }
            C352728Ep A002 = r2.A00();
            if (cameraAREffect != null) {
                str3 = cameraAREffect.A0K;
                aRRequestAsset = C370338wE.A00(cameraAREffect, z3);
            } else {
                aRRequestAsset = null;
            }
            b3t.EUn(aRRequestAsset, obj2, new C40094AQz(r5, r4), A002, str3);
            NCW ncw = ncz.A02;
            if (cameraAREffect != null) {
                z = cameraAREffect.A0L();
            } else {
                z = false;
            }
            AvatarCommunicationApi avatarCommunicationApi = ncw.A00;
            if (avatarCommunicationApi != null) {
                avatarCommunicationApi.sendUsingAvatars(z);
            }
        }
        return C60340gF.A00;
    }
}
