package X;

import android.view.View;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.OiJ  reason: case insensitive filesystem */
public final class C71312OiJ implements View.OnClickListener {
    public final /* synthetic */ C376679Ix A00;
    public final /* synthetic */ AnonymousClass7ES A01;

    public C71312OiJ(C376679Ix r1, AnonymousClass7ES r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(858668049);
        AnonymousClass7ES r5 = this.A01;
        C332867Wr r4 = r5.A09;
        if (!((C333107Xr) r4).CPk()) {
            C376679Ix r3 = this.A00;
            r4.CHm((DirectMessageIdentifier) r3.A03, new C73916Plr(36, r3, r5));
        }
        AnonymousClass0fD.A0C(914037020, A05);
    }
}
