package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Phr  reason: case insensitive filesystem */
public final class C73678Phr extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C74551Pwk A01;
    public final /* synthetic */ 1fk A02;
    public final /* synthetic */ 1fi A03;
    public final /* synthetic */ C254763t0 A04;
    public final /* synthetic */ DirectThreadKey A05;
    public final /* synthetic */ AnonymousClass3Q2 A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73678Phr(C74551Pwk pwk, 1fk r3, 1fi r4, C254763t0 r5, DirectThreadKey directThreadKey, AnonymousClass3Q2 r7, String str, int i) {
        super(0);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = pwk;
        this.A07 = str;
        this.A06 = r7;
        this.A05 = directThreadKey;
        this.A04 = r5;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f9, code lost:
        if (r3 == X.1iA.A0B) goto L_0x01fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r47 = this;
            r3 = r47
            X.1fk r6 = r3.A02
            X.1fi r0 = r3.A03
            X.Pwk r7 = r3.A01
            java.lang.String r1 = r3.A07
            r25 = r1
            X.3Q2 r2 = r3.A06
            X.1iA r5 = r2.A1G
            java.util.List r13 = r2.A0L()
            java.lang.String r1 = r2.A3v
            r26 = r1
            java.lang.Long r1 = r2.A2I
            r24 = r1
            com.instagram.model.direct.DirectThreadKey r1 = r3.A05
            r20 = r1
            X.0qQ.A0A(r20)
            X.3t0 r1 = r3.A04
            r46 = r1
            int r1 = r3.A00
            r45 = r1
            X.0eM r1 = r6.A04
            java.lang.Object r2 = r1.getValue()
            com.instagram.pendingmedia.store.PendingMediaStore r2 = (com.instagram.pendingmedia.store.PendingMediaStore) r2
            X.5yB r1 = r0.A04
            java.lang.String r1 = r1.A06
            X.3Q2 r4 = r2.A03(r1)
            if (r4 == 0) goto L_0x0201
            boolean r1 = r4.A5D
            if (r1 == 0) goto L_0x0201
            X.0eM r1 = r6.A03
            java.lang.Object r11 = r1.getValue()
            X.OTH r11 = (X.OTH) r11
            X.PDA r10 = new X.PDA
            r10.<init>(r7)
            r2 = 0
            X.5yB r1 = r0.A04
            java.lang.String r3 = r1.A06
            com.instagram.common.session.UserSession r12 = r11.A00
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r12)
            X.3Q2 r9 = r1.A03(r3)
            if (r9 != 0) goto L_0x00db
            X.OO1 r7 = r11.A02
            java.lang.String r3 = r0.A06()
            r1 = 7200(0x1c20, float:1.009E-41)
            r7.A04(r2, r1, r3)
            X.4gN r1 = X.C63565KzE.A02
            r10.DTM(r1, r2)
        L_0x006f:
            com.instagram.common.session.UserSession r7 = r6.A00
            r3 = 2
            X.0qQ.A0B(r5, r3)
            X.1iA r6 = X.1iA.A0Q
            if (r5 != r6) goto L_0x0094
            java.lang.String r1 = r4.A2N
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r10 = X.C66834MdS.A06(r1)
            X.5yB r1 = r0.A04
            boolean r1 = r1.A0B
            r8 = r0
            r9 = r46
            r11 = r2
            r12 = r45
            r13 = r1
            X.O0V.A00(r7, r8, r9, r10, r11, r12, r13)
        L_0x0091:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0094:
            X.1iA r1 = X.1iA.A09
            if (r5 != r1) goto L_0x0091
            java.util.List r2 = r4.A0L()
            X.0qQ.A0B(r2, r3)
            boolean r1 = X.AnonymousClass48O.A05(r45)
            if (r1 == 0) goto L_0x0091
            X.5yB r1 = r0.A04
            boolean r4 = r1.A0B
            java.util.Iterator r3 = r2.iterator()
        L_0x00ad:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0091
            X.3Q2 r2 = X.JTO.A0m(r3)
            X.1iA r1 = r2.A1G
            if (r1 != r6) goto L_0x00ad
            if (r4 == 0) goto L_0x00d4
            java.lang.String r1 = r2.A2N
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r10 = X.C66834MdS.A06(r1)
        L_0x00c7:
            java.lang.String r1 = r2.A33
            r8 = r0
            r9 = r46
            r11 = r1
            r12 = r45
            r13 = r4
            X.O0V.A00(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00ad
        L_0x00d4:
            java.lang.Long r1 = r2.A2I
            java.lang.String r10 = java.lang.String.valueOf(r1)
            goto L_0x00c7
        L_0x00db:
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            java.util.List r1 = r9.A0L()
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            java.lang.String r16 = "Required value was null."
            if (r1 == 0) goto L_0x016a
            com.instagram.direct.armadilloexpress.transportpayload.Collection r1 = com.instagram.direct.armadilloexpress.transportpayload.Collection.DEFAULT_INSTANCE
            X.R4O r8 = r1.A0I()
            X.0qQ.A07(r8)
            java.util.List r1 = r9.A0L()
            java.util.Iterator r15 = r1.iterator()
        L_0x00fc:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x013f
            X.3Q2 r13 = X.JTO.A0m(r15)
            java.lang.String r1 = r13.A2N
            if (r1 == 0) goto L_0x0622
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r3 = X.C66834MdS.A03(r1)
            boolean r1 = r13.A12()
            if (r1 == 0) goto L_0x013c
            java.lang.String r1 = r13.A3V
        L_0x0116:
            if (r1 == 0) goto L_0x061d
            if (r3 == 0) goto L_0x0618
            r7.put(r1, r3)
            com.instagram.direct.armadilloexpress.transportpayload.Media r14 = X.OTH.A00(r3, r11, r0, r13)
            if (r14 == 0) goto L_0x00fc
            X.R5b r13 = X.C66580MXl.A0L(r8)
            com.instagram.direct.armadilloexpress.transportpayload.Collection r13 = (com.instagram.direct.armadilloexpress.transportpayload.Collection) r13
            X.TnY r3 = r13.media_
            r1 = r3
            X.TRv r1 = (X.C13255TRv) r1
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x0138
            X.TnY r3 = X.R5b.A06(r3)
            r13.media_ = r3
        L_0x0138:
            r3.add(r14)
            goto L_0x00fc
        L_0x013c:
            java.lang.String r1 = r13.A33
            goto L_0x0116
        L_0x013f:
            X.R5b r1 = r8.A00
            com.instagram.direct.armadilloexpress.transportpayload.Collection r1 = (com.instagram.direct.armadilloexpress.transportpayload.Collection) r1
            X.TnY r1 = r1.media_
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            int r3 = r1.size()
            java.util.List r1 = r9.A0L()
            int r1 = r1.size()
            if (r3 == r1) goto L_0x015e
            X.4gN r1 = X.C63565KzE.A00
            r10.DTM(r1, r2)
            goto L_0x006f
        L_0x015e:
            X.NFl r13 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.A00()
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r3 = X.C66582MXn.A0Q(r13, r8)
            r1 = 7
            r3.addMessageContentCase_ = r1
            goto L_0x019f
        L_0x016a:
            java.lang.String r1 = r9.A2N
            if (r1 == 0) goto L_0x017f
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r3 = X.C66834MdS.A03(r1)
        L_0x0172:
            com.instagram.direct.armadilloexpress.transportpayload.Media r8 = X.OTH.A00(r3, r11, r0, r9)
            if (r8 != 0) goto L_0x0181
            X.4gN r1 = X.C63565KzE.A00
            r10.DTM(r1, r2)
            goto L_0x006f
        L_0x017f:
            r3 = r2
            goto L_0x0172
        L_0x0181:
            boolean r1 = r9.A12()
            if (r1 == 0) goto L_0x01fe
            java.lang.String r1 = r9.A3V
        L_0x0189:
            if (r1 == 0) goto L_0x0635
            if (r3 == 0) goto L_0x0630
            r7.put(r1, r3)
            X.NFl r13 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.A00()
            X.R5b r3 = X.C66580MXl.A0L(r13)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r3 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent) r3
            r3.addMessageContent_ = r8
            r1 = 5
            r3.addMessageContentCase_ = r1
        L_0x019f:
            X.R5b r1 = r13.A02()
            X.0qQ.A0A(r1)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r1 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent) r1
            X.OVn r13 = X.C70992OVn.A00
            r14 = r12
            r15 = r1
            r16 = r2
            r17 = r2
            r18 = r0
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r13 = r13.A01(r14, r15, r16, r17, r18)
            X.5yB r3 = r0.A04
            X.0qQ.A07(r3)
            X.3Q2 r1 = X.C66582MXn.A0g(r12, r3)
            if (r1 == 0) goto L_0x0627
            X.PDF r8 = new X.PDF
            r8.<init>(r12, r10, r1, r7)
            X.Ma7 r12 = r11.A01
            java.lang.Object r7 = X.C66582MXn.A0q(r0)
            com.instagram.model.direct.DirectThreadKey r7 = (com.instagram.model.direct.DirectThreadKey) r7
            X.1iA r3 = r9.A1G
            X.1iA r1 = X.1iA.A07
            if (r3 != r1) goto L_0x01df
            r17 = 3
        L_0x01d6:
            r14 = r8
            r15 = r0
            r16 = r7
            r12.A02(r13, r14, r15, r16, r17)
            goto L_0x006f
        L_0x01df:
            boolean r1 = r9.A0y()
            if (r1 == 0) goto L_0x01e8
            r17 = 1
            goto L_0x01d6
        L_0x01e8:
            boolean r1 = r9.A12()
            if (r1 == 0) goto L_0x01f1
            r17 = 2
            goto L_0x01d6
        L_0x01f1:
            X.1iA r1 = X.1iA.A09
            if (r3 == r1) goto L_0x01fb
            X.1iA r1 = X.1iA.A0B
            r17 = 0
            if (r3 != r1) goto L_0x01d6
        L_0x01fb:
            r17 = 10
            goto L_0x01d6
        L_0x01fe:
            java.lang.String r1 = r9.A33
            goto L_0x0189
        L_0x0201:
            java.lang.String r27 = r0.A06()
            X.OCA r2 = r0.A02
            r42 = 0
            if (r2 == 0) goto L_0x026f
            java.lang.String r1 = r2.A01
            r30 = r1
            java.lang.String r1 = r2.A00
            r31 = r1
        L_0x0213:
            com.instagram.model.direct.messageid.MessageIdentifier r1 = r0.A05
            X.3tI r2 = r0.A01
            r44 = r2
            X.MaY r2 = r0.A02
            java.lang.Boolean r3 = r2.A01
            r2 = 1
            boolean r21 = X.AnonymousClass7TF.A1Y(r3, r2)
            boolean r14 = r0.A08
            X.9JH r3 = r0.A00
            r43 = r3
            java.lang.String r9 = r0.A07
            X.NM7 r3 = new X.NM7
            r15 = r3
            r16 = r2
            r17 = r1
            r18 = r6
            r19 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            X.MaY r11 = r0.A02
            X.0eM r8 = r6.A02
            java.lang.Object r10 = r8.getValue()
            X.5D0 r10 = (X.AnonymousClass5D0) r10
            java.lang.String r8 = r0.A05
            r10.A01(r8)
            if (r1 == 0) goto L_0x0296
            if (r13 == 0) goto L_0x0296
            boolean r8 = r13.isEmpty()
            if (r8 != 0) goto L_0x0296
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r13.iterator()
        L_0x0259:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0274
            X.3Q2 r0 = X.JTO.A0m(r2)
            java.lang.Long r0 = r0.A2I
            if (r0 == 0) goto L_0x0259
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.add(r0)
            goto L_0x0259
        L_0x026f:
            r30 = r42
            r31 = r42
            goto L_0x0213
        L_0x0274:
            com.instagram.common.session.UserSession r8 = r6.A00
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            r9 = r20
            r10 = r1
            r12 = r27
            r13 = r4
            X.1NY r2 = X.C71151OeJ.A03(r8, r9, r10, r11, r12, r13)
            java.lang.Class<X.NHZ> r1 = X.NHZ.class
            java.lang.Class<X.OQJ> r0 = X.OQJ.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            X.NHl r0 = new X.NHl
            r0.<init>(r3, r8, r7)
            r1.A00 = r0
            X.1ES.A03(r1)
            goto L_0x0091
        L_0x0296:
            X.1iA r1 = X.1iA.A09
            if (r5 != r1) goto L_0x04f0
            if (r13 == 0) goto L_0x04f0
            boolean r1 = r13.isEmpty()
            if (r1 != 0) goto L_0x04f0
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r13.iterator()
        L_0x02aa:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x02c9
            java.lang.Object r5 = r10.next()
            r1 = r5
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            if (r1 == 0) goto L_0x02aa
            com.instagram.api.schemas.MediaGenAIDetectionMethod r4 = r1.A0w
            if (r4 == 0) goto L_0x02aa
            com.instagram.api.schemas.MediaGenAIDetectionMethod r1 = com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B
            if (r4 == r1) goto L_0x02aa
            com.instagram.api.schemas.MediaGenAIDetectionMethod r1 = com.instagram.api.schemas.MediaGenAIDetectionMethod.MANUAL_OVERRIDE_LABEL_OFF
            if (r4 == r1) goto L_0x02aa
            r8.add(r5)
            goto L_0x02aa
        L_0x02c9:
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r4 = r8.iterator()
        L_0x02d1:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x02e5
            X.3Q2 r1 = X.JTO.A0m(r4)
            java.lang.Long r1 = r1.A2I
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r5.add(r1)
            goto L_0x02d1
        L_0x02e5:
            com.instagram.common.session.UserSession r4 = r6.A00
            java.lang.String r12 = r0.A05
            boolean r10 = r11.A09
            java.lang.String r8 = r11.A04
            X.ODs r6 = r11.A00
            boolean r1 = r11.A07
            boolean r11 = r11.A0A
            X.1NY r15 = X.DbU.A0N(r4)
            r17 = r20
            r18 = r27
            r19 = r12
            r20 = r8
            r21 = r10
            r22 = r1
            r23 = r11
            r16 = r6
            X.C71151OeJ.A0A(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r13)
            java.util.Iterator r6 = r13.iterator()
        L_0x0312:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0324
            X.3Q2 r1 = X.JTO.A0m(r6)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r1.A13
            java.lang.String r1 = r1.A08
            r8.add(r1)
            goto L_0x0312
        L_0x0324:
            r1 = 0
            X.0qQ.A0B(r8, r1)
            java.util.List r1 = X.00k.A0X(r8)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r1.iterator()
        L_0x0334:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0349
            java.lang.Object r6 = r10.next()
            r1 = r6
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = X.00l.A0W(r1)
            X.DbV.A1U(r6, r8, r1)
            goto L_0x0334
        L_0x0349:
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r13)
            java.util.Iterator r6 = r13.iterator()
        L_0x0351:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0363
            X.3Q2 r1 = X.JTO.A0m(r6)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r1.A13
            java.lang.String r1 = r1.A07
            r10.add(r1)
            goto L_0x0351
        L_0x0363:
            java.util.List r6 = X.C71146Oe3.A02(r10)
            boolean r1 = X.AnonymousClass7TE.A1b(r8)
            if (r1 != 0) goto L_0x0373
            boolean r1 = X.AnonymousClass7TE.A1b(r6)
            if (r1 == 0) goto L_0x038c
        L_0x0373:
            X.C71146Oe3.A07(r15, r8)
            X.0qQ.A0B(r6, r2)
            java.util.List r6 = X.C71146Oe3.A02(r6)
            boolean r1 = X.AnonymousClass7TE.A1b(r6)
            if (r1 == 0) goto L_0x038c
            java.lang.String r6 = X.C71146Oe3.A01(r6)
            java.lang.String r1 = "horizon_world_ids"
            r15.A9m(r1, r6)
        L_0x038c:
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r13)
            java.util.Iterator r6 = r13.iterator()
        L_0x0394:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x03a4
            X.3Q2 r1 = X.JTO.A0m(r6)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r1.A13
            r8.add(r1)
            goto L_0x0394
        L_0x03a4:
            X.C71146Oe3.A08(r15, r8)
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r11 = r13.iterator()
            r10 = 0
        L_0x03b0:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x03dd
            X.3Q2 r1 = X.JTO.A0m(r11)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r1.A13
            java.lang.String r6 = r1.A05
            if (r6 == 0) goto L_0x03b0
            X.0sn r1 = X.0sn.A00
            X.Kp0 r1 = X.C59737JVv.A01(r4, r6, r1)
            if (r1 == 0) goto L_0x03b0
            boolean r1 = r1.A03()
            if (r1 != r2) goto L_0x03b0
            java.lang.Number r1 = X.JTO.A0z(r6, r8)
            int r1 = X.AnonymousClass7TG.A0A(r1)
            int r1 = r1 + 1
            X.C66581MXm.A1S(r6, r8, r1)
            r10 = 1
            goto L_0x03b0
        L_0x03dd:
            if (r10 == 0) goto L_0x044b
            org.json.JSONArray r10 = new org.json.JSONArray
            r10.<init>()
            java.util.Set r1 = r8.keySet()
            java.util.Iterator r11 = r1.iterator()
        L_0x03ec:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0410
            java.lang.Object r2 = r11.next()
            org.json.JSONObject r6 = X.DbS.A11()
            java.lang.String r1 = "name"
            r6.put(r1, r2)
            java.lang.Number r1 = X.JTO.A0z(r2, r8)
            int r2 = X.AnonymousClass7TG.A0A(r1)
            java.lang.String r1 = "count"
            r6.put(r1, r2)
            r10.put(r6)
            goto L_0x03ec
        L_0x0410:
            java.lang.String r2 = r10.toString()
            java.lang.String r1 = "attributed_devices"
            r15.A9m(r1, r2)
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.Iterator r6 = r13.iterator()
        L_0x0422:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x043c
            X.3Q2 r1 = X.JTO.A0m(r6)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r1.A13
            java.lang.String r2 = r1.A0A
            if (r2 == 0) goto L_0x0422
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0422
            r8.put(r2)
            goto L_0x0422
        L_0x043c:
            int r1 = r8.length()
            if (r1 <= 0) goto L_0x044b
            java.lang.String r2 = r8.toString()
            java.lang.String r1 = "wearable_shared_media_global_ids"
            r15.A9m(r1, r2)
        L_0x044b:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r13.iterator()
        L_0x0453:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0465
            X.3Q2 r1 = X.JTO.A0m(r6)
            java.lang.Long r1 = r1.A2I
            if (r1 == 0) goto L_0x0453
            X.DbU.A1X(r1, r2)
            goto L_0x0453
        L_0x0465:
            java.lang.String r1 = "direct_v2/threads/broadcast/media_attachment_list/"
            r15.A0A(r1)
            java.lang.String r1 = "allow_full_aspect_ratio"
            java.lang.String r6 = "true"
            r15.A9m(r1, r6)
            java.lang.String r8 = "["
            r1 = 44
            X.3El r1 = X.C239023El.A00(r1)
            java.lang.String r2 = r1.A02(r2)
            java.lang.String r1 = "]"
            java.lang.String r2 = X.002.A0g(r8, r2, r1)
            java.lang.String r1 = "attachment_fbids"
            r15.A9m(r1, r2)
            if (r14 == 0) goto L_0x048f
            java.lang.String r1 = "should_skip_genai_eval"
            r15.A9m(r1, r6)
        L_0x048f:
            if (r9 == 0) goto L_0x0496
            java.lang.String r1 = "ai_assistant_extras"
            r15.A9m(r1, r9)
        L_0x0496:
            java.lang.String r2 = X.C51970G9q.A0k(r5)
            java.lang.String r1 = "ai_generated_attachment_fbids"
            r15.A9m(r1, r2)
            java.lang.Class<X.NHZ> r2 = X.NHZ.class
            java.lang.Class<X.OQJ> r1 = X.OQJ.class
            X.1OC r2 = X.DbU.A0S(r15, r2, r1)
            X.NHl r1 = new X.NHl
            r1.<init>(r3, r4, r7)
            r2.A00 = r1
            X.1ES.A03(r2)
            boolean r1 = X.AnonymousClass48O.A05(r45)
            if (r1 == 0) goto L_0x0091
            X.5yB r1 = r0.A04
            boolean r6 = r1.A0B
            java.util.Iterator r5 = r13.iterator()
        L_0x04bf:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0091
            X.3Q2 r3 = X.JTO.A0m(r5)
            X.1iA r2 = r3.A1G
            X.1iA r1 = X.1iA.A0Q
            if (r2 != r1) goto L_0x04bf
            if (r6 == 0) goto L_0x04e9
            java.lang.String r1 = r3.A2N
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r10 = X.C66834MdS.A06(r1)
        L_0x04db:
            java.lang.String r1 = r3.A33
            r7 = r4
            r8 = r0
            r9 = r46
            r11 = r1
            r12 = r45
            r13 = r6
            X.O0V.A00(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x04bf
        L_0x04e9:
            java.lang.Long r1 = r3.A2I
            java.lang.String r10 = java.lang.String.valueOf(r1)
            goto L_0x04db
        L_0x04f0:
            boolean r1 = r0 instanceof X.C68968Nbv
            if (r1 == 0) goto L_0x0543
            r8 = r0
            X.Nbv r8 = (X.C68968Nbv) r8
            java.lang.String r1 = r8.A02
            r32 = r1
            java.lang.String r1 = r8.A01
            r19 = r1
            boolean r10 = r8.A03
            X.QP5 r1 = r8.A00
            r18 = r1
        L_0x0505:
            if (r4 == 0) goto L_0x0586
            java.util.List r1 = X.AnonymousClass7TE.A1I(r4)
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r16 = r1.iterator()
            r15 = 0
        L_0x0514:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x054b
            X.3Q2 r1 = X.JTO.A0m(r16)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r1.A13
            java.lang.String r12 = r1.A05
            if (r12 == 0) goto L_0x0514
            com.instagram.common.session.UserSession r8 = r6.A00
            X.0sn r1 = X.0sn.A00
            X.Kp0 r1 = X.C59737JVv.A01(r8, r12, r1)
            if (r1 == 0) goto L_0x0514
            boolean r1 = r1.A03()
            if (r1 != r2) goto L_0x0514
            java.lang.Number r1 = X.JTO.A0z(r12, r13)
            int r1 = X.AnonymousClass7TG.A0A(r1)
            int r1 = r1 + 1
            X.C66581MXm.A1S(r12, r13, r1)
            r15 = 1
            goto L_0x0514
        L_0x0543:
            r32 = r42
            r19 = r42
            r18 = r42
            r10 = 0
            goto L_0x0505
        L_0x054b:
            if (r15 != 0) goto L_0x0550
            java.lang.String r34 = ""
            goto L_0x0588
        L_0x0550:
            org.json.JSONArray r12 = new org.json.JSONArray
            r12.<init>()
            java.util.Set r1 = r13.keySet()
            java.util.Iterator r15 = r1.iterator()
        L_0x055d:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0581
            java.lang.Object r2 = r15.next()
            org.json.JSONObject r8 = X.DbS.A11()
            java.lang.String r1 = "name"
            r8.put(r1, r2)
            java.lang.Number r1 = X.JTO.A0z(r2, r13)
            int r2 = X.AnonymousClass7TG.A0A(r1)
            java.lang.String r1 = "count"
            r8.put(r1, r2)
            r12.put(r8)
            goto L_0x055d
        L_0x0581:
            java.lang.String r34 = X.DbT.A10(r12)
            goto L_0x0588
        L_0x0586:
            java.lang.String r34 = ""
        L_0x0588:
            if (r4 == 0) goto L_0x0615
            com.instagram.api.schemas.MediaGenAIDetectionMethod r2 = r4.A0w
            if (r2 == 0) goto L_0x0615
            com.instagram.api.schemas.MediaGenAIDetectionMethod r1 = com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B
            if (r2 == r1) goto L_0x0615
            com.instagram.api.schemas.MediaGenAIDetectionMethod r1 = com.instagram.api.schemas.MediaGenAIDetectionMethod.MANUAL_OVERRIDE_LABEL_OFF
            if (r2 == r1) goto L_0x0615
            java.lang.Long r1 = r4.A2I
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.List r36 = X.AnonymousClass7TE.A1I(r1)
        L_0x05a0:
            com.instagram.common.session.UserSession r2 = r6.A00
            java.lang.String r1 = r0.A05
            r17 = r1
            boolean r1 = r11.A09
            r16 = r1
            java.lang.String r15 = r11.A04
            X.ODs r13 = r11.A00
            boolean r12 = r11.A07
            java.lang.Boolean r6 = r0.A06
            if (r4 == 0) goto L_0x05b8
            com.instagram.common.gallery.metadata.MediaUploadMetadata r4 = r4.A13
            if (r4 != 0) goto L_0x05bc
        L_0x05b8:
            X.5yB r1 = r0.A04
            com.instagram.common.gallery.metadata.MediaUploadMetadata r4 = r1.A00
        L_0x05bc:
            boolean r1 = r11.A0A
            java.lang.Boolean r8 = r11.A01
            r21 = r5
            r22 = r6
            r23 = r8
            r28 = r17
            r29 = r15
            r33 = r19
            r35 = r9
            r37 = r16
            r38 = r12
            r39 = r10
            r40 = r1
            r41 = r14
            r14 = r43
            r15 = r18
            r16 = r4
            r17 = r2
            r18 = r13
            r19 = r44
            X.1NY r6 = X.C71151OeJ.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            java.lang.Class<X.NHZ> r4 = X.NHZ.class
            java.lang.Class<X.OQJ> r1 = X.OQJ.class
            X.1OC r4 = X.DbU.A0S(r6, r4, r1)
            X.NHl r1 = new X.NHl
            r1.<init>(r3, r2, r7)
            r4.A00 = r1
            X.1ES.A03(r4)
            X.1iA r1 = X.1iA.A0Q
            if (r5 != r1) goto L_0x0091
            java.lang.String r41 = X.DbX.A0t(r24)
            X.5yB r1 = r0.A04
            boolean r1 = r1.A0B
            r38 = r2
            r39 = r0
            r40 = r46
            r43 = r45
            r44 = r1
            X.O0V.A00(r38, r39, r40, r41, r42, r43, r44)
            goto L_0x0091
        L_0x0615:
            r36 = r42
            goto L_0x05a0
        L_0x0618:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x061d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0622:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0627:
            java.lang.String r1 = "Cannot find pending media for key "
            java.lang.String r0 = r3.A06
            java.lang.IllegalStateException r0 = X.DbW.A0c(r1, r0)
            throw r0
        L_0x0630:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0635:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73678Phr.invoke():java.lang.Object");
    }
}
