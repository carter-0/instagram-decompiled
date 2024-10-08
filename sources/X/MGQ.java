package X;

import android.graphics.Bitmap;
import com.instagram.genai.imageservice.upload.GenAIImageUploadService;

public final class MGQ extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04 = 2;
    public final Object A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGQ(C389799qE r2, String str, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A05 = r2;
        this.A06 = str;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.MGQ] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.MGQ] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.4D7, X.MGQ] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        AnonymousClass4D7 r8 = r12;
        switch (this.A04) {
            case 0:
                return new MGQ((C389799qE) this.A05, this.A06, r12, this.A00);
            case 1:
                String str = this.A06;
                return new MGQ((Bitmap) this.A02, (GenAIImageUploadService) this.A05, str, r12);
            default:
                String str2 = this.A06;
                return new MGQ((C243363Yl) this.A02, (1Xj) this.A03, (C62028KWc) this.A05, str2, r8, this.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, X.MGQ] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01cd A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            r6 = r24
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x01d8;
                case 1: goto L_0x0101;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r3 = X.1Hj.A02
            int r1 = r0.A01
            r9 = 1
            if (r1 == 0) goto L_0x00a0
            if (r1 != r9) goto L_0x01d3
            X.0eS.A00(r6)
        L_0x0015:
            X.3Ii r6 = (X.C239803Ii) r6
            java.lang.Object r7 = r0.A05
            X.KWc r7 = (X.C62028KWc) r7
            java.lang.String r4 = r0.A06
            boolean r1 = r6 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0097
            X.L2Z r1 = r7.A03
            X.1QP r3 = r1.A00
            r1 = 18943093(0x1210c75, double:9.3591315E-317)
            r3.flowEndSuccess(r1)
            X.2fS r2 = r7.A02
            r1 = 0
            X.0qQ.A0B(r4, r1)
            boolean r1 = r2.A0F(r4)
            if (r1 == 0) goto L_0x0095
            r2.A0B(r4)
            r1 = 1
        L_0x003b:
            X.3Ih r6 = X.JTT.A0j(r1)
        L_0x003f:
            java.lang.Object r9 = r0.A02
            java.lang.Object r10 = r0.A03
            X.1Xj r10 = (X.1Xj) r10
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x008f
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01ce
            X.5sO r6 = (X.C297815sO) r6
            java.lang.Object r11 = r6.A00
            X.L2Z r0 = r7.A03
            r8 = 0
            r6 = 0
            X.0qQ.A0B(r9, r6)
            X.1QP r5 = r0.A00
            r1 = 18943093(0x1210c75, double:9.3591315E-317)
            X.3Yl r3 = X.C243363Yl.LIKED
            if (r9 != r3) goto L_0x0092
            r0 = 4057(0xfd9, float:5.685E-42)
        L_0x0063:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.flowEndFail(r1, r0, r8)
            boolean r0 = r11 instanceof X.C268674do
            if (r0 == 0) goto L_0x008f
            if (r9 != r3) goto L_0x0072
            X.3Yl r3 = X.C243363Yl.NOT_LIKED
        L_0x0072:
            r10.A44(r3)
            X.05G r2 = r7.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.Jzm r0 = new X.Jzm
            r0.<init>(r3, r1, r4)
            r2.Epw(r0)
            X.2fS r1 = r7.A02
            X.0qQ.A0B(r4, r6)
            boolean r0 = r1.A0F(r4)
            if (r0 == 0) goto L_0x008f
            r1.A0B(r4)
        L_0x008f:
            X.0gF r3 = X.C60340gF.A00
        L_0x0091:
            return r3
        L_0x0092:
            r0 = 4061(0xfdd, float:5.69E-42)
            goto L_0x0063
        L_0x0095:
            r1 = 0
            goto L_0x003b
        L_0x0097:
            boolean r1 = r6 instanceof X.C297815sO
            if (r1 != 0) goto L_0x003f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a0:
            X.0eS.A00(r6)
            java.lang.Object r12 = r0.A05
            X.KWc r12 = (X.C62028KWc) r12
            X.2fS r11 = r12.A02
            java.lang.String r10 = r0.A06
            java.lang.Object r13 = r0.A02
            X.0iw r1 = r12.A00
            java.lang.String r8 = r1.getModuleName()
            java.lang.Object r1 = r0.A03
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Integer r1 = r1.A2L()
            java.lang.String r7 = X.C2606846q.A00(r1)
            int r6 = r0.A00
            java.lang.String r5 = r12.A04
            java.lang.String r4 = r12.A05
            r1 = 0
            X.0qQ.A0B(r10, r1)
            X.AnonymousClass7TF.A1B(r13, r9, r8)
            X.LE3 r2 = new X.LE3
            r2.<init>()
            r2.A04 = r10
            X.3Yl r1 = X.C243363Yl.LIKED
            if (r13 != r1) goto L_0x00fe
            r1 = 3304(0xce8, float:4.63E-42)
        L_0x00d9:
            java.lang.String r1 = X.C273654mx.A00(r1)
            r2.A01 = r1
            r2.A02 = r8
            r2.A03 = r7
            r2.A00 = r6
            r2.A05 = r5
            r2.A06 = r4
            r11.A0D(r10, r2)
            com.instagram.common.session.UserSession r1 = r12.A01
            X.1OC r2 = r2.A00(r1)
            r0.A01 = r9
            r1 = 509971458(0x1e658c02, float:1.2152112E-20)
            java.lang.Object r6 = r2.A00(r1, r0)
            if (r6 != r3) goto L_0x0015
            return r3
        L_0x00fe:
            r1 = 3456(0xd80, float:4.843E-42)
            goto L_0x00d9
        L_0x0101:
            X.1Hj r3 = X.1Hj.A02
            int r1 = r0.A01
            r11 = 0
            r10 = 2
            r8 = 1
            if (r1 == 0) goto L_0x012e
            if (r1 == r8) goto L_0x01a9
            X.0eS.A00(r6)
        L_0x010f:
            r3 = r6
            X.Kmx r3 = (X.C62821Kmx) r3
            boolean r1 = r3 instanceof X.KS7
            if (r1 == 0) goto L_0x0091
            java.lang.Object r1 = r0.A05
            com.instagram.genai.imageservice.upload.GenAIImageUploadService r1 = (com.instagram.genai.imageservice.upload.GenAIImageUploadService) r1
            X.L1a r4 = r1.A02
            if (r4 == 0) goto L_0x0091
            java.lang.String r2 = r0.A06
            r0 = r3
            X.KS7 r0 = (X.KS7) r0
            java.lang.String r1 = r0.A00
            X.Dba.A0j(r8, r2, r1)
            X.0Cp r0 = r4.A00
            r0.A01(r2, r1)
            return r3
        L_0x012e:
            X.0eS.A00(r6)
            java.lang.Object r5 = r0.A05
            com.instagram.genai.imageservice.upload.GenAIImageUploadService r5 = (com.instagram.genai.imageservice.upload.GenAIImageUploadService) r5
            X.L1a r4 = r5.A02
            if (r4 == 0) goto L_0x014f
            java.lang.String r2 = r0.A06
            r1 = 0
            X.0qQ.A0B(r2, r1)
            X.0Cp r1 = r4.A00
            java.lang.Object r1 = r1.A00(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x014f
            X.KS7 r3 = new X.KS7
            r3.<init>(r1)
            return r3
        L_0x014f:
            java.lang.Object r6 = r0.A02
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            int r9 = r6.getWidth()
            android.content.Context r1 = r5.A00
            java.io.File r7 = X.0mb.A04(r1)
            X.JwK r1 = r5.A01
            java.lang.Object r1 = r1.A00
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0194
            int r13 = X.JTT.A03(r6)
            long r4 = (long) r13
            long r1 = r1.longValue()
            int r12 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r12 < 0) goto L_0x0194
            double r4 = (double) r1
            double r1 = (double) r13
            double r4 = r4 / r1
            double r12 = java.lang.Math.sqrt(r4)
            int r1 = r6.getWidth()
            double r1 = (double) r1
            double r1 = r1 * r12
            int r4 = X.AnonymousClass1GB.A00(r1)
            int r1 = r6.getHeight()
            double r1 = (double) r1
            double r1 = r1 * r12
            int r1 = X.AnonymousClass1GB.A00(r1)
            android.graphics.Bitmap r6 = X.0fO.A00(r6, r4, r1, r8)
            X.0qQ.A0A(r6)
        L_0x0194:
            r0.A03 = r7
            r0.A00 = r9
            r0.A01 = r8
            android.graphics.Bitmap$Config r2 = r6.getConfig()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 != r1) goto L_0x01a6
            java.lang.Object r6 = com.instagram.genai.imageutils.MaskUtilsKt.A05(r6, r0)
        L_0x01a6:
            if (r6 != r3) goto L_0x01b2
            return r3
        L_0x01a9:
            int r9 = r0.A00
            java.lang.Object r7 = r0.A03
            java.io.File r7 = (java.io.File) r7
            X.0eS.A00(r6)
        L_0x01b2:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            r2 = 50
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            X.1MF.A0L(r1, r6, r7, r2)
            java.lang.Object r2 = r0.A05
            com.instagram.genai.imageservice.upload.GenAIImageUploadService r2 = (com.instagram.genai.imageservice.upload.GenAIImageUploadService) r2
            java.lang.String r1 = X.JTP.A0t(r7)
            r0.A03 = r11
            r0.A01 = r10
            java.lang.Object r6 = com.instagram.genai.imageservice.upload.GenAIImageUploadService.A00(r2, r1, r0, r9)
            if (r6 != r3) goto L_0x010f
            return r3
        L_0x01ce:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01d8:
            X.1Hj r3 = X.1Hj.A02
            int r1 = r0.A01
            r13 = 1
            if (r1 == 0) goto L_0x02e3
            if (r1 != r13) goto L_0x0368
            X.0eS.A00(r6)
        L_0x01e4:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r1 = r6 instanceof X.C239793Ih
            r8 = 0
            if (r1 == 0) goto L_0x02db
            X.3lr r7 = X.C41846B3n.A0R(r6)
            if (r7 == 0) goto L_0x0296
            java.lang.Class<X.Be5> r5 = X.C42524Be5.class
            r1 = 1959(0x7a7, float:2.745E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r1)
            r3 = 1369583436(0x51a22f4c, float:8.7072276E10)
            X.3lr r2 = r7.A03(r5, r4, r3)
            if (r2 == 0) goto L_0x029a
            java.lang.String r1 = "success"
            boolean r1 = r2.getCoercedBooleanField(r13, r1)
            if (r1 != r13) goto L_0x029a
        L_0x020a:
            java.lang.String r4 = r0.A06
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x034d
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.3lr r5 = X.C41846B3n.A0R(r6)
            if (r5 == 0) goto L_0x0293
            java.lang.Class<X.Be5> r2 = X.C42524Be5.class
            r6 = 0
            r0 = 1959(0x7a7, float:2.745E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1369583436(0x51a22f4c, float:8.7072276E10)
            X.3lr r5 = r5.getOptionalTreeField(r6, r1, r2, r0)
            if (r5 == 0) goto L_0x0293
            java.lang.Class<X.Be4> r2 = X.C42523Be4.class
            java.lang.String r1 = "themes"
            r0 = 1974750045(0x75b44b5d, float:4.5710058E32)
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r6, r1, r2, r0)
            if (r0 == 0) goto L_0x0293
        L_0x0239:
            java.util.Iterator r10 = r0.iterator()
        L_0x023d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0356
            X.3lr r9 = X.C41845B3m.A0V(r10)
            java.lang.Class<X.9ea> r8 = X.C382829ea.class
            r7 = 0
            r6 = -1350982122(0xffffffffaf79a616, float:-2.2705424E-10)
            X.3lr r5 = r9.reinterpretRequired(r7, r8, r6)
            X.9ea r5 = (X.C382829ea) r5
            X.0qQ.A07(r5)
            java.lang.Class<X.Be3> r2 = X.C42522Be3.class
            java.lang.String r1 = "alternative_themes"
            r0 = 674435221(0x28331095, float:9.940092E-15)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r9, r2, r1, r13, r0)
            java.lang.Object r0 = r0.get(r7)
            X.3lr r0 = (X.C250663lr) r0
            X.3lr r1 = r0.reinterpretRequired(r7, r8, r6)
            X.9ea r1 = (X.C382829ea) r1
            X.0qQ.A07(r1)
            java.lang.String r0 = "strong_id__"
            java.lang.String r0 = r5.getOptionalStringField(r13, r0)
            if (r0 == 0) goto L_0x023d
            com.instagram.direct.model.DirectThreadThemeInfo r15 = X.C389799qE.A00(r5, r1, r0)
            r17 = 0
            r22 = 124(0x7c, float:1.74E-43)
            X.Jvj r14 = new X.Jvj
            r18 = r17
            r19 = r17
            r20 = r17
            r21 = r17
            r16 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r3.add(r14)
            goto L_0x023d
        L_0x0293:
            X.0sn r0 = X.0sn.A00
            goto L_0x0239
        L_0x0296:
            r3 = r8
        L_0x0297:
            r5 = r8
            r1 = r8
            goto L_0x02bb
        L_0x029a:
            X.3lr r4 = r7.A03(r5, r4, r3)
            if (r4 == 0) goto L_0x0296
            java.lang.Class<X.UQ2> r3 = X.UQ2.class
            java.lang.String r2 = "error"
            r1 = 1246949136(0x4a52ef10, float:3455940.0)
            X.3lr r3 = r4.A04(r3, r2, r1)
            if (r3 == 0) goto L_0x0297
            java.lang.String r1 = "internal_error_message"
            java.lang.String r5 = r3.A07(r1)
            X.Kic r2 = X.C62605Kic.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "type"
            java.lang.Enum r1 = r3.getOptionalEnumField(r13, r1, r2)
        L_0x02bb:
            java.lang.String r6 = java.lang.String.valueOf(r1)
            if (r3 == 0) goto L_0x02d9
            java.lang.String r1 = "ui_description"
            java.lang.String r7 = r3.A09(r1)
            java.lang.String r1 = "ui_description_details"
            java.lang.String r8 = r3.A0A(r1)
        L_0x02cd:
            r9 = 6
            X.QP5 r4 = new X.QP5
            r4.<init>(r5, r6, r7, r8, r9)
            X.5sO r6 = X.C41845B3m.A0c(r4)
            goto L_0x020a
        L_0x02d9:
            r7 = r8
            goto L_0x02cd
        L_0x02db:
            java.lang.String r1 = "Network error"
            X.5sO r6 = X.JTU.A0S(r1)
            goto L_0x020a
        L_0x02e3:
            X.0eS.A00(r6)
            java.lang.Object r2 = r0.A05
            X.9qE r2 = (X.C389799qE) r2
            X.L0k r1 = r2.A00
            java.lang.String r5 = r0.A06
            int r8 = r0.A00
            r0.A02 = r2
            r0.A03 = r2
            r0.A01 = r13
            com.instagram.common.session.UserSession r1 = r1.A00
            X.1vn r2 = X.1vm.A01(r1)
            r14 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            X.0K0 r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r1 = "prompt"
            X.0Df r5 = X.C41845B3m.A03(r4, r5, r1)
            java.lang.Integer r4 = X.JTO.A0w(r8)
            java.lang.String r1 = "variant_index"
            X.0Df.A00(r5, r4, r1)
            java.lang.Integer r4 = X.JTO.A0w(r13)
            java.lang.String r1 = "num_themes"
            X.0Df.A00(r5, r4, r1)
            java.lang.String r4 = "IGDIRECT"
            java.lang.String r1 = "caller"
            X.0Df.A00(r5, r4, r1)
            java.lang.String r1 = "input"
            X.1vR r8 = X.C41847B3o.A04(r5, r6, r1)
            java.util.Map r10 = r6.getParamsCopy()
            java.util.Map r11 = r7.getParamsCopy()
            java.lang.Class<X.Be6> r12 = X.C42525Be6.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "GenerateAiThemes"
            r15 = 0
            java.lang.String r17 = "xfb_generate_ai_themes_from_prompt"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r6 = r2.A04(r7, r0)
            if (r6 != r3) goto L_0x01e4
            return r3
        L_0x034d:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0362
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0356:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0363
            java.lang.String r0 = "No themes returned from server"
            X.5sO r6 = X.JTU.A0S(r0)
        L_0x0362:
            return r6
        L_0x0363:
            X.3Ih r6 = X.C41845B3m.A0d(r3)
            return r6
        L_0x0368:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGQ) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGQ(C243363Yl r2, 1Xj r3, C62028KWc kWc, String str, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A05 = kWc;
        this.A06 = str;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGQ(Bitmap bitmap, GenAIImageUploadService genAIImageUploadService, String str, AnonymousClass4D7 r5) {
        super(2, r5);
        this.A05 = genAIImageUploadService;
        this.A06 = str;
        this.A02 = bitmap;
    }
}
