package X;

import android.view.View;

public final class IVO implements MVB {
    public final /* synthetic */ AnonymousClass41T A00;
    public final /* synthetic */ 215 A01;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public IVO(AnonymousClass41T r1, 215 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onButtonClick(View view) {
        215 r1 = this.A01;
        AnonymousClass41T r0 = this.A00;
        215.A04(r1, r0.A05, r0.A08, "Snack Bar open button clicked", (String) null, r0.A07);
        215.A03(r0, r1);
    }
}
