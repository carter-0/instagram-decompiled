package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Ldr  reason: case insensitive filesystem */
public final class C64550Ldr implements C66429MRj {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ L2V A03;
    public final /* synthetic */ C63882LAl A04;
    public final /* synthetic */ C47522E6i A05;
    public final /* synthetic */ boolean A06;

    public final void DkF(AnonymousClass3YP r9) {
        0qQ.A0B(r9, 0);
        if (r9 == AnonymousClass3YP.SHARING) {
            UserSession userSession = this.A02;
            C363388je.A00(userSession).A01(LTD.A01, (C363658k8) null, "reels_row_share");
            C63882LAl lAl = this.A04;
            LTD.A01(this.A00, this.A01, userSession, new L56(this.A03.A00, this.A06), lAl, this.A05);
        } else if (r9 == AnonymousClass3YP.SHARED) {
            C63882LAl lAl2 = this.A04;
            IgdsButton igdsButton = lAl2.A06;
            JTT.A1N(igdsButton);
            lAl2.A05.setVisibility(8);
            igdsButton.setVisibility(8);
            lAl2.A01.setVisibility(0);
        } else if (r9 == AnonymousClass3YP.NOT_SHARED) {
            JTT.A1N(this.A04.A06);
        }
    }

    public C64550Ldr(Context context, AnonymousClass4DH r2, UserSession userSession, L2V l2v, C63882LAl lAl, C47522E6i e6i, boolean z) {
        this.A02 = userSession;
        this.A04 = lAl;
        this.A06 = z;
        this.A03 = l2v;
        this.A00 = context;
        this.A01 = r2;
        this.A05 = e6i;
    }
}
