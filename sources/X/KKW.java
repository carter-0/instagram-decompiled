package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class KKW extends C60536Jn7 implements C66442MRw {
    public int A00;
    public KKS A01;
    public final TextView A02 = DbW.A0B(this.itemView, R.id.button_see_all);
    public final TextView A03 = DbW.A0B(this.itemView, R.id.album_category_title);
    public final RecyclerView A04;
    public final C361518gM A05;
    public final KKL A06;
    public final C53368Gms A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KKW(ViewGroup viewGroup, C53368Gms gms, UserSession userSession, C63913LBy lBy, C361518gM r11) {
        super(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.album_category_layout, false), lBy);
        AnonymousClass7TG.A1R(gms, lBy);
        this.A05 = r11;
        this.A07 = gms;
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TE.A0b(this.itemView, R.id.album_thumbnail_recycler_view);
        this.A04 = recyclerView;
        this.A00 = 2;
        KKL kkl = new KKL(gms, userSession, (C59948JcE) null, r11);
        this.A06 = kkl;
        recyclerView.setAdapter(kkl);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2, 0, false));
        Resources A052 = DbU.A05(this.itemView);
        recyclerView.A11(new C60462Jlu(0, this.A00, A052.getDimensionPixelOffset(R.dimen.abc_dialog_padding_material), A052.getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material)));
    }

    public static final String A00(KKW kkw, Integer num) {
        Context A072;
        int i;
        if (num == null) {
            return "";
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            A072 = DbS.A07(kkw);
            i = 2131964577;
        } else if (intValue == 2) {
            A072 = DbS.A07(kkw);
            i = 2131964575;
        } else if (intValue != 3) {
            return "";
        } else {
            A072 = DbS.A07(kkw);
            i = 2131964578;
        }
        return AnonymousClass7TE.A16(A072, i);
    }

    public final /* bridge */ /* synthetic */ void DKL(Object obj, int i) {
        C61080JwI jwI = (C61080JwI) obj;
        0qQ.A0B(jwI, 0);
        C361518gM r0 = this.A05;
        if (r0 != null) {
            r0.Ch9(jwI, i);
        }
    }
}
