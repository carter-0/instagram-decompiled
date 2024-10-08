package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PDk  reason: case insensitive filesystem */
public final class C72631PDk implements C74460PvF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C72504P8n A01;
    public final /* synthetic */ C331157Pu A02;
    public final /* synthetic */ 2FW A03;
    public final /* synthetic */ MessageIdentifier A04;
    public final /* synthetic */ String A05;

    public final void D7X() {
    }

    public final void DBt(C317486nL r18) {
        C317486nL r4;
        Object obj;
        C72504P8n p8n = this.A01;
        AnonymousClass7S9 AvL = ((C333517Zg) p8n.A02.getValue()).AvL();
        MessageIdentifier messageIdentifier = this.A04;
        AnonymousClass7LQ BSO = AvL.BSO(messageIdentifier.A01);
        if (BSO != null) {
            List A0v = BSO.A0e.A0v();
            0qQ.A07(A0v);
            Iterator it = A0v.iterator();
            while (true) {
                r4 = r18;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C2607246u r3 = (C2607246u) obj;
                if (C51966G9m.A1W(p8n.A00, r3.A00()) && 0qQ.A0K(r3.A02, r4.A02)) {
                    break;
                }
            }
            C332837Wo r6 = p8n.A01;
            long j = this.A00;
            2FW r7 = this.A03;
            if (obj != null) {
                r6.DbX(r7, messageIdentifier, r4.A02, this.A05, j);
            } else {
                r6.DRi(r7, messageIdentifier, r4.A02, NetInfoModule.CONNECTION_TYPE_NONE, this.A05, (String) null, j, false, true);
            }
        }
        this.A02.A07();
    }

    public final void Dis() {
    }

    public C72631PDk(C72504P8n p8n, C331157Pu r2, 2FW r3, MessageIdentifier messageIdentifier, String str, long j) {
        this.A01 = p8n;
        this.A04 = messageIdentifier;
        this.A00 = j;
        this.A03 = r3;
        this.A05 = str;
        this.A02 = r2;
    }
}
