package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6Pa  reason: invalid class name and case insensitive filesystem */
public final class C307156Pa implements C307166Pb {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public IgImageView A08;
    public final C252063oV A09;

    public final void EvG(Boolean bool, CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence.length() != 0 && 0qQ.A0K(bool, true)) {
            TextView textView = this.A05;
            String str = "bodySignalTextView";
            if (textView != null) {
                textView.setVisibility(0);
                TextView textView2 = this.A05;
                if (textView2 != null) {
                    textView2.setText(charSequence);
                    TextView textView3 = this.A05;
                    if (textView3 != null) {
                        C244083ac.A05(textView3, C244063aa.CARD_OVERLAY_CAPTION);
                        View view = this.A01;
                        if (view == null) {
                            str = "ctaSectionDivider";
                        } else {
                            view.setVisibility(0);
                            TextView textView4 = this.A07;
                            if (textView4 != null) {
                                textView4.setVisibility(0);
                                TextView textView5 = this.A07;
                                if (textView5 != null) {
                                    C244083ac.A05(textView5, C244063aa.CARD_OVERLAY_CTA);
                                    if (charSequence2 == null) {
                                        TextView textView6 = this.A06;
                                        if (textView6 == null) {
                                            str = "bottomSignalTextView";
                                        } else {
                                            textView6.setVisibility(8);
                                            return;
                                        }
                                    } else {
                                        TextView textView7 = this.A06;
                                        str = "bottomSignalTextView";
                                        if (textView7 != null) {
                                            textView7.setVisibility(0);
                                            TextView textView8 = this.A06;
                                            if (textView8 != null) {
                                                textView8.setText(charSequence2);
                                                TextView textView9 = this.A06;
                                                if (textView9 != null) {
                                                    C244083ac.A05(textView9, C244063aa.CARD_OVERLAY_INFO_LABEL);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            str = "ctaSectionTextView";
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void CLo() {
        String str;
        TextView textView = this.A05;
        if (textView == null) {
            str = "bodySignalTextView";
        } else {
            textView.setVisibility(8);
            TextView textView2 = this.A06;
            if (textView2 == null) {
                str = "bottomSignalTextView";
            } else {
                textView2.setVisibility(8);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C307156Pa(ViewStub viewStub) {
        C252063oV A012 = 2b1.A01(viewStub, false, false);
        this.A09 = A012;
        A012.EeU(new C307176Pc(this));
    }
}
