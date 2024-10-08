package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.model.keyword.Keyword;
import com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VoA  reason: case insensitive filesystem */
public abstract class C18243VoA {
    public static final Keyword A00(C296935qt r2) {
        Object obj;
        C298795u2 r1;
        C295795ov r0 = r2.A03;
        if (r0 != null) {
            obj = r0.A0F;
            0qQ.A0A(obj);
        } else {
            obj = null;
        }
        if (!(obj instanceof C298795u2) || (r1 = (C298795u2) obj) == null) {
            return null;
        }
        return r1.A00();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.VVd, java.lang.Object] */
    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, C14005To7 to7, C232682uF r14, 1Xj r15, Keyword keyword, String str, String str2, String str3, String str4, List list, boolean z) {
        ArrayList arrayList;
        String A00 = AnonymousClass000.A00(149);
        C51972G9s.A1B(userSession, r15);
        if (to7 != null) {
            to7.A02(r14.E4k());
        }
        Bundle bundle = new Bundle();
        ? obj = new Object();
        obj.A00 = str3;
        Keyword keyword2 = keyword;
        String str5 = str;
        bundle.putParcelable("contextual_feed_config", new KeywordSerpContextualFeedConfig(new SectionPagination(obj), keyword2, str2, str4, str5));
        C309516Yo r1 = new C309516Yo(fragmentActivity, userSession);
        C46424Del del = new C46424Del(A00);
        del.A06 = AnonymousClass000.A00(2342);
        List list2 = list;
        if (list2 instanceof ArrayList) {
            arrayList = (ArrayList) list2;
        } else {
            arrayList = new ArrayList(list2);
        }
        del.A09(arrayList);
        del.A0F = !z;
        del.A08 = r15.getId();
        del.A01 = bundle;
        del.A07 = keyword2.A04;
        del.A0A = str5;
        if (to7 != null) {
            del.A08(to7);
        }
        Dba.A12(del.A07(), r1);
    }
}
