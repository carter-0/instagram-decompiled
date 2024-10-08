package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.Mut  reason: case insensitive filesystem */
public final class C67789Mut extends C322136vJ {
    public final 0sP A00;
    public final boolean A01;

    public C67789Mut(0sP r2, boolean z) {
        super((C252303ot) C70382O4j.A00);
        this.A01 = z;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        String A04;
        C67923Mx9 mx9 = (C67923Mx9) r6;
        0qQ.A0B(mx9, 0);
        Object item = getItem(i);
        0qQ.A07(item);
        N4R n4r = (N4R) item;
        boolean z = this.A01;
        0sP r3 = this.A00;
        if (!(mx9 instanceof C69039NdX) && (mx9 instanceof C69038NdW)) {
            DbY.A1S(n4r, r3);
            IgdsListCell igdsListCell = mx9.A00;
            if (z) {
                CountryCodeData countryCodeData = (CountryCodeData) n4r.A00;
                if (countryCodeData != null) {
                    A04 = countryCodeData.A01();
                } else {
                    A04 = "";
                }
            } else {
                A04 = n4r.A04();
            }
            igdsListCell.A0I(A04);
            igdsListCell.A0C(new C71409Ok8(16, (Object) r3, (Object) n4r));
        }
    }

    public final int getItemViewType(int i) {
        int A03 = AnonymousClass0fD.A03(-1117479523);
        int A0M = AnonymousClass7TE.A0M(((N4R) getItem(i)).A02);
        AnonymousClass0fD.A0A(147996710, A03);
        return A0M;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean A1Y = C66580MXl.A1Y(viewGroup);
        Integer num = AnonymousClass05K.A00(3)[i];
        0qQ.A0B(num, 1);
        IgdsListCell A0d = C66581MXm.A0d(AnonymousClass7TE.A0S(viewGroup));
        A0d.setTextCellType(C69349Njo.TYPE_UNKNOWN);
        int intValue = num.intValue();
        if (intValue == 2) {
            return new C67923Mx9(A0d);
        }
        if (intValue == A1Y) {
            C67923Mx9 mx9 = new C67923Mx9(A0d);
            Context context = A0d.getContext();
            A0d.A0I(AnonymousClass7TE.A16(context, 2131964713));
            A0d.setBackgroundResource(R.drawable.lead_gen_item_row_with_top_border);
            A0d.A08(R.style.igds_emphasized_label, 2Yu.A07(context));
            return mx9;
        } else if (intValue == 1) {
            C67923Mx9 mx92 = new C67923Mx9(A0d);
            A0d.A0I(AnonymousClass7TE.A16(A0d.getContext(), 2131964714));
            return mx92;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }
}
