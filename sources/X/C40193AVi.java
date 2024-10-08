package X;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Handler;

/* renamed from: X.AVi  reason: case insensitive filesystem */
public final class C40193AVi implements B2V {
    public C344777sP A00 = null;
    public C11354SOn A01 = null;
    public final Context A02;
    public final AD3 A03;
    public final C344407ro A04 = C344407ro.A01;
    public final C312136ds A05;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x008f A[LOOP:1: B:12:0x0089->B:14:0x008f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AJ5(X.C11354SOn r21, com.facebook.videolite.transcoder.base.composition.MediaComposition r22, X.C41828B2j r23, X.C7334Q4k r24, java.util.Map r25, int r26, int r27, int r28, int r29) {
        /*
            r20 = this;
            r6 = r20
            r4 = r21
            r6.A01 = r4
            X.7rv r12 = r23.BQ7()
            X.7sH r9 = r12.BQ8()
            X.4aE r7 = X.C266714aE.VIDEO
            r8 = r22
            java.util.HashMap r11 = r8.A07(r7)
            r11.getClass()
            r3 = 1
            java.util.Iterator r10 = X.AnonymousClass7TF.A0s(r11)
        L_0x001e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0046
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r10)
            java.lang.Object r0 = r0.getKey()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            X.7uv r5 = r9.BHM(r0)
            X.7uu r5 = (X.C346277uu) r5
            r0 = 0
            r5.A07 = r0
            int r2 = r4.A0C
            int r1 = r4.A0A
            X.800 r0 = new X.800
            r0.<init>(r3)
            r5.A00(r0, r2, r1)
            goto L_0x001e
        L_0x0046:
            X.7ro r5 = r6.A04
            java.util.HashMap r1 = r8.A00
            java.lang.Object r0 = r1.get(r7)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a9
            X.ATg r2 = new X.ATg
            r2.<init>(r5)
            java.lang.Object r0 = r1.get(r7)
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r1 = r1.get(r7)
            java.util.List r1 = (java.util.List) r1
            android.content.Context r13 = r6.A02
            X.6ds r0 = r6.A05
            X.7rD r15 = r0.B46()
            r15.getClass()
            r17 = r24
            r14 = r12
            r18 = r1
            r19 = r3
            r16 = r2
            X.C393199w3.A00(r13, r14, r15, r16, r17, r18, r19)
            r6.A00 = r2
        L_0x0082:
            r12.Ed1(r2)
            java.util.Iterator r1 = X.AnonymousClass7TF.A0s(r11)
        L_0x0089:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00af
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r1)
            java.lang.Object r0 = r0.getKey()
            int r13 = X.AnonymousClass7TE.A0M(r0)
            int r14 = r4.A0C
            int r15 = r4.A0A
            r16 = 0
            r17 = r14
            r18 = r15
            r12.FLA(r13, r14, r15, r16, r17, r18)
            goto L_0x0089
        L_0x00a9:
            X.8oz r2 = new X.8oz
            r2.<init>(r5)
            goto L_0x0082
        L_0x00af:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40193AVi.AJ5(X.SOn, com.facebook.videolite.transcoder.base.composition.MediaComposition, X.B2j, X.Q4k, java.util.Map, int, int, int, int):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.7r0, java.lang.Object] */
    public final C41828B2j AMn(EGLContext eGLContext, Handler handler, C344497rx r13, C344557s3 r14, C11354SOn sOn, C7334Q4k q4k, Object obj) {
        C343967r6 r3;
        if (sOn.A09 == 7) {
            q4k.A0G();
        }
        C344407ro r6 = this.A04;
        Context context = this.A02;
        AD3 ad3 = this.A03;
        boolean z = ad3.A02;
        C344037rD B46 = this.A05.B46();
        C343967r6 r32 = ad3.A01;
        Object obj2 = obj;
        C344587s6 r2 = new C344587s6(obj2, 3);
        int i = 1;
        if (r14 != null) {
            int Apq = r14.Apq();
            if ((Apq & 256) != 0) {
                i = 257;
            }
            if ((Apq & 32) != 0) {
                i = C392929vc.A00(r14, i | 32);
                if ((Apq & 8192) != 0) {
                    i |= 8192;
                }
            }
            r2.A0A(r14, i);
        } else {
            0qQ.A0A(eGLContext);
            r2.A09(eGLContext, 1);
        }
        C343647qZ r1 = new C343647qZ("LiteVideoProcessor");
        C343647qZ.A00(r1, C343737qi.A08, z);
        r1.A02(C343737qi.A0I, handler);
        C343647qZ.A01(r1, r13, r2, obj2);
        r1.A02(C343737qi.A00, r6);
        ATD A002 = C343897qz.A00(context, r1);
        A002.A02(new C382399dd(A002, B46));
        if (r32 != null) {
            ((C343907r0) r32).A00 = A002;
            r3 = r32;
        } else {
            ? obj3 = new Object();
            obj3.A00 = A002;
            r3 = obj3;
        }
        A002.A02(r3);
        A002.A01(new C344457rt(A002), C344477rv.A01);
        return new C40198AVn(A002);
    }

    public final C344777sP Blt() {
        return this.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.6ds} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.6ds} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: X.6ds} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40193AVi(android.content.Context r2, X.AD3 r3) {
        /*
            r1 = this;
            r1.<init>()
            X.7ro r0 = X.C344407ro.A01
            r1.A04 = r0
            r0 = 0
            r1.A00 = r0
            r1.A01 = r0
            r1.A02 = r2
            r1.A03 = r3
            X.6ds r0 = r3.A00
            if (r0 != 0) goto L_0x0019
            X.ATV r0 = new X.ATV
            r0.<init>()
        L_0x0019:
            r1.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40193AVi.<init>(android.content.Context, X.AD3):void");
    }
}
