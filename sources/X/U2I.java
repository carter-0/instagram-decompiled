package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.accessibility.AccessibleTextView;

public final class U2I extends ClickableSpan {
    public final /* synthetic */ AccessibleTextView A00;
    public final /* synthetic */ C14233TsG A01;
    public final /* synthetic */ boolean A02;

    public U2I(AccessibleTextView accessibleTextView, C14233TsG tsG, boolean z) {
        this.A02 = z;
        this.A00 = accessibleTextView;
        this.A01 = tsG;
    }

    public final void onClick(View view) {
        DbS.A1U(this.A01.A01.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.accessibility.AccessibleTextView, android.view.View] */
    public final void updateDrawState(TextPaint textPaint) {
        int i;
        DbW.A0u(textPaint);
        boolean z = this.A02;
        Context context = this.A00.getContext();
        if (z) {
            i = 2Yu.A0H(context, R.attr.igds_color_primary_text);
        } else {
            i = R.color.igds_pill_active_text;
        }
        AnonymousClass7TE.A1N(context, textPaint, i);
    }
}
