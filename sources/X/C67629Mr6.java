package X;

import android.app.KeyguardManager;

/* renamed from: X.Mr6  reason: case insensitive filesystem */
public final class C67629Mr6 extends KeyguardManager.KeyguardDismissCallback {
    public final /* synthetic */ C69107Nem A00;

    public C67629Mr6(C69107Nem nem) {
        this.A00 = nem;
    }

    public final void onDismissCancelled() {
        C69107Nem nem = this.A00;
        nem.A04 = null;
        nem.A05 = null;
        nem.A03 = null;
    }

    public final void onDismissError() {
        C69107Nem nem = this.A00;
        nem.A04 = null;
        nem.A05 = null;
        nem.A03 = null;
    }

    public final void onDismissSucceeded() {
        C69107Nem nem = this.A00;
        C72865PNb pNb = nem.A04;
        if (pNb != null) {
            nem.A09.A05(pNb);
        }
        C72866PNc pNc = nem.A05;
        if (pNc != null) {
            C69107Nem.A02(nem, pNc);
        }
        PNV pnv = nem.A03;
        if (pnv != null) {
            nem.A09.A05(pnv);
        }
    }
}
