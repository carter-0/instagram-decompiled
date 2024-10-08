package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.TextView;
import com.instagram.igds.components.button.IgdsButton;
import kotlin.Deprecated;

@Deprecated(message = "You should NOT use this directly and should only use [IgdsBottomButtonLayout] instead.")
/* renamed from: X.943  reason: invalid class name */
public final class AnonymousClass943 extends C3021461u {
    public View A00;
    public TextView A01;
    public TextView A02;
    public IgdsButton A03;
    public IgdsButton A04;

    public static final void A00(Context context, TypedArray typedArray, AnonymousClass943 r5, IgdsButton igdsButton, int i) {
        String str;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            CharSequence text = context.getText(resourceId);
            if (text instanceof String) {
                str = (String) text;
            } else {
                str = null;
            }
            igdsButton.setText(str);
            igdsButton.setVisibility(0);
        } else {
            r5.A03(igdsButton, typedArray.getText(i));
        }
        A02(r5);
    }

    public static final void A01(TextView textView, AnonymousClass943 r3, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
        A02(r3);
    }

    private final void A03(IgdsButton igdsButton, CharSequence charSequence) {
        String str;
        if (charSequence == null || charSequence.length() == 0) {
            igdsButton.setVisibility(8);
        } else {
            if (charSequence instanceof String) {
                str = (String) charSequence;
            } else {
                str = null;
            }
            igdsButton.setText(str);
            igdsButton.setVisibility(0);
        }
        A02(this);
    }

    public final void A04(CharSequence charSequence, int i) {
        String str;
        TextView textView = this.A01;
        if (textView == null) {
            str = "footer";
        } else {
            boolean z = false;
            if (textView.getVisibility() == 8) {
                z = true;
            }
            17k.A0I(z, "You can only have a footer above OR below, not both", new Object[0]);
            TextView textView2 = this.A02;
            str = "footerAboveAction";
            if (textView2 != null) {
                A01(textView2, this, charSequence);
                TextView textView3 = this.A02;
                if (textView3 != null) {
                    textView3.setBreakStrategy(0);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void setButtonType(C3021661w r2) {
        0qQ.A0B(r2, 0);
    }

    public static final void A02(AnonymousClass943 r2) {
        String str;
        IgdsButton igdsButton = r2.A03;
        if (igdsButton == null) {
            str = "primaryActionButton";
        } else {
            CharSequence text = igdsButton.A0A.getText();
            int i = 0;
            if (text == null || text.length() == 0) {
                IgdsButton igdsButton2 = r2.A04;
                if (igdsButton2 == null) {
                    str = "secondaryActionButton";
                } else {
                    CharSequence text2 = igdsButton2.A0A.getText();
                    if (text2 == null || text2.length() == 0) {
                        TextView textView = r2.A01;
                        if (textView == null) {
                            str = "footer";
                        } else {
                            CharSequence text3 = textView.getText();
                            if (text3 == null || text3.length() == 0) {
                                i = 8;
                            }
                        }
                    }
                }
            }
            r2.setVisibility(i);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A05(CharSequence charSequence, int i) {
        String str;
        TextView textView = this.A02;
        if (textView == null) {
            str = "footerAboveAction";
        } else {
            boolean z = false;
            if (textView.getVisibility() == 8) {
                z = true;
            }
            17k.A0I(z, "You can only have a footer above OR below, not both", new Object[0]);
            TextView textView2 = this.A01;
            str = "footer";
            if (textView2 != null) {
                A01(textView2, this, charSequence);
                TextView textView3 = this.A01;
                if (textView3 != null) {
                    textView3.setBreakStrategy(i);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A06() {
        IgdsButton igdsButton = this.A03;
        if (igdsButton != null) {
            return igdsButton.isEnabled();
        }
        0qQ.A0F("primaryActionButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public void setDividerVisible(boolean z) {
        View view = this.A00;
        if (view == null) {
            0qQ.A0F("divider");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = 8;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public void setPrimaryActionIsLoading(boolean z) {
        IgdsButton igdsButton = this.A03;
        if (igdsButton == null) {
            0qQ.A0F("primaryActionButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igdsButton.setLoading(z);
        }
    }

    public void setPrimaryActionOnClickListener(View.OnClickListener onClickListener) {
        IgdsButton igdsButton = this.A03;
        if (igdsButton == null) {
            0qQ.A0F("primaryActionButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igdsButton.setOnClickListener(onClickListener);
        }
    }

    public void setPrimaryActionText(CharSequence charSequence) {
        IgdsButton igdsButton = this.A03;
        if (igdsButton == null) {
            0qQ.A0F("primaryActionButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A03(igdsButton, charSequence);
        }
    }

    public void setPrimaryButtonEnabled(boolean z) {
        IgdsButton igdsButton = this.A03;
        if (igdsButton == null) {
            0qQ.A0F("primaryActionButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igdsButton.setEnabled(z);
        }
    }

    public void setSecondaryActionOnClickListener(View.OnClickListener onClickListener) {
        IgdsButton igdsButton = this.A04;
        if (igdsButton == null) {
            0qQ.A0F("secondaryActionButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igdsButton.setOnClickListener(onClickListener);
        }
    }

    public void setSecondaryActionText(CharSequence charSequence) {
        IgdsButton igdsButton = this.A04;
        if (igdsButton == null) {
            0qQ.A0F("secondaryActionButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A03(igdsButton, charSequence);
        }
    }

    public void setSecondaryButtonEnabled(boolean z) {
        IgdsButton igdsButton = this.A04;
        if (igdsButton == null) {
            0qQ.A0F("secondaryActionButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igdsButton.setEnabled(z);
        }
    }

    private final void setButtonTypeInternal(C3021661w r1) {
    }
}
