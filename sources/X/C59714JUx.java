package X;

import com.instagram.react.modules.base.IgReactQEModule;
import com.meta.compose.component.swipeable.SwipeableState;

/* renamed from: X.JUx  reason: case insensitive filesystem */
public final class C59714JUx extends AnonymousClass1Ek implements 0sL {
    public float A00;
    public int A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59714JUx(Object obj, AnonymousClass4D7 r3, float f, int i) {
        super(2, r3);
        this.A02 = i;
        this.A03 = obj;
        this.A00 = f;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.JUx, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.JUx, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        Object obj2;
        float f;
        int i;
        switch (this.A02) {
            case 0:
                obj2 = this.A03;
                f = this.A00;
                i = 0;
                break;
            case 1:
                obj2 = this.A03;
                f = this.A00;
                i = 1;
                break;
            case 2:
                obj2 = this.A03;
                f = this.A00;
                i = 2;
                break;
            case 3:
                obj2 = this.A03;
                f = this.A00;
                i = 3;
                break;
            case 4:
                obj2 = this.A03;
                f = this.A00;
                i = 4;
                break;
            case 5:
                obj2 = this.A03;
                f = this.A00;
                i = 5;
                break;
            case 6:
                obj2 = this.A03;
                f = this.A00;
                i = 6;
                break;
            case 7:
                obj2 = this.A03;
                f = this.A00;
                i = 7;
                break;
            case 8:
                obj2 = this.A03;
                f = this.A00;
                i = 8;
                break;
            case 9:
                obj2 = this.A03;
                f = this.A00;
                i = 9;
                break;
            case 10:
                obj2 = this.A03;
                f = this.A00;
                i = 10;
                break;
            case 11:
                obj2 = this.A03;
                f = this.A00;
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                obj2 = this.A03;
                f = this.A00;
                i = 12;
                break;
            case 13:
                obj2 = this.A03;
                f = this.A00;
                i = 13;
                break;
            case 14:
                obj2 = this.A03;
                f = this.A00;
                i = 14;
                break;
            case 15:
                ? jUx = new C59714JUx((SwipeableState) this.A03, r6);
                jUx.A00 = AnonymousClass7TE.A04(obj);
                return jUx;
            case 16:
                obj2 = this.A03;
                f = this.A00;
                i = 16;
                break;
            default:
                obj2 = this.A03;
                f = this.A00;
                i = 17;
                break;
        }
        return new C59714JUx(obj2, r6, f, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass4D7 create;
        if (15 - this.A02 != 0) {
            create = AnonymousClass7TE.A1M(obj2, obj, this);
        } else {
            create = create(Float.valueOf(AnonymousClass7TE.A04(obj)), (AnonymousClass4D7) obj2);
        }
        return ((C59714JUx) create).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.JUx, java.lang.Object, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019b, code lost:
        if (r0 == r3) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019d, code lost:
        r0 = X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r0 != r3) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x025d, code lost:
        X.0eS.A00(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0262, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r15 = r20
            int r0 = r15.A02
            X.1Hj r3 = X.1Hj.A02
            switch(r0) {
                case 4: goto L_0x023c;
                case 5: goto L_0x0217;
                case 6: goto L_0x0217;
                case 7: goto L_0x01f4;
                case 8: goto L_0x01d1;
                case 9: goto L_0x01a1;
                case 10: goto L_0x011c;
                case 11: goto L_0x023c;
                case 12: goto L_0x00f6;
                case 13: goto L_0x00d2;
                case 14: goto L_0x00ae;
                case 15: goto L_0x008a;
                case 16: goto L_0x006a;
                case 17: goto L_0x004e;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r0 = r15.A01
            r7 = 2
            r8 = 1
            r6 = 0
            if (r0 == 0) goto L_0x002f
            if (r0 != r8) goto L_0x025d
            X.0eS.A00(r21)
        L_0x0015:
            java.lang.Object r5 = r15.A03
            X.5b4 r5 = (X.AnonymousClass5b4) r5
            java.lang.Float r4 = X.JTP.A0i()
            r2 = 1056964608(0x3f000000, float:0.5)
            r1 = 1128792064(0x43480000, float:200.0)
            X.5b7 r0 = new X.5b7
            r0.<init>(r6, r2, r1)
            r15.A01 = r7
            java.lang.Object r0 = X.JTQ.A0V(r5, r0, r4, r15)
        L_0x002c:
            if (r0 != r3) goto L_0x0260
        L_0x002e:
            return r3
        L_0x002f:
            X.0eS.A00(r21)
            java.lang.Object r5 = r15.A03
            X.5b4 r5 = (X.AnonymousClass5b4) r5
            float r0 = r15.A00
            java.lang.Float r4 = X.C51965G9l.A0q(r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            r1 = 1128792064(0x43480000, float:200.0)
            X.5b7 r0 = new X.5b7
            r0.<init>(r6, r2, r1)
            r15.A01 = r8
            java.lang.Object r0 = X.JTQ.A0V(r5, r0, r4, r15)
            if (r0 != r3) goto L_0x0015
            return r3
        L_0x004e:
            int r0 = r15.A01
            r2 = 1
            if (r0 == 0) goto L_0x005a
            if (r0 == r2) goto L_0x025d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x005a:
            X.0eS.A00(r21)
            java.lang.Object r1 = r15.A03
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r1 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r1
            float r0 = r15.A00
            r15.A01 = r2
            java.lang.Object r0 = r1.A07(r15, r0)
            goto L_0x002c
        L_0x006a:
            int r0 = r15.A01
            r2 = 1
            if (r0 == 0) goto L_0x0076
            if (r0 == r2) goto L_0x025d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0076:
            X.0eS.A00(r21)
            java.lang.Object r1 = r15.A03
            X.0sL r1 = (X.0sL) r1
            float r0 = r15.A00
            java.lang.Float r0 = X.C51965G9l.A0q(r0)
            r15.A01 = r2
            java.lang.Object r0 = r1.invoke(r0, r15)
            goto L_0x002c
        L_0x008a:
            int r1 = r15.A01
            r0 = 1
            if (r1 == 0) goto L_0x0096
            if (r1 == r0) goto L_0x025d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0096:
            X.0eS.A00(r21)
            float r4 = r15.A00
            java.lang.Object r2 = r15.A03
            com.meta.compose.component.swipeable.SwipeableState r2 = (com.meta.compose.component.swipeable.SwipeableState) r2
            r15.A01 = r0
            X.0r6 r1 = r2.A0F
            X.IkN r0 = new X.IkN
            r0.<init>(r2, r4)
            java.lang.Object r0 = r1.collect(r0, r15)
            goto L_0x019b
        L_0x00ae:
            int r0 = r15.A01
            r4 = 1
            if (r0 == 0) goto L_0x00ba
            if (r0 == r4) goto L_0x025d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ba:
            X.0eS.A00(r21)
            java.lang.Object r0 = r15.A03
            X.Jh0 r0 = (X.C60181Jh0) r0
            X.3ju r2 = r0.A02
            float r1 = r15.A00
            X.Kde r0 = new X.Kde
            r0.<init>(r1)
            r15.A01 = r4
            java.lang.Object r0 = r2.ELH(r0, r15)
            goto L_0x002c
        L_0x00d2:
            int r0 = r15.A01
            r4 = 1
            if (r0 == 0) goto L_0x00de
            if (r0 == r4) goto L_0x025d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00de:
            X.0eS.A00(r21)
            java.lang.Object r0 = r15.A03
            X.JhZ r0 = (X.C60216JhZ) r0
            X.JVe r2 = r0.A03
            float r1 = r15.A00
            X.Kbd r0 = new X.Kbd
            r0.<init>(r1)
            r15.A01 = r4
            java.lang.Object r0 = r2.A00(r0, r15)
            goto L_0x002c
        L_0x00f6:
            int r0 = r15.A01
            r5 = 1
            if (r0 == 0) goto L_0x0102
            if (r0 == r5) goto L_0x025d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0102:
            X.0eS.A00(r21)
            java.lang.Object r0 = r15.A03
            X.Ji5 r0 = (X.C60248Ji5) r0
            X.JVe r4 = r0.A0B
            float r2 = r0.A00
            float r1 = r15.A00
            X.Kbx r0 = new X.Kbx
            r0.<init>(r2, r1)
            r15.A01 = r5
            java.lang.Object r0 = r4.A00(r0, r15)
            goto L_0x002c
        L_0x011c:
            int r0 = r15.A01
            r1 = 1
            if (r0 == 0) goto L_0x0128
            if (r0 == r1) goto L_0x025d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0128:
            X.0eS.A00(r21)
            java.lang.Object r0 = r15.A03
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r0
            X.83R r0 = r0.A0P
            float r6 = r15.A00
            r15.A01 = r1
            X.83I r4 = r0.A02
            X.836 r0 = r4.A03
            X.0Ud r0 = r0.A03
            java.lang.Object r5 = r0.getValue()
            X.831 r5 = (X.AnonymousClass831) r5
            java.util.ArrayList r0 = r5.A05()
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x014d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x018e
            java.lang.Object r0 = r8.next()
            X.51N r0 = (X.AnonymousClass51N) r0
            X.51N r1 = r0.A06()
            boolean r0 = r1 instanceof X.AnonymousClass51M
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            if (r0 == 0) goto L_0x017b
            r7 = r1
            X.51M r7 = (X.AnonymousClass51M) r7
            float r11 = r11 / r6
            r10 = 3
            X.9Hy r9 = new X.9Hy
            r13 = r12
            r14 = r12
            r9.<init>(r10, r11, r12, r13, r14)
            r7.A0A = r9
            r0 = 0
            r7.A0L = r0
            r7.A0M = r0
        L_0x0177:
            r2.add(r1)
            goto L_0x014d
        L_0x017b:
            boolean r0 = r1 instanceof X.KN4
            if (r0 == 0) goto L_0x0177
            r0 = r1
            X.KN4 r0 = (X.KN4) r0
            float r11 = r11 / r6
            r10 = 3
            X.9Hy r9 = new X.9Hy
            r13 = r12
            r14 = r12
            r9.<init>(r10, r11, r12, r13, r14)
            r0.A01 = r9
            goto L_0x0177
        L_0x018e:
            boolean r0 = r5.A03
            X.831 r1 = new X.831
            r1.<init>(r2, r0)
            X.0V2 r0 = r4.A05
            java.lang.Object r0 = r0.emit(r1, r15)
        L_0x019b:
            if (r0 == r3) goto L_0x002e
            X.0gF r0 = X.C60340gF.A00
            goto L_0x002c
        L_0x01a1:
            int r0 = r15.A01
            r5 = 1
            if (r0 == 0) goto L_0x01ad
            if (r0 == r5) goto L_0x025d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01ad:
            X.0eS.A00(r21)
            java.lang.Object r4 = r15.A03
            X.GQw r4 = (X.C52397GQw) r4
            float r17 = X.C52397GQw.A00(r4)
            float r2 = r15.A00
            X.GQC r14 = r4.A02
            r1 = 14
            X.J6u r0 = new X.J6u
            r0.<init>(r4, r1)
            r15.A01 = r5
            r19 = 0
            r18 = r2
            r16 = r0
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A03(r14, r15, r16, r17, r18, r19)
            goto L_0x002c
        L_0x01d1:
            int r0 = r15.A01
            r2 = 1
            if (r0 == 0) goto L_0x01dd
            if (r0 == r2) goto L_0x025d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01dd:
            X.0eS.A00(r21)
            java.lang.Object r0 = r15.A03
            X.5WM r0 = (X.AnonymousClass5WM) r0
            X.5b4 r1 = r0.A03
            float r0 = r15.A00
            java.lang.Float r0 = X.C51965G9l.A0q(r0)
            r15.A01 = r2
            java.lang.Object r0 = r1.A05(r0, r15)
            goto L_0x002c
        L_0x01f4:
            int r0 = r15.A01
            r4 = 1
            if (r0 == 0) goto L_0x0200
            if (r0 == r4) goto L_0x025d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0200:
            X.0eS.A00(r21)
            java.lang.Object r2 = r15.A03
            X.5b4 r2 = (X.AnonymousClass5b4) r2
            float r0 = r15.A00
            java.lang.Float r1 = X.C51965G9l.A0q(r0)
            X.5b9 r0 = X.C55386Hgs.A01
            r15.A01 = r4
            java.lang.Object r0 = X.JTQ.A0V(r2, r0, r1, r15)
            goto L_0x002c
        L_0x0217:
            int r0 = r15.A01
            r4 = 1
            if (r0 == 0) goto L_0x0223
            if (r0 == r4) goto L_0x025d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0223:
            X.0eS.A00(r21)
            java.lang.Object r0 = r15.A03
            X.I4B r0 = (X.I4B) r0
            X.5b4 r2 = r0.A01
            float r0 = r15.A00
            java.lang.Float r1 = X.C51965G9l.A0q(r0)
            r15.A01 = r4
            X.5b7 r0 = r2.A06
            java.lang.Object r0 = X.JTQ.A0V(r2, r0, r1, r15)
            goto L_0x002c
        L_0x023c:
            int r0 = r15.A01
            r2 = 1
            if (r0 == 0) goto L_0x0248
            if (r0 == r2) goto L_0x025d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0248:
            X.0eS.A00(r21)
            java.lang.Object r1 = r15.A03
            X.5b4 r1 = (X.AnonymousClass5b4) r1
            float r0 = r15.A00
            java.lang.Float r0 = X.C51965G9l.A0q(r0)
            r15.A01 = r2
            java.lang.Object r0 = r1.A05(r0, r15)
            goto L_0x002c
        L_0x025d:
            X.0eS.A00(r21)
        L_0x0260:
            X.0gF r3 = X.C60340gF.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59714JUx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59714JUx(SwipeableState swipeableState, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A02 = 15;
        this.A03 = swipeableState;
    }
}
