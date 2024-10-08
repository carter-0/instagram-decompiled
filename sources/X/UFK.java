package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.List;

public final class UFK extends 08m {
    public final C17376VTd A00;
    public final List A01;

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        RecyclerView recyclerView;
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.size_chart_page, viewGroup, false);
        VWW vww = new VWW(inflate);
        VTX vtx = (VTX) this.A01.get(i);
        while (true) {
            recyclerView = vww.A01;
            if (recyclerView.A12.size() <= 0) {
                break;
            }
            recyclerView.A0n(0);
        }
        while (true) {
            RecyclerView recyclerView2 = vww.A02;
            if (recyclerView2.A12.size() > 0) {
                recyclerView2.A0n(0);
            } else {
                VWX vwx = vtx.A00;
                recyclerView.A11(new C14807UAd(recyclerView.getContext(), vwx.A02.length));
                recyclerView.setAdapter(new U9m(vwx, 2));
                VWY vwy = vtx.A01;
                Context context = recyclerView2.getContext();
                String[][] strArr = vwy.A02;
                recyclerView2.setLayoutManager(new GridLayoutManager(context, strArr[0].length, 1, false));
                recyclerView2.A11(new C14807UAd(context, strArr[0].length));
                recyclerView2.A11(new C14806UAc(context, strArr[0].length));
                recyclerView2.setAdapter(new U9m(vwy, 3));
                C17376VTd vTd = this.A00;
                vTd.A01.add(recyclerView2);
                recyclerView2.A15(vTd.A00);
                viewGroup.addView(inflate);
                return vww;
            }
        }
    }

    public final int getCount() {
        return this.A01.size();
    }

    public UFK(C17376VTd vTd, List list) {
        this.A01 = list;
        this.A00 = vTd;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        DbY.A1S(viewGroup, obj);
        VWW vww = (VWW) obj;
        C17376VTd vTd = this.A00;
        RecyclerView recyclerView = vww.A02;
        vTd.A01.remove(recyclerView);
        recyclerView.A16(vTd.A00);
        viewGroup.removeView(vww.A00);
    }

    public final boolean isViewFromObject(View view, Object obj) {
        AnonymousClass7TG.A1N(view, obj);
        return AnonymousClass7TF.A1W(view, ((VWW) obj).A00);
    }
}
