package X;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* renamed from: X.FTz  reason: case insensitive filesystem */
public final class C50219FTz implements C59608JQc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C46521DgO A02;
    public final /* synthetic */ C283155Gi A03;

    public final void DdQ() {
    }

    public final void DdS() {
    }

    public C50219FTz(Context context, C46521DgO dgO, C283155Gi r3, int i) {
        this.A02 = dgO;
        this.A03 = r3;
        this.A00 = i;
        this.A01 = context;
    }

    public final void DdR() {
        C46521DgO dgO = this.A02;
        C283155Gi r3 = this.A03;
        int i = this.A00;
        C46521DgO.A04(dgO, r3, "delete_comment_failed", i);
        if (C46521DgO.A05(dgO)) {
            C358248ab A0Y = DbS.A0Y(this.A01);
            A0Y.A08(2131968332);
            A0Y.A04();
            DbT.A1V(A0Y);
        }
        dgO.A06.CNU(r3, i);
    }

    public final void DdT(HMF hmf, String str, List list, List list2, Set set) {
        C46521DgO.A04(this.A02, this.A03, "delete_comment_success", this.A00);
    }
}
