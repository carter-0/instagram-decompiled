package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class H1U extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "TranslationAttributionSheetFragment";
    public RecyclerView A00;
    public C252063oV A01;
    public SpinnerImageView A02;
    public String A03 = "";
    public C55688Hll A04;
    public String A05 = "";
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = DbX.A0k(view);
        this.A01 = DbV.A0T(view, R.id.translation_load_fail, false);
        Context context = getContext();
        if (context != null) {
            RecyclerView A0I = DbT.A0I(view, R.id.translation_recycler_view);
            A0I.setLayoutManager(new LinearLayoutManager(context));
            C55688Hll hll = new C55688Hll(context);
            this.A04 = hll;
            A0I.setAdapter(hll.A01);
            A0I.A11(new C53090GiO(0, 24, AnonymousClass7TF.A03(A0I.getContext(), R.attr.igds_color_elevated_separator), true));
            this.A00 = A0I;
        }
        A01(this);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.H1U r6, java.lang.String r7, java.util.List<X.C54069Gys> r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 31
            boolean r0 = X.C66147MDz.A02(r3, r9)
            if (r0 == 0) goto L_0x00a7
            r4 = r9
            X.MDz r4 = (X.C66147MDz) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a7
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0093
            if (r0 != r2) goto L_0x00ae
            java.lang.Object r8 = r4.A03
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r4.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r4.A01
            X.H1U r6 = (X.H1U) r6
            X.0eS.A00(r1)
        L_0x0030:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r6.A02
            if (r1 == 0) goto L_0x0039
            X.3uy r0 = X.C255943uy.SUCCESS
            r1.setLoadingStatus(r0)
        L_0x0039:
            androidx.recyclerview.widget.RecyclerView r0 = r6.A00
            X.AnonymousClass7TF.A16(r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x004a
            A02(r6, r2)
        L_0x0047:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x004a:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r8.iterator()
        L_0x0052:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r0 = r4.next()
            X.Gys r0 = (X.C54069Gys) r0
            java.lang.String r3 = r0.A00
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A02
            X.IOb r0 = new X.IOb
            r0.<init>(r7, r3, r2, r1)
            r5.add(r0)
            goto L_0x0052
        L_0x006d:
            X.Hll r3 = r6.A04
            if (r3 != 0) goto L_0x007b
            java.lang.String r0 = "translationAttributionAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007b:
            java.util.List r0 = r3.A00
            r0.clear()
            r0.addAll(r5)
            X.2t9 r2 = r3.A01
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r1.<init>()
            java.util.List r0 = r3.A00
            r1.A01(r0)
            r2.A05(r1)
            goto L_0x0047
        L_0x0093:
            X.0eS.A00(r1)
            r0 = 300(0x12c, double:1.48E-321)
            r4.A01 = r6
            r4.A02 = r7
            r4.A03 = r8
            r4.A00 = r2
            java.lang.Object r0 = X.C241603Pv.A01(r4, r0)
            if (r0 != r3) goto L_0x0030
            return r3
        L_0x00a7:
            X.MDz r4 = new X.MDz
            r4.<init>(r6, r9, r3)
            goto L_0x0016
        L_0x00ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1U.A00(X.H1U, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }

    public static final void A01(H1U h1u) {
        0lg A0X = DbT.A0X(h1u.A06);
        String str = h1u.A03;
        AnonymousClass7TF.A1H(A0X, str);
        1NY A0b = AnonymousClass7TG.A0b(A0X);
        A0b.A0A("language/story_translate/");
        A0b.A9m(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        AnonymousClass11O.A03(DbV.A0J(h1u), JUM.A02(new C20607Wvo(h1u, 36), JUM.A03(new C58092ImE(h1u, (AnonymousClass4D7) null, 22), JUM.A04(new C58100ImM(h1u, (AnonymousClass4D7) null, 10), JUM.A00(new C58092ImE(23, (AnonymousClass4D7) null), JUM.A01(new MEQ(28, (AnonymousClass4D7) null), JUM.A02(C58671Ivg.A00, DbT.A0R((15p) null, A0b, C54064Gyn.class, C56377HxW.class, false).A03(431659549))))))));
    }

    public static final void A02(H1U h1u, boolean z) {
        SpinnerImageView spinnerImageView = h1u.A02;
        if (spinnerImageView != null) {
            spinnerImageView.setVisibility(8);
        }
        RecyclerView recyclerView = h1u.A00;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        C252063oV r3 = h1u.A01;
        if (r3 == null) {
            0qQ.A0F("errorViewStubHolder");
            throw AnonymousClass00P.createAndThrow();
        }
        TextView A0G = DbU.A0G(r3.getView(), R.id.translation_load_failed_title);
        Resources resources = A0G.getResources();
        int i = 2131975514;
        if (z) {
            i = 2131975517;
        }
        DbU.A1A(resources, A0G, i);
        0nA.A0X(A0G, resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
        TextView A0G2 = DbU.A0G(r3.getView(), R.id.translation_load_fail_try_again);
        DbU.A1A(A0G2.getResources(), A0G2, 2131975551);
        C56801ICy.A01(A0G2, 70, h1u);
        Context context = A0G2.getContext();
        DbT.A17(context, A0G2, 2Yu.A06(context));
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A0F;
    }

    public final String getModuleName() {
        return C49092EpH.A00(this, this.A05);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(791479808);
        H1U.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = C320236s2.A01(requireArguments, "args_media_id");
        this.A05 = C320236s2.A01(requireArguments, AnonymousClass000.A00(253));
        setModuleNameV2("stories_translation_sheet");
        AnonymousClass0fD.A09(-292104005, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1969654379);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.translation_attribution_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(944775999, A022);
        return inflate;
    }
}
