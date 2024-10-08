package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebookpay.form.view.BaseAutoCompleteTextView;
import com.instagram.android.R;

/* renamed from: X.QgH  reason: case insensitive filesystem */
public final class C8065QgH extends C8609Qxq implements C13601TdT {
    public C298455tS A00;
    public final View.OnClickListener A01 = C11496SbJ.A00(this, 3);
    public final C11649Sdr A02 = C11649Sdr.A00(this, 59);

    public void setViewModel(C298455tS r7) {
        0qQ.A0B(r7, 0);
        this.A00 = r7;
        this.A06 = r7.A04;
        setDescendantFocusability(393216);
        BaseAutoCompleteTextView inputText = getInputText();
        View.OnClickListener onClickListener = this.A01;
        inputText.setOnClickListener(onClickListener);
        getInputText().setLongClickable(false);
        AnonymousClass2E0.A0A();
        Context A0S = AnonymousClass7TE.A0S(this);
        0qQ.A0B(A0S, 0);
        Drawable drawable = A0S.getDrawable(Pxj.A0J(A0S, R.attr.fbpay_input_field_right_chevron).resourceId);
        if (drawable != null) {
            AnonymousClass2E0.A0A();
            DbU.A10(A0S, drawable, R.color.igds_secondary_icon);
            A0V(drawable, onClickListener, Integer.valueOf(R.dimen.abc_select_dialog_padding_start_material));
            setHint((CharSequence) getExistingLabel());
            C298455tS r0 = this.A00;
            if (r0 != null) {
                setId(r0.A03);
                C18674VwX.A01(getInputText(), AnonymousClass05K.A0N, (String) null);
                getIcon().setImportantForAccessibility(2);
                getInputText().setImportantForAutofill(2);
                getInputText().A01 = 0;
                C298455tS r02 = this.A00;
                if (r02 != null) {
                    if (r02.A04) {
                        A0U();
                        int A002 = (int) C9676Reu.A00(A0S, R.attr.fbpay_condensed_input_field_vertical_padding);
                        int A003 = (int) C9676Reu.A00(A0S, R.attr.fbpay_condensed_input_field_horizontal_padding);
                        setPadding(A003, A002, A003, A002);
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    /* access modifiers changed from: private */
    public final String getExistingLabel() {
        C298455tS r2 = this.A00;
        if (r2 == null) {
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = r2.A01;
        if (i != 0) {
            return getContext().getString(i);
        }
        return r2.A03;
    }

    public C8065QgH(Context context) {
        super(context);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-1654133525);
        super.onAttachedToWindow();
        C298455tS r0 = this.A00;
        if (r0 == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A05.A09(this.A02);
        AnonymousClass0fD.A0D(-387456190, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(1890333737);
        super.onDetachedFromWindow();
        C298455tS r0 = this.A00;
        if (r0 == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A05.A08(this.A02);
        AnonymousClass0fD.A0D(786468615, A06);
    }
}
