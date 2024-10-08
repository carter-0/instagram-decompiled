package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.UjG  reason: case insensitive filesystem */
public final class C15831UjG extends IgLinearLayout {
    public C15831UjG(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Integer num, int i) {
        super(context);
        Drawable drawable;
        int i2;
        LayoutInflater.from(context).inflate(R.layout.checklist_status_row_with_text, this, true);
        TextView A0d = AnonymousClass7TE.A0d(this, R.id.primary_text);
        if (A0d != null) {
            if (charSequence2 != null) {
                A0d.setText(charSequence2);
                A0d.setVisibility(0);
            } else {
                A0d.setVisibility(8);
            }
        }
        TextView A0d2 = AnonymousClass7TE.A0d(this, R.id.secondary_text);
        if (A0d2 != null) {
            if (charSequence3 != null) {
                A0d2.setText(charSequence3);
                A0d2.setVisibility(0);
            } else {
                A0d2.setVisibility(8);
            }
        }
        TextView A0d3 = AnonymousClass7TE.A0d(this, R.id.circle_text_icon);
        if (A0d3 != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                drawable = context.getDrawable(R.drawable.circle_in_tertiary_icon_color_filled_24);
                A0d3.setText(charSequence);
                i2 = R.attr.igds_color_primary_text;
                DbT.A17(context, A0d3, 2Yu.A0H(context, i2));
            } else if (intValue != 1) {
                drawable = context.getDrawable(R.drawable.circle_check_in_primary_button_color_filled_24);
            } else {
                drawable = context.getDrawable(R.drawable.circle_in_primary_button_color_filled_24);
                A0d3.setText(charSequence);
                i2 = R.attr.igds_color_text_on_color;
                DbT.A17(context, A0d3, 2Yu.A0H(context, i2));
            }
            A0d3.setBackgroundDrawable(drawable);
            A0d3.setVisibility(0);
        }
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        if (progressBar == null) {
            return;
        }
        if (i == -1) {
            progressBar.setVisibility(8);
            return;
        }
        progressBar.setProgress(i);
        progressBar.setVisibility(0);
    }
}
