package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.util.regex.Pattern;

/* renamed from: X.FPm  reason: case insensitive filesystem */
public final class C50122FPm implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C61066Jw4 A01;
    public final /* synthetic */ String A02;

    public C50122FPm(TextView textView, C61066Jw4 jw4, String str) {
        this.A00 = textView;
        this.A02 = str;
        this.A01 = jw4;
    }

    public final boolean onPreDraw() {
        int i;
        TextView textView = this.A00;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        String str = this.A02;
        C61066Jw4 jw4 = this.A01;
        boolean z = jw4.A01;
        boolean z2 = jw4.A02;
        Context A0S = AnonymousClass7TE.A0S(textView);
        Drawable A002 = F5q.A00(A0S, z2);
        if (A002 != null) {
            i = A002.getIntrinsicWidth();
        } else {
            i = 0;
        }
        float measureText = textView.getPaint().measureText(" ");
        Rect rect = new Rect();
        TextPaint paint = textView.getPaint();
        Pattern pattern = 0mp.A01;
        paint.getTextBounds(str, 0, str.length(), rect);
        CharSequence charSequence = str;
        if (z) {
            float f = (float) i;
            charSequence = str;
            if (((float) rect.width()) + measureText + f > ((float) textView.getWidth())) {
                charSequence = TextUtils.ellipsize(str, textView.getPaint(), (((float) textView.getWidth()) - measureText) - f, TextUtils.TruncateAt.END, false, (TextUtils.EllipsizeCallback) null);
            }
        }
        SpannableStringBuilder A0C = DbS.A0C(charSequence);
        F5q.A01(A0S, A0C, true, true, z2);
        textView.setText(A0C);
        return true;
    }
}
