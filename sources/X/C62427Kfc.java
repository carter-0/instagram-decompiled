package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Kfc  reason: case insensitive filesystem */
public final class C62427Kfc extends C51086FoG {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C59555JOb A01;

    public C62427Kfc(Fragment fragment, C59555JOb jOb) {
        this.A00 = fragment;
        this.A01 = jOb;
    }

    public final void De7() {
        C59689JTv.A0D(this.A00.getActivity(), AnonymousClass000.A00(764));
    }

    public final void Do1(String str) {
        AnonymousClass3WA r1;
        if (str != null && str.length() != 0) {
            if ("ig_spam_v3".equals(str)) {
                r1 = AnonymousClass3WA.ORGANIC_REPORT_SPAM;
            } else if ("ig_false_news".equals(str)) {
                r1 = AnonymousClass3WA.ORGANIC_REPORT_FALSE_NEWS;
            } else {
                r1 = AnonymousClass3WA.ORGANIC_REPORT;
            }
            this.A01.DJA(r1);
        }
    }
}
