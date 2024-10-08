package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.android.R;
import com.instagram.common.lifecycleannotations.LifecycleUtil;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ub9  reason: case insensitive filesystem */
public final class C15357Ub9 extends AnonymousClass4DH implements AnonymousClass4DV, C232682uF, AnonymousClass4DR, C227252iu, AnonymousClass0j6, AnonymousClass4DS, AnonymousClass4DT {
    public static final String __redex_internal_original_name = "LocationPageFragment";
    public C46329Dbx A00;
    public C227762js A01;
    public UserSession A02;
    public ImageUrl A03;
    public C298695ts A04;
    public GXC A05;
    public C14227TsA A06;
    public C14074TpO A07;
    public HAI A08;
    public AnonymousClass36D A09;
    public AnonymousClass2uE A0A;
    public C55941Hq5 A0B;
    public C17858VhB A0C;
    public W05 A0D;
    public C18621VvE A0E;
    public C15260UXv A0F;
    public VW5 A0G;
    public Venue A0H;
    public String A0I;
    public String A0J;
    public List A0K;
    public boolean A0L;
    public boolean A0M;
    public C14075TpP A0N;
    public 2el A0O;
    public C15694Uh0 A0P;
    public UlJ A0Q;
    public C19736Wed A0R;
    public boolean A0S;
    public final 1wn A0T = new C19221WQb(this, 26);
    public final C20949X6c A0U = new WVe(this);
    public final C20898X3p A0V = new C19340WVh(this);
    public final C20907X3y A0W = new C19355WVw(this, 2);
    public final JO7 A0X = new WW1(this);
    public final WW4 A0Y = new C15942UlC(this, 2);
    public final X41 A0Z = new WW5(this, 2);

    public static void A02(C15357Ub9 ub9) {
        1OC A012;
        ub9.A0L = true;
        C13990Tnq.A1L(ub9);
        Venue venue = ub9.A0H;
        C18621VvE vvE = ub9.A0E;
        if (venue == null) {
            String A062 = 0mp.A06("locations/%s/info/", new Object[]{vvE.A07});
            1NY A0O2 = DbU.A0O(vvE.A02);
            A0O2.A0A(A062);
            A012 = DbT.A0S(A0O2, UXJ.class, C18220Vnk.class);
            A012.A00 = new C15610Ufc(vvE);
        } else {
            17k.A0F(11Z.A07());
            UserSession userSession = vvE.A02;
            String str = vvE.A07;
            DQw dQw = vvE.A04;
            1NY A0O3 = DbU.A0O(userSession);
            A0O3.A0K("locations/%s/story/", new Object[]{str});
            1OC A0S2 = DbT.A0S(A0O3, C43852CFs.class, D1S.class);
            A0S2.A00 = new CHB(3, userSession, dQw);
            1ES.A00(vvE.A00, vvE.A01, A0S2);
            ub9.A0E.A01(ub9.A08.A00, true, false);
            vvE = ub9.A0E;
            17k.A0F(11Z.A07());
            UserSession userSession2 = vvE.A02;
            if (182.A06(0Tu.A05, userSession2, 36319635024387628L)) {
                1vn A013 = 1vm.A01(userSession2);
                PandoGraphQLRequest A002 = C18216Vng.A00(vvE.A07);
                A013.ATL(new C19028WHf(vvE, 6), new C19040WHs(vvE, 8), A002);
                return;
            }
            A012 = C18216Vng.A01(userSession2, vvE.A03, vvE.A07);
        }
        1ES.A00(vvE.A00, vvE.A01, A012);
    }

    public final boolean CbJ() {
        return true;
    }

