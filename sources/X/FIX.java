package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FIX implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;
    public final /* synthetic */ String A03;

    public FIX(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r3, String str) {
        this.A03 = str;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String A0g = 002.A0g("fb://shops_product_details/?productID=", this.A03, "&refID=0&refType=0");
        FFi.A01(this.A00, this.A02, this.A01, "ig_product_wishlist", (String) null, A0g);
    }
}
