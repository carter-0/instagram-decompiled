package X;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import java.util.Set;

public final class SIW {
    public static final 0PH A04 = new 0PH("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M");
    public final 0PH A00;
    public final Set A01;
    public final AnonymousClass0eM A02 = C13346TVt.A00(this, 24);
    public final AnonymousClass0eM A03 = C13346TVt.A00(this, 25);

    public final boolean A00(Context context) {
        if (((AnonymousClass0cT) this.A03.getValue()).A03(context, (Intent) null, (0bY) null) || Binder.getCallingPid() == Process.myPid()) {
            return true;
        }
        return false;
    }

    public SIW(0PH r2, Set set) {
        AnonymousClass7TG.A1O(r2, set);
        this.A00 = r2;
        this.A01 = set;
    }

    public final boolean A01(Context context, Intent intent) {
        if (Binder.getCallingPid() == Process.myPid() || ((AnonymousClass0cT) this.A03.getValue()).A03(context, intent, (0bY) null)) {
            return true;
        }
        return false;
    }
}
