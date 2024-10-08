package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OcZ  reason: case insensitive filesystem */
public final class C71099OcZ {
    public static final C71099OcZ A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r1 != 2) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0067, code lost:
        if (r2 == r13) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006d, code lost:
        if (r8 == r11) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        if (r7 == r12) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.common.session.UserSession r8, X.C69302Nj3 r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Integer r13) {
        /*
            r5 = 0
            X.0qQ.A0B(r8, r5)
            X.02m r3 = X.02m.A0p
            X.0BQ r1 = X.C66580MXl.A0o(r8, r3)
            X.65E r0 = X.AnonymousClass65D.A00(r8)
            r4 = 2
            int r2 = X.DbW.A03(r4, r1, r0)
            X.NUO r6 = new X.NUO
            r6.<init>(r3, r0, r1)
            int r1 = r10.intValue()
            switch(r1) {
                case 0: goto L_0x002a;
                case 1: goto L_0x002a;
                case 2: goto L_0x002a;
                case 3: goto L_0x002a;
                case 4: goto L_0x002a;
                case 5: goto L_0x002a;
                case 6: goto L_0x002a;
                case 7: goto L_0x002a;
                case 8: goto L_0x002a;
                case 9: goto L_0x0027;
                case 10: goto L_0x0024;
                default: goto L_0x001f;
            }
        L_0x001f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0024:
            X.Nj3 r3 = X.C69302Nj3.DeviceNotOnboarded
            goto L_0x002c
        L_0x0027:
            X.Nj3 r3 = X.C69302Nj3.NoBackupsPresent
            goto L_0x002c
        L_0x002a:
            X.Nj3 r3 = X.C69302Nj3.DeviceOnboarded
        L_0x002c:
            r0 = 5
            if (r1 == r0) goto L_0x00bb
            r0 = 6
            if (r1 == r0) goto L_0x00bb
            r0 = 9
            if (r1 == r0) goto L_0x00b7
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
        L_0x0038:
            if (r1 == r5) goto L_0x00b4
            r0 = 1
            if (r1 == r0) goto L_0x00b4
            r0 = 9
            if (r1 == r0) goto L_0x00b1
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            if (r1 == r4) goto L_0x00ae
        L_0x0045:
            if (r1 == r2) goto L_0x00ae
            r0 = 9
            if (r1 == r0) goto L_0x00ab
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
        L_0x004d:
            r6.A09()
            switch(r1) {
                case 0: goto L_0x008d;
                case 1: goto L_0x0090;
                case 2: goto L_0x0093;
                case 3: goto L_0x0096;
                case 4: goto L_0x0099;
                case 5: goto L_0x009c;
                case 6: goto L_0x009f;
                case 7: goto L_0x00a2;
                case 8: goto L_0x00a5;
                case 9: goto L_0x00a8;
                default: goto L_0x0053;
            }
        L_0x0053:
            java.lang.String r1 = "TURN_OFF_SECURE_STORAGE"
        L_0x0055:
            java.lang.String r0 = "EB_OPERATION"
            r6.A0D(r0, r1)
            java.lang.String r0 = "IS_BACKUP_STATUS_CORRECT"
            r4 = 1
            if (r9 != r3) goto L_0x0089
            r6.A0E(r0, r4)
        L_0x0062:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 == r0) goto L_0x0069
            r3 = 1
            if (r2 != r13) goto L_0x006a
        L_0x0069:
            r3 = 0
        L_0x006a:
            if (r8 == r0) goto L_0x006f
            r2 = 1
            if (r8 != r11) goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            if (r7 == r0) goto L_0x0075
            r1 = 1
            if (r7 != r12) goto L_0x0076
        L_0x0075:
            r1 = 0
        L_0x0076:
            java.lang.String r0 = "IS_VIRTUAL_DEVICE_METADATA_CORRECT"
            if (r3 != 0) goto L_0x0085
            if (r2 != 0) goto L_0x0085
            if (r1 != 0) goto L_0x0085
            r6.A0E(r0, r4)
        L_0x0081:
            r6.A08()
            return
        L_0x0085:
            r6.A0E(r0, r5)
            goto L_0x0081
        L_0x0089:
            r6.A0E(r0, r5)
            goto L_0x0062
        L_0x008d:
            java.lang.String r1 = "PIN_SETUP"
            goto L_0x0055
        L_0x0090:
            java.lang.String r1 = "PIN_RESTORE"
            goto L_0x0055
        L_0x0093:
            java.lang.String r1 = "BLOCKSTORE_SETUP"
            goto L_0x0055
        L_0x0096:
            java.lang.String r1 = "BLOCKSTORE_RESTORE"
            goto L_0x0055
        L_0x0099:
            java.lang.String r1 = "OTC_RESTORE"
            goto L_0x0055
        L_0x009c:
            java.lang.String r1 = "GDRIVE_SETUP"
            goto L_0x0055
        L_0x009f:
            java.lang.String r1 = "GDRIVE_RESTORE"
            goto L_0x0055
        L_0x00a2:
            java.lang.String r1 = "AUTO_BACKUPS_SETUP"
            goto L_0x0055
        L_0x00a5:
            java.lang.String r1 = "AUTO_BACKUPS_RESTORE"
            goto L_0x0055
        L_0x00a8:
            java.lang.String r1 = "DELETE_BACKUP"
            goto L_0x0055
        L_0x00ab:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x004d
        L_0x00ae:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x004d
        L_0x00b1:
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            goto L_0x0045
        L_0x00b4:
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            goto L_0x0045
        L_0x00b7:
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            goto L_0x0038
        L_0x00bb:
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71099OcZ.A01(com.instagram.common.session.UserSession, X.Nj3, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer):void");
    }

    public static final void A02(UserSession userSession, Integer num, boolean z) {
        0qQ.A0B(userSession, 0);
        if (!AnonymousClass65A.A02(AnonymousClass65D.A00(userSession).A00, 36326627231610766L)) {
            return;
        }
        if (z) {
            C66581MXm.A0P().A02(OP5.A00(userSession, "").A0L(new C72027Ov1(2, num, userSession)), PT9.A00);
            return;
        }
        C72203OyT A002 = C69901Nu3.A00(userSession, AnonymousClass05K.A06);
        A002.A07(new JK1(8, (Object) userSession, (Object) num, (Object) A002));
    }

    public static final Integer A00(C69356Njv njv, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C70832ONe) it.next()).A00 == njv) {
                    return AnonymousClass05K.A00;
                }
            }
        }
        return AnonymousClass05K.A01;
    }
}
