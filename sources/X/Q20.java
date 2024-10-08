package X;

import com.facebook.common.dextricks.DalvikInternals;

public final class Q20 extends 0vM {
    public Q20() {
        super("mprotect", 397, 5, false, false);
    }

    public final void loggedRun() {
        DalvikInternals.mprotectExecCode();
    }
}
