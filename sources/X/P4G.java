package X;

import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.instagram.direct.ui.polls.PollMessageOptionView;
import java.util.List;
import java.util.Map;

public final class P4G implements C74457PvC {
    public String A00;
    public O74 A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final Map A03 = AnonymousClass7TE.A1H();

    private final void A00(View view) {
        LinearLayout linearLayout;
        CharSequence charSequence;
        List list = this.A02;
        if (list.size() <= 1) {
            return;
        }
        if (list.indexOf(view) != DbT.A02(list, 1) || (charSequence = (CharSequence) C51968G9o.A10(this.A03, view.getId())) == null || charSequence.length() != 0) {
            this.A03.remove(Integer.valueOf(view.getId()));
            list.remove(view);
            O74 o74 = this.A01;
            if ((view instanceof PollMessageOptionView) && (linearLayout = o74.A00.A01) != null) {
                linearLayout.removeView(view);
            }
            A01(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (A02(r3) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.P4G r3) {
        /*
            X.O74 r2 = r3.A01
            java.lang.String r0 = r3.A00
            if (r0 == 0) goto L_0x0013
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0013
            boolean r0 = A02(r3)
            r1 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            X.NK1 r0 = r2.A00
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r0.A05
            if (r0 == 0) goto L_0x001d
            r0.setPrimaryButtonEnabled(r1)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P4G.A01(X.P4G):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(X.P4G r5) {
        /*
            java.util.Map r1 = r5.A03
            int r0 = r1.size()
            r5 = 0
            r4 = 1
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r1)
            if (r0 <= r4) goto L_0x0033
        L_0x0012:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r0 = r1.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x0012
            X.JTR.A1U(r3, r1)
            goto L_0x0012
        L_0x002c:
            int r0 = r3.size()
            if (r0 > r4) goto L_0x0054
            goto L_0x0053
        L_0x0033:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004d
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r0 = r1.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0033
            X.JTR.A1U(r3, r1)
            goto L_0x0033
        L_0x004d:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0054
        L_0x0053:
            r5 = 1
        L_0x0054:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P4G.A02(X.P4G):boolean");
    }

    public final void A03() {
        NK1 nk1 = this.A01.A00;
        PollMessageOptionView pollMessageOptionView = new PollMessageOptionView(nk1.requireContext(), (AttributeSet) null, 0);
        pollMessageOptionView.setId(View.generateViewId());
        LinearLayout linearLayout = nk1.A01;
        if (linearLayout != null) {
            linearLayout.addView(pollMessageOptionView);
        }
        NestedScrollView nestedScrollView = nk1.A02;
        if (nestedScrollView != null) {
            nestedScrollView.postDelayed(new C73202PYg(nestedScrollView, pollMessageOptionView), nk1.A0E);
        }
        pollMessageOptionView.A01 = this;
        this.A03.put(Integer.valueOf(pollMessageOptionView.getId()), "");
        this.A02.add(pollMessageOptionView);
    }

    public final void DGE(View view, boolean z) {
        if (z) {
            A00(view);
        }
    }

    public final void Dr0(View view, CharSequence charSequence) {
        CharSequence charSequence2;
        if (charSequence != null) {
            Map map = this.A03;
            C51967G9n.A1O(charSequence, map, view.getId());
            List list = this.A02;
            View view2 = (View) list.get(list.size() - 1);
            if (list.size() < 100 && (charSequence2 = (CharSequence) C51968G9o.A10(map, view2.getId())) != null && C51966G9m.A1X(charSequence2)) {
                A03();
            }
            A01(this);
        }
    }

    public P4G(O74 o74) {
        this.A01 = o74;
    }

    public final void DdN(View view) {
        A00(view);
    }
}
