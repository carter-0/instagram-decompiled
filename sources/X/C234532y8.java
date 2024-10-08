package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.2y8  reason: invalid class name and case insensitive filesystem */
public abstract class C234532y8 implements AnonymousClass2y9 {
    public void Csj(C2354830a r1, 1Xj r2, AnonymousClass3W1 r3) {
    }

    public void Csk(C2354830a r1, 1Xj r2, AnonymousClass3W1 r3, int i) {
    }

    public void Dcw(View view, int i, Object obj, Object obj2) {
    }

    public void Csa(C2354830a r5, 1Xj r6, AnonymousClass3W1 r7) {
        C250603lj r1;
        if (this instanceof C234972yx) {
            C234972yx r2 = (C234972yx) this;
            AnonymousClass4DU r12 = r2.A02;
            if (AnonymousClass3WX.A02(r6, r12)) {
                r5.A00(r2.A05);
            }
            if (AnonymousClass3WX.A01(r6, r12)) {
                UserSession userSession = r2.A01;
                0qQ.A0B(userSession, 0);
                if (182.A06(0Tu.A06, userSession, 36324149035020115L)) {
                    r1 = new C275644qg(userSession);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this instanceof C234882yo) {
            C234882yo r22 = (C234882yo) this;
            AnonymousClass4DU r13 = r22.A01;
            if (!AnonymousClass3WX.A02(r6, r13) && AnonymousClass3WX.A01(r6, r13)) {
                r1 = r22.A00;
            } else {
                return;
            }
        } else if (this instanceof C234822yi) {
            C234822yi r23 = (C234822yi) this;
            AnonymousClass4DU r14 = r23.A00;
            if (!AnonymousClass3WX.A02(r6, r14)) {
                if (AnonymousClass3WX.A01(r6, r14)) {
                    r5.A00(r23.A05.A01);
                }
                r1 = r23.A02.A00;
            }
            r5.A00(r23.A04.A00);
            r1 = r23.A02.A00;
        } else if (this instanceof AnonymousClass2y7) {
            boolean CcK = r6.CcK();
            C233612w1 r0 = ((AnonymousClass2y7) this).A00;
            if (CcK) {
                r0.ABg(r5);
                return;
            } else {
                r0.ABd(r5);
                return;
            }
        } else if (this instanceof AnonymousClass30B) {
            AnonymousClass30B r15 = (AnonymousClass30B) this;
            if (r6.A4a() || r6.A4r()) {
                r1 = r15.A00;
            } else {
                return;
            }
        } else if (this instanceof C235312zi) {
            r1 = ((C235312zi) this).A01;
        } else if (this instanceof C235342zl) {
            C235342zl r16 = (C235342zl) this;
            if (r7.A34) {
                r1 = new AnonymousClass5I4(r16.A00);
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass30G) {
            AnonymousClass30G.A00(r5, r6, (AnonymousClass30G) this);
            return;
        } else if (this instanceof C235352zm) {
            r1 = ((C235352zm) this).A00;
        } else if (this instanceof AnonymousClass30E) {
            AnonymousClass30E r17 = (AnonymousClass30E) this;
            if (r6.A4a() && r6.A4r()) {
                r1 = r17.A00;
            } else {
                return;
            }
        } else if (this instanceof C235392zq) {
            C235392zq r18 = (C235392zq) this;
            if (r6.CcK()) {
                r1 = r18.A00;
            } else {
                return;
            }
        } else if (this instanceof C235142zL) {
            C235142zL r19 = (C235142zL) this;
            if (r6.CcK()) {
                r1 = r19.A00;
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass4FZ) {
            r1 = ((AnonymousClass4FZ) this).A00;
        } else if (this instanceof AnonymousClass4FY) {
            r1 = ((AnonymousClass4FY) this).A00;
        } else {
            return;
        }
        r5.A00(r1);
    }

    public final void Csb(C2354830a r5, 1Xj r6, AnonymousClass4HA r7) {
        C250603lj r0;
        C250603lj r02;
        if (this instanceof C235242zb) {
            C235242zb r1 = (C235242zb) this;
            if (AnonymousClass3WX.A02(r6, r1.A00)) {
                r5.A00(r1.A01);
                r0 = r1.A02;
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass2zX) {
            AnonymousClass2zX r2 = (AnonymousClass2zX) this;
            C243013Xb r3 = C243013Xb.A00;
            int i = r7.A01.A0E;
            if ((i == C231592rv.AD_CTA.ordinal() || i == C231592rv.APP_INSTALL_CTA.ordinal() || i == C231592rv.COLLECTION_CTA.ordinal() || i == C231592rv.IGBIO_PRODUCT_MEDIA_BAR_CTA.ordinal() || i == C231592rv.PROFESSIONAL_ORGANIC_MEDIA_BAR_CTA.ordinal() || i == C231592rv.SHOPPING_CTA.ordinal() || i == C231592rv.MEDIA_FUNDRAISER.ordinal() || i == C231592rv.MEDIA_FUNDRAISER_DONATE_BUTTON.ordinal() || i == C231592rv.UPCOMING_LIVE_EVENT_MEDIA_BAR_CTA.ordinal() || i == C231592rv.UPCOMING_ONLINE_EVENT_MEDIA_BAR_CTA.ordinal() || i == C231592rv.MEDIA_OPEN_CAROUSEL_REVIEW_CTA.ordinal() || i == C231592rv.MEDIA_OPEN_CAROUSEL_TURN_ON_CTA.ordinal() || i == C231592rv.BOOST_GUIDANCE_CTA.ordinal()) && r3.A05(r2.A00, r6, r2.A01)) {
                r0 = r2.A02;
            } else {
                return;
            }
        } else if (this instanceof C234972yx) {
            C234972yx r22 = (C234972yx) this;
            AnonymousClass4DU r12 = r22.A02;
            if (AnonymousClass3WX.A02(r6, r12)) {
                r0 = r22.A03;
            } else if (AnonymousClass3WX.A01(r6, r12)) {
                r0 = r22.A04;
            } else {
                return;
            }
        } else if (this instanceof C234822yi) {
            C234822yi r23 = (C234822yi) this;
            AnonymousClass4DU r13 = r23.A00;
            if (AnonymousClass3WX.A02(r6, r13)) {
                r02 = r23.A03.A02;
            } else if (AnonymousClass3WX.A01(r6, r13)) {
                r5.A00(r23.A03.A00);
                r02 = r23.A05.A00;
            } else {
                return;
            }
            r5.A00(r02);
            r0 = r23.A01.A00;
        } else if (this instanceof C235312zi) {
            r0 = ((C235312zi) this).A00;
        } else {
            return;
        }
        r5.A00(r0);
    }

    public final void Csc(C2354830a r6, 1Xj r7, C245833dY r8) {
        C250603lj r4;
        if (this instanceof C235022z9) {
            C235022z9 r1 = (C235022z9) this;
            if (r1.A03) {
                r6.A00(r1.A02);
            }
            r4 = r1.A00;
            if (r4 != null) {
                if (!182.A06(0Tu.A06, r1.A01, 36313437386770402L)) {
                    return;
                }
            } else {
                return;
            }
        } else if (this instanceof C235392zq) {
            C235392zq r12 = (C235392zq) this;
            if (r7.CcK()) {
                r4 = r12.A01;
            } else {
                return;
            }
        } else if (this instanceof C235142zL) {
            C235142zL r13 = (C235142zL) this;
            if (r7.CcK()) {
                r4 = r13.A02;
            } else {
                return;
            }
        } else {
            return;
        }
        r6.A00(r4);
    }

    public final void Csd(C2354830a r2) {
        if (this instanceof C235092zG) {
            r2.A00(((C235092zG) this).A00);
        }
    }

    public void Cse(C2354830a r5, 1Xj r6, AnonymousClass3W1 r7) {
        C250603lj r0;
        if (this instanceof C234972yx) {
            C234972yx r2 = (C234972yx) this;
            AnonymousClass4DU r1 = r2.A02;
            if (AnonymousClass3WX.A02(r6, r1)) {
                r5.A00(r2.A05);
            }
            if (AnonymousClass3WX.A01(r6, r1)) {
                UserSession userSession = r2.A01;
                0qQ.A0B(userSession, 0);
                if (182.A06(0Tu.A06, userSession, 36324149035020115L)) {
                    r0 = new C275644qg(userSession);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this instanceof C234882yo) {
            C234882yo r22 = (C234882yo) this;
            AnonymousClass4DU r12 = r22.A01;
            if (!AnonymousClass3WX.A02(r6, r12) && AnonymousClass3WX.A01(r6, r12)) {
                r0 = r22.A00;
            } else {
                return;
            }
        } else if (this instanceof C234822yi) {
            C234822yi r23 = (C234822yi) this;
            AnonymousClass4DU r13 = r23.A00;
            if (!AnonymousClass3WX.A02(r6, r13)) {
                if (AnonymousClass3WX.A01(r6, r13)) {
                    r5.A00(r23.A05.A01);
                }
                r0 = r23.A02.A00;
            }
            r5.A00(r23.A04.A00);
            r0 = r23.A02.A00;
        } else if (this instanceof AnonymousClass2y7) {
            boolean CcK = r6.CcK();
            C233612w1 r02 = ((AnonymousClass2y7) this).A00;
            if (CcK) {
                r02.ABg(r5);
                return;
            } else {
                r02.ABd(r5);
                return;
            }
        } else if (this instanceof C235312zi) {
            r0 = ((C235312zi) this).A01;
        } else if (this instanceof AnonymousClass30G) {
            AnonymousClass30G.A00(r5, r6, (AnonymousClass30G) this);
            return;
        } else if (this instanceof C235352zm) {
            r0 = ((C235352zm) this).A00;
        } else if (this instanceof AnonymousClass30B) {
            AnonymousClass30B r24 = (AnonymousClass30B) this;
            AnonymousClass2xS r03 = r24.A01;
            if (AnonymousClass3OG.A04(r03.A0A, r03.A0D, r6)) {
                r0 = r24.A00;
            } else {
                return;
            }
        } else if (this instanceof C235142zL) {
            C235142zL r14 = (C235142zL) this;
            if (r6.CcK()) {
                r5.A00(r14.A03);
                r0 = r14.A01;
            } else {
                return;
            }
        } else if (this instanceof C235392zq) {
            C235392zq r25 = (C235392zq) this;
            if (r6.CcK()) {
                r5.A00(r25.A02);
                r5.A00(r25.A05);
                r5.A00(r25.A07);
                r5.A00(r25.A03);
                r5.A00(r25.A04);
                if (r6.BR7() == 1iA.A0B) {
                    r0 = r25.A06;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass4FZ) {
            r0 = ((AnonymousClass4FZ) this).A00;
        } else if (this instanceof AnonymousClass4FY) {
            r0 = ((AnonymousClass4FY) this).A00;
        } else {
            return;
        }
        r5.A00(r0);
    }

    public final void Csf(C2354830a r2) {
        if (this instanceof C235082zF) {
            r2.A00((C230372pW) ((C235082zF) this).A00.getValue());
        }
    }

    public final void Csh(C2354830a r2, 1Xj r3, AnonymousClass3W1 r4) {
        if (this instanceof C235062zD) {
            r2.A00(((C235062zD) this).A00);
        }
    }

    public final void pause() {
        1Ua r0;
        if (this instanceof C234882yo) {
            r0 = ((C234882yo) this).A02;
        } else if (this instanceof C234822yi) {
            C234822yi r2 = (C234822yi) this;
            C234682yS r1 = r2.A03;
            r1.A01.A01.A09();
            r1.A03.A01.A09();
            r1.A00.A01.A09();
            r1.A02.A01.A09();
            C234752yb r12 = r2.A05;
            r12.A01.A02.A09();
            r12.A00.A02.A09();
            return;
        } else if (this instanceof AnonymousClass30G) {
            r0 = ((AnonymousClass30G) this).A03;
        } else {
            return;
        }
        r0.A01();
    }
}
