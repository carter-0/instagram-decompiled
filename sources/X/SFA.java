package X;

import android.os.Bundle;

public final class SFA {
    public int A00;
    public final int A01;
    public final Bundle A02;
    public final String A03;

    public SFA(int i, String str, Bundle bundle) {
        this.A00 = -1;
        this.A01 = i;
        this.A03 = str;
        this.A02 = bundle;
    }

    public SFA(String str, Bundle bundle) {
        this(0, str, bundle);
    }
}
