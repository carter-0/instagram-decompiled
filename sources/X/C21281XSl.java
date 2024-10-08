package X;

import android.os.Bundle;

/* renamed from: X.XSl  reason: case insensitive filesystem */
public abstract class C21281XSl extends Exception {
    public final int A00;
    public final Bundle A01;

    public C21281XSl(Bundle bundle, String str, Throwable th, int i) {
        super(str, th);
        this.A00 = i;
        this.A01 = bundle;
    }
}
