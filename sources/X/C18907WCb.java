package X;

import android.webkit.ValueCallback;

/* renamed from: X.WCb  reason: case insensitive filesystem */
public final class C18907WCb implements ValueCallback {
    public final /* synthetic */ C18489Vsk A00;
    public final /* synthetic */ C17305VQg A01;

    public C18907WCb(C18489Vsk vsk, C17305VQg vQg) {
        this.A01 = vQg;
        this.A00 = vsk;
    }

    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
        this.A01.A00.put(this.A00.A04, obj);
    }
}
