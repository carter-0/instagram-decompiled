package X;

import android.content.Context;
import android.text.Editable;

/* renamed from: X.9qY  reason: invalid class name and case insensitive filesystem */
public final class C389989qY extends C306386Ly implements C41834B2p {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C389989qY(Context context, Editable editable, C358868bb r5, String str, double d, double d2, double d3, double d4, double d5, int i) {
        super(context, i);
        AnonymousClass7TF.A1D(str, 3, editable);
        this.A03 = d;
        this.A04 = d2;
        this.A02 = d3;
        this.A00 = d4;
        this.A01 = d5;
        Editable.Factory.getInstance().newEditable(str);
        AnonymousClass7TF.A11(context.getResources(), this, r5.A06.A05);
        A0L(editable);
        A0I(AnonymousClass91U.A01(AnonymousClass0qo.A00(context), r5.A05));
    }

    public final double Bsg() {
        return this.A00;
    }

    public final double Bsh() {
        return this.A01;
    }

    public final double Bsi() {
        return this.A02;
    }

    public final double Bsj() {
        return this.A03;
    }

    public final double Bsk() {
        return this.A04;
    }
}
