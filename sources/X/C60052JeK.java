package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JeK  reason: case insensitive filesystem */
public final class C60052JeK extends BaseAdapter {
    public List A00;
    public List A01;
    public boolean A02;
    public final Context A03;
    public final List A04;

    public C60052JeK(Context context, List list) {
        0qQ.A0B(list, 1);
        this.A04 = list;
        this.A03 = context;
        this.A01 = 00k.A0i(list, C229632nm.A0C(3, DbT.A02(list, 1)));
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            if (i < 3 || i == DbT.A02(this.A04, 1)) {
                A1C.add(next);
            }
            i = i2;
        }
        this.A00 = 00k.A0U(A1C);
    }

    public final void A00() {
        this.A02 = false;
        List list = this.A00;
        if (list != null) {
            0sn r0 = this.A01;
            if (r0 == null) {
                r0 = 0sn.A00;
            }
            list.removeAll(r0);
            ((C63798L7e) list.get(C51966G9m.A06(list))).A00 = 0.0f;
        }
        0fE.A00(this, -1354925694);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context;
        C63798L7e l7e;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.avatar_immersive_home_entrypoint_item);
        if (A0C == null) {
            return null;
        }
        List list = this.A00;
        if (list == null || (l7e = (C63798L7e) list.get(i)) == null) {
            throw DbU.A0h();
        }
        ImageView A0G = DbS.A0G(A0C, R.id.entrypoint_icon);
        if (A0G != null) {
            A0G.setRotation(l7e.A00);
            A0G.setImageResource(l7e.A01);
            DbU.A14(A0G.getContext(), A0G, R.color.canvas_bottom_sheet_description_text_color);
        }
        TextView A0d = AnonymousClass7TE.A0d(A0C, R.id.entrypoint_label);
        if (A0d != null) {
            A0d.setVisibility(DbW.A01(this.A02 ? 1 : 0));
            A0d.setText(l7e.A02);
            Context A0S = AnonymousClass7TE.A0S(A0d);
            DbT.A17(A0S, A0d, 2Yu.A0A(A0S));
        }
        AnonymousClass0fU.A00(l7e.A03, A0C);
        return A0C;
    }

    public final int getCount() {
        List list = this.A00;
        if (list != null) {
            int size = list.size();
            if (Integer.valueOf(size) != null) {
                return size;
            }
        }
        throw DbU.A0h();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        Object obj;
        List list = this.A00;
        if (list != null && (obj = list.get(i)) != null) {
            return obj;
        }
        throw DbU.A0h();
    }
}
