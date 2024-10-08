package X;

import android.os.SystemClock;

/* renamed from: X.5Is  reason: invalid class name and case insensitive filesystem */
public abstract class C283665Is extends AnonymousClass37I implements AnonymousClass37J {
    public final Object A00;
    public final String A01;
    public final String A02;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("markerAnnotate /");
        sb.append(this.A02);
        sb.append('/');
        sb.append(this.A01);
        sb.append(" = ");
        sb.append(this.A00);
        return sb.toString();
    }

    public C283665Is(String str, Object obj, String str2) {
        super("", SystemClock.uptimeMillis());
        this.A02 = str;
        this.A01 = str2;
        this.A00 = obj;
    }
}
