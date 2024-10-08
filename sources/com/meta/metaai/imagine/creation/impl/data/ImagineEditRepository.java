package com.meta.metaai.imagine.creation.impl.data;

import X.02z;
import X.05G;
import X.0eO;
import X.AnonymousClass0Ud;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C54726HQf;
import X.C56146HtY;
import X.C56548I1c;
import X.C56559I1n;
import X.C58546Itf;
import X.DbS;
import X.DbX;
import X.GVF;
import X.HMY;
import X.I25;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import java.util.List;

public final class ImagineEditRepository {
    public final I25 A00;
    public final HMY A01;
    public final ImagineNetworkService A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, C58546Itf.A00);
    public final C262224Cq A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final boolean A07;
    public final boolean A08;

    public final void A04(C56559I1n i1n) {
        A03();
        05G r3 = this.A05;
        List list = ((C56548I1c) r3.getValue()).A01;
        int i = ((C56548I1c) r3.getValue()).A00 + 1;
        if (i != list.size()) {
            list = list.subList(0, i);
        }
        list.add(i1n);
        r3.getValue();
        r3.Epw(new C56548I1c(list, i));
    }

    public static final C56559I1n A00(ImagineEditRepository imagineEditRepository) {
        05G r1 = imagineEditRepository.A05;
        List list = ((C56548I1c) r1.getValue()).A01;
        int i = ((C56548I1c) r1.getValue()).A00;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return (C56559I1n) list.get(i);
    }

    public static final void A01(ImagineEditRepository imagineEditRepository, C54726HQf hQf) {
        C54726HQf hQf2 = hQf;
        imagineEditRepository.A00.A03(DbX.A0t(hQf));
        C56559I1n A002 = A00(imagineEditRepository);
        if (A002 != null) {
            imagineEditRepository.A04(new C56559I1n(hQf2, A002.A01, (C56146HtY) null, (String) null, false));
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r32, X.AnonymousClass4D7 r33) {
        /*
            r31 = this;
            r4 = 33
            r5 = r33
            boolean r0 = X.C66139MDr.A01(r4, r5)
            r6 = r31
            if (r0 == 0) goto L_0x00b0
            r3 = r5
            X.MDr r3 = (X.C66139MDr) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b0
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r14 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x009c
            if (r0 != r1) goto L_0x00b7
            java.lang.Object r12 = r3.A01
            com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository r12 = (com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository) r12
            X.0eS.A00(r14)
        L_0x002c:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x0099
            X.I1n r13 = A00(r12)
            if (r13 == 0) goto L_0x0099
            X.HtY r0 = r13.A01
            if (r0 == 0) goto L_0x0099
            java.lang.String r15 = r0.A0A
            java.lang.String r11 = r0.A05
            java.lang.String r10 = r0.A03
            java.lang.String r9 = r0.A06
            java.lang.String r8 = r0.A08
            java.lang.String r7 = r0.A07
            java.lang.Integer r6 = r0.A02
            X.0eP r5 = r0.A0C
            java.lang.Integer r4 = r0.A01
            java.lang.String r3 = r0.A09
            java.lang.String r2 = r0.A0B
            X.Hst r1 = r0.A00
            boolean r0 = r0.A0D
            X.HtY r16 = new X.HtY
            r29 = r5
            r30 = r0
            r27 = r3
            r28 = r2
            r26 = r7
            r25 = r8
            r24 = r9
            r23 = r10
            r22 = r11
            r21 = r14
            r20 = r15
            r19 = r4
            r18 = r6
            r17 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r2 = r13.A04
            java.lang.String r1 = r13.A03
            X.HtY r0 = r13.A02
            X.HQf r5 = r13.A00
            X.I1n r4 = new X.I1n
            r6 = r16
            r7 = r0
            r8 = r1
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            X.05G r3 = r12.A05
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r1 = -1
            X.I1c r0 = new X.I1c
            r0.<init>(r2, r1)
            r3.Epw(r0)
            r12.A04(r4)
        L_0x0099:
            X.0gF r2 = X.C60340gF.A00
        L_0x009b:
            return r2
        L_0x009c:
            X.0eS.A00(r14)
            com.meta.metaai.imagine.service.ImagineNetworkService r0 = r6.A02
            r3.A01 = r6
            r3.A00 = r1
            r1 = r32
            java.lang.Object r14 = r0.A07(r1, r3)
            if (r14 == r2) goto L_0x009b
            r12 = r6
            goto L_0x002c
        L_0x00b0:
            X.MDr r3 = new X.MDr
            r3.<init>(r6, r5, r4)
            goto L_0x001a
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository.A02(java.lang.String, X.4D7):java.lang.Object");
    }

    public final void A03() {
        05G r3 = this.A05;
        int i = ((C56548I1c) r3.getValue()).A00;
        if (i > 0) {
            List list = ((C56548I1c) r3.getValue()).A01;
            if (((C56559I1n) list.get(i)).A00 != null) {
                list.remove(i);
                r3.getValue();
                r3.Epw(new C56548I1c(list, i - 1));
            }
        }
    }

    public ImagineEditRepository(I25 i25, HMY hmy, ImagineNetworkService imagineNetworkService, C262224Cq r7, boolean z, boolean z2) {
        C56548I1c i1c;
        this.A02 = imagineNetworkService;
        this.A04 = r7;
        this.A01 = hmy;
        this.A00 = i25;
        this.A07 = z;
        this.A08 = z2;
        02z A10 = DbS.A10(new C56548I1c(AnonymousClass7TE.A1C(), -1));
        this.A05 = A10;
        this.A06 = A10;
        if (this.A08 && (i1c = ((GVF) this.A03.getValue()).A00) != null) {
            this.A05.Epw(i1c);
        }
    }
}