    public final String getModuleName() {
        return "feed_location";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public static void A00(ImageUrl imageUrl, C15357Ub9 ub9, Venue venue, boolean z) {
        LocationPageInformation A012;
        MapEntryPoint mapEntryPoint;
        Venue venue2 = venue;
        if (venue2.A00() != null && venue2.A01() != null) {
            Bundle bundle = new Bundle();
            ImageUrl imageUrl2 = imageUrl;
            bundle.putParcelable("arg_place_thumbnail_override", imageUrl2);
            bundle.putBoolean("arg_request_nearby_places", z);
            ArrayList arrayList = new ArrayList();
            Double A002 = venue2.A00();
            Double A013 = venue2.A01();
            String A0b = AnonymousClass7TF.A0b();
            long currentTimeMillis = System.currentTimeMillis();
            C16557Ux9 ux9 = C16557Ux9.STORY;
            C15357Ub9 ub92 = ub9;
            C15260UXv uXv = ub92.A0F;
            if (uXv == null) {
                A012 = null;
            } else {
                A012 = uXv.A01();
            }
            arrayList.add(new MediaMapPin(imageUrl2, A012, ux9, venue2, A002, A013, A0b, currentTimeMillis));
            FragmentActivity requireActivity = ub92.requireActivity();
            UserSession userSession = ub92.A02;
            String str = ub92.A0I;
            if (z) {
                mapEntryPoint = MapEntryPoint.LOCATION_PAGE_BUTTON;
            } else {
                mapEntryPoint = MapEntryPoint.LOCATION_PAGE_MAP;
            }
            C18681Vwf.A01(bundle, requireActivity, userSession, mapEntryPoint, C16614UyA.PLACE, str, venue2.A02(), venue2.A00.getName(), arrayList, new double[]{venue2.A00().doubleValue(), venue2.A01().doubleValue()});
            A01(ub92);
        }
    }

    public static void A01(C15357Ub9 ub9) {
        String str;
        W05 w05 = ub9.A0D;
        String str2 = ub9.A0J;
        Venue venue = ub9.A0H;
        if (venue != null) {
            str = venue.A04();
        } else {
            str = null;
        }
        w05.A02((0xF) null, (0xF) null, "location_page", "open_map", (String) null, str2, str, (String) null, (Map) null);
    }

    public static void A03(C15357Ub9 ub9, boolean z) {
        if (C51973G9u.A1X(C18621VvE.A00(ub9.A0E, ub9.A08.A00).A04)) {
            return;
        }
        if (ub9.A0E.A02(ub9.A08.A00) || z) {
            ub9.A0E.A01(ub9.A08.A00, false, false);
        }
    }

    public final C227762js BD0() {
        return this.A01;
    }

    public final 0jB E4k() {
        0jB A012 = C18217Vnh.A01(this.A0H);
        HAI hai = this.A08;
        C16672Uz8 uz8 = hai.A00;
        int A002 = hai.A01.A00(uz8);
        0qQ.A0B(uz8, 1);
        A012.A0A("feed_type", uz8.toString());
        A012.A04(AnonymousClass5m1.A01, Long.valueOf((long) A002));
        C324636ze.A00(this.A02).A00(A012);
        return A012;
    }

    public final 0jB E4x() {
        0jB A012 = C18217Vnh.A01(this.A0H);
        C324636ze.A00(this.A02).A00(A012);
        return A012;
    }

    public final void EKl() {
        this.A07.A03();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r17) {
        /*
            r16 = this;
            r11 = r17
            r5 = r16
            r11.ErT(r5)
            r4 = 1
            r11.Eu4(r4)
            com.instagram.model.venue.Venue r3 = r5.A0H
            if (r3 == 0) goto L_0x00ac
            com.instagram.model.venue.LocationDictIntf r0 = r3.A00
            java.lang.String r0 = r0.getName()
            r11.setTitle(r0)
            boolean r0 = r5.A0S
            if (r0 == 0) goto L_0x0044
            com.instagram.common.session.UserSession r0 = r5.A02
            X.2f5 r1 = X.C225892f5.A00(r0)
            X.3Ym r0 = r3.BpO()
            X.3Ym r1 = r1.A0L(r0, r3)
            X.3Ym r0 = X.C243373Ym.SAVED
            if (r1 == r0) goto L_0x002f
            r4 = 0
        L_0x002f:
            X.3JR r2 = new X.3JR
            r2.<init>()
            if (r4 == 0) goto L_0x01da
            java.lang.Integer r0 = X.AnonymousClass05K.A06
        L_0x0038:
            r2.A02(r0)
            r1 = 2
            X.W9v r0 = new X.W9v
            r0.<init>(r1, r5, r3, r4)
            X.DbX.A19(r0, r2, r11)
        L_0x0044:
            X.UlJ r10 = r5.A0Q
            X.VW5 r3 = r10.A03
            X.Ub9 r1 = r3.A02
            com.instagram.model.venue.Venue r0 = r1.A0H
            if (r0 == 0) goto L_0x0053
            com.instagram.model.venue.LocationDictIntf r0 = r0.A00
            r0.getName()
        L_0x0053:
            com.instagram.model.venue.Venue r0 = r1.A0H
            r6 = 0
            if (r0 == 0) goto L_0x00a6
            java.lang.String r2 = r0.A03()
            java.lang.String r0 = "facebook_events"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00a6
            X.UXv r0 = r1.A0F
            if (r0 == 0) goto L_0x006c
            java.lang.String r9 = r0.A06
            if (r9 != 0) goto L_0x0074
        L_0x006c:
            com.instagram.model.venue.Venue r0 = r1.A0H
            com.instagram.model.venue.LocationDictIntf r0 = r0.A00
            java.lang.String r9 = r0.getName()
        L_0x0074:
            com.instagram.model.reels.Reel r8 = r3.A01
            X.1Xj r13 = r3.A00
            android.content.Context r4 = r1.getContext()
            com.instagram.common.session.UserSession r3 = r1.A02
            com.instagram.model.venue.Venue r2 = r1.A0H
            java.lang.String r0 = "LOCATION_PAGE"
            java.lang.String r7 = X.C18792W1y.A02(r4, r3, r2, r0)
            X.UXv r2 = r1.A0F
            if (r2 != 0) goto L_0x01c7
            r14 = 1
        L_0x008b:
            X.UXv r0 = r1.A0F
            if (r0 != 0) goto L_0x01c1
            r15 = 0
        L_0x0090:
            boolean r0 = r1.A0M
            if (r0 == 0) goto L_0x00ad
            com.instagram.model.venue.Venue r0 = r1.A0H
            if (r0 == 0) goto L_0x00ad
            java.lang.Double r0 = r0.A01()
            if (r0 == 0) goto L_0x00ad
            com.instagram.model.venue.Venue r0 = r1.A0H
            java.lang.Double r0 = r0.A00()
            if (r0 == 0) goto L_0x00ad
        L_0x00a6:
            X.Vh9 r1 = r10.A02
            r0 = -1
        L_0x00a9:
            r1.A00(r11, r0)
        L_0x00ac:
            return
        L_0x00ad:
            r0 = 2131627664(0x7f0e0e90, float:1.8882599E38)
            android.view.View r0 = r11.A7q(r0)
            com.instagram.common.session.UserSession r12 = r10.A01
            X.0iw r1 = r10.A00
            X.Wav r5 = new X.Wav
            r5.<init>(r0)
            X.VON r4 = new X.VON
            r4.<init>(r10)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r5.A07
            r0 = 0
            r2.setColorFilter(r0)
            r3 = 8
            if (r8 != 0) goto L_0x0152
            android.content.Context r8 = r2.getContext()
            if (r13 == 0) goto L_0x013c
            com.instagram.model.mediasize.ImageInfo r0 = r13.A1p()
            if (r0 == 0) goto L_0x013c
            com.instagram.model.mediasize.ImageInfo r0 = r13.A1p()
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A01(r8, r0)
            if (r0 == 0) goto L_0x013c
            r2.setUrl(r0, r1)
        L_0x00e5:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r5.A09
            r0.setVisibility(r3)
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r0 = r5.A08
            r0.setVisibility(r3)
        L_0x00ef:
            boolean r8 = X.C13990Tnq.A1a(r7)
            android.widget.TextView r0 = r5.A06
            r0.setText(r9)
            android.widget.TextView r0 = r5.A05
            r0.setText(r7)
            android.widget.TextView r1 = r5.A03
            r2 = 0
            int r0 = X.DbW.A01(r8)
            r1.setVisibility(r0)
            android.widget.TextView r1 = r5.A02
            if (r14 == 0) goto L_0x011d
            r1.setVisibility(r3)
            android.widget.TextView r0 = r5.A04
            r0.setVisibility(r3)
            X.VEU.A00(r5)
        L_0x0116:
            X.Vh9 r1 = r10.A02
            int r0 = r11.AYI()
            goto L_0x00a9
        L_0x011d:
            if (r15 == 0) goto L_0x012e
            r1.setVisibility(r2)
            android.widget.TextView r0 = r5.A04
            r0.setVisibility(r3)
            X.VEU.A00(r5)
            r1.setText(r6)
            goto L_0x0116
        L_0x012e:
            r1.setVisibility(r3)
            android.widget.TextView r1 = r5.A04
            r1.setVisibility(r2)
            r0 = 47
            X.WBA.A00(r1, r0, r4)
            goto L_0x0116
        L_0x013c:
            r0 = 2131238506(0x7f081e6a, float:1.8093293E38)
            X.DbU.A13(r8, r2, r0)
            r0 = 2130970004(0x7f040594, float:1.7548706E38)
            int r0 = X.2Yu.A0H(r8, r0)
            X.DbU.A14(r8, r2, r0)
            r0 = 50
            r2.setPadding(r0, r0, r0, r0)
            goto L_0x00e5
        L_0x0152:
            com.instagram.common.typedurl.ImageUrl r0 = r8.A07()
            boolean r0 = X.C253833rU.A02(r0)
            if (r0 != 0) goto L_0x0163
            com.instagram.common.typedurl.ImageUrl r0 = r8.A07()
            r2.setUrl(r0, r1)
        L_0x0163:
            java.util.List r0 = r8.A0O(r12)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e5
            com.instagram.ui.widget.gradientspinner.GradientSpinner r1 = r5.A09
            r0 = 0
            r1.setVisibility(r0)
            boolean r0 = r8.A16(r12)
            if (r0 == 0) goto L_0x01bd
            r1.A04()
        L_0x017c:
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r1 = r5.A08
            r0 = 2131239758(0x7f08234e, float:1.8095832E38)
            r1.setIconDrawable((int) r0)
            android.content.res.Resources r2 = r2.getResources()
            r1 = 2131967694(0x7f133ece, float:1.9572262E38)
            r12 = 1
            X.1Ns r0 = r8.A0W
            r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = X.AnonymousClass7TF.A0e(r2, r0, r1)
            android.view.View r1 = r5.A00
            r0 = 2131439353(0x7f0b2ef9, float:1.8500659E38)
            android.view.View r0 = r1.requireViewById(r0)
            r0.setContentDescription(r2)
            android.view.View r0 = r5.A01
            X.3NG r2 = new X.3NG
            r2.<init>(r0)
            r2.A0C = r12
            r2.A07 = r12
            r1 = 2
            X.UjW r0 = new X.UjW
            r0.<init>(r1, r4, r5, r8)
            r2.A04 = r0
            r2.A00()
            goto L_0x00ef
        L_0x01bd:
            r1.A02()
            goto L_0x017c
        L_0x01c1:
            boolean r15 = X.C15260UXv.A00(r0)
            goto L_0x0090
        L_0x01c7:
            java.lang.String r6 = r2.A07
            boolean r0 = X.C15260UXv.A00(r2)
            if (r0 != 0) goto L_0x01d2
            r14 = 0
            goto L_0x008b
        L_0x01d2:
            java.lang.String r0 = r2.A07
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            goto L_0x008b
        L_0x01da:
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15357Ub9.configureActionBar(X.2da):void");
    }

    public final C238133Ar getScrollingViewProxy() {
        return this.A07.A06;
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        String A042;
        W05 w05 = this.A0D;
        w05.A04 = "finish_step";
        w05.A07 = "location_page";
        w05.A06 = this.A0J;
        Venue venue = this.A0H;
        if (venue == null) {
            A042 = null;
        } else {
            A042 = venue.A04();
        }
        w05.A05 = A042;
        w05.A01();
        return this.A0A.onBackPressed();
    }

    public final 0jB E4l(1Xj r3) {
        0jB E4k = E4k();
        E4k.A06(C18217Vnh.A00(r3));
        return E4k;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: X.4DV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: X.0iw} */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.5ts, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r22v0, types: [X.2s5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v5, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r34) {
        /*
            r33 = this;
            r0 = 1740573252(0x67bf0a44, float:1.8043227E24)
            int r18 = X.AnonymousClass0fD.A02(r0)
            r2 = r33
            r5 = r34
            X.C15357Ub9.super.onCreate(r5)
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r2.A0I = r0
            com.instagram.common.session.UserSession r4 = X.DbX.A0U(r2)
            r2.A02 = r4
            r1 = 31784961(0x1e50001, float:8.412132E-38)
            java.lang.String r0 = "feed"
            X.Dbx r3 = new X.Dbx
            r3.<init>(r4, r0, r1)
            r2.A00 = r3
            android.content.Context r1 = r2.getContext()
            com.instagram.common.session.UserSession r0 = r2.A02
            X.2cc r0 = X.C71342cb.A00(r0)
            r3.A0R(r1, r0, r2)
            android.os.Bundle r1 = r2.requireArguments()
            r0 = 229(0xe5, float:3.21E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            r2.A0J = r0
            if (r34 == 0) goto L_0x004f
            java.lang.String r0 = "LocationFeedFragment.SAVED_INSTANCE_STATE_VENUE"
            android.os.Parcelable r0 = r5.getParcelable(r0)
            com.instagram.model.venue.Venue r0 = (com.instagram.model.venue.Venue) r0
            r2.A0H = r0
        L_0x004f:
            com.instagram.common.session.UserSession r1 = r2.A02
            X.W05 r0 = new X.W05
            r0.<init>(r1)
            r2.A0D = r0
            android.content.Context r7 = r2.getContext()
            r3 = 0
            X.0qQ.A0B(r7, r3)
            java.util.List r1 = X.VQP.A01
            if (r1 != 0) goto L_0x0098
            X.Uz8 r4 = X.C16672Uz8.TOP
            r0 = 2131975492(0x7f135d44, float:1.9588078E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r7, r0)
            r0 = 2131963291(0x7f132d9b, float:1.9563331E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r7, r0)
            X.VsV r6 = new X.VsV
            r6.<init>(r4, r1, r0)
            X.Uz8 r5 = X.C16672Uz8.RECENT
            r0 = 2131971353(0x7f134d19, float:1.9579683E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r7, r0)
            r0 = 2131963292(0x7f132d9c, float:1.9563333E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r7, r0)
            X.VsV r0 = new X.VsV
            r0.<init>(r5, r4, r1)
            X.VsV[] r0 = new X.C18479VsV[]{r6, r0}
            java.util.ArrayList r1 = X.0sr.A1M(r0)
            X.VQP.A01 = r1
        L_0x0098:
            r2.A0K = r1
            X.Uz8 r6 = X.C16672Uz8.TOP
            X.5ts r0 = new X.5ts
            r0.<init>()
            r0.A02 = r1
            r0.A00 = r6
            r2.A04 = r0
            java.lang.String r0 = r2.A0J
            boolean r1 = X.C13990Tnq.A1a(r0)
            java.lang.String r0 = "Expecting non-empty Venue ID for location page."
            X.17k.A0H(r1, r0)
            android.content.Context r1 = r2.getContext()
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.0qQ.A0B(r1, r3)
            r17 = 0
            r0 = r17
            X.2js r0 = X.C227752jr.A00(r1, r0, r3)
            r2.A01 = r0
            X.TpP r0 = new X.TpP
            r0.<init>()
            r2.A0N = r0
            X.Wed r0 = new X.Wed
            r0.<init>(r2)
            r2.A0R = r0
            X.2el r0 = X.C51969G9p.A0k()
            r2.A0O = r0
            com.instagram.common.session.UserSession r0 = r2.A02
            X.0Tu r1 = X.0Tu.A05
            r4 = 36312823206249738(0x8102520000050a, double:3.0277138434103964E-306)
            boolean r0 = X.182.A06(r1, r0, r4)
            r2.A0M = r0
            com.instagram.common.session.UserSession r0 = r2.A02
            r4 = 36313682199709888(0x81031a000008c0, double:3.028257074333484E-306)
            boolean r0 = X.DbY.A1Y(r1, r0, r4)
            r2.A0S = r0
            androidx.fragment.app.FragmentActivity r7 = r2.getActivity()
            com.instagram.common.session.UserSession r4 = r2.A02
            java.lang.String r0 = r2.A0I
            r15 = 1
            r11 = -1
            r8 = r4
            r9 = r2
            r10 = r0
            r13 = r3
            r14 = r15
            X.X9Q r16 = X.C16942VBu.A00(r7, r8, r9, r10, r11, r13, r14)
            com.instagram.common.session.UserSession r5 = r2.A02
            java.util.List r0 = r2.A0K
            java.util.List r10 = X.VBO.A00(r0)
            X.Wed r4 = r2.A0R
            X.72b r8 = new X.72b
            r8.<init>()
            X.JO7 r0 = r2.A0X
            r7 = r0
            r9 = r4
            X.HAI r14 = X.HAI.A01(r5, r6, r7, r8, r9, r10)
            r2.A08 = r14
            com.instagram.common.session.UserSession r13 = r2.A02
            X.WW4 r12 = r2.A0Y
            X.X41 r11 = r2.A0Z
            X.TpP r10 = r2.A0N
            java.lang.String r9 = r2.A0I
            r7 = 2
            X.0qQ.A0B(r13, r7)
            X.C51974G9v.A1N(r12, r11, r10)
            r0 = 9
            android.content.Context r19 = X.DbT.A06(r2, r9, r0)
            X.2s4 r22 = new X.2s4
            r22.<init>()
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x0271
            android.content.Context r5 = r2.requireContext()
            com.instagram.common.session.UserSession r4 = r2.A02
            X.VOO r0 = new X.VOO
            r0.<init>(r2)
            X.UiX r8 = new X.UiX
            r8.<init>(r5, r2, r4, r0)
        L_0x0152:
            androidx.fragment.app.FragmentActivity r6 = r2.getActivity()
            X.Wed r5 = r2.A0R
            X.HAI r4 = r2.A08
            com.instagram.common.session.UserSession r0 = r2.A02
            r28 = r2
            r29 = r17
            r30 = r9
            r31 = r3
            r32 = r3
            r23 = r10
            r24 = r12
            r25 = r14
            r26 = r11
            r27 = r16
            r20 = r2
            r21 = r13
            X.2tC r10 = X.C14370Tuz.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r10.A01(r8)
            X.X3p r9 = r2.A0V
            X.Uhz r8 = new X.Uhz
            r8.<init>(r9)
            r10.A01(r8)
            X.Mmq r8 = new X.Mmq
            r8.<init>()
            r10.A01(r8)
            X.0qQ.A0B(r6, r15)
            X.AnonymousClass7TF.A1C(r5, r7, r4)
            r8 = 4
            X.0qQ.A0B(r0, r8)
            X.TsA r9 = new X.TsA
            r19 = r9
            r20 = r6
            r21 = r2
            r22 = r10
            r23 = r0
            r24 = r4
            r25 = r17
            r26 = r17
            r27 = r17
            r28 = r17
            r29 = r5
            r30 = r15
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r2.A06 = r9
            com.instagram.common.session.UserSession r0 = r2.A02
            X.TvE r4 = new X.TvE
            r4.<init>(r0)
            X.X3y r0 = r2.A0W
            r4.A01(r0)
            X.TsA r0 = r2.A06
            X.0qQ.A0B(r0, r3)
            r4.A06 = r0
            X.HAI r0 = r2.A08
            X.0qQ.A0B(r0, r3)
            r4.A08 = r0
            r0 = r16
            r4.A0A = r0
            r4.A04 = r2
            X.32Q r0 = X.AnonymousClass32Q.A00
            r4.A02(r0)
            X.2el r0 = r2.A0O
            r4.A00(r0)
            X.TpO r0 = new X.TpO
            r0.<init>(r4)
            r2.A07 = r0
            android.content.Context r9 = r2.getContext()
            com.instagram.common.session.UserSession r6 = r2.A02
            X.HAI r5 = r2.A08
            java.lang.String r0 = "feed_location"
            X.5r2 r4 = new X.5r2
            r4.<init>(r6, r9, r0)
            X.Uh0 r0 = new X.Uh0
            r14 = r5
            r13 = r5
            r9 = r0
            r10 = r2
            r11 = r6
            r12 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            r2.A0P = r0
            r2.registerLifecycleListener(r0)
            androidx.fragment.app.FragmentActivity r20 = r2.requireActivity()
            X.0hq r6 = r2.mFragmentManager
            com.instagram.common.session.UserSession r5 = r2.A02
            X.TpO r0 = r2.A07
            X.TsA r4 = r0.A0E
            X.2uE r0 = new X.2uE
            r22 = r6
            r23 = r5
            r24 = r2
            r25 = r4
            r27 = r3
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r2.A0A = r0
            android.content.Context r20 = r2.getContext()
            X.0gy r21 = X.AnonymousClass07i.A00(r2)
            com.instagram.common.session.UserSession r10 = r2.A02
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.List r0 = r2.A0K
            java.util.List r0 = X.VBO.A00(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x023e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x027d
            java.lang.Object r6 = r11.next()
            X.Uz8 r6 = (X.C16672Uz8) r6
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
            com.instagram.common.session.UserSession r0 = r2.A02
            X.6z9 r25 = X.C51970G9q.A0g(r4, r2, r0)
            java.lang.String r5 = r2.A0J
            com.instagram.common.session.UserSession r4 = r2.A02
            java.lang.String r28 = X.AnonymousClass7TF.A0b()
            X.Vbo r0 = new X.Vbo
            r27 = r5
            r29 = r17
            r30 = r3
            r22 = r0
            r23 = r4
            r24 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            r9.put(r6, r0)
            goto L_0x023e
        L_0x0271:
            X.VOP r0 = new X.VOP
            r0.<init>(r2)
            X.Uhy r8 = new X.Uhy
            r8.<init>(r0)
            goto L_0x0152
        L_0x027d:
            java.lang.String r12 = r2.A0J
            X.WYy r11 = new X.WYy
            r11.<init>(r2)
            X.WYm r6 = new X.WYm
            r6.<init>(r2)
            X.WYp r5 = new X.WYp
            r5.<init>(r2)
            X.WYz r4 = new X.WYz
            r4.<init>(r2)
            X.VvE r0 = new X.VvE
            r26 = r4
            r27 = r12
            r28 = r9
            r29 = r3
            r22 = r10
            r23 = r6
            r24 = r5
            r25 = r11
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r2.A0E = r0
            X.VW5 r9 = new X.VW5
            r9.<init>(r2)
            r2.A0G = r9
            X.TpO r0 = r2.A07
            X.2rO r6 = r0.A0B
            X.2js r5 = r2.A01
            com.instagram.common.session.UserSession r4 = r2.A02
            X.Vfr r3 = new X.Vfr
            r3.<init>(r2)
            X.UlJ r0 = new X.UlJ
            r19 = r0
            r20 = r2
            r21 = r5
            r22 = r6
            r23 = r2
            r24 = r4
            r25 = r9
            r26 = r3
            r27 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r2.A0Q = r0
            com.instagram.common.session.UserSession r5 = r2.A02
            java.lang.String r3 = r2.A0I
            X.WWF r0 = new X.WWF
            r0.<init>(r2, r15)
            X.Hzv r4 = new X.Hzv
            r9 = r4
            r10 = r2
            r11 = r5
            r12 = r0
            r13 = r17
            r14 = r3
            r9.<init>(r10, r11, r12, r13, r14)
            X.2el r3 = r2.A0O
            X.Hq5 r0 = new X.Hq5
            r0.<init>(r3, r4)
            r2.A0B = r0
            com.instagram.common.session.UserSession r5 = r2.A02
            X.X6c r4 = r2.A0U
            com.instagram.model.venue.Venue r0 = r2.A0H
            X.0jB r0 = X.C18217Vnh.A01(r0)
            X.0xF r3 = r0.A00()
            X.VhB r0 = new X.VhB
            r0.<init>(r2, r3, r5, r4)
            r2.A0C = r0
            com.instagram.common.session.UserSession r4 = r2.A02
            X.WWR r3 = new X.WWR
            r3.<init>(r2, r8)
            X.36D r0 = new X.36D
            r0.<init>(r4, r3)
            r2.A09 = r0
            java.lang.String r4 = r2.A0I
            com.instagram.common.session.UserSession r3 = r2.A02
            androidx.fragment.app.FragmentActivity r10 = r2.requireActivity()
            X.GXC r0 = new X.GXC
            r8 = r0
            r9 = r2
            r11 = r3
            r12 = r13
            r13 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            r2.A05 = r0
            X.2jd r6 = new X.2jd
            r6.<init>()
            X.36D r0 = r2.A09
            r6.A0E(r0)
            android.content.Context r5 = r2.getContext()
            com.instagram.common.session.UserSession r4 = r2.A02
            X.Wfd r3 = new X.Wfd
            r3.<init>(r2, r7)
            X.7Q8 r0 = new X.7Q8
            r0.<init>(r5, r4, r3)
            r6.A0E(r0)
            X.2uE r0 = r2.A0A
            r6.A0E(r0)
            com.instagram.common.session.UserSession r3 = r2.A02
            X.2wt r0 = new X.2wt
            r0.<init>(r2, r3, r2)
            r6.A0E(r0)
            X.TpP r0 = r2.A0N
            r6.A0E(r0)
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
            com.instagram.common.session.UserSession r3 = r2.A02
            r0 = 23614405(0x16853c5, float:4.2671772E-38)
            X.2nK r5 = new X.2nK
            r5.<init>(r4, r2, r3, r0)
            r6.A0E(r5)
            X.GXC r0 = r2.A05
            r6.A0E(r0)
            r2.registerLifecycleListenerSet(r6)
            X.TpO r4 = r2.A07
            X.2js r3 = r2.A01
            X.UlJ r0 = r2.A0Q
            X.3jg[] r0 = new X.C249403jg[]{r3, r5, r0}
            r4.A09(r0)
            A02(r2)
            X.W05 r3 = r2.A0D
            java.lang.String r0 = "start_step"
            r3.A04 = r0
            java.lang.String r0 = "location_page"
            r3.A07 = r0
            java.lang.String r0 = r2.A0J
            r3.A06 = r0
            com.instagram.common.session.UserSession r0 = r2.A02
            java.lang.String r0 = X.W05.A00(r0)
            r3.A02 = r0
            com.instagram.model.venue.Venue r0 = r2.A0H
            if (r0 == 0) goto L_0x03aa
            X.W05 r3 = r2.A0D
            java.lang.String r0 = r0.A04()
            r3.A05 = r0
        L_0x03aa:
            X.W05 r0 = r2.A0D
            r0.A01()
            com.instagram.model.venue.Venue r0 = r2.A0H
            r2.A0H = r0
            X.C13990Tnq.A1L(r2)
            com.instagram.model.venue.Venue r6 = r2.A0H
            if (r6 == 0) goto L_0x03e8
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x03e8
            com.instagram.common.session.UserSession r0 = r2.A02
            r3 = 36319635024387628(0x81088400001e2c, double:3.032021664629788E-306)
            boolean r0 = X.DbY.A1Y(r1, r0, r3)
            com.instagram.common.session.UserSession r3 = r2.A02
            if (r0 == 0) goto L_0x03fe
            X.1vn r5 = X.1vm.A01(r3)
            java.lang.String r0 = r6.A05()
            com.facebook.pando.PandoGraphQLRequest r4 = X.C18216Vng.A00(r0)
            r0 = 5
            X.WHv r3 = new X.WHv
            r3.<init>(r0, r2, r6)
            r1 = 6
            X.WHc r0 = new X.WHc
            r0.<init>(r1)
            r5.ATL(r0, r3, r4)
        L_0x03e8:
            com.instagram.common.session.UserSession r0 = r2.A02
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.WQB> r1 = X.WQB.class
            X.1wn r0 = r2.A0T
            r3.A01(r0, r1)
            r1 = 1355219720(0x50c70308, float:2.67109171E10)
            r0 = r18
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x03fe:
            java.lang.String r1 = r6.A05()
            X.WYl r0 = new X.WYl
            r0.<init>(r2)
            X.1OC r0 = X.C18216Vng.A01(r3, r0, r1)
            r2.schedule(r0)
            goto L_0x03e8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15357Ub9.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1513503210);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_grid_recyclerview_wrapper);
        AnonymousClass0fD.A09(-2116833638, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-528327723);
        super.onDestroy();
        C15694Uh0 uh0 = this.A0P;
        if (uh0 != null) {
            unregisterLifecycleListener(uh0);
        }
        AnonymousClass1Nd.A00(this.A02).A02(this.A0T, WQB.class);
        unregisterLifecycleListener(this.A05);
        AnonymousClass0fD.A09(1688573729, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(725657258);
        super.onDestroyView();
        this.A07.A01();
        LifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(1844584992, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-850256391);
        this.A07.A0D.AGS();
        C15357Ub9.super.onPause();
        this.A01.A09(this.A07.A06);
        AnonymousClass0fD.A09(-470229580, A022);
    }

    public final void onResume() {
        String str;
        View view;
        VW4 vw4;
        int A022 = AnonymousClass0fD.A02(426929885);
        super.onResume();
        this.A0Q.A02();
        this.A0Q.DIu();
        this.A07.A0D.EHL();
        UserSession userSession = this.A02;
        0qQ.A0B(userSession, 0);
        Class<C15934Ul1> cls = C15934Ul1.class;
        C20653Wwl wwl = C20653Wwl.A00;
        String str2 = this.A0I;
        0qQ.A0B(str2, 0);
        if (((C17957Vip) userSession.A01(cls, wwl)).A00.containsKey(str2)) {
            UserSession userSession2 = this.A02;
            0qQ.A0B(userSession2, 0);
            String str3 = this.A0I;
            0qQ.A0B(str3, 0);
            C15938Ul5 ul5 = (C15938Ul5) ((C17625VbH) ((C17957Vip) userSession2.A01(cls, wwl)).A00.remove(str3));
            if (ul5.A04) {
                C18621VvE vvE = this.A0E;
                C16672Uz8 uz8 = ul5.A00;
                if (uz8 != null) {
                    String str4 = ul5.A00;
                    List A0a = 00k.A0a(ul5.A06);
                    if (A0a.isEmpty()) {
                        vw4 = null;
                    } else {
                        vw4 = ((C17363VSq) C66582MXn.A0r(A0a)).A00;
                    }
                    String str5 = ul5.A01;
                    if (str5 != null) {
                        Map map = vvE.A08;
                        Object obj = map.get(uz8);
                        obj.getClass();
                        map.put(uz8, new C17658Vbo(vvE.A02, uz8, ((C17658Vbo) obj).A04.A00(str4), vw4, vvE.A07, str5, (String) null, vvE.A09));
                    } else {
                        str = "feedRequestSessionId";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                str = "tab";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            List list = ul5.A06;
            if (AnonymousClass7TE.A1b(list)) {
                int i = 0;
                while (i < list.size()) {
                    C17363VSq vSq = (C17363VSq) list.get(i);
                    if (AnonymousClass7TE.A1a(ul5.A05.get(i))) {
                        HAI hai = this.A08;
                        C16672Uz8 uz82 = ul5.A00;
                        if (uz82 != null) {
                            hai.A05(uz82);
                        } else {
                            str = "tab";
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                    HAI hai2 = this.A08;
                    C16672Uz8 uz83 = ul5.A00;
                    if (uz83 != null) {
                        hai2.A06(uz83, vSq.A01);
                        i++;
                    } else {
                        str = "tab";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            String str6 = ul5.A02;
            if (!(str6 == null || str6.length() == 0 || (view = this.mView) == null)) {
                view.post(new C20233WnX(ul5, this));
            }
        }
        AnonymousClass0fD.A09(2140271856, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("LocationFeedFragment.SAVED_INSTANCE_STATE_VENUE", this.A0H);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A07.A05(view, C51973G9u.A1X(C18621VvE.A00(this.A0E, this.A08.A00).A04));
        String str = null;
        this.A07.A04.setItemAnimator((AnonymousClass3AS) null);
        C14074TpO.A00(this.A07, false, true);
        this.A07.A06(this.A0R);
        UlJ ulJ = this.A0Q;
        ulJ.A01.A06(ulJ.A02, ulJ.A05.getScrollingViewProxy(), ulJ.A04.A00);
        C14227TsA.A00(this.A06);
        UserSession userSession = this.A02;
        String str2 = this.A0J;
        Venue venue = this.A0H;
        if (venue != null) {
            str = venue.A04();
        }
        0qQ.A0B(userSession, 0);
        0xF r4 = new 0xF();
        if (str2 == null) {
            str2 = "";
        }
        0xF.A00(r4, str2, "page_id");
        if (str == null) {
            str = "";
        }
        0xF.A00(r4, str, "location_id");
        0xI A042 = 1Q9.A01(C273654mx.A00(2119)).A04("business_profile_start_step");
        A042.A0C("step", "location_feed");
        A042.A05(r4, C273654mx.A00(2236));
        String A002 = W05.A00(userSession);
        if (A002 != null) {
            A042.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A002);
        }
        DbU.A1R(A042, userSession);
    }
}
