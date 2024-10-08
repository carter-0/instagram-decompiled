package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Dh2  reason: case insensitive filesystem */
public final class C46560Dh2 extends C232222tE {
    public final int A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_search_placeholder, viewGroup, false);
        0qQ.A0A(inflate);
        inflate.setTag(new C46567Dh9(inflate));
        C249703kE r1 = new C249703kE(inflate);
        if (inflate.getTag() instanceof C46567Dh9) {
            return r1;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r5 == X.AnonymousClass05K.A0C) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r11, X.C249703kE r12) {
        /*
            r10 = this;
            X.TxC r11 = (X.C14490TxC) r11
            r2 = 0
            X.0qQ.A0B(r11, r2)
            r4 = 1
            X.0qQ.A0B(r12, r4)
            android.view.View r0 = r12.itemView
            java.lang.Object r3 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.ui.PlaceholderRowViewBinder.Holder"
            X.0qQ.A0C(r3, r0)
            X.Dh9 r3 = (X.C46567Dh9) r3
            boolean r6 = r10.A01
            java.lang.Integer r5 = r11.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r9 = 0
            if (r5 == r0) goto L_0x0025
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1 = 0
            if (r5 != r0) goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r5 != r0) goto L_0x002b
            r9 = 1
        L_0x002b:
            int r0 = r10.A00
            X.0qQ.A0B(r3, r2)
            if (r1 == 0) goto L_0x00ac
            com.facebook.shimmer.ShimmerFrameLayout r0 = r3.A02
            X.C67434Mnp.A02(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r8 = r3.A03
            com.instagram.ui.widget.gradientspinner.GradientSpinner r7 = r3.A04
            X.0qQ.A0B(r8, r2)
            X.0qQ.A0B(r7, r4)
            android.content.Context r4 = r8.getContext()
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131165218(0x7f070022, float:1.7944647E38)
            int r6 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r4.getResources()
            int r5 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r4 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r0.height = r6
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r0.width = r6
            r8.setPadding(r5, r5, r5, r5)
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.setMargins(r4, r2, r4, r2)
            r1 = 8
            r7.setVisibility(r1)
            android.view.View r0 = r3.A01
            r0.setVisibility(r1)
            android.view.View r2 = r3.A00
            r1 = 2131165460(0x7f070114, float:1.7945138E38)
            if (r9 == 0) goto L_0x0094
            r1 = 2131165185(0x7f070001, float:1.794458E38)
        L_0x0094:
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = r0.getDimensionPixelSize(r1)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.width = r1
        L_0x00a6:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r3.A02
            r0.A02()
            return
        L_0x00ac:
            if (r6 != 0) goto L_0x00b0
            if (r0 != r4) goto L_0x00a6
        L_0x00b0:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r3.A02
            X.C67434Mnp.A01(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r7 = r3.A03
            com.instagram.ui.widget.gradientspinner.GradientSpinner r5 = r3.A04
            X.0qQ.A0B(r7, r2)
            X.0qQ.A0B(r5, r4)
            android.content.Context r6 = r7.getContext()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r4 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r0.height = r4
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r0.width = r4
            r7.setPadding(r1, r1, r1, r1)
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165270(0x7f070056, float:1.7944752E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            r0.height = r1
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            r0.width = r1
            android.view.View r0 = r3.A01
            r0.setVisibility(r2)
            android.view.View r2 = r3.A00
            r1 = 2131165752(0x7f070238, float:1.794573E38)
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46560Dh2.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C14490TxC.class;
    }

    public C46560Dh2(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }
}
