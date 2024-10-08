package X;

import android.os.SystemClock;

/* renamed from: X.42Z  reason: invalid class name */
public final class AnonymousClass42Z extends 1Jn {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass42Z(String str, int i) {
        super(str, SystemClock.uptimeMillis());
        0qQ.A0B(str, 1);
        this.A00 = i;
    }

    public final String A00() {
        return "Legacy logging registration";
    }

    public final String toString() {
        return 002.A0R(this.A01, " was registered to be tracked in legacy logging");
    }
}
