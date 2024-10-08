package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ue8  reason: case insensitive filesystem */
public final class C15519Ue8 extends C231632rz {
    public final Context A00;
    public final View.OnClickListener A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String string;
        int A03 = AnonymousClass0fD.A03(-894465484);
        V3V v3v = (V3V) obj;
        Context context = this.A00;
        C17521VZa vZa = (C17521VZa) DbT.A0o(view);
        View.OnClickListener onClickListener = this.A01;
        DbT.A18(context, vZa.A03, 2131963491);
        TextView textView = vZa.A04;
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse = v3v.A00;
        textView.setText(locationPageInfoPageOperationHourResponse.A01);
        vZa.A02.setText(locationPageInfoPageOperationHourResponse.A02);
        ImageView imageView = vZa.A00;
        AnonymousClass0fU.A00(onClickListener, imageView);
        LinearLayout linearLayout = vZa.A01;
        linearLayout.setVisibility(DbW.A01(v3v.A01 ? 1 : 0));
        List<LocationPageInfoPageOperationHour> list = locationPageInfoPageOperationHourResponse.A04;
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        for (LocationPageInfoPageOperationHour locationPageInfoPageOperationHour : list) {
            String str = locationPageInfoPageOperationHour.A00;
            0qQ.A0B(str, 1);
            Number A14 = C51966G9m.A14(AnonymousClass7TF.A0j(str), VK2.DAYS_IN_A_WEEK);
            if (!(A14 == null || (string = context.getString(A14.intValue())) == null)) {
                str = string;
            }
            List list2 = locationPageInfoPageOperationHour.A01;
            if (!list2.isEmpty()) {
                Iterator it = list2.iterator();
                String str2 = str;
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    View inflate = LayoutInflater.from(context).inflate(R.layout.location_page_info_page_business_hour_row, linearLayout, false);
                    if (str2 != null) {
                        DbX.A1E(inflate, str, R.id.left_title);
                        str2 = null;
                    }
                    DbX.A1E(inflate, A18, R.id.right_title);
                    linearLayout.addView(inflate);
                }
            } else {
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.location_page_info_page_business_hour_row, linearLayout, false);
                DbX.A1E(inflate2, str, R.id.left_title);
                DbT.A18(context, DbU.A0G(inflate2, R.id.right_title), 2131956204);
                linearLayout.addView(inflate2);
            }
        }
        if (list.isEmpty()) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            boolean z = v3v.A01;
            int i2 = R.drawable.down_chevron;
            if (z) {
                i2 = R.drawable.up_chevron;
            }
            DbU.A13(context, imageView, i2);
        }
        AnonymousClass0fD.A0A(-460603277, A03);
    }

    public C15519Ue8(Context context, View.OnClickListener onClickListener) {
        this.A00 = context;
        this.A01 = onClickListener;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(133869633);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.location_page_info_page_business_hours_expandable_row);
        A0C.setTag(new C17521VZa(A0C));
        AnonymousClass0fD.A0A(631400218, A03);
        return A0C;
    }
}
