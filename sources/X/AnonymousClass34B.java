package X;

import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* renamed from: X.34B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass34B implements 1wn {
    public final /* synthetic */ AnonymousClass348 A00;

    public /* synthetic */ AnonymousClass34B(AnonymousClass348 r1) {
        this.A00 = r1;
    }

    public final void onEvent(Object obj) {
        AnonymousClass348 r2 = this.A00;
        C240163Jv r10 = (C240163Jv) obj;
        1Xj r1 = r10.A01;
        Integer num = AnonymousClass05K.A01;
        SearchContext searchContext = new SearchContext();
        1sy r3 = r10.A00;
        AnonymousClass34A r4 = r10.A02;
        if (r4 == null) {
            r4 = r2.A03;
        }
        AnonymousClass348.A00(r1, r2, r3, r4, searchContext, Boolean.valueOf(r10.A03), num, (HashMap) null);
    }
}
