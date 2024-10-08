package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Udz  reason: case insensitive filesystem */
public final class C15510Udz extends C231632rz {
    public final VSB A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C15510Udz(VSB vsb) {
        this.A00 = vsb;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1744485476);
        AnonymousClass7TG.A1O(view, obj);
        if (view.getTag() != null) {
            if (i == 0) {
                VZT vzt = (VZT) obj;
                int size = vzt.A04.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    if (((VY0) vzt.A04.get(i3)).A03) {
                        i2++;
                    }
                }
                Context A0S = AnonymousClass7TE.A0S(view);
                Object tag = view.getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.survey.MultiQuestionSurveyNextViewBinder.Holder");
                VNG vng = (VNG) tag;
                boolean A1R = AnonymousClass7TF.A1R(i2);
                VSB vsb = this.A00;
                AnonymousClass7TG.A1P(vng, vsb);
                String A16 = AnonymousClass7TE.A16(A0S, 2131974590);
                View view2 = vng.A00;
                DbW.A0B(view2, R.id.button_multi_select_next).setText(A16);
                view2.setEnabled(A1R);
                WB9.A00(AnonymousClass7TE.A0b(view2, R.id.button_multi_select_next), 18, vsb);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Unsupported view type");
                AnonymousClass0fD.A0A(-70605271, A03);
                throw illegalStateException;
            }
        }
        AnonymousClass0fD.A0A(2062890344, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1418851760);
        if (i == 0) {
            View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.answers_footer, false);
            A0A.setTag(new VNG(A0A));
            AnonymousClass0fD.A0A(1832828184, A04);
            return A0A;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unsupported view type");
        AnonymousClass0fD.A0A(785749397, A04);
        throw illegalStateException;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
