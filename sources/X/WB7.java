package X;

import android.content.DialogInterface;
import android.view.View;

public final class WB7 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;
    public final Object A0D;
    public final Object A0E;

    public WB7(DialogInterface.OnDismissListener onDismissListener, AnonymousClass0iw r2, AnonymousClass6ZF r3, XCI xci, X4S x4s, X4T x4t, C19201WPh wPh, C273414mX r8, AnonymousClass6ZK r9, AnonymousClass6ZH r10, AnonymousClass6ZC r11, AnonymousClass6ZJ r12, AnonymousClass6ZI r13, CharSequence charSequence, int i) {
        this.A00 = i;
        this.A06 = wPh;
        this.A0A = charSequence;
        this.A07 = xci;
        this.A0E = onDismissListener;
        this.A02 = r3;
        this.A01 = r2;
        this.A0B = r9;
        this.A03 = r11;
        this.A0C = r10;
        this.A09 = r13;
        this.A08 = r12;
        this.A0D = r8;
        this.A05 = x4t;
        this.A04 = x4s;
    }

    public static void A00(WB7 wb7) {
        XCI xci = (XCI) wb7.A07;
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) wb7.A0E;
        AnonymousClass6ZF r2 = (AnonymousClass6ZF) wb7.A02;
        AnonymousClass0iw r1 = (AnonymousClass0iw) wb7.A01;
        AnonymousClass6ZK r8 = (AnonymousClass6ZK) wb7.A0B;
        AnonymousClass6ZC r10 = (AnonymousClass6ZC) wb7.A03;
        AnonymousClass6ZH r9 = (AnonymousClass6ZH) wb7.A0C;
        AnonymousClass6ZI r12 = (AnonymousClass6ZI) wb7.A09;
        AnonymousClass6ZJ r11 = (AnonymousClass6ZJ) wb7.A08;
        C273414mX r7 = (C273414mX) wb7.A0D;
        X4T x4t = (X4T) wb7.A05;
        C19201WPh.A02(onDismissListener, r1, r2, xci, (X4S) wb7.A04, x4t, (C19201WPh) wb7.A06, r7, r8, r9, r10, r11, r12, (CharSequence) wb7.A0A);
    }

    public final void onClick(View view) {
        int A052;
        int i;
        if (this.A00 != 0) {
            A052 = AnonymousClass0fD.A05(952741111);
            A00(this);
            i = 260057667;
        } else {
            A052 = AnonymousClass0fD.A05(-285865731);
            A00(this);
            i = 1051763672;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
