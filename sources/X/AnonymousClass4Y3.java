package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.proxygen.LigerSamplePolicy;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.4Y3  reason: invalid class name */
public final class AnonymousClass4Y3 extends Handler implements Runnable {
    public int A00;
    public AnonymousClass4XZ A01;
    public IOException A02;
    public AnonymousClass4TQ A03;
    public Thread A04;
    public boolean A05;
    public final int A06;
    public final long A07;
    public final C266204Xy A08;
    public volatile boolean A09;
    public final /* synthetic */ AnonymousClass4XY A0A;

    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                try {
                    z = false;
                    if (!this.A05) {
                        z = true;
                    }
                    this.A04 = Thread.currentThread();
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            if (z) {
                C266204Xy r1 = this.A08;
                27d.A01(002.A0R("load:", r1.getClass().getSimpleName()));
                try {
                    r1.Cg1();
                    27d.A00();
                } catch (Throwable th2) {
                    th = th2;
                    27d.A00();
                    throw th;
                }
            }
            synchronized (this) {
                try {
                    this.A04 = null;
                    Thread.interrupted();
                } catch (Throwable th3) {
                    while (true) {
                        th = th3;
                        break;
                    }
                }
            }
            if (!this.A09) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.A09) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (Exception e2) {
            if (!this.A09) {
                2AG.A05("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(2, new C390609rY(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.A09) {
                2AG.A05("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(2, new C390609rY(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.A09) {
                2AG.A05("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4Y3(Looper looper, AnonymousClass4TQ r2, C266204Xy r3, AnonymousClass4XY r4, int i, long j) {
        super(looper);
        this.A0A = r4;
        this.A08 = r3;
        this.A03 = r2;
        this.A06 = i;
        this.A07 = j;
    }

    public final void A01(boolean z) {
        this.A09 = z;
        this.A02 = null;
        if (hasMessages(0)) {
            this.A05 = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            synchronized (this) {
                this.A05 = true;
                this.A08.AGO();
                Thread thread = this.A04;
                if (thread != null) {
                    thread.interrupt();
                }
            }
            if (!z) {
                return;
            }
        }
        this.A0A.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass4TQ r3 = this.A03;
        r3.getClass();
        r3.DO6(this.A08, elapsedRealtime, elapsedRealtime - this.A07, true);
        this.A03 = null;
    }

    public final void handleMessage(Message message) {
        if (!this.A09) {
            Message message2 = message;
            int i = message2.what;
            if (i != 0) {
                if (i != 3) {
                    AnonymousClass4XY r3 = this.A0A;
                    r3.A01 = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.A07;
                    AnonymousClass4TQ r8 = this.A03;
                    r8.getClass();
                    if (this.A05) {
                        r8.DO6(this.A08, elapsedRealtime, j, false);
                        return;
                    }
                    int i2 = message2.what;
                    if (i2 == 1) {
                        try {
                            r8.DOA(this.A08, elapsedRealtime, j);
                            return;
                        } catch (RuntimeException e) {
                            2AG.A05("LoadTask", "Unexpected exception handling load completed", e);
                            r3.A02 = new C390609rY(e);
                            return;
                        }
                    } else if (i2 == 2) {
                        IOException iOException = (IOException) message2.obj;
                        this.A02 = iOException;
                        int i3 = this.A00 + 1;
                        this.A00 = i3;
                        AnonymousClass4XZ DOC = r8.DOC(this.A08, iOException, i3, elapsedRealtime, j);
                        this.A01 = DOC;
                        int i4 = DOC.A00;
                        if (i4 == 3) {
                            r3.A02 = this.A02;
                            return;
                        } else if (i4 != 2) {
                            if (i4 == 1) {
                                this.A00 = 1;
                            }
                            long j2 = DOC.A01;
                            if (j2 == -9223372036854775807L) {
                                j2 = (long) ((int) Math.min((((long) (this.A00 - 1)) * 1000) + 500, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT));
                            }
                            boolean z = false;
                            if (r3.A01 == null) {
                                z = true;
                            }
                            C256703wD.A04(z);
                            r3.A01 = this;
                            if (j2 > 0) {
                                sendEmptyMessageDelayed(0, j2);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    throw ((Throwable) message2.obj);
                }
            }
            A00(this);
        }
    }

    public static void A00(AnonymousClass4Y3 r7) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r7.A03.DOS(r7.A08, r7.A00, elapsedRealtime, elapsedRealtime - r7.A07);
        r7.A02 = null;
        AnonymousClass4XY r0 = r7.A0A;
        ExecutorService executorService = r0.A03;
        AnonymousClass4Y3 r02 = r0.A01;
        r02.getClass();
        executorService.execute(r02);
    }
}
