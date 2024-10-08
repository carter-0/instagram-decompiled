package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.43O  reason: invalid class name */
public abstract class AnonymousClass43O {
    public final int A00;
    public final Context A01;
    public final Handler A02;
    public final Handler A03;
    public final UserSession A04;
    public final AnonymousClass43Q A05;
    public final AnonymousClass43T A06;
    public final AnonymousClass43L A07;
    public final AnonymousClass43S A08;
    public final 2Dm A09;
    public final AnonymousClass433 A0A;
    public final List A0B;
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(new AnonymousClass9LX(this, 34));
    public final AnonymousClass0eM A0D;
    public final boolean A0E;
    public final Handler A0F;
    public final Looper A0G;

    public final C67310Mlk A03(2EM r13, C2611948q r14, String str, String str2, long j, long j2) {
        2EM r3 = r13;
        0qQ.A0B(r13, 0);
        String str3 = str;
        C67310Mlk A042 = A04(r13, str);
        if (A042 != null) {
            return A042;
        }
        C67310Mlk mlk = new C67310Mlk(this.A04, r3, this, r14, str3, str2, j, j2);
        this.A0B.add(mlk);
        A08();
        return mlk;
    }

    public final C67310Mlk A04(2EM r5, String str) {
        Object obj;
        0qQ.A0B(r5, 0);
        List list = this.A0B;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof C67310Mlk) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C67310Mlk mlk = (C67310Mlk) obj;
            if (0qQ.A0K(mlk.A01, r5) && 0qQ.A0K(mlk.A03, str)) {
                break;
            }
        }
        return (C67310Mlk) obj;
    }

    public final AnonymousClass6BH A05(ThreadFetchReason threadFetchReason, Long l, String str, String str2, boolean z) {
        String str3;
        Object obj;
        String str4 = str;
        0qQ.A0B(str, 0);
        Iterator it = A00(this).iterator();
        while (true) {
            str3 = str2;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            AnonymousClass6BH r1 = (AnonymousClass6BH) obj;
            if (0qQ.A0K(r1.A02, str) && 0qQ.A0K(r1.A01, str2)) {
                break;
            }
        }
        AnonymousClass6BH r3 = (AnonymousClass6BH) obj;
        if (r3 != null) {
            return r3;
        }
        AnonymousClass6BH r32 = new AnonymousClass6BH(threadFetchReason, this, l, str4, str3, z);
        this.A0B.add(r32);
        A08();
        return r32;
    }

    public final AnonymousClass6BH A06(String str) {
        Object obj;
        0qQ.A0B(str, 0);
        Iterator it = A00(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((AnonymousClass6BH) obj).A02, str)) {
                break;
            }
        }
        return (AnonymousClass6BH) obj;
    }

    public static final List A00(AnonymousClass43O r3) {
        List list = r3.A0B;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof AnonymousClass6BH) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final C68962Nbo A02(String str, long j) {
        List list = this.A0B;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof C68962Nbo) {
                arrayList.add(next);
            }
        }
        C68962Nbo nbo = (C68962Nbo) 00k.A0J(arrayList);
        if (nbo != null) {
            return nbo;
        }
        C68962Nbo nbo2 = new C68962Nbo(this, str, j);
        list.add(nbo2);
        A08();
        return nbo2;
    }

    public final String A07() {
        if (this instanceof C2600444b) {
            return "octane";
        }
        return "iris";
    }

    public final void A08() {
        if (this instanceof AnonymousClass43N) {
            AnonymousClass43N r8 = (AnonymousClass43N) this;
            1bO r0 = r8.A02;
            boolean z = r0.A0C;
            boolean z2 = r0.A0B;
            if (r0.A0D) {
                if (z && !r8.A01) {
                    AnonymousClass433 r1 = r8.A0A;
                    r1.A01 = 0;
                    r1.A00 = 0;
                }
                if (r8.A00 && !z2) {
                    C67316Mlq mlq = C67316Mlq.A00;
                    0qQ.A0B(mlq, 0);
                    Iterator it = r8.A0B.iterator();
                    while (it.hasNext()) {
                        AnonymousClass659 r2 = (AnonymousClass659) it.next();
                        if ((r2 instanceof AnonymousClass6BH) && ((Boolean) mlq.invoke(r2)).booleanValue()) {
                            AnonymousClass11X r12 = r2.A02;
                            if (r12 instanceof AnonymousClass1OD) {
                                ((AnonymousClass1OD) r12).cancel();
                            }
                            r2.A02 = null;
                            r2.A05(AnonymousClass7BQ.A00(), false, false);
                            it.remove();
                        }
                    }
                }
                if (z) {
                    r8.A09();
                }
            }
            r8.A00 = z2;
            r8.A01 = z;
            return;
        }
        C2600444b r3 = (C2600444b) this;
        boolean A0E2 = C61970qY.A0E(r3.A01);
        if (r3.A09.A0H.A0F && A0E2) {
            if (!r3.A00) {
                AnonymousClass433 r13 = r3.A0A;
                r13.A01 = 0;
                r13.A00 = 0;
            }
            r3.A09();
        }
        r3.A00 = A0E2;
    }

    public final void A09() {
        List list = this.A0B;
        int size = list.size();
        if (size > 3) {
            size = 3;
        }
        for (int i = 0; i < size; i++) {
            AnonymousClass659 r2 = (AnonymousClass659) list.get(i);
            if (r2.A02 == null) {
                int i2 = this.A0A.A00 * CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
                r2.A01();
                Handler handler = this.A0F;
                Message obtainMessage = handler.obtainMessage(1, r2);
                0qQ.A07(obtainMessage);
                if (i2 == 0) {
                    handler.sendMessage(obtainMessage);
                } else {
                    handler.sendMessageDelayed(obtainMessage, (long) i2);
                }
            }
        }
    }

    public final void A0A(C67310Mlk mlk, B72 b72) {
        if (this instanceof AnonymousClass43N) {
            1bO r9 = ((AnonymousClass43N) this).A02;
            C67310Mlk mlk2 = mlk;
            if (mlk2.A04) {
                UserSession userSession = r9.A0M;
                if (AnonymousClass45R.A00(userSession)) {
                    0qQ.A0B(userSession, 0);
                    r9.A0R.A02.A07(0eE.A00(userSession).A00());
                }
                B72 b722 = b72;
                long j = b722.A01;
                if (j != -1) {
                    r9.A05 = b722.A02;
                    r9.A08 = C61120lW.A04(r9.A0G);
                    r9.A07 = mlk2.A02;
                    r9.A0C(j, 2);
                }
                2EM r1 = mlk2.A01;
                Integer num = r1.A03;
                if (num == AnonymousClass05K.A00) {
                    String str = mlk2.A02;
                    String A002 = C66579MXk.A00(1107);
                    if (!2Ob.A00(str, A002)) {
                        if (2El.A0C(userSession)) {
                            if (r1 == AnonymousClass2EY.A00) {
                                for (2EM mlj : r9.A0W) {
                                    new C67309Mlj(mlj, (C74340PtG) null, r9, C2611948q.ALL, "page_scroll", false, false).A03();
                                }
                            } else if (r9.A0X.contains(r1)) {
                                for (2EM r11 : r9.A0W) {
                                    if (r11 != r1) {
                                        new C67309Mlj(r11, (C74340PtG) null, r9, C2611948q.ALL, A002, true, false).A03();
                                    }
                                }
                            }
                        }
                        List<2EM> list = r9.A0T;
                        if (!list.isEmpty()) {
                            for (2EM mlj2 : list) {
                                new C67309Mlj(mlj2, (C74340PtG) null, r9, C2611948q.ALL, A002, true, false).A03();
                            }
                        }
                    }
                }
                ((1Ng) r9.A0a.getValue()).A05(new C293845lR(r1, num, mlk2.A02, b722.A01, true));
            }
            1bO.A04(r9);
            return;
        }
        throw new IllegalStateException("Inbox snapshot is not applicable to the Octane sync path");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r3 != r6.longValue()) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.AnonymousClass6BH r11) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.AnonymousClass43N
            if (r0 == 0) goto L_0x005f
            r0 = r10
            X.43N r0 = (X.AnonymousClass43N) r0
            X.1bO r2 = r0.A02
            java.util.List r1 = r11.A03
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>(r1)
            X.4UY r7 = r2.A0Q
            java.lang.Long r6 = r11.A04
            java.lang.String r5 = "Thread snapshot failure"
            java.util.Iterator r9 = r0.iterator()
        L_0x001a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r8 = r9.next()
            X.651 r8 = (X.AnonymousClass651) r8
            long r3 = r8.A00
            r0 = 1
            long r3 = r3 - r0
            if (r6 == 0) goto L_0x0036
            long r1 = r6.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            X.02m r4 = r7.A00
            if (r1 == 0) goto L_0x0057
            java.lang.String r0 = "thread_snapshot_fail_reason"
            X.AnonymousClass654.A01(r4, r8, r0, r5)
            java.lang.String r1 = "Thread snapshot fail"
        L_0x0042:
            java.lang.String r0 = "fail_reason"
            X.AnonymousClass654.A01(r4, r8, r0, r1)
            long r0 = r8.A00
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r2 = (int) r0
            r1 = 724184457(0x2b2a2d89, float:6.0459325E-13)
            r0 = 3
            r4.markerEnd(r1, r2, r0)
            goto L_0x001a
        L_0x0057:
            java.lang.String r0 = "wait_for_thread_snapshot_fail_reason"
            X.AnonymousClass654.A01(r4, r8, r0, r5)
            java.lang.String r1 = "Wait for thread snapshot fail"
            goto L_0x0042
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass43O.A0B(X.6BH):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r3 != r9.longValue()) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.AnonymousClass6BH r12) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.AnonymousClass43N
            if (r0 == 0) goto L_0x0046
            r0 = r11
            X.43N r0 = (X.AnonymousClass43N) r0
            X.1bO r8 = r0.A02
            java.util.List r0 = r12.A03
            java.util.concurrent.CopyOnWriteArrayList r7 = new java.util.concurrent.CopyOnWriteArrayList
            r7.<init>(r0)
            X.4UY r6 = r8.A0Q
            java.lang.Long r9 = r12.A04
            java.util.Iterator r10 = r7.iterator()
        L_0x0018:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r5 = r10.next()
            X.651 r5 = (X.AnonymousClass651) r5
            long r3 = r5.A00
            r0 = 1
            long r3 = r3 - r0
            if (r9 == 0) goto L_0x0034
            long r1 = r9.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            X.02m r1 = r6.A00
            if (r2 == 0) goto L_0x003f
            java.lang.String r0 = "thread_snapshot_end"
        L_0x003b:
            X.AnonymousClass654.A00(r1, r5, r0)
            goto L_0x0018
        L_0x003f:
            java.lang.String r0 = "wait_for_thread_snapshot_end"
            goto L_0x003b
        L_0x0042:
            X.1bO.A07(r8, r7)
            return
        L_0x0046:
            r0 = r11
            X.44b r0 = (X.C2600444b) r0
            X.43e r7 = r0.A01
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x00af
            X.2Dm r2 = r7.A04
            r6 = 0
            com.instagram.model.direct.DirectThreadKey r1 = new com.instagram.model.direct.DirectThreadKey
            r1.<init>(r0, r6)
            r0 = 0
            java.util.ArrayList r0 = r2.Aax(r1, r0)
            java.util.Iterator r5 = r0.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r5.next()
            X.3su r0 = (X.C254703su) r0
            java.lang.Long r0 = r0.A1R
            if (r0 == 0) goto L_0x0091
            long r3 = r0.longValue()
        L_0x0074:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r5.next()
            X.3su r0 = (X.C254703su) r0
            java.lang.Long r0 = r0.A1R
            if (r0 == 0) goto L_0x008e
            long r1 = r0.longValue()
        L_0x0088:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            r3 = r1
            goto L_0x0074
        L_0x008e:
            r1 = -1
            goto L_0x0088
        L_0x0091:
            r3 = -1
            goto L_0x0074
        L_0x0094:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x009a:
            X.44d r5 = r7.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a8
            long r0 = r5.A01
            long r1 = java.lang.Math.max(r0, r3)
        L_0x00a8:
            r5.A01 = r1
            X.44g r0 = X.C2600944g.SNAPSHOT_SUCCESS
            X.C2600644d.A00(r0, r5, r6)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass43O.A0C(X.6BH):void");
    }

    public final void A0D(boolean z) {
        if (this instanceof AnonymousClass43N) {
            1bO r2 = ((AnonymousClass43N) this).A02;
            if (!Boolean.valueOf(z).booleanValue()) {
                UserSession userSession = r2.A0M;
                if (AnonymousClass45R.A00(userSession)) {
                    0qQ.A0B(userSession, 0);
                    r2.A0R.A02.A07(0eE.A00(userSession).A00());
                }
            }
        }
    }

    public AnonymousClass43O(Looper looper, UserSession userSession, AnonymousClass43L r5, int i, boolean z) {
        this.A04 = userSession;
        this.A0G = looper;
        this.A07 = r5;
        this.A0E = z;
        this.A00 = i;
        this.A05 = AnonymousClass43P.A00(userSession);
        this.A01 = userSession.A03.A06();
        this.A0A = new AnonymousClass433(5);
        this.A0B = new ArrayList();
        this.A09 = 1bJ.A00(userSession);
        this.A08 = (AnonymousClass43S) userSession.A01(AnonymousClass43S.class, new C73911Plm(userSession, 45));
        this.A06 = new AnonymousClass43T(AnonymousClass0kN.A01(new 0xG("ig_direct"), userSession));
        this.A0D = AnonymousClass0eN.A00(0eO.A02, AnonymousClass43U.A00);
        this.A02 = new Handler(Looper.getMainLooper());
        this.A0F = new C261904Bj(looper, this);
        this.A03 = new C261914Bk(looper, this);
    }

    public static final void A01(AnonymousClass43O r10, C370538wd r11, String str, String str2, String str3, String str4) {
        1bc A002 = C370748x0.A00();
        AnonymousClass43O r5 = r10;
        UserSession userSession = r10.A04;
        C370758x1 A003 = A002.A00(userSession);
        if (!182.A06(0Tu.A05, userSession, 36318892003564238L)) {
            C370538wd r6 = r11;
            ArrayList A012 = A003.A01(r11);
            if (r6 == null) {
                return;
            }
            if ((r6.A09 || (!A012.isEmpty())) && r6.A04(userSession)) {
                String str5 = str3;
                0nY.A00().ATE(new C68671NSd(A003, r5, r6, str5, str2, str4, str, A012));
            }
        }
    }
}
