package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GiP  reason: case insensitive filesystem */
public final class C53091GiP extends AnonymousClass3B3 {
    public static final List A00;
    public static final List A01;
    public static final List A02 = 0sr.A1P(new Float[]{Float.valueOf(3.0f), Float.valueOf(-4.0f), Float.valueOf(-17.0f), Float.valueOf(-25.0f)});

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r10) {
        float A002;
        0qQ.A0B(rect, 0);
        DbZ.A0t(1, view, recyclerView, r10);
        super.getItemOffsets(rect, view, recyclerView, r10);
        int A03 = RecyclerView.A03(view);
        Integer valueOf = Integer.valueOf(A03);
        if (A03 == -1 || valueOf == null) {
            A03 = 3;
        }
        Context A0S = AnonymousClass7TE.A0S(view);
        int A003 = (int) 0nA.A00(A0S, AnonymousClass7TG.A00(C53080GiE.A01, A03));
        view.getLayoutParams().height = A003;
        view.getLayoutParams().width = A003;
        rect.set(0, (int) 0nA.A00(A0S, AnonymousClass7TG.A00(A01, A03)), (int) 0nA.A00(A0S, AnonymousClass7TG.A00(A00, A03)), 0);
        if (r10.A00() == 1) {
            A002 = 0.0f;
        } else {
            A002 = AnonymousClass7TG.A00(A02, A03);
        }
        view.setRotation(A002);
        view.setTranslationZ(3.0f - ((float) A03));
    }

    static {
        float f;
        int i = 0;
        List<Object> list = C53080GiE.A01;
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        for (Object A04 : list) {
            A0p.add(Float.valueOf(C51967G9n.A00(AnonymousClass7TE.A04(00k.A0I(list)), AnonymousClass7TE.A04(A04))));
        }
        A01 = A0p;
        ArrayList A0p2 = AnonymousClass7TF.A0p(list);
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            float A042 = AnonymousClass7TE.A04(next);
            if (i == 0) {
                f = 0.0f;
            } else {
                f = 8.0f - A042;
            }
            A0p2.add(Float.valueOf(f));
            i = i2;
        }
        A00 = A0p2;
    }
}
