package X;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.Or7  reason: case insensitive filesystem */
public final class C71806Or7 implements C323846yC, C323836yB {
    public final int A00;
    public final Object A01;

    public C71806Or7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DqI(C324746zp r6) {
        C69491NmZ nmZ;
        W2G w2g;
        Integer num;
        TextView A0d;
        switch (this.A00) {
            case 0:
                int i = r6.A01;
                if (i == 0) {
                    w2g = ((C17689VcK) this.A01).A0A;
                    num = AnonymousClass05K.A01;
                } else if (i == 1) {
                    w2g = ((C17689VcK) this.A01).A0A;
                    num = AnonymousClass05K.A00;
                } else {
                    return;
                }
                W2G.A0A = num;
                W2G.A01(w2g);
                return;
            case 1:
                NJY njy = (NJY) this.A01;
                ArrayList arrayList = njy.A12;
                Object obj = arrayList.get(r6.A01);
                0qQ.A07(obj);
                C69362Nk2 nk2 = (C69362Nk2) obj;
                C69362Nk2 nk22 = njy.A04;
                if (nk22 == null || nk22 != nk2) {
                    njy.A04 = nk2;
                    int i2 = r6.A01;
                    if (arrayList.get(i2) == C69362Nk2.Reshares) {
                        nmZ = C69491NmZ.RESHARED_MEDIA;
                    } else if (arrayList.get(i2) == C69362Nk2.Media) {
                        nmZ = C69491NmZ.SHARED_MEDIA;
                    } else {
                        return;
                    }
                    NJY.A05(nmZ, njy);
                    return;
                }
                return;
            default:
                C68953Nbc nbc = (C68953Nbc) this.A01;
                ((C60232Jhp) nbc.A06.getValue()).A00 = r6.A01;
                View view = r6.A03;
                if (view != null && (A0d = AnonymousClass7TE.A0d(view, R.id.reaction_count_text)) != null) {
                    DbT.A17(nbc.requireContext(), A0d, 2Yu.A07(nbc.getContext()));
                    return;
                }
                return;
        }
    }

    public final void DqN(C324746zp r3) {
        View view;
        TextView A0d;
        if (2 - this.A00 == 0 && (view = r3.A03) != null && (A0d = AnonymousClass7TE.A0d(view, R.id.reaction_count_text)) != null) {
            A0d.setTextColor(Dbb.A05((Fragment) this.A01));
        }
    }
}
