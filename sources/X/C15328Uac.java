package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.android.R;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Uac  reason: case insensitive filesystem */
public final class C15328Uac extends AnonymousClass4DH implements AnonymousClass4DR, C229132mt, AnonymousClass4DS, X8N {
    public static final String __redex_internal_original_name = "PromoteAdToolsFragment";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Dialog A04;
    public C61071Jw9 A05;
    public C61071Jw9 A06;
    public C18662VwK A07;
    public WT7 A08;
    public WGU A09;
    public V42 A0A;
    public C15480UdV A0B;
    public C18641Vvg A0C;
    public C18067Vkt A0D;
    public C19176WOi A0E;
    public C19288WSw A0F;
    public C18419VrO A0G;
    public C238143As A0H;
    public 1Av A0I;
    public AnonymousClass3AD A0J;
    public SpinnerImageView A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q = "IG_BOOST";
    public List A0R = new ArrayList();
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public int A0Z;
    public String A0a;
    public final List A0b = new ArrayList();
    public final List A0c = new ArrayList();
    public final List A0d = new ArrayList();
    public final List A0e = new ArrayList();
    public final AnonymousClass0eM A0f = C227642jf.A02(this);
    public final 1wn A0g = new C19221WQb(this, 10);
    public final 1wn A0h = new C19221WQb(this, 11);

