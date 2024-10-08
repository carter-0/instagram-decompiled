package X;

import com.facebook.systrace.Systrace;
import com.instagram.api.schemas.MomentAdsTypeEnum;
import com.instagram.common.session.UserSession;
import go.Seq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.33X  reason: invalid class name */
public final class AnonymousClass33X {
    public final UserSession A00;
    public final AnonymousClass310 A01;
    public final AnonymousClass4DU A02;
    public final C231502rm A03;
    public final 0rQ A04;

    public AnonymousClass33X(UserSession userSession, AnonymousClass310 r3, AnonymousClass4DU r4, C231502rm r5, 0rQ r6) {
        0qQ.A0B(r5, 5);
        this.A00 = userSession;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
    }

    public final void A05(C232672uC r5, 1Xj r6, AnonymousClass3W1 r7, String str) {
        C231592rv A002;
        if (r6.A5D()) {
            A002 = this.A03.A00(r6, C231542rq.CAROUSEL_CONTENT, this.A02.getModuleName());
        } else if (r6.A5H()) {
            A002 = C231592rv.COLLECTION_TOP_WITH_BOTTOM_THREE_CONTENT;
        } else if (r6.BR7() == 1iA.A0G) {
            A002 = C231592rv.MEDIA_GUIDE_CONTENT;
        } else {
            0rQ r0 = this.A04;
            if (r0 != null) {
                AnonymousClass4DU r2 = this.A02;
                r2.getModuleName();
                if (r0.A05(r6)) {
                    if (r7.A2e) {
                        A002 = C231592rv.LITHO_FULL_HEIGHT_SINGLE_MEDIA_CLIPS_UI;
                    } else {
                        A002 = this.A03.A01(r6, r2.getModuleName());
                    }
                }
            }
            UserSession userSession = this.A00;
            if (0qQ.A0K(str, "main_feed") && r6.A0C.AsQ() != null && 182.A06(0Tu.A05, userSession, 36313235523110730L)) {
                A002 = C231592rv.MEDIA_CONTENT_SERVER_RENDERED;
            } else if (r6.BR7() == 1iA.A0S) {
                A002 = C231592rv.POTATO_MEDIA;
            } else {
                A002 = this.A03.A00(r6, C231542rq.MEDIA_CONTENT, this.A02.getModuleName());
            }
        }
        A06(r5, r6, r7, A002.ordinal());
    }

    public final void A07(AnonymousClass3YW r8, AnonymousClass3W1 r9) {
        AnonymousClass3DI r0 = AnonymousClass3DI.A00;
        UserSession userSession = this.A00;
        if (r0.A03(userSession) && r8.A07) {
            for (C247733gp r3 : Collections.unmodifiableList(r8.A02)) {
                if ((r3 != null && r3.A0j) || AnonymousClass3DI.A01(userSession)) {
                    0qQ.A0A(r3);
                    this.A01.BRO().A85(new C245833dY(r3, r8.A01, r9, r8.A04), C231592rv.LITHO_SOCIAL_CONTEXT_BUBBLES.ordinal());
                }
            }
        }
    }

    public final boolean A08(C232672uC r4, 1Xj r5, AnonymousClass3W1 r6) {
        C231592rv r0;
        if (!r6.CdP() || !r6.A28 || I71.A05(r5, r6.A0m, r6)) {
            return false;
        }
        if (!r5.CcK()) {
            r0 = C231592rv.TOMBSTONE_REPORT;
        } else if (r6.A0m == AnonymousClass3WA.ADS_LWNF) {
            r0 = C231592rv.TOMBSTONE_AD_DEMOTION;
        } else {
            r0 = C231592rv.TOMBSTONE_SPONSORED;
        }
        A06(r4, r5, r6, r0.ordinal());
        return true;
    }

