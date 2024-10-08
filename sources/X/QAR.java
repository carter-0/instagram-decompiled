package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.instagram.android.R;

public final class QAR extends SwitchCompat implements C13601TdT {
    public C8032Qfc A00;
    public final CompoundButton.OnCheckedChangeListener A01 = new C11531Sbs(this, 5);

    public void setViewModel(C8032Qfc qfc) {
        this.A00 = qfc;
        Object A0A = SRc.A0A(qfc);
        A0A.getClass();
        setChecked(AnonymousClass7TE.A1a(A0A));
        setEnabled(this.A00.A08);
        setText(this.A00.A00);
        setTextColor(AnonymousClass2E0.A0A().A03(getContext(), 0));
        setOnCheckedChangeListener(this.A01);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QAR(Context context) {
        super(new ContextThemeWrapper(context, R.style.Switch));
        AnonymousClass2E0.A0E();
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
