package X;

import com.facebookpay.common.models.ErrorDialogContent;

/* renamed from: X.TQm  reason: case insensitive filesystem */
public final class C13221TQm extends RuntimeException {
    public final ErrorDialogContent A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C13221TQm) && 0qQ.A0K(this.A00, ((C13221TQm) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C13221TQm(ErrorDialogContent errorDialogContent) {
        this.A00 = errorDialogContent;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ECPErrorDialogException(errorDialogContent=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
