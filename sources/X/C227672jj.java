package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2jj  reason: invalid class name and case insensitive filesystem */
public abstract class C227672jj {
    public static void A02(FragmentActivity fragmentActivity, 0hq r3) {
        BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) fragmentActivity;
        2dZ r1 = baseFragmentActivity.A02;
        if (r1 == null) {
            AnonymousClass0eM r0 = baseFragmentActivity.A04;
            if (r0 == null) {
                0qQ.A0F("actionBarServiceProvider");
                throw AnonymousClass00P.createAndThrow();
            }
            r1 = (2dZ) r0.getValue();
        }
        AnonymousClass37C.A00(A00(r3), r1);
    }

    public static Fragment A00(0hq r1) {
        C227682jk A0P = r1.A0P(R.id.layout_container_main);
        if (A0P instanceof C227682jk) {
            return A0P.A02((0sP) null);
        }
        return A0P;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (((X.C262304De) r8).CcT() == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r0 == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(androidx.fragment.app.Fragment r8, androidx.fragment.app.FragmentActivity r9) {
        /*
            r0 = 2131435206(0x7f0b1ec6, float:1.8492248E38)
            r6 = r9
            android.view.View r3 = r9.requireViewById(r0)
            r0 = 2131443919(0x7f0b40cf, float:1.850992E38)
            android.view.View r4 = r9.findViewById(r0)
            r0 = 2131435275(0x7f0b1f0b, float:1.8492388E38)
            android.view.View r5 = r9.findViewById(r0)
            boolean r0 = r8 instanceof X.C262304De
            r1 = 1
            if (r0 == 0) goto L_0x0025
            r0 = r8
            X.4De r0 = (X.C262304De) r0
            boolean r0 = r0.CcT()
            r7 = 1
            if (r0 != 0) goto L_0x0026
        L_0x0025:
            r7 = 0
        L_0x0026:
            boolean r0 = r8 instanceof X.C227292iy
            if (r0 == 0) goto L_0x0033
            X.2iy r8 = (X.C227292iy) r8
            boolean r0 = r8.Cda()
            r8 = 1
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r8 = 0
        L_0x0034:
            X.3GN r2 = new X.3GN
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.C226112fe.A00(r9, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227672jj.A01(androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity):void");
    }

    public static void A03(FragmentActivity fragmentActivity, 0hq r5) {
        int i;
        C227272iw A00 = A00(r5);
        if (A00 != null && A00.mView != null) {
            2dZ AYJ = ((BaseFragmentActivity) fragmentActivity).AYJ();
            if (AYJ != null && ((!(A00 instanceof C227272iw) || !A00.COC()) && AYJ.A0A && (A00 instanceof AnonymousClass4DS))) {
                int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                if (!C227752jr.A01(A00)) {
                    i = AnonymousClass3D4.A00(fragmentActivity);
                    fragmentActivity.requireViewById(R.id.layout_container_main).setPadding(0, i, 0, 0);
                }
            }
            i = 0;
            fragmentActivity.requireViewById(R.id.layout_container_main).setPadding(0, i, 0, 0);
        }
    }

    public static void A04(FragmentActivity fragmentActivity, 0hq r3, UserSession userSession) {
        A02(fragmentActivity, r3);
        A03(fragmentActivity, r3);
        if (2db.A09()) {
            AnonymousClass4DH A00 = A00(r3);
            if (A00 instanceof AnonymousClass4DH) {
                2db.A05(fragmentActivity, A00.getStatusBarType());
            }
        }
        Fragment A002 = A00(r3);
        if (!(A002 == null || A002.mView == null)) {
            A01(A002, fragmentActivity);
        }
        A05(fragmentActivity, r3, userSession);
    }

    public static void A05(FragmentActivity fragmentActivity, 0hq r5, UserSession userSession) {
        C226112fe r0;
        List list;
        Fragment A0P = r5.A0P(R.id.layout_container_main);
        if (A0P != null && A0P.mView != null) {
            View requireViewById = fragmentActivity.requireViewById(R.id.layout_container_center_right_coordinator_layout);
            if (!(true != C226112fe.A09 || (r0 = (C226112fe) C226112fe.A0C.get(fragmentActivity)) == null || (list = r0.A01) == null)) {
                list.clear();
            }
            C226112fe.A00(fragmentActivity, new AnonymousClass3GO(requireViewById, A0P, fragmentActivity, userSession), false);
        }
    }
}
