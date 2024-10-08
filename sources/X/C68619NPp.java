package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.NPp  reason: case insensitive filesystem */
public final class C68619NPp extends C232232tF {
    public final Context A00;
    public final 0sP A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67938MxO(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_manage_folders_folder_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        float f;
        C68208N5x n5x = (C68208N5x) r6;
        C67938MxO mxO = (C67938MxO) r7;
        AnonymousClass7TF.A1H(n5x, mxO);
        IgdsListCell igdsListCell = mxO.A01;
        igdsListCell.A0I(n5x.A02);
        Context context = this.A00;
        igdsListCell.A07(R.style.PrivacyTextStyle, 2Yu.A08(context));
        if (n5x.A05) {
            int i = 2131959709;
            if (n5x.A00 instanceof 2Ej) {
                i = 2131959708;
            }
            igdsListCell.A0H(C51967G9n.A0p(context, i));
            igdsListCell.A05(R.drawable.instagram_folder_pano_outline_24);
            igdsListCell.setTextCellType(C69349Njo.TYPE_CHEVRON);
            C71405Ok4.A01(igdsListCell, 33, n5x, this);
        } else {
            igdsListCell.A0H(AnonymousClass7TE.A16(context, 2131959710));
            igdsListCell.A05(R.drawable.instagram_folder_settings_pano_outline_24);
        }
        if (n5x.A07) {
            igdsListCell.setOnClickListener((View.OnClickListener) null);
            if (n5x.A06) {
                mxO.A00.setVisibility(0);
                igdsListCell.setTextCellType(C69349Njo.TYPE_UNKNOWN);
                return;
            }
            f = 0.6f;
        } else {
            mxO.A00.setVisibility(8);
            f = 1.0f;
        }
        igdsListCell.setAlpha(f);
    }

    public final Class modelClass() {
        return C68208N5x.class;
    }

    public C68619NPp(Context context, 0sP r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
