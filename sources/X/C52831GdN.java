package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.GdN  reason: case insensitive filesystem */
public final class C52831GdN extends ClickableSpan {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass07Z A02;
    public final /* synthetic */ C53033GhO A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ boolean A05;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public C52831GdN(Context context, AnonymousClass07Z r2, C53033GhO ghO, 0sP r4, long j, boolean z) {
        this.A03 = ghO;
        this.A01 = context;
        this.A00 = j;
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = z;
    }

    public final void onClick(View view) {
        C53033GhO ghO = this.A03;
        Context context = this.A01;
        long j = this.A00;
        ghO.A02(context, this.A02, AnonymousClass7TF.A0c(), (String) null, this.A04, j, this.A05, false);
    }
}
