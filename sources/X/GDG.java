package X;

import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GDG extends C247303g7 {
    public final C270694h9 A00;
    public final JU4 A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final JU5 A04;
    public final SearchContext A05;
    public final AnonymousClass93U A06;
    public final C270394gf A07;
    public final GDF A08;
    public final C55684Hlh A09;
    public final GF2 A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public GDG(C270694h9 r4, UserSession userSession, AnonymousClass4DU r6, JU5 ju5, SearchContext searchContext, AnonymousClass93U r9, C270394gf r10, GDF gdf, C55684Hlh hlh, GF2 gf2, String str, String str2, String str3) {
        boolean A1Z = DbW.A1Z(searchContext);
        this.A02 = userSession;
        this.A03 = r6;
        this.A05 = searchContext;
        this.A06 = r9;
        this.A0A = gf2;
        this.A09 = hlh;
        this.A00 = r4;
        this.A04 = ju5;
        this.A08 = gdf;
        this.A07 = r10;
        this.A0B = str;
        this.A0C = str2;
        this.A0D = str3;
        this.A01 = new JU4((DefaultConstructorMarker) null, (C249513ju) null, A1Z ? 1 : 0);
    }
}
