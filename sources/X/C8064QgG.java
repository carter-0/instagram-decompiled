package X;

import android.content.Context;
import com.facebookpay.form.view.BaseAutoCompleteTextView;

/* renamed from: X.QgG  reason: case insensitive filesystem */
public final class C8064QgG extends C8609Qxq implements C13601TdT {
    public C8035Qff A00;
    public final C11649Sdr A01 = C11649Sdr.A00(this, 60);

    public void setViewModel(C8035Qff qff) {
        0qQ.A0B(qff, 0);
        this.A00 = qff;
        setHint((CharSequence) getResources().getString(qff.A00));
        BaseAutoCompleteTextView inputText = getInputText();
        C8035Qff qff2 = this.A00;
        if (qff2 == null) {
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        inputText.setText(qff2.A02[0]);
        setDescendantFocusability(393216);
        getInputText().setOnClickListener(C11496SbJ.A00(this, 4));
        getInputText().setLongClickable(false);
    }

    /* access modifiers changed from: private */
    public final String[] getOptions() {
        C8035Qff qff = this.A00;
        if (qff == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        int[] iArr = qff.A02;
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = getResources().getString(iArr[i]);
        }
        return strArr;
    }

    public C8064QgG(Context context) {
        super(context);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-1395454848);
        super.onAttachedToWindow();
        C8035Qff qff = this.A00;
        if (qff == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        qff.A05.A09(this.A01);
        AnonymousClass0fD.A0D(447354695, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(1144223234);
        super.onDetachedFromWindow();
        C8035Qff qff = this.A00;
        if (qff == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        qff.A05.A08(this.A01);
        AnonymousClass0fD.A0D(-1547237695, A06);
    }
}
