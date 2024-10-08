package X;

import android.view.View;
import go.Seq;

/* renamed from: X.8Ol  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C355068Ol extends 03J implements 0sL {
    public C355068Ol(Object obj) {
        super(2, obj, C355048Oj.class, "buttonOnClickListener", "buttonOnClickListener(Landroid/view/View;Lcom/instagram/creation/capture/quickcapture/actionbar/ButtonName;)V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        C62636KjH kjH = (C62636KjH) obj2;
        0qQ.A0B(view, 0);
        0qQ.A0B(kjH, 1);
        C355048Oj r2 = (C355048Oj) this.receiver;
        switch (kjH.ordinal()) {
            case 1:
                C314676if r0 = r2.A0q.A00.A1a;
                if (r0 != null) {
                    ((C359318cb) r0.get()).A0K();
                    break;
                }
                break;
            case 3:
                C355048Oj.A02(view, r2);
                break;
            case 4:
                r2.A0q.A0B();
                if (r2.A16) {
                    view.performClick();
                    break;
                }
                break;
            case 6:
                r2.A0q.A01();
                break;
            case 13:
                r2.A0q.A05();
                break;
            case 16:
                r2.A0q.A00.A1M.E3H(new Object());
                27p.A01(r2.A0d).A1C(C371088xY.POST_CAPTURE_UTILITY_TOOLBAR);
                break;
            case 25:
                C355048Oj.A0H(r2);
                break;
            case 30:
                r2.A0q.A09();
                break;
            case 39:
                r2.A0q.A00.A1M.E3H(new Object());
                break;
            case Seq.NULL_REFNUM:
                r2.A0q.A00.A1M.E3H(new Object());
                break;
        }
        return C60340gF.A00;
    }
}
