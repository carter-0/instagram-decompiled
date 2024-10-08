package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Qk6  reason: case insensitive filesystem */
public abstract class C8199Qk6 extends C8159Qi2 {
    public final Collection A00;
    public transient String A01;

    public C8199Qk6(C12837T9j t9j, 16F r3, String str, Collection collection) {
        super(str, (Throwable) null);
        this.A00 = t9j;
        this.A01 = r3;
        this.A00 = collection;
    }

    public final String A07() {
        Collection collection;
        String str = this.A01;
        if (str != null || (collection = this.A00) == null) {
            return str;
        }
        StringBuilder A14 = Pxe.A14(100);
        int size = collection.size();
        if (size != 1) {
            A14.append(" (");
            A14.append(size);
            A14.append(" known properties: ");
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                A14.append('\"');
                A14.append(String.valueOf(it.next()));
                A14.append('\"');
                if (A14.length() > 1000) {
                    A14.append(" [truncated]");
                    break;
                } else if (it.hasNext()) {
                    Pxe.A1Y(A14);
                }
            }
        } else {
            A14.append(" (one known property: \"");
            A14.append(String.valueOf(collection.iterator().next()));
            A14.append('\"');
        }
        String A0l = AnonymousClass7TF.A0l("])", A14);
        this.A01 = A0l;
        return A0l;
    }
}
