package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.Jz2  reason: case insensitive filesystem */
public final class C61209Jz2 extends AnonymousClass0T0 implements MXM {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61209Jz2) {
                C61209Jz2 jz2 = (C61209Jz2) obj;
                if (!0qQ.A0K(this.A00, jz2.A00) || !0qQ.A0K(this.A01, jz2.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("MutedWordItemModel(key=", this.A00, ", value=", this.A01, ')');
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C61209Jz2(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        N49 n49 = (N49) it.next();
        abstractCollection.add(new C61209Jz2(n49.A00, n49.A01));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
