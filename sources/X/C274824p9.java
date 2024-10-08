package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4p9  reason: invalid class name and case insensitive filesystem */
public final class C274824p9 implements C274834pA {
    public long A00 = 0;
    public Handler A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public final C274844pB A04;
    public final ConcurrentHashMap A05;

    public final void AVY() {
        AVV((Message) null);
    }

    public final void Ex8(Looper looper, String str) {
    }

    public final void ExE() {
        Ewt((Message) null);
    }

    public final void A00() {
        if (this.A02) {
            this.A02 = false;
            Handler handler = this.A01;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                this.A01 = handler;
            }
            handler.removeCallbacks(new Ai3(this));
        }
    }

    public final void AVV(Message message) {
        long j;
        try {
            if (this.A02) {
                C274844pB r8 = this.A04;
                r8.A04();
                for (C21493Xck xck : this.A05.values()) {
                    if (!xck.A0C) {
                        long A012 = r8.A01();
                        if (r8.A02 == -1) {
                            A012 = r8.A05 - xck.A0D;
                        }
                        xck.A00++;
                        xck.A08 += A012;
                        if (r8.A0A) {
                            xck.A01++;
                            xck.A07 += A012;
                        }
                        if (A012 > 200) {
                            xck.A02++;
                            if (A012 > xck.A03) {
                                xck.A0A = r8.A07();
                            }
                        }
                        xck.A03 = Math.max(A012, xck.A03);
                        long j2 = r8.A06;
                        if (j2 > 0) {
                            j = r8.A02 - j2;
                        } else {
                            j = -1;
                        }
                        if (j > xck.A05) {
                            xck.A05 = j;
                            xck.A09 = r8.A07();
                            xck.A04 = r8.A01();
                        }
                    }
                }
                r8.A03();
            }
        } finally {
            this.A04.A03();
        }
    }

    public final void Ewt(Message message) {
        if (this.A02) {
            C274844pB r3 = this.A04;
            r3.A09 = null;
            r3.A05 = -1;
            r3.A05(message);
            r3.A02();
            r3.A01 = 0;
        }
    }

    public C274824p9(ConcurrentHashMap concurrentHashMap) {
        this.A05 = concurrentHashMap;
        this.A04 = new C274844pB();
    }
}
