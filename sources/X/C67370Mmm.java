package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Mmm  reason: case insensitive filesystem */
public final class C67370Mmm extends C232222tE {
    public final XBt A00;
    public final X41 A01;
    public final 0sP A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        C69009Ncl ncl = (C69009Ncl) r9;
        C67953Mxd mxd = (C67953Mxd) r10;
        AnonymousClass7TF.A1H(ncl, mxd);
        this.A01.ECL(JTO.A0F(mxd), this.A00.B9n(ncl), ncl.A02, ncl, false);
        if (ncl.A02) {
            View view = mxd.itemView;
            C66584MXp.A0i(view, mxd, view.getPaddingLeft(), mxd.itemView.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        } else {
            View view2 = mxd.itemView;
            C66584MXp.A0i(view2, mxd, view2.getPaddingLeft(), 0);
        }
        if (ncl.A01) {
            View view3 = mxd.itemView;
            view3.setPadding(view3.getPaddingLeft(), mxd.itemView.getPaddingTop(), mxd.itemView.getPaddingRight(), mxd.itemView.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        } else {
            View view4 = mxd.itemView;
            view4.setPadding(view4.getPaddingLeft(), mxd.itemView.getPaddingTop(), mxd.itemView.getPaddingRight(), 0);
        }
        mxd.A01.setText(ncl.A00.A00().A04);
        C71409Ok8.A01(mxd.A00, 9, this, ncl);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67953Mxd(DbT.A0D(layoutInflater, viewGroup, R.layout.inline_keyword, false));
    }

    public final Class modelClass() {
        return C69009Ncl.class;
    }

    public C67370Mmm(XBt xBt, X41 x41, 0sP r3) {
        this.A00 = xBt;
        this.A01 = x41;
        this.A02 = r3;
    }
}
