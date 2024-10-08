package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.VwH  reason: case insensitive filesystem */
public final class C18660VwH {
    public X7P A00;
    public WG7 A01;
    public WG8 A02;
    public C365408n3 A03;
    public C20947X5q A04;
    public C340407lD A05;
    public A3V A06;
    public C17199VMd A07;
    public Integer A08;
    public Integer A09;
    public HashMap A0A;
    public VLC A0B;
    public C361848gv A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Handler A0G;
    public final C13553TcP A0H;
    public final C344227rW A0I;
    public final WG9 A0J;
    public final C18633VvR A0K;
    public final C344037rD A0L;
    public final C344847sW A0M;
    public final C16911VAo A0N;
    public final Object A0O = new Object();
    public final Object A0P = new Object();
    public final Context A0Q;
    public final C17553Va6 A0R;
    public final C345557ti A0S;
    public final ArrayList A0T;
    public final Map A0U;
    public volatile WeakReference A0V = new WeakReference((Object) null);
    public volatile boolean A0W = false;

    public final synchronized void A07(List list) {
        ArrayList arrayList = this.A0T;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C368848tQ r2 = (C368848tQ) it.next();
            if (!list.contains(r2)) {
                C344847sW r1 = r2.A02;
                if (r1 != null) {
                    r1.FIu((C345237tA) r2.A05);
                }
                C361868gx r12 = r2.A05;
                if (r12 instanceof C345237tA) {
                    ((C345237tA) r12).EiW((C344847sW) null);
                }
            }
        }
        arrayList.clear();
        this.A0C = null;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C368848tQ r3 = (C368848tQ) it2.next();
            C344847sW r22 = this.A0M;
            C361868gx r13 = r3.A05;
            if (r13 instanceof C345237tA) {
                r3.A02 = r22;
                ((C345237tA) r13).EiW(r22);
            }
            if (r13 instanceof C361848gv) {
                this.A0C = (C361848gv) r13;
            }
        }
        arrayList.addAll(list);
        WG9.A00(this.A0J, new ArrayList(arrayList), 15);
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [X.VLE, java.lang.Object] */
    public C18660VwH(Context context, Handler handler, HandlerThread handlerThread, C13553TcP tcP, C344227rW r20, C344557s3 r21, C344037rD r22, C16911VAo vAo, int i) {
        C344037rD r11 = r22;
        C344557s3 r10 = r21;
        this.A0G = handler;
        C18633VvR vvR = new C18633VvR();
        this.A0K = vvR;
        this.A0M = new WKp(this);
        C344227rW r6 = r20;
        this.A0I = r6;
        Context context2 = context;
        this.A0Q = context2;
        this.A0N = vAo;
        this.A0U = new HashMap();
        C345557ti r4 = new C345557ti(context2.getResources());
        this.A0S = r4;
        boolean z = true;
        int i2 = i;
        if (!(i == 0 || i2 == 1 || i2 == 2 || i2 == 3)) {
            z = false;
        }
        0JA.A08(z, 002.A0O("Invalid value passed as device rotation, must be a Surface rotation enum value. Value = ", i2));
        r11 = r22 == null ? new C368708tC() : r11;
        this.A0L = r11;
        this.A0B = new VLC(this);
        C17553Va6 va6 = new C17553Va6();
        this.A0R = va6;
        C343967r6 r3 = r6.A00;
        va6.A04 = r3.CTO(79);
        if (va6.A04) {
            if (va6.A00 == null) {
                va6.A00 = new C18455Vs3();
            }
            if (va6.A02 == null) {
                va6.A02 = new Object();
            }
            if (va6.A01 == null) {
                C18483Vsd vsd = new C18483Vsd();
                va6.A01 = vsd;
                vsd.A03 = new VLD(va6);
            }
        } else {
            va6.A00 = null;
            va6.A02 = null;
            C18483Vsd vsd2 = va6.A01;
            if (vsd2 != null) {
                C18483Vsd.A00(vsd2);
                va6.A01 = null;
            }
        }
        VLC vlc = this.A0B;
        C18658VwD vwD = new C18658VwD(r6, va6, r4, new C368938tZ());
        if (r21 == null) {
            r10 = C344577s5.A00(r3.CTO(78) ? 3 : 2);
        }
        this.A0J = new WG9(handlerThread, vlc, r6, va6, vwD, vvR, r10, r11, new C368938tZ(), Collections.emptyList(), i2);
        C13553TcP tcP2 = tcP;
        0JA.A03(tcP2, "Must provide exception callback");
        this.A0H = tcP2;
        this.A0T = new ArrayList();
        A06(AnonymousClass05K.A00);
    }

    public static void A00(C18660VwH vwH) {
        C340307l3 r0;
        A3V a3v;
        A97 a97;
        C18633VvR vvR = vwH.A0K;
        boolean A032 = vvR.A03(C344877sZ.INPUT_PREVIEW);
        boolean A033 = vvR.A03(C344877sZ.INPUT_PREVIEW_METADATA);
        boolean A034 = vvR.A03(C344877sZ.EXTERNAL_WORLD_TRACKING_EVENT);
        if (vwH.A0E != A032) {
            vwH.A0E = A032;
            A3V a3v2 = vwH.A06;
            if (!(a3v2 == null || (a97 = a3v2.A00.A03) == null)) {
                a97.A06 = A032;
                a97.A00();
            }
        }
        if (vwH.A0D != A034) {
            vwH.A0D = A034;
            HashMap hashMap = vwH.A0A;
            if (!(hashMap == null || (a3v = vwH.A06) == null)) {
                C3496181b r1 = a3v.A00;
                C340307l3 r02 = r1.A02;
                if (r02 != null) {
                    r02.ARP(hashMap, A034);
                }
                C340397lC r03 = r1.A04;
                if (r03 != null) {
                    r03.ARO(A034);
                }
            }
        }
        if (vwH.A0F != A033) {
            vwH.A0F = A033;
            A3V a3v3 = vwH.A06;
            if (a3v3 != null && (r0 = a3v3.A00.A02) != null) {
                r0.EXA(A033);
            }
        }
    }

    public final void A01() {
        boolean z;
        Integer num = AnonymousClass05K.A0C;
        synchronized (this.A0O) {
            if (this.A09 != num) {
                this.A09 = num;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            WG9 wg9 = this.A0J;
            synchronized (wg9.A05) {
                Handler handler = wg9.A00;
                handler.removeMessages(3);
                handler.removeMessages(4);
                WG9.A01(wg9, new Object[0], 14);
            }
            this.A03 = null;
            this.A00 = null;
            this.A0B = null;
            C344037rD r0 = this.A0L;
            if (r0 != null) {
                r0.destroy();
            }
        }
    }

    public final void A02() {
        A06(AnonymousClass05K.A01);
        WG9 wg9 = this.A0J;
        Handler handler = wg9.A00;
        handler.removeMessages(3);
        handler.removeMessages(4);
        WG9.A01(wg9, new Object[0], 5);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.7v6, X.7sc] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.7v7] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.7v8] */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.Object, X.WG7] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r8.EFH() == false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C365408n3 r8, X.C20947X5q r9) {
        /*
            r7 = this;
            X.8n3 r0 = r7.A03
            if (r0 == r8) goto L_0x004e
            r7.A03 = r8
            X.WG9 r5 = r7.A0J
            r0 = 7
            X.WG9.A00(r5, r8, r0)
            r6 = r7
            monitor-enter(r6)
            X.8n3 r0 = r7.A03     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x004d
            boolean r0 = r0.EFG()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0029
            X.WG7 r1 = r7.A01     // Catch:{ all -> 0x004a }
            if (r1 != 0) goto L_0x0023
            X.WG7 r1 = new X.WG7     // Catch:{ all -> 0x004a }
            r1.<init>()     // Catch:{ all -> 0x004a }
            r7.A01 = r1     // Catch:{ all -> 0x004a }
        L_0x0023:
            r0 = 19
            X.WG9.A00(r5, r1, r0)     // Catch:{ all -> 0x004a }
            goto L_0x004d
        L_0x0029:
            X.WG8 r4 = r7.A02     // Catch:{ all -> 0x004a }
            if (r4 != 0) goto L_0x0034
            X.WG8 r4 = new X.WG8     // Catch:{ all -> 0x004a }
            r4.<init>()     // Catch:{ all -> 0x004a }
            r7.A02 = r4     // Catch:{ all -> 0x004a }
        L_0x0034:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x004a }
            r1 = 1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x004a }
            long r2 = r3.convert(r1, r0)     // Catch:{ all -> 0x004a }
            r0 = 30
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x004a }
            r4.A02 = r0     // Catch:{ all -> 0x004a }
            X.WG8 r1 = r7.A02     // Catch:{ all -> 0x004a }
            goto L_0x0023
        L_0x004a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x004d:
            monitor-exit(r6)
        L_0x004e:
            r7.A04 = r9
            if (r8 == 0) goto L_0x0059
            boolean r0 = r8.EFH()
            r1 = 1
            if (r0 != 0) goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            X.7v5 r0 = new X.7v5
            r0.<init>(r1)
            r7.A05(r0)
            if (r8 == 0) goto L_0x0095
            int r2 = r8.BfA()
            int r1 = r8.Bez()
            X.7v6 r0 = new X.7v6
            r0.<init>()
            r0.A01 = r2
            r0.A00 = r1
            r7.A05(r0)
            if (r9 != 0) goto L_0x009b
            r1 = 0
            X.7v8 r0 = new X.7v8
            r0.<init>()
            r0.A00 = r1
            r0.A01 = r1
        L_0x0084:
            r7.A05(r0)
            if (r9 != 0) goto L_0x0096
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.7v7 r0 = new X.7v7
            r0.<init>()
            r0.A00 = r1
        L_0x0092:
            r7.A05(r0)
        L_0x0095:
            return
        L_0x0096:
            X.7v7 r0 = r9.BHQ()
            goto L_0x0092
        L_0x009b:
            X.7v8 r0 = r9.BHV()
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18660VwH.A03(X.8n3, X.X5q):void");
    }

    public final void A04(AnonymousClass8KU r4) {
        if (r4 instanceof C345237tA) {
            ((C345237tA) r4).EiW(this.A0M);
        }
        WG9 wg9 = this.A0J;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(r4);
        WG9.A00(wg9, arrayList, 8);
    }

    public final void A05(C344907sc r3) {
        this.A0K.A01(this.A0J, r3);
    }

    public final void A06(Integer num) {
        synchronized (this.A0O) {
            this.A09 = num;
        }
    }
}
