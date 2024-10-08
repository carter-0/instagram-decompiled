package X;

import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.34C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass34C implements 1wn {
    public final /* synthetic */ AnonymousClass348 A00;

    public /* synthetic */ AnonymousClass34C(AnonymousClass348 r1) {
        this.A00 = r1;
    }

    public final void onEvent(Object obj) {
        AnonymousClass348 r2 = this.A00;
        C240153Ju r10 = (C240153Ju) obj;
        1Xj r1 = r10.A04;
        Integer num = AnonymousClass05K.A00;
        SearchContext searchContext = r10.A02;
        1sy r3 = r10.A00;
        AnonymousClass34A r4 = r10.A01;
        if (r4 == null) {
            r4 = r2.A03;
        }
        AnonymousClass348.A00(r1, r2, r3, r4, searchContext, false, num, r10.A03);
    }
}
