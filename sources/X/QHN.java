package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class QHN extends TA3 implements Cloneable {
    public static final QHM A0D = ((QHM) new TA3().A0E(C10112Rmo.A01).A07(RE3.LOW).A03());
    public QHN A00;
    public TA2 A01;
    public Object A02;
    public List A03;
    public boolean A04 = true;
    public boolean A05;
    public QHN A06;
    public boolean A07;
    public final Context A08;
    public final Q6I A09;
    public final Sk4 A0A;
    public final Class A0B;
    public final SUv A0C;

    public static void A02(QHN qhn, TA3 ta3, C13918TlK tlK, Executor executor) {
        C13918TlK tlK2 = tlK;
        C9217RTu.A00(tlK);
        QHN qhn2 = qhn;
        if (qhn.A07) {
            Object A0p = Pxe.A0p();
            TA3 ta32 = ta3;
            C13837TiC A012 = qhn2.A01(ta3.A0B, qhn.A01, ta32, (C13832Ti5) null, tlK2, A0p, executor, ta3.A05, ta32.A04);
            C13837TiC Bn5 = tlK2.Bn5();
            if (!A012.CSm(Bn5) || (!ta32.A0I && Bn5.isComplete())) {
                Sk4 sk4 = qhn2.A0A;
                sk4.A00(tlK2);
                tlK2.Eig(A012);
                synchronized (sk4) {
                    sk4.A07.A00.add(tlK2);
                    C10925S1d s1d = sk4.A06;
                    s1d.A02.add(A012);
                    if (!s1d.A00) {
                        A012.ADE();
                    } else {
                        A012.clear();
                        Log.isLoggable("RequestTracker", 2);
                        s1d.A01.add(A012);
                    }
                }
                return;
            }
            C9217RTu.A00(Bn5);
            if (!Bn5.isRunning()) {
                Bn5.ADE();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0w("You must call #load() before calling #into()");
    }

    public static QHN A00(QHN qhn, Object obj) {
        if (qhn.A0H) {
            return A00(qhn.clone(), obj);
        }
        qhn.A02 = obj;
        qhn.A07 = true;
        qhn.A0G();
        return qhn;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.Sk9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.SkB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: X.SkA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: X.Sk9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.Sk9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C13837TiC A01(X.RE3 r44, X.TA2 r45, X.TA3 r46, X.C13832Ti5 r47, X.C13918TlK r48, java.lang.Object r49, java.util.concurrent.Executor r50, int r51, int r52) {
        /*
            r43 = this;
            r4 = r43
            r14 = r47
            X.QHN r0 = r4.A06
            r7 = r49
            if (r0 == 0) goto L_0x0105
            X.SkA r6 = new X.SkA
            r6.<init>(r14, r7)
            r14 = r6
        L_0x0010:
            X.QHN r2 = r4.A00
            r16 = r44
            r13 = r45
            r8 = r46
            r20 = r48
            r26 = r50
            r10 = r51
            r9 = r52
            if (r2 == 0) goto L_0x00d1
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x0139
            X.TA2 r0 = r2.A01
            r30 = r0
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0030
            r30 = r13
        L_0x0030:
            int r0 = r2.A03
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00a2
            X.RE3 r1 = r2.A0B
        L_0x0038:
            int r3 = r2.A05
            int r2 = r2.A04
            boolean r0 = X.C11424STg.A05(r10, r9)
            if (r0 == 0) goto L_0x004c
            boolean r0 = X.C11424STg.A05(r3, r2)
            if (r0 != 0) goto L_0x004c
            int r3 = r8.A05
            int r2 = r8.A04
        L_0x004c:
            X.SkB r5 = new X.SkB
            r5.<init>(r14, r7)
            android.content.Context r0 = r4.A08
            r29 = r0
            X.Q6I r14 = r4.A09
            java.lang.Object r0 = r4.A02
            r17 = r0
            java.lang.Class r15 = r4.A0B
            java.util.List r12 = r4.A03
            X.SOI r0 = r14.A03
            X.TcD r13 = r13.A00
            X.Sk9 r11 = new X.Sk9
            r27 = r10
            r28 = r9
            r19 = r5
            r21 = r13
            r22 = r15
            r23 = r7
            r24 = r17
            r25 = r12
            r15 = r14
            r17 = r0
            r18 = r8
            r13 = r11
            r14 = r29
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = 1
            r4.A05 = r0
            X.QHN r0 = r4.A00
            r15 = r0
            r16 = r1
            r17 = r30
            r18 = r0
            r21 = r7
            r22 = r26
            r23 = r3
            r24 = r2
            X.TiC r1 = r15.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = 0
            r4.A05 = r0
            r5.A05 = r11
            r5.A06 = r1
        L_0x009f:
            if (r6 != 0) goto L_0x0108
            return r5
        L_0x00a2:
            int[] r0 = X.VJO.A00
            int r1 = r16.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x00cd
            r0 = 2
            if (r1 == r0) goto L_0x00c9
            r0 = 1
            if (r1 == r0) goto L_0x00c5
            r0 = 0
            if (r1 == r0) goto L_0x00c5
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "unknown priority: "
            r1.append(r0)
            X.RE3 r0 = r4.A0B
            java.lang.IllegalArgumentException r0 = X.C66582MXn.A0j(r0, r1)
            throw r0
        L_0x00c5:
            X.RE3 r1 = X.RE3.IMMEDIATE
            goto L_0x0038
        L_0x00c9:
            X.RE3 r1 = X.RE3.HIGH
            goto L_0x0038
        L_0x00cd:
            X.RE3 r1 = X.RE3.NORMAL
            goto L_0x0038
        L_0x00d1:
            android.content.Context r15 = r4.A08
            X.Q6I r12 = r4.A09
            java.lang.Object r11 = r4.A02
            java.lang.Class r3 = r4.A0B
            java.util.List r2 = r4.A03
            X.SOI r1 = r12.A03
            X.TcD r0 = r13.A00
            X.Sk9 r5 = new X.Sk9
            r27 = r5
            r28 = r15
            r29 = r12
            r30 = r16
            r31 = r1
            r32 = r8
            r33 = r14
            r34 = r20
            r35 = r0
            r36 = r3
            r37 = r7
            r38 = r11
            r39 = r2
            r40 = r26
            r41 = r10
            r42 = r9
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            goto L_0x009f
        L_0x0105:
            r6 = 0
            goto L_0x0010
        L_0x0108:
            X.QHN r4 = r4.A06
            int r2 = r4.A05
            int r3 = r4.A04
            boolean r0 = X.C11424STg.A05(r10, r9)
            if (r0 == 0) goto L_0x011e
            boolean r0 = X.C11424STg.A05(r2, r3)
            if (r0 != 0) goto L_0x011e
            int r2 = r8.A05
            int r3 = r8.A04
        L_0x011e:
            X.TA2 r1 = r4.A01
            X.RE3 r0 = r4.A0B
            r8 = r4
            r9 = r0
            r10 = r1
            r11 = r4
            r12 = r6
            r13 = r20
            r14 = r7
            r15 = r26
            r16 = r2
            r17 = r3
            X.TiC r0 = r8.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r6.A05 = r5
            r6.A04 = r0
            return r6
        L_0x0139:
            java.lang.String r0 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QHN.A01(X.RE3, X.TA2, X.TA3, X.Ti5, X.TlK, java.lang.Object, java.util.concurrent.Executor, int, int):X.TiC");
    }

    public final QHN A0J() {
        if (this.A0H) {
            return clone().A0J();
        }
        A0G();
        return this;
    }

    public final QHN A0L(TA2 ta2) {
        if (this.A0H) {
            return clone().A0L(ta2);
        }
        C9217RTu.A00(ta2);
        this.A01 = ta2;
        this.A04 = false;
        A0G();
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof QHN)) {
            return false;
        }
        QHN qhn = (QHN) obj;
        if (!super.equals(qhn) || !2Ob.A00(this.A0B, qhn.A0B) || !this.A01.equals(qhn.A01) || !2Ob.A00(this.A02, qhn.A02) || !2Ob.A00(this.A03, qhn.A03) || !2Ob.A00(this.A00, qhn.A00) || !2Ob.A00(this.A06, qhn.A06) || this.A04 != qhn.A04 || this.A07 != qhn.A07) {
            return false;
        }
        return true;
    }

    public QHN(Context context, SUv sUv, Sk4 sk4, Class cls) {
        QHM qhm;
        this.A0C = sUv;
        this.A0A = sk4;
        this.A0B = cls;
        this.A08 = context;
        Map map = sk4.A02.A00.A07;
        TA2 ta2 = (TA2) map.get(cls);
        if (ta2 == null) {
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                if (((Class) A1J.getKey()).isAssignableFrom(cls)) {
                    ta2 = (TA2) A1J.getValue();
                }
            }
            if (ta2 == null) {
                ta2 = Q6I.A0A;
            }
        }
        this.A01 = ta2;
        this.A09 = sUv.A00;
        Iterator it = sk4.A09.iterator();
        while (it.hasNext()) {
            it.next();
            A0J();
        }
        synchronized (sk4) {
            qhm = sk4.A00;
        }
        A0I(qhm);
    }

    /* renamed from: A0K */
    public final QHN clone() {
        QHN qhn = (QHN) super.clone();
        qhn.A01 = qhn.A01.clone();
        List list = qhn.A03;
        if (list != null) {
            qhn.A03 = AnonymousClass7TE.A1D(list);
        }
        QHN qhn2 = qhn.A00;
        if (qhn2 != null) {
            qhn.A00 = qhn2.clone();
        }
        QHN qhn3 = qhn.A06;
        if (qhn3 != null) {
            qhn.A06 = qhn3.clone();
        }
        return qhn;
    }

    /* renamed from: A0M */
    public final QHN A0I(TA3 ta3) {
        C9217RTu.A00(ta3);
        return (QHN) super.A0I(ta3);
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.TlI, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v16, types: [X.TlI, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v18, types: [X.TlI, java.lang.Object] */
    public final void A0N(ImageView imageView) {
        TA3 ta3;
        QHO qho;
        C11424STg.A04();
        C9217RTu.A00(imageView);
        if ((this.A03 & C249703kE.FLAG_MOVED) == 0 && this.A0L && imageView.getScaleType() != null) {
            switch (Pxe.A08(imageView.getScaleType(), VJO.A00)) {
                case 1:
                    ta3 = clone().A0A(new Object(), C10977S3l.A02);
                    break;
                case 2:
                case 6:
                    ta3 = clone().A0A(new Object(), C10977S3l.A01);
                    ta3.A0K = true;
                    break;
                case 3:
                case 4:
                case 5:
                    ta3 = clone().A0A(new Object(), C10977S3l.A04);
                    ta3.A0K = true;
                    break;
            }
        }
        ta3 = this;
        Class cls = this.A0B;
        if (Bitmap.class.equals(cls)) {
            qho = new QHO(imageView);
        } else if (Drawable.class.isAssignableFrom(cls)) {
            qho = new QHO(imageView);
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Unhandled class: ");
            A1A.append(cls);
            throw Pxg.A0d(", try .as*(Class).transcode(ResourceTranscoder)", A1A);
        }
        A02(this, ta3, qho, C10061Rly.A01);
    }

    public final int hashCode() {
        int hashCode = (((((((((super.hashCode() * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00);
        return (((((hashCode * 31) + AnonymousClass7TG.A0C(this.A06)) * 31 * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0);
    }
}
