package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.ANg  reason: case insensitive filesystem */
public final class C40000ANg implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass7AA A00;
    public final /* synthetic */ AnonymousClass7EG A01;

    public C40000ANg(AnonymousClass7AA r1, AnonymousClass7EG r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        C332807Wl r3;
        int A05 = AnonymousClass0fD.A05(-1695394868);
        AnonymousClass7AA r1 = this.A00;
        MessageIdentifier messageIdentifier = r1.A02;
        if (!(messageIdentifier == null || (r3 = this.A01.A07) == null)) {
            r3.EuG(messageIdentifier, (C273414mX) null, r1.A03, (String) null, (String) null, (String) null, "comment_pill");
        }
        AnonymousClass0fD.A0C(-2096648999, A05);
    }
}
