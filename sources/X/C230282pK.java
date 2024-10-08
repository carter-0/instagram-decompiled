package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2pK  reason: invalid class name and case insensitive filesystem */
public final class C230282pK {
    public C231332rR A00;
    public final 0wc A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final C249763kK A04;
    public final AnonymousClass0iw A05;

    public C230282pK(AnonymousClass0iw r2, UserSession userSession, AnonymousClass4DU r4, C249763kK r5) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r5, 2);
        this.A02 = userSession;
        this.A04 = r5;
        this.A05 = r2;
        this.A03 = r4;
        AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
        r0.A00 = r2;
        this.A01 = r0.A00();
    }

    public final void A09(1Xj r6, C54077Gz1 gz1, Integer num, String str) {
        long j;
        Integer num2;
        int A002;
        Long l;
        Long l2;
        User A2A;
        String A2n;
        String A07;
        0qQ.A0B(str, 2);
        0wc r2 = this.A01;
        0Aj A003 = r2.A00(r2.A00, AnonymousClass000.A00(1477));
        if (A003.isSampled()) {
            boolean z = false;
            if (r6 != null && !r6.CcK()) {
                z = true;
            }
            if (num != null) {
                j = (long) num.intValue();
            } else {
                j = -1;
            }
            A003.A9F("hscroll_seed_ad_position", Long.valueOf(j));
            A003.AAJ("client_session_id", this.A04.getSessionId());
            A003.AAJ("contextual_ads_category", "");
            A003.A9F("chaining_position", 0L);
            A003.AAJ("chaining_session_id", "");
            A003.AAJ("invalidation_reason", str);
            if (gz1 != null) {
                A002 = gz1.A00;
            } else {
                if (r6 == null || r6.CcK()) {
                    num2 = AnonymousClass05K.A0N;
                } else {
                    num2 = AnonymousClass05K.A0j;
                }
                A002 = AnonymousClass59V.A00(num2);
            }
            A003.A9F("multi_ads_type_number", Long.valueOf((long) A002));
            Long l3 = null;
            if (z || r6 == null || (A07 = C231122qu.A07(this.A02, r6)) == null) {
                l = null;
            } else {
                l = 00y.A0n(10, A07);
            }
            A003.A9F("hscroll_seed_ad_id", l);
            if (!z || r6 == null || (A2n = r6.A2n()) == null) {
                l2 = null;
            } else {
                l2 = 00y.A0n(10, A2n);
            }
            A003.A9F("hscroll_seed_media_id", l2);
            if (!(!z || r6 == null || (A2A = r6.A2A(this.A02)) == null)) {
                l3 = 00y.A0n(10, A2A.getId());
            }
            A003.A9F("hscroll_seed_media_author_igid", l3);
            UserSession userSession = this.A02;
            A003.A7p("is_seed_ad_multi_ads_eligible", A02(userSession, r6));
            A003.AAJ("hscroll_seed_ad_tracking_token", A05(userSession, r6));
            A003.Cgf();
        }
    }

    public final void A0A(1Xj r6, Integer num, String str, int i) {
        Integer num2;
        Long valueOf;
        Long l;
        Long l2;
        User A2A;
        String A2n;
        0qQ.A0B(str, 1);
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, C273654mx.A00(757));
        if (A002.isSampled()) {
            boolean z = !r6.CcK();
            A002.A9F("chaining_position", 0L);
            A002.AAJ("chaining_session_id", "");
            A002.AAJ("client_session_id", this.A04.getSessionId());
            A002.AAJ("contextual_ads_category", "");
            A002.AAJ("container_module", "feed_timeline");
            A002.AAJ("trigger_type", str);
            if (!r6.CcK()) {
                num2 = AnonymousClass05K.A0j;
            } else {
                num2 = AnonymousClass05K.A0N;
            }
            A002.A9F("multi_ads_type_number", Long.valueOf((long) AnonymousClass59V.A00(num2)));
            Long l3 = null;
            if (z) {
                valueOf = null;
            } else {
                String A07 = C231122qu.A07(this.A02, r6);
                if (A07 != null) {
                    valueOf = Long.valueOf(Long.parseLong(A07));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            A002.A9F("hscroll_seed_ad_id", valueOf);
            if (!z || (A2n = r6.A2n()) == null) {
                l = null;
            } else {
                l = 00y.A0n(10, A2n);
            }
            A002.A9F("hscroll_seed_media_id", l);
            if (!z || (A2A = r6.A2A(this.A02)) == null) {
                l2 = null;
            } else {
                l2 = 00y.A0n(10, A2A.getId());
            }
            A002.A9F("hscroll_seed_media_author_igid", l2);
            A002.AAJ("inventory_source", C241323Ot.A02(r6.A0C.BIl()));
            UserSession userSession = this.A02;
            A002.A7p("is_seed_ad_multi_ads_eligible", A02(userSession, r6));
            A002.AAJ("hscroll_seed_ad_tracking_token", A05(userSession, r6));
            A002.A9F("num_multi_ads_inserted", Long.valueOf((long) i));
            if (num != null) {
                l3 = Long.valueOf((long) num.intValue());
            }
            A002.A9F("num_items_consumed_after_eof", l3);
            A002.Cgf();
        }
    }

    public final void A0B(1Xj r8, Long l, Long l2, String str, String str2) {
        Integer num;
        Long l3;
        Long l4;
        User A2A;
        String A2n;
        0qQ.A0B(str, 1);
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, C273654mx.A00(756));
        if (A002.isSampled()) {
            boolean z = true;
            if (r8.CcK()) {
                z = false;
            }
            A002.A9F("chaining_position", 0L);
            A002.AAJ("chaining_session_id", "");
            A002.AAJ("client_session_id", this.A04.getSessionId());
            A002.AAJ("contextual_ads_category", "");
            A002.AAJ("container_module", "feed_timeline");
            A002.AAJ("trigger_type", str);
            if (!r8.CcK()) {
                num = AnonymousClass05K.A0j;
            } else {
                num = AnonymousClass05K.A0N;
            }
            A002.A9F("multi_ads_type_number", Long.valueOf((long) AnonymousClass59V.A00(num)));
            Long l5 = null;
            A002.AAJ("inventory_source", C241323Ot.A02(r8.A0C.BIl()));
            A002.AAJ("invalidation_reason", str2);
            if (!z) {
                String A07 = C231122qu.A07(this.A02, r8);
                if (A07 != null) {
                    l3 = Long.valueOf(Long.parseLong(A07));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                l3 = null;
            }
            A002.A9F("hscroll_seed_ad_id", l3);
            if (!z || (A2n = r8.A2n()) == null) {
                l4 = null;
            } else {
                l4 = 00y.A0n(10, A2n);
            }
            A002.A9F("hscroll_seed_media_id", l4);
            if (z && (A2A = r8.A2A(this.A02)) != null) {
                l5 = 00y.A0n(10, A2A.getId());
            }
            A002.A9F("hscroll_seed_media_author_igid", l5);
            UserSession userSession = this.A02;
            A002.A7p("is_seed_ad_multi_ads_eligible", A02(userSession, r8));
            A002.AAJ("hscroll_seed_ad_tracking_token", A05(userSession, r8));
            A002.A9F("num_items_consumed_in_session", l);
            A002.A9F("num_items_consumed_after_eof", l2);
            A002.Cgf();
        }
    }

    public final void A0F(IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1, Integer num, int i) {
        String str;
        String str2;
        0qQ.A0B(gz1, 0);
        0qQ.A0B(intentAwareAdPivotState, 1);
        0qQ.A0B(num, 3);
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, AnonymousClass000.A00(3359));
        if (A002.isSampled()) {
            1Xj A003 = ((C55923Hpk) gz1.A0B.get(i)).A00();
            UserSession userSession = this.A02;
            String A07 = C231122qu.A07(userSession, A003);
            if (A07 != null) {
                A002.A9F("ad_id", Long.valueOf(Long.parseLong(A07)));
                A002.A9F("chaining_position", Long.valueOf(A00(gz1, this)));
                A002.AAJ("chaining_session_id", intentAwareAdPivotState.A0E);
                A002.AAJ("client_session_id", this.A04.getSessionId());
                A002.AAJ("contextual_ads_category", gz1.A09);
                A002.AAe("position", 0sr.A1M(new Long[]{0L, Long.valueOf((long) i)}));
                A002.AAJ("trigger_type", gz1.A00().A03);
                switch (num.intValue()) {
                    case 0:
                        str = "card";
                        break;
                    case 1:
                        str = "cta";
                        break;
                    case 2:
                        str = C273654mx.A00(368);
                        break;
                    case 3:
                        str = C273654mx.A00(899);
                        break;
                    case 4:
                        str = "caption";
                        break;
                    case 5:
                        str = "card_long_press";
                        break;
                    case 6:
                        str = "media_options";
                        break;
                    case 7:
                        str = "detached_profile";
                        break;
                    case 8:
                        str = "detached_username";
                        break;
                    case 9:
                        str = "detached_caption";
                        break;
                    default:
                        str = "detached_social_context";
                        break;
                }
                A002.AAJ(C273654mx.A00(C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION), str);
                A002.AAJ("container_module", "feed_timeline");
                A002.A9F("multi_ads_type_number", Long.valueOf((long) gz1.A00));
                A002.AAJ("multi_ads_unit_id", gz1.getId());
                String A0F = C231122qu.A0F(userSession, A003);
                if (A0F != null) {
                    A002.AAJ("tracking_token", A0F);
                    A002.AAJ("inventory_source", C241323Ot.A02(gz1.A0A));
                    Integer A022 = gz1.A02();
                    String str3 = null;
                    if (A022 != null) {
                        str2 = C55034Hb5.A00(A022);
                    } else {
                        str2 = null;
                    }
                    A002.AAJ("insertion_mechanism", str2);
                    A002.A9F("hscroll_seed_ad_id", A08(gz1));
                    A002.A9F("hscroll_seed_media_id", A04(gz1));
                    A002.A9F("hscroll_seed_media_author_igid", A03(gz1));
                    A002.A7p("is_seed_ad_multi_ads_eligible", A02(userSession, gz1.A04));
                    A002.AAJ("ad_request_id", gz1.A08);
                    Integer A2P = A003.A2P();
                    if (A2P != null) {
                        str3 = A2P.toString();
                    }
                    A002.AAJ("imp_signature", str3);
                    A002.Cgf();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0G(C54077Gz1 gz1) {
        0qQ.A0B(gz1, 0);
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, C273654mx.A00(755));
        String str = null;
        if (A002.isSampled()) {
            A002.A9F("chaining_position", -1L);
            A002.AAJ("chaining_session_id", "");
            A002.AAJ("client_session_id", this.A04.getSessionId());
            A002.AAJ("contextual_ads_category", gz1.A09);
            A002.AAJ("container_module", "feed_timeline");
            A002.AAJ("trigger_type", gz1.A00().A03);
            A002.A9F("multi_ads_type_number", Long.valueOf((long) gz1.A00));
            A002.AAJ("inventory_source", C241323Ot.A02(gz1.A0A));
            Integer A022 = gz1.A02();
            if (A022 != null) {
                str = C55034Hb5.A00(A022);
            }
            A002.AAJ("insertion_mechanism", str);
            A002.A9F("hscroll_seed_ad_id", A08(gz1));
            A002.A9F("hscroll_seed_ad_position", -1L);
            UserSession userSession = this.A02;
            A002.A7p("is_seed_ad_multi_ads_eligible", A02(userSession, gz1.A04));
            A002.AAJ("hscroll_seed_ad_tracking_token", A05(userSession, gz1.A04));
            A002.Cgf();
        }
    }

    public final void A0H(C54077Gz1 gz1, Integer num, Long l, String str, int i) {
        long j;
        String str2;
        0qQ.A0B(gz1, 0);
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, C273654mx.A00(759));
        if (A002.isSampled()) {
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            A002.A9F("chaining_position", Long.valueOf(j));
            A002.AAJ("chaining_session_id", "");
            A002.AAJ("client_session_id", this.A04.getSessionId());
            A002.AAJ("contextual_ads_category", gz1.A09);
            A002.A9F("hscroll_seed_ad_position", Long.valueOf((long) i));
            A002.AAJ("container_module", "feed_timeline");
            A002.AAJ("trigger_type", gz1.A00().A03);
            A002.A9F("multi_ads_type_number", Long.valueOf((long) gz1.A00));
            A002.AAJ("inventory_source", C241323Ot.A02(gz1.A0A));
            Integer A022 = gz1.A02();
            Long l2 = null;
            if (A022 != null) {
                str2 = C55034Hb5.A00(A022);
            } else {
                str2 = null;
            }
            A002.AAJ("insertion_mechanism", str2);
            A002.AAJ(AnonymousClass000.A00(2791), str);
            A002.A9F("hscroll_seed_ad_id", A08(gz1));
            A002.A9F("hscroll_seed_media_id", A04(gz1));
            A002.A9F("hscroll_seed_media_author_igid", A03(gz1));
            UserSession userSession = this.A02;
            A002.A7p("is_seed_ad_multi_ads_eligible", A02(userSession, gz1.A04));
            A002.AAJ("hscroll_seed_ad_tracking_token", A05(userSession, gz1.A04));
            if (num != null) {
                l2 = Long.valueOf((long) num.intValue());
            }
            A002.A9F("num_multi_ads_inserted", l2);
            A002.AAe("ad_ids", A06(gz1, this));
            A002.Cgf();
        }
    }

    public static final long A00(C54077Gz1 gz1, C230282pK r4) {
        String id;
        C231332rR r0;
        if (AnonymousClass59V.A00.A02(Integer.valueOf(gz1.A00))) {
            1Xj r02 = gz1.A05;
            if (r02 != null) {
                id = r02.getId();
            } else {
                id = null;
            }
        } else {
            id = gz1.getId();
        }
        if (id == null || (r0 = r4.A00) == null) {
            return -1;
        }
        return (long) r0.BJU(id);
    }

    public static final Boolean A02(UserSession userSession, 1Xj r2) {
        if (r2 == null || !r2.CcK()) {
            return null;
        }
        return Boolean.valueOf(C231122qu.A0O(userSession, r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r2 != 7) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Long A03(X.C54077Gz1 r3) {
        /*
            int r2 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 7
            if (r1 == 0) goto L_0x000c
            r1 = 1
            if (r2 == r0) goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            r0 = 0
            if (r1 == 0) goto L_0x001e
            com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl r1 = r3.A02
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L_0x001e
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230282pK.A03(X.Gz1):java.lang.Long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r2 != 7) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Long A04(X.C54077Gz1 r3) {
        /*
            int r2 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 7
            if (r1 == 0) goto L_0x000c
            r1 = 1
            if (r2 == r0) goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            r0 = 0
            if (r1 == 0) goto L_0x001e
            com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl r1 = r3.A02
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x001e
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230282pK.A04(X.Gz1):java.lang.Long");
    }

    public static final String A05(UserSession userSession, 1Xj r2) {
        if (r2 == null || !r2.CcK()) {
            return null;
        }
        return C231122qu.A0F(userSession, r2);
    }

    public static final List A06(C54077Gz1 gz1, C230282pK r4) {
        List<C55923Hpk> list = gz1.A0B;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (C55923Hpk A002 : list) {
            String A07 = C231122qu.A07(r4.A02, A002.A00());
            if (A07 != null) {
                arrayList.add(Long.valueOf(Long.parseLong(A07)));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0040, code lost:
        if (r2 != 7) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(com.instagram.feed.ui.state.IntentAwareAdPivotState r19, X.C54077Gz1 r20, X.C230282pK r21, java.lang.String r22, int r23) {
        /*
            r4 = r20
            java.util.List r0 = r4.A0B
            r9 = r23
            java.lang.Object r0 = r0.get(r9)
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r13 = r0.A00()
            r3 = r21
            com.instagram.common.session.UserSession r12 = r3.A02
            X.3kK r15 = r3.A04
            X.4DU r14 = r3.A03
            X.2vo r1 = r4.A01()
            X.2vm r0 = new X.2vm
            r0.<init>(r1)
            int r0 = r0.A09()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            r11 = -1
            java.lang.Integer r17 = java.lang.Integer.valueOf(r11)
            r18 = r22
            X.3sc r5 = X.C254513sb.A02(r12, r13, r14, r15, r16, r17, r18)
            if (r5 == 0) goto L_0x024f
            int r2 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1 = 7
            if (r0 == 0) goto L_0x0042
            r0 = 1
            if (r2 == r1) goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            r6 = 0
            if (r0 == 0) goto L_0x0081
            com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl r1 = r4.A02
            if (r1 == 0) goto L_0x007f
            java.lang.String r0 = r1.A01
        L_0x004c:
            r5.A5b = r0
            if (r1 == 0) goto L_0x007d
            java.lang.String r0 = r1.A00
        L_0x0052:
            r5.A5a = r0
        L_0x0054:
            long r2 = A00(r4, r3)
            java.util.List r0 = r4.A0B
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x0063:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r1.next()
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r0 = r0.A00()
            java.lang.String r0 = X.C231122qu.A07(r12, r0)
            if (r0 == 0) goto L_0x0063
            r7.add(r0)
            goto L_0x0063
        L_0x007d:
            r0 = r6
            goto L_0x0052
        L_0x007f:
            r0 = r6
            goto L_0x004c
        L_0x0081:
            com.instagram.api.schemas.ContextualAdResponseExtrasImpl r0 = r4.A00()
            java.lang.String r2 = r0.A02
            r1 = 0
            if (r2 == 0) goto L_0x0091
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0091
            r1 = r2
        L_0x0091:
            r5.A5Z = r1
            goto L_0x0054
        L_0x0094:
            java.util.List r0 = r4.A0B
            java.lang.Object r0 = X.00k.A0I(r0)
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r0 = r0.A00()
            java.lang.String r0 = X.C231122qu.A07(r12, r0)
            java.lang.String r8 = "Required value was null."
            if (r0 == 0) goto L_0x0249
            r5.A5H = r0
            r5.A0V = r9
            java.lang.String r0 = "feed_timeline"
            r5.A4s = r0
            r0 = r19
            java.lang.String r0 = r0.A0E
            r5.A4g = r0
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A1g = r0
            int r0 = r4.A00
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A3m = r0
            long r0 = (long) r9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A3x = r0
            java.util.List r0 = r4.A0B
            java.lang.Object r0 = X.00k.A0I(r0)
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r0 = r0.A00()
            java.lang.String r0 = X.C231122qu.A07(r12, r0)
            if (r0 == 0) goto L_0x0243
            r5.A61 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A3Q = r0
            r9 = -1
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00f6
            X.3Bb r8 = X.C238233Bb.A02
            X.4ai r1 = X.C267004ai.AD
            int r0 = (int) r2
            int r11 = r8.A00(r1, r0)
        L_0x00f6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r5.A0Q(r0)
            java.lang.Integer r0 = r4.A02()
            if (r0 == 0) goto L_0x0107
            java.lang.String r6 = X.C55034Hb5.A00(r0)
        L_0x0107:
            r5.A63 = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.00k.A0r(r7, r0)
            r5.A7X = r0
            java.lang.String r0 = r4.getId()
            r5.A62 = r0
            r5.A64 = r0
            java.lang.String r0 = r4.A0A
            if (r0 == 0) goto L_0x0121
            r5.A5m = r0
        L_0x0121:
            boolean r0 = X.C231122qu.A0R(r12, r13)
            r5.A8B = r0
            r17 = 0
            java.util.HashMap r0 = X.C254453sV.A00(r12)
            r5.A89 = r0
            java.lang.String r0 = X.C233832wY.A00(r12)
            r5.A4S = r0
            java.lang.String r0 = r4.A08
            r5.A4R = r0
            java.lang.Integer r0 = r13.A2P()
            if (r0 == 0) goto L_0x0240
            java.lang.String r0 = r0.toString()
        L_0x0143:
            r5.A5h = r0
            int r0 = r4.A00
            boolean r0 = X.I7D.A03(r12, r0)
            r6 = 2
            r1 = r0 ^ 1
            X.1Xy r0 = r13.A0C
            java.util.List r0 = r0.BxO()
            r3 = 0
            if (r0 == 0) goto L_0x023d
            java.lang.Object r7 = X.00k.A0J(r0)
            X.3yf r7 = (X.C258223yf) r7
        L_0x015d:
            boolean r0 = r13.CcK()
            if (r0 == 0) goto L_0x0194
            X.0jB r0 = r5.A0s
            if (r0 != 0) goto L_0x016c
            X.0jB r0 = new X.0jB
            r0.<init>()
        L_0x016c:
            r5.A0s = r0
            X.3Yy r0 = X.C243483Yy.A00
            java.util.List r0 = r0.A06(r12, r13)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0194
            X.0jB r8 = r5.A0s
            if (r1 == 0) goto L_0x020c
            if (r8 == 0) goto L_0x0189
            X.0j9 r1 = X.C271774jZ.A85
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r8.A04(r1, r0)
        L_0x0189:
            X.0jB r2 = r5.A0s
            if (r2 == 0) goto L_0x0194
            X.0j9 r1 = X.C271774jZ.A86
            java.lang.String r0 = "hidden"
            r2.A04(r1, r0)
        L_0x0194:
            X.2vo r1 = r4.A01()
            X.2vm r0 = new X.2vm
            r0.<init>(r1)
            int r4 = r0.A09()
            X.3Bb r3 = X.C238233Bb.A02
            r2 = 3
            X.4ai r7 = X.C267004ai.STANDALONE_MULTI_AD
            X.4ai r1 = X.C267004ai.PAE_MULTI_AD
            X.4ai[] r0 = new X.C267004ai[]{r7, r1}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            int r0 = r3.A01(r0, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0R(r0)
            X.4ai[] r0 = new X.C267004ai[]{r7, r1}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            X.4ai r0 = r3.A02(r0, r4)
            if (r0 == 0) goto L_0x0209
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x0206
            if (r0 != r2) goto L_0x0209
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x01d3:
            int r0 = X.AnonymousClass59V.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0U(r0)
            boolean r0 = X.C228342lQ.A02(r12)
            if (r0 == 0) goto L_0x01fc
            X.1Av r0 = X.1Au.A00(r12)
            X.1Az r0 = X.C228342lQ.A01(r0)
            java.lang.String r0 = r0.toString()
            r5.A4X = r0
            X.1Az r0 = X.C228342lQ.A00(r12)
            java.lang.String r0 = r0.toString()
            r5.A4Y = r0
        L_0x01fc:
            r16 = -1
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            r11 = r12
            r12 = r5
            X.C233822wX.A0F(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0206:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x01d3
        L_0x0209:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x01d3
        L_0x020c:
            if (r8 == 0) goto L_0x0224
            X.0j9 r2 = X.C271774jZ.A85
            if (r7 == 0) goto L_0x023b
            com.instagram.api.schemas.SocialContextType r0 = r7.BxW()
            if (r0 == 0) goto L_0x023b
            int r0 = r0.ordinal()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0221:
            r8.A04(r2, r0)
        L_0x0224:
            X.0jB r2 = r5.A0s
            if (r2 == 0) goto L_0x0194
            X.0j9 r1 = X.C271774jZ.A86
            if (r7 == 0) goto L_0x0236
            com.instagram.api.schemas.SocialContextType r0 = r7.BxW()
            if (r0 == 0) goto L_0x0236
            java.lang.String r3 = r0.name()
        L_0x0236:
            r2.A04(r1, r3)
            goto L_0x0194
        L_0x023b:
            r0 = r3
            goto L_0x0221
        L_0x023d:
            r7 = r3
            goto L_0x015d
        L_0x0240:
            r0 = 0
            goto L_0x0143
        L_0x0243:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0249:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x024f:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230282pK.A07(com.instagram.feed.ui.state.IntentAwareAdPivotState, X.Gz1, X.2pK, java.lang.String, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r2 != 7) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long A08(X.C54077Gz1 r4) {
        /*
            r3 = this;
            int r2 = r4.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 7
            if (r1 == 0) goto L_0x000c
            r1 = 1
            if (r2 == r0) goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            r0 = 0
            if (r1 != 0) goto L_0x0024
            com.instagram.api.schemas.ContextualAdResponseExtrasImpl r1 = r4.A00()
            java.lang.String r2 = r1.A02
            if (r2 == 0) goto L_0x0024
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0024
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r2)
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230282pK.A08(X.Gz1):java.lang.Long");
    }

    public final void A0C(IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1) {
        String str;
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, AnonymousClass000.A00(3361));
        if (A002.isSampled()) {
            A002.A9F("chaining_position", Long.valueOf(A00(gz1, this)));
            A002.AAJ("client_session_id", this.A04.getSessionId());
            A002.AAJ("contextual_ads_category", gz1.A09);
            A002.AAJ("chaining_session_id", intentAwareAdPivotState.A0E);
            UserSession userSession = this.A02;
            String A07 = C231122qu.A07(userSession, ((C55923Hpk) 00k.A0I(gz1.A0B)).A00());
            if (A07 != null) {
                A002.A9F("first_hscroll_item_ad_id", 00y.A0n(10, A07));
                A002.A9F("multi_ads_type_number", Long.valueOf((long) gz1.A00));
                A002.AAJ("multi_ads_unit_id", gz1.getId());
                A002.AAJ("inventory_source", C241323Ot.A02(gz1.A0A));
                Integer A022 = gz1.A02();
                if (A022 != null) {
                    str = C55034Hb5.A00(A022);
                } else {
                    str = null;
                }
                A002.AAJ("insertion_mechanism", str);
                A002.A9F("hscroll_seed_ad_id", A08(gz1));
                A002.A9F("hscroll_seed_media_id", A04(gz1));
                A002.A9F("hscroll_seed_media_author_igid", A03(gz1));
                A002.A7p("is_seed_ad_multi_ads_eligible", A02(userSession, gz1.A04));
                A002.AAJ("hscroll_seed_ad_tracking_token", A05(userSession, gz1.A04));
                A002.Cgf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0D(IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1) {
        String str;
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, C273654mx.A00(2874));
        if (A002.isSampled()) {
            A002.A9F("chaining_position", Long.valueOf(A00(gz1, this)));
            A002.AAJ("chaining_session_id", intentAwareAdPivotState.A0E);
            A002.AAJ("client_session_id", this.A04.getSessionId());
            A002.AAJ("contextual_ads_category", gz1.A09);
            A002.AAe("ad_ids", A06(gz1, this));
            UserSession userSession = this.A02;
            String A07 = C231122qu.A07(userSession, ((C55923Hpk) 00k.A0I(gz1.A0B)).A00());
            if (A07 != null) {
                A002.A9F("first_hscroll_item_ad_id", 00y.A0n(10, A07));
                A002.AAJ("trigger_type", gz1.A00().A03);
                A002.AAJ("container_module", "feed_timeline");
                A002.A9F("multi_ads_type_number", Long.valueOf((long) gz1.A00));
                A002.AAJ("multi_ads_unit_id", gz1.getId());
                A002.AAJ("inventory_source", C241323Ot.A02(gz1.A0A));
                Integer A022 = gz1.A02();
                if (A022 != null) {
                    str = C55034Hb5.A00(A022);
                } else {
                    str = null;
                }
                A002.AAJ("insertion_mechanism", str);
                A002.A9F("hscroll_seed_ad_id", A08(gz1));
                A002.A9F("hscroll_seed_media_id", A04(gz1));
                A002.A9F("hscroll_seed_media_author_igid", A03(gz1));
                A002.A7p("is_seed_ad_multi_ads_eligible", A02(userSession, gz1.A04));
                A002.AAJ("hscroll_seed_ad_tracking_token", A05(userSession, gz1.A04));
                A002.Cgf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0E(IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1) {
        String str;
        long j;
        boolean z;
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, C273654mx.A00(2875));
        if (A002.isSampled()) {
            A002.A9F("chaining_position", Long.valueOf(A00(gz1, this)));
            A002.AAJ("chaining_session_id", intentAwareAdPivotState.A0E);
            A002.AAJ("client_session_id", this.A04.getSessionId());
            A002.AAe("ad_ids", A06(gz1, this));
            UserSession userSession = this.A02;
            String A07 = C231122qu.A07(userSession, ((C55923Hpk) 00k.A0I(gz1.A0B)).A00());
            if (A07 != null) {
                A002.A9F("first_hscroll_item_ad_id", 00y.A0n(10, A07));
                A002.AAJ("container_module", "feed_timeline");
                A002.A9F("multi_ads_type_number", Long.valueOf((long) gz1.A00));
                A002.AAJ("multi_ads_unit_id", gz1.getId());
                A002.AAJ("inventory_source", C241323Ot.A02(gz1.A0A));
                Integer A022 = gz1.A02();
                Long l = null;
                if (A022 != null) {
                    str = C55034Hb5.A00(A022);
                } else {
                    str = null;
                }
                A002.AAJ("insertion_mechanism", str);
                if (intentAwareAdPivotState.A04 != null) {
                    j = 0L;
                } else {
                    j = null;
                }
                A002.A9F(C273654mx.A00(2398), j);
                C53261Gl9 gl9 = intentAwareAdPivotState.A04;
                if (gl9 != null) {
                    l = Long.valueOf(gl9.A00);
                }
                A002.A9F(C273654mx.A00(3431), l);
                A002.A9F("hscroll_seed_ad_id", A08(gz1));
                A002.A9F("hscroll_seed_media_id", A04(gz1));
                A002.A9F("hscroll_seed_media_author_igid", A03(gz1));
                A002.A7p("is_seed_ad_multi_ads_eligible", A02(userSession, gz1.A04));
                C53261Gl9 gl92 = intentAwareAdPivotState.A04;
                if (gl92 != null) {
                    z = gl92.A01;
                } else {
                    z = false;
                }
                A002.A7p(C273654mx.A00(2901), Boolean.valueOf(z));
                A002.AAJ("hscroll_seed_ad_tracking_token", A05(userSession, gz1.A04));
                A002.Cgf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final C257733xs A01(1Xj r5) {
        1Xj r3;
        C257733xs BEj;
        if (r5.A5D()) {
            List Alu = r5.A0C.Alu();
            if (Alu != null) {
                r3 = (1Xj) 00k.A0J(Alu);
            } else {
                r3 = null;
            }
        } else {
            r3 = r5;
        }
        C250513lZ injected = r5.A0C.getInjected();
        if (injected == null || (BEj = injected.BEj()) == null || r3 == null || !r3.A5p() || r3.A0l() <= 0.9f || r3.A0l() >= 1.1f) {
            return null;
        }
        return BEj;
    }
}
