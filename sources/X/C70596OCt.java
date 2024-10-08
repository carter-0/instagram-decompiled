package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.OCt  reason: case insensitive filesystem */
public final class C70596OCt {
    public final IgSimpleImageView A00;
    public final C74280Ps8 A01;

    public C70596OCt(Context context, View.OnClickListener onClickListener, ViewGroup viewGroup, C74280Ps8 ps8) {
        this.A01 = ps8;
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.picker_tab);
        this.A00 = igSimpleImageView;
        PRE pre = (PRE) ps8;
        DbU.A13(igSimpleImageView.getContext(), igSimpleImageView, pre.A01);
        DbU.A12(context, igSimpleImageView, pre.A00);
        AnonymousClass0fU.A00(onClickListener, igSimpleImageView);
    }
}
