package X;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: X.Qcs  reason: case insensitive filesystem */
public abstract class C7921Qcs extends QCA {
    public WeakReference A00;

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        super.onAttach(context);
        if (context instanceof C74298PsX) {
            this.A00 = C51965G9l.A0v(context);
        }
    }

    public final void A00(String str, String str2, String str3, String str4, String str5, String str6) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        if (str2 != null) {
            A0a.putString("challenge_id", str2);
        }
        if (str3 != null) {
            A0a.putString("challenge_use_case", str3);
        }
        if (str4 != null) {
            A0a.putString("av_session_id", str4);
        }
        if (str5 != null) {
            A0a.putString("flow_id", str5);
        }
        if (str6 != null) {
            A0a.putString("product_surface", str6);
        }
        setArguments(A0a);
    }
}
