package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import java.util.List;
import java.util.Map;

/* renamed from: X.94f  reason: invalid class name and case insensitive filesystem */
public final class C3731594f implements C258913zq {
    public final C2604745u A00;

    public C3731594f(C2604745u r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass40G CL1(String str, long j) {
        return new AnonymousClass40G(true, (String) null, true);
    }

    public final List E6O(String str) {
        0qQ.A0B(str, 0);
        return 00l.A0R(this.A00.A01(002.A0R(str, "_exampleIds")), new String[]{","}, 0);
    }

    public final AnonymousClass40G EJD(String str) {
        long A002 = this.A00.A00(002.A0T(str, AnonymousClass000.A00(773), '_'), -1);
        if (A002 == -1) {
            return new AnonymousClass40G(-1L, AnonymousClass000.A00(3488), false);
        }
        return new AnonymousClass40G(Long.valueOf(A002), (String) null, true);
    }

    public final void EyZ(String str, List list) {
        0qQ.A0B(str, 0);
        this.A00.A06(002.A0R(str, "_exampleIds"), 00k.A0P(", ", "", "", list, C41687Aye.A00));
    }

    public final void Eya(Example example, String str, long j) {
    }

    public final AnonymousClass40G E6N(Long l, String str) {
        return new AnonymousClass40G(Example.A03, "to be implemented", false);
    }

    public final void EyX(Example example, String str, long j) {
        C2604745u r4 = this.A00;
        r4.A05(002.A0T(str, AnonymousClass000.A00(773), '_'), j);
        for (Map.Entry entry : example.A02.entrySet()) {
            String str2 = (String) entry.getKey();
            FeatureData featureData = (FeatureData) entry.getValue();
            Type type = featureData.A02;
            if (type == Type.LONG) {
                r4.A05(str2, featureData.A01);
            } else if (type == Type.DOUBLE) {
                r4.A04(str2, (float) featureData.A00);
            }
        }
    }
}
