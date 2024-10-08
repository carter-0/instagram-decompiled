package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class KHM extends IgFrameLayout {
    public final IgTextView A00;
    public final IgImageView A01;
    public final boolean A02;

    public KHM(Context context) {
        super(context, (AttributeSet) null, 0);
        boolean A1S = AnonymousClass7TF.A1S(context.getResources().getConfiguration().uiMode & 48, 32);
        this.A02 = A1S;
        LayoutInflater.from(context).inflate(R.layout.prompt_pill, this, true);
        View findViewById = findViewById(R.id.pill_layout);
        Drawable drawable = A1S ? context.getDrawable(R.drawable.text_view_rounded_corner_dark_mode) : context.getDrawable(R.drawable.text_view_rounded_corner);
        if (findViewById != null) {
            findViewById.setBackground(drawable);
        }
        this.A00 = JTO.A0X(this, R.id.pill_text);
        this.A01 = JTO.A0Y(this, R.id.pill_image);
    }

    public final void setText(String str) {
        0qQ.A0B(str, 0);
        this.A00.setText(str);
    }

    public final void setImage(int i) {
        Drawable drawable = getContext().getDrawable(i);
        if (this.A02 && drawable != null) {
            C51969G9p.A12(PorterDuff.Mode.SRC_IN, drawable.mutate(), -1);
        }
        this.A01.setImageDrawable(drawable);
    }
}
