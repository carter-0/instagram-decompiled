package X;

import java.util.Collection;
import java.util.Collections;

/* renamed from: X.4ji  reason: invalid class name and case insensitive filesystem */
public final class C271864ji {
    public final Collection A00;
    public final Collection A01;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.equals(r0) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0030
            r2 = 0
            if (r5 == 0) goto L_0x001e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x001e
            X.4ji r5 = (X.C271864ji) r5
            java.util.Collection r1 = r4.A01
            java.util.Collection r0 = r5.A01
            if (r1 == 0) goto L_0x001f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0022
        L_0x001e:
            return r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            return r2
        L_0x0022:
            java.util.Collection r1 = r4.A00
            java.util.Collection r0 = r5.A00
            if (r1 == 0) goto L_0x002d
            boolean r3 = r1.equals(r0)
            return r3
        L_0x002d:
            if (r0 == 0) goto L_0x0030
            r3 = 0
        L_0x0030:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C271864ji.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        Collection collection = this.A01;
        int i2 = 0;
        if (collection != null) {
            i = collection.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Collection collection2 = this.A00;
        if (collection2 != null) {
            i2 = collection2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidationResult{validContent=");
        sb.append(this.A01);
        sb.append(", invalidatedContent=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public C271864ji(Collection collection, Collection collection2) {
        this.A01 = Collections.unmodifiableCollection(collection);
        this.A00 = Collections.unmodifiableCollection(collection2);
    }
}
