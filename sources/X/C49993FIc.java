package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.FIc  reason: case insensitive filesystem */
public final class C49993FIc implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C49993FIc(Context context, String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A00 = context;
        this.A04 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String A0R;
        boolean equals = this.A02.equals("get-directions");
        Context context = this.A00;
        String str = this.A04;
        String str2 = this.A01;
        String str3 = this.A03;
        if (equals) {
            String str4 = "";
            if (str2 == null) {
                A0R = str4;
            } else {
                A0R = 002.A0R(", ", str2);
            }
            if (str3 != null) {
                str4 = 002.A0R(", ", str3);
            }
            0kR.A0D(context, FFS.A00(context, AnonymousClass05K.A01, 002.A0g(str, A0R, str4)));
            return;
        }
        FFS.A03(context, str, str2, str3);
    }
}
