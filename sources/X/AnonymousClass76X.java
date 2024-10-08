package X;

import android.view.View;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.76X  reason: invalid class name */
public final class AnonymousClass76X implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass7EK A00;
    public final /* synthetic */ C3265777i A01;
    public final /* synthetic */ DirectMessageIdentifier A02;

    public AnonymousClass76X(AnonymousClass7EK r1, C3265777i r2, DirectMessageIdentifier directMessageIdentifier) {
        this.A00 = r1;
        this.A02 = directMessageIdentifier;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-498789471);
        AnonymousClass7XC r4 = this.A00.A01;
        if (!((C333107Xr) r4).CPk()) {
            DirectMessageIdentifier directMessageIdentifier = this.A02;
            C3265777i r0 = this.A01;
            r4.AWQ(r0.A03, directMessageIdentifier, r0.A00, r0.A05);
        }
        AnonymousClass0fD.A0C(1336012694, A05);
    }
}
