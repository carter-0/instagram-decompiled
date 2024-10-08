package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class QAP extends U4K implements C13601TdT {
    public C8037Qfh A00;
    public final View.OnClickListener A01 = C11496SbJ.A00(this, 0);

    public void setViewModel(C8037Qfh qfh) {
        boolean booleanValue;
        0qQ.A0B(qfh, 0);
        this.A00 = qfh;
        Boolean bool = (Boolean) SRc.A0A(qfh);
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        setChecked(booleanValue);
        C8037Qfh qfh2 = this.A00;
        if (qfh2 != null) {
            setEnabled(qfh2.A08);
            C8037Qfh qfh3 = this.A00;
            if (qfh3 != null) {
                setText(qfh3.A01);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if ((getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && layoutParams != null) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    context.getTheme().resolveAttribute(R.attr.fbpay_hub_checkbox_item_margin_top, typedValue, true);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) typedValue.getDimension(AnonymousClass7TF.A0E(context)), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    requestLayout();
                }
                Integer num = AnonymousClass05K.A0C;
                Context context2 = getContext();
                C8037Qfh qfh4 = this.A00;
                if (qfh4 != null) {
                    C18674VwX.A01(this, num, context2.getString(qfh4.A00));
                    C8037Qfh qfh5 = this.A00;
                    if (qfh5 != null) {
                        if (qfh5.A03) {
                            setCheckMarkDrawable((Drawable) null);
                            setCompoundDrawablesWithIntrinsicBounds(getCheckBoxDrawable(), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        setOnClickListener(this.A01);
                        return;
                    }
                }
            }
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    private final StateListDrawable getCheckBoxDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        SPB A0A = AnonymousClass2E0.A0A();
        Context context = getContext();
        0qQ.A07(context);
        stateListDrawable.addState(new int[]{16842912}, A0A.A05(context, 23, 9));
        stateListDrawable.addState(new int[]{-16842912}, AnonymousClass2E0.A0A().A05(context, 24, 36));
        return stateListDrawable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QAP(Context context) {
        super(new ContextThemeWrapper(context, R.style.FbPayUICheckbox), (AttributeSet) null);
        AnonymousClass2E0.A0A();
        SRn.A02(this, RH2.A0D);
        setCheckMarkDrawable(getCheckBoxDrawable());
    }

    public void setEnabled(boolean z) {
        setClickable(z);
        float f = 0.3f;
        if (z) {
            f = 1.0f;
        }
        setAlpha(f);
    }
}
