package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Qh3  reason: case insensitive filesystem */
public final class C8111Qh3 extends QDP {
    public QRF A00;
    public final AnonymousClass2Fj A01 = JTO.A0K();

    /* JADX WARNING: type inference failed for: r7v0, types: [X.RwX, X.QgW] */
    public final void A0C(Bundle bundle) {
        Parcelable parcelable;
        Object A012;
        String str;
        ImmutableList requiredCompactedTreeListField;
        super.A0C(bundle);
        if (bundle == null || (parcelable = bundle.getParcelable("EARNINGS_BALANCE_INFO")) == null || (A012 = C11405SSc.A01(parcelable)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        this.A00 = (QRF) A012;
        ImmutableList.Builder A0Y = Pxe.A0Y();
        C8092Qgk A002 = C8092Qgk.A00(20);
        C8080QgY A003 = C8080QgY.A00();
        QRF qrf = this.A00;
        if (qrf != null) {
            str = qrf.A09("balance_text");
        } else {
            str = null;
        }
        SST.A02(C12401StR.A01(str), A003, RH2.A1E);
        A002.A01(new C8086Qge(A003), 1);
        ? rwX = new C10693RwX();
        Integer A0q = C66580MXl.A0q();
        rwX.A02 = new C12398Ssm(A0q, 4, A0q, 0);
        rwX.A00 = C11496SbJ.A00(this, 14);
        A002.A06 = new C8082Qga(rwX);
        A002.A00 = R.id.bottom_sheet_header;
        C11345SOd.A02(A002, A0Y);
        C8094Qgm.A00(A0Y);
        QRF qrf2 = this.A00;
        if (!(qrf2 == null || (requiredCompactedTreeListField = qrf2.getRequiredCompactedTreeListField(3, "balance_tooltip", C42146BSt.class, 579186443)) == null)) {
            ArrayList A0p = AnonymousClass7TF.A0p(requiredCompactedTreeListField);
            Iterator it = requiredCompactedTreeListField.iterator();
            while (it.hasNext()) {
                A0p.add(C41845B3m.A0V(it).reinterpretRequired(0, QXV.class, -1925217936));
            }
            ArrayList A0p2 = AnonymousClass7TF.A0p(A0p);
            Iterator it2 = A0p.iterator();
            while (it2.hasNext()) {
                A0p2.add(new C12399StP((QXV) it2.next(), new C12468Sv0(this, 3)));
            }
            Iterator it3 = A0p2.iterator();
            while (it3.hasNext()) {
                C8092Qgk A004 = C8092Qgk.A00(1);
                C8080QgY A005 = C8080QgY.A00();
                SST.A02((C13883Tj6) it3.next(), A005, RH2.A0q);
                C8086Qge.A01(A004, A005, A0Y);
            }
        }
        this.A01.A0B(A0Y.build());
    }
}
