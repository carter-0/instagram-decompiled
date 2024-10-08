package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.OiP  reason: case insensitive filesystem */
public final class C71318OiP implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass7E6 A00;
    public final /* synthetic */ C68015Myh A01;

    public C71318OiP(AnonymousClass7E6 r1, C68015Myh myh) {
        this.A00 = r1;
        this.A01 = myh;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-259533308);
        AnonymousClass7E6 r4 = this.A00;
        MessageIdentifier messageIdentifier = r4.A01;
        if (messageIdentifier != null) {
            C68015Myh myh = this.A01;
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            C332807Wl r1 = myh.A04;
            if (r1 != null) {
                r1.FHP(messageIdentifier, r4.A04);
            }
            view.performHapticFeedback(3);
            myh.A03.A00(messageIdentifier.A01, r4.A03);
        }
        AnonymousClass0fD.A0C(1905884232, A05);
    }
}