    public static final List A00(AnonymousClass3YW r6, AnonymousClass3W1 r7) {
        if (r6.A06 || !r6.A07) {
            return 0sn.A00;
        }
        List<C247733gp> unmodifiableList = Collections.unmodifiableList(r6.A02);
        0qQ.A07(unmodifiableList);
        ArrayList arrayList = new ArrayList(0Yv.A1E(unmodifiableList, 10));
        for (C247733gp r3 : unmodifiableList) {
            0qQ.A0A(r3);
            arrayList.add(new C245833dY(r3, r6.A01, r7, r6.A04));
        }
        return arrayList;
    }

    public final void A01(C232672uC r7, AnonymousClass3YW r8, 1Xj r9, AnonymousClass3W1 r10) {
        if (Systrace.A0E(1)) {
            0fS.A01("addLithoFooterRowAndViewpointData", -696072328);
        }
        int ordinal = C231592rv.LITHO_COALESCED_FOOTER.ordinal();
        r7.A7V(ordinal, r9, r10);
        AnonymousClass3WV BRO = this.A01.BRO();
        BRO.AAB(ordinal);
        if (r9.CcK()) {
            BRO.AAB(C231592rv.MEDIA_UFI.ordinal());
        }
        for (C245833dY A85 : A00(r8, r10)) {
            BRO.A85(A85, ordinal);
        }
        if (Systrace.A0E(1)) {
            0fS.A00(1738581562);
        }
    }

    public final void A02(C232672uC r5, AnonymousClass3YW r6, 1Xj r7, AnonymousClass3W1 r8) {
        r5.A7V(C231592rv.LITHO_COALESCED_MEDIA.ordinal(), r7, r8);
        AnonymousClass3WV BRO = this.A01.BRO();
        BRO.AAB(C231592rv.LITHO_MEDIA_HEADER.ordinal());
        BRO.A88(C231592rv.LITHO_MEDIA_CONTENT.ordinal());
        BRO.AAB(C231592rv.LITHO_MEDIA_UFI.ordinal());
        for (C245833dY A85 : A00(r6, r8)) {
            BRO.A85(A85, C231592rv.LITHO_COALESCED_FOOTER.ordinal());
        }
    }

    public final void A03(C232672uC r4, 1Xj r5, AnonymousClass3W1 r6) {
        int ordinal = C231592rv.LITHO_COALESCED_HEADER.ordinal();
        r4.A7V(ordinal, r5, r6);
        AnonymousClass3WV BRO = this.A01.BRO();
        if (this.A03.A0V) {
            BRO.AAB(C231592rv.LITHO_MEDIA_HEADER.ordinal());
        } else {
            BRO.AAB(ordinal);
        }
    }

    public final void A04(C232672uC r4, 1Xj r5, AnonymousClass3W1 r6) {
        Integer num;
        C231592rv r0;
        int ordinal;
        if (1sx.A0Q(r5, r6.A03) && r6.A0o != 1sy.A0N && !C243213Xw.A03(this.A00, r5) && r5.A0C.BU1() != MomentAdsTypeEnum.IG_SCHEDULED_LIVE) {
            A06(r4, r5, r6, this.A03.A00(r5, C231542rq.AD_CTA, this.A02.getModuleName()).ordinal());
            ordinal = C231592rv.AD_CTA.ordinal();
        } else if (!r5.A5H()) {
            UserSession userSession = this.A00;
            if (AnonymousClass3YA.A01(userSession, r5)) {
                num = AnonymousClass05K.A0C;
            } else if (AnonymousClass3YA.A02(userSession, r5)) {
                num = AnonymousClass05K.A0N;
            } else if (AnonymousClass3YC.A00.A09(r5)) {
                num = AnonymousClass05K.A00;
            } else if (AnonymousClass3YF.A00(userSession, r5)) {
                num = AnonymousClass05K.A01;
            } else {
                return;
            }
            int intValue = num.intValue();
            if (intValue == 1) {
                r0 = C231592rv.SHOPPING_CTA;
            } else if (intValue == 0) {
                r0 = C231592rv.COLLECTION_CTA;
            } else if (intValue == 2) {
                r0 = C231592rv.UPCOMING_LIVE_EVENT_MEDIA_BAR_CTA;
            } else if (intValue == 3) {
                r0 = C231592rv.UPCOMING_ONLINE_EVENT_MEDIA_BAR_CTA;
            } else {
                throw new IllegalArgumentException(002.A0R("Unsupported UpcomingEventRowType: ", "COLLECTION"));
            }
            ordinal = r0.ordinal();
            A06(r4, r5, r6, ordinal);
        } else {
            return;
        }
        r6.A09(ordinal);
    }

