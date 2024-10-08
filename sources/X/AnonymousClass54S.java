package X;

import com.instagram.feed.ui.text.BulletAwareTextView;

/* renamed from: X.54S  reason: invalid class name */
public final class AnonymousClass54S implements AnonymousClass2WK {
    public final 2WU A00;
    public final Boolean A01;
    public final CharSequence A02;
    public final Float A03;
    public final Integer A04;
    public final Integer A05;

    public AnonymousClass54S(2WU r2, Boolean bool, CharSequence charSequence, Float f, Integer num, Integer num2) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(charSequence, 2);
        this.A00 = r2;
        this.A02 = charSequence;
        this.A03 = f;
        this.A01 = bool;
        this.A05 = num;
        this.A04 = num2;
    }

    public final 2WL Cfk(2WI r6, long j) {
        0qQ.A0B(r6, 0);
        BulletAwareTextView bulletAwareTextView = (BulletAwareTextView) this.A00.A00(r6.A00.A04);
        Float f = this.A03;
        int i = 0;
        if (f != null) {
            bulletAwareTextView.setTextSize(0, f.floatValue());
        }
        Boolean bool = this.A01;
        if (bool != null) {
            bulletAwareTextView.setIncludeFontPadding(bool.booleanValue());
        }
        Integer num = this.A05;
        if (num != null) {
            bulletAwareTextView.setSpacingAdd(num.intValue());
        }
        bulletAwareTextView.setText(this.A02);
        bulletAwareTextView.measure(C245063cG.A01(j), C245063cG.A00(j));
        int measuredWidth = bulletAwareTextView.getMeasuredWidth();
        Integer num2 = this.A04;
        if (num2 != null) {
            i = num2.intValue();
        }
        bulletAwareTextView.setMinWidth(measuredWidth + i);
        bulletAwareTextView.measure(C245063cG.A01(j), C245063cG.A00(j));
        return new 2WL(C245133cN.A00(Math.max(C245073cH.A03(j), bulletAwareTextView.getMeasuredWidth()), Math.max(C245073cH.A02(j), bulletAwareTextView.getMeasuredHeight())), (Object) null);
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return HSX.A00(this, (AnonymousClass2WK) obj);
    }
}
