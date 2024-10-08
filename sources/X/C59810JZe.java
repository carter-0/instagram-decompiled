package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JZe  reason: case insensitive filesystem */
public final class C59810JZe extends 2Ru {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final C229122ms A03;
    public final C231762sK A04;
    public final ArrayList A05 = AnonymousClass7TE.A1C();
    public final C61485K9q A06;
    public final boolean A07;

    public C59810JZe(Context context, AnonymousClass0iw r12, UserSession userSession, AnonymousClass8MH r14, C229122ms r15, boolean z) {
        super(false);
        this.A03 = r15;
        this.A07 = z;
        C231762sK r0 = new C231762sK(context, (int) R.layout.layout_empty_sticker_load_more_view);
        this.A04 = r0;
        C61485K9q k9q = new C61485K9q(context, r12, userSession, (C357638Yz) null, r14, "", true, true);
        this.A06 = k9q;
        this.A01 = true;
        init(new C231642s0[]{k9q, r0});
        addModel(this.A03, (Object) null, this.A04);
    }

    public static final void A00(C59810JZe jZe, ArrayList arrayList) {
        int i = 3;
        if (jZe.A07) {
            i = 2;
        }
        2HZ A0B = C229632nm.A0B(C229632nm.A0C(0, arrayList.size()), i);
        int i2 = A0B.A00;
        int i3 = A0B.A01;
        int i4 = A0B.A02;
        if (i4 <= 0 ? !(i4 >= 0 || i3 > i2) : i2 <= i3) {
            while (true) {
                jZe.addModel(new C63702L3m(new C3251571g(arrayList, i2, i), i), (Object) null, jZe.A06);
                if (i2 == i3) {
                    break;
                }
                i2 += i4;
            }
        }
        jZe.notifyDataSetChangedSmart();
    }

    public final void A01(List list) {
        ArrayList arrayList = this.A05;
        arrayList.addAll(list);
        clear();
        A00(this, arrayList);
        if (this.A01) {
            addModel(this.A03, (Object) null, this.A04);
        }
    }
}
