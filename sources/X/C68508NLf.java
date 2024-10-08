package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.NLf  reason: case insensitive filesystem */
public final class C68508NLf extends C336937fQ {
    public final Context A00;
    public final LayoutInflater A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C68508NLf(Context context) {
        this.A00 = context;
        this.A01 = LayoutInflater.from(context);
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1402519856);
        if (view == null) {
            view = DbU.A08(this.A01, R.layout.reporting_bottom_sheet_title_row);
            view.setTag(new OD1(view));
        }
        Context context = this.A00;
        OD1 od1 = (OD1) DbT.A0o(view);
        String str = (String) obj;
        OGX ogx = (OGX) obj2;
        Resources resources = context.getResources();
        int i2 = 0;
        od1.A00.setPadding(0, resources.getDimensionPixelSize(C66582MXn.A07(ogx.A03)), 0, resources.getDimensionPixelSize(C66582MXn.A07(ogx.A00)));
        Integer num = ogx.A01;
        if (num != null) {
            od1.A01.setTextSize(0, (float) C66581MXm.A03(resources, num));
        }
        TextView textView = od1.A01;
        textView.setText(str);
        if (ogx.A04) {
            i2 = 17;
        }
        textView.setGravity(i2);
        AnonymousClass0fD.A0A(979743161, A03);
        return view;
    }
}
