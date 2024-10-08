package X;

import java.util.List;

/* renamed from: X.79s  reason: invalid class name and case insensitive filesystem */
public final class C3271779s {
    public int A00;
    public int A01;
    public List A02 = 0sn.A00;
    public final String A03;
    public final /* synthetic */ AnonymousClass76O A04;

    public final void A00(CharSequence charSequence) {
        List A0R = 00l.A0R(charSequence, new String[]{" "}, 0);
        this.A02 = A0R;
        if (A0R.size() < this.A01) {
            this.A01 = this.A02.size() - 1;
        }
        this.A00 = Math.max(1, (int) ((float) Math.floor((double) (((float) (this.A02.size() - this.A01)) * 0.1f))));
    }

    public C3271779s(AnonymousClass76O r2, String str, int i) {
        this.A04 = r2;
        this.A03 = str;
        this.A01 = i;
        this.A00 = 1;
    }
}
