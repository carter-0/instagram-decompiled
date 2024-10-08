package X;

import android.widget.CompoundButton;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.AbstractCollection;

public final class LZJ implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public LZJ(C64986LlP llP, int i) {
        this.A00 = i;
        switch (i) {
            case 26:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                this.A01 = llP;
                return;
            default:
                this.A01 = llP;
                return;
        }
    }

    public static void A00(IgdsListCell igdsListCell, Object obj, int i) {
        igdsListCell.A0D(new LZJ(obj, i));
    }

    public static void A01(Object obj, AbstractCollection abstractCollection, int i, int i2, boolean z) {
        abstractCollection.add(new PR9((CompoundButton.OnCheckedChangeListener) new LZJ(obj, i), i2, z));
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [java.lang.Object, X.2jA] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.07Z, X.E6c, X.0iw] */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x041f, code lost:
        r2.A1Q(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0422, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x043c, code lost:
        X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x043f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x044e, code lost:
        r0 = java.lang.Boolean.valueOf(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0463, code lost:
        r0 = java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0467, code lost:
        r2.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x046a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x046b, code lost:
        r1 = "delegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x046d, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0474, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        if (r1 == X.K78.A01(r2)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        if (X.K78.A01(r2) == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        r3 = com.instagram.api.schemas.MediaKitVisibility.PRIVATE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        r2 = X.DbS.A0H(r2.A0D);
        X.MH3.A00(r2, r3, X.C318116oQ.A00(r2), 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a3, code lost:
        r3 = com.instagram.api.schemas.MediaKitVisibility.PUBLIC;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0151, code lost:
        r3 = X.27p.A01(r3.A03).A09;
        r6 = X.JTO.A0N(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0163, code lost:
        if (X.DbT.A1Y(r6) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0165, code lost:
        r2 = r3.A04;
        r1 = r2.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016d, code lost:
        if (r3.A0J() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016f, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0171, code lost:
        X.JTO.A1V(r6);
        X.JTS.A1F(r6, r3, r5);
        X.JTQ.A1B(r6, r2);
        r6.A0d(r1);
        r6.A0n("clips_share_sheet");
        X.AnonymousClass7TF.A18(r6);
        r6.A0N(X.2AL.A07(r3.A00, r3.A03), "system_info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0190, code lost:
        r6.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0193, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x024b, code lost:
        r2.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x024d, code lost:
        r4.schedule(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0250, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r8, boolean r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            r6 = r9
            switch(r0) {
                case 0: goto L_0x0453;
                case 1: goto L_0x0440;
                case 2: goto L_0x0426;
                case 3: goto L_0x0194;
                case 4: goto L_0x03fc;
                case 5: goto L_0x03e6;
                case 6: goto L_0x03cb;
                case 7: goto L_0x03b8;
                case 8: goto L_0x03a6;
                case 9: goto L_0x0396;
                case 10: goto L_0x013e;
                case 11: goto L_0x00e4;
                case 12: goto L_0x00d0;
                case 13: goto L_0x00bb;
                case 14: goto L_0x00a6;
                case 15: goto L_0x0006;
                case 16: goto L_0x0006;
                case 17: goto L_0x032e;
                case 18: goto L_0x0080;
                case 19: goto L_0x007a;
                case 20: goto L_0x0313;
                case 21: goto L_0x02fb;
                case 22: goto L_0x02d8;
                case 23: goto L_0x02ca;
                case 24: goto L_0x02ac;
                case 25: goto L_0x0012;
                case 26: goto L_0x0299;
                case 27: goto L_0x0279;
                case 28: goto L_0x0267;
                case 29: goto L_0x0254;
                case 30: goto L_0x0215;
                case 31: goto L_0x01ff;
                case 32: goto L_0x01bc;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r1 = r7.A01
            X.0sL r1 = (X.0sL) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1.invoke(r8, r0)
        L_0x0011:
            return
        L_0x0012:
            java.lang.Object r2 = r7.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment r2 = (instagram.features.stories.fragment.ReelMoreOptionsFragment) r2
            r2.A0F = r9
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r2.A03
            X.8CB r1 = new X.8CB
            r1.<init>(r0)
            boolean r0 = r2.A0K
            boolean r0 = X.JTQ.A1O(r0, r9)
            r1.A0F = r0
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r1.A01()
            r2.A03 = r0
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A0B(r2)
            com.instagram.common.session.UserSession r0 = r2.A02
            X.27r r0 = X.27p.A01(r0)
            if (r9 == 0) goto L_0x005a
            X.29R r3 = r0.A09
            X.1Ln r2 = X.JTO.A0N(r3)
            X.4yP r1 = r3.A0J()
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0011
            if (r1 == 0) goto L_0x0011
            X.JTO.A1V(r2)
            java.lang.String r0 = "ADS_MODE_BOOST_STORY_ON"
            X.283 r0 = X.Dbc.A08(r2, r1, r3, r0)
            X.Dbc.A0i(r2, r0)
            r2.Cgf()
            return
        L_0x005a:
            X.29R r2 = r0.A09
            X.1Ln r6 = X.JTO.A0N(r2)
            X.4yP r1 = r2.A0J()
            boolean r0 = X.DbT.A1Y(r6)
            if (r0 == 0) goto L_0x0011
            if (r1 == 0) goto L_0x0011
            X.JTO.A1V(r6)
            java.lang.String r0 = "ADS_MODE_BOOST_STORY_OFF"
            X.283 r0 = X.Dbc.A08(r6, r1, r2, r0)
            X.Dbc.A0i(r6, r0)
            goto L_0x0190
        L_0x007a:
            java.lang.Object r2 = r7.A01
            X.K78 r2 = (X.K78) r2
            r1 = 1
            goto L_0x0085
        L_0x0080:
            java.lang.Object r2 = r7.A01
            X.K78 r2 = (X.K78) r2
            r1 = 0
        L_0x0085:
            boolean r0 = X.K78.A01(r2)
            if (r1 == r0) goto L_0x0011
            boolean r0 = X.K78.A01(r2)
            if (r0 == 0) goto L_0x00a3
            com.instagram.api.schemas.MediaKitVisibility r3 = com.instagram.api.schemas.MediaKitVisibility.PRIVATE
        L_0x0093:
            X.0eM r0 = r2.A0D
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 20
            X.MH3.A00(r2, r3, r1, r0)
            return
        L_0x00a3:
            com.instagram.api.schemas.MediaKitVisibility r3 = com.instagram.api.schemas.MediaKitVisibility.PUBLIC
            goto L_0x0093
        L_0x00a6:
            java.lang.Object r3 = r7.A01
            X.KHW r3 = (X.KHW) r3
            X.0eM r0 = r3.A09
            X.JiG r1 = X.JTT.A0P(r0)
            X.Kh9 r0 = X.C62518Kh9.FAN_CLUB
            r1.A01(r0, r9)
            if (r9 == 0) goto L_0x0011
            java.lang.String r5 = "AUDIENCE_CONTROL_PUBLIC_ACCOUNT_SUBSCRIPTIONS_SELECT"
            goto L_0x0151
        L_0x00bb:
            java.lang.Object r3 = r7.A01
            X.KHW r3 = (X.KHW) r3
            X.0eM r0 = r3.A09
            X.JiG r1 = X.JTT.A0P(r0)
            X.Kh9 r0 = X.C62518Kh9.PUBLIC_ACCOUNT_FOLLOWERS_ONLY
            r1.A01(r0, r9)
            if (r9 == 0) goto L_0x0011
            java.lang.String r5 = "AUDIENCE_CONTROL_PUBLIC_ACCOUNT_FOLLOWERS_SELECT"
            goto L_0x0151
        L_0x00d0:
            java.lang.Object r3 = r7.A01
            X.KHW r3 = (X.KHW) r3
            X.0eM r0 = r3.A09
            X.JiG r1 = X.JTT.A0P(r0)
            X.Kh9 r0 = X.C62518Kh9.PRIVATE_ACCOUNT_FOLLOWERS
            r1.A01(r0, r9)
            if (r9 == 0) goto L_0x0011
            java.lang.String r5 = "AUDIENCE_CONTROL_FOLLOWER_ONLY_SELECT"
            goto L_0x0151
        L_0x00e4:
            java.lang.Object r3 = r7.A01
            X.KHW r3 = (X.KHW) r3
            X.0eM r0 = r3.A09
            X.JiG r1 = X.JTT.A0P(r0)
            X.Kh9 r0 = X.C62518Kh9.CLOSE_FRIENDS
            r1.A01(r0, r9)
            if (r9 == 0) goto L_0x0011
            com.instagram.common.session.UserSession r6 = r3.A03
            X.1Av r1 = X.1Au.A00(r6)
            X.0s0 r0 = r1.A7h
            X.0YZ[] r5 = X.1Av.A8a
            r4 = 184(0xb8, float:2.58E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r1, r0, r5, r4)
            if (r0 != 0) goto L_0x013b
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316087382773694(0x81054a00150fbe, double:3.02977812178793E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x013b
            android.content.Context r2 = r3.getContext()
            X.8ab r1 = X.DbS.A0Y(r2)
            r0 = 2131237707(0x7f081b4b, float:1.8091672E38)
            X.DbU.A16(r2, r1, r0)
            r0 = 2131973525(0x7f135595, float:1.9584088E38)
            r1.A09(r0)
            r0 = 2131973524(0x7f135594, float:1.9584086E38)
            r1.A08(r0)
            X.Dba.A1L(r1)
            X.1Av r2 = X.1Au.A00(r6)
            r1 = 1
            X.0s0 r0 = r2.A7h
            X.AnonymousClass7TF.A1J(r2, r0, r5, r4, r1)
        L_0x013b:
            java.lang.String r5 = "AUDIENCE_CONTROL_CLOSE_FRIENDS_SELECT"
            goto L_0x0151
        L_0x013e:
            java.lang.Object r3 = r7.A01
            X.KHW r3 = (X.KHW) r3
            X.0eM r0 = r3.A09
            X.JiG r1 = X.JTT.A0P(r0)
            X.Kh9 r0 = X.C62518Kh9.EVERYONE
            r1.A01(r0, r9)
            if (r9 == 0) goto L_0x0011
            java.lang.String r5 = "AUDIENCE_CONTROL_EVERYONE_SELECT"
        L_0x0151:
            com.instagram.common.session.UserSession r0 = r3.A03
            X.27r r0 = X.27p.A01(r0)
            java.lang.String r4 = "clips_share_sheet"
            X.29R r3 = r0.A09
            X.1Ln r6 = X.JTO.A0N(r3)
            boolean r0 = X.DbT.A1Y(r6)
            if (r0 == 0) goto L_0x0011
            X.283 r2 = r3.A04
            X.JVj r1 = r2.A0C
            X.4yP r0 = r3.A0J()
            if (r0 == 0) goto L_0x0011
            if (r1 == 0) goto L_0x0011
            X.JTO.A1V(r6)
            X.JTS.A1F(r6, r3, r5)
            X.JTQ.A1B(r6, r2)
            r6.A0d(r1)
            r6.A0n(r4)
            X.AnonymousClass7TF.A18(r6)
            com.instagram.common.session.UserSession r1 = r3.A03
            X.02m r0 = r3.A00
            X.8aX r1 = X.2AL.A07(r0, r1)
            java.lang.String r0 = "system_info"
            r6.A0N(r1, r0)
        L_0x0190:
            r6.Cgf()
            return
        L_0x0194:
            java.lang.Object r0 = r7.A01
            X.Kaf r0 = (X.C62129Kaf) r0
            X.KB6 r4 = r0.A00
            if (r4 == 0) goto L_0x046b
            X.LOx r0 = r4.A0I
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0011
            r4.A06 = r9
            com.instagram.common.session.UserSession r0 = r4.A0O
            X.1Av r3 = X.1Au.A00(r0)
            X.0s0 r2 = r3.A1y
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 99
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r9)
            r0 = 1
            r4.A05 = r0
            X.KB6.A07(r4)
            return
        L_0x01bc:
            java.lang.Object r1 = r7.A01
            X.LlP r1 = (X.C64986LlP) r1
            com.instagram.common.session.UserSession r2 = r1.A0C
            X.1Av r0 = X.1Au.A00(r2)
            boolean r3 = r0.A1i()
            X.1Av r0 = X.1Au.A00(r2)
            r0.A1F(r9)
            X.E6c r4 = r1.A0E
            if (r9 == 0) goto L_0x01fc
            java.lang.String r1 = "1"
        L_0x01d7:
            X.1NY r2 = X.DbU.A0N(r2)
            r0 = 1918(0x77e, float:2.688E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0A(r0)
            r0 = 3913(0xf49, float:5.483E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r2 = X.DbY.A0N(r2, r1, r0)
            r0 = 2
            X.NM1 r1 = new X.NM1
            r1.<init>(r0, r7, r3)
            goto L_0x024b
        L_0x01fc:
            java.lang.String r1 = "0"
            goto L_0x01d7
        L_0x01ff:
            java.lang.Object r0 = r7.A01
            X.LlP r0 = (X.C64986LlP) r0
            X.E6c r4 = r0.A0E
            com.instagram.common.session.UserSession r3 = r0.A0C
            boolean r2 = r0.A07
            r1 = 51
            X.KAf r0 = new X.KAf
            r0.<init>(r7, r1)
            X.1OC r2 = X.AnonymousClass738.A02(r0, r3, r9, r2)
            goto L_0x024d
        L_0x0215:
            java.lang.Object r1 = r7.A01
            X.LlP r1 = (X.C64986LlP) r1
            com.instagram.common.session.UserSession r2 = r1.A0C
            X.1Av r0 = X.1Au.A00(r2)
            r0.A1D(r9)
            X.E6c r4 = r1.A0E
            if (r9 == 0) goto L_0x0251
            java.lang.String r1 = "1"
        L_0x0228:
            X.1NY r2 = X.DbU.A0N(r2)
            r0 = 1918(0x77e, float:2.688E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0A(r0)
            java.lang.String r0 = "allow_story_reshare"
            r2.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2.A0R(r1, r0)
            r0 = 1
            X.1OC r2 = X.DbT.A0U(r2, r0)
            X.NM1 r1 = new X.NM1
            r1.<init>(r0, r7, r9)
        L_0x024b:
            r2.A00 = r1
        L_0x024d:
            r4.schedule(r2)
            return
        L_0x0251:
            java.lang.String r1 = "0"
            goto L_0x0228
        L_0x0254:
            java.lang.Object r0 = r7.A01
            X.LlP r0 = (X.C64986LlP) r0
            X.LEt r1 = r0.A04
            android.content.Context r2 = r0.A09
            X.E6c r4 = r0.A0E
            X.0gy r3 = X.AnonymousClass07i.A00(r4)
            r5 = 0
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x0267:
            java.lang.Object r0 = r7.A01
            X.LlP r0 = (X.C64986LlP) r0
            com.instagram.common.session.UserSession r0 = r0.A0C
            X.1Av r3 = X.1Au.A00(r0)
            X.0s0 r2 = r3.A7n
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 29
            goto L_0x043c
        L_0x0279:
            java.lang.Object r0 = r7.A01
            X.LlP r0 = (X.C64986LlP) r0
            com.instagram.common.session.UserSession r1 = r0.A0C
            X.1Av r0 = X.1Au.A00(r1)
            r0.A1C(r9)
            X.27r r2 = X.27p.A01(r1)
            if (r9 == 0) goto L_0x0296
            r0 = 2357(0x935, float:3.303E-42)
        L_0x028e:
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.JVj r0 = X.C59725JVj.PRE_CAPTURE
            goto L_0x041f
        L_0x0296:
            r0 = 2358(0x936, float:3.304E-42)
            goto L_0x028e
        L_0x0299:
            java.lang.Object r1 = r7.A01
            X.LlP r1 = (X.C64986LlP) r1
            X.PR9 r0 = r1.A05
            r0.getClass()
            r0.A0D = r9
            X.8it r1 = r1.A03
            java.lang.String r0 = "ig_settings"
            r1.A05(r9, r0)
            return
        L_0x02ac:
            java.lang.Object r2 = r7.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment r2 = (instagram.features.stories.fragment.ReelMoreOptionsFragment) r2
            r2.A0E = r9
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r1 = r2.A03
            X.8CB r0 = new X.8CB
            r0.<init>(r1)
            r0.A0E = r9
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r0.A01()
            r2.A03 = r0
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A0B(r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A0C(r2, r0)
            return
        L_0x02ca:
            java.lang.Object r1 = r7.A01
            instagram.features.clips.edit.ClipsEditMetadataController r1 = (instagram.features.clips.edit.ClipsEditMetadataController) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1.A0M = r0
            instagram.features.clips.edit.ClipsEditMetadataController.A0C(r1)
            return
        L_0x02d8:
            java.lang.Object r3 = r7.A01
            X.K4k r3 = (X.C61366K4k) r3
            X.0eM r0 = r3.A01
            java.lang.Object r0 = r0.getValue()
            X.Jiu r0 = (X.C60296Jiu) r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            X.6rJ r1 = r0.A00
            java.lang.String r0 = "IS_STICKER_TRANSLATIONS_TOGGLE_ENABLED"
            r1.A01(r0, r2)
            X.0eM r0 = r3.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = "clips_viewer_self_clips_profile"
            X.C52086GEg.A0e(r3, r1, r0)
            return
        L_0x02fb:
            java.lang.Object r0 = r7.A01
            X.K4k r0 = (X.C61366K4k) r0
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.Jiu r0 = (X.C60296Jiu) r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            X.6rJ r1 = r0.A00
            java.lang.String r0 = "IS_CAPTIONS_TRANSLATIONS_TOGGLE_ENABLED"
            r1.A01(r0, r2)
            return
        L_0x0313:
            java.lang.Object r0 = r7.A01
            X.K4k r0 = (X.C61366K4k) r0
            X.0eM r0 = r0.A01
            java.lang.Object r3 = r0.getValue()
            X.Jiu r3 = (X.C60296Jiu) r3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            X.6rJ r1 = r3.A00
            java.lang.String r0 = "IS_PROMO_VIDEO"
            r1.A01(r0, r2)
            X.C60296Jiu.A01(r3)
            return
        L_0x032e:
            java.lang.String r1 = "analyticsLogger"
            java.lang.String r2 = "SETTINGS"
            java.lang.Object r3 = r7.A01
            X.Kag r3 = (X.C62130Kag) r3
            X.OQg r0 = r3.A00
            if (r9 == 0) goto L_0x037d
            if (r0 == 0) goto L_0x046d
            r0 = 0
            X.C70888OQg.A00(r0, r2)
            X.0qQ.A0A(r8)
            X.8ab r4 = X.DbW.A0U(r3)
            r0 = 2131968743(0x7f1342e7, float:1.957439E38)
            r4.A09(r0)
            r0 = 2131968742(0x7f1342e6, float:1.9574387E38)
            r4.A08(r0)
            r2 = 2131968744(0x7f1342e8, float:1.9574391E38)
            r1 = 8
            X.LUL r0 = new X.LUL
            r0.<init>(r1, r3, r9)
            r4.A0I(r0, r2)
            r1 = 2131968745(0x7f1342e9, float:1.9574393E38)
            r0 = 43
            X.LV0 r0 = X.LV0.A00(r8, r3, r0)
            r4.A0H(r0, r1)
            X.Dba.A1M(r4)
            r1 = 4
            X.LTx r0 = new X.LTx
            r0.<init>(r8, r1)
            r4.A0B(r0)
            X.DbT.A1V(r4)
            return
        L_0x037d:
            if (r0 == 0) goto L_0x046d
            r0 = 1
            X.C70888OQg.A00(r0, r2)
            r2 = 0
            X.630 r1 = r3.A01
            if (r1 != 0) goto L_0x038d
            java.lang.String r1 = "manager"
            goto L_0x046d
        L_0x038d:
            X.Lr3 r0 = new X.Lr3
            r0.<init>(r3, r2)
            r1.A00(r0, r2)
            return
        L_0x0396:
            java.lang.Object r0 = r7.A01
            com.instagram.creation.publishscreen.fragment.clips.ClipsProfileVisibilityFragment r0 = (com.instagram.creation.publishscreen.fragment.clips.ClipsProfileVisibilityFragment) r0
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.Jg5 r0 = (X.C60124Jg5) r0
            X.05G r2 = r0.A00
            goto L_0x044e
        L_0x03a6:
            java.lang.Object r0 = r7.A01
            com.instagram.creation.publishscreen.fragment.clips.ClipsProfileVisibilityFragment r0 = (com.instagram.creation.publishscreen.fragment.clips.ClipsProfileVisibilityFragment) r0
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.Jg5 r0 = (X.C60124Jg5) r0
            r1 = r9 ^ 1
            X.05G r2 = r0.A00
            goto L_0x0463
        L_0x03b8:
            java.lang.Object r2 = r7.A01
            X.K5Y r2 = (X.K5Y) r2
            X.0eM r0 = r2.A0C
            X.27r r1 = X.C51971G9r.A0g(r0)
            X.80P r0 = X.AnonymousClass80P.SHARE_TO_FACEBOOK_ON
            r1.A1X(r0)
            X.K5Y.A01(r2, r9)
            return
        L_0x03cb:
            java.lang.Object r0 = r7.A01
            X.K5Y r0 = (X.K5Y) r0
            X.0eM r2 = r0.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.7wr r0 = X.C347457wq.A00(r0)
            r0.A01(r9)
            X.LT4 r1 = X.LT4.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            r1.A05(r0, r9)
            return
        L_0x03e6:
            java.lang.Object r0 = r7.A01
            X.LlO r0 = (X.C64985LlO) r0
            X.1Av r2 = r0.A05
            X.0xY r1 = X.AnonymousClass7TE.A0p(r2)
            java.lang.String r0 = "quick_capture_open_with_front_camera"
            r1.E5T(r0, r9)
            r1.apply()
            r2.A1c(r9)
            return
        L_0x03fc:
            java.lang.Object r1 = r7.A01
            X.LlO r1 = (X.C64985LlO) r1
            X.1Av r0 = r1.A05
            r0.A1M(r9)
            android.content.Context r2 = r1.A02
            com.instagram.common.session.UserSession r1 = r1.A03
            X.2jA r0 = new X.2jA
            r0.<init>()
            X.2jD r0 = X.AnonymousClass2jC.A00(r2, r1, r0)
            r0.A01()
            X.27r r2 = X.27p.A01(r1)
            if (r9 == 0) goto L_0x0423
            java.lang.String r1 = "ALLOW_ACCESS_TO_DEVICE_CAMERA_ROLL"
        L_0x041d:
            X.JVj r0 = X.C59725JVj.CAMERA_SETTINGS
        L_0x041f:
            r2.A1Q(r0, r1)
            return
        L_0x0423:
            java.lang.String r1 = "DENY_ACCESS_TO_DEVICE_CAMERA_ROLL"
            goto L_0x041d
        L_0x0426:
            java.lang.Object r0 = r7.A01
            X.Kae r0 = (X.C62128Kae) r0
            com.instagram.arlink.fragment.NametagController r0 = r0.A00
            if (r0 == 0) goto L_0x046b
            r0.A03 = r9
            com.instagram.common.session.UserSession r0 = r0.A0D
            X.1Av r3 = X.1Au.A00(r0)
            X.0s0 r2 = r3.A1z
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 100
        L_0x043c:
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r9)
            return
        L_0x0440:
            java.lang.Object r0 = r7.A01
            com.instagram.archive.fragment.HighlightsProfileVisibilityFragment r0 = (com.instagram.archive.fragment.HighlightsProfileVisibilityFragment) r0
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.Jfz r0 = (X.C60118Jfz) r0
            X.05G r2 = r0.A00
        L_0x044e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            goto L_0x0467
        L_0x0453:
            java.lang.Object r0 = r7.A01
            com.instagram.archive.fragment.HighlightsProfileVisibilityFragment r0 = (com.instagram.archive.fragment.HighlightsProfileVisibilityFragment) r0
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.Jfz r0 = (X.C60118Jfz) r0
            r1 = r9 ^ 1
            X.05G r2 = r0.A00
        L_0x0463:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
        L_0x0467:
            r2.Epw(r0)
            return
        L_0x046b:
            java.lang.String r1 = "delegate"
        L_0x046d:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LZJ.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }

    public LZJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
