package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GaY  reason: case insensitive filesystem */
public final class C52660GaY extends C251343mx {
    public final C52644GaI A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C52654GaS A03;
    public final JT5 A04;
    public final HashMap A05;
    public final HashMap A06;
    public final boolean A07;

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.JQo] */
    /* JADX WARNING: type inference failed for: r0v29, types: [java.lang.Object, X.JQo] */
    public final C251263mp A0X(AnonymousClass3Y5 r28) {
        float f;
        C61083JwL jwL;
        C61083JwL jwL2;
        C61083JwL jwL3;
        AnonymousClass3Y5 r9 = r28;
        0qQ.A0B(r9, 0);
        if (this.A07) {
            f = (float) C226122ff.A01();
        } else {
            f = 0.0f;
        }
        C52644GaI gaI = this.A00;
        JNI jni = gaI.A08;
        ArrayList arrayList = null;
        if (jni instanceof C53600GrF) {
            GL6 A002 = A00(gaI.A06, true);
            if (A002 != null) {
                jwL3 = new C61083JwL(((C53600GrF) jni).A00, (C62320sa) A002);
            } else {
                jwL3 = null;
            }
            C57671Iea iea = new C57671Iea(jwL3, (C61083JwL) null, new Object());
            AnonymousClass0iw r12 = this.A01;
            UserSession userSession = this.A02;
            C52654GaS gaS = this.A03;
            C53600GrF grF = (C53600GrF) jni;
            GZ4 gz4 = new GZ4((2WX) null, r12, gaI.A05);
            HashMap hashMap = this.A05;
            HashMap hashMap2 = this.A06;
            List<JNG> list = grF.A01;
            ArrayList A0p = AnonymousClass7TF.A0p(list);
            for (JNG A003 : list) {
                A0p.add(A00(A003, true));
            }
            return new C53870Gvb(r12, userSession, iea, gaS, gz4, gaI, grF, gaI.A02.A00, hashMap, hashMap2, A0p, f);
        }
        int i = 0;
        if (jni instanceof C53601GrG) {
            AnonymousClass0iw r122 = this.A01;
            UserSession userSession2 = this.A02;
            boolean A1V = AnonymousClass7TF.A1V(gaI.A00);
            C53601GrG grG = (C53601GrG) jni;
            C52654GaS gaS2 = this.A03;
            HashMap hashMap3 = this.A05;
            HashMap hashMap4 = this.A06;
            List list2 = grG.A07;
            ArrayList A0p2 = AnonymousClass7TF.A0p(list2);
            Iterator it = list2.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        break;
                    }
                    A0p2.add(A00((JNG) next, true));
                    i2 = i3;
                } else {
                    List list3 = grG.A08;
                    if (list3 != null) {
                        arrayList = AnonymousClass7TF.A0p(list3);
                        for (Object next2 : list3) {
                            int i4 = i + 1;
                            if (i >= 0) {
                                arrayList.add(A00((JNG) next2, true));
                                i = i4;
                            }
                        }
                    }
                    return new C53871Gvc(r122, userSession2, gaS2, grG, this.A04, gaI.A02.A00, hashMap3, hashMap4, A0p2, arrayList, f, A1V);
                }
            }
            0sr.A1T();
            throw AnonymousClass00P.createAndThrow();
        } else if (jni instanceof C53599GrE) {
            GL6 A004 = A00(gaI.A06, true);
            JNG jng = gaI.A07;
            GL6 A005 = A00(jng, false);
            if (A004 != null) {
                jwL = new C61083JwL(((C53599GrE) jni).A01, (C62320sa) A004);
            } else {
                jwL = null;
            }
            if (A005 != null) {
                C266444Yx r1 = ((C53599GrE) jni).A00;
                if (r1 == null || (jng instanceof C52678Gaq)) {
                    jwL2 = new C61083JwL((C266444Yx) null, (C62320sa) A005);
                } else {
                    jwL2 = new C61083JwL(C51968G9o.A11(C51967G9n.A09(r9), r1), (C62320sa) A005);
                }
            } else {
                jwL2 = null;
            }
            return new C53826Gut(this.A01, this.A02, new C57671Iea(jwL, jwL2, new Object()), this.A03, gaI, this.A06, this.A05);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.G2n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.Iw3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.Iw1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.Phm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.IoR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.IoB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.IoB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: X.IoB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.IoB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.IoB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: X.IoB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.IoB} */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.GL6 A00(X.JNG r18, boolean r19) {
        /*
            r17 = this;
            r4 = r18
            boolean r0 = r4 instanceof X.C52658GaW
            r10 = r17
            if (r0 == 0) goto L_0x0031
            X.GaW r4 = (X.C52658GaW) r4
            X.1Xj r6 = r4.A03
            X.28D r9 = r4.A00
            X.46i r5 = r4.A02
            X.GaS r8 = r10.A03
            com.instagram.api.schemas.ClipsCameraCommandAction r7 = r4.A01
            r4 = 11
            X.IoR r3 = new X.IoR
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x001b:
            com.instagram.common.session.UserSession r12 = r10.A02
            X.GaI r0 = r10.A00
            com.instagram.api.schemas.InstagramMidcardType r11 = r0.A02
            com.instagram.api.schemas.ClipsMidCardSubtype r13 = r0.A01
            X.AnonymousClass7TG.A1T(r12, r11, r13)
            r10 = 5
            X.GL6 r9 = new X.GL6
            r16 = r19
            r14 = r3
            r15 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        L_0x0031:
            boolean r0 = r4 instanceof X.C53597GrC
            if (r0 == 0) goto L_0x0045
            X.GaS r8 = r10.A03
            X.GrC r4 = (X.C53597GrC) r4
            X.28D r2 = r4.A00
            java.lang.String r1 = r4.A01
            r0 = 44
            X.Phm r3 = new X.Phm
            r3.<init>(r8, r2, r1, r0)
            goto L_0x001b
        L_0x0045:
            r7 = 0
            boolean r6 = r4 instanceof X.C53598GrD
            if (r6 == 0) goto L_0x005c
            r1 = r4
            X.GrD r1 = (X.C53598GrD) r1
            int r0 = r1.A00
            if (r0 != r7) goto L_0x005c
            X.GaS r8 = r10.A03
            java.lang.Object r1 = r1.A01
            r0 = 35
        L_0x0057:
            X.Iw1 r3 = X.C58692Iw1.A00(r8, r1, r0)
            goto L_0x001b
        L_0x005c:
            boolean r0 = X.C52648GaM.A00(r7, r4)
            if (r0 == 0) goto L_0x0077
            X.GaS r8 = r10.A03
            X.GaM r4 = (X.C52648GaM) r4
            java.lang.Object r1 = r4.A02
            java.lang.Object r0 = r4.A01
            r12 = 6
            X.IoB r3 = new X.IoB
            r11 = r3
            r13 = r8
            r14 = r10
            r15 = r0
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x001b
        L_0x0077:
            r5 = 2
            boolean r0 = X.C52648GaM.A00(r5, r4)
            if (r0 == 0) goto L_0x0094
            X.GaS r8 = r10.A03
            X.GaM r4 = (X.C52648GaM) r4
            java.lang.Object r1 = r4.A01
            java.lang.Object r0 = r4.A02
            r12 = 8
        L_0x0088:
            X.IoB r3 = new X.IoB
            r11 = r3
            r13 = r8
            r14 = r10
            r15 = r1
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x001b
        L_0x0094:
            r3 = 1
            boolean r0 = X.C52648GaM.A00(r3, r4)
            if (r0 == 0) goto L_0x00a5
            X.GaS r8 = r10.A03
            X.GaM r4 = (X.C52648GaM) r4
            java.lang.Object r1 = r4.A03
            java.lang.Object r0 = r4.A01
            r12 = 7
            goto L_0x0088
        L_0x00a5:
            boolean r2 = r4 instanceof X.C53596GrB
            if (r2 == 0) goto L_0x00bd
            r1 = r4
            X.GrB r1 = (X.C53596GrB) r1
            int r0 = r1.A00
            if (r0 != r7) goto L_0x00bd
            X.GaS r8 = r10.A03
            java.lang.String r1 = r1.A02
            r0 = 34
        L_0x00b6:
            X.Iw3 r3 = new X.Iw3
            r3.<init>(r1, r8, r0)
            goto L_0x001b
        L_0x00bd:
            if (r6 == 0) goto L_0x00cd
            r1 = r4
            X.GrD r1 = (X.C53598GrD) r1
            int r0 = r1.A00
            if (r0 != r3) goto L_0x00cd
            X.GaS r8 = r10.A03
            java.lang.Object r1 = r1.A01
            r0 = 36
            goto L_0x0057
        L_0x00cd:
            if (r2 == 0) goto L_0x00e6
            r1 = r4
            X.GrB r1 = (X.C53596GrB) r1
            int r0 = r1.A00
            if (r0 != r5) goto L_0x00dd
            X.GaS r8 = r10.A03
            java.lang.String r1 = r1.A02
            r0 = 36
            goto L_0x00b6
        L_0x00dd:
            if (r0 != r3) goto L_0x00e6
            X.GaS r8 = r10.A03
            java.lang.String r1 = r1.A02
            r0 = 35
            goto L_0x00b6
        L_0x00e6:
            boolean r0 = r4 instanceof X.C53595GrA
            if (r0 == 0) goto L_0x00fa
            X.GaS r8 = r10.A03
            X.GrA r4 = (X.C53595GrA) r4
            java.lang.String r2 = r4.A00
            r1 = 0
            r0 = 48
            X.G2n r3 = new X.G2n
            r3.<init>((java.lang.Object) r8, (java.lang.String) r1, (java.lang.String) r2, (int) r0)
            goto L_0x001b
        L_0x00fa:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52660GaY.A00(X.JNG, boolean):X.GL6");
    }

    public C52660GaY(AnonymousClass0iw r1, UserSession userSession, C52644GaI gaI, C52654GaS gaS, JT5 jt5, HashMap hashMap, HashMap hashMap2, boolean z) {
        AnonymousClass7TG.A1S(hashMap, hashMap2);
        this.A01 = r1;
        this.A02 = userSession;
        this.A00 = gaI;
        this.A03 = gaS;
        this.A05 = hashMap;
        this.A06 = hashMap2;
        this.A07 = z;
        this.A04 = jt5;
    }
}
