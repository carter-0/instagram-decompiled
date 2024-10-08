package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class KKV extends C60536Jn7 implements C66442MRw {
    public final RecyclerView A00;
    public final KKK A01;
    public final C361518gM A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KKV(ViewGroup viewGroup, C63913LBy lBy, C361518gM r6) {
        super(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.horizontal_album_filters_row_layout, false), lBy);
        0qQ.A0B(lBy, 3);
        this.A02 = r6;
        RecyclerView A0c = JTR.A0c(this.itemView, R.id.filter_type_recyclerview);
        this.A00 = A0c;
        KKK kkk = new KKK(r6);
        this.A01 = kkk;
        A0c.setAdapter(kkk);
        DbV.A1A(DbS.A07(this), A0c);
    }

    public final /* bridge */ /* synthetic */ void DKL(Object obj, int i) {
        C63945LEl lEl = (C63945LEl) obj;
        0qQ.A0B(lEl, 0);
        C361518gM r0 = this.A02;
        if (r0 != null) {
            r0.Ch8(lEl, i);
        }
    }
}
