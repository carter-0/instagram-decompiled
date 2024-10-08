package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.List;

/* renamed from: X.Omr  reason: case insensitive filesystem */
public final class C71556Omr implements 2Kw {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71556Omr(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void invoke(Throwable th) {
        switch (this.A00) {
            case 0:
                C10963S2v s2v = (C10963S2v) this.A01;
                0qQ.A0A(th);
                S5Q s5q = (S5Q) this.A02;
                0qQ.A0B(th, 0);
                int i = s2v.A00;
                if (i > 0) {
                    s2v.A00 = i - 1;
                    s2v.A04.A04(s5q, s2v);
                    return;
                }
                s2v.A03.A01(th.toString());
                0sP r0 = s2v.A01;
                if (r0 != null) {
                    r0.invoke(th);
                    return;
                }
                return;
            case 1:
                0wb.A06("attribution_sdk:GraphQLAttributionEventComplianceActionProvider", "GraphQL error", th);
                ((C17810VgN) this.A01).A00("GraphQL error", th);
                return;
            case 2:
                ((C74382Ptx) this.A01).DCc((Activity) this.A02);
                return;
            case 3:
                ((C74439Puu) this.A02).Dgh((Activity) this.A01);
                return;
            case 4:
                LPO.A01((Activity) this.A01, "Sticker save failed", "Error saving sticker", (C62320sa) null, 2131968772);
                return;
            case 5:
                OZQ ozq = (OZQ) this.A02;
                OME ome = ozq.A07;
                C71002OVz oVz = (C71002OVz) this.A01;
                String str = oVz.A01;
                0qQ.A06(str);
                ome.A00.markerPoint(944520647, str.hashCode(), "server_response_received");
                String message = th.getMessage();
                if (message == null) {
                    message = "network_error";
                }
                OZQ.A00(ozq, oVz, message);
                ozq.A09.invoke();
                return;
            case 6:
                NKI.A06((NKI) this.A02, (DirectThreadThemeInfo) this.A01, true);
                return;
            case 7:
                OHP ohp = (OHP) this.A02;
                C71002OVz oVz2 = (C71002OVz) this.A01;
                String message2 = th.getMessage();
                if (message2 == null) {
                    message2 = "network_error";
                }
                UserSession userSession = ohp.A02;
                AnonymousClass0iw r5 = ohp.A01;
                String str2 = oVz2.A00;
                0qQ.A06(str2);
                String str3 = oVz2.A01;
                C71048OaQ.A02(C69447Nlr.AI_STICKER, r5, userSession, message2, str2, str3, ohp.A06, (List) null);
                OME ome2 = ohp.A04;
                0qQ.A06(str3);
                int hashCode = str3.hashCode();
                02m r2 = ome2.A00;
                r2.markerAnnotate(944520647, hashCode, "error", message2);
                r2.markerEnd(944520647, hashCode, 3);
                C70450O7b o7b = ohp.A03;
                int i2 = ohp.A00;
                C70986OVa oVa = o7b.A00;
                C59689JTv.A0B(oVa.A01, "network_error");
                C70438O6p o6p = oVa.A05;
                if (o6p != null) {
                    o6p.A00.A03.DdJ(i2);
                    return;
                }
                return;
            case 8:
                DbS.A1U(this.A01);
                ((C56031Hrd) this.A02).A00(HM5.OTHER_ERROR);
                return;
            case 9:
                C64836Liy liy = (C64836Liy) this.A02;
                AnonymousClass7TE.A1Z(new C66168MGf(this.A01, (Object) liy, (AnonymousClass4D7) null, 43), liy.A02);
                return;
            default:
                0qQ.A0A(th);
                0qQ.A0B(th, 0);
                ((AnonymousClass4D7) this.A01).resumeWith(new ONW(th.getMessage(), (C70831ONd) null, false));
                return;
        }
    }
}
