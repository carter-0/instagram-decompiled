package X;

import android.view.View;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.OjI  reason: case insensitive filesystem */
public final class C71363OjI implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C329847Kl A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ boolean A05;

    public C71363OjI(C329847Kl r1, Integer num, List list, 0sP r4, int i, boolean z) {
        this.A04 = r4;
        this.A03 = list;
        this.A00 = i;
        this.A01 = r1;
        this.A05 = z;
        this.A02 = num;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-112933199);
        0sP r1 = this.A04;
        List list = this.A03;
        int i = this.A00;
        r1.invoke(list.get(i));
        C329847Kl r3 = this.A01;
        C329107Hp r4 = r3.A0L;
        String str = ((OGH) list.get(i)).A03;
        C329067Hl r2 = r4.A00;
        r2.A0b.A06(str);
        r4.A00();
        if (this.A05) {
            r2.A0b.A0B = this.A02;
        }
        OWQ owq = r3.A09;
        if (owq == null) {
            0qQ.A0F("suggestedReplyLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        C255283ts r5 = ((OGH) list.get(i)).A01;
        String str2 = ((OGH) list.get(i)).A04;
        String str3 = r3.A0D;
        0qQ.A0B(str3, 3);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("source", ((C255273tr) r5).A01);
        A1E.put("position", String.valueOf(i));
        A1E.put(C66955Mfo.A00(), str3);
        OWQ.A00(owq, r5, "suggested_replies_row_tap", str2, A1E);
        AnonymousClass0fD.A0C(-2072898817, A052);
    }
}
