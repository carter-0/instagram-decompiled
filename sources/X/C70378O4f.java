package X;

/* renamed from: X.O4f  reason: case insensitive filesystem */
public abstract /* synthetic */ class C70378O4f {
    public static final /* synthetic */ int[] A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0050 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0013 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0018 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0021 */
    static {
        /*
            X.NiD[] r0 = X.C69251NiD.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            A00 = r2
            X.NiD r0 = X.C69251NiD.A0B     // Catch:{ NoSuchFieldError -> 0x000e }
            X.C66581MXm.A1N(r0, r2)     // Catch:{ NoSuchFieldError -> 0x000e }
        L_0x000e:
            X.NiD r0 = X.C69251NiD.A0A     // Catch:{ NoSuchFieldError -> 0x0013 }
            X.C51970G9q.A1M(r0, r2)     // Catch:{ NoSuchFieldError -> 0x0013 }
        L_0x0013:
            X.NiD r0 = X.C69251NiD.A05     // Catch:{ NoSuchFieldError -> 0x0018 }
            X.C66581MXm.A1O(r0, r2)     // Catch:{ NoSuchFieldError -> 0x0018 }
        L_0x0018:
            X.NiD r0 = X.C69251NiD.A0F     // Catch:{ NoSuchFieldError -> 0x0021 }
            int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
            r0 = 4
            r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            X.NiD r0 = X.C69251NiD.A0G     // Catch:{ NoSuchFieldError -> 0x002a }
            int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r0 = 5
            r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            X.NiD r0 = X.C69251NiD.A0E     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r0 = 6
            r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            X.NiD r0 = X.C69251NiD.A07     // Catch:{ NoSuchFieldError -> 0x003c }
            int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
            r0 = 7
            r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            X.NiD r0 = X.C69251NiD.A0C     // Catch:{ NoSuchFieldError -> 0x0046 }
            int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
            r0 = 8
            r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0046 }
        L_0x0046:
            X.NiD r0 = X.C69251NiD.A06     // Catch:{ NoSuchFieldError -> 0x0050 }
            int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
            r0 = 9
            r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0050 }
        L_0x0050:
            X.NiD r0 = X.C69251NiD.A0D     // Catch:{ NoSuchFieldError -> 0x005a }
            int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
            r0 = 10
            r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x005a }
        L_0x005a:
            X.NiD r0 = X.C69251NiD.A09     // Catch:{ NoSuchFieldError -> 0x0064 }
            int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
            r0 = 11
            r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
        L_0x0064:
            X.NiD r0 = X.C69251NiD.A0I     // Catch:{ NoSuchFieldError -> 0x006e }
            int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
            r0 = 12
            r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            X.NiD r0 = X.C69251NiD.A0H     // Catch:{ NoSuchFieldError -> 0x0078 }
            int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
            r0 = 13
            r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0078 }
        L_0x0078:
            X.NiD r0 = X.C69251NiD.A08     // Catch:{ NoSuchFieldError -> 0x0082 }
            int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
            r0 = 14
            r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0082 }
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70378O4f.<clinit>():void");
    }
}
