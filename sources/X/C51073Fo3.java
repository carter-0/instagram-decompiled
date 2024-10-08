package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Fo3  reason: case insensitive filesystem */
public final class C51073Fo3 implements MUW {
    public final /* synthetic */ C46656Dib A00;

    public C51073Fo3(C46656Dib dib) {
        this.A00 = dib;
    }

    public final void DoO(UQY uqy) {
        int i;
        int i2;
        if (uqy != null) {
            C46656Dib dib = this.A00;
            if (dib.getActivity() != null && dib.isAdded()) {
                if (DbY.A1Y(0Tu.A05, dib.A0V, 36312702947493082L)) {
                    i = 3;
                    i2 = 3682;
                } else {
                    i = 2;
                    i2 = 353;
                }
                String optionalStringField = uqy.getOptionalStringField(i, AnonymousClass000.A00(i2));
                if (!TextUtils.isEmpty(optionalStringField)) {
                    dib.A0z = true;
                    TextView A0G = DbU.A0G(dib.A03, R.id.diversity_designation);
                    dib.A0J = A0G;
                    A0G.setText(optionalStringField);
                }
            }
        }
    }

    public final void onFailure() {
        C46656Dib dib = this.A00;
        if (dib.getActivity() != null && dib.isAdded()) {
            0wb.A03(C46656Dib.__redex_internal_original_name, "Failed to load profile diversity info");
        }
    }
}
