package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.api.schemas.LinkAction;
import com.instagram.common.session.UserSession;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class E38 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EditFullNameFragment";
    public ActionButton A00;
    public IgTextView A01;
    public IgFormField A02;
    public F1D A03;
    public C322326ve A04;
    public User A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public IgTextView A0E;
    public boolean A0F;
    public final AnonymousClass0eM A0G = C227642jf.A02(this);

    public final String getModuleName() {
        return "profile_edit_full_name";
    }

    /* JADX WARNING: type inference failed for: r0v41, types: [X.U22, android.text.method.LinkMovementMethod] */
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        ArrayList arrayList;
        IgFormField igFormField;
        IgTextView igTextView;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A02 = DbT.A0d(view2, R.id.full_name);
        this.A01 = DbT.A0a(view2, R.id.full_name_change_limiting_textview);
        AnonymousClass0eM r4 = this.A0G;
        0lg A0X = DbT.A0X(r4);
        0Tu r8 = 0Tu.A05;
        if (DbW.A1U(r8, A0X) || DbW.A1V(r8, DbT.A0X(r4))) {
            this.A0E = DbT.A0a(view2, R.id.full_name_data_transparency_textview);
            boolean A1U = DbW.A1U(r8, DbT.A0X(r4));
            IgTextView igTextView2 = this.A0E;
            if (!A1U) {
                String A0m = DbU.A0m(this, 2131957413);
                String A0z = DbV.A0z(this, A0m, 2131957417);
                0qQ.A07(A0z);
                if (igTextView2 != null) {
                    DbT.A1H(igTextView2);
                    Context A0S = AnonymousClass7TE.A0S(igTextView2);
                    SpannableStringBuilder A0C2 = DbS.A0C(A0z);
                    AnonymousClass7AV.A05(A0C2, new ESx(this, DbV.A02(A0S)), A0m);
                    igTextView2.setText(A0C2);
                    igTextView2.setVisibility(0);
                }
            } else if (igTextView2 != null) {
                DbU.A1G(igTextView2, this, 2131957416);
            }
            IgTextView igTextView3 = this.A0E;
            if (igTextView3 != null) {
                igTextView3.setVisibility(0);
            }
        }
        String str = this.A07;
        if (!(str == null || str.length() == 0 || (igTextView = this.A01) == null)) {
            igTextView.setText(str);
        }
        IgFormField igFormField2 = this.A02;
        if (igFormField2 != null) {
            igFormField2.getMEditText().setImeOptions(6);
        }
        IgFormField igFormField3 = this.A02;
        if (igFormField3 != null) {
            FQe.A00(igFormField3.getMEditText(), this, 14);
        }
        if (!this.A0F && (igFormField = this.A02) != null) {
            String str2 = this.A09;
            if (str2 != null) {
                igFormField.setText(str2);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        A00(this);
        TextView A0R = AnonymousClass7TG.A0R(view2, R.id.fx_im_name_sync_reminder_textview);
        AnonymousClass3JC r0 = DE2.A00;
        if (r0 != null && (obj = r0.A01) != null && ((DZP) obj).B8l() != null && ((DZP) DE2.A00.A01).B8l().BVM() != null) {
            Context requireContext = requireContext();
            0lg A0X2 = DbT.A0X(r4);
            G9I A042 = DE2.A04();
            if (A042.AgY() == null || C296675qS.A03(A042.AgY().getText())) {
                throw DbZ.A0a();
            }
            String text = A042.AgY().getText();
            G9I A043 = DE2.A04();
            if (A043.AgY() != null) {
                int offset = ((G9H) A043.AgY().BjC().get(0)).getOffset();
                if (182.A06(r8, A0X2, 36325768237823183L)) {
                    try {
                        arrayList = DE2.A0D();
                    } catch (IllegalStateException unused) {
                        DbT.A1Q(0wj.A01, "crash_getting_name_passive_reminder_style", 817890849);
                        arrayList = null;
                    }
                } else {
                    arrayList = DE2.A0D();
                }
                SpannableString A002 = C18186Vn0.A00(requireContext, new TextWithEntities((LinkAction) null, (Long) null, text.substring(0, offset), (List) null, arrayList, (List) null));
                String substring = text.substring(offset);
                int A012 = DbU.A01(requireContext);
                SpannableString spannableString = new SpannableString(substring);
                spannableString.setSpan(new C46690DjJ(A012, 3, this, A0X2), 0, substring.length(), 33);
                CharSequence concat = TextUtils.concat(new CharSequence[]{A002, spannableString});
                0qQ.A07(concat);
                A0R.setVisibility(0);
                A0R.setText(concat);
                U22 u22 = U22.A00;
                U22 u222 = u22;
                if (u22 == null) {
                    ? linkMovementMethod = new LinkMovementMethod();
                    U22.A00 = linkMovementMethod;
                    u222 = linkMovementMethod;
                }
                A0R.setMovementMethod(u222);
                FGS.A02(C48144EZm.BIZ_EDIT_NAME, AnonymousClass7TE.A0l(r4), "reminder_shown");
                return;
            }
            throw DbZ.A0a();
        }
    }

    public static final void A00(E38 e38) {
        if (e38.A0B) {
            IgFormField igFormField = e38.A02;
            if (igFormField != null) {
                igFormField.getMEditText().setFocusable(false);
            }
            IgFormField igFormField2 = e38.A02;
            if (igFormField2 != null) {
                igFormField2.getMEditText().setEnabled(false);
            }
            ActionButton actionButton = e38.A00;
            if (actionButton != null) {
                actionButton.setEnabled(false);
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public static final void A01(E38 e38) {
        C358248ab A0U;
        String A16;
        DialogInterface.OnClickListener onClickListener;
        AnonymousClass3JC r1;
        Object obj;
        if (e38.getActivity() != null) {
            AnonymousClass0eM r5 = e38.A0G;
            C49728F3s A002 = C49061Eof.A00(AnonymousClass7TE.A0l(r5));
            EWT ewt = EWT.EDIT_NAME_FLOW;
            A002.A00(ewt, AnonymousClass05K.A01);
            C49061Eof.A00(AnonymousClass7TE.A0l(r5)).A00(ewt, AnonymousClass05K.A0C);
            C322326ve r2 = e38.A04;
            CharSequence charSequence = null;
            if (r2 != null) {
                r2.A0A("name_change_confirmed", false);
            }
            0nA.A0N(DbV.A0G(e38).getDecorView());
            UserSession A0l = AnonymousClass7TE.A0l(r5);
            Integer num = AnonymousClass05K.A0Y;
            if (AnonymousClass7TE.A0q(A0l).getBoolean("fxim_has_seen_reminder_dialog_on_name_update", false) || (r1 = DE2.A00) == null || (obj = r1.A01) == null || ((DZP) obj).B8l() == null || ((DZP) DE2.A00.A01).B8l().BVL() == null) {
                if (e38.A0D) {
                    A0U = DbW.A0U(e38);
                    String str = e38.A06;
                    if (str == null || str.length() == 0) {
                        str = e38.requireContext().getString(2131953167);
                    }
                    A0U.A0q(str);
                    A0U.A0d(C50021FJg.A00(e38, 6), AnonymousClass7TE.A16(e38.requireContext(), 2131968772));
                    A16 = AnonymousClass7TE.A16(e38.requireContext(), 2131954722);
                    onClickListener = FJN.A00;
                } else {
                    IgFormField igFormField = e38.A02;
                    if (igFormField != null) {
                        charSequence = igFormField.getText();
                    }
                    String valueOf = String.valueOf(charSequence);
                    if (!0qQ.A0K(e38.A09, valueOf)) {
                        A0U = DbW.A0U(e38);
                        A0U.A05 = DbW.A0h(e38.requireContext(), valueOf, 2131970038);
                        DbU.A17(e38.requireContext(), A0U, 2131970037);
                        A0U.A0Y(C50021FJg.A00(e38, 7), C358278ae.BLUE, AnonymousClass7TE.A16(e38.requireContext(), 2131967981), true);
                        A16 = AnonymousClass7TE.A16(e38.requireContext(), 2131954722);
                        onClickListener = FJO.A00;
                    } else {
                        A02(e38);
                        return;
                    }
                }
                A0U.A0b(onClickListener, A16);
                AnonymousClass7TH.A0a(A0U, true);
                return;
            }
            C48928EmS.A00(e38.getContext(), new FIL(e38, AnonymousClass7TE.A0l(r5), num), AnonymousClass7TE.A0l(r5), new C50463FcB(e38), num);
        }
    }

    public static final void A02(E38 e38) {
        CharSequence charSequence;
        1OC A072;
        int i;
        CharSequence charSequence2;
        if (e38.getActivity() != null) {
            if (!e38.A0F) {
                DbU.A0L(e38, 2dZ.A0t).setIsLoading(true);
                0lg A0X = DbT.A0X(e38.A0G);
                IgFormField igFormField = e38.A02;
                if (igFormField != null) {
                    charSequence2 = igFormField.getText();
                } else {
                    charSequence2 = null;
                }
                String valueOf = String.valueOf(charSequence2);
                Dba.A0j(1, A0X, valueOf);
                1NY A0a = AnonymousClass7TG.A0a(A0X);
                A0a.A0A("accounts/update_profile_name/");
                A0a.A9m("first_name", valueOf);
                A072 = DbU.A0S(A0a, C43859CFz.class, C45713D2m.class);
                i = 36;
            } else {
                F1D f1d = e38.A03;
                if (f1d != null) {
                    IgFormField igFormField2 = e38.A02;
                    if (igFormField2 != null) {
                        charSequence = igFormField2.getText();
                    } else {
                        charSequence = null;
                    }
                    f1d.A0F = String.valueOf(charSequence);
                    UserSession A0l = AnonymousClass7TE.A0l(e38.A0G);
                    F1D f1d2 = e38.A03;
                    if (f1d2 != null) {
                        A072 = C318486p2.A07(A0l, f1d2, DbZ.A0i(e38), false);
                        i = 37;
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else if (!e38.A0A) {
                    A072 = C318486p2.A06(AnonymousClass7TE.A0l(e38.A0G));
                    i = 35;
                } else {
                    return;
                }
            }
            C47691EDa.A00(e38, A072, i);
        }
    }

    public final void configureActionBar(2da r4) {
        C59922Jbl A002 = C59922Jbl.A00(r4);
        C59922Jbl.A02(DbV.A05(this), A002, 2131967976);
        this.A00 = C59904JbT.A00(FPC.A00(this, 25), r4, A002);
        if (!this.A0F || this.A03 != null) {
            r4.setIsLoading(this.A0C);
        } else {
            r4.setIsLoading(this.A0A);
            ActionButton actionButton = this.A00;
            if (actionButton != null) {
                actionButton.setBackground((Drawable) null);
                actionButton.setButtonResource(R.drawable.instagram_arrow_cw_pano_outline_24);
                actionButton.setVisibility(8);
            }
        }
        A00(this);
        DbX.A1A(FPC.A00(this, 26), DbX.A0M(), r4);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1430170076);
        E38.super.onCreate(bundle);
        AnonymousClass0eM r3 = this.A0G;
        C49061Eof.A00(AnonymousClass7TE.A0l(r3)).A02(EWT.EDIT_NAME_FLOW, AnonymousClass05K.A00);
        C322326ve A002 = C322316vd.A00(AnonymousClass7TE.A0l(r3));
        this.A04 = A002;
        if (A002 != null) {
            A002.A06("edit_full_name");
        }
        Dbc.A0p(this);
        this.A0F = DbW.A1a(requireArguments().getString("full_name"));
        this.A09 = requireArguments().getString("full_name");
        this.A0B = requireArguments().getBoolean("is_pending_review");
        this.A07 = requireArguments().getString("disclaimer_text");
        this.A0D = requireArguments().getBoolean(AnonymousClass000.A00(784));
        this.A06 = requireArguments().getString(AnonymousClass000.A00(565));
        this.A08 = DbX.A0o(this);
        this.A05 = requireArguments().getParcelable("display_user");
        if (this.A0F && !this.A0A) {
            C47691EDa.A00(this, C318486p2.A06(AnonymousClass7TE.A0l(r3)), 35);
        }
        AnonymousClass0fD.A09(473345416, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1921330035);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_fullname, viewGroup, false);
        AnonymousClass0fD.A09(-298476806, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1303716940);
        super.onDestroy();
        C49061Eof.A00(AnonymousClass7TE.A0l(this.A0G)).A03(EWT.EDIT_NAME_FLOW, "edit_fullname_cancel");
        AnonymousClass0fD.A09(1790202114, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-62403955);
        super.onDestroyView();
        this.A0E = null;
        AnonymousClass0fD.A09(-208722193, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1229263897);
        E38.super.onPause();
        0nA.A0N(DbV.A0G(this).getDecorView());
        AnonymousClass0fD.A09(499880370, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(502197784);
        super.onResume();
        if (!this.A0B) {
            IgFormField igFormField = this.A02;
            if (igFormField != null) {
                igFormField.requestFocus();
            }
            IgFormField igFormField2 = this.A02;
            if (igFormField2 != null) {
                0nA.A0M(igFormField2);
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(-119210856, A022);
                throw A0y;
            }
        }
        AnonymousClass0fD.A09(-1743939914, A022);
    }
}
