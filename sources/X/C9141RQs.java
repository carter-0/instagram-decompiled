package X;

import java.net.URI;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: X.RQs  reason: case insensitive filesystem */
public abstract class C9141RQs {
    public final void A00(Exception exc, Map map, int i, boolean z) {
        C13794ThC thC;
        String str;
        String str2;
        int i2;
        C13794ThC thC2;
        URI uri;
        JSONObject jSONObject;
        AtomicReference atomicReference;
        STJ stj;
        long A00;
        Integer num;
        String str3;
        Exception exc2 = exc;
        Map map2 = map;
        int i3 = i;
        boolean z2 = z;
        if (this instanceof QN9) {
            QN9 qn9 = (QN9) this;
            AnonymousClass7TF.A1C(exc, 0, map2);
            atomicReference = qn9.A02;
            stj = (STJ) atomicReference.get();
            if (stj != null) {
                qn9.A00.A05.A00(exc);
                A00 = STJ.A00(exc);
                num = AnonymousClass05K.A01;
                str3 = "Failed to complete POST request";
            }
            atomicReference.set((Object) null);
        } else if (this instanceof QNC) {
            QNC qnc = (QNC) this;
            ArrayList A0q = AnonymousClass7TF.A0q(exc, 0);
            if (A0q.isEmpty()) {
                C10567RuM ruM = qnc.A00;
                C13886Tj9 tj9 = ruM.A01;
                C9596Rda.A00(tj9, exc, "media_upload_fetch_upload_settings_failure", ruM.A02, C13886Tj9.A00(tj9, ruM.A00));
            }
            qnc.A05.DFP(exc);
            C10864RzP rzP = qnc.A03;
            A0q.addAll(rzP.A00.Avn(qnc.A01, qnc.A02, rzP));
            qnc.A04.D56(A0q);
            return;
        } else if (this instanceof QN5) {
            AnonymousClass7TF.A1C(exc, 0, map2);
            ((QN5) this).A00.DEh(exc, map2, i3, z2);
            return;
        } else if (this instanceof QN6) {
            QN6 qn6 = (QN6) this;
            AnonymousClass7TF.A1C(exc, 0, map2);
            atomicReference = qn6.A01;
            stj = (STJ) atomicReference.get();
            if (stj != null) {
                qn6.A00.A05.A00(exc);
                A00 = STJ.A00(exc);
                num = AnonymousClass05K.A00;
                str3 = "Failed GET request for fetching offset";
            }
            atomicReference.set((Object) null);
        } else if (this instanceof QN8) {
            C11039S6r s6r = ((QN8) this).A00;
            if (s6r != null) {
                s6r.A01("save_edit_start");
                return;
            }
            return;
        } else if (this instanceof QN7) {
            0qQ.A0B(exc, 0);
            C13685Tf2 tf2 = ((QN7) this).A00;
            if (tf2 != null) {
                tf2.Db5(C8917RFk.IGMLSegmentAnythingVideoStatusRequestingSaveEdit, AnonymousClass7TG.A0m(exc, "Save edit request failed ", AnonymousClass7TE.A1A()));
                return;
            }
            return;
        } else {
            if (this instanceof QNB) {
                QNB qnb = (QNB) this;
                if (i3 != 408 || qnb.A00 <= 0) {
                    thC = qnb.A01;
                    if (thC != null) {
                        str = "Oil uri failure statusCode: ";
                        str2 = ", with retries ";
                        i2 = qnb.A00;
                        thC.DBM(002.A02(i3, i2, str, str2));
                        return;
                    }
                    return;
                }
                thC2 = qnb.A01;
                if (thC2 != null) {
                    uri = qnb.A02;
                    jSONObject = qnb.A03;
                } else {
                    return;
                }
            } else {
                QNA qna = (QNA) this;
                if (i3 != 408 || qna.A00 <= 0) {
                    thC = qna.A01;
                    if (thC != null) {
                        str = "Oil uri failure statusCode: ";
                        str2 = ", with retries ";
                        i2 = qna.A00;
                        thC.DBM(002.A02(i3, i2, str, str2));
                        return;
                    }
                    return;
                }
                thC2 = qna.A01;
                if (thC2 != null) {
                    uri = qna.A02;
                    jSONObject = qna.A03;
                } else {
                    return;
                }
            }
            thC2.AR5(uri, jSONObject);
            return;
        }
        STJ.A03(stj, exc2, num, str3, map2, i3, A00, z2);
        atomicReference.set((Object) null);
    }
}
