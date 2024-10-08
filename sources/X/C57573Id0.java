package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import java.util.List;

/* renamed from: X.Id0  reason: case insensitive filesystem */
public final class C57573Id0 implements C59583JPd {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C57573Id0(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onFailure(Throwable th) {
        if (1 - this.A00 == 0) {
            DbS.A1U(this.A01);
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                C54774HSg.A00((Context) this.A01, C308206Td.A06((C307896Rx) this.A02), true);
                return;
            case 1:
                C56142HtU htU = (C56142HtU) obj;
                0qQ.A0B(htU, 0);
                0sL r5 = (0sL) this.A02;
                String str = htU.A03;
                0eP A1L = AnonymousClass7TE.A1L(TraceFieldType.RequestID, htU.A01);
                0eP A1L2 = AnonymousClass7TE.A1L("response_id", htU.A02);
                0eP A1L3 = AnonymousClass7TE.A1L(AnonymousClass000.A00(263), htU.A00);
                String str2 = htU.A04;
                if (str2 == null) {
                    str2 = "";
                }
                r5.invoke(str, 0Yt.A06(AnonymousClass7TH.A0h(AnonymousClass000.A00(817), str2, A1L, A1L2, A1L3)));
                return;
            default:
                C56064HsD hsD = (C56064HsD) obj;
                0qQ.A0B(hsD, 0);
                List list = hsD.A00;
                if (!list.isEmpty()) {
                    C69112Ner ner = (C69112Ner) this.A02;
                    String str3 = ((C356888Vp) 00k.A0I(list)).A05;
                    ner.A04 = str3;
                    C71111Ocu ocu = ner.A0H;
                    AnonymousClass87G r1 = (AnonymousClass87G) this.A01;
                    ocu.A03(new C72913POx(r1, str3, false));
                    ner.A01 = r1;
                    return;
                }
                return;
        }
    }
}
