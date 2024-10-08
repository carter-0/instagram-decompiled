package com.instagram.settings2.core.data;

import X.AnonymousClass7TE;
import X.C51973G9u;
import X.C61024JvO;
import X.C66460MSo;
import X.C66570MXa;
import X.I4T;
import X.JTS;
import X.MR1;
import X.MVF;
import X.MXZ;
import X.XMD;
import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.RemoteStringSettingId;
import com.instagram.common.session.UserSession;

public final class SettingsNetworkInteractor {
    public final UserSession A00;

    public static final String A00(C66460MSo mSo, I4T i4t) {
        MVF mvf;
        if (mSo instanceof C66570MXa) {
            mvf = JTS.A0X(i4t, mSo);
            if (mvf == null) {
                throw C51973G9u.A0g(mSo, "No setting model found for ID ", AnonymousClass7TE.A1A());
            }
        } else if (mSo instanceof MXZ) {
            mvf = JTS.A0X(i4t, mSo);
            if (mvf == null) {
                throw C51973G9u.A0g(mSo, "No setting model found for ID ", AnonymousClass7TE.A1A());
            }
        } else {
            throw AnonymousClass7TE.A1K();
        }
        MR1 mr1 = (MR1) mvf.Bzr().A01;
        if (XMD.A03(1, mr1)) {
            C61024JvO jvO = (C61024JvO) ((XMD) mr1).A01;
            if (C61024JvO.A00(0, jvO)) {
                return ((RemoteBooleanSettingId) jvO.A01).A00;
            }
            if (C61024JvO.A00(1, jvO)) {
                return ((RemoteStringSettingId) jvO.A01).A00;
            }
            throw AnonymousClass7TE.A1K();
        }
        throw AnonymousClass7TE.A0w("Non remove storage types are not supported for parental controls");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.api.schemas.RemoteBooleanSettingId r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 18
            boolean r0 = X.MEB.A03(r3, r8)
            if (r0 == 0) goto L_0x007e
            r5 = r8
            X.MEB r5 = (X.MEB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007e
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 != r3) goto L_0x0083
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x004c
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            X.XPK r1 = (X.XPK) r1
            X.Jtz r0 = r1.FH3()
            boolean r0 = r0.A02
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            X.Jtz r0 = r1.FH3()
            java.lang.String r2 = r0.A00
            r1 = 14
            X.JwE r0 = new X.JwE
            r0.<init>((java.lang.String) r2, (java.lang.Object) r3, (int) r1)
            X.3Ih r1 = X.C41845B3m.A0d(r0)
        L_0x004b:
            return r1
        L_0x004c:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004b
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0055:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "settings/get_bool/"
            r2.A0A(r0)
            java.lang.Class<X.XPK> r1 = X.XPK.class
            java.lang.Class<X.Xdh> r0 = X.C21515Xdh.class
            r2.A0Q(r1, r0)
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "setting_id"
            X.1OC r1 = X.DbT.A0T(r2, r0, r1)
            r5.A00 = r3
            r0 = 1651663603(0x627262f3, float:1.1178105E21)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x007e:
            X.MEB r5 = X.MEB.A00(r6, r8, r3)
            goto L_0x0016
        L_0x0083:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsNetworkInteractor.A01(com.instagram.api.schemas.RemoteBooleanSettingId, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067 A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0 A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.api.schemas.RemoteBooleanSettingId r9, X.AnonymousClass4D7 r10, boolean r11) {
        /*
            r8 = this;
            r3 = 20
            boolean r0 = X.MEB.A03(r3, r10)
            if (r0 == 0) goto L_0x005e
            r4 = r10
            X.MEB r4 = (X.MEB) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 != r6) goto L_0x00b4
            X.0eS.A00(r1)
        L_0x0025:
            X.3Ii r1 = (X.C239803Ii) r1
            goto L_0x0063
        L_0x0028:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1NY r7 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "settings/set_bool/"
            r7.A0A(r0)
            java.lang.Class<X.XPK> r2 = X.XPK.class
            java.lang.Class<X.Xdh> r1 = X.C21515Xdh.class
            r0 = 0
            r7.A0O(r3, r2, r1, r0)
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "setting_id"
            r7.A9m(r0, r1)
            java.lang.String r0 = "value"
            r7.A0H(r0, r11)
            java.lang.String r1 = "allow_error_codes"
            java.lang.String r0 = "true"
            X.1OC r1 = X.DbT.A0T(r7, r1, r0)
            r4.A00 = r6
            r0 = 351963398(0x14fa8906, float:2.5297595E-26)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto L_0x0025
            return r5
        L_0x005e:
            X.MEB r4 = X.MEB.A00(r8, r10, r3)
            goto L_0x0016
        L_0x0063:
            boolean r0 = r1 instanceof X.C239793Ih     // Catch:{ Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x00a0
            X.3Ih r1 = (X.C239793Ih) r1     // Catch:{ Exception -> 0x00a9 }
            java.lang.Object r2 = r1.A00     // Catch:{ Exception -> 0x00a9 }
            X.XPK r2 = (X.XPK) r2     // Catch:{ Exception -> 0x00a9 }
            X.Jtz r0 = r2.FH3()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r1 = r0.A00     // Catch:{ Exception -> 0x00a9 }
            X.Jtz r0 = r2.FH3()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r0 = r0.A01     // Catch:{ Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x007c
            r3 = r0
        L_0x007c:
            if (r1 != 0) goto L_0x009a
            X.Jtz r0 = r2.FH3()     // Catch:{ Exception -> 0x00a9 }
            boolean r0 = r0.A02     // Catch:{ Exception -> 0x00a9 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x00a9 }
            X.Jtz r0 = r2.FH3()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = r0.A00     // Catch:{ Exception -> 0x00a9 }
            r1 = 14
            X.JwE r0 = new X.JwE     // Catch:{ Exception -> 0x00a9 }
            r0.<init>((java.lang.String) r2, (java.lang.Object) r3, (int) r1)     // Catch:{ Exception -> 0x00a9 }
            X.3Ih r1 = X.C41845B3m.A0d(r0)     // Catch:{ Exception -> 0x00a9 }
            return r1
        L_0x009a:
            X.Kki r0 = new X.Kki     // Catch:{ Exception -> 0x00a9 }
            r0.<init>(r1, r3)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00a8
        L_0x00a0:
            boolean r0 = r1 instanceof X.C297815sO     // Catch:{ Exception -> 0x00a9 }
            if (r0 != 0) goto L_0x00b3
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ Exception -> 0x00a9 }
        L_0x00a8:
            throw r0     // Catch:{ Exception -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            X.4dn r0 = new X.4dn
            r0.<init>(r1)
            X.5sO r1 = X.C41845B3m.A0c(r0)
        L_0x00b3:
            return r1
        L_0x00b4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsNetworkInteractor.A02(com.instagram.api.schemas.RemoteBooleanSettingId, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067 A[Catch:{ Exception -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c A[Catch:{ Exception -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(com.instagram.api.schemas.RemoteStringSettingId r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r8 = this;
            r3 = 21
            boolean r0 = X.MEB.A03(r3, r11)
            if (r0 == 0) goto L_0x005e
            r4 = r11
            X.MEB r4 = (X.MEB) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 != r6) goto L_0x00b0
            X.0eS.A00(r1)
        L_0x0025:
            X.3Ii r1 = (X.C239803Ii) r1
            goto L_0x0063
        L_0x0028:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1NY r7 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "settings/set_string/"
            r7.A0A(r0)
            java.lang.Class<X.XPL> r2 = X.XPL.class
            java.lang.Class<X.Xdk> r1 = X.C21518Xdk.class
            r0 = 0
            r7.A0O(r3, r2, r1, r0)
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "setting_id"
            r7.A9m(r0, r1)
            java.lang.String r0 = "value"
            r7.A9m(r0, r10)
            java.lang.String r1 = "allow_error_codes"
            java.lang.String r0 = "true"
            X.1OC r1 = X.DbT.A0T(r7, r1, r0)
            r4.A00 = r6
            r0 = 1979761659(0x7600c3fb, float:6.529189E32)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto L_0x0025
            return r5
        L_0x005e:
            X.MEB r4 = X.MEB.A00(r8, r11, r3)
            goto L_0x0016
        L_0x0063:
            boolean r0 = r1 instanceof X.C239793Ih     // Catch:{ Exception -> 0x00a5 }
            if (r0 == 0) goto L_0x009c
            X.3Ih r1 = (X.C239793Ih) r1     // Catch:{ Exception -> 0x00a5 }
            java.lang.Object r2 = r1.A00     // Catch:{ Exception -> 0x00a5 }
            X.XPL r2 = (X.XPL) r2     // Catch:{ Exception -> 0x00a5 }
            X.Ju1 r0 = r2.FH3()     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = r0.A00     // Catch:{ Exception -> 0x00a5 }
            X.Ju1 r0 = r2.FH3()     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r0 = r0.A01     // Catch:{ Exception -> 0x00a5 }
            if (r0 == 0) goto L_0x007c
            r3 = r0
        L_0x007c:
            if (r1 != 0) goto L_0x0096
            X.Ju1 r0 = r2.FH3()     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r3 = r0.A02     // Catch:{ Exception -> 0x00a5 }
            X.Ju1 r0 = r2.FH3()     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r2 = r0.A00     // Catch:{ Exception -> 0x00a5 }
            r1 = 14
            X.JwE r0 = new X.JwE     // Catch:{ Exception -> 0x00a5 }
            r0.<init>((java.lang.String) r2, (java.lang.Object) r3, (int) r1)     // Catch:{ Exception -> 0x00a5 }
            X.3Ih r1 = X.C41845B3m.A0d(r0)     // Catch:{ Exception -> 0x00a5 }
            return r1
        L_0x0096:
            X.Kki r0 = new X.Kki     // Catch:{ Exception -> 0x00a5 }
            r0.<init>(r1, r3)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00a4
        L_0x009c:
            boolean r0 = r1 instanceof X.C297815sO     // Catch:{ Exception -> 0x00a5 }
            if (r0 != 0) goto L_0x00af
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ Exception -> 0x00a5 }
        L_0x00a4:
            throw r0     // Catch:{ Exception -> 0x00a5 }
        L_0x00a5:
            r1 = move-exception
            X.4dn r0 = new X.4dn
            r0.<init>(r1)
            X.5sO r1 = X.C41845B3m.A0c(r0)
        L_0x00af:
            return r1
        L_0x00b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsNetworkInteractor.A03(com.instagram.api.schemas.RemoteStringSettingId, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(com.instagram.api.schemas.RemoteStringSettingId r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 19
            boolean r0 = X.MEB.A03(r3, r8)
            if (r0 == 0) goto L_0x007a
            r5 = r8
            X.MEB r5 = (X.MEB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0051
            if (r0 != r3) goto L_0x007f
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0048
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            X.XPL r1 = (X.XPL) r1
            X.Ju1 r0 = r1.FH3()
            java.lang.String r3 = r0.A02
            X.Ju1 r0 = r1.FH3()
            java.lang.String r2 = r0.A00
            r1 = 14
            X.JwE r0 = new X.JwE
            r0.<init>((java.lang.String) r2, (java.lang.Object) r3, (int) r1)
            X.3Ih r1 = X.C41845B3m.A0d(r0)
        L_0x0047:
            return r1
        L_0x0048:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0047
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0051:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "settings/get_string/"
            r2.A0A(r0)
            java.lang.Class<X.XPL> r1 = X.XPL.class
            java.lang.Class<X.Xdk> r0 = X.C21518Xdk.class
            r2.A0Q(r1, r0)
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "setting_id"
            X.1OC r1 = X.DbT.A0T(r2, r0, r1)
            r5.A00 = r3
            r0 = 963719809(0x39713281, float:2.3002365E-4)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x007a:
            X.MEB r5 = X.MEB.A00(r6, r8, r3)
            goto L_0x0016
        L_0x007f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsNetworkInteractor.A04(com.instagram.api.schemas.RemoteStringSettingId, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        if (r0 == r7) goto L_0x00a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.AnonymousClass4D7 r10) {
        /*
            r9 = this;
            r3 = 17
            boolean r0 = X.MEB.A03(r3, r10)
            if (r0 == 0) goto L_0x00a9
            r8 = r10
            X.MEB r8 = (X.MEB) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a9
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r8.A01
            X.1Hj r7 = X.1Hj.A02
            int r1 = r8.A00
            r6 = 1
            if (r1 == 0) goto L_0x007f
            if (r1 != r6) goto L_0x00f7
            X.0eS.A00(r0)
        L_0x0024:
            r7 = r0
            X.3Ii r7 = (X.C239803Ii) r7
            boolean r0 = r7 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0076
            java.lang.Object r2 = X.JTQ.A0Y(r7)
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            if (r2 == 0) goto L_0x00f0
            java.lang.Class<X.JsF> r1 = X.C60846JsF.class
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.3FZ r2 = r2.A00(r1, r0)
            if (r2 == 0) goto L_0x00f0
            java.lang.Class<X.JsE> r1 = X.C60845JsE.class
            java.lang.String r0 = "searchable_settings_nodes"
            com.google.common.collect.ImmutableList r0 = r2.A02(r0, r1)
            if (r0 == 0) goto L_0x00f0
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r0.iterator()
        L_0x0053:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            java.lang.String r0 = "name"
            java.lang.String r0 = r2.A05(r0)
            if (r0 == 0) goto L_0x0053
            X.XRk r1 = X.C21265XRk.A02
            java.lang.String r0 = "node_id"
            java.lang.Enum r0 = r2.A04(r0, r1)
            if (r0 == 0) goto L_0x0053
            r5.add(r3)
            goto L_0x0053
        L_0x0076:
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00a8
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x007f:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r9.A00
            X.3Fb r5 = X.C46479Dfi.A01(r0)
            X.2IS r4 = X.C41845B3m.A04()
            java.lang.Class<X.JsG> r3 = X.C60847JsG.class
            java.lang.String r2 = "FxSettingsSearchQuery"
            r1 = 0
            X.3Fa r0 = new X.3Fa
            r0.<init>(r4, r3, r2, r1)
            r5.A08(r0)
            X.1OC r1 = r5.A05()
            r8.A00 = r6
            r0 = 1561426694(0x5d117b06, float:6.551862E17)
            java.lang.Object r0 = r1.A00(r0, r8)
            if (r0 != r7) goto L_0x0024
        L_0x00a8:
            return r7
        L_0x00a9:
            X.MEB r8 = X.MEB.A00(r9, r10, r3)
            goto L_0x0016
        L_0x00af:
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r5)
            java.util.Iterator r6 = r5.iterator()
        L_0x00b7:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x00f2
            java.lang.Object r5 = r6.next()
            X.3FZ r5 = (X.AnonymousClass3FZ) r5
            java.lang.String r1 = "name"
            java.lang.String r4 = r5.A05(r1)
            java.lang.String r3 = "Required value was null."
            if (r4 == 0) goto L_0x00eb
            X.XRk r2 = X.C21265XRk.A02
            java.lang.String r1 = "node_id"
            java.lang.Enum r1 = r5.A04(r1, r2)
            if (r1 == 0) goto L_0x00e6
            java.lang.String r3 = X.DbT.A10(r1)
            r2 = 9
            X.ULg r1 = new X.ULg
            r1.<init>(r4, r3, r2)
            r0.add(r1)
            goto L_0x00b7
        L_0x00e6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x00eb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x00f0:
            X.0sn r0 = X.0sn.A00
        L_0x00f2:
            X.3Ih r7 = X.C41845B3m.A0d(r0)
            return r7
        L_0x00f7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsNetworkInteractor.A05(X.4D7):java.lang.Object");
    }

    public SettingsNetworkInteractor(UserSession userSession) {
        this.A00 = userSession;
    }
}
