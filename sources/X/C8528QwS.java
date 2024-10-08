package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: X.QwS  reason: case insensitive filesystem */
public abstract class C8528QwS extends SyO implements Serializable {
    public transient int A00;
    public transient Map A01;

    public final List A00(Object obj, Collection collection) {
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new C8524QwO((C13239TRf) null, this, obj, list);
        }
        return new C8524QwO((C13239TRf) null, this, obj, list);
    }
}
