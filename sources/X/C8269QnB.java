package X;

import android.os.Bundle;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import java.util.Set;

/* renamed from: X.QnB  reason: case insensitive filesystem */
public class C8269QnB extends QD7 {
    public 2Fk A00;
    public 2Fk A01;
    public 2Fk A02;
    public AddressFormFieldsConfig A03;
    public FBPayLoggerData A04;
    public FbPayNewCreditCardOption A05;
    public S2Q A06;
    public S2S A07;
    public String A08;
    public final AnonymousClass2Fj A09 = JTO.A0K();
    public final AnonymousClass2Fj A0A = JTO.A0K();
    public final AnonymousClass2Fj A0B = JTO.A0K();
    public final AnonymousClass2gO A0C = C11652Sdu.A00(this, 70);
    public final AnonymousClass2gO A0D = new C11651Sdt(this, 0);
    public final 2FO A0E;
    public final Set A0F = AnonymousClass7TE.A1F();
    public final Set A0G = AnonymousClass7TE.A1F();
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public final void onCleared() {
        2Fk r1 = this.A00;
        if (r1 != null) {
            r1.A08(this.A0C);
        }
    }

    public C8269QnB(2FO r6, S2Q s2q, S2S s2s, String str, REG[] regArr, boolean z, boolean z2, boolean z3) {
        for (REG add : regArr) {
            this.A0G.add(add);
        }
        this.A0H = z;
        this.A0I = z2;
        this.A0J = z3;
        this.A06 = s2q;
        this.A07 = s2s;
        this.A0E = r6;
        AnonymousClass2gB r2 = s2q.A03;
        s2q.A00(this.A0G);
        this.A01 = AnonymousClass72Y.A01(r2, new TPK(str, this, 0));
        C11651Sdt.A02(r2, this.A03, this, 1);
    }

    public final void A04(Bundle bundle) {
        super.A04(bundle);
        this.A04 = Pxj.A0Y(bundle);
    }
}
