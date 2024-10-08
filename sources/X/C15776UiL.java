package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.UiL  reason: case insensitive filesystem */
public final class C15776UiL extends C232222tE {
    public final AnonymousClass4DU A00;
    public final C20925X4q A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.UBb, X.3kE] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1U = AnonymousClass7TF.A1U(0, viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.publishing_collection_row, false);
        ? r2 = new C249703kE(A0D);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AnonymousClass7TF.A0F(A0D, R.id.collection_image);
        r2.A03 = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
        TextView A0G = DbU.A0G(A0D, R.id.collection_name);
        r2.A01 = A0G;
        C13988Tno.A16(A0G, A1U);
        r2.A00 = AnonymousClass7TE.A0d(A0D, R.id.collection_details);
        r2.A04 = (IgdsButton) A0D.findViewById(R.id.collection_action_button);
        r2.A02 = (IgSimpleImageView) A0D.findViewById(R.id.info_icon);
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (r0 == null) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r12, X.C249703kE r13) {
        /*
            r11 = this;
            X.WRv r12 = (X.C19262WRv) r12
            X.UBb r13 = (X.C14822UBb) r13
            boolean r4 = X.AnonymousClass7TG.A1Z(r12, r13)
            X.X4q r7 = r11.A01
            X.4DU r1 = r11.A00
            X.VkR r8 = r12.A00
            X.AnonymousClass7TF.A1B(r7, r4, r1)
            X.VYg r0 = r8.A00()
            X.VTi r0 = r0.A00
            if (r0 == 0) goto L_0x008c
            com.instagram.user.model.ProductCollectionImpl r6 = r0.A01
            X.VWn r5 = r0.A00
            android.widget.TextView r10 = r13.A01
            r9 = 0
            if (r6 == 0) goto L_0x008a
            java.lang.String r0 = r6.A08
        L_0x0024:
            r10.setText(r0)
            android.widget.TextView r3 = r13.A00
            if (r5 == 0) goto L_0x0088
            java.lang.String r0 = r5.A02
        L_0x002d:
            r3.setText(r0)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r2 = r13.A03
            if (r6 == 0) goto L_0x003e
            com.instagram.model.shopping.productcollection.ProductCollectionCover r0 = r6.A02
            if (r0 == 0) goto L_0x003e
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r0 = r0.BFw()
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r0 = r9
        L_0x003f:
            X.C17092VHo.A00(r2, r1, r0, r9, r4)
            android.view.View r4 = r13.itemView
            android.content.Context r1 = r4.getContext()
            r0 = 2130968710(0x7f040086, float:1.7546081E38)
            X.C13988Tno.A0q(r1, r4, r0)
            com.instagram.igds.components.button.IgdsButton r9 = r13.A04
            r0 = 8
            r9.setVisibility(r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r13.A02
            r1.setVisibility(r0)
            if (r5 == 0) goto L_0x0061
            X.L5B r0 = r5.A00
            r5 = 0
            if (r0 != 0) goto L_0x0062
        L_0x0061:
            r5 = 1
        L_0x0062:
            r4 = 4
            android.view.View[] r3 = new android.view.View[]{r2, r10, r3, r1}
            r2 = 0
        L_0x0068:
            r1 = r3[r2]
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r5 == 0) goto L_0x0071
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0071:
            r1.setAlpha(r0)
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x0068
            r9.setEnabled(r5)
            r0 = 60
            X.WB4 r1 = new X.WB4
            r1.<init>(r0, r7, r8, r6)
            android.view.View r0 = r13.itemView
            X.AnonymousClass0fU.A00(r1, r0)
            return
        L_0x0088:
            r0 = r9
            goto L_0x002d
        L_0x008a:
            r0 = r9
            goto L_0x0024
        L_0x008c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15776UiL.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C19262WRv.class;
    }

    public C15776UiL(AnonymousClass4DU r1, C20925X4q x4q) {
        this.A00 = r1;
        this.A01 = x4q;
    }
}
