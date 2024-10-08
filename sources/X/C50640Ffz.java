package X;

import android.content.Intent;
import com.instagram.opal.impl.data.OpalProfileData;
import java.util.List;

/* renamed from: X.Ffz  reason: case insensitive filesystem */
public final class C50640Ffz implements G80 {
    public final /* synthetic */ EO2 A00;

    public final void Cfb(Intent intent, int i) {
        EO2 eo2 = this.A00;
        eo2.A09 = false;
        0kR.A07(eo2.requireActivity(), intent, 68683);
    }

    public final void ETo(boolean z) {
        this.A00.A08(true);
    }

    public C50640Ffz(EO2 eo2) {
        this.A00 = eo2;
    }

    public final void EhB(String str) {
        EO2.A00(this.A00).A05(str);
    }

    public final void Epm() {
        Object value;
        C47183Dry dry;
        C46789DlJ A002 = EO2.A00(this.A00);
        05G r3 = A002.A05;
        do {
            value = r3.getValue();
            dry = (C47183Dry) value;
        } while (!r3.AIY(value, C47183Dry.A00((C61052Jvq) null, OpalProfileData.A00(dry.A05, (C62520KhB) null, (String) null, (String) null, (String) null, DbU.A0p(A002.A04), (String) null, (List) null, 0, 8095, true, false), (OpalProfileData) null, (C62520KhB) null, dry, (Integer) null, 0, 2046, false, false)));
    }
}
