package X;

import android.content.Context;

/* renamed from: X.6Ku  reason: invalid class name and case insensitive filesystem */
public enum C306106Ku {
    NORMAL("normal"),
    CREATE("rich-text"),
    SUPERZOOM("superzoom"),
    FOCUS("focus"),
    SUPERZOOM_V3("superzoomV3"),
    BOOMERANG("boomerang"),
    CLIPS_V1("clips"),
    CLIPS("clips_v2"),
    LAYOUT("layout"),
    HANDS_FREE("hands_free"),
    DUAL("dual"),
    MULTI_CAPTURE("multi-capture"),
    UNKNOWN("unknown");
    
    public static final C306116Kv A01 = null;
    public final String A00;

    /* JADX WARNING: type inference failed for: r0v15, types: [X.6Kv, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        C306106Ku[] r0;
        A02 = 0oU.A00(r0);
        A01 = new Object();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r4.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002a, code lost:
        return new com.instagram.creation.cameraconfiguration.CameraConfiguration(r3, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.creation.cameraconfiguration.CameraConfiguration A00() {
        /*
            r5 = this;
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            X.9QA r3 = X.AnonymousClass9QA.A00
            int r0 = r5.ordinal()
            r1 = 0
            java.lang.String r2 = "ReelCaptureType"
            switch(r0) {
                case 0: goto L_0x0025;
                case 1: goto L_0x002e;
                case 2: goto L_0x0025;
                case 3: goto L_0x0040;
                case 4: goto L_0x0025;
                case 5: goto L_0x0031;
                case 6: goto L_0x0011;
                case 7: goto L_0x0034;
                case 8: goto L_0x0037;
                case 9: goto L_0x002b;
                case 10: goto L_0x003a;
                case 11: goto L_0x0011;
                case 12: goto L_0x0045;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "conversion to CameraConfiguration not handled: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            X.0wb.A03(r2, r0)
        L_0x0025:
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = new com.instagram.creation.cameraconfiguration.CameraConfiguration
            r0.<init>(r3, r4)
            return r0
        L_0x002b:
            X.8aL r0 = X.C358088aL.A0M
            goto L_0x003c
        L_0x002e:
            X.8aL r0 = X.C358088aL.A0C
            goto L_0x003c
        L_0x0031:
            X.8aL r0 = X.C358088aL.A0B
            goto L_0x003c
        L_0x0034:
            X.80N r3 = X.AnonymousClass80N.A00
            goto L_0x0025
        L_0x0037:
            X.8aL r0 = X.C358088aL.A0T
            goto L_0x003c
        L_0x003a:
            X.8aL r0 = X.C358088aL.A0D
        L_0x003c:
            r4.add(r0)
            goto L_0x0025
        L_0x0040:
            java.lang.String r0 = "Focus is no longer supported"
            X.0wb.A03(r2, r0)
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C306106Ku.A00():com.instagram.creation.cameraconfiguration.CameraConfiguration");
    }

    /* access modifiers changed from: public */
    C306106Ku(String str) {
        this.A00 = str;
    }

    public final String A01(Context context) {
        int i;
        switch (ordinal()) {
            case 1:
                i = 2131953216;
                break;
            case 2:
            case 4:
                i = 2131953222;
                break;
            case 3:
                i = 2131953219;
                break;
            case 5:
                i = 2131953213;
                break;
            case 7:
                i = 2131953214;
                break;
            case 8:
                i = 2131953220;
                break;
            case 10:
                i = 2131953218;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("no attribution label for: ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
        }
        String string = context.getString(i);
        0qQ.A07(string);
        return string;
    }
}
