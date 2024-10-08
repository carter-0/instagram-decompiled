package X;

import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public final class SDv {
    public static final SDv A01 = new SDv();
    public final Set A00;

    public SDv() {
        HashSet A1F = AnonymousClass7TE.A1F();
        this.A00 = A1F;
        A1F.add(Object.class.getName());
        A1F.add(Closeable.class.getName());
        A1F.add(Serializable.class.getName());
        A1F.add(AutoCloseable.class.getName());
        A1F.add(Cloneable.class.getName());
        A1F.add("java.util.logging.Handler");
        A1F.add("javax.naming.Referenceable");
        A1F.add("javax.sql.DataSource");
    }
}
