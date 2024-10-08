package X;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: X.Sbt  reason: case insensitive filesystem */
public final class C11532Sbt implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ CompoundButton A01;
    public final /* synthetic */ 2Fk A02;
    public final /* synthetic */ QCG A03;

    public C11532Sbt(View.OnClickListener onClickListener, CompoundButton compoundButton, 2Fk r3, QCG qcg) {
        this.A03 = qcg;
        this.A02 = r3;
        this.A01 = compoundButton;
        this.A00 = onClickListener;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CompoundButton compoundButton2;
        boolean z2;
        SUj A0W = Pxe.A0W(this.A02);
        if (SUj.A0V(A0W)) {
            compoundButton2 = this.A01;
            z2 = AnonymousClass7TE.A0v().equals(A0W.A01);
        } else {
            if (SUj.A0S(A0W)) {
                compoundButton2 = this.A01;
                z2 = false;
            }
            this.A00.onClick(compoundButton);
        }
        compoundButton2.setChecked(z2);
        this.A00.onClick(compoundButton);
    }
}
