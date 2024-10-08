package X;

import android.content.DialogInterface;
import com.instagram.user.model.User;

/* renamed from: X.FHa  reason: case insensitive filesystem */
public final class C49967FHa implements DialogInterface.OnCancelListener {
    public final /* synthetic */ 0wc A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C49967FHa(0wc r1, User user, String str, String str2, String str3) {
        this.A00 = r1;
        this.A01 = user;
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        AnonymousClass73V.A0B(this.A00, this.A01, "approval_page_cancel", this.A02, this.A04, this.A03);
    }
}
