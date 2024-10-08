package X;

import java.util.regex.Pattern;

/* renamed from: X.79z  reason: invalid class name and case insensitive filesystem */
public final class C3272379z {
    public AnonymousClass7A0 A00;

    public final Pattern A00(String str) {
        Object obj;
        AnonymousClass7A0 r2 = this.A00;
        synchronized (r2) {
            obj = r2.A01.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            synchronized (r2) {
                r2.A01.put(str, pattern);
            }
        }
        return pattern;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.7A0] */
    public C3272379z(int i) {
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = new AnonymousClass7A1(obj, ((i * 4) / 3) + 1);
        this.A00 = obj;
    }
}
