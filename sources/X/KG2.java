package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class KG2 extends C232222tE {
    public final LDE A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60705Jpq(DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_media_item, false), this.A01);
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r4) {
        0qQ.A0B(r4, 0);
        LDE lde = this.A00;
        View A0F = JTO.A0F(r4);
        lde.A00.A04(A0F);
        lde.A02.remove(A0F);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d2, code lost:
        if (r1 != null) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r10, X.C249703kE r11) {
        /*
            r9 = this;
            X.KUU r10 = (X.KUU) r10
            X.Jpq r11 = (X.C60705Jpq) r11
            r5 = 0
            X.AnonymousClass7TF.A1H(r10, r11)
            X.LDE r3 = r9.A00
            android.view.View r2 = X.JTO.A0F(r11)
            java.lang.String r1 = r10.A03
            r0 = 0
            X.30a r1 = X.AnonymousClass30Y.A00(r10, r0, r1)
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0028
            java.util.HashSet r0 = r3.A02
            r0.add(r2)
            X.Lju r0 = r3.A01
            r1.A00(r0)
            X.2el r0 = r3.A00
            X.C51967G9n.A0z(r2, r1, r0)
        L_0x0028:
            X.1Xj r3 = r10.A01
            boolean r0 = r3.A5F()
            if (r0 == 0) goto L_0x0037
            X.1Xj r3 = r3.A1c(r5)
            if (r3 != 0) goto L_0x0037
        L_0x0036:
            return
        L_0x0037:
            com.instagram.common.ui.base.IgTextView r8 = r11.A02
            boolean r0 = r10.A03
            r0 = r0 ^ 1
            r4 = 8
            int r0 = X.DbW.A01(r0)
            r8.setVisibility(r0)
            android.content.Context r7 = X.DbS.A07(r11)
            r6 = 2131966616(0x7f133a98, float:1.9570075E38)
            int r0 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r7)
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = X.C253673rC.A04(r1, r2, r0, r5, r5)
            X.DbX.A13(r7, r8, r0, r6)
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x00d5
            X.0eM r0 = r11.A07
            int r6 = X.DbX.A07(r0)
        L_0x006a:
            android.view.View r2 = r11.itemView
            r1 = -2
            X.2dQ r0 = new X.2dQ
            r0.<init>(r6, r1)
            r2.setLayoutParams(r0)
            com.instagram.igds.components.imagebutton.IgImageButton r2 = r11.A05
            com.instagram.discovery.ui.FixedAspectRatioVideoLayout r7 = r11.A04
            int r6 = r7.getChildCount()
            r1 = 2
            r0 = 8
            if (r6 != r1) goto L_0x0083
            r0 = 0
        L_0x0083:
            r2.setVisibility(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.A00 = r0
            boolean r0 = r3.A4o()
            if (r0 == 0) goto L_0x00ca
            android.net.Uri r1 = r3.A05
            if (r1 == 0) goto L_0x009e
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C253833rU.A00(r1, r0, r0)
        L_0x0099:
            X.0iw r0 = r11.A01
            r2.setUrl(r1, r0)
        L_0x009e:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r3.CeS()
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r3.A4Y()
            if (r0 == 0) goto L_0x00c4
            X.3oV r0 = r11.A03
            r0.setVisibility(r5)
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r1 = r11.A06
            r0 = 26
            X.LY7.A00(r1, r0, r3, r10)
        L_0x00ba:
            boolean r0 = r11.A08
            if (r0 != 0) goto L_0x0036
            r0 = 67
            X.LY6.A01(r2, r0, r10)
            return
        L_0x00c4:
            X.3oV r0 = r11.A03
            r0.setVisibility(r4)
            goto L_0x00ba
        L_0x00ca:
            android.content.Context r0 = X.JTQ.A06(r11)
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r3.A1n(r0)
            if (r1 == 0) goto L_0x009e
            goto L_0x0099
        L_0x00d5:
            int r6 = r11.A00
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KG2.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return KUU.class;
    }

    public KG2(LDE lde, boolean z) {
        this.A00 = lde;
        this.A01 = z;
    }
}
