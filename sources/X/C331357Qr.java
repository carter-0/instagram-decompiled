package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.7Qr  reason: invalid class name and case insensitive filesystem */
public final class C331357Qr extends SpannableStringBuilder {
    public final /* synthetic */ CharSequence A00;

    public final void setSpan(Object obj, int i, int i2, int i3) {
        Object obj2;
        0qQ.A0B(obj, 0);
        try {
            super.setSpan(obj, i, i2, i3);
        } catch (IndexOutOfBoundsException e) {
            0wj r3 = 0wj.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("setSpan out of boundary: start = ");
            sb.append(i);
            sb.append(" end = ");
            sb.append(i2);
            sb.append(" length = ");
            CharSequence charSequence = this.A00;
            if (charSequence != null) {
                obj2 = Integer.valueOf(charSequence.length());
            } else {
                obj2 = "null";
            }
            sb.append(obj2);
            0f9 AEf = r3.AEf(sb.toString(), 245701013);
            AEf.ERJ(e);
            AEf.report();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C331357Qr(CharSequence charSequence) {
        super(charSequence);
        this.A00 = charSequence;
    }

    public final /* bridge */ char charAt(int i) {
        return super.charAt(i);
    }

    public final /* bridge */ int length() {
        return super.length();
    }
}
