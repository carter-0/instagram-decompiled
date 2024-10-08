package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.OfC  reason: case insensitive filesystem */
public final class C71191OfC implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C71191OfC(UserSession userSession, String str, String str2, int i, int i2) {
        this.A02 = userSession;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C71094OcU.A04(this.A02, this.A03, this.A04, this.A00, this.A01);
        dialogInterface.dismiss();
    }
}
