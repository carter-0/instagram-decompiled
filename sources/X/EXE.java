package X;

import java.util.Set;

public enum EXE {
    ONE_TAP(0),
    ONE_TAP_BACKUP(1),
    ALL_ONE_TAP(2),
    SMART_LOCK(3),
    GOOGLE(4),
    PROFILE(5),
    FX_MANI_IG_LOGGED_IN(6),
    CACHEABLE(7);
    
    public final EXE[] A00;

    /* access modifiers changed from: public */
    static {
        EXE[] exeArr;
        A01 = 0oU.A00(exeArr);
    }

    public static final void A00(EXE exe, Set set) {
        EXE[] exeArr = exe.A00;
        int length = exeArr.length;
        int i = 0;
        if (length == 0) {
            set.add(exe);
            return;
        }
        do {
            A00(exeArr[i], set);
            i++;
        } while (i < length);
    }

    /* access modifiers changed from: public */
    EXE(int i) {
        this.A00 = r2;
    }
}
