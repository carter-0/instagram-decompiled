package X;

import com.instagram.camera.effect.models.CameraAREffect;

public final class PRH implements AnonymousClass8FW {
    public final /* synthetic */ C69112Ner A00;

    public PRH(C69112Ner ner) {
        this.A00 = ner;
    }

    public final void Dwy(float f) {
        CameraAREffect A002;
        OIF oif;
        C69112Ner ner = this.A00;
        AnonymousClass0eM r5 = ner.A0W;
        OIF oif2 = (OIF) r5.getValue();
        Object obj = oif2.A07.A00.first;
        0qQ.A07(obj);
        boolean A1W = AnonymousClass7TF.A1W(obj, AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY);
        boolean z = oif2.A03;
        AnonymousClass87G r0 = oif2.A01;
        boolean z2 = oif2.A04;
        if (A1W && z && r0 != null && (A002 = r0.A00()) != null && A002.A0Z.get("nativeUIControlSlider") != null && !z2 && (oif = (OIF) r5.getValue()) != null && oif.A01 != null) {
            ner.A0H.A03(new C72912POw(f, true, false));
        }
    }
}
