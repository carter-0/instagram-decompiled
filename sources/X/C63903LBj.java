package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;

/* renamed from: X.LBj  reason: case insensitive filesystem */
public final class C63903LBj {
    public final void A00(FragmentActivity fragmentActivity, UserSession userSession, X76 x76, String str, ArrayList arrayList, boolean z) {
        0qQ.A0B(userSession, 1);
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        A0M.A0A = "PeopleTagSearch";
        Bundle A0a = AnonymousClass7TE.A0a();
        if (arrayList != null) {
            A0a.putParcelableArrayList("peopleTags", arrayList);
        }
        A0a.putBoolean(AnonymousClass000.A00(1802), z);
        A0a.putString(AnonymousClass000.A00(1675), C66579MXk.A00(99));
        A0a.putString(AnonymousClass000.A00(1121), (String) null);
        A0a.putString("for_post_in_group_id", str);
        A0a.putString("media_id", (String) null);
        A0a.putBoolean(AnonymousClass000.A00(1378), true);
        AnonymousClass0Dg.A00(A0a, userSession);
        IgFragmentFactoryImpl.A00();
        C15401Uc7 uc7 = new C15401Uc7();
        uc7.setArguments(A0a);
        0qQ.A0C(uc7, "null cannot be cast to non-null type com.instagram.tagging.search.PeopleTagSearchFragment");
        uc7.A05 = x76;
        A0M.A0B((Bundle) null, uc7);
        A0M.A04();
    }
}
