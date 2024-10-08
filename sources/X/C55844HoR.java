package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.HoR  reason: case insensitive filesystem */
public final class C55844HoR {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass7L2 A06;

    public C55844HoR(Context context, AnonymousClass7L2 r7) {
        0qQ.A0B(r7, 2);
        this.A06 = r7;
        int A0F = 2Yu.A0F(context, R.attr.messageFromOthersGrayBackground);
        this.A01 = A0F;
        int A0F2 = 2Yu.A0F(context, R.attr.igds_color_separator);
        int i = r7.A03.A04;
        this.A00 = i;
        this.A04 = r7.A06.A04;
        C329967Kx r1 = r7.A04;
        this.A02 = r1.A0K;
        int i2 = r1.A07;
        this.A03 = i2;
        if (!(i == i2 || i == A0F)) {
            A0F2 = i;
        }
        this.A05 = A0F2;
    }
}
