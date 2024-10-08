package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.instagram.android.R;

public final class GVO {
    public final Drawable A00;
    public final TextView A01;

    public GVO(TextView textView, int i) {
        Drawable mutate;
        0qQ.A0B(textView, 1);
        Context context = textView.getContext();
        this.A01 = textView;
        textView.setCompoundDrawablePadding(AnonymousClass7TE.A0C(context.getResources()));
        Drawable drawable = context.getDrawable(R.drawable.music_explicit);
        this.A00 = drawable;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
    }

    public final void A00(boolean z) {
        TextUtils.TruncateAt truncateAt;
        TextView textView = this.A01;
        if (z) {
            truncateAt = TextUtils.TruncateAt.MARQUEE;
        } else {
            truncateAt = TextUtils.TruncateAt.END;
        }
        textView.setEllipsize(truncateAt);
        textView.setHorizontalFadingEdgeEnabled(z);
        textView.setSelected(z);
    }
}
