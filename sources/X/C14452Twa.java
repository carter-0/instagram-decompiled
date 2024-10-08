package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;

/* renamed from: X.Twa  reason: case insensitive filesystem */
public final class C14452Twa {
    public static C15272UZa A01(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        String str9;
        0qQ.A0B(str, 1);
        C15272UZa uZa = new C15272UZa();
        Bundle A00 = A00(str, str2);
        A00.putString("argument_prior_module", str3);
        A00.putString("argument_prior_serp_session_id", str4);
        A00.putString("argument_prior_query_text", str5);
        A00.putString("argument_entity_page_id", str6);
        A00.putBoolean("argument_new_search_session", z);
        A00.putString("serp_source", str7);
        A00.putString("hcm_serp_source", str8);
        if (C253063q9.A02(str2)) {
            str9 = "search_result";
        } else {
            str9 = null;
        }
        A00.putString("HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER", str9);
        uZa.setArguments(A00);
        return uZa;
    }

    public static C15358UbA A02(Keyword keyword, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1O(str, str2);
        0qQ.A0B(keyword, 5);
        C15358UbA ubA = new C15358UbA();
        Bundle A00 = A00(str2, str3);
        A00.putString("argument_prior_serp_keyword_id", str4);
        A00.putString("argument_prior_module", str);
        A00.putString("argument_pinned_media_id", (String) null);
        A00.putParcelable("argument_keyword", keyword);
        ubA.setArguments(A00);
        return ubA;
    }

    public final C14137TqX A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        C14137TqX tqX = new C14137TqX();
        Bundle A00 = A00((String) null, (String) null);
        A00.putString("argument_prior_serp_session_id", (String) null);
        tqX.setArguments(A00);
        return tqX;
    }

    public static Bundle A00(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("argument_search_session_id", str);
        bundle.putString("argument_search_string", str2);
        return bundle;
    }
}
