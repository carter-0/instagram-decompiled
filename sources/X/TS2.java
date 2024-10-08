package X;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

public abstract class TS2<K, V> extends AbstractMap<K, V> {
    public transient Collection A00;
    public transient Set A01;
    public transient Set A02;

    public final Set entrySet() {
        Set set = this.A01;
        if (set == null) {
            if (this instanceof R0w) {
                set = new R0m((R0w) this);
            } else if (this instanceof R0j) {
                R0v r0v = (R0v) this;
                set = C281945Ae.A03(r0v.A00, r0v.A01.entrySet());
            } else if (this instanceof C8684R0i) {
                set = new Qzv((C8684R0i) this);
            } else if (this instanceof R0u) {
                set = new R0o((R0u) this);
            } else {
                set = new R0n((R0x) this);
            }
            this.A01 = set;
        }
        return set;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.R0x, X.Qz4] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.Qz7, X.R0x] */
    public Set keySet() {
        Set r1f;
        Set qz6;
        Set set = this.A02;
        if (set == null) {
            if (this instanceof R0j) {
                R0j r0j = (R0j) this;
                r1f = C281945Ae.A03(r0j.A00, r0j.A01.keySet());
            } else if (this instanceof C8684R0i) {
                r1f = new C8686R0q((C8684R0i) this);
            } else if (this instanceof R0u) {
                r1f = new C8685R0p((R0u) this);
            } else if (this instanceof C8663Qz4) {
                ? r3 = (C8663Qz4) this;
                if (r3 instanceof C8666Qz7) {
                    ? r32 = (C8666Qz7) r3;
                    qz6 = new C8667Qz8(r32.A00, (NavigableMap) ((SortedMap) r32.A00));
                } else {
                    qz6 = new C8665Qz6(r3.A01, (SortedMap) r3.A00);
                }
                set = qz6;
                this.A02 = qz6;
            } else {
                r1f = new R1F(this);
            }
            set = qz6;
            this.A02 = qz6;
        }
        return set;
    }

    public final Collection values() {
        Collection collection = this.A00;
        if (collection == null) {
            if (this instanceof R0v) {
                R0v r0v = (R0v) this;
                collection = new R0t(r0v.A00, r0v, r0v.A01);
            } else if (this instanceof R0u) {
                collection = new R0s((R0u) this);
            } else {
                collection = new C13237TRd(this);
            }
            this.A00 = collection;
        }
        return collection;
    }
}
