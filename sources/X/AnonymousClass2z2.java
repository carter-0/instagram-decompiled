package X;

import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2z2  reason: invalid class name */
public final class AnonymousClass2z2 implements C230332pS {
    public static final C235002z3 A08 = new Object();
    public PlaylistContext A00 = new PlaylistContext((String) null);
    public SearchContext A01 = new SearchContext((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final C228182kv A04;
    public final C249763kK A05;
    public final 1Ua A06;
    public final String A07;

    public AnonymousClass2z2(UserSession userSession, AnonymousClass4DU r11, C228182kv r12, C249763kK r13, 1Ua r14, String str) {
        0qQ.A0B(r14, 2);
        this.A03 = r11;
        this.A06 = r14;
        this.A07 = str;
        this.A02 = userSession;
        this.A05 = r13;
        this.A04 = r12;
    }

    public final /* bridge */ /* synthetic */ Object AGb(C254213s7 r31, Object obj, Object obj2, String str) {
        int A022;
        1Xj A1c;
        C53246Gku gku;
        String str2;
        String str3;
        List<InspirationSignalType> BwO;
        InspirationSignalType inspirationSignalType;
        String A2n;
        Long A0n;
        1Xl r3 = (1Xl) obj;
        AnonymousClass3W1 r14 = (AnonymousClass3W1) obj2;
        0qQ.A0B(r3, 0);
        0qQ.A0B(r14, 1);
        C254213s7 r2 = r31;
        0qQ.A0B(r2, 2);
        1Xj BPf = r3.BPf();
        String str4 = this.A07;
        String str5 = str;
        if (0qQ.A0K(str4, "instagram_organic_vpvd_imp")) {
            AnonymousClass4DU r13 = this.A03;
            DSK BOl = BPf.A0C.BOl();
            if (!(BOl == null || (BwO = BOl.BwO()) == null || (inspirationSignalType = (InspirationSignalType) 00k.A0J(BwO)) == null || (A2n = BPf.A2n()) == null || (A0n = 00y.A0n(10, A2n)) == null)) {
                UserSession userSession = this.A02;
                String str6 = inspirationSignalType.A00;
                0qQ.A0B(str6, 3);
                0wc A012 = AnonymousClass0kN.A01(r13, userSession);
                0Aj A002 = A012.A00(A012.A00, "ig_lumen_impression");
                if (A002.isSampled()) {
                    ArrayList arrayList = new ArrayList(0Yv.A1E(BwO, 10));
                    for (InspirationSignalType inspirationSignalType2 : BwO) {
                        0bb r9 = new 0bb();
                        r9.A06("signal", inspirationSignalType2.A00);
                        arrayList.add(r9);
                    }
                    A002.A9F("media_ig_id", A0n);
                    A002.AAJ("signal", str6);
                    A002.AAJ("container_module", r13.getModuleName());
                    A002.AAe("recommendation_info", arrayList);
                    A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                    A002.Cgf();
                }
            }
            1Xj BPf2 = r3.BPf();
            1Ua r1 = this.A06;
            UserSession userSession2 = this.A02;
            Boolean valueOf = Boolean.valueOf(!r1.A02(BPf2.A36(userSession2, false)));
            SearchContext searchContext = this.A01;
            C52365GPl.A00(this.A00, userSession2, BPf2, r13, r14, this.A04, searchContext, this.A05, r2, valueOf, str5);
            return null;
        }
        C235002z3 r21 = A08;
        AnonymousClass4DU r12 = this.A03;
        UserSession userSession3 = this.A02;
        0xI A003 = r21.A00(userSession3, r3, r12, r14, this.A05, r2, str4, str5);
        if (BPf.A5D()) {
            1Xj A1c2 = BPf.A1c(0);
            1Xj A1c3 = BPf.A1c(r14.A03);
            if (!(A1c2 == null || A1c3 == null)) {
                A003.A0C("carousel_cover_media_id", A1c2.getId());
                A003.A0C("carousel_media_id", A1c3.getId());
                A003.A08(Integer.valueOf(BPf.A0o()), "carousel_size");
                A003.A08(Integer.valueOf(A1c3.BR7().A00), "carousel_m_t");
                A003.A08(Integer.valueOf(r14.A03), "carousel_index");
                String BOq = BPf.A0C.BOq();
                if (BOq != null) {
                    A003.A0C("main_feed_carousel_starting_media_id", BOq);
                }
            }
        }
        if (BPf.CcK() && (gku = BPf.A0B) != null) {
            A003.A09("is_multi_ads", true);
            A003.A08(Integer.valueOf(gku.A00), "multi_ads_type");
            A003.A0C("multi_ads_unit_id", gku.A01);
            if (gku.A04) {
                A003.A0C("hscroll_seed_media_id", gku.A03);
                str2 = gku.A02;
                str3 = "hscroll_seed_media_author_igid";
            } else {
                str2 = gku.A03;
                str3 = "hscroll_seed_ad_id";
            }
            A003.A0C(str3, str2);
        }
        if (BPf.CcK() && !BPf.CeS() && (r2.A04 >= 2000 || r2.A05 >= 2000)) {
            A003.A09("is_ad_engaged_view", true);
        }
        1Xj r32 = BPf;
        if (BPf.A5D() && (A1c = BPf.A1c(r14.A03)) != null) {
            r32 = A1c;
        }
        long j = 0;
        if (!r32.CeS() || r32.A1B() <= 0) {
            if (r32.A5p()) {
                if (182.A06(0Tu.A05, userSession3, 36312127421612973L)) {
                    A022 = r14.A02();
                } else {
                    if (r14.A0o()) {
                        j = 100;
                    }
                    A003.A0B("media_loading_progress", Long.valueOf(j));
                }
            }
            A003.A09("client_sub_impression", Boolean.valueOf(!this.A06.A02(BPf.A36(userSession3, false))));
            return A003;
        }
        A022 = (int) ((((double) r14.A05) / ((double) r32.A1B())) * 100.0d);
        A003.A08(Integer.valueOf(A022), "media_loading_progress");
        A003.A09("client_sub_impression", Boolean.valueOf(!this.A06.A02(BPf.A36(userSession3, false))));
        return A003;
    }

    public final /* bridge */ /* synthetic */ 0xI AM0(Object obj) {
        0xI r2 = (0xI) obj;
        0qQ.A0B(r2, 0);
        return r2;
    }
}
