package X;

import com.facebook.msys.mca.MailboxCallback;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Opf  reason: case insensitive filesystem */
public final class C71721Opf implements MailboxCallback {
    public final int A00;
    public final Object A01;

    public C71721Opf(int i, 0sP r2) {
        this.A00 = i;
        switch (i) {
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 44:
            case 45:
                this.A01 = r2;
                return;
            default:
                this.A01 = r2;
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x039b, code lost:
        r4.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x039e, code lost:
        ((X.AnonymousClass67Z) r2.A01).A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x049b, code lost:
        if (r1 != 0) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04b5, code lost:
        r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04e7, code lost:
        if (X.2Ob.A00(r2, "AdvancedCrypto") == false) goto L_0x04e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCompletion(java.lang.Object r27) {
        /*
            r26 = this;
            r2 = r26
            r4 = r27
            int r0 = r2.A00
            switch(r0) {
                case 1: goto L_0x0501;
                case 2: goto L_0x0009;
                case 3: goto L_0x0009;
                case 4: goto L_0x0009;
                case 5: goto L_0x0009;
                case 6: goto L_0x0009;
                case 7: goto L_0x04ee;
                case 8: goto L_0x04cc;
                case 9: goto L_0x0009;
                case 10: goto L_0x0009;
                case 11: goto L_0x04a2;
                case 12: goto L_0x0009;
                case 13: goto L_0x048a;
                case 14: goto L_0x047c;
                case 15: goto L_0x0455;
                case 16: goto L_0x0009;
                case 17: goto L_0x03df;
                case 18: goto L_0x03b2;
                case 19: goto L_0x03ac;
                case 20: goto L_0x03a6;
                case 21: goto L_0x038b;
                case 22: goto L_0x03a6;
                case 23: goto L_0x03a6;
                case 24: goto L_0x0381;
                case 25: goto L_0x0379;
                case 26: goto L_0x0298;
                case 27: goto L_0x0381;
                case 28: goto L_0x03a6;
                case 29: goto L_0x03a6;
                case 30: goto L_0x0077;
                case 31: goto L_0x03ac;
                case 32: goto L_0x028b;
                case 33: goto L_0x0067;
                case 34: goto L_0x0015;
                case 35: goto L_0x01ca;
                case 36: goto L_0x01af;
                case 37: goto L_0x0194;
                case 38: goto L_0x018c;
                case 39: goto L_0x03a6;
                case 40: goto L_0x0164;
                case 41: goto L_0x0140;
                case 42: goto L_0x0107;
                case 43: goto L_0x00ae;
                case 44: goto L_0x009b;
                case 45: goto L_0x0088;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r2.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            r0 = 0
            X.C66990MgO.A00(r1, r0)
            r1.A00()
        L_0x0014:
            return
        L_0x0015:
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r4 = r4.value
            X.5z0 r4 = (X.C301345z0) r4
            if (r4 == 0) goto L_0x0014
            r3 = 0
            int r1 = X.C66580MXl.A04(r4)
        L_0x0022:
            if (r3 >= r1) goto L_0x0014
            com.facebook.msys.mci.CQLResultSet r5 = r4.mResultSet
            r0 = 0
            long r11 = r5.getLong(r3, r0)
            java.lang.String r0 = X.C66581MXm.A0t(r4, r3)
            long r13 = X.C66580MXl.A08(r0)
            java.lang.String r7 = X.C66581MXm.A0u(r4, r3)
            com.facebook.msys.mci.CQLResultSet r5 = r4.mResultSet
            r0 = 3
            java.lang.String r8 = r5.getString(r3, r0)
            com.facebook.msys.mci.CQLResultSet r5 = r4.mResultSet
            r0 = 4
            long r5 = r5.getLong(r3, r0)
            long r15 = X.AnonymousClass7TE.A0P(r5)
            com.facebook.msys.mci.CQLResultSet r5 = r4.mResultSet
            r0 = 6
            int r10 = r5.getInteger(r3, r0)
            com.facebook.msys.mci.CQLResultSet r5 = r4.mResultSet
            r0 = 5
            byte[] r9 = r5.getBlob(r3, r0)
            java.lang.Object r6 = r2.A01
            X.OUz r6 = (X.C70985OUz) r6
            X.0qQ.A0A(r7)
            X.0qQ.A0A(r8)
            X.C70985OUz.A00(r6, r7, r8, r9, r10, r11, r13, r15)
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0067:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            if (r0 == 0) goto L_0x0014
            X.5q0 r1 = X.C296405q0.A00
            java.lang.Object r0 = r2.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            r1.A00(r0)
            return
        L_0x0077:
            int r3 = X.AnonymousClass7TE.A0M(r4)
            java.lang.Object r0 = r2.A01
            X.PPx r0 = (X.C72939PPx) r0
            X.65S r1 = r0.A0M
            if (r1 == 0) goto L_0x0014
            r0 = 0
            r1.A03(r3, r0)
            return
        L_0x0088:
            X.OAp r4 = (X.C70541OAp) r4
            com.facebook.msys.mcf.MsysError r0 = r4.A00
            if (r0 == 0) goto L_0x0091
            r0.getCause()
        L_0x0091:
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            boolean r0 = r4.A01
            X.C51968G9o.A1O(r1, r0)
            return
        L_0x009b:
            X.OAo r4 = (X.C70540OAo) r4
            com.facebook.msys.mcf.MsysError r0 = r4.A00
            if (r0 == 0) goto L_0x00a4
            r0.getCause()
        L_0x00a4:
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            boolean r0 = r4.A01
            X.C51968G9o.A1O(r1, r0)
            return
        L_0x00ae:
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r2 = r2.A01
            X.PdB r2 = (X.C73469PdB) r2
            java.lang.Object r0 = r2.A01
            X.Oib r0 = (X.C71330Oib) r0
            java.lang.String r3 = r0.A02
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x00f2
            java.lang.String r0 = X.DbT.A11(r3, r4)
            java.io.File r0 = X.AnonymousClass7TE.A0t(r0)
            boolean r1 = r0.delete()
            java.lang.Object r0 = r2.A02
            android.content.Context r2 = X.C66580MXl.A09(r0)
            if (r1 == 0) goto L_0x00e5
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r3)
            java.lang.String r0 = " was deleted"
        L_0x00da:
            r1.append(r0)
        L_0x00dd:
            java.lang.String r0 = r1.toString()
            X.C59689JTv.A09(r2, r0)
            return
        L_0x00e5:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to delete database file for database: "
            r1.append(r0)
            r1.append(r3)
            goto L_0x00dd
        L_0x00f2:
            java.lang.Object r0 = r2.A02
            android.content.Context r2 = X.C66580MXl.A09(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Could not find "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " file path"
            goto L_0x00da
        L_0x0107:
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r2 = r2.A01
            X.67Z r2 = (X.AnonymousClass67Z) r2
            java.lang.Object r1 = r4.value
            r0 = 0
            boolean r0 = X.C66583MXo.A1W(r0, r1)
            if (r0 == 0) goto L_0x011f
            X.Nj7 r0 = X.C69306Nj7.PROCESSING
        L_0x0118:
            r2.A02(r0)
            r2.A00()
            return
        L_0x011f:
            r0 = 1
            boolean r0 = X.C66583MXo.A1W(r0, r1)
            if (r0 == 0) goto L_0x0129
            X.Nj7 r0 = X.C69306Nj7.SUPPRESSED
            goto L_0x0118
        L_0x0129:
            r0 = 2
            boolean r0 = X.C66583MXo.A1W(r0, r1)
            if (r0 == 0) goto L_0x0133
            X.Nj7 r0 = X.C69306Nj7.SUCCESS
            goto L_0x0118
        L_0x0133:
            r0 = 3
            boolean r0 = X.C66583MXo.A1W(r0, r1)
            if (r0 == 0) goto L_0x013d
            X.Nj7 r0 = X.C69306Nj7.ERROR
            goto L_0x0118
        L_0x013d:
            X.Nj7 r0 = X.C69306Nj7.CODEGEN_ERROR
            goto L_0x0118
        L_0x0140:
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r2 = r2.A01
            X.67Z r2 = (X.AnonymousClass67Z) r2
            java.lang.Object r1 = r4.value
            boolean r0 = X.DbX.A1a(r1)
            if (r0 == 0) goto L_0x0157
            X.Nj7 r0 = X.C69306Nj7.SUPPRESSED
        L_0x0150:
            r2.A02(r0)
            r2.A00()
            return
        L_0x0157:
            r0 = 0
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r0)
            if (r0 == 0) goto L_0x0161
            X.Nj7 r0 = X.C69306Nj7.SUCCESS
            goto L_0x0150
        L_0x0161:
            X.Nj7 r0 = X.C69306Nj7.ERROR
            goto L_0x0150
        L_0x0164:
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r5 = r4.value
            X.5z0 r5 = (X.C301345z0) r5
            if (r5 == 0) goto L_0x039e
            java.lang.Object r4 = r2.A01
            X.67Z r4 = (X.AnonymousClass67Z) r4
            com.facebook.msys.mci.CQLResultSet r3 = r5.mResultSet
            r1 = 0
            r0 = 5
            java.lang.String r3 = r3.getString(r1, r0)
            if (r3 != 0) goto L_0x017c
            java.lang.String r3 = ""
        L_0x017c:
            java.lang.String r0 = X.C66581MXm.A0v(r5, r1)
            X.O8m r1 = new X.O8m
            r1.<init>(r0)
            X.JwJ r0 = new X.JwJ
            r0.<init>((X.C70487O8m) r1, (java.lang.String) r3)
            goto L_0x039b
        L_0x018c:
            java.lang.Object r0 = r2.A01
            X.1K2 r0 = (X.1K2) r0
            r0.set(r4)
            return
        L_0x0194:
            X.O5X r4 = (X.O5X) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r2.A01
            X.5Gf r0 = (X.C283125Gf) r0
            boolean r2 = r4.A00
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "is_contact_security_alert_enabled"
            r1.E5T(r0, r2)
            r1.apply()
            return
        L_0x01af:
            X.O5X r4 = (X.O5X) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r2.A01
            X.5Gf r0 = (X.C283125Gf) r0
            boolean r2 = r4.A00
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "is_self_security_alert_enabled"
            r1.E5T(r0, r2)
            r1.apply()
            return
        L_0x01ca:
            X.OAk r4 = (X.C70536OAk) r4
            java.lang.Object r1 = r2.A01
            X.4D7 r1 = (X.AnonymousClass4D7) r1
            java.util.List r2 = r4.A01
            if (r2 == 0) goto L_0x0285
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r6 = r2.iterator()
        L_0x01dc:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0287
            java.lang.Object r2 = r6.next()
            java.util.Map r2 = (java.util.Map) r2
            r3 = 95
            java.lang.String r3 = X.Pxd.A00(r3)
            X.0qQ.A0C(r2, r3)
            r3 = 0
            X.0qQ.A0B(r2, r3)
            java.lang.String r3 = "wa_device_id"
            java.lang.Object r10 = r2.get(r3)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r10, r4)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r3 = "ip"
            java.lang.Object r11 = r2.get(r3)
            X.0qQ.A0C(r11, r4)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r3 = "model"
            java.lang.Object r12 = r2.get(r3)
            boolean r5 = r12 instanceof java.lang.String
            r3 = 0
            if (r5 == 0) goto L_0x0283
            java.lang.String r12 = (java.lang.String) r12
        L_0x021a:
            java.lang.String r3 = "location"
            java.lang.String r13 = X.C66584MXp.A0Z(r3, r2)
            java.lang.String r3 = "latitude"
            java.lang.Object r8 = r2.get(r3)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Number"
            X.0qQ.A0C(r8, r5)
            java.lang.Number r8 = (java.lang.Number) r8
            java.lang.String r3 = "longitude"
            java.lang.Object r9 = r2.get(r3)
            X.0qQ.A0C(r9, r5)
            java.lang.Number r9 = (java.lang.Number) r9
            java.lang.String r3 = "last_seen_timestamp_seconds"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Long"
            X.0qQ.A0C(r3, r5)
            long r17 = X.AnonymousClass7TE.A0R(r3)
            java.lang.String r3 = "registration_timestamp_seconds"
            java.lang.Object r3 = r2.get(r3)
            X.0qQ.A0C(r3, r5)
            long r19 = X.AnonymousClass7TE.A0R(r3)
            java.lang.String r3 = "encoded_remote_identity_key"
            java.lang.Object r14 = r2.get(r3)
            X.0qQ.A0C(r14, r4)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r3 = "platform"
            java.lang.String r15 = X.C66584MXp.A0Z(r3, r2)
            r3 = 5026(0x13a2, float:7.043E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            java.lang.String r16 = X.C66584MXp.A0Z(r3, r2)
            java.lang.String r3 = "is_current_device"
            java.lang.Object r2 = r2.get(r3)
            boolean r21 = X.JTQ.A1W(r2)
            X.JuY r7 = new X.JuY
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21)
            r0.add(r7)
            goto L_0x01dc
        L_0x0283:
            r12 = r3
            goto L_0x021a
        L_0x0285:
            X.0sn r0 = X.0sn.A00
        L_0x0287:
            r1.resumeWith(r0)
            return
        L_0x028b:
            int r3 = X.AnonymousClass7TE.A0M(r4)
            java.lang.Object r1 = r2.A01
            X.65S r1 = (X.AnonymousClass65S) r1
            r0 = 1
            r1.A03(r3, r0)
            return
        L_0x0298:
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            r10 = 0
            X.0qQ.A0B(r4, r10)
            java.lang.Object r9 = r2.A01
            X.MgN r9 = (X.C66989MgN) r9
            X.9Hr r13 = r9.A01
            java.lang.Integer r15 = r9.A02
            X.MoN[] r1 = r9.A03
            int r0 = r1.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r1, r0)
            X.MoN[] r8 = (X.C67468MoN[]) r8
            java.lang.Object r7 = r4.value
            X.5z0 r7 = (X.C301345z0) r7
            if (r7 != 0) goto L_0x02bc
            r2 = 0
        L_0x02b6:
            X.PtM r0 = r9.A00
            r0.DLX(r2)
            return
        L_0x02bc:
            int r12 = X.C66580MXl.A04(r7)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            r5 = 0
        L_0x02c5:
            if (r5 >= r12) goto L_0x033d
            com.facebook.msys.mci.CQLResultSet r1 = r7.mResultSet
            r0 = 2
            long r24 = r1.getLong(r5, r0)
            com.facebook.msys.mci.CQLResultSet r1 = r7.mResultSet
            r0 = 3
            java.lang.Long r21 = r1.getNullableLong(r5, r0)
            java.lang.String r1 = X.C66581MXm.A0v(r7, r5)
            X.0qQ.A07(r1)
            java.lang.String r4 = X.C66581MXm.A0t(r7, r5)
            X.0qQ.A07(r4)
            com.facebook.msys.mci.CQLResultSet r0 = r7.mResultSet
            long r16 = r0.getLong(r5, r10)
            com.facebook.msys.mci.CQLResultSet r2 = r7.mResultSet
            r0 = 5
            java.lang.String r23 = r2.getString(r5, r0)
            java.lang.String r0 = "education_notice"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x033a
            int r3 = r8.length
            r2 = 0
        L_0x02fa:
            if (r2 >= r3) goto L_0x033a
            r1 = r8[r2]
            X.MoN r0 = X.C67468MoN.A06
            if (r1 == r0) goto L_0x0306
            X.MoN r0 = X.C67468MoN.A04
            if (r1 != r0) goto L_0x031f
        L_0x0306:
            java.lang.String r11 = java.lang.String.valueOf(r16)
            com.instagram.common.session.UserSession r14 = r13.A01
            java.lang.String r0 = "education_notice_interstitial_shown_"
            java.lang.String r11 = X.002.A0R(r0, r11)
            X.0xa r0 = X.AnonymousClass7TE.A0q(r14)
            int r0 = r0.getInt(r11, r10)
            if (r0 <= 0) goto L_0x031f
        L_0x031c:
            int r2 = r2 + 1
            goto L_0x02fa
        L_0x031f:
            java.lang.String r0 = r1.A01
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x031c
            java.lang.String r22 = java.lang.String.valueOf(r16)
            X.N3U r0 = new X.N3U
            r18 = r0
            r19 = r1
            r20 = r15
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r6.add(r0)
            goto L_0x031c
        L_0x033a:
            int r5 = r5 + 1
            goto L_0x02c5
        L_0x033d:
            r0 = 27
            X.PcU r5 = new X.PcU
            r5.<init>(r0)
            r0 = 28
            X.PcU r4 = new X.PcU
            r4.<init>(r0)
            java.util.Iterator r3 = r6.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x035a
            r2 = 0
        L_0x0356:
            X.N3U r2 = (X.N3U) r2
            goto L_0x02b6
        L_0x035a:
            java.lang.Object r2 = r3.next()
        L_0x035e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0356
            java.lang.Object r1 = r3.next()
            X.AnonymousClass7TF.A1H(r5, r4)
            int r0 = r5.compare(r2, r1)
            if (r0 != 0) goto L_0x0375
            int r0 = r4.compare(r2, r1)
        L_0x0375:
            if (r0 <= 0) goto L_0x035e
            r2 = r1
            goto L_0x035e
        L_0x0379:
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            X.0qQ.A0K(r4, r0)
            return
        L_0x0381:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r2.A01
            X.C66581MXm.A1Q(r0, r4)
            return
        L_0x038b:
            java.lang.Object r0 = X.C66583MXo.A0g(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x039e
            java.lang.Object r4 = r2.A01
            X.67Z r4 = (X.AnonymousClass67Z) r4
            java.lang.Long r0 = X.C51968G9o.A0v(r0)
        L_0x039b:
            r4.A02(r0)
        L_0x039e:
            java.lang.Object r0 = r2.A01
            X.67Z r0 = (X.AnonymousClass67Z) r0
            r0.A00()
            return
        L_0x03a6:
            java.lang.Object r0 = r2.A01
            X.C66581MXm.A1Q(r0, r4)
            return
        L_0x03ac:
            java.lang.Object r0 = r2.A01
            X.C51965G9l.A1W(r0, r4)
            return
        L_0x03b2:
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            r5 = 0
            X.0qQ.A0B(r4, r5)
            java.lang.Object r3 = r4.value
            X.5z0 r3 = (X.C301345z0) r3
            if (r3 == 0) goto L_0x03d9
            int r0 = X.C66580MXl.A04(r3)
            if (r0 <= 0) goto L_0x03d9
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            com.facebook.msys.mci.CQLResultSet r0 = r3.mResultSet
            java.lang.String r0 = r0.getString(r5, r5)
            X.0qQ.A07(r0)
            X.3t0 r0 = X.C66580MXl.A0g(r0)
        L_0x03d5:
            r1.invoke(r0)
            return
        L_0x03d9:
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            r0 = 0
            goto L_0x03d5
        L_0x03df:
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r1 = r4.value
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x03eb
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x03ed
        L_0x03eb:
            X.0sn r1 = X.0sn.A00
        L_0x03ed:
            java.lang.Object r3 = r2.A01
            X.4D7 r3 = (X.AnonymousClass4D7) r3
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r5 = r1.iterator()
        L_0x03f9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0451
            java.lang.Object r4 = r5.next()
            java.util.AbstractMap r4 = (java.util.AbstractMap) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.String r0 = "DeviceId"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x044c
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "PublicIdentityKey"
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L_0x0447
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = "FirstSeenTimestampMs"
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L_0x0442
            long r7 = X.AnonymousClass7TE.A0R(r0)
            java.lang.String r0 = "DeviceName"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r11 = X.DbX.A0t(r0)
            X.JtA r6 = new X.JtA
            r6.<init>(r7, r9, r10, r11)
            r2.add(r6)
            goto L_0x03f9
        L_0x0442:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0447:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x044c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0451:
            r3.resumeWith(r2)
            return
        L_0x0455:
            java.lang.Object r2 = r2.A01
            X.67Z r2 = (X.AnonymousClass67Z) r2
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r0 = r4.value
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0475
            long r0 = r0.longValue()
            java.lang.String r1 = java.lang.Long.toString(r0)
            X.MgO r0 = new X.MgO
            r0.<init>(r1)
        L_0x046e:
            r2.A02(r0)
            r2.A00()
            return
        L_0x0475:
            java.lang.String r0 = "Message PK is null"
            X.Oxl r0 = X.C72176Oxl.A01(r0)
            goto L_0x046e
        L_0x047c:
            java.lang.Object r1 = r2.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r0 = r4.value
            if (r0 == 0) goto L_0x04b5
            r1.A02(r0)
            goto L_0x04b5
        L_0x048a:
            java.lang.Object r2 = r2.A01
            X.67Z r2 = (X.AnonymousClass67Z) r2
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r0 = r4.value
            X.5z0 r0 = (X.C301345z0) r0
            if (r0 == 0) goto L_0x049d
            int r1 = X.C66580MXl.A04(r0)
            r0 = 0
            if (r1 == 0) goto L_0x049e
        L_0x049d:
            r0 = 1
        L_0x049e:
            X.C66582MXn.A1F(r2, r0)
            return
        L_0x04a2:
            java.lang.Object r1 = r2.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            X.OT4 r4 = (X.OT4) r4
            java.util.List r0 = r4.A01
            if (r0 != 0) goto L_0x04b9
            java.lang.String r0 = "Message PKs are null"
            X.Oxl r0 = X.C72176Oxl.A01(r0)
            r1.A02(r0)
        L_0x04b5:
            r1.A00()
            return
        L_0x04b9:
            java.lang.Number r0 = r4.A00
            if (r0 != 0) goto L_0x04c7
            java.lang.String r0 = "Attachment PK is null"
            X.Oxl r0 = X.C72176Oxl.A01(r0)
            r1.A02(r0)
            goto L_0x04b5
        L_0x04c7:
            r0 = 0
            X.C66990MgO.A00(r1, r0)
            goto L_0x04b5
        L_0x04cc:
            java.lang.Object r3 = r2.A01
            X.67Z r3 = (X.AnonymousClass67Z) r3
            X.OT5 r4 = (X.OT5) r4
            java.lang.Number r0 = r4.A00
            java.lang.String r2 = r4.A01
            if (r0 == 0) goto L_0x04e9
            int r1 = r0.intValue()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 != r0) goto L_0x04e9
            java.lang.String r0 = "AdvancedCrypto"
            boolean r1 = X.2Ob.A00(r2, r0)
            r0 = 1
            if (r1 != 0) goto L_0x04ea
        L_0x04e9:
            r0 = 0
        L_0x04ea:
            X.C66582MXn.A1F(r3, r0)
            return
        L_0x04ee:
            java.lang.Object r1 = r2.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r0 = r4.value
            X.3xP r0 = X.C257443xP.A00(r0)
            r1.A02(r0)
            r1.A00()
            return
        L_0x0501:
            java.lang.Object r2 = r2.A01
            X.67Z r2 = (X.AnonymousClass67Z) r2
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            if (r0 == 0) goto L_0x051b
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            X.MgO r0 = new X.MgO
            r0.<init>(r1)
        L_0x0514:
            r2.A02(r0)
            r2.A00()
            return
        L_0x051b:
            java.lang.String r0 = "MailboxTam returns false when running tam_client_request_participants_add"
            X.Oxl r0 = X.C72176Oxl.A01(r0)
            goto L_0x0514
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71721Opf.onCompletion(java.lang.Object):void");
    }

    public C71721Opf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C71721Opf(AnonymousClass67Z r1, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 14:
            case 15:
            case 16:
                this.A01 = r1;
                return;
            default:
                this.A01 = r1;
                return;
        }
    }
}
