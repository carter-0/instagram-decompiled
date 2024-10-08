package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.I2t  reason: case insensitive filesystem */
public final class C56589I2t {
    public static final View A00(Context context, ViewGroup viewGroup) {
        View A0A = DbU.A0A(DbT.A0B(context), viewGroup, R.layout.row_feed_collaborative_invite, false);
        A0A.setTag(new C55782HnH(A0A));
        return A0A;
    }

    public static final void A01(C55782HnH hnH, JM7 jm7) {
        View view;
        AnonymousClass7TF.A1H(hnH, jm7);
        if (jm7.equals(C57225ITm.A00)) {
            view = hnH.A00;
        } else if (jm7 instanceof C53542GqD) {
            hnH.A00.setVisibility(0);
            DbX.A1G(hnH.A02, ((C53542GqD) jm7).A00);
            hnH.A01.setVisibility(0);
            view = hnH.A03;
        } else if (jm7 instanceof C53543GqE) {
            hnH.A00.setVisibility(0);
            C53543GqE gqE = (C53543GqE) jm7;
            DbX.A1G(hnH.A02, gqE.A00);
            hnH.A01.setVisibility(8);
            IgdsButton igdsButton = hnH.A03;
            igdsButton.setVisibility(0);
            igdsButton.setText(gqE.A01.A01);
            igdsButton.setStyle(C273014lo.PRIMARY);
            C56802ICz.A01(igdsButton, 9, jm7);
            return;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        view.setVisibility(8);
    }
}
