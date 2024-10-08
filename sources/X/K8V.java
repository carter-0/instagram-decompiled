package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class K8V extends K82 implements AnonymousClass0iw, AnonymousClass4DU, AnonymousClass4DR, C66531MVj, C74380Ptv {
    public static final String __redex_internal_original_name = "BrandedContentDisclosureMenuFragment";
    public C231002qi A00;
    public final AnonymousClass2qU A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(MMG.A00(this, 21));
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(MMG.A00(this, 22));
    public final AnonymousClass0eM A04;
    public final 1wn A05 = C64698LgT.A00(this, 2);

    public final /* synthetic */ void Cqk(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        C63092KrL.A00(fragmentActivity, userSession, user, str);
    }

    public final void DOk(View view) {
    }

    public final void DS8(View view) {
    }

    public final void DWd(User user) {
        0qQ.A0B(user, 0);
        JTT.A0H(this.A04).A05(user);
        JVF.A01(this, AnonymousClass7TE.A0l(this.A01), AnonymousClass05K.A0Q);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList A0U;
        DU2 du2;
        ArrayList arrayList;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = requireArguments().getString("ARGUMENT_MEDIA_ID");
            AnonymousClass0eM r7 = this.A04;
            BrandedContentDisclosureMenuViewModel brandedContentDisclosureMenuViewModel = (BrandedContentDisclosureMenuViewModel) r7.getValue();
            if (!brandedContentDisclosureMenuViewModel.A02) {
                brandedContentDisclosureMenuViewModel.A03 = AnonymousClass7TF.A1Z(this.A03);
                boolean z = bundle2.getBoolean("includes_suspected_sponsor");
                brandedContentDisclosureMenuViewModel.A0A = z;
                if (z) {
                    brandedContentDisclosureMenuViewModel.A0E = true;
                    ArrayList parcelableArrayList = bundle2.getParcelableArrayList("brand_partners");
                    if (parcelableArrayList != null) {
                        arrayList = AnonymousClass7TE.A1D(parcelableArrayList);
                    } else {
                        arrayList = 0sn.A00;
                    }
                    brandedContentDisclosureMenuViewModel.A08 = arrayList;
                    A0U = AnonymousClass7TE.A1C();
                } else {
                    brandedContentDisclosureMenuViewModel.A0E = bundle2.getBoolean("disclosure_fragment_is_paid_partnership_on");
                    ArrayList A0n = JTS.A0n(bundle2.getParcelableArrayList("brand_partners"));
                    brandedContentDisclosureMenuViewModel.A07 = A0n;
                    ArrayList A0r = AnonymousClass7TG.A0r(A0n);
                    Iterator it = A0n.iterator();
                    while (it.hasNext()) {
                        BrandedContentTag A0l = JTO.A0l(it);
                        0qQ.A0A(A0l);
                        A0r.add(new BrandedContentTag(A0l));
                    }
                    A0U = 00k.A0U(A0r);
                }
                brandedContentDisclosureMenuViewModel.A06 = A0U;
                BrandedContentGatingInfo brandedContentGatingInfo = (BrandedContentGatingInfo) bundle2.getParcelable("BRANDED_CONTENT_GATING_INFO");
                if (brandedContentGatingInfo == null) {
                    r7.getValue();
                    brandedContentGatingInfo = new BrandedContentGatingInfo((Integer) null, (String) null, (HashMap) null, (List) null, (List) null);
                }
                brandedContentDisclosureMenuViewModel.A01 = brandedContentGatingInfo;
                brandedContentDisclosureMenuViewModel.A0D = bundle2.getBoolean("disclosure_fragment_is_edit_flow");
                String string = bundle2.getString("ARGUMENT_MEDIA_TYPE");
                if (string == null) {
                    string = "feed";
                }
                brandedContentDisclosureMenuViewModel.A05 = string;
                brandedContentDisclosureMenuViewModel.A04 = this.A00;
                brandedContentDisclosureMenuViewModel.A09 = bundle2.getBoolean("has_interactive_elements_for_story");
                brandedContentDisclosureMenuViewModel.A02 = true;
                brandedContentDisclosureMenuViewModel.A0B = bundle2.getBoolean("argument_create_ad_code");
                String str = brandedContentDisclosureMenuViewModel.A04;
                if (str != null) {
                    1Xj A022 = DbX.A0d(this.A01).A02(str);
                    if (A022 != null) {
                        du2 = A022.A1E();
                    } else {
                        du2 = null;
                    }
                    brandedContentDisclosureMenuViewModel.A00 = du2;
                    if (du2 != null) {
                        brandedContentDisclosureMenuViewModel.A0B = true;
                    }
                }
                BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = (BrandedContentProjectMetadataIntf) bundle2.getParcelable("project_metadata");
                if (!(!JTT.A0H(r7).A0E || brandedContentProjectMetadataIntf == null || brandedContentProjectMetadataIntf.AYA() == BrandedContentProjectAction.REMOVE_MEDIA_FROM_PROJECT)) {
                    BrandedContentDisclosureMenuViewModel brandedContentDisclosureMenuViewModel2 = (BrandedContentDisclosureMenuViewModel) r7.getValue();
                    String Bhc = brandedContentProjectMetadataIntf.Bhc();
                    String Bhd = brandedContentProjectMetadataIntf.Bhd();
                    if (Bhd == null) {
                        Bhd = "";
                    }
                    String Ahf = brandedContentProjectMetadataIntf.Ahf();
                    if (Ahf == null) {
                        Ahf = "";
                    }
                    String Ahm = brandedContentProjectMetadataIntf.Ahm();
                    if (Ahm == null) {
                        Ahm = "";
                    }
                    C60996Jus jus = new C60996Jus(brandedContentProjectMetadataIntf.Aa1(), C51971G9r.A0m(), Bhc, Bhd, Ahf, Ahm, brandedContentProjectMetadataIntf.Ajv(), brandedContentProjectMetadataIntf.Aju(), (String) null);
                    brandedContentDisclosureMenuViewModel2.A00 = jus;
                    brandedContentDisclosureMenuViewModel2.A01 = jus;
                }
            }
        }
        06F.A00(this, "request_key_audience_restrictions", new C59111J6t(this, 35));
        View A0C = JTS.A0C(view2, R.id.action_bar);
        AnonymousClass0eM r6 = this.A03;
        if (AnonymousClass7TF.A1Z(r6)) {
            DbT.A18(requireContext(), AnonymousClass7TG.A0R(A0C, R.id.action_bar_title), 2131969192);
        }
        LY1.A00(A0C.requireViewById(R.id.action_bar_button_back), 0, this);
        View A0G = AnonymousClass7TF.A0G(A0C, R.id.done_button);
        if (AnonymousClass7TF.A1Z(this.A02) || AnonymousClass7TF.A1Z(r6)) {
            A0G.setVisibility(0);
            LY8.A00(A0G, 21, A0C, this);
        }
        1YN A002 = AnonymousClass2bO.A00();
        AnonymousClass0eM r3 = this.A01;
        UserSession A0l2 = AnonymousClass7TE.A0l(r3);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0C;
        AnonymousClass2bO.A00();
        C231002qi A012 = A002.A01(this, this, A0l2, 2bV.A02(new LvT(this, 3), LvY.A00), quickPromotionSlot);
        this.A00 = A012;
        EnumSet of = EnumSet.of(Trigger.A0F);
        0qQ.A07(of);
        A012.AVg(of);
        BrandedContentDisclosureMenuViewModel brandedContentDisclosureMenuViewModel3 = (BrandedContentDisclosureMenuViewModel) this.A04.getValue();
        if (brandedContentDisclosureMenuViewModel3.A03) {
            0lg A0X = DbT.A0X(r3);
            String str2 = brandedContentDisclosureMenuViewModel3.A04;
            String str3 = brandedContentDisclosureMenuViewModel3.A05;
            0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(this, A0X, 0), "instagram_partnership_and_ads_entry");
            A0e.AAJ("media_id", str2);
            A0e.AAJ("media_type", str3);
            A0e.Cgf();
        }
        Dba.A16(getViewLifecycleOwner(), brandedContentDisclosureMenuViewModel3.A04, new C58728Iwb(this, 18), 44);
        if (brandedContentDisclosureMenuViewModel3.A0A) {
            MH8.A03(brandedContentDisclosureMenuViewModel3, DbV.A0J(this), 20);
        }
        brandedContentDisclosureMenuViewModel3.A04();
        AnonymousClass7TE.A1Z(new MH4(brandedContentDisclosureMenuViewModel3, this, view2, (AnonymousClass4D7) null, 10), DbV.A0J(this));
        JVF.A01(this, AnonymousClass7TE.A0l(r3), AnonymousClass05K.A0J);
    }

    public final boolean Cts(boolean z) {
        BrandedContentTag brandedContentTag;
        BrandedContentDisclosureBaseViewModel A0H = JTT.A0H(this.A04);
        if (!C49946FGa.A06(DbT.A06(this, A0H, 1), this, AnonymousClass7TE.A0l(this.A01))) {
            if (z) {
                boolean z2 = A0H.A0D;
                String str = this.A00;
                if (z2) {
                    if (str != null) {
                        if (A0H.A06.size() > 1) {
                            C358248ab A0U = DbW.A0U(this);
                            A0U.A09(2131969179);
                            A0U.A08(2131969180);
                            Dba.A0t((DialogInterface.OnClickListener) null, A0U, 2131956164);
                        } else if (!0qQ.A0K(A0H.A05, "story") || !A0H.A09) {
                            str = this.A00;
                            if (str == null) {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            String str2 = null;
                            if (AnonymousClass7TE.A1b(A0H.A06) && (brandedContentTag = (BrandedContentTag) 00k.A0O(A0H.A06, 0)) != null) {
                                str2 = brandedContentTag.A01;
                            }
                            String str3 = this.A00;
                            if (str3 != null) {
                                K82.A00(new C64527LdU(this, A0H), this, A0H, str3, str2);
                                return false;
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                }
                return A0H.A07(this, str);
            }
            C358248ab A0U2 = DbW.A0U(this);
            A0U2.A09(2131969187);
            A0U2.A08(2131969186);
            A0U2.A0K(LV0.A00(this, A0H, 4), 2131954129);
            A0U2.A05();
            DbT.A1V(A0U2);
            return false;
        }
        return false;
    }

    public final boolean CuC(boolean z) {
        BrandedContentDisclosureMenuViewModel brandedContentDisclosureMenuViewModel = (BrandedContentDisclosureMenuViewModel) this.A04.getValue();
        brandedContentDisclosureMenuViewModel.A0E = z;
        if (!z) {
            brandedContentDisclosureMenuViewModel.A01 = null;
            brandedContentDisclosureMenuViewModel.A06.clear();
        }
        brandedContentDisclosureMenuViewModel.A04();
        return true;
    }

    public final boolean Cv5(boolean z) {
        JVF.A01(this, AnonymousClass7TE.A0l(this.A01), AnonymousClass05K.A0R);
        return A0C(JTT.A0H(this.A04), this.A00, z);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.2tE, X.KFJ, java.lang.Object] */
    public final Collection getDefinitions() {
        KFC kfc = new KFC(this);
        ? obj = new Object();
        AnonymousClass0eM r1 = this.A01;
        EG1 eg1 = new EG1(this, AnonymousClass7TE.A0l(r1));
        KFD kfd = new KFD(this);
        KG7 kg7 = new KG7(AnonymousClass7TE.A0l(r1));
        NOT not = new NOT(this, this, this, AnonymousClass7TE.A0l(r1));
        ? obj2 = new Object();
        obj2.A00 = null;
        return 0sr.A1M(new C232222tE[]{kfc, obj, eg1, kfd, kg7, not, obj2, new KGA(this, this, AnonymousClass7TE.A0l(r1), this, JTT.A0H(this.A04).A05)});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(C66324MNh.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
        if (X.AnonymousClass7TF.A1Z(r3.A02) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r18 = this;
            r3 = r18
            X.0eM r5 = r3.A04
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel r1 = X.JTT.A0H(r5)
            boolean r0 = r1.A0D
            r2 = 1
            if (r0 == 0) goto L_0x003c
            X.DU2 r0 = r1.A00
            if (r0 == 0) goto L_0x003c
            java.util.List r0 = r1.A06
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x003c
            X.8ab r4 = X.DbW.A0U(r3)
            r0 = 2131969179(0x7f13449b, float:1.9575274E38)
            r4.A09(r0)
            r0 = 2131969180(0x7f13449c, float:1.9575276E38)
            r4.A08(r0)
            r1 = 2131956164(0x7f1311c4, float:1.9548876E38)
            r0 = 0
            X.Dba.A0t(r0, r4, r1)
        L_0x0030:
            X.0eM r0 = r3.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0M
            X.JVF.A01(r3, r1, r0)
            return r2
        L_0x003c:
            X.0eM r0 = r3.A03
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0050
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel r0 = X.JTT.A0H(r5)
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x0050
        L_0x004c:
            X.DbT.A1I(r3)
            goto L_0x0030
        L_0x0050:
            java.lang.Object r1 = r5.getValue()
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel r1 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel) r1
            X.Jus r0 = r1.A01
            if (r0 == 0) goto L_0x0080
            com.instagram.api.schemas.BrandedContentProjectMetadata r8 = com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel.A01(r1)
        L_0x005e:
            com.instagram.common.session.UserSession r0 = r1.A05
            X.1Ng r7 = X.AnonymousClass1Nd.A00(r0)
            java.util.List r6 = r1.A06
            com.instagram.api.schemas.BrandedContentGatingInfo r4 = r1.A01
            boolean r1 = r1.A0E
            X.Lg6 r0 = new X.Lg6
            r0.<init>(r4, r8, r6, r1)
            r7.A00(r0)
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel r0 = X.JTT.A0H(r5)
            java.lang.String r1 = r0.A05
            int r0 = r1.hashCode()
            switch(r0) {
                case 3138974: goto L_0x00b4;
                case 3230752: goto L_0x00a0;
                case 3322092: goto L_0x00d6;
                case 3496474: goto L_0x009d;
                case 109770997: goto L_0x009a;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x0030
        L_0x0080:
            X.Jus r0 = r1.A00
            if (r0 == 0) goto L_0x0098
            com.instagram.api.schemas.BrandedContentProjectAction r10 = com.instagram.api.schemas.BrandedContentProjectAction.REMOVE_MEDIA_FROM_PROJECT
            java.lang.String r0 = r0.A05
            r9 = 0
            com.instagram.api.schemas.BrandedContentProjectMetadata r8 = new com.instagram.api.schemas.BrandedContentProjectMetadata
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r17 = r9
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x005e
        L_0x0098:
            r8 = 0
            goto L_0x005e
        L_0x009a:
            java.lang.String r0 = "story"
            goto L_0x00a2
        L_0x009d:
            java.lang.String r0 = "reel"
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r0 = "igtv"
        L_0x00a2:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            X.DbT.A1I(r3)
            X.0eM r0 = r3.A02
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0030
            goto L_0x004c
        L_0x00b4:
            java.lang.String r0 = "feed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel r0 = X.JTT.A0H(r5)
            boolean r0 = r0.A0D
            if (r0 != 0) goto L_0x004c
            X.0eM r1 = r3.A01
            X.C59888JbD.A02(r1)
            X.0eM r0 = r3.A02
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0030
            X.C59888JbD.A02(r1)
            goto L_0x0030
        L_0x00d6:
            java.lang.String r0 = "live"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            X.DbT.A1K(r3)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K8V.onBackPressed():boolean");
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.Object, X.2qU] */
    public K8V() {
        MMG A002 = MMG.A00(this, 26);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMG.A00(MMG.A00(this, 23), 24));
        this.A04 = DbS.A0I(MMG.A00(A003, 25), A002, new C58716IwP(44, (Object) null, (Object) A003), DbS.A0z(BrandedContentDisclosureMenuViewModel.class));
        AnonymousClass2bO.A00();
        this.A01 = new Object();
    }

    public final void Cu0() {
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r5 = this.A01;
        C309516Yo A0N = DbX.A0N(requireActivity, r5);
        C49892FBu.A02();
        AnonymousClass0eM r1 = this.A04;
        A0N.A0D(LSU.A01(JTT.A0H(r1).A01, JTT.A0H(r1).A05, JTT.A0H(r1).A0D, true));
        A0N.A04();
        JVF.A01(this, AnonymousClass7TE.A0l(r5), AnonymousClass05K.A0P);
    }

    public final void Cu1() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        AnonymousClass0eM r4 = this.A04;
        Iterator it = JTT.A0H(r4).A06.iterator();
        while (it.hasNext()) {
            BrandedContentTag A0l = JTO.A0l(it);
            User user = A0l.A00;
            if (user != null || (user = JTR.A0u(this.A01).A02(A0l.A01)) != null) {
                A1C.add(user);
            }
        }
        C49892FBu.A02();
        String str = JTT.A0H(r4).A05;
        boolean z = JTT.A0H(r4).A0D;
        BrandedContentGatingInfo brandedContentGatingInfo = JTT.A0H(r4).A01;
        boolean z2 = JTT.A0H(r4).A09;
        C61446K8a k8a = new C61446K8a();
        k8a.A01 = null;
        k8a.A07 = false;
        JTS.A1M(brandedContentGatingInfo, k8a, str, A1C, z);
        k8a.A08 = z2;
        0qQ.A0C(k8a, "null cannot be cast to non-null type com.instagram.brandedcontent.disclosure.BrandedContentAddBrandPartnersFragment");
        k8a.A01 = new C64518LdK(this);
        k8a.A07 = true;
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r2 = this.A01;
        C309516Yo A0N = DbX.A0N(requireActivity, r2);
        A0N.A0B((Bundle) null, k8a);
        A0N.A0A = Pxd.A00(236);
        A0N.A04();
        JVF.A01(this, AnonymousClass7TE.A0l(r2), AnonymousClass05K.A0L);
    }

    public final boolean Dil() {
        String str;
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r6 = this.A01;
        C309516Yo A0N = DbX.A0N(requireActivity, r6);
        C49892FBu.A02();
        C60996Jus jus = ((BrandedContentDisclosureMenuViewModel) this.A04.getValue()).A01;
        if (jus != null) {
            str = jus.A05;
        } else {
            str = null;
        }
        K84 k84 = new K84();
        DbZ.A1B(k84, "prev_selected_project_id", str);
        A0N.A0B((Bundle) null, k84);
        A0N.A04();
        JVF.A01(this, AnonymousClass7TE.A0l(r6), AnonymousClass05K.A0K);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2126625973);
        K8V.super.onCreate(bundle);
        DbX.A0R(this.A01).A01(this.A05, C64643LfV.class);
        AnonymousClass0fD.A09(1317492593, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-460773689);
        super.onDestroy();
        DbX.A0R(this.A01).A02(this.A05, C64643LfV.class);
        AnonymousClass0fD.A09(719368255, A022);
    }
}
