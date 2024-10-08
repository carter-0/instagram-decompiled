package X;

import android.view.View;
import com.instagram.profile.intf.UserDetailEntryInfo;

/* renamed from: X.6pI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C318646pI implements View.OnLongClickListener {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass710 A01;
    public final /* synthetic */ UserDetailEntryInfo A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ C318646pI(1Xj r1, AnonymousClass710 r2, UserDetailEntryInfo userDetailEntryInfo, String str, String str2, String str3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = userDetailEntryInfo;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass710 r0 = this.A01;
        1Xj r1 = this.A00;
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A05;
        UserDetailEntryInfo userDetailEntryInfo = this.A02;
        if (r0 == null) {
            return false;
        }
        r0.DPC(r1, userDetailEntryInfo, str, str2, str3);
        return true;
    }
}
