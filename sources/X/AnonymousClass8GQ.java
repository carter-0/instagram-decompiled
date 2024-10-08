package X;

import android.app.Activity;

/* renamed from: X.8GQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8GQ implements AnonymousClass8GR {
    public final /* synthetic */ C352888Fl A00;

    public /* synthetic */ AnonymousClass8GQ(C352888Fl r1) {
        this.A00 = r1;
    }

    public final void Dkw() {
        C352888Fl r3 = this.A00;
        AnonymousClass8DD r0 = r3.A14;
        if (r0 != null) {
            AnonymousClass87G A0D = r0.A0D();
            if (!r3.A0g.A0V(C358088aL.A0C) && A0D != null && A0D.A04 == AnonymousClass87I.DISCOVERY_SURFACE) {
                AnonymousClass8A1.A01(r3.A0f).A0F("effect_gallery_button_tap");
                if (r3.A10.A00.A01 == 28D.A2X) {
                    Activity activity = r3.A15.A00;
                    activity.setResult(60572);
                    activity.finish();
                    return;
                }
                r3.A15.A00(1);
                return;
            }
        }
        r3.A0S(C391509tC.BUTTON);
    }
}
