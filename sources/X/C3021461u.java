package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.61u  reason: invalid class name and case insensitive filesystem */
public abstract class C3021461u extends LinearLayout {
    public abstract void setButtonType(C3021661w r1);

    public abstract void setDividerVisible(boolean z);

    public abstract void setPrimaryActionIsLoading(boolean z);

    public abstract void setPrimaryActionOnClickListener(View.OnClickListener onClickListener);

    public abstract void setPrimaryActionText(CharSequence charSequence);

    public abstract void setPrimaryButtonEnabled(boolean z);

    public abstract void setSecondaryActionOnClickListener(View.OnClickListener onClickListener);

    public abstract void setSecondaryActionText(CharSequence charSequence);

    public abstract void setSecondaryButtonEnabled(boolean z);

    public void A04(CharSequence charSequence, int i) {
        if (this instanceof C3021561v) {
            C3021561v r2 = (C3021561v) this;
            TextView textView = r2.A04;
            if (textView != null) {
                C3021561v.A02(textView, textView, r2, charSequence);
                textView.setBreakStrategy(0);
                r2.A07();
                return;
            }
            return;
        }
        ((IgdsBottomButtonLayout) this).A00.A04(charSequence, 0);
    }

    public void A05(CharSequence charSequence, int i) {
        if (this instanceof C3021561v) {
            C3021561v r1 = (C3021561v) this;
            TextView textView = r1.A03;
            if (textView != null) {
                C3021561v.A02(textView, textView, r1, charSequence);
                textView.setBreakStrategy(i);
                r1.A07();
                return;
            }
            return;
        }
        ((IgdsBottomButtonLayout) this).A00.A05(charSequence, i);
    }

    public boolean A06() {
        if (!(this instanceof C3021561v)) {
            return ((IgdsBottomButtonLayout) this).A00.A06();
        }
        View view = ((C3021561v) this).A02;
        if (view != null) {
            return view.isEnabled();
        }
        0qQ.A0F("primaryActionContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public void setPrimaryAction(CharSequence charSequence, View.OnClickListener onClickListener) {
        setPrimaryActionText(charSequence);
        setPrimaryActionOnClickListener(onClickListener);
    }

    public void setSecondaryAction(CharSequence charSequence, View.OnClickListener onClickListener) {
        setSecondaryActionText(charSequence);
        setSecondaryActionOnClickListener(onClickListener);
    }
}
