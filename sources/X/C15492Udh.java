package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;

/* renamed from: X.Udh  reason: case insensitive filesystem */
public final class C15492Udh extends C231632rz {
    public Context A00;
    public X38 A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1608820144);
        VRD vrd = (VRD) DbT.A0o(view);
        AnalyticsEventDebugInfo analyticsEventDebugInfo = (AnalyticsEventDebugInfo) obj;
        X38 x38 = this.A01;
        AnonymousClass7TG.A1T(vrd, analyticsEventDebugInfo, x38);
        TextView textView = vrd.A01;
        0qQ.A0A(textView);
        textView.setText(analyticsEventDebugInfo.A00);
        LinearLayout linearLayout = vrd.A00;
        0qQ.A0A(linearLayout);
        WBH.A01(linearLayout, 6, analyticsEventDebugInfo, x38);
        AnonymousClass0fD.A0A(196373218, A03);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.VRD] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(2102072552);
        Context context = this.A00;
        0qQ.A0B(context, 0);
        ? obj = new Object();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        obj.A01 = textView;
        textView.setTextSize(12.0f);
        TextView textView2 = obj.A01;
        0qQ.A0A(textView2);
        textView2.setPadding(50, 50, 50, 50);
        View view = new View(context);
        Pxf.A1B(view, context.getColor(17170432));
        view.setMinimumHeight(1);
        linearLayout.addView(obj.A01);
        linearLayout.addView(view);
        linearLayout.setTag(obj);
        obj.A00 = linearLayout;
        AnonymousClass0fD.A0A(-2125326138, A03);
        return linearLayout;
    }
}
