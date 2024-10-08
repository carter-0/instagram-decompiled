package X;

/* renamed from: X.Hpo  reason: case insensitive filesystem */
public final class C55926Hpo {
    public final /* synthetic */ C52196GIn A00;

    public C55926Hpo(C52196GIn gIn) {
        this.A00 = gIn;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.0r1, java.lang.Object] */
    public final void A00(1Xj r11) {
        C62880wX r9 = C61170le.A00;
        18g A01 = C638918c.A01(r9);
        boolean z = false;
        boolean A1V = AnonymousClass7TF.A1V(r11);
        A01.A0O(A01.A02, "REELS_MOST_RECENT_FLASH_CACHE_LOAD_END");
        18g.A06(A01.A02, "reels_most_recent_flash_cache_load_successful", A1V);
        ? obj = new Object();
        if (r11 != null) {
            C52196GIn gIn = this.A00;
            if (AnonymousClass7TF.A1Y(gIn.A0H.get(C52076GDw.A00(r11)), true)) {
                C267324bN A002 = C52196GIn.A00(gIn, 0sr.A1M(new 1Xj[]{r11}), AnonymousClass7TE.A1C());
                if (!182.A06(0Tu.A05, gIn.A08, 36323427480841372L) || !gIn.A0D.A0A.A0Z()) {
                    11Z.A02(new C57931Iim(A002, gIn, obj));
                } else {
                    return;
                }
            }
        }
        18g A012 = C638918c.A01(r9);
        boolean z2 = obj.A00;
        if (r11 != null) {
            C52196GIn gIn2 = this.A00;
            z = C252253oo.A00(gIn2.A08).A00(gIn2.A04, r11);
        }
        18g.A06(A012.A02, "reels_most_recent_flash_cache_inserted", z2);
        18g.A06(A012.A02, "reels_tab_first_item_media_is_cached", z);
        boolean z3 = obj.A00;
        C52196GIn gIn3 = this.A00;
        if (z3) {
            GLS gls = new GLS(1, gIn3, r11);
            gIn3.A09.B5y(new GKP(gIn3.A06), gls, gIn3.A0A);
            return;
        }
        11Z.A02(new C57783IgO(gIn3));
    }
}
