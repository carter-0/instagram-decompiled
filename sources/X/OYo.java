package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.facebook.expression.effect.avatar.AvatarLoadingProgressManager$runLoaderProgress$1;
import com.instagram.camera.effect.models.CameraAREffect;
import java.util.List;

public final class OYo {
    public O9P A00;
    public Integer A01;
    public AnonymousClass2Q9 A02;
    public boolean A03;
    public final C262224Cq A04 = Dbc.A0G();

    public static final void A00(OYo oYo, int i, int i2) {
        int i3 = 101 - i;
        C51970G9q.A1S(oYo.A02);
        C262224Cq r1 = oYo.A04;
        oYo.A02 = 1Eo.A02(19B.A00, new AvatarLoadingProgressManager$runLoaderProgress$1(oYo, (AnonymousClass4D7) null, i3, ((long) i2) / ((long) i3)), r1);
    }

    public static final void A01(OYo oYo, Integer num) {
        Integer num2;
        Integer num3;
        oYo.A01 = num;
        O9P o9p = oYo.A00;
        if (o9p != null) {
            C69138NfJ nfJ = o9p.A00;
            N9P A002 = C69138NfJ.A00(nfJ);
            OYo oYo2 = nfJ.A05;
            if (oYo2 != null) {
                num3 = oYo2.A01;
            } else {
                num3 = null;
            }
            C69138NfJ.A0A(nfJ, N9P.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, A002, (Integer) null, (Integer) null, (Integer) null, num3, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -1073741825, false, false, false, false, false, false, false, false, false, false, false, false, false));
        }
        if (num != null && num.intValue() == 80 && !oYo.A03 && (num2 = oYo.A01) != null) {
            int intValue = num2.intValue();
            A00(oYo, intValue, (101 - intValue) * 104 * 10);
        }
    }
}
