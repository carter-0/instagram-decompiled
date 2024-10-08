package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Gj6  reason: case insensitive filesystem */
public final class C53134Gj6 extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final RoundedCornerImageView A03;

    public C53134Gj6(View view) {
        super(view);
        this.A00 = view;
        IgImageView requireViewById = view.requireViewById(R.id.image_view);
        IgImageView igImageView = (RoundedCornerImageView) requireViewById;
        igImageView.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
        Context context = view.getContext();
        igImageView.setPlaceHolderColor(context.getColor(2Yu.A0H(igImageView.getContext(), R.attr.igds_color_photo_placeholder)));
        0qQ.A07(requireViewById);
        this.A03 = igImageView;
        View requireViewById2 = view.requireViewById(R.id.title_view);
        TextView textView = (TextView) requireViewById2;
        textView.setTypeface(AnonymousClass7TG.A0N(context));
        0qQ.A07(requireViewById2);
        this.A02 = textView;
        this.A01 = AnonymousClass7TG.A0R(view, R.id.subtitle_view);
    }
}
