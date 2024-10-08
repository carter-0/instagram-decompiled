package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView;

/* renamed from: X.U6n  reason: case insensitive filesystem */
public abstract class C14746U6n extends ConstraintLayout {
    public LeadGenFormBaseQuestion A00;
    public X4I A01;
    public X4J A02;
    public String A03 = "";
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public static C14746U6n A00(Fragment fragment, LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        if (leadGenFormBaseQuestion.A0D.isEmpty()) {
            return new LeadGenFormShortAnswerQuestionView(fragment.requireContext(), (AttributeSet) null, 0);
        }
        return new C16016Umz(fragment.requireContext());
    }

    public final void A0F(LeadGenFormBaseQuestion leadGenFormBaseQuestion, String str) {
        0qQ.A0B(str, 1);
        this.A05 = true;
        leadGenFormBaseQuestion.A00 = str;
        X4I x4i = this.A01;
        if (x4i != null) {
            x4i.CvW(leadGenFormBaseQuestion, str);
        }
    }

    public abstract void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3);

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r6.A04 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r1 != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0122, code lost:
        if (r13.A00((android.content.Context) null, r5, X.0sn.A00, r8, false) != false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0H(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r20, boolean r21) {
        /*
            r19 = this;
            r7 = 0
            r1 = r19
            boolean r0 = r1 instanceof com.instagram.leadgen.core.ui.LeadGenFormStoreLocatorView
            r5 = r20
            if (r0 == 0) goto L_0x0013
            X.0qQ.A0B(r5, r7)
            java.lang.String r0 = r5.A00
            boolean r0 = X.C51966G9m.A1X(r0)
            return r0
        L_0x0013:
            boolean r0 = r1 instanceof com.instagram.leadgen.core.ui.LeadGenFormSliderQuestionView
            if (r0 == 0) goto L_0x0025
            X.0qQ.A0B(r5, r7)
            java.lang.String r0 = r5.A00
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            return r0
        L_0x0025:
            boolean r0 = r1 instanceof com.instagram.leadgen.core.ui.LeadGenFormSingleMultipleChoiceQuestionView
            if (r0 == 0) goto L_0x002b
            r0 = 1
            return r0
        L_0x002b:
            boolean r0 = r1 instanceof com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView
            r8 = r21
            if (r0 == 0) goto L_0x006a
            r6 = r1
            com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView r6 = (com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView) r6
            X.0qQ.A0B(r5, r7)
            com.instagram.igds.components.form.IgFormField r4 = r6.A01
            r0 = 1
            X.0qQ.A0B(r4, r0)
            X.WXy r3 = new X.WXy
            r3.<init>(r4, r5, r6, r7, r8)
            r4.setRuleChecker(r3)
            r2 = 1
            r6.A07 = r0
            r4.A0E()
            r6.A07 = r7
            boolean r0 = r5.A0I
            if (r0 == 0) goto L_0x0056
            boolean r0 = r6.A04
            r3 = 1
            if (r0 != 0) goto L_0x0057
        L_0x0056:
            r3 = 0
        L_0x0057:
            java.lang.String r0 = r5.A00
            boolean r1 = X.00l.A0W(r0)
            X.WXx r0 = new X.WXx
            r0.<init>(r5, r6, r7, r8)
            r4.setRuleChecker(r0)
            if (r1 == 0) goto L_0x0069
        L_0x0067:
            if (r3 == 0) goto L_0x00bb
        L_0x0069:
            return r2
        L_0x006a:
            boolean r0 = r1 instanceof X.C16016Umz
            if (r0 == 0) goto L_0x008e
            X.Umz r1 = (X.C16016Umz) r1
            X.0qQ.A0B(r5, r7)
            java.lang.String r0 = r5.A00
            boolean r2 = X.00l.A0W(r0)
            com.instagram.common.ui.base.IgTextView r1 = r1.A00
            if (r2 == 0) goto L_0x0088
            java.lang.String r0 = r5.A05
            r1.setText(r0)
            r1.setVisibility(r7)
        L_0x0085:
            r0 = r2 ^ 1
            return r0
        L_0x0088:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0085
        L_0x008e:
            boolean r0 = r1 instanceof X.C16017Un5
            if (r0 == 0) goto L_0x00bd
            X.Un5 r1 = (X.C16017Un5) r1
            X.0qQ.A0B(r5, r7)
            r2 = 1
            r1.A02 = r2
            X.C16017Un5.A01(r1)
            r1.A07 = r2
            com.instagram.igds.components.form.IgFormField r0 = r1.A04
            r0.A0E()
            r1.A07 = r7
            X.Vtk r9 = X.C18532Vtk.A00
            r10 = 0
            java.lang.String r0 = r5.A00
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x00bb
            X.0sn r12 = X.0sn.A00
            r11 = r5
            r13 = r8
            r14 = r7
            boolean r3 = r9.A00(r10, r11, r12, r13, r14)
            goto L_0x0067
        L_0x00bb:
            r2 = 0
            return r2
        L_0x00bd:
            boolean r0 = r1 instanceof com.instagram.leadgen.core.ui.LeadGenFormDateTimeQuestionView
            if (r0 == 0) goto L_0x00cb
            X.0qQ.A0B(r5, r7)
            java.lang.String r0 = r5.A00
            boolean r0 = X.C51966G9m.A1X(r0)
            return r0
        L_0x00cb:
            r12 = r1
            X.Un0 r12 = (X.Un0) r12
            X.0qQ.A0B(r5, r7)
            r2 = 0
            r1 = 1
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0125
            boolean r0 = r5.A0I
            if (r0 == 0) goto L_0x0125
            r13 = 1
        L_0x00dc:
            com.instagram.igds.components.form.IgFormField r10 = r12.A02
            X.0qQ.A0B(r10, r1)
            X.WXy r9 = new X.WXy
            r11 = r5
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            r10.setRuleChecker(r9)
            r12.A07 = r1
            r10.A0E()
            r12.A07 = r7
            boolean r0 = r12.A04
            r14 = 0
            if (r0 == 0) goto L_0x010d
            boolean r0 = r5.A0I
            if (r0 == 0) goto L_0x010d
            java.lang.String r0 = r5.A00
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x010d
        L_0x0103:
            r2 = 1
        L_0x0104:
            X.WXx r0 = new X.WXx
            r0.<init>(r5, r12, r1, r8)
            r10.setRuleChecker(r0)
            return r2
        L_0x010d:
            X.Vtk r13 = X.C18532Vtk.A00
            java.lang.String r0 = r5.A00
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0104
            X.0sn r16 = X.0sn.A00
            r15 = r5
            r17 = r8
            r18 = r7
            boolean r0 = r13.A00(r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x0104
            goto L_0x0103
        L_0x0125:
            r13 = 0
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14746U6n.A0H(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion, boolean):boolean");
    }

    public final void setLastKnownInput(String str) {
        0qQ.A0B(str, 0);
        this.A03 = str;
    }

    public final String A0D(String str) {
        if ((this instanceof C16014Umv) || (this instanceof C16013Umu)) {
            0qQ.A0B(str, 0);
            String A08 = C8640Qyd.A01.A07(C12614Szy.A01("()-.")).A08(str);
            0qQ.A07(A08);
            return A08;
        }
        0qQ.A0B(str, 0);
        return str;
    }

    public final void A0E() {
        IgFormField igFormField;
        if (this instanceof LeadGenFormShortAnswerQuestionView) {
            igFormField = ((LeadGenFormShortAnswerQuestionView) this).A01;
        } else if (this instanceof C16017Un5) {
            igFormField = ((C16017Un5) this).A04;
        } else if (this instanceof Un0) {
            igFormField = ((Un0) this).A02;
        } else {
            return;
        }
        igFormField.getMEditText().requestFocus();
        C13991Tnr.A07(igFormField.getMEditText().getContext()).showSoftInput(igFormField.getMEditText(), 1);
    }

    public final boolean getEnableOptionalQuestions() {
        return this.A04;
    }

    public final boolean getHasBeenEdited() {
        return this.A05;
    }

    public final String getLastKnownInput() {
        return this.A03;
    }

    public final LeadGenFormBaseQuestion getQuestion() {
        return this.A00;
    }

    public final void setEnableOptionalQuestions(boolean z) {
        this.A04 = z;
    }

    public final void setHasBeenEdited(boolean z) {
        this.A05 = z;
    }

    public final void setOnAnswerChangeListener(X4I x4i) {
        this.A01 = x4i;
    }

    public final void setOnUserInputCompleteListener(X4J x4j) {
        this.A02 = x4j;
    }

    public final void setPrismMode(boolean z) {
        this.A06 = z;
    }

    public final void setQuestion(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        this.A00 = leadGenFormBaseQuestion;
    }

    public final void setRechecking(boolean z) {
        this.A07 = z;
    }

    public C14746U6n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
