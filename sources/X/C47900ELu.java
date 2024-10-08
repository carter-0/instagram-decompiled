package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.ELu  reason: case insensitive filesystem */
public final class C47900ELu extends C315486jy {
    public final Context A00;
    public final CharSequence A01;

    public final /* bridge */ /* synthetic */ void ADq(C283255Gu r6, C284395Mi r7) {
        C369058tl r72 = (C369058tl) r7;
        AnonymousClass7TF.A1H(r72, r6);
        TextView textView = r72.A00;
        int color = textView.getContext().getColor(r6.A02);
        textView.setText(this.A01);
        textView.setTextColor(color);
        Drawable drawable = this.A00.getDrawable(R.drawable.chevron_right);
        if (drawable != null) {
            drawable.setTint(color);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.chevron_right, 0);
        }
    }

    public C47900ELu(Context context, CharSequence charSequence) {
        this.A00 = context;
        this.A01 = charSequence;
    }
}
