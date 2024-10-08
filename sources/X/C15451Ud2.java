package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ud2  reason: case insensitive filesystem */
public final class C15451Ud2 extends C331047Ph {
    public VZT A00;
    public final List A01 = new ArrayList();

    public C15451Ud2(VZT vzt, VSB vsb) {
        this.A00 = vzt;
        int size = vzt.A04.size();
        for (int i = 0; i < size; i++) {
            this.A01.add(new C15509Udy(AnonymousClass7TF.A1W(this.A00.A01, AnonymousClass05K.A01)));
        }
        if (this.A00.A01 == AnonymousClass05K.A01) {
            this.A01.add(new C15510Udz(vsb));
        }
        A0A(this.A01);
        A0C();
    }

    public final void A0C() {
        A06();
        VZT vzt = this.A00;
        List list = vzt.A04;
        0qQ.A07(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            Object obj2 = this.A01.get(i);
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.common.adapter.bindergroup.BinderGroup<com.instagram.feed.model.MultiQuestionSurvey.PossibleAnswer, java.lang.Void>");
            A08((C231642s0) obj2, obj);
        }
        if (vzt.A01 == AnonymousClass05K.A01) {
            Object A0r = C66582MXn.A0r(this.A01);
            0qQ.A0C(A0r, "null cannot be cast to non-null type com.instagram.common.adapter.bindergroup.BinderGroup<com.instagram.feed.model.MultiQuestionSurvey.Question, java.lang.Void>");
            A08((C231642s0) A0r, vzt);
        }
        A07();
    }
}
