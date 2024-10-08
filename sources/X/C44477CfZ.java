package X;

import com.instagram.api.schemas.RankingAlgorithm;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CfZ  reason: case insensitive filesystem */
public abstract class C44477CfZ {
    public static C47163Dre parseFromJson(16F r14) {
        String str;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Boolean bool = null;
            String str2 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            ArrayList arrayList2 = null;
            String str3 = null;
            Boolean bool4 = null;
            RankingAlgorithm rankingAlgorithm = null;
            String str4 = null;
            Boolean bool5 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("all_suggestion_ids".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r14, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("auto_dvance".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r14);
                } else if ("byline".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("enable_search_bar".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r14);
                } else if ("friend_center_holdout".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r14);
                } else if ("groups".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            N5K parseFromJson = C44485Cfh.parseFromJson(r14);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (C41845B3m.A1H(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if (C41845B3m.A1V(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r14);
                } else if ("ranking_algorithm".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                    rankingAlgorithm = (RankingAlgorithm) RankingAlgorithm.A01.get(str);
                    if (rankingAlgorithm == null) {
                        rankingAlgorithm = RankingAlgorithm.UNRECOGNIZED;
                    }
                } else if (!"read_from_cache_DO_NOT_RETURN_TO_USER".equals(A17)) {
                    bool5 = C41847B3o.A0z(r14, bool5, A17, "use_compact_row");
                } else if (r14.A11() == 16L.A0G) {
                    str4 = null;
                } else {
                    str4 = r14.A1P();
                }
                r14.A0z();
            }
            return new C47163Dre(rankingAlgorithm, bool, bool2, bool3, bool4, bool5, str2, str3, str4, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
