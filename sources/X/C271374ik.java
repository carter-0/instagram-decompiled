package X;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.4ik  reason: invalid class name and case insensitive filesystem */
public final class C271374ik {
    public int A00 = 0;
    public C70701OGw A01;
    public C70567OBp A02;
    public C282485Dg A03;
    public C271434iq A04 = null;
    public 1Xj A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;
    public List A0B;
    public Set A0C = Collections.emptySet();

    public final boolean A00() {
        Long l = this.A07;
        if (l == null || l.longValue() * 1000 >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }
}
