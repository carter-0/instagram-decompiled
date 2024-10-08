package X;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

public final class AMZ implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass8QZ A00;

    public AMZ(AnonymousClass8QZ r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1177967312);
        AnonymousClass8QZ r2 = this.A00;
        SwitchCompat switchCompat = r2.A05;
        if (switchCompat == null) {
            0qQ.A0F("typeSelectorSwitch");
            throw AnonymousClass00P.createAndThrow();
        }
        switchCompat.performHapticFeedback(1);
        27r A01 = 27p.A01(r2.A0O);
        C59725JVj jVj = C59725JVj.GALLERY;
        29R r22 = A01.A09;
        1Ln A08 = 1Ln.A08(r22.A01);
        if (A08.A00.isSampled()) {
            A08.A0t("IG_CAMERA_ENTITY_TAP");
            A08.A0r("CAROUSEL_CLIPS_TOGGLE_SWITCH");
            29R.A00(A08, r22);
            A08.A0b(r22.A04.A09);
            A08.A0T();
            A08.A0d(jVj);
            A08.A0a(r22.A0J());
            A08.A0n(27x.A08.getModuleName());
            AnonymousClass7TF.A18(A08);
            A08.Cgf();
        }
        AnonymousClass0fD.A0C(1517821539, A05);
    }
}
