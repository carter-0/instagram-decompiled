package X;

import android.content.Intent;
import com.instagram.opal.impl.data.OpalProfileData;
import java.util.List;

/* renamed from: X.Ffy  reason: case insensitive filesystem */
public final class C50639Ffy implements G80 {
    public final /* synthetic */ EO1 A00;

    public final void ETo(boolean z) {
        this.A00.A08(true);
    }

    public final void EhB(String str) {
        Object value;
        C61084JwM jwM;
        05G r3 = ((C46756Dkj) this.A00.A02.getValue()).A04;
        do {
            value = r3.getValue();
            jwM = (C61084JwM) value;
        } while (!Dbb.A1X(jwM, OpalProfileData.A00((OpalProfileData) jwM.A01, (C62520KhB) null, (String) null, (String) null, (String) null, str, (String) null, (List) null, 0, 8095, false, false), value, r3));
    }

    public C50639Ffy(EO1 eo1) {
        this.A00 = eo1;
    }

    public final void Cfb(Intent intent, int i) {
        0kR.A05(this.A00, intent, i);
    }

    public final void Epm() {
        Object value;
        C61084JwM jwM;
        C46756Dkj dkj = (C46756Dkj) this.A00.A02.getValue();
        05G r3 = dkj.A04;
        do {
            value = r3.getValue();
            jwM = (C61084JwM) value;
        } while (!Dbb.A1X(jwM, OpalProfileData.A00((OpalProfileData) jwM.A01, (C62520KhB) null, (String) null, (String) null, (String) null, DbU.A0p(dkj.A03), (String) null, (List) null, 0, 8095, true, false), value, r3));
    }
}
