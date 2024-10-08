package X;

/* renamed from: X.UqX  reason: case insensitive filesystem */
public final class C16208UqX extends C15286UZq {
    public static final String __redex_internal_original_name = "TopSerpGridFragment";
    public final C20911X4c A00 = C19548WbY.A00;
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C13998To0(this, 11));

    public final String getModuleName() {
        return "serp_non_profiled";
    }

    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        if (z) {
            AnonymousClass0eM r4 = this.A0m;
            int i = AnonymousClass7TE.A0q(AnonymousClass7TE.A0l(r4)).getInt("not_personalized_message_on_top_serp_count", 0);
            if (i < 3) {
                C310336ap r1 = new C310336ap();
                r1.A0D = getString(2131968495);
                DbY.A1N(r1);
                AnonymousClass7TG.A1M(1Au.A00(AnonymousClass7TE.A0l(r4)).A01, "not_personalized_message_on_top_serp_count", i + 1);
            }
        }
    }
}
