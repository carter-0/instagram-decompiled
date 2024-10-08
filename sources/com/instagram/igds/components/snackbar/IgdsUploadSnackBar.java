package com.instagram.igds.components.snackbar;

import X.0qQ;
import X.2Yu;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsUploadSnackBar extends IgFrameLayout {
    public final ProgressBar A00;
    public final TextView A01;
    public final ViewGroup A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final IgFrameLayout A06;
    public final RoundedCornerImageView A07;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsUploadSnackBar(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void setButtonTextAndOnClickListener(String str, View.OnClickListener onClickListener) {
        int i = 0;
        0qQ.A0B(str, 0);
        TextView textView = this.A01;
        textView.setText(str);
        textView.setOnClickListener(onClickListener);
        if (str.length() <= 0) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setExplanationText(String str) {
        int i = 0;
        0qQ.A0B(str, 0);
        TextView textView = this.A04;
        textView.setText(str);
        if (str.length() <= 0) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    public final void setMediaThumbnailBitmap(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        this.A07.setImageBitmap(bitmap);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    public final void setMediaThumbnailDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        this.A07.setImageDrawable(drawable);
    }

    public final void setStatusText(String str) {
        0qQ.A0B(str, 0);
        this.A05.setText(str);
    }

    public final void setContainerVisibility(int i) {
        this.A06.setVisibility(i);
    }

    public final void setMediaThumbnailDrawableRes(int i) {
        throw new UnsupportedOperationException();
    }

    public final void setOverlayVisibility(int i) {
        this.A03.setVisibility(i);
    }

    public final void setProgressBarVisibility(int i) {
        this.A00.setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsUploadSnackBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.MarginLayoutParams marginLayoutParams;
        0qQ.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.igds_upload_snackbar, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.upload_snackbar_container);
        this.A02 = viewGroup;
        this.A07 = (RoundedCornerImageView) findViewById(R.id.media_thumbnail);
        this.A03 = (ImageView) findViewById(R.id.media_thumbnail_overlay);
        this.A06 = (IgFrameLayout) findViewById(R.id.media_thumbnail_container);
        this.A05 = (TextView) findViewById(R.id.status_text);
        this.A04 = (TextView) findViewById(R.id.explanation_text);
        this.A00 = (ProgressBar) findViewById(R.id.progress_bar);
        this.A01 = (TextView) findViewById(R.id.upload_snackbar_button);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_tag_or_toast_background)));
        Resources resources = viewGroup.getResources();
        gradientDrawable.setCornerRadius((float) resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
        viewGroup.setBackground(gradientDrawable);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
            marginLayoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        viewGroup.setElevation((float) resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
    }

    public final void setExplanationText(int i) {
        TextView textView = this.A04;
        textView.setText(i);
        textView.setVisibility(0);
    }

    public final void setStatusText(int i) {
        this.A05.setText(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsUploadSnackBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsUploadSnackBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
