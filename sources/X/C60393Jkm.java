package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Jkm  reason: case insensitive filesystem */
public final class C60393Jkm extends 2Rw {
    public C63612L0a A00;
    public List A01 = AnonymousClass7TE.A1C();
    public final Context A02;

    public final void onBindViewHolder(C249703kE r7, int i) {
        int i2;
        0qQ.A0B(r7, 0);
        if (r7 instanceof C60543JnE) {
            C60543JnE jnE = (C60543JnE) r7;
            C61082JwK jwK = (C61082JwK) this.A01.get(i);
            C63612L0a l0a = this.A00;
            0qQ.A0B(jwK, 0);
            TextView A0d = AnonymousClass7TE.A0d(jnE.itemView, R.id.category_title);
            switch (AnonymousClass7TE.A0M(jwK.A00)) {
                case 0:
                    i2 = 2131963096;
                    break;
                case 1:
                    i2 = 2131963094;
                    break;
                case 2:
                    i2 = 2131963095;
                    break;
                case 3:
                    i2 = 2131963097;
                    break;
                case 4:
                    i2 = 2131963093;
                    break;
                case 5:
                    i2 = 2131963091;
                    break;
                case 6:
                    i2 = 2131963092;
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
            Context context = jnE.A00;
            A0d.setText(AnonymousClass7TF.A0d(context.getResources(), i2));
            View view = jnE.itemView;
            Resources A0A = AnonymousClass7TF.A0A(context);
            boolean z = jwK.A01;
            int i3 = R.color.grey_1_15_transparent;
            if (z) {
                i3 = R.color.grey_0_40_transparent;
            }
            view.setBackgroundColor(A0A.getColor(i3, (Resources.Theme) null));
            LYG.A02(jnE.itemView, 22, l0a, jwK);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        Context context = this.A02;
        return new C60543JnE(context, DbT.A0D(LayoutInflater.from(context), viewGroup, R.layout.giphy_clips_category_item, false));
    }

    public C60393Jkm(Context context) {
        this.A02 = context;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1342224698);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(1559447011, A03);
        return size;
    }
}
