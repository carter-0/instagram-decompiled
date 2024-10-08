package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.PcU  reason: case insensitive filesystem */
public final class C73429PcU implements Comparator {
    public final int A00;

    public C73429PcU(int i) {
        this.A00 = i;
    }

    public static List A00(Iterable iterable, int i) {
        return 00k.A0g(iterable, new C73429PcU(i));
    }

    public static void A01(int i, List list) {
        01V.A1D(list, new C73429PcU(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0139, code lost:
        if (r7.A05 == null) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x014f, code lost:
        if (r1.A05 == null) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x015c, code lost:
        if (r6.A0G == false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0160, code lost:
        if (r6.A05 == null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        r0 = java.lang.Long.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0162, code lost:
        r0 = java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0168, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ab, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        return X.29b.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0232, code lost:
        return X.29b.A00(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x01b1;
                case 1: goto L_0x0026;
                case 2: goto L_0x003b;
                case 3: goto L_0x01c2;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x003b;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x003b;
                case 12: goto L_0x004c;
                case 13: goto L_0x020b;
                case 14: goto L_0x020b;
                case 15: goto L_0x0055;
                case 16: goto L_0x0214;
                case 17: goto L_0x021d;
                case 18: goto L_0x0066;
                case 19: goto L_0x0077;
                case 20: goto L_0x0084;
                case 21: goto L_0x0092;
                case 22: goto L_0x00a0;
                case 23: goto L_0x0226;
                case 24: goto L_0x00ae;
                case 25: goto L_0x00bc;
                case 26: goto L_0x00ca;
                case 27: goto L_0x00d8;
                case 28: goto L_0x00ea;
                case 29: goto L_0x00f8;
                case 30: goto L_0x0106;
                case 31: goto L_0x0106;
                case 32: goto L_0x0114;
                case 33: goto L_0x0122;
                case 34: goto L_0x012f;
                case 35: goto L_0x0143;
                case 36: goto L_0x012f;
                case 37: goto L_0x0233;
                case 38: goto L_0x016a;
                case 39: goto L_0x0177;
                case 40: goto L_0x019f;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.0eP r6 = (X.0eP) r6
            java.lang.Object r0 = r6.A00
            X.3su r0 = (X.C254703su) r0
            long r0 = r0.C7c()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.0eP r7 = (X.0eP) r7
            java.lang.Object r0 = r7.A00
            X.3su r0 = (X.C254703su) r0
            long r0 = r0.C7c()
        L_0x001d:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0021:
            int r0 = X.29b.A00(r3, r0)
            return r0
        L_0x0026:
            X.Puv r7 = (X.C74440Puv) r7
            double r0 = r7.getScore()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            X.Puv r6 = (X.C74440Puv) r6
            double r0 = r6.getScore()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x0021
        L_0x003b:
            X.3su r6 = (X.C254703su) r6
            long r0 = r6.C7c()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.3su r7 = (X.C254703su) r7
            long r0 = r7.C7c()
            goto L_0x001d
        L_0x004c:
            java.lang.String r3 = X.C66580MXl.A0y(r7)
            java.lang.String r0 = X.C66580MXl.A0y(r6)
            goto L_0x0021
        L_0x0055:
            X.Oa5 r7 = (X.C71039Oa5) r7
            long r0 = r7.A01()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.Oa5 r6 = (X.C71039Oa5) r6
            long r0 = r6.A01()
            goto L_0x001d
        L_0x0066:
            X.NVe r7 = (X.C68744NVe) r7
            boolean r0 = r7.A08
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            X.NVe r6 = (X.C68744NVe) r6
            boolean r0 = r6.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0021
        L_0x0077:
            X.N2K r7 = (X.N2K) r7
            long r0 = r7.A03
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.N2K r6 = (X.N2K) r6
            long r0 = r6.A03
            goto L_0x001d
        L_0x0084:
            X.OF9 r6 = (X.OF9) r6
            int r0 = r6.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.OF9 r7 = (X.OF9) r7
            int r0 = r7.A01
            goto L_0x01ab
        L_0x0092:
            X.Mb9 r7 = (X.C66702Mb9) r7
            long r0 = r7.A05
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.Mb9 r6 = (X.C66702Mb9) r6
            long r0 = r6.A05
            goto L_0x001d
        L_0x00a0:
            X.Mb9 r7 = (X.C66702Mb9) r7
            long r0 = r7.A06
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.Mb9 r6 = (X.C66702Mb9) r6
            long r0 = r6.A06
            goto L_0x001d
        L_0x00ae:
            X.9Iv r6 = (X.C376659Iv) r6
            long r0 = r6.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.9Iv r7 = (X.C376659Iv) r7
            long r0 = r7.A00
            goto L_0x001d
        L_0x00bc:
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r7 = (com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction) r7
            int r0 = r7.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r6 = (com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction) r6
            int r0 = r6.A00
            goto L_0x01ab
        L_0x00ca:
            X.2PM r6 = (X.2PM) r6
            int r0 = r6.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.2PM r7 = (X.2PM) r7
            int r0 = r7.A00
            goto L_0x01ab
        L_0x00d8:
            X.N3U r6 = (X.N3U) r6
            X.MoN r0 = r6.A01
            int r0 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.N3U r7 = (X.N3U) r7
            X.MoN r0 = r7.A01
            int r0 = r0.A00
            goto L_0x01ab
        L_0x00ea:
            X.N3U r7 = (X.N3U) r7
            long r0 = r7.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.N3U r6 = (X.N3U) r6
            long r0 = r6.A00
            goto L_0x001d
        L_0x00f8:
            X.Nkv r6 = (X.C69415Nkv) r6
            int r0 = r6.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.Nkv r7 = (X.C69415Nkv) r7
            int r0 = r7.A00
            goto L_0x01ab
        L_0x0106:
            X.N4t r7 = (X.N4t) r7
            long r0 = r7.A02
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.N4t r6 = (X.N4t) r6
            long r0 = r6.A02
            goto L_0x001d
        L_0x0114:
            X.MqQ r6 = (X.C67592MqQ) r6
            int r0 = r6.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.MqQ r7 = (X.C67592MqQ) r7
            int r0 = r7.A01
            goto L_0x01ab
        L_0x0122:
            X.N4t r6 = (X.N4t) r6
            int r0 = r6.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.N4t r7 = (X.N4t) r7
            int r0 = r7.A01
            goto L_0x01ab
        L_0x012f:
            X.N4t r7 = (X.N4t) r7
            boolean r0 = r7.A0G
            r2 = 1
            if (r0 == 0) goto L_0x013b
            X.4AB r1 = r7.A05
            r0 = 1
            if (r1 != 0) goto L_0x013c
        L_0x013b:
            r0 = 0
        L_0x013c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            X.N4t r6 = (X.N4t) r6
            goto L_0x015a
        L_0x0143:
            X.PHD r7 = (X.PHD) r7
            X.N4t r1 = r7.A01
            boolean r0 = r1.A0G
            r2 = 1
            if (r0 == 0) goto L_0x0151
            X.4AB r1 = r1.A05
            r0 = 1
            if (r1 != 0) goto L_0x0152
        L_0x0151:
            r0 = 0
        L_0x0152:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            X.PHD r6 = (X.PHD) r6
            X.N4t r6 = r6.A01
        L_0x015a:
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x0168
            X.4AB r0 = r6.A05
            if (r0 == 0) goto L_0x0168
        L_0x0162:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L_0x0021
        L_0x0168:
            r2 = 0
            goto L_0x0162
        L_0x016a:
            X.Dro r6 = (X.C47173Dro) r6
            int r0 = r6.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.Dro r7 = (X.C47173Dro) r7
            int r0 = r7.A01
            goto L_0x01ab
        L_0x0177:
            X.N9C r7 = (X.N9C) r7
            if (r7 == 0) goto L_0x019c
            java.lang.Integer r0 = r7.A02
            if (r0 == 0) goto L_0x019c
        L_0x017f:
            int r0 = X.O2L.A00(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.N9C r6 = (X.N9C) r6
            if (r6 == 0) goto L_0x0199
            java.lang.Integer r0 = r6.A02
            if (r0 == 0) goto L_0x0199
        L_0x018f:
            int r0 = X.O2L.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0021
        L_0x0199:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x018f
        L_0x019c:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x017f
        L_0x019f:
            X.Mn4 r6 = (X.C67387Mn4) r6
            int r0 = r6.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.Mn4 r7 = (X.C67387Mn4) r7
            int r0 = r7.A00
        L_0x01ab:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0021
        L_0x01b1:
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r1 = r7.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x022e
        L_0x01c2:
            boolean r0 = r6 instanceof java.lang.String
            r4 = 0
            if (r0 == 0) goto L_0x0209
            java.lang.String r6 = (java.lang.String) r6
        L_0x01c9:
            java.lang.String r3 = ":"
            if (r6 == 0) goto L_0x0207
            int r2 = r6.length()
            int r0 = r2 + -1
            int r1 = X.00l.A07(r6, r3, r0)
            r0 = -1
            if (r1 == r0) goto L_0x01e3
            int r0 = r3.length()
            int r1 = r1 + r0
            java.lang.String r6 = X.C51967G9n.A0q(r6, r1, r2)
        L_0x01e3:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L_0x0202
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0202
            int r2 = r7.length()
            int r0 = r2 + -1
            int r1 = X.00l.A07(r7, r3, r0)
            r0 = -1
            if (r1 == r0) goto L_0x0201
            int r0 = r3.length()
            int r1 = r1 + r0
            java.lang.String r7 = X.C51967G9n.A0q(r7, r1, r2)
        L_0x0201:
            r4 = r7
        L_0x0202:
            int r0 = X.29b.A00(r6, r4)
            return r0
        L_0x0207:
            r6 = r4
            goto L_0x01e3
        L_0x0209:
            r6 = r4
            goto L_0x01c9
        L_0x020b:
            com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice r7 = (com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice) r7
            java.lang.String r1 = r7.A02
            com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice r6 = (com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice) r6
            java.lang.String r0 = r6.A02
            goto L_0x022e
        L_0x0214:
            X.N3E r6 = (X.N3E) r6
            java.lang.Long r1 = r6.A03
            X.N3E r7 = (X.N3E) r7
            java.lang.Long r0 = r7.A03
            goto L_0x022e
        L_0x021d:
            X.3su r6 = (X.C254703su) r6
            java.lang.Long r1 = r6.A1Q
            X.3su r7 = (X.C254703su) r7
            java.lang.Long r0 = r7.A1Q
            goto L_0x022e
        L_0x0226:
            X.7LQ r6 = (X.AnonymousClass7LQ) r6
            X.7Bp r1 = r6.A0F
            X.7LQ r7 = (X.AnonymousClass7LQ) r7
            X.7Bp r0 = r7.A0F
        L_0x022e:
            int r0 = X.29b.A00(r1, r0)
            return r0
        L_0x0233:
            com.instagram.pendingmedia.model.recipients.PendingRecipient r6 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r6
            com.instagram.pendingmedia.model.recipients.PendingRecipient r7 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r7
            java.lang.String r1 = r6.getId()
            java.lang.String r0 = r7.getId()
            int r0 = r1.compareTo(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73429PcU.compare(java.lang.Object, java.lang.Object):int");
    }
}
