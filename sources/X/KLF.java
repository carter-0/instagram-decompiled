package X;

public final class KLF extends L0M {
    public static final KLF A00 = new KLF();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof KLF);
    }

    public final int hashCode() {
        return 494200322;
    }

    public final String toString() {
        return "Star";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KLF() {
        /*
            r9 = this;
            android.graphics.Path r2 = X.C51965G9l.A0C()
            r1 = 1114483615(0x426dab9f, float:59.4176)
            r0 = 1093895979(0x4133872b, float:11.2205)
            r2.moveTo(r1, r0)
            r3 = 1116230006(0x42885176, float:68.1591)
            r4 = -1066443106(0xffffffffc06f5e9e, float:-3.74015)
            r5 = 1119071882(0x42b3ae8a, float:89.8409)
            r7 = 1120217648(0x42c52a30, float:98.5824)
            r8 = 1093895874(0x413386c2, float:11.2204)
            r6 = r4
            r2.cubicTo(r3, r4, r5, r6, r7, r8)
            r1 = 1121409303(0x42d75917, float:107.674)
            r0 = 1104559840(0x41d63ee0, float:26.7807)
            r2.lineTo(r1, r0)
            r3 = 1121828995(0x42ddc083, float:110.876)
            r4 = 1107364702(0x42010b5e, float:32.2611)
            r5 = 1122532327(0x42e87be7, float:116.242)
            r6 = 1108383420(0x421096bc, float:36.1472)
            r7 = 1123347464(0x42f4ec08, float:122.461)
            r8 = 1108735269(0x4215f525, float:37.4894)
            r2.cubicTo(r3, r4, r5, r6, r7, r8)
            r1 = 1124867506(0x430c1db2, float:140.116)
            r0 = 1109734326(0x422533b6, float:41.3005)
            r2.lineTo(r1, r0)
            r3 = 1125979980(0x431d174c, float:157.091)
            r4 = 1110694874(0x4233dbda, float:44.9647)
            r5 = 1126419071(0x4323ca7f, float:163.791)
            r6 = 1115884080(0x42830a30, float:65.5199)
            r7 = 1125660623(0x431837cf, float:152.218)
            r8 = 1117576272(0x429cdc50, float:78.4303)
            r2.cubicTo(r3, r4, r5, r6, r7, r8)
            r1 = 1124871832(0x430c2e98, float:140.182)
            r0 = 1119336281(0x42b7b759, float:91.8581)
            r2.lineTo(r1, r0)
            r3 = 1124594024(0x4307f168, float:135.943)
            r4 = 1119956160(0x42c12cc0, float:96.5874)
            r5 = 1124459676(0x4305e49c, float:133.893)
            r6 = 1120780288(0x42cdc000, float:102.875)
            r7 = 1124501684(0x430688b4, float:134.534)
            r8 = 1121607352(0x42da5eb8, float:109.185)
            r2.cubicTo(r3, r4, r5, r6, r7, r8)
            r1 = 1124620960(0x43085aa0, float:136.354)
            r0 = 1123955638(0x42fe33b6, float:127.101)
            r2.lineTo(r1, r0)
            r3 = 1124735648(0x430a1aa0, float:138.104)
            r4 = 1125143413(0x43105375, float:144.326)
            r5 = 1123098690(0x42f12042, float:120.563)
            r6 = 1125975982(0x431d07ae, float:157.03)
            r7 = 1121015431(0x42d15687, float:104.669)
            r8 = 1125518410(0x43160c4a, float:150.048)
            r2.cubicTo(r3, r4, r5, r6, r7, r8)
            r0 = 1118848732(0x42b046dc, float:88.1384)
            r8 = 1125042553(0x430ec979, float:142.787)
            r2.lineTo(r0, r8)
            r3 = 1118085605(0x42a4a1e5, float:82.3162)
            r4 = 1124874912(0x430c3aa0, float:140.229)
            r5 = 1117216283(0x42975e1b, float:75.6838)
            r7 = 1116453156(0x428bb924, float:69.8616)
            r6 = r4
            r2.cubicTo(r3, r4, r5, r6, r7, r8)
            r1 = 1112888023(0x425552d7, float:53.3309)
            r0 = 1125518410(0x43160c4a, float:150.048)
            r2.lineTo(r1, r0)
            r3 = 1108721612(0x4215bfcc, float:37.4373)
            r4 = 1125975982(0x431d07ae, float:157.03)
            r5 = 1100950431(0x419f2b9f, float:19.8963)
            r6 = 1125143413(0x43105375, float:144.326)
            r7 = 1101867726(0x41ad2ace, float:21.6459)
            r8 = 1123955638(0x42fe33b6, float:127.101)
            r2.cubicTo(r3, r4, r5, r6, r7, r8)
            r1 = 1102821772(0x41bbb98c, float:23.4656)
            r0 = 1121607352(0x42da5eb8, float:109.185)
            r2.lineTo(r1, r0)
            r3 = 1103157789(0x41c0da1d, float:24.1065)
            r4 = 1120780288(0x42cdc000, float:102.875)
            r5 = 1102083260(0x41b074bc, float:22.057)
            r6 = 1119956160(0x42c12cc0, float:96.5874)
            r7 = 1099860699(0x418e8adb, float:17.8178)
            r8 = 1119336281(0x42b7b759, float:91.8581)
            r2.cubicTo(r3, r4, r5, r6, r7, r8)
            r1 = 1085866592(0x40b90260, float:5.78154)
            r0 = 1117576272(0x429cdc50, float:78.4303)
            r2.lineTo(r1, r0)
            r3 = -1061597531(0xffffffffc0b94ea5, float:-5.79085)
            r4 = 1115884080(0x42830a30, float:65.5199)
            r5 = 1063829761(0x3f68c101, float:0.909195)
            r6 = 1110694874(0x4233dbda, float:44.9647)
            r7 = 1099895459(0x418f12a3, float:17.8841)
            r8 = 1109734326(0x422533b6, float:41.3005)
            r2.cubicTo(r3, r4, r5, r6, r7, r8)
            r1 = 1108224115(0x420e2873, float:35.5395)
            r0 = 1108735269(0x4215f525, float:37.4894)
            r2.lineTo(r1, r0)
            r3 = 1109854179(0x422707e3, float:41.7577)
            r4 = 1108383420(0x421096bc, float:36.1472)
            r5 = 1111260791(0x423c7e77, float:47.1235)
            r6 = 1107364702(0x42010b5e, float:32.2611)
            r7 = 1112100228(0x42494d84, float:50.3257)
            r8 = 1104559840(0x41d63ee0, float:26.7807)
            r2.cubicTo(r3, r4, r5, r6, r7, r8)
            r2.close()
            r9.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KLF.<init>():void");
    }
}
