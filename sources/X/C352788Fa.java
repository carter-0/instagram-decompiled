package X;

import androidx.constraintlayout.widget.Guideline;

/* renamed from: X.8Fa  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C352788Fa implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8FU A00;

    public /* synthetic */ C352788Fa(AnonymousClass8FU r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        Guideline guideline = this.A00.A04;
        float f = 1.0f;
        if (obj == AnonymousClass88T.TABLE_TOP) {
            f = 0.5f;
        }
        guideline.setGuidelinePercent(f);
    }
}
