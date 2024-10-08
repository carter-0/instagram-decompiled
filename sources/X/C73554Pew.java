package X;

import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import java.util.List;

/* renamed from: X.Pew  reason: case insensitive filesystem */
public final class C73554Pew extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;
    public final Object A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73554Pew(C69066Ne3 ne3, String str, AnonymousClass4D7 r4) {
        super(1, r4);
        this.A04 = ne3;
        this.A05 = str;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Pew, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.Pew, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r9) {
        AnonymousClass4D7 r7 = r9;
        if (this.A03 != 0) {
            return new C73554Pew((OpalAudienceSelectorRepository) this.A04, (Integer) this.A01, this.A05, (List) this.A02, r7);
        }
        return new C73554Pew((C69066Ne3) this.A04, this.A05, r9);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C73554Pew) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Pew, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r3 = r22
            r1 = r23
            int r0 = r3.A03
            if (r0 == 0) goto L_0x006f
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r8 = 3
            r7 = 2
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0018
            X.0eS.A00(r1)
        L_0x0015:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0018:
            X.0eS.A00(r1)
            java.lang.Object r4 = r3.A04
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository r4 = (com.instagram.opal.impl.data.OpalAudienceSelectorRepository) r4
            X.05G r1 = r4.A07
            java.lang.Object r15 = r3.A02
            java.util.List r15 = (java.util.List) r15
            java.lang.String r13 = r3.A05
            java.lang.Object r12 = r3.A01
            java.lang.Integer r12 = (java.lang.Integer) r12
        L_0x002b:
            java.lang.Object r0 = r1.getValue()
            r9 = r0
            X.Jvm r9 = (X.C61048Jvm) r9
            X.KhB r10 = X.C62520KhB.Loading
            r11 = 0
            r18 = 197(0xc5, float:2.76E-43)
            r14 = r11
            r16 = r11
            r17 = r5
            X.Jvm r9 = X.C61048Jvm.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = r1.AIY(r0, r9)
            if (r0 == 0) goto L_0x002b
            int r1 = r12.intValue()
            r0 = -1
            if (r1 == r0) goto L_0x005f
            if (r1 == r5) goto L_0x0058
            if (r1 == r7) goto L_0x0066
            if (r1 == r6) goto L_0x005f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0058:
            r3.A00 = r6
            java.lang.Object r0 = com.instagram.opal.impl.data.OpalAudienceSelectorRepository.A00(r4, r13, r3)
            goto L_0x006c
        L_0x005f:
            r3.A00 = r8
            java.lang.Object r0 = com.instagram.opal.impl.data.OpalAudienceSelectorRepository.A01(r4, r3)
            goto L_0x006c
        L_0x0066:
            r3.A00 = r7
            java.lang.Object r0 = com.instagram.opal.impl.data.OpalAudienceSelectorRepository.A02(r4, r3)
        L_0x006c:
            if (r0 != r2) goto L_0x0015
            return r2
        L_0x006f:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r8 = 1
            if (r0 == 0) goto L_0x00b8
            if (r0 != r8) goto L_0x0206
            java.lang.Object r4 = r3.A02
            java.lang.Object r6 = r3.A01
            java.util.List r6 = (java.util.List) r6
            X.0eS.A00(r1)
        L_0x0081:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r3 = r3.A04
            X.Ne3 r3 = (X.C69066Ne3) r3
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01b4
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            X.B72 r2 = (X.B72) r2
            X.8wb r0 = r2.A05
            java.util.List r0 = r0.A05
            java.util.ArrayList r7 = X.DbV.A15(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x009d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x013f
            java.lang.Object r1 = r5.next()
            r0 = r1
            X.5xS r0 = (X.C300585xS) r0
            java.util.List r0 = r0.A1c
            java.util.List r0 = X.C51966G9m.A1J(r0)
            boolean r0 = r0.isEmpty()
            X.DbV.A1U(r1, r7, r0)
            goto L_0x009d
        L_0x00b8:
            X.0eS.A00(r1)
            java.lang.Object r9 = r3.A04
            X.Ne3 r9 = (X.C69066Ne3) r9
            X.05G r7 = r9.A05
            java.lang.Object r5 = r7.getValue()
            X.NoW r5 = (X.C69588NoW) r5
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.lang.Object r1 = r7.getValue()
            X.NoW r1 = (X.C69588NoW) r1
            boolean r0 = r1 instanceof X.NW1
            if (r0 == 0) goto L_0x013b
            X.NW1 r1 = (X.NW1) r1
            java.lang.Object r0 = r1.A00
            X.JwJ r0 = (X.C61081JwJ) r0
            java.lang.String r4 = r0.A01
            if (r4 == 0) goto L_0x013c
            boolean r0 = r5 instanceof X.NW1
            if (r0 == 0) goto L_0x00f8
            X.NW1 r5 = (X.NW1) r5
            java.lang.Object r1 = r5.A00
            X.JwJ r1 = (X.C61081JwJ) r1
            java.lang.Object r0 = r1.A00
            java.util.Collection r0 = (java.util.Collection) r0
            r6.addAll(r0)
            X.NW2 r0 = new X.NW2
            r0.<init>(r1)
        L_0x00f5:
            r7.Epw(r0)
        L_0x00f8:
            com.instagram.common.session.UserSession r0 = r9.A02
            java.lang.String r1 = r3.A05
            r3.A01 = r6
            r3.A02 = r4
            r3.A00 = r8
            X.1NY r5 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "direct_v2/inbox/"
            r5.A0A(r0)
            java.lang.String r0 = "ig_media_igid"
            r5.A9m(r0, r1)
            java.lang.String r1 = "thread_message_limit"
            r0 = 5
            r5.A0C(r1, r0)
            java.lang.String r1 = "limit"
            r0 = 20
            r5.A0C(r1, r0)
            java.lang.String r1 = "visual_message_return_type"
            java.lang.String r0 = "unseen"
            r5.A9m(r1, r0)
            java.lang.String r0 = "cursor"
            r5.A9m(r0, r4)
            java.lang.Class<X.B72> r1 = X.B72.class
            java.lang.Class<X.B73> r0 = X.B73.class
            X.1OC r1 = X.DbU.A0S(r5, r1, r0)
            r0 = 1316016357(0x4e70d0e5, float:1.01005549E9)
            java.lang.Object r1 = r1.A00(r0, r3)
            if (r1 != r2) goto L_0x0081
            return r2
        L_0x013b:
            r4 = 0
        L_0x013c:
            X.NW4 r0 = X.NW4.A00
            goto L_0x00f5
        L_0x013f:
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r12 = r7.iterator()
        L_0x0147:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r10 = r12.next()
            X.8wd r10 = (X.C370538wd) r10
            X.0qQ.A0A(r10)
            com.instagram.common.session.UserSession r8 = r3.A02
            X.3U9 r7 = X.AnonymousClass3UD.A00(r8, r10)
            java.lang.String r0 = r8.A06
            X.3SZ r9 = r7.Aue(r0)
            java.util.List r0 = r10.A07
            X.48S r1 = new X.48S
            r1.<init>(r8, r7, r0)
            r0 = 6
            int r18 = r1.A0F(r9, r0)
            X.3su r11 = r10.A00
            android.content.Context r1 = r3.A00
            java.lang.String r0 = X.C66713MbK.A00
            com.instagram.user.model.User r0 = X.AnonymousClass48N.A04(r8, r11, r7)
            r9 = 0
            java.lang.CharSequence r0 = X.C66713MbK.A00(r1, r8, r11, r7, r0)
            java.lang.String r17 = r0.toString()
            java.lang.String r1 = r10.A1D
            X.0qQ.A07(r1)
            java.lang.Long r0 = r10.A19
            if (r0 != 0) goto L_0x01af
            r19 = 0
        L_0x018c:
            X.3su r14 = r10.A00
            java.util.List r0 = r10.A1c
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r15 = r0.get(r9)
            X.0qQ.A07(r15)
            com.instagram.user.model.User r15 = (com.instagram.user.model.User) r15
            boolean r21 = r7.Cdv(r8)
            X.N2K r13 = new X.N2K
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r21)
            X.C69066Ne3.A00(r3, r13)
            r5.add(r13)
            goto L_0x0147
        L_0x01af:
            long r19 = r0.longValue()
            goto L_0x018c
        L_0x01b4:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x01d9
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01bd:
            r6.addAll(r5)
            X.05G r5 = r3.A05
            X.8wb r0 = r2.A05
            java.lang.String r2 = r0.A03
            r0 = 39
            X.JwJ r1 = new X.JwJ
            r1.<init>((java.util.List) r6, (int) r0, (java.lang.String) r2)
            X.NW1 r0 = new X.NW1
            r0.<init>(r1)
            r5.Epw(r0)
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x01d9:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x01fd
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0201
            X.OSj r2 = r3.A03
            if (r4 != 0) goto L_0x01fe
            java.lang.String r1 = "initial_loading_error"
        L_0x01e7:
            java.lang.String r0 = "error_message"
            java.util.Map r1 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r0 = "igd_campaign_message_fetch_error"
            X.C70936OSj.A00(r2, r0, r1)
            X.05G r1 = r3.A05
            X.NW3 r0 = X.NW3.A00
            r1.Epw(r0)
            X.5sO r1 = X.DbU.A0f()
        L_0x01fd:
            return r1
        L_0x01fe:
            java.lang.String r1 = "loading_more_error"
            goto L_0x01e7
        L_0x0201:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0206:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73554Pew.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73554Pew(OpalAudienceSelectorRepository opalAudienceSelectorRepository, Integer num, String str, List list, AnonymousClass4D7 r6) {
        super(1, r6);
        this.A04 = opalAudienceSelectorRepository;
        this.A01 = num;
        this.A05 = str;
        this.A02 = list;
    }
}
