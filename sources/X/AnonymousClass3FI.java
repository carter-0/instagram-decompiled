package X;

import android.content.Intent;

/* renamed from: X.3FI  reason: invalid class name */
public final class AnonymousClass3FI extends 1Jm {
    public Intent A00;

    public final String A00() {
        return "app foregrounded";
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        String str2 = this.A01;
        if (0qQ.A0K(str2, "cold_start")) {
            str = "Cold Start at ";
        } else {
            sb = new StringBuilder();
            sb.append("App foregrounded on  ");
            sb.append(str2);
            str = " at ";
        }
        sb.append(str);
        sb.append(this.A00);
        return sb.toString();
    }
}
