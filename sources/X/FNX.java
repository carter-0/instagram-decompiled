package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class FNX implements View.OnClickListener {
    public final /* synthetic */ C230212pD A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;

    public FNX(C230212pD r1, Object obj, Object obj2) {
        this.A00 = r1;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        String str;
        C231332rR r1;
        int A05 = AnonymousClass0fD.A05(-449361029);
        C230212pD r8 = this.A00;
        AnonymousClass5GH r4 = (AnonymousClass5GH) this.A02;
        AnonymousClass5GJ r0 = (AnonymousClass5GJ) this.A01;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, r0);
        r0.A08 = false;
        Integer num = r4.A08;
        if (num != null) {
            int intValue = num.intValue();
            C231272rL adapter = r8.A03.getAdapter();
            if ((adapter instanceof C231332rR) && (r1 = (C231332rR) adapter) != null) {
                r1.EDl(intValue);
            }
        }
        C275464qK r2 = r4.A00;
        String id = r2.getId();
        C275454qJ r12 = r2.A00;
        Integer num2 = r12.A05;
        if (num2 == null || (str = num2.toString()) == null) {
            str = r2.A01.toString();
        }
        String str2 = r12.A0A;
        0qQ.A0B(id, 0);
        0qQ.A0B(str, A1U ? 1 : 0);
        C230252pH r22 = r8.A07;
        C227812jx r13 = r8.A03;
        0qQ.A0B(r13, 3);
        r22.A05.add(id);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r13, r22.A02), C273654mx.A00(308));
        if (A0e.isSampled()) {
            A0e.AAJ("netego_id", id);
            A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            A0e.AAJ("tracking_token", str2);
            A0e.Cgf();
        }
        AnonymousClass0fD.A0C(-2048584245, A05);
    }
}
