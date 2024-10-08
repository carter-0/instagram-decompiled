package X;

import android.graphics.Point;
import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8o7  reason: invalid class name and case insensitive filesystem */
public abstract class C366058o7 implements C344737sL, C344747sM {
    public C361208fq A00;
    public final C344407ro A01;

    private C361208fq A00(C345897uG r7, C344567s4 r8) {
        C346307ux r5;
        boolean z = this instanceof C366048o6;
        if (z) {
            r5 = ((C366048o6) this).A07;
        } else if (this instanceof C382379db) {
            r5 = ((C382379db) this).A04;
        } else if (this instanceof C382369da) {
            r5 = ((C382369da) this).A06;
        } else {
            r5 = ((C382359dZ) this).A00;
        }
        C345967uN Blv = r7.Blv();
        if ((!z || ((C366048o6) this).A0B) && Blv.A00()) {
            C346317uy BJu = r5.BJu();
            0qQ.A0B(BJu, 0);
            if (!Blv.A00()) {
                throw new UnsupportedOperationException("getRenderer() is not enabled");
            } else if (Blv.A00 != null) {
                HashMap hashMap = Blv.A04;
                C361208fq r1 = (C361208fq) hashMap.get(BJu);
                if (r1 != null) {
                    return r1;
                }
                C361208fq AMl = r5.AMl();
                AMl.CMa(Blv.A02);
                AMl.ACn(Blv.A00);
                hashMap.put(BJu, AMl);
                return AMl;
            } else {
                throw new IllegalStateException("GlContext is not available");
            }
        } else {
            if (this.A00 == null) {
                C361208fq AMl2 = r5.AMl();
                this.A00 = AMl2;
                AMl2.CMa(r8);
                this.A00.ACn(r7);
            }
            return this.A00;
        }
    }

    public final void ACn(C345897uG r1) {
    }

    public final int AlC() {
        return 0;
    }

    public final boolean CKm() {
        return true;
    }

    public final void CMa(C344567s4 r1) {
    }

    public final void FMh(int i, Object obj) {
    }

    public final void release() {
    }

    public final /* synthetic */ int Avq() {
        int i;
        if (this instanceof C382379db) {
            ArrayList arrayList = ((C382379db) this).A05;
            if (!arrayList.isEmpty()) {
                return ((Number) arrayList.get(0)).intValue();
            }
            return 0;
        } else if (!(this instanceof C366048o6)) {
            return 0;
        } else {
            C366048o6 r1 = (C366048o6) this;
            if (r1.A08 == null || (i = r1.A00) <= -1) {
                return 0;
            }
            return i;
        }
    }

    public final /* synthetic */ boolean Cag() {
        if ((this instanceof C366048o6) || (this instanceof C382379db) || (this instanceof C382359dZ)) {
            return true;
        }
        return false;
    }

