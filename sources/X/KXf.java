package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class KXf extends K6S {
    public static final String __redex_internal_original_name = "CampfireAudiencePickerFragment";
    public IgdsButton A00;
    public Integer A01 = AnonymousClass05K.A00;
    public String A02;
    public String A03;
    public boolean A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void CtJ(C46448DfA dfA) {
    }

    public final void configureActionBar(2da r5) {
        String A0e;
        0qQ.A0B(r5, 0);
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            Resources A052 = DbV.A05(this);
            String str = this.A03;
            if (str == null) {
                0qQ.A0F("currentCampfireName");
                throw AnonymousClass00P.createAndThrow();
            }
            A0e = AnonymousClass7TF.A0e(A052, str, 2131954677);
        } else if (intValue == 0) {
            A0e = requireContext().getString(2131954709);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        r5.ErN(A0e);
        r5.Eu4(true);
        DbX.A1A(new LYE((Object) this, 60), DbV.A0K(), r5);
    }

    public final String getModuleName() {
        return C273654mx.A00(126);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.K6S, X.KXf] */
    public final void onViewCreated(View view, Bundle bundle) {
        IgdsButton igdsButton;
        int i;
        AnonymousClass3AR r1;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A09().A00 = new C63870L9z(requireContext(), (String) null, (String) null, 0, true);
        TextView A0R = AnonymousClass7TG.A0R(requireView(), R.id.audience_picker_disclaimer_text);
        String A16 = AnonymousClass7TE.A16(requireContext(), 2131954688);
        SpannableStringBuilder append = DbW.A08(requireContext(), 2131954686).append("\n").append(A16);
        0qQ.A07(append);
        AnonymousClass7AV.A03(append, new C62146Kaz((KXf) this, JTP.A02(getContext(), requireContext(), R.attr.igds_color_gradient_blue)), A16);
        A0R.setMovementMethod(AnonymousClass6LK.A00);
        A0R.setText(append);
        View A0F = AnonymousClass7TF.A0F(requireView(), R.id.campfire_audience_picker_edit_name_container);
        TextView A0R2 = AnonymousClass7TG.A0R(requireView(), R.id.campfire_audience_picker_edit_name);
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            A0F.setVisibility(8);
        } else if (intValue == 0) {
            A0F.setVisibility(0);
            A0R2.addTextChangedListener(new LWO(1, A0R2, this));
        } else {
            throw AnonymousClass7TE.A1K();
        }
        ViewGroup A0I = DbX.A0I(requireView(), R.id.main_container);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AnonymousClass7TF.A0F(requireView(), R.id.search_box);
        View A0G = AnonymousClass7TF.A0G(requireView(), R.id.search_exit_button);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A05);
        C62045KXl kXl = new C62045KXl(requireContext, A0G, AnonymousClass07i.A00(this), A0l, igdsInlineSearchBox, new C65618Lwt(this, 2), A09());
        kXl.A02();
        this.A01 = kXl;
        A0I.getLayoutTransition().addTransitionListener(new LTf(igdsInlineSearchBox));
        AnonymousClass3AS r12 = JTR.A0c(requireView(), R.id.recycler_view).A0C;
        if ((r12 instanceof AnonymousClass3AR) && (r1 = (AnonymousClass3AR) r12) != null) {
            r1.A00 = false;
        }
        IgdsButton A0b = DbU.A0b(requireView(), R.id.done_button);
        this.A00 = A0b;
        if (A0b != null) {
            A0b.setEnabled(false);
        }
        IgdsButton igdsButton2 = this.A00;
        if (igdsButton2 != null) {
            igdsButton2.setVisibility(0);
        }
        int intValue2 = this.A01.intValue();
        if (intValue2 == 1) {
            IgdsButton igdsButton3 = this.A00;
            if (igdsButton3 != null) {
                igdsButton3.setText(2131960992);
            }
            igdsButton = this.A00;
            if (igdsButton != null) {
                i = 61;
            }
            A05(this);
        } else if (intValue2 == 0) {
            IgdsButton igdsButton4 = this.A00;
            if (igdsButton4 != null) {
                igdsButton4.setText(2131954681);
            }
            igdsButton = this.A00;
            if (igdsButton != null) {
                i = 62;
            }
            A05(this);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        LYE.A00(igdsButton, i, this);
        A05(this);
    }

    public static final void A06(KXf kXf) {
        IgdsButton igdsButton;
        int size = kXf.A03.A03.size();
        int intValue = kXf.A01.intValue();
        boolean z = false;
        if (intValue == 1) {
            igdsButton = kXf.A00;
            if (igdsButton == null) {
                return;
            }
        } else if (intValue == 0) {
            igdsButton = kXf.A00;
            if (igdsButton != null) {
                if (size > 0) {
                    String str = kXf.A03;
                    if (str == null) {
                        0qQ.A0F("currentCampfireName");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    size = str.length();
                }
                igdsButton.setEnabled(z);
            }
            return;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        if (size > 0) {
            z = true;
        }
        igdsButton.setEnabled(z);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.K6S, X.KXf] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.KXf r4) {
        /*
            X.K9H r3 = r4.A09()
            android.content.Context r2 = r4.requireContext()
            X.6rr r1 = X.C320156rr.LOADING
            r0 = 0
            r3.A04(r2, r0, r1)
            java.lang.Integer r0 = r4.A01
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0029
            r0 = 0
            if (r1 != r0) goto L_0x0024
            X.0xx r1 = X.DbW.A0E(r4)
            r0 = 35
            X.MG8.A01(r4, r1, r0)
            return
        L_0x0024:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0029:
            X.0xx r1 = X.DbW.A0E(r4)
            r0 = 34
            X.MG8.A01(r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KXf.A05(X.KXf):void");
    }

    public final void A0C(IgdsCheckBox igdsCheckBox, C61036Jva jva) {
        AnonymousClass7TG.A1N(jva, igdsCheckBox);
        super.A0C(igdsCheckBox, jva);
        A0A().A00();
        A06(this);
    }

    public final boolean onBackPressed() {
        DbT.A1K(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        int A022 = AnonymousClass0fD.A02(-1860413140);
        KXf.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(AnonymousClass000.A00(154));
        if (string != null) {
            if (string.equals("CREATION")) {
                num = AnonymousClass05K.A00;
            } else if (string.equals("ADD_PEOPLE")) {
                num = AnonymousClass05K.A01;
            } else {
                throw AnonymousClass7TE.A0w(string);
            }
            this.A01 = num;
        }
        String string2 = requireArguments.getString("hall_pass_name");
        if (string2 == null) {
            string2 = "";
        }
        this.A03 = string2;
        this.A02 = requireArguments.getString("hall_pass_id");
        this.A04 = requireArguments.getBoolean(AnonymousClass000.A00(1157));
        AnonymousClass0fD.A09(-1052613256, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-18665893);
        K6S.A03(this, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.layout_campfire_audience_picker, viewGroup, false);
        AnonymousClass0fD.A09(-702170638, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1784438133);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(1914439839, A022);
    }
}
