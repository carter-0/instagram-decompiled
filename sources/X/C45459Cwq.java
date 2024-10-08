package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cwq  reason: case insensitive filesystem */
public final class C45459Cwq {
    public Boolean A00;
    public Integer A01;
    public String A02;
    public String A03;
    public List A04;
    public final AnonymousClass60G A05;

    public final AnonymousClass60G A01() {
        Object obj;
        ArrayList arrayList = null;
        AnonymousClass7TH.A0K();
        AnonymousClass60G r6 = this.A05;
        if (r6 instanceof C3035769x) {
            List list = this.A04;
            if (list != null) {
                arrayList = AnonymousClass7TG.A0r(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C41846B3n.A1T(arrayList, it);
                }
            }
            obj = C41847B3o.A0o(r6, new 0eP[]{AnonymousClass7TE.A1L("facepile_users", arrayList), AnonymousClass7TE.A1L("num_items", this.A01), AnonymousClass7TE.A1L("prompt_id", this.A02), AnonymousClass7TE.A1L("prompt_text", this.A03), AnonymousClass7TE.A1L("should_show_unseen_response_indicator", this.A00)});
        } else {
            obj = A00();
        }
        return (AnonymousClass60G) obj;
    }

    public C45459Cwq(AnonymousClass60F r2) {
        this.A05 = r2;
        this.A04 = r2.B3g();
        this.A01 = r2.BWw();
        this.A02 = r2.Bhp();
        this.A03 = r2.Bhu();
        this.A00 = r2.Bup();
    }

    public final AnonymousClass60F A00() {
        AnonymousClass7TH.A0K();
        List list = this.A04;
        return new AnonymousClass60F(this.A00, this.A01, this.A02, this.A03, list);
    }
}
