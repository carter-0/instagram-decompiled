package X;

import android.content.Context;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.VLi  reason: case insensitive filesystem */
public final class C17178VLi {
    public final C17614Vb6 A00;

    public C17178VLi(Context context, ReadableMap readableMap) {
        0qQ.A0B(context, 2);
        C17614Vb6 vb6 = null;
        if (readableMap != null) {
            try {
                vb6 = new C17614Vb6(context, readableMap);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.A00 = vb6;
    }
}
