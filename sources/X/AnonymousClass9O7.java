package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.9O7  reason: invalid class name */
public final class AnonymousClass9O7 implements View.OnClickListener {
    public final /* synthetic */ C376679Ix A00;
    public final /* synthetic */ AnonymousClass7EM A01;

    public AnonymousClass9O7(C376679Ix r1, AnonymousClass7EM r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(634579560);
        C333107Xr r2 = this.A01.A04;
        if (!r2.CPk()) {
            ((AnonymousClass7XK) r2).ErZ((MessageIdentifier) this.A00.A03, AnonymousClass05K.A0j);
        }
        AnonymousClass0fD.A0C(-647298811, A05);
    }
}
