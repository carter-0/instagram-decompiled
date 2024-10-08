package X;

import android.content.Context;
import android.view.View;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oj0  reason: case insensitive filesystem */
public final class C71350Oj0 implements View.OnClickListener {
    public final /* synthetic */ C72336P2b A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C71350Oj0(C72336P2b p2b, List list, boolean z, boolean z2) {
        this.A02 = z;
        this.A00 = p2b;
        this.A01 = list;
        this.A03 = z2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(722458856);
        if (!this.A02) {
            C358248ab A0Y = DbS.A0Y(this.A00.A00);
            A0Y.A09(2131958710);
            A0Y.A08(2131958708);
            A0Y.A06();
            AnonymousClass7TH.A0a(A0Y, true);
        } else {
            Iterator it = this.A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!((User) next).A1c()) {
                    if (next != null) {
                        C72336P2b p2b = this.A00;
                        Context context = p2b.A00;
                        GA1 ga1 = new GA1(29, p2b, this.A03);
                        C358248ab A0Y2 = DbS.A0Y(context);
                        A0Y2.A09(2131958835);
                        A0Y2.A08(2131958834);
                        C71249OgE.A02(A0Y2, ga1, 44, 2131956706);
                        A0Y2.A05();
                        AnonymousClass7TH.A0a(A0Y2, true);
                    }
                }
            }
            C72336P2b p2b2 = this.A00;
            OPN.A00(p2b2.A01, p2b2.A02, p2b2.A03, p2b2.A04, this.A03);
        }
        AnonymousClass0fD.A0C(-558180362, A05);
    }
}
