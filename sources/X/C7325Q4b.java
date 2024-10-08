package X;

import android.app.Notification;

/* renamed from: X.Q4b  reason: case insensitive filesystem */
public final class C7325Q4b {
    public final int A00;
    public final int A01;
    public final Notification A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7325Q4b q4b = (C7325Q4b) obj;
            if (this.A01 == q4b.A01 && this.A00 == q4b.A00) {
                return this.A02.equals(q4b.A02);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("ForegroundInfo{");
        A16.append("mNotificationId=");
        A16.append(this.A01);
        A16.append(", mForegroundServiceType=");
        A16.append(this.A00);
        A16.append(", mNotification=");
        return Pxg.A0p(this.A02, A16);
    }

    public C7325Q4b(int i, Notification notification, int i2) {
        this.A01 = i;
        this.A02 = notification;
        this.A00 = i2;
    }
}
