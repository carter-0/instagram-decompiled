package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.7iC  reason: invalid class name and case insensitive filesystem */
public final class C338587iC {
    public C41813B1t A00;
    public B2R A01;
    public BlockingQueue A02;
    public boolean A03;
    public final Handler A04;
    public volatile boolean A05;

    public static void A00(C338347ho r3, C338587iC r4, AnonymousClass2Ss r5, String str, boolean z) {
        if (r4.A01 != null) {
            r3.A8B("component_warmer_tag", str);
            C295015nP AL1 = r4.A01.AL1(r3);
            r4.A00.E5N(AL1, str);
            if (z) {
                r4.A01.E3w(AL1);
            } else if (r5 != null) {
                ((Handler) r5).post(new C40951Alx(AL1, r4));
            } else {
                r4.A01.E4C((AnonymousClass2T3) null, AL1);
            }
        } else {
            throw new IllegalStateException("ComponentWarmer: trying to execute prepare but ComponentWarmer is not ready.");
        }
    }

    public final void A01(B2R b2r) {
        boolean z;
        this.A01 = b2r;
        synchronized (this) {
            z = this.A03;
        }
        if (!z) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A03 = true;
                } else {
                    while (!this.A02.isEmpty()) {
                        C338347ho r3 = (C338347ho) this.A02.poll();
                        Object Auo = r3.Auo("component_warmer_tag");
                        if (Auo != null) {
                            String str = (String) Auo;
                            if (r3.Auo("component_warmer_prepare_handler") != null) {
                                A00(r3, this, (AnonymousClass2Ss) r3.Auo("component_warmer_prepare_handler"), str, false);
                            } else {
                                A00(r3, this, (AnonymousClass2Ss) null, str, true);
                            }
                            synchronized (this) {
                                if (this.A02.isEmpty()) {
                                    this.A03 = true;
                                }
                            }
                        }
                    }
                }
            }
            synchronized (this) {
                this.A03 = true;
            }
        }
    }

    public C338587iC(C41813B1t b1t, B2R b2r) {
        this.A04 = new Handler(Looper.getMainLooper());
        AnonymousClass9OB r0 = new AnonymousClass9OB(this);
        this.A00 = b1t;
        ((AnonymousClass9OA) b1t).A00 = r0;
        this.A03 = true;
        A01(b2r);
    }

    public C338587iC() {
        this.A04 = new Handler(Looper.getMainLooper());
        this.A00 = new AT1(new AnonymousClass9OB(this));
    }
}
