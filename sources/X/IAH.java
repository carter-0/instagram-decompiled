package X;

import android.view.View;

public final class IAH implements View.OnClickListener {
    public final /* synthetic */ C263234Jv A00;

    public IAH(C263234Jv r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(540310708);
        C57411IaH iaH = this.A00.A04.A00;
        if (iaH != null) {
            iaH.A00(5.0f);
            AnonymousClass0fD.A0C(63217928, A05);
            return;
        }
        0qQ.A0F("animationController");
        throw AnonymousClass00P.createAndThrow();
    }
}
