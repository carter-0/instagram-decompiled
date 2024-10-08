package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nug  reason: case insensitive filesystem */
public abstract class C69940Nug {
    public static final C331157Pu A00(FragmentActivity fragmentActivity, UserSession userSession, C62320sa r14, C62320sa r15) {
        0qQ.A0B(userSession, 0);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        String A16 = AnonymousClass7TE.A16(fragmentActivity, 2131958995);
        C331137Ps r7 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
        r7.A06 = fragmentActivity2.getString(2131954722);
        r7.A05 = new C56800ICx(r14, 43);
        C331147Pt A00 = r7.A00();
        C331137Ps r72 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
        r72.A06 = fragmentActivity2.getString(2131960992);
        r72.A05 = new C56800ICx(r15, 44);
        C331147Pt A002 = r72.A00();
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A17 = true;
        A0W.A0d = A16;
        A0W.A0Q = A00;
        A0W.A07(A002);
        A0W.A0k = false;
        return A0W.A00();
    }
}
