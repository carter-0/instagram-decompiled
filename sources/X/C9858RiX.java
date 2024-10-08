package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.RiX  reason: case insensitive filesystem */
public abstract class C9858RiX {
    public static void A00(FragmentActivity fragmentActivity, 0lg r6, C262944Gp r7, C13680Tep tep, String str, List list, int i) {
        Fragment r4 = new AnonymousClass4DH();
        Bundle A0a = AnonymousClass7TE.A0a();
        DbW.A0w(A0a, r6);
        A0a.putStringArrayList("arg_values", AnonymousClass7TE.A1D(list));
        A0a.putInt("arg_selected_index", i);
        A0a.putBoolean("arg_is_modal", false);
        r4.setArguments(A0a);
        r4.A01 = tep;
        C331127Pr r0 = new C331127Pr(r6);
        r0.A0d = str;
        r0.A0T = r4;
        r0.A0X = r7;
        r0.A00().A02(fragmentActivity, r4);
    }
}
