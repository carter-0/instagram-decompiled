package X;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.views.AutofillTextInputLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.android.R;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class QCL extends Fragment {
    public View A00;
    public Button A01;
    public EditText A02;
    public EditText A03;
    public LinearLayout A04;
    public ScrollView A05;
    public TextView A06;
    public TextView A07;
    public C7421QCk A08;
    public AutofillTextInputLayout A09;
    public AutofillTextInputLayout A0A;
    public BottomSheetBehavior A0B;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        this.A01 = (Button) view.findViewById(R.id.confrm_button);
        this.A07 = AnonymousClass7TE.A0d(view, R.id.title);
        this.A06 = AnonymousClass7TE.A0d(view, R.id.description);
        this.A04 = Pxe.A0M(view, R.id.enter_card_details_layout);
        this.A09 = (AutofillTextInputLayout) view.findViewById(R.id.card_cvv_input_layout);
        this.A02 = (EditText) view.findViewById(R.id.card_cvv_input);
        this.A0A = (AutofillTextInputLayout) view.findViewById(R.id.card_pan_input_layout);
        this.A03 = (EditText) view.findViewById(R.id.card_pan_input);
        this.A00 = view.findViewById(R.id.progress_layout);
        this.A05 = (ScrollView) view.findViewById(R.id.bottom_sheet_scroll_view);
        Drawable background = view.findViewById(R.id.bottom_sheet_layout).getBackground();
        0qQ.A0C(background, C273654mx.A00(0));
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        Context context = getContext();
        if (context != null) {
            gradientDrawable.setColor(Pxj.A0J(context, R.attr.w3c_bottom_sheet_color).data);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A01(QCL qcl, C11216SFq sFq, String str, String str2, String str3) {
        Button button = qcl.A01;
        if (button == null) {
            0qQ.A0F("viewConfirmButton");
            throw AnonymousClass00P.createAndThrow();
        }
        button.setEnabled(false);
        new AlertDialog.Builder(qcl.getActivity()).setTitle(str).setMessage(str2).setPositiveButton(R.string.f0nameremoved, new SV5(sFq, qcl, str3, 5)).show();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass0eM r0 = C9975RkU.A00;
        if (i == 2021 && i2 == -1 && intent != null) {
            try {
                AnonymousClass2E0.A0I();
                throw Pxi.A0p("An operation is not implemented: ", "add ig implementation");
            } catch (GeneralSecurityException e) {
                0KC.A0C("CreditCardScannerUtil", AnonymousClass7TF.A0m("Couldn't decrypt credit card number due to ", e));
            }
        }
    }

    public static final Intent A00(CardDetails cardDetails, QCL qcl, C11216SFq sFq, Integer num, Long l, Long l2, Long l3, Long l4, String str) {
        int A082;
        String str2;
        Intent A092 = DbS.A09();
        if (cardDetails != null) {
            A092.putExtra("keyResultCardDetails", cardDetails);
        }
        if (l != null) {
            A092.putExtra("timeElapsedInMs", l.longValue());
        }
        if (l2 != null) {
            A092.putExtra("additionalTimeElapsedInMs", l2.longValue());
        }
        C7421QCk qCk = qcl.A08;
        if (qCk != null) {
            A092.putExtra("numberOfCVVFailures", qCk.A06.size());
            C7421QCk qCk2 = qcl.A08;
            if (qCk2 != null) {
                if (qCk2.A06.size() > 0) {
                    C7421QCk qCk3 = qcl.A08;
                    if (qCk3 != null) {
                        List list = qCk3.A06;
                        ArrayList A0r = AnonymousClass7TG.A0r(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C11302SKm.A02(A0r, it);
                        }
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append('(');
                        A092.putExtra("cvvFailures", AnonymousClass7TG.A0n(A0r, A1A));
                    }
                }
                C7421QCk qCk4 = qcl.A08;
                if (qCk4 != null) {
                    Integer num2 = qCk4.A0E;
                    if (num2 != null) {
                        A092.putExtra("qplInstanceKey", num2);
                    }
                    if (l3 != null) {
                        A092.putExtra("timeInMsDemaskCardStart", l3.longValue());
                    }
                    if (l4 != null) {
                        A092.putExtra("timeInMsDemaskCardEnd", l4.longValue());
                    }
                    C7421QCk qCk5 = qcl.A08;
                    if (qCk5 != null) {
                        A092.putExtra("timeInMsDemaskFragmentActivityCreated", qCk5.A00);
                        C7421QCk qCk6 = qcl.A08;
                        if (qCk6 != null) {
                            RDS rds = (RDS) qCk6.A0A.A02();
                            if (rds == null) {
                                A082 = -1;
                            } else {
                                A082 = Pxe.A08(rds, C9976RkV.A00);
                            }
                            int[] iArr = C9976RkV.A00;
                            int intValue = num.intValue();
                            if (A082 == 1) {
                                if (intValue == 0) {
                                    str2 = "SUCCEEDED_CARD_VERIFICATION";
                                } else if (intValue != 1) {
                                    str2 = "CANCELED_CARD_VERIFICATION";
                                } else {
                                    str2 = "FAILED_CARD_VERIFICATION";
                                }
                            } else if (intValue == 0) {
                                str2 = "SUCCEEDED_CVV_VERIFICATION";
                            } else if (intValue != 1) {
                                str2 = "CANCELED_CVV_VERIFICATION";
                            } else {
                                str2 = "FAILED_CVV_VERIFICATION";
                            }
                            A092.putExtra("keyResultEventName", str2);
                            if (str == null) {
                                if (sFq != null) {
                                    AnonymousClass0eM r1 = sFq.A02;
                                    if (r1.getValue() != null) {
                                        str = DbS.A0t(r1);
                                    }
                                }
                                return A092;
                            }
                            A092.putExtra("keyResultError", str);
                            return A092;
                        }
                    }
                }
            }
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.07g, androidx.fragment.app.Fragment, X.QCL, java.lang.Object] */
    public final void onActivityCreated(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-209125254);
        QCL.super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Application application = activity.getApplication();
            0qQ.A07(application);
            this.A08 = JTO.A0L(new QDY(application, this.mArguments), this).A00(C7421QCk.class);
            EditText editText = this.A03;
            if (editText == null) {
                str = "viewPanInput";
            } else {
                C11462SaQ.A00(editText, new C66308MMr(this, 1), 5);
                EditText editText2 = this.A02;
                if (editText2 != null) {
                    C11462SaQ.A00(editText2, new C66308MMr(this, 2), 5);
                    EditText editText3 = this.A02;
                    if (editText3 != null) {
                        editText3.setOnEditorActionListener(new C11533Sbu(this, 3));
                        Button button = this.A01;
                        if (button == null) {
                            str = "viewConfirmButton";
                        } else {
                            C11496SbJ.A01(button, 67, this);
                            ScrollView scrollView = this.A05;
                            if (scrollView == null) {
                                str = "viewBottomSheetScrollView";
                            } else {
                                BottomSheetBehavior A012 = BottomSheetBehavior.A01(scrollView);
                                this.A0B = A012;
                                str = "bottomSheetBehavior";
                                if (A012 != null) {
                                    A012.A0W(3);
                                    BottomSheetBehavior bottomSheetBehavior = this.A0B;
                                    if (bottomSheetBehavior != null) {
                                        bottomSheetBehavior.A0a(new C8601Qxi(this, 2));
                                        C7421QCk qCk = this.A08;
                                        str = "viewModel";
                                        if (qCk != null) {
                                            C11651Sdt.A00(this, qCk.A0A, 23);
                                            C7421QCk qCk2 = this.A08;
                                            if (qCk2 != null) {
                                                Dba.A16(this, qCk2.A09, new C66308MMr(this, 0), 34);
                                                C7421QCk qCk3 = this.A08;
                                                if (qCk3 != null) {
                                                    C11651Sdt.A00(this, qCk3.A08, 24);
                                                    activity.getOnBackPressedDispatcher().A06(new QAG(activity, this), this);
                                                    AnonymousClass0fD.A09(-1504645293, A022);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F("viewCvvInput");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        NullPointerException A11 = AnonymousClass7TE.A11("Activity cannot be null");
        AnonymousClass0fD.A09(-2084781138, A022);
        throw A11;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(42755852);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.w3c_fbpay_autofill_demask_card_fragment, viewGroup, false);
        AnonymousClass0fD.A09(840128083, A022);
        return inflate;
    }
}
