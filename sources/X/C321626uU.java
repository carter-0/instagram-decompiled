package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.6uU  reason: invalid class name and case insensitive filesystem */
public final class C321626uU implements C321636uV {
    public final /* synthetic */ UserDetailFragment A00;

    public final void DQ9(C294265mA r10, boolean z, boolean z2, boolean z3) {
        0lp A002 = 0lq.A00("FeedRequestCallback.onMediaFeedRequestStart");
        try {
            UserDetailFragment userDetailFragment = this.A00;
            C321606uS r5 = userDetailFragment.A1A;
            if (r5 != null) {
                boolean A15 = userDetailFragment.A15();
                String name = r10.name();
                0qQ.A0B(name, 2);
                int i = r5.A00;
                if (i != 0) {
                    02m r2 = r5.A01;
                    r2.markerAnnotate(i, "is_cache_request", false);
                    r2.markerAnnotate(r5.A00, "profile_feed_source", name);
                    r2.markerAnnotate(r5.A00, "is_self_profile", A15);
                    r2.markerPoint(r5.A00, "data_fetch_start");
                }
            }
            UserDetailTabController userDetailTabController = userDetailFragment.A0z;
            if (userDetailTabController != null) {
                userDetailTabController.A0G();
            }
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public C321626uU(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|(3:4|(1:6)(2:8|(1:10)(1:11))|7)|12|13|(3:15|(1:17)(1:23)|18)|19|(1:21)|22|(3:(1:26)(1:27)|28|(3:30|(1:32)(1:43)|33))|34|(2:36|(1:38))(1:42)|39|(10:48|(1:52)|54|(1:56)|58|(1:(1:(1:62)(3:66|(1:68)|69))(4:63|71|72|73))(4:(1:65)|71|72|73)|70|71|72|73)(10:45|(1:47)|54|(0)|58|(0)(0)|70|71|72|73)) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ec, code lost:
        if (r0 != false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f5, code lost:
        if (r6 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0142, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0143, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0144, code lost:
        X.C9153RRe.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0147, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053 A[Catch:{ all -> 0x013e, all -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073 A[Catch:{ all -> 0x013e, all -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084 A[Catch:{ all -> 0x013e, all -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9 A[Catch:{ all -> 0x013e, all -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c7 A[Catch:{ all -> 0x013e, all -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3 A[Catch:{ all -> 0x013e, all -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00de A[Catch:{ all -> 0x013e, all -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f4 A[Catch:{ all -> 0x013e, all -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fa A[Catch:{ all -> 0x013e, all -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0119 A[Catch:{ all -> 0x013e, all -> 0x0143 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQ4(X.C268654dm r12, X.C294265mA r13) {
        /*
            r11 = this;
            java.lang.String r0 = "FeedRequestCallback.onMediaFeedRequestFail"
            X.0lp r10 = X.0lq.A00(r0)
            com.instagram.profile.fragment.UserDetailFragment r0 = r11.A00     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.A1d     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = "EarlyProfileExperiment"
            boolean r0 = r12 instanceof X.C268674do     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x001c
            r0 = 175(0xaf, float:2.45E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x0039 }
        L_0x0018:
            X.0KC.A0E(r2, r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0039
        L_0x001c:
            java.lang.Throwable r1 = r12.A01()     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = "error because of a throwable"
            X.0KC.A0J(r2, r0, r1)     // Catch:{ all -> 0x0039 }
            goto L_0x0039
        L_0x0028:
            java.lang.Object r0 = r12.A00()     // Catch:{ all -> 0x0039 }
            X.4mz r0 = (X.C273664mz) r0     // Catch:{ all -> 0x0039 }
            int r1 = r0.mStatusCode     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r0.getErrorMessage()     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = X.002.A03(r1, r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0018
        L_0x0039:
            com.instagram.profile.fragment.UserDetailFragment r3 = r11.A00     // Catch:{ all -> 0x013e }
            com.instagram.common.session.UserSession r5 = r3.A0I     // Catch:{ all -> 0x013e }
            r4 = 0
            X.0qQ.A0B(r5, r4)     // Catch:{ all -> 0x013e }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x013e }
            r0 = 36325274316976952(0x810da500083338, double:3.035587975970885E-306)
            boolean r9 = X.182.A06(r2, r5, r0)     // Catch:{ all -> 0x013e }
            java.lang.Throwable r8 = r12.A01()     // Catch:{ all -> 0x013e }
            r2 = 0
            if (r9 != 0) goto L_0x0060
            X.Dda r0 = r3.A1B     // Catch:{ all -> 0x013e }
            X.34p r1 = r0.A00     // Catch:{ all -> 0x013e }
            if (r8 == 0) goto L_0x0080
            java.lang.String r0 = r8.getMessage()     // Catch:{ all -> 0x013e }
        L_0x005d:
            r1.A07(r0)     // Catch:{ all -> 0x013e }
        L_0x0060:
            X.ToN r0 = r3.A1C     // Catch:{ all -> 0x013e }
            r7 = 18284548(0x1170004, float:2.773433E-38)
            java.util.Map r6 = r0.A00     // Catch:{ all -> 0x013e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x013e }
            java.lang.Object r0 = r6.get(r5)     // Catch:{ all -> 0x013e }
            X.XEQ r0 = (X.XEQ) r0     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x007d
            r1 = 97
            X.02m r0 = X.02m.A0p     // Catch:{ all -> 0x013e }
            r0.markerEnd(r7, r1)     // Catch:{ all -> 0x013e }
            r6.remove(r5)     // Catch:{ all -> 0x013e }
        L_0x007d:
            X.6uS r7 = r3.A1A     // Catch:{ all -> 0x013e }
            goto L_0x0082
        L_0x0080:
            r0 = r2
            goto L_0x005d
        L_0x0082:
            if (r7 == 0) goto L_0x00a0
            if (r8 == 0) goto L_0x008b
            java.lang.String r0 = r8.getMessage()     // Catch:{ all -> 0x013e }
            goto L_0x008d
        L_0x008b:
            java.lang.String r0 = "null error message"
        L_0x008d:
            int r6 = r7.A00     // Catch:{ all -> 0x013e }
            if (r6 == 0) goto L_0x00a0
            java.lang.String r1 = "failure_reason"
            if (r0 == 0) goto L_0x00c9
            X.02m r5 = r7.A01     // Catch:{ all -> 0x013e }
            r5.markerAnnotate(r6, r1, r0)     // Catch:{ all -> 0x013e }
        L_0x009a:
            int r1 = r7.A00     // Catch:{ all -> 0x013e }
            r0 = 3
            r5.markerEnd(r1, r0)     // Catch:{ all -> 0x013e }
        L_0x00a0:
            java.lang.Object r7 = r12.A00()     // Catch:{ all -> 0x013e }
            r5 = r7
            X.4mz r5 = (X.C273664mz) r5     // Catch:{ all -> 0x013e }
            if (r5 == 0) goto L_0x00c7
            com.instagram.api.schemas.GraphGuardianContentImpl r6 = r5.A00     // Catch:{ all -> 0x013e }
            if (r6 == 0) goto L_0x00be
            com.instagram.profile.fragment.UserDetailTabController r0 = r3.A0z     // Catch:{ all -> 0x013e }
            X.6wH r0 = r0.A0Q     // Catch:{ all -> 0x013e }
            java.util.HashMap r0 = r0.A03     // Catch:{ all -> 0x013e }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x013e }
            X.6wK r0 = (X.C322736wK) r0     // Catch:{ all -> 0x013e }
            r0.A00 = r6     // Catch:{ all -> 0x013e }
            X.C322736wK.A00(r0)     // Catch:{ all -> 0x013e }
        L_0x00be:
            X.1XP r7 = (X.1XP) r7     // Catch:{ all -> 0x013e }
            boolean r0 = r12 instanceof X.C268674do     // Catch:{ all -> 0x013e }
            java.lang.String r1 = "Not authorized to view user"
            if (r0 == 0) goto L_0x00de
            goto L_0x00d1
        L_0x00c7:
            r6 = r2
            goto L_0x00be
        L_0x00c9:
            X.02m r5 = r7.A01     // Catch:{ all -> 0x013e }
            java.lang.String r0 = "fetch_fail"
            r5.markerAnnotate(r6, r1, r0)     // Catch:{ all -> 0x013e }
            goto L_0x009a
        L_0x00d1:
            if (r7 == 0) goto L_0x00de
            java.lang.String r0 = r7.getErrorMessage()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x013e }
            goto L_0x00ec
        L_0x00de:
            boolean r0 = r12 instanceof X.C268664dn     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = r8.getMessage()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x013e }
        L_0x00ec:
            if (r0 != 0) goto L_0x00f7
        L_0x00ee:
            boolean r0 = r3.isVisible()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x00f7
            r0 = 1
            if (r6 == 0) goto L_0x00f8
        L_0x00f7:
            r0 = 0
        L_0x00f8:
            if (r9 == 0) goto L_0x0119
            if (r0 == 0) goto L_0x010a
            if (r8 == 0) goto L_0x011c
            X.Dda r0 = r3.A1B     // Catch:{ all -> 0x013e }
            X.34p r1 = r0.A00     // Catch:{ all -> 0x013e }
            java.lang.String r0 = r8.getMessage()     // Catch:{ all -> 0x013e }
            r1.A07(r0)     // Catch:{ all -> 0x013e }
            goto L_0x0129
        L_0x010a:
            X.Dda r0 = r3.A1B     // Catch:{ all -> 0x013e }
            X.34p r0 = r0.A05     // Catch:{ all -> 0x013e }
            r0.A03()     // Catch:{ all -> 0x013e }
            X.Dda r0 = r3.A1B     // Catch:{ all -> 0x013e }
            X.34p r0 = r0.A00     // Catch:{ all -> 0x013e }
            r0.A05()     // Catch:{ all -> 0x013e }
            goto L_0x0135
        L_0x0119:
            if (r0 == 0) goto L_0x0135
            goto L_0x0129
        L_0x011c:
            X.Dda r0 = r3.A1B     // Catch:{ all -> 0x013e }
            X.34p r0 = r0.A00     // Catch:{ all -> 0x013e }
            if (r5 == 0) goto L_0x0126
            java.lang.String r2 = r5.getErrorMessage()     // Catch:{ all -> 0x013e }
        L_0x0126:
            r0.A07(r2)     // Catch:{ all -> 0x013e }
        L_0x0129:
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()     // Catch:{ all -> 0x013e }
            r1 = 2131956760(0x7f131418, float:1.9550085E38)
            java.lang.String r0 = "media_feed_request_failed"
            X.C59689JTv.A01(r2, r0, r1, r4)     // Catch:{ all -> 0x013e }
        L_0x0135:
            com.instagram.profile.fragment.UserDetailTabController r0 = r3.A0z     // Catch:{ all -> 0x013e }
            r0.A0G()     // Catch:{ all -> 0x013e }
            r10.close()
            return
        L_0x013e:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0143 }
            throw r1
        L_0x0143:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321626uU.DQ4(X.4dm, X.5mA):void");
    }

    public final void DQ6(C294265mA r8) {
        WZN wzn;
        0lp A002 = 0lq.A00("FeedRequestCallback.onMediaFeedRequestFinish");
        try {
            UserDetailTabController userDetailTabController = this.A00.A0z;
            if (!userDetailTabController.A0D || r8 != C294265mA.MAIN_GRID || (wzn = userDetailTabController.A02) == null) {
                ((C322736wK) userDetailTabController.A0Q.A03.get(r8)).A01 = true;
            } else {
                0qQ.A0B(r8, 0);
                WZM A003 = WZN.A00(wzn, r8);
                A003.A00 = true;
                if (182.A06(0Tu.A05, A003.A02, 36328216369577037L)) {
                    WZM.A00(A003);
                }
            }
            userDetailTabController.A0H();
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public final void DQ7(String str, Long l) {
        UserDetailFragment userDetailFragment = this.A00;
        if (l != null) {
            userDetailFragment.A1B.A0H(str, l.longValue());
        } else {
            userDetailFragment.A1B.A0E(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r4 != X.C294265mA.MAIN_GRID) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0035, code lost:
        if (X.182.A06(r6, r4, 36325274316845879L) != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0141, code lost:
        if (r0.booleanValue() != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0205, code lost:
        if (r3.A0i.A08.A00 == X.AnonymousClass05K.A0C) goto L_0x0207;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQA(android.content.Context r26, X.C61082JwK r27, X.C273664mz r28, X.C294265mA r29, boolean r30, boolean r31) {
        /*
            r25 = this;
            java.lang.String r0 = "FeedRequestCallback.onMediaFeedRequestSuccess"
            X.0lp r18 = X.0lq.A00(r0)
            r12 = r25
            com.instagram.profile.fragment.UserDetailFragment r3 = r12.A00     // Catch:{ all -> 0x02eb }
            com.instagram.common.session.UserSession r4 = r3.A0I     // Catch:{ all -> 0x02eb }
            r2 = 0
            X.0qQ.A0B(r4, r2)     // Catch:{ all -> 0x02eb }
            X.0Tu r6 = X.0Tu.A05     // Catch:{ all -> 0x02eb }
            r0 = 36317951398123202(0x8106fc000e16c2, double:3.030956932600746E-306)
            boolean r11 = X.182.A06(r6, r4, r0)     // Catch:{ all -> 0x02eb }
            com.instagram.common.session.UserSession r4 = r3.A0I     // Catch:{ all -> 0x02eb }
            X.0qQ.A0B(r4, r2)     // Catch:{ all -> 0x02eb }
            r0 = 36323809732668959(0x810c5000012e1f, double:3.034661766957103E-306)
            boolean r0 = X.182.A06(r6, r4, r0)     // Catch:{ all -> 0x02eb }
            if (r0 != 0) goto L_0x0037
            r0 = 36325274316845879(0x810da500063337, double:3.035587975887994E-306)
            boolean r0 = X.182.A06(r6, r4, r0)     // Catch:{ all -> 0x02eb }
            r8 = 0
            if (r0 == 0) goto L_0x0038
        L_0x0037:
            r8 = 1
        L_0x0038:
            boolean r0 = r3.A1x     // Catch:{ all -> 0x02eb }
            r10 = 1
            r4 = r29
            if (r0 == 0) goto L_0x0044
            X.5mA r1 = X.C294265mA.MAIN_GRID     // Catch:{ all -> 0x02eb }
            r0 = 1
            if (r4 == r1) goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x02eb }
            r9 = r26
            r7 = r27
            r5 = r28
            r23 = r30
            if (r11 == 0) goto L_0x006c
            if (r27 == 0) goto L_0x006c
            X.3Ic r0 = r5.A01     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x006c
            java.util.List r0 = r5.A06     // Catch:{ all -> 0x02eb }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x006c
            X.3Ic r1 = r5.A01     // Catch:{ all -> 0x02eb }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)     // Catch:{ all -> 0x02eb }
            com.instagram.profile.fragment.UserDetailFragment.A0J(r9, r1, r4, r3, r0)     // Catch:{ all -> 0x02eb }
            goto L_0x02e7
        L_0x006c:
            if (r8 == 0) goto L_0x008e
            java.lang.Boolean r0 = r5.A03     // Catch:{ all -> 0x02eb }
            if (r0 != 0) goto L_0x0076
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x02eb }
        L_0x0076:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x008e
            X.Dda r1 = r3.A1B     // Catch:{ all -> 0x02eb }
            java.lang.String r0 = "profile_shell_response_received"
            r1.A0E(r0)     // Catch:{ all -> 0x02eb }
            X.3Ic r1 = r5.A01     // Catch:{ all -> 0x02eb }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)     // Catch:{ all -> 0x02eb }
            com.instagram.profile.fragment.UserDetailFragment.A0J(r9, r1, r4, r3, r0)     // Catch:{ all -> 0x02eb }
            goto L_0x02e7
        L_0x008e:
            java.lang.Boolean r0 = r5.A03     // Catch:{ all -> 0x02eb }
            if (r0 != 0) goto L_0x0096
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x02eb }
        L_0x0096:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02eb }
            if (r0 != 0) goto L_0x00a3
            X.Dda r1 = r3.A1B     // Catch:{ all -> 0x02eb }
            java.lang.String r0 = "profile_initial_data_received"
            r1.A0E(r0)     // Catch:{ all -> 0x02eb }
        L_0x00a3:
            r24 = r31
            if (r30 == 0) goto L_0x016b
            long r0 = r5.mServerElapsedTime     // Catch:{ all -> 0x02eb }
            r15 = 0
            int r8 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r8 < 0) goto L_0x00bb
            X.Dda r8 = r3.A1B     // Catch:{ all -> 0x02eb }
            X.34p r8 = r8.A00     // Catch:{ all -> 0x02eb }
            java.lang.String r13 = "profile_ig_server_request_elapsed_time_ms"
            X.3p5 r11 = r8.A01     // Catch:{ all -> 0x02eb }
            float r8 = (float) r0     // Catch:{ all -> 0x02eb }
            r11.A0F(r13, r8)     // Catch:{ all -> 0x02eb }
        L_0x00bb:
            boolean r0 = r5.CPt()     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x00f0
            java.lang.String r11 = "cache"
        L_0x00c3:
            X.Dda r0 = r3.A1B     // Catch:{ all -> 0x02eb }
            r0.A02 = r11     // Catch:{ all -> 0x02eb }
            X.34p r0 = r0.A00     // Catch:{ all -> 0x02eb }
            r0.A05()     // Catch:{ all -> 0x02eb }
            X.ToN r0 = r3.A1C     // Catch:{ all -> 0x02eb }
            r8 = 18284548(0x1170004, float:2.773433E-38)
            java.util.Map r1 = r0.A00     // Catch:{ all -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x02eb }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x02eb }
            X.XEQ r0 = (X.XEQ) r0     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x00ed
            X.02m r1 = X.02m.A0p     // Catch:{ all -> 0x02eb }
            java.lang.String r0 = "content_source"
            r1.markerAnnotate(r8, r0, r11)     // Catch:{ all -> 0x02eb }
            X.02m r1 = X.02m.A0p     // Catch:{ all -> 0x02eb }
            java.lang.String r0 = "DATA_LOAD_END"
            r1.markerPoint(r8, r0)     // Catch:{ all -> 0x02eb }
        L_0x00ed:
            X.6uS r13 = r3.A1A     // Catch:{ all -> 0x02eb }
            goto L_0x00f3
        L_0x00f0:
            java.lang.String r11 = "network"
            goto L_0x00c3
        L_0x00f3:
            if (r13 == 0) goto L_0x0111
            java.util.List r0 = r5.A06     // Catch:{ all -> 0x02eb }
            if (r0 != 0) goto L_0x00fb
            r11 = 0
            goto L_0x00ff
        L_0x00fb:
            int r11 = r0.size()     // Catch:{ all -> 0x02eb }
        L_0x00ff:
            int r1 = r13.A00     // Catch:{ all -> 0x02eb }
            if (r1 == 0) goto L_0x0111
            X.02m r8 = r13.A01     // Catch:{ all -> 0x02eb }
            java.lang.String r0 = "fetch_size"
            r8.markerAnnotate(r1, r0, r11)     // Catch:{ all -> 0x02eb }
            int r1 = r13.A00     // Catch:{ all -> 0x02eb }
            java.lang.String r0 = "data_fetch_end"
            r8.markerPoint(r1, r0)     // Catch:{ all -> 0x02eb }
        L_0x0111:
            if (r31 == 0) goto L_0x0134
            boolean r0 = r5.CPt()     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x0134
            com.instagram.common.session.UserSession r8 = r3.A0I     // Catch:{ all -> 0x02eb }
            X.0qQ.A0B(r8, r2)     // Catch:{ all -> 0x02eb }
            r0 = 36609626921441149(0x8210430003177d, double:3.2154137080300775E-306)
            long r13 = X.182.A01(r6, r8, r0)     // Catch:{ all -> 0x02eb }
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0134
            android.content.Context r8 = r3.getContext()     // Catch:{ all -> 0x02eb }
            long r0 = r5.A00     // Catch:{ all -> 0x02eb }
            X.FEJ.A01(r8, r0)     // Catch:{ all -> 0x02eb }
        L_0x0134:
            if (r27 == 0) goto L_0x015b
            java.lang.Object r0 = r7.A00     // Catch:{ all -> 0x02eb }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x0143
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02eb }
            r1 = 1
            if (r0 == 0) goto L_0x0144
        L_0x0143:
            r1 = 0
        L_0x0144:
            boolean r0 = r7.A01     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x016b
            if (r1 == 0) goto L_0x016b
            com.instagram.profile.fragment.UserDetailTabController r0 = r3.A0z     // Catch:{ all -> 0x02eb }
            r0.A0N(r4)     // Catch:{ all -> 0x02eb }
            boolean r0 = r17.booleanValue()     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x016b
            com.instagram.profile.fragment.UserDetailTabController r0 = r3.A0z     // Catch:{ all -> 0x02eb }
            r0.A0O(r4)     // Catch:{ all -> 0x02eb }
            goto L_0x016b
        L_0x015b:
            com.instagram.profile.fragment.UserDetailTabController r0 = r3.A0z     // Catch:{ all -> 0x02eb }
            r0.A0N(r4)     // Catch:{ all -> 0x02eb }
            boolean r0 = r17.booleanValue()     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x016b
            com.instagram.profile.fragment.UserDetailTabController r0 = r3.A0z     // Catch:{ all -> 0x02eb }
            r0.A0O(r4)     // Catch:{ all -> 0x02eb }
        L_0x016b:
            boolean r14 = r17.booleanValue()     // Catch:{ all -> 0x02eb }
            if (r14 == 0) goto L_0x0196
            java.util.List r0 = r5.A03     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x0196
            java.util.stream.Stream r1 = r0.stream()     // Catch:{ all -> 0x02eb }
            X.Wqn r0 = new X.Wqn     // Catch:{ all -> 0x02eb }
            r0.<init>()     // Catch:{ all -> 0x02eb }
            java.util.stream.Stream r1 = r1.filter(r0)     // Catch:{ all -> 0x02eb }
            X.Wqj r0 = new X.Wqj     // Catch:{ all -> 0x02eb }
            r0.<init>()     // Catch:{ all -> 0x02eb }
            java.util.stream.Stream r1 = r1.map(r0)     // Catch:{ all -> 0x02eb }
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()     // Catch:{ all -> 0x02eb }
            java.lang.Object r11 = r1.collect(r0)     // Catch:{ all -> 0x02eb }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x02eb }
            goto L_0x0198
        L_0x0196:
            java.util.List r11 = r5.A06     // Catch:{ all -> 0x02eb }
        L_0x0198:
            if (r11 != 0) goto L_0x01a6
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x02eb }
            r11.<init>()     // Catch:{ all -> 0x02eb }
            java.lang.String r1 = "UserDetailFragment_Feed"
            java.lang.String r0 = "Server returned empty feed response"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x02eb }
        L_0x01a6:
            if (r30 == 0) goto L_0x0207
            com.instagram.common.session.UserSession r7 = r3.A0I     // Catch:{ all -> 0x02eb }
            X.0qQ.A0B(r7, r2)     // Catch:{ all -> 0x02eb }
            r0 = 36606212423816551(0x820d2800181567, double:3.2132543659832034E-306)
            long r7 = X.182.A01(r6, r7, r0)     // Catch:{ all -> 0x02eb }
            int r13 = (int) r7     // Catch:{ all -> 0x02eb }
            if (r13 <= 0) goto L_0x0207
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x02eb }
            r7.<init>()     // Catch:{ all -> 0x02eb }
            com.instagram.common.session.UserSession r8 = r3.A0I     // Catch:{ all -> 0x02eb }
            X.0qQ.A0B(r8, r2)     // Catch:{ all -> 0x02eb }
            long r0 = X.182.A01(r6, r8, r0)     // Catch:{ all -> 0x02eb }
            int r6 = (int) r0     // Catch:{ all -> 0x02eb }
            int r0 = r11.size()     // Catch:{ all -> 0x02eb }
            int r1 = java.lang.Math.min(r6, r0)     // Catch:{ all -> 0x02eb }
            java.util.List r0 = r11.subList(r2, r1)     // Catch:{ all -> 0x02eb }
            r7.addAll(r0)     // Catch:{ all -> 0x02eb }
            int r0 = r11.size()     // Catch:{ all -> 0x02eb }
            if (r0 <= r1) goto L_0x01fd
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x02eb }
            r2.<init>()     // Catch:{ all -> 0x02eb }
            int r0 = r11.size()     // Catch:{ all -> 0x02eb }
            java.util.List r0 = r11.subList(r1, r0)     // Catch:{ all -> 0x02eb }
            r2.addAll(r0)     // Catch:{ all -> 0x02eb }
            X.UpK r1 = new X.UpK     // Catch:{ all -> 0x02eb }
            r1.<init>(r9, r4, r12, r2)     // Catch:{ all -> 0x02eb }
            r1.A00 = r10     // Catch:{ all -> 0x02eb }
            X.Dda r0 = r3.A1B     // Catch:{ all -> 0x02eb }
            X.DfU r0 = r0.A09     // Catch:{ all -> 0x02eb }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x02eb }
            r0.add(r1)     // Catch:{ all -> 0x02eb }
        L_0x01fd:
            X.6vR r0 = r3.A0i     // Catch:{ all -> 0x02eb }
            X.34p r0 = r0.A08     // Catch:{ all -> 0x02eb }
            java.lang.Integer r1 = r0.A00     // Catch:{ all -> 0x02eb }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x02eb }
            if (r1 != r0) goto L_0x0208
        L_0x0207:
            r7 = r11
        L_0x0208:
            if (r14 == 0) goto L_0x02dc
            java.util.List r1 = r5.A03     // Catch:{ all -> 0x02eb }
            if (r1 == 0) goto L_0x0299
            com.instagram.profile.fragment.UserDetailTabController r0 = r3.A0z     // Catch:{ all -> 0x02eb }
            if (r0 != 0) goto L_0x022a
            X.02m r2 = X.02m.A0p     // Catch:{ all -> 0x02eb }
            r1 = 224338334(0xd5f219e, float:6.8757646E-31)
            java.lang.String r0 = "update_grid_media"
            com.facebook.quicklog.EventBuilder r2 = r2.markEventBuilder(r1, r0)     // Catch:{ all -> 0x02eb }
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "adapter is null"
            com.facebook.quicklog.EventBuilder r0 = r2.annotate(r1, r0)     // Catch:{ all -> 0x02eb }
            r0.report()     // Catch:{ all -> 0x02eb }
            goto L_0x02e7
        L_0x022a:
            java.util.stream.Stream r1 = r1.stream()     // Catch:{ all -> 0x02eb }
            X.Wqk r0 = new X.Wqk     // Catch:{ all -> 0x02eb }
            r0.<init>(r3)     // Catch:{ all -> 0x02eb }
            java.util.stream.Stream r1 = r1.map(r0)     // Catch:{ all -> 0x02eb }
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()     // Catch:{ all -> 0x02eb }
            java.lang.Object r5 = r1.collect(r0)     // Catch:{ all -> 0x02eb }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x02eb }
            java.util.stream.Stream r1 = r5.stream()     // Catch:{ all -> 0x02eb }
            X.Wql r0 = new X.Wql     // Catch:{ all -> 0x02eb }
            r0.<init>()     // Catch:{ all -> 0x02eb }
            java.util.stream.Stream r1 = r1.filter(r0)     // Catch:{ all -> 0x02eb }
            X.Wqg r0 = new X.Wqg     // Catch:{ all -> 0x02eb }
            r0.<init>()     // Catch:{ all -> 0x02eb }
            java.util.stream.Stream r1 = r1.map(r0)     // Catch:{ all -> 0x02eb }
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()     // Catch:{ all -> 0x02eb }
            java.lang.Object r2 = r1.collect(r0)     // Catch:{ all -> 0x02eb }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x02eb }
            java.util.stream.Stream r1 = r5.stream()     // Catch:{ all -> 0x02eb }
            X.Wqm r0 = new X.Wqm     // Catch:{ all -> 0x02eb }
            r0.<init>()     // Catch:{ all -> 0x02eb }
            java.util.stream.Stream r1 = r1.filter(r0)     // Catch:{ all -> 0x02eb }
            X.Wqi r0 = new X.Wqi     // Catch:{ all -> 0x02eb }
            r0.<init>()     // Catch:{ all -> 0x02eb }
            java.util.stream.Stream r1 = r1.map(r0)     // Catch:{ all -> 0x02eb }
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()     // Catch:{ all -> 0x02eb }
            java.lang.Object r1 = r1.collect(r0)     // Catch:{ all -> 0x02eb }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x02eb }
            com.instagram.profile.fragment.UserDetailTabController r0 = r3.A0z     // Catch:{ all -> 0x02eb }
            r0.A0Q(r4, r5)     // Catch:{ all -> 0x02eb }
            X.Wad r0 = r3.A0q     // Catch:{ all -> 0x02eb }
            X.Vha r0 = r0.A03     // Catch:{ all -> 0x02eb }
            r0.A00(r1)     // Catch:{ all -> 0x02eb }
            r20 = r4
            r21 = r3
            r22 = r2
            r19 = r9
            com.instagram.profile.fragment.UserDetailFragment.A0L(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x02eb }
            goto L_0x02e7
        L_0x0299:
            com.instagram.profile.fragment.UserDetailTabController r0 = r3.A0z     // Catch:{ all -> 0x02eb }
            if (r0 != 0) goto L_0x02b4
            X.02m r2 = X.02m.A0p     // Catch:{ all -> 0x02eb }
            r1 = 224338334(0xd5f219e, float:6.8757646E-31)
            java.lang.String r0 = "update_grid_media"
            com.facebook.quicklog.EventBuilder r2 = r2.markEventBuilder(r1, r0)     // Catch:{ all -> 0x02eb }
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "adapter is null"
            com.facebook.quicklog.EventBuilder r0 = r2.annotate(r1, r0)     // Catch:{ all -> 0x02eb }
            r0.report()     // Catch:{ all -> 0x02eb }
            goto L_0x02e7
        L_0x02b4:
            java.util.stream.Stream r1 = r7.stream()     // Catch:{ all -> 0x02eb }
            X.Wqh r0 = new X.Wqh     // Catch:{ all -> 0x02eb }
            r0.<init>()     // Catch:{ all -> 0x02eb }
            java.util.stream.Stream r1 = r1.map(r0)     // Catch:{ all -> 0x02eb }
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()     // Catch:{ all -> 0x02eb }
            java.lang.Object r1 = r1.collect(r0)     // Catch:{ all -> 0x02eb }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x02eb }
            com.instagram.profile.fragment.UserDetailTabController r0 = r3.A0z     // Catch:{ all -> 0x02eb }
            r0.A0Q(r4, r1)     // Catch:{ all -> 0x02eb }
            r20 = r4
            r21 = r3
            r22 = r7
            r19 = r9
            com.instagram.profile.fragment.UserDetailFragment.A0L(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x02eb }
            goto L_0x02e7
        L_0x02dc:
            r20 = r4
            r21 = r3
            r22 = r7
            r19 = r9
            com.instagram.profile.fragment.UserDetailFragment.A0K(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x02eb }
        L_0x02e7:
            r18.close()
            return
        L_0x02eb:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x02f0 }
            throw r1
        L_0x02f0:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321626uU.DQA(android.content.Context, X.JwK, X.4mz, X.5mA, boolean, boolean):void");
    }
}
