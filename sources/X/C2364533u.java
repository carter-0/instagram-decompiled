package X;

import android.os.Handler;

/* renamed from: X.33u  reason: invalid class name and case insensitive filesystem */
public final class C2364533u implements C2364633v {
    public static final C2364533u A00 = new Object();
    public static final Handler A01 = new Handler(C64021Cb.A00());

    public final void AGG() {
        A01.removeCallbacksAndMessages((Object) null);
    }

    public final void ATH(C62320sa r3) {
        A01.post(new AnonymousClass6EA(r3));
    }
}
