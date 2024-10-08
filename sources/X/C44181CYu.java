package X;

import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CYu  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44181CYu {
    public static Map A00(DTE dte) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str = null;
        if (dte.Axn() != null) {
            List<DTF> Axn = dte.Axn();
            if (Axn != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DTF dtf : Axn) {
                    if (dtf != null) {
                        arrayList.add(dtf.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("disclaimerBodyRanges", arrayList);
        }
        if (dte.Axp() != null) {
            A1H.put("disclaimerText", dte.Axp());
        }
        if (dte.B0e() != null) {
            IGPostClickEligibleExperienceTypes B0e = dte.B0e();
            if (B0e != null) {
                str = B0e.A00;
            }
            A1H.put("eligibleExperienceType", str);
        }
        return 0Yt.A0B(A1H);
    }
}
