package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KAp  reason: case insensitive filesystem */
public final class C61510KAp extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new C60077JfD(context);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r10, C276544tV r11, Object obj) {
        C60077JfD jfD = (C60077JfD) view;
        C51973G9u.A1E(jfD, r10, r11);
        List A0M = r11.A0M(38);
        0qQ.A07(A0M);
        float A02 = r11.A02(41, 0.0f);
        int A03 = r11.A03(35, 0);
        r11.A0R(40, false);
        ArrayList A00 = C63095KrO.A00(C63065Kqu.A00(r10, A0M, A02));
        List list = jfD.A01;
        list.clear();
        jfD.A00 = Integer.MAX_VALUE;
        jfD.removeAllViews();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            C60075Jf8 A002 = C60077JfD.A00(jfD, (C63832L8n) it.next(), A03);
            jfD.addView(A002, new ViewGroup.LayoutParams(0, -2));
            A1C.add(A002);
        }
        C60077JfD.A01(jfD, A1C);
        list.addAll(A1C);
        return null;
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C61510KAp(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r2, C276544tV r3, Object obj, Object obj2) {
    }
}
