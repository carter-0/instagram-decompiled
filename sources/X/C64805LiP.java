package X;

import android.view.View;

/* renamed from: X.LiP  reason: case insensitive filesystem */
public final class C64805LiP implements C232262tL {
    public final int A00;
    public final View.OnClickListener A01;
    public final CharSequence A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 002.A0R("postlive_to_facebook", this.A04);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64805LiP liP = (C64805LiP) obj;
        0qQ.A0B(liP, 0);
        if (!2PP.A00(this.A04, liP.A04) || !2PP.A00(this.A03, liP.A03) || !2PP.A00(this.A02, liP.A02) || !2PP.A00(this.A01, liP.A01) || !2PP.A00(Boolean.valueOf(this.A05), Boolean.valueOf(liP.A05)) || !2PP.A00(Integer.valueOf(this.A00), Integer.valueOf(liP.A00))) {
            return false;
        }
        return true;
    }

    public C64805LiP(View.OnClickListener onClickListener, CharSequence charSequence, String str, String str2, int i, boolean z) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = charSequence;
        this.A01 = onClickListener;
        this.A05 = z;
        this.A00 = i;
    }
}
