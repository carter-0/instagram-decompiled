package X;

import com.facebook.react.bridge.Callback;

/* renamed from: X.Wm4  reason: case insensitive filesystem */
public final class C20144Wm4 implements Runnable {
    public final /* synthetic */ Callback A00;
    public final /* synthetic */ C18613Vv6 A01;

    public C20144Wm4(Callback callback, C18613Vv6 vv6) {
        this.A01 = vv6;
        this.A00 = callback;
    }

    public final void run() {
        this.A00.invoke(Boolean.TRUE);
    }
}
