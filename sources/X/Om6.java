package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.camera.effect.models.CameraAREffect;
import java.util.List;

public final class Om6 implements C312366eJ {
    public final /* synthetic */ C69138NfJ A00;

    public final void DXB(String str, int i) {
        PickerConfiguration pickerConfiguration;
        0qQ.A0B(str, 0);
        C69138NfJ nfJ = this.A00;
        N9P A002 = C69138NfJ.A00(nfJ);
        PickerConfiguration pickerConfiguration2 = C69138NfJ.A00(nfJ).A03;
        if (pickerConfiguration2 != null) {
            pickerConfiguration = new PickerConfiguration(i, pickerConfiguration2.mItems);
        } else {
            pickerConfiguration = null;
        }
        C69138NfJ.A0A(nfJ, N9P.A00((EffectAttribution) null, pickerConfiguration, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, A002, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -65537, false, false, false, false, false, false, false, false, false, false, false, false, false));
    }

    public final void DXC(B12 b12, String str) {
        B12 b122 = b12;
        boolean A1U = AnonymousClass7TF.A1U(0, str, b122);
        C69138NfJ nfJ = this.A00;
        nfJ.A02 = b122;
        C69138NfJ.A0A(nfJ, N9P.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, C69138NfJ.A00(nfJ), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -131073, false, false, false, A1U, false, false, false, false, false, false, false, false, false));
    }

    public Om6(C69138NfJ nfJ) {
        this.A00 = nfJ;
    }

    public final void DXA() {
        C69138NfJ nfJ = this.A00;
        C69138NfJ.A0A(nfJ, N9P.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, C69138NfJ.A00(nfJ), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -131073, false, false, false, false, false, false, false, false, false, false, false, false, false));
    }

    public final void DX9(PickerConfiguration pickerConfiguration, String str) {
        AnonymousClass7TG.A1N(str, pickerConfiguration);
        C69138NfJ nfJ = this.A00;
        C69138NfJ.A0A(nfJ, N9P.A00((EffectAttribution) null, pickerConfiguration, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, C69138NfJ.A00(nfJ), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -65537, false, false, false, false, false, false, false, false, false, false, false, false, false));
    }
}
