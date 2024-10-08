package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Ui8  reason: case insensitive filesystem */
public final class C15763Ui8 extends C232222tE {
    public final C17269VOw A00;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r1 = r4.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        r1 = r4.A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r12, X.C249703kE r13) {
        /*
            r11 = this;
            X.Uir r12 = (X.C15808Uir) r12
            X.UCM r13 = (X.UCM) r13
            X.AnonymousClass7TG.A1N(r12, r13)
            X.VOw r7 = r11.A00
            if (r7 == 0) goto L_0x0061
            X.Vcz r4 = r7.A00
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r0 = r4.A00
            if (r0 == 0) goto L_0x0037
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r1 = r4.A0A
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r0 = r1.A03
            if (r0 == 0) goto L_0x0037
            X.VWv r5 = r1.A0B
            java.lang.String r2 = "instagram_shopping_bag_index"
            java.lang.String r1 = r0.A07
            r0 = 1
            X.0qQ.A0B(r1, r0)
            r0 = 95
            java.lang.String r3 = X.002.A0T(r2, r1, r0)
            X.2oe r2 = r5.A01
            java.lang.Long r1 = X.DbV.A0q(r1)
            r0 = 0
            X.30a r1 = X.AnonymousClass30Y.A00(r1, r0, r3)
            X.UkN r0 = r5.A02
            X.C13989Tnp.A1Q(r0, r1, r2, r3)
        L_0x0037:
            android.view.View r5 = r13.itemView
            X.0qQ.A06(r5)
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r0 = r4.A00
            if (r0 == 0) goto L_0x0061
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r1 = r4.A0A
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r0 = r1.A03
            if (r0 == 0) goto L_0x0061
            X.VWv r4 = r1.A0B
            java.lang.String r3 = "instagram_shopping_bag_index"
            java.lang.String r2 = r0.A07
            r0 = 2
            X.0qQ.A0B(r2, r0)
            X.2oe r1 = r4.A01
            r0 = 95
            java.lang.String r0 = X.002.A0T(r3, r2, r0)
            X.30Y r1 = r1.A00(r0)
            X.2el r0 = r4.A00
            r0.A05(r5, r1)
        L_0x0061:
            java.lang.String r8 = r12.A00
            if (r8 == 0) goto L_0x0092
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0092
            android.widget.TextView r3 = r13.A00
            if (r3 == 0) goto L_0x0092
            java.lang.String r0 = r12.A01
            java.lang.String r2 = X.C66580MXl.A10(r0, r8)
            android.content.Context r0 = r3.getContext()
            int r9 = X.DbV.A02(r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            r1 = 16
            java.lang.String r0 = ""
            X.04x r5 = new X.04x
            r5.<init>(r1, r0)
            r10 = 3
            X.Ud0 r4 = new X.Ud0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.AnonymousClass7AV.A07(r4, r3, r8, r2)
        L_0x0091:
            return
        L_0x0092:
            android.widget.TextView r1 = r13.A00
            if (r1 == 0) goto L_0x0091
            java.lang.String r0 = r12.A01
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15763Ui8.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C15808Uir.class;
    }

    public C15763Ui8(C17269VOw vOw) {
        this.A00 = vOw;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        return new UCM(DbU.A09(layoutInflater, viewGroup, R.layout.status_text_layout, false));
    }
}
