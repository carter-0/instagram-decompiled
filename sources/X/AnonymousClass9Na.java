package X;

import com.instagram.notifications.persistence.room.IgNotificationsDatabase;
import com.instagram.roomdb.IgDeviceScopedRoomDatabase;

/* renamed from: X.9Na  reason: invalid class name */
public final class AnonymousClass9Na extends 01C {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9Na(java.lang.Object r7, int r8) {
        /*
            r6 = this;
            r0 = r6
            r6.A00 = r8
            switch(r8) {
                case 0: goto L_0x0012;
                case 1: goto L_0x0019;
                case 2: goto L_0x0020;
                case 3: goto L_0x0027;
                case 4: goto L_0x002e;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.5GN> r1 = X.AnonymousClass5GN.class
            java.lang.String r3 = "database"
            java.lang.String r4 = "getDatabase()Lcom/instagram/notifications/persistence/room/IgNotificationsDatabase;"
        L_0x000c:
            r5 = 0
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0012:
            java.lang.Class<X.JY9> r1 = X.JY9.class
            java.lang.String r3 = "isInStory"
            java.lang.String r4 = "isInStory()Z"
            goto L_0x000c
        L_0x0019:
            java.lang.Class<X.7Vj> r1 = X.C332527Vj.class
            java.lang.String r3 = "statusLogger"
            java.lang.String r4 = "getStatusLogger()Lcom/instagram/direct/messagethread/shhmode/logging/DirectThreadShhModeStatusLogger;"
            goto L_0x000c
        L_0x0020:
            java.lang.Class<X.7Tw> r1 = X.C332157Tw.class
            java.lang.String r3 = "dmStatusProvider"
            java.lang.String r4 = "getDmStatusProvider()Lcom/instagram/direct/fragment/thread/specialmode/disappearingmode/DisappearingModeStatusProvider;"
            goto L_0x000c
        L_0x0027:
            java.lang.Class<X.7Ue> r1 = X.C332237Ue.class
            java.lang.String r3 = "powerupsEffectsManager"
            java.lang.String r4 = "getPowerupsEffectsManager()Lcom/facebook/xac/powerups/PowerupsEffectsManager;"
            goto L_0x000c
        L_0x002e:
            java.lang.Class<X.7Ue> r1 = X.C332237Ue.class
            java.lang.String r3 = "directThreadNuxUpsellHelper"
            java.lang.String r4 = "getDirectThreadNuxUpsellHelper()Lcom/instagram/direct/fragment/thread/nux/DirectThreadNuxUpsellHelper;"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Na.<init>(java.lang.Object, int):void");
    }

    public final Object get() {
        String str;
        IgDeviceScopedRoomDatabase igDeviceScopedRoomDatabase;
        switch (this.A00) {
            case 0:
                return Boolean.valueOf(((JY9) this.receiver).CVI());
            case 1:
                C330707Nw r0 = ((C332527Vj) this.receiver).A00;
                if (r0 == null) {
                    str = "statusLogger";
                    break;
                } else {
                    return r0;
                }
            case 2:
                AnonymousClass7L4 r02 = ((C332157Tw) this.receiver).A04;
                if (r02 == null) {
                    str = "dmStatusProvider";
                    break;
                } else {
                    return r02;
                }
            case 3:
                return ((C332237Ue) this.receiver).A00;
            case 4:
                C330487Na r03 = ((C332237Ue) this.receiver).A04;
                if (r03 == null) {
                    str = "directThreadNuxUpsellHelper";
                    break;
                } else {
                    return r03;
                }
            default:
                AnonymousClass5GU r6 = IgNotificationsDatabase.A00;
                C62880wX r5 = C61170le.A00;
                Class<IgNotificationsDatabase> cls = IgNotificationsDatabase.class;
                Object A002 = r5.A00(cls);
                if (A002 != null) {
                    return A002;
                }
                synchronized (r6) {
                    igDeviceScopedRoomDatabase = (IgDeviceScopedRoomDatabase) r5.A00(cls);
                    if (igDeviceScopedRoomDatabase == null) {
                        1VA A003 = 1V9.A00(r5.A06(), cls, "device_ig_notifications_db");
                        1VC.A00(A003, 2112225451, 1621021914, true);
                        A003.A01();
                        igDeviceScopedRoomDatabase = (IgDeviceScopedRoomDatabase) A003.A00();
                        r5.A04(cls, igDeviceScopedRoomDatabase);
                    }
                }
                return igDeviceScopedRoomDatabase;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
