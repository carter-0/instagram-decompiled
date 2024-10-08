package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Vcm  reason: case insensitive filesystem */
public final class C17717Vcm {
    public ImageUrl A00;
    public final int A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final RoundedCornerImageView A08;
    public final RoundedCornerImageView A09;
    public final RoundedCornerImageView A0A;
    public final View.OnClickListener A0B;
    public final View.OnClickListener A0C;
    public final ViewStub A0D;

    public C17717Vcm(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A0D = viewStub;
        this.A0C = onClickListener;
        this.A0B = onClickListener2;
        View inflate = viewStub.inflate();
        Context context = inflate.getContext();
        DbT.A16(context, inflate, 2Yu.A0H(context, R.attr.backgroundColorSecondary));
        AnonymousClass0fU.A00(onClickListener2, inflate);
        this.A04 = inflate;
        View requireViewById = inflate.requireViewById(R.id.thumbnail_image_view);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) requireViewById;
        AnonymousClass3MJ r4 = AnonymousClass3MJ.CENTER_CROP;
        roundedCornerImageView.setBitmapShaderScaleType(r4);
        0qQ.A07(requireViewById);
        this.A0A = roundedCornerImageView;
        View requireViewById2 = inflate.requireViewById(R.id.secondary_thumbnail_image_view);
        RoundedCornerImageView roundedCornerImageView2 = (RoundedCornerImageView) requireViewById2;
        roundedCornerImageView2.setBitmapShaderScaleType(r4);
        0qQ.A07(requireViewById2);
        this.A08 = roundedCornerImageView2;
        View requireViewById3 = inflate.requireViewById(R.id.tertiary_thumbnail_image_view);
        RoundedCornerImageView roundedCornerImageView3 = (RoundedCornerImageView) requireViewById3;
        roundedCornerImageView3.setBitmapShaderScaleType(r4);
        0qQ.A07(requireViewById3);
        this.A09 = roundedCornerImageView3;
        this.A07 = AnonymousClass7TG.A0R(inflate, R.id.title_text);
        this.A06 = AnonymousClass7TG.A0R(inflate, R.id.subtitle_text);
        View requireViewById4 = inflate.requireViewById(R.id.cta_text);
        TextView textView = (TextView) requireViewById4;
        C13988Tno.A16(textView, true);
        AnonymousClass0fU.A00(onClickListener, textView);
        0qQ.A07(requireViewById4);
        this.A05 = textView;
        this.A02 = inflate.findViewById(R.id.secondary_thumbnail_image_frame);
        this.A03 = inflate.findViewById(R.id.tertiary_thumbnail_image_frame);
        this.A01 = DbU.A05(viewStub).getDimensionPixelSize(R.dimen.container_height);
    }
}
