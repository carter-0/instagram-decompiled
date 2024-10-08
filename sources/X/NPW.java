package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public abstract class NPW extends C232232tF {
    public final C74388Pu4 A00;
    public final C74389Pu5 A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1U = AnonymousClass7TF.A1U(0, viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.direct_unified_sticker_entrypoint_item, false);
        C67941MxR mxR = new C67941MxR(A09);
        NQx.A01(AnonymousClass7TE.A0m(A09), this, A1U ? 1 : 0);
        return mxR;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        int i;
        C67941MxR mxR = (C67941MxR) r11;
        0qQ.A0B(mxR, 1);
        AnonymousClass7L0 AuX = this.A01.AuX();
        if (AuX != null) {
            C66583MXo.A0x(mxR.A01, AuX);
        }
        ImageView imageView = mxR.A00;
        boolean z = this instanceof C68742NVc;
        Context A0C = JTP.A0C(imageView, 0);
        if (z) {
            DbU.A11(A0C, imageView, R.drawable.direct_unified_cutout_sticker_entrypoint_icon);
        } else {
            DbU.A11(A0C, imageView, R.drawable.direct_unified_music_sticker_entrypoint_icon);
        }
        TextView textView = mxR.A01;
        if (z) {
            0qQ.A0B(textView, 0);
            i = 2131960627;
        } else {
            0qQ.A0B(textView, 0);
            i = 2131960630;
        }
        textView.setText(i);
        C74388Pu4 pu4 = this.A00;
        if (pu4 != null && (mxR.itemView instanceof ViewGroup) && pu4.Et0()) {
            Context A06 = JTQ.A06(mxR);
            View view = mxR.itemView;
            C66580MXl.A1R(view);
            ViewGroup viewGroup = (ViewGroup) view;
            View A0A = DbU.A0A(LayoutInflater.from(A06), viewGroup, R.layout.direct_unified_entry_point_nux, false);
            ViewGroup.LayoutParams layoutParams = A0A.getLayoutParams();
            if (layoutParams != null) {
                C71492dQ r2 = (C71492dQ) layoutParams;
                r2.A0s = imageView.getId();
                r2.A0u = imageView.getId();
                r2.topMargin = A06.getResources().getDimensionPixelSize(R.dimen.annotation_cluster_name_plate_padding_top);
                A0A.setLayoutParams(r2);
                viewGroup.setClipChildren(false);
                viewGroup.addView(A0A);
                pu4.Clj();
                return;
            }
            throw AnonymousClass7TE.A11("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public NPW(C74388Pu4 pu4, C74389Pu5 pu5) {
        this.A01 = pu5;
        this.A00 = pu4;
    }
}
