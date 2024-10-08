package X;

import com.instagram.profile.fragment.ProfileMediaTabFragment;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.71L  reason: invalid class name */
public final class AnonymousClass71L implements C229122ms {
    public final /* synthetic */ ProfileMediaTabFragment A00;
    public final /* synthetic */ UserDetailFragment A01;

    public AnonymousClass71L(ProfileMediaTabFragment profileMediaTabFragment, UserDetailFragment userDetailFragment) {
        this.A00 = profileMediaTabFragment;
        this.A01 = userDetailFragment;
    }

    public final boolean CJz() {
        return this.A01.A19(this.A00.A03);
    }

    public final boolean CKB() {
        return this.A01.A1A(this.A00.A03);
    }

    public final boolean CT5() {
        UserDetailFragment userDetailFragment = this.A01;
        C294255m9 r0 = this.A00.A03;
        if (r0 != null) {
            C321646uW r2 = userDetailFragment.A0j;
            C294265mA r1 = r0.A00;
            0qQ.A0B(r1, 0);
            if (!C321646uW.A00(r2, r1).A01()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r4.A1A(r3) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r1 == 0) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CWV() {
        /*
            r8 = this;
            com.instagram.profile.fragment.ProfileMediaTabFragment r3 = r8.A00
            com.instagram.common.session.UserSession r0 = r3.A00
            r6 = 0
            X.0qQ.A0B(r0, r6)
            X.0Tu r7 = X.0Tu.A05
            r1 = 36328216370953304(0x811052001d3c58, double:3.0374485427522307E-306)
            boolean r0 = X.182.A06(r7, r0, r1)
            com.instagram.profile.fragment.UserDetailFragment r4 = r8.A01
            X.5m9 r3 = r3.A03
            if (r0 == 0) goto L_0x0070
            X.Dc6 r0 = r4.A10
            com.instagram.user.model.User r0 = r0.A03
            r5 = 0
            if (r0 == 0) goto L_0x0039
            if (r3 == 0) goto L_0x0039
            com.instagram.common.session.UserSession r0 = r4.A0I
            X.0qQ.A0B(r0, r6)
            boolean r0 = X.182.A06(r7, r0, r1)
            if (r0 == 0) goto L_0x003a
            boolean r0 = r4.A19(r3)
            if (r0 == 0) goto L_0x0070
            boolean r0 = r4.A1A(r3)
            if (r0 != 0) goto L_0x0070
        L_0x0039:
            return r5
        L_0x003a:
            boolean r2 = r4.A1x
            com.instagram.profile.fragment.UserDetailTabController r0 = r4.A0z
            X.5mA r1 = r3.A00
            if (r2 == 0) goto L_0x006b
            X.WZN r0 = r0.A02
            if (r0 == 0) goto L_0x0058
            X.0qQ.A0B(r1, r6)
            X.WZM r0 = X.WZN.A00(r0, r1)
            X.UlV r0 = r0.A07
            java.util.List r0 = r0.A01
            int r1 = r0.size()
        L_0x0055:
            r0 = 0
            if (r1 != 0) goto L_0x0059
        L_0x0058:
            r0 = 1
        L_0x0059:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r4.A1B(r3)
            if (r0 == 0) goto L_0x0069
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x0039
        L_0x0069:
            r5 = 1
            return r5
        L_0x006b:
            int r1 = r0.A08(r1)
            goto L_0x0055
        L_0x0070:
            boolean r5 = r4.A1B(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass71L.CWV():boolean");
    }

    public final void CgO() {
        this.A01.A0v(this.A00.A03);
    }

    public final boolean isLoading() {
        return this.A01.A1B(this.A00.A03);
    }
}
