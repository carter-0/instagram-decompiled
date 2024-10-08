package X;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.UEm  reason: case insensitive filesystem */
public final class C14907UEm extends C249703kE implements X4L {
    public C230202p9 A00;
    public C17983VjL A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14907UEm(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A05 = AnonymousClass7TF.A0G(view, R.id.question_text_container);
        this.A07 = C66582MXn.A0F(view);
        this.A06 = AnonymousClass7TG.A0R(view, R.id.question_indicator);
        this.A04 = AnonymousClass7TF.A0G(view, R.id.forward_arrow);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.back_arrow);
        this.A03 = AnonymousClass7TF.A0G(view, R.id.dismiss_button);
    }

    public final void A00(C17997VjZ vjZ, C17927ViI viI) {
        View view;
        0qQ.A0B(vjZ, 1);
        boolean z = vjZ.A01;
        int i = 8;
        View view2 = this.A02;
        if (!z) {
            view2.setVisibility(DbW.A01(viI.A01));
            view = this.A04;
            if (viI.A00 > viI.A01 && !vjZ.A01 && vjZ.A01()) {
                i = 0;
            }
        } else {
            view2.setVisibility(8);
            view = this.A04;
        }
        view.setVisibility(i);
    }

    public final void A01(C17997VjZ vjZ, C17927ViI viI) {
        int A002;
        if (vjZ.A01 || this.A01 == null) {
            this.A06.setVisibility(4);
            return;
        }
        TextView textView = this.A06;
        textView.setVisibility(0);
        Resources A052 = DbU.A05(textView);
        Integer valueOf = Integer.valueOf(viI.A01 + 1);
        C17983VjL vjL = this.A01;
        if (vjL != null) {
            if (vjL.A01 != null) {
                A002 = vjL.A00() - 1;
            } else {
                A002 = vjL.A00();
            }
            String string = A052.getString(2131971034, C51968G9o.A1Z(valueOf, A002));
            0qQ.A07(string);
            textView.setText(AnonymousClass7TG.A0o(string));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DbF(C17927ViI viI, int i) {
        C17983VjL vjL = this.A01;
        if (vjL != null && this.A00 != null) {
            C17997VjZ A012 = vjL.A01(viI.A01);
            if (1 == i) {
                TextView textView = this.A07;
                C15059UNc uNc = A012.A03;
                String str = uNc.A07;
                if (str != null) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 0);
                    textView.setText(spannableString);
                    C17983VjL vjL2 = this.A01;
                    if (vjL2 != null) {
                        Boolean bool = vjL2.A00.A01;
                        if (bool != null && bool.booleanValue()) {
                            A01(A012, viI);
                        }
                        C17983VjL vjL3 = this.A01;
                        if (vjL3 != null) {
                            Boolean bool2 = vjL3.A00.A02;
                            if (bool2 != null && bool2.booleanValue()) {
                                A00(A012, viI);
                            }
                            C230202p9 r2 = this.A00;
                            if (r2 != null) {
                                String str2 = uNc.A03;
                                if (str2 != null) {
                                    r2.Db8(str2, viI.A01);
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            C17983VjL vjL4 = this.A01;
            if (vjL4 != null) {
                Boolean bool3 = vjL4.A00.A02;
                if (bool3 != null && bool3.booleanValue()) {
                    A00(A012, viI);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
