package X;

import android.view.View;
import java.util.Set;

/* renamed from: X.IVf  reason: case insensitive filesystem */
public final class C57270IVf implements MVB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C59608JQc A01;
    public final /* synthetic */ C57962IjH A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ C46521DgO A04;
    public final /* synthetic */ C283155Gi A05;
    public final /* synthetic */ Set A06;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C57270IVf(C59608JQc jQc, C57962IjH ijH, 1Xj r3, C46521DgO dgO, C283155Gi r5, Set set, int i) {
        this.A04 = dgO;
        this.A05 = r5;
        this.A00 = i;
        this.A02 = ijH;
        this.A03 = r3;
        this.A06 = set;
        this.A01 = jQc;
    }

    public final void onButtonClick(View view) {
        C46521DgO dgO = this.A04;
        C283155Gi r2 = this.A05;
        int i = this.A00;
        C46521DgO.A04(dgO, r2, "delete_comment_undo_clicked", i);
        dgO.A06.CNU(r2, i);
        C57962IjH ijH = this.A02;
        if (!ijH.A01) {
            ijH.A00 = true;
            I7G.A00.removeCallbacks(ijH);
        }
        1Xj r4 = this.A03;
        if (r4 != null) {
            Set set = this.A06;
            C59608JQc jQc = this.A01;
            AnonymousClass7TF.A1C(set, 1, dgO.A03);
            I7G.A07(jQc, r4, set, true);
        }
    }
}
