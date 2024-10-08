package X;

import android.widget.Adapter;

/* renamed from: X.33z  reason: invalid class name and case insensitive filesystem */
public final class C2365033z implements AnonymousClass340 {
    public final Adapter A00;

    public final Object C9G(int i) {
        Adapter adapter = this.A00;
        if (i < adapter.getCount()) {
            return adapter.getItem(i);
        }
        return null;
    }

    public final Class C9H(Object obj) {
        if (obj instanceof AnonymousClass3O8) {
            return AnonymousClass3O8.class;
        }
        if (obj instanceof AnonymousClass3OA) {
            return 1Xj.class;
        }
        return obj.getClass();
    }

    public C2365033z(Adapter adapter) {
        this.A00 = adapter;
    }
}
