package X;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.WZu  reason: case insensitive filesystem */
public final class C19446WZu implements X9G {
    public final /* synthetic */ ReelDashboardFragment A00;

    public final void DfG() {
    }

    public C19446WZu(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    public final C255773uh AuN() {
        return this.A00.A0F();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.mListAdapter;
        r1 = r1.A0j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.VTJ Big(int r4) {
        /*
            r3 = this;
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r2 = r3.A00
            X.3uh r1 = r2.A0F()
            if (r1 == 0) goto L_0x0039
            X.TzX r0 = r2.mListAdapter
            java.lang.String r1 = r1.A0j
            androidx.recyclerview.widget.RecyclerView r0 = X.C14625TzX.A00(r0, r1)
            if (r0 == 0) goto L_0x0039
            X.2Rw r0 = r0.A0A
            X.UAU r0 = (X.UAU) r0
            if (r0 == 0) goto L_0x0039
            java.util.List r0 = r0.A01
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L_0x0039
            X.TzX r0 = r2.mListAdapter
            androidx.recyclerview.widget.RecyclerView r0 = X.C14625TzX.A00(r0, r1)
            if (r0 == 0) goto L_0x0037
            X.2Rw r0 = r0.A0A
            X.UAU r0 = (X.UAU) r0
            if (r0 == 0) goto L_0x0037
            java.util.List r0 = r0.A01
            java.lang.Object r2 = r0.get(r4)
            X.VTJ r2 = (X.VTJ) r2
            return r2
        L_0x0037:
            r2 = 0
            return r2
        L_0x0039:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 0
            X.VTJ r2 = new X.VTJ
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19446WZu.Big(int):X.VTJ");
    }

    public final int Bih() {
        RecyclerView A002;
        2Rw r0;
        ReelDashboardFragment reelDashboardFragment = this.A00;
        C255773uh A0F = reelDashboardFragment.A0F();
        if (A0F == null || (A002 = C14625TzX.A00(reelDashboardFragment.mListAdapter, A0F.A0j)) == null || (r0 = A002.A0A) == null) {
            return 0;
        }
        return r0.getItemCount();
    }

    public final void CHw(int i) {
        RecyclerView A002;
        ReelDashboardFragment reelDashboardFragment = this.A00;
        C255773uh A0F = reelDashboardFragment.A0F();
        if (A0F != null && (A002 = C14625TzX.A00(reelDashboardFragment.mListAdapter, A0F.A0j)) != null) {
            C18239Vo6.A01(A002, i);
        }
    }

    public final void DbA() {
        RecyclerView A002;
        ReelDashboardFragment reelDashboardFragment = this.A00;
        C255773uh A0F = reelDashboardFragment.A0F();
        if (A0F != null && (A002 = C14625TzX.A00(reelDashboardFragment.mListAdapter, A0F.A0j)) != null) {
            C18239Vo6.A00(A002);
        }
    }

    public final void EKs() {
        ReelDashboardFragment reelDashboardFragment = this.A00;
        C255773uh A0F = reelDashboardFragment.A0F();
        if (A0F != null) {
            String str = A0F.A0k;
            String str2 = A0F.A0j;
            C309516Yo A0M = C13991Tnr.A0M(reelDashboardFragment);
            AnonymousClass7TG.A1N(str, str2);
            C273374mT r2 = new C273374mT();
            Bundle bundle = new Bundle();
            bundle.putString("ReelQuestionResponsesListFragment.REEL_ID", str);
            bundle.putString("ReelQuestionResponsesListFragment.REEL_ITEM_ID", str2);
            DbX.A18(bundle, r2, A0M);
        }
    }
}
