package X;

import com.facebookpay.msc.logging.LoggingData;
import java.util.HashMap;

/* renamed from: X.Qh4  reason: case insensitive filesystem */
public final class C8112Qh4 extends QDP {
    public C7745QVi A00;
    public LoggingData A01;
    public final AnonymousClass2Fj A02 = Pxh.A0M();

    /* JADX WARNING: type inference failed for: r1v2, types: [X.RwX, X.QgW] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.RwX, X.QgU] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        if (r1.getOptionalStringField(0, "uri") == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d3, code lost:
        if (r1 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e2, code lost:
        if (r1 == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0112, code lost:
        if (X.00l.A0W(r0) != false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (r0.booleanValue() != false) goto L_0x017e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(android.os.Bundle r20) {
        /*
            r19 = this;
            r7 = r19
            r1 = r20
            super.A0C(r1)
            if (r20 == 0) goto L_0x0163
            java.lang.String r0 = "logging_data"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.facebookpay.msc.logging.LoggingData r0 = (com.facebookpay.msc.logging.LoggingData) r0
        L_0x0011:
            java.lang.String r18 = "Required value was null."
            if (r0 == 0) goto L_0x01ae
            r7.A01 = r0
            java.lang.String r0 = "top_level_dialog"
            if (r20 == 0) goto L_0x01a9
            android.os.Parcelable r0 = r1.getParcelable(r0)
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r0 = X.C11405SSc.A01(r0)
            if (r0 == 0) goto L_0x01a9
            X.QVi r0 = (X.C7745QVi) r0
            r7.A00 = r0
            com.google.common.collect.ImmutableList$Builder r6 = com.google.common.collect.ImmutableList.builder()
            X.0qQ.A0A(r6)
            X.QVi r0 = r7.A00
            java.lang.String r17 = "topLevelDialog"
            r12 = 0
            if (r0 == 0) goto L_0x01a1
            java.lang.Class<X.QVh> r9 = X.C7744QVh.class
            r8 = 4
            java.lang.String r5 = "image_source"
            r4 = -743850097(0xffffffffd3a9bf8f, float:-1.45812659E12)
            X.3lr r1 = r0.getOptionalTreeField(r8, r5, r9, r4)
            if (r1 == 0) goto L_0x0160
            java.lang.String r0 = "uri"
            java.lang.String r0 = r1.A07(r0)
        L_0x0050:
            r11 = 0
            X.Ssk r3 = new X.Ssk
            r3.<init>(r0, r12, r11, r11)
            r0 = 52
            X.Qgk r2 = X.C8092Qgk.A00(r0)
            X.QgW r1 = new X.QgW
            r1.<init>()
            r1.A02 = r3
            X.Qga r0 = new X.Qga
            r0.<init>(r1)
            r10 = 1
            r2.A01(r0, r10)
            X.C11345SOd.A02(r2, r6)
            X.QVi r0 = r7.A00
            if (r0 == 0) goto L_0x01a1
            X.3lr r1 = r0.getOptionalTreeField(r8, r5, r9, r4)
            if (r1 == 0) goto L_0x0083
            java.lang.String r0 = "uri"
            java.lang.String r1 = r1.getOptionalStringField(r11, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0084
        L_0x0083:
            r0 = 0
        L_0x0084:
            X.QDP.A01(r7, r0)
            r0 = 53
            X.Qgk r5 = X.C8092Qgk.A00(r0)
            X.QgY r4 = X.C8080QgY.A00()
            X.QVi r0 = r7.A00
            if (r0 == 0) goto L_0x01a1
            java.lang.String r3 = "title"
            java.lang.String r0 = r0.A0A(r3)
            if (r0 == 0) goto L_0x019c
            X.StR r1 = X.C12401StR.A01(r0)
            X.RH2 r0 = X.RH2.A1E
            X.SST.A02(r1, r4, r0)
            X.QVi r0 = r7.A00
            if (r0 == 0) goto L_0x01a1
            java.lang.String r2 = "message"
            java.lang.String r0 = r0.A09(r2)
            if (r0 == 0) goto L_0x0197
            X.StR r1 = X.C12401StR.A01(r0)
            X.RH2 r0 = X.RH2.A14
            X.SST.A03(r1, r4, r0)
            X.C8086Qge.A01(r5, r4, r6)
            X.QVi r0 = r7.A00
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = r0.A0A(r3)
            if (r0 == 0) goto L_0x00d5
            X.QVi r0 = r7.A00
            if (r0 == 0) goto L_0x01a1
            java.lang.String r1 = r0.A09(r2)
            r0 = 1
            if (r1 != 0) goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            r5 = 1
            if (r0 == 0) goto L_0x00e4
            java.lang.Boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0192
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x00e5
        L_0x00e4:
            r0 = 0
        L_0x00e5:
            X.QDP.A01(r7, r0)
            X.QVi r0 = r7.A00
            if (r0 == 0) goto L_0x01a1
            java.lang.Class<X.QVg> r9 = X.C7743QVg.class
            java.lang.String r8 = "cta_info"
            r4 = -1017053272(0xffffffffc360ffa8, float:-224.99866)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r0, r9, r8, r11, r4)
            java.util.Iterator r16 = r0.iterator()
        L_0x00fb:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0166
            X.3lr r14 = X.C41845B3m.A0V(r16)
            java.lang.String r1 = "cta_uri"
            java.lang.String r0 = r14.getOptionalStringField(r10, r1)
            if (r0 == 0) goto L_0x0114
            boolean r0 = X.00l.A0W(r0)
            r15 = 7
            if (r0 == 0) goto L_0x0115
        L_0x0114:
            r15 = 6
        L_0x0115:
            java.lang.String r0 = r14.getOptionalStringField(r10, r1)
            if (r0 == 0) goto L_0x015d
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x015d
            X.RH2 r13 = X.RH2.A0B
        L_0x0123:
            r0 = 54
            X.Qgk r3 = X.C8092Qgk.A00(r0)
            X.QgU r2 = new X.QgU
            r2.<init>()
            java.lang.String r0 = "cta_text"
            X.StR r1 = X.C12401StR.A00(r14, r0, r11)
            X.SST r0 = new X.SST
            r0.<init>(r12, r1, r13)
            r2.A01 = r0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r1 = 2131231223(0x7f0801f7, float:1.807852E38)
            X.Ssl r0 = new X.Ssl
            r0.<init>(r13, r12, r1, r11)
            r2.A00 = r0
            r0 = 29
            X.SbM r0 = X.C11499SbM.A00(r14, r7, r0)
            r2.A00 = r0
            X.QgZ r0 = new X.QgZ
            r0.<init>(r2)
            r3.A01(r0, r10)
            X.C11345SOd.A02(r3, r6)
            goto L_0x00fb
        L_0x015d:
            X.RH2 r13 = X.RH2.A12
            goto L_0x0123
        L_0x0160:
            r0 = r12
            goto L_0x0050
        L_0x0163:
            r0 = 0
            goto L_0x0011
        L_0x0166:
            X.QVi r0 = r7.A00
            if (r0 == 0) goto L_0x01a1
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r0, r9, r8, r11, r4)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x018b
            java.lang.Boolean r0 = r7.A00
            if (r0 == 0) goto L_0x018d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x018b
        L_0x017e:
            X.QDP.A01(r7, r5)
            X.2Fj r1 = r7.A02
            com.google.common.collect.ImmutableList r0 = r6.build()
            r1.A0B(r0)
            return
        L_0x018b:
            r5 = 0
            goto L_0x017e
        L_0x018d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0192:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0197:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x019c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x01a1:
            X.0qQ.A0F(r17)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01a9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x01ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8112Qh4.A0C(android.os.Bundle):void");
    }

    public static final void A02(C8112Qh4 qh4, String str, String str2, String str3) {
        2FO A002 = C11426STk.A00();
        LoggingData loggingData = qh4.A01;
        if (loggingData == null) {
            0qQ.A0F("loggingData");
            throw AnonymousClass00P.createAndThrow();
        }
        HashMap A003 = C9634ReE.A00(loggingData);
        Pxj.A1L("view_name", "app_level_dialogue_update", str2, A003);
        if (str3 != null) {
            A003.put("target_url", str3);
        }
        A002.Cgl(str, A003);
    }
}
