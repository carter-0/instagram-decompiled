package X;

import android.content.Context;
import android.util.AttributeSet;
import com.facebookpay.form.view.FormLayout;

/* renamed from: X.QgJ  reason: case insensitive filesystem */
public final class C8067QgJ extends FormLayout implements C13601TdT {
    public C298475tU A00;
    public final AnonymousClass2gO A01 = C11649Sdr.A00(this, 57);

    public C8067QgJ(Context context) {
        super(context, (AttributeSet) null);
    }

    public C298475tU getViewModel() {
        return this.A00;
    }

    public void setViewModel(C298475tU r3) {
        this.A00 = r3;
        r3.A03.A09(this.A01);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-2054195638);
        super.onAttachedToWindow();
        AnonymousClass0fD.A0D(15793888, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(1917710127);
        super.onDetachedFromWindow();
        this.A00.A03.A08(this.A01);
        AnonymousClass0fD.A0D(-610178429, A06);
    }
}
