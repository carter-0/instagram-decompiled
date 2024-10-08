package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.user.model.User;
import java.util.Map;

public final class NJL extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectDailyPromptsAddResponseFragment";
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public 2dZ A05;
    public IgTextView A06;
    public IgTextView A07;
    public CircularImageView A08;
    public IgImageView A09;
    public AnonymousClass7H6 A0A;
    public IgdsMediaButton A0B;
    public DirectThreadKey A0C;
    public BackInterceptEditText A0D;
    public boolean A0E;
    public ImageView A0F;
    public ImageView A0G;
    public ImageView A0H;
    public IgTextView A0I;
    public AnonymousClass3E6 A0J;
    public C66930MfP A0K;
    public DirectShareTarget A0L;
    public MediaFrameLayout A0M;
    public final AnonymousClass0eM A0N = C227642jf.A02(this);
    public final AnonymousClass0eM A0O;
    public final 1wn A0P = C71932OtG.A00(this, 30);
    public final C252213ok A0Q = new C72237Oz5(this, 9);

    public final String getModuleName() {
        return "DirectDailyPromptsResponseCreationFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass03j.A00(DbV.A0G(this).getDecorView(), new C71490Olf(5, this, view));
        2dZ A012 = 2dY.A01(new C71397Ojw(this, 59), DbX.A0I(view, R.id.action_bar_container));
        this.A05 = A012;
        A012.A0X(C71833Ora.A00);
        this.A03 = view.findViewById(R.id.root);
        this.A0I = JTO.A0X(view, R.id.daily_prompt_title);
        this.A08 = (CircularImageView) view.findViewById(R.id.daily_prompt_profile_picture);
        this.A07 = JTO.A0X(view, R.id.daily_prompt_username);
        this.A0D = (BackInterceptEditText) view.findViewById(R.id.daily_prompt_edittext);
        this.A06 = JTO.A0X(view, R.id.daily_prompt_max_character_count);
        this.A0M = (MediaFrameLayout) view.findViewById(R.id.daily_prompt_card);
        this.A0F = DbS.A0G(view, R.id.daily_prompts_media_button);
        AnonymousClass0eM r4 = this.A0N;
        ViewGroup viewGroup = null;
        if (!AnonymousClass7K4.A01(AnonymousClass7TE.A0l(r4))) {
            viewGroup = (ViewGroup) view.findViewById(R.id.daily_prompts_media_container);
        }
        this.A04 = viewGroup;
        boolean A013 = AnonymousClass7K4.A01(AnonymousClass7TE.A0l(r4));
        int i = R.id.daily_prompts_media_preview;
        if (A013) {
            i = R.id.daily_prompts_full_bleed_media_preview;
        }
        this.A09 = JTO.A0Y(view, i);
        this.A02 = view.findViewById(R.id.media_gradient_overlay);
        this.A0H = DbS.A0G(view, R.id.daily_prompts_text_button);
        boolean A014 = AnonymousClass7K4.A01(AnonymousClass7TE.A0l(r4));
        int i2 = R.id.daily_prompts_edit_photo_button;
        if (A014) {
            i2 = R.id.daily_prompts_full_bleed_edit_photo_button;
        }
        this.A0B = (IgdsMediaButton) view.findViewById(i2);
        this.A0G = DbS.A0G(view, R.id.send_button);
        this.A01 = view.findViewById(R.id.gallery);
        MediaFrameLayout mediaFrameLayout = this.A0M;
        if (mediaFrameLayout != null) {
            mediaFrameLayout.A00 = -1.0f;
        }
        ImageView imageView = this.A0H;
        if (imageView != null) {
            imageView.setSelected(true);
        }
        ImageView imageView2 = this.A0H;
        if (imageView2 != null) {
            C71397Ojw.A00(imageView2, 60, this);
        }
        ImageView imageView3 = this.A0F;
        if (imageView3 != null) {
            C71397Ojw.A00(imageView3, 61, this);
        }
        ImageView imageView4 = this.A0G;
        if (imageView4 != null) {
            C71397Ojw.A00(imageView4, 62, this);
        }
        IgTextView igTextView = this.A0I;
        if (igTextView != null) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 == null || (str3 = bundle2.getString("card_gallery_collection_title")) == null) {
                str3 = "";
            }
            igTextView.setText(str3);
        }
        User A0l = DbX.A0l(AnonymousClass0t1.A01, r4);
        CircularImageView circularImageView = this.A08;
        if (circularImageView != null) {
            circularImageView.setUrl(A0l.A0D(), this);
        }
        IgTextView igTextView2 = this.A07;
        if (igTextView2 != null) {
            DbU.A1H(igTextView2, A0l);
        }
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            C71273OhE.A00(backInterceptEditText, this, 21);
        }
        BackInterceptEditText backInterceptEditText2 = this.A0D;
        if (backInterceptEditText2 != null) {
            backInterceptEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(140)});
        }
        BackInterceptEditText backInterceptEditText3 = this.A0D;
        if (backInterceptEditText3 != null) {
            backInterceptEditText3.requestFocus();
        }
        BackInterceptEditText backInterceptEditText4 = this.A0D;
        if (backInterceptEditText4 != null) {
            0nA.A0S(backInterceptEditText4);
            AnonymousClass0eM r7 = this.A0O;
            05G r0 = ((C67747Mu0) r7.getValue()).A08;
            19B r5 = 19B.A00;
            Dba.A15(getViewLifecycleOwner(), C226292g8.A00(r5, r0), C74178PqK.A00(this, 41), 50);
            Dba.A15(getViewLifecycleOwner(), C226292g8.A00(r5, ((C67747Mu0) r7.getValue()).A09), C74178PqK.A00(this, 42), 50);
            AnonymousClass3E5 A015 = AnonymousClass3E4.A01(this, false, true);
            this.A0J = A015;
            A015.A9Y(this.A0Q);
            IgdsMediaButton igdsMediaButton = this.A0B;
            if (igdsMediaButton != null) {
                C71397Ojw.A00(igdsMediaButton, 63, this);
            }
            AnonymousClass7TH.A0R(this.A06);
            C66930MfP mfP = this.A0K;
            if (mfP == null) {
                str = "dailyPromptsLogger";
            } else {
                DirectThreadKey directThreadKey = this.A0C;
                str = "threadKey";
                if (directThreadKey != null) {
                    String str4 = directThreadKey.A00;
                    String str5 = directThreadKey.A01;
                    int i3 = requireArguments().getInt("direct_channel_audience_type", 0);
                    String string = requireArguments().getString("channel_user_type");
                    if (string == null) {
                        string = "";
                    }
                    String string2 = requireArguments().getString("card_gallery_entry_point");
                    if (string2 == null) {
                        string2 = "";
                    }
                    Map A0w = AnonymousClass7TF.A0w("user_type", string);
                    int hashCode = string2.hashCode();
                    if (hashCode == -562683047) {
                        if (string2.equals("channel_daily_prompt_responses")) {
                            str2 = "add_response_button";
                        }
                        str2 = "thread_view";
                    } else if (hashCode != 279056467) {
                        if (hashCode == 956980699 && string2.equals("channel_daily_prompt_persistent_banner")) {
                            str2 = "daily_prompt_thread_bottom_banner";
                        }
                        str2 = "thread_view";
                    } else {
                        if (string2.equals("channel_daily_prompt_xma")) {
                            str2 = "daily_prompt_thread_xma";
                        }
                        str2 = "thread_view";
                    }
                    C66930MfP.A02(mfP, str4, str5, "daily_prompt_response_creation_sheet_rendered", "tap", str2, "daily_prompt_responses_sheet", A0w, i3);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A00(Medium medium, NJL njl) {
        float f;
        MediaFrameLayout mediaFrameLayout = njl.A0M;
        if (mediaFrameLayout != null) {
            if (!AnonymousClass7K4.A01(AnonymousClass7TE.A0l(njl.A0N)) || medium == null) {
                f = -1.0f;
            } else {
                f = C70138Nxs.A00(Integer.valueOf(medium.A0B), Integer.valueOf(medium.A04));
            }
            mediaFrameLayout.A00 = f;
        }
    }

    public static final void A01(NJL njl) {
        BackInterceptEditText backInterceptEditText = njl.A0D;
        if (backInterceptEditText != null) {
            0nA.A0N(backInterceptEditText);
            AnonymousClass0eM r4 = njl.A0N;
            C331127Pr A0f = DbX.A0f(r4);
            A0f.A0B = 2Yu.A0H(njl.requireActivity(), R.attr.statusBarBackgroundColor);
            DbS.A1S(A0f, true);
            A0f.A03 = 0.7f;
            A0f.A04 = 0.9f;
            C331157Pu A002 = A0f.A00();
            Activity A003 = C61190ls.A00(njl.requireActivity());
            UserSession A0J2 = JTS.A0J(r4);
            C61434K7j k7j = new C61434K7j();
            k7j.setArguments(JTP.A0F(A0J2));
            k7j.A01 = njl;
            A002.A02(A003, k7j);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (X.DbX.A1b(((X.C67747Mu0) r3.A0O.getValue()).A08) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.NJL r3) {
        /*
            android.widget.ImageView r2 = r3.A0G
            if (r2 == 0) goto L_0x001d
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x0019
            X.0eM r0 = r3.A0O
            java.lang.Object r0 = r0.getValue()
            X.Mu0 r0 = (X.C67747Mu0) r0
            X.05G r0 = r0.A08
            boolean r1 = X.DbX.A1b(r0)
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r2.setEnabled(r0)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJL.A02(X.NJL):void");
    }

    public static final void A03(NJL njl, int i) {
        if (140 - i <= 5) {
            IgTextView igTextView = njl.A06;
            if (igTextView != null) {
                igTextView.setVisibility(0);
            }
            IgTextView igTextView2 = njl.A06;
            if (igTextView2 != null) {
                igTextView2.setText(njl.getString(2131958850, C51968G9o.A1Z(Integer.valueOf(i), 140)));
                return;
            }
            return;
        }
        AnonymousClass7TH.A0R(njl.A06);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0N);
    }

    public final boolean onBackPressed() {
        AnonymousClass7H6 r0 = this.A0A;
        if (r0 != null) {
            return r0.A0h();
        }
        return false;
    }

    public NJL() {
        C73921Pm1 A002 = C73921Pm1.A00(this, 13);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C73921Pm1.A00(C73921Pm1.A00(this, 10), 11));
        this.A0O = DbS.A0I(C73921Pm1.A00(A003, 12), A002, new C73667Phg(11, (Object) null, A003), DbS.A0z(C67747Mu0.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(571070183);
        NJL.super.onCreate(bundle);
        04R.A00(DbV.A0G(this), false);
        this.A0C = C66647MaG.A03(C67002Mga.A00(requireArguments(), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY"));
        Parcelable parcelable = requireArguments().getParcelable("DirectThreadSharedMediaFragment.DIRECT_SHARED_MEDID_SHARED_TARGET");
        Parcelable.Creator creator = DirectShareTarget.CREATOR;
        0qQ.A08(creator);
        this.A0L = (DirectShareTarget) ((Parcelable) 0B0.A01(creator, parcelable, DirectShareTarget.class));
        this.A0K = C69868NtW.A00(AnonymousClass7TE.A0l(this.A0N));
        AnonymousClass0fD.A09(1923576785, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1842937217);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.daily_prompts_response_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1413380306, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1207162695);
        super.onDestroy();
        AnonymousClass3E6 r1 = this.A0J;
        if (r1 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.EEH(this.A0Q);
        unregisterLifecycleListener(this.A0A);
        AnonymousClass0fD.A09(1744123826, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-97636945);
        super.onDestroyView();
        this.A03 = null;
        this.A0I = null;
        this.A08 = null;
        this.A07 = null;
        this.A0D = null;
        this.A06 = null;
        this.A0M = null;
        this.A0F = null;
        this.A0H = null;
        this.A0G = null;
        this.A01 = null;
        this.A04 = null;
        this.A09 = null;
        this.A02 = null;
        this.A0B = null;
        AnonymousClass0fD.A09(714108930, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-2022583756);
        NJL.super.onPause();
        AnonymousClass3E6 r0 = this.A0J;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.onStop();
        DbX.A0R(this.A0N).A02(this.A0P, AnonymousClass7P2.class);
        AnonymousClass0fD.A09(-1193293666, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-591536154);
        super.onResume();
        AnonymousClass3E6 r0 = this.A0J;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        JTP.A18(this, r0);
        DbX.A0R(this.A0N).A01(this.A0P, AnonymousClass7P2.class);
        AnonymousClass0fD.A09(2013335106, A022);
    }
}
