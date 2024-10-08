package X;

import android.content.Context;
import android.content.DialogInterface;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.FIo  reason: case insensitive filesystem */
public final class C50003FIo implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    public C50003FIo(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, boolean z) {
        this.A00 = i;
        this.A04 = obj3;
        this.A05 = str;
        this.A02 = obj2;
        this.A03 = obj4;
        this.A01 = obj;
        this.A06 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            Context context = (Context) this.A01;
            0lg r6 = (0lg) this.A04;
            boolean z = this.A06;
            1Xj r7 = (1Xj) this.A03;
            AnonymousClass07i r1 = (AnonymousClass07i) this.A02;
            String str = this.A05;
            0qQ.A0B(r1, 4);
            String A2n = r7.A2n();
            if (A2n != null) {
                1NY A0a = AnonymousClass7TG.A0a(r6);
                A0a.A0A("clips/item/set_mashups_allowed/");
                A0a.A9m(AnonymousClass000.A00(547), A2n);
                A0a.A9m("media_id", A2n);
                A0a.A0H(AnonymousClass000.A00(5028), !z);
                DbX.A1M(A0a, "container_module", str);
                1OC A0M = A0a.A0M();
                A0M.A00 = new EC8(context, r6, r7, str, 2, z);
                1ES.A00(context, r1, A0M);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        0lg r3 = (0lg) this.A04;
        C319606qt A012 = C319606qt.A01(r3);
        String str2 = this.A05;
        A012.A09((Context) this.A01, (AnonymousClass0iw) this.A02, r3, (Integer) this.A03, str2, true);
        if (!this.A06) {
            ImmutableList copyOf = ImmutableList.copyOf(AnonymousClass3EO.A00(r3).A02.values());
            if (!AnonymousClass4KJ.A00(copyOf)) {
                Iterator it = copyOf.iterator();
                while (it.hasNext()) {
                    ((C49557Exs) it.next()).A02 = true;
                }
                AnonymousClass3EO.A00(r3).A05(copyOf);
            }
        }
    }
}
