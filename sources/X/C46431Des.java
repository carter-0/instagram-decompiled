package X;

import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import java.util.List;

/* renamed from: X.Des  reason: case insensitive filesystem */
public final class C46431Des extends C14191TrW {
    public final /* synthetic */ UnifiedFollowFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46431Des(0hq r1, AnonymousClass07V r2, UnifiedFollowFragment unifiedFollowFragment) {
        super(r1, r2);
        this.A00 = unifiedFollowFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        if (r13 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        r2.putAll(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        r5 = new X.C46430Der();
        r5.setArguments(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014d, code lost:
        r0 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014f, code lost:
        if (r0 != null) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0151, code lost:
        r0 = "fragmentSparseArray";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0155, code lost:
        r0.put(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0158, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment A03(int r18) {
        /*
            r17 = this;
            r0 = r17
            com.instagram.user.userlist.fragment.UnifiedFollowFragment r4 = r0.A00
            java.util.List r0 = r4.A0L
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "tabs"
        L_0x000a:
            X.0qQ.A0F(r0)
        L_0x000d:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0012:
            r3 = r18
            java.lang.Object r12 = r0.get(r3)
            X.Df5 r12 = (X.C46443Df5) r12
            r7 = 0
            int r0 = X.DbU.A02(r12, r7)
            r8 = 1
            java.lang.String r6 = "UnifiedFollowFragment.EXTRA_UNIFIED_SOCIAL_CONTEXT_OVERRIDES"
            java.lang.String r9 = "profileUserId"
            r13 = 0
            switch(r0) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x0080;
                case 2: goto L_0x0028;
                case 3: goto L_0x0037;
                case 4: goto L_0x0062;
                case 5: goto L_0x0028;
                case 6: goto L_0x0028;
                case 7: goto L_0x0028;
                case 8: goto L_0x0028;
                case 9: goto L_0x0028;
                case 10: goto L_0x00b2;
                case 11: goto L_0x00b2;
                case 12: goto L_0x00b2;
                case 13: goto L_0x011e;
                case 14: goto L_0x0028;
                case 15: goto L_0x0028;
                case 16: goto L_0x013a;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unrecognized tab: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r12, r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0037:
            java.lang.String r1 = r4.A0H
            if (r1 == 0) goto L_0x00c6
            com.instagram.user.recommended.FollowListData r0 = X.C46451DfE.A00(r12, r1, r13, r7)
            com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig r5 = new com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig
            r5.<init>(r0, r1)
            r5.A02 = r8
            int r0 = r4.A03
            r5.A00 = r0
            X.1YF r2 = X.C46339Dch.A01()
            X.0eM r0 = r4.A0U
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r0 = r4.mArguments
            if (r0 == 0) goto L_0x005c
            android.os.Bundle r13 = r0.getBundle(r6)
        L_0x005c:
            X.E6h r5 = r2.CrH(r13, r1, r5)
            goto L_0x014d
        L_0x0062:
            X.1YF r10 = X.C46339Dch.A01()
            X.0eM r0 = r4.A0U
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r12 = r4.A0H
            if (r12 == 0) goto L_0x00c6
            java.util.ArrayList r2 = r4.A0J
            java.util.HashMap r1 = r4.A0K
            boolean r0 = r4.A0M
            r14 = r2
            r15 = r1
            r16 = r0
            X.E6P r5 = r10.CrG(r11, r12, r13, r14, r15, r16)
            goto L_0x014d
        L_0x0080:
            X.1YF r5 = X.C46339Dch.A01()
            X.0eM r0 = r4.A0U
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r4.A0H
            if (r0 == 0) goto L_0x00c6
            com.instagram.user.recommended.FollowListData r1 = X.C46451DfE.A00(r12, r0, r13, r7)
            android.os.Bundle r0 = r4.mArguments
            if (r0 == 0) goto L_0x009a
            android.os.Bundle r13 = r0.getBundle(r6)
        L_0x009a:
            X.1YE r5 = (X.1YE) r5
            X.0qQ.A0B(r2, r7)
            android.os.Bundle r2 = r5.AM4(r2, r1, r8)
        L_0x00a3:
            if (r13 == 0) goto L_0x00a8
            r2.putAll(r13)
        L_0x00a8:
            X.Der r5 = new X.Der
            r5.<init>()
            r5.setArguments(r2)
            goto L_0x014d
        L_0x00b2:
            X.1YF r2 = X.C46339Dch.A01()
            X.0eM r0 = r4.A0U
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r10 = r4.A0H
            if (r10 == 0) goto L_0x00c6
            java.lang.String r0 = r4.A0I
            if (r0 != 0) goto L_0x00cb
            java.lang.String r9 = "profileUserName"
        L_0x00c6:
            X.0qQ.A0F(r9)
            goto L_0x000d
        L_0x00cb:
            int r9 = r4.A02
            com.instagram.user.recommended.FollowListData r1 = X.C46451DfE.A00(r12, r10, r13, r7)
            android.os.Bundle r0 = r4.mArguments
            if (r0 == 0) goto L_0x00d9
            android.os.Bundle r13 = r0.getBundle(r6)
        L_0x00d9:
            X.1YE r2 = (X.1YE) r2
            X.0qQ.A0B(r11, r7)
            android.os.Bundle r2 = r2.AM4(r11, r1, r8)
            com.instagram.user.model.User r5 = X.DbV.A0j(r11, r10)
            if (r5 == 0) goto L_0x00a3
            r0 = 4000(0xfa0, float:5.605E-42)
            if (r9 < r0) goto L_0x00a3
            boolean r0 = r5.isVerified()
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = r11.A06
            boolean r0 = X.2R8.A07(r0, r10)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "FollowListFragment.FollowerCount"
            r2.putInt(r0, r9)
            java.lang.String r1 = r5.getUsername()
            java.lang.String r0 = "FollowListFragment.Username"
            r2.putString(r0, r1)
            X.16V r1 = r5.A0J()
            X.16V r0 = X.16V.A06
            if (r1 == r0) goto L_0x0118
            X.16V r1 = r5.A0J()
            X.16V r0 = X.16V.A05
            if (r1 != r0) goto L_0x00a3
        L_0x0118:
            java.lang.String r0 = "FollowListFragment.ShowSearchBar"
            r2.putBoolean(r0, r7)
            goto L_0x00a3
        L_0x011e:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            X.0eM r1 = r4.A0U
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            X.DbU.A1D(r2, r0)
            X.FC8.A02()
            r1.getValue()
            X.E7M r5 = new X.E7M
            r5.<init>()
            r5.setArguments(r2)
            goto L_0x014d
        L_0x013a:
            boolean r0 = r4.A0P
            X.E6k r5 = new X.E6k
            r5.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "ARG_SPAM_FOLLOWER_SETTING_ENABLED"
            X.DbZ.A1B(r5, r0, r1)
            X.0qQ.A0A(r5)
        L_0x014d:
            android.util.SparseArray r0 = r4.A04
            if (r0 != 0) goto L_0x0155
            java.lang.String r0 = "fragmentSparseArray"
            goto L_0x000a
        L_0x0155:
            r0.put(r3, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46431Des.A03(int):androidx.fragment.app.Fragment");
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(742573202);
        List list = this.A00.A0L;
        if (list == null) {
            0qQ.A0F("tabs");
            throw AnonymousClass00P.createAndThrow();
        }
        int size = list.size();
        AnonymousClass0fD.A0A(-1282137077, A03);
        return size;
    }
}
