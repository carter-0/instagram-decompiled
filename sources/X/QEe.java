package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.logging.LoggingContext;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class QEe extends 2Rw {
    public View.OnAttachStateChangeListener A00;
    public List A01 = 0sn.A00;
    public final Map A02;
    public final Map A03;

    public final void A00(List list) {
        0qQ.A0B(list, 0);
        C232362ta A002 = C232332tX.A00(new QEU(new QEV(this.A03), this, this.A01, list));
        this.A01 = list;
        A002.A03(this);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        GW4 gw4 = new GW4(1, recyclerView, this);
        this.A00 = gw4;
        recyclerView.addOnAttachStateChangeListener(gw4);
    }

    public final void onBindViewHolder(C249703kE r3, int i) {
        0qQ.A0B(r3, 0);
        int itemViewType = getItemViewType(i);
        ((QEW) 0Yt.A01(Integer.valueOf(itemViewType), this.A02)).A0A(r3, (SUj) this.A01.get(i));
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        return ((QEW) 0Yt.A01(Integer.valueOf(i), this.A02)).A09(viewGroup);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        recyclerView.removeOnAttachStateChangeListener(this.A00);
    }

    public final void onViewRecycled(C249703kE r2) {
        C7464QEt qEt;
        0qQ.A0B(r2, 0);
        if ((r2 instanceof C7464QEt) && (qEt = (C7464QEt) r2) != null) {
            qEt.A00();
        }
    }

    public QEe(Map map) {
        this.A03 = map;
        LinkedHashMap A0o = C51975G9x.A0o(map);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            A0o.put(Integer.valueOf(((QEW) A1J.getValue()).A02.A00), A1J.getValue());
        }
        this.A02 = A0o;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1675150797);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-1454497185, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        LoggingContext loggingContext;
        int A032 = AnonymousClass0fD.A03(1748641686);
        Object obj = ((SUj) this.A01.get(i)).A01;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem");
        Object BJZ = ((BaseCheckoutItem) obj).BJZ();
        Map map = this.A03;
        if (!map.containsKey(BJZ)) {
            Object A09 = 00k.A09(map.keySet());
            QEW qew = (QEW) map.get(A09);
            if (!(qew == null || (loggingContext = qew.A03) == null)) {
                C12411Sto A0g = C51965G9l.A0g();
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("CheckoutListViewAdapter: ViewBinder NOT FOUND: ");
                A1A.append(loggingContext.A02);
                A1A.append(' ');
                A1A.append(BJZ);
                A1A.append(" at ");
                A1A.append(i);
                A1A.append(" size ");
                A0g.A0N(loggingContext, Pxe.A0z(A1A, map.size()));
                Iterator A16 = DbV.A16(map);
                while (A16.hasNext()) {
                    C51965G9l.A0g().A0N(loggingContext, AnonymousClass7TG.A0m(A16.next(), "CheckoutListViewAdapter: ", AnonymousClass7TE.A1A()));
                }
            }
            BJZ = A09;
        }
        QEW qew2 = (QEW) map.get(BJZ);
        if (qew2 == null) {
            qew2 = (QEW) 00k.A09(map.values());
        }
        int i2 = qew2.A02.A00;
        AnonymousClass0fD.A0A(-906266706, A032);
        return i2;
    }
}
