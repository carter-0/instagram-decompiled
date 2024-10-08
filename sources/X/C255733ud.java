package X;

import android.view.View;

/* renamed from: X.3ud  reason: invalid class name and case insensitive filesystem */
public final class C255733ud extends C255743ue {
    public C255763ug A00;
    public C3270679g A01;
    public final Integer A02;
    public final String A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C255733ud(Integer num, String str, int i, boolean z) {
        this(num, str, "", i, z);
        0qQ.A0B(str, 2);
    }

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        C255763ug r1 = this.A00;
        if (r1 != null) {
            r1.D28(this, view, this.A03);
        }
    }

    public final void D9t(View view) {
        C3270679g r0 = this.A01;
        if (r0 != null) {
            r0.D9s();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C255733ud(Integer num, String str, String str2, int i, boolean z) {
        super(str2, i, z);
        0qQ.A0B(str, 2);
        0qQ.A0A(str2);
        this.A02 = num;
        this.A03 = str;
    }
}
