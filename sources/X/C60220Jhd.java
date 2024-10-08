package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Jhd  reason: case insensitive filesystem */
public final class C60220Jhd extends 2YL {
    public final UserSession A00;
    public final 1Av A01;
    public final M0X A02;
    public final IgLiveExploreRepository A03;
    public final IgLiveBroadcastInfoManager A04;
    public final C313816h4 A05;
    public final C59720JVe A06;
    public final String A07;
    public final C249513ju A08;
    public final AnonymousClass0r6 A09;
    public final 05G A0A;
    public final AnonymousClass0Ud A0B;
    public final boolean A0C;

    public /* synthetic */ C60220Jhd(UserSession userSession, 1Av r6, M0X m0x, IgLiveExploreRepository igLiveExploreRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C313816h4 r10, C59720JVe jVe, boolean z) {
        Integer valueOf;
        Integer valueOf2;
        String A0Z = JTQ.A0Z();
        C51974G9v.A1M(igLiveBroadcastInfoManager, r10, jVe);
        C51969G9p.A1N(r6, 7, A0Z);
        this.A00 = userSession;
        this.A04 = igLiveBroadcastInfoManager;
        this.A05 = r10;
        this.A06 = jVe;
        this.A03 = igLiveExploreRepository;
        this.A02 = m0x;
        this.A01 = r6;
        this.A0C = z;
        this.A07 = A0Z;
        Integer num = null;
        1HR A0o = JTQ.A0o();
        this.A08 = A0o;
        this.A09 = 0u9.A04(A0o);
        if (z) {
            valueOf = null;
            valueOf2 = null;
            num = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        } else {
            valueOf = Integer.valueOf(R.attr.igds_color_primary_background);
            valueOf2 = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        }
        02z A10 = DbS.A10(new C61071Jw9(valueOf, valueOf2, num, z));
        this.A0A = A10;
        this.A0B = 10b.A03(A10);
    }
}
