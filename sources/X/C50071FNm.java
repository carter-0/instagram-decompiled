package X;

import android.view.View;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.FNm  reason: case insensitive filesystem */
public final class C50071FNm implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    public C50071FNm(Object obj, String str, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = z;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        if (this.A00 != 0) {
            A05 = AnonymousClass0fD.A05(-1215921617);
            2YL r4 = (2YL) this.A01;
            UserMonetizationProductType userMonetizationProductType = UserMonetizationProductType.USER_PAY;
            String str = this.A02;
            boolean z = this.A03;
            0qQ.A0B(str, 1);
            AnonymousClass7TE.A1Z(new MFh(r4, userMonetizationProductType, str, (AnonymousClass4D7) null, 5, z), C318116oQ.A00(r4));
            i = -898055359;
        } else {
            A05 = AnonymousClass0fD.A05(-1918578460);
            AnonymousClass70J r42 = (AnonymousClass70J) this.A01;
            0qQ.A0A(view);
            String str2 = this.A02;
            boolean z2 = this.A03;
            0qQ.A0B(view, 0);
            if (z2) {
                new C319316qO(r42.A05).onClick(view);
            } else {
                C49070Eoo.A00(r42.A03, r42.A01, str2);
            }
            i = -1190158428;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
