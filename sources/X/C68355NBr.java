package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;

/* renamed from: X.NBr  reason: case insensitive filesystem */
public final class C68355NBr extends AnonymousClass45Y {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MqttNetworkSessionPlugin A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68355NBr(MqttNetworkSessionPlugin mqttNetworkSessionPlugin, String str, int i) {
        super("onMqttPubError");
        this.A01 = mqttNetworkSessionPlugin;
        this.A02 = str;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r0 = X.C69737NrM.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r3 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        r3 = X.AnonymousClass05K.A1F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        r3 = X.AnonymousClass05K.A1I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        r3 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        r3 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        r3 = X.AnonymousClass05K.A0Y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            java.lang.String r6 = r7.A02
            int r5 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x001e }
            r0 = 16
            java.lang.Integer[] r3 = X.AnonymousClass05K.A00(r0)     // Catch:{ NumberFormatException -> 0x001e }
            int r2 = r3.length     // Catch:{ NumberFormatException -> 0x001e }
            r1 = 0
        L_0x000e:
            if (r1 >= r2) goto L_0x001b
            r4 = r3[r1]     // Catch:{ NumberFormatException -> 0x001e }
            int r0 = X.C69737NrM.A00(r4)     // Catch:{ NumberFormatException -> 0x001e }
            if (r0 == r5) goto L_0x0020
            int r1 = r1 + 1
            goto L_0x000e
        L_0x001b:
            java.lang.Integer r4 = X.AnonymousClass05K.A03     // Catch:{ NumberFormatException -> 0x001e }
            goto L_0x0020
        L_0x001e:
            java.lang.Integer r4 = X.AnonymousClass05K.A03
        L_0x0020:
            java.lang.Integer r3 = X.AnonymousClass05K.A03
            com.facebook.msys.mcd.MqttNetworkSessionPlugin r2 = r7.A01
            int r1 = r7.A00
            if (r4 == r3) goto L_0x0030
            int r0 = X.C69737NrM.A00(r4)
        L_0x002c:
            r2.onMqttPubError(r1, r6, r0)
            return
        L_0x0030:
            java.lang.Integer r0 = X.S9M.A00(r6)
            if (r0 != 0) goto L_0x0038
            r0 = 0
            goto L_0x002c
        L_0x0038:
            int r0 = r0.intValue()
            switch(r0) {
                case 8: goto L_0x0056;
                case 9: goto L_0x0059;
                case 10: goto L_0x005c;
                case 11: goto L_0x0059;
                case 12: goto L_0x005f;
                default: goto L_0x003f;
            }
        L_0x003f:
            switch(r0) {
                case 13: goto L_0x0056;
                case 14: goto L_0x0056;
                case 15: goto L_0x0056;
                case 16: goto L_0x0056;
                case 17: goto L_0x0050;
                case 18: goto L_0x0050;
                case 19: goto L_0x0050;
                case 20: goto L_0x0056;
                case 21: goto L_0x0056;
                case 22: goto L_0x0056;
                case 23: goto L_0x0056;
                case 24: goto L_0x0056;
                case 25: goto L_0x0056;
                case 26: goto L_0x0056;
                case 27: goto L_0x0059;
                case 28: goto L_0x0053;
                case 29: goto L_0x0053;
                case 30: goto L_0x0056;
                case 31: goto L_0x0056;
                case 32: goto L_0x0053;
                default: goto L_0x0042;
            }
        L_0x0042:
            switch(r0) {
                case 33: goto L_0x0059;
                case 34: goto L_0x0059;
                case 35: goto L_0x0056;
                case 36: goto L_0x0056;
                case 37: goto L_0x0059;
                case 38: goto L_0x004d;
                case 39: goto L_0x0050;
                case 40: goto L_0x0059;
                case 41: goto L_0x0050;
                case 42: goto L_0x0059;
                case 43: goto L_0x0059;
                case 44: goto L_0x0053;
                case 45: goto L_0x0059;
                case 46: goto L_0x0059;
                case 47: goto L_0x0048;
                case 48: goto L_0x0050;
                case 49: goto L_0x0059;
                case 50: goto L_0x0059;
                case 51: goto L_0x0053;
                case 52: goto L_0x0059;
                case 53: goto L_0x0048;
                case 54: goto L_0x0048;
                case 55: goto L_0x0059;
                case 56: goto L_0x005f;
                case 57: goto L_0x0059;
                case 58: goto L_0x005c;
                case 59: goto L_0x0059;
                case 60: goto L_0x0053;
                case 61: goto L_0x0059;
                default: goto L_0x0045;
            }
        L_0x0045:
            switch(r0) {
                case 5: goto L_0x0053;
                case 6: goto L_0x005c;
                case 7: goto L_0x0056;
                default: goto L_0x0048;
            }
        L_0x0048:
            int r0 = X.C69737NrM.A00(r3)
            goto L_0x002c
        L_0x004d:
            java.lang.Integer r3 = X.AnonymousClass05K.A02
            goto L_0x0048
        L_0x0050:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x0048
        L_0x0053:
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
            goto L_0x0048
        L_0x0056:
            java.lang.Integer r3 = X.AnonymousClass05K.A1I
            goto L_0x0048
        L_0x0059:
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x0048
        L_0x005c:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x0048
        L_0x005f:
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68355NBr.run():void");
    }
}
