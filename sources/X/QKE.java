package X;

import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.views.AutofillTextInputLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class QKE extends QKF {
    public Intent A00;
    public View A01;
    public View A02;
    public Button A03;
    public Button A04;
    public EditText A05;
    public EditText A06;
    public FrameLayout A07;
    public LinearLayout A08;
    public ScrollView A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public C7420QCj A0D;
    public AutofillTextInputLayout A0E;
    public AutofillTextInputLayout A0F;
    public Integer A0G;
    public String A0H;
    public String A0I;
    public String A0J;

    public final Intent A0H(CardDetails cardDetails, C11216SFq sFq, Integer num, Long l, Long l2, Long l3, Long l4, String str) {
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
        C7420QCj qCj = this.A0D;
        if (qCj != null) {
            A092.putExtra("numberOfCVVFailures", qCj.A05.size());
            C7420QCj qCj2 = this.A0D;
            if (qCj2 != null) {
                if (qCj2.A05.size() > 0) {
                    C7420QCj qCj3 = this.A0D;
                    if (qCj3 != null) {
                        List list = qCj3.A05;
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
                C7420QCj qCj4 = this.A0D;
                if (qCj4 != null) {
                    Integer num2 = qCj4.A0F;
                    if (num2 != null) {
                        A092.putExtra("qplInstanceKey", num2);
                    }
                    if (l3 != null) {
                        A092.putExtra("timeInMsDemaskCardStart", l3.longValue());
                    }
                    if (l4 != null) {
                        A092.putExtra("timeInMsDemaskCardEnd", l4.longValue());
                    }
                    C7420QCj qCj5 = this.A0D;
                    if (qCj5 != null) {
                        A092.putExtra("timeInMsDemaskFragmentActivityCreated", qCj5.A00);
                        C7420QCj qCj6 = this.A0D;
                        if (qCj6 != null) {
                            RDR rdr = (RDR) qCj6.A09.A02();
                            if (rdr == null) {
                                A082 = -1;
                            } else {
                                A082 = Pxe.A08(rdr, C9916RjV.A00);
                            }
                            int[] iArr = C9916RjV.A00;
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
        C51965G9l.A15();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        STY sty;
        0qQ.A0B(dialogInterface, 0);
        WeakReference weakReference = this.A02;
        if (!(weakReference == null || (sty = (STY) weakReference.get()) == null)) {
            int A0A2 = AnonymousClass7TG.A0A(this.A0G);
            Intent intent = this.A00;
            if (intent == null) {
                intent = A0H((CardDetails) null, (C11216SFq) null, AnonymousClass05K.A0C, (Long) null, (Long) null, (Long) null, (Long) null, (String) null);
            }
            sty.A0A(A0A2, intent);
        }
        dialogInterface.cancel();
    }

    public static final void A01(QKE qke, C11216SFq sFq, String str, String str2, String str3) {
        Button button = qke.A03;
        if (button != null) {
            button.setEnabled(false);
        }
        AlertDialog.Builder message = new AlertDialog.Builder(qke.getActivity()).setTitle(str).setMessage(str2);
        String str4 = qke.A0H;
        if (str4 != null) {
            message.setPositiveButton(str4, new SV5(sFq, qke, str3, 3)).show();
        } else {
            0qQ.A0F("okButtonText");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.07g, androidx.fragment.app.Fragment, X.0SM, java.lang.Object, X.QKE] */
    public final void onActivityCreated(Bundle bundle) {
        BottomSheetBehavior A012;
        int A022 = AnonymousClass0fD.A02(1839255390);
        QKE.super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Application application = activity.getApplication();
            0qQ.A07(application);
            C7420QCj A002 = JTO.A0L(new QDX(application, this.mArguments), this).A00(C7420QCj.class);
            0qQ.A0B(A002, 0);
            this.A0D = A002;
            View view = this.A01;
            if (view != null) {
                EditText editText = this.A06;
                if (editText != null) {
                    C11462SaQ.A00(editText, new TY5(this, 8), 1);
                }
                EditText editText2 = this.A05;
                if (editText2 != null) {
                    C11462SaQ.A00(editText2, new TY5(this, 9), 1);
                }
                EditText editText3 = this.A05;
                if (editText3 != null) {
                    editText3.setOnEditorActionListener(new C11533Sbu(this, 1));
                }
                Button button = this.A03;
                if (button != null) {
                    C11497SbK.A01(button, 5, this);
                }
                Button button2 = this.A04;
                if (button2 != null) {
                    C11497SbK.A01(button2, 6, this);
                }
                ScrollView scrollView = this.A09;
                if (!(scrollView == null || (A012 = BottomSheetBehavior.A01(scrollView)) == null)) {
                    A012.A0W(3);
                    A012.A0a(new C8601Qxi(this, 1));
                }
                C7420QCj qCj = this.A0D;
                if (qCj != null) {
                    C11649Sdr.A01(this, qCj.A09, 14);
                    C7420QCj qCj2 = this.A0D;
                    if (qCj2 != null) {
                        Dba.A16(this, qCj2.A08, new TYA(20, (Object) this, (Object) view), 2);
                        C7420QCj qCj3 = this.A0D;
                        if (qCj3 != null) {
                            C11649Sdr.A01(this, qCj3.A07, 15);
                            AnonymousClass0fD.A09(-242965947, A022);
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
        AnonymousClass0fD.A09(-1502448390, A022);
        throw A11;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1750966822);
        0qQ.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View view = this.A01;
        AnonymousClass0fD.A09(1627103206, A022);
        return view;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1701097344);
        QKE.super.onDestroyView();
        this.A01 = null;
        this.A0C = null;
        this.A0A = null;
        this.A06 = null;
        this.A0F = null;
        this.A05 = null;
        this.A0E = null;
        this.A03 = null;
        this.A08 = null;
        this.A02 = null;
        this.A09 = null;
        this.A07 = null;
        this.A04 = null;
        this.A0B = null;
        AnonymousClass0fD.A09(-901989299, A022);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        QKE.super.onActivityResult(i, i2, intent);
    }
}
