package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

public final class WN2 implements X8K {
    public final long A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;

    public WN2(String str, String str2, Map map, Map map2, Map map3, long j) {
        AnonymousClass7TG.A0w(1, str, map, map2);
        this.A01 = str;
        this.A02 = str2;
        this.A04 = map;
        this.A05 = map2;
        this.A00 = j;
        this.A03 = map3;
    }

    public final String getStringForKey(String str) {
        0qQ.A0B(str, 0);
        if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
            return this.A01;
        }
        Object obj = this.A03.get(str);
        if (obj == null) {
            obj = "";
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return str2;
        }
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String BwS() {
        /*
            r4 = this;
            java.util.Map r0 = r4.A05
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r0)
        L_0x0006:
            boolean r0 = r2.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x0053
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            X.X3A r0 = (X.X3A) r0
            boolean r0 = X.W0i.A02(r4, r0)
            if (r0 == 0) goto L_0x0006
        L_0x0020:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = X.DbT.A13(r1)
            if (r0 != 0) goto L_0x0052
        L_0x002a:
            java.util.Map r0 = r4.A04
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r0)
        L_0x0030:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = X.W0i.A03(r4, r0)
            if (r0 == 0) goto L_0x0030
            r3 = r1
        L_0x004a:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L_0x0055
            java.lang.String r0 = X.DbT.A13(r3)
        L_0x0052:
            return r0
        L_0x0053:
            r1 = r3
            goto L_0x0020
        L_0x0055:
            java.lang.String r0 = r4.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WN2.BwS():java.lang.String");
    }

    public final long C7M() {
        return this.A00;
    }

    public final String getDisplayName() {
        String str = this.A02;
        if (str == null) {
            return this.A01;
        }
        return str;
    }
}
