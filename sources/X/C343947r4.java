package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7r4  reason: invalid class name and case insensitive filesystem */
public final class C343947r4 extends C343957r5 implements C343967r6 {
    public static final List A01 = Arrays.asList(new String[]{"instagram_media_composition_player", "instagram_reels_postcapture_player", "instagram_stories_postcapture_player", "instagram_stories_reel_memory_share", "instagram_stories_mention_reshare", "instagram_stories_shoutout_share", "instagram_stories_igtv_share", "instagram_stories_reels_reshare", "instagram_stories_photo_credit", "instagram_direct_postcapture_player"});
    public final UserSession A00;

    public final int Ar5(int i) {
        if (i != 1008) {
            return super.Ar5(i);
        }
        if (C340267kz.A00(C60960kU.A00)) {
            return 6000;
        }
        return 3000;
    }

    public final long B4o(int i) {
        UserSession userSession;
        0Tu r2;
        long j;
        if (i == 13) {
            return 40;
        }
        switch (i) {
            case 19:
            case 20:
                return 0;
            case 21:
                userSession = this.A00;
                if (!C362998is.A00(C60960kU.A00, userSession)) {
                    r2 = 0Tu.A05;
                    j = 36593306046825564L;
                    break;
                } else {
                    return 0;
                }
            case 22:
                userSession = this.A00;
                if (!C362998is.A00(C60960kU.A00, userSession)) {
                    r2 = 0Tu.A06;
                    j = 36593306046956637L;
                    break;
                } else {
                    return 0;
                }
            default:
                return super.B4o(i);
        }
        return Long.valueOf(182.A01(r2, userSession, j)).longValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ba, code lost:
        r0 = java.lang.Boolean.valueOf(X.182.A06(r2, r3, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010b, code lost:
        if (((X.C344037rD) r6.A00.Apf(X.C344037rD.A00)).BgN().equals("instagram_note") == false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0211, code lost:
        return java.lang.Boolean.valueOf(X.182.A06(r2, r3, r0)).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x029f, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A00, 36320631456801454L) == false) goto L_0x02a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CTO(int r7) {
        /*
            r6 = this;
            r0 = 112(0x70, float:1.57E-43)
            if (r7 == r0) goto L_0x0050
            r0 = 113(0x71, float:1.58E-43)
            r5 = 0
            if (r7 == r0) goto L_0x02c9
            r2 = 1
            switch(r7) {
                case 65: goto L_0x024a;
                case 66: goto L_0x0225;
                case 67: goto L_0x0238;
                default: goto L_0x000d;
            }
        L_0x000d:
            switch(r7) {
                case 69: goto L_0x01df;
                case 70: goto L_0x0212;
                case 71: goto L_0x01f2;
                case 72: goto L_0x0029;
                default: goto L_0x0010;
            }
        L_0x0010:
            switch(r7) {
                case 77: goto L_0x0142;
                case 78: goto L_0x0029;
                case 79: goto L_0x0029;
                case 80: goto L_0x015a;
                case 81: goto L_0x0165;
                case 82: goto L_0x0170;
                case 83: goto L_0x02c9;
                case 84: goto L_0x017b;
                case 85: goto L_0x002a;
                case 86: goto L_0x01a2;
                case 87: goto L_0x02c9;
                case 109: goto L_0x0186;
                case 135: goto L_0x0029;
                case 137: goto L_0x0029;
                case 138: goto L_0x0199;
                case 165: goto L_0x0135;
                case 166: goto L_0x02c9;
                case 171: goto L_0x01cc;
                case 174: goto L_0x0190;
                default: goto L_0x0013;
            }
        L_0x0013:
            switch(r7) {
                case 89: goto L_0x02c9;
                case 90: goto L_0x0029;
                case 91: goto L_0x02c9;
                case 92: goto L_0x02c9;
                case 93: goto L_0x02c9;
                case 94: goto L_0x0029;
                case 95: goto L_0x0029;
                case 96: goto L_0x02c9;
                default: goto L_0x0016;
            }
        L_0x0016:
            switch(r7) {
                case 98: goto L_0x02c9;
                case 99: goto L_0x02c9;
                case 100: goto L_0x02c9;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r7) {
                case 103: goto L_0x025c;
                case 104: goto L_0x0029;
                case 105: goto L_0x0029;
                case 106: goto L_0x0029;
                case 107: goto L_0x0120;
                default: goto L_0x001c;
            }
        L_0x001c:
            switch(r7) {
                case 115: goto L_0x0029;
                case 116: goto L_0x00c0;
                case 117: goto L_0x00cb;
                case 118: goto L_0x00f7;
                case 119: goto L_0x00d6;
                case 120: goto L_0x00e1;
                case 121: goto L_0x00ec;
                default: goto L_0x001f;
            }
        L_0x001f:
            switch(r7) {
                case 123: goto L_0x009f;
                case 124: goto L_0x00aa;
                case 125: goto L_0x00b5;
                default: goto L_0x0022;
            }
        L_0x0022:
            switch(r7) {
                case 127: goto L_0x005d;
                case 128: goto L_0x0068;
                case 129: goto L_0x0073;
                case 130: goto L_0x007e;
                case 131: goto L_0x0089;
                case 132: goto L_0x0094;
                case 133: goto L_0x01fc;
                default: goto L_0x0025;
            }
        L_0x0025:
            boolean r2 = super.CTO(r7)
        L_0x0029:
            return r2
        L_0x002a:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311182528807376(0x8100d4000101d0, double:3.026676272389369E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x005b
            X.7qt r1 = r6.A00     // Catch:{ RuntimeException -> 0x01dd }
            X.7r3 r0 = X.C344037rD.A00     // Catch:{ RuntimeException -> 0x01dd }
            X.7r1 r0 = r1.Apf(r0)     // Catch:{ RuntimeException -> 0x01dd }
            X.7rD r0 = (X.C344037rD) r0     // Catch:{ RuntimeException -> 0x01dd }
            java.lang.String r1 = r0.BgN()     // Catch:{ RuntimeException -> 0x01dd }
            java.lang.String r0 = "instagram_reels"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01dd }
            if (r0 == 0) goto L_0x01dd
            goto L_0x005b
        L_0x0050:
            android.content.Context r0 = X.C60960kU.A00
            int r1 = X.AnonymousClass0Ke.A00(r0)
            r0 = 2016(0x7e0, float:2.825E-42)
            r2 = 0
            if (r1 < r0) goto L_0x0029
        L_0x005b:
            r2 = 1
            return r2
        L_0x005d:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323616459140409(0x810c2300012d39, double:3.034539539999398E-306)
            goto L_0x0205
        L_0x0068:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323616459074872(0x810c2300002d38, double:3.034539539957952E-306)
            goto L_0x0205
        L_0x0073:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323616459205946(0x810c2300022d3a, double:3.0345395400408436E-306)
            goto L_0x0205
        L_0x007e:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325510539719683(0x810ddc00013403, double:3.035737364184581E-306)
            goto L_0x0205
        L_0x0089:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325510539850756(0x810ddc00033404, double:3.035737364267472E-306)
            goto L_0x0205
        L_0x0094:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315683657027049(0x8104ec00270de9, double:3.0295228040000786E-306)
            goto L_0x0205
        L_0x009f:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322203414833150(0x810ada000027fe, double:3.0336459250896144E-306)
            goto L_0x0205
        L_0x00aa:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329328765583409(0x81115500004031, double:3.038152025595563E-306)
            goto L_0x0205
        L_0x00b5:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329328765648946(0x81115500014032, double:3.0381520256370086E-306)
            goto L_0x0205
        L_0x00c0:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317354397078601(0x81067100051449, double:3.0305793867362103E-306)
            goto L_0x0205
        L_0x00cb:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317354397013064(0x81067100041448, double:3.0305793866947645E-306)
            goto L_0x0205
        L_0x00d6:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316671497474645(0x8105d200081255, double:3.0301475182768526E-306)
            goto L_0x0205
        L_0x00e1:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316671497409108(0x8105d200071254, double:3.030147518235407E-306)
            goto L_0x0205
        L_0x00ec:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321589234509385(0x810a4b00002649, double:3.03325751497976E-306)
            goto L_0x0205
        L_0x00f7:
            X.7qt r1 = r6.A00     // Catch:{ RuntimeException -> 0x010d }
            X.7r3 r0 = X.C344037rD.A00     // Catch:{ RuntimeException -> 0x010d }
            X.7r1 r0 = r1.Apf(r0)     // Catch:{ RuntimeException -> 0x010d }
            X.7rD r0 = (X.C344037rD) r0     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r1 = r0.BgN()     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r0 = "instagram_note"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x010d }
            if (r0 != 0) goto L_0x02c8
        L_0x010d:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317354397340746(0x8106710009144a, double:3.030579386901992E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x02c2
        L_0x0120:
            X.7qt r1 = r6.A00     // Catch:{ RuntimeException -> 0x01dd }
            X.7r3 r0 = X.C344037rD.A00     // Catch:{ RuntimeException -> 0x01dd }
            X.7r1 r0 = r1.Apf(r0)     // Catch:{ RuntimeException -> 0x01dd }
            X.7rD r0 = (X.C344037rD) r0     // Catch:{ RuntimeException -> 0x01dd }
            java.util.List r1 = A01     // Catch:{ RuntimeException -> 0x01dd }
            java.lang.String r0 = r0.BgN()     // Catch:{ RuntimeException -> 0x01dd }
            boolean r2 = r1.contains(r0)     // Catch:{ RuntimeException -> 0x01dd }
            return r2
        L_0x0135:
            X.7qb r0 = X.C343657qa.A02
            java.lang.Object r1 = r6.A06(r0)
            java.lang.String r0 = "instagram_vc"
            boolean r2 = r0.equals(r1)
            return r2
        L_0x0142:
            com.instagram.common.session.UserSession r3 = r6.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r3)
            if (r0 == 0) goto L_0x0151
            boolean r2 = X.XXs.A00(r3)
            return r2
        L_0x0151:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311831070180122(0x81016b0015031a, double:3.02708641256496E-306)
            goto L_0x0205
        L_0x015a:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312483903833217(0x81020300000481, double:3.0274992671959274E-306)
            goto L_0x0205
        L_0x0165:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312483903898754(0x81020300010482, double:3.027499267237373E-306)
            goto L_0x0205
        L_0x0170:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310916240769405(0x8100960000017d, double:3.0265078707619E-306)
            goto L_0x0205
        L_0x017b:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311182528741839(0x8100d4000001cf, double:3.026676272347923E-306)
            goto L_0x0205
        L_0x0186:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315683656961512(0x8104ec00260de8, double:3.029522803958633E-306)
            goto L_0x0205
        L_0x0190:
            X.0tS r0 = X.0tS.A00()
            boolean r2 = r0.A0a()
            return r2
        L_0x0199:
            com.instagram.common.session.UserSession r1 = r6.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r2 = X.C362998is.A00(r0, r1)
            return r2
        L_0x01a2:
            X.0tS r2 = X.0tS.A00()
            X.0s0 r1 = r2.A2i
            X.0YZ[] r3 = X.0tS.A4G
            r0 = 105(0x69, float:1.47E-43)
            r0 = r3[r0]
            java.lang.Object r0 = r1.CDM(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x02c8
            X.0tS r2 = X.0tS.A00()
            X.0s0 r1 = r2.A2j
            r0 = 109(0x6d, float:1.53E-43)
            r0 = r3[r0]
            java.lang.Object r0 = r1.CDM(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x02c2
        L_0x01cc:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = X.C338977ir.A00()
            if (r0 == r1) goto L_0x02c9
            int r1 = r0.intValue()
            r0 = 4
            if (r1 > r0) goto L_0x02c9
            goto L_0x02c8
        L_0x01dd:
            r2 = 0
            return r2
        L_0x01df:
            com.instagram.common.session.UserSession r3 = r6.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r3)
            if (r0 != 0) goto L_0x02c9
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311831069721364(0x81016b000e0314, double:3.0270864122748395E-306)
            goto L_0x02ba
        L_0x01f2:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313922717878589(0x8103520000093d, double:3.02840917899186E-306)
            goto L_0x0205
        L_0x01fc:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315683657092586(0x8104ec00280dea, double:3.0295228040415245E-306)
        L_0x0205:
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r2 = r0.booleanValue()
            return r2
        L_0x0212:
            com.instagram.common.session.UserSession r3 = r6.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r3)
            if (r0 != 0) goto L_0x02c9
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311831069786901(0x81016b000f0315, double:3.0270864123162854E-306)
            goto L_0x02ba
        L_0x0225:
            com.instagram.common.session.UserSession r3 = r6.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r3)
            if (r0 != 0) goto L_0x02c9
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311831070442269(0x81016b0019031d, double:3.027086412730743E-306)
            goto L_0x02ba
        L_0x0238:
            com.instagram.common.session.UserSession r3 = r6.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r3)
            if (r0 != 0) goto L_0x02c9
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311831070507806(0x81016b001a031e, double:3.0270864127721886E-306)
            goto L_0x02ba
        L_0x024a:
            com.instagram.common.session.UserSession r3 = r6.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r3)
            if (r0 != 0) goto L_0x02c9
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311831069917975(0x81016b00110317, double:3.027086412399177E-306)
            goto L_0x02ba
        L_0x025c:
            X.7qt r1 = r6.A00
            X.7r3 r0 = X.C344037rD.A00
            X.7r1 r0 = r1.Apf(r0)
            X.7rD r0 = (X.C344037rD) r0
            java.lang.String r4 = r0.BgN()
            java.lang.String r0 = "instagram_vc"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0292
            java.lang.String r0 = "instagram_live"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0292
            java.lang.String r0 = "live_base"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0292
            java.lang.String r0 = "live_with_guest"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0292
            java.lang.String r0 = "live_with_join_flow"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x02a1
        L_0x0292:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320631456801454(0x81096c000022ae, double:3.032651812500603E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x02c8
        L_0x02a1:
            java.lang.String r0 = "instagram_stories"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02b1
            java.lang.String r0 = "instagram_reels"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x02c9
        L_0x02b1:
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330612960805574(0x811280000042c6, double:3.038964155825099E-306)
        L_0x02ba:
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x02c2:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02c9
        L_0x02c8:
            r5 = 1
        L_0x02c9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343947r4.CTO(int):boolean");
    }

    public C343947r4(C343837qt r2) {
        this.A00 = r2;
        this.A00 = (UserSession) A06(C343677qc.A00);
    }

    @Deprecated
    public C343947r4(UserSession userSession) {
        this.A00 = userSession;
    }
}
