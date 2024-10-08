package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: X.7sC  reason: invalid class name and case insensitive filesystem */
public final class C344647sC implements Handler.Callback {
    public C344737sL A00;
    public final Handler A01;
    public final SparseArray A02 = new SparseArray();
    public final C344407ro A03;
    public final C344567s4 A04;
    public final C344637sB A05;
    public final boolean A06;

    public static void A00(C344737sL r9, C344647sC r10) {
        C344737sL r1 = r10.A00;
        if (r1 != r9) {
            if (r1 != null) {
                r10.A04.A04(r1);
            }
            r10.A00 = r9;
            if (r9 != null) {
                r10.A04.A03(r9);
            }
            C344737sL r4 = r10.A00;
            if (r4 != null) {
                SparseArray sparseArray = r10.A02;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    Object valueAt = sparseArray.valueAt(i);
                    valueAt.getClass();
                    C346377v4 r0 = (C346377v4) valueAt;
                    r4.FLA(keyAt, r0.A01, r0.A00, r0.A04, r0.A03, r0.A02);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.Av8, java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r0v22, types: [X.Av8, java.lang.RuntimeException] */
    public final boolean handleMessage(Message message) {
        int i;
        Message message2 = message;
        int i2 = message2.what;
        if (i2 == 1) {
            C344567s4 r5 = this.A04;
            synchronized (r5.A08) {
                r5.A0D.getClass();
                if (r5.A0E == null) {
                    Map map = C344567s4.A0H;
                    Handler handler = r5.A00;
                    C344567s4 r0 = (C344567s4) map.get(handler.getLooper());
                    if (r0 != null) {
                        C344567s4.A00(r0);
                    }
                    r5.A0D.getClass();
                    if (r5.A0E == null) {
                        try {
                            Context context = r5.A02;
                            C344507ry r1 = r5.A05;
                            C344557s3 r14 = r5.A03;
                            C344557s3 r15 = r5.A04;
                            0qQ.A0B(context, 1);
                            0qQ.A0B(r1, 2);
                            C345887uF r12 = new C345887uF(context, r14, r15, r1, r5);
                            r5.A0E = r12;
                            List list = r5.A07.A00;
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                ((C344747sM) list.get(i3)).ACn(r12);
                            }
                            int BYP = r14.BYP();
                            if (r5.A09 && BYP != (i = r5.A01)) {
                                throw new IllegalStateException(002.A02(i, BYP, "Unsupported OpenGL version. Expected is ", " but got "));
                            }
                        } catch (Throwable th) {
                            try {
                                StringBuilder sb = new StringBuilder();
                                sb.append("GlHostImpl.attachGlContext() failed. Current looper: ");
                                sb.append(Looper.myLooper());
                                r5.A05(new RuntimeException(sb.toString(), th));
                            } catch (Throwable th2) {
                                r5.A0G = false;
                                r5.A0F = false;
                                map.put(handler.getLooper(), r5);
                                throw th2;
                            }
                        }
                        r5.A0G = false;
                        r5.A0F = false;
                        map.put(handler.getLooper(), r5);
                    }
                }
            }
            this.A05.DQP(this);
            return false;
        } else if (i2 == 2) {
            this.A05.DQG(this);
            C344567s4 r2 = this.A04;
            if (r2.A0F) {
                r2.A0F = false;
                r2.A02();
            }
            synchronized (r2.A08) {
                if (r2.A0A) {
                    C344567s4.A00(r2);
                }
            }
            return false;
        } else if (i2 == 3) {
            C344637sB r52 = this.A05;
            r52.DQI(this);
            C344567s4 r02 = this.A04;
            synchronized (r02.A08) {
                C344567s4.A00(r02);
                C3496981j r03 = r02.A07;
                List list2 = r03.A00;
                r03.A00();
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((C344747sM) list2.get(i4)).release();
                }
            }
            this.A00 = null;
            r52.DQH(this);
            return false;
        } else if (i2 != 4) {
            return false;
        } else {
            A00((C344737sL) message2.obj, this);
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Thread$UncaughtExceptionHandler, X.7sF, java.lang.Object] */
    public C344647sC(C344407ro r4, C344567s4 r5, C344637sB r6, boolean z) {
        Handler handler = new Handler(r5.A00.getLooper(), this);
        this.A01 = handler;
        this.A04 = r5;
        this.A05 = r6;
        r6.DQE(this);
        this.A03 = r4;
        this.A06 = z;
        Thread thread = handler.getLooper().getThread();
        WeakReference weakReference = new WeakReference(this);
        ? obj = new Object();
        obj.A00 = weakReference;
        thread.setUncaughtExceptionHandler(obj);
    }
}
