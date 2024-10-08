package com.meta.metaai.imagine.creation.impl.data;

import X.00k;
import X.02z;
import X.05G;
import X.0eO;
import X.106;
import X.10b;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass7TE;
import X.C262204Co;
import X.C262224Cq;
import X.C51967G9n;
import X.C56123HtB;
import X.C56146HtY;
import X.C56556I1k;
import X.C57571Icy;
import X.C58547Itg;
import X.GVF;
import X.HMY;
import X.I25;
import X.I87;
import X.J59;
import android.app.Application;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService;
import java.util.ArrayList;
import java.util.List;

public final class ImagineGenerationImageRepository {
    public boolean A00;
    public C262204Co A01;
    public final Application A02;
    public final I25 A03;
    public final I87 A04;
    public final HMY A05;
    public final ImagineNetworkService A06;
    public final Integer A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A00(0eO.A02, C58547Itg.A00);
    public final 05G A0C;
    public final 05G A0D;
    public final AnonymousClass0Ud A0E;
    public final AnonymousClass0Ud A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final MetaAIFeedbackNetworkService A0I;
    public final C262224Cq A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0.isActive() != true) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C56556I1k r18, java.lang.String r19, java.lang.String r20, X.0sP r21, int r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28) {
        /*
            r17 = this;
            r6 = 0
            r8 = r17
            X.4Co r0 = r8.A01
            r7 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isActive()
            r1 = 1
            if (r0 == r2) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            r0 = 0
            if (r1 == 0) goto L_0x002e
            X.I25 r1 = r8.A03
            com.facebook.quicklog.QuickPerformanceLogger r3 = r1.A00
            r2 = 4
            if (r3 == 0) goto L_0x0027
            r1 = 325715894(0x136a07b6, float:2.9538754E-27)
            r3.markerEnd(r1, r2)
            r1 = 325725822(0x136a2e7e, float:2.9557875E-27)
            r3.markerEnd(r1, r2)
        L_0x0027:
            X.4Co r1 = r8.A01
            if (r1 == 0) goto L_0x002e
            r1.AG7(r0)
        L_0x002e:
            X.I25 r3 = r8.A03
            com.facebook.quicklog.QuickPerformanceLogger r4 = r3.A00
            if (r4 == 0) goto L_0x003a
            r1 = 325715894(0x136a07b6, float:2.9538754E-27)
            r4.markerStart(r1)
        L_0x003a:
            java.lang.String r2 = "query_begin"
            if (r4 == 0) goto L_0x0044
            r1 = 325715894(0x136a07b6, float:2.9538754E-27)
            r4.markerPoint(r1, r2)
        L_0x0044:
            X.Htc r4 = r3.A01
            X.Nky r1 = r4.A02
            java.lang.String r2 = r1.A00
            java.lang.String r1 = "entry_point"
            r3.A07(r1, r2)
            java.lang.String r1 = "meta_ai_entrypoint"
            r3.A07(r1, r0)
            java.lang.String r2 = r4.A0B
            java.lang.String r1 = "surface_session_id"
            r3.A07(r1, r2)
            java.lang.String r2 = r4.A0A
            java.lang.String r1 = "bottom_sheet_session_id"
            r3.A07(r1, r2)
            java.lang.String r2 = java.lang.String.valueOf(r23)
            java.lang.String r1 = "suggested_prompt"
            r3.A07(r1, r2)
            X.0Ud r1 = r8.A0E
            java.lang.Object r1 = r1.getValue()
            X.HtB r1 = (X.C56123HtB) r1
            if (r1 == 0) goto L_0x0077
            java.lang.String r0 = r1.A01
        L_0x0077:
            r9 = r19
            boolean r0 = X.0qQ.A0K(r0, r9)
            if (r0 == 0) goto L_0x00bc
            java.lang.String r1 = "regenerate"
        L_0x0081:
            java.lang.String r0 = "imagine_action"
            r3.A07(r0, r1)
            if (r28 == 0) goto L_0x00b7
            X.05G r0 = r8.A0C
            java.lang.Object r0 = r0.getValue()
            X.HtB r0 = (X.C56123HtB) r0
            if (r0 == 0) goto L_0x00b4
            java.util.List r1 = r0.A02
        L_0x0094:
            java.util.List r0 = X.0sr.A1N(r18)
            java.util.ArrayList r5 = X.00k.A0S(r0, r1)
        L_0x009c:
            X.05G r4 = r8.A0C
            r12 = r22
            java.util.ArrayList r3 = X.DbS.A0v(r12)
        L_0x00a4:
            if (r7 >= r12) goto L_0x00bf
            r2 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.I1k r0 = new X.I1k
            r0.<init>(r2, r2, r1, r2)
            r3.add(r0)
            int r7 = r7 + 1
            goto L_0x00a4
        L_0x00b4:
            X.0sn r1 = X.0sn.A00
            goto L_0x0094
        L_0x00b7:
            java.util.List r5 = X.0sr.A1N(r18)
            goto L_0x009c
        L_0x00bc:
            java.lang.String r1 = "generate"
            goto L_0x0081
        L_0x00bf:
            java.util.ArrayList r1 = X.00k.A0S(r3, r5)
            r11 = 0
            X.HtB r0 = new X.HtB
            r0.<init>(r9, r1, r12, r6)
            r4.Epw(r0)
            X.4Cq r0 = r8.A0J
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateImages$3 r7 = new com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateImages$3
            r10 = r20
            r16 = r24
            r14 = r25
            r13 = r26
            r15 = r27
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1Er r2 = X.C51966G9m.A1L(r7, r0)
            r8.A01 = r2
            r1 = 39
            X.J6T r0 = new X.J6T
            r3 = r21
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r8)
            r2.CO3(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository.A03(X.I1k, java.lang.String, java.lang.String, X.0sP, int, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public ImagineGenerationImageRepository(Application application, I25 i25, HMY hmy, ImagineNetworkService imagineNetworkService, MetaAIFeedbackNetworkService metaAIFeedbackNetworkService, Integer num, String str, C262224Cq r27, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C56123HtB htB;
        Object value;
        String str2;
        String str3;
        C56146HtY htY;
        Application application2 = application;
        this.A02 = application2;
        this.A06 = imagineNetworkService;
        this.A0J = r27;
        this.A05 = hmy;
        this.A07 = num;
        this.A03 = i25;
        this.A0I = metaAIFeedbackNetworkService;
        this.A0G = z;
        this.A0H = z2;
        this.A08 = str;
        I87 i87 = new I87();
        this.A04 = i87;
        02z A0u = C51967G9n.A0u();
        this.A0C = A0u;
        this.A0E = 10b.A03(A0u);
        this.A0A = AnonymousClass7TE.A1C();
        this.A09 = AnonymousClass7TE.A1C();
        02z A012 = 106.A01(C57571Icy.A00);
        this.A0D = A012;
        this.A0F = 10b.A03(A012);
        application2.registerComponentCallbacks(i87);
        if (this.A0H && (htB = ((GVF) this.A0B.getValue()).A01) != null) {
            List list = htB.A02;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                if (((C56556I1k) next).A02 == AnonymousClass05K.A01) {
                    A1C.add(next);
                }
            }
            05G r4 = this.A0C;
            do {
                value = r4.getValue();
                str2 = null;
                str3 = htB.A01;
            } while (!r4.AIY(value, new C56123HtB(str3, A1C, htB.A00, htB.A03)));
            C56556I1k i1k = (C56556I1k) 00k.A0J(A1C);
            if (i1k != null) {
                htY = i1k.A01;
            } else {
                htY = null;
            }
            List list2 = htB.A02;
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (Object next2 : list2) {
                if (((C56556I1k) next2).A02 == AnonymousClass05K.A00) {
                    A1C2.add(next2);
                }
            }
            if (AnonymousClass7TE.A1b(A1C2)) {
                A03((C56556I1k) null, str3, htY != null ? htY.A03 : str2, J59.A00, A1C2.size(), false, z3, z4, false, z5, true);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, X.AnonymousClass4D7 r19, boolean r20) {
        /*
            r3 = 35
            r5 = r19
            boolean r0 = X.C66139MDr.A01(r3, r5)
            if (r0 == 0) goto L_0x006f
            r4 = r5
            X.MDr r4 = (X.C66139MDr) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0018:
            java.lang.Object r2 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x004c
            if (r1 != r0) goto L_0x008f
            java.lang.Object r14 = r4.A01
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r14 = (com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository) r14
            X.0eS.A00(r2)
        L_0x002a:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0075
            X.I25 r3 = r14.A03
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r2 = r2.A00
            X.HtY r2 = (X.C56146HtY) r2
            java.lang.String r1 = r2.A07
            java.lang.String r0 = "request_id"
            r3.A07(r0, r1)
            java.lang.String r1 = r2.A08
            java.lang.String r0 = "response_id"
            r3.A07(r0, r1)
            X.HIh r3 = new X.HIh
            r3.<init>(r2)
            return r3
        L_0x004c:
            X.0eS.A00(r2)
            com.meta.metaai.imagine.service.ImagineNetworkService r7 = r14.A06
            X.HMY r6 = r14.A05
            r4.A01 = r14
            r4.A00 = r0
            r12 = 0
            X.MFq r5 = new X.MFq
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r13 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r2 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A03(r4, r5, r0)
            if (r2 != r3) goto L_0x002a
            return r3
        L_0x006f:
            X.MDr r4 = new X.MDr
            r4.<init>(r14, r5, r3)
            goto L_0x0018
        L_0x0075:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x008a
            X.I25 r1 = r14.A03
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r0 = r2.A00
            X.HQf r0 = (X.C54726HQf) r0
            r1.A02(r0)
            X.HIg r3 = new X.HIg
            r3.<init>(r0)
            return r3
        L_0x008a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository.A00(com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.HMN r12, java.lang.String r13, java.lang.String r14, X.AnonymousClass4D7 r15) {
        /*
            r11 = this;
            r3 = 42
            boolean r0 = X.ME5.A03(r3, r15)
            if (r0 == 0) goto L_0x0082
            r10 = r15
            X.ME5 r10 = (X.ME5) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0082
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r10.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r10.A00
            r3 = 1
            if (r0 == 0) goto L_0x0066
            if (r0 != r3) goto L_0x0096
            X.0eS.A00(r2)
        L_0x0024:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005d
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r5 = r2.A00
            X.3lr r5 = (X.C250663lr) r5
            java.lang.Class<X.QTv> r4 = X.C7706QTv.class
            r2 = 0
            r0 = 107(0x6b, float:1.5E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = 1882557464(0x70358c18, float:2.247446E29)
            X.3lr r1 = r5.getOptionalTreeField(r2, r1, r4, r0)
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = "submitted"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
            if (r0 != r3) goto L_0x005b
        L_0x004a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.3Ih r2 = X.C41845B3m.A0d(r0)
        L_0x0052:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0088
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            return r0
        L_0x005b:
            r3 = 0
            goto L_0x004a
        L_0x005d:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0052
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0066:
            X.0eS.A00(r2)
            r5 = r13
            if (r13 == 0) goto L_0x009b
            r6 = r14
            if (r14 == 0) goto L_0x009b
            com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService r4 = r11.A0I
            java.lang.String r7 = X.Ky9.A00(r12)
            r10.A00 = r3
            java.lang.String r8 = "IMAGINE"
            java.lang.String r9 = "FOA_INTENTS"
            java.lang.Object r2 = r4.A00(r5, r6, r7, r8, r9, r10)
            if (r2 != r1) goto L_0x0024
            return r1
        L_0x0082:
            X.ME5 r10 = new X.ME5
            r10.<init>(r11, r15, r3, r3)
            goto L_0x0016
        L_0x0088:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0091
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            return r0
        L_0x0091:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x009b:
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository.A01(X.HMN, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 34
            boolean r0 = X.C66139MDr.A01(r3, r7)
            if (r0 == 0) goto L_0x0051
            r4 = r7
            X.MDr r4 = (X.C66139MDr) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0051
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 != r1) goto L_0x0057
            java.lang.Object r1 = r4.A01
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r1 = (com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository) r1
            X.0eS.A00(r3)
        L_0x0028:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003d
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
        L_0x0036:
            r1.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x003d:
            r0 = 0
            goto L_0x0036
        L_0x003f:
            X.0eS.A00(r3)
            com.meta.metaai.imagine.service.ImagineNetworkService r0 = r5.A06
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r3 = r0.A08(r6, r4)
            if (r3 != r2) goto L_0x004f
            return r2
        L_0x004f:
            r1 = r5
            goto L_0x0028
        L_0x0051:
            X.MDr r4 = new X.MDr
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x0057:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository.A02(java.lang.String, X.4D7):java.lang.Object");
    }
}
