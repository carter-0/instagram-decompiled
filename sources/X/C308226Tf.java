package X;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Tf  reason: invalid class name and case insensitive filesystem */
public abstract class C308226Tf {
    public static final 2Th A00 = new C308236Tg();

    public static final void A01(Context context, AnonymousClass2Ta r14, RenderTreeNode renderTreeNode, ArrayList arrayList, List list, int i, int i2) {
        int i3 = i2;
        int i4 = i;
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (r14 != null) {
            Rect rect = new Rect(i4, i3, r14.getWidth() + i, r14.getHeight() + i2);
            ArrayList arrayList2 = arrayList;
            arrayList2.size();
            List list2 = list;
            if (list != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            2Th Blo = r14.Blo();
            if (Blo != null) {
                int AnO = r14.AnO();
                RenderTreeNode A002 = A00(rect, r14, renderTreeNode, Blo);
                arrayList2.add(A002);
                List list3 = (List) renderTreeNode.A08.getValue();
                if (AnO > 0) {
                    list3.add(A002);
                    renderTreeNode2 = A002;
                } else {
                    list3.add(A002);
                }
                i4 = 0;
                i3 = 0;
            }
            int AnO2 = r14.AnO();
            for (int i5 = 0; i5 < AnO2; i5++) {
                A01(context, r14.AnD(i5), renderTreeNode2, arrayList2, list2, r14.CGw(i5) + i4, r14.CHT(i5) + i3);
            }
        }
    }

    public static final RenderTreeNode A00(Rect rect, AnonymousClass2Ta r7, RenderTreeNode renderTreeNode, 2Th r9) {
        Rect rect2;
        int i;
        if (r7.Ba9() == 0 && r7.BaC() == 0 && r7.BaB() == 0 && r7.Ba8() == 0) {
            rect2 = null;
        } else {
            rect2 = new Rect(r7.Ba9(), r7.BaC(), r7.BaB(), r7.Ba8());
        }
        Object BLp = r7.BLp();
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (renderTreeNode != null) {
            i = ((List) renderTreeNode.A08.getValue()).size();
        } else {
            i = 0;
        }
        return new RenderTreeNode(rect, rect2, renderTreeNode2, r9, BLp, i);
    }
}
