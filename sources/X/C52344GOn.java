package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.GOn  reason: case insensitive filesystem */
public final class C52344GOn implements C59656JRy {
    public final GOo A00;
    public final AnonymousClass5Bx A01;
    public final C296345pu A02;
    public final C296135pX A03;
    public final AnonymousClass5C6 A04;
    public final AnonymousClass5CF A05;
    public final AnonymousClass5CO A06;
    public final 1Kv A07;
    public final C282125Bt A08;
    public final C296205pe A09;

    public /* synthetic */ C52344GOn(UserSession userSession, 1L5 r5, Set set) {
        C52343GOm gOm = new C52343GOm(set);
        1Kv A002 = 1Kt.A00(userSession);
        0qQ.A0B(A002, 5);
        this.A08 = gOm;
        this.A07 = A002;
        this.A02 = new C296345pu(r5);
        this.A01 = new AnonymousClass5Bx(r5);
        this.A04 = new AnonymousClass5C6(r5);
        this.A05 = new AnonymousClass5CF(userSession, r5);
        this.A06 = new AnonymousClass5CO(userSession, r5, "ad_and_netego_realtime_information", "organic_realtime_information");
        this.A09 = new C296205pe(r5);
        this.A00 = new GOo(r5);
        this.A03 = new C296135pX(r5);
    }

    public final Map AUR(String str) {
        0sm A002;
        1Kv r1 = this.A07;
        List<AnonymousClass9IV> ELB = r1.ELB(this.A08);
        r1.EEd(ELB);
        HashMap A1E = AnonymousClass7TE.A1E();
        for (AnonymousClass9IV r2 : ELB) {
            Object obj = ((AnonymousClass9J4) r2.A01).A04;
            List list = (List) A1E.get(obj);
            if (list == null) {
                A1E.put(obj, 0sr.A1M(new AnonymousClass9IV[]{r2}));
            } else {
                list.add(r2);
            }
        }
        Map A1E2 = AnonymousClass7TE.A1E();
        Iterator A0s = AnonymousClass7TF.A0s(A1E);
        while (A0s.hasNext()) {
            Map.Entry entry = (Map.Entry) A0s.next();
            switch (((C233162v9) entry.getKey()).ordinal()) {
                case 0:
                case 1:
                case 3:
                case 6:
                case 8:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    A002 = this.A02.A00(C293865lT.A00((C233162v9) entry.getKey()), str, (List) entry.getValue());
                    break;
                case 2:
                    A002 = this.A01.A00(str, (List) entry.getValue());
                    break;
                case 5:
                    A002 = this.A04.A00(str, (List) entry.getValue());
                    break;
                case 7:
                    A002 = this.A05.A00(str, (List) entry.getValue());
                    break;
                case 10:
                    A002 = this.A06.A02(str, (List) entry.getValue());
                    break;
                case 13:
                    A002 = this.A04.A01(str, (List) entry.getValue());
                    break;
                case 16:
                    A002 = this.A09.A00(str, (List) entry.getValue());
                    break;
                case 27:
                    A002 = this.A03.A00(str, (List) entry.getValue());
                    break;
                case 28:
                    A002 = this.A00.A00(str, (List) entry.getValue());
                    break;
                default:
                    A002 = 0Yt.A0E();
                    break;
            }
            A1E2 = 0Yt.A04(A1E2, A002);
        }
        return A1E2;
    }
}
