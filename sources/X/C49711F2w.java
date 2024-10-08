package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.F2w  reason: case insensitive filesystem */
public final class C49711F2w {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ 1P0 A02;
    public final /* synthetic */ G7Y A03;
    public final /* synthetic */ FGL A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    public C49711F2w(Activity activity, FragmentActivity fragmentActivity, 1P0 r3, G7Y g7y, FGL fgl, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = activity;
        this.A07 = z;
        this.A04 = fgl;
        this.A09 = z2;
        this.A08 = z3;
        this.A05 = str;
        this.A02 = r3;
        this.A01 = fragmentActivity;
        this.A0A = z4;
        this.A03 = g7y;
        this.A0C = z5;
        this.A0B = z6;
        this.A06 = str2;
    }

    public final void A00(String str, boolean z, boolean z2) {
        Activity activity = this.A00;
        FGL fgl = this.A04;
        boolean z3 = this.A07;
        boolean z4 = this.A09;
        boolean z5 = this.A08;
        String str2 = this.A05;
        1P0 r5 = this.A02;
        FragmentActivity fragmentActivity = this.A01;
        boolean z6 = this.A0A;
        G7Y g7y = this.A03;
        boolean z7 = this.A0C;
        String str3 = str;
        if (1DL.A04(activity, new C50311FXq(activity, fragmentActivity, r5, g7y, fgl, str3, str2, this.A06, z3, z4, z5, z6, z, z7, z2, this.A0B), new String[]{"android.permission.READ_CONTACTS", "android.permission.GET_ACCOUNTS"}) && !z3) {
            fgl.A03.A04(AnonymousClass05K.A00, str3, z4);
        }
    }
}
