package X;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.Xbx  reason: case insensitive filesystem */
public final class C21465Xbx {
    public int A00;
    public int A01;
    public int A02;
    public PendingIntent A03;
    public PendingIntent A04;
    public IconCompat A05;
    public String A06;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8wR, java.lang.Object] */
    public final C370428wR A00() {
        String str = this.A06;
        if (str == null) {
            if (this.A04 == null) {
                throw AnonymousClass7TE.A11("Must supply pending intent or shortcut to bubble");
            } else if (this.A05 == null) {
                throw AnonymousClass7TE.A11("Must supply an icon or shortcut for the bubble");
            }
        }
        PendingIntent pendingIntent = this.A04;
        PendingIntent pendingIntent2 = this.A03;
        IconCompat iconCompat = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        ? obj = new Object();
        obj.A04 = pendingIntent;
        obj.A05 = iconCompat;
        obj.A00 = i;
        obj.A01 = i2;
        obj.A03 = pendingIntent2;
        obj.A02 = i3;
        obj.A06 = str;
        obj.A02 = i3;
        return obj;
    }
}
