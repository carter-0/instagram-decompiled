package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DmR  reason: case insensitive filesystem */
public final class C46849DmR extends 2Rw implements View.OnClickListener {
    public final List A00;
    public final C51885G6a A01;

    public final void onBindViewHolder(C249703kE r4, int i) {
        0qQ.A0B(r4, 0);
        EyZ eyZ = (EyZ) this.A00.get(i);
        C46951Do5 do5 = (C46951Do5) r4;
        do5.A01.setText(eyZ.A02);
        do5.A00.setChecked(eyZ.A00);
        do5.itemView.setTag(Integer.valueOf(i));
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.follow_list_sorting_option_row, viewGroup, false);
        AnonymousClass0fU.A00(this, inflate);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C46951Do5(inflate);
    }

    public C46849DmR(C51885G6a g6a, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A00 = A1C;
        A1C.addAll(list);
        this.A01 = g6a;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1647721792);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-480925291, A03);
        return size;
    }

    public final void onClick(View view) {
        int A03 = DbX.A03(view, 1937355865);
        Object tag = view.getTag();
        if (tag != null) {
            int A0M = AnonymousClass7TE.A0M(tag);
            List list = this.A00;
            C48104EVw eVw = ((EyZ) list.get(A0M)).A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                EyZ eyZ = (EyZ) list.get(i);
                boolean A1W = AnonymousClass7TF.A1W(eyZ.A01, eVw);
                if (eyZ.A00 != A1W) {
                    eyZ.A00 = A1W;
                    notifyItemChanged(i);
                }
            }
            this.A01.Dln(eVw);
            AnonymousClass0fD.A0C(1247213403, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(117089192, A03);
        throw A0y;
    }
}
