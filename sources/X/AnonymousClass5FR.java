package X;

import android.view.KeyEvent;

/* renamed from: X.5FR  reason: invalid class name */
public final class AnonymousClass5FR extends 1Jm implements AnonymousClass3FJ {
    public final KeyEvent A00;

    public final String A00() {
        return "key up";
    }

    public final int BK6() {
        return this.A00.getKeyCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyEvent.keyCodeToString(this.A00.getKeyCode()));
        sb.append(" up on ");
        sb.append(this.A01);
        sb.append(" at ");
        sb.append(this.A00);
        return sb.toString();
    }

    public AnonymousClass5FR(KeyEvent keyEvent, String str) {
        super(str, keyEvent.getEventTime(), keyEvent.getDownTime());
        this.A00 = keyEvent;
    }
}
