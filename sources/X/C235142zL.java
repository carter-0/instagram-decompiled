package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.2zL  reason: invalid class name and case insensitive filesystem */
public final class C235142zL extends C234532y8 {
    public final C230502pj A00;
    public final C230502pj A01;
    public final C230502pj A02;
    public final C230502pj A03;
    public final C230502pj A04;
    public final C230502pj A05;
    public final C230502pj A06;
    public final C230502pj A07;
    public final C230502pj A08;
    public final C230502pj A09;
    public final C230502pj A0A;
    public final C230502pj A0B;
    public final C230502pj A0C;

    public final void Csj(C2354830a r2, 1Xj r3, AnonymousClass3W1 r4) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        if (r3.CcK()) {
            r2.A00(this.A0B);
        }
    }

    public final void Csk(C2354830a r2, 1Xj r3, AnonymousClass3W1 r4, int i) {
        C230502pj r0;
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        if (r3.CcK()) {
            if (i == C231592rv.LITHO_COALESCED_HEADER.ordinal() || i == C231592rv.LITHO_MEDIA_HEADER.ordinal() || i == C231592rv.MEDIA_HEADER.ordinal()) {
                r0 = this.A0A;
            } else if (i == C231592rv.GAP.ordinal()) {
                r0 = this.A0C;
            } else if (i == C231592rv.LITHO_AD_CTA.ordinal() || i == C231592rv.AD_CTA.ordinal() || i == C231592rv.UPCOMING_ONLINE_EVENT_MEDIA_BAR_CTA.ordinal()) {
                r0 = this.A07;
            } else if (i == C231592rv.BRANDED_CONTENT_LABEL.ordinal()) {
                r0 = this.A04;
            } else if (i == C231592rv.MEDIA_FEEDBACK.ordinal()) {
                r0 = this.A08;
            } else if (i == C231592rv.MEDIA_HEADLINE.ordinal()) {
                r0 = this.A09;
            } else if (i == C231592rv.LITHO_COALESCED_MEDIA.ordinal()) {
                r0 = this.A06;
            } else if (i == C231592rv.LITHO_COALESCED_FOOTER.ordinal()) {
                r0 = this.A05;
            } else {
                return;
            }
            r2.A00(r0);
        }
    }

    public final void Dcw(View view, int i, Object obj, Object obj2) {
        C230502pj r0;
        0qQ.A0B(view, 0);
        0qQ.A0B(obj, 2);
        if ((obj instanceof 1Xj) && ((1Xj) obj).CcK()) {
            if (i == C231592rv.LITHO_COALESCED_HEADER.ordinal() || i == C231592rv.LITHO_MEDIA_HEADER.ordinal() || i == C231592rv.MEDIA_HEADER.ordinal()) {
                r0 = this.A0A;
            } else if (i == C231592rv.LITHO_AD_CTA.ordinal() || i == C231592rv.AD_CTA.ordinal() || i == C231592rv.UPCOMING_ONLINE_EVENT_MEDIA_BAR_CTA.ordinal()) {
                r0 = this.A07;
            } else if (i == C231592rv.BRANDED_CONTENT_LABEL.ordinal()) {
                r0 = this.A04;
            } else if (i == C231592rv.MEDIA_FEEDBACK.ordinal()) {
                r0 = this.A08;
            } else if (i == C231592rv.LITHO_MEDIA_CONTENT.ordinal() || i == C231592rv.MEDIA_CONTENT.ordinal()) {
                r0 = this.A03;
            } else if (i == C231592rv.CAROUSEL_CONTENT.ordinal()) {
                r0 = this.A00;
            } else if (i == C231592rv.COLLECTION_TOP_WITH_BOTTOM_THREE_CONTENT.ordinal()) {
                r0 = this.A01;
            } else if (i == C231592rv.MEDIA_COMMENT.ordinal()) {
                r0 = this.A02;
            } else if (i == C231592rv.MEDIA_HEADLINE.ordinal()) {
                r0 = this.A09;
            } else if (i == C231592rv.LITHO_COALESCED_MEDIA.ordinal()) {
                r0 = this.A06;
            } else if (i == C231592rv.LITHO_COALESCED_FOOTER.ordinal()) {
                r0 = this.A05;
            } else {
                return;
            }
            r0.A00.put(obj, view);
        }
    }

    public C235142zL(UserSession userSession, AnonymousClass4DU r3) {
        this.A0B = new C235152zM(userSession, r3);
        this.A0A = new C235162zN(userSession);
        this.A0C = new C230502pj(userSession);
        this.A04 = new C230502pj(userSession);
        this.A08 = new C230502pj(userSession);
        this.A03 = new C230502pj(userSession);
        this.A07 = new AnonymousClass2zS(userSession);
        this.A00 = new C230502pj(userSession);
        this.A01 = new C230502pj(userSession);
        this.A02 = new C230502pj(userSession);
        this.A09 = new C230502pj(userSession);
        this.A05 = new C230502pj(userSession);
        this.A06 = new C230502pj(userSession);
    }
}
