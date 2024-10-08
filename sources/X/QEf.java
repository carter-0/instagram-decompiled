package X;

import android.graphics.Rect;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public abstract class QEf extends AnonymousClass3B3 {
    public static final 0sP A01 = C13360TWu.A00;
    public 0sP A00;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r20) {
        AnonymousClass3AW r3 = r20;
        RecyclerView recyclerView2 = recyclerView;
        View view2 = view;
        Rect rect2 = rect;
        C51974G9v.A1O(rect2, view2, recyclerView2, r3);
        C245983dn.A02((String) null);
        0sP r2 = this.A00;
        if (r2 == null) {
            r2 = A01;
            C62320sa r10 = PzN.A05;
            2SO r1 = 2SO.A03;
            long currentTimeMillis = System.currentTimeMillis();
            if (r1.compareTo(2SN.A00()) >= 0) {
                Set set = 2SN.A00;
                if (!set.isEmpty()) {
                    ArrayList<2SM> arrayList = null;
                    for (Object next : set) {
                        String[] strArr = ((2SM) next).A00;
                        if (03t.A0O("Litho.DebugInfo", strArr) || 03t.A0O("*", strArr)) {
                            if (arrayList == null) {
                                arrayList = AnonymousClass7TE.A1C();
                            }
                            arrayList.add(next);
                        }
                    }
                    if (arrayList == null) {
                        arrayList = 0sn.A00;
                    }
                    if (AnonymousClass7TE.A1b(arrayList)) {
                        LinkedHashMap A1H = AnonymousClass7TE.A1H();
                        A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "ItemDecorationWithNullMeasureFunction");
                        PzP pzP = new PzP(currentTimeMillis, "Litho.DebugInfo", (String) r10.invoke(), A1H);
                        for (2SM A002 : arrayList) {
                            A002.A00(pzP);
                        }
                    }
                }
            }
        }
        0qQ.A0B(r2, 4);
        int A03 = RecyclerView.A03(view2);
        int measuredWidth = recyclerView2.getMeasuredWidth();
        if (A03 == 0) {
            r2.invoke(view2);
            rect2.left = ((measuredWidth - view2.getMeasuredWidth()) / 2) - recyclerView2.getPaddingLeft();
        } else if (A03 == r3.A00() - 1) {
            r2.invoke(view2);
            rect2.right = ((measuredWidth - view2.getMeasuredWidth()) / 2) - recyclerView2.getPaddingRight();
        }
    }
}
