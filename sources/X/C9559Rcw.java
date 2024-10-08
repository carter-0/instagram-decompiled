package X;

import org.json.JSONObject;

/* renamed from: X.Rcw  reason: case insensitive filesystem */
public abstract class C9559Rcw {
    public static JSONObject A00(C10675RwE rwE, C7862Qbm qbm, C7866Qbq qbq, C7863Qbn qbn, C7864Qbo qbo, C7865Qbp qbp, C7867Qbr qbr, C7868Qbs qbs, boolean z, boolean z2) {
        JSONObject A11 = DbS.A11();
        A11.putOpt(qbn.A00, qbn.A02(z2));
        if (qbp != null) {
            A11.putOpt(qbp.A00, qbp.A02(z2));
        }
        if (qbm != null) {
            A11.putOpt(qbm.A00, qbm.A02(z2));
        }
        if (qbo != null) {
            A11.putOpt(qbo.A00, qbo.A02(z2));
        }
        if (rwE != null) {
            JSONObject A112 = DbS.A11();
            A112.putOpt("ssr", rwE.A03);
            A112.putOpt("mcd", Long.valueOf(rwE.A00));
            A112.putOpt("mfcl", Long.valueOf(rwE.A02));
            A112.putOpt("mcg", Long.valueOf(rwE.A01));
            A11.putOpt("ss", A112);
        }
        if (qbq != null) {
            A11.putOpt(qbq.A03, qbq.A02(z));
        }
        if (qbs != null) {
            A11.putOpt(qbs.A03, qbs.A02(z));
        }
        if (qbr != null) {
            A11.putOpt(qbr.A03, qbr.A02(z));
        }
        return A11;
    }
}
