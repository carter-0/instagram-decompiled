package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.List;

public final class PRI implements AnonymousClass7Q6 {
    public final int A00;
    public final Object A01;

    public PRI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DBs(Drawable drawable, View view, C317486nL r15) {
        String str;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r15, 0);
                ((C336487eh) this.A01).A04.invoke(r15.A02);
                return;
            case 1:
                0qQ.A0B(r15, 0);
                OZV ozv = ((C71063Oai) this.A01).A03;
                if (ozv.A0K) {
                    C67752Mu6 mu6 = ozv.A0E;
                    String str2 = ozv.A0G;
                    int i = ozv.A06;
                    if (str2 != null) {
                        AnonymousClass7TE.A1Z(new C66167MGe(mu6, r15, (AnonymousClass4D7) null, i), C318116oQ.A00(mu6));
                        return;
                    }
                    return;
                }
                ozv.A0F.A05(r15);
                C74460PvF pvF = ozv.A0D.A00.A01;
                if (pvF == null) {
                    0qQ.A0F("delegate");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    pvF.DBt(r15);
                    return;
                }
            case 2:
                View view2 = view;
                AnonymousClass7TF.A1H(r15, view);
                C314226hr r3 = (C314226hr) this.A01;
                AnonymousClass6ZN r4 = r3.A0O;
                Context A0S = AnonymousClass7TE.A0S(view);
                String str3 = r15.A02;
                String str4 = r15.A01;
                C255773uh r8 = r3.A00;
                if (r8 != null) {
                    r4.A01(A0S, view2, r3.A0D, r8, str3, str4, false);
                    C314266hv r42 = r3.A0M;
                    C317486nL A012 = C336957fS.A01(str3);
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    List<C254853tA> A002 = C314266hv.A00(r42);
                    if (A002 == null) {
                        A002 = C254853tA.A05;
                    }
                    for (C254853tA r5 : A002) {
                        C317486nL A013 = C336957fS.A01(r5.A02);
                        A1A.append(r5.A01);
                        A1A.append(",");
                        if (C337097fg.A01(A012, A013)) {
                            str = A012.A02;
                        } else {
                            str = A013.A02;
                        }
                        A1A.append(str);
                        A1A.append(",");
                        A1A.append(r5.A00);
                        A1A.append(";");
                    }
                    1Av r0 = r42.A02;
                    String obj = A1A.toString();
                    0qQ.A0B(obj, 0);
                    0xY A0p = AnonymousClass7TE.A0p(r0);
                    A0p.E5g(C273654mx.A00(1331), obj);
                    A0p.apply();
                    r42.A05(r15);
                    C314226hr.A06(r3);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            default:
                0qQ.A0B(r15, 0);
                ((GME) this.A01).A0I(r15.A02, NetInfoModule.CONNECTION_TYPE_NONE, "quick_emoji_tray", (String) null);
                return;
        }
    }
}
