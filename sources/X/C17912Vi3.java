package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.Vi3  reason: case insensitive filesystem */
public final class C17912Vi3 {
    public List A00 = 0sn.A00;
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();
    public final String A05;
    public final Set A06 = new HashSet();

    public final void A00(String str, List list, SerialDescriptor serialDescriptor) {
        C51973G9u.A1E(str, serialDescriptor, list);
        if (this.A06.add(str)) {
            this.A03.add(str);
            this.A02.add(serialDescriptor);
            this.A01.add(list);
            this.A04.add(false);
            return;
        }
        throw new IllegalArgumentException(002.A0u("Element with name '", str, "' is already registered in ", this.A05));
    }

    public C17912Vi3(String str) {
        this.A05 = str;
    }
}
