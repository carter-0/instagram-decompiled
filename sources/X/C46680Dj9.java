package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Dj9  reason: case insensitive filesystem */
public final class C46680Dj9 extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C62320sa A01;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        AnonymousClass7TE.A1N(this.A00, textPaint, R.color.design_dark_default_color_on_background);
    }

    public C46680Dj9(Context context, C62320sa r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onClick(View view) {
        this.A01.invoke();
    }
}
