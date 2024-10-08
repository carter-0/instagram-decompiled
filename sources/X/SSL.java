package X;

import android.text.TextUtils;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class SSL {
    public final 2FO A00;
    public final C10301Rpz A01;
    public final C10390RrR A02;

    public static QSZ A00(QSU qsu, QSZ qsz, String str, String str2) {
        if (qsz == null) {
            return null;
        }
        C249803kO A0Q = Pxi.A0Q(qsz, QSY.class, "sub_actions", 4, -1899203755);
        while (A0Q.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(A0Q);
            RG6 rg6 = RG6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            if (A0V.getOptionalEnumField(1, "sub_action_type", rg6) != null && ((RG6) A0V.getOptionalEnumField(1, "sub_action_type", rg6)).name().equals(str)) {
                C249803kO it = qsu.A06(QSP.class, "actions", -384450045).iterator();
                while (it.hasNext()) {
                    C7659QSa qSa = (C7659QSa) C41845B3m.A0V(it).reinterpretRequired(0, C7659QSa.class, -687358097);
                    RH4 rh4 = RH4.A02;
                    if (qSa.getOptionalEnumField(0, "action_type", rh4) != null && A0V.getOptionalEnumField(2, "action_type", rh4) != null && ((RH4) qSa.getOptionalEnumField(0, "action_type", rh4)).name().equals(((RH4) A0V.getOptionalEnumField(2, "action_type", rh4)).name())) {
                        return A01(qSa, str2);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static QSZ A01(C7659QSa qSa, String str) {
        C249803kO A0Q = Pxi.A0Q(qSa, QSZ.class, "steps", 2, 650156755);
        while (A0Q.hasNext()) {
            QSZ qsz = (QSZ) A0Q.next();
            RG5 rg5 = RG5.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            if (qsz.getOptionalEnumField(0, "step_type", rg5) != null && ((RG5) qsz.getOptionalEnumField(0, "step_type", rg5)).name().equals(str)) {
                return qsz;
            }
        }
        return null;
    }

    public static String A03(QSZ qsz) {
        C249803kO A0Q = Pxi.A0Q(qsz, QSY.class, "sub_actions", 4, -1899203755);
        while (A0Q.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(A0Q);
            Class<QSX> cls = QSX.class;
            if (A0V.getOptionalTreeField(0, "text", cls, 724782142) != null && !TextUtils.isEmpty(A0V.getOptionalTreeField(0, "text", cls, 724782142).getOptionalStringField(0, "text"))) {
                return A0V.getOptionalTreeField(0, "text", cls, 724782142).getOptionalStringField(0, "text");
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.RRH] */
    public final AnonymousClass2gB A04(RQD rqd, FBPayLoggerData fBPayLoggerData) {
        C10390RrR rrR = this.A02;
        String string = rqd.A00.getString("BUNDLE_KEY_PRIMARY_FLOW_TYPE");
        String string2 = rqd.A00.getString("BUNDLE_KEY_PAYMENT_TYPE");
        ? obj = new Object();
        obj.A00 = string;
        obj.A01 = string2;
        Map map = rrR.A01;
        C7424QCp qCp = (C7424QCp) map.get(obj);
        if (qCp == null) {
            qCp = new C7424QCp(rrR, string, string2);
            map.put(obj, qCp);
        }
        C10634RvT rvT = qCp.A03.A00;
        String str = qCp.A02;
        AnonymousClass7TG.A1N(str, fBPayLoggerData);
        Map map2 = rvT.A02;
        0qQ.A06(map2);
        Object obj2 = map2.get(str);
        if (obj2 == null) {
            obj2 = new SHU(rvT.A00, rvT.A01);
            map2.put(str, obj2);
        }
        ((SHU) obj2).A00(fBPayLoggerData, AnonymousClass05K.A0C, str).A9U(qCp.A00);
        return AnonymousClass72Y.A01(qCp, new TPN(0, this, rqd, fBPayLoggerData));
    }

    public SSL(C10390RrR rrR, 2FO r2, C10301Rpz rpz) {
        this.A02 = rrR;
        this.A01 = rpz;
        this.A00 = r2;
    }

    public static C11232SGr A02(C42187BUi bUi) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        C249803kO A0Q = Pxi.A0Q(bUi, C42186BUh.class, "ranges", 1, -41917707);
        while (A0Q.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(A0Q);
            A1C.add(new SF9(A0V.getCoercedIntField(0, "length"), A0V.getCoercedIntField(1, "offset"), A0V.A09("override_uri")));
        }
        String A07 = bUi.A07("text");
        A07.getClass();
        List unmodifiableList = Collections.unmodifiableList(A1C);
        0qQ.A0B(unmodifiableList, 1);
        return new C11232SGr(A07, unmodifiableList);
    }
}
