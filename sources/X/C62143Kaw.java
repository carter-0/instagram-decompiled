package X;

import android.view.View;

/* renamed from: X.Kaw  reason: case insensitive filesystem */
public final class C62143Kaw extends C2806552w {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C61081JwJ A01;
    public final /* synthetic */ K85 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62143Kaw(C61081JwJ jwJ, K85 k85, int i, int i2) {
        super(Integer.valueOf(i2));
        this.A02 = k85;
        this.A01 = jwJ;
        this.A00 = i;
    }

    public final void onClick(View view) {
        2YL A0H = DbS.A0H(this.A02.A06);
        String str = this.A01.A01;
        int i = this.A00;
        AnonymousClass7TE.A1Z(new MFb(A0H, str, (AnonymousClass4D7) null, i, 0), JTP.A0J(A0H, str, 0));
    }
}
