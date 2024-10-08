package X;

import android.content.Context;
import android.widget.Filter;
import android.widget.Filterable;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class E9J extends 2Ru implements C231272rL, Filter.FilterListener, Filterable {
    public Set A00;
    public boolean A01;
    public C46715Djm A02;
    public final C17962Viv A03 = new Object();
    public final List A04;
    public final Set A05;
    public final Context A06;
    public final EEO A07;
    public final C47623EAj A08;
    public final C46437Dez A09;
    public final EAC A0A;
    public final TwD A0B;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Viv, java.lang.Object] */
    public E9J(Context context, AnonymousClass0iw r13, UserSession userSession, EEO eeo, G8F g8f, boolean z) {
        super(false);
        this.A06 = context;
        EAC eac = new EAC(context, (G6V) null);
        this.A0A = eac;
        TwD twD = new TwD();
        this.A0B = twD;
        C46437Dez dez = new C46437Dez(context);
        this.A09 = dez;
        C47623EAj eAj = new C47623EAj(context, r13, userSession, g8f, z);
        this.A08 = eAj;
        this.A04 = AnonymousClass7TE.A1C();
        this.A05 = AnonymousClass7TE.A1F();
        String string = context.getString(2131972868);
        int A012 = DbU.A01(context);
        twD.A01 = string;
        twD.A00 = A012;
        this.A07 = eeo;
        init(new C231642s0[]{eAj, dez, eac});
    }

    public final void A01(List list) {
        0qQ.A0B(list, 0);
        List list2 = this.A04;
        list2.clear();
        Set set = this.A05;
        set.clear();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0f = DbT.A0f(it);
            Set set2 = this.A00;
            if ((set2 == null || !set2.contains(A0f.A09())) && !set.contains(A0f.A09())) {
                String A092 = A0f.A09();
                0qQ.A07(A092);
                set.add(A092);
                A1C.add(A0f);
            }
        }
        list2.addAll(A1C);
        A00();
    }

    public final Object getAdapter() {
        return this;
    }

    public final void onFilterComplete(int i) {
    }

    public final Filter getFilter() {
        C46715Djm djm = this.A02;
        if (djm != null) {
            return djm;
        }
        C46715Djm djm2 = new C46715Djm(this);
        this.A02 = djm2;
        return djm2;
    }

    public final void A00() {
        clear();
        if (!this.A01 || !this.A04.isEmpty()) {
            List list = this.A04;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                addModel(list.get(i), Integer.valueOf(i), this.A08);
            }
            C17962Viv viv = this.A03;
            if (viv.A00) {
                addModel(this.A0B, viv, this.A0A);
            }
        } else {
            addModel(this.A06.getString(2131968382), this.A09);
        }
        updateListView();
        notifyDataSetChanged();
        EEO eeo = this.A07;
        C49916FEq fEq = eeo.A00;
        if (fEq != null) {
            List unmodifiableList = Collections.unmodifiableList(eeo.A08.A04);
            0qQ.A07(unmodifiableList);
            fEq.A02.Dwm(unmodifiableList);
        }
    }
}
