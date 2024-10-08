package X;

import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import java.util.HashMap;

/* renamed from: X.UkE  reason: case insensitive filesystem */
public final class C15890UkE extends C230372pW {
    public final C17909Vi0 A00;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        String str;
        C16740V3x v3x = (C16740V3x) obj;
        C17372VSz vSz = (C17372VSz) obj2;
        AnonymousClass7TG.A1N(v3x, vSz);
        C17909Vi0 vi0 = this.A00;
        String str2 = v3x.A03;
        String str3 = v3x.A04;
        Long l = v3x.A02;
        FiltersLoggingInfo filtersLoggingInfo = v3x.A00;
        int i = vSz.A01;
        int i2 = vSz.A00;
        0Aj A0e = AnonymousClass7TE.A0e(vi0.A01, "instagram_shopping_checker_tile_impression");
        if (A0e.isSampled()) {
            A0e.AAJ("position", C320166rs.A01(i, i2));
            C13988Tno.A1C(A0e, vi0.A02);
            A0e.AAJ("prior_submodule", vi0.A03);
            A0e.AAJ("submodule", str2);
            C51973G9u.A14(A0e, "shopping_session_id", vi0.A04);
            if (str3 != null) {
                C13988Tno.A1A(A0e, str3);
            }
            if (filtersLoggingInfo != null) {
                HashMap hashMap = filtersLoggingInfo.A01;
                if (hashMap != null) {
                    str = (String) hashMap.get("sort_by");
                } else {
                    str = null;
                }
                A0e.AAJ("sort_by", str);
                A0e.A9H("filters", filtersLoggingInfo.A00());
            }
            C14929UFq uFq = vi0.A00;
            if (uFq != null) {
                A0e.AAK(uFq, "feed_item_info");
            }
            if (l != null) {
                C13991Tnr.A14(A0e, l, (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1)));
            }
            A0e.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        String str;
        C16740V3x v3x = (C16740V3x) obj;
        C17372VSz vSz = (C17372VSz) obj2;
        AnonymousClass7TG.A1N(v3x, vSz);
        C17909Vi0 vi0 = this.A00;
        String str2 = v3x.A03;
        String str3 = v3x.A04;
        Long l = v3x.A02;
        FiltersLoggingInfo filtersLoggingInfo = v3x.A00;
        int i = vSz.A01;
        int i2 = vSz.A00;
        0Aj A0e = AnonymousClass7TE.A0e(vi0.A01, "instagram_shopping_checker_tile_sub_impression");
        if (A0e.isSampled()) {
            A0e.AAJ("position", C320166rs.A01(i, i2));
            C13988Tno.A1C(A0e, vi0.A02);
            A0e.AAJ("prior_submodule", vi0.A03);
            A0e.AAJ("submodule", str2);
            C51973G9u.A14(A0e, "shopping_session_id", vi0.A04);
            if (str3 != null) {
                C13988Tno.A1A(A0e, str3);
            }
            if (filtersLoggingInfo != null) {
                HashMap hashMap = filtersLoggingInfo.A01;
                if (hashMap != null) {
                    str = (String) hashMap.get("sort_by");
                } else {
                    str = null;
                }
                A0e.AAJ("sort_by", str);
                A0e.A9H("filters", filtersLoggingInfo.A00());
            }
            C14929UFq uFq = vi0.A00;
            if (uFq != null) {
                A0e.AAK(uFq, "feed_item_info");
            }
            if (l != null) {
                C13991Tnr.A14(A0e, l, (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1)));
            }
            A0e.Cgf();
        }
    }

    public C15890UkE(1Bk r1, C229222n2 r2, C17909Vi0 vi0) {
        super(r1, r2);
        this.A00 = vi0;
    }
}
