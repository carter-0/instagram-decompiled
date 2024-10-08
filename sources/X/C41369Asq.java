package X;

import android.hardware.Camera;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Asq  reason: case insensitive filesystem */
public final class C41369Asq implements Callable {
    public final int A00;
    public final Object A01;

    public C41369Asq(AnonymousClass9RJ r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        boolean A1b;
        String str;
        switch (this.A00) {
            case 0:
                C19867Wgu wgu = (C19867Wgu) this.A01;
                synchronized (wgu) {
                    if (wgu.A02 != null) {
                        C19867Wgu.A02(wgu);
                        if (C19867Wgu.A08(wgu)) {
                            C19867Wgu.A03(wgu);
                            wgu.A00 = 0;
                        }
                    }
                }
                return null;
            case 1:
                C19866Wgt wgt = (C19866Wgt) this.A01;
                synchronized (wgt) {
                    if (wgt.A03 != null) {
                        while (wgt.A02 > wgt.A01) {
                            wgt.A07((String) C13991Tnr.A0Y(AnonymousClass7TF.A0s(wgt.A0A)));
                        }
                        if (C19866Wgt.A06(wgt)) {
                            C19866Wgt.A01(wgt);
                            wgt.A00 = 0;
                        }
                    }
                }
                return null;
            case 2:
                AnonymousClass9RJ r5 = (AnonymousClass9RJ) this.A01;
                C340577lU.A00(15, r5.A00, (Object) null);
                try {
                    r5.A0E("Cannot switch cameras.");
                    boolean A1Q = AnonymousClass7TF.A1Q(r5.A00);
                    if (!r5.A0H.A08(A1Q ? 1 : 0)) {
                        if (A1Q) {
                            str = "FRONT";
                        } else {
                            str = "BACK";
                        }
                        throw new UnsupportedOperationException(002.A0g("Cannot switch to ", str, ", camera is not present"));
                    }
                    AnonymousClass9RJ.A08(r5, A1Q);
                    C340167ko r2 = r5.A06;
                    r2.getClass();
                    C342067nz r1 = r5.A07;
                    r1.getClass();
                    C343367q6 A02 = AnonymousClass9RJ.A02(r5, r2, r1, r5.A01);
                    C340577lU.A00(17, A1Q, (Object) null);
                    return A02;
                } catch (Exception e) {
                    C340577lU.A00(16, r5.A00, e);
                    throw e;
                }
            case 3:
                AnonymousClass9RJ r22 = (AnonymousClass9RJ) this.A01;
                if (!r22.isConnected()) {
                    return null;
                }
                r22.A0J.A00(r22.A0Z);
                return null;
            case 4:
                AnonymousClass9RJ r12 = (AnonymousClass9RJ) this.A01;
                r12.A0E("Cannot set focus mode for video");
                r12.A0I.A02();
                return null;
            case 5:
                AnonymousClass9RJ r23 = (AnonymousClass9RJ) this.A01;
                if (!r23.isConnected()) {
                    return null;
                }
                C14255Tsd tsd = r23.A0K;
                synchronized (tsd) {
                    A1b = AnonymousClass7TE.A1b(tsd.A03.A00);
                }
                if (A1b) {
                    return null;
                }
                Camera camera = r23.A0Z;
                camera.getClass();
                tsd.A01(camera);
                synchronized (tsd) {
                    tsd.A04.clear();
                }
                return null;
            case 6:
                AnonymousClass9RJ r13 = (AnonymousClass9RJ) this.A01;
                if (!r13.isConnected()) {
                    return null;
                }
                r13.A0J.A01(true, r13.A0Z);
                return null;
            case 7:
                AnonymousClass9RJ r14 = (AnonymousClass9RJ) this.A01;
                if (!r14.isConnected() || r14.A0d) {
                    return null;
                }
                r14.A0I.A01();
                return null;
            case 8:
                AnonymousClass9RJ r15 = (AnonymousClass9RJ) this.A01;
                if (!r15.isConnected()) {
                    return null;
                }
                C378949Rv r24 = r15.A0J;
                C378959Rw r6 = r24.A00;
                if ((r6.A00 & 4) == 4) {
                    return null;
                }
                ReentrantLock reentrantLock = r6.A01;
                reentrantLock.lock();
                try {
                    boolean A002 = r6.A00();
                    reentrantLock.lock();
                    try {
                        if (!r6.A01()) {
                            reentrantLock.lock();
                            if (!AnonymousClass7TF.A1S(r6.A00 & 4, 4)) {
                                r6.A00 = (r6.A00 | 4) & -2;
                            }
                        }
                        reentrantLock.unlock();
                        if (A002) {
                            C340577lU.A00(18, 0, (Object) null);
                            if (r24.A03 != null) {
                                r24.A03.A00();
                            }
                            C3496981j r16 = r24.A01;
                            if (!r16.A00.isEmpty()) {
                                C342057ny.A00(new C379269Te(r24, r16.A00));
                            }
                        }
                        reentrantLock.unlock();
                        return null;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                        reentrantLock.unlock();
                    }
                } finally {
                    reentrantLock.unlock();
                }
            case 9:
                AnonymousClass9RJ r25 = (AnonymousClass9RJ) this.A01;
                if (!r25.isConnected()) {
                    return null;
                }
                C342717p3 A022 = r25.A0N.A02(r25.A00);
                r25.A0K.A02(r25.A0Z, (C343047pa) A022.A02(C342717p3.A0q), AnonymousClass7TG.A08(C342717p3.A0m, A022));
                return null;
            case 10:
                return Integer.valueOf(((AnonymousClass9RZ) this.A01).A04());
            case 11:
                AnonymousClass9RZ.A01();
                return null;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass9S5 r17 = (AnonymousClass9S5) this.A01;
                r17.A00(r17.A02);
                return null;
            default:
                return DbT.A0r(this.A01);
        }
    }

    public C41369Asq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
