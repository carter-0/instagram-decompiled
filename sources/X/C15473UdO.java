package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UdO  reason: case insensitive filesystem */
public final class C15473UdO extends 2Ru {
    public final List A00 = new ArrayList();
    public final C15525UeE A01;
    public final C20988X8e A02;
    public final AnonymousClass71T A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15473UdO(Context context, AnonymousClass0iw r5, C20988X8e x8e, C17784Vfv vfv) {
        super(false);
        0qQ.A0B(vfv, 3);
        C15525UeE ueE = new C15525UeE(r5, vfv);
        this.A01 = ueE;
        AnonymousClass71T r1 = new AnonymousClass71T(context);
        this.A03 = r1;
        this.A02 = x8e;
        x8e.Epa();
        init(new C231642s0[]{ueE, r1});
    }

    public final void A00() {
        clear();
        List<Object> list = this.A00;
        if (list.isEmpty()) {
            C20988X8e x8e = this.A02;
            addModel(x8e.Afm(), x8e.B0w(), this.A03);
        } else {
            for (Object addModel : list) {
                addModel(addModel, this.A01);
            }
        }
        notifyDataSetChanged();
    }
}
