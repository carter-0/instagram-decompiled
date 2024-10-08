package X;

import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;
import com.instagram.common.session.UserSession;
import com.instagram.ui.listview.StickyHeaderListView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;

/* renamed from: X.35p  reason: invalid class name and case insensitive filesystem */
public final class C2369135p implements 27S {
    public final /* synthetic */ AnonymousClass35W A00;

    public C2369135p(AnonymousClass35W r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        if (r0.A09(r1) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean A72(java.lang.Object r7) {
        /*
            r6 = this;
            X.36g r7 = (X.C2370836g) r7
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.35W r0 = r6.A00
            java.lang.ref.WeakReference r5 = r0.A0b
            java.lang.Object r4 = r5.get()
            X.2jx r4 = (X.C227812jx) r4
            r3 = 0
            if (r4 == 0) goto L_0x0048
            com.instagram.user.model.User r2 = r7.A00
            com.instagram.common.session.UserSession r0 = r0.A0T
            X.2f1 r0 = X.AnonymousClass2f1.A00(r0)
            boolean r0 = r0.A0Q(r2)
            if (r0 == 0) goto L_0x0049
            com.instagram.user.model.FollowStatus r1 = r2.A0G()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            if (r1 == r0) goto L_0x0031
            com.instagram.user.model.FollowStatus r1 = r2.A0G()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
            if (r1 != r0) goto L_0x0049
        L_0x0031:
            java.lang.Object r0 = r5.get()
            X.2jx r0 = (X.C227812jx) r0
            if (r0 == 0) goto L_0x0049
            X.2rL r0 = r0.getAdapter()
            X.2rI r0 = (X.AnonymousClass2rI) r0
            if (r0 == 0) goto L_0x0049
            int r0 = r0.B5I()
            if (r0 != 0) goto L_0x0049
        L_0x0047:
            r3 = 1
        L_0x0048:
            return r3
        L_0x0049:
            X.2rL r0 = r4.getAdapter()
            X.2rI r0 = (X.AnonymousClass2rI) r0
            if (r0 == 0) goto L_0x005f
            java.lang.String r1 = r2.getId()
            X.3UH r0 = r0.A05
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0.A09(r1)
            if (r0 != 0) goto L_0x0047
        L_0x005f:
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x0048
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2369135p.A72(java.lang.Object):boolean");
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        boolean z;
        AnonymousClass2rI r0;
        int i;
        C227812jx r02;
        AnonymousClass2rI r03;
        Integer B70;
        ViewParent viewParent;
        int A03 = AnonymousClass0fD.A03(1123299276);
        C2370836g r10 = (C2370836g) obj;
        int A032 = AnonymousClass0fD.A03(-2082659848);
        0qQ.A0B(r10, 0);
        AnonymousClass35W r04 = this.A00;
        WeakReference weakReference = r04.A0b;
        C227802jw r4 = (C227802jw) weakReference.get();
        if (r4 == null) {
            i = 554705679;
        } else {
            User user = r10.A00;
            UserSession userSession = r04.A0T;
            if (!AnonymousClass2f1.A00(userSession).A0Q(user) || !(user.A0G() == FollowStatus.A06 || user.A0G() == FollowStatus.A07)) {
                z = false;
            } else {
                z = true;
            }
            if (!z || (r02 = (C227812jx) weakReference.get()) == null || (r03 = (AnonymousClass2rI) r02.getAdapter()) == null || r03.B5I() != 0) {
                AnonymousClass2rI r05 = (AnonymousClass2rI) r4.getAdapter();
                if (r05 != null) {
                    String id = user.getId();
                    AnonymousClass3UH r06 = r05.A05;
                    if (r06 != null && r06.A09(id)) {
                        AnonymousClass2rI r1 = (AnonymousClass2rI) r4.getAdapter();
                        if (r1 != null) {
                            r1.A0A(-1);
                        }
                    }
                }
                if (r10.A01 && (r0 = (AnonymousClass2rI) r4.getAdapter()) != null) {
                    r0.A0E(user);
                }
            } else {
                AnonymousClass2rI r07 = (AnonymousClass2rI) r4.getAdapter();
                if (r07 != null) {
                    String id2 = user.getId();
                    AnonymousClass3UH r08 = r07.A05;
                    if (r08 == null || !r08.A09(id2)) {
                        r4.A09 = 1FI.A0E;
                    }
                }
                0eE r12 = AnonymousClass0t1.A01;
                if (!(r12.A01(userSession).A03.B70() == null || (B70 = r12.A01(userSession).A03.B70()) == null || B70.intValue() != 3)) {
                    AnonymousClass356 A0E = r4.A0A().A0E();
                    StickyHeaderListView stickyHeaderListView = r4.A0D;
                    if (stickyHeaderListView != null) {
                        AnonymousClass357 r13 = A0E.A00;
                        View view = r13.A02;
                        if (view != null) {
                            viewParent = view.getParent();
                        } else {
                            viewParent = null;
                        }
                        if (!2PP.A00(viewParent, stickyHeaderListView)) {
                            r13.A06(stickyHeaderListView);
                        }
                    }
                    r4.A0A().A0E().A00();
                    r4.A0A().A0E().A00.A05((Animation) null);
                }
            }
            i = -1809761701;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-1155713994, A03);
    }
}
