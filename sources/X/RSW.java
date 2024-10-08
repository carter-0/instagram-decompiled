package X;

import android.os.Process;
import com.facebook.breakpad.BreakpadManager;

public abstract class RSW {
    public static final Object A00(AnonymousClass6Tm r2) {
        String A0g = DbY.A0g(r2);
        int hashCode = A0g.hashCode();
        if (hashCode != -1488800881) {
            if (hashCode != -26746833) {
                if (hashCode != 78445 || !A0g.equals("OOM")) {
                    return null;
                }
                throw new OutOfMemoryError("Bloks Action bk.action.reliability.CrashNow triggered OOM");
            } else if (!A0g.equals("EXCEPTION")) {
                return null;
            } else {
                BreakpadManager.crashThisProcess();
                return null;
            }
        } else if (!A0g.equals("SIGKILL")) {
            return null;
        } else {
            Process.sendSignal(Process.myPid(), 9);
            return null;
        }
    }
}
