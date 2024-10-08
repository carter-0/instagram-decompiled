package X;

public final class Q0b implements Runnable {
    public final /* synthetic */ C375089Ce A00;

    public Q0b(C375089Ce r1) {
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: org.json.JSONObject} */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:42|43|(4:45|46|47|(3:49|(4:51|52|53|(2:64|131)(4:55|56|57|(2:59|133)(1:132)))(1:(2:63|136))|65))(1:66)|67|68|128) */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x02ab */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            X.14t r2 = X.14t.A00()
        L_0x0004:
            java.util.Queue r1 = r2.A03
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x001a
            java.lang.Object r1 = r1.poll()
            X.9BX r1 = (X.AnonymousClass9BX) r1
            if (r1 == 0) goto L_0x0004
            java.util.Set r0 = X.AnonymousClass1JV.A00
            X.14t.A01(r1, r0)
            goto L_0x0004
        L_0x001a:
            java.util.List r0 = r2.A02
            java.util.Iterator r19 = r0.iterator()
        L_0x0020:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0397
            java.lang.Object r6 = r19.next()
            X.9Cc r6 = (X.C375069Cc) r6
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0020
            r5 = 1
            r6.A00 = r5
            X.157 r0 = r6.A01     // Catch:{ Error | Exception -> 0x0389 }
            if (r0 == 0) goto L_0x0020
            java.util.Map r2 = r0.A03()     // Catch:{ Error | Exception -> 0x0389 }
            if (r2 == 0) goto L_0x0020
            r4 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ Error | Exception -> 0x0389 }
            r0 = 45
            X.9BX r3 = new X.9BX     // Catch:{ Error | Exception -> 0x0389 }
            r3.<init>(r1, r0, r5)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = "cpu_boost_device_compatibility"
            java.lang.String r0 = "event"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.util.Set r0 = r2.entrySet()     // Catch:{ Error | Exception -> 0x0389 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Error | Exception -> 0x0389 }
        L_0x0058:
            boolean r0 = r2.hasNext()     // Catch:{ Error | Exception -> 0x0389 }
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r2.next()     // Catch:{ Error | Exception -> 0x0389 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Error | Exception -> 0x0389 }
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "no data"
        L_0x0075:
            r3.A02(r1, r0)     // Catch:{ Error | Exception -> 0x0389 }
            goto L_0x0058
        L_0x0079:
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "build_product"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "build_model"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "build_brand"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = android.os.Build.BOARD     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "build_board"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = android.os.Build.DEVICE     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "build_device"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "build_manufacturer"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            X.159 r2 = X.AnonymousClass159.A00()     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = r2.A00     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "chip_name"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r2 = r2.A01     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "chip_vendor"
            r3.A02(r0, r2)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "qualcomm"
            boolean r0 = r0.equals(r2)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "platform_qualcomm"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equals(r2)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "platform_samsung"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "mediatek"
            boolean r0 = r0.equals(r2)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "platform_mediatek"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "spreadtrum"
            boolean r0 = r0.equals(r2)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "platform_spreadtrum"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "hisilicon"
            boolean r0 = r0.equals(r2)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "platform_hisilicon"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            X.159 r0 = X.AnonymousClass159.A00()     // Catch:{ Error | Exception -> 0x0389 }
            X.15B r2 = r0.A08     // Catch:{ Error | Exception -> 0x0389 }
            int r0 = r2.A02     // Catch:{ Error | Exception -> 0x0389 }
            long r0 = (long) r0     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r7 = "cores"
            r3.A01(r7, r0)     // Catch:{ Error | Exception -> 0x0389 }
            boolean r0 = r2.A07     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "is_biglittle"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            boolean r0 = r2.A07     // Catch:{ Error | Exception -> 0x0389 }
            if (r0 == 0) goto L_0x02b7
            r9 = 0
            int[] r1 = r2.A0C     // Catch:{ Error | Exception -> 0x0389 }
            r0 = r1[r5]     // Catch:{ Error | Exception -> 0x0389 }
            r8 = r1[r4]     // Catch:{ Error | Exception -> 0x0389 }
            int r0 = r0 - r8
            double r0 = (double) r0     // Catch:{ Error | Exception -> 0x0389 }
            double r0 = r0 * r9
            int r7 = (int) r0     // Catch:{ Error | Exception -> 0x0389 }
            int r8 = r8 + r7
            int r0 = r8 / 1000
            long r0 = (long) r0     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r7 = "little_freq_min"
            r3.A01(r7, r0)     // Catch:{ Error | Exception -> 0x0389 }
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int[] r1 = r2.A0C     // Catch:{ Error | Exception -> 0x0389 }
            r0 = r1[r5]     // Catch:{ Error | Exception -> 0x0389 }
            r8 = r1[r4]     // Catch:{ Error | Exception -> 0x0389 }
            int r0 = r0 - r8
            double r0 = (double) r0     // Catch:{ Error | Exception -> 0x0389 }
            double r0 = r0 * r9
            int r7 = (int) r0     // Catch:{ Error | Exception -> 0x0389 }
            int r8 = r8 + r7
            int r0 = r8 / 1000
            long r0 = (long) r0     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r7 = "little_freq_max"
            r3.A01(r7, r0)     // Catch:{ Error | Exception -> 0x0389 }
            r9 = 0
            int[] r1 = r2.A0A     // Catch:{ Error | Exception -> 0x0389 }
            r0 = r1[r5]     // Catch:{ Error | Exception -> 0x0389 }
            r8 = r1[r4]     // Catch:{ Error | Exception -> 0x0389 }
            int r0 = r0 - r8
            double r0 = (double) r0     // Catch:{ Error | Exception -> 0x0389 }
            double r0 = r0 * r9
            int r7 = (int) r0     // Catch:{ Error | Exception -> 0x0389 }
            int r8 = r8 + r7
            int r0 = r8 / 1000
            long r0 = (long) r0     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r7 = "big_freq_min"
            r3.A01(r7, r0)     // Catch:{ Error | Exception -> 0x0389 }
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int[] r1 = r2.A0A     // Catch:{ Error | Exception -> 0x0389 }
            r0 = r1[r5]     // Catch:{ Error | Exception -> 0x0389 }
            r8 = r1[r4]     // Catch:{ Error | Exception -> 0x0389 }
            int r0 = r0 - r8
            double r0 = (double) r0     // Catch:{ Error | Exception -> 0x0389 }
            double r0 = r0 * r9
            int r7 = (int) r0     // Catch:{ Error | Exception -> 0x0389 }
            int r8 = r8 + r7
            int r0 = r8 / 1000
            long r0 = (long) r0     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r7 = "big_freq_max"
            r3.A01(r7, r0)     // Catch:{ Error | Exception -> 0x0389 }
            int r0 = r2.A03     // Catch:{ Error | Exception -> 0x0389 }
            long r0 = (long) r0     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r7 = "little_cores"
            r3.A01(r7, r0)     // Catch:{ Error | Exception -> 0x0389 }
            int r0 = r2.A00     // Catch:{ Error | Exception -> 0x0389 }
            long r0 = (long) r0     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r7 = "big_cores"
            r3.A01(r7, r0)     // Catch:{ Error | Exception -> 0x0389 }
            int r0 = r2.A05     // Catch:{ Error | Exception -> 0x0389 }
            if (r0 == 0) goto L_0x0195
            long r0 = (long) r0     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r7 = "mid_cores"
            r3.A01(r7, r0)     // Catch:{ Error | Exception -> 0x0389 }
        L_0x0195:
            int r0 = r2.A04     // Catch:{ Error | Exception -> 0x0389 }
            long r0 = (long) r0     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r7 = "little_index"
            r3.A01(r7, r0)     // Catch:{ Error | Exception -> 0x0389 }
            int r0 = r2.A01     // Catch:{ Error | Exception -> 0x0389 }
            long r0 = (long) r0     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r7 = "big_index"
        L_0x01a2:
            r3.A01(r7, r0)     // Catch:{ Error | Exception -> 0x0389 }
            boolean r0 = r2.A09     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "prebuild"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = X.S90.A00(r4)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "video_decode"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = X.S90.A00(r5)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "video_encode"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = X.S90.A01(r4)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "format_decode"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = X.S90.A01(r5)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "format_encode"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Error | Exception -> 0x0389 }
            r11.<init>()     // Catch:{ Error | Exception -> 0x0389 }
            r7 = 3
            java.lang.String r2 = "/vendor/etc/"
            r10 = 0
            java.lang.String r1 = "/etc"
            r18 = 2
            java.lang.String r0 = "/system/etc/"
            java.lang.String[] r17 = new java.lang.String[]{r2, r1, r0}     // Catch:{ Error | Exception -> 0x0389 }
        L_0x01ea:
            r0 = r17[r10]     // Catch:{ Error | Exception -> 0x0389 }
            java.io.File r1 = new java.io.File     // Catch:{ Error | Exception -> 0x0389 }
            r1.<init>(r0)     // Catch:{ Error | Exception -> 0x0389 }
            boolean r0 = r1.exists()     // Catch:{ Error | Exception -> 0x0389 }
            if (r0 == 0) goto L_0x02b2
            java.io.File[] r9 = r1.listFiles()     // Catch:{ Error | Exception -> 0x0389 }
            if (r9 == 0) goto L_0x02b2
            int r0 = r9.length     // Catch:{ Error | Exception -> 0x0389 }
            r20 = r0
            r12 = 0
        L_0x0201:
            r0 = r20
            if (r12 >= r0) goto L_0x02b2
            r1 = r9[r12]     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r2 = r1.getName()     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "media_codecs_performance"
            boolean r0 = r2.startsWith(r0)     // Catch:{ Error | Exception -> 0x0389 }
            if (r0 == 0) goto L_0x02ae
            java.lang.String r0 = ".xml"
            boolean r0 = r2.endsWith(r0)     // Catch:{ Error | Exception -> 0x0389 }
            if (r0 == 0) goto L_0x02ae
            java.lang.String r13 = r1.getCanonicalPath()     // Catch:{ all -> 0x02ae }
            java.lang.String r0 = "Start"
            r11.put(r13, r0)     // Catch:{ all -> 0x02ae }
            boolean r0 = r1.canRead()     // Catch:{ all -> 0x02ae }
            if (r0 == 0) goto L_0x02a9
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x02ae }
            r8.<init>()     // Catch:{ all -> 0x02ae }
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch:{ all -> 0x02ab }
            java.lang.String r0 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r2.setFeature(r0, r4)     // Catch:{ all -> 0x02ab }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x02ab }
            r0.<init>(r1)     // Catch:{ all -> 0x02ab }
            r2.setInput(r0)     // Catch:{ all -> 0x02ab }
            int r15 = r2.getEventType()     // Catch:{ all -> 0x02ab }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x02ab }
            r1.<init>()     // Catch:{ all -> 0x02ab }
        L_0x024a:
            if (r15 == r5) goto L_0x02ab
            java.lang.String r14 = "MediaCodec"
            r0 = r18
            if (r15 != r0) goto L_0x0277
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x02ab }
            boolean r15 = r0.equals(r14)     // Catch:{ all -> 0x02ab }
            java.lang.String r14 = "limits"
            if (r15 == 0) goto L_0x025f
            goto L_0x0289
        L_0x025f:
            java.lang.String r15 = "Limit"
            boolean r0 = r0.equals(r15)     // Catch:{ all -> 0x02ab }
            if (r0 == 0) goto L_0x02a4
            java.lang.String r15 = r2.getAttributeValue(r4)     // Catch:{ all -> 0x02ab }
            java.lang.String r0 = r2.getAttributeValue(r5)     // Catch:{ all -> 0x02ab }
            org.json.JSONObject r14 = r1.getJSONObject(r14)     // Catch:{ all -> 0x02ab }
            r14.put(r15, r0)     // Catch:{ all -> 0x02ab }
            goto L_0x02a4
        L_0x0277:
            if (r15 != r7) goto L_0x02a4
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x02ab }
            boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x02ab }
            if (r0 == 0) goto L_0x02a4
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x02ab }
            r1.<init>()     // Catch:{ all -> 0x02ab }
            goto L_0x02a4
        L_0x0289:
            java.lang.String r16 = r2.getAttributeValue(r4)     // Catch:{ all -> 0x02ab }
            java.lang.String r15 = r2.getAttributeValue(r5)     // Catch:{ all -> 0x02ab }
            java.lang.String r0 = "type"
            r1.put(r0, r15)     // Catch:{ all -> 0x02ab }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x02ab }
            r0.<init>()     // Catch:{ all -> 0x02ab }
            r1.put(r14, r0)     // Catch:{ all -> 0x02ab }
            r0 = r16
            r8.put(r0, r1)     // Catch:{ all -> 0x02ab }
        L_0x02a4:
            int r15 = r2.next()     // Catch:{ all -> 0x02ab }
            goto L_0x024a
        L_0x02a9:
            java.lang.String r8 = "Can't Read"
        L_0x02ab:
            r11.put(r13, r8)     // Catch:{ all -> 0x02ae }
        L_0x02ae:
            int r12 = r12 + 1
            goto L_0x0201
        L_0x02b2:
            int r10 = r10 + 1
            if (r10 < r7) goto L_0x01ea
            goto L_0x02e0
        L_0x02b7:
            r9 = 0
            int[] r1 = r2.A0B     // Catch:{ Error | Exception -> 0x0389 }
            r0 = r1[r5]     // Catch:{ Error | Exception -> 0x0389 }
            r8 = r1[r4]     // Catch:{ Error | Exception -> 0x0389 }
            int r0 = r0 - r8
            double r0 = (double) r0     // Catch:{ Error | Exception -> 0x0389 }
            double r0 = r0 * r9
            int r7 = (int) r0     // Catch:{ Error | Exception -> 0x0389 }
            int r8 = r8 + r7
            int r0 = r8 / 1000
            long r0 = (long) r0     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r7 = "freq_min"
            r3.A01(r7, r0)     // Catch:{ Error | Exception -> 0x0389 }
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int[] r1 = r2.A0B     // Catch:{ Error | Exception -> 0x0389 }
            r0 = r1[r5]     // Catch:{ Error | Exception -> 0x0389 }
            r8 = r1[r4]     // Catch:{ Error | Exception -> 0x0389 }
            int r0 = r0 - r8
            double r0 = (double) r0     // Catch:{ Error | Exception -> 0x0389 }
            double r0 = r0 * r9
            int r7 = (int) r0     // Catch:{ Error | Exception -> 0x0389 }
            int r8 = r8 + r7
            int r0 = r8 / 1000
            long r0 = (long) r0     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r7 = "freq_max"
            goto L_0x01a2
        L_0x02e0:
            java.lang.String r1 = r11.toString()     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "achievable_fps"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            android.content.Context r1 = X.C375069Cc.A04     // Catch:{ Error | Exception -> 0x0389 }
            if (r1 == 0) goto L_0x0382
            java.lang.String r0 = "display"
            java.lang.Object r2 = r1.getSystemService(r0)     // Catch:{ Error | Exception -> 0x0389 }
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2     // Catch:{ Error | Exception -> 0x0389 }
            if (r2 == 0) goto L_0x0382
            android.view.Display[] r0 = r2.getDisplays()     // Catch:{ Error | Exception -> 0x0389 }
            if (r0 == 0) goto L_0x0382
            int r0 = r0.length     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "display_count"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            r8 = 0
            android.view.Display r2 = r2.getDisplay(r4)     // Catch:{ Error | Exception -> 0x0389 }
            if (r2 == 0) goto L_0x0382
            java.lang.String r1 = r2.toString()     // Catch:{ Error | Exception -> 0x0389 }
            if (r1 == 0) goto L_0x0382
            java.lang.String r0 = "default_display_info"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            android.view.Display$HdrCapabilities r0 = r2.getHdrCapabilities()     // Catch:{ Error | Exception -> 0x0389 }
            if (r0 == 0) goto L_0x0382
            int[] r9 = r0.getSupportedHdrTypes()     // Catch:{ Error | Exception -> 0x0389 }
            if (r9 == 0) goto L_0x0382
            int r4 = r9.length     // Catch:{ Error | Exception -> 0x0389 }
            r0 = 0
            if (r4 < r5) goto L_0x032a
            r0 = 1
        L_0x032a:
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "hdr_supported"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "hdr_type_count"
            r3.A02(r0, r1)     // Catch:{ Error | Exception -> 0x0389 }
        L_0x033c:
            if (r8 >= r4) goto L_0x0382
            r11 = r9[r8]     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r10 = "]"
            java.lang.String r1 = "hdr_type["
            if (r11 == r5) goto L_0x0367
            r0 = 2
            if (r11 == r0) goto L_0x035c
            if (r11 == r7) goto L_0x0372
            r2 = 4
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = X.002.A0g(r1, r0, r10)     // Catch:{ Error | Exception -> 0x0389 }
            if (r11 == r2) goto L_0x0359
            java.lang.String r0 = "INVALID_HDR_TYPE"
            goto L_0x037c
        L_0x0359:
            java.lang.String r0 = "HDR_TYPE_HDR10_PLUS"
            goto L_0x037c
        L_0x035c:
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = X.002.A0g(r1, r0, r10)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "HDR_TYPE_HDR10"
            goto L_0x037c
        L_0x0367:
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = X.002.A0g(r1, r0, r10)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "HDR_TYPE_DOLBY_VISION"
            goto L_0x037c
        L_0x0372:
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r1 = X.002.A0g(r1, r0, r10)     // Catch:{ Error | Exception -> 0x0389 }
            java.lang.String r0 = "HDR_TYPE_HLG"
        L_0x037c:
            r3.A02(r1, r0)     // Catch:{ Error | Exception -> 0x0389 }
            int r8 = r8 + 1
            goto L_0x033c
        L_0x0382:
            X.14t r0 = r6.A03     // Catch:{ Error | Exception -> 0x0389 }
            r0.Chy(r3)     // Catch:{ Error | Exception -> 0x0389 }
            goto L_0x0020
        L_0x0389:
            r3 = move-exception
            X.14y r0 = r6.A02
            X.0Gb r2 = r0.A00
            java.lang.String r1 = "MobileBoost"
            java.lang.String r0 = "TrackingError"
            r2.Ew2(r1, r0, r3)
            goto L_0x0020
        L_0x0397:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q0b.run():void");
    }
}
