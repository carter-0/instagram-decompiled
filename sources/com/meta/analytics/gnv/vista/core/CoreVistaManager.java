package com.meta.analytics.gnv.vista.core;

import X.00k;
import X.0Yv;
import X.0eP;
import X.0qQ;
import X.0sH;
import X.AnonymousClass0eM;
import X.AnonymousClass4CC;
import X.C2613349e;
import X.C2613549g;
import X.C2613649h;
import X.C376649Iu;
import X.C55748Hmj;
import X.C59560JOg;
import X.C61042Jvg;
import X.I07;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.analytics.dsp.point.IgPointContextProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

public final class CoreVistaManager implements C2613349e {
    public static final C2613649h A07 = new Object();
    public 0eP A00 = new 0eP(0, 0);
    public final IgPointContextProvider A01;
    public final C2613549g A02;
    public final HashMap A03 = new HashMap();
    public final WeakHashMap A04 = new WeakHashMap();
    public final 0sH A05;
    public volatile boolean A06 = true;

    public final void A02(View view, C59560JOg jOg, Object obj, String str) {
        boolean z;
        boolean z2;
        I07 i07;
        View view2 = view;
        0qQ.A0B(view2, 0);
        C2613549g r7 = this.A02;
        if (r7.A03 && (((Number) this.A00.A00).intValue() == 0 || ((Number) this.A00.A01).intValue() == 0)) {
            Context context = view2.getContext();
            0qQ.A07(context);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            0qQ.A07(displayMetrics);
            this.A00 = new 0eP(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        }
        WeakHashMap weakHashMap = this.A04;
        synchronized (weakHashMap) {
            I07 i072 = (I07) weakHashMap.get(view2);
            Object obj2 = obj;
            String str2 = str;
            if (i072 == null || !0qQ.A0K(i072.A03, str2) || !0qQ.A0K(i072.A02, obj2)) {
                C376649Iu r5 = new C376649Iu(str2, obj2);
                HashMap hashMap = this.A03;
                WeakReference weakReference = (WeakReference) hashMap.get(r5);
                if (weakReference != null && (i07 = (I07) weakReference.get()) != null) {
                    View view3 = (View) i07.A05.get();
                    if (view3 != null) {
                        weakHashMap.remove(view3);
                    }
                } else if (i072 != null) {
                    AnonymousClass0eM r9 = i072.A06;
                    List<VistaViewPoint> list = (List) r9.getValue();
                    ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                    for (VistaViewPoint vistaViewPoint : list) {
                        synchronized (vistaViewPoint) {
                            z2 = vistaViewPoint.A01;
                        }
                        arrayList.add(Boolean.valueOf(z2));
                    }
                    if (00k.A0t(arrayList)) {
                        List<VistaViewPoint> list2 = (List) r9.getValue();
                        ArrayList arrayList2 = new ArrayList(0Yv.A1E(list2, 10));
                        for (VistaViewPoint vistaViewPoint2 : list2) {
                            synchronized (vistaViewPoint2) {
                                z = vistaViewPoint2.A01;
                            }
                            arrayList2.add(new C61042Jvg(false, z, 22));
                        }
                        i072.A01.Dzd(i072.A05.get(), i072.A02, i072.A03, arrayList2);
                    }
                }
                I07 i073 = (I07) this.A05.invoke(view2, str2, obj2, jOg, new C55748Hmj(this.A01, r7, this.A00), (Object) null);
                weakHashMap.put(view2, i073);
                hashMap.put(r5, new WeakReference(i073));
            }
        }
    }

    public /* synthetic */ CoreVistaManager(IgPointContextProvider igPointContextProvider, C2613549g r5) {
        AnonymousClass4CC r0 = new AnonymousClass4CC(A07);
        this.A01 = igPointContextProvider;
        this.A02 = r5;
        this.A05 = r0;
    }

    public static final void A00(View view, CoreVistaManager coreVistaManager) {
        I07 i07 = (I07) coreVistaManager.A04.remove(view);
        if (i07 != null) {
            coreVistaManager.A03.remove(new C376649Iu(i07.A03, i07.A02));
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f3 A[RETURN] */
    public final java.lang.Object A01(X.C262224Cq r13, X.AnonymousClass4D7 r14) {
        /*
            r12 = this;
            r3 = 37
            boolean r0 = X.C376709Ja.A00(r3, r14)
            if (r0 == 0) goto L_0x00fa
            r6 = r14
            X.9Ja r6 = (X.C376709Ja) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00fa
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A03
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x00f4
            if (r0 == r4) goto L_0x00d8
            if (r0 != r5) goto L_0x0104
            java.lang.Object r13 = r6.A02
            X.4Cq r13 = (X.C262224Cq) r13
            java.lang.Object r3 = r6.A01
            com.meta.analytics.gnv.vista.core.CoreVistaManager r3 = (com.meta.analytics.gnv.vista.core.CoreVistaManager) r3
            X.0eS.A00(r1)
        L_0x002f:
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x00e3
            java.util.WeakHashMap r8 = r3.A04
            monitor-enter(r8)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0101 }
            r2.<init>()     // Catch:{ all -> 0x0101 }
            java.util.Set r0 = r8.entrySet()     // Catch:{ all -> 0x0101 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x0101 }
        L_0x0043:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0079
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x0101 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ all -> 0x0101 }
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x0101 }
            X.I07 r0 = (X.I07) r0     // Catch:{ all -> 0x0101 }
            java.lang.ref.WeakReference r0 = r0.A04     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0101 }
            X.07Z r0 = (X.AnonymousClass07Z) r0     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x006d
            X.07V r0 = r0.getLifecycle()     // Catch:{ all -> 0x0101 }
            X.07U r1 = r0.A07()     // Catch:{ all -> 0x0101 }
            X.07U r0 = X.07U.A02     // Catch:{ all -> 0x0101 }
            if (r1 != r0) goto L_0x0043
        L_0x006d:
            java.lang.Object r1 = r9.getKey()     // Catch:{ all -> 0x0101 }
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x0101 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0101 }
            goto L_0x0043
        L_0x0079:
            java.util.Set r0 = r2.keySet()     // Catch:{ all -> 0x0101 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0101 }
        L_0x0081:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0101 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0101 }
            A00(r0, r3)     // Catch:{ all -> 0x0101 }
            goto L_0x0081
        L_0x0091:
            java.util.Collection r1 = r8.values()     // Catch:{ all -> 0x0101 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0101 }
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)     // Catch:{ all -> 0x0101 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0101 }
            r9.<init>(r0)     // Catch:{ all -> 0x0101 }
            java.util.Iterator r11 = r1.iterator()     // Catch:{ all -> 0x0101 }
        L_0x00a7:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x0101 }
            X.I07 r10 = (X.I07) r10     // Catch:{ all -> 0x0101 }
            r0 = 0
            X.0qQ.A0B(r13, r0)     // Catch:{ all -> 0x0101 }
            r1 = 0
            r0 = 7
            X.MGo r2 = new X.MGo     // Catch:{ all -> 0x0101 }
            r2.<init>(r10, r13, r1, r0)     // Catch:{ all -> 0x0101 }
            X.19B r1 = X.19B.A00     // Catch:{ all -> 0x0101 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0101 }
            X.2Q8 r0 = X.1Eo.A01(r0, r1, r2, r13)     // Catch:{ all -> 0x0101 }
            r9.add(r0)     // Catch:{ all -> 0x0101 }
            goto L_0x00a7
        L_0x00ca:
            monitor-exit(r8)
            r6.A01 = r3
            r6.A02 = r13
            r6.A00 = r4
            java.lang.Object r0 = X.AnonymousClass42T.A00(r9, r6)
            if (r0 != r7) goto L_0x00e3
            return r7
        L_0x00d8:
            java.lang.Object r13 = r6.A02
            X.4Cq r13 = (X.C262224Cq) r13
            java.lang.Object r3 = r6.A01
            com.meta.analytics.gnv.vista.core.CoreVistaManager r3 = (com.meta.analytics.gnv.vista.core.CoreVistaManager) r3
            X.0eS.A00(r1)
        L_0x00e3:
            X.49g r0 = r3.A02
            long r0 = r0.A02
            r6.A01 = r3
            r6.A02 = r13
            r6.A00 = r5
            java.lang.Object r0 = X.C241603Pv.A01(r6, r0)
            if (r0 != r7) goto L_0x002f
            return r7
        L_0x00f4:
            X.0eS.A00(r1)
            r3 = r12
            goto L_0x002f
        L_0x00fa:
            X.9Ja r6 = new X.9Ja
            r6.<init>(r12, r14, r3)
            goto L_0x0016
        L_0x0101:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0104:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.gnv.vista.core.CoreVistaManager.A01(X.4Cq, X.4D7):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void AAO(C59560JOg jOg, Object obj, Object obj2, String str, boolean z) {
        A02((View) obj, jOg, obj2, str);
    }

    public final /* bridge */ /* synthetic */ void EEi(Object obj) {
        View view = (View) obj;
        0qQ.A0B(view, 0);
        synchronized (this.A04) {
            A00(view, this);
        }
    }
}
