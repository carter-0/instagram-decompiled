package X;

import android.content.Context;

/* renamed from: X.FcX  reason: case insensitive filesystem */
public final class C50485FcX implements C367608rH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C3250670x A01;

    public C50485FcX(Context context, C3250670x r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onClick() {
        C3250670x r4 = this.A01;
        if (r4 instanceof C50664FgP) {
            AnonymousClass6ST A0h = DbV.A0h(this.A00);
            ((C50664FgP) r4).A00 = new C50351FZi(A0h, 3);
            AnonymousClass0fN.A00(A0h);
        }
        r4.onClick();
    }
}
