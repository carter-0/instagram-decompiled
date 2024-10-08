package X;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.concurrent.Executor;

public final class Q2C {
    public static Q2C A03;
    public SGZ A00;
    public Boolean A01;
    public final Q2D A02;

    public final boolean A01() {
        return AnonymousClass7TF.A1Q(this.A02.A03(255));
    }

    public final boolean A02() {
        Boolean bool = this.A01;
        if (bool == null) {
            Q2D q2d = this.A02;
            bool = Boolean.valueOf(JTQ.A1O(q2d.A03(255), 12));
            this.A01 = bool;
            if (bool == null) {
                if (q2d.A03(255) == 12) {
                    return false;
                }
                return true;
            }
        }
        return bool.booleanValue();
    }

    public Q2C(Context context) {
        this.A02 = new Q2D(new Q2E(context));
    }

    public final void A00(Fragment fragment, C13756TgS tgS, boolean z) {
        KeyguardManager keyguardManager;
        S2Z s2z;
        Context requireContext = fragment.requireContext();
        Executor mainExecutor = requireContext.getMainExecutor();
        0qQ.A07(mainExecutor);
        this.A00 = new SGZ(new QAU(tgS, this), fragment, mainExecutor);
        Object systemService = requireContext.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            keyguardManager = (KeyguardManager) systemService;
        } else {
            keyguardManager = null;
        }
        int i = 2131963790;
        int i2 = 2131963788;
        if (z) {
            i = 2131963789;
            i2 = 2131963787;
        }
        if (keyguardManager == null || !keyguardManager.isDeviceSecure()) {
            s2z = new S2Z();
            s2z.A03 = requireContext.getString(i);
            s2z.A01 = requireContext.getString(i2);
        } else {
            s2z = new S2Z();
            s2z.A03 = requireContext.getString(i);
            s2z.A01 = requireContext.getString(i2);
            s2z.A00 = 33023;
        }
        C10714Rws A002 = s2z.A00();
        0qQ.A0A(A002);
        SGZ sgz = this.A00;
        if (sgz != null) {
            SGZ.A00((SR5) null, A002, sgz);
        }
    }
}