    public final C345137sz EEw(C345137sz r20, C345097sv r21, C344697sH r22, Long l) {
        int Ap3;
        C392229uQ r0;
        C344697sH r12 = r22;
        C345137sz r9 = r20;
        C344567s4 r1 = ((C344687sG) r12).A05;
        C345897uG r02 = r1.A0E;
        if (r02 == null) {
            return r9;
        }
        C361208fq A002 = A00(r02, r1);
        C345097sv r10 = r21;
        Long l2 = l;
        if (this instanceof C366048o6) {
            C366048o6 r2 = (C366048o6) this;
            List list = r2.A09;
            return ((C367488qp) A002).A03(r2.A03, r9, r10, r2.A08, r12, l2, list, r2.A02, r2.A01, r2.A04, r2.A0A);
        } else if (this instanceof C382379db) {
            C382379db r23 = (C382379db) this;
            C382329dW r7 = (C382329dW) A002;
            A6X a6x = (A6X) r23.A02.get(r23.Avq());
            int i = r23.A01;
            int i2 = r23.A00;
            synchronized (r7) {
                try {
                    C349257zq.A03("LayoutMediaGraph.onRender");
                    C382349dY r4 = r7.A01;
                    if (r4 == null) {
                        r4 = new C382349dY();
                        r7.A01 = r4;
                    }
                    if (a6x == null || (r0 = a6x.A00) == null) {
                        r4.A0B(0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        r4.A0B(r0.A00, r0.A03, r0.A02, r0.A01);
                    }
                    if (r21 != null) {
                        C361218fr A012 = r7.A01();
                        C345897uG r122 = r7.A00;
                        r122.getClass();
                        A012.A01(r122, r9, r10, r7.A01, true, true, false);
                    } else {
                        C345087su A003 = C382329dW.A00(r4, r7, i, i2);
                        C361218fr A013 = r7.A01();
                        C345897uG r11 = r7.A00;
                        r11.getClass();
                        A013.A01(r11, r9, A003, r7.A01, true, true, false);
                        r9 = A003.A0A;
                    }
                    C349257zq.A01();
                } catch (Throwable th) {
                    C349257zq.A01();
                    throw th;
                }
            }
            return r9;
        } else if (this instanceof C382369da) {
            C382369da r24 = (C382369da) this;
            C367488qp r72 = (C367488qp) A002;
            0qQ.A0B(r72, 0);
            0qQ.A0B(r9, 1);
            0qQ.A0B(r12, 3);
            FilterModel filterModel = r24.A04;
            if (filterModel == null || r24.A01 >= r24.A03 || r24.A00 >= r24.A02) {
                return r9;
            }
            C366548pF r8 = r24.A05;
            if (r8 == null) {
                r8 = new C366518pA(false).A00(filterModel);
                r24.A05 = r8;
            }
            if (r8 != null) {
                C345137sz A03 = r72.A03(r8, r9, r10, (C345057sr) null, r12, l2, (List) null, r24.A03, r24.A02, false, false);
                0qQ.A07(A03);
                return A03;
            }
            throw new IllegalStateException("Required value was null.");
        } else {
            C382319dV r73 = (C382319dV) A002;
            boolean z = ((C382359dZ) this).A01;
            if (r21 != null) {
                if (r73.A01 == null) {
                    r73.A01 = new C345077st();
                }
                C361218fr A014 = r73.A01();
                C345897uG r25 = r73.A00;
                r25.getClass();
                A014.A01(r25, r9, r10, r73.A01, true, true, false);
                return r9;
            }
            if (!z && ((Ap3 = r9.Ap3()) == 0 || Ap3 == 3)) {
                C345067ss CFP = r9.CFP();
                if (CFP == null) {
                    return r9;
                }
                if (CFP.A01 <= 1920 && CFP.A00 <= 1920) {
                    return r9;
                }
            }
            C345067ss CFP2 = r9.CFP();
            if (CFP2 == null) {
                return r9;
            }
            int i3 = CFP2.A01;
            int i4 = CFP2.A00;
            if (i3 > 1920 || i4 > 1920) {
                if (i3 > i4) {
                    i4 = Math.round((((float) i4) / 1920.0f) * 1920.0f);
                    i3 = 1920;
                } else {
                    i3 = Math.round((((float) i3) / ((float) i4)) * 1920.0f);
                    i4 = 1920;
                }
            }
            C345087su r03 = r73.A00;
            if (r03 == null) {
                r73.A00 = new C345087su(r73.A04, new C345047sq(), new C345077st(), false);
                r73.A01.getClass();
                r73.A00.A03(i3, i4, 0);
                C345087su r13 = r73.A00;
                C345897uG r04 = r73.A00;
                r04.getClass();
                r13.ACn(r04);
            } else {
                r03.A03(i3, i4, 0);
            }
            C345087su r26 = r73.A00;
            C361218fr A015 = r73.A01();
            C345897uG r05 = r73.A00;
            r05.getClass();
            A015.A00(r05, r9, r26);
            return r26.A0A;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0262, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        X.C349257zq.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0273, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        X.C349257zq.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0277, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:30:0x00a9, B:72:0x013f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EEx(X.C344697sH r29, java.lang.Long r30) {
        /*
            r28 = this;
            r1 = r29
            r3 = r1
            X.7sG r3 = (X.C344687sG) r3
            X.7s4 r2 = r3.A05
            X.7uG r0 = r2.A0E
            if (r0 == 0) goto L_0x003d
            r4 = r28
            X.8fq r0 = r4.A00(r0, r2)
            r7 = r4
            boolean r2 = r4 instanceof X.C366048o6
            r13 = r30
            if (r2 == 0) goto L_0x003e
            X.8o6 r7 = (X.C366048o6) r7
            X.8qp r0 = (X.C367488qp) r0
            java.util.List r9 = r7.A09
            X.8pF r8 = r7.A03
            int r6 = r7.A02
            int r5 = r7.A01
            boolean r4 = r7.A04
            X.7sr r3 = r7.A08
            boolean r2 = r7.A0A
            int r17 = r7.Avq()
            r11 = r3
            r12 = r1
            r14 = r9
            r15 = r6
            r16 = r5
            r18 = r4
            r19 = r2
            r9 = r0
            r10 = r8
        L_0x003a:
            r9.A05(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x003d:
            return
        L_0x003e:
            boolean r2 = r4 instanceof X.C382379db
            if (r2 == 0) goto L_0x004e
            X.9db r7 = (X.C382379db) r7
            X.9dW r0 = (X.C382329dW) r0
            android.util.SparseArray r6 = r7.A02
            int r5 = r7.A01
            int r4 = r7.A00
            monitor-enter(r0)
            goto L_0x0092
        L_0x004e:
            boolean r2 = r4 instanceof X.C382369da
            if (r2 == 0) goto L_0x0287
            X.9da r7 = (X.C382369da) r7
            X.8qp r0 = (X.C367488qp) r0
            r6 = 0
            X.0qQ.A0B(r0, r6)
            r2 = 1
            X.0qQ.A0B(r1, r2)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r5 = r7.A04
            if (r5 == 0) goto L_0x003d
            int r3 = r7.A01
            int r2 = r7.A03
            if (r3 >= r2) goto L_0x003d
            int r3 = r7.A00
            int r2 = r7.A02
            if (r3 >= r2) goto L_0x003d
            X.8pF r4 = r7.A05
            if (r4 != 0) goto L_0x007d
            X.8pA r2 = new X.8pA
            r2.<init>(r6)
            X.8pF r4 = r2.A00(r5)
            r7.A05 = r4
        L_0x007d:
            r11 = 0
            if (r4 == 0) goto L_0x027f
            int r3 = r7.A03
            int r2 = r7.A02
            r12 = r1
            r14 = r11
            r15 = r3
            r16 = r2
            r17 = r6
            r18 = r6
            r19 = r6
            r9 = r0
            r10 = r4
            goto L_0x003a
        L_0x0092:
            boolean r2 = r0.A02()     // Catch:{ all -> 0x027c }
            if (r2 == 0) goto L_0x027a
            X.7uG r2 = r0.A00     // Catch:{ all -> 0x027c }
            r2.getClass()     // Catch:{ all -> 0x027c }
            X.7uN r2 = r2.Blv()     // Catch:{ all -> 0x027c }
            boolean r2 = r2.A02()     // Catch:{ all -> 0x027c }
            if (r2 == 0) goto L_0x0114
            java.lang.String r2 = "LayoutMediaGraph.renderSingleInput"
            X.C349257zq.A03(r2)     // Catch:{ all -> 0x0273 }
            r5 = 0
            int r4 = r1.B9Q(r5)     // Catch:{ all -> 0x0273 }
            r2 = 1
            if (r4 == r2) goto L_0x00b5
            r2 = 0
        L_0x00b5:
            X.0JA.A07(r2)     // Catch:{ all -> 0x0273 }
            r11 = 0
            java.util.List r4 = r1.B9R(r5)     // Catch:{ all -> 0x0273 }
            monitor-enter(r4)     // Catch:{ all -> 0x0273 }
            boolean r2 = r4.isEmpty()     // Catch:{ all -> 0x0110 }
            if (r2 != 0) goto L_0x010d
            java.lang.Object r7 = r4.get(r5)     // Catch:{ all -> 0x0110 }
            X.7sv r7 = (X.C345097sv) r7     // Catch:{ all -> 0x0110 }
            monitor-exit(r4)     // Catch:{ all -> 0x0110 }
            if (r7 == 0) goto L_0x026f
            X.9dY r2 = r0.A01     // Catch:{ all -> 0x0273 }
            if (r2 != 0) goto L_0x00d8
            X.9dY r2 = new X.9dY     // Catch:{ all -> 0x0273 }
            r2.<init>()     // Catch:{ all -> 0x0273 }
            r0.A01 = r2     // Catch:{ all -> 0x0273 }
        L_0x00d8:
            X.7sI r2 = r3.A06     // Catch:{ all -> 0x0273 }
            android.util.SparseArray r2 = r2.A00     // Catch:{ all -> 0x0273 }
            int r3 = r2.size()     // Catch:{ all -> 0x0273 }
        L_0x00e0:
            if (r5 >= r3) goto L_0x026f
            boolean r2 = r1.CVW(r5)     // Catch:{ all -> 0x0273 }
            if (r2 == 0) goto L_0x010a
            java.lang.Object r2 = r6.get(r5)     // Catch:{ all -> 0x0273 }
            X.A6X r2 = (X.A6X) r2     // Catch:{ all -> 0x0273 }
            if (r2 == 0) goto L_0x010a
            java.lang.Object r6 = r1.BHP(r5)     // Catch:{ all -> 0x0273 }
            X.7sz r6 = (X.C345137sz) r6     // Catch:{ all -> 0x0273 }
            if (r6 == 0) goto L_0x026f
            X.8fr r4 = r0.A01()     // Catch:{ all -> 0x0273 }
            X.7uG r5 = r0.A00     // Catch:{ all -> 0x0273 }
            r5.getClass()     // Catch:{ all -> 0x0273 }
            r9 = 1
            X.9dY r8 = r0.A01     // Catch:{ all -> 0x0273 }
            r10 = r9
            r4.A01(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0273 }
            goto L_0x026f
        L_0x010a:
            int r5 = r5 + 1
            goto L_0x00e0
        L_0x010d:
            monitor-exit(r4)     // Catch:{ all -> 0x0110 }
            goto L_0x026f
        L_0x0110:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0110 }
            goto L_0x0266
        L_0x0114:
            java.lang.String r2 = "LayoutMediaGraph.renderMultipleInput"
            X.C349257zq.A03(r2)     // Catch:{ all -> 0x0273 }
            X.9dX r2 = r0.A02     // Catch:{ all -> 0x0273 }
            if (r2 != 0) goto L_0x0124
            X.9dX r2 = new X.9dX     // Catch:{ all -> 0x0273 }
            r2.<init>()     // Catch:{ all -> 0x0273 }
            r0.A02 = r2     // Catch:{ all -> 0x0273 }
        L_0x0124:
            X.7su r15 = X.C382329dW.A00(r2, r0, r5, r4)     // Catch:{ all -> 0x0273 }
            X.7sI r2 = r3.A06     // Catch:{ all -> 0x0273 }
            android.util.SparseArray r2 = r2.A00     // Catch:{ all -> 0x0273 }
            int r13 = r2.size()     // Catch:{ all -> 0x0273 }
            r25 = 1
            r16 = 0
            r2 = 0
        L_0x0135:
            if (r2 >= r13) goto L_0x0267
            boolean r7 = r1.CVW(r2)     // Catch:{ all -> 0x0273 }
            if (r7 == 0) goto L_0x0256
            java.lang.String r7 = "render "
            java.lang.String r7 = X.002.A0O(r7, r2)     // Catch:{ all -> 0x0262 }
            X.C349257zq.A03(r7)     // Catch:{ all -> 0x0262 }
            java.lang.Object r7 = r6.get(r2)     // Catch:{ all -> 0x0262 }
            X.A6X r7 = (X.A6X) r7     // Catch:{ all -> 0x0262 }
            if (r7 == 0) goto L_0x0253
            java.lang.Object r10 = r1.BHP(r2)     // Catch:{ all -> 0x0262 }
            X.7sz r10 = (X.C345137sz) r10     // Catch:{ all -> 0x0262 }
            X.7ss r9 = r10.CFP()     // Catch:{ all -> 0x0262 }
            if (r9 == 0) goto L_0x0253
            X.8n8 r8 = r7.A03     // Catch:{ all -> 0x0262 }
            r8.A00 = r10     // Catch:{ all -> 0x0262 }
            android.graphics.RectF r8 = r7.A01     // Catch:{ all -> 0x0262 }
            float r10 = r8.width()     // Catch:{ all -> 0x0262 }
            int r8 = r9.A01     // Catch:{ all -> 0x0262 }
            float r8 = (float) r8     // Catch:{ all -> 0x0262 }
            float r10 = r10 * r8
            int r23 = java.lang.Math.round(r10)     // Catch:{ all -> 0x0262 }
            android.graphics.RectF r8 = r7.A01     // Catch:{ all -> 0x0262 }
            float r10 = r8.height()     // Catch:{ all -> 0x0262 }
            int r8 = r9.A00     // Catch:{ all -> 0x0262 }
            float r8 = (float) r8     // Catch:{ all -> 0x0262 }
            float r10 = r10 * r8
            int r24 = java.lang.Math.round(r10)     // Catch:{ all -> 0x0262 }
            r8 = 0
            X.9uQ r10 = r7.A00     // Catch:{ all -> 0x0262 }
            if (r10 == 0) goto L_0x0229
            int r12 = r9.A01     // Catch:{ all -> 0x0262 }
            int r11 = r9.A00     // Catch:{ all -> 0x0262 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0262 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0262 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0262 }
            X.0JA.A02(r9, r10, r8)     // Catch:{ all -> 0x0262 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0262 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0262 }
            X.0JA.A02(r9, r10, r8)     // Catch:{ all -> 0x0262 }
            int r12 = r12 - r23
            int r14 = r12 / 2
            int r11 = r11 - r24
            int r12 = r11 / 2
            X.9uQ r9 = r7.A00     // Catch:{ all -> 0x0262 }
            if (r9 == 0) goto L_0x025a
            X.8n8 r11 = r7.A03     // Catch:{ all -> 0x0262 }
            float r10 = r9.A02     // Catch:{ all -> 0x0262 }
            r8 = 1065353216(0x3f800000, float:1.0)
            float r18 = r10 * r8
            float r8 = r9.A01     // Catch:{ all -> 0x0262 }
            r19 = r10
            r20 = r8
            r21 = r14
            r22 = r12
            r17 = r11
            r17.A00(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0262 }
            float r8 = r9.A00     // Catch:{ all -> 0x0262 }
            float r11 = r9.A03     // Catch:{ all -> 0x0262 }
        L_0x01c4:
            android.graphics.RectF r9 = r7.A02     // Catch:{ all -> 0x0262 }
            float r9 = r9.left     // Catch:{ all -> 0x0262 }
            float r8 = r8 + r9
            float r10 = (float) r5     // Catch:{ all -> 0x0262 }
            float r8 = r8 * r10
            int r14 = java.lang.Math.round(r8)     // Catch:{ all -> 0x0262 }
            android.graphics.RectF r8 = r7.A02     // Catch:{ all -> 0x0262 }
            float r8 = r8.top     // Catch:{ all -> 0x0262 }
            float r11 = r11 + r8
            float r9 = (float) r4     // Catch:{ all -> 0x0262 }
            float r11 = r11 * r9
            int r12 = java.lang.Math.round(r11)     // Catch:{ all -> 0x0262 }
            android.graphics.RectF r8 = r7.A02     // Catch:{ all -> 0x0262 }
            float r8 = r8.width()     // Catch:{ all -> 0x0262 }
            float r8 = r8 * r10
            int r11 = java.lang.Math.round(r8)     // Catch:{ all -> 0x0262 }
            android.graphics.RectF r8 = r7.A02     // Catch:{ all -> 0x0262 }
            float r8 = r8.height()     // Catch:{ all -> 0x0262 }
            float r8 = r8 * r9
            int r10 = java.lang.Math.round(r8)     // Catch:{ all -> 0x0262 }
            X.9dX r9 = r0.A02     // Catch:{ all -> 0x0262 }
            int r8 = r9.A02     // Catch:{ all -> 0x0262 }
            if (r8 != r14) goto L_0x021d
            int r8 = r9.A03     // Catch:{ all -> 0x0262 }
            if (r8 != r12) goto L_0x021d
            int r8 = r9.A01     // Catch:{ all -> 0x0262 }
            if (r8 != r11) goto L_0x021d
            int r8 = r9.A00     // Catch:{ all -> 0x0262 }
            if (r8 != r10) goto L_0x021d
        L_0x0202:
            X.8fr r20 = r0.A01()     // Catch:{ all -> 0x0262 }
            X.7uG r8 = r0.A00     // Catch:{ all -> 0x0262 }
            r8.getClass()     // Catch:{ all -> 0x0262 }
            X.8n8 r7 = r7.A03     // Catch:{ all -> 0x0262 }
            r26 = 1
            r24 = 0
            r21 = r8
            r22 = r7
            r23 = r15
            r27 = r26
            r20.A01(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0262 }
            goto L_0x0251
        L_0x021d:
            r9.A02 = r14     // Catch:{ all -> 0x0262 }
            r9.A03 = r12     // Catch:{ all -> 0x0262 }
            r9.A01 = r11     // Catch:{ all -> 0x0262 }
            r9.A00 = r10     // Catch:{ all -> 0x0262 }
            r8 = 1
            r9.A01 = r8     // Catch:{ all -> 0x0262 }
            goto L_0x0202
        L_0x0229:
            android.graphics.RectF r10 = r7.A01     // Catch:{ all -> 0x0262 }
            float r11 = r10.left     // Catch:{ all -> 0x0262 }
            int r10 = r9.A01     // Catch:{ all -> 0x0262 }
            float r10 = (float) r10     // Catch:{ all -> 0x0262 }
            float r11 = r11 * r10
            int r21 = java.lang.Math.round(r11)     // Catch:{ all -> 0x0262 }
            android.graphics.RectF r10 = r7.A01     // Catch:{ all -> 0x0262 }
            float r10 = r10.top     // Catch:{ all -> 0x0262 }
            int r9 = r9.A00     // Catch:{ all -> 0x0262 }
            float r9 = (float) r9     // Catch:{ all -> 0x0262 }
            float r10 = r10 * r9
            int r22 = java.lang.Math.round(r10)     // Catch:{ all -> 0x0262 }
            X.8n8 r9 = r7.A03     // Catch:{ all -> 0x0262 }
            r18 = 1065353216(0x3f800000, float:1.0)
            r17 = r9
            r19 = r18
            r20 = r8
            r17.A00(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0262 }
            r11 = 0
            goto L_0x01c4
        L_0x0251:
            r25 = 0
        L_0x0253:
            X.C349257zq.A01()     // Catch:{ all -> 0x0273 }
        L_0x0256:
            int r2 = r2 + 1
            goto L_0x0135
        L_0x025a:
            java.lang.String r2 = "Crop properties should not be null"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0262 }
            r1.<init>(r2)     // Catch:{ all -> 0x0262 }
            throw r1     // Catch:{ all -> 0x0262 }
        L_0x0262:
            r1 = move-exception
            X.C349257zq.A01()     // Catch:{ all -> 0x0273 }
        L_0x0266:
            throw r1     // Catch:{ all -> 0x0273 }
        L_0x0267:
            X.7sy r4 = r15.A0A     // Catch:{ all -> 0x0273 }
            X.7sJ r2 = r3.A07     // Catch:{ all -> 0x0273 }
            r1 = 0
            r2.A01(r4, r1)     // Catch:{ all -> 0x0273 }
        L_0x026f:
            X.C349257zq.A01()     // Catch:{ all -> 0x0278 }
            goto L_0x027a
        L_0x0273:
            r1 = move-exception
            X.C349257zq.A01()     // Catch:{ all -> 0x0278 }
            throw r1     // Catch:{ all -> 0x0278 }
        L_0x0278:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x027c }
        L_0x027a:
            monitor-exit(r0)
            return
        L_0x027c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x027f:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0287:
            java.lang.String r0 = "onRender() API deprecated!"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366058o7.EEx(X.7sH, java.lang.Long):void");
    }

    public final void FLA(int i, int i2, int i3, boolean z, int i4, int i5) {
        if (this instanceof C366048o6) {
            C366048o6 r0 = (C366048o6) this;
            r0.A02 = i4;
            r0.A01 = i5;
        } else if (this instanceof C382379db) {
            C382379db r02 = (C382379db) this;
            r02.A01 = i4;
            r02.A00 = i5;
        } else if (this instanceof C382369da) {
            C382369da r4 = (C382369da) this;
            r4.A01 = i2;
            r4.A00 = i3;
            float f = ((float) i2) / ((float) i3);
            int i6 = (int) (((float) i4) / f);
            if (i6 <= i5) {
                i5 = i6;
            } else {
                i4 = (int) (((float) i5) * f);
            }
            r4.A03 = new int[]{i4, i5}[0];
            r4.A02 = i5;
            if (r4.A07.intValue() == 2) {
                FilterModel filterModel = r4.A04;
                if (filterModel instanceof FilterChain) {
                    0qQ.A0C(filterModel, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain");
                    SparseArray sparseArray = ((FilterChain) filterModel).A02;
                    sparseArray.put(0, new Point(r4.A01 * 2, r4.A00 * 2));
                    sparseArray.put(1, new Point(r4.A03, r4.A02));
                }
            }
        }
    }

    public final void detach() {
        C361208fq r0 = this.A00;
        if (r0 != null) {
            r0.detach();
            this.A00.release();
            this.A00 = null;
        }
    }

    public C366058o7(C344407ro r1) {
        this.A01 = r1;
    }
}
