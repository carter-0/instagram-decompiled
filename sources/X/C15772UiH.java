package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.UiH  reason: case insensitive filesystem */
public final class C15772UiH extends C232222tE {
    public final XC3 A00;
    public final XAH A01;

    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003e, code lost:
        if (r5 != null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r11, X.C249703kE r12) {
        /*
            r10 = this;
            X.Nft r11 = (X.C69170Nft) r11
            X.AnonymousClass7TG.A1N(r11, r12)
            X.Mg0 r7 = r11.A00
            X.Nff r6 = r11.A00
            X.XC3 r8 = r10.A00
            X.XAH r1 = r10.A01
            android.view.View r0 = r12.itemView
            java.lang.Object r3 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.ui.MapQueryRowViewBinder.Holder"
            X.0qQ.A0C(r3, r0)
            X.VZl r3 = (X.C17532VZl) r3
            boolean r9 = r7.A0F
            X.C51974G9v.A1M(r8, r1, r3)
            com.instagram.model.mapquery.MapQuery r0 = r6.A00
            android.view.View r2 = r3.A01
            r1.ECK(r2, r6, r7)
            android.widget.TextView r1 = r3.A03
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            r0 = 51
            X.WB4.A00(r2, r8, r6, r7, r0)
            com.instagram.common.ui.base.IgSimpleImageView r5 = r3.A00
            if (r5 != 0) goto L_0x0040
            android.view.ViewStub r0 = r3.A02
            com.instagram.common.ui.base.IgSimpleImageView r5 = X.C13989Tnp.A0U(r0)
            r3.A00 = r5
            if (r5 == 0) goto L_0x0044
        L_0x0040:
            r4 = 0
            X.C67429Mnk.A00(r4, r5, r6, r7, r8, r9)
        L_0x0044:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.A04
            android.content.res.Resources r1 = X.DbU.A05(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbX.A0G(r0)
            X.C13990Tnq.A0n(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15772UiH.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C69170Nft.class;
    }

    public C15772UiH(XC3 xc3, XAH xah) {
        this.A00 = xc3;
        this.A01 = xah;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A002 = VGF.A00(Pxj.A0E(viewGroup), viewGroup);
        C249703kE r1 = new C249703kE(A002);
        if (A002.getTag() instanceof C17532VZl) {
            return r1;
        }
        throw DbT.A0m();
    }
}
