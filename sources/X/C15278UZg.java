package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;

/* renamed from: X.UZg  reason: case insensitive filesystem */
public final class C15278UZg extends AnonymousClass4DH implements AnonymousClass4DS, X3S {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceLocationsFragment";
    public ViewPager A00;
    public TabLayout A01;
    public WGU A02;
    public C18784W1k A03;
    public C18643Vvl A04;
    public PromoteData A05;
    public PromoteState A06;
    public UserSession A07;
    public SpinnerImageView A08;
    public boolean A09;
    public C18761Vzw A0A;

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dab(com.instagram.business.promote.model.PromoteState r10, java.lang.Integer r11) {
        /*
            r9 = this;
            r0 = 1
            X.0qQ.A0B(r11, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            java.lang.String r8 = "actionBarButtonController"
            java.lang.String r5 = "Required value was null."
            java.lang.String r7 = "audiencePotentialReachController"
            r3 = 0
            java.lang.String r6 = "promoteData"
            if (r11 != r0) goto L_0x003a
            com.instagram.business.promote.model.PromoteData r0 = r9.A05
            if (r0 == 0) goto L_0x0087
            com.instagram.business.promote.model.PendingLocation r1 = r0.A0o
            java.util.List r4 = r1.A05
            java.util.ArrayList r0 = X.00k.A0U(r4)
            r1.A04 = r0
            X.Vzw r2 = r9.A0A
            if (r2 == 0) goto L_0x0083
            boolean r1 = r9.A09
            com.instagram.business.promote.model.PromoteData r0 = r9.A05
            if (r1 == 0) goto L_0x0035
            if (r0 == 0) goto L_0x0087
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0p
        L_0x002d:
            if (r0 != 0) goto L_0x008b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0035:
            if (r0 == 0) goto L_0x0087
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            goto L_0x002d
        L_0x003a:
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            if (r11 != r0) goto L_0x00b5
            com.instagram.business.promote.model.PromoteData r0 = r9.A05
            if (r0 == 0) goto L_0x0087
            com.instagram.business.promote.model.PendingLocation r1 = r0.A0o
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0080
            com.instagram.business.promote.model.AudienceGeoLocation r1 = r1.A01
        L_0x004c:
            if (r1 != 0) goto L_0x0077
            X.0sn r4 = X.0sn.A00
        L_0x0050:
            com.instagram.business.promote.model.PromoteData r0 = r9.A05
            if (r0 == 0) goto L_0x0087
            com.instagram.business.promote.model.PendingLocation r1 = r0.A0o
            java.util.ArrayList r0 = X.00k.A0U(r4)
            r1.A04 = r0
            X.Vzw r2 = r9.A0A
            if (r2 == 0) goto L_0x0083
            boolean r1 = r9.A09
            com.instagram.business.promote.model.PromoteData r0 = r9.A05
            if (r1 == 0) goto L_0x0072
            if (r0 == 0) goto L_0x0087
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0p
        L_0x006a:
            if (r0 != 0) goto L_0x008b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0072:
            if (r0 == 0) goto L_0x0087
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            goto L_0x006a
        L_0x0077:
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.CUSTOM_LOCATION
            r1.A03 = r0
            java.util.List r4 = X.AnonymousClass7TE.A1I(r1)
            goto L_0x0050
        L_0x0080:
            com.instagram.business.promote.model.AudienceGeoLocation r1 = r1.A02
            goto L_0x004c
        L_0x0083:
            X.0qQ.A0F(r7)
            goto L_0x00a3
        L_0x0087:
            X.0qQ.A0F(r6)
            goto L_0x00a3
        L_0x008b:
            X.VuU r1 = X.C18167Vmh.A00(r0)
            java.util.ArrayList r0 = X.00k.A0U(r4)
            r1.A07 = r0
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r1.A01()
            r2.A02(r0)
            X.Vvl r1 = r9.A04
            if (r1 != 0) goto L_0x00a8
            X.0qQ.A0F(r8)
        L_0x00a3:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a8:
            boolean r0 = r9.A09
            if (r0 != 0) goto L_0x00b6
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00b6
        L_0x00b2:
            r1.A02(r3)
        L_0x00b5:
            return
        L_0x00b6:
            r3 = 1
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15278UZg.Dab(com.instagram.business.promote.model.PromoteState, java.lang.Integer):void");
    }

    public final void configureActionBar(2da r6) {
        String str;
        0qQ.A0B(r6, 0);
        r6.Eom(2131970334);
        Dbc.A0k(r6);
        boolean z = true;
        r6.Eu4(true);
        C18643Vvl A002 = C18643Vvl.A00(this, r6);
        this.A04 = A002;
        A002.A01(new C18887WAz(this, 63), AnonymousClass05K.A1F);
        C18643Vvl vvl = this.A04;
        if (vvl == null) {
            str = "actionBarButtonController";
        } else {
            if (!this.A09) {
                PromoteData promoteData = this.A05;
                if (promoteData == null) {
                    str = "promoteData";
                } else if (promoteData.A0o.A04.isEmpty()) {
                    z = false;
                }
            }
            vvl.A02(z);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "promote_create_audience_locations";
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r2 = 0
            X.0qQ.A0B(r9, r2)
            super.onViewCreated(r9, r10)
            r0 = 2131435697(0x7f0b20b1, float:1.8493243E38)
            android.view.View r0 = r9.requireViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r8.A00 = r0
            r0 = 2131435696(0x7f0b20b0, float:1.8493241E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            r8.A01 = r0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = X.DbX.A0k(r9)
            r8.A08 = r0
            boolean r0 = r8.A09
            java.lang.String r7 = "promoteData"
            if (r0 == 0) goto L_0x00a9
            com.instagram.business.promote.model.PromoteData r1 = r8.A05
            if (r1 == 0) goto L_0x00af
            java.util.List r0 = r1.A1m
            boolean r0 = X.AnonymousClass4KJ.A00(r0)
            if (r0 != 0) goto L_0x00a9
            java.util.List r0 = r1.A1m
            java.lang.Object r0 = r0.get(r2)
            com.instagram.business.promote.model.PromoteAudience r0 = (com.instagram.business.promote.model.PromoteAudience) r0
            java.util.List r0 = r0.A09
            boolean r0 = X.AnonymousClass4KJ.A00(r0)
            if (r0 != 0) goto L_0x00a9
            java.lang.String r6 = "ads/promote/audience_edit_screen_v2/"
            int r0 = r6.length()
            int r0 = r0 + -1
            java.lang.String r2 = X.C13991Tnr.A0a(r0, r6)
            X.WGU r1 = r8.A02
            r0 = 3
            X.UcZ r5 = new X.UcZ
            r5.<init>(r1, r8, r2, r0)
            X.W1k r4 = r8.A03
            if (r4 == 0) goto L_0x00ad
            com.instagram.common.session.UserSession r1 = r4.A08
            com.instagram.business.promote.model.PromoteData r0 = r4.A03
            java.lang.String r3 = r0.A1A
            X.1NY r2 = X.DbU.A0N(r1)
            r2.A0A(r6)
            com.instagram.api.schemas.BoostedPostAudienceOption r0 = com.instagram.api.schemas.BoostedPostAudienceOption.IG_PROMOTED_POST_AUTO
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "audience_type"
            r2.A9m(r0, r1)
            java.lang.String r1 = "audience_id"
            java.lang.String r0 = "0"
            r2.A9m(r1, r0)
            java.lang.String r0 = "fb_auth_token"
            r2.A9m(r0, r3)
            java.lang.Class<com.instagram.business.promote.model.PromoteAudienceInfo> r1 = com.instagram.business.promote.model.PromoteAudienceInfo.class
            java.lang.Class<X.Vmi> r0 = X.C18168Vmi.class
            X.1OC r0 = X.DbT.A0S(r2, r1, r0)
            X.C18784W1k.A02(r4, r5, r0)
        L_0x008c:
            X.UzE r3 = X.C16678UzE.LOCATIONS_SELECTION
            r0 = 2131428240(0x7f0b0390, float:1.8478119E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r9, r0)
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            com.instagram.business.promote.model.PromoteData r5 = r8.A05
            if (r5 == 0) goto L_0x00af
            X.W1k r4 = r8.A03
            if (r4 == 0) goto L_0x00ad
            X.Vzw r0 = new X.Vzw
            r0.<init>(r1, r2, r3, r4, r5)
            r8.A0A = r0
            return
        L_0x00a9:
            A00(r8)
            goto L_0x008c
        L_0x00ad:
            java.lang.String r7 = "dataFetcher"
        L_0x00af:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15278UZg.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final boolean A01() {
        PromoteData promoteData = this.A05;
        if (promoteData != null) {
            PendingLocation pendingLocation = promoteData.A0o;
            if (pendingLocation.A02 == null && pendingLocation.A05.isEmpty()) {
                PromoteData promoteData2 = this.A05;
                if (promoteData2 != null) {
                    if (promoteData2.A0o.A01 != null) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A07;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r3 = r1.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r3 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r2 = r2.A0o;
        r0 = X.C17149VKb.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (X.W2W.A04(r3) == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.A02 = (com.instagram.business.promote.model.AudienceGeoLocation) r3.get(0);
        r2.A00 = ((com.instagram.business.promote.model.AudienceGeoLocation) r3.get(0)).A02;
        r2.A03 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        r2.A05 = new java.util.ArrayList(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ff, code lost:
        if (r1.A07 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r1.A07 != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C15278UZg r6) {
        /*
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x003f
            boolean r0 = r6.A09
            java.lang.String r3 = "promoteData"
            if (r0 == 0) goto L_0x00f5
            com.instagram.business.promote.model.PromoteData r2 = r6.A05
            if (r2 == 0) goto L_0x00ad
            com.instagram.business.promote.model.PromoteAudienceInfo r1 = r2.A0p
            if (r1 == 0) goto L_0x00f5
            java.util.List r0 = r1.A07
            if (r0 == 0) goto L_0x00f5
        L_0x0018:
            java.util.List r3 = r1.A07
            if (r3 == 0) goto L_0x003f
            com.instagram.business.promote.model.PendingLocation r2 = r2.A0o
            X.W2W r0 = X.C17149VKb.A00
            boolean r0 = X.W2W.A04(r3)
            if (r0 == 0) goto L_0x00ec
            r1 = 0
            java.lang.Object r0 = r3.get(r1)
            com.instagram.business.promote.model.AudienceGeoLocation r0 = (com.instagram.business.promote.model.AudienceGeoLocation) r0
            r2.A02 = r0
            java.lang.Object r0 = r3.get(r1)
            com.instagram.business.promote.model.AudienceGeoLocation r0 = (com.instagram.business.promote.model.AudienceGeoLocation) r0
            int r0 = r0.A02
            r2.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A03 = r0
        L_0x003f:
            X.0hq r0 = r6.getChildFragmentManager()
            X.0qQ.A07(r0)
            r4 = 0
            X.U82 r5 = new X.U82
            r5.<init>(r0, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.A01 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.A00 = r0
            r0 = 2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.C13990Tnq.A0h()
            X.UZo r0 = new X.UZo
            r0.<init>()
            r3.add(r0)
            X.UZp r0 = new X.UZp
            r0.<init>()
            android.content.Context r1 = X.C66583MXo.A07(r6, r0, r3)
            r0 = 2131970332(0x7f13491c, float:1.9577612E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            android.content.Context r1 = X.C66583MXo.A07(r6, r0, r2)
            r0 = 2131970331(0x7f13491b, float:1.957761E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r2.add(r0)
            r5.A01 = r3
            r5.A00 = r2
            androidx.viewpager.widget.ViewPager r0 = r6.A00
            java.lang.String r3 = "viewPager"
            if (r0 == 0) goto L_0x00ad
            r0.setAdapter(r5)
            androidx.viewpager.widget.ViewPager r1 = r6.A00
            if (r1 == 0) goto L_0x00ad
            X.WEh r0 = new X.WEh
            r0.<init>(r6, r4)
            r1.A0J(r0)
            com.google.android.material.tabs.TabLayout r1 = r6.A01
            if (r1 != 0) goto L_0x00b5
            java.lang.String r3 = "tabLayout"
        L_0x00ad:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b5:
            androidx.viewpager.widget.ViewPager r0 = r6.A00
            if (r0 == 0) goto L_0x00ad
            r1.setupWithViewPager(r0)
            boolean r0 = r6.A01()
            if (r0 != 0) goto L_0x00d9
            com.instagram.business.promote.model.PromoteData r0 = r6.A05
            if (r0 != 0) goto L_0x00c9
            java.lang.String r3 = "promoteData"
            goto L_0x00ad
        L_0x00c9:
            com.instagram.business.promote.model.PendingLocation r0 = r0.A0o
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x00d9
            androidx.viewpager.widget.ViewPager r1 = r6.A00
            if (r1 == 0) goto L_0x00ad
            r0 = 1
            r1.setCurrentItem(r0)
        L_0x00d9:
            boolean r0 = r6.A09
            X.WGU r1 = r6.A02
            if (r0 == 0) goto L_0x00e7
            if (r1 == 0) goto L_0x00e6
            X.UzE r0 = X.C16678UzE.UPDATE_AUTO_AUDIENCE_LOCATION
        L_0x00e3:
            X.C13988Tno.A1J(r1, r0)
        L_0x00e6:
            return
        L_0x00e7:
            if (r1 == 0) goto L_0x00e6
            X.UzE r0 = X.C16678UzE.LOCATIONS_SELECTION
            goto L_0x00e3
        L_0x00ec:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r2.A05 = r0
            goto L_0x003f
        L_0x00f5:
            com.instagram.business.promote.model.PromoteData r2 = r6.A05
            if (r2 == 0) goto L_0x00ad
            com.instagram.business.promote.model.PromoteAudienceInfo r1 = r2.A0q
            if (r1 == 0) goto L_0x003f
            java.util.List r0 = r1.A07
            if (r0 == 0) goto L_0x003f
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15278UZg.A00(X.UZg):void");
    }

    public final void onCreate(Bundle bundle) {
        String str;
        boolean z;
        int A022 = AnonymousClass0fD.A02(-146578689);
        C15278UZg.super.onCreate(bundle);
        this.A05 = XAI.A00(this);
        PromoteState A002 = XA9.A00(this);
        this.A06 = A002;
        A002.A0A(this);
        PromoteData promoteData = this.A05;
        if (promoteData == null) {
            str = "promoteData";
        } else {
            UserSession userSession = promoteData.A0y;
            this.A07 = userSession;
            if (userSession != null) {
                this.A03 = C18784W1k.A01(this, userSession);
                UserSession userSession2 = this.A07;
                if (userSession2 != null) {
                    this.A02 = WGU.A00(userSession2);
                    Bundle bundle2 = this.mArguments;
                    if (bundle2 != null) {
                        z = bundle2.getBoolean("is_automatic_audience");
                    } else {
                        z = false;
                    }
                    this.A09 = z;
                    AnonymousClass0fD.A09(-1653895911, A022);
                    return;
                }
            }
            str = "session";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1368365844);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_create_audience_locations_view, false);
        AnonymousClass0fD.A09(614387154, A022);
        return A0D;
    }

    public final void onDestroy() {
        String str;
        int A022 = AnonymousClass0fD.A02(355003823);
        super.onDestroy();
        PromoteState promoteState = this.A06;
        if (promoteState == null) {
            str = "promoteState";
        } else {
            promoteState.A0B(this);
            PromoteData promoteData = this.A05;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                PendingLocation pendingLocation = promoteData.A0o;
                pendingLocation.A05 = new ArrayList();
                pendingLocation.A00 = 5;
                pendingLocation.A01 = null;
                pendingLocation.A02 = null;
                pendingLocation.A03 = null;
                pendingLocation.A04 = new ArrayList();
                AnonymousClass0fD.A09(-208524286, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1102927375);
        super.onDestroyView();
        this.A02 = null;
        C18761Vzw vzw = this.A0A;
        if (vzw == null) {
            0qQ.A0F("audiencePotentialReachController");
            throw AnonymousClass00P.createAndThrow();
        }
        vzw.A0A.A00();
        vzw.A00 = C18598Vup.A01;
        AnonymousClass0fD.A09(-1548855665, A022);
    }
}
