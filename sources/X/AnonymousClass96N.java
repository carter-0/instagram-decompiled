package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.96N  reason: invalid class name */
public final class AnonymousClass96N extends C3734995s {
    public final C3734995s A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;
    public final Set A06;

    public AnonymousClass96N(C3734995s r11, AnonymousClass95n r12) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C3735395y r7 : r12.A03) {
            if (r7.A00 == 0) {
                boolean z = r7.A01 == 2;
                Class cls = r7.A02;
                if (z) {
                    hashSet4.add(cls);
                } else {
                    hashSet.add(cls);
                }
            } else {
                boolean z2 = r7.A01 == 2;
                Class cls2 = r7.A02;
                if (z2) {
                    hashSet5.add(cls2);
                } else {
                    hashSet2.add(cls2);
                }
            }
        }
        Set set = r12.A05;
        if (!set.isEmpty()) {
            hashSet.add(C3735295v.class);
        }
        this.A01 = Collections.unmodifiableSet(hashSet);
        this.A02 = Collections.unmodifiableSet(hashSet2);
        this.A06 = Collections.unmodifiableSet(hashSet3);
        this.A04 = Collections.unmodifiableSet(hashSet4);
        this.A05 = Collections.unmodifiableSet(hashSet5);
        this.A03 = set;
        this.A00 = r11;
    }
}
