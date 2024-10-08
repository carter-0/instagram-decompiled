package X;

import com.facebook.react.modules.appstate.AppStateModule;

/* renamed from: X.R9t  reason: case insensitive filesystem */
public final class C8792R9t extends 0ng {
    public final /* synthetic */ T76 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8792R9t(T76 t76) {
        super(266, 4, false, false);
        this.A00 = t76;
    }

    public final void run() {
        1x2 r1;
        synchronized (this.A00) {
            synchronized (1x2.class) {
                try {
                    r1 = 1x2.A06;
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            if (r1 != null) {
                1x2.A01(r1, AppStateModule.APP_STATE_BACKGROUND);
                SFG sfg = r1.A03;
                if (sfg != null) {
                    C59560Zm r12 = (C59560Zm) r1.A01.A03;
                    synchronized (sfg) {
                        try {
                            r12.A04(sfg.A01);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            }
        }
    }
}
