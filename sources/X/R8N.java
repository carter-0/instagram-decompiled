package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class R8N extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BrowserSettingsMenuFragment";
    public String A00 = "account_settings";
    public String A01 = "";
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06 = true;
    public RecyclerView A07;
    public final List A08 = AnonymousClass7TE.A1C();
    public final List A09 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0A = C66299MMi.A01(this, 34);
    public final AnonymousClass0eM A0B = C66299MMi.A01(this, 36);
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final AnonymousClass0eM A0D = C66299MMi.A01(this, 37);
    public final List A0E = AnonymousClass7TE.A1C();
    public final List A0F = AnonymousClass7TE.A1C();
    public final List A0G = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0H = C66299MMi.A01(this, 35);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131964212);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.A07 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter((2Rw) this.A0A.getValue());
            RecyclerView recyclerView2 = this.A07;
            if (recyclerView2 != null) {
                DbU.A15(getContext(), recyclerView2, 1, false);
                A03(this);
                if (this.A03) {
                    C11423SSz A002 = Ri1.A00(AnonymousClass7TE.A0l(this.A0C));
                    if (A002.A03.contains("browser_link_history_opt_in_key")) {
                        z = DbX.A1a(A002.A05());
                    } else {
                        z = false;
                    }
                    A07(this, z);
                    C9836Rhy.A00((C11242SHc) this.A0B.getValue(), new MPA(this, 40), C13376TXl.A00, false);
                }
                if (getContext() != null) {
                    AnonymousClass0eM r7 = this.A0C;
                    int A003 = RUW.A00(new 1yd(AnonymousClass7TE.A0l(r7)));
                    int i = ((1Av) this.A0D.getValue()).A01.getInt("browser_consecutive_decline_autofill", 0);
                    SRr.A03(AnonymousClass7TE.A0l(r7), new C12805T7s(this, A003));
                    if (getContext() != null) {
                        A06(this, AnonymousClass7TF.A1T(i, A003));
                    }
                }
                if (this.A04) {
                    SpinnerImageView spinnerImageView = (SpinnerImageView) AnonymousClass7TF.A0F(view, R.id.loading_spinner);
                    2Fg r2 = new 2Fg(requireActivity(), (C270254gR) null);
                    if (2Fg.A01(r2.A04, r2, "org.chromium.intent.action.IS_READY_TO_PAY") != null) {
                        spinnerImageView.setLoadingStatus(C255943uy.LOADING);
                        this.A02 = true;
                        r2.A04(new C12513Svq(this, spinnerImageView));
                    } else if (getContext() != null) {
                        A08(this, false);
                    }
                }
                A04(this);
                return;
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final S3Q A00(R8N r8n) {
        return (S3Q) r8n.A0H.getValue();
    }

    private final void A02() {
        String A0h;
        long A0P = AnonymousClass7TE.A0P(Ri1.A00(AnonymousClass7TE.A0l(this.A0C)).A03.getLong("browser_last_clear_date_key", 0));
        if (A0P > 0 && (A0h = DbW.A0h(requireContext(), 1G0.A03(requireContext(), (double) A0P), 2131954291)) != null && A0h.length() != 0) {
            FGF fgf = new FGF((CharSequence) A0h);
            fgf.A01 = R.style.PrivacyTextStyle;
            fgf.A02 = R.dimen.action_bar_item_spacing_right;
            this.A08.add(fgf);
        }
    }

    public static final void A03(R8N r8n) {
        C46448DfA dfA;
        List list = r8n.A08;
        list.clear();
        if (r8n.A03) {
            list.add(dfA);
            Context requireContext = r8n.requireContext();
            String A16 = AnonymousClass7TE.A16(requireContext, 2131954285);
            FGF A012 = A01(requireContext, DbS.A0C(A16), A16, 2Yu.A0D(requireContext));
            A012.A02 = R.dimen.action_bar_item_spacing_right;
            A012.A04 = new C11495SbI(r8n, 14);
            list.add(A012);
            r8n.A02();
            FGF fgf = new FGF(2131954293);
            fgf.A01 = R.style.PrivacyTextStyle;
            fgf.A02 = R.dimen.action_bar_item_spacing_right;
            list.add(fgf);
            return;
        }
        dfA = new C46448DfA(2131954290);
        dfA.A0G = r8n.requireContext().getString(2131955133);
        dfA.A0I = false;
        list.add(dfA);
        FGF fgf2 = new FGF(2131954292);
        fgf2.A01 = R.style.PrivacyTextStyle;
        fgf2.A02 = R.dimen.action_bar_item_spacing_right;
        list.add(fgf2);
        r8n.A02();
    }

    public static final void A04(R8N r8n) {
        List list = r8n.A0G;
        list.clear();
        C46448DfA dfA = new C46448DfA(2131954317);
        dfA.A0I = true;
        list.add(dfA);
        1Av r3 = (1Av) r8n.A0D.getValue();
        list.add(new PR9((CompoundButton.OnCheckedChangeListener) new C11531Sbs(r8n, 9), 2131954313, AnonymousClass7TG.A1a(r3, r3.A7C, 1Av.A8a, 168)));
        Context requireContext = r8n.requireContext();
        String A16 = AnonymousClass7TE.A16(requireContext, 2131964884);
        String A10 = C66580MXl.A10(requireContext.getString(2131954312), A16);
        RBY rby = new RBY(r8n, requireContext.getColor(2Yu.A06(requireContext)), 4);
        SpannableStringBuilder A0C2 = DbS.A0C(A10);
        AnonymousClass7AV.A04(A0C2, rby, A16);
        FGF fgf = new FGF(A0C2);
        fgf.A01 = R.style.PrivacyTextStyle;
        list.add(fgf);
    }

    public static final void A06(R8N r8n, boolean z) {
        Collection collection;
        List list = r8n.A0E;
        list.clear();
        PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) new C11531Sbs(r8n, 7), 2131954282, z);
        list.add(pr9);
        if (pr9.A0D) {
            boolean z2 = true;
            r8n.requireContext();
            r8n.A0C.getValue();
            ArrayList A1M = 0sr.A1M(new ArrayList[]{23d.A02()});
            if (!DbT.A1b(A1M) || (collection = (Collection) A1M.get(0)) == null || collection.isEmpty()) {
                z2 = false;
            }
            Context requireContext = r8n.requireContext();
            int i = 2131954294;
            if (z2) {
                i = 2131954295;
            }
            String string = requireContext.getString(i);
            0qQ.A0A(string);
            SpannableStringBuilder A0C2 = DbS.A0C(string);
            Context requireContext2 = r8n.requireContext();
            Context context = r8n.getContext();
            int i2 = R.attr.igds_color_primary_button;
            if (z2) {
                i2 = R.attr.igds_color_primary_text;
            }
            FGF A012 = A01(requireContext2, A0C2, string, 2Yu.A0H(context, i2));
            A012.A02 = R.dimen.action_bar_item_spacing_right;
            A012.A04 = new C11495SbI(r8n, 15);
            list.add(A012);
        }
    }

    public static final void A07(R8N r8n, boolean z) {
        String A0h;
        List list = r8n.A09;
        list.clear();
        C46448DfA dfA = new C46448DfA(2131954303);
        dfA.A0I = true;
        list.add(dfA);
        list.add(new PR9((CompoundButton.OnCheckedChangeListener) new C11531Sbs(r8n, 8), 2131954306, z));
        Context requireContext = r8n.requireContext();
        String A16 = AnonymousClass7TE.A16(requireContext, 2131954304);
        FGF A012 = A01(requireContext, DbS.A0C(A16), A16, 2Yu.A0D(requireContext));
        A012.A02 = R.dimen.action_bar_item_spacing_right;
        A012.A04 = new C11495SbI(r8n, 16);
        list.add(A012);
        if (z) {
            long A0P = AnonymousClass7TE.A0P(Ri1.A00(AnonymousClass7TE.A0l(r8n.A0C)).A03.getLong("browser_last_clear_link_history_date_key", 0));
            if (!(A0P <= 0 || (A0h = DbW.A0h(r8n.requireContext(), 1G0.A03(r8n.requireContext(), (double) A0P), 2131954305)) == null || A0h.length() == 0)) {
                FGF fgf = new FGF((CharSequence) A0h);
                fgf.A01 = R.style.PrivacyTextStyle;
                fgf.A02 = R.dimen.action_bar_item_spacing_right;
                list.add(fgf);
            }
        }
        String A162 = AnonymousClass7TE.A16(requireContext, 2131954307);
        String A10 = C66580MXl.A10(requireContext.getString(2131954296), A162);
        RBY rby = new RBY(r8n, requireContext.getColor(2Yu.A06(requireContext)), 3);
        SpannableStringBuilder A0C2 = DbS.A0C(A10);
        AnonymousClass7AV.A04(A0C2, rby, A162);
        FGF fgf2 = new FGF(A0C2);
        fgf2.A01 = R.style.PrivacyTextStyle;
        list.add(fgf2);
    }

    public static final void A08(R8N r8n, boolean z) {
        int i = ((1Av) r8n.A0D.getValue()).A01.getInt("browser_autofill_payment_decline_count", 0);
        AnonymousClass0eM r5 = r8n.A0C;
        boolean A1T = AnonymousClass7TF.A1T(i, DbS.A04(0Tu.A06, DbT.A0X(r5), 36591905888927797L));
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        SRr.A00(new C8766R8r(4, new C12807T7u(r8n, z, A1T), A0l), A0l);
        if (r8n.getContext() != null) {
            A09(r8n, z, A1T);
        }
    }

    public static final void A09(R8N r8n, boolean z, boolean z2) {
        List list = r8n.A0F;
        list.clear();
        PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) new FQ0(0, r8n, z), 2131954283, z2);
        list.add(pr9);
        if (pr9.A0D) {
            Context requireContext = r8n.requireContext();
            int i = 2131954309;
            if (z) {
                i = 2131954310;
            }
            String A16 = AnonymousClass7TE.A16(requireContext, i);
            SpannableStringBuilder A0C2 = DbS.A0C(A16);
            Context requireContext2 = r8n.requireContext();
            Context context = r8n.getContext();
            int i2 = R.attr.igds_color_primary_button;
            if (z) {
                i2 = R.attr.igds_color_primary_text;
            }
            FGF A012 = A01(requireContext2, A0C2, A16, 2Yu.A0H(context, i2));
            A012.A02 = R.dimen.action_bar_item_spacing_right;
            A012.A04 = new C11495SbI(r8n, 17);
            list.add(A012);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public static FGF A01(Context context, SpannableStringBuilder spannableStringBuilder, String str, int i) {
        AnonymousClass7AV.A04(spannableStringBuilder, new C2806552w(Integer.valueOf(context.getColor(i))), str);
        FGF fgf = new FGF(spannableStringBuilder);
        fgf.A01 = R.style.control_option_title_text;
        return fgf;
    }

    public static final void A05(R8N r8n) {
        C231642s0 r0;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(r8n.A08);
        A1C.addAll(r8n.A09);
        C46448DfA dfA = new C46448DfA(2131954284);
        dfA.A0I = true;
        A1C.add(dfA);
        A1C.addAll(r8n.A0E);
        A1C.addAll(r8n.A0F);
        Context requireContext = r8n.requireContext();
        String A16 = AnonymousClass7TE.A16(requireContext, 2131964884);
        int i = 2131954316;
        if (r8n.A04) {
            i = 2131954311;
        }
        StringBuilder A162 = Pxe.A16(requireContext.getString(i));
        A162.append(" ");
        if (r8n.A05) {
            A162.append(requireContext.getString(2131954281));
            A162.append(" ");
        }
        A162.append(A16);
        A162.append(" ");
        RBY rby = new RBY(r8n, requireContext.getColor(2Yu.A06(requireContext)), 2);
        SpannableStringBuilder A0C2 = DbS.A0C(A162.toString());
        AnonymousClass7AV.A04(A0C2, rby, A16);
        FGF fgf = new FGF(A0C2);
        fgf.A01 = R.style.PrivacyTextStyle;
        fgf.A02 = R.dimen.action_bar_item_spacing_right;
        A1C.add(fgf);
        A1C.addAll(r8n.A0G);
        C8756R8h r8h = (C8756R8h) r8n.A0A.getValue();
        List list = r8h.A09;
        list.clear();
        list.addAll(A1C);
        r8h.clear();
        for (Object next : list) {
            if (next instanceof PR9) {
                r0 = r8h.A05;
            } else if (next instanceof FGF) {
                r0 = r8h.A06;
            } else if (next instanceof OIM) {
                r0 = r8h.A04;
            } else if (next instanceof C67293MlS) {
                if (((C67293MlS) next).A02 == 2131954304) {
                    r0 = r8h.A01;
                } else {
                    r0 = r8h.A00;
                }
            } else if (!(next instanceof C46448DfA)) {
                throw AnonymousClass7TE.A0z(C66579MXk.A00(1178));
            } else if (r8h.A0A || ((C46448DfA) next).A0G != null) {
                int i2 = ((C46448DfA) next).A05;
                if (i2 == -1 || i2 != 2131954303) {
                    r0 = r8h.A07;
                } else {
                    r0 = r8h.A08;
                }
            } else {
                r8h.addModel(next, r8h.A02, r8h.A03);
            }
            r8h.addModel(next, r0);
        }
        r8h.notifyDataSetChanged();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1966130950);
        R8N.super.onCreate(bundle);
        AnonymousClass0eM r5 = this.A0C;
        0lg A0X = DbT.A0X(r5);
        0Tu r3 = 0Tu.A05;
        this.A05 = 182.A06(r3, A0X, 2342153440123813952L);
        this.A04 = 182.A06(r3, DbT.A0X(r5), 2342153440123224124L);
        this.A03 = C9837Rhz.A00(AnonymousClass7TE.A0l(r5));
        Bundle bundleExtra = requireActivity().getIntent().getBundleExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS);
        if (bundleExtra != null && !bundleExtra.isEmpty()) {
            C7572QKn qKn = new C7572QKn(bundleExtra);
            this.A06 = DbT.A1X(qKn.A00, "TrackingInfo.ARG_ENABLE_SAFE_BROWSING_SETTING_LOGGING");
            String string = qKn.A00.getString("Tracking.ARG_CLICK_SOURCE");
            String str = "";
            if (string == null) {
                string = str;
            }
            this.A00 = string;
            String string2 = qKn.A00.getString("Tracking.ARG_SESSION_ID");
            if (string2 != null) {
                str = string2;
            }
            this.A01 = str;
        }
        AnonymousClass0fD.A09(-1954493664, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-372959178);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_browser_settings_recyclerview, false);
        AnonymousClass0fD.A09(230131400, A022);
        return A0D2;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-985867124);
        super.onResume();
        if (!this.A02) {
            A05(this);
        }
        AnonymousClass0fD.A09(335220103, A022);
    }
}
