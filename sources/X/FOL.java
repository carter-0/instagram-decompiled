package X;

import android.view.View;
import com.instagram.model.reels.Reel;

public final class FOL implements View.OnClickListener {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C250973mM A02;
    public final /* synthetic */ AnonymousClass3BQ A03;
    public final /* synthetic */ C317116mk A04;
    public final /* synthetic */ boolean A05;

    public FOL(Reel reel, C255773uh r2, C250973mM r3, AnonymousClass3BQ r4, C317116mk r5, boolean z) {
        this.A05 = z;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = reel;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(1381083837);
        if (!this.A05) {
            C317116mk r6 = this.A04;
            C250973mM r5 = this.A02;
            Reel reel = this.A00;
            C255773uh r3 = this.A01;
            boolean z = false;
            if (this.A03 != AnonymousClass3BQ.PROFILE) {
                z = true;
            }
            r6.Dck(reel, r3, r5, z);
        }
        AnonymousClass0fD.A0C(-582164336, A052);
    }
}
