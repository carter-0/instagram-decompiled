package X;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: X.2mc  reason: invalid class name and case insensitive filesystem */
public abstract class C228962mc extends 07p {
    public Executor A00;
    public volatile AnonymousClass3EB A01;
    public volatile AnonymousClass3EB A02;

    public abstract Object A06();

    public final boolean A05() {
        if (this.A01 != null) {
            if (!this.A07) {
                this.A04 = true;
            }
            if (this.A02 != null) {
                this.A01 = null;
            } else {
                AnonymousClass3EB r2 = this.A01;
                r2.A01.set(true);
                boolean cancel = r2.A00.cancel(false);
                if (cancel) {
                    this.A02 = this.A01;
                }
                this.A01 = null;
                return cancel;
            }
        }
        return false;
    }

    public Executor A07() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public final void A08() {
        if (this.A02 == null && this.A01 != null) {
            if (this.A00 == null) {
                this.A00 = A07();
            }
            AnonymousClass3EB r3 = this.A01;
            Executor executor = this.A00;
            if (r3.A03 != AnonymousClass05K.A00) {
                int intValue = r3.A03.intValue();
                if (intValue == 1) {
                    throw new IllegalStateException(C66579MXk.A00(493));
                } else if (intValue != 2) {
                    throw new IllegalStateException("We should never reach this state");
                } else {
                    throw new IllegalStateException(C66579MXk.A00(492));
                }
            } else {
                r3.A03 = AnonymousClass05K.A01;
                executor.execute(r3.A00);
            }
        }
    }

    public final void A0A(AnonymousClass3EB r2) {
        if (this.A02 == r2) {
            if (this.A05) {
                if (this.A07) {
                    A09();
                } else {
                    this.A04 = true;
                }
            }
            SystemClock.uptimeMillis();
            this.A02 = null;
            A08();
        }
    }

    public C228962mc(Context context) {
        this.A07 = false;
        this.A03 = false;
        this.A06 = true;
        this.A04 = false;
        this.A05 = false;
        this.A01 = context.getApplicationContext();
    }

    @Deprecated
    public final void A04(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C228962mc.super.A04(str, fileDescriptor, printWriter, strArr);
        if (this.A01 != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.A01);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
        if (this.A02 != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.A02);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
    }

    public final void A09() {
        A05();
        this.A01 = new AnonymousClass3EB(this);
        A08();
    }
}
