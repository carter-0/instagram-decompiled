package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.7kC  reason: invalid class name and case insensitive filesystem */
public final class C339807kC extends C249703kE {
    public C339917kN A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final View A04;
    public final ImageView.ScaleType A05;
    public final IgSimpleImageView A06;
    public final IgSimpleImageView A07;
    public final IgTextView A08;
    public final C252063oV A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C339807kC(View view, int i) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = i;
        View requireViewById = view.requireViewById(R.id.button_icon);
        0qQ.A07(requireViewById);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) requireViewById;
        this.A07 = igSimpleImageView;
        View requireViewById2 = view.requireViewById(R.id.button_icon_image);
        0qQ.A07(requireViewById2);
        this.A06 = (IgSimpleImageView) requireViewById2;
        IgTextView requireViewById3 = view.requireViewById(R.id.button_name);
        0qQ.A07(requireViewById3);
        IgTextView igTextView = requireViewById3;
        this.A08 = igTextView;
        this.A09 = 2b1.A01(view.findViewById(R.id.button_new_badge_stub), false, false);
        View requireViewById4 = view.requireViewById(R.id.gallery_destination_item);
        0qQ.A07(requireViewById4);
        this.A04 = requireViewById4;
        ImageView.ScaleType scaleType = igSimpleImageView.getScaleType();
        0qQ.A07(scaleType);
        this.A05 = scaleType;
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        this.A02 = layoutParams.width;
        this.A01 = igTextView.getTextSize();
    }
}
