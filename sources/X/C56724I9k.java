package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.I9k  reason: case insensitive filesystem */
public final class C56724I9k implements TextWatcher {
    public CharSequence A00 = "";
    public final /* synthetic */ AnonymousClass6PP A01;

    public final void afterTextChanged(Editable editable) {
        String str;
        0qQ.A0B(editable, 0);
        AnonymousClass6PP r5 = this.A01;
        if (r5.A02().getLineCount() > 3) {
            editable.replace(0, editable.length(), this.A00);
        } else {
            this.A00 = DbS.A0C(editable);
        }
        boolean z = true;
        boolean z2 = !00l.A0W(DbV.A12(AnonymousClass7TF.A0f(r5.A02())));
        if (r5.A01().getVisibility() == 0) {
            z = false;
        }
        if (z2) {
            r5.A01().setVisibility(0);
            ConstraintLayout constraintLayout = r5.A06;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
                if (z) {
                    View A002 = r5.A00();
                    ConstraintLayout constraintLayout2 = r5.A05;
                    if (constraintLayout2 != null) {
                        ConstraintLayout constraintLayout3 = r5.A06;
                        if (constraintLayout3 != null) {
                            I5R.A01(A002, r5.A01(), constraintLayout2, constraintLayout3);
                        }
                    } else {
                        str = "cardViewWithoutCta";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                TextView textView = r5.A02;
                if (textView != null) {
                    textView.setVisibility(0);
                    return;
                }
                str = "disclaimerTextView";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            str = "ctaButtonLayout";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        r5.A03();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C56724I9k(AnonymousClass6PP r2) {
        this.A01 = r2;
    }
}
