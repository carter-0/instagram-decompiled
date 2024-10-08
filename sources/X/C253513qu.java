package X;

import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.util.List;
import java.util.Map;

/* renamed from: X.3qu  reason: invalid class name and case insensitive filesystem */
public abstract class C253513qu {
    public long A00() {
        return ((C253533qw) this).A09;
    }

    public String A02() {
        return ((C253533qw) this).A0C;
    }

    public String A03() {
        return ((C253533qw) this).A0D;
    }

    public abstract String A04();

    public ParcelableSignalData A01() {
        C253533qw r3 = (C253533qw) this;
        String str = r3.A0E;
        C230472pg r8 = r3.A0B;
        String str2 = r3.A0G;
        String str3 = r3.A0F;
        Long valueOf = Long.valueOf(r3.A0A);
        Long valueOf2 = Long.valueOf(r3.A09);
        Float valueOf3 = Float.valueOf(r3.A00);
        String str4 = r3.A0C;
        String str5 = r3.A0D;
        return new ParcelableSignalData(r8, (Boolean) null, (Boolean) null, valueOf3, Integer.valueOf(r3.A06), Integer.valueOf(r3.A03), Integer.valueOf(r3.A04), Integer.valueOf(r3.A02), Integer.valueOf(r3.A08), Integer.valueOf(r3.A01), Integer.valueOf(r3.A07), Integer.valueOf(r3.A05), (Integer) null, valueOf, valueOf2, (Long) null, (Long) null, (Long) null, (Long) null, str, str2, str3, str4, str5, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, r3.A0H, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Map) null);
    }
}
