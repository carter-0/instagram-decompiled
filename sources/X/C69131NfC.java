package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.facebook.common.util.TriState;
import com.instagram.arp.api.AvatarEffectsApiController;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.NfC  reason: case insensitive filesystem */
public final class C69131NfC extends OTZ {
    public TriState A00 = TriState.UNSET;
    public CameraAREffect A01;
    public Integer A02 = AnonymousClass05K.A00;
    public boolean A03;
    public final AvatarEffectsApiController A04;
    public final ONT A05;
    public final C69134NfF A06;
    public final OWA A07;
    public final O9T A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69131NfC(Context context, UserSession userSession, C69134NfF nfF, O9R o9r, OWA owa, O9T o9t) {
        super(o9r);
        ONT ont = new ONT(userSession);
        AvatarEffectsApiController avatarEffectsApiController = new AvatarEffectsApiController(C311766dD.A00(context, userSession), userSession);
        this.A07 = owa;
        this.A06 = nfF;
        this.A08 = o9t;
        this.A05 = ont;
        this.A04 = avatarEffectsApiController;
        if (ont.A00() instanceof C69146NfV) {
            avatarEffectsApiController.A02 = new C74180PqM(this, 1);
            avatarEffectsApiController.A01 = new C74180PqM(this, 2);
            avatarEffectsApiController.A00 = C73925Pm5.A01(this, 20);
        }
    }

    public static final void A00(C69131NfC nfC, Integer num) {
        OYo oYo;
        Integer num2 = num;
        if (nfC.A02 != num) {
            nfC.A02 = num;
            O9T o9t = nfC.A08;
            CameraAREffect cameraAREffect = nfC.A01;
            C69138NfJ nfJ = o9t.A00.A0N;
            if (!0qQ.A0K(nfJ.A03, cameraAREffect) || nfJ.A08 != num) {
                C69138NfJ.A0A(nfJ, N9P.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, C69138NfJ.A00(nfJ), num2, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -9, false, false, false, false, false, false, false, false, false, false, false, false, false));
                nfJ.A03 = cameraAREffect;
                nfJ.A08 = num2;
                if (cameraAREffect != null && num2 == AnonymousClass05K.A0j) {
                    05G r2 = nfJ.A0X;
                    if (r2.getValue() == C69291Nir.PENDING) {
                        if (nfJ.A0F.A02() && (oYo = nfJ.A05) != null) {
                            oYo.A03 = false;
                            OYo.A01(oYo, 5);
                            OYo.A00(oYo, 5, CameraCapturer.OPEN_CAMERA_TIMEOUT);
                        }
                        C69138NfJ.A0B(nfJ, AnonymousClass05K.A0u);
                    } else if (r2.getValue() != C69291Nir.ON) {
                        r2.FIA(C69291Nir.OFF);
                    }
                } else if (num2 == AnonymousClass05K.A01 && nfJ.A0X.getValue() == C69291Nir.PENDING) {
                    C69138NfJ.A0H(nfJ, true, true);
                }
            }
        }
    }
}
