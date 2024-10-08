package X;

import android.util.SparseArray;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import com.instagram.android.R;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public final class GY5 extends C251253mo {
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public SparseArray A00;
    @Prop(optional = false, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public C3034368u A01;
    @Prop(optional = false, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public C229392nJ A02;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public C59483JLh A03;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public C229652no A04 = C55321Hfo.A00;

    public final boolean A0z() {
        return true;
    }

    public final boolean A11() {
        return true;
    }

    public GY5() {
        super("RootBloksComponent");
    }

    public static C53617GrW A00(2V1 r2) {
        return new C53617GrW(r2, new GY5());
    }

    public final Object[] A0W() {
        return new Object[]{this.A04, AnonymousClass7TE.A0v(), null, this.A02, this.A00, this.A03, this.A01, AnonymousClass7TE.A0u()};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.6SH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.6SH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.6SH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.VjJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.6SH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.6SH} */
    /* JADX WARNING: type inference failed for: r1v12, types: [X.VjJ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0b(X.2V1 r19) {
        /*
            r18 = this;
            r8 = r19
            X.2TB r1 = X.C51969G9p.A0e(r8)
            X.GYC r1 = (X.GYC) r1
            r4 = 0
            r0 = r18
            X.68u r0 = r0.A01
            X.6Rm r3 = r1.A00
            X.HiA r7 = r1.A02
            X.GY2 r6 = r1.A04
            X.6S3 r2 = r1.A01
            X.GY7 r11 = r1.A03
            boolean r5 = X.C307476Qg.A0B(r3)
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            X.68v r0 = r0.A01
            java.util.List r0 = r0.A02
            java.util.HashMap r10 = X.C3034368u.A05(r0, r1)
            X.GY6 r0 = new X.GY6
            r0.<init>(r8)
            X.6S4 r9 = new X.6S4
            r9.<init>(r0, r3)
            r1 = 0
            X.6Sh r0 = r7.A00
            if (r5 == 0) goto L_0x00e7
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r0 = r0.A02
            if (r0 == 0) goto L_0x00e4
            X.HkT r0 = (X.C55608HkT) r0
            X.4tk r7 = r0.A00
        L_0x003e:
            java.util.ArrayList r0 = r11.A00()
            if (r7 == 0) goto L_0x00e1
            X.S4m r5 = r7.A02
            X.0eP r5 = r5.A00()
            java.lang.Object r11 = r5.A00
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            java.lang.Object r5 = r5.A01
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0058
            r5.addAll(r0)
            r0 = r5
        L_0x0058:
            X.S4m r5 = new X.S4m
            r5.<init>(r11, r9, r0)
            X.6Qe r9 = r2.A00
            X.6Qe r11 = r9.A06(r10)
            X.4tp r16 = X.C307476Qg.A05(r3)
            r9 = 2131428758(0x7f0b0596, float:1.847917E38)
            java.lang.Object r12 = r3.A00(r9)
            X.6Rj r12 = (X.C307766Rj) r12
            X.2nJ r9 = r3.A02
            X.2nt r9 = r9.AgE()
            X.2no r13 = r9.AgJ()
            java.lang.String r17 = X.C307476Qg.A07(r3)
            X.6Qd r10 = X.C307476Qg.A02(r3)
            X.SGl r9 = new X.SGl
            r9.<init>(r10)
            X.S4e r15 = new X.S4e
            r15.<init>(r9)
            if (r7 != 0) goto L_0x00de
            r14 = r4
        L_0x008f:
            X.S53 r10 = new X.S53
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0098
            X.VjJ r1 = r7.A03
        L_0x0098:
            X.VjJ r16 = new X.VjJ
            r16.<init>()
            X.6Qc r12 = X.C307436Qc.A00
            X.4tk r11 = new X.4tk
            r13 = r10
            r14 = r5
            r15 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            X.4tV r1 = r2.A01
            X.WJt r2 = new X.WJt
            r2.<init>(r1, r11)
            X.HkT r1 = new X.HkT
            r1.<init>(r11, r0)
            X.6SH r7 = new X.6SH
            r7.<init>(r2, r1, r4)
        L_0x00b8:
            r1 = 0
            X.GPv r0 = new X.GPv
            r0.<init>()
            X.GY8 r5 = new X.GY8
            r5.<init>(r8, r0)
            X.GPv r4 = r5.A01
            r4.A01 = r3
            java.util.BitSet r2 = r5.A02
            r2.set(r1)
            r4.A00 = r7
            r0 = 1
            r2.set(r0)
            r4.A02 = r6
            java.lang.String[] r1 = r5.A03
            r0 = 2
            X.C244113af.A00(r2, r1, r0)
            r5.A02()
            return r4
        L_0x00de:
            X.S53 r14 = r7.A01
            goto L_0x008f
        L_0x00e1:
            r11 = r4
            goto L_0x0058
        L_0x00e4:
            r7 = r4
            goto L_0x003e
        L_0x00e7:
            if (r0 == 0) goto L_0x0112
            java.lang.Object r7 = r0.A02
            X.6S6 r7 = (X.AnonymousClass6S6) r7
            if (r7 == 0) goto L_0x0113
            X.6SE r0 = r7.A01
        L_0x00f1:
            X.6SE r5 = X.AnonymousClass6S7.A00(r3, r2, r0, r10)
            if (r7 == 0) goto L_0x00f9
            X.6SH r1 = r7.A00
        L_0x00f9:
            java.util.ArrayList r2 = r11.A00()
            X.6Qc r0 = X.C307436Qc.A00
            X.6SH r0 = X.AnonymousClass6SF.A00(r9, r1, r5, r0, r2)
            X.6S6 r1 = new X.6S6
            r1.<init>(r0, r5)
            X.6SH r0 = r1.A00
            X.2TS r0 = r0.A00
            X.6SH r7 = new X.6SH
            r7.<init>(r0, r1, r4)
            goto L_0x00b8
        L_0x0112:
            r7 = r4
        L_0x0113:
            r0 = r4
            goto L_0x00f1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GY5.A0b(X.2V1):X.3mp");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2TB, java.lang.Object] */
    public final /* bridge */ /* synthetic */ 2TB A0f() {
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.2TI, X.2TJ] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.HiA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.HiB, java.lang.Object] */
    public final void A0w(2V1 r14, 2TB r15) {
        C307556Qo r7;
        GY2 gy1;
        GYC gyc = (GYC) r15;
        ? obj = new Object();
        C229392nJ r10 = this.A02;
        C3034368u r11 = this.A01;
        C229652no r9 = this.A04;
        C59483JLh jLh = this.A03;
        SparseArray sparseArray = this.A00;
        Object A05 = r14.A05(ContextChain.class);
        SparseArray sparseArray2 = new SparseArray();
        boolean z = false;
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
        AnonymousClass3X5 r1 = r14.A02;
        if (!r1.A01.A0M) {
            sparseArray2.put(R.id.bk_context_key_incremental_mount_enabled, false);
        }
        sparseArray2.put(R.id.bk_context_key_resolve_litho_hierarchies, false);
        if (A05 != null) {
            sparseArray2.put(R.id.bk_context_key_context_chain, A05);
        }
        sparseArray2.put(R.id.bk_context_key_litho_config, r1);
        if (C276714tm.A00()) {
            z = true;
        }
        sparseArray2.put(R.id.bk_context_key_is_signals_enabled, Boolean.valueOf(z));
        if (sparseArray != null) {
            r7 = (C307556Qo) sparseArray.get(R.id.bk_context_key_performance_logger);
        } else {
            r7 = null;
        }
        int andIncrement = AnonymousClass6S8.A01.getAndIncrement();
        if (r7 != null) {
            r7.AT5(5, andIncrement);
            r7.AT0(5, andIncrement, "instance", andIncrement);
        }
        C307786Rm A012 = C307476Qg.A01(r14.A0C, sparseArray2, new C307446Qd(r11, r9, C307436Qc.A00), r10, r11.A03);
        if (r7 != null) {
            r7.AT4(5, andIncrement);
        }
        C307446Qd A022 = C307476Qg.A02(A012);
        GY7 gy7 = new GY7();
        ? obj2 = new Object();
        if (z) {
            gy1 = new H5D(A012, obj2, gy7);
        } else {
            gy1 = new GY1(A012, obj2, gy7);
        }
        ? obj3 = new Object();
        obj3.A00 = r14;
        obj.A00 = obj3;
        AnonymousClass6S3 A042 = A022.A04(A012, new GYB(obj), Collections.emptyMap());
        if (jLh != null) {
            INH inh = (INH) jLh;
            switch (inh.A00) {
                case 2:
                    ((C57328IXl) inh.A01).A02 = A012;
                    break;
                case 3:
                    AtomicReference atomicReference = (AtomicReference) ((2Wa) inh.A01).A03;
                    if (atomicReference != null) {
                        atomicReference.getAndSet(A012);
                        break;
                    }
                    break;
                default:
                    C51965G9l.A1W(inh.A01, A012);
                    break;
            }
        }
        gyc.A00 = A012;
        gyc.A02 = obj2;
        gyc.A04 = gy1;
        gyc.A01 = A042;
        gyc.A05 = (C55467HiB) obj.A00;
        gyc.A03 = gy7;
    }

    public final /* bridge */ /* synthetic */ C251263mp A0E() {
        return super.A0E();
    }

    public final void A0l(2V1 r2) {
        C51969G9p.A0e(r2).A05.A00 = r2;
    }
}
