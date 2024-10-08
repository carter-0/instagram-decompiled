package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.82G  reason: invalid class name */
public abstract class AnonymousClass82G {
    public void A03() {
    }

    public void A04() {
    }

    public void A05(EffectManifest effectManifest) {
    }

    public void A07(String str) {
    }

    public void A08(EffectAttribution effectAttribution, EffectManifest effectManifest, EffectServiceHost effectServiceHost, String str) {
    }

    public void A09(String str) {
    }

    public void A0A(String str, Throwable th) {
    }

    public void A06(String str) {
        JSONObject jSONObject;
        C349307zv A04;
        List arrayList;
        if (this instanceof C368528sn) {
            C368528sn r2 = (C368528sn) this;
            for (AnonymousClass82C r3 : r2.A0G) {
                CameraAREffect cameraAREffect = r2.A0M;
                if (!(r3 == null || cameraAREffect == null)) {
                    r3.DBZ(cameraAREffect, false, false);
                }
            }
            Set<C39641A3f> set = r2.A05;
            if (set != null) {
                r2.A00++;
                CameraAREffect cameraAREffect2 = r2.A0M;
                if (cameraAREffect2 != null) {
                    for (C39641A3f a3f : set) {
                        if (a3f != null) {
                            int i = r2.A00;
                            if (cameraAREffect2.A0H()) {
                                AnonymousClass8LU r4 = a3f.A00;
                                if (!(r4.A07 == null || r4.A01 == null || (A04 = r4.A0k.A02.A01.A04()) == null)) {
                                    C62753Klr klr = (C62753Klr) r4.A01.A02();
                                    String str2 = r4.A0G;
                                    if (str2 != null && str2.equals(A04.A07())) {
                                        if (klr instanceof C61758KKx) {
                                            arrayList = ((C61758KKx) klr).A00;
                                        } else if ((klr instanceof C61759KKy) || (klr instanceof KL0)) {
                                            arrayList = new ArrayList();
                                        }
                                        cameraAREffect2.A0k = C394469yA.A00(arrayList);
                                    }
                                    cameraAREffect2.A0k = null;
                                    r4.A02 = new C40064APu(cameraAREffect2, r2, a3f, i);
                                    String str3 = r4.A0H;
                                    if (str3 == null || !str3.equals(A04.A07())) {
                                        r4.A0H = A04.A07();
                                        AnonymousClass8LU.A0B(r4, 2131964544);
                                        r4.A07.AUS(r4.A0W);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            CameraAREffect cameraAREffect3 = r2.A0M;
            if (cameraAREffect3 != null && (jSONObject = cameraAREffect3.A0k) != null) {
                r2.A07.A00(jSONObject);
                return;
            }
            return;
        }
        IgCameraEffectsController igCameraEffectsController = (IgCameraEffectsController) this;
        CameraAREffect cameraAREffect4 = igCameraEffectsController.A09;
        if (cameraAREffect4 != null) {
            for (AnonymousClass82C r22 : igCameraEffectsController.A0Q) {
                if (r22 != null) {
                    r22.DBZ(cameraAREffect4, igCameraEffectsController.A0D, true);
                }
            }
        }
    }
}
