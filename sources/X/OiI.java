package X;

import android.view.View;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

public final class OiI implements View.OnClickListener {
    public final /* synthetic */ C376679Ix A00;
    public final /* synthetic */ AnonymousClass7ES A01;

    public OiI(C376679Ix r1, AnonymousClass7ES r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1715149943);
        AnonymousClass7ES r4 = this.A01;
        C332867Wr r1 = r4.A09;
        if (!((C333107Xr) r1).CPk()) {
            C376679Ix r3 = this.A00;
            DirectMessageIdentifier directMessageIdentifier = (DirectMessageIdentifier) r3.A03;
            r1.CHn(directMessageIdentifier);
            r4.A07.setVisibility(8);
            String str = directMessageIdentifier.A02;
            if (str != null) {
                r4.A08.A01(r3.A04, str);
            }
        }
        AnonymousClass0fD.A0C(2114440384, A05);
    }
}
