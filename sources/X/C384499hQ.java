package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.9hQ  reason: invalid class name and case insensitive filesystem */
public final class C384499hQ extends C41510AvD {
    public final List A00;

    public C384499hQ(List list) {
        super(002.A0R("Dependency cycle detected: ", Arrays.toString(list.toArray())));
        this.A00 = list;
    }
}