    public final boolean A09(1Xj r4) {
        return this.A03.A03(r4, C231542rq.COALESCED_HEADER, this.A02.getModuleName());
    }

    public final boolean A0A(1Xj r5, AnonymousClass3W1 r6, String str) {
        C231592rv r1;
        C231502rm r3 = this.A03;
        C231542rq r12 = C231542rq.COALESCED_MEDIA;
        AnonymousClass4DU r2 = this.A02;
        if (r3.A03(r5, r12, r2.getModuleName())) {
            if (r5.A5D()) {
                r1 = C231592rv.CAROUSEL_CONTENT;
            } else if (r5.A5H()) {
                r1 = C231592rv.COLLECTION_TOP_WITH_BOTTOM_THREE_CONTENT;
            } else if (r5.BR7() == 1iA.A0G) {
                r1 = C231592rv.MEDIA_GUIDE_CONTENT;
            } else {
                0rQ r0 = this.A04;
                if (r0 != null) {
                    r2.getModuleName();
                    if (r0.A05(r5)) {
                        r1 = C231592rv.FULL_HEIGHT_SINGLE_MEDIA;
                    }
                }
                UserSession userSession = this.A00;
                if (0qQ.A0K(str, "main_feed") && r5.A0C.AsQ() != null && 182.A06(0Tu.A05, userSession, 36313235523110730L)) {
                    r1 = C231592rv.MEDIA_CONTENT_SERVER_RENDERED;
                } else if (r5.BR7() == 1iA.A0S) {
                    r1 = C231592rv.POTATO_MEDIA;
                } else {
                    r1 = C231592rv.MEDIA_CONTENT;
                }
            }
            if (r1 != C231592rv.MEDIA_CONTENT || r6.A2v) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A06(C232672uC r6, Object obj, Object obj2, int i) {
        try {
            C231592rv r4 = C231592rv.values()[i];
            if (Systrace.A0E(1)) {
                0fS.A01(002.A0R("addRowAndViewpointData: ", r4.A00), -570864331);
            }
            if (obj == null || obj2 == null) {
                r6.A7U(i);
            } else {
                r6.A7V(i, obj, obj2);
            }
            switch (r4.ordinal()) {
                case 6:
                case 95:
                    this.A01.BRO().A82(i);
                    break;
                case 11:
                case 36:
                case 37:
                case Seq.RefTracker.REF_OFFSET:
                case 87:
                    this.A01.BRO().A88(i);
                    break;
                case 13:
                case 14:
                    this.A01.BRO().A87(i);
                    break;
                case 15:
                    this.A01.BRO().A8V(i);
                    break;
                case 22:
                case 88:
                    AnonymousClass310 r1 = this.A01;
                    r1.BRO().AAB(i);
                    r1.BRO().A88(C231592rv.MEDIA_CONTENT.ordinal());
                    break;
                case 35:
                    AnonymousClass3WV BRO = this.A01.BRO();
                    0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.FeedCommentRowModelAndState");
                    BRO.A85((C245833dY) obj2, i);
                    break;
                case 49:
                    this.A01.BRO().A8i(i);
                    break;
                case 65:
                    break;
                case 89:
                case 90:
                    AnonymousClass310 r12 = this.A01;
                    r12.BRO().AAB(i);
                    r12.BRO().A88(i);
                    break;
                default:
                    this.A01.BRO().AAB(i);
                    break;
            }
            if (Systrace.A0E(1)) {
                0fS.A00(-9972989);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(57655622);
            }
            throw th;
        }
    }
}
