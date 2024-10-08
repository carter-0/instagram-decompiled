package X;

import android.widget.TextView;

/* renamed from: X.4FB  reason: invalid class name */
public final class AnonymousClass4FB implements AnonymousClass2WK {
    public final 2WU A00;
    public final CharSequence A01;
    public final Float A02;
    public final Float A03;

    public AnonymousClass4FB(2WU r2, CharSequence charSequence, Float f, Float f2) {
        0qQ.A0B(charSequence, 1);
        0qQ.A0B(r2, 4);
        this.A01 = charSequence;
        this.A03 = f;
        this.A02 = f2;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        0qQ.A0B(obj, 1);
        return C245173cR.A03(this, obj);
    }

    public final 2WL Cfk(2WI r5, long j) {
        0qQ.A0B(r5, 0);
        TextView textView = (TextView) this.A00.A00(r5.A00.A04);
        textView.setText(this.A01);
        Float f = this.A03;
        if (f != null) {
            textView.setTextSize(0, f.floatValue());
        }
        Float f2 = this.A02;
        if (f2 != null) {
            textView.setLineSpacing(textView.getLineSpacingExtra(), f2.floatValue());
        }
        textView.measure(C245063cG.A01(j), C245063cG.A00(j));
        return new 2WL(C245133cN.A00(Math.max(C245073cH.A03(j), textView.getMeasuredWidth()), Math.max(C245073cH.A02(j), textView.getMeasuredHeight())), (Object) null);
    }
}
