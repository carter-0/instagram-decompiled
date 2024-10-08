package X;

import android.view.KeyEvent;

/* renamed from: X.42c  reason: invalid class name and case insensitive filesystem */
public final class C2595442c extends 1Jm implements AnonymousClass3FJ, C2595242a {
    public final KeyEvent A00;

    public final String A00() {
        return "key down";
    }

    public final int BK6() {
        return this.A00.getKeyCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyEvent.keyCodeToString(this.A00.getKeyCode()));
        sb.append(" down on ");
        sb.append(this.A01);
        sb.append(" at ");
        sb.append(this.A00);
        return sb.toString();
    }

    public C2595442c(KeyEvent keyEvent, String str) {
        super(str, keyEvent.getEventTime(), keyEvent.getDownTime());
        this.A00 = keyEvent;
    }
}
