package X;

/* renamed from: X.7QG  reason: invalid class name */
public abstract class AnonymousClass7QG {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        r0 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        return r1.getQueryParameter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r2.equals(r0) != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(android.net.Uri r1, java.lang.String r2) {
        /*
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1411109025: goto L_0x001f;
                case 446723834: goto L_0x0011;
                case 1155029876: goto L_0x002c;
                case 1981798234: goto L_0x001c;
                default: goto L_0x000f;
            }
        L_0x000f:
            r0 = 0
            return r0
        L_0x0011:
            java.lang.String r0 = "direct_v2_delete_item"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "did"
            goto L_0x0036
        L_0x001c:
            java.lang.String r0 = "direct_v2_message"
            goto L_0x0025
        L_0x001f:
            r0 = 590(0x24e, float:8.27E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x0025:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0034
            goto L_0x000f
        L_0x002c:
            java.lang.String r0 = "direct_v2_reply_reminder"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000f
        L_0x0034:
            java.lang.String r0 = "id"
        L_0x0036:
            java.lang.String r0 = r1.getQueryParameter(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7QG.A00(android.net.Uri, java.lang.String):java.lang.String");
    }

    public static final String A01(String str, String str2) {
        boolean z = false;
        if (str2.length() == 0) {
            z = true;
        }
        if (!z && 00l.A0d(str2, ";", false) && 00l.A0d(str2, str, false)) {
            for (String str3 : (String[]) new 11S(";").A03(str2).toArray(new String[0])) {
                if (00l.A0d(str3, str, false)) {
                    return ((String[]) new 11S(str).A03(str3).toArray(new String[0]))[1];
                }
            }
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.length() == 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            if (r4 == 0) goto L_0x0011
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            java.lang.String r1 = ";"
            if (r0 != 0) goto L_0x0021
            r2.append(r1)
            java.lang.String r0 = "thread_id:"
            r2.append(r0)
            r2.append(r4)
        L_0x0021:
            if (r5 == 0) goto L_0x0034
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0034
            r2.append(r1)
            java.lang.String r0 = "type:"
            r2.append(r0)
            r2.append(r5)
        L_0x0034:
            java.lang.String r0 = r2.toString()
            X.0qQ.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7QG.A02(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
