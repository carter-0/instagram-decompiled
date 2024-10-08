package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.5r0  reason: invalid class name and case insensitive filesystem */
public final class C297005r0 {
    public final int A00;
    public final C295795ov A01;
    public final List A02;
    public final Map A03;

    public C297005r0(C295795ov r4, List list, Map map, int i) {
        this.A02 = list;
        this.A03 = map;
        this.A00 = i;
        this.A01 = r4;
        if (!(!list.isEmpty())) {
            throw new IllegalStateException("Check failed.");
        } else if (list.size() != map.size()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
