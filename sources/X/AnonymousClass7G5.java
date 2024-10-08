package X;

import com.instagram.direct.model.messaginguser.MessagingUser;

/* renamed from: X.7G5  reason: invalid class name */
public final class AnonymousClass7G5 extends C328547Ff {
    public final MessagingUser A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7G5) {
                AnonymousClass7G5 r5 = (AnonymousClass7G5) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        String str = this.A01;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Visible(senderUser=");
        sb.append(this.A00);
        sb.append(", primaryName=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass7G5(MessagingUser messagingUser, String str) {
        this.A00 = messagingUser;
        this.A01 = str;
    }
}
