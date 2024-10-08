package X;

/* renamed from: X.Plo  reason: case insensitive filesystem */
public final class C73913Plo extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73913Plo(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C73913Plo A00(Object obj, int i) {
        return new C73913Plo(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        return r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0194, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0224;
                case 1: goto L_0x0212;
                case 2: goto L_0x0208;
                case 3: goto L_0x01fe;
                case 4: goto L_0x01f4;
                case 5: goto L_0x01ea;
                case 6: goto L_0x01e0;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c8;
                case 9: goto L_0x01b3;
                case 10: goto L_0x019f;
                case 11: goto L_0x0195;
                case 12: goto L_0x018b;
                case 13: goto L_0x0181;
                case 14: goto L_0x0170;
                case 15: goto L_0x0166;
                case 16: goto L_0x0158;
                case 17: goto L_0x014e;
                case 18: goto L_0x0230;
                case 19: goto L_0x0147;
                case 20: goto L_0x0140;
                case 21: goto L_0x012c;
                case 22: goto L_0x0230;
                case 23: goto L_0x0147;
                case 24: goto L_0x0140;
                case 25: goto L_0x00db;
                case 26: goto L_0x00d2;
                case 27: goto L_0x00c9;
                case 28: goto L_0x0230;
                case 29: goto L_0x0147;
                case 30: goto L_0x0140;
                case 31: goto L_0x00b9;
                case 32: goto L_0x00af;
                case 33: goto L_0x00a1;
                case 34: goto L_0x0097;
                case 35: goto L_0x008d;
                case 36: goto L_0x0082;
                case 37: goto L_0x0078;
                case 38: goto L_0x0062;
                case 39: goto L_0x0057;
                case 40: goto L_0x0050;
                case 41: goto L_0x0046;
                case 42: goto L_0x0031;
                case 43: goto L_0x0025;
                case 44: goto L_0x0005;
                case 45: goto L_0x001c;
                case 46: goto L_0x000e;
                case 47: goto L_0x0005;
                case 48: goto L_0x001c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.pendingmedia.store.PendingMediaStore r5 = X.28K.A00(r0)
            return r5
        L_0x000e:
            java.lang.Object r1 = r11.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Ma7 r0 = X.C70175NyT.A00(r1)
            X.OC9 r5 = new X.OC9
            r5.<init>(r1, r0)
            return r5
        L_0x001c:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.pendingmedia.store.PendingMediaStoreSerializer r5 = X.28E.A00(r0)
            return r5
        L_0x0025:
            java.lang.Object r0 = r11.A01
            X.1et r0 = (X.1et) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.OMW r5 = new X.OMW
            r5.<init>(r0)
            return r5
        L_0x0031:
            java.lang.Object r2 = r11.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.OLR r1 = new X.OLR
            r1.<init>(r2)
            java.lang.String r0 = "MsysSendShareManager"
            X.6EZ r0 = X.AnonymousClass6EY.A00(r2, r0)
            X.PEN r5 = new X.PEN
            r5.<init>(r2, r0, r1)
            return r5
        L_0x0046:
            java.lang.Object r0 = r11.A01
            X.1ua r0 = (X.1ua) r0
            X.7He r5 = new X.7He
            r5.<init>(r0)
            return r5
        L_0x0050:
            java.lang.Object r0 = r11.A01
            X.Mew r0 = (X.C66912Mew) r0
            X.0eK r0 = r0.A01
            goto L_0x005d
        L_0x0057:
            java.lang.Object r0 = r11.A01
            X.Mew r0 = (X.C66912Mew) r0
            X.0eK r0 = r0.A00
        L_0x005d:
            java.lang.Object r5 = r0.get()
            return r5
        L_0x0062:
            java.lang.Object r3 = r11.A01
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            r0 = 6
            X.Pd1 r2 = new X.Pd1
            r2.<init>(r3, r0)
            r1 = 7
            X.Pd1 r0 = new X.Pd1
            r0.<init>(r3, r1)
            X.Mew r5 = new X.Mew
            r5.<init>(r3, r2, r0)
            return r5
        L_0x0078:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OKR r5 = new X.OKR
            r5.<init>(r0)
            return r5
        L_0x0082:
            java.lang.Object r0 = r11.A01
            X.Mot r0 = (X.C67499Mot) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.7UH r5 = X.AnonymousClass7UG.A00(r0)
            return r5
        L_0x008d:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Mot r5 = new X.Mot
            r5.<init>(r0)
            return r5
        L_0x0097:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OyA r5 = new X.OyA
            r5.<init>(r0)
            return r5
        L_0x00a1:
            java.lang.Object r1 = r11.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Mot r0 = X.C67497Mor.A00(r1)
            X.PEM r5 = new X.PEM
            r5.<init>(r1, r0)
            return r5
        L_0x00af:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.O8I r5 = new X.O8I
            r5.<init>(r0)
            return r5
        L_0x00b9:
            java.lang.Object r0 = r11.A01
            X.NIq r0 = (X.C68452NIq) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMl r5 = new X.NMl
            r5.<init>(r0)
            return r5
        L_0x00c9:
            java.lang.Object r0 = r11.A01
            X.Pvd r0 = (X.C74483Pvd) r0
            r0.DGd()
            goto L_0x0192
        L_0x00d2:
            java.lang.Object r0 = r11.A01
            X.Pvd r0 = (X.C74483Pvd) r0
            r0.Dro()
            goto L_0x0192
        L_0x00db:
            java.lang.Object r5 = r11.A01
            X.NIs r5 = (X.C68454NIs) r5
            android.os.Bundle r6 = r5.mArguments
            if (r6 == 0) goto L_0x0125
            java.lang.String r1 = "messaging_user_fbid"
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x0107
            long r1 = r6.getLong(r1)
            r4 = 0
            r3 = 9
            r0 = 3
            java.lang.String r0 = X.AnonymousClass9NF.A02(r4, r3, r0)
            java.lang.String r3 = X.JTP.A0m(r6, r0)
            X.0eM r0 = r5.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KDS r5 = new X.KDS
            r5.<init>(r0, r3, r1)
            return r5
        L_0x0107:
            java.lang.String r0 = "device"
            java.lang.String r7 = X.JTP.A0m(r6, r0)
            java.lang.String r0 = "create_time_stamp"
            long r9 = r6.getLong(r0)
            java.lang.String r0 = "location"
            java.lang.String r8 = X.JTP.A0m(r6, r0)
            X.0eM r0 = r5.A00
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.KDv r5 = new X.KDv
            r5.<init>(r6, r7, r8, r9)
            return r5
        L_0x0125:
            java.lang.String r0 = "Arguments must not be null in KeyAlertDetailFragment"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x012c:
            java.lang.Object r0 = r11.A01
            X.NIT r0 = (X.NIT) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMv r5 = new X.NMv
            r5.<init>(r1, r0)
            return r5
        L_0x0140:
            java.lang.Object r0 = r11.A01
            X.07f r5 = X.DbY.A0I(r0)
            return r5
        L_0x0147:
            java.lang.Object r0 = r11.A01
            java.lang.Object r5 = X.DbT.A0r(r0)
            return r5
        L_0x014e:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.O8G r5 = new X.O8G
            r5.<init>(r0)
            return r5
        L_0x0158:
            java.lang.Object r1 = r11.A01
            X.Mk6 r1 = (X.C67210Mk6) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.EK7 r5 = new X.EK7
            r5.<init>(r1)
            return r5
        L_0x0166:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Oy6 r5 = new X.Oy6
            r5.<init>(r0)
            return r5
        L_0x0170:
            X.Orj r5 = new X.Orj
            r5.<init>()
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.28d r0 = X.28c.A00(r0)
            r0.A00(r5)
            return r5
        L_0x0181:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OC6 r5 = new X.OC6
            r5.<init>(r0)
            return r5
        L_0x018b:
            java.lang.Object r0 = r11.A01
            X.7Pu r0 = (X.C331157Pu) r0
            r0.A07()
        L_0x0192:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0195:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.O8F r5 = new X.O8F
            r5.<init>(r0)
            return r5
        L_0x019f:
            java.lang.Object r0 = r11.A01
            X.OHS r0 = (X.OHS) r0
            com.instagram.common.session.UserSession r3 = r0.A01
            java.lang.Class<X.Oyf> r2 = X.C72214Oyf.class
            r1 = 10
            X.Pd9 r0 = new X.Pd9
            r0.<init>(r3, r1)
            java.lang.Object r5 = r3.A01(r2, r0)
            return r5
        L_0x01b3:
            java.lang.Object r2 = r11.A01
            X.OHS r2 = (X.OHS) r2
            com.instagram.common.session.UserSession r0 = r2.A01
            X.5fe r1 = X.C290635fd.A00(r0)
            X.O8E r0 = new X.O8E
            r0.<init>(r2)
            X.OBA r5 = new X.OBA
            r5.<init>(r1, r0)
            return r5
        L_0x01c8:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.6EX r5 = new X.6EX
            r5.<init>(r0)
            return r5
        L_0x01d2:
            java.lang.Object r1 = r11.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.2Dm r0 = X.1bJ.A00(r1)
            X.MYv r5 = new X.MYv
            r5.<init>(r1, r0)
            return r5
        L_0x01e0:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.44e r5 = new X.44e
            r5.<init>(r0)
            return r5
        L_0x01ea:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OBz r5 = new X.OBz
            r5.<init>(r0)
            return r5
        L_0x01f4:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OMV r5 = new X.OMV
            r5.<init>(r0)
            return r5
        L_0x01fe:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OyQ r5 = new X.OyQ
            r5.<init>(r0)
            return r5
        L_0x0208:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OE2 r5 = new X.OE2
            r5.<init>(r0)
            return r5
        L_0x0212:
            java.lang.Object r0 = r11.A01
            X.MZ0 r0 = (X.MZ0) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 4
            X.Plo r1 = A00(r2, r0)
            java.lang.Class<X.OMV> r0 = X.OMV.class
            java.lang.Object r5 = r2.A01(r0, r1)
            return r5
        L_0x0224:
            java.lang.Object r0 = r11.A01
            X.MZ0 r0 = (X.MZ0) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.OZY r5 = new X.OZY
            r5.<init>(r0)
            return r5
        L_0x0230:
            java.lang.Object r5 = r11.A01
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73913Plo.invoke():java.lang.Object");
    }
}
