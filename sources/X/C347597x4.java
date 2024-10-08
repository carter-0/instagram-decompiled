package X;

import android.os.Bundle;

/* renamed from: X.7x4  reason: invalid class name and case insensitive filesystem */
public final class C347597x4 implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ AnonymousClass9PE A01;

    public C347597x4(Bundle bundle, AnonymousClass9PE r2) {
        this.A01 = r2;
        this.A00 = bundle;
    }

    public final void run() {
        AnonymousClass80Q r0 = this.A01.A06;
        if (r0 != null) {
            r0.A00.A0x.onSaveInstanceState(this.A00);
        }
    }
}
