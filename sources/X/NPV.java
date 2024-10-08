package X;

import android.content.Context;

public final class NPV extends AnonymousClass4AA implements X40 {
    public final C3253572b A00;
    public final C320156rr A01;

    public final int CEi(Context context) {
        return -1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        NPV npv = (NPV) obj;
        if (this.A01 != npv.A01 || !this.A00.equals(npv.A00)) {
            return false;
        }
        return true;
    }

    public NPV(C3253572b r1, C320156rr r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
