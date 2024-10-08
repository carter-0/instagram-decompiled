package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* renamed from: X.IMg  reason: case insensitive filesystem */
public final class C57040IMg implements C59547JNt {
    public final /* synthetic */ HFZ A00;

    public C57040IMg(HFZ hfz) {
        this.A00 = hfz;
    }

    public final void Djf(boolean z) {
        HFZ hfz = this.A00;
        FragmentActivity fragmentActivity = (FragmentActivity) hfz.A02;
        DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) hfz.A01;
        UserSession userSession = directShareSheetFragment.A0G;
        String str = directShareSheetFragment.A15;
        if (str == null) {
            str = "";
        }
        String str2 = directShareSheetFragment.A0v;
        1Xj r3 = directShareSheetFragment.A0b;
        r3.getClass();
        LTW.A00.A0A(fragmentActivity, userSession, r3, directShareSheetFragment, directShareSheetFragment.A0c, str, str2, z);
    }
}
