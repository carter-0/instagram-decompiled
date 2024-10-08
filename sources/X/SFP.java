package X;

import java.util.LinkedHashSet;

public final class SFP {
    public Long A00;
    public Long A01;
    public Long A02;
    public boolean A03;
    public final LinkedHashSet A04;

    public SFP(Long l, LinkedHashSet linkedHashSet, boolean z) {
        this.A04 = linkedHashSet;
        this.A02 = l;
        this.A01 = null;
        this.A00 = null;
        this.A03 = z;
    }

    public SFP() {
        this((Long) null, DbS.A0y(), false);
    }
}
