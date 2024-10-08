package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.io.Serializable;

/* renamed from: X.E2z  reason: case insensitive filesystem */
public final class C47453E2z extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ConnectContactsFragment";
    public TextView A00;
    public TextView A01;
    public C46768Dkv A02;
    public C51950G8t A03;
    public C49498Ewd A04;
    public ProgressButton A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final AnonymousClass0eM A0B = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        if (this.A0A) {
            r4.Eu4(true);
            DbX.A1A(new FP0((Object) this, 41), DbX.A0M(), r4);
            return;
        }
        r4.Etr(false);
    }

    private final void A00(View view, TextView textView, TextView textView2) {
        if (!0qQ.A0K(this.A06, "A")) {
            if (0qQ.A0K(this.A06, "B")) {
                DbU.A1A(DbV.A05(this), textView, 2131956519);
                DbU.A1A(DbV.A05(this), textView2, 2131956518);
            } else if (0qQ.A0K(this.A06, "C")) {
                DbU.A1A(DbV.A05(this), textView, 2131956525);
                textView2.setVisibility(8);
            }
            View A0F = AnonymousClass7TF.A0F(view, R.id.bullet_one);
            IgdsBulletCell igdsBulletCell = (IgdsBulletCell) AnonymousClass7TF.A0F(view, R.id.bullet_two);
            A0F.setVisibility(8);
            IgdsBulletCell.A00(igdsBulletCell, (CharSequence) null, DbV.A05(this).getString(2131956520));
            DbX.A1C(igdsBulletCell, igdsBulletCell.getPaddingLeft(), AnonymousClass7TG.A02(requireContext()));
        }
    }

    public static final void A01(C47453E2z e2z) {
        C46768Dkv dkv = e2z.A02;
        if (dkv != null) {
            if (DbX.A1b(dkv.A01)) {
                AnonymousClass0eM r7 = e2z.A0B;
                1AA A022 = 182.A02(DbT.A0X(r7), 36323096768228182L);
                if (A022 != null && A022.Ah0(0Tu.A04, 36323096768228182L)) {
                    C46768Dkv dkv2 = e2z.A02;
                    if (dkv2 != null) {
                        dkv2.A00(AnonymousClass7TE.A0l(r7), (String) null);
                    }
                }
            }
            C49498Ewd ewd = e2z.A04;
            AnonymousClass0eM r2 = e2z.A0B;
            if (ewd != null) {
                new C311496cm(e2z, DbW.A0S(r2, 1)).A03((Integer) null, ewd.A01.A00, false);
                if (e2z.A04 != null) {
                    UserSession A0l = AnonymousClass7TE.A0l(r2);
                    0qQ.A0B(A0l, 1);
                    if (e2z.getActivity() != null) {
                        DbW.A0H(e2z, A0l).A06();
                        return;
                    }
                    return;
                }
                return;
            }
            FEK.A00(DbT.A0X(r2), (Boolean) null, e2z.getModuleName());
            DbX.A0h(r2).A1N(true);
            C51950G8t g8t = e2z.A03;
            if (g8t != null) {
                g8t.Cm0(0);
                return;
            }
            return;
        }
        0qQ.A0F("suggestionsViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        String str;
        C49498Ewd ewd = this.A04;
        if (ewd == null || (str = ewd.A01.A00) == null) {
            return "find_friends_addressbook";
        }
        return str;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    public final void onCreate(Bundle bundle) {
        C48100EVs eVs;
        C49498Ewd ewd;
        int A022 = AnonymousClass0fD.A02(732374856);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("NUX_FLOW_TYPE");
        if (string == null) {
            string = "";
        }
        this.A07 = string;
        this.A08 = requireArguments.getBoolean("should_remove_nux_ci_skip_button", false);
        this.A09 = requireArguments.getBoolean("should_redesign_nux_contact_import", false);
        this.A06 = requireArguments.getString("redesign_ci_variant", (String) null);
        this.A0A = requireArguments.getBoolean("should_show_close_button", false);
        this.A03 = C49047EoR.A00(this);
        Serializable serializable = requireArguments.getSerializable("extra_delegate_source");
        if (!(serializable instanceof C48100EVs) || (eVs = (C48100EVs) serializable) == null) {
            eVs = C48100EVs.OTHER;
        }
        int ordinal = eVs.ordinal();
        if (ordinal == 1 || ordinal == 0) {
            ewd = new C49498Ewd(eVs);
        } else {
            ewd = null;
        }
        this.A04 = ewd;
        if (ewd != null) {
            new C311496cm(this, DbW.A0S(this.A0B, 0)).A01(false, (Integer) null, ewd.A01.A00);
        }
        this.A02 = DbW.A0F(this).A00(C46768Dkv.class);
        C47453E2z.super.onCreate(bundle);
        AnonymousClass0fD.A09(1406625270, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        int A022 = AnonymousClass0fD.A02(1592144017);
        0qQ.A0B(layoutInflater, 0);
        boolean z = this.A09;
        int i = R.layout.connect_contacts_fragment;
        if (z) {
            i = R.layout.connect_contacts_redesign_fragment;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.A01 = DbU.A0G(inflate, R.id.skip_button);
        View A0F = AnonymousClass7TF.A0F(inflate, R.id.connect_contacts_title_igds);
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.connect_contacts_subtitle);
        this.A05 = (ProgressButton) inflate.requireViewById(R.id.connect_contacts_sync_button);
        boolean z2 = !1DL.A07(requireContext(), "android.permission.READ_CONTACTS");
        int i2 = 2131956513;
        if (this.A09) {
            i2 = 2131956523;
            inflate.getViewTreeObserver().addOnGlobalLayoutListener(new C64292LYs(6, A0F, inflate));
        }
        if (!this.A08 || !z2) {
            if (this.A09 && (A0F instanceof TextView)) {
                A00(inflate, (TextView) A0F, A0R);
            }
            TextView textView = this.A01;
            if (textView != null) {
                FP0.A00(textView, 42, this);
            }
        } else {
            AnonymousClass7TH.A0R(this.A01);
            ProgressButton progressButton = this.A05;
            if (progressButton != null) {
                int i3 = 2131956706;
                if (this.A09) {
                    i3 = 2131968361;
                }
                progressButton.setText(i3);
            }
            ProgressButton progressButton2 = this.A05;
            if (progressButton2 != null) {
                layoutParams = progressButton2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            0qQ.A0C(layoutParams, C273654mx.A00(3));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (!this.A09) {
                ((IgdsHeadline) A0F).setHeadline(2131956531);
                DbU.A1A(DbV.A05(this), A0R, 2131956529);
                i2 = 2131956514;
                DbU.A1A(DbV.A05(this), AnonymousClass7TG.A0R(inflate, R.id.connect_contacts_footer), 2131956514);
            } else if (A0F instanceof TextView) {
                this.A00 = DbU.A0G(inflate, R.id.connect_contacts_redesign_footer);
                A00(inflate, (TextView) A0F, A0R);
                if (!0qQ.A0K(this.A06, "A")) {
                    TextView textView2 = this.A00;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    marginLayoutParams.bottomMargin = 0;
                }
            }
            marginLayoutParams.bottomMargin = AnonymousClass7TG.A02(requireContext());
        }
        ProgressButton progressButton3 = this.A05;
        if (progressButton3 != null) {
            FP0.A00(progressButton3, 43, this);
        }
        if (this.A03 != null) {
            0lg A0X = DbT.A0X(this.A0B);
            String moduleName = getModuleName();
            String str = this.A06;
            if (str == null) {
                if (this.A08) {
                    str = "no_skip";
                } else {
                    str = "legacy";
                }
            }
            C49938FFr.A00(A0X, (C49922FEx) null, (EXD) null, (Integer) null, moduleName, str);
        }
        String A0m = DbU.A0m(this, 2131964893);
        SpannableStringBuilder A0E = DbY.A0E(this, A0m, i2);
        AnonymousClass7AV.A05(A0E, new C46679Dj8(this, 8), A0m);
        if (this.A09) {
            IgdsBulletCell igdsBulletCell = (IgdsBulletCell) AnonymousClass7TF.A0F(inflate, R.id.bullet_three);
            igdsBulletCell.setMovementMethod((MovementMethod) null, LinkMovementMethod.getInstance());
            IgdsBulletCell.A00(igdsBulletCell, (CharSequence) null, A0E);
        } else {
            TextView A0R2 = AnonymousClass7TG.A0R(inflate, R.id.connect_contacts_footer);
            DbT.A1H(A0R2);
            A0R2.setText(A0E);
        }
        AnonymousClass0fD.A09(-1991745452, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(836556409);
        super.onDestroyView();
        this.A01 = null;
        this.A05 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(1475530073, A022);
    }
}
