package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.K9u  reason: case insensitive filesystem */
public final class C61489K9u extends C231632rz {
    public final Context A00;
    public final Integer A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C61489K9u(Context context, Integer num) {
        this.A00 = context;
        this.A01 = num;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(882931538);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) view.requireViewById(R.id.spinner);
        Integer num = this.A01;
        if (num != null) {
            int intValue = num.intValue();
            colorFilterAlphaImageView.setNormalColor(intValue);
            colorFilterAlphaImageView.setActiveColor(intValue);
        }
        AnonymousClass0fD.A0A(1368018814, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-644140968);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.layout_loading_row);
        AnonymousClass0fD.A0A(-1405067205, A03);
        return A0C;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(489704973);
        if (view == null) {
            view = createView(i, viewGroup);
            bindView(i, view, obj, obj2);
        }
        AnonymousClass0fD.A0A(1676487418, A03);
        return view;
    }
}
