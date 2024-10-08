package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.api.schemas.PollType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerDirectData;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.clips.model.ClipsSpotlightData;
import com.instagram.clips.model.ClipsTogetherData;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfo;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.model.rixu.RIXUChainingBehaviorDefinition;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.AudioType;
import com.instagram.search.common.analytics.SearchContext;
import java.util.List;

/* renamed from: X.4h3  reason: invalid class name and case insensitive filesystem */
public final class C270634h3 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04 = -1;
    public int A05;
    public 28D A06 = 28D.A5J;
    public AnonymousClass5OC A07;
    public AnonymousClass5OD A08;
    public AnonymousClass5OB A09;
    public ImmutableList A0A;
    public ImmutableList A0B;
    public ClipChainType A0C;
    public IntentAwareAdsInfoIntf A0D;
    public PollType A0E;
    public C270644h4 A0F = C270644h4.A04;
    public ClipsViewerDirectData A0G;
    public ClipsWatchAndBrowseData A0H;
    public ClipsReplyBarData A0I;
    public PlaylistContext A0J;
    public RIXUChainingBehaviorDefinition A0K;
    public AudioOverlayTrack A0L;
    public AudioType A0M;
    public SearchContext A0N;
    public C270394gf A0O;
    public Boolean A0P = true;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y;
    public Long A0Z;
    public Long A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public String A0x;
    public String A0y;
    public String A0z;
    public String A10;
    public String A11;
    public String A12;
    public String A13;
    public String A14;
    public String A15;
    public String A16;
    public String A17;
    public String A18;
    public String A19;
    public String A1A;
    public String A1B;
    public String A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public String A1G;
    public String A1H;
    public String A1I;
    public String A1J;
    public String A1K;
    public 0sP A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public boolean A1Y;
    public boolean A1Z;
    public boolean A1a;
    public boolean A1b;
    public boolean A1c;
    public boolean A1d;
    public boolean A1e;
    public boolean A1f;
    public boolean A1g;
    public boolean A1h;
    public boolean A1i;
    public boolean A1j;
    public boolean A1k;
    public boolean A1l;
    public boolean A1m;
    public boolean A1n;
    public boolean A1o;
    public boolean A1p;
    public boolean A1q;
    public boolean A1r;
    public boolean A1s;
    public boolean A1t;
    public boolean A1u;
    public boolean A1v;
    public boolean A1w;
    public boolean A1x;
    public final ClipsViewerSource A1y;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0067, code lost:
        if (r6 == com.instagram.clips.intf.ClipsViewerSource.A23) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0055, code lost:
        if (r6 == com.instagram.clips.intf.ClipsViewerSource.A23) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C270634h3(com.instagram.clips.intf.ClipsViewerSource r20, com.instagram.common.session.UserSession r21) {
        /*
            r19 = this;
            r5 = 1
            r9 = r21
            X.0qQ.A0B(r9, r5)
            r0 = 2
            r6 = r20
            X.0qQ.A0B(r6, r0)
            r7 = r19
            r7.<init>()
            r7.A1y = r6
            r0 = -1
            r7.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r7.A0P = r0
            X.28D r0 = X.28D.A5J
            r7.A06 = r0
            X.4h4 r0 = X.C270644h4.A04
            r7.A0F = r0
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            r7.A0Q = r4
            r11 = 0
            com.instagram.search.common.analytics.SearchContext r10 = new com.instagram.search.common.analytics.SearchContext
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r7.A0N = r10
            com.instagram.clips.model.metadata.PlaylistContext r0 = new com.instagram.clips.model.metadata.PlaylistContext
            r0.<init>(r11)
            r7.A0J = r0
            X.0Tu r8 = X.0Tu.A05
            r2 = 36314446704282161(0x8103cc00060a31, double:3.0287405501034026E-306)
            boolean r0 = X.182.A06(r8, r9, r2)
            if (r0 == 0) goto L_0x0057
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_TAB
            if (r6 == r0) goto L_0x0057
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.REEL_CLIPS_NETEGO
            r1 = 0
            if (r6 != r0) goto L_0x0058
        L_0x0057:
            r1 = 1
        L_0x0058:
            r7.A1c = r1
            boolean r0 = X.182.A06(r8, r9, r2)
            if (r0 == 0) goto L_0x0069
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_TAB
            if (r6 == r0) goto L_0x0069
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.REEL_CLIPS_NETEGO
            r1 = 1
            if (r6 != r0) goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            r7.A1u = r1
            r7.A1l = r5
            r7.A0S = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270634h3.<init>(com.instagram.clips.intf.ClipsViewerSource, com.instagram.common.session.UserSession):void");
    }

    public final ClipsViewerConfig A00() {
        Integer num;
        String str;
        ClipsViewerSource clipsViewerSource = this.A1y;
        String str2 = this.A1C;
        String str3 = this.A17;
        String str4 = this.A1A;
        String str5 = this.A18;
        int i = this.A04;
        String str6 = this.A0s;
        ImmutableList immutableList = this.A0B;
        String str7 = this.A19;
        boolean z = this.A1W;
        String str8 = this.A16;
        String str9 = this.A1B;
        Boolean bool = this.A0P;
        String str10 = this.A1F;
        int i2 = this.A05;
        String str11 = this.A12;
        String str12 = this.A13;
        String str13 = this.A0f;
        String str14 = this.A0u;
        String str15 = this.A0v;
        AudioType audioType = this.A0M;
        ImmutableList immutableList2 = this.A0A;
        String str16 = this.A1H;
        String str17 = this.A0y;
        PollType pollType = this.A0E;
        AnonymousClass5OB r164 = this.A09;
        String str18 = this.A1J;
        String str19 = this.A0q;
        Integer num2 = this.A0U;
        AnonymousClass5OC r163 = this.A07;
        AnonymousClass5OD r162 = this.A08;
        boolean z2 = this.A1m;
        28D r161 = this.A06;
        String str20 = this.A0p;
        boolean z3 = this.A1c;
        C270644h4 r160 = this.A0F;
        Integer num3 = this.A0Q;
        boolean z4 = this.A1M;
        boolean z5 = this.A1d;
        C270394gf r32 = this.A0O;
        boolean z6 = this.A1Z;
        boolean z7 = this.A1N;
        boolean z8 = this.A1O;
        boolean z9 = this.A1b;
        boolean z10 = this.A1e;
        boolean z11 = this.A1g;
        boolean z12 = this.A1s;
        String str21 = this.A0n;
        String str22 = this.A0o;
        boolean z13 = this.A1Q;
        String str23 = this.A0b;
        String str24 = this.A0c;
        AudioOverlayTrack audioOverlayTrack = this.A0L;
        String str25 = this.A0k;
        String str26 = this.A14;
        String str27 = this.A10;
        String str28 = this.A0z;
        String str29 = this.A0i;
        Integer num4 = this.A0Y;
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A0H;
        String str30 = this.A11;
        SearchContext searchContext = this.A0N;
        ClipsReplyBarData clipsReplyBarData = this.A0I;
        ClipsViewerDirectData clipsViewerDirectData = this.A0G;
        String str31 = this.A1E;
        boolean z14 = this.A1S;
        String str32 = this.A0t;
        String str33 = this.A15;
        PlaylistContext playlistContext = this.A0J;
        String str34 = this.A1D;
        boolean z15 = this.A1u;
        boolean z16 = this.A1w;
        boolean z17 = this.A1x;
        boolean z18 = this.A1v;
        boolean z19 = this.A1P;
        0sP r97 = this.A1L;
        boolean z20 = this.A1Y;
        float f = this.A02;
        float f2 = this.A00;
        float f3 = this.A01;
        float f4 = this.A03;
        String str35 = this.A0w;
        boolean z21 = this.A1T;
        RIXUChainingBehaviorDefinition rIXUChainingBehaviorDefinition = this.A0K;
        boolean z22 = this.A1o;
        boolean z23 = this.A1j;
        boolean z24 = this.A1k;
        String str36 = this.A0e;
        String str37 = this.A0d;
        Integer num5 = this.A0W;
        boolean z25 = this.A1l;
        boolean z26 = this.A1h;
        ClipChainType clipChainType = this.A0C;
        Integer num6 = this.A0S;
        String str38 = this.A0x;
        Integer num7 = this.A0V;
        Long l = this.A0Z;
        String str39 = this.A0j;
        Integer num8 = this.A0R;
        boolean z27 = this.A1t;
        Integer num9 = this.A0X;
        String str40 = this.A0g;
        String str41 = this.A1I;
        String str42 = this.A0h;
        boolean z28 = this.A1U;
        boolean z29 = this.A1a;
        boolean z30 = this.A1X;
        boolean z31 = this.A1R;
        String str43 = this.A1G;
        boolean z32 = this.A1p;
        boolean z33 = this.A1V;
        String str44 = this.A1K;
        IntentAwareAdsInfoIntf intentAwareAdsInfoIntf = this.A0D;
        if (intentAwareAdsInfoIntf != null) {
            num = intentAwareAdsInfoIntf.BUY();
        } else {
            num = null;
        }
        IntentAwareAdsInfoIntf intentAwareAdsInfoIntf2 = this.A0D;
        if (intentAwareAdsInfoIntf2 != null) {
            str = intentAwareAdsInfoIntf2.BUa();
        } else {
            str = null;
        }
        boolean z34 = this.A1i;
        String str45 = this.A0r;
        boolean z35 = this.A1r;
        boolean z36 = this.A1n;
        boolean z37 = this.A1q;
        return new ClipsViewerConfig(r161, r163, r162, r164, immutableList, immutableList2, clipChainType, pollType, r160, clipsViewerDirectData, clipsViewerSource, clipsWatchAndBrowseData, clipsReplyBarData, (ClipsSpotlightData) null, (ClipsTogetherData) null, (ClipsContextualHighlightInfo) null, playlistContext, rIXUChainingBehaviorDefinition, audioOverlayTrack, audioType, searchContext, r32, bool, Boolean.valueOf(z35), num2, num3, num4, num5, num6, num7, num8, (Integer) null, num9, num, this.A0T, l, this.A0a, str2, str3, str4, str5, str6, str7, str8, str9, (String) null, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str26, str27, str28, str29, str30, str25, str31, (String) null, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str, str45, this.A0l, this.A0m, r97, f, f2, f3, f4, i, i2, 5, 0, z, z2, z3, z4, z5, z6, z7, z8, z11, z12, false, z9, z10, false, z13, false, false, false, false, false, false, false, false, false, z14, z21, z15, z16, z17, z18, z19, z20, false, true, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z34, z36, z37, this.A1f);
    }

    public final void A01(ClipsWatchAndBrowseData clipsWatchAndBrowseData) {
        this.A0H = clipsWatchAndBrowseData;
        if (clipsWatchAndBrowseData != null) {
            Integer num = clipsWatchAndBrowseData.A08;
            Integer num2 = AnonymousClass05K.A01;
            boolean z = true;
            boolean z2 = false;
            if (num == num2) {
                z2 = true;
            }
            this.A1u = z2;
            if (clipsWatchAndBrowseData.A09 != num2) {
                z = false;
            }
            this.A1w = z;
        }
    }

    public final void A02(UserSession userSession, AnonymousClass3OA r3, boolean z) {
        String str;
        if (r3 != null) {
            this.A19 = C324666zh.A01(userSession, r3);
            this.A1W = true;
            this.A1X = z;
            this.A17 = r3.A0S;
            this.A1A = r3.A0j;
            List A3e = r3.A0K.A3e();
            if (A3e != null) {
                str = A3e.toString();
            } else {
                str = null;
            }
            this.A18 = str;
        }
    }

    public final void A03(SearchContext searchContext) {
        this.A0N = searchContext;
        this.A14 = searchContext.A05;
        this.A10 = searchContext.A03;
        this.A0z = searchContext.A02;
        this.A0i = searchContext.A01;
        this.A11 = searchContext.A04;
    }
}
