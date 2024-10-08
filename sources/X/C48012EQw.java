package X;

import java.util.List;

/* renamed from: X.EQw  reason: case insensitive filesystem */
public final class C48012EQw extends C64185LSs {
    public final String A00;
    public final boolean A01 = true;

    public C48012EQw(String str) {
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48012EQw) {
                C48012EQw eQw = (C48012EQw) obj;
                if (!0qQ.A0K(this.A00, eQw.A00) || this.A01 != eQw.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C66419MQz A05() {
        return C50957Flk.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r3.equals(r0) == false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        switch(r1) {
            case -1684343236: goto L_0x003c;
            case 1444832803: goto L_0x0056;
            case 1985697779: goto L_0x0082;
            case 2010491935: goto L_0x0094;
            default: goto L_0x0037;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        throw X.DbZ.A0Z(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r3.equals(X.C273654mx.A00(39)) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r5 = X.AnonymousClass7TE.A0a();
        r5.putBoolean(X.C273654mx.A00(81), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r3.equals(X.C273654mx.A00(18)) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r2 = X.C62574Ki7.A0L;
        r5 = X.AnonymousClass7TE.A0a();
        r5.putString(X.AnonymousClass000.A00(350), "not_eligible");
        r5.putBoolean(X.AnonymousClass000.A00(183), false);
        r5.putSerializable(com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r3.equals("hallpass_list") == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        r5 = X.AnonymousClass7TE.A0a();
        r5.putBoolean("is_from_share_cut", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        if (r3.equals("follower_list") == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        r5 = X.C46339Dch.A01().AM4(r7, X.C46451DfE.A00(X.C46443Df5.FOLLOWERS, r7.A06, (java.lang.String) null, false), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        X.0qQ.A0A(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        r0 = X.C273654mx.A00(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(com.instagram.common.session.UserSession r7, com.instagram.settings2.core.session.AbstractValueResolverImpl r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            java.lang.String r3 = r6.A00
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x00b2
            X.C49142Eq5.A00()
            r4 = 0
            boolean r2 = X.AnonymousClass7TF.A1U(r4, r7, r3)
            int r1 = r3.hashCode()
            switch(r1) {
                case -1684343236: goto L_0x001f;
                case 1444832803: goto L_0x0022;
                case 1985697779: goto L_0x0029;
                case 2010491935: goto L_0x002c;
                default: goto L_0x0015;
            }
        L_0x0015:
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
        L_0x0019:
            X.Dts r0 = new X.Dts
            r0.<init>(r3, r5)
            return r0
        L_0x001f:
            r0 = 39
            goto L_0x0024
        L_0x0022:
            r0 = 18
        L_0x0024:
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x002e
        L_0x0029:
            java.lang.String r0 = "hallpass_list"
            goto L_0x002e
        L_0x002c:
            java.lang.String r0 = "follower_list"
        L_0x002e:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0015
            switch(r1) {
                case -1684343236: goto L_0x003c;
                case 1444832803: goto L_0x0056;
                case 1985697779: goto L_0x0082;
                case 2010491935: goto L_0x0094;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.IllegalArgumentException r0 = X.DbZ.A0Z(r3)
            throw r0
        L_0x003c:
            r0 = 39
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0037
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            r0 = 81
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5.putBoolean(r0, r2)
            goto L_0x00ad
        L_0x0056:
            r0 = 18
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.Ki7 r2 = X.C62574Ki7.SETTINGS
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "not_eligible"
            r0 = 350(0x15e, float:4.9E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putString(r0, r1)
            r0 = 183(0xb7, float:2.56E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putBoolean(r0, r4)
            java.lang.String r0 = "entry_point"
            r5.putSerializable(r0, r2)
            goto L_0x00ad
        L_0x0082:
            java.lang.String r0 = "hallpass_list"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0037
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "is_from_share_cut"
            r5.putBoolean(r0, r4)
            goto L_0x00ad
        L_0x0094:
            java.lang.String r0 = "follower_list"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.Df5 r2 = X.C46443Df5.FOLLOWERS
            java.lang.String r1 = r7.A06
            r0 = 0
            com.instagram.user.recommended.FollowListData r1 = X.C46451DfE.A00(r2, r1, r0, r4)
            X.1YF r0 = X.C46339Dch.A01()
            android.os.Bundle r5 = r0.AM4(r7, r1, r4)
        L_0x00ad:
            X.0qQ.A0A(r5)
            goto L_0x0019
        L_0x00b2:
            r5 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48012EQw.A07(com.instagram.common.session.UserSession, com.instagram.settings2.core.session.AbstractValueResolverImpl, X.4D7):java.lang.Object");
    }

    public final List A08() {
        return 0sn.A00;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.toString());
        A1A.append(": { ");
        A1A.append(this.A00);
        A1A.append(", hasArgumentFactory: ");
        A1A.append(this.A01);
        return AnonymousClass7TF.A0l(" }", A1A);
    }
}
