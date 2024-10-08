package X;

import android.view.View;

/* renamed from: X.52v  reason: invalid class name and case insensitive filesystem */
public final class C2806452v extends C2806552w {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C242813Wa A01;
    public final /* synthetic */ AnonymousClass3W1 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2806452v(1Xj r2, C242813Wa r3, AnonymousClass3W1 r4, int i) {
        super(Integer.valueOf(i));
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final void onClick(View view) {
        C242813Wa r3 = this.A01;
        1Xj r2 = this.A00;
        AnonymousClass3W1 r1 = this.A02;
        r3.D3M(r2, r1, r1.getPosition());
    }
}
