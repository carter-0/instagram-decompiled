package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.OiQ  reason: case insensitive filesystem */
public final class C71319OiQ implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass7E7 A00;
    public final /* synthetic */ C68000MyS A01;

    public C71319OiQ(AnonymousClass7E7 r1, C68000MyS myS) {
        this.A01 = myS;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-1223231621);
        C68000MyS myS = this.A01;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        C332807Wl r2 = myS.A03;
        if (r2 != null) {
            AnonymousClass7E7 r0 = this.A00;
            r2.DBq(r0.A01, r0.A04);
        }
        view.performHapticFeedback(3);
        AnonymousClass7D5 r3 = myS.A02;
        AnonymousClass7E7 r22 = this.A00;
        MessageIdentifier messageIdentifier = r22.A01;
        if (messageIdentifier != null) {
            str = messageIdentifier.A01;
        } else {
            str = null;
        }
        r3.A00(str, r22.A03);
        AnonymousClass0fD.A0C(-1255176276, A05);
    }
}
