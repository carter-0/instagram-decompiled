package X;

import android.content.Context;

/* renamed from: X.WEs  reason: case insensitive filesystem */
public final /* synthetic */ class C18965WEs implements X24 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C14556TyL A01;

    public /* synthetic */ C18965WEs(Context context, C14556TyL tyL) {
        this.A01 = tyL;
        this.A00 = context;
    }

    public final boolean D0Q(Integer num) {
        int i;
        C14556TyL tyL = this.A01;
        Context context = this.A00;
        if (num != AnonymousClass05K.A01) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        i = 5;
                    }
                    return true;
                }
                i = 4;
                tyL.A00 = i;
                return true;
            }
            tyL.A00 = 3;
            return true;
        }
        tyL.A0C(context);
        tyL.A00 = 2;
        return false;
    }
}
