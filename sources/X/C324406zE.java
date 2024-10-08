package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.6zE  reason: invalid class name and case insensitive filesystem */
public final class C324406zE extends 1P0 {
    public final long A00 = System.currentTimeMillis();
    public final C2366634p A01;
    public final C2366634p A02;
    public final boolean A03;
    public final /* synthetic */ UserDetailFragment A04;

    public C324406zE(C2366634p r3, C2366634p r4, UserDetailFragment userDetailFragment, boolean z) {
        this.A04 = userDetailFragment;
        this.A03 = z;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (X.AnonymousClass0t1.A01.A01(r6.A0I).equals(r10.CCd()) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0113, code lost:
        if (r9.equals(r0) == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r0 != null) goto L_0x013b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0149 A[Catch:{ all -> 0x017e, all -> 0x0183 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r22) {
        /*
            r21 = this;
            r3 = r22
            r0 = -436529864(0xffffffffe5fb1538, float:-1.4821318E23)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.6zY r3 = (X.C324576zY) r3
            r0 = -58272294(0xfffffffffc86d5da, float:-5.6008416E36)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.String r0 = "UserReelResponseItemCallback.onSuccess"
            X.0lp r12 = X.0lq.A00(r0)
            r7 = r21
            X.34p r1 = r7.A01     // Catch:{ all -> 0x017e }
            if (r1 == 0) goto L_0x0025
            boolean r0 = r7.A03     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0028
            r1.A02()     // Catch:{ all -> 0x017e }
        L_0x0025:
            X.3Hl r0 = r3.A02     // Catch:{ all -> 0x017e }
            goto L_0x002c
        L_0x0028:
            r1.A05()     // Catch:{ all -> 0x017e }
            goto L_0x0025
        L_0x002c:
            if (r0 != 0) goto L_0x0030
            r5 = 0
            goto L_0x0035
        L_0x0030:
            X.4gL r5 = new X.4gL     // Catch:{ all -> 0x017e }
            r5.<init>(r0)     // Catch:{ all -> 0x017e }
        L_0x0035:
            X.3HX r9 = r3.A03     // Catch:{ all -> 0x017e }
            r3 = 0
            if (r9 != 0) goto L_0x003f
            com.instagram.profile.fragment.UserDetailFragment r6 = r7.A04     // Catch:{ all -> 0x017e }
            r6.A0f = r3     // Catch:{ all -> 0x017e }
            goto L_0x0072
        L_0x003f:
            com.instagram.profile.fragment.UserDetailFragment r6 = r7.A04     // Catch:{ all -> 0x017e }
            com.instagram.common.session.UserSession r0 = r6.A0I     // Catch:{ all -> 0x017e }
            X.1Ns r10 = X.AnonymousClass3P9.A01(r0, r9)     // Catch:{ all -> 0x017e }
            r10.getClass()     // Catch:{ all -> 0x017e }
            com.instagram.common.session.UserSession r0 = r6.A0I     // Catch:{ all -> 0x017e }
            com.instagram.reels.store.ReelStore r8 = X.1OP.A05(r0)     // Catch:{ all -> 0x017e }
            java.lang.Integer r1 = r10.CAm()     // Catch:{ all -> 0x017e }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x017e }
            if (r1 != r0) goto L_0x006b
            com.instagram.common.session.UserSession r1 = r6.A0I     // Catch:{ all -> 0x017e }
            X.0eE r0 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x017e }
            com.instagram.user.model.User r1 = r0.A01(r1)     // Catch:{ all -> 0x017e }
            com.instagram.user.model.User r0 = r10.CCd()     // Catch:{ all -> 0x017e }
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x017e }
            r0 = 1
            if (r1 != 0) goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            com.instagram.model.reels.Reel r0 = r8.A0I(r9, r0)     // Catch:{ all -> 0x017e }
            r6.A0f = r0     // Catch:{ all -> 0x017e }
        L_0x0072:
            if (r5 == 0) goto L_0x007e
            com.instagram.common.session.UserSession r0 = r6.A0I     // Catch:{ all -> 0x017e }
            com.instagram.reels.store.ReelStore r0 = X.1OP.A05(r0)     // Catch:{ all -> 0x017e }
            com.instagram.model.reels.Reel r3 = r0.A0G(r5)     // Catch:{ all -> 0x017e }
        L_0x007e:
            r6.A0e = r3     // Catch:{ all -> 0x017e }
            X.34p r1 = r7.A02     // Catch:{ all -> 0x017e }
            if (r1 == 0) goto L_0x0093
            com.instagram.model.reels.Reel r0 = r6.A0f     // Catch:{ all -> 0x017e }
            if (r0 != 0) goto L_0x008b
            if (r3 != 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            r0 = 0
            r1.A08(r0)     // Catch:{ all -> 0x017e }
            goto L_0x0093
        L_0x0090:
            r1.A03()     // Catch:{ all -> 0x017e }
        L_0x0093:
            r5 = 0
            X.6rP r3 = com.instagram.profile.fragment.UserDetailFragment.A01(r6, r5)     // Catch:{ all -> 0x017e }
            com.instagram.profile.intf.AutoLaunchReelParams r10 = r6.A1D     // Catch:{ all -> 0x017e }
            if (r10 == 0) goto L_0x012f
            java.lang.Integer r9 = r10.A00     // Catch:{ all -> 0x017e }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x017e }
            r1 = 0
            r8 = 1
            if (r9 != r0) goto L_0x00ee
            java.lang.String r11 = r10.A02     // Catch:{ all -> 0x017e }
            boolean r10 = r10.A07     // Catch:{ all -> 0x017e }
            r6.A1D = r1     // Catch:{ all -> 0x017e }
            r9 = 0
            if (r3 == 0) goto L_0x00d1
            if (r11 == 0) goto L_0x00c0
            com.instagram.model.reels.Reel r1 = r3.A00()     // Catch:{ all -> 0x017e }
            com.instagram.common.session.UserSession r0 = r6.A0I     // Catch:{ all -> 0x017e }
            java.util.List r0 = r1.A0O(r0)     // Catch:{ all -> 0x017e }
            java.lang.Integer r0 = X.AnonymousClass32A.A00(r11, r0)     // Catch:{ all -> 0x017e }
            if (r0 != 0) goto L_0x00c0
            r9 = 1
        L_0x00c0:
            com.instagram.common.session.UserSession r0 = r6.A0I     // Catch:{ all -> 0x017e }
            boolean r0 = r3.A05(r0)     // Catch:{ all -> 0x017e }
            if (r0 != 0) goto L_0x00d1
            if (r9 != 0) goto L_0x00d1
            if (r10 == 0) goto L_0x013f
            com.instagram.model.reels.Reel r0 = r3.A00()     // Catch:{ all -> 0x017e }
            goto L_0x013b
        L_0x00d1:
            X.6x7 r0 = r6.A0x     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x00e1
            X.0eM r0 = r0.A0W     // Catch:{ all -> 0x017e }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x017e }
            X.6xE r1 = (X.C323276xE) r1     // Catch:{ all -> 0x017e }
            com.instagram.profile.intf.AutoLaunchReelParams r0 = r6.A1D     // Catch:{ all -> 0x017e }
            r1.A00 = r0     // Catch:{ all -> 0x017e }
        L_0x00e1:
            android.content.Context r9 = r6.getContext()     // Catch:{ all -> 0x017e }
            r1 = 2131974495(0x7f13595f, float:1.9586056E38)
            java.lang.String r0 = "story_push_notification_launch_failure"
            X.C59689JTv.A01(r9, r0, r1, r8)     // Catch:{ all -> 0x017e }
            goto L_0x012f
        L_0x00ee:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x017e }
            if (r9 != r0) goto L_0x012f
            java.lang.String r9 = r10.A01     // Catch:{ all -> 0x017e }
            boolean r10 = r10.A07     // Catch:{ all -> 0x017e }
            r6.A1D = r1     // Catch:{ all -> 0x017e }
            if (r3 == 0) goto L_0x0115
            boolean r0 = r3.A04()     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0115
            if (r9 == 0) goto L_0x012c
            com.instagram.common.session.UserSession r0 = r6.A0I     // Catch:{ all -> 0x017e }
            com.instagram.model.reels.Reel r0 = r3.A01(r0)     // Catch:{ all -> 0x017e }
            X.4gL r0 = r0.A0H     // Catch:{ all -> 0x017e }
            java.lang.String r0 = r0.A0X     // Catch:{ all -> 0x017e }
            r0.getClass()     // Catch:{ all -> 0x017e }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x017e }
            if (r0 != 0) goto L_0x012c
        L_0x0115:
            X.6x7 r0 = r6.A0x     // Catch:{ all -> 0x017e }
            X.0eM r0 = r0.A0W     // Catch:{ all -> 0x017e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x017e }
            X.6xE r0 = (X.C323276xE) r0     // Catch:{ all -> 0x017e }
            r0.A00 = r1     // Catch:{ all -> 0x017e }
            android.content.Context r1 = r6.getContext()     // Catch:{ all -> 0x017e }
            r0 = 2131965278(0x7f13355e, float:1.9567361E38)
            X.C59689JTv.A08(r1, r0, r8)     // Catch:{ all -> 0x017e }
            goto L_0x012f
        L_0x012c:
            if (r10 == 0) goto L_0x013f
            goto L_0x0137
        L_0x012f:
            if (r3 == 0) goto L_0x0132
            goto L_0x0141
        L_0x0132:
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x017e }
            goto L_0x0153
        L_0x0137:
            com.instagram.model.reels.Reel r0 = r6.A0e     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x013f
        L_0x013b:
            r0.A1d = r10     // Catch:{ all -> 0x017e }
            r0.A1q = r8     // Catch:{ all -> 0x017e }
        L_0x013f:
            r3.A00 = r8     // Catch:{ all -> 0x017e }
        L_0x0141:
            com.instagram.common.session.UserSession r0 = r6.A0I     // Catch:{ all -> 0x017e }
            com.instagram.model.reels.Reel r0 = r3.A01(r0)     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0132
            com.instagram.common.session.UserSession r0 = r6.A0I     // Catch:{ all -> 0x017e }
            com.instagram.model.reels.Reel r0 = r3.A01(r0)     // Catch:{ all -> 0x017e }
            java.util.List r3 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x017e }
        L_0x0153:
            X.2pH r13 = r6.A1M     // Catch:{ all -> 0x017e }
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x017e }
            long r0 = r7.A00     // Catch:{ all -> 0x017e }
            long r18 = r18 - r0
            com.instagram.common.session.UserSession r0 = r6.A0I     // Catch:{ all -> 0x017e }
            X.3BN r14 = new X.3BN     // Catch:{ all -> 0x017e }
            r14.<init>(r0, r3)     // Catch:{ all -> 0x017e }
            r15 = 0
            java.lang.Integer r17 = X.AnonymousClass05K.A15     // Catch:{ all -> 0x017e }
            r16 = r15
            r20 = r5
            r13.A03(r14, r15, r16, r17, r18, r20)     // Catch:{ all -> 0x017e }
            r12.close()
            r0 = 102906131(0x6223913, float:3.0510745E-35)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -440630615(0xffffffffe5bc82a9, float:-1.1127689E23)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x017e:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0183 }
            goto L_0x0187
        L_0x0183:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
        L_0x0187:
            r0 = -897981410(0xffffffffca79e41e, float:-4094215.5)
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324406zE.onSuccess(java.lang.Object):void");
    }

    public final void onFail(C268654dm r10) {
        String str;
        User user;
        int A032 = AnonymousClass0fD.A03(-854365253);
        0lp A002 = 0lq.A00("UserReelResponseItemCallback.onFail");
        try {
            C324576zY r0 = (C324576zY) r10.A00();
            if (r0 != null) {
                str = r0.getErrorMessage();
            } else {
                str = null;
            }
            C2366634p r6 = this.A01;
            if (r6 != null) {
                if (!TextUtils.isEmpty(str)) {
                    0qQ.A0B(str, 1);
                    r6.A01.A0J("story_fail_reason", str);
                }
                UserDetailFragment userDetailFragment = this.A04;
                UserSession userSession = userDetailFragment.A0I;
                0qQ.A0B(userSession, 0);
                if (!182.A06(0Tu.A05, userSession, 36325274316976952L) || ((user = userDetailFragment.A10.A03) != null && C324376zB.A02(userDetailFragment.A0I, user) && !"Invalid target user.".equalsIgnoreCase(str))) {
                    r6.A01();
                } else {
                    r6.A05();
                }
            }
            A002.close();
            AnonymousClass0fD.A0A(-520412518, A032);
            return;
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        AnonymousClass0fD.A0A(-569759470, A032);
        throw th;
    }
}
