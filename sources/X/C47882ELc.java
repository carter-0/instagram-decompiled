package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.ELc  reason: case insensitive filesystem */
public final class C47882ELc extends E5k {
    public static final String __redex_internal_original_name = "ManageDataSheetFragment";
    public View A00;
    public Button A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public F3L A07;
    public IgdsSwitch A08;
    public boolean A09;
    public View A0A;
    public Button A0B;
    public ImageView A0C;
    public TextView A0D;
    public UserSession A0E;
    public F3L A0F;
    public final View.OnClickListener A0G = FP1.A00(this, 20);
    public final CompoundButton.OnCheckedChangeListener A0H = new FQO(this, 12);
    public final View.OnClickListener A0I = FP1.A00(this, 18);
    public final View.OnClickListener A0J = FP1.A00(this, 19);

    public final float Cmb() {
        return 1.0f;
    }

    public static final void A00(C47882ELc eLc) {
        String str;
        boolean z = eLc.A09;
        String str2 = null;
        TextView textView = eLc.A06;
        if (z) {
            if (textView != null) {
                textView.setText(2131965829);
                TextView textView2 = eLc.A05;
                if (textView2 != null) {
                    textView2.setText(2131965830);
                    TextView textView3 = eLc.A04;
                    if (textView3 != null) {
                        F3L f3l = eLc.A07;
                        if (f3l != null) {
                            str2 = f3l.A00(0);
                        }
                        textView3.setText(str2);
                        TextView textView4 = eLc.A0D;
                        if (textView4 != null) {
                            textView4.setVisibility(8);
                            return;
                        }
                        0qQ.A0F("optionalTextView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                0qQ.A0F("switchDetail");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("switchTitle");
            throw AnonymousClass00P.createAndThrow();
        }
        if (textView != null) {
            textView.setText(2131965832);
            TextView textView5 = eLc.A05;
            if (textView5 != null) {
                textView5.setText(2131965831);
                TextView textView6 = eLc.A04;
                if (textView6 != null) {
                    F3L f3l2 = eLc.A07;
                    if (f3l2 != null) {
                        str = f3l2.A00(0);
                    } else {
                        str = null;
                    }
                    textView6.setText(str);
                    TextView textView7 = eLc.A0D;
                    if (textView7 != null) {
                        F3L f3l3 = eLc.A07;
                        if (f3l3 != null) {
                            str2 = f3l3.A00(1);
                        }
                        textView7.setText(str2);
                        TextView textView8 = eLc.A0D;
                        if (textView8 != null) {
                            textView8.setVisibility(0);
                            return;
                        }
                    }
                    0qQ.A0F("optionalTextView");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F("switchDetail");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("switchTitle");
        throw AnonymousClass00P.createAndThrow();
        0qQ.A0F("detailTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "manage_data_settings";
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A0E;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1783709655);
        C47882ELc.super.onCreate(bundle);
        this.A0E = DbX.A0U(this);
        this.A09 = true;
        this.A0F = C49917FEr.A00().A00.A09;
        this.A07 = C49917FEr.A00().A00.A06;
        AnonymousClass0fD.A09(1924202744, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-1209472579);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.manage_data_settings_layout, viewGroup, false);
        this.A0A = inflate;
        if (inflate != null) {
            this.A03 = (LinearLayout) inflate.findViewById(R.id.intro_linearlayout);
            View view = this.A0A;
            if (view != null) {
                this.A0C = DbU.A0F(view, R.id.manage_data_cross_button);
                View view2 = this.A0A;
                if (view2 != null) {
                    this.A02 = (LinearLayout) view2.requireViewById(R.id.manage_data_button_container);
                    View view3 = this.A0A;
                    if (view3 != null) {
                        this.A0B = (Button) view3.findViewById(R.id.manage_data_next_button);
                        View view4 = this.A0A;
                        if (view4 != null) {
                            View findViewById = view4.findViewById(R.id.checked_paragraph);
                            View view5 = this.A0A;
                            if (view5 != null) {
                                View findViewById2 = view5.findViewById(R.id.cancel_paragraph);
                                View view6 = this.A0A;
                                if (view6 != null) {
                                    View findViewById3 = view6.findViewById(R.id.followup_screen);
                                    this.A00 = findViewById3;
                                    String str = "followUpScreen";
                                    if (findViewById3 != null) {
                                        this.A01 = (Button) findViewById3.findViewById(R.id.manage_data_followup_button);
                                        View view7 = this.A00;
                                        if (view7 != null) {
                                            this.A04 = AnonymousClass7TE.A0d(view7, R.id.manage_data_settings_followup_detail);
                                            View view8 = this.A00;
                                            if (view8 != null) {
                                                this.A0D = AnonymousClass7TE.A0d(view8, R.id.manage_data_settings_followup_optional);
                                                F3L f3l = this.A0F;
                                                if (f3l != null) {
                                                    View view9 = this.A0A;
                                                    if (view9 != null) {
                                                        DbW.A0B(view9, R.id.manage_data_settings_title).setText(f3l.A01(0));
                                                        0qQ.A0A(findViewById);
                                                        Drawable drawable = requireContext().getDrawable(R.drawable.circle_checked);
                                                        if (drawable != null) {
                                                            String A012 = f3l.A01(1);
                                                            0qQ.A07(A012);
                                                            DbU.A0F(findViewById, R.id.image_view).setImageDrawable(drawable);
                                                            DbX.A1E(findViewById, A012, R.id.paragraph_text);
                                                            0qQ.A0A(findViewById2);
                                                            Drawable drawable2 = requireContext().getDrawable(R.drawable.circled_cancel);
                                                            if (drawable2 != null) {
                                                                String A013 = f3l.A01(2);
                                                                0qQ.A07(A013);
                                                                DbU.A0F(findViewById2, R.id.image_view).setImageDrawable(drawable2);
                                                                DbX.A1E(findViewById2, A013, R.id.paragraph_text);
                                                                ImageView imageView = this.A0C;
                                                                if (imageView == null) {
                                                                    str = "closeButton";
                                                                } else {
                                                                    AnonymousClass0fU.A00(this.A0I, imageView);
                                                                    Button button = this.A0B;
                                                                    if (button == null) {
                                                                        str = "nextButton";
                                                                    } else {
                                                                        AnonymousClass0fU.A00(this.A0J, button);
                                                                    }
                                                                }
                                                            } else {
                                                                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                                                                i = -451703336;
                                                            }
                                                        } else {
                                                            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                                                            i = 357728937;
                                                        }
                                                        AnonymousClass0fD.A09(i, A022);
                                                        throw illegalStateException;
                                                    }
                                                }
                                                View view10 = this.A0A;
                                                if (view10 != null) {
                                                    AnonymousClass0fD.A09(-150616599, A022);
                                                    return view10;
                                                }
                                            }
                                        }
                                    }
                                    0qQ.A0F(str);
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("rootLayout");
        throw AnonymousClass00P.createAndThrow();
    }
}