    public static final void A09(C15328Uac uac) {
        uac.A01 = 0;
        uac.A0c.clear();
        uac.A0d.clear();
        uac.A0T = false;
        uac.A0S = false;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.07Z, java.lang.Object, X.Uac] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x006d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0B(X.C15328Uac r9, java.lang.String r10) {
        /*
            r6 = 0
            r9.A0S = r6
            X.Vvg r4 = r9.A0C
            java.lang.String r8 = "promoteAdsManagerDataFetcher"
            r5 = 0
            if (r4 == 0) goto L_0x00d1
            r0 = 8
            X.Ufn r3 = new X.Ufn
            r3.<init>(r9, r0)
            com.instagram.common.session.UserSession r0 = r4.A02
            X.0qQ.A0B(r0, r6)
            r7 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r0, r7)
            r2.A04()
            java.lang.String r0 = "aymt/fetch_aymt_channel/"
            r2.A0A(r0)
            java.lang.String r1 = "INSTAGRAM_PROMOTIONS_MANAGER"
            java.lang.String r0 = "channel_surface"
            r2.A9m(r0, r1)
            java.lang.Class<X.UXQ> r1 = X.UXQ.class
            java.lang.Class<X.VmF> r0 = X.C18139VmF.class
            X.1OC r0 = X.DbT.A0R(r5, r2, r1, r0, r6)
            X.C18641Vvg.A00(r4, r3, r0)
            java.lang.String r2 = r9.A0a
            X.Vvg r1 = r9.A0C
            if (r1 == 0) goto L_0x00d1
            X.Ufe r0 = new X.Ufe
            r0.<init>(r10, r9, r6)
            r1.A02(r0, r10, r2)
            X.0xx r0 = X.AnonymousClass07a.A00(r9)
            X.MG7.A01(r9, r0, r6)
            boolean r0 = r9.A0X
            if (r0 == 0) goto L_0x00a8
            X.0eM r0 = r9.A0f
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0qQ.A0B(r3, r6)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318256339884095(0x8107430000183f, double:3.031149778998237E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = "INBOX"
            r9.A0Q = r0
        L_0x0069:
            X.Vvg r3 = r9.A0C
            if (r3 == 0) goto L_0x00d1
            java.lang.String r2 = r9.A0Q
            r1 = 10
            X.Ufn r0 = new X.Ufn
            r0.<init>(r9, r1)
            r3.A01(r0, r2)
            A06(r9)
            X.0eM r0 = r9.A0f
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36612603333581156(0x8212f800001964, double:3.2172960030524676E-306)
            long r0 = X.182.A01(r2, r3, r0)
            int r5 = (int) r0
            X.Vvg r4 = r9.A0C
            if (r4 == 0) goto L_0x00d1
            int r3 = r9.A01
            X.UfW r2 = new X.UfW
            r2.<init>(r9, r5)
            com.instagram.common.session.UserSession r1 = r4.A02
            java.lang.String r0 = "IMPORTANT_V2"
            X.1OC r0 = X.C18146VmM.A00(r1, r0, r10, r5, r3)
            X.C18641Vvg.A00(r4, r2, r0)
            A05(r9)
            return
        L_0x00a8:
            X.Vvg r4 = r9.A0C
            if (r4 == 0) goto L_0x00d1
            r0 = 9
            X.Ufn r3 = new X.Ufn
            r3.<init>(r9, r0)
            com.instagram.common.session.UserSession r0 = r4.A02
            X.0qQ.A0B(r0, r6)
            X.1NY r2 = new X.1NY
            r2.<init>(r0, r7)
            r2.A04()
            java.lang.String r0 = "ads/ads_manager/fetch_suggestions/"
            r2.A0A(r0)
            java.lang.Class<X.UXT> r1 = X.UXT.class
            java.lang.Class<X.VmQ> r0 = X.C18150VmQ.class
            X.1OC r0 = X.DbT.A0R(r5, r2, r1, r0, r6)
            X.C18641Vvg.A00(r4, r3, r0)
            goto L_0x0069
        L_0x00d1:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15328Uac.A0B(X.Uac, java.lang.String):void");
    }

    public final void Dz3(C21004X9b x9b) {
        String str;
        C21004X9b x9b2 = x9b;
        C18662VwK vwK = this.A07;
        String str2 = "adsManagerLogger";
        if (vwK != null) {
            if (00k.A0J(x9b.ByH()) != null) {
                str = "view_ad_comparison_insights";
            } else {
                str = "view_insights";
            }
            vwK.A0A("promotion_list", str, x9b.BYo(), (String) null);
            C19176WOi wOi = (C19176WOi) x9b2;
            C18662VwK vwK2 = this.A07;
            if (vwK2 != null) {
                String str3 = wOi.A0C;
                if (str3 != null) {
                    vwK2.A08("promotion_list", "view_insights", str3, (String) null);
                    UserSession A0l = AnonymousClass7TE.A0l(this.A0f);
                    FragmentActivity requireActivity = requireActivity();
                    String str4 = wOi.A0C;
                    if (str4 != null) {
                        W3M.A05(requireActivity, wOi, A0l, str4, "ads_manager", new HashMap(), AnonymousClass7TF.A1W(wOi.BHn(), InstagramMediaProductType.STORY), AnonymousClass7TF.A1W(wOi.BHn(), InstagramMediaProductType.IGTV), AnonymousClass7TF.A1W(wOi.BHn(), InstagramMediaProductType.CLIPS));
                        return;
                    }
                }
                str2 = "adsMediaIgId";
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131970691);
        DbX.A1A(new C18887WAz(this, 44), DbV.A0K(), r4);
    }

    public final String getModuleName() {
        return "promote_ads_manager_fragment";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("2FAC_DIALOG", this.A0W);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C18844W5n w5n;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0K = DbX.A0k(view);
        AnonymousClass0eM r8 = this.A0f;
        UserSession A0l = AnonymousClass7TE.A0l(r8);
        0qQ.A0B(A0l, 1);
        View A002 = AnonymousClass2xO.A00(view, A0l, AnonymousClass05K.A0u);
        RecyclerView A0c2 = JTR.A0c(A002, R.id.ad_tools_recycler_view);
        C15480UdV udV = this.A0B;
        if (udV == null) {
            str = "promoteAdToolsAdapter";
        } else {
            A0c2.setAdapter(udV);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
            A0c2.setLayoutManager(linearLayoutManager);
            this.A0J = C3253672c.A01(A002, AnonymousClass7TE.A0l(r8), new C19760Wf1(this, 1));
            JTQ.A0y(linearLayoutManager, A0c2, this, C3251771i.A0A);
            C238133Ar A003 = C238103Ao.A00(A0c2);
            0qQ.A0C(A003, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>");
            C238143As r1 = (C238143As) A003;
            this.A0H = r1;
            str = "recyclerViewProxy";
            if (r1 != null) {
                r1.ARa();
                AnonymousClass3AD r3 = this.A0J;
                String str2 = "pullToRefresh";
                if (r3 != null) {
                    boolean z = r3 instanceof C19763Wf4;
                    C238143As r12 = this.A0H;
                    if (z) {
                        if (r12 != null) {
                            r12.setUpPTRSpinner((C19763Wf4) r3);
                        }
                    } else if (r12 != null) {
                        r12.ErF(new C19987Wiy(this));
                    }
                    List list = this.A0e;
                    if (list == null || list.isEmpty() || !this.A0S) {
                        A04(this);
                    }
                    String str3 = this.A0M;
                    if (str3 == null) {
                        str2 = "entryPoint";
                    } else if (str3.equals(C66579MXk.A00(32))) {
                        1Av r0 = this.A0I;
                        str2 = "userPreferences";
                        if (r0 != null) {
                            int i = r0.A01.getInt("promote_outcome_upsell_education_dialog_impression_count", 0);
                            UserSession A0l2 = AnonymousClass7TE.A0l(r8);
                            0qQ.A0B(A0l2, 0);
                            0Tu r7 = 0Tu.A05;
                            if (i <= ((int) 182.A01(r7, A0l2, 36598086344772706L))) {
                                long currentTimeMillis = System.currentTimeMillis();
                                1Av r02 = this.A0I;
                                if (r02 != null) {
                                    long j = r02.A01.getLong("promote_outcome_upsell_education_dialog_last_seen_timestamp", -1);
                                    UserSession A0l3 = AnonymousClass7TE.A0l(r8);
                                    0qQ.A0B(A0l3, 0);
                                    if (currentTimeMillis - j >= TimeUnit.DAYS.toMillis(182.A01(r7, A0l3, 36598086344838243L))) {
                                        C358248ab A0U2 = DbW.A0U(this);
                                        A0U2.A0j(requireContext().getDrawable(R.drawable.ig_qp_responsiveness_text_responsiveness_qp_illo_final));
                                        A0U2.A09(2131970159);
                                        A0U2.A08(2131970158);
                                        A0U2.A0I(W56.A00, 2131970129);
                                        W5U.A01(A0U2, this, 5, 2131970130);
                                        A0U2.A0g(new C18844W5n(this, 2));
                                        DbT.A1V(A0U2);
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } else if (this.A0X) {
                        C358248ab A0U3 = DbW.A0U(this);
                        A0U3.A0j(requireContext().getDrawable(R.drawable.ig_qp_responsiveness_text_responsiveness_qp_illo_final));
                        A0U3.A09(2131970132);
                        A0U3.A08(2131970131);
                        UserSession A0l4 = AnonymousClass7TE.A0l(r8);
                        0qQ.A0B(A0l4, 0);
                        0Tu r72 = 0Tu.A05;
                        boolean A062 = 182.A06(r72, A0l4, 36316585597604358L);
                        str = "adsManagerLogger";
                        1Av r03 = this.A0I;
                        if (A062) {
                            str2 = "userPreferences";
                            if (r03 != null) {
                                int i2 = r03.A01.getInt("promote_direct_inbox_entered_education_dialog_impression_count", 0);
                                UserSession A0l5 = AnonymousClass7TE.A0l(r8);
                                0qQ.A0B(A0l5, 0);
                                if (i2 <= ((int) 182.A01(r72, A0l5, 36598060574444625L))) {
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    1Av r04 = this.A0I;
                                    if (r04 != null) {
                                        long j2 = r04.A01.getLong("promote_direct_inbox_entered_education_dialog_last_seen_timestamp", -1);
                                        UserSession A0l6 = AnonymousClass7TE.A0l(r8);
                                        0qQ.A0B(A0l6, 0);
                                        if (currentTimeMillis2 - j2 >= TimeUnit.DAYS.toMillis(182.A01(r72, A0l6, 36598060574379088L))) {
                                            A0U3.A0I(new W5U(this, 3), 2131970130);
                                            W5U.A01(A0U3, this, 4, 2131970129);
                                            w5n = new C18844W5n(this, 0);
                                        } else {
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else if (r03 == null) {
                            str = "userPreferences";
                        } else if (!r03.A01.getBoolean("has_seen_promote_direct_inbox_entrypoint_education_dialog", false)) {
                            A0U3.A0I(W55.A00, 2131970129);
                            w5n = new C18844W5n(this, 1);
                        } else {
                            return;
                        }
                        A0U3.A0g(w5n);
                        DbT.A1V(A0U3);
                        C18662VwK vwK = this.A07;
                        if (vwK != null) {
                            DbZ.A1R(vwK.A00, "igd_inbox_ad_creation_education_dialog_impression");
                            return;
                        }
                    } else {
                        return;
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final AnonymousClass9JK A00() {
        Map map = 0Yh.A03;
        CallerContext A012 = CallerContext.A01(0q1.A01(C15328Uac.class));
        0qQ.A0A(A012);
        return new AnonymousClass9JK(A012, "ig_android_promote_ads_manager_ig_to_fb_fetch_promotions", "ads_manager", C16678UzE.ADS_MANAGER.toString(), "promotion_list");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r11.A06 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r11 = this;
            java.util.List r3 = r11.A0e
            X.0eM r0 = r11.A0f
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r4)
            r0 = 36319153988049854(0x81081400001bbe, double:3.031717455312802E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x001e
            X.Jw9 r1 = r11.A06
            r0 = 2131970138(0x7f13485a, float:1.9577219E38)
            if (r1 == 0) goto L_0x0021
        L_0x001e:
            r0 = 2131970139(0x7f13485b, float:1.957722E38)
        L_0x0021:
            X.JTQ.A0t(r0, r3)
            java.util.List r0 = r11.A0R
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0067
            java.util.List r0 = r11.A0R
            java.util.Iterator r2 = r0.iterator()
        L_0x0032:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r1 = r2.next()
            com.instagram.business.promote.model.SuggestedPromotion r1 = (com.instagram.business.promote.model.SuggestedPromotion) r1
            r7 = 0
            com.instagram.common.typedurl.ImageUrl r6 = r1.A01
            if (r6 == 0) goto L_0x005d
            java.lang.String r9 = r1.A03
            if (r9 == 0) goto L_0x005a
            java.lang.String r10 = r1.A02
            r0 = 34
            X.WBH r5 = new X.WBH
            r5.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r11)
            X.VaK r4 = new X.VaK
            r8 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3.add(r4)
            goto L_0x0032
        L_0x005a:
            java.lang.String r0 = "displayTitle"
            goto L_0x005f
        L_0x005d:
            java.lang.String r0 = "thumbnailUrl"
        L_0x005f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0067:
            X.Jw9 r0 = r11.A06
            if (r0 == 0) goto L_0x006e
            r3.add(r0)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15328Uac.A01():void");
    }

    public static final void A04(C15328Uac uac) {
        if (uac.A0Z == 0) {
            A06(uac);
            C18676VwZ.A00(uac.requireActivity(), new WO4(uac, 1), AnonymousClass7TE.A0l(uac.A0f));
        }
    }

    public static final void A05(C15328Uac uac) {
        int i = uac.A0Z - 1;
        uac.A0Z = i;
        if (i == 0) {
            C238143As r0 = uac.A0H;
            String str = "recyclerViewProxy";
            if (r0 != null) {
                r0.ARa();
                C238143As r02 = uac.A0H;
                if (r02 != null) {
                    r02.EaP(false);
                    AnonymousClass3AD r03 = uac.A0J;
                    if (r03 == null) {
                        str = "pullToRefresh";
                    } else {
                        r03.setIsLoading(false);
                        SpinnerImageView spinnerImageView = uac.A0K;
                        if (spinnerImageView == null) {
                            str = "loadingSpinner";
                        } else {
                            JTO.A1X(spinnerImageView);
                            return;
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A06(C15328Uac uac) {
        uac.A0Z++;
        uac.A0T = false;
        C238143As r0 = uac.A0H;
        String str = "recyclerViewProxy";
        if (r0 != null) {
            r0.APL();
            C238143As r02 = uac.A0H;
            if (r02 != null) {
                r02.EaP(true);
                AnonymousClass3AD r03 = uac.A0J;
                str = "pullToRefresh";
                if (r03 != null) {
                    r03.setIsLoading(true);
                    List list = uac.A0e;
                    if (list == null || list.isEmpty()) {
                        AnonymousClass3AD r04 = uac.A0J;
                        if (r04 != null) {
                            if (!(r04 instanceof C19763Wf4)) {
                                SpinnerImageView spinnerImageView = uac.A0K;
                                if (spinnerImageView == null) {
                                    str = "loadingSpinner";
                                } else {
                                    DbS.A1T(spinnerImageView);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A07(C15328Uac uac) {
        C18662VwK vwK = uac.A07;
        String str = "adsManagerLogger";
        if (vwK != null) {
            vwK.A03("ad_tools_pro2pro", (String) null);
            C18641Vvg vvg = uac.A0C;
            if (vvg == null) {
                str = "promoteAdsManagerDataFetcher";
            } else {
                BaseFragmentActivity A0R2 = C13989Tnp.A0R(uac);
                C18662VwK vwK2 = uac.A07;
                if (vwK2 != null) {
                    vvg.A01.schedule(C18678Vwb.A01(A0R2, vvg.A02, AnonymousClass05K.A0C, "ads_manager", vwK2.A00(), (String) null));
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0218, code lost:
        r0 = "boostingStatus";
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0209  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.C15328Uac r14) {
        /*
            java.util.List r5 = r14.A0e
            r5.clear()
            X.V42 r3 = r14.A0A
            if (r3 == 0) goto L_0x003e
            r5.add(r3)
            boolean r0 = r14.A0V
            if (r0 != 0) goto L_0x003e
            X.VrO r2 = r14.A0G
            if (r2 != 0) goto L_0x001e
            java.lang.String r0 = "aymtLogger"
        L_0x0016:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001e:
            r0 = 68
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0xG r1 = new X.0xG
            r1.<init>(r0)
            r0 = 2685(0xa7d, float:3.762E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0xI r1 = X.0xI.A00(r1, r0)
            X.0qQ.A0A(r1)
            X.C18419VrO.A00(r3, r2, r1)
            com.instagram.common.session.UserSession r0 = r2.A00
            X.DbU.A1R(r1, r0)
        L_0x003e:
            X.Vkt r4 = r14.A0D
            if (r4 == 0) goto L_0x0085
            java.util.List r6 = r14.A0c
            java.util.Iterator r3 = r6.iterator()
        L_0x0048:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0206
            X.WOi r2 = X.C13989Tnp.A0S(r3)
            X.Uyx r1 = r2.A09
            if (r1 == 0) goto L_0x0218
            X.Uyx r0 = X.C16661Uyx.ACTIVE
            if (r1 != r0) goto L_0x0048
            com.instagram.business.promote.model.AdsManagerPaymentAnomalyType r0 = r2.A04
            if (r0 != 0) goto L_0x0048
            r0 = 1
        L_0x005f:
            r4.A01 = r0
            java.util.Iterator r3 = r6.iterator()
        L_0x0065:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0203
            X.WOi r2 = X.C13989Tnp.A0S(r3)
            X.Uyx r1 = r2.A09
            if (r1 == 0) goto L_0x0218
            X.Uyx r0 = X.C16661Uyx.CREATING
            if (r1 == r0) goto L_0x007b
            X.Uyx r0 = X.C16661Uyx.PENDING
            if (r1 != r0) goto L_0x0065
        L_0x007b:
            com.instagram.business.promote.model.AdsManagerPaymentAnomalyType r0 = r2.A04
            if (r0 != 0) goto L_0x0065
            r0 = 1
        L_0x0080:
            r4.A00 = r0
            r5.add(r4)
        L_0x0085:
            X.Jw9 r0 = r14.A05
            if (r0 == 0) goto L_0x008c
            r5.add(r0)
        L_0x008c:
            X.0eM r4 = r14.A0f
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r4)
            r3 = 0
            X.0qQ.A0B(r6, r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327636548467275(0x810fcb00003a4b, double:3.037081860677308E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x01bd
            r14.A01()
            r0 = 2131970694(0x7f134a86, float:1.9578346E38)
            java.lang.String r6 = X.DbU.A0m(r14, r0)
            r1 = 26
            X.LY1 r0 = new X.LY1
            r0.<init>(r14, r1)
            X.VRd r7 = new X.VRd
            r7.<init>(r6, r0)
        L_0x00b9:
            r5.add(r7)
        L_0x00bc:
            java.util.List r0 = r14.A0R
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x01b1
            r6 = 2131970137(0x7f134859, float:1.9577217E38)
        L_0x00c7:
            r0 = 46
            X.WAz r1 = new X.WAz
            r1.<init>(r14, r0)
            X.Oak r0 = new X.Oak
            r0.<init>(r1, r6)
            r5.add(r0)
            r0 = 2131970142(0x7f13485e, float:1.9577227E38)
            X.JTQ.A0t(r0, r5)
            int r0 = r14.A02
            r7 = 1
            if (r0 != 0) goto L_0x012c
            java.util.List r0 = r14.A0d
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x012c
        L_0x00eb:
            boolean r0 = r14.A0S
            if (r0 == 0) goto L_0x012c
            r1 = 2131970144(0x7f134860, float:1.957723E38)
            X.FGF r0 = new X.FGF
            r0.<init>((int) r1)
            r5.add(r0)
        L_0x00fa:
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r4)
            X.0qQ.A0B(r4, r3)
            r0 = 36321176917648529(0x8109eb00002491, double:3.0329967641366877E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0124
            r0 = 2131970141(0x7f13485d, float:1.9577225E38)
            X.JTQ.A0t(r0, r5)
            r2 = 2131970135(0x7f134857, float:1.9577213E38)
            r0 = 50
            X.WAz r1 = new X.WAz
            r1.<init>(r14, r0)
            X.Oak r0 = new X.Oak
            r0.<init>(r1, r2)
            r5.add(r0)
        L_0x0124:
            X.UdV r0 = r14.A0B
            if (r0 != 0) goto L_0x0209
            java.lang.String r0 = "promoteAdToolsAdapter"
            goto L_0x0016
        L_0x012c:
            boolean r0 = r14.A0U
            if (r0 == 0) goto L_0x0151
            r0 = 49
            X.WAz r8 = new X.WAz
            r8.<init>(r14, r0)
            int r0 = r14.A03
            if (r0 <= 0) goto L_0x0189
            r0 = 2131976606(0x7f13619e, float:1.9590337E38)
            java.lang.String r6 = X.DbU.A0m(r14, r0)
            int r0 = r14.A03
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.Oak r1 = new X.Oak
            r1.<init>((android.view.View.OnClickListener) r8, (java.lang.CharSequence) r6, (java.lang.String) r0, (boolean) r7)
        L_0x014d:
            r5.add(r1)
            r7 = 0
        L_0x0151:
            int r1 = r14.A00
            int r0 = r14.A02
            if (r1 >= r0) goto L_0x016a
            r6 = 2131970145(0x7f134861, float:1.9577233E38)
            r0 = 48
            X.WAz r1 = new X.WAz
            r1.<init>(r14, r0)
            X.Oak r0 = new X.Oak
            r0.<init>(r1, r6)
            r5.add(r0)
            r7 = 0
        L_0x016a:
            java.util.List r0 = r14.A0d
            java.util.Iterator r6 = r0.iterator()
        L_0x0170:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0192
            java.lang.Object r1 = r6.next()
            if (r7 != 0) goto L_0x0184
            X.VAE r0 = new X.VAE
            r0.<init>()
            r5.add(r0)
        L_0x0184:
            r5.add(r1)
            r7 = 0
            goto L_0x0170
        L_0x0189:
            r0 = 2131976606(0x7f13619e, float:1.9590337E38)
            X.Oak r1 = new X.Oak
            r1.<init>(r8, r0)
            goto L_0x014d
        L_0x0192:
            java.util.List r0 = r14.A0c
            java.util.Iterator r6 = r0.iterator()
        L_0x0198:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r1 = r6.next()
            if (r7 != 0) goto L_0x01ac
            X.VAE r0 = new X.VAE
            r0.<init>()
            r5.add(r0)
        L_0x01ac:
            r5.add(r1)
            r7 = 0
            goto L_0x0198
        L_0x01b1:
            X.Jw9 r0 = r14.A06
            r6 = 2131970143(0x7f13485f, float:1.9577229E38)
            if (r0 == 0) goto L_0x00c7
            r6 = 2131970136(0x7f134858, float:1.9577215E38)
            goto L_0x00c7
        L_0x01bd:
            r14.A01()
            java.util.List r6 = r14.A0b
            int r1 = r6.size()
            r0 = 2
            if (r1 < r0) goto L_0x00bc
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.C18803W2r.A02(r0)
            if (r0 == 0) goto L_0x00bc
            android.content.Context r1 = r14.getContext()
            if (r1 == 0) goto L_0x00bc
            r11 = 0
            r0 = 1
            java.lang.Object r9 = r6.get(r0)
            com.instagram.common.typedurl.ImageUrl r9 = (com.instagram.common.typedurl.ImageUrl) r9
            java.lang.Object r10 = r6.get(r3)
            com.instagram.common.typedurl.ImageUrl r10 = (com.instagram.common.typedurl.ImageUrl) r10
            r0 = 2131956465(0x7f1312f1, float:1.9549486E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 2131953964(0x7f13092c, float:1.9544414E38)
            java.lang.String r13 = r1.getString(r0)
            r0 = 47
            X.WAz r8 = new X.WAz
            r8.<init>(r14, r0)
            X.VaK r7 = new X.VaK
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x00b9
        L_0x0203:
            r0 = 0
            goto L_0x0080
        L_0x0206:
            r0 = 0
            goto L_0x005f
        L_0x0209:
            r0.A01(r5)
            boolean r0 = r14.A0V
            if (r0 != 0) goto L_0x0233
            X.WT7 r5 = r14.A08
            if (r5 != 0) goto L_0x021c
            java.lang.String r0 = "userFlowLogger"
            goto L_0x0016
        L_0x0218:
            java.lang.String r0 = "boostingStatus"
            goto L_0x0016
        L_0x021c:
            long r3 = r5.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0230
            X.1QP r2 = r5.A01
            java.lang.String r0 = "ads_manager_rendered"
            r2.flowMarkPoint(r3, r0)
            long r0 = r5.A00
            r2.flowEndSuccess(r0)
        L_0x0230:
            r0 = 1
            r14.A0V = r0
        L_0x0233:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15328Uac.A08(X.Uac):void");
    }

    public static final void A0A(C15328Uac uac, C19176WOi wOi, String str) {
        String str2;
        C238143As r0 = uac.A0H;
        if (r0 == null) {
            str2 = "recyclerViewProxy";
        } else {
            r0.EaP(true);
            AnonymousClass3AD r02 = uac.A0J;
            if (r02 != null) {
                r02.setIsLoading(true);
                AnonymousClass3AD r03 = uac.A0J;
                if (r03 != null) {
                    if (!(r03 instanceof C19763Wf4)) {
                        C15480UdV udV = uac.A0B;
                        if (udV == null) {
                            str2 = "promoteAdToolsAdapter";
                        } else {
                            C15480UdV.A00(udV);
                            SpinnerImageView spinnerImageView = uac.A0K;
                            if (spinnerImageView == null) {
                                str2 = "loadingSpinner";
                            } else {
                                DbS.A1T(spinnerImageView);
                            }
                        }
                    }
                    A02(new WOJ(uac, wOi, str), uac);
                    return;
                }
            }
            0qQ.A0F("pullToRefresh");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0C(C15328Uac uac, String str, String str2, String str3, String str4) {
        C18662VwK vwK = uac.A07;
        if (vwK != null) {
            vwK.A08("promotion_list", "create_promotion", (String) null, (String) null);
            C18662VwK vwK2 = uac.A07;
            if (vwK2 != null) {
                vwK2.A0A(str3, str4, (String) null, (String) null);
                String str5 = str2;
                C18138VmE.A00().A0A(uac.requireActivity(), AnonymousClass7TE.A0l(uac.A0f), str5, str, uac.A0X, false, false);
                return;
            }
        }
        0qQ.A0F("adsManagerLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    public final UserSession A0E() {
        return AnonymousClass7TE.A0l(this.A0f);
    }

    public final void ACw() {
        if (this.A0T) {
            A04(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f3, code lost:
        r4.A08(r2, r0, r3, (java.lang.String) null);
        r0 = new X.WO6(2, r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01c1, code lost:
        r4.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01df, code lost:
        A02(r0, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01e2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0274, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x027b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        A02(r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CtF(com.instagram.business.promote.model.PromoteAdsManagerActionType r15, X.C21004X9b r16) {
        /*
            r14 = this;
            r1 = r16
            r13 = 0
            r7 = 1
            X.0qQ.A0B(r15, r7)
            r10 = r14
            boolean r0 = r14.A0Y
            if (r0 == 0) goto L_0x0018
            android.content.Context r2 = r14.requireContext()
            java.lang.String r1 = r14.A0O
            java.lang.String r0 = r14.A0N
            X.W3M.A04(r2, r1, r0)
        L_0x0017:
            return
        L_0x0018:
            int r0 = r15.ordinal()
            java.lang.String r6 = "ads_manager"
            r8 = 1
            java.lang.String r9 = "adsManagerLogger"
            r5 = 0
            switch(r0) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0164;
                case 2: goto L_0x0048;
                case 3: goto L_0x01c9;
                case 4: goto L_0x00a2;
                case 5: goto L_0x0031;
                case 6: goto L_0x0017;
                case 7: goto L_0x00c8;
                case 8: goto L_0x00e5;
                case 9: goto L_0x00fe;
                case 10: goto L_0x01e3;
                default: goto L_0x0025;
            }
        L_0x0025:
            r0 = r1
            X.WOi r0 = (X.C19176WOi) r0
            X.WO7 r2 = new X.WO7
            r2.<init>(r14, r0, r1)
        L_0x002d:
            A02(r2, r14)
            return
        L_0x0031:
            r0 = 4
            X.WO6 r2 = new X.WO6
            r2.<init>(r0, r14, r1)
            goto L_0x002d
        L_0x0038:
            X.WOi r1 = (X.C19176WOi) r1
            X.VwK r4 = r14.A07
            if (r4 == 0) goto L_0x0274
            java.lang.String r3 = r1.BYo()
            java.lang.String r2 = "promotion_list"
            java.lang.String r0 = "appeal_review"
            goto L_0x00f3
        L_0x0048:
            X.WOi r1 = (X.C19176WOi) r1
            X.VwK r4 = r14.A07
            if (r4 == 0) goto L_0x0274
            java.lang.String r3 = r1.BYo()
            java.lang.String r2 = "promotion_list"
            java.lang.String r0 = "learn_more"
            r4.A08(r2, r0, r3, r5)
            X.C13990Tnq.A0h()
            java.lang.String r3 = r1.BYo()
            com.instagram.common.typedurl.ImageUrl r0 = r1.C73()
            java.lang.String r2 = r0.getUrl()
            X.0qQ.A07(r2)
            com.instagram.business.promote.model.InstagramMediaProductType r1 = r1.BHn()
            com.instagram.business.promote.model.InstagramMediaProductType r0 = com.instagram.business.promote.model.InstagramMediaProductType.STORY
            if (r1 == r0) goto L_0x0074
            r8 = 0
        L_0x0074:
            java.lang.String r0 = "url"
            android.os.Bundle r1 = X.C51971G9r.A0N(r3)
            r1.putString(r0, r2)
            r0 = 789(0x315, float:1.106E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.putBoolean(r0, r8)
            X.K4t r2 = new X.K4t
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r1, r2, r14)
            X.0eM r0 = r14.A0f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6Yo r4 = new X.6Yo
            r4.<init>(r1, r0)
            r4.A0B(r5, r2)
            r4.A08()
            goto L_0x01c1
        L_0x00a2:
            X.WOi r1 = (X.C19176WOi) r1
            X.W3M r7 = X.W3M.A00
            X.0eM r0 = r14.A0f
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.common.typedurl.ImageUrl r12 = r1.C73()
            com.instagram.business.promote.model.InstagramMediaProductType r2 = r1.BHn()
            com.instagram.business.promote.model.InstagramMediaProductType r0 = com.instagram.business.promote.model.InstagramMediaProductType.STORY
            boolean r13 = X.AnonymousClass7TF.A1W(r2, r0)
            android.content.Context r8 = r14.requireContext()
            r0 = 3
            X.W4v r9 = new X.W4v
            r9.<init>(r0, r1, r14)
            r7.A07(r8, r9, r10, r11, r12, r13)
            return
        L_0x00c8:
            X.WOi r1 = (X.C19176WOi) r1
            com.instagram.common.typedurl.ImageUrl r4 = r1.C73()
            com.instagram.business.promote.model.InstagramMediaProductType r2 = r1.BHn()
            com.instagram.business.promote.model.InstagramMediaProductType r0 = com.instagram.business.promote.model.InstagramMediaProductType.STORY
            if (r2 == r0) goto L_0x00d7
            r8 = 0
        L_0x00d7:
            android.content.Context r3 = r14.requireContext()
            r2 = 4
            X.W4v r0 = new X.W4v
            r0.<init>(r2, r1, r14)
            X.W3M.A03(r3, r0, r14, r4, r8)
            return
        L_0x00e5:
            X.WOi r1 = (X.C19176WOi) r1
            X.VwK r4 = r14.A07
            if (r4 == 0) goto L_0x0274
            java.lang.String r3 = r1.BYo()
            java.lang.String r2 = "promotion_list"
            java.lang.String r0 = "hec_review"
        L_0x00f3:
            r4.A08(r2, r0, r3, r5)
            r2 = 2
            X.WO6 r0 = new X.WO6
            r0.<init>(r2, r14, r1)
            goto L_0x01df
        L_0x00fe:
            X.WOi r1 = (X.C19176WOi) r1
            X.VwK r4 = r14.A07
            if (r4 == 0) goto L_0x0274
            java.lang.String r3 = r1.BYo()
            java.lang.String r2 = "promotion_list"
            java.lang.String r0 = "view_appeal_review"
            r4.A08(r2, r0, r3, r5)
            android.content.Context r5 = r14.requireContext()
            androidx.fragment.app.FragmentActivity r9 = r14.requireActivity()
            X.0eM r0 = r14.A0f
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r12 = r1.BYo()
            java.lang.String r11 = r1.A0D
            if (r11 == 0) goto L_0x015f
            r0 = 2
            X.0qQ.A0B(r10, r0)
            X.FIa r8 = new X.FIa
            r8.<init>(r9, r10, r11, r12, r13)
            X.LV1 r4 = new X.LV1
            r4.<init>((com.instagram.common.session.UserSession) r10, (java.lang.String) r12, (int) r7)
            r3 = 2131970128(0x7f134850, float:1.9577198E38)
            r2 = 2131970114(0x7f134842, float:1.957717E38)
            r0 = 2131970118(0x7f134846, float:1.9577178E38)
            X.8ab r1 = new X.8ab
            r1.<init>((android.content.Context) r5)
            r1.A09(r3)
            r1.A0J(r8, r2)
            r1.A0G(r4, r0)
            r1.A0s(r7)
            r0 = 2131970127(0x7f13484f, float:1.9577196E38)
            r1.A08(r0)
            X.W4Y r0 = new X.W4Y
            r0.<init>(r12, r10, r13)
            r1.A0B(r0)
            X.DbT.A1V(r1)
            return
        L_0x015f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0164:
            X.WOi r1 = (X.C19176WOi) r1
            X.VwK r4 = r14.A07
            if (r4 == 0) goto L_0x0274
            java.lang.String r3 = r1.BYo()
            java.lang.String r2 = "promotion_list"
            java.lang.String r0 = "edit"
            r4.A08(r2, r0, r3, r5)
            X.VwK r3 = r14.A07
            if (r3 == 0) goto L_0x0274
            X.UzE r0 = X.C16678UzE.CAMPAIGN_CONTROLS
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = r1.BYo()
            r3.A05(r6, r2, r0)
            androidx.fragment.app.FragmentActivity r2 = r14.requireActivity()
            X.0eM r0 = r14.A0f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6Yo r4 = new X.6Yo
            r4.<init>(r2, r0)
            X.C13990Tnq.A0h()
            java.lang.String r0 = r1.BYo()
            java.lang.String r3 = r1.A0F
            java.lang.String r2 = r1.A0L
            if (r2 == 0) goto L_0x01c5
            X.AnonymousClass7TF.A1C(r0, r13, r6)
            android.os.Bundle r1 = X.C51971G9r.A0N(r0)
            java.lang.String r0 = "boosted_id"
            r1.putString(r0, r3)
            X.DbS.A1B(r1, r6)
            java.lang.String r0 = "page_id"
            r1.putString(r0, r2)
            X.UZX r0 = new X.UZX
            r0.<init>()
            r0.setArguments(r1)
            r4.A0B(r5, r0)
        L_0x01c1:
            r4.A04()
            return
        L_0x01c5:
            java.lang.String r9 = "pageId"
            goto L_0x0274
        L_0x01c9:
            X.WOi r1 = (X.C19176WOi) r1
            X.VwK r4 = r14.A07
            if (r4 == 0) goto L_0x0274
            java.lang.String r3 = r1.BYo()
            java.lang.String r2 = "promotion_list"
            java.lang.String r0 = "learn_more"
            r4.A08(r2, r0, r3, r5)
            X.WO6 r0 = new X.WO6
            r0.<init>(r7, r14, r1)
        L_0x01df:
            A02(r0, r14)
            return
        L_0x01e3:
            X.WOh r1 = (X.C19175WOh) r1
            X.VwK r4 = r14.A07
            if (r4 == 0) goto L_0x0274
            java.lang.String r3 = r1.BYo()
            java.lang.String r2 = "draft_list"
            java.lang.String r0 = "enter_draft"
            r4.A08(r2, r0, r3, r5)
            X.0eM r7 = r14.A0f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            java.lang.String r4 = r1.BYo()
            X.0qQ.A0B(r0, r13)
            X.1E8 r3 = X.1E7.A00(r0)
            r2 = 95
            java.lang.String r0 = r0.A06
            java.lang.String r0 = X.002.A0T(r4, r0, r2)
            X.1Xj r12 = r3.A02(r0)
            if (r12 == 0) goto L_0x0242
            X.1Yh r2 = X.C18138VmE.A00()
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r7)
            java.lang.String r0 = r1.A06
            if (r0 == 0) goto L_0x0272
            X.0qQ.A0B(r11, r13)
            androidx.fragment.app.FragmentActivity r9 = r14.requireActivity()
            X.Via r8 = new X.Via
            r13 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r8.A07 = r0
            X.WGU r1 = X.WGU.A00(r11)
            java.lang.String r0 = r8.A00()
            r1.A0T(r6, r0)
            X.VdD r0 = new X.VdD
            r0.<init>(r8)
            X.1Yh.A03(r2, r0)
            return
        L_0x0242:
            X.1Yh r5 = X.C18138VmE.A00()
            X.1Yg r4 = X.VA4.A00()
            java.lang.String r3 = r1.BYo()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r7)
            android.content.Context r0 = r14.requireContext()
            X.W29 r2 = r4.A00(r0, r2, r3, r6)
            java.lang.String r0 = r1.BYo()
            java.lang.String r0 = X.W29.A02(r0)
            r2.A0A = r0
            com.instagram.business.boost.model.BoostFlowType r0 = com.instagram.business.boost.model.BoostFlowType.DRAFT
            r2.A01 = r0
            java.lang.String r0 = r1.A06
            if (r0 == 0) goto L_0x0272
            r2.A08 = r0
            r5.A0B(r2)
            return
        L_0x0272:
            java.lang.String r9 = "draftId"
        L_0x0274:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15328Uac.CtF(com.instagram.business.promote.model.PromoteAdsManagerActionType, X.X9b):void");
    }

    public final void DrN(C21004X9b x9b) {
        C18662VwK vwK = this.A07;
        String str = null;
        if (vwK == null) {
            0qQ.A0F("adsManagerLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        vwK.A08("promotion_list", "promotion_preview", x9b.BYo(), (String) null);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A0f);
        String BYo = x9b.BYo();
        XIGIGBoostCallToAction Awb = x9b.Awb();
        if (Awb != null) {
            str = Awb.toString();
        }
        C305796Jo.A02(requireContext, A0l, "ads_manager", BYo, str, x9b.BdT(), x9b.BHq());
    }

    public final void Dz6(C21004X9b x9b) {
        String A0R2 = 002.A0R("promote_ads_manager_fragment", ".BACK_STACK");
        W2F w2f = C17137VJm.A00;
        String BYn = x9b.BYn();
        w2f.A05(requireActivity(), AnonymousClass7TE.A0l(this.A0f), A0R2, BYn);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0f);
    }

    public final boolean onBackPressed() {
        String str;
        C18662VwK vwK = this.A07;
        if (vwK == null) {
            str = "adsManagerLogger";
        } else {
            vwK.A01(C16678UzE.ADS_MANAGER.toString());
            if (this.A0V) {
                return false;
            }
            WT7 wt7 = this.A08;
            if (wt7 == null) {
                str = "userFlowLogger";
            } else {
                wt7.A00();
                return false;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(X6L x6l, C15328Uac uac) {
        C18676VwZ.A01(uac.requireActivity(), x6l, AnonymousClass7TE.A0l(uac.A0f), "ads_manager");
    }

    public static final void A03(C15328Uac uac) {
        FragmentActivity activity = uac.getActivity();
        if (activity != null) {
            C13990Tnq.A0h();
            Bundle A042 = C13992Tns.A04(uac);
            UZG uzg = new UZG();
            C309516Yo r0 = new C309516Yo(DbU.A0I(A042, uzg, uac), AnonymousClass7TE.A0l(uac.A0f));
            activity.onBackPressed();
            r0.A0D(uzg);
            r0.A04();
        }
    }

    public static final void A0D(C15328Uac uac, String str, String str2, String str3, String str4) {
        1Yh A002 = C18138VmE.A00();
        W29 A003 = VA4.A00().A00(uac.requireContext(), AnonymousClass7TE.A0l(uac.A0f), str2, str);
        A003.A0D = uac.A0X;
        A002.A06(uac, A003, uac);
        C18662VwK vwK = uac.A07;
        if (vwK == null) {
            0qQ.A0F("adsManagerLogger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            vwK.A0A("promotion_list", str3, str2, str4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: X.Uac} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: X.0iw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = -356231677(0xffffffffeac45603, float:-1.1867782E26)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r13 = r17
            r3 = r18
            X.C15328Uac.super.onCreate(r3)
            android.os.Bundle r0 = r13.mArguments
            if (r0 == 0) goto L_0x016d
            X.0eM r7 = r13.A0f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.1Av r0 = X.1Au.A00(r0)
            r13.A0I = r0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.9JK r5 = A00()
            r6 = 0
            X.WO2 r2 = new X.WO2
            r2.<init>(r13, r6)
            X.0qQ.A0B(r0, r6)
            X.9F1 r1 = X.AnonymousClass9F1.A00
            X.9F4 r0 = X.AnonymousClass9F3.A00(r0)
            X.9F7 r0 = X.AnonymousClass9F4.A00(r0)
            r0.AUs(r5, r1, r2)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r7)
            X.9JK r1 = A00()
            r9 = 1
            X.WO2 r0 = new X.WO2
            r0.<init>(r13, r9)
            X.C16899VAc.A00(r1, r0, r2)
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r7)
            android.content.Context r12 = r13.requireContext()
            X.UdV r11 = new X.UdV
            r14 = r13
            r15 = r13
            r11.<init>(r12, r13, r14, r15, r16)
            r13.A0B = r11
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r7)
            android.content.Context r1 = r13.requireContext()
            X.Vvg r0 = new X.Vvg
            r0.<init>(r1, r13, r2)
            r13.A0C = r0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.WQ1> r1 = X.WQ1.class
            X.1wn r0 = r13.A0h
            r2.A01(r0, r1)
            java.lang.Class<X.FW7> r1 = X.FW7.class
            X.1wn r0 = r13.A0g
            r2.A01(r0, r1)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r7)
            r5 = 0
            X.VrO r0 = new X.VrO
            r0.<init>(r1)
            r13.A0G = r0
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r7)
            X.0qQ.A0B(r2, r6)
            java.lang.Class<X.WSw> r1 = X.C19288WSw.class
            X.WwZ r0 = X.C20641WwZ.A00
            java.lang.Object r0 = r2.A01(r1, r0)
            X.WSw r0 = (X.C19288WSw) r0
            r13.A0F = r0
            android.os.Bundle r1 = r13.mArguments
            if (r1 == 0) goto L_0x0112
            java.lang.String r0 = "coupon_offer_id"
            java.lang.String r0 = r1.getString(r0)
        L_0x00ac:
            r13.A0a = r0
            android.os.Bundle r1 = r13.mArguments
            if (r1 == 0) goto L_0x00ba
            java.lang.String r0 = "entry_point"
            java.lang.String r8 = r1.getString(r0)
            if (r8 != 0) goto L_0x00bc
        L_0x00ba:
            java.lang.String r8 = "unknown"
        L_0x00bc:
            r13.A0M = r8
            java.lang.String r2 = "direct_inbox_setting_entrypoint"
            r0 = 32
            java.lang.String r1 = X.C66579MXk.A00(r0)
            r0 = 586(0x24a, float:8.21E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}
            java.util.Set r0 = X.C51967G9n.A0t(r0, r6)
            boolean r0 = r0.contains(r8)
            r13.A0X = r0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.WGU r0 = X.WGU.A00(r0)
            r13.A09 = r0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.VwK r0 = X.VA1.A00(r0)
            r13.A07 = r0
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r7)
            X.0qQ.A0B(r2, r6)
            r0 = 16
            X.Wvn r1 = new X.Wvn
            r1.<init>(r2, r0)
            java.lang.Class<X.WT7> r0 = X.WT7.class
            java.lang.Object r10 = r2.A01(r0, r1)
            X.WT7 r10 = (X.WT7) r10
            r13.A08 = r10
            if (r10 != 0) goto L_0x0114
            java.lang.String r0 = "userFlowLogger"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0112:
            r0 = r5
            goto L_0x00ac
        L_0x0114:
            long r0 = r10.A00
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x011f
            r10.A00()
        L_0x011f:
            X.1QP r8 = r10.A01
            r1 = 468331674(0x1bea2c9a, float:3.8740876E-22)
            java.lang.String r0 = "ads_manager"
            long r0 = r8.flowStartForMarker(r1, r0, r9)
            r10.A00 = r0
            java.lang.String r2 = "navigation_start"
            r8.flowMarkPoint(r0, r2)
            if (r18 == 0) goto L_0x013b
            java.lang.String r0 = "2FAC_DIALOG"
            boolean r0 = r3.getBoolean(r0, r6)
            r13.A0W = r0
        L_0x013b:
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r7)
            X.0qQ.A0B(r3, r6)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36319596369747467(0x81087b00011e0b, double:3.0319972192797005E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0166
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.0qQ.A0B(r0, r6)
            X.Vh6 r3 = X.C18418VrN.A00(r0)
            java.lang.String r2 = "AD_TOOLS"
            r1 = 18
            X.N49 r0 = new X.N49
            r0.<init>(r2, r5, r1)
            r3.A00(r0)
        L_0x0166:
            r0 = -1662857798(0xffffffff9ce2cdba, float:-1.5008605E-21)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x016d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 251537034(0xefe268a, float:6.2652946E-30)
            X.AnonymousClass0fD.A09(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15328Uac.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(388941474);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_ads_manager_view, false);
        AnonymousClass0fD.A09(-1971521123, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1853128164);
        super.onDestroy();
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0f));
        A002.A02(this.A0h, WQ1.class);
        A002.A02(this.A0g, FW7.class);
        A09(this);
        AnonymousClass0fD.A09(1262294563, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-718740075);
        C15328Uac.super.onPause();
        Dialog dialog = this.A04;
        if (dialog != null) {
            dialog.dismiss();
            this.A04 = null;
        }
        AnonymousClass0fD.A09(1990365025, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(738593311);
        super.onResume();
        C18641Vvg vvg = this.A0C;
        if (vvg == null) {
            0qQ.A0F("promoteAdsManagerDataFetcher");
            throw AnonymousClass00P.createAndThrow();
        }
        C15621Ufn ufn = new C15621Ufn(this, 7);
        0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, "", "access_token");
        UserSession userSession = vvg.A02;
        2IS A0D2 = JTQ.A0D(A032, userSession.A06, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        DbW.A18(A032, A0D2, C273654mx.A00(180));
        C239113Fa r4 = new C239113Fa(A0D2, UJS.class, "IGPromoteAdAcctFreezeQuery", false);
        C363088j4.A00(userSession).ATL(new C19026WHc(1), new C19040WHs(ufn, 2), r4);
        A09(this);
        A04(this);
        AnonymousClass0fD.A09(985546281, A022);
    }
}
