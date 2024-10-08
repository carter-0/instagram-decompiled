package X;

import android.util.LruCache;

/* renamed from: X.9OA  reason: invalid class name */
public final class AnonymousClass9OA implements C41813B1t {
    public AnonymousClass9OB A00;
    public final LruCache A01 = new C380269Xi(this);

    public final C295015nP ED0(String str) {
        0qQ.A0B(str, 0);
        return (C295015nP) this.A01.remove(str);
    }

    public final void E5N(C295015nP r2, String str) {
        AnonymousClass7TG.A1N(str, r2);
        this.A01.put(str, r2);
    }
}
