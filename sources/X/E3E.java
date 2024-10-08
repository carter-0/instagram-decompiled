package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import java.util.Calendar;
import java.util.Date;

public final class E3E extends AnonymousClass4DH implements AnonymousClass4DS, CallerContextable {
    public static final String __redex_internal_original_name = "PersonalInformationFragment";
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public TextView A04;
    public CardView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgdsBanner A08;
    public IgdsBanner A09;
    public IgFormField A0A;
    public IgFormField A0B;
    public IgFormField A0C;
    public IgFormField A0D;
    public F1D A0E;
    public FBX A0F;
    public ImageWithTitleTextView A0G;
    public ImageWithTitleTextView A0H;
    public ImageWithTitleTextView A0I;
    public String A0J;
    public boolean A0K;
    public final AnonymousClass0eM A0L = C227642jf.A02(this);
    public final 1wn A0M = FXZ.A00(this, 58);

    public static final void A01(E3E e3e, boolean z) {
        View view = e3e.A02;
        String str = "rootView";
        if (view != null) {
            DbX.A1B(view, R.id.personal_info_fields);
            View view2 = e3e.A02;
            if (view2 != null) {
                DbT.A1F(view2, R.id.loading_spinner, 0);
                if (!z) {
                    View view3 = e3e.A01;
                    if (view3 == null) {
                        str = "retryRequestButton";
                    } else {
                        view3.setVisibility(8);
                    }
                }
                1NY A0b = AnonymousClass7TG.A0b(AnonymousClass7TF.A0L(e3e.A0L, 0));
                A0b.A0A(C273654mx.A00(531));
                A0b.A9m("edit", "true");
                A0b.A9m("ig_personal_info", "true");
                C47696EDf.A00(e3e, DbU.A0S(A0b, DvS.class, F85.class), 10);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbW.A1B(r3, 2131969369);
        ActionButton ErD = r3.ErD(FPC.A00(this, 49), R.drawable.instagram_arrow_cw_pano_outline_24);
        this.A01 = ErD;
        ErD.setVisibility(8);
    }

    public final String getModuleName() {
        return "personal_information";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A01(this, true);
        if (this.A0K) {
            AnonymousClass0eM r1 = this.A0L;
            if (!DbX.A0h(r1).A01.getBoolean("age_collection_updated_age_from_linked_fb_dialog_shown", false)) {
                FragmentActivity requireActivity = requireActivity();
                UserSession A0S = DbW.A0S(r1, 1);
                C358248ab A0X = DbS.A0X(requireActivity);
                A0X.A09(2131976797);
                A0X.A08(2131976796);
                A0X.A0E(new C49969FHc(10));
                A0X.A0G(C50025FJk.A00(requireActivity, A0S, 45), 2131964884);
                DbT.A1V(A0X);
                0xY A0N = AnonymousClass7TF.A0N(A0S);
                A0N.E5T("age_collection_updated_age_from_linked_fb_dialog_shown", true);
                A0N.apply();
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0L);
    }

    public static final void A00(E3E e3e) {
        FragmentActivity activity = e3e.getActivity();
        if (activity != null) {
            C309516Yo A0N = DbX.A0N(activity, e3e.A0L);
            C46447Df9.A03();
            F1D f1d = e3e.A0E;
            if (f1d == null) {
                0qQ.A0F("userForEditing");
                throw AnonymousClass00P.createAndThrow();
            }
            Date date = f1d.A0P;
            C47451E2x e2x = new C47451E2x();
            if (date != null) {
                Calendar instance = Calendar.getInstance();
                instance.setTime(date);
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putInt("EditBirthdayFragment.ARG_BIRTHDAY_YEAR", instance.get(1));
                A0a.putInt("EditBirthdayFragment.ARG_BIRTHDAY_MONTH", DbZ.A06(instance));
                A0a.putInt("EditBirthdayFragment.ARG_BIRTHDAY_DAY", DbU.A03(instance));
                e2x.setArguments(A0a);
            }
            A0N.A0D(e2x);
            A0N.A04();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-355610028);
        E3E.super.onCreate(bundle);
        AnonymousClass0eM r3 = this.A0L;
        this.A0K = 2Lv.A00(AnonymousClass7TE.A0l(r3)).A00(CallerContext.A00(E3E.class), "ig_age_collection");
        this.A0F = new FBX(AnonymousClass7TE.A0l(r3));
        DbX.A0R(r3).A01(this.A0M, C50272FWd.class);
        AnonymousClass0fD.A09(-314037144, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1482336972);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_personal_information, viewGroup, false);
        this.A02 = inflate;
        String str = "rootView";
        if (inflate != null) {
            this.A00 = inflate.requireViewById(R.id.loading_spinner);
            View view = this.A02;
            if (view != null) {
                this.A0B = DbT.A0d(view, R.id.email);
                View view2 = this.A02;
                if (view2 != null) {
                    this.A0H = (ImageWithTitleTextView) view2.requireViewById(R.id.confirm_your_email);
                    View view3 = this.A02;
                    if (view3 != null) {
                        this.A0D = DbT.A0d(view3, R.id.phone);
                        View view4 = this.A02;
                        if (view4 != null) {
                            this.A0I = (ImageWithTitleTextView) view4.requireViewById(R.id.confirm_your_phone_number);
                            View view5 = this.A02;
                            if (view5 != null) {
                                this.A0C = DbT.A0d(view5, R.id.gender);
                                View view6 = this.A02;
                                if (view6 != null) {
                                    this.A03 = DbU.A0C(view6, R.id.birthday_container);
                                    View view7 = this.A02;
                                    if (view7 != null) {
                                        this.A0A = DbT.A0d(view7, R.id.birthday);
                                        View view8 = this.A02;
                                        if (view8 != null) {
                                            this.A04 = DbU.A0G(view8, R.id.update_birthday_on_facebook);
                                            View view9 = this.A02;
                                            if (view9 != null) {
                                                this.A0G = (ImageWithTitleTextView) view9.requireViewById(R.id.verify_your_age_button);
                                                View view10 = this.A02;
                                                if (view10 != null) {
                                                    this.A05 = (CardView) view10.requireViewById(R.id.ac_transition_banner_container);
                                                    View view11 = this.A02;
                                                    if (view11 != null) {
                                                        this.A06 = DbT.A0a(view11, R.id.content_text);
                                                        View view12 = this.A02;
                                                        if (view12 != null) {
                                                            this.A07 = DbT.A0a(view12, R.id.learn_more_link);
                                                            View view13 = this.A02;
                                                            if (view13 != null) {
                                                                IgdsBanner igdsBanner = (IgdsBanner) view13.requireViewById(R.id.personal_info_description);
                                                                this.A08 = igdsBanner;
                                                                if (igdsBanner == null) {
                                                                    str = DevServerEntity.COLUMN_DESCRIPTION;
                                                                } else {
                                                                    igdsBanner.setVisibility(0);
                                                                    View view14 = this.A02;
                                                                    if (view14 != null) {
                                                                        IgdsBanner igdsBanner2 = (IgdsBanner) view14.requireViewById(R.id.personal_info_security);
                                                                        this.A09 = igdsBanner2;
                                                                        if (igdsBanner2 == null) {
                                                                            str = "security_description";
                                                                        } else {
                                                                            igdsBanner2.setVisibility(0);
                                                                            View view15 = this.A02;
                                                                            if (view15 != null) {
                                                                                AnonymousClass0fD.A09(2116893582, A022);
                                                                                return view15;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(527143950);
        super.onDestroy();
        DbX.A0R(this.A0L).A02(this.A0M, C50272FWd.class);
        AnonymousClass0fD.A09(-327829562, A022);
    }
}
