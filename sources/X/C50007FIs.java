package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.user.model.User;

/* renamed from: X.FIs  reason: case insensitive filesystem */
public final class C50007FIs implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ G88 A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ AnonymousClass3UM A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ CharSequence[] A06;

    public C50007FIs(Context context, G88 g88, User user, AnonymousClass3UM r4, String str, CharSequence[] charSequenceArr, int i) {
        this.A06 = charSequenceArr;
        this.A01 = context;
        this.A02 = g88;
        this.A03 = user;
        this.A04 = r4;
        this.A00 = i;
        this.A05 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        if (0qQ.A0K(this.A06[i], this.A01.getString(2131960866))) {
            G88 g88 = this.A02;
            Integer Auv = g88.Auv(this.A03.getId());
            AnonymousClass3UM r2 = this.A04;
            if (Auv != null) {
                i2 = Auv.intValue();
            } else {
                i2 = this.A00;
            }
            g88.D9T(r2, this.A05, i2);
        }
    }
}
