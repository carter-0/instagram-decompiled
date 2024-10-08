package X;

import android.os.Handler;
import android.view.View;

/* renamed from: X.7kE  reason: invalid class name and case insensitive filesystem */
public final class C339827kE extends AnonymousClass3NK {
    public final /* synthetic */ C249703kE A00;
    public final /* synthetic */ C339237jH A01;

    public C339827kE(C249703kE r1, C339237jH r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean Dqe(View view) {
        C339807kC r0 = (C339807kC) this.A00;
        int bindingAdapterPosition = r0.getBindingAdapterPosition();
        boolean z = false;
        if (r0.A09.CFV() == 0) {
            z = true;
        }
        if (bindingAdapterPosition != -1) {
            C61300mW r5 = this.A01.A02;
            0eP r6 = new 0eP(Integer.valueOf(bindingAdapterPosition), Boolean.valueOf(z));
            if ((!r6.equals(r5.A01)) || System.currentTimeMillis() - r5.A00 > 500) {
                r5.A00 = System.currentTimeMillis();
                r5.A01 = r6;
                Handler handler = r5.A02;
                handler.post(new 0mU(r5, r6));
                handler.postDelayed(new 0mV(r5), 500);
            }
        }
        return true;
    }
}
