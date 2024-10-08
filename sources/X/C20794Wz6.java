package X;

import android.text.Layout;
import android.text.SpannableString;
import java.util.List;

/* renamed from: X.Wz6  reason: case insensitive filesystem */
public final class C20794Wz6 extends 0Yg implements 0sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Layout A01;
    public final /* synthetic */ C17820VgZ A02;
    public final /* synthetic */ List A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20794Wz6(Layout layout, C17820VgZ vgZ, List list, float f) {
        super(4);
        this.A01 = layout;
        this.A02 = vgZ;
        this.A00 = f;
        this.A03 = list;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SpannableString spannableString = (SpannableString) obj;
        0eP r13 = (0eP) obj2;
        0eP r14 = (0eP) obj3;
        int A0M = AnonymousClass7TE.A0M(obj4);
        AnonymousClass7TG.A1N(spannableString, r13);
        Layout layout = this.A01;
        0qQ.A0A(layout);
        Number number = (Number) r13.A00;
        int intValue = number.intValue();
        Number number2 = (Number) r13.A01;
        CharSequence subSequence = spannableString.subSequence(intValue, number2.intValue());
        0qQ.A07(subSequence);
        U2L u2l = new U2L(layout, this.A02, subSequence, this.A00, A0M);
        List list = this.A03;
        0eP r2 = r14;
        if (r14 == null) {
            r2 = r13;
        }
        int A0M2 = AnonymousClass7TE.A0M(r2.A00);
        if (r14 == null) {
            r14 = r13;
        }
        list.add(new C15048ULb(A0M2, C51969G9p.A0A(r14), u2l.A01.getWidth(), A0M, 4));
        spannableString.setSpan(u2l, number.intValue(), number2.intValue(), 33);
        return C60340gF.A00;
    }
}
