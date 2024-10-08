package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class WCO implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ImageView A03;
    public final /* synthetic */ TextView A04;
    public final /* synthetic */ String A05;

    public WCO(View view, View view2, View view3, ImageView imageView, TextView textView, String str) {
        this.A01 = view;
        this.A03 = imageView;
        this.A02 = view2;
        this.A04 = textView;
        this.A00 = view3;
        this.A05 = str;
    }

    public final boolean onPreDraw() {
        int i;
        View view = this.A01;
        C13988Tno.A12(view, this);
        Context context = view.getContext();
        ImageView imageView = this.A03;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        0qQ.A0C(layoutParams, AnonymousClass000.A00(1));
        int width = view.getWidth() + context.getResources().getDimensionPixelSize(R.dimen.iglive_donations_donor_list_header_height);
        int height = view.getHeight() + context.getResources().getDimensionPixelSize(R.dimen.canvas_colour_wheel_offset_y);
        View view2 = this.A02;
        layoutParams.width = Math.min(view2.getWidth(), width);
        layoutParams.height = Math.min(view2.getHeight(), height);
        imageView.setLayoutParams(layoutParams);
        Drawable drawable = context.getDrawable(R.drawable.channel_scrim);
        Matrix matrix = new Matrix();
        if (drawable != null) {
            matrix.setScale(((float) width) / ((float) drawable.getIntrinsicWidth()), ((float) height) / ((float) drawable.getIntrinsicHeight()));
        }
        imageView.setImageMatrix(matrix);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.font_large);
        TextView textView = this.A04;
        TextPaint paint = textView.getPaint();
        0qQ.A07(paint);
        float f = (float) dimensionPixelSize;
        paint.setTextSize(f);
        View view3 = this.A00;
        if (view3 != null) {
            i = view3.getWidth();
        } else {
            i = 0;
        }
        if (new StaticLayout(this.A05, paint, view2.getWidth() - i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getLineCount() > 1) {
            C13990Tnq.A0o(context.getResources(), textView, R.dimen.account_group_management_row_text_size);
            return true;
        }
        textView.setTextSize(0, f);
        return true;
    }
}
