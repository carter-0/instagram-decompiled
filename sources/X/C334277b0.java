package X;

import androidx.fragment.app.Fragment;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7b0  reason: invalid class name and case insensitive filesystem */
public final class C334277b0 {
    public final 2Sd A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public C334277b0(UserSession userSession) {
        C243983aS r0;
        boolean z;
        0qQ.A0B(userSession, 1);
        0Tu r3 = 0Tu.A05;
        this.A01 = 182.A06(r3, userSession, 36318771736156596L);
        boolean A06 = 182.A06(r3, userSession, 36318771736222133L);
        this.A03 = A06;
        if (182.A06(r3, userSession, 36318771736877502L)) {
            r0 = C243983aS.A00;
        } else {
            r0 = 2Sa.defaultInstance.A03;
        }
        this.A00 = r0;
        if (A06 || (!182.A06(r3, userSession, 36318771737401797L) && !182.A06(r3, userSession, 36323393121758334L))) {
            z = false;
        } else {
            z = true;
        }
        this.A02 = z;
    }

    public final void A00(Fragment fragment, LithoView lithoView) {
        AnonymousClass3X8 r0;
        LithoView lithoView2 = lithoView;
        0qQ.A0B(lithoView2, 0);
        2V1 r4 = new 2V1(lithoView2.getContext());
        AnonymousClass3XA r3 = new AnonymousClass3XA();
        AnonymousClass3X7 r8 = null;
        if (this.A03) {
            AnonymousClass07Z A002 = C71362ch.A00(lithoView2);
            if (A002 != null) {
                r0 = new AnonymousClass3X8(A002);
            } else {
                throw new IllegalStateException("Should have lifecycle owner.");
            }
        } else {
            r0 = null;
        }
        AnonymousClass3X6 A022 = ComponentTree.A02(r3, r4, r0);
        2Sa r7 = 2Sa.defaultInstance;
        if (this.A01) {
            r8 = AnonymousClass3X7.A00;
        }
        A022.A06 = 2Sa.A03(r7, r8, this.A00, (Integer) null, (Integer) null, -289, 15, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        ComponentTree A003 = A022.A00();
        if (this.A02) {
            Fragment fragment2 = fragment;
            fragment2.mViewLifecycleOwnerLiveData.A06(fragment2.getViewLifecycleOwner(), new C334287b1(new AnonymousClass9LG(lithoView2, 1)));
        }
        lithoView2.setComponentTree(A003);
    }
}
