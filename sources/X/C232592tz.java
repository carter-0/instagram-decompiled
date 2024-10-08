package X;

import java.util.Set;

/* renamed from: X.2tz  reason: invalid class name and case insensitive filesystem */
public final class C232592tz extends C231572rt {
    public final Set A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C232592tz) && 0qQ.A0K(this.A00, ((C232592tz) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomFeeds(feeds=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C232592tz(Set set) {
        this.A00 = set;
    }
}
