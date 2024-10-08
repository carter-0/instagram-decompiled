package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.Dlr  reason: case insensitive filesystem */
public final class C46815Dlr extends 2Rw {
    public final E4H A00;
    public final List A01 = AnonymousClass7TE.A1C();

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        0qQ.A0B(r6, 0);
        C48229EbA ebA = (C48229EbA) this.A01.get(i);
        View view = r6.itemView;
        0qQ.A06(view);
        C47358Dvs dvs = ebA.A00;
        IgdsListCell igdsListCell = (IgdsListCell) view;
        igdsListCell.setTextCellType(C69349Njo.TYPE_CHECKBOX);
        String str = dvs.A02;
        if (str == null) {
            str = "";
        }
        igdsListCell.A0I(str);
        float f = 0.3f;
        if (ebA.A01) {
            f = 1.0f;
        }
        igdsListCell.setAlpha(f);
        boolean z = true;
        if (!AnonymousClass7TF.A1Y(dvs.A00, true) || !ebA.A01) {
            z = false;
        }
        igdsListCell.setChecked(z);
        igdsListCell.setEnabled(ebA.A01);
        igdsListCell.A0D(new FQ1(3, ebA, this));
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C249703kE(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.add_objectives_list_item, false));
    }

    public C46815Dlr(E4H e4h) {
        this.A00 = e4h;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1303997032);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-596426457, A03);
        return size;
    }
}
