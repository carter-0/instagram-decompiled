package X;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import java.util.Iterator;

/* renamed from: X.Sbr  reason: case insensitive filesystem */
public final class C11530Sbr implements AdapterView.OnItemClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C11530Sbr(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.A00) {
            case 0:
                C17742VdB vdB = (C17742VdB) this.A01;
                DialogInterface.OnClickListener onClickListener = vdB.A03;
                QAE qae = ((C18743VzO) this.A02).A0V;
                onClickListener.onClick(qae, i);
                if (!vdB.A0I) {
                    qae.dismiss();
                    return;
                }
                return;
            case 1:
                U6V u6v = (U6V) this.A01;
                U5e u5e = u6v.A04;
                u5e.setSelection(i);
                if (u5e.getOnItemClickListener() != null) {
                    u5e.performItemClick(view, i, u6v.A01.getItemId(i));
                }
                u6v.dismiss();
                return;
            default:
                MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) this.A02;
                Month month = materialCalendarGridView.A00().A04;
                if (i >= month.A00() && i <= (month.A00() + month.A01) - 1) {
                    C13487TbE tbE = ((QEc) this.A01).A04;
                    long longValue = materialCalendarGridView.A00().getItem(i).longValue();
                    QCH qch = ((SzP) tbE).A00;
                    if (qch.A04.A03.CeC(longValue)) {
                        qch.A06.EL7(longValue);
                        Iterator it = qch.A0A.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw AnonymousClass7TE.A11("onSelectionChanged");
                        }
                        qch.A02.A0A.notifyDataSetChanged();
                        RecyclerView recyclerView = qch.A03;
                        if (recyclerView != null) {
                            recyclerView.A0A.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
