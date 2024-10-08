package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IgUserRelatedAccountTypeEnum;
import com.instagram.api.schemas.UserBannerInlineOtherProfileDict;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.70d  reason: invalid class name and case insensitive filesystem */
public final class C3248670d implements C3248770e {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AnonymousClass4DH A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ JVM A05;
    public final /* synthetic */ C234502xy A06;
    public final /* synthetic */ AnonymousClass70J A07;
    public final /* synthetic */ User A08;
    public final /* synthetic */ boolean A09;

    public final void Cuo(String str, boolean z, String str2) {
        String str3 = str;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 2);
        UserSession userSession = this.A04;
        1Ln A002 = LTH.A00(new LTH(userSession));
        if (A002.A00.isSampled()) {
            A002.A0l("ai_profile_banner_click");
            A002.A0x(0se.A0M(new 0eP("banner_position", String.valueOf(z ? 1 : 0))));
            A002.A0j(00y.A0n(10, str2));
            A002.Cgf();
        }
        new AiAgentThreadLauncher(userSession).A08(this.A02.requireActivity(), this.A03, str3, "profile_banner", (String) null, (String) null, true);
    }

    public final void DSi(MusicAssetModel musicAssetModel) {
        MusicAssetModel musicAssetModel2 = musicAssetModel;
        0qQ.A0B(musicAssetModel, 0);
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(this.A01);
        if (A012 != null) {
            C234502xy r8 = this.A06;
            Context context = this.A00;
            UserSession userSession = this.A04;
            ((AnonymousClass37F) A012).A0H = new C50981FmU(context, this.A02, this.A03, userSession, musicAssetModel2, r8, this.A07, this.A08, this.A09);
            A012.A0B();
        }
        Context context2 = this.A00;
        UserSession userSession2 = this.A04;
        AnonymousClass4DH r4 = this.A02;
        User user = this.A08;
        boolean z = this.A09;
        C234502xy r82 = this.A06;
        AnonymousClass0iw r5 = this.A03;
        AnonymousClass70J r9 = this.A07;
        AnonymousClass708.A02(context2, r4, r5, userSession2, musicAssetModel2, r82, r9, user, z);
        r9.A06("tap_music_banner");
    }

    public final void Dcy(User user) {
        IgUserRelatedAccountTypeEnum AXx;
        User user2 = this.A08;
        if (user2.A04() != 1 || user2.A0C() == null) {
            Context context = this.A00;
            UserSession userSession = this.A04;
            String fbidV2 = user.A03.getFbidV2();
            String A042 = 182.A04(0Tu.A05, userSession, 36885771845501595L);
            if (00l.A0W(A042) || A042.equals("None")) {
                A042 = "Other profiles";
            }
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
            igBloksScreenConfig.A0l = false;
            igBloksScreenConfig.A0U = A042;
            igBloksScreenConfig.A0R = "com.bloks.www.nme.ig_bio.related_account_display";
            igBloksScreenConfig.A0i = true;
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            new BitSet(0);
            hashMap.put("profile_owner_fbid", fbidV2);
            C46649DiU A062 = C46649DiU.A06("com.bloks.www.nme.ig_bio.related_account_display", C359608dC.A01(hashMap), hashMap2);
            A062.A00 = -1;
            A062.A05 = null;
            A062.A01 = 0;
            A062.A06 = null;
            A062.A03 = null;
            A062.A02 = null;
            A062.A04 = null;
            A062.A0H(hashMap3);
            A062.A0E(context, igBloksScreenConfig);
        } else {
            AnonymousClass37E r0 = AnonymousClass37D.A00;
            FragmentActivity fragmentActivity = this.A01;
            AnonymousClass37D A012 = r0.A01(fragmentActivity);
            if (A012 != null) {
                A012.A0B();
            }
            Context context2 = this.A00;
            UserSession userSession2 = this.A04;
            AnonymousClass0iw r9 = this.A03;
            UserBannerInlineOtherProfileDict A0C = user2.A0C();
            if (!(A0C == null || (AXx = A0C.AXx()) == null)) {
                int ordinal = AXx.ordinal();
                if (ordinal == 1) {
                    boolean z = false;
                    if (FFi.A00(context2.getPackageManager()) == null) {
                        z = true;
                    }
                    FFi.A02(context2, r9, userSession2, "ig_profile_bio", 0mp.A06("https://m.facebook.com/%s", new Object[]{A0C.AXs()}), 0mp.A06(C10065Rm2.A00, new Object[]{A0C.AXs()}), (String) null, (String) null, z);
                } else if (ordinal == 2) {
                    C46474Dfc A013 = C46548Dgp.A01(userSession2, A0C.AXs(), "profile_bio_user_tag", r9.getModuleName());
                    C309516Yo r5 = new C309516Yo(fragmentActivity, userSession2);
                    r5.A0F = true;
                    r5.A0D(C46447Df9.A03().A01.A02(userSession2, A013.A04()));
                    r5.A04();
                }
            }
        }
        this.A07.A06("tap_related_accounts_banner");
    }

    public final void DdX() {
    }

    public final void DdY() {
    }

    public C3248670d(Context context, FragmentActivity fragmentActivity, AnonymousClass4DH r3, AnonymousClass0iw r4, UserSession userSession, JVM jvm, C234502xy r7, AnonymousClass70J r8, User user, boolean z) {
        this.A05 = jvm;
        this.A06 = r7;
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A04 = userSession;
        this.A02 = r3;
        this.A08 = user;
        this.A09 = z;
        this.A03 = r4;
        this.A07 = r8;
    }

    public final JVM BUt() {
        return this.A05;
    }

    public final C234502xy BUx() {
        return this.A06;
    }

    public final void CuF() {
        this.A07.A06("tap_add_school_banner");
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_ARGUMENT_ENTRYPOINT", "profile_bio");
        AnonymousClass4DH r0 = this.A02;
        AnonymousClass6W8 r2 = new AnonymousClass6W8(r0.getActivity(), bundle, this.A04, ModalActivity.class, "school_add");
        r2.A08();
        r2.A0A(r0.getActivity(), 7002);
    }

    public final void D1Q(C2609247o r4, AnonymousClass0iw r5, String str) {
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(this.A01);
        if (A012 != null) {
            A012.A0B();
        }
        AnonymousClass70J r1 = this.A07;
        r1.A02().D1Q(r4, r5, "user_profile_header");
        r1.A06("tap_channel_banner");
    }

    public final void DDg(DU0 du0, User user) {
        User user2;
        String Aoi;
        String str;
        Long l;
        List CD6;
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(this.A01);
        if (A012 != null) {
            A012.A0B();
        }
        AnonymousClass70J r2 = this.A07;
        C320026rc r7 = (C320026rc) r2.A07.A0Z.getValue();
        ProductCollection Axw = du0.Axw();
        if (Axw == null || (CD6 = Axw.CD6()) == null) {
            user2 = null;
        } else {
            user2 = (User) 00k.A0J(CD6);
        }
        ProductCollection Axw2 = du0.Axw();
        if (!(Axw2 == null || (Aoi = Axw2.Aoi()) == null || Aoi.length() <= 0 || user2 == null)) {
            user2.getUsername();
            if (AnonymousClass3ZA.A00(user2) != null) {
                UserSession userSession = r7.A02;
                String moduleName = r7.A04.getModuleName();
                AnonymousClass4DU r6 = r7.A03;
                String A002 = AnonymousClass3ZA.A00(user2);
                ProductCollection Axw3 = du0.Axw();
                String str2 = null;
                if (Axw3 != null) {
                    str = Axw3.Aoi();
                } else {
                    str = null;
                }
                0bb r9 = new 0bb();
                if (str != null) {
                    l = 00y.A0n(10, str);
                } else {
                    l = null;
                }
                r9.A05("incentive_id", l);
                r9.A06("product_collection_type", "discount");
                0wc A013 = AnonymousClass0kN.A01(r6, userSession);
                1Ln r8 = new 1Ln(A013.A00(A013.A00, "instagram_expiring_discount_tap"), 287);
                Long l2 = null;
                if (r8.A00.isSampled()) {
                    String moduleName2 = r6.getModuleName();
                    if (moduleName2 == null) {
                        moduleName2 = "";
                    }
                    r8.A0R("container_module", moduleName2);
                    r8.A0k("expiring_discount_tap");
                    r8.A0R("submodule", "profile_featured_events_header");
                    r8.A0R("prior_module", moduleName);
                    if (A002 != null) {
                        l2 = C263944Ny.A00(A002).A00;
                    }
                    r8.A0Q("merchant_id", l2);
                    r8.A0N(r9, "collections_logging_info");
                    r8.Cgf();
                }
                C18025Vk1 A0J = C249713kF.A00.A0J(r7.A01, userSession, C16675UzB.DISCOUNTS, r7.A06, r6.getModuleName());
                A0J.A0A = "profile_featured_events_header";
                ProductCollection Axw4 = du0.Axw();
                if (Axw4 != null) {
                    str2 = Axw4.Aoi();
                }
                A0J.A04 = str2;
                A0J.A08 = AnonymousClass3ZA.A00(user2);
                A0J.A0D = user2.getUsername();
                A0J.A00();
            }
        }
        r2.A06("tap_expiring_discount");
    }

    public final void DE7(User user, boolean z) {
        String str;
        String A042 = 182.A04(0Tu.A05, this.A04, 36883070310089193L);
        if (z) {
            str = "banner_bottom_sheet";
        } else {
            str = "banner";
        }
        AnonymousClass70J r2 = this.A07;
        r2.A02().A0A(this.A03, user, str, A042);
        r2.A06("tap_facebook_page_banner");
    }

    public final void DE8(boolean z) {
        String str;
        String A042 = 182.A04(0Tu.A05, this.A04, 36883070310023656L);
        if (z) {
            str = "banner_bottom_sheet";
        } else {
            str = "banner";
        }
        AnonymousClass70J r2 = this.A07;
        r2.A02().A0B(this.A03, str, A042);
        r2.A06("tap_facebook_profile_banner");
    }

    public final void DHI(String str, String str2, boolean z, String str3) {
        String str4 = str;
        0qQ.A0B(str, 0);
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(this.A01);
        if (A012 != null) {
            A012.A0B();
        }
        AnonymousClass70J r2 = this.A07;
        C320026rc r0 = (C320026rc) r2.A07.A0Z.getValue();
        UserSession userSession = r0.A02;
        UserDetailFragment userDetailFragment = r0.A04;
        Dc6 dc6 = r0.A05;
        String A032 = dc6.A03();
        0wc A013 = AnonymousClass0kN.A01(userDetailFragment, userSession);
        0Aj A002 = A013.A00(A013.A00, "ig_cg_click_open_fundraiser");
        A002.AAJ("source_name", "USER_PROFILE");
        A002.A9F("fundraiser_id", Long.valueOf(Long.parseLong(str)));
        A002.A9F("source_owner_id", Long.valueOf(Long.parseLong(A032)));
        A002.Cgf();
        LTV.A09(userDetailFragment.requireActivity(), userSession, str4, "USER_PROFILE", dc6.A03(), (String) null);
        r2.A06("tap_fundraiser_banner");
    }

    public final void Dgw() {
        this.A07.A06("tap_school_banner");
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_ARGUMENT_ENTRYPOINT", "profile_bio");
        C54672HOd A002 = C55126Hca.A00((C54672HOd) null, bundle.getString("BUNDLE_ARGUMENT_ENTRYPOINT"));
        C54155H0z h0z = new C54155H0z();
        h0z.A00 = A002;
        C309516Yo r1 = new C309516Yo(this.A02.requireActivity(), this.A04);
        r1.A0B((Bundle) null, h0z);
        r1.A0F = true;
        r1.A04();
    }

    public final void DrI() {
        C49965FGy fGy = C49965FGy.A00;
        UserSession userSession = this.A04;
        FragmentActivity fragmentActivity = this.A01;
        AnonymousClass0iw r0 = this.A03;
        User user = this.A08;
        fGy.A08(fragmentActivity, r0, userSession, user);
        if (C319886rO.A06(userSession) && 182.A06(0Tu.A05, userSession, 36318887704074860L)) {
            user.A04 = 0;
        }
    }

    public final void DvH(UpcomingEvent upcomingEvent, User user) {
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(this.A01);
        if (A012 != null) {
            ((AnonymousClass37F) A012).A0H = new C40656AgW(this.A07, upcomingEvent, user);
            A012.A0B();
        }
        AnonymousClass70J r1 = this.A07;
        ((C320026rc) r1.A07.A0Z.getValue()).A00(upcomingEvent, user);
        r1.A06("tap_upcoming_event_banner");
    }
}
