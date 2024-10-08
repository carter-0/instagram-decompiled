package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.List;

public final class KHU extends IgLinearLayout {
    public MUF A00;
    public C61062Jw0 A01;
    public Integer A02;
    public boolean A03;
    public final C65684Lxz A04;
    public final UserSession A05;
    public final MUI A06;
    public final C63952LEu A07;
    public final boolean A08;

    private final void A00() {
        List list;
        MUF muf = this.A00;
        if (muf != null) {
            C65684Lxz lxz = this.A04;
            0qQ.A0B(lxz, 0);
            ((C65688Ly3) muf).A00 = lxz;
            C61062Jw0 jw0 = this.A01;
            int i = null;
            if (jw0 != null) {
                list = (List) jw0.A01;
                if (jw0.A03 != null) {
                    i = 1;
                }
            } else {
                list = null;
            }
            muf.ADR(i, this.A02, list);
        }
    }

    public final View getArrow() {
        return this.A04.A00;
    }

    public final MUF getController() {
        return this.A00;
    }

    public final boolean getShowIcon() {
        return this.A03;
    }

    public final void setClipsShoppingMetadata(C61062Jw0 jw0) {
        this.A01 = jw0;
        A00();
    }

    public final void setController(MUF muf) {
        this.A00 = muf;
        A00();
    }

    public final void setShowIcon(boolean z) {
        this.A03 = z;
        this.A04.A02.setVisibility(DbW.A01(z ? 1 : 0));
    }

    public final void setSuggestedProducts(List list) {
        if (this.A08) {
            List A052 = LTX.A05(this.A01, LTX.A07(list));
            if (!A052.isEmpty()) {
                if (182.A06(0Tu.A05, this.A05, 36319879837589187L)) {
                    this.A02 = null;
                    this.A07.A01(A052);
                    this.A06.DkO(true, A052.size());
                }
            }
            this.A02 = C51968G9o.A0t(A052);
            this.A07.A01(0sn.A00);
            this.A06.DkO(false, 0);
        } else {
            this.A02 = C51968G9o.A0t(LTX.A09(list));
        }
        A00();
    }

    public KHU(Context context, UserSession userSession, MUI mui, boolean z) {
        super(context);
        RecyclerView recyclerView;
        this.A05 = userSession;
        this.A06 = mui;
        this.A08 = z;
        C63952LEu lEu = new C63952LEu(mui, z);
        this.A07 = lEu;
        View.inflate(context, R.layout.layout_clips_sharesheet_product_tags_row, this);
        C65684Lxz lxz = new C65684Lxz(this);
        this.A04 = lxz;
        DbU.A1A(getResources(), lxz.A01, 2131955618);
        DbU.A13(context, lxz.A02, R.drawable.instagram_shopping_bag_pano_outline_24);
        View A0F = DbY.A0F(this, R.id.product_suggestions_row_stub);
        if ((A0F instanceof RecyclerView) && (recyclerView = (RecyclerView) A0F) != null) {
            lEu.A00(recyclerView);
        }
    }
}
