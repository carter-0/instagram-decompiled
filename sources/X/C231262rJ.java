package X;

import java.util.Iterator;

/* renamed from: X.2rJ  reason: invalid class name and case insensitive filesystem */
public abstract class C231262rJ extends AnonymousClass2rK {
    public final AnonymousClass2rX A00;

    public C231262rJ(AnonymousClass2lZ r5, AnonymousClass2rX r6, boolean z, boolean z2) {
        super(r5, z, z2);
        this.A00 = r6;
        if (z) {
            Iterator Eaa = r6.Eaa(this);
            int i = 0;
            while (Eaa.hasNext()) {
                Object next = Eaa.next();
                if (next != null) {
                    AnonymousClass2lZ.A00(r5, next, i);
                    i++;
                }
            }
        }
    }
}
