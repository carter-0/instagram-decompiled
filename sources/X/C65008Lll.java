package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lll  reason: case insensitive filesystem */
public final class C65008Lll implements C13671Tef {
    public final /* synthetic */ QDV A00;

    public C65008Lll(QDV qdv) {
        this.A00 = qdv;
    }

    public final void Cwc(String str) {
        if (str != null) {
            QDV qdv = this.A00;
            UserSession userSession = qdv.A07;
            AnonymousClass1CO A002 = AnonymousClass1CO.A00();
            0qQ.A07(A002);
            LDi lDi = new LDi(A002, userSession, "ig_stories");
            qdv.A00 = lDi;
            lDi.A00 = new C65010Lln(qdv);
            02m.A0p.markerStart(18946359);
            LDi lDi2 = qdv.A00;
            if (lDi2 == null) {
                0qQ.A0F("transcriptionFetcher");
                throw AnonymousClass00P.createAndThrow();
            } else {
                lDi2.A00(str);
            }
        } else {
            this.A00.A06.A0A(C61759KKy.A00);
        }
    }
}
