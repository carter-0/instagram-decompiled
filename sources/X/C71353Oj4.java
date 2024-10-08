package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Oj4  reason: case insensitive filesystem */
public final class C71353Oj4 implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C292975jp A01;
    public final /* synthetic */ C266904aX A02;
    public final /* synthetic */ AnonymousClass3UH A03;

    public C71353Oj4(C292975jp r1, C266904aX r2, AnonymousClass3UH r3, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = i;
    }

    public final void onClick(View view) {
        0sn r13;
        C252553pI r1;
        int A05 = AnonymousClass0fD.A05(238715956);
        C266904aX r4 = this.A02;
        AnonymousClass3UO C2m = r4.C2m();
        C292975jp r2 = this.A01;
        RecyclerView recyclerView = r2.A00;
        int i = 0;
        if (!(recyclerView == null || (r1 = recyclerView.A0D) == null || !(r1 instanceof LinearLayoutManager))) {
            i = ((LinearLayoutManager) r1).A1a();
        }
        C229992ok r6 = r2.A0D;
        AnonymousClass3UH r12 = this.A03;
        1UQ B5J = r12.B5J();
        String str = r12.A0D;
        String str2 = r12.A0E;
        if (C2m == AnonymousClass3UO.DP_UPSELL) {
            r13 = r4.A00.A05;
            if (r13 == null) {
                r13 = 0sn.A00;
            }
        } else {
            r13 = null;
        }
        r6.DpE(B5J, C2m, Integer.valueOf(i), str, str2, r12.getId(), r13);
        int i2 = this.A00;
        int ordinal = r4.C2m().ordinal();
        if (ordinal == 6) {
            OFR ofr = r2.A02;
            if (ofr == null) {
                ofr = new OFR(r2.A0B, r2.A0C);
                r2.A02 = ofr;
            }
            String A002 = C292975jp.A00(r2);
            Integer valueOf = Integer.valueOf(i2);
            0Aj A0e = AnonymousClass7TE.A0e(ofr.A00, "discover_people_upsell_clicked");
            A0e.AAJ("module", ofr.A01);
            A0e.AAJ("view_module", A002);
            A0e.A8k("position", valueOf);
            A0e.Cgf();
        } else if (ordinal == 2) {
            C311496cm r5 = r2.A01;
            if (r5 == null) {
                r5 = new C311496cm(r2.A0B, r2.A0C);
                r2.A01 = r5;
            }
            String A003 = C292975jp.A00(r2);
            r5.A02(AnonymousClass7TE.A0u(), Integer.valueOf(i2), A003, (String) null);
        }
        AnonymousClass0fD.A0C(-1427881262, A05);
    }
}
