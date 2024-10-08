package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.DjA  reason: case insensitive filesystem */
public final class C46681DjA extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C62320sa A01;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        AnonymousClass7TE.A1N(this.A00, textPaint, R.color.igds_secondary_text);
    }

    public C46681DjA(Context context, C62320sa r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onClick(View view) {
        this.A01.invoke();
    }
}
