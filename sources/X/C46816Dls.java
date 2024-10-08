package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.Dls  reason: case insensitive filesystem */
public final class C46816Dls extends 2Rw {
    public final E4G A00;
    public final List A01;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        0qQ.A0B(r5, 0);
        C47357Dvr dvr = (C47357Dvr) this.A01.get(i);
        View view = r5.itemView;
        0qQ.A06(view);
        IgdsListCell igdsListCell = (IgdsListCell) view;
        igdsListCell.setTextCellType(C69349Njo.TYPE_CHECKBOX);
        String str = dvr.A02;
        if (str == null) {
            str = "";
        }
        igdsListCell.A0I(str);
        igdsListCell.setChecked(DbX.A1a(dvr.A00));
        igdsListCell.A0D(new FQ1(4, dvr, this));
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C249703kE(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.add_objectives_list_item, false));
    }

    public C46816Dls(E4G e4g, List list) {
        this.A01 = list;
        this.A00 = e4g;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1351782982);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(218291059, A03);
        return size;
    }
}
