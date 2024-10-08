package X;

/* renamed from: X.Wm7  reason: case insensitive filesystem */
public final class C20147Wm7 implements Runnable {
    public final /* synthetic */ C17560VaE A00;
    public final /* synthetic */ AnonymousClass4CG A01;

    public C20147Wm7(C17560VaE vaE, AnonymousClass4CG r2) {
        this.A01 = r2;
        this.A00 = vaE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            java.lang.String r11 = "__data__/"
            r0 = r17
            X.VaE r2 = r0.A00
            java.lang.String r12 = r2.A03
            java.lang.String r13 = "/"
            java.lang.String r14 = r2.A05
            java.lang.String r7 = r2.A02
            r15 = r13
            r16 = r7
            java.lang.String r6 = X.002.A13(r11, r12, r13, r14, r15, r16)
            X.4CG r5 = r0.A01
            java.util.Map r4 = r5.A02
            java.lang.Object r3 = r4.get(r6)
            X.Vuh r3 = (X.C18590Vuh) r3
            r0 = 0
            if (r3 != 0) goto L_0x0041
            android.content.SharedPreferences r8 = r5.A00
            java.lang.String r1 = r8.getString(r6, r0)
            if (r1 == 0) goto L_0x005b
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x005b
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003d }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x003d }
            X.Vuh r3 = X.C18590Vuh.A00(r0)     // Catch:{ JSONException -> 0x003d }
            r4.put(r6, r3)     // Catch:{ JSONException -> 0x003d }
            goto L_0x0041
        L_0x003d:
            X.C13989Tnp.A10(r8, r6)
            goto L_0x005b
        L_0x0041:
            long r10 = java.lang.System.currentTimeMillis()
            long r0 = r3.A0C
            long r10 = r10 - r0
            long r8 = X.AnonymousClass4CG.A04
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0076
            X.4CF r0 = r5.A01
            r0.A01(r3)
            android.content.SharedPreferences r0 = r5.A00
            X.C13989Tnp.A10(r0, r6)
            r4.remove(r6)
        L_0x005b:
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "__insert"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011c
            X.Vuh r3 = new X.Vuh
            r3.<init>()
            r3.A0E = r12
            r3.A0F = r14
            r3.A0D = r7
            long r0 = java.lang.System.currentTimeMillis()
            r3.A0C = r0
        L_0x0076:
            java.lang.String r11 = r2.A01
            java.lang.String r7 = r2.A04
            int r0 = r2.A00
            boolean r1 = r3.A0I
            boolean r12 = r3.A0H
            r2 = 2
            r0 = r0 & 2
            boolean r15 = X.AnonymousClass7TF.A1S(r0, r2)
            java.lang.String r10 = "__insert"
            r0 = 2550(0x9f6, float:3.573E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            java.lang.String r8 = "__get"
            r13 = 1
            if (r15 == 0) goto L_0x01ac
            boolean r0 = r10.equals(r11)
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r8.equals(r11)
            if (r0 == 0) goto L_0x01ac
        L_0x00a1:
            r0 = 1
            r3.A0I = r0
            r3.A0H = r0
        L_0x00a6:
            boolean r0 = r8.equals(r11)
            if (r0 == 0) goto L_0x011d
            long r0 = r3.A00
            long r0 = r0 + r13
            r3.A00 = r0
            long r0 = r3.A01
            long r0 = r0 + r13
            r3.A01 = r0
            long r0 = r3.A02
            if (r15 != 0) goto L_0x00bc
            r13 = 0
        L_0x00bc:
            long r0 = r0 + r13
            r3.A02 = r0
        L_0x00bf:
            r4.put(r6, r3)
            android.content.SharedPreferences r0 = r5.A00
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r1 = r3.A0E
            java.lang.String r0 = "cache_name"
            r4.put(r0, r1)
            java.lang.String r1 = r3.A0F
            java.lang.String r0 = "session_key"
            r4.put(r0, r1)
            java.lang.String r1 = r3.A0D
            java.lang.String r0 = "cache_key"
            r4.put(r0, r1)
            java.util.HashMap r0 = r3.A01()
            r4.putAll(r0)
            java.util.Map r1 = r3.A0G
            java.lang.String r0 = "additional_metadata"
            r4.put(r0, r1)
            long r0 = r3.A0C
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "tracking_start_time_ms"
            r4.put(r0, r1)
            boolean r0 = r3.A0I
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "last_known_existence"
            r4.put(r0, r1)
            boolean r0 = r3.A0H
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "had_known_existence"
            r4.put(r0, r1)
            java.lang.String r0 = X.JTQ.A0c(r4)
            android.content.SharedPreferences$Editor r0 = r2.putString(r6, r0)
            r0.apply()
        L_0x011c:
            return
        L_0x011d:
            boolean r0 = r10.equals(r11)
            if (r0 == 0) goto L_0x0143
            long r0 = r3.A00
            long r0 = r0 + r13
            r3.A00 = r0
            long r0 = r3.A03
            long r0 = r0 + r13
            r3.A03 = r0
            java.lang.String r0 = "refresh"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x013a
            long r0 = r3.A06
            long r0 = r0 + r13
            r3.A06 = r0
        L_0x013a:
            if (r12 == 0) goto L_0x00bf
            long r0 = r3.A05
            long r0 = r0 + r13
            r3.A05 = r0
            goto L_0x00bf
        L_0x0143:
            boolean r0 = r9.equals(r11)
            if (r0 == 0) goto L_0x018b
            long r0 = r3.A00
            long r0 = r0 + r13
            r3.A00 = r0
            long r0 = r3.A07
            long r0 = r0 + r13
            r3.A07 = r0
            r0 = 3073(0xc01, float:4.306E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0166
            long r0 = r3.A08
            long r0 = r0 + r13
            r3.A08 = r0
            goto L_0x00bf
        L_0x0166:
            java.lang.String r0 = "stale"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0175
            long r0 = r3.A09
            long r0 = r0 + r13
            r3.A09 = r0
            goto L_0x00bf
        L_0x0175:
            java.lang.String r0 = "user"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0184
            long r0 = r3.A0B
            long r0 = r0 + r13
            r3.A0B = r0
            goto L_0x00bf
        L_0x0184:
            long r0 = r3.A0A
            long r0 = r0 + r13
            r3.A0A = r0
            goto L_0x00bf
        L_0x018b:
            java.lang.String r0 = "__key_size"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x01a5
            long r0 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x019b }
            r3.A04 = r0     // Catch:{ NumberFormatException -> 0x019b }
            goto L_0x00bf
        L_0x019b:
            r2 = move-exception
            java.lang.String r1 = "KeyDataProcessor"
            java.lang.String r0 = "Failed to parse size of the key"
            X.0I1.A07(r1, r0, r2)
            goto L_0x00bf
        L_0x01a5:
            java.util.Map r0 = r3.A0G
            r0.put(r11, r7)
            goto L_0x00bf
        L_0x01ac:
            boolean r0 = r9.equals(r11)
            r2 = 0
            if (r0 != 0) goto L_0x01cc
            if (r15 != 0) goto L_0x00a6
            if (r1 == 0) goto L_0x00a6
            boolean r0 = r8.equals(r11)
            if (r0 == 0) goto L_0x00a6
            long r0 = r3.A00
            long r0 = r0 + r13
            r3.A00 = r0
            long r0 = r3.A07
            long r0 = r0 + r13
            r3.A07 = r0
            long r0 = r3.A0A
            long r0 = r0 + r13
            r3.A0A = r0
        L_0x01cc:
            r3.A0I = r2
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20147Wm7.run():void");
    }
}
