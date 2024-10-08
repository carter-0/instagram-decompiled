package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.LhI  reason: case insensitive filesystem */
public final class C64741LhI implements AnonymousClass2tB {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64741LhI(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void DvY() {
        C252553pI r0;
        switch (this.A00) {
            case 0:
                Integer num = ((LED) this.A01).A04;
                if (num != null) {
                    int intValue = num.intValue();
                    RecyclerView recyclerView = ((C64724Lh1) this.A02).A03;
                    if (recyclerView == null) {
                        0qQ.A0F("editRecyclerView");
                        throw AnonymousClass00P.createAndThrow();
                    } else {
                        recyclerView.A0p(intValue);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                PAS pas = (PAS) this.A01;
                C61066Jw4 jw4 = (C61066Jw4) this.A02;
                boolean z = pas.A06;
                AnonymousClass7UC r1 = pas.A0B;
                if (z) {
                    r1.A00(false);
                    return;
                } else if (!r1.A02(-1) && jw4 != null) {
                    pas.A08.A01((ImageUrl) jw4.A00, jw4.A02, jw4.A01, false, false);
                    return;
                } else {
                    return;
                }
            default:
                Parcelable parcelable = ((KUQ) this.A01).A00;
                if (parcelable != null && (r0 = ((RecyclerView) AnonymousClass7TE.A14(((KUN) this.A02).A01)).A0D) != null) {
                    r0.A1P(parcelable);
                    return;
                }
                return;
        }
    }
}
