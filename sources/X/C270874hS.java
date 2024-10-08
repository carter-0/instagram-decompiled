package X;

import android.text.TextPaint;
import android.view.View;

/* renamed from: X.4hS  reason: invalid class name and case insensitive filesystem */
public final class C270874hS extends C252973q0 {
    public final /* synthetic */ C247733gp A00;
    public final /* synthetic */ 0MB A01;

    public C270874hS(C247733gp r1, 0MB r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        1Ng r5 = this.A01.A07;
        C247733gp r0 = this.A00;
        1Xj r4 = r0.A07;
        r4.getClass();
        r5.A00(new C240243Kd((AnonymousClass5OB) null, r4, r0.A0Z, r0.A0G));
    }

    public final void updateDrawState(TextPaint textPaint) {
        if (this.A00.A06 != C252883pr.Success) {
            textPaint.setAlpha(64);
        }
        this.A00 = textPaint.getColor();
    }
}
