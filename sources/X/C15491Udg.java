package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;

/* renamed from: X.Udg  reason: case insensitive filesystem */
public final class C15491Udg extends C231632rz {
    public Context A00;
    public R8Z A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        LinearLayout linearLayout;
        WBH wbh;
        String A002;
        int A03 = AnonymousClass0fD.A03(-559855396);
        VV9 vv9 = (VV9) DbT.A0o(view);
        C17194VLy vLy = (C17194VLy) obj2;
        AnalyticsEventEntry analyticsEventEntry = (AnalyticsEventEntry) obj;
        R8Z r8z = this.A01;
        TextView textView = vv9.A01;
        String str = analyticsEventEntry.A02;
        String str2 = str;
        String str3 = "null";
        if (str == null) {
            str2 = str3;
        }
        textView.setText(str2);
        TextView textView2 = vv9.A02;
        Object obj3 = analyticsEventEntry.A01;
        if (obj3 != null) {
            str3 = String.valueOf(obj3);
        }
        textView2.setText(str3);
        AnalyticsEventDebugInfo analyticsEventDebugInfo = analyticsEventEntry.A00;
        if (analyticsEventDebugInfo != null) {
            int i2 = C17134VJj.A00;
            textView.setTextColor(i2);
            textView2.setTextColor(i2);
            analyticsEventDebugInfo.A00 = str;
            int size = analyticsEventDebugInfo.A01.size();
            C13988Tno.A15(textView2, size);
            if (size == 1) {
                A002 = " item";
            } else {
                A002 = C273654mx.A00(197);
            }
            textView2.append(A002);
            linearLayout = vv9.A00;
            wbh = new WBH(4, (Object) analyticsEventDebugInfo, (Object) r8z);
        } else {
            textView2.setSingleLine(!vLy.A00);
            linearLayout = vv9.A00;
            wbh = new WBH(5, (Object) analyticsEventEntry, (Object) r8z);
        }
        AnonymousClass0fU.A00(wbh, linearLayout);
        AnonymousClass0fD.A0A(-1943021279, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(163649246);
        Context context = this.A00;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        VV9 vv9 = new VV9(context, linearLayout);
        View view = new View(context);
        Pxf.A1B(view, context.getColor(17170432));
        view.setMinimumHeight(1);
        linearLayout.addView(vv9.A01);
        linearLayout.addView(vv9.A02);
        linearLayout.addView(view);
        linearLayout.setTag(vv9);
        AnonymousClass0fD.A0A(-1910366250, A03);
        return linearLayout;
    }
}
