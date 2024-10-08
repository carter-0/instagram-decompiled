package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.52w  reason: invalid class name and case insensitive filesystem */
public class C2806552w extends ClickableSpan {
    public final Integer color;

    public void onClick(View view) {
    }

    public void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        Integer num = this.color;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setUnderlineText(false);
    }

    public C2806552w(Integer num) {
        this.color = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2806552w(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }

    public C2806552w() {
        this((Integer) null);
    }
}
