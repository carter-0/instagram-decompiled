package X;

import com.google.common.collect.ImmutableList;

public final class FAU {
    public boolean A00;
    public boolean A01;
    public final ImmutableList A02;
    public final String A03;
    public final boolean A04;

    public FAU(ImmutableList immutableList, String str, boolean z) {
        this.A03 = str;
        this.A02 = immutableList;
        this.A04 = z;
    }

    public FAU() {
        this((ImmutableList) null, (String) null, false);
    }
}
