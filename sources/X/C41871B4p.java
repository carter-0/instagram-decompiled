package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.B4p  reason: case insensitive filesystem */
public final class C41871B4p extends 1P0 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C46199DQb A02;
    public final /* synthetic */ 1Av A03;
    public final /* synthetic */ String A04;

    public C41871B4p(UserSession userSession, C46199DQb dQb, 1Av r3, String str, long j) {
        this.A03 = r3;
        this.A00 = j;
        this.A02 = dQb;
        this.A01 = userSession;
        this.A04 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r32) {
        /*
            r31 = this;
            r1 = r32
            r0 = 1525619536(0x5aef1b50, float:3.36512749E16)
            int r12 = X.AnonymousClass0fD.A03(r0)
            X.3JC r1 = (X.AnonymousClass3JC) r1
            r0 = 1644767923(0x62092ab3, float:6.325702E20)
            int r11 = X.AnonymousClass0fD.A03(r0)
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r4 = r1.A01
            X.3lr r4 = (X.C250663lr) r4
            r8 = 0
            if (r4 == 0) goto L_0x0196
            java.lang.Class<X.Bq6> r3 = X.Bq6.class
            java.lang.String r1 = "ig_proactive_warning_epd_banner_query(target_user_id:$target_user_id)"
            r0 = 135736105(0x8172b29, float:4.5490644E-34)
            X.3lr r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
        L_0x0028:
            r3 = r31
            X.1Av r0 = r3.A03
            long r13 = r3.A00
            java.lang.String r7 = java.lang.String.valueOf(r13)
            r0.A0p(r7)
            if (r1 == 0) goto L_0x0191
            com.instagram.common.session.UserSession r15 = r3.A01
            java.lang.String r9 = ""
            java.lang.Class<X.Bq5> r6 = X.Bq5.class
            java.lang.String r5 = "title"
            r4 = 208507619(0xc6d92e3, float:1.8302018E-31)
            X.3lr r4 = r1.getOptionalTreeField(r2, r5, r6, r4)
            r16 = 0
            if (r4 == 0) goto L_0x0186
            java.lang.String r21 = X.C41845B3m.A0l(r4, r2)
        L_0x004e:
            java.lang.Class<X.Bq4> r6 = X.Bq4.class
            java.lang.String r5 = "subtitle"
            r4 = -1521802804(0xffffffffa54b21cc, float:-1.7618894E-16)
            X.3lr r4 = r1.A02(r6, r5, r4)
            if (r4 == 0) goto L_0x0182
            java.lang.String r22 = X.C41845B3m.A0l(r4, r2)
        L_0x005f:
            java.lang.Class<X.Bq1> r6 = X.Bq1.class
            java.lang.String r5 = "primary_button_label"
            r4 = 1364813695(0x5159677f, float:5.8359017E10)
            X.3lr r4 = r1.A04(r6, r5, r4)
            if (r4 == 0) goto L_0x017e
            java.lang.String r25 = X.C41845B3m.A0l(r4, r2)
        L_0x0070:
            java.lang.Class<X.Bq0> r10 = X.Bq0.class
            r6 = 3
            java.lang.String r5 = "primary_button_accessibility_label"
            r4 = -403947522(0xffffffffe7ec3ffe, float:-2.2313179E24)
            X.3lr r4 = r1.getOptionalTreeField(r6, r5, r10, r4)
            if (r4 == 0) goto L_0x017a
            java.lang.String r26 = X.C41845B3m.A0l(r4, r2)
        L_0x0082:
            java.lang.Class<X.Bq3> r10 = X.Bq3.class
            r6 = 4
            java.lang.String r5 = "secondary_button_label"
            r4 = -254247735(0xfffffffff0d87cc9, float:-5.3599694E29)
            X.3lr r4 = r1.getOptionalTreeField(r6, r5, r10, r4)
            if (r4 == 0) goto L_0x0176
            java.lang.String r27 = X.C41845B3m.A0l(r4, r2)
        L_0x0094:
            java.lang.Class<X.Bq2> r10 = X.Bq2.class
            r6 = 5
            java.lang.String r5 = "secondary_button_accessibility_label"
            r4 = -811871713(0xffffffffcf9bd21f, float:-5.228478E9)
            X.3lr r4 = r1.getOptionalTreeField(r6, r5, r10, r4)
            if (r4 == 0) goto L_0x0172
            java.lang.String r28 = X.C41845B3m.A0l(r4, r2)
        L_0x00a6:
            r5 = 6
            java.lang.String r4 = "context"
            java.lang.String r23 = r1.getOptionalStringField(r5, r4)
            kotlin.enums.EnumEntries r4 = X.C69354Njt.A02
            X.NkR r6 = X.C69387NkR.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r5 = 10
            java.lang.String r4 = "flow_type"
            java.lang.Enum r4 = r1.getOptionalEnumField(r5, r4, r6)
            X.NkR r4 = (X.C69387NkR) r4
            if (r4 == 0) goto L_0x00c1
            java.lang.String r16 = r4.name()
        L_0x00c1:
            X.Njt r16 = X.O0X.A00(r16)
            X.9sh r6 = X.C391319sh.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r5 = 7
            java.lang.String r4 = "button_layout"
            java.lang.Enum r4 = r1.getOptionalEnumField(r5, r4, r6)
            X.9sh r4 = (X.C391319sh) r4
            if (r4 == 0) goto L_0x016e
            int r5 = r4.ordinal()
            r4 = 2
            if (r5 != r4) goto L_0x016e
            java.lang.Integer r17 = X.AnonymousClass05K.A00
        L_0x00db:
            X.EWq r5 = X.C48124EWq.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r6 = 8
            java.lang.String r4 = "primary_button_style"
            java.lang.Enum r4 = r1.getOptionalEnumField(r6, r4, r5)
            X.EWq r4 = (X.C48124EWq) r4
            if (r4 == 0) goto L_0x016b
            int r6 = r4.ordinal()
            r4 = 1
            if (r6 != r4) goto L_0x016b
            java.lang.Integer r18 = X.AnonymousClass05K.A00
        L_0x00f2:
            r6 = 9
            java.lang.String r4 = "secondary_button_style"
            java.lang.Enum r4 = r1.getOptionalEnumField(r6, r4, r5)
            X.EWq r4 = (X.C48124EWq) r4
            if (r4 == 0) goto L_0x0168
            int r5 = r4.ordinal()
            r4 = 1
            if (r5 != r4) goto L_0x0168
            java.lang.Integer r19 = X.AnonymousClass05K.A00
        L_0x0107:
            X.NkQ r6 = X.C69386NkQ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r5 = 11
            java.lang.String r4 = "banner_position"
            java.lang.Enum r4 = r1.getOptionalEnumField(r5, r4, r6)
            X.NkQ r4 = (X.C69386NkQ) r4
            if (r4 == 0) goto L_0x0165
            int r4 = r4.ordinal()
            r5 = 2
            if (r4 == r5) goto L_0x0162
            r5 = 1
            if (r4 != r5) goto L_0x0165
            java.lang.Integer r20 = X.AnonymousClass05K.A0C
        L_0x0121:
            r24 = r9
            r29 = r13
            X.N3L r10 = X.C66832MdQ.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r13 = r3.A04
            java.lang.Class<X.Bpz> r14 = X.C43009Bpz.class
            r6 = 12
            java.lang.String r5 = "extra_data"
            r4 = -810558430(0xffffffffcfafdc22, float:-5.9008788E9)
            X.3lr r4 = r1.getOptionalTreeField(r6, r5, r14, r4)
            if (r4 == 0) goto L_0x0140
            java.lang.String r1 = "is_odnc_pre_send_inferencing_eligible_thread"
            java.lang.Boolean r8 = X.C41846B3n.A0d(r4, r1, r2)
        L_0x0140:
            X.C66832MdQ.A02(r0, r8, r13)
            boolean r0 = r0.A25(r9, r7)
            if (r0 != 0) goto L_0x0191
            if (r10 == 0) goto L_0x018a
            X.DQb r1 = r3.A02
            X.3xQ r0 = new X.3xQ
            r0.<init>(r10)
        L_0x0152:
            r1.DOY(r0)
            r0 = -2062589185(0xffffffff850f62ff, float:-6.7420104E-36)
            X.AnonymousClass0fD.A0A(r0, r11)
            r0 = -715156030(0xffffffffd55f95c2, float:-1.53646436E13)
            X.AnonymousClass0fD.A0A(r0, r12)
            return
        L_0x0162:
            java.lang.Integer r20 = X.AnonymousClass05K.A01
            goto L_0x0121
        L_0x0165:
            java.lang.Integer r20 = X.AnonymousClass05K.A00
            goto L_0x0121
        L_0x0168:
            java.lang.Integer r19 = X.AnonymousClass05K.A01
            goto L_0x0107
        L_0x016b:
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            goto L_0x00f2
        L_0x016e:
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            goto L_0x00db
        L_0x0172:
            r28 = r8
            goto L_0x00a6
        L_0x0176:
            r27 = r8
            goto L_0x0094
        L_0x017a:
            r26 = r8
            goto L_0x0082
        L_0x017e:
            r25 = r8
            goto L_0x0070
        L_0x0182:
            r22 = r8
            goto L_0x005f
        L_0x0186:
            r21 = r8
            goto L_0x004e
        L_0x018a:
            java.lang.String r1 = "ProactiveWarningBannerLoader"
            java.lang.String r0 = "invalid data"
            X.0wb.A03(r1, r0)
        L_0x0191:
            X.DQb r1 = r3.A02
            X.48z r0 = X.C2612848z.A00
            goto L_0x0152
        L_0x0196:
            r1 = r8
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41871B4p.onSuccessInBackground(java.lang.Object):void");
    }

    public final void onFailInBackground(C268654dm r4) {
        int A032 = AnonymousClass0fD.A03(-67746078);
        C46199DQb dQb = this.A02;
        C2612848z r0 = C2612848z.A00;
        0qQ.A07(r0);
        dQb.DOY(r0);
        AnonymousClass0fD.A0A(564474883, A032);
    }
}
