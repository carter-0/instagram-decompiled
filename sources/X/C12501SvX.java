package X;

import android.content.Context;

/* renamed from: X.SvX  reason: case insensitive filesystem */
public final class C12501SvX implements C13621Tdn {
    public final int A00;
    public final Object A01;

    public C12501SvX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DTe(String str) {
        Context context;
        String str2;
        int i = this.A00;
        RRM A07 = AnonymousClass2E0.A07();
        switch (i) {
            case 0:
                context = (Context) this.A01;
                break;
            case 1:
                context = ((C8132QhQ) this.A01).A01;
                break;
            case 2:
                context = ((C8127QhL) this.A01).A00;
                break;
            default:
                context = ((C8131QhP) this.A01).A00;
                if (context == null) {
                    str2 = "wrapperContext";
                    break;
                }
                break;
        }
        if (context == null) {
            str2 = "viewContext";
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        A07.A01(context, str);
    }
}
