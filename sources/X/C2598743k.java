package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.43k  reason: invalid class name and case insensitive filesystem */
public final class C2598743k implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public C2598743k(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0222, code lost:
        r12 = r16.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0226, code lost:
        monitor-enter(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0229, code lost:
        if (r14.A2H == r12) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x022b, code lost:
        r14.A2H = r12;
        r14.A2C = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        monitor-exit(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0231, code lost:
        r14.A1H((java.lang.String) null);
        r14.A1G((java.lang.String) null);
        r0 = r14.A0u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023b, code lost:
        if (r0 != null) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x023d, code lost:
        r14.A1J(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0240, code lost:
        r18 = new X.2Kb(r10.A0I.BJz(), X.AnonymousClass05K.A0C, (java.util.List) null, (java.util.List) null, java.util.Collections.singletonList(r14), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x025a, code lost:
        r0.addAll(r11);
        r14.A1J(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0262, code lost:
        r25.A06.A00(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x026d, code lost:
        return X.AnonymousClass6BL.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0274, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0275, code lost:
        X.0KC.A0F("NewMessageDeltaProcessor", "Invalid DirectMessage format", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0281, code lost:
        return new X.AnonymousClass6BQ(r3, "NewMessageDeltaProcessor", "Invalid DirectMessage format");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        if (r1.equals(r0) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0284, code lost:
        return X.C21215XPd.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0290, code lost:
        return A00(r9, r5, r10, r26, r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        r4 = (X.2Eq) r12.invoke(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (r4 == null) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        if (r1.equals("remove") == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r10 = X.0c9.A04;
        r3 = r7.A00;
        r0 = r8.A02;
        X.0qQ.A06(r0);
        r2 = X.C300595xT.parseFromJson(r10.A01(r3, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e0, code lost:
        if (r2 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ea, code lost:
        if (X.0qQ.A0K(r8.A00, "add") == false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ec, code lost:
        r7.A01.EoX(r2.A0M, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f3, code lost:
        r0 = r8.A02;
        X.0qQ.A06(r0);
        r0 = false;
        r2 = X.C254703su.A00(r10.A01(r3, r0), r4.BJy(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0108, code lost:
        if (r2 != null) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0118, code lost:
        return new X.AnonymousClass6BR(new java.lang.Exception("Failed to parse value as DirectMessage"), "NewMessageDeltaProcessor", "Failed to parse value as DirectMessage");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011b, code lost:
        if (r2.A1i == null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011d, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011e, code lost:
        r2.A1L(r0);
        r2.A1m(X.AnonymousClass05K.A0j);
        r2.A1h = java.lang.String.valueOf(r9.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0130, code lost:
        if (r2.A01 <= 0) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013a, code lost:
        if (X.0qQ.A0K(r8.A00, "replace") == false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013c, code lost:
        r6 = r2.A0g();
        r17 = r7.A01;
        r10 = r4.BJy();
        r13 = r2.A01;
        r12 = r2.A1q;
        r11 = r2.A0u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0150, code lost:
        if (r11 != null) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0152, code lost:
        r11 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0154, code lost:
        r1 = r2.A2H;
        r0 = r17;
        r25 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015c, code lost:
        if (r6 == null) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015e, code lost:
        if (r12 == null) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0165, code lost:
        if (r2.A1T() == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016f, code lost:
        if (X.C377839Nl.A00(r3).booleanValue() == false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0177, code lost:
        if (r2.A0b() != X.AnonymousClass05K.A01) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0184, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36325665159591032L) != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0193, code lost:
        if (r2.A1n(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())) == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0196, code lost:
        r7.A01.A9f(r2, r4.BJy(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a0, code lost:
        r10 = r0.A0P(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a4, code lost:
        if (r10 != null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a6, code lost:
        X.0wb.A03("Null thread entry", "Entry should exist before function call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ad, code lost:
        X.C331247Qd.A01(r3, r5, r17.Bm7(r4.BJy(), r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ba, code lost:
        r7.A01.CnF(X.C66887MeQ.parseFromJson(X.16P.A00(r8.A02)).A00, r4.BJy());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d1, code lost:
        if (r9.A07 == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d3, code lost:
        X.C70148Ny2.A00(r3, r9, r5, r2.A1u);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d8, code lost:
        r5 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e0, code lost:
        if (r5.hasNext() == false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e2, code lost:
        ((X.C2597342w) r5.next()).D8s(r2, r4.BJy(), r9.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f2, code lost:
        r16 = java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f6, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r14 = r10.A0J(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01fc, code lost:
        if (r14 != null) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fe, code lost:
        X.0wj.A01.AEf("Message is missing from thread entry", 20134884).report();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r0 = r14.A10;
        r15 = X.2FW.A1g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0212, code lost:
        if (r0 != r15) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0214, code lost:
        r14.A17(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0217, code lost:
        monitor-enter(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021a, code lost:
        if (r14.A01 == r13) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x021c, code lost:
        r14.A01 = r13;
        r14.A2C = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        monitor-exit(r14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6BN E4Y(X.AnonymousClass651 r28, X.AnonymousClass653 r29, java.util.List r30, java.util.Map r31, X.0sL r32, X.0sL r33, boolean r34) {
        /*
            r27 = this;
            r0 = 0
            r2 = r31
            X.0qQ.A0B(r2, r0)
            r0 = 1
            r9 = r28
            X.0qQ.A0B(r9, r0)
            r0 = 2
            r8 = r29
            X.0qQ.A0B(r8, r0)
            r1 = 4
            r26 = r30
            r0 = r26
            X.0qQ.A0B(r0, r1)
            r0 = 5
            r12 = r32
            X.0qQ.A0B(r12, r0)
            r0 = 6
            r13 = r33
            X.0qQ.A0B(r13, r0)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r5 = r2.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "direct_v2_item_id"
            java.lang.Object r10 = r2.get(r0)
            java.lang.String r10 = (java.lang.String) r10
            if (r5 == 0) goto L_0x0049
            if (r10 == 0) goto L_0x0049
            java.lang.String r1 = r8.A00
            if (r1 == 0) goto L_0x0049
            int r0 = r1.hashCode()
            r7 = r27
            r6 = r34
            switch(r0) {
                case -1411068134: goto L_0x0069;
                case -934610812: goto L_0x0060;
                case 96417: goto L_0x004f;
                case 1094496948: goto L_0x004c;
                default: goto L_0x0049;
            }
        L_0x0049:
            X.6BO r2 = X.AnonymousClass6BO.A00
            return r2
        L_0x004c:
            java.lang.String r0 = "replace"
            goto L_0x0051
        L_0x004f:
            java.lang.String r0 = "add"
        L_0x0051:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.Object r4 = r12.invoke(r5, r9)
            X.2Eq r4 = (X.2Eq) r4
            if (r4 == 0) goto L_0x0282
            goto L_0x00cf
        L_0x0060:
            java.lang.String r0 = "remove"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0285
            goto L_0x0049
        L_0x0069:
            java.lang.String r0 = "append"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.String r11 = "NewMessageDeltaProcessor"
            java.lang.String r0 = r8.A02     // Catch:{ JSONException -> 0x0295, IllegalArgumentException -> 0x0299, 5I7 -> 0x0291 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0295, IllegalArgumentException -> 0x0299, 5I7 -> 0x0291 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0295, IllegalArgumentException -> 0x0299, 5I7 -> 0x0291 }
            java.lang.String r0 = "opaque_message"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ JSONException -> 0x0295, IllegalArgumentException -> 0x0299, 5I7 -> 0x0291 }
            r2 = 2
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch:{ JSONException -> 0x0295, IllegalArgumentException -> 0x0299, 5I7 -> 0x0291 }
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = com.instagram.direct.armadilloexpress.transportpayload.TransportPayload.DEFAULT_INSTANCE     // Catch:{ JSONException -> 0x0295, IllegalArgumentException -> 0x0299, 5I7 -> 0x0291 }
            X.R5b r3 = X.R5b.A04(r0, r1)     // Catch:{ JSONException -> 0x0295, IllegalArgumentException -> 0x0299, 5I7 -> 0x0291 }
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r3 = (com.instagram.direct.armadilloexpress.transportpayload.TransportPayload) r3     // Catch:{ JSONException -> 0x0295, IllegalArgumentException -> 0x0299, 5I7 -> 0x0291 }
            int r1 = r3.transportPayloadCase_
            if (r1 == r2) goto L_0x0285
            r0 = 3
            if (r1 != r0) goto L_0x0049
            java.lang.Object r2 = r12.invoke(r5, r9)
            X.2Eq r2 = (X.2Eq) r2
            if (r2 == 0) goto L_0x0282
            X.2Dm r1 = r7.A01
            com.instagram.model.direct.DirectThreadKey r0 = r2.BJy()
            X.3su r11 = r1.BRz(r0, r10)
            if (r11 == 0) goto L_0x0049
            X.Oa0 r8 = X.C71037Oa0.A00
            com.instagram.common.session.UserSession r9 = r7.A00
            java.lang.String r0 = "timestamp"
            long r13 = r4.getLong(r0)
            java.lang.String r0 = "user_id"
            java.lang.String r12 = r4.getString(r0)
            X.0qQ.A07(r12)
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r10 = r3.A0M()
            X.0qQ.A07(r10)
            r8.A05(r9, r10, r11, r12, r13)
            com.instagram.model.direct.DirectThreadKey r0 = r2.BJy()
            r1.A9f(r11, r0, r6)
            X.6BL r2 = X.AnonymousClass6BL.A00
            return r2
        L_0x00cf:
            X.0c5 r10 = X.0c9.A04     // Catch:{ IOException -> 0x0274 }
            com.instagram.common.session.UserSession r3 = r7.A00     // Catch:{ IOException -> 0x0274 }
            java.lang.String r0 = r8.A02     // Catch:{ IOException -> 0x0274 }
            X.0qQ.A06(r0)     // Catch:{ IOException -> 0x0274 }
            X.0c9 r0 = r10.A01(r3, r0)     // Catch:{ IOException -> 0x0274 }
            X.5xS r2 = X.C300595xT.parseFromJson(r0)     // Catch:{ IOException -> 0x0274 }
            if (r2 == 0) goto L_0x00f3
            java.lang.String r1 = r8.A00     // Catch:{ IOException -> 0x0274 }
            java.lang.String r0 = "add"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ IOException -> 0x0274 }
            if (r0 == 0) goto L_0x00f3
            X.9IE r1 = r2.A0M     // Catch:{ IOException -> 0x0274 }
            X.2Dm r0 = r7.A01     // Catch:{ IOException -> 0x0274 }
            r0.EoX(r1, r4)     // Catch:{ IOException -> 0x0274 }
        L_0x00f3:
            java.lang.String r0 = r8.A02     // Catch:{ IOException -> 0x0274 }
            X.0qQ.A06(r0)     // Catch:{ IOException -> 0x0274 }
            X.0c9 r2 = r10.A01(r3, r0)     // Catch:{ IOException -> 0x0274 }
            com.instagram.model.direct.DirectThreadKey r1 = r4.BJy()     // Catch:{ IOException -> 0x0274 }
            r18 = 0
            r0 = r18
            X.3su r2 = X.C254703su.A00(r2, r1, r0)     // Catch:{ IOException -> 0x0274 }
            if (r2 != 0) goto L_0x0119
            java.lang.String r3 = "NewMessageDeltaProcessor"
            java.lang.String r1 = "Failed to parse value as DirectMessage"
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ IOException -> 0x0274 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0274 }
            X.6BR r2 = new X.6BR     // Catch:{ IOException -> 0x0274 }
            r2.<init>(r0, r3, r1)     // Catch:{ IOException -> 0x0274 }
            return r2
        L_0x0119:
            java.lang.String r1 = r2.A1i     // Catch:{ IOException -> 0x0274 }
            if (r1 == 0) goto L_0x011e
            r0 = 1
        L_0x011e:
            r2.A1L(r0)     // Catch:{ IOException -> 0x0274 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ IOException -> 0x0274 }
            r2.A1m(r0)     // Catch:{ IOException -> 0x0274 }
            java.lang.Long r0 = r9.A01     // Catch:{ IOException -> 0x0274 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0274 }
            r2.A1h = r0     // Catch:{ IOException -> 0x0274 }
            int r0 = r2.A01     // Catch:{ IOException -> 0x0274 }
            if (r0 <= 0) goto L_0x0161
            java.lang.String r1 = r8.A00     // Catch:{ IOException -> 0x0274 }
            java.lang.String r0 = "replace"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ IOException -> 0x0274 }
            if (r0 == 0) goto L_0x0161
            java.lang.String r6 = r2.A0g()     // Catch:{ IOException -> 0x0274 }
            X.2Dm r0 = r7.A01     // Catch:{ IOException -> 0x0274 }
            r17 = r0
            com.instagram.model.direct.DirectThreadKey r10 = r4.BJy()     // Catch:{ IOException -> 0x0274 }
            int r13 = r2.A01     // Catch:{ IOException -> 0x0274 }
            java.lang.String r12 = r2.A1q     // Catch:{ IOException -> 0x0274 }
            java.util.List r11 = r2.A0u()     // Catch:{ IOException -> 0x0274 }
            if (r11 != 0) goto L_0x0154
            X.0sn r11 = X.0sn.A00     // Catch:{ IOException -> 0x0274 }
        L_0x0154:
            boolean r1 = r2.A2H     // Catch:{ IOException -> 0x0274 }
            r0 = r17
            X.2Dr r0 = (X.2Dr) r0     // Catch:{ IOException -> 0x0274 }
            r25 = r0
            if (r6 == 0) goto L_0x01ad
            if (r12 == 0) goto L_0x01ad
            goto L_0x01a0
        L_0x0161:
            boolean r0 = r2.A1T()     // Catch:{ IOException -> 0x0274 }
            if (r0 == 0) goto L_0x0196
            java.lang.Boolean r0 = X.C377839Nl.A00(r3)     // Catch:{ IOException -> 0x0274 }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x0274 }
            if (r0 == 0) goto L_0x01ba
            java.lang.Integer r1 = r2.A0b()     // Catch:{ IOException -> 0x0274 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x0274 }
            if (r1 != r0) goto L_0x0187
            X.0Tu r10 = X.0Tu.A05     // Catch:{ IOException -> 0x0274 }
            r0 = 36325665159591032(0x810e0000113478, double:3.035835146413826E-306)
            boolean r0 = X.182.A06(r10, r3, r0)     // Catch:{ IOException -> 0x0274 }
            if (r0 != 0) goto L_0x0187
            goto L_0x01ba
        L_0x0187:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0274 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0274 }
            boolean r0 = r2.A1n(r0)     // Catch:{ IOException -> 0x0274 }
            if (r0 == 0) goto L_0x0196
            goto L_0x01ba
        L_0x0196:
            X.2Dm r1 = r7.A01     // Catch:{ IOException -> 0x0274 }
            com.instagram.model.direct.DirectThreadKey r0 = r4.BJy()     // Catch:{ IOException -> 0x0274 }
            r1.A9f(r2, r0, r6)     // Catch:{ IOException -> 0x0274 }
            goto L_0x01ba
        L_0x01a0:
            X.48S r10 = r0.A0P(r10)     // Catch:{ IOException -> 0x0274 }
            if (r10 != 0) goto L_0x01f2
            java.lang.String r1 = "Null thread entry"
            java.lang.String r0 = "Entry should exist before function call"
            X.0wb.A03(r1, r0)     // Catch:{ IOException -> 0x0274 }
        L_0x01ad:
            com.instagram.model.direct.DirectThreadKey r1 = r4.BJy()     // Catch:{ IOException -> 0x0274 }
            r0 = r17
            java.util.ArrayList r0 = r0.Bm7(r1, r6)     // Catch:{ IOException -> 0x0274 }
            X.C331247Qd.A01(r3, r5, r0)     // Catch:{ IOException -> 0x0274 }
        L_0x01ba:
            java.lang.String r0 = r8.A02     // Catch:{ IOException -> 0x0274 }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException -> 0x0274 }
            X.O7n r0 = X.C66887MeQ.parseFromJson(r0)     // Catch:{ IOException -> 0x0274 }
            X.2Dm r6 = r7.A01     // Catch:{ IOException -> 0x0274 }
            com.instagram.model.direct.DirectThreadKey r1 = r4.BJy()     // Catch:{ IOException -> 0x0274 }
            X.3sQ r0 = r0.A00     // Catch:{ IOException -> 0x0274 }
            r6.CnF(r0, r1)     // Catch:{ IOException -> 0x0274 }
            boolean r0 = r9.A07     // Catch:{ IOException -> 0x0274 }
            if (r0 == 0) goto L_0x01d8
            java.lang.String r0 = r2.A1u     // Catch:{ IOException -> 0x0274 }
            X.C70148Ny2.A00(r3, r9, r5, r0)     // Catch:{ IOException -> 0x0274 }
        L_0x01d8:
            java.util.Iterator r5 = r26.iterator()     // Catch:{ IOException -> 0x0274 }
        L_0x01dc:
            boolean r0 = r5.hasNext()     // Catch:{ IOException -> 0x0274 }
            if (r0 == 0) goto L_0x026b
            java.lang.Object r3 = r5.next()     // Catch:{ IOException -> 0x0274 }
            X.42w r3 = (X.C2597342w) r3     // Catch:{ IOException -> 0x0274 }
            com.instagram.model.direct.DirectThreadKey r1 = r4.BJy()     // Catch:{ IOException -> 0x0274 }
            boolean r0 = r9.A06     // Catch:{ IOException -> 0x0274 }
            r3.D8s(r2, r1, r0)     // Catch:{ IOException -> 0x0274 }
            goto L_0x01dc
        L_0x01f2:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x0274 }
            monitor-enter(r10)     // Catch:{ IOException -> 0x0274 }
            X.3su r14 = r10.A0J(r6)     // Catch:{ all -> 0x0271 }
            r1 = 0
            if (r14 != 0) goto L_0x020e
            X.0wj r11 = X.0wj.A01     // Catch:{ all -> 0x0271 }
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "Message is missing from thread entry"
            X.0f9 r0 = r11.AEf(r0, r1)     // Catch:{ all -> 0x0271 }
            r0.report()     // Catch:{ all -> 0x0271 }
            monitor-exit(r10)     // Catch:{ IOException -> 0x0274 }
            goto L_0x01ad
        L_0x020e:
            X.2FW r0 = r14.A10     // Catch:{ all -> 0x0271 }
            X.2FW r15 = X.2FW.A1g     // Catch:{ all -> 0x0271 }
            if (r0 != r15) goto L_0x0240
            r14.A17(r15, r12)     // Catch:{ all -> 0x0271 }
            monitor-enter(r14)     // Catch:{ all -> 0x0271 }
            int r0 = r14.A01     // Catch:{ all -> 0x026e }
            if (r0 == r13) goto L_0x0221
            r14.A01 = r13     // Catch:{ all -> 0x026e }
            r0 = 1
            r14.A2C = r0     // Catch:{ all -> 0x026e }
        L_0x0221:
            monitor-exit(r14)     // Catch:{ all -> 0x0271 }
            boolean r12 = r16.booleanValue()     // Catch:{ all -> 0x0271 }
            monitor-enter(r14)     // Catch:{ all -> 0x0271 }
            boolean r0 = r14.A2H     // Catch:{ all -> 0x026e }
            if (r0 == r12) goto L_0x0230
            r14.A2H = r12     // Catch:{ all -> 0x026e }
            r0 = 1
            r14.A2C = r0     // Catch:{ all -> 0x026e }
        L_0x0230:
            monitor-exit(r14)     // Catch:{ all -> 0x0271 }
            r14.A1H(r1)     // Catch:{ all -> 0x0271 }
            r14.A1G(r1)     // Catch:{ all -> 0x0271 }
            java.util.List r0 = r14.A0u()     // Catch:{ all -> 0x0271 }
            if (r0 != 0) goto L_0x025a
            r14.A1J(r11)     // Catch:{ all -> 0x0271 }
        L_0x0240:
            X.3U9 r0 = r10.A0I     // Catch:{ all -> 0x0271 }
            com.instagram.model.direct.DirectThreadKey r19 = r0.BJz()     // Catch:{ all -> 0x0271 }
            java.util.List r23 = java.util.Collections.singletonList(r14)     // Catch:{ all -> 0x0271 }
            java.lang.Integer r20 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0271 }
            X.2Kb r11 = new X.2Kb     // Catch:{ all -> 0x0271 }
            r21 = r1
            r22 = r1
            r24 = r18
            r18 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0271 }
            goto L_0x0261
        L_0x025a:
            r0.addAll(r11)     // Catch:{ all -> 0x0271 }
            r14.A1J(r0)     // Catch:{ all -> 0x0271 }
            goto L_0x0240
        L_0x0261:
            monitor-exit(r10)     // Catch:{ IOException -> 0x0274 }
            r0 = r25
            X.1Ng r0 = r0.A06     // Catch:{ IOException -> 0x0274 }
            r0.A00(r11)     // Catch:{ IOException -> 0x0274 }
            goto L_0x01ad
        L_0x026b:
            X.6BL r2 = X.AnonymousClass6BL.A00     // Catch:{ IOException -> 0x0274 }
            return r2
        L_0x026e:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0271 }
            throw r0     // Catch:{ all -> 0x0271 }
        L_0x0271:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ IOException -> 0x0274 }
            throw r0     // Catch:{ IOException -> 0x0274 }
        L_0x0274:
            r3 = move-exception
            java.lang.String r1 = "NewMessageDeltaProcessor"
            java.lang.String r0 = "Invalid DirectMessage format"
            X.0KC.A0F(r1, r0, r3)
            X.6BQ r2 = new X.6BQ
            r2.<init>(r3, r1, r0)
            return r2
        L_0x0282:
            X.XPd r2 = X.C21215XPd.A00
            return r2
        L_0x0285:
            r0 = r7
            r1 = r9
            r2 = r5
            r3 = r10
            r4 = r26
            r5 = r13
            X.6BN r2 = r0.A00(r1, r2, r3, r4, r5, r6)
            return r2
        L_0x0291:
            r1 = move-exception
            java.lang.String r0 = "Invalid Protobuf format"
            goto L_0x029c
        L_0x0295:
            r1 = move-exception
            java.lang.String r0 = "Invalid JSON format"
            goto L_0x029c
        L_0x0299:
            r1 = move-exception
            java.lang.String r0 = "Invalid Base64 format"
        L_0x029c:
            X.0KC.A0F(r11, r0, r1)
            X.6BR r2 = new X.6BR
            r2.<init>(r1, r11, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2598743k.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }

    private final AnonymousClass6BN A00(AnonymousClass651 r14, String str, String str2, List list, 0sL r18, boolean z) {
        if (((Boolean) r18.invoke(str, r14)).booleanValue()) {
            return C21214XPc.A00;
        }
        2Dr r1 = this.A01;
        AnonymousClass3U9 C60 = r1.C60(str);
        if (C60 != null) {
            String str3 = str2;
            C254703su BRz = r1.BRz(C60.BJz(), str3);
            DirectThreadKey BJy = C60.BJz();
            2Dr r7 = r1;
            synchronized (r7) {
                r7.EE6(BJy, AnonymousClass05K.A00, str3, (String) null, z);
            }
            C331247Qd.A01(this.A00, str, r1.Bm7(C60.BJz(), str3));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2597342w r3 = (C2597342w) it.next();
                DirectThreadKey BJy2 = C60.BJz();
                if (BRz != null) {
                    r3.D8q(BRz, BJy2, r14.A06);
                } else {
                    r3.D8r(BJy2, r14.A01, str3, r14.A06);
                }
            }
        }
        return AnonymousClass6BL.A00;
    }
}
