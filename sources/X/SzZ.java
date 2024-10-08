package X;

import com.facebook.wifiscan.parcelable.ParcelableWifiScanResult;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

public final class SzZ implements AnonymousClass2hV {
    public final int A00;

    public SzZ(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r4v14, types: [java.lang.Object, X.RQi] */
    public final Object apply(Object obj) {
        ImmutableList A01;
        Object obj2 = obj;
        switch (this.A00) {
            case 1:
            case 2:
                C10726Rx4 rx4 = (C10726Rx4) obj2;
                if (rx4 == null) {
                    return null;
                }
                long j = rx4.A01;
                long j2 = rx4.A02;
                return new C10726Rx4(rx4.A03, rx4.A04, rx4.A00, j, j2);
            case 3:
            case 4:
                RQi rQi = (RQi) obj2;
                if (rQi == null) {
                    return null;
                }
                String str = rQi.A01;
                String str2 = rQi.A03;
                String str3 = rQi.A02;
                Integer num = rQi.A00;
                ? obj3 = new Object();
                obj3.A01 = str;
                obj3.A03 = str2;
                obj3.A02 = str3;
                obj3.A00 = num;
                return obj3;
            case 5:
            case 6:
                C10546Ru0 ru0 = (C10546Ru0) obj2;
                if (ru0 == null) {
                    return null;
                }
                List list = ru0.A02;
                if (list == null) {
                    A01 = null;
                } else {
                    A01 = PzX.A01(PzX.A00(list), 7);
                }
                return new C10546Ru0(A01, ru0.A01, ru0.A00);
            case 7:
                C10400Rrc rrc = (C10400Rrc) obj2;
                if (rrc != null) {
                    return new C10400Rrc(rrc.A01, rrc.A00);
                }
                return null;
            case 8:
                return ParcelableWifiScanResult.A00((C11379SQr) obj2);
            case 9:
                C11379SQr sQr = (C11379SQr) obj2;
                if (sQr == null) {
                    return null;
                }
                long j3 = sQr.A03;
                String str4 = sQr.A07;
                int i = sQr.A02;
                String str5 = sQr.A08;
                return new C11379SQr(sQr.A04, sQr.A00, sQr.A05, sQr.A06, str4, str5, sQr.A09, sQr.A0A, sQr.A0B, i, j3);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                obj2 = (Throwable) obj2;
                Object obj4 = obj2;
                if (obj2 instanceof C16693V1w) {
                    C249803kO A0J = C66580MXl.A0J(((C16693V1w) obj4).A00);
                    while (A0J.hasNext()) {
                        C13802ThL thL = (C13802ThL) AnonymousClass7TF.A0a(A0J);
                        if (thL.getDescription() != null && thL.C2w() != null) {
                            int AoV = thL.AoV();
                            String C2w = thL.C2w();
                            0qQ.A0A(C2w);
                            String description = thL.getDescription();
                            0qQ.A0A(description);
                            return C9677Rev.A00(C2w, description, AoV);
                        }
                    }
                    break;
                }
                break;
        }
        return obj2;
    }
}
