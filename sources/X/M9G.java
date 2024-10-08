package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.TextPaint;
import android.widget.TextView;
import com.instagram.android.R;

public final class M9G implements Runnable {
    public final /* synthetic */ M0V A00;
    public final /* synthetic */ MVX A01;
    public final /* synthetic */ C60687JpY A02;

    public M9G(M0V m0v, MVX mvx, C60687JpY jpY) {
        this.A02 = jpY;
        this.A00 = m0v;
        this.A01 = mvx;
    }

    public final void run() {
        TextView textView = this.A02.A07;
        String str = this.A00.A0D;
        if (str != null) {
            MVX mvx = this.A01;
            0qQ.A0B(textView, 0);
            Context context = textView.getContext();
            Resources resources = context.getResources();
            TextPaint textPaint = new TextPaint(1);
            textPaint.density = resources.getDisplayMetrics().density;
            textPaint.linkColor = 2Yu.A0F(context, R.attr.igds_color_link);
            AnonymousClass7TE.A1N(context, textPaint, 2Yu.A07(context));
            textPaint.setTextSize(textView.getTextSize());
            CharSequence A012 = C252993q2.A01(new 0rN(Layout.Alignment.ALIGN_NORMAL, textPaint, (String) null, 0.0f, textView.getLineSpacingMultiplier(), textView.getMeasuredWidth(), false), "", str, context.getResources().getString(2131954762), 2, false);
            0qQ.A07(A012);
            if (A012.equals(str)) {
                textView.setText(str);
                return;
            }
            DbT.A1H(textView);
            textView.setHighlightColor(0);
            C63487Kxr.A00(context, resources, textView, mvx, A012, str, true);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
