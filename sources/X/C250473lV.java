package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.3lV  reason: invalid class name and case insensitive filesystem */
public final class C250473lV extends CancellationException {
    public final transient C262204Co A00;

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C250473lV)) {
            return false;
        }
        C250473lV r3 = (C250473lV) obj;
        if (!0qQ.A0K(r3.getMessage(), getMessage()) || !0qQ.A0K(r3.A00, this.A00) || !0qQ.A0K(r3.getCause(), getCause())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.A00);
        return sb.toString();
    }

    public C250473lV(String str, Throwable th, C262204Co r3) {
        super(str);
        this.A00 = r3;
        if (th != null) {
            initCause(th);
        }
    }

    public final int hashCode() {
        int i;
        String message = getMessage();
        0qQ.A0A(message);
        int hashCode = ((message.hashCode() * 31) + this.A00.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
