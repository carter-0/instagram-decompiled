package X;

import java.io.IOException;

/* renamed from: X.5I7  reason: invalid class name */
public class AnonymousClass5I7 extends IOException {
    public T5J A00;
    public boolean A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.5I7, X.R5c, java.io.IOException] */
    public static R5c A00() {
        ? iOException = new IOException("Protocol message tag had invalid wire type.");
        iOException.A00 = null;
        return iOException;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.5I7, java.io.IOException] */
    public static AnonymousClass5I7 A01() {
        ? iOException = new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        iOException.A00 = null;
        return iOException;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.5I7, java.io.IOException] */
    public static AnonymousClass5I7 A02() {
        ? iOException = new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        iOException.A00 = null;
        return iOException;
    }
}
