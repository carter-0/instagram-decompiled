package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.EditMediaInfoFragment;

public final /* synthetic */ class M3E implements Runnable {
    public final /* synthetic */ C61495KAa A00;

    public /* synthetic */ M3E(C61495KAa kAa) {
        this.A00 = kAa;
    }

    public final void run() {
        String[] strArr;
        Integer num;
        String str;
        String str2;
        long j;
        Long A10;
        C61495KAa kAa = this.A00;
        EditMediaInfoFragment editMediaInfoFragment = kAa.A03;
        if (editMediaInfoFragment.isResumed()) {
            if (kAa.A02) {
                C59689JTv.A07(editMediaInfoFragment.requireContext(), 2131962245);
            }
            if (kAa.A01) {
                String str3 = editMediaInfoFragment.A0R;
                if (str3 != null) {
                    strArr = str3.split("_");
                } else {
                    strArr = new String[0];
                }
                1Xj r0 = editMediaInfoFragment.A0I;
                String str4 = null;
                if (r0 == null || r0.A0C.ApT() == null) {
                    num = null;
                } else {
                    num = C49157EqO.A00(editMediaInfoFragment.A0I.A0C.ApT());
                }
                UserSession session = editMediaInfoFragment.getSession();
                int length = strArr.length;
                if (length > 0) {
                    str = strArr[0];
                } else {
                    str = null;
                }
                if (num != null) {
                    str2 = C49158EqP.A00(num);
                } else {
                    str2 = null;
                }
                if (length > 1) {
                    str4 = strArr[1];
                }
                0qQ.A0B(session, 1);
                if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                    j = -1;
                } else {
                    j = A10.longValue();
                }
                if (str2 == null) {
                    str2 = "";
                }
                if (str4 == null) {
                    str4 = "-1";
                }
                C263944Ny A002 = C263944Ny.A00(str4);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01((AnonymousClass0iw) null, session), "instagram_shopping_commerce_media_untagging_interaction");
                if (A0e.isSampled()) {
                    A0e.A9F("ig_media_id", Long.valueOf(j));
                    JTU.A0v(A002, A0e, "show_modal_on_edit", str2);
                }
                FragmentActivity requireActivity = editMediaInfoFragment.requireActivity();
                C358248ab A0X = DbS.A0X(requireActivity);
                A0X.A08(2131956437);
                A0X.A0r(true);
                A0X.A09(2131956439);
                A0X.A0I(new LU1(2), 2131956438);
                A0X.A0H(LV0.A00(kAa, requireActivity, 28), 2131956436);
                LV8.A00(A0X, kAa, 7);
                DbT.A1V(A0X);
                return;
            }
            editMediaInfoFragment.getParentFragmentManager().A13();
        }
    }
}
