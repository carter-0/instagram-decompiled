package X;

import android.app.Notification;

/* renamed from: X.Sd6  reason: case insensitive filesystem */
public final class C11603Sd6 implements TZV {
    public final int A00;
    public final Notification A01;
    public final String A02;
    public final String A03;

    public final String toString() {
        StringBuilder A16 = Pxe.A16("NotifyTask[");
        A16.append("packageName:");
        A16.append(this.A02);
        A16.append(", id:");
        A16.append(this.A00);
        A16.append(", tag:");
        A16.append(this.A03);
        return AnonymousClass7TF.A0l("]", A16);
    }

    public C11603Sd6(Notification notification, String str, String str2, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = notification;
    }
}
