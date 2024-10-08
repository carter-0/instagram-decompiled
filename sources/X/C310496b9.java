package X;

import java.io.File;

/* renamed from: X.6b9  reason: invalid class name and case insensitive filesystem */
public final class C310496b9 extends 2Cn {
    public final /* synthetic */ C310466b6 A00;

    public C310496b9(C310466b6 r1) {
        this.A00 = r1;
    }

    public final void onFail(Exception exc) {
        C310466b6.A00(this.A00);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        0qQ.A0B(file, 0);
        C310466b6 r1 = this.A00;
        r1.A03 = file.getAbsolutePath();
        C310466b6.A01(r1);
    }
}
