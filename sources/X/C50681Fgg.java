package X;

import android.content.Context;
import com.instagram.model.business.ProfileAddressData;

/* renamed from: X.Fgg  reason: case insensitive filesystem */
public final class C50681Fgg implements G7J {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ProfileAddressData A01;
    public final /* synthetic */ C50672FgX A02;
    public final /* synthetic */ String A03;

    public C50681Fgg(Context context, ProfileAddressData profileAddressData, C50672FgX fgX, String str) {
        this.A00 = context;
        this.A01 = profileAddressData;
        this.A03 = str;
        this.A02 = fgX;
    }

    public final void DVM() {
        Context context = this.A00;
        ProfileAddressData profileAddressData = this.A01;
        FFS.A03(context, profileAddressData.A03, profileAddressData.A05, profileAddressData.A08);
    }

    public final void Dz7() {
        C50672FgX.A05(this.A02, this.A03, "profile_multiple_addresses_bottomsheet");
    }
}
