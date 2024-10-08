package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.OFd  reason: case insensitive filesystem */
public final class C70656OFd {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C70656OFd(Context context, String str) {
        String A0e = AnonymousClass7TF.A0e(context.getResources(), str, 2131972869);
        0qQ.A07(A0e);
        this.A02 = A0e;
        String A0e2 = AnonymousClass7TF.A0e(context.getResources(), str, 2131972869);
        0qQ.A07(A0e2);
        this.A03 = A0e2;
        this.A00 = DbU.A01(context);
        this.A01 = context.getColor(R.color.grey_5);
    }
}
