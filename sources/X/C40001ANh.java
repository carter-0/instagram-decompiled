package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.ANh  reason: case insensitive filesystem */
public final class C40001ANh implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass7E9 A00;
    public final /* synthetic */ C380529Yn A01;

    public C40001ANh(AnonymousClass7E9 r1, C380529Yn r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        C332807Wl r3;
        int A05 = AnonymousClass0fD.A05(922785040);
        AnonymousClass7E9 r1 = this.A00;
        MessageIdentifier messageIdentifier = r1.A01;
        if (!(messageIdentifier == null || (r3 = this.A01.A02) == null)) {
            r3.EuG(messageIdentifier, (C273414mX) null, r1.A03, (String) null, (String) null, (String) null, "comment_pill");
        }
        view.performHapticFeedback(3);
        AnonymousClass0fD.A0C(-264350462, A05);
    }
}
