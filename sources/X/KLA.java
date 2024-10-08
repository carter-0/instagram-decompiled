package X;

public final class KLA extends L0M {
    public static final KLA A00 = new KLA();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof KLA);
    }

    public final int hashCode() {
        return 2100964875;
    }

    public final String toString() {
        return "Flower";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KLA() {
        /*
            r16 = this;
            android.graphics.Path r1 = X.C51965G9l.A0C()
            r8 = 1124633412(0x43088b44, float:136.544)
            r0 = 1118418253(0x42a9b54d, float:84.8541)
            r1.moveTo(r8, r0)
            r2 = 1124547953(0x43073d71, float:135.24)
            r3 = 1118318192(0x42a82e70, float:84.0907)
            r4 = 1124462428(0x4305ef5c, float:133.935)
            r5 = 1118232419(0x42a6df63, float:83.4363)
            r6 = 1124376904(0x4304a148, float:132.63)
            r7 = 1118160932(0x42a5c824, float:82.8909)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r5 = 1118089458(0x42a4b0f2, float:82.3456)
            r6 = 1124555031(0x43075917, float:135.348)
            r7 = 1118003685(0x42a361e5, float:81.6912)
            r9 = 1117903611(0x42a1dafb, float:80.9277)
            r3 = r1
            r3.cubicTo(r4, r5, r6, r7, r8, r9)
            r2 = 1125538267(0x431659db, float:150.351)
            r3 = 1116860029(0x4291ee7d, float:72.9658)
            r4 = 1125851791(0x431b228f, float:155.135)
            r5 = 1113374825(0x425cc069, float:55.1879)
            r6 = 1125324554(0x4313170a, float:147.09)
            r7 = 1109743737(0x42255879, float:41.3364)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1124804395(0x430b272b, float:139.153)
            r3 = 1104986243(0x41dcc083, float:27.594)
            r4 = 1123226878(0x42f314fe, float:121.541)
            r5 = 1102527385(0x41b73b99, float:22.9041)
            r6 = 1121417167(0x42d777cf, float:107.734)
            r7 = 1106701713(0x41f6ed91, float:30.866)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1121246249(0x42d4dc29, float:106.43)
            r3 = 1107101955(0x41fd0903, float:31.6294)
            r4 = 1121089487(0x42d277cf, float:105.234)
            r5 = 1107427852(0x4202020c, float:32.502)
            r6 = 1120947012(0x42d04b44, float:104.147)
            r7 = 1107656573(0x42057f7d, float:33.3745)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1120975454(0x42d0ba5e, float:104.364)
            r3 = 1107273502(0x41ffa71e, float:31.9566)
            r4 = 1120989741(0x42d0f22d, float:104.473)
            r5 = 1106472967(0x41f37007, float:30.4297)
            r7 = 1105729579(0x41e8182b, float:29.0118)
            r6 = r4
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r11 = 1095739900(0x414fa9fc, float:12.979)
            r12 = 1119279763(0x42b6da93, float:91.4269)
            r13 = 0
            r14 = 1117199322(0x42971bda, float:75.5544)
            r9 = r1
            r10 = r2
            r15 = r13
            r9.cubicTo(r10, r11, r12, r13, r14, r15)
            r2 = 1114552874(0x426eba2a, float:59.6818)
            r3 = 0
            r4 = 1111132943(0x423a8b0f, float:46.6358)
            r5 = 1095739900(0x414fa9fc, float:12.979)
            r6 = r4
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1111132943(0x423a8b0f, float:46.6358)
            r3 = 1106530166(0x41f44f76, float:30.5388)
            r4 = 1111161438(0x423afa5e, float:46.7445)
            r5 = 1107273502(0x41ffa71e, float:31.9566)
            r6 = 1111218428(0x423bd8fc, float:46.9619)
            r7 = 1107656573(0x42057f7d, float:33.3745)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1110933452(0x42377fcc, float:45.8748)
            r3 = 1107427852(0x4202020c, float:32.502)
            r4 = 1110591459(0x423247e3, float:44.5702)
            r5 = 1107101955(0x41fd0903, float:31.6294)
            r6 = 1110277960(0x422d7f48, float:43.3743)
            r7 = 1106701713(0x41f6ed91, float:30.866)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1106020821(0x41ec89d5, float:29.5673)
            r3 = 1102527385(0x41b73b99, float:22.9041)
            r4 = 1094552388(0x413d8b44, float:11.8465)
            r5 = 1104986243(0x41dcc083, float:27.594)
            r6 = 1081753909(0x407a4135, float:3.91023)
            r7 = 1109772337(0x4225c831, float:41.4455)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = -1065298543(0xffffffffc080d591, float:-4.02607)
            r3 = 1113403425(0x425d3021, float:55.297)
            r4 = 1059460001(0x3f2613a1, float:0.648737)
            r5 = 1116874329(0x42922659, float:73.0749)
            r6 = 1097288332(0x41674a8c, float:14.4557)
            r7 = 1117917911(0x42a212d7, float:81.0368)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1098656304(0x417c2a30, float:15.7603)
            r3 = 1118017985(0x42a399c1, float:81.8003)
            r4 = 1099465962(0x418884ea, float:17.0649)
            r5 = 1118103758(0x42a4e8ce, float:82.4547)
            r6 = 1100149948(0x4192f4bc, float:18.3695)
            r7 = 1118175232(0x42a60000, float:83.0)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1099465962(0x418884ea, float:17.0649)
            r3 = 1118246706(0x42a71732, float:83.5453)
            r4 = 1098542324(0x417a6cf4, float:15.6516)
            r5 = 1118332479(0x42a8663f, float:84.1997)
            r6 = 1097288332(0x41674a8c, float:14.4557)
            r7 = 1118432553(0x42a9ed29, float:84.9632)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1059460001(0x3f2613a1, float:0.648737)
            r3 = 1119476135(0x42b9d9a7, float:92.9251)
            r4 = -1065070541(0xffffffffc0845033, float:-4.13479)
            r5 = 1121806320(0x42dd67f0, float:110.703)
            r6 = 1081753909(0x407a4135, float:3.91023)
            r7 = 1123621929(0x42f91c29, float:124.555)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1094552388(0x413d8b44, float:11.8465)
            r3 = 1124755440(0x430a67f0, float:138.406)
            r4 = 1106020821(0x41ec89d5, float:29.5673)
            r5 = 1125069947(0x430f347b, float:143.205)
            r6 = 1110277960(0x422d7f48, float:43.3743)
            r7 = 1124541006(0x4307224e, float:135.134)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1110619954(0x4232b732, float:44.6789)
            r3 = 1124491002(0x43065efa, float:134.371)
            r4 = 1110933452(0x42377fcc, float:45.8748)
            r5 = 1124440932(0x43059b64, float:133.607)
            r6 = 1111218428(0x423bd8fc, float:46.9619)
            r7 = 1124376642(0x4304a042, float:132.626)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1111161438(0x423afa5e, float:46.7445)
            r3 = 1124469506(0x43060b02, float:134.043)
            r4 = 1111132943(0x423a8b0f, float:46.6358)
            r5 = 1124569580(0x430791ec, float:135.57)
            r7 = 1124662510(0x4308fcee, float:136.988)
            r6 = r4
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r10 = 1111132943(0x423a8b0f, float:46.6358)
            r11 = 1125713248(0x43190560, float:153.021)
            r12 = 1114524353(0x426e4ac1, float:59.573)
            r13 = 1126563840(0x43260000, float:166.0)
            r15 = r13
            r9.cubicTo(r10, r11, r12, r13, r14, r15)
            r2 = 1119294023(0x42b71247, float:91.5357)
            r3 = 1126563840(0x43260000, float:166.0)
            r4 = 1120975454(0x42d0ba5e, float:104.364)
            r5 = 1125713248(0x43190560, float:153.021)
            r6 = r4
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1120975454(0x42d0ba5e, float:104.364)
            r3 = 1124562436(0x43077604, float:135.461)
            r4 = 1120961167(0x42d0828f, float:104.255)
            r5 = 1124469506(0x43060b02, float:134.043)
            r6 = 1120932725(0x42d01375, float:104.038)
            r7 = 1124376642(0x4304a042, float:132.626)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1121075200(0x42d24000, float:105.125)
            r3 = 1124433789(0x43057f7d, float:133.498)
            r4 = 1121246249(0x42d4dc29, float:106.43)
            r5 = 1124491002(0x43065efa, float:134.371)
            r6 = 1121403011(0x42d74083, float:107.626)
            r7 = 1124541006(0x4307224e, float:135.134)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1123212722(0x42f2ddb2, float:121.433)
            r3 = 1125062803(0x430f1893, float:143.096)
            r4 = 1124804395(0x430b272b, float:139.153)
            r5 = 1124755440(0x430a67f0, float:138.406)
            r6 = 1125324554(0x4313170a, float:147.09)
            r7 = 1123621929(0x42f91c29, float:124.555)
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = 1125851791(0x431b228f, float:155.135)
            r3 = 1121792033(0x42dd3021, float:110.594)
            r4 = 1125538267(0x431659db, float:150.351)
            r5 = 1119476135(0x42b9d9a7, float:92.9251)
            r6 = r8
            r7 = r0
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r1.close()
            r0 = r16
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KLA.<init>():void");
    }
}
