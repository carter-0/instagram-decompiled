package com.instagram.genai.imageservice.service;

import X.02m;
import X.0qQ;
import X.AnonymousClass4D7;
import X.AnonymousClass4HU;
import X.AnonymousClass4HW;
import X.AnonymousClass7TE;
import X.C239793Ih;
import X.C239803Ii;
import X.C268654dm;
import X.C268664dn;
import X.C297815sO;
import X.C335967dq;
import X.C41845B3m;
import X.C51974G9v;
import X.C61076JwE;
import X.C61078JwG;
import X.C61082JwK;
import X.C62687Kkn;
import X.C63638L1a;
import X.C66264MKz;
import X.C66490MTt;
import X.DbX;
import X.HBQ;
import X.HBT;
import X.JTP;
import X.LG0;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.genai.imageservice.upload.GenAIImageUploadService;
import java.util.concurrent.TimeUnit;

public final class GenAIImageService implements C66490MTt {
    public static final long A05 = TimeUnit.SECONDS.toMillis(30);
    public final Context A00;
    public final C61078JwG A01;
    public final AnonymousClass4HW A02;
    public final UserSession A03;
    public final GenAIImageUploadService A04;

    public /* synthetic */ GenAIImageService(Context context, C61078JwG jwG, UserSession userSession, int i) {
        GenAIImageUploadService genAIImageUploadService = null;
        jwG = (i & 4) != 0 ? new C61078JwG() : jwG;
        if ((i & 8) != 0) {
            0qQ.A0B(userSession, 0);
            genAIImageUploadService = new GenAIImageUploadService(context, (C61082JwK) jwG.A00, userSession, (C63638L1a) userSession.A01(C63638L1a.class, C66264MKz.A00));
        }
        C51974G9v.A1P(userSession, context, jwG, genAIImageUploadService);
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = jwG;
        this.A04 = genAIImageUploadService;
        this.A02 = C335967dq.A00(AnonymousClass4HU.A00);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(com.instagram.genai.imageservice.service.GenAIImageService r15, X.LG0 r16, X.KS4 r17, X.AnonymousClass4D7 r18) {
        /*
            r3 = r15
            r7 = r16
            r9 = r17
            r4 = 49
            r5 = r18
            boolean r0 = X.MED.A04(r4, r5)
            if (r0 == 0) goto L_0x0085
            r6 = r5
            X.MED r6 = (X.MED) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0085
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001d:
            java.lang.Object r8 = r6.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r2) goto L_0x0044
            if (r0 != r4) goto L_0x008b
            X.0eS.A00(r8)
        L_0x002e:
            return r8
        L_0x002f:
            X.0eS.A00(r8)
            X.JwE r0 = r9.A02
            java.lang.String r1 = r0.A01
            java.lang.Object r0 = r0.A00
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            X.MED.A00(r15, r9, r7, r6, r2)
            java.lang.Object r8 = A02(r0, r15, r7, r1, r6)
            if (r8 != r5) goto L_0x0053
            return r5
        L_0x0044:
            java.lang.Object r7 = r6.A03
            X.LG0 r7 = (X.LG0) r7
            java.lang.Object r9 = r6.A02
            X.KS4 r9 = (X.KS4) r9
            java.lang.Object r3 = r6.A01
            com.instagram.genai.imageservice.service.GenAIImageService r3 = (com.instagram.genai.imageservice.service.GenAIImageService) r3
            X.0eS.A00(r8)
        L_0x0053:
            X.Kmx r8 = (X.C62821Kmx) r8
            boolean r0 = r8 instanceof X.KS7
            if (r0 == 0) goto L_0x0090
            java.lang.Integer r10 = r9.A00
            X.Gms r0 = r9.A00
            int r2 = r0.A01
            int r1 = r0.A00
            java.lang.String r11 = r9.A03
            X.BBV r0 = r9.A01
            java.lang.String r12 = r0.A00
            X.JwE r0 = r9.A02
            java.lang.String r13 = r0.A01
            X.KS7 r8 = (X.KS7) r8
            java.lang.String r14 = r8.A00
            r15 = 0
            X.JuO r9 = new X.JuO
            r16 = r15
            r18 = r1
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.MED.A03(r6, r4)
            java.lang.Object r8 = A03(r3, r7, r9, r6)
            if (r8 != r5) goto L_0x002e
            return r5
        L_0x0085:
            X.MED r6 = new X.MED
            r6.<init>(r15, r5, r4)
            goto L_0x001d
        L_0x008b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0090:
            boolean r0 = r8 instanceof X.KS8
            if (r0 == 0) goto L_0x009b
            X.HBb r0 = X.C54386HBb.A00
            X.5sO r5 = X.C41845B3m.A0c(r0)
            return r5
        L_0x009b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.A04(com.instagram.genai.imageservice.service.GenAIImageService, X.LG0, X.KS4, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.LG0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.LG0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.LG0} */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0219  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.instagram.genai.imageservice.service.GenAIImageService r15, X.LG0 r16, X.L1Y r17, X.AnonymousClass4D7 r18) {
        /*
            r14 = r15
            r4 = r17
            r3 = r16
            r6 = 48
            r7 = r18
            boolean r0 = X.MED.A04(r6, r7)
            if (r0 == 0) goto L_0x002c
            r2 = r7
            X.MED r2 = (X.MED) r2
            int r5 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto L_0x002c
            int r5 = r5 - r1
            r2.A00 = r5
        L_0x001d:
            java.lang.Object r6 = r2.A04
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            switch(r0) {
                case 0: goto L_0x0032;
                case 1: goto L_0x008d;
                case 2: goto L_0x008d;
                case 3: goto L_0x008d;
                case 4: goto L_0x008d;
                case 5: goto L_0x008d;
                case 6: goto L_0x01b9;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002c:
            X.MED r2 = new X.MED
            r2.<init>(r15, r7, r6)
            goto L_0x001d
        L_0x0032:
            X.0eS.A00(r6)
            boolean r0 = r4 instanceof X.KS4
            if (r0 == 0) goto L_0x0046
            r0 = r4
            X.KS4 r0 = (X.KS4) r0
            X.MED.A00(r15, r4, r3, r2, r5)
            java.lang.Object r6 = A04(r15, r3, r0, r2)
        L_0x0043:
            if (r6 != r1) goto L_0x009a
            return r1
        L_0x0046:
            boolean r0 = r4 instanceof X.KS5
            if (r0 == 0) goto L_0x0064
            r2.A01 = r15
            r2.A02 = r4
            r2.A03 = r3
            r0 = 2
            r2.A00 = r0
            r10 = 0
            r11 = 49
            X.MHF r0 = new X.MHF
            r6 = r0
            r7 = r15
            r8 = r4
            r9 = r3
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x005f:
            java.lang.Object r6 = X.19E.A00(r2, r0)
            goto L_0x0043
        L_0x0064:
            boolean r0 = r4 instanceof X.KS3
            if (r0 == 0) goto L_0x007d
            r2.A01 = r15
            r2.A02 = r4
            r2.A03 = r3
            r0 = 3
            r2.A00 = r0
            r10 = 0
            r11 = 0
        L_0x0073:
            X.MHL r0 = new X.MHL
            r6 = r0
            r7 = r4
            r8 = r15
            r9 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x005f
        L_0x007d:
            boolean r0 = r4 instanceof X.KS2
            if (r0 == 0) goto L_0x0226
            r2.A01 = r15
            r2.A02 = r4
            r2.A03 = r3
            r0 = 5
            r2.A00 = r0
            r10 = 0
            r11 = 1
            goto L_0x0073
        L_0x008d:
            java.lang.Object r3 = r2.A03
            java.lang.Object r4 = r2.A02
            X.L1Y r4 = (X.L1Y) r4
            java.lang.Object r14 = r2.A01
            com.instagram.genai.imageservice.service.GenAIImageService r14 = (com.instagram.genai.imageservice.service.GenAIImageService) r14
            X.0eS.A00(r6)
        L_0x009a:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0219
            X.3lr r9 = X.C41846B3n.A0R(r6)
            r13 = 0
            if (r9 == 0) goto L_0x020f
            java.lang.Class<X.Bvk> r8 = X.C43284Bvk.class
            r0 = 1969(0x7b1, float:2.759E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            r0 = -166495565(0xfffffffff6137ab3, float:-7.478089E32)
            X.3lr r11 = r9.A03(r8, r7, r0)
            if (r11 == 0) goto L_0x00ec
            java.lang.Class<X.Bvi> r10 = X.C43282Bvi.class
            java.lang.String r6 = "images"
            r0 = 1690052091(0x64bc25fb, float:2.7765797E22)
            com.google.common.collect.ImmutableList r0 = r11.A06(r10, r6, r0)
            if (r0 == 0) goto L_0x00ec
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r0.iterator()
        L_0x00cd:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00ed
            X.3lr r11 = X.C41845B3m.A0V(r12)
            java.lang.Class<X.Bvg> r10 = X.C43280Bvg.class
            r0 = 616(0x268, float:8.63E-43)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            r0 = -1562226145(0xffffffffa2e2521f, float:-6.134437E-18)
            X.3lr r0 = r11.A03(r10, r6, r0)
            if (r0 == 0) goto L_0x00cd
            r15.add(r0)
            goto L_0x00cd
        L_0x00ec:
            r15 = r13
        L_0x00ed:
            r0 = -166495565(0xfffffffff6137ab3, float:-7.478089E32)
            X.3lr r8 = r9.A03(r8, r7, r0)
            if (r8 == 0) goto L_0x0182
            java.lang.Class<X.Bvi> r7 = X.C43282Bvi.class
            java.lang.String r6 = "images"
            r0 = 1690052091(0x64bc25fb, float:2.7765797E22)
            com.google.common.collect.ImmutableList r0 = r8.A06(r7, r6, r0)
            if (r0 == 0) goto L_0x0182
            java.util.Iterator r9 = r0.iterator()
        L_0x0107:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0182
            X.3lr r8 = X.C41845B3m.A0V(r9)
            java.lang.Class<X.Bvh> r7 = X.C43281Bvh.class
            r0 = 3951(0xf6f, float:5.537E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            r0 = -1396871803(0xffffffffacbd6d85, float:-5.383862E-12)
            com.google.common.collect.ImmutableList r0 = r8.getRequiredCompactedTreeListField(r5, r6, r7, r0)
            if (r0 == 0) goto L_0x0107
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r0.iterator()
        L_0x012a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0184
            X.3lr r11 = X.C41845B3m.A0V(r12)
            X.NkU r6 = X.C69390NkU.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "category"
            java.lang.Enum r7 = r11.getOptionalEnumField(r5, r0, r6)
            X.NkU r7 = (X.C69390NkU) r7
            r6 = 5
            r0 = 1687(0x697, float:2.364E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r10 = r11.getCoercedIntField(r6, r0)
            java.lang.String r9 = X.C51972G9s.A0n()
            if (r7 == 0) goto L_0x012a
            int r6 = r7.ordinal()
            r0 = 0
            if (r6 == r0) goto L_0x017a
            if (r6 == r5) goto L_0x0177
            r0 = 2
            if (r6 == r0) goto L_0x0174
            r0 = 3
            if (r6 != r0) goto L_0x017d
            java.lang.Integer r7 = X.AnonymousClass05K.A01
        L_0x0160:
            r6 = 6
            r0 = 3462(0xd86, float:4.851E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r6 = r11.getCoercedBooleanField(r6, r0)
            X.McY r0 = new X.McY
            r0.<init>((java.lang.Integer) r7, (java.lang.String) r9, (int) r10, (boolean) r6)
            r8.add(r0)
            goto L_0x012a
        L_0x0174:
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            goto L_0x0160
        L_0x0177:
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            goto L_0x0160
        L_0x017a:
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            goto L_0x0160
        L_0x017d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0182:
            r5 = r13
            goto L_0x018b
        L_0x0184:
            r0 = 27
            X.JwG r5 = new X.JwG
            r5.<init>((java.util.List) r8, (int) r0)
        L_0x018b:
            if (r15 == 0) goto L_0x020f
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x020f
            r2.A01 = r13
            r2.A02 = r13
            r2.A03 = r13
            r0 = 6
            r2.A00 = r0
            r18 = 40
            X.JUk r12 = new X.JUk
            r17 = r3
            r16 = r5
            r12.<init>((X.AnonymousClass4D7) r13, (java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (int) r18)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C262214Cp.A00
            X.4Cc r3 = r2.getContext()
            X.MPX r0 = new X.MPX
            r0.<init>(r2, r3)
            java.lang.Object r6 = X.1RG.A00(r0, r12, r0)
            if (r6 != r1) goto L_0x01bc
            return r1
        L_0x01b9:
            X.0eS.A00(r6)
        L_0x01bc:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r6.iterator()
        L_0x01c6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01c6
            r3.add(r1)
            goto L_0x01c6
        L_0x01d8:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x01e5
            X.HBR r0 = X.HBR.A00
            X.5sO r6 = X.C41845B3m.A0c(r0)
            return r6
        L_0x01e5:
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x01ed:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ff
            java.lang.Object r0 = r1.next()
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r0 = r0.A00
            r2.add(r0)
            goto L_0x01ed
        L_0x01ff:
            X.62O r2 = X.AnonymousClass62Q.A03(r2)
            r1 = 25
            X.JwG r0 = new X.JwG
            r0.<init>((X.AnonymousClass62O) r2, (int) r1)
            X.3Ih r6 = X.C41845B3m.A0d(r0)
            return r6
        L_0x020f:
            r14.A06(r4)
            X.HBV r0 = X.HBV.A00
            X.5sO r0 = X.C41845B3m.A0c(r0)
            return r0
        L_0x0219:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0221
            r14.A06(r4)
            return r6
        L_0x0221:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0226:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.A05(com.instagram.genai.imageservice.service.GenAIImageService, X.LG0, X.L1Y, X.4D7):java.lang.Object");
    }

    public static final C239803Ii A00(LG0 lg0, C239803Ii r6) {
        Object obj;
        if (r6 instanceof C239793Ih) {
            Object obj2 = ((C239793Ih) r6).A00;
            ((02m) AnonymousClass7TE.A14(lg0.A02)).markerPoint(DbX.A07(lg0.A04), DbX.A07(lg0.A03), "image_request_success");
            r6 = C41845B3m.A0d(obj2);
        } else if (!(r6 instanceof C297815sO)) {
            throw AnonymousClass7TE.A1K();
        }
        if (r6 instanceof C239793Ih) {
            return r6;
        }
        if (r6 instanceof C297815sO) {
            C268654dm A0N = JTP.A0N(r6);
            if (A0N instanceof C268664dn) {
                Throwable th = ((C268664dn) A0N).A00;
                if (th instanceof C62687Kkn) {
                    0qQ.A0C(th, "null cannot be cast to non-null type com.instagram.genai.imageservice.api.GenAIImageQueryServerException");
                    C62687Kkn kkn = (C62687Kkn) th;
                    String str = kkn.A00;
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    lg0.A02(str2);
                    obj = new HBQ(str, kkn.A02, kkn.A01);
                    return C41845B3m.A0c(obj);
                }
            }
            lg0.A02(A0N.toString());
            obj = HBT.A00;
            return C41845B3m.A0c(obj);
        }
        throw AnonymousClass7TE.A1K();
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(android.graphics.Bitmap r8, com.instagram.genai.imageservice.service.GenAIImageService r9, X.LG0 r10, java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r3 = 24
            boolean r0 = X.C66137MDp.A02(r3, r12)
            if (r0 == 0) goto L_0x0071
            r5 = r12
            X.MDp r5 = (X.C66137MDp) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r7 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 != r4) goto L_0x00b5
            java.lang.Object r10 = r5.A01
            X.LG0 r10 = (X.LG0) r10
            X.0eS.A00(r7)
        L_0x0028:
            X.Kmx r7 = (X.C62821Kmx) r7
            boolean r0 = r7 instanceof X.KS7
            if (r0 == 0) goto L_0x0076
            X.0eM r0 = r10.A02
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r0)
            X.02m r3 = (X.02m) r3
            X.0eM r0 = r10.A04
            int r2 = X.DbX.A07(r0)
            X.0eM r0 = r10.A03
            int r1 = X.DbX.A07(r0)
            java.lang.String r0 = "mask_media_upload_success"
            r3.markerPoint(r2, r1, r0)
            return r7
        L_0x0048:
            X.0eS.A00(r7)
            X.0eM r0 = r10.A02
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r0)
            X.02m r3 = (X.02m) r3
            X.0eM r0 = r10.A04
            int r2 = X.DbX.A07(r0)
            X.0eM r0 = r10.A03
            int r1 = X.DbX.A07(r0)
            java.lang.String r0 = "mask_media_upload_start"
            r3.markerPoint(r2, r1, r0)
            com.instagram.genai.imageservice.upload.GenAIImageUploadService r0 = r9.A04
            r5.A01 = r10
            r5.A00 = r4
            java.lang.Object r7 = r0.A01(r8, r11, r5)
            if (r7 != r6) goto L_0x0028
            return r6
        L_0x0071:
            X.MDp r5 = X.C66137MDp.A00(r9, r12, r3)
            goto L_0x0016
        L_0x0076:
            boolean r0 = r7 instanceof X.KS8
            if (r0 == 0) goto L_0x00b0
            r0 = r7
            X.KS8 r0 = (X.KS8) r0
            java.lang.String r8 = r0.A00
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.0eM r6 = r10.A02
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r6)
            X.02m r3 = (X.02m) r3
            X.0eM r5 = r10.A04
            int r2 = X.DbX.A07(r5)
            X.0eM r4 = r10.A03
            int r1 = X.DbX.A07(r4)
            java.lang.String r0 = "mask_media_upload_failure"
            r3.markerPoint(r2, r1, r0)
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r6)
            X.02m r3 = (X.02m) r3
            int r2 = X.DbX.A07(r5)
            int r1 = X.DbX.A07(r4)
            java.lang.String r0 = "mask_media_upload_error"
            r3.markerAnnotate(r2, r1, r0, r8)
            return r7
        L_0x00b0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.A01(android.graphics.Bitmap, com.instagram.genai.imageservice.service.GenAIImageService, X.LG0, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(android.graphics.Bitmap r8, com.instagram.genai.imageservice.service.GenAIImageService r9, X.LG0 r10, java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r3 = 25
            boolean r0 = X.C66137MDp.A02(r3, r12)
            if (r0 == 0) goto L_0x0071
            r5 = r12
            X.MDp r5 = (X.C66137MDp) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r6 = r5.A02
            X.1Hj r7 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 != r4) goto L_0x00bc
            java.lang.Object r10 = r5.A01
            X.LG0 r10 = (X.LG0) r10
            X.0eS.A00(r6)
        L_0x0028:
            X.Kmx r6 = (X.C62821Kmx) r6
            boolean r0 = r6 instanceof X.KS7
            if (r0 == 0) goto L_0x0076
            X.0eM r0 = r10.A02
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r0)
            X.02m r3 = (X.02m) r3
            X.0eM r0 = r10.A04
            int r2 = X.DbX.A07(r0)
            X.0eM r0 = r10.A03
            int r1 = X.DbX.A07(r0)
            java.lang.String r0 = "source_media_upload_success"
            r3.markerPoint(r2, r1, r0)
            return r6
        L_0x0048:
            X.0eS.A00(r6)
            X.0eM r0 = r10.A02
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r0)
            X.02m r3 = (X.02m) r3
            X.0eM r0 = r10.A04
            int r2 = X.DbX.A07(r0)
            X.0eM r0 = r10.A03
            int r1 = X.DbX.A07(r0)
            java.lang.String r0 = "source_media_upload_start"
            r3.markerPoint(r2, r1, r0)
            com.instagram.genai.imageservice.upload.GenAIImageUploadService r0 = r9.A04
            r5.A01 = r10
            r5.A00 = r4
            java.lang.Object r6 = r0.A01(r8, r11, r5)
            if (r6 != r7) goto L_0x0028
            return r7
        L_0x0071:
            X.MDp r5 = X.C66137MDp.A00(r9, r12, r3)
            goto L_0x0016
        L_0x0076:
            boolean r0 = r6 instanceof X.KS8
            if (r0 == 0) goto L_0x00b7
            r0 = r6
            X.KS8 r0 = (X.KS8) r0
            java.lang.String r8 = r0.A00
            X.0eM r7 = r10.A02
            java.lang.Object r4 = X.AnonymousClass7TE.A14(r7)
            X.02m r4 = (X.02m) r4
            X.0eM r5 = r10.A04
            int r3 = X.DbX.A07(r5)
            X.0eM r2 = r10.A03
            int r1 = X.DbX.A07(r2)
            java.lang.String r0 = "source_media_upload_failure"
            r4.markerPoint(r3, r1, r0)
            java.lang.Object r4 = X.AnonymousClass7TE.A14(r7)
            X.02m r4 = (X.02m) r4
            int r3 = X.DbX.A07(r5)
            int r2 = X.DbX.A07(r2)
            if (r8 == 0) goto L_0x00b4
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r1 = X.00R.A03(r8, r0)
        L_0x00ae:
            java.lang.String r0 = "source_media_upload_error"
            r4.markerAnnotate(r3, r2, r0, r1)
            return r6
        L_0x00b4:
            java.lang.String r1 = ""
            goto L_0x00ae
        L_0x00b7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.A02(android.graphics.Bitmap, com.instagram.genai.imageservice.service.GenAIImageService, X.LG0, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.genai.imageservice.service.GenAIImageService r7, X.LG0 r8, X.C60966JuO r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 42
            boolean r0 = X.C66136MDo.A01(r3, r10)
            if (r0 == 0) goto L_0x005c
            r5 = r10
            X.MDo r5 = (X.C66136MDo) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r4) goto L_0x0067
            X.0eS.A00(r1)
        L_0x0024:
            X.5mw r1 = (X.C294735mw) r1
            boolean r0 = r1 instanceof X.C294725mv
            if (r0 == 0) goto L_0x0062
            X.5mv r1 = (X.C294725mv) r1
            java.lang.Object r6 = r1.A00
            return r6
        L_0x002f:
            X.0eS.A00(r1)
            X.0eM r0 = r8.A02
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r0)
            X.02m r3 = (X.02m) r3
            X.0eM r0 = r8.A04
            int r2 = X.DbX.A07(r0)
            X.0eM r0 = r8.A03
            int r1 = X.DbX.A07(r0)
            java.lang.String r0 = "image_request_start"
            r3.markerPoint(r2, r1, r0)
            X.4HW r2 = r7.A02
            r1 = 0
            X.MEO r0 = new X.MEO
            r0.<init>((com.instagram.genai.imageservice.service.GenAIImageService) r7, (X.LG0) r8, (X.C60966JuO) r9, (X.AnonymousClass4D7) r1)
            r5.A00 = r4
            java.lang.Object r1 = r2.A00(r9, r5, r0)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x005c:
            X.MDo r5 = new X.MDo
            r5.<init>(r7, r10, r3, r3)
            goto L_0x0016
        L_0x0062:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0067:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.A03(com.instagram.genai.imageservice.service.GenAIImageService, X.LG0, X.JuO, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A06(X.L1Y r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.KS4
            if (r0 == 0) goto L_0x0049
            X.KS4 r6 = (X.KS4) r6
            X.JwE r0 = r6.A02
        L_0x0008:
            java.lang.String r0 = r0.A01
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
        L_0x000e:
            java.util.Iterator r4 = r0.iterator()
        L_0x0012:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r2 = r4.next()
            com.instagram.genai.imageservice.upload.GenAIImageUploadService r1 = r5.A04
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.L1a r0 = r1.A02
            if (r0 == 0) goto L_0x0012
            X.0Cp r1 = r0.A00
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r1.A01
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r3.writeLock()
            r0.lock()
            java.util.HashMap r0 = r1.A00     // Catch:{ all -> 0x007f }
            java.lang.Object r2 = r0.remove(r2)     // Catch:{ all -> 0x007f }
            X.0Co r2 = (X.0Co) r2     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x0041
            long r0 = java.lang.System.nanoTime()     // Catch:{ all -> 0x007f }
            r2.A00 = r0     // Catch:{ all -> 0x007f }
        L_0x0041:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r3.writeLock()
            r0.unlock()
            goto L_0x0012
        L_0x0049:
            boolean r0 = r6 instanceof X.KS5
            r3 = 1
            r2 = 0
            r1 = 2
            if (r0 == 0) goto L_0x0065
            java.lang.String[] r1 = new java.lang.String[r1]
            X.KS5 r6 = (X.KS5) r6
            X.JwE r0 = r6.A03
            java.lang.String r0 = r0.A01
            r1[r2] = r0
            X.JwE r0 = r6.A02
        L_0x005c:
            java.lang.String r0 = r0.A01
            r1[r3] = r0
            java.util.List r0 = X.0sr.A1P(r1)
            goto L_0x000e
        L_0x0065:
            boolean r0 = r6 instanceof X.KS3
            if (r0 == 0) goto L_0x0076
            java.lang.String[] r1 = new java.lang.String[r1]
            X.KS3 r6 = (X.KS3) r6
            X.JwE r0 = r6.A02
            java.lang.String r0 = r0.A01
            r1[r2] = r0
            X.JwE r0 = r6.A01
            goto L_0x005c
        L_0x0076:
            boolean r0 = r6 instanceof X.KS2
            if (r0 == 0) goto L_0x0089
            X.KS2 r6 = (X.KS2) r6
            X.JwE r0 = r6.A00
            goto L_0x0008
        L_0x007f:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r3.writeLock()
            r0.unlock()
            throw r1
        L_0x0088:
            return
        L_0x0089:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.A06(X.L1Y):void");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AWg(X.L1Y r16, X.AnonymousClass4D7 r17) {
        /*
            r15 = this;
            r3 = 23
            r4 = r17
            boolean r0 = X.C66137MDp.A02(r3, r4)
            r12 = r15
            if (r0 == 0) goto L_0x0029
            r6 = r4
            X.MDp r6 = (X.C66137MDp) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0029
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0019:
            java.lang.Object r0 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r4 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 != r4) goto L_0x0032
            java.lang.Object r11 = r6.A01
            X.LG0 r11 = (X.LG0) r11
            goto L_0x002e
        L_0x0029:
            X.MDp r6 = X.C66137MDp.A00(r15, r4, r3)
            goto L_0x0019
        L_0x002e:
            X.0eS.A00(r0)     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            return r0
        L_0x0032:
            java.lang.IllegalStateException r4 = X.AnonymousClass7TE.A0x()
            throw r4
        L_0x0037:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r15.A03
            r10 = r16
            java.lang.Integer r0 = r10.A00
            X.LG0 r11 = new X.LG0
            r11.<init>(r1, r0)
            boolean r0 = r10 instanceof X.KS2     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            if (r0 == 0) goto L_0x0066
            r0 = r10
            X.KS2 r0 = (X.KS2) r0     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            java.lang.String r8 = r0.A01     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
        L_0x004e:
            X.0eM r9 = r11.A02     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r9)     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            X.02m r3 = (X.02m) r3     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            X.0eM r7 = r11.A04     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            int r2 = X.DbX.A07(r7)     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            X.0eM r1 = r11.A03     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            int r0 = X.DbX.A07(r1)     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            r3.markerStart(r2, r0)     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            goto L_0x0080
        L_0x0066:
            boolean r0 = r10 instanceof X.KS4     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            if (r0 == 0) goto L_0x0070
            r0 = r10
            X.KS4 r0 = (X.KS4) r0     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            java.lang.String r8 = r0.A03     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            goto L_0x004e
        L_0x0070:
            boolean r0 = r10 instanceof X.KS3     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            if (r0 == 0) goto L_0x007a
            r0 = r10
            X.KS3 r0 = (X.KS3) r0     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            java.lang.String r8 = r0.A03     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            goto L_0x004e
        L_0x007a:
            r0 = r10
            X.KS5 r0 = (X.KS5) r0     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            java.lang.String r8 = r0.A04     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            goto L_0x004e
        L_0x0080:
            if (r8 == 0) goto L_0x0095
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r9)     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            X.02m r3 = (X.02m) r3     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            int r2 = X.DbX.A07(r7)     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            int r1 = X.DbX.A07(r1)     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            java.lang.String r0 = "client_session_id"
            r3.markerAnnotate(r2, r1, r0, r8)     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
        L_0x0095:
            long r0 = A05     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            r13 = 0
            r14 = 40
            X.MHE r9 = new X.MHE     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            r6.A01 = r11     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            r6.A00 = r4     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            java.lang.Object r0 = X.I3P.A00(r6, r9, r0)     // Catch:{ 3EF -> 0x00c4, CancellationException -> 0x00aa }
            if (r0 != r5) goto L_0x00cd
            return r5
        L_0x00aa:
            r4 = move-exception
            X.0eM r0 = r11.A02
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r0)
            X.02m r3 = (X.02m) r3
            X.0eM r0 = r11.A04
            int r2 = X.DbX.A07(r0)
            X.0eM r0 = r11.A03
            int r1 = X.DbX.A07(r0)
            r0 = 4
            r3.markerEnd(r2, r1, r0)
            throw r4
        L_0x00c4:
            X.HBY r0 = X.HBY.A00
            r11.A01(r0)
            X.5sO r0 = X.C41845B3m.A0c(r0)
        L_0x00cd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.AWg(X.L1Y, X.4D7):java.lang.Object");
    }

    public final Object FMY(C61078JwG jwG, AnonymousClass4D7 r5) {
        GenAIImageUploadService genAIImageUploadService = this.A04;
        C61076JwE jwE = (C61076JwE) jwG.A00;
        return genAIImageUploadService.A01((Bitmap) jwE.A00, jwE.A01, r5);
    }
}
