package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.WIv  reason: case insensitive filesystem */
public final class C19065WIv implements C20876X2c {
    public final Callback A00;
    public final ReadableMap A01;
    public final /* synthetic */ C18592Vuj A02;

    public C19065WIv(Callback callback, ReadableMap readableMap, C18592Vuj vuj) {
        this.A02 = vuj;
        this.A01 = readableMap;
        this.A00 = callback;
    }

    public final void AT8() {
        W0R w0r = this.A02.A0L;
        ReadableMap readableMap = this.A01;
        Callback callback = this.A00;
        synchronized (w0r) {
            C18613Vv6 vv6 = w0r.A08;
            if (readableMap == null) {
                vv6.A01();
            } else {
                int i = 0;
                vv6.A02 = false;
                if (readableMap.hasKey(TraceFieldType.Duration)) {
                    i = readableMap.getInt(TraceFieldType.Duration);
                }
                if (readableMap.hasKey("create")) {
                    vv6.A04.A01(i, readableMap.getMap("create"));
                    vv6.A02 = true;
                }
                if (readableMap.hasKey("update")) {
                    vv6.A06.A01(i, readableMap.getMap("update"));
                    vv6.A02 = true;
                }
                if (readableMap.hasKey("delete")) {
                    vv6.A05.A01(i, readableMap.getMap("delete"));
                    vv6.A02 = true;
                }
                if (vv6.A02 && callback != null) {
                    vv6.A01 = new C20144Wm4(callback, vv6);
                }
            }
        }
    }
}
