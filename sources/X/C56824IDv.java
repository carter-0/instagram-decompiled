package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.util.LinkedHashSet;

/* renamed from: X.IDv  reason: case insensitive filesystem */
public final class C56824IDv implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56824IDv(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onGlobalLayout() {
        LinkedHashSet A002;
        LinkedHashSet A003;
        AnonymousClass6LP r0;
        switch (this.A00) {
            case 0:
                Reference reference = (Reference) this.A02;
                View view = (View) reference.get();
                if (view != null) {
                    C51971G9r.A0z(view, this);
                }
                View view2 = (View) reference.get();
                if (view2 != null) {
                    int width = view2.getWidth();
                    0sP r02 = (0sP) ((Reference) this.A01).get();
                    if (r02 != null) {
                        C51967G9n.A0w(width, r02);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TextView textView = (TextView) this.A01;
                if (textView.getLayout() != null) {
                    if (textView.getLayout().getEllipsisCount(textView.getLayout().getLineCount() - 1) > 0) {
                        C56801ICy.A01(textView, 1, this.A02);
                    } else {
                        DbT.A1H(textView);
                    }
                    textView.getViewTreeObserver().removeOnGlobalLayoutListener(new LZ0(textView, 10));
                    return;
                }
                return;
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.A01;
                C51967G9n.A0y(viewGroup, this);
                I0F i0f = C52504GVh.A04;
                A002 = I0F.A00(viewGroup, i0f, 14);
                A003 = I0F.A00(viewGroup, i0f, 15);
                r0 = (AnonymousClass6LP) this.A02;
                break;
            default:
                ViewGroup viewGroup2 = (ViewGroup) this.A01;
                C51967G9n.A0y(viewGroup2, this);
                I0F i0f2 = C52504GVh.A04;
                A002 = I0F.A00(viewGroup2, i0f2, 14);
                A003 = I0F.A00(viewGroup2, i0f2, 15);
                IZD izd = ((C52682Gau) this.A02).A03;
                if (izd == null || (r0 = izd.A00) == null) {
                    return;
                }
        }
        r0.A00 = A002.size() + A003.size();
        AnonymousClass6LP.A02(r0, C273654mx.A00(3007));
    }
}
