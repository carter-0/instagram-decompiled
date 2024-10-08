package X;

import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.MoreInfoProductTagType;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.71K  reason: invalid class name */
public final class AnonymousClass71K {
    public static final Integer A00(C267324bN r5, UserSession userSession) {
        0qQ.A0B(r5, 0);
        if (r5.CcK() && !r5.A0H()) {
            int A01 = (int) 182.A01(0Tu.A05, userSession, 36596072006093111L);
            Integer valueOf = Integer.valueOf(A01);
            if (A01 > 0) {
                return valueOf;
            }
        }
        return null;
    }

    public static final 0eP A01(C267324bN r4, UserSession userSession) {
        if (!r4.CcK() || r4.A0H()) {
            return new 0eP(0, 0);
        }
        0Tu r42 = 0Tu.A05;
        return new 0eP(Integer.valueOf((int) 182.A01(r42, userSession, 36609755770460080L)), Integer.valueOf((int) 182.A01(r42, userSession, 36609755770525617L)));
    }

    public static final boolean A02(ClipsViewerSource clipsViewerSource, C52058GDe gDe, UserSession userSession) {
        0qQ.A0B(gDe, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(clipsViewerSource, 2);
        if (!gDe.A0W) {
            return false;
        }
        if (182.A06(0Tu.A06, userSession, 36324501222404218L) || clipsViewerSource == ClipsViewerSource.FEED_PAE_MULTI_ADS_WATCH_AND_BROWSE || clipsViewerSource == ClipsViewerSource.FEED_SA_MULTI_ADS_WATCH_AND_BROWSE) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (X.0qQ.A0I(r1, 0.5625f) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A06(X.C267324bN r5) {
        /*
            r4 = 0
            X.1Xj r0 = r5.A02
            if (r0 == 0) goto L_0x004f
            float r0 = r0.A0l()
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L_0x000d:
            r3 = 1
            if (r1 == 0) goto L_0x0019
            r0 = 1058013184(0x3f100000, float:0.5625)
            boolean r0 = X.0qQ.A0I(r1, r0)
            r2 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            X.5o2 r0 = r5.A01
            boolean r0 = X.GDZ.A01(r0)
            if (r0 == 0) goto L_0x0051
            X.1Xj r0 = r5.A02
            if (r0 == 0) goto L_0x004d
            X.GJR r1 = X.C52076GDw.A00(r0)
            X.GJR r0 = X.GJR.PHOTO_WITHOUT_MUSIC
            boolean r0 = r1.equals(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0051
            boolean r0 = r5.A0E()
            if (r0 != 0) goto L_0x0051
            boolean r0 = r5.A0H()
            if (r0 != 0) goto L_0x0051
            if (r2 == 0) goto L_0x0051
            return r3
        L_0x004d:
            r1 = 0
            goto L_0x0034
        L_0x004f:
            r1 = 0
            goto L_0x000d
        L_0x0051:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass71K.A06(X.4bN):boolean");
    }

    public static final boolean A08(C267324bN r3, UserSession userSession) {
        List CE2;
        0qQ.A0B(r3, 0);
        0qQ.A0B(userSession, 1);
        if (!182.A06(0Tu.A06, userSession, 36325695223575699L) || !GDZ.A01(r3.A01) || r3.A0H() || (CE2 = r3.A06().A0K.A0C.CE2()) == null || CE2.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean A0A(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 2342160552589137187L);
    }

    public static final boolean A0B(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str2, 2);
        if (str == null || ((!str2.equals("clips_viewer_clips_profile") && !str2.equals("clips_viewer_feed_contextual_profile")) || !182.A06(0Tu.A06, userSession, 36320730241049378L))) {
            return false;
        }
        return true;
    }

    public final long A0C(C267324bN r7, C52058GDe gDe, UserSession userSession) {
        long j;
        long j2;
        int intValue;
        Integer num;
        0qQ.A0B(gDe, 1);
        Integer num2 = null;
        AnonymousClass3OA A07 = r7.A07();
        if (A07 != null && GCI.A00(userSession)) {
            C270134gF r2 = A07.A0F;
            if (r2 == null || (num = r2.A0F) == null) {
                return 0;
            }
            intValue = num.intValue();
        } else if (!r7.CcK() || gDe.A0W) {
            return 0;
        } else {
            boolean A00 = new GBX().A00(r7);
            C257663xl r22 = r7.A06().A04;
            if (r22 != null) {
                num2 = r22.AwA();
            }
            boolean A03 = A03(r7);
            if (num2 != null) {
                intValue = num2.intValue();
            } else if (A09(r7, userSession)) {
                return 0;
            } else {
                0Tu r4 = 0Tu.A05;
                if (A03) {
                    if (A00) {
                        j2 = 36315769554341374L;
                    } else {
                        j2 = 36314597028661977L;
                    }
                    if (!182.A06(r4, userSession, j2)) {
                        return 0;
                    }
                    if (A00) {
                        j = 36597244530854642L;
                    } else {
                        j = 36596072005241140L;
                    }
                } else if (A00) {
                    j = 36597244530526961L;
                } else {
                    j = 36596072004716851L;
                }
                return 182.A01(r4, userSession, j);
            }
        }
        return (long) intValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r7.CcK() == true) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A0D(X.C267324bN r7, X.C52058GDe r8, com.instagram.common.session.UserSession r9) {
        /*
            r6 = this;
            r3 = 1
            r4 = 0
            if (r7 == 0) goto L_0x001e
            X.3OA r1 = r7.A07()
            if (r1 == 0) goto L_0x0020
            boolean r0 = X.GCI.A00(r9)
            if (r0 == 0) goto L_0x0020
            X.4gF r0 = r1.A0F
            if (r0 == 0) goto L_0x006c
            java.lang.Integer r4 = r0.A0G
            if (r4 == 0) goto L_0x006c
        L_0x0018:
            int r0 = r4.intValue()
            long r0 = (long) r0
        L_0x001d:
            return r0
        L_0x001e:
            r2 = 0
            goto L_0x0027
        L_0x0020:
            r2 = 1
            boolean r0 = r7.CcK()
            if (r0 != r3) goto L_0x001e
        L_0x0027:
            r0 = 0
            if (r2 == 0) goto L_0x001d
            boolean r2 = r8.A0W
            if (r2 != 0) goto L_0x001d
            r2 = 0
            X.0qQ.A0B(r7, r2)
            X.GBX r2 = new X.GBX
            r2.<init>()
            boolean r5 = r2.A00(r7)
            X.3OA r2 = r7.A06()
            X.3xl r2 = r2.A04
            if (r2 == 0) goto L_0x0048
            java.lang.Integer r4 = r2.BDZ()
        L_0x0048:
            boolean r3 = A03(r7)
            if (r4 != 0) goto L_0x0018
            boolean r2 = A09(r7, r9)
            if (r2 != 0) goto L_0x0083
            if (r3 == 0) goto L_0x006f
            X.0Tu r4 = X.0Tu.A05
            if (r5 == 0) goto L_0x0066
            r2 = 36315769554341374(0x81050000080dfe, double:3.0295771258075385E-306)
        L_0x005f:
            boolean r2 = X.182.A06(r4, r9, r2)
            if (r2 == 0) goto L_0x0083
            return r0
        L_0x0066:
            r2 = 36314597028661977(0x8103ef000e0ad9, double:3.028835615846506E-306)
            goto L_0x005f
        L_0x006c:
            r0 = 2000(0x7d0, double:9.88E-321)
            return r0
        L_0x006f:
            X.0Tu r2 = X.0Tu.A05
            if (r5 == 0) goto L_0x007d
            r0 = 36597244530920179(0x82050000060af3, double:3.2075830344047315E-306)
        L_0x0078:
            long r0 = X.182.A01(r2, r9, r0)
            return r0
        L_0x007d:
            r0 = 36596072004651314(0x8203ef00030932, double:3.206841524070917E-306)
            goto L_0x0078
        L_0x0083:
            r0 = 4000(0xfa0, double:1.9763E-320)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass71K.A0D(X.4bN, X.GDe, com.instagram.common.session.UserSession):long");
    }

    public final long A0F(C267324bN r4, UserSession userSession) {
        Long valueOf;
        0Tu r2;
        long j;
        if (!r4.CcK()) {
            return Long.MAX_VALUE;
        }
        if (new GBX().A00(r4)) {
            if (A0G(r4, userSession)) {
                r2 = 0Tu.A06;
                j = 36605516637607159L;
            } else {
                boolean A0K = A0K(r4, userSession, false);
                r2 = 0Tu.A06;
                if (A0K) {
                    j = 36607277574264353L;
                } else {
                    j = 36597244531378933L;
                }
            }
            valueOf = Long.valueOf(182.A01(r2, userSession, j));
            0qQ.A0A(valueOf);
        } else {
            valueOf = Long.valueOf(182.A01(0Tu.A05, userSession, 36596072005896502L));
        }
        return valueOf.longValue();
    }

    public final boolean A0G(C267324bN r7, UserSession userSession) {
        0Tu r2;
        long j;
        0qQ.A0B(userSession, 1);
        1Xj r22 = r7.A06().A0K;
        C257813y0 r1 = r7.A06().A0B;
        if (r1 == null || r1.B68() == null || 1sx.A0G(userSession, C231122qu.A07(userSession, r22))) {
            return false;
        }
        1Xj r3 = r7.A06().A0K;
        C250943mJ r23 = r7.A06().A0L;
        if (r23 == null) {
            return false;
        }
        HWH hwh = HWH.$redex_init_class;
        int ordinal = r23.ordinal();
        if (ordinal != 4) {
            if (ordinal != 1) {
                if (ordinal != 2 || r3.A5n() || r3.A5e()) {
                    return false;
                }
                r2 = 0Tu.A05;
                j = 36331076817273732L;
            } else if (r3.A5o()) {
                return false;
            } else {
                if (r3.A5n()) {
                    return 182.A06(0Tu.A05, userSession, 36330574306099899L);
                }
                return true;
            }
        } else if (r3.A5n() || r3.A5e()) {
            return false;
        } else {
            r2 = 0Tu.A05;
            j = 36330140514402785L;
        }
        if (182.A06(r2, userSession, j)) {
            return true;
        }
        return false;
    }

    public final boolean A0H(C267324bN r6, UserSession userSession) {
        long j;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        if (r6.A01 != C295365o2.AD || r6.A0J != 1iA.A0a) {
            return false;
        }
        1Xj r0 = r6.A02;
        if (r0 != null) {
            j = (long) r0.A0k();
        } else {
            j = -1;
        }
        if (j < 182.A01(0Tu.A06, userSession, 36607170200081944L) || r6.A0H()) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36325695223248015L)) {
            return false;
        }
        if (!182.A06(r2, userSession, 36325695223510162L)) {
            return true;
        }
        1Xj r02 = r6.A02;
        if (r02 == null || r02.A1r() == null) {
            return false;
        }
        return true;
    }

    public final boolean A0I(C267324bN r7, UserSession userSession) {
        Boolean bool;
        0Tu r2;
        long j;
        if (!A0J(r7, userSession, false)) {
            return false;
        }
        if (!A03(r7)) {
            1Xj r0 = r7.A02;
            if (r0 != null && r0.A1B() == 0) {
                return false;
            }
            r2 = 0Tu.A06;
            j = 36315563396697482L;
        } else if (!A0G(r7, userSession)) {
            boolean A0K = A0K(r7, userSession, false);
            r2 = 0Tu.A06;
            if (A0K) {
                j = 36325802597430515L;
            } else {
                j = 36315563396763019L;
            }
        } else if (r7.A06().A0v) {
            return true;
        } else {
            boolean A60 = r7.A06().A0K.A60();
            r2 = 0Tu.A05;
            if (A60) {
                j = 36330574306099899L;
            } else {
                bool = Boolean.valueOf(182.A06(r2, userSession, 36324041661034191L));
                return bool.booleanValue();
            }
        }
        bool = Boolean.valueOf(182.A06(r2, userSession, j));
        0qQ.A0A(bool);
        return bool.booleanValue();
    }

    public final boolean A0J(C267324bN r4, UserSession userSession, boolean z) {
        List A04;
        0Tu r2;
        long j;
        List B1b;
        0qQ.A0B(userSession, 1);
        if (r4.CcK() && !r4.A06().A0K.A5o() && (((A04 = r4.A06().A04()) == null || !A04.isEmpty()) && r4.A06().A0q)) {
            if (!A0G(r4, userSession)) {
                if (!r4.A06().A0K.A5n()) {
                    if (!A0K(r4, userSession, z)) {
                        C257583xd r0 = r4.A06().A02;
                        if (r0 != null && (B1b = r0.B1b()) != null && (!B1b.isEmpty())) {
                            r2 = 0Tu.A05;
                            j = 36318252044916794L;
                        } else if (new GBX().A00(r4)) {
                            if (z) {
                                r2 = 0Tu.A05;
                            } else {
                                r2 = 0Tu.A06;
                            }
                            j = 36315769556700700L;
                        } else {
                            r2 = 0Tu.A05;
                            j = 36315563395452282L;
                        }
                        return 182.A06(r2, userSession, j);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A0K(C267324bN r5, UserSession userSession, boolean z) {
        boolean z2;
        OnFeedMessagesIntf onFeedMessagesIntf;
        0Tu r2;
        OnFeedMessagesIntf BTY;
        List BE6;
        0qQ.A0B(userSession, 1);
        1Xj r1 = r5.A02;
        if (r1 == null || r1.A5n()) {
            return false;
        }
        IGCTMessagingAdsInfoDictIntf A00 = C231122qu.A00(userSession, r1);
        if (A00 == null || (BTY = A00.BTY()) == null || (BE6 = BTY.BE6()) == null) {
            z2 = false;
        } else {
            z2 = !BE6.isEmpty();
        }
        IGCTMessagingAdsInfoDictIntf A002 = C231122qu.A00(userSession, r1);
        if (A002 != null) {
            onFeedMessagesIntf = A002.BTY();
        } else {
            onFeedMessagesIntf = null;
        }
        int A003 = AnonymousClass3ZO.A00(onFeedMessagesIntf);
        boolean z3 = false;
        if (A003 == 3) {
            z3 = true;
        }
        if (!z2 || !z3) {
            return false;
        }
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        boolean A06 = 182.A06(r2, userSession, 36325802597430515L);
        0qQ.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public static final boolean A03(C267324bN r3) {
        1iA r1;
        1iA r12 = r3.A0J;
        if (!(r12 == 1iA.A0Q || r12 == 1iA.A0V)) {
            if (r12 != 1iA.A0B) {
                return false;
            }
            1Xj r0 = r3.A02;
            if (r0 != null) {
                r1 = r0.A1b().BR7();
            } else {
                r1 = null;
            }
            if (r1 != 1iA.A0a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A04(C267324bN r2) {
        MoreInfoProductTagType moreInfoProductTagType;
        AnonymousClass41Z BUC;
        C270854hQ BSw;
        1Xj r0 = r2.A02;
        if (r0 == null || (BUC = r0.A0C.BUC()) == null || (BSw = BUC.BSw()) == null) {
            moreInfoProductTagType = null;
        } else {
            moreInfoProductTagType = BSw.BgU();
        }
        if (moreInfoProductTagType == MoreInfoProductTagType.MIDCARD_SMART_DESTINATION) {
            return true;
        }
        return false;
    }

    public static final boolean A05(C267324bN r2) {
        MoreInfoProductTagType moreInfoProductTagType;
        AnonymousClass41Z BUC;
        C270854hQ BSw;
        1Xj r0 = r2.A02;
        if (r0 == null || (BUC = r0.A0C.BUC()) == null || (BSw = BUC.BSw()) == null) {
            moreInfoProductTagType = null;
        } else {
            moreInfoProductTagType = BSw.BgU();
        }
        if (moreInfoProductTagType == MoreInfoProductTagType.MIDCARD_TWO_TAP_TARGETS) {
            return true;
        }
        return false;
    }

    public static final boolean A07(C267324bN r3, UserSession userSession) {
        User CCd;
        if (182.A06(0Tu.A05, userSession, 36317543375836452L) || (r3.CcK() && (CCd = r3.A06().A0K.A0C.CCd()) != null && !CCd.A2Q() && C2803051e.A00(r3.A06().A0K.A0C.Aq4(), userSession))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (X.C55258Hen.A00(r9).A00(r7) == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A0E(X.C267324bN r7, X.C52058GDe r8, com.instagram.common.session.UserSession r9, boolean r10) {
        /*
            r6 = this;
            if (r10 == 0) goto L_0x000d
            X.Hr1 r0 = X.C55258Hen.A00(r9)
            boolean r0 = r0.A00(r7)
            r3 = 1
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            r3 = 0
        L_0x000e:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317543377868076(0x81069d0027152c, double:3.030698898948439E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x0050
            r4 = 2000(0x7d0, double:9.88E-321)
            if (r7 == 0) goto L_0x004a
            boolean r0 = r7.CcK()
            if (r0 == 0) goto L_0x004a
            X.3OA r0 = r7.A06()
            X.3yA r0 = r0.A0N
            if (r0 == 0) goto L_0x004a
            X.3OA r0 = r7.A06()
            X.3yA r0 = r0.A0N
            if (r0 == 0) goto L_0x0047
            java.lang.Integer r0 = r0.Aw5()
            if (r0 == 0) goto L_0x0047
            int r0 = r0.intValue()
            long r2 = (long) r0
        L_0x0040:
            long r0 = r6.A0D(r7, r8, r9)
            long r0 = r0 + r4
            long r0 = r0 + r2
            return r0
        L_0x0047:
            r2 = 0
            goto L_0x0040
        L_0x004a:
            long r0 = r6.A0D(r7, r8, r9)
            long r0 = r0 + r4
            return r0
        L_0x0050:
            if (r3 == 0) goto L_0x006e
            if (r7 == 0) goto L_0x0066
            boolean r0 = A03(r7)
            if (r0 == 0) goto L_0x0066
            X.0Tu r2 = X.0Tu.A06
            r0 = 36599018353003872(0x82069d000f0d60, double:3.208704806633067E-306)
        L_0x0061:
            long r0 = X.182.A01(r2, r9, r0)
            return r0
        L_0x0066:
            X.0Tu r2 = X.0Tu.A06
            r0 = 36599018353200481(0x82069d00120d61, double:3.2087048067574035E-306)
            goto L_0x0061
        L_0x006e:
            if (r7 == 0) goto L_0x007e
            boolean r0 = A03(r7)
            if (r0 == 0) goto L_0x007e
            X.0Tu r2 = X.0Tu.A06
            r0 = 36599018352807262(0x82069d000c0d5e, double:3.20870480650873E-306)
            goto L_0x0061
        L_0x007e:
            X.0Tu r2 = X.0Tu.A06
            r0 = 36599018352676189(0x82069d000a0d5d, double:3.208704806425839E-306)
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass71K.A0E(X.4bN, X.GDe, com.instagram.common.session.UserSession, boolean):long");
    }

    public static final boolean A09(C267324bN r4, UserSession userSession) {
        0Tu r2;
        long j;
        if (!r4.CcK()) {
            return false;
        }
        if (!r4.A06().A0K.A5o()) {
            if (r4.A06().A0K.A5e()) {
                r2 = 0Tu.A05;
                j = 36331038162633598L;
            } else if (!r4.A06().A0K.A5n()) {
                return false;
            } else {
                r2 = 0Tu.A05;
                j = 36331038162568061L;
            }
            if (!182.A06(r2, userSession, j)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
