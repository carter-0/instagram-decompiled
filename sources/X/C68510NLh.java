package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.NLh  reason: case insensitive filesystem */
public final class C68510NLh extends C336937fQ {
    public final Context A00;
    public final LayoutInflater A01;
    public final AnonymousClass0iw A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C68510NLh(Context context, AnonymousClass0iw r3) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = LayoutInflater.from(context);
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        int i3;
        int A03 = AnonymousClass0fD.A03(-970972505);
        if (view == null) {
            LayoutInflater layoutInflater = this.A01;
            0qQ.A0B(layoutInflater, 0);
            view = DbU.A08(layoutInflater, R.layout.reporting_bottom_sheet_image_row);
            0qQ.A0A(view);
            view.setTag(new C70601OCy(view));
        }
        Context context = this.A00;
        AnonymousClass0iw r7 = this.A02;
        C70601OCy oCy = (C70601OCy) DbT.A0o(view);
        C70709OHe oHe = (C70709OHe) obj2;
        0qQ.A0B(context, 0);
        AnonymousClass7TG.A1U(r7, oCy, oHe);
        Resources resources = context.getResources();
        Integer num = oHe.A05;
        Integer num2 = oHe.A01;
        View view2 = oCy.A00;
        if (num != null) {
            i2 = C66581MXm.A03(resources, num);
        } else {
            i2 = 0;
        }
        if (num2 != null) {
            i3 = C66581MXm.A03(resources, num2);
        } else {
            i3 = 0;
        }
        view2.setPadding(0, i2, 0, i3);
        Integer num3 = oHe.A03;
        ImageUrl imageUrl = oHe.A00;
        if (num3 != null) {
            DbU.A13(context, oCy.A01, num3.intValue());
        } else if (imageUrl != null) {
            oCy.A01.setUrl(imageUrl, r7);
        }
        Integer num4 = oHe.A04;
        if (num4 != null) {
            DbU.A14(context, oCy.A01, num4.intValue());
        }
        IgImageView igImageView = oCy.A01;
        ViewGroup.LayoutParams layoutParams = igImageView.getLayoutParams();
        Integer num5 = oHe.A02;
        if (num5 != null) {
            DbT.A1B(resources, layoutParams, num5.intValue());
        } else {
            layoutParams.height = -2;
        }
        Integer num6 = oHe.A06;
        if (num6 != null) {
            layoutParams.width = C66581MXm.A03(resources, num6);
        } else {
            layoutParams.width = -2;
        }
        igImageView.setLayoutParams(layoutParams);
        view2.requestLayout();
        AnonymousClass0fD.A0A(1522357924, A03);
        return view;
    }
}
