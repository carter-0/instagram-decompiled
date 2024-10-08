package X;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;

/* renamed from: X.8kD  reason: invalid class name and case insensitive filesystem */
public abstract class C363708kD {
    public static final ImmutableSet A00;

    static {
        ArrayList arrayList = new ArrayList(r3);
        for (C363718kE name : C363718kE.values()) {
            arrayList.add(name.name());
        }
        ImmutableSet A03 = ImmutableSet.A03(00k.A0k(arrayList));
        0qQ.A07(A03);
        A00 = A03;
    }
}
