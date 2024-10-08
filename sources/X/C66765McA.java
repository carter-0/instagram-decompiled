package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.McA  reason: case insensitive filesystem */
public final class C66765McA extends C392289uY implements G76 {
    public OWP A00;
    public C69645NpT A01;
    public C69646NpU A02;
    public AnonymousClass2Ep A03;
    public final FragmentActivity A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C331617Rr A07;
    public final C3725591j A08;
    public final C327977Cy A09;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.NpU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.NpT, java.lang.Object] */
    public final View A06(Context context) {
        int i;
        int i2;
        IgdsBanner igdsBanner;
        int i3;
        0qQ.A0B(context, 0);
        if (A00()) {
            C69645NpT npT = this.A01;
            if (npT == null || (igdsBanner = npT.A00) == null) {
                UserSession userSession = this.A06;
                AnonymousClass2Ep r0 = this.A03;
                if (r0 != null) {
                    r0.Bwx();
                }
                0qQ.A0B(userSession, 0);
                ? obj = new Object();
                igdsBanner = new IgdsBanner(context, (AttributeSet) null, 0);
                igdsBanner.setIcon((int) R.drawable.instagram_tag_pano_outline_24);
                DbT.A16(context, igdsBanner, 2Yu.A0C(context));
                0Tu r6 = 0Tu.A05;
                int i4 = 2131975028;
                if (182.A06(r6, userSession, 36316830411526819L)) {
                    i4 = 2131975029;
                }
                igdsBanner.setAction((CharSequence) AnonymousClass7TE.A16(context, i4));
                igdsBanner.setDismissible(true);
                if (182.A06(r6, userSession, 36316830411526819L)) {
                    i3 = 2131975033;
                    if (182.A06(r6, userSession, 36316830411592356L)) {
                        i3 = 2131975032;
                    }
                } else {
                    i3 = 2131975031;
                }
                DbT.A1U(igdsBanner, AnonymousClass7TE.A16(context, i3), true);
                igdsBanner.A00 = this;
                obj.A00 = igdsBanner;
                this.A01 = obj;
            }
        } else {
            C69646NpU npU = this.A02;
            if (npU == null || (igdsBanner = npU.A00) == null) {
                UserSession userSession2 = this.A06;
                AnonymousClass2Ep r02 = this.A03;
                if (r02 != null) {
                    r02.Bwx();
                }
                0qQ.A0B(userSession2, 0);
                ? obj2 = new Object();
                IgdsBanner igdsBanner2 = new IgdsBanner(context, (AttributeSet) null, 0);
                AnonymousClass7QC r8 = AnonymousClass7QC.A00;
                boolean A002 = r8.A00(userSession2);
                int i5 = R.drawable.instagram_receipt_pano_outline_24;
                if (A002) {
                    i5 = R.drawable.instagram_dollar_pano_outline_24;
                }
                igdsBanner2.setIcon(i5);
                DbT.A16(context, igdsBanner2, 2Yu.A0C(context));
                0Tu r4 = 0Tu.A05;
                if (182.A06(r4, userSession2, 36323191257377772L)) {
                    i = 2131963562;
                } else {
                    i = 2131956877;
                    if (r8.A00(userSession2)) {
                        i = 2131972240;
                    }
                }
                igdsBanner2.setAction((CharSequence) AnonymousClass7TE.A16(context, i));
                igdsBanner2.setDismissible(true);
                if (182.A06(r4, userSession2, 36323191257377772L)) {
                    i2 = 2131963561;
                } else {
                    i2 = 2131969085;
                    if (r8.A00(userSession2)) {
                        i2 = 2131972239;
                    }
                }
                DbT.A1U(igdsBanner2, AnonymousClass7TE.A16(context, i2), true);
                igdsBanner2.A00 = this;
                obj2.A00 = igdsBanner2;
                this.A02 = obj2;
                return igdsBanner2;
            }
        }
        return igdsBanner;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r5, boolean z) {
        DirectThreadKey directThreadKey;
        0qQ.A0B(puH, 1);
        UserSession userSession = this.A06;
        if (C66658MaR.A01(userSession, r5) || (AnonymousClass7TF.A1Z(this.A07.A0A) && C66658MaR.A00(userSession, r5))) {
            this.A03 = r5;
            puH.DoM(this);
            if (r5 != null) {
                directThreadKey = r5.BJy();
            } else {
                directThreadKey = null;
            }
            this.A00 = new OWP(directThreadKey);
            return;
        }
        puH.onFailure();
    }

    private final boolean A00() {
        AnonymousClass2Ep r0 = this.A03;
        UserSession userSession = this.A06;
        if ((!C66658MaR.A00(userSession, r0) || !182.A06(0Tu.A05, userSession, 36323191257377772L)) && C66658MaR.A01(userSession, this.A03) && 182.A06(0Tu.A05, userSession, 36316830411264672L)) {
            return true;
        }
        return false;
    }

    public final void A04(boolean z) {
        String str;
        SmartSuggestion smartSuggestion;
        OWP owp = this.A00;
        String str2 = null;
        if (owp != null) {
            str = owp.A01(this.A06);
        } else {
            str = null;
        }
        AnonymousClass2Ep r1 = this.A03;
        if (r1 != null) {
            smartSuggestion = r1.Bwx();
        } else {
            smartSuggestion = null;
        }
        if (str != null) {
            C3725591j r2 = this.A08;
            String str3 = this.A06.A06;
            if (smartSuggestion != null) {
                str2 = smartSuggestion.A05;
            }
            r2.A02(str3, str, str2);
            if (A00()) {
                C327977Cy.A00((C69489NmX) null, C69462Nm6.IMPRESSION, C69487NmV.UPSELL_YES_ENTRYPOINT, this.A09, str, str3);
            }
        }
    }

    public final void onBannerDismissed() {
        String str;
        SmartSuggestion smartSuggestion;
        OWP owp = this.A00;
        String str2 = null;
        if (owp != null) {
            str = owp.A01(this.A06);
        } else {
            str = null;
        }
        AnonymousClass2Ep r1 = this.A03;
        if (r1 != null) {
            smartSuggestion = r1.Bwx();
        } else {
            smartSuggestion = null;
        }
        if (str != null) {
            C3725591j r2 = this.A08;
            String str3 = this.A06.A06;
            if (smartSuggestion != null) {
                str2 = smartSuggestion.A05;
            }
            r2.A01(str3, str, str2);
        }
        AnonymousClass2Ep r12 = this.A03;
        String str4 = null;
        if (r12 != null) {
            DirectThreadKey BJy = r12.BJy();
            UserSession userSession = this.A06;
            if (smartSuggestion != null) {
                str4 = smartSuggestion.A05;
            }
            O04.A00(userSession, BJy, str4);
        }
    }

    public C66765McA(FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, C331617Rr r6) {
        this.A06 = userSession;
        this.A05 = r4;
        this.A04 = fragmentActivity;
        this.A07 = r6;
        this.A08 = new C3725591j(r4, userSession, C3725391h.A03);
        this.A09 = new C327977Cy(r4, userSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r4 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008c, code lost:
        if (r4 != null) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActionClicked() {
        /*
            r6 = this;
            boolean r0 = r6.A00()
            if (r0 == 0) goto L_0x0059
            X.2Ep r4 = r6.A03
            if (r4 == 0) goto L_0x0019
            X.OWP r0 = r6.A00
            if (r0 == 0) goto L_0x0019
            com.instagram.common.session.UserSession r3 = r6.A06
            androidx.fragment.app.FragmentActivity r1 = r6.A04
            X.0iw r2 = r6.A05
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r0.A02(r1, r2, r3, r4, r5)
        L_0x0019:
            X.NpT r0 = r6.A01
            if (r0 == 0) goto L_0x0024
            com.instagram.igds.components.banner.IgdsBanner r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
        L_0x0024:
            X.2Ep r0 = r6.A03
            r2 = 0
            if (r0 == 0) goto L_0x0057
            com.instagram.direct.smartsuggestion.model.SmartSuggestion r4 = r0.Bwx()
        L_0x002d:
            X.OWP r1 = r6.A00
            if (r1 == 0) goto L_0x0044
            com.instagram.common.session.UserSession r0 = r6.A06
            java.lang.String r3 = r1.A01(r0)
            if (r3 == 0) goto L_0x0044
            X.91j r1 = r6.A08
            java.lang.String r0 = r0.A06
            if (r4 == 0) goto L_0x0041
        L_0x003f:
            java.lang.String r2 = r4.A05
        L_0x0041:
            r1.A00(r0, r3, r2)
        L_0x0044:
            X.2Ep r1 = r6.A03
            r0 = 0
            if (r1 == 0) goto L_0x0056
            com.instagram.model.direct.DirectThreadKey r2 = r1.BJy()
            com.instagram.common.session.UserSession r1 = r6.A06
            if (r4 == 0) goto L_0x0053
            java.lang.String r0 = r4.A05
        L_0x0053:
            X.O04.A00(r1, r2, r0)
        L_0x0056:
            return
        L_0x0057:
            r4 = r2
            goto L_0x002d
        L_0x0059:
            X.OWP r4 = r6.A00
            if (r4 == 0) goto L_0x0068
            com.instagram.common.session.UserSession r3 = r6.A06
            androidx.fragment.app.FragmentActivity r2 = r6.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.0iw r0 = r6.A05
            r4.A03(r2, r0, r3, r1)
        L_0x0068:
            X.NpU r0 = r6.A02
            if (r0 == 0) goto L_0x0073
            com.instagram.igds.components.banner.IgdsBanner r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
        L_0x0073:
            X.2Ep r0 = r6.A03
            r2 = 0
            if (r0 == 0) goto L_0x008f
            com.instagram.direct.smartsuggestion.model.SmartSuggestion r4 = r0.Bwx()
        L_0x007c:
            X.OWP r1 = r6.A00
            if (r1 == 0) goto L_0x0044
            com.instagram.common.session.UserSession r0 = r6.A06
            java.lang.String r3 = r1.A01(r0)
            if (r3 == 0) goto L_0x0044
            X.91j r1 = r6.A08
            java.lang.String r0 = r0.A06
            if (r4 == 0) goto L_0x0041
            goto L_0x003f
        L_0x008f:
            r4 = r2
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66765McA.onActionClicked():void");
    }
}
