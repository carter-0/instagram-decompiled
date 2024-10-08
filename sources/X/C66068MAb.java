package X;

import android.view.WindowManager;
import java.util.Observable;
import java.util.Observer;

/* renamed from: X.MAb  reason: case insensitive filesystem */
public final class C66068MAb implements Observer {
    public WindowManager.LayoutParams A00;
    public WindowManager A01;
    public AnonymousClass3LD A02;
    public C60043Jdw A03;
    public 1QN A04;
    public boolean A05;

    public final void update(Observable observable, Object obj) {
        C60043Jdw jdw;
        boolean z;
        C60043Jdw jdw2;
        boolean z2;
        C60043Jdw jdw3 = this.A03;
        if (jdw3 != null) {
            AnonymousClass3LD r0 = this.A02;
            if (r0 != null) {
                String str = r0.A00;
                if (r0.A01) {
                    WindowManager windowManager = this.A01;
                    if (!this.A05 && windowManager != null) {
                        windowManager.addView(jdw3, this.A00);
                        z2 = true;
                    }
                    jdw3.A01 = str;
                    C60043Jdw.A00(jdw3);
                    jdw3.invalidate();
                } else {
                    WindowManager windowManager2 = this.A01;
                    if (this.A05 && windowManager2 != null) {
                        windowManager2.removeViewImmediate(jdw3);
                        z2 = false;
                    }
                    jdw3.A01 = str;
                    C60043Jdw.A00(jdw3);
                    jdw3.invalidate();
                }
                this.A05 = z2;
                jdw3.A01 = str;
                C60043Jdw.A00(jdw3);
                jdw3.invalidate();
            }
            1QN r3 = this.A04;
            if (r3 != null) {
                if (r3.A01) {
                    WindowManager windowManager3 = this.A01;
                    if (!(this.A05 || windowManager3 == null || (jdw2 = this.A03) == null)) {
                        windowManager3.addView(jdw2, this.A00);
                        z = true;
                    }
                    jdw3.A00 = r3.A00;
                    C60043Jdw.A00(jdw3);
                    jdw3.invalidate();
                }
                WindowManager windowManager4 = this.A01;
                if (!(!this.A05 || windowManager4 == null || (jdw = this.A03) == null)) {
                    windowManager4.removeViewImmediate(jdw);
                    z = false;
                }
                jdw3.A00 = r3.A00;
                C60043Jdw.A00(jdw3);
                jdw3.invalidate();
                this.A05 = z;
                jdw3.A00 = r3.A00;
                C60043Jdw.A00(jdw3);
                jdw3.invalidate();
            }
        }
    }
}
