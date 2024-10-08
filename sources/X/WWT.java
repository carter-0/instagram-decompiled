package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.refinement.model.Refinement;
import java.util.List;

public final class WWT implements C232682uF, X44, X45 {
    public static final String __redex_internal_original_name = "RefinementsController";
    public final RecyclerView A00;
    public final UA6 A01;
    public final Context A02;
    public final LinearLayoutManager A03;
    public final AnonymousClass4DH A04;
    public final C20905X3w A05;
    public final boolean A06;

    public final void Ck2(Refinement refinement, int i) {
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r3.A01.getItemCount() <= 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r2 = r3.A00
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x000f
            X.UA6 r0 = r3.A01
            int r1 = r0.getItemCount()
            r0 = 0
            if (r1 > 0) goto L_0x0011
        L_0x000f:
            r0 = 8
        L_0x0011:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WWT.A00():void");
    }

    public final void Dcn(Refinement refinement, int i) {
        this.A05.Dco(refinement);
    }

    public final 0jB E4k() {
        return new 0jB();
    }

    public final 0jB E4l(1Xj r2) {
        return new 0jB();
    }

    public final String getModuleName() {
        return this.A04.getModuleName();
    }

    public WWT(RecyclerView recyclerView, AnonymousClass4DH r7, UserSession userSession, C20905X3w x3w, List list, boolean z) {
        AnonymousClass7TG.A1P(userSession, recyclerView);
        this.A04 = r7;
        this.A00 = recyclerView;
        this.A05 = x3w;
        this.A06 = z;
        Context A0S = AnonymousClass7TE.A0S(recyclerView);
        this.A02 = A0S;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(A0S, 0, false);
        this.A03 = linearLayoutManager;
        2el A0U = DbY.A0U();
        UA6 ua6 = new UA6(this, new VS7(A0U, this));
        this.A01 = ua6;
        ua6.A00 = new C61078JwG(list, 14);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(ua6);
        0qQ.A0A(list);
        recyclerView.setVisibility(!list.isEmpty() ? 0 : 8);
        C14396TvP.A01(recyclerView);
        Dba.A0z(recyclerView, A0U, r7);
    }
}
