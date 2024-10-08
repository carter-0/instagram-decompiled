package X;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.7tH  reason: invalid class name and case insensitive filesystem */
public final class C345307tH extends C344317rf implements ComponentCallbacks2, C345317tI {
    public static final int[] A04 = {80, 15};
    public C344037rD A00;
    public final C345327tJ A01;
    public final C343967r6 A02;
    public final LinkedList A03 = new LinkedList();

    public final void onConfigurationChanged(Configuration configuration) {
    }

    private final void A00() {
        LinkedList linkedList = this.A03;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            0qQ.A07(it);
            if (it.hasNext()) {
                0qQ.A07(it.next());
                throw new NullPointerException("onLowMemory");
            }
        }
    }

    public final void A09() {
        this.A00 = (C344037rD) this.A00.Apf(C344037rD.A00);
    }

    public final C343717qg BJt() {
        return C345317tI.A00;
    }

    public final void onTrimMemory(int i) {
        int[] iArr = A04;
        int i2 = 0;
        while (i != iArr[i2]) {
            i2++;
            if (i2 >= 2) {
                return;
            }
        }
        A00();
        C344037rD r0 = this.A00;
        if (r0 != null) {
            r0.BY6().onEvent(15, (String) null, true);
        }
    }

    public C345307tH(C343837qt r4) {
        super(r4);
        C343837qt r2 = this.A00;
        Object systemService = r2.getContext().getSystemService("activity");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.A02 = (C343967r6) r2.Apf(C343967r6.A00);
        this.A01 = new C345327tJ((ActivityManager) systemService);
    }

    public final void onLowMemory() {
        A00();
        C344037rD r0 = this.A00;
        if (r0 != null) {
            r0.BY6().onEvent(15, (String) null, true);
        }
    }
}
