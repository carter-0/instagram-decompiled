package X;

import android.content.Context;
import com.facebook.rsys.camera.gen.CameraModel;
import com.facebook.rsys.screenshare.gen.ScreenShareModel;
import com.meta.foa.session.FoaUserSession;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.OdA  reason: case insensitive filesystem */
public final class C71116OdA {
    public int A00;
    public int A01;
    public C69662Npk A02;
    public C67659Mrm A03;
    public String A04;
    public HashSet A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final C71253OgK A09;
    public final OYh A0A;
    public final C71032OZt A0B;
    public final AnonymousClass0Wi A0C;
    public final FoaUserSession A0D;
    public final Map A0E;
    public final Map A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final C62320sa A0I;
    public final C62320sa A0J;
    public final C62320sa A0K;
    public final 0sP A0L;
    public final boolean A0M;

    public static final void A01(C71116OdA odA) {
        HashSet A1F;
        odA.A06 = false;
        odA.A07 = false;
        if (odA.A0M) {
            A1F = 0sc.A05(new Integer[]{4});
        } else {
            A1F = AnonymousClass7TE.A1F();
        }
        odA.A05 = A1F;
        odA.A0E.clear();
        odA.A02 = null;
        if (odA.A03 != null) {
            try {
                odA.A08.unbindService(odA.A09);
            } catch (NullPointerException e) {
                0wb.A01.Ew2("RtcNotificationController", "unbindService threw exception", e);
                C71004OWb.A00.A02("RtcNotificationController", "unbindService threw exception", e);
            }
            C67659Mrm mrm = odA.A03;
            if (mrm != null) {
                mrm.A00 = null;
            }
            odA.A03 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r9.getApplicationInfo().targetSdkVersion < 34) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C71116OdA(android.content.Context r9, X.C71032OZt r10, com.meta.foa.session.FoaUserSession r11) {
        /*
            r8 = this;
            X.OYh r7 = new X.OYh
            r7.<init>(r9, r10)
            X.0b6 r0 = X.0b6.A00()
            X.0R3 r6 = r0.A07()
            X.PiH r5 = X.C73694PiH.A00
            X.PiI r4 = X.C73695PiI.A00
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r0 < r2) goto L_0x0020
            android.content.pm.ApplicationInfo r0 = r9.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r1 = 1
            if (r0 >= r2) goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            r3 = 1
            r0 = 4
            X.C51972G9s.A1E(r5, r4)
            r8.<init>()
            r8.A08 = r9
            r8.A0B = r10
            r8.A0D = r11
            r8.A0A = r7
            r8.A0C = r6
            r8.A0I = r5
            r8.A0K = r4
            r8.A0M = r1
            if (r1 == 0) goto L_0x0089
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0}
            java.util.HashSet r0 = X.0sc.A05(r0)
        L_0x0047:
            r8.A05 = r0
            java.util.LinkedHashMap r0 = X.AnonymousClass7TE.A1H()
            r8.A0E = r0
            r1 = 18
            X.Pln r0 = new X.Pln
            r0.<init>(r8, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r8.A0H = r0
            java.util.LinkedHashMap r0 = X.AnonymousClass7TE.A1H()
            r8.A0F = r0
            X.0eO r2 = X.0eO.A02
            r1 = 16
            X.Pln r0 = new X.Pln
            r0.<init>(r8, r1)
            X.0eM r0 = X.AnonymousClass0eN.A00(r2, r0)
            r8.A0G = r0
            r1 = 17
            X.Pln r0 = new X.Pln
            r0.<init>(r8, r1)
            r8.A0J = r0
            X.OgK r0 = new X.OgK
            r0.<init>(r8, r3)
            r8.A09 = r0
            X.PqL r0 = new X.PqL
            r0.<init>(r8, r1)
            r8.A0L = r0
            return
        L_0x0089:
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71116OdA.<init>(android.content.Context, X.OZt, com.meta.foa.session.FoaUserSession):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018d, code lost:
        if (r1 != 3) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01fe, code lost:
        if (r10.A05.add(128) != false) goto L_0x0200;
     */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C69662Npk r19, X.C71116OdA r20, boolean r21, boolean r22) {
        /*
            r10 = r20
            X.OZt r15 = r10.A0B
            r15.A03()
            X.Mrm r13 = r10.A03
            X.2LV r0 = com.facebook.rsys.state.gen.State.CONVERTER
            X.0qQ.A08(r0)
            r11 = r19
            java.lang.Object r12 = r11.A00(r0)
            com.facebook.rsys.state.gen.State r12 = (com.facebook.rsys.state.gen.State) r12
            X.0qQ.A0A(r12)
            boolean r0 = r12.isActive
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = r12.localCallId
            java.lang.String r0 = r10.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0033
        L_0x0029:
            int r1 = r12.callState
            if (r1 == r2) goto L_0x007c
            r0 = 2
            if (r1 == r0) goto L_0x007c
            r0 = 3
            if (r1 == r0) goto L_0x007c
        L_0x0033:
            r9 = 0
            if (r3 != 0) goto L_0x00f4
            if (r13 == 0) goto L_0x0368
            X.OWb r7 = X.C71004OWb.A00
            r6 = 0
            java.lang.String r3 = "RtcNotificationController"
            java.lang.String r0 = "Call ended, stopping foreground service"
            r7.A00(r3, r0)
            X.N3t r0 = r15.A03()
            X.0sa r0 = r0.A04
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 == 0) goto L_0x007e
            android.content.Context r0 = r10.A08
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.Object r0 = X.C66582MXn.A0p(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.service.notification.StatusBarNotification[] r0 = r0.getActiveNotifications()
            X.0sC r2 = X.0pe.A00(r0)
        L_0x0062:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r2.next()
            android.service.notification.StatusBarNotification r0 = (android.service.notification.StatusBarNotification) r0
            java.lang.String r1 = "Active notification: "
            int r0 = r0.getId()
            java.lang.String r0 = X.002.A0O(r1, r0)
            r7.A00(r3, r0)
            goto L_0x0062
        L_0x007c:
            r3 = 1
            goto L_0x0033
        L_0x007e:
            java.lang.String r12 = r12.localCallId
            if (r12 == 0) goto L_0x0365
            r8 = 2
            int[] r5 = new int[r8]
            r5 = {0, 1} // fill-array
        L_0x0088:
            r2 = r5[r9]
            com.meta.foa.session.FoaUserSession r4 = r10.A0D
            X.2LV r3 = com.facebook.rsys.call.gen.CallModel.CONVERTER
            X.0qQ.A08(r3)
            r0 = r11
            X.NDp r0 = (X.C68372NDp) r0
            X.OKD r1 = r0.A00
            java.lang.Object r3 = r1.A00(r3)
            com.facebook.rsys.call.gen.CallModel r3 = (com.facebook.rsys.call.gen.CallModel) r3
            X.2LV r0 = com.facebook.rsys.ended.gen.EndedModel.CONVERTER
            X.0qQ.A08(r0)
            java.lang.Object r1 = r1.A00(r0)
            com.facebook.rsys.ended.gen.EndedModel r1 = (com.facebook.rsys.ended.gen.EndedModel) r1
            if (r2 == 0) goto L_0x00bc
            r0 = 1
            if (r2 != r0) goto L_0x00eb
            X.PxB r1 = X.C69732NrH.A00(r3, r4)
            if (r1 == 0) goto L_0x00b7
            java.lang.String r0 = "notif_removed"
            r1.AIe(r0)
        L_0x00b7:
            int r9 = r9 + 1
            if (r9 >= r8) goto L_0x0365
            goto L_0x0088
        L_0x00bc:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Call ID "
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = " | Call notification dismissed with reason: "
            r2.append(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00e9
            int r1 = r1.reason
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x00d6:
            java.lang.String r2 = X.AnonymousClass7TF.A0i(r1, r2)
            java.lang.String r1 = "CallNotificationLogger"
            r7.A00(r1, r2)
            X.NlA r1 = X.C69425NlA.A0o
            if (r3 == 0) goto L_0x00e5
            java.lang.String r0 = r3.sharedCallId
        L_0x00e5:
            X.OX3.A01(r1, r4, r12, r0, r6)
            goto L_0x00b7
        L_0x00e9:
            r1 = r6
            goto L_0x00d6
        L_0x00eb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.IllegalArgumentException r0 = X.DbZ.A0Z(r0)
            throw r0
        L_0x00f4:
            X.Npk r2 = r10.A02
            r10.A02 = r11
            java.lang.String r8 = r12.localCallId
            if (r8 == 0) goto L_0x0368
            X.2LV r3 = com.facebook.rsys.call.gen.CallModel.CONVERTER
            X.0qQ.A08(r3)
            r0 = r11
            X.NDp r0 = (X.C68372NDp) r0
            X.OKD r1 = r0.A00
            java.lang.Object r7 = r1.A00(r3)
            com.facebook.rsys.call.gen.CallModel r7 = (com.facebook.rsys.call.gen.CallModel) r7
            if (r7 == 0) goto L_0x0368
            X.2LV r0 = com.facebook.rsys.camera.gen.CameraModel.CONVERTER
            X.0qQ.A08(r0)
            java.lang.Object r6 = r1.A00(r0)
            com.facebook.rsys.camera.gen.CameraModel r6 = (com.facebook.rsys.camera.gen.CameraModel) r6
            r14 = 0
            X.2LV r0 = com.facebook.rsys.screenshare.gen.ScreenShareModel.CONVERTER     // Catch:{ UnsatisfiedLinkError -> 0x0138 }
            X.0qQ.A08(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0138 }
            java.lang.Object r5 = r1.A00(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0138 }
            com.facebook.rsys.screenshare.gen.ScreenShareModel r5 = (com.facebook.rsys.screenshare.gen.ScreenShareModel) r5     // Catch:{ UnsatisfiedLinkError -> 0x0138 }
            if (r2 == 0) goto L_0x0142
            X.2LV r1 = com.facebook.rsys.screenshare.gen.ScreenShareModel.CONVERTER     // Catch:{ UnsatisfiedLinkError -> 0x0139 }
            X.0qQ.A08(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0139 }
            X.NDp r2 = (X.C68372NDp) r2     // Catch:{ UnsatisfiedLinkError -> 0x0139 }
            X.OKD r0 = r2.A00     // Catch:{ UnsatisfiedLinkError -> 0x0139 }
            java.lang.Object r0 = r0.A00(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0139 }
            com.facebook.rsys.screenshare.gen.ScreenShareModel r0 = (com.facebook.rsys.screenshare.gen.ScreenShareModel) r0     // Catch:{ UnsatisfiedLinkError -> 0x0139 }
            r14 = r0
            goto L_0x0142
        L_0x0138:
            r5 = r14
        L_0x0139:
            X.OWb r2 = X.C71004OWb.A00
            java.lang.String r1 = "RtcNotificationController"
            java.lang.String r0 = "Screenshare feature is missing"
            r2.A00(r1, r0)
        L_0x0142:
            boolean r1 = r10.A06
            boolean r0 = X.C69724Nqo.A00(r7)
            r4 = 1
            boolean r20 = X.JTQ.A1O(r1, r0)
            java.util.ArrayList r0 = r7.remoteParticipants
            X.0qQ.A06(r0)
            java.util.Iterator r16 = r0.iterator()
            r19 = 0
        L_0x0158:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r3 = r16.next()
            com.facebook.rsys.call.gen.CallParticipant r3 = (com.facebook.rsys.call.gen.CallParticipant) r3
            java.util.Map r2 = r10.A0E
            java.lang.String r0 = r3.userId
            java.lang.Object r1 = r2.get(r0)
            if (r1 == 0) goto L_0x0176
            com.facebook.rsys.callinfo.gen.UserProfile r0 = r3.userProfile
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0158
        L_0x0176:
            r19 = 1
            java.lang.String r0 = r3.userId
            com.facebook.rsys.callinfo.gen.UserProfile r1 = r3.userProfile
            r2.put(r0, r1)
            goto L_0x0158
        L_0x0180:
            com.facebook.rsys.call.gen.CallParticipant r0 = r7.selfParticipant
            com.facebook.rsys.callinfo.gen.UserProfile r0 = r0.userProfile
            int r1 = r0.userProfileState
            int r0 = r10.A01
            if (r0 == r1) goto L_0x018f
            r0 = 3
            r18 = 1
            if (r1 == r0) goto L_0x0191
        L_0x018f:
            r18 = 0
        L_0x0191:
            r10.A01 = r1
            java.lang.String r0 = r10.A04
            boolean r0 = r8.equals(r0)
            r17 = r0 ^ 1
            boolean r0 = X.C69724Nqo.A00(r7)
            r10.A06 = r0
            r10.A04 = r8
            boolean r0 = r10.A0M
            r16 = 0
            if (r0 != 0) goto L_0x01c5
            r3 = 0
        L_0x01aa:
            if (r13 == 0) goto L_0x02de
            int r0 = r7.inCallState
            r1 = 2
            if (r0 != r1) goto L_0x0227
            X.2LV r0 = com.facebook.rsys.state.gen.State.CONVERTER
            X.0qQ.A08(r0)
            java.lang.Object r0 = r11.A00(r0)
            com.facebook.rsys.state.gen.State r0 = (com.facebook.rsys.state.gen.State) r0
            java.lang.String r0 = r0.localCallId
            if (r0 != 0) goto L_0x0227
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01c5:
            boolean r0 = r10.A03(r6)
            if (r0 == 0) goto L_0x0225
            X.OWb r2 = X.C71004OWb.A00
            java.lang.String r1 = "RtcNotificationController"
            java.lang.String r0 = "Adding camera permission to FG Service"
            r2.A00(r1, r0)
            java.util.HashSet r1 = r10.A05
            r0 = 64
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r1.add(r0)
        L_0x01e0:
            boolean r0 = r10.A02(r7)
            if (r0 == 0) goto L_0x0201
            X.OWb r2 = X.C71004OWb.A00
            java.lang.String r1 = "RtcNotificationController"
            java.lang.String r0 = "Adding microphone permission to FG Service"
            r2.A00(r1, r0)
            if (r3 != 0) goto L_0x0200
            java.util.HashSet r1 = r10.A05
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.add(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0201
        L_0x0200:
            r3 = 1
        L_0x0201:
            boolean r0 = r10.A04(r14, r5)
            if (r0 == 0) goto L_0x01aa
            X.OWb r2 = X.C71004OWb.A00
            java.lang.String r1 = "RtcNotificationController"
            java.lang.String r0 = "Removing media projection permission from FG Service"
            r2.A00(r1, r0)
            if (r3 != 0) goto L_0x0220
            java.util.HashSet r1 = r10.A05
            r0 = 32
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.remove(r0)
            if (r0 == 0) goto L_0x0222
        L_0x0220:
            r16 = 1
        L_0x0222:
            r3 = r16
            goto L_0x01aa
        L_0x0225:
            r3 = 0
            goto L_0x01e0
        L_0x0227:
            int r0 = r12.callState
            int r2 = r7.inCallState
            if (r0 != r1) goto L_0x02ce
            int r0 = r10.A00
            if (r2 == r0) goto L_0x02c7
            if (r0 != r1) goto L_0x02c7
        L_0x0233:
            int r3 = r10.A00
            r0 = 7
            if (r3 == r0) goto L_0x02a4
            if (r2 != r0) goto L_0x02a4
            java.lang.String r3 = "Call connected, updating to ongoing notification"
        L_0x023c:
            X.OWb r2 = X.C71004OWb.A00
            java.lang.String r0 = "RtcNotificationController"
            r2.A00(r0, r3)
            X.2LV r0 = com.facebook.rsys.call.gen.CallModel.CONVERTER
            X.0qQ.A08(r0)
            java.lang.Object r0 = r11.A00(r0)
            com.facebook.rsys.call.gen.CallModel r0 = (com.facebook.rsys.call.gen.CallModel) r0
            int r0 = r0.inCallState
            r4 = 20025(0x4e39, float:2.8061E-41)
            if (r0 != r1) goto L_0x0256
            r4 = 20023(0x4e37, float:2.8058E-41)
        L_0x0256:
            r15.A03()
            com.facebook.rtc.notification.RtcNotificationForegroundService r6 = r13.A00
            if (r6 == 0) goto L_0x02ff
            android.content.Context r5 = r10.A08
            X.OYh r3 = r10.A0A
            com.meta.foa.session.FoaUserSession r2 = r10.A0D
            r0 = 20023(0x4e37, float:2.8058E-41)
            boolean r21 = X.AnonymousClass7TF.A1S(r4, r0)
            X.N3t r16 = r15.A03()
            java.util.HashSet r0 = r10.A05
            java.util.Iterator r12 = r0.iterator()
            boolean r0 = r12.hasNext()
            if (r0 != 0) goto L_0x028c
            r9 = 0
        L_0x027a:
            java.lang.Integer r9 = (java.lang.Integer) r9
            r12 = r6
            r13 = r5
            r14 = r11
            r15 = r3
            r17 = r2
            r18 = r9
            r19 = r8
            r20 = r4
            r12.A01(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x02ff
        L_0x028c:
            java.lang.Object r9 = r12.next()
        L_0x0290:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x027a
            int r1 = X.AnonymousClass7TG.A0F(r12)
            int r0 = X.AnonymousClass7TE.A0M(r9)
            r0 = r0 | r1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            goto L_0x0290
        L_0x02a4:
            if (r20 == 0) goto L_0x02a9
            java.lang.String r3 = "Video state updated, updating ongoing notification"
            goto L_0x023c
        L_0x02a9:
            if (r19 == 0) goto L_0x02ae
            java.lang.String r3 = "Remote participant user profile updated"
            goto L_0x023c
        L_0x02ae:
            if (r18 == 0) goto L_0x02b3
            java.lang.String r3 = "Self participant user profile updated"
            goto L_0x023c
        L_0x02b3:
            if (r21 == 0) goto L_0x02b8
            java.lang.String r3 = "Initial update after service bound, starting foreground notification"
            goto L_0x023c
        L_0x02b8:
            if (r22 == 0) goto L_0x02bd
            java.lang.String r3 = "App-requested force updating ongoing notification for custom actions"
            goto L_0x023c
        L_0x02bd:
            if (r17 == 0) goto L_0x02c3
            java.lang.String r3 = "localCallId changed"
            goto L_0x023c
        L_0x02c3:
            java.lang.String r3 = "Updating ongoing notification"
            goto L_0x023c
        L_0x02c7:
            if (r2 == r0) goto L_0x02ce
            r0 = 7
            if (r2 != r0) goto L_0x02ce
            goto L_0x0233
        L_0x02ce:
            if (r20 != 0) goto L_0x0233
            if (r19 != 0) goto L_0x0233
            if (r18 != 0) goto L_0x0233
            if (r21 != 0) goto L_0x0233
            if (r22 != 0) goto L_0x0233
            if (r17 != 0) goto L_0x0233
            if (r3 == 0) goto L_0x02de
            goto L_0x0233
        L_0x02de:
            boolean r0 = r12.isActive
            if (r0 != 0) goto L_0x02ec
            java.lang.String r1 = r12.localCallId
            java.lang.String r0 = r10.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x02f6
        L_0x02ec:
            int r1 = r12.callState
            if (r1 == r4) goto L_0x0304
            r0 = 2
            if (r1 == r0) goto L_0x0304
            r0 = 3
            if (r1 == r0) goto L_0x0304
        L_0x02f6:
            X.OWb r2 = X.C71004OWb.A00
            java.lang.String r1 = "RtcNotificationController"
            java.lang.String r0 = "Skipping notification update for model round"
            r2.A00(r1, r0)
        L_0x02ff:
            int r0 = r7.inCallState
            r10.A00 = r0
            return
        L_0x0304:
            if (r13 != 0) goto L_0x02f6
            boolean r0 = r10.A07
            if (r0 != 0) goto L_0x02f6
            X.OWb r12 = X.C71004OWb.A00
            r11 = 0
            java.lang.String r1 = "RtcNotificationController"
            java.lang.String r0 = "Call started, starting foreground service"
            r12.A00(r1, r0)
            r6 = 2
            int[] r3 = new int[r6]
            r3 = {0, 1} // fill-array
        L_0x031a:
            r0 = r3[r9]
            android.content.Context r5 = r10.A08
            com.meta.foa.session.FoaUserSession r2 = r10.A0D
            if (r0 == 0) goto L_0x0347
            if (r0 != r4) goto L_0x035c
            X.PxB r1 = X.C69732NrH.A00(r7, r2)
            if (r1 == 0) goto L_0x032f
            java.lang.String r0 = "notif_service_started"
            r1.AIe(r0)
        L_0x032f:
            int r9 = r9 + 1
            if (r9 < r6) goto L_0x031a
            X.0Wi r3 = r10.A0C
            java.lang.Class<com.facebook.rtc.notification.RtcNotificationForegroundService> r0 = com.facebook.rtc.notification.RtcNotificationForegroundService.class
            android.content.Intent r2 = X.C66580MXl.A0A(r5, r0)
            X.OgK r1 = r10.A09
            android.content.Context r0 = r5.getApplicationContext()
            r3.A04(r0, r2, r1, r4)
            r10.A07 = r4
            goto L_0x02ff
        L_0x0347:
            java.lang.String r1 = "Call ID "
            java.lang.String r0 = " | Call foreground service started"
            java.lang.String r1 = X.002.A0g(r1, r8, r0)
            java.lang.String r0 = "CallNotificationLogger"
            r12.A00(r0, r1)
            X.NlA r1 = X.C69425NlA.A0n
            java.lang.String r0 = r7.sharedCallId
            X.OX3.A01(r1, r2, r8, r0, r11)
            goto L_0x032f
        L_0x035c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.IllegalArgumentException r0 = X.DbZ.A0Z(r0)
            throw r0
        L_0x0365:
            A01(r10)
        L_0x0368:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71116OdA.A00(X.Npk, X.OdA, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A02(com.facebook.rsys.call.gen.CallModel r5) {
        /*
            r4 = this;
            java.util.HashSet r1 = r4.A05
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0022
            com.facebook.rsys.call.gen.CallParticipant r0 = r5.selfParticipant
            com.facebook.rsys.call.gen.ParticipantMediaState r0 = r0.mediaState
            java.util.ArrayList r1 = r0.audioStreams
            X.0qQ.A06(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0024
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0024
        L_0x0022:
            r3 = 0
        L_0x0023:
            return r3
        L_0x0024:
            java.util.Iterator r2 = r1.iterator()
        L_0x0028:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r2.next()
            com.facebook.rsys.audio.gen.AudioStream r0 = (com.facebook.rsys.audio.gen.AudioStream) r0
            int r1 = r0.streamState
            r0 = 3
            if (r1 == r0) goto L_0x0023
            r0 = 2
            if (r1 != r0) goto L_0x0028
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71116OdA.A02(com.facebook.rsys.call.gen.CallModel):boolean");
    }

    private final boolean A03(CameraModel cameraModel) {
        if (this.A05.contains(64) || cameraModel == null || !cameraModel.cameraOn) {
            return false;
        }
        return true;
    }

    private final boolean A04(ScreenShareModel screenShareModel, ScreenShareModel screenShareModel2) {
        Integer num;
        if (!this.A05.contains(32)) {
            return false;
        }
        Integer num2 = null;
        if (screenShareModel2 != null) {
            num = Integer.valueOf(screenShareModel2.screenShareState);
        } else {
            num = null;
        }
        if (screenShareModel != null) {
            num2 = Integer.valueOf(screenShareModel.screenShareState);
        }
        if (0qQ.A0K(num, num2) || screenShareModel2 == null || screenShareModel2.screenShareState != 0) {
            return false;
        }
        return true;
    }
}
