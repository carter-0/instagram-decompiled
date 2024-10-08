package X;

import android.view.View;

/* renamed from: X.Fn3  reason: case insensitive filesystem */
public final class C51012Fn3 implements G6X {
    public final int A00;
    public final Object A01;

    public C51012Fn3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final View getRowView() {
        View view;
        switch (this.A00) {
            case 0:
                view = ((K5H) this.A01).A08;
                if (view == null) {
                    throw AnonymousClass7TE.A0z(C66579MXk.A00(8));
                }
                break;
            case 1:
                view = ((K5H) this.A01).A05;
                if (view == null) {
                    throw AnonymousClass7TE.A0z(C66579MXk.A00(8));
                }
                break;
            case 2:
                view = ((K5H) this.A01).A04;
                if (view == null) {
                    throw AnonymousClass7TE.A0z(C66579MXk.A00(8));
                }
                break;
            default:
                view = ((E6R) this.A01).A04;
                if (view == null) {
                    throw AnonymousClass7TE.A0z(C66579MXk.A00(8));
                }
                break;
        }
        return view;
    }
}
