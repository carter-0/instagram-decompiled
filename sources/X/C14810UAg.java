package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.UAg  reason: case insensitive filesystem */
public final class C14810UAg extends AnonymousClass3B3 {
    public final int A00;
    public final C17606Vay A01;
    public final C307786Rm A02;
    public final C276544tV A03;
    public final Rect[] A04;

    public C14810UAg(C307786Rm r6, C276544tV r7) {
        int i;
        this.A03 = r7;
        this.A02 = r6;
        C18527Vtd vtd = C18527Vtd.A00;
        Context context = r6.A00;
        C17606Vay A002 = vtd.A00(context, r7);
        this.A01 = A002;
        int i2 = A002.A01;
        this.A00 = i2;
        boolean A003 = C16919VAw.A00(context);
        if (i2 == 1) {
            i = A002.A00;
        } else {
            i = A002.A03;
        }
        this.A04 = V5C.A00(i2, i, A002.A02, A003);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r13) {
        C339907kM r4;
        int i;
        List unmodifiableList;
        Rect rect2;
        boolean A1b = C51973G9u.A1b(rect, view, recyclerView);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C339907kM) && (r4 = (C339907kM) layoutParams) != null) {
            int A032 = RecyclerView.A03(view);
            C276544tV r8 = this.A03;
            Object obj = r8.A0L().get(A032);
            0qQ.A07(obj);
            C276544tV A07 = ((C276544tV) obj).A07(132);
            boolean z = false;
            if (A07 != null && A07.A04 == 16482) {
                z = A07.A0R(36, false);
            }
            r4.A01 = z;
            List list = ((Ty7) C13988Tno.A0V(this.A02, r8)).A08;
            if (!(list == null || (unmodifiableList = Collections.unmodifiableList(list)) == null || (rect2 = (Rect) 00k.A0O(unmodifiableList, A032)) == null)) {
                if (this.A00 == A1b) {
                    rect.top = rect2.top;
                    rect.bottom = rect2.bottom;
                } else {
                    rect.left = rect2.left;
                    rect.right = rect2.right;
                }
            }
            Rect[] rectArr = this.A04;
            AnonymousClass9ND r0 = r4.A00;
            if (r0 == null) {
                i = -1;
            } else {
                i = r0.A04;
            }
            Rect rect3 = (Rect) 03t.A06(rectArr, i);
            if (!z && rect3 != null) {
                if (this.A00 == A1b) {
                    rect.left = rect3.left;
                    rect.right = rect3.right;
                    return;
                }
                rect.top = rect3.top;
                rect.bottom = rect3.bottom;
            }
        }
    }
}
