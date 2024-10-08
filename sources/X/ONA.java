package X;

import java.util.List;

public final class ONA {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ONA) && 0qQ.A0K(this.A00, ((ONA) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public ONA(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BackupDataModel(entries=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
