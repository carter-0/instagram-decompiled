package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.NvN  reason: case insensitive filesystem */
public abstract class C69983NvN {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        NKE nke = new NKE();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("arg_prompt_id", str);
        A0a.putString("arg_note_id", str2);
        C331127Pr A0V = DbV.A0V(A0a, nke, userSession);
        A0V.A1R = true;
        A0V.A1K = false;
        A0V.A0U = nke.A0M;
        DbU.A0y(fragmentActivity, nke, A0V);
    }
}
