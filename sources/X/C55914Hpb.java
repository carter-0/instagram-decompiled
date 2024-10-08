package X;

import com.instagram.api.schemas.ClipsTrimmingStrategy;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hpb  reason: case insensitive filesystem */
public final class C55914Hpb {
    public final UserSession A00;

    public C55914Hpb(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final Object A00(ClipsTrimmingStrategy clipsTrimmingStrategy, MusicCanonicalType musicCanonicalType, String str, List list, AnonymousClass4D7 r8, int i) {
        1NY A0M = DbU.A0M(this.A00);
        0qQ.A0B(musicCanonicalType, 2);
        A0M.A04();
        A0M.A02();
        A0M.A0A("api/v1/clips/clips_auto_editing/");
        A0M.A0Q(CEQ.class, C45574Cym.class);
        if (list != null) {
            A0M.A9m("clip_segments", list.toString());
        }
        A0M.A0C("targeting_duration", i);
        A0M.A9m("audio_cluster_id", str);
        A0M.A9m("audio_type", musicCanonicalType.A00);
        1OC A0T = DbT.A0T(A0M, "trimming_strategy", clipsTrimmingStrategy.A00);
        0qQ.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetVideoTrimmingResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetVideoTrimmingResponse>>");
        return A0T.A00(724611380, r8);
    }
}
