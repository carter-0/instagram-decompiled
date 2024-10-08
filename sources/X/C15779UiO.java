package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.UiO  reason: case insensitive filesystem */
public final class C15779UiO extends C232222tE {
    public final Context A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View A09 = DbU.A09(DbT.A0B(this.A00), viewGroup, R.layout.row_iglive_igds_action, false);
        Object A0U = C13988Tno.A0U(A09, new C14867UCv(A09));
        if (A0U instanceof C14867UCv) {
            return (C249703kE) A0U;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C19271WSe wSe = (C19271WSe) r6;
        C14867UCv uCv = (C14867UCv) r7;
        boolean A1Z = AnonymousClass7TG.A1Z(wSe, uCv);
        IgdsListCell igdsListCell = uCv.A01;
        String str = wSe.A08;
        if (str == null) {
            str = String.valueOf(wSe.A00);
        }
        igdsListCell.A0I(str);
        String str2 = wSe.A07;
        if (str2 != null) {
            igdsListCell.A0H(str2);
        }
        Drawable drawable = wSe.A01;
        Integer num = wSe.A06;
        if (num != null) {
            igdsListCell.A0A(drawable, num);
        } else {
            igdsListCell.A09(drawable);
        }
        igdsListCell.A0G(wSe.A04, A1Z);
        AnonymousClass0fU.A00(wSe.A02, igdsListCell);
        C358618bC r0 = wSe.A03;
        if (r0 != null) {
            igdsListCell.A0E(r0);
        }
        Integer num2 = wSe.A05;
        if (num2 != null) {
            int intValue = num2.intValue();
            Resources resources = uCv.A00.getResources();
            igdsListCell.setPadding(resources.getDimensionPixelSize(intValue), igdsListCell.getPaddingTop(), resources.getDimensionPixelSize(intValue), igdsListCell.getPaddingBottom());
        }
    }

    public final Class modelClass() {
        return C19271WSe.class;
    }

    public C15779UiO(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
