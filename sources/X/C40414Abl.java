package X;

import android.content.Context;
import android.text.Editable;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.Abl  reason: case insensitive filesystem */
public final /* synthetic */ class C40414Abl implements C358398aq {
    public final /* synthetic */ C353798Jc A00;

    public /* synthetic */ C40414Abl(C353798Jc r1) {
        this.A00 = r1;
    }

    public final void Dr1() {
        Integer num;
        Integer num2;
        C353798Jc r4 = this.A00;
        ConstrainedEditText constrainedEditText = r4.A0D;
        constrainedEditText.getClass();
        AnonymousClass91a r0 = r4.A08;
        if (r0 != null) {
            num = r0.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        C358948bj.A04(constrainedEditText, r4.A0U, (C279284yO) null, (C306576Mr) null, num);
        Context context = r4.A0P;
        ConstrainedEditText constrainedEditText2 = r4.A0D;
        constrainedEditText2.getClass();
        AnonymousClass9UR.A02(context, constrainedEditText2);
        C360778f8 r02 = r4.A0A;
        r02.getClass();
        r02.A09();
        AnonymousClass91N r1 = r4.A09;
        r1.getClass();
        AnonymousClass91a r03 = r4.A08;
        if (r03 != null) {
            num2 = r03.A00;
        } else {
            num2 = AnonymousClass05K.A01;
        }
        r1.A01(num2);
        ConstrainedEditText constrainedEditText3 = r4.A0D;
        if (constrainedEditText3 != null) {
            constrainedEditText3.post(new C40856AkQ(r4));
        }
        C353798Jc.A0B(r4);
        ConstrainedEditText constrainedEditText4 = r4.A0D;
        if (constrainedEditText4 != null) {
            Editable text = constrainedEditText4.getText();
            0qQ.A0A(text);
            C358948bj.A03(text);
            constrainedEditText4.invalidate();
        }
    }
}
