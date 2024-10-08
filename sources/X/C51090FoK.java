package X;

import android.content.Context;

/* renamed from: X.FoK  reason: case insensitive filesystem */
public final class C51090FoK implements G83 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ boolean A01;

    public final /* synthetic */ void onFinish() {
    }

    public final /* synthetic */ void onStart() {
    }

    public C51090FoK(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }

    public final void DEH(Integer num) {
        C59689JTv.A0B(this.A00, "something_went_wrong");
    }

    public final void onSuccess() {
        int i;
        boolean z = this.A01;
        Context context = this.A00;
        if (z) {
            i = 2131952092;
        } else {
            i = 2131952113;
        }
        C59689JTv.A07(context, i);
    }
}
