package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.NuM  reason: case insensitive filesystem */
public abstract class C69920NuM {
    public static final C68470NJi A00(UserSession userSession, C69319NjK njK, DirectThreadKey directThreadKey, String str, boolean z, boolean z2) {
        DbY.A1S(userSession, str);
        Bundle A0A = DbV.A0A(userSession);
        A0A.putParcelable("param_extra_direct_thread_key", directThreadKey);
        A0A.putString("param_extra_initial_search_term", str);
        A0A.putBoolean("param_extra_use_initial_search_term_if_no_query", z2);
        A0A.putSerializable("param_extra_sticker_tray_entrypoint", njK);
        A0A.putBoolean("param_extra_is_msys_thread", z);
        C68470NJi nJi = new C68470NJi();
        nJi.setArguments(A0A);
        return nJi;
    }
}
