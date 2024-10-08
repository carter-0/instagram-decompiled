package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.JdT  reason: case insensitive filesystem */
public final class C60020JdT extends ClickableSpan {
    public final /* synthetic */ C59725JVj A00;
    public final /* synthetic */ C359448cq A01;
    public final /* synthetic */ LOZ A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ 0rm A04;

    public C60020JdT(C59725JVj jVj, C359448cq r2, LOZ loz, Boolean bool, 0rm r5) {
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = jVj;
        this.A03 = bool;
        this.A02 = loz;
    }

    public final void onClick(View view) {
        String A042;
        Object obj = this.A04.A00;
        C359448cq r6 = this.A01;
        C59725JVj jVj = this.A00;
        Boolean bool = this.A03;
        if (obj == null) {
            A042 = AnonymousClass000.A00(16);
        } else {
            A042 = 182.A04(0Tu.A05, r6.A05, 36878659377758405L);
        }
        C359448cq.A03(jVj, r6, bool, A042);
        this.A02.A01();
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
    }
}
