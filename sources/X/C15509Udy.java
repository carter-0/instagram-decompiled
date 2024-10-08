package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Udy  reason: case insensitive filesystem */
public final class C15509Udy extends C231632rz {
    public final boolean A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A7U(0);
        }
    }

    public C15509Udy(boolean z) {
        this.A00 = z;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(7889590);
        AnonymousClass7TG.A1O(view, obj);
        if (view.getTag() != null) {
            if (i == 0) {
                Object tag = view.getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.survey.SurveyQuestionViewBinder.Holder");
                C17430VVj vVj = (C17430VVj) tag;
                VY0 vy0 = (VY0) obj;
                int i2 = 0;
                AnonymousClass7TF.A1H(vVj, vy0);
                TextView textView = vVj.A02;
                if (textView != null) {
                    textView.setText(vy0.A01);
                }
                if (1AW.A06(0Tu.A05, 18303063261516958L)) {
                    ImageView imageView = vVj.A01;
                    if (imageView != null) {
                        if (!vy0.A03) {
                            i2 = 8;
                        }
                        imageView.setVisibility(i2);
                    }
                    CheckBox checkBox = vVj.A00;
                    if (checkBox != null) {
                        checkBox.setChecked(vy0.A03);
                    }
                }
                ImageView imageView2 = vVj.A01;
                if (imageView2 != null) {
                    imageView2.setEnabled(vy0.A03);
                }
                ImageView imageView3 = vVj.A01;
                if (imageView3 != null) {
                    imageView3.setSelected(vy0.A03);
                }
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Unsupported view type");
                AnonymousClass0fD.A0A(187582686, A03);
                throw illegalStateException;
            }
        }
        AnonymousClass0fD.A0A(-167453006, A03);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.VVj] */
    public final View createView(int i, ViewGroup viewGroup) {
        int i2;
        ImageView imageView;
        int A04 = DbX.A04(viewGroup, 482523542);
        if (i == 0) {
            Context context = viewGroup.getContext();
            boolean z = this.A00;
            0Tu r8 = 0Tu.A05;
            boolean A06 = 1AW.A06(r8, 18303063261516958L);
            LayoutInflater from = LayoutInflater.from(context);
            if (A06) {
                i2 = R.layout.answer_row_new_single_choice;
                if (z) {
                    i2 = R.layout.answer_row_new;
                }
            } else {
                i2 = R.layout.answer_row;
            }
            View A0A = DbU.A0A(from, viewGroup, i2, false);
            ? obj = new Object();
            obj.A02 = AnonymousClass7TE.A0d(A0A, R.id.text);
            obj.A01 = DbS.A0G(A0A, R.id.check);
            obj.A00 = (CheckBox) A0A.findViewById(R.id.check_box);
            if (1AW.A06(r8, 18303063261516958L)) {
                if (!z) {
                    ImageView imageView2 = obj.A01;
                    if (imageView2 != null) {
                        imageView2.setEnabled(false);
                        imageView2.setVisibility(8);
                    }
                } else {
                    TextView textView = obj.A02;
                    if (textView != null) {
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams.addRule(9, -1);
                        layoutParams.addRule(20, -1);
                        textView.setLayoutParams(layoutParams);
                    }
                }
            } else if (z && (imageView = obj.A01) != null) {
                imageView.setEnabled(false);
            }
            A0A.setTag(obj);
            AnonymousClass0fD.A0A(1248673214, A04);
            return A0A;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unsupported view type");
        AnonymousClass0fD.A0A(-311734117, A04);
        throw illegalStateException;
    }
}
