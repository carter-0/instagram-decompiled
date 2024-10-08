package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.0uM  reason: invalid class name and case insensitive filesystem */
public abstract class C62600uM extends 04l {
    public final Window A00;
    public final AnonymousClass03a A01;

    public final int A00() {
        return 0;
    }

    public final void A01(int i) {
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                int i3 = 4;
                if (i2 != 1) {
                    i3 = 2;
                    if (i2 != 2) {
                        if (i2 == 8) {
                            this.A01.A00.A01();
                        }
                    }
                }
                A08(i3);
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }

    public final void A03(int i) {
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    A09(4);
                    this.A00.clearFlags(1024);
                } else if (i2 == 2) {
                    A09(2);
                } else if (i2 == 8) {
                    this.A01.A00.A02();
                }
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }

    public final void A02(int i) {
        if (i == 0) {
            A09(6144);
        } else if (i == 1) {
            A09(4096);
            A08(C249703kE.FLAG_MOVED);
        } else if (i == 2) {
            A09(C249703kE.FLAG_MOVED);
            A08(4096);
        }
    }

    public final void A08(int i) {
        View decorView = this.A00.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void A09(int i) {
        View decorView = this.A00.getDecorView();
        decorView.setSystemUiVisibility((i ^ -1) & decorView.getSystemUiVisibility());
    }

    public C62600uM(Window window, AnonymousClass03a r2) {
        this.A00 = window;
        this.A01 = r2;
    }
}
