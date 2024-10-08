package X;

/* renamed from: X.QvX  reason: case insensitive filesystem */
public final class C8485QvX extends C8492Qve {
    public static C8485QvX A00;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r2 == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A0L(java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.String r18, int r19) {
        /*
            r14 = this;
            monitor-enter(r14)
            r8 = r18
            X.AnonymousClass3Qk.A02(r8)     // Catch:{ all -> 0x015d }
            r5 = 0
            X.SQt r4 = r14.A00     // Catch:{ all -> 0x015d }
            X.S2U r3 = r4.A09     // Catch:{ all -> 0x015d }
            java.lang.Boolean r0 = r3.A03     // Catch:{ all -> 0x015d }
            if (r0 != 0) goto L_0x006b
            monitor-enter(r3)     // Catch:{ all -> 0x015d }
            java.lang.Boolean r0 = r3.A03     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0065
            X.SQt r1 = r3.A02     // Catch:{ all -> 0x0067 }
            android.content.Context r0 = r1.A00     // Catch:{ all -> 0x0067 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = X.C9126RPy.A00     // Catch:{ all -> 0x0067 }
            if (r6 != 0) goto L_0x0026
            java.lang.String r6 = android.app.Application.getProcessName()     // Catch:{ all -> 0x0067 }
            X.C9126RPy.A00 = r6     // Catch:{ all -> 0x0067 }
        L_0x0026:
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r0.processName     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0033
            boolean r2 = r0.equals(r6)     // Catch:{ all -> 0x0067 }
            r0 = 1
            if (r2 != 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0067 }
            r3.A03 = r0     // Catch:{ all -> 0x0067 }
        L_0x003a:
            java.lang.Boolean r0 = r3.A03     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0046
            java.lang.Boolean r0 = r3.A03     // Catch:{ all -> 0x0067 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0052
        L_0x0046:
            java.lang.String r0 = "com.google.android.gms.analytics"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0052
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0067 }
            r3.A03 = r0     // Catch:{ all -> 0x0067 }
        L_0x0052:
            java.lang.Boolean r0 = r3.A03     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0065
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0067 }
            r3.A03 = r0     // Catch:{ all -> 0x0067 }
            X.QvX r2 = r1.A0C     // Catch:{ all -> 0x0067 }
            X.C11381SQt.A02(r2)     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = "My process not in the list of running processes"
            r0 = 6
            X.ST5.A0B(r2, r1, r0)     // Catch:{ all -> 0x0067 }
        L_0x0065:
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            goto L_0x015a
        L_0x006b:
            java.lang.Boolean r0 = r3.A03     // Catch:{ all -> 0x015d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x015d }
            r7 = 99
            if (r0 == 0) goto L_0x0077
            r7 = 67
        L_0x0077:
            java.lang.String r0 = "01VDIWEA?"
            r1 = r19
            char r6 = r0.charAt(r1)     // Catch:{ all -> 0x015d }
            java.lang.String r3 = X.C10087RmP.A00     // Catch:{ all -> 0x015d }
            java.lang.String r2 = A00(r15)     // Catch:{ all -> 0x015d }
            java.lang.String r1 = A00(r16)     // Catch:{ all -> 0x015d }
            java.lang.String r0 = A00(r17)     // Catch:{ all -> 0x015d }
            java.lang.String r2 = X.ST5.A09(r8, r2, r1, r0)     // Catch:{ all -> 0x015d }
            int r0 = X.Pxf.A09(r3)     // Catch:{ all -> 0x015d }
            int r0 = r0 + 4
            java.lang.StringBuilder r1 = X.Pxh.A0q(r2, r0)     // Catch:{ all -> 0x015d }
            java.lang.String r0 = "3"
            r1.append(r0)     // Catch:{ all -> 0x015d }
            r1.append(r6)     // Catch:{ all -> 0x015d }
            r1.append(r7)     // Catch:{ all -> 0x015d }
            r1.append(r3)     // Catch:{ all -> 0x015d }
            java.lang.String r0 = ":"
            java.lang.String r9 = X.Pxg.A0s(r0, r2, r1)     // Catch:{ all -> 0x015d }
            int r1 = r9.length()     // Catch:{ all -> 0x015d }
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 <= r0) goto L_0x00bb
            java.lang.String r9 = r9.substring(r5, r0)     // Catch:{ all -> 0x015d }
        L_0x00bb:
            X.QvY r1 = r4.A0D     // Catch:{ all -> 0x015d }
            if (r1 == 0) goto L_0x015b
            boolean r0 = r1.A00     // Catch:{ all -> 0x015d }
            if (r0 == 0) goto L_0x015b
            X.SEI r7 = r1.A03     // Catch:{ all -> 0x015d }
            X.QvY r10 = r7.A01     // Catch:{ all -> 0x015d }
            android.content.SharedPreferences r2 = r10.A00     // Catch:{ all -> 0x015d }
            java.lang.String r13 = "monitoring"
            java.lang.String r1 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x015d }
            java.lang.String r0 = ":start"
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x015d }
            r5 = 0
            long r1 = r2.getLong(r0, r5)     // Catch:{ all -> 0x015d }
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00e3
            X.SEI.A00(r7)     // Catch:{ all -> 0x015d }
        L_0x00e3:
            if (r9 != 0) goto L_0x00e7
            java.lang.String r9 = ""
        L_0x00e7:
            monitor-enter(r7)     // Catch:{ all -> 0x015d }
            android.content.SharedPreferences r1 = r10.A00     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0158 }
            java.lang.String r8 = ":count"
            java.lang.String r0 = r0.concat(r8)     // Catch:{ all -> 0x0158 }
            long r1 = r1.getLong(r0, r5)     // Catch:{ all -> 0x0158 }
            r3 = 1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0121
            android.content.SharedPreferences r0 = r10.A00     // Catch:{ all -> 0x0158 }
            android.content.SharedPreferences$Editor r5 = r0.edit()     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = ":value"
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x0158 }
            r5.putString(r0, r9)     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = r0.concat(r8)     // Catch:{ all -> 0x0158 }
            r5.putLong(r0, r3)     // Catch:{ all -> 0x0158 }
        L_0x011c:
            r5.apply()     // Catch:{ all -> 0x0158 }
            monitor-exit(r7)     // Catch:{ all -> 0x0158 }
            goto L_0x015b
        L_0x0121:
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0158 }
            long r11 = r0.getLeastSignificantBits()     // Catch:{ all -> 0x0158 }
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r11 = r11 & r5
            long r1 = r1 + r3
            long r5 = r5 / r1
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            boolean r3 = X.C51970G9q.A1T(r0)
            android.content.SharedPreferences r0 = r10.A00     // Catch:{ all -> 0x0158 }
            android.content.SharedPreferences$Editor r5 = r0.edit()     // Catch:{ all -> 0x0158 }
            if (r3 == 0) goto L_0x014c
            java.lang.String r3 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = ":value"
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x0158 }
            r5.putString(r0, r9)     // Catch:{ all -> 0x0158 }
        L_0x014c:
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = r0.concat(r8)     // Catch:{ all -> 0x0158 }
            r5.putLong(r0, r1)     // Catch:{ all -> 0x0158 }
            goto L_0x011c
        L_0x0158:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0158 }
        L_0x015a:
            throw r0     // Catch:{ all -> 0x015d }
        L_0x015b:
            monitor-exit(r14)
            return
        L_0x015d:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8485QvX.A0L(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, int):void");
    }

    public static String A00(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = DbS.A0j(AnonymousClass7TE.A0M(obj));
        }
        String str = "-";
        if (obj instanceof Long) {
            long abs = Math.abs(AnonymousClass7TE.A0R(obj));
            int i = (abs > 100 ? 1 : (abs == 100 ? 0 : -1));
            String valueOf = String.valueOf(obj);
            if (i < 0) {
                return valueOf;
            }
            if (Pxe.A00(valueOf) != '-') {
                str = "";
            }
            String valueOf2 = String.valueOf(abs);
            StringBuilder A0n = AnonymousClass7TF.A0n(str);
            int length = valueOf2.length();
            A0n.append(Math.round(Math.pow(10.0d, (double) (length - 1))));
            A0n.append("...");
            A0n.append(str);
            return Pxe.A10(A0n, Math.round(Math.pow(10.0d, (double) length) - 1.0d));
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                return Pxf.A0g(obj);
            }
            return str;
        }
    }

    public final void A0K(C11250SHk sHk, String str) {
        String str2;
        if (sHk != null) {
            str2 = sHk.toString();
        } else {
            str2 = "no hit data";
        }
        A0G(Pxh.A0m("Discarding hit. ", str), str2);
    }
}
