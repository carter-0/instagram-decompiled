package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.user.model.User;

public final class E71 extends C273374mT implements AnonymousClass4DS, C252213ok {
    public static final String __redex_internal_original_name = "EditBioFragment";
    public View A00;
    public View A01;
    public View A02;
    public ViewStub A03;
    public ImageView A04;
    public TextView A05;
    public TextView A06;
    public AnonymousClass61R A07;
    public ActionButton A08;
    public FGB A09;
    public User A0A;
    public boolean A0B;
    public TextView A0C;
    public AnonymousClass3E6 A0D;
    public String A0E;
    public boolean A0F;
    public final C49379Euh A0G = new C49379Euh(this);

    public final String getModuleName() {
        return "profile_edit_bio";
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        Dbc.A0q(this, 8);
        super.onConfigurationChanged(configuration);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence charSequence;
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        AnonymousClass3E6 r0 = this.A0D;
        if (r0 == null) {
            str = "keyboardHeightChangeDetector";
        } else {
            r0.A9Y(this);
            this.A01 = view2.requireViewById(R.id.edit_bio_layout);
            IgFormField igFormField = (IgFormField) AnonymousClass7TF.A0F(view2, R.id.caption_edit_text);
            igFormField.setLabelText(DbV.A05(this).getString(2131953778));
            igFormField.setInputType(131073);
            W0n.A00(igFormField);
            igFormField.setMaxLength(DbV.A05(this).getInteger(R.integer.abc_config_activityShortDur));
            igFormField.A0D();
            TextView textView = (TextView) AnonymousClass7TF.A0G(view2, R.id.caption_limit_text);
            UserSession session = getSession();
            0Tu A0J = DbS.A0J(session, 0);
            if (182.A06(A0J, session, 36330943673287517L)) {
                C49506Ewl ewl = new C49506Ewl();
                igFormField.getMEditText().setHint(ewl.A00.A02);
                ViewStub A0D2 = DbU.A0D(view2, R.id.edit_bio_cta_shuffle_button_container);
                this.A03 = A0D2;
                if (A0D2 == null) {
                    str = "editBioCtaShuffleViewStub";
                } else {
                    View inflate = A0D2.inflate();
                    this.A00 = inflate;
                    if (inflate != null) {
                        inflate.setVisibility(0);
                        View view3 = this.A00;
                        if (view3 != null) {
                            this.A05 = DbU.A0G(view3, R.id.edit_bio_cta_shuffle_button_text);
                            View view4 = this.A00;
                            if (view4 != null) {
                                this.A04 = DbU.A0F(view4, R.id.edit_bio_cta_shuffle_button_icon);
                                TextView textView2 = this.A05;
                                if (textView2 != null) {
                                    DbU.A1A(DbV.A05(this), textView2, 2131973881);
                                }
                                View view5 = this.A00;
                                if (view5 != null) {
                                    int color = view5.getContext().getColor(R.color.igds_secondary_icon);
                                    View view6 = this.A00;
                                    if (view6 != null) {
                                        AnonymousClass61R A002 = C303756Aq.A00(view6.getContext(), R.raw.canvas_dice_animation);
                                        if (A002 != null) {
                                            C305716Jg.A00(new 2dn(Color.red(color), Color.green(color), Color.blue(color), Color.alpha(color)), A002.A01);
                                            A002.EL2(0.0f);
                                        } else {
                                            A002 = null;
                                        }
                                        this.A07 = A002;
                                        ImageView imageView = this.A04;
                                        if (imageView == null) {
                                            str = "editBioCtaShuffleButtonIcon";
                                        } else {
                                            imageView.setImageDrawable(A002);
                                            View view7 = this.A00;
                                            if (view7 != null) {
                                                FPH.A00(view7, igFormField, this, ewl, 43);
                                                Object obj = new Object();
                                                FPH.A00(igFormField.getMEditText(), igFormField, ewl, obj, 44);
                                                igFormField.getMEditText().setOnKeyListener(new FPO(1, igFormField, obj));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F("editBioCtaShuffleContainer");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            if (C61670oa.A09()) {
                textView.setVisibility(8);
            }
            ListView listView = (ListView) AnonymousClass7TF.A0G(view2, R.id.entity_suggestions_list);
            UserSession session2 = getSession();
            0qQ.A0B(session2, 0);
            if (DbU.A1Z(session2)) {
                this.A06 = DbU.A0G(view2, R.id.mention_button);
                this.A0C = DbU.A0G(view2, R.id.hashtag_button);
                View requireViewById = view2.requireViewById(R.id.accessory_bar);
                0qQ.A0B(requireViewById, 0);
                this.A02 = requireViewById;
            }
            UserSession session3 = getSession();
            requireActivity();
            0qQ.A0B(session3, 1);
            C319036pw.A00 = true;
            UserSession session4 = getSession();
            EditText mEditText = igFormField.getMEditText();
            TextView textView3 = this.A06;
            TextView textView4 = this.A0C;
            String str2 = this.A0E;
            if (str2 == null) {
                str = "entryPoint";
            } else {
                this.A09 = new FGB(mEditText, listView, textView3, textView4, textView, this, this, session4, this.A0G, str2);
                if (AnonymousClass7TE.A0q(getSession()).getBoolean("should_show_bio_accessory_buttons_tooltip", true)) {
                    UserSession session5 = getSession();
                    0qQ.A0B(session5, 0);
                    if (DbU.A1Z(session5)) {
                        FragmentActivity activity = getActivity();
                        if (!(this.A06 == null || activity == null)) {
                            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen) / 2;
                            TextView textView5 = this.A06;
                            if (textView5 != null) {
                                textView5.postDelayed(new C51522FvU(textView5, activity, this, dimensionPixelSize), 100);
                            }
                        }
                    }
                }
                if (DbW.A1U(A0J, getSession()) || DbW.A1V(A0J, getSession())) {
                    View view8 = this.A01;
                    if (view8 == null) {
                        str = "layoutView";
                    } else {
                        IgdsBanner igdsBanner = (IgdsBanner) AnonymousClass7TF.A0F(view8, R.id.profile_data_transparency_banner);
                        if (DbW.A1U(A0J, getSession())) {
                            charSequence = DbV.A05(this).getString(2131957411);
                        } else {
                            String A0m = DbU.A0m(this, 2131957413);
                            SpannableStringBuilder A0E2 = DbY.A0E(this, A0m, 2131957412);
                            Context context = getContext();
                            if (context != null) {
                                AnonymousClass7AV.A02(A0E2, new ESx(this, context.getColor(2Yu.A06(getContext()))), A0m);
                                charSequence = A0E2;
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                        DbT.A1U(igdsBanner, charSequence, true);
                        igdsBanner.setVisibility(0);
                    }
                }
                if (!this.A0F) {
                    A00(this);
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DMr(int i, boolean z) {
        if (z) {
            View view = this.A01;
            if (view != null) {
                0nA.A0X(view, i);
                return;
            }
        } else {
            View view2 = this.A01;
            if (view2 != null) {
                0nA.A0X(view2, 0);
                return;
            }
        }
        0qQ.A0F("layoutView");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(E71 e71) {
        UserSession session = e71.getSession();
        User user = e71.A0A;
        String str = "displayedUser";
        if (user != null) {
            boolean A1X = AnonymousClass7TG.A1X(user.A03.Bw0());
            User user2 = e71.A0A;
            if (user2 != null) {
                String A0O = user2.A0O();
                0xa A042 = 1Al.A01(session).A04(1An.A3A, e71.getClass());
                if (!A042.getBoolean("education_banner_dismiss_key", false) && A1X && 182.A06(DbS.A0J(session, 0), session, 36323814027570731L) && A0O != null) {
                    0wc A012 = AnonymousClass0kN.A01(e71, session);
                    View view = e71.A01;
                    if (view == null) {
                        str = "layoutView";
                    } else {
                        IgdsBanner igdsBanner = (IgdsBanner) AnonymousClass7TF.A0F(view, R.id.teen_education_banner);
                        igdsBanner.A00 = new C50470FcI(A012, A042, A0O);
                        boolean A1W = AnonymousClass7TF.A1W(AnonymousClass7TF.A0Q(session).A0N(), AnonymousClass05K.A0C);
                        Uri A092 = DbT.A09(SQU.A01(e71.requireActivity(), "https://help.instagram.com/347751748650214/?helpref=uf_share"));
                        String A0m = DbU.A0m(e71, 2131961436);
                        int i = 2131961438;
                        if (A1W) {
                            i = 2131961437;
                        }
                        DbT.A1U(igdsBanner, AnonymousClass7AV.A00(A092, A0m, DbV.A0z(e71, A0m, i)), true);
                        igdsBanner.setVisibility(0);
                        0Aj A0e = AnonymousClass7TE.A0e(A012, "ig_bio_education");
                        DbS.A1I(A0e, "impression");
                        DbS.A1L(A0e, "edit_bio");
                        A0e.AAJ("biography", A0O);
                        A0e.Cgf();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r4) {
        C59922Jbl A002 = C59922Jbl.A00(r4);
        C59922Jbl.A01(DbV.A05(this), A002, 2131953778);
        this.A08 = C59904JbT.A00(FPC.A00(this, 22), r4, A002);
        F3V f3v = new F3V(AnonymousClass05K.A00);
        f3v.A01 = 2131956164;
        f3v.A00 = 2131960992;
        r4.ErJ(f3v.A00());
        DbX.A1A(FPC.A00(this, 23), DbX.A0M(), r4);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(581673541);
        E71.super.onCreate(bundle);
        this.A0E = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "edit_profile");
        this.A0D = AnonymousClass3E4.A01(this, false, true);
        UserSession session = getSession();
        this.A0A = DbT.A0j(session);
        C322316vd.A00(session).A06("edit_bio");
        String str = this.A0E;
        if (str == null) {
            DbS.A16();
            throw AnonymousClass00P.createAndThrow();
        }
        boolean equals = str.equals("quick_promotion");
        this.A0F = equals;
        if (equals && !this.A0B) {
            C47691EDa.A00(this, C318486p2.A06(getSession()), 32);
        }
        AnonymousClass0fD.A09(-2096267438, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(3816650);
        0qQ.A0B(layoutInflater, 0);
        UserSession session = getSession();
        0qQ.A0B(session, 0);
        boolean A1Z = DbU.A1Z(session);
        int i = R.layout.edit_bio_layout;
        if (A1Z) {
            i = R.layout.edit_bio_with_accessory_bar_layout;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        AnonymousClass0fD.A09(-976759650, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-296208057);
        super.onDestroyView();
        AnonymousClass3E6 r0 = this.A0D;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.EEH(this);
        UserSession session = getSession();
        FragmentActivity requireActivity = requireActivity();
        C319036pw.A00 = DbW.A1X(session);
        C319036pw.A00(requireActivity, session);
        C49061Eof.A00(session).A03(EWT.EDIT_BIO_FLOW, "edit_bio_cancel");
        AnonymousClass0fD.A09(-1698905899, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1714935689);
        Dbc.A0q(this, 0);
        E71.super.onPause();
        if (DbV.A0G(this) != null) {
            0nA.A0N(DbV.A0G(this).getDecorView());
        }
        AnonymousClass0fD.A09(-1439075745, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-580303399);
        Dbc.A0q(this, 8);
        super.onResume();
        FGB fgb = this.A09;
        if (fgb == null) {
            0qQ.A0F("searchController");
            throw AnonymousClass00P.createAndThrow();
        }
        Editable text = fgb.A06.getText();
        0qQ.A07(text);
        FGB.A00(text, fgb);
        if (DbV.A0G(this) != null) {
            View decorView = DbV.A0G(this).getDecorView();
            0qQ.A07(decorView);
            0nA.A0Q(decorView);
        }
        AnonymousClass0fD.A09(-668629119, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-908724859);
        E71.super.onStart();
        AnonymousClass3E6 r1 = this.A0D;
        if (r1 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.DmJ(requireActivity());
        AnonymousClass0fD.A09(1680455257, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(181539976);
        E71.super.onStop();
        AnonymousClass3E6 r0 = this.A0D;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.onStop();
        AnonymousClass0fD.A09(-1626122321, A022);
    }
}
