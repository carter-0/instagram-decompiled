package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.Gd4  reason: case insensitive filesystem */
public final class C52812Gd4 extends SpannableStringBuilder {
    public final /* synthetic */ C52811Gd3 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52812Gd4(C52811Gd3 gd3, CharSequence charSequence) {
        super(charSequence);
        this.A00 = gd3;
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        Object obj2;
        try {
            if (HSO.A00(obj) && 2Sa.useSafeSpanEndInTextInputSpec) {
                i2 = Math.min(i2, length());
            }
            super.setSpan(obj, i, i2, i3);
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            if (obj != null) {
                obj2 = obj.getClass();
            } else {
                obj2 = "Unknown";
            }
            throw new IndexOutOfBoundsException(String.format("%s | span=%s | flags=%d", new Object[]{message, obj2, Integer.valueOf(i3)}));
        }
    }
}
