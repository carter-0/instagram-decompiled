package X;

import android.os.Process;
import java.lang.reflect.Method;

/* renamed from: X.5dz  reason: invalid class name and case insensitive filesystem */
public final class C289655dz extends 0Lp {
    public final /* synthetic */ C267454ba A00;

    public C289655dz(C267454ba r1) {
        this.A00 = r1;
    }

    public final 0HV AjQ(0HW r4, String str, Method method, Object[] objArr) {
        if (!str.equals("media_session") || !method.getName().equals("dispatchVolumeKeyEvent") || Process.myPid() != Process.myTid()) {
            return null;
        }
        this.A00.A02.post(new C73342Pb1(r4, this, method, objArr));
        return new 0HV((Object) null);
    }
}
