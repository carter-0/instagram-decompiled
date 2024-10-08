package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.UeJ  reason: case insensitive filesystem */
public final class C15530UeJ extends C231632rz {
    public final Context A00;
    public final XC3 A01;
    public final XAH A02;

    public C15530UeJ(Context context, XC3 xc3, XAH xah) {
        0qQ.A0B(xah, 3);
        this.A00 = context;
        this.A01 = xc3;
        this.A02 = xah;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004c, code lost:
        if (r6 != null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r12, android.view.View r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r11 = this;
            r7 = r14
            r8 = r15
            r0 = 1653453095(0x628db127, float:1.306878E21)
            int r2 = X.DbX.A04(r13, r0)
            r3 = 3
            X.0qQ.A0B(r15, r3)
            X.Mg0 r8 = (X.C66967Mg0) r8
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.model.MapQuerySearchEntry"
            X.0qQ.A0C(r14, r0)
            X.Nff r7 = (X.C69156Nff) r7
            X.XC3 r9 = r11.A01
            X.XAH r1 = r11.A02
            java.lang.Object r4 = r13.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.ui.MapQueryRowViewBinder.Holder"
            X.0qQ.A0C(r4, r0)
            X.VZl r4 = (X.C17532VZl) r4
            boolean r10 = r8.A0F
            X.DbY.A1S(r7, r9)
            X.AnonymousClass7TF.A1D(r1, r3, r4)
            com.instagram.model.mapquery.MapQuery r0 = r7.A00
            android.view.View r3 = r4.A01
            r1.ECK(r3, r7, r8)
            android.widget.TextView r1 = r4.A03
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            r0 = 51
            X.WB4.A00(r3, r9, r7, r8, r0)
            com.instagram.common.ui.base.IgSimpleImageView r6 = r4.A00
            if (r6 != 0) goto L_0x004e
            android.view.ViewStub r0 = r4.A02
            com.instagram.common.ui.base.IgSimpleImageView r6 = X.C13989Tnp.A0U(r0)
            r4.A00 = r6
            if (r6 == 0) goto L_0x0052
        L_0x004e:
            r5 = 0
            X.C67429Mnk.A00(r5, r6, r7, r8, r9, r10)
        L_0x0052:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r4.A04
            android.content.res.Resources r1 = X.DbU.A05(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbX.A0G(r0)
            X.C13990Tnq.A0n(r1, r0)
            r0 = 590592415(0x2333b99f, float:9.742916E-18)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15530UeJ.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -1507793512);
        View A002 = VGF.A00(this.A00, viewGroup);
        AnonymousClass0fD.A0A(-1762020757, A04);
        return A002;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
