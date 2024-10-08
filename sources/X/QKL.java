package X;

import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.fbpay.w3c.CardDetails;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class QKL extends QKF {
    public Intent A00;
    public View A01;
    public View A02;
    public View A03;
    public Button A04;
    public EditText A05;
    public FrameLayout A06;
    public LinearLayout A07;
    public ScrollView A08;
    public Spinner A09;
    public TextView A0A;
    public TextView A0B;
    public C7419QCi A0C;
    public Integer A0D;
    public String A0E;
    public String A0F;
    public String A0G;

    public final Intent A0H(CardDetails cardDetails, C11216SFq sFq, Integer num, Long l, Long l2, Long l3, String str) {
        String str2;
        Intent A092 = DbS.A09();
        if (cardDetails != null) {
            A092.putExtra("keyResultCardDetails", cardDetails);
        }
        if (l != null) {
            A092.putExtra("timeElapsedInMs", l.longValue());
        }
        C7419QCi qCi = this.A0C;
        if (qCi != null) {
            A092.putExtra("numberOfCVVFailures", qCi.A02.size());
            C7419QCi qCi2 = this.A0C;
            if (qCi2 != null) {
                if (qCi2.A02.size() > 0) {
                    C7419QCi qCi3 = this.A0C;
                    if (qCi3 != null) {
                        List list = qCi3.A02;
                        ArrayList A0r = AnonymousClass7TG.A0r(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C11302SKm.A02(A0r, it);
                        }
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append('(');
                        A092.putExtra("cvvFailures", AnonymousClass7TG.A0n(A0r, A1A));
                    } else {
                        C51965G9l.A15();
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                C7419QCi qCi4 = this.A0C;
                if (qCi4 != null) {
                    Integer num2 = qCi4.A09;
                    if (num2 != null) {
                        A092.putExtra("qplInstanceKey", num2);
                    }
                    if (l2 != null) {
                        A092.putExtra("timeInMsDemaskCardStart", l2.longValue());
                    }
                    if (l3 != null) {
                        A092.putExtra("timeInMsDemaskCardEnd", l3.longValue());
                    }
                    C7419QCi qCi5 = this.A0C;
                    if (qCi5 != null) {
                        A092.putExtra("timeInMsDemaskFragmentActivityCreated", qCi5.A00);
                        int intValue = num.intValue();
                        if (intValue == 0) {
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
                    C51965G9l.A15();
                    throw AnonymousClass00P.createAndThrow();
                }
                C51965G9l.A15();
                throw AnonymousClass00P.createAndThrow();
            }
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        C51965G9l.A15();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        STY sty;
        C270254gR r0;
        0qQ.A0B(dialogInterface, 0);
        Integer num = this.A0D;
        if (!(num == null || num.intValue() != -1 || (r0 = this.A01) == null)) {
            C11290SJq sJq = r0.A01;
            Integer num2 = AnonymousClass05K.A01;
            sJq.A02(this.A00, new C53388GnK((Long) null, (Map) null, 511), num2, "ACCEPTED_AUTOFILL");
        }
        WeakReference weakReference = this.A02;
        if (!(weakReference == null || (sty = (STY) weakReference.get()) == null)) {
            int A012 = DbX.A01(this.A0D);
            Intent intent = this.A00;
            if (intent == null) {
                intent = A0H((CardDetails) null, (C11216SFq) null, AnonymousClass05K.A0C, (Long) null, (Long) null, (Long) null, (String) null);
            }
            sty.A0A(A012, intent);
        }
        dialogInterface.cancel();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String string;
        Resources resources;
        Resources resources2;
        0qQ.A0B(view, 0);
        this.A0B = AnonymousClass7TE.A0d(view, R.id.title);
        this.A05 = (EditText) view.findViewById(R.id.card_cvv_input);
        this.A04 = (Button) view.findViewById(R.id.confirm_button);
        this.A07 = Pxe.A0M(view, R.id.enter_card_details_layout);
        this.A03 = view.findViewById(R.id.progress_layout);
        this.A08 = (ScrollView) view.findViewById(R.id.bottom_sheet_scroll_view);
        this.A06 = (FrameLayout) view.findViewById(R.id.bottom_sheet_layout);
        this.A0A = AnonymousClass7TE.A0d(view, R.id.inline_error_message);
        this.A09 = (Spinner) view.findViewById(R.id.card_selection_dropdown);
        this.A02 = view.findViewById(R.id.single_card_selection_preview);
        Context context = getContext();
        String str2 = null;
        if (!(context == null || (resources2 = context.getResources()) == null)) {
            str2 = resources2.getString(R.string.f0nameremoved);
        }
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        this.A0G = str2;
        Context context2 = getContext();
        if (context2 == null || (resources = context2.getResources()) == null || (str = resources.getString(R.string.f0nameremoved)) == null) {
            str = str3;
        }
        this.A0F = str;
        Context context3 = getContext();
        if (!(context3 == null || (string = context3.getString(R.string.f0nameremoved)) == null)) {
            str3 = string;
        }
        this.A0E = str3;
    }

    public static final void A01(QKL qkl, C11216SFq sFq, String str, String str2, String str3) {
        Button button = qkl.A04;
        if (button != null) {
            button.setEnabled(false);
        }
        AlertDialog.Builder message = new AlertDialog.Builder(qkl.getActivity()).setTitle(str).setMessage(str2);
        String str4 = qkl.A0E;
        if (str4 != null) {
            message.setPositiveButton(str4, new SV5(sFq, qkl, str3, 2)).show();
        } else {
            0qQ.A0F("okButtonText");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final Dialog A0F(Bundle bundle) {
        View inflate = LayoutInflater.from(requireActivity()).inflate(R.layout.layout_iab_autofill_cvv_verification_bottomsheet, (ViewGroup) null);
        this.A01 = inflate;
        if (inflate != null) {
            C11507SbU.A00(inflate, 2, this);
        }
        AlertDialog create = new AlertDialog.Builder(requireActivity()).setView(this.A01).create();
        0qQ.A07(create);
        return create;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, X.QKL, X.07g, androidx.fragment.app.Fragment, X.QKF, X.0SM, java.lang.Object] */
    public final void onActivityCreated(Bundle bundle) {
        C11265SHz sHz;
        BottomSheetBehavior A012;
        int A022 = AnonymousClass0fD.A02(993449700);
        QKL.super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Application application = activity.getApplication();
            0qQ.A07(application);
            C7419QCi A002 = JTO.A0L(new QDW(application, this.mArguments), this).A00(C7419QCi.class);
            0qQ.A0B(A002, 0);
            this.A0C = A002;
            View view = this.A01;
            if (view != null) {
                if (A002.A0A.size() > 1) {
                    View view2 = this.A02;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    Spinner spinner = this.A09;
                    if (spinner != null) {
                        Context requireContext = requireContext();
                        C7419QCi qCi = this.A0C;
                        if (qCi != null) {
                            spinner.setOnItemSelectedListener(new C18913WCh(qCi, 3));
                            spinner.setAdapter(new Q9A(requireContext, qCi));
                        } else {
                            C51965G9l.A15();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                } else {
                    Spinner spinner2 = this.A09;
                    if (spinner2 != null) {
                        spinner2.setVisibility(8);
                    }
                    View view3 = this.A02;
                    if (view3 != null) {
                        C7419QCi qCi2 = this.A0C;
                        if (qCi2 != null) {
                            CardDetails cardDetails = (CardDetails) qCi2.A05.A02();
                            if (cardDetails != null) {
                                SGO.A00.A00(getContext(), view3, cardDetails);
                            }
                        } else {
                            C51965G9l.A15();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
                FragmentActivity requireActivity = requireActivity();
                0sP r1 = this.A03;
                if (r1 != null) {
                    sHz = (C11265SHz) r1.invoke("CLICKED_LEARN_MORE");
                } else {
                    sHz = null;
                }
                SKI.A00(requireActivity, this.A00, view, (TextView) null, this.A01, sHz, 2131965846, R.id.disclosure_stub, 2131953393, true);
                EditText editText = this.A05;
                if (editText != null) {
                    C11462SaQ.A00(editText, new TY5(this, 7), 0);
                }
                EditText editText2 = this.A05;
                if (editText2 != null) {
                    editText2.setOnEditorActionListener(new C11533Sbu(this, 0));
                }
                Button button = this.A04;
                if (button != null) {
                    C11497SbK.A01(button, 4, this);
                }
                Pxk.A0X(this);
                ScrollView scrollView = this.A08;
                if (!(scrollView == null || (A012 = BottomSheetBehavior.A01(scrollView)) == null)) {
                    A012.A0W(3);
                    A012.A0a(new C8601Qxi(this, 0));
                }
                C7419QCi qCi3 = this.A0C;
                if (qCi3 != null) {
                    Dba.A16(this, qCi3.A04, new TYA(19, (Object) this, (Object) view), 0);
                    C7419QCi qCi4 = this.A0C;
                    if (qCi4 != null) {
                        C11649Sdr.A01(this, qCi4.A03, 11);
                        C7419QCi qCi5 = this.A0C;
                        if (qCi5 != null) {
                            Dba.A16(this, qCi5.A05, new TY5(this, 6), 0);
                            AnonymousClass0fD.A09(2034739478, A022);
                            return;
                        }
                        C51965G9l.A15();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C51965G9l.A15();
                    throw AnonymousClass00P.createAndThrow();
                }
                C51965G9l.A15();
                throw AnonymousClass00P.createAndThrow();
            }
        }
        NullPointerException A11 = AnonymousClass7TE.A11("Activity cannot be null");
        AnonymousClass0fD.A09(-1402205123, A022);
        throw A11;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(756272796);
        0qQ.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View view = this.A01;
        AnonymousClass0fD.A09(2079356840, A022);
        return view;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1994850746);
        QKL.super.onDestroyView();
        this.A01 = null;
        this.A0B = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A03 = null;
        this.A08 = null;
        this.A06 = null;
        this.A0A = null;
        Spinner spinner = this.A09;
        if (spinner != null) {
            spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
        }
        Spinner spinner2 = this.A09;
        if (spinner2 != null) {
            spinner2.setAdapter((SpinnerAdapter) null);
        }
        this.A09 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(1886998339, A022);
    }
}
