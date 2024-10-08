package X;

import android.view.View;

/* renamed from: X.9kZ  reason: invalid class name and case insensitive filesystem */
public final class C386419kZ extends AnonymousClass0mG {
    public final /* synthetic */ C357918a4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386419kZ(C357918a4 r3) {
        super(1000);
        this.A00 = r3;
    }

    public final void A00(View view) {
        C357918a4 r5 = this.A00;
        if (r5.A0q == 1) {
            C357918a4.A08(r5);
            return;
        }
        C357918a4.A0A(r5, "AUDIO_EDITOR_PAGE_REPLACE_TAP", false);
        C358248ab r3 = new C358248ab(r5.A0u.requireContext());
        r3.A09(2131967767);
        r3.A08(2131967766);
        r3.A0L(new AKK(r5, 10), 2131967765);
        r3.A0H(new AKK(r5, 11), 2131967764);
        r3.A0s(true);
        AnonymousClass0fN.A00(r3.A02());
    }
}
