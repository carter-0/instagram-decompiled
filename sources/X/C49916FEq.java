package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.List;

/* renamed from: X.FEq  reason: case insensitive filesystem */
public final class C49916FEq {
    public ViewGroup A00;
    public IgImageView A01;
    public G8J A02;
    public Integer A03;
    public final UserSession A04;
    public final G99 A05;
    public final List A06 = AnonymousClass7TE.A1C();
    public final FPM A07 = new FPM(this, 5);
    public final boolean A08;

    public static void A00(C49916FEq fEq) {
        G8J fbW;
        IgImageView igImageView;
        ViewGroup viewGroup = fEq.A00;
        viewGroup.getClass();
        ViewStub A0F = DbS.A0F(viewGroup, R.id.recipient_picker_search_bar_above_pogs);
        ViewStub A0F2 = DbS.A0F(viewGroup, R.id.recipient_picker_pogs);
        Integer num = fEq.A03;
        if (num != AnonymousClass05K.A0C || A0F == null || A0F2 == null) {
            fbW = new C50423FbW(viewGroup, fEq.A07, fEq.A04, AnonymousClass7TF.A1W(num, AnonymousClass05K.A01), fEq.A08);
        } else {
            View inflate = A0F.inflate();
            IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) inflate.requireViewById(R.id.search_box);
            UserSession userSession = fEq.A04;
            if (182.A06(0Tu.A05, userSession, 36330303723160117L)) {
                igImageView = (IgImageView) inflate.findViewById(R.id.back_arrow);
            } else {
                igImageView = null;
            }
            fEq.A01 = igImageView;
            fbW = new C50422FbV(viewGroup, (RecyclerView) A0F2.inflate(), fEq.A07, userSession, igdsInlineSearchBox, new C51587Fwb(fEq, 2));
        }
        fEq.A02 = fbW;
        IgImageView igImageView2 = fEq.A01;
        if (igImageView2 != null) {
            G99 g99 = fEq.A05;
            g99.getClass();
            FP8.A01(igImageView2, 52, g99);
        }
    }

    public final void A01(List list, boolean z) {
        List list2 = this.A06;
        list2.clear();
        list2.addAll(list);
        this.A02.FLl((String) null, list2, z, false);
    }

    public C49916FEq(ViewGroup viewGroup, UserSession userSession, G99 g99) {
        this.A04 = userSession;
        this.A00 = viewGroup;
        this.A05 = g99;
        this.A08 = true;
        A00(this);
    }

    public C49916FEq(ViewGroup viewGroup, UserSession userSession, G99 g99, Integer num) {
        this.A04 = userSession;
        this.A00 = viewGroup;
        this.A05 = g99;
        this.A08 = true;
        this.A03 = num;
        A00(this);
    }
}
