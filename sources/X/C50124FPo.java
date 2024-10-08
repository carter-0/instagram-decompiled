package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.FPo  reason: case insensitive filesystem */
public final class C50124FPo implements ViewTreeObserver.OnScrollChangedListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50124FPo(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onScrollChanged() {
        String str;
        0lg r2;
        String str2;
        String str3;
        switch (this.A00) {
            case 2:
                E4O e4o = (E4O) this.A01;
                ScrollView scrollView = (ScrollView) this.A02;
                Toast toast = e4o.A01;
                if (toast != null) {
                    toast.cancel();
                }
                Toast toast2 = e4o.A00;
                if (toast2 != null) {
                    toast2.cancel();
                }
                if (!((C49561Exw) e4o.A04.A00.get(0)).A00 && scrollView.getScrollY() > 0) {
                    ((C49561Exw) e4o.A04.A00.get(0)).A00 = true;
                    F3G f3g = e4o.A03;
                    if (f3g instanceof C47926ENd) {
                        r2 = f3g.A00;
                        str2 = f3g.A02;
                        AnonymousClass7TG.A1N(r2, str2);
                        str3 = "disclosures_v2_screen_pt1_screen_scrolled";
                    } else {
                        boolean z = f3g instanceof C47924ENb;
                        r2 = f3g.A00;
                        str2 = f3g.A02;
                        AnonymousClass7TG.A1N(r2, str2);
                        str3 = "disclosures_v2_screen_scrolled";
                        if (z) {
                        }
                    }
                    FG9.A00(r2, str3, str2);
                }
                int bottom = scrollView.getChildAt(scrollView.getChildCount() - 1).getBottom() - (scrollView.getHeight() + scrollView.getScrollY());
                if (scrollView.getVisibility() == 0 && bottom <= 0) {
                    if (scrollView.getParent() != null) {
                        F3G f3g2 = e4o.A03;
                        if (f3g2 instanceof C47926ENd) {
                            List list = f3g2.A01.A00;
                            if (!((C49561Exw) list.get(0)).A01) {
                                boolean z2 = true;
                                if (0 != list.size() - 1) {
                                    z2 = false;
                                }
                                0lg r22 = f3g2.A00;
                                String str4 = f3g2.A02;
                                if (z2) {
                                    AnonymousClass7TF.A1H(r22, str4);
                                    str = "disclosures_v2_screen_pt2_scrolled_to_bottom";
                                } else {
                                    AnonymousClass7TF.A1H(r22, str4);
                                    str = "disclosures_v2_screen_pt1_scrolled_to_bottom";
                                }
                                FG9.A00(r22, str, str4);
                            }
                        } else {
                            boolean z3 = f3g2 instanceof C47924ENb;
                            boolean z4 = ((C49561Exw) f3g2.A01.A00.get(0)).A01;
                            if (z3) {
                                if (!z4) {
                                    0lg r23 = f3g2.A00;
                                    String str5 = f3g2.A02;
                                    AnonymousClass7TF.A1H(r23, str5);
                                    FG9.A00(r23, "disclosures_v2_screen_scrolled_to_bottom", str5);
                                }
                            } else if (!z4) {
                                0lg r24 = f3g2.A00;
                                String str6 = f3g2.A02;
                                AnonymousClass7TF.A1H(r24, str6);
                                FG9.A00(r24, "disclosures_v2_screen_scrolled_to_bottom", str6);
                            }
                        }
                    }
                    ((C49561Exw) e4o.A04.A00.get(0)).A01 = true;
                    return;
                }
                return;
            case 3:
                C3251871j.A01((RecyclerView) this.A02, (C3251871j) this.A01, 0, true);
                return;
            default:
                View view = (View) this.A01;
                if (view.isShown() && view.getGlobalVisibleRect(new Rect())) {
                    ((AnonymousClass5Gv) this.A02).A06();
                    if (view.getViewTreeObserver().isAlive()) {
                        view.getViewTreeObserver().removeOnScrollChangedListener(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
