package X;

import android.app.Dialog;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.paypal.model.LinkableTextParams;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;
import com.facebookpay.widget.button.FBPayButton;
import com.instagram.android.R;

public final class QCE extends Fragment {
    public ContextThemeWrapper A00;
    public ProgressBar A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public LoggingContext A05;
    public PaypalConsentLaunchParams A06;
    public FBPayButton A07;
    public FBPayButton A08;
    public final AnonymousClass2gB A09 = Pxh.A0M();

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        CharSequence charSequence;
        0qQ.A0B(view, 0);
        Parcelable parcelable = requireArguments().getParcelable("logging_context");
        if (parcelable != null) {
            this.A05 = (LoggingContext) parcelable;
            if (getActivity() != null) {
                view.requireViewById(R.id.text_container);
                TextView A0G = DbU.A0G(view, R.id.header);
                0qQ.A0A(A0G);
                SRn.A02(A0G, RH2.A0v);
                SpannableStringBuilder spannableStringBuilder = null;
                C11409SSh.A05(A0G, 2132017640, false);
                this.A03 = A0G;
                TextView A0G2 = DbU.A0G(view, R.id.subheader);
                0qQ.A0A(A0G2);
                SRn.A02(A0G2, RH2.PRIMARY_TEXT);
                C11409SSh.A05(A0G2, 2132017640, false);
                this.A04 = A0G2;
                TextView A0G3 = DbU.A0G(view, R.id.description);
                0qQ.A0A(A0G3);
                SRn.A02(A0G3, RH2.A0F);
                C11409SSh.A05(A0G3, R.style.FBPayUITerms, false);
                this.A02 = A0G3;
                FBPayButton fBPayButton = (FBPayButton) view.requireViewById(R.id.consent_button);
                0qQ.A0A(fBPayButton);
                C11409SSh.A05(fBPayButton, 2132017566, false);
                this.A07 = fBPayButton;
                ProgressBar progressBar = (ProgressBar) view.requireViewById(R.id.progress_icon);
                Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                if (indeterminateDrawable != null) {
                    AnonymousClass2E0.A0A();
                    indeterminateDrawable.setColorFilter(AnonymousClass7TE.A0S(progressBar).getColor(R.color.canvas_bottom_sheet_description_text_color), PorterDuff.Mode.MULTIPLY);
                }
                this.A01 = progressBar;
                FBPayButton fBPayButton2 = (FBPayButton) view.requireViewById(R.id.cancel_button);
                fBPayButton2.setButtonStyle(C8923RFr.A0A);
                C11409SSh.A05(fBPayButton2, 2132017567, false);
                this.A08 = fBPayButton2;
                TextView textView = this.A03;
                if (textView == null) {
                    str = "headerTextView";
                } else {
                    PaypalConsentLaunchParams paypalConsentLaunchParams = this.A06;
                    if (paypalConsentLaunchParams != null) {
                        textView.setText(paypalConsentLaunchParams.A03);
                        TextView textView2 = this.A04;
                        if (textView2 == null) {
                            str = "subheaderTextView";
                        } else {
                            PaypalConsentLaunchParams paypalConsentLaunchParams2 = this.A06;
                            if (paypalConsentLaunchParams2 != null) {
                                textView2.setText(paypalConsentLaunchParams2.A0A);
                                TextView textView3 = this.A02;
                                String str2 = "descriptionTextView";
                                if (textView3 != null) {
                                    PaypalConsentLaunchParams paypalConsentLaunchParams3 = this.A06;
                                    if (paypalConsentLaunchParams3 != null) {
                                        String str3 = paypalConsentLaunchParams3.A02;
                                        if (str3 != null) {
                                            LinkableTextParams linkableTextParams = paypalConsentLaunchParams3.A01;
                                            if (linkableTextParams != null) {
                                                C11232SGr sGr = new C11232SGr(linkableTextParams.A02, AnonymousClass7TE.A1I(new SF9(linkableTextParams.A00, linkableTextParams.A01, linkableTextParams.A03)));
                                                C12468Sv0 sv0 = new C12468Sv0(this, 9);
                                                0qQ.A0B(sv0, 0);
                                                charSequence = sGr.A01(sv0, false);
                                            } else {
                                                charSequence = "";
                                            }
                                            spannableStringBuilder = DbS.A0C(charSequence).insert(0, str3);
                                        }
                                        textView3.setText(spannableStringBuilder);
                                        TextView textView4 = this.A02;
                                        if (textView4 != null) {
                                            DbT.A1H(textView4);
                                            FBPayButton fBPayButton3 = this.A07;
                                            str2 = "primaryButton";
                                            if (fBPayButton3 != null) {
                                                PaypalConsentLaunchParams paypalConsentLaunchParams4 = this.A06;
                                                if (paypalConsentLaunchParams4 != null) {
                                                    fBPayButton3.setText(paypalConsentLaunchParams4.A06);
                                                    FBPayButton fBPayButton4 = this.A07;
                                                    if (fBPayButton4 != null) {
                                                        C11496SbJ.A01(fBPayButton4, 37, this);
                                                        FBPayButton fBPayButton5 = this.A08;
                                                        str2 = "secondaryButton";
                                                        if (fBPayButton5 != null) {
                                                            PaypalConsentLaunchParams paypalConsentLaunchParams5 = this.A06;
                                                            if (paypalConsentLaunchParams5 != null) {
                                                                fBPayButton5.setText(paypalConsentLaunchParams5.A08);
                                                                FBPayButton fBPayButton6 = this.A08;
                                                                if (fBPayButton6 != null) {
                                                                    C11496SbJ.A01(fBPayButton6, 36, this);
                                                                    C12411Sto A0g = C51965G9l.A0g();
                                                                    LoggingContext loggingContext = this.A05;
                                                                    if (loggingContext == null) {
                                                                        str = "loggingContext";
                                                                    } else {
                                                                        PaypalConsentLaunchParams paypalConsentLaunchParams6 = this.A06;
                                                                        if (paypalConsentLaunchParams6 != null) {
                                                                            C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "client_load_ecppaypalconversion_display"), 72), loggingContext, new TWM(loggingContext, "paypal_consent", 1, Long.parseLong(paypalConsentLaunchParams6.A05)));
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
                                0qQ.A0F(str2);
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    }
                    0qQ.A0F("launchParams");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            SVF svf = new SVF(this, 5);
            0SM r1 = this.mParentFragment;
            0qQ.A0C(r1, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            Dialog dialog = r1.A01;
            if (dialog != null) {
                dialog.setOnDismissListener(svf);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1610865588);
        QCE.super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("PAYPAL_CONSENT_LAUNCH_PARAMS");
        0qQ.A0C(parcelable, "null cannot be cast to non-null type com.facebookpay.paypal.model.PaypalConsentLaunchParams");
        this.A06 = (PaypalConsentLaunchParams) parcelable;
        AnonymousClass0fD.A09(-230617194, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1391283712);
        ContextThemeWrapper A0K = Pxj.A0K(this, layoutInflater);
        this.A00 = A0K;
        View inflate = layoutInflater.cloneInContext(A0K).inflate(R.layout.ecp_paypal_consent_content_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1682387365, A022);
        return inflate;
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1676276426);
        QCE.super.onResume();
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            str = "viewContext";
        } else {
            C8924RFs rFs = C8924RFs.A0G;
            PaypalConsentLaunchParams paypalConsentLaunchParams = this.A06;
            if (paypalConsentLaunchParams == null) {
                str = "launchParams";
            } else {
                C9656Rea.A00(contextThemeWrapper, this, rFs, paypalConsentLaunchParams.A04, (String) null, TV4.A00, TV5.A00, false, false);
                AnonymousClass0fD.A09(-1001200404, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
