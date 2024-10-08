package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.instagram.android.R;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: X.3GE  reason: invalid class name */
public final class AnonymousClass3GE extends Handler {
    public final WeakReference A00;

    public final void handleMessage(Message message) {
        AnonymousClass3GC r0;
        AnonymousClass332 r02;
        boolean z;
        int i;
        TextView textView;
        AdapterView adapterView;
        Dialog dialog;
        String str;
        0qQ.A0B(message, 0);
        AnonymousClass3GD r5 = (AnonymousClass3GD) this.A00.get();
        if (r5 != null && message.what == 3) {
            int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            Activity activity = r5.A09;
            if (!activity.hasWindowFocus() || (r0 = r5.A0E) == null || ((r02 = r0.A00) != null && AnonymousClass4K8.A00(r02.A05.A0G.A0J()))) {
                AnonymousClass3GD.A03(r5);
                return;
            }
            C45417Cvx cvx = r5.A04;
            if (cvx == null) {
                return;
            }
            if (cvx.A00 != AnonymousClass05K.A01 || r5.A0D.isSponsoredEligible()) {
                W5G w5g = W5G.A00;
                C18831W4t w4t = new C18831W4t(cvx, r5);
                r5.A05 = new VSB(cvx, r5);
                if (cvx.A06) {
                    FF8 ff8 = new FF8(activity, R.layout.multiple_question_dialog, R.style.IgDialogDeprecated);
                    z = true;
                    C46659Dig dig = ff8.A0D;
                    dig.setCancelable(true);
                    dig.setCanceledOnTouchOutside(true);
                    i = 2131974824;
                    ff8.A01(2131974824);
                    ff8.A03(w5g, ff8.A02.getString(2131974821));
                    ff8.A02(w4t, 2131974826);
                    r5.A01 = ff8.A00();
                } else {
                    String string = activity.getResources().getString(2131974821);
                    0qQ.A07(string);
                    Locale locale = activity.getResources().getConfiguration().locale;
                    0qQ.A06(locale);
                    String upperCase = string.toUpperCase(locale);
                    0qQ.A07(upperCase);
                    FF8 ff82 = new FF8(activity, R.layout.multiple_question_dialog, R.style.IgDialogDeprecated);
                    z = true;
                    C46659Dig dig2 = ff82.A0D;
                    dig2.setCancelable(true);
                    dig2.setCanceledOnTouchOutside(true);
                    i = 2131974824;
                    ff82.A01(2131974824);
                    C18817W4e w4e = new C18817W4e(r5);
                    TextView textView2 = ff82.A09;
                    textView2.getClass();
                    textView2.setText(upperCase);
                    AnonymousClass0fU.A00(new C50068FNj(w4e, ff82, -1), textView2);
                    textView2.setVisibility(0);
                    C46659Dig A002 = ff82.A00();
                    r5.A01 = A002;
                    View findViewById = A002.findViewById(R.id.close_button);
                    if (findViewById != null) {
                        AnonymousClass0fU.A00(new W94(r5), findViewById);
                    }
                    Dialog dialog2 = r5.A01;
                    if (dialog2 != null) {
                        View findViewById2 = dialog2.findViewById(R.id.button_blue);
                        0qQ.A07(findViewById2);
                        findViewById2.setVisibility(8);
                    }
                }
                Dialog dialog3 = r5.A01;
                if (dialog3 != null) {
                    textView = (TextView) dialog3.findViewById(R.id.multi_question_survey_title);
                } else {
                    textView = null;
                }
                r5.A03 = textView;
                Dialog dialog4 = r5.A01;
                if (dialog4 != null) {
                    adapterView = (AdapterView) dialog4.findViewById(R.id.multiQuestionSurveyList);
                    dialog4.setOnShowListener(new C18839W5i(r5));
                } else {
                    adapterView = null;
                }
                AnonymousClass3GD.A00(dialog4, cvx, r5, r5.A00);
                if (adapterView != null) {
                    adapterView.setOnItemClickListener(new C18911WCf(cvx, r5));
                }
                Dialog dialog5 = r5.A01;
                if (dialog5 != null) {
                    dialog5.setOnDismissListener(new W5W(r5));
                }
                if (!cvx.A05 || (str = cvx.A02) == null) {
                    dialog = r5.A01;
                } else {
                    String string2 = activity.getResources().getString(2131968361);
                    0qQ.A07(string2);
                    Locale locale2 = activity.getResources().getConfiguration().locale;
                    0qQ.A06(locale2);
                    String upperCase2 = string2.toUpperCase(locale2);
                    0qQ.A07(upperCase2);
                    C358248ab r8 = new C358248ab(activity);
                    r8.A0q(str);
                    r8.A09(i);
                    r8.A0Y(new C18832W4u(cvx, r5), C358278ae.BLUE_BOLD, upperCase2, false);
                    r8.A0B(new W4X(cvx, r5));
                    r8.A0r(z);
                    r8.A0s(false);
                    Dialog A02 = r8.A02();
                    r5.A02 = A02;
                    if (A02 != null) {
                        A02.setOnShowListener(new C18840W5j(r5));
                    }
                    dialog = r5.A02;
                }
                if (dialog != null) {
                    AnonymousClass0fN.A00(dialog);
                    return;
                }
                return;
            }
            AnonymousClass3GD.A02(r5);
        }
    }

    public AnonymousClass3GE(AnonymousClass3GD r2) {
        this.A00 = new WeakReference(r2);
    }
}
