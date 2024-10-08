package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.IVu  reason: case insensitive filesystem */
public final class C57285IVu implements C254153s1 {
    public final RecyclerView A00;
    public final IgTextView A01;
    public final IgTextView A02;

    public C57285IVu(View view) {
        0qQ.A0B(view, 1);
        this.A01 = DbX.A0Z(view, R.id.intent_aware_ad_rifu_header_title);
        this.A02 = DbX.A0Z(view, R.id.intent_aware_ad_rifu_see_all_button);
        this.A00 = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_rifu_recycler_view);
    }

    public final Object BDh(1Xj r7) {
        Object obj;
        C53154GjQ gjQ;
        1Xj r0;
        RecyclerView recyclerView = this.A00;
        C53083GiH giH = recyclerView.A0A;
        C252553pI r4 = recyclerView.A0D;
        if ((giH instanceof C53083GiH) && r4 != null && (r4 instanceof LinearLayoutManager)) {
            C53083GiH giH2 = giH;
            1Xj r2 = r7;
            boolean A5E = r7.A5E();
            List list = giH2.A02;
            if (A5E) {
                r2 = r7.A1e(giH2.A04);
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r4;
            int indexOf = list.indexOf(r2) - linearLayoutManager.A1a();
            if (indexOf >= 0 && indexOf < linearLayoutManager.A0T()) {
                View A0X = linearLayoutManager.A0X(indexOf);
                if (A0X != null) {
                    obj = A0X.getTag();
                } else {
                    obj = null;
                }
                if (obj instanceof C53154GjQ) {
                    gjQ = (C53154GjQ) obj;
                    if (gjQ != null) {
                        r0 = gjQ.A00;
                    }
                    r0 = null;
                } else {
                    gjQ = null;
                    r0 = null;
                }
                if (0qQ.A0K(r0, r7)) {
                    return gjQ;
                }
            }
        }
        return null;
    }

    public final Map BR4() {
        Object obj;
        RecyclerView recyclerView = this.A00;
        C53083GiH giH = recyclerView.A0A;
        C252553pI r5 = recyclerView.A0D;
        if (!(giH instanceof C53083GiH) || r5 == null || !(r5 instanceof LinearLayoutManager)) {
            return AnonymousClass7TE.A1H();
        }
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        C53083GiH giH2 = giH;
        int itemCount = giH2.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r5;
            View A1D = linearLayoutManager.A1D(linearLayoutManager.A1a() + i);
            if (A1D != null) {
                obj = A1D.getTag();
            } else {
                obj = null;
            }
            Object A0O = 00k.A0O(giH2.A02, i);
            if (!(obj == null || A0O == null)) {
                A1H.put(A0O, obj);
            }
        }
        return A1H;
    }
}
