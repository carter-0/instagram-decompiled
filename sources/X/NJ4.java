package X;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;

public final class NJ4 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectQuestionsAddResponseFragment";
    public ViewGroup A00;
    public IgTextView A01;
    public C67746Mtz A02;
    public BackInterceptEditText A03;
    public SpinnerImageView A04;
    public User A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public AnonymousClass3E6 A0A;
    public AnonymousClass9HC A0B;
    public DirectThreadKey A0C;
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final 1wn A0E = C71932OtG.A00(this, 8);
    public final C252213ok A0F = new C72237Oz5(this, 3);

    public final void configureActionBar(2da r5) {
        Editable editable;
        0qQ.A0B(r5, 0);
        r5.EVS(true);
        Dbc.A0k(r5);
        BackInterceptEditText backInterceptEditText = this.A03;
        if (backInterceptEditText != null) {
            editable = backInterceptEditText.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        if (valueOf.length() > 0) {
            r5.Eiy(getString(2131952258), new C71330Oib(valueOf, this, 0));
        } else {
            r5.AA6(2131952258);
        }
    }

    public final String getModuleName() {
        return "direct_questions_add_response_fragment";
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.0iw, java.lang.Object, X.NJ4, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbU.A0C(view, R.id.direct_card_add_response);
        this.A04 = (SpinnerImageView) view.requireViewById(R.id.spinner);
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        this.A0A = A012;
        A012.A9Y(this.A0F);
        IgImageView A0b = DbX.A0b(view, R.id.profile_picture);
        User user = this.A05;
        if (user == null) {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        } else {
            DbU.A1S(this, A0b, user);
            this.A01 = DbT.A0a(view, R.id.character_count);
            A00(this, 0);
            View requireViewById = view.requireViewById(R.id.question_edittext);
            BackInterceptEditText backInterceptEditText = (BackInterceptEditText) requireViewById;
            this.A03 = backInterceptEditText;
            0qQ.A07(requireViewById);
            C71273OhE.A00(backInterceptEditText, this, 6);
            backInterceptEditText.setOnBackCallback(new C73656PhV(backInterceptEditText, 0));
            backInterceptEditText.requestFocus();
            0nA.A0S(backInterceptEditText);
            C67746Mtz mtz = this.A02;
            if (mtz == null) {
                str = "viewModel";
            } else {
                Dba.A15(this, mtz.A00, new C74191PqX(38, (Object) view, (Object) this), 38);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(NJ4 nj4, int i) {
        IgTextView igTextView = nj4.A01;
        if (igTextView != null) {
            igTextView.setText(nj4.getString(2131960084, C51968G9o.A1Z(Integer.valueOf(i), DbV.A05(nj4).getInteger(R.integer.prompt_response_max_length))));
        }
        0qQ.A0C(nj4.getActivity(), "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        Dbb.A0v(nj4);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final void onCreate(Bundle bundle) {
        C254743sy r0;
        Throwable th;
        int i;
        String str;
        String string;
        String str2;
        String str3;
        String str4;
        String string2;
        User A022;
        int A023 = AnonymousClass0fD.A02(705234076);
        NJ4.super.onCreate(bundle);
        AnonymousClass0eM r3 = this.A0D;
        this.A05 = AnonymousClass7TF.A0Q(AnonymousClass7TE.A0l(r3));
        Bundle bundle2 = this.mArguments;
        String str5 = null;
        if (bundle2 != null) {
            r0 = C67002Mga.A00(bundle2, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        } else {
            r0 = null;
        }
        DirectThreadKey directThreadKey = (DirectThreadKey) r0;
        if (directThreadKey != null) {
            this.A0C = directThreadKey;
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                str = C66580MXl.A0t(bundle3);
            } else {
                str = null;
            }
            if (str != null) {
                this.A06 = str;
                Bundle bundle4 = this.mArguments;
                if (bundle4 == null || (string = bundle4.getString("surface")) == null) {
                    th = AnonymousClass7TE.A0z("Required value was null.");
                    i = -1416577184;
                } else {
                    this.A07 = string;
                    Bundle bundle5 = this.mArguments;
                    String str6 = "";
                    if (bundle5 == null || (str2 = bundle5.getString("card_gallery_collection_title")) == null) {
                        str2 = str6;
                    }
                    this.A09 = str2;
                    Bundle bundle6 = this.mArguments;
                    if (!(bundle6 == null || (string2 = bundle6.getString("card_gallery_sender_id")) == null || (A022 = JTR.A0u(r3).A02(string2)) == null)) {
                        str6 = A022.getUsername();
                    }
                    this.A08 = str6;
                    this.A0B = C66584MXp.A0M(AnonymousClass9HC.A1b, r3);
                    UserSession A0l = AnonymousClass7TE.A0l(r3);
                    DirectThreadKey directThreadKey2 = this.A0C;
                    if (directThreadKey2 == null) {
                        str4 = "threadKey";
                    } else {
                        String str7 = this.A06;
                        if (str7 == null) {
                            str4 = "collectionId";
                        } else {
                            Bundle bundle7 = this.mArguments;
                            if (bundle7 != null) {
                                str3 = bundle7.getString("message_id");
                            } else {
                                str3 = null;
                            }
                            this.A02 = new NNB(A0l, directThreadKey2, str7, str3).create(C67746Mtz.class);
                            Bundle bundle8 = this.mArguments;
                            if (bundle8 != null) {
                                str5 = bundle8.getString("DirectFragment.ENTRY_POINT");
                            }
                            C67746Mtz mtz = this.A02;
                            if (mtz == null) {
                                str4 = "viewModel";
                            } else {
                                C67746Mtz.A00((AnonymousClass2Ep) mtz.A07.getValue(), new C73943PmN(str5, mtz, 36));
                                AnonymousClass0fD.A09(-1396864673, A023);
                                return;
                            }
                        }
                    }
                    0qQ.A0F(str4);
                    throw AnonymousClass00P.createAndThrow();
                }
            } else {
                th = AnonymousClass7TE.A0z("Required value was null.");
                i = -1496586172;
            }
        } else {
            th = C66580MXl.A0p();
            i = 1676575395;
        }
        AnonymousClass0fD.A09(i, A023);
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1059472033);
        0qQ.A0B(layoutInflater, 0);
        NJ4.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.direct_card_add_response_layout, viewGroup, false);
        AnonymousClass0fD.A09(-951611748, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1682621660);
        super.onDestroy();
        AnonymousClass3E6 r1 = this.A0A;
        if (r1 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.EEH(this.A0F);
        AnonymousClass0fD.A09(1548830273, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-631126274);
        super.onDestroyView();
        this.A00 = null;
        this.A03 = null;
        this.A01 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(-540367783, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-991915800);
        NJ4.super.onPause();
        DbX.A0R(this.A0D).A02(this.A0E, AnonymousClass7P2.class);
        AnonymousClass3E6 r0 = this.A0A;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.onStop();
        AnonymousClass0fD.A09(875673176, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1588641795);
        super.onResume();
        DbX.A0R(this.A0D).A01(this.A0E, AnonymousClass7P2.class);
        AnonymousClass3E6 r0 = this.A0A;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        JTP.A18(this, r0);
        AnonymousClass0fD.A09(-1601463987, A022);
    }
}
