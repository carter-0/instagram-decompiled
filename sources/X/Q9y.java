package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;

public final class Q9y extends LinearLayout implements C13601TdT {
    public C8036Qfg A00;

    public void setViewModel(C8036Qfg qfg) {
        String str;
        0qQ.A0B(qfg, 0);
        this.A00 = qfg;
        String str2 = "viewModel";
        C11497SbK sbK = null;
        if (qfg.A03) {
            Boolean bool = (Boolean) SRc.A0A(qfg);
            if (bool == null || !bool.booleanValue()) {
                C8036Qfg qfg2 = this.A00;
                if (qfg2 != null) {
                    Integer num = qfg2.A02;
                    if (num != null) {
                        str = DbW.A0h(getContext(), num, R.string.f0nameremoved);
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            str = getContext().getString(R.string.f0nameremoved);
        } else {
            str = null;
        }
        AnonymousClass2E0.A0H();
        Context A0S = AnonymousClass7TE.A0S(this);
        C8036Qfg qfg3 = this.A00;
        if (qfg3 != null) {
            String A16 = AnonymousClass7TE.A16(A0S, qfg3.A01);
            C8036Qfg qfg4 = this.A00;
            if (qfg4 != null) {
                String string = A0S.getString(qfg4.A00);
                C8036Qfg qfg5 = this.A00;
                if (qfg5 != null) {
                    if (qfg5.A03) {
                        sbK = new C11497SbK(this, 69);
                    }
                    U56 u56 = new U56(A0S);
                    u56.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    u56.A01(A16);
                    int i = (int) (33.0f * AnonymousClass7TF.A0E(A0S).density);
                    IgLinearLayout igLinearLayout = u56.A01;
                    if (igLinearLayout == null) {
                        str2 = "headerCellContainer";
                    } else {
                        igLinearLayout.setPadding(0, i, 0, 0);
                        if (!(str == null || sbK == null)) {
                            u56.A03(str, sbK);
                        }
                        if (string != null) {
                            View inflate = LayoutInflater.from(A0S).inflate(R.layout.ig_fbpay_ui_address_list_header_body, (ViewGroup) null, false);
                            0qQ.A0C(inflate, AnonymousClass000.A00(716));
                            TextView textView = (TextView) inflate;
                            textView.setText(string);
                            textView.setLetterSpacing(-0.01f);
                            u56.addView(textView);
                        }
                        u56.requestLayout();
                        addView(u56);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    private final View.OnClickListener getOnClickListener() {
        return new C11497SbK(this, 69);
    }
}
