package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.8i9  reason: invalid class name and case insensitive filesystem */
public final class C362588i9 implements C232262tL {
    public final SpannableStringBuilder A00;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00.hashCode());
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C362588i9 r3 = (C362588i9) obj;
        0qQ.A0B(r3, 0);
        return 0qQ.A0K(this.A00, r3.A00);
    }

    public C362588i9(SpannableStringBuilder spannableStringBuilder) {
        this.A00 = spannableStringBuilder;
    }
}
