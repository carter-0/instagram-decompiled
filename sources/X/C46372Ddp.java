package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Ddp  reason: case insensitive filesystem */
public final class C46372Ddp implements 27S {
    public final /* synthetic */ UserDetailFragment A00;

    public C46372Ddp(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        User user = ((C2370836g) obj).A00;
        String id = user.getId();
        UserDetailFragment userDetailFragment = this.A00;
        if (Dc6.A02(userDetailFragment, id)) {
            return true;
        }
        List list = userDetailFragment.A30.A00;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (Object next : list) {
            if ((next instanceof User) && 0qQ.A0K(user.getId(), ((User) next).getId())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r1.A2A() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        if (r3 != null) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 1763735889(0x69207951, float:1.2125064E25)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.36g r10 = (X.C2370836g) r10
            r0 = 492498350(0x1d5aedae, float:2.8974937E-21)
            int r5 = X.AnonymousClass0fD.A03(r0)
            com.instagram.profile.fragment.UserDetailFragment r4 = r9.A00
            X.Dc6 r0 = r4.A10
            com.instagram.user.model.User r3 = r0.A03
            com.instagram.user.model.User r1 = r10.A00
            java.lang.String r0 = r1.getId()
            boolean r0 = X.Dc6.A02(r4, r0)
            if (r0 == 0) goto L_0x00e1
            if (r3 == 0) goto L_0x00ab
            boolean r0 = r4.A15()
            r7 = 0
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r3.CPV()
            if (r0 != 0) goto L_0x00c0
            X.Dc6 r0 = r4.A10
            com.instagram.user.model.User r1 = r0.A03
            if (r1 == 0) goto L_0x0056
            X.6vt r0 = r4.A13
            X.6vu r8 = r0.A00
            boolean r0 = r4.A1Z
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r1.A29()
            if (r0 == 0) goto L_0x004e
            boolean r1 = r1.A2A()
            r0 = 1
            if (r1 != 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A02(r2, r0)
        L_0x0056:
            boolean r0 = r4.isResumed()
            if (r0 == 0) goto L_0x0069
            X.2dZ r0 = com.instagram.profile.fragment.UserDetailFragment.A00(r4)
            if (r0 == 0) goto L_0x0069
            X.2dZ r0 = com.instagram.profile.fragment.UserDetailFragment.A00(r4)
            r0.A0T()
        L_0x0069:
            boolean r0 = r4.isResumed()
            if (r0 == 0) goto L_0x007e
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x007e
            X.6xm r2 = r4.A17
            android.view.View r1 = r4.mView
            android.content.Context r0 = r4.getContext()
            r2.A01(r0, r1, r7)
        L_0x007e:
            com.instagram.common.session.UserSession r0 = r4.A0I
            X.2f1 r0 = X.AnonymousClass2f1.A00(r0)
            boolean r0 = r0.A0Q(r3)
            if (r0 == 0) goto L_0x00b8
            android.content.Context r0 = r4.getContext()
            boolean r0 = X.C61970qY.A0E(r0)
            if (r0 == 0) goto L_0x00a5
            java.lang.Integer r1 = r3.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x00a5
            com.instagram.profile.fragment.UserDetailTabController r0 = r4.A0z
            X.5m9 r0 = r0.A0B()
            r4.A0w(r0, r7)
        L_0x00a5:
            com.instagram.profile.fragment.UserDetailTabController r1 = r4.A0z
            r0 = 1
            r1.A0S(r3, r0)
        L_0x00ab:
            r0 = -1048863312(0xffffffffc17b9db0, float:-15.725998)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1430711348(0x5546ec34, float:1.36698617E13)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x00b8:
            com.instagram.profile.fragment.UserDetailTabController r0 = r4.A0z
            X.6vu r0 = r0.A0P
            r0.A00()
            goto L_0x00a5
        L_0x00c0:
            java.lang.Integer r1 = r1.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007e
            r0 = 0
            r4.A0f = r0
            r4.A0e = r0
            r0 = 1
            com.instagram.profile.fragment.UserDetailFragment.A01(r4, r0)
            X.6we r0 = r4.A0r
            X.6vI r2 = r0.A07
            X.0sn r1 = X.0sn.A00
            com.instagram.common.session.UserSession r0 = r0.A0A
            r2.Ei9(r1, r7, r0)
            goto L_0x007e
        L_0x00e1:
            if (r3 == 0) goto L_0x00ab
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46372Ddp.onEvent(java.lang.Object):void");
    }
}
