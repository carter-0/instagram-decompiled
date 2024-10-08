package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.JGu  reason: case insensitive filesystem */
public final class C59368JGu extends 0Yg implements 0sK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C278014w6 A01;
    public final /* synthetic */ C277994w4 A02;
    public final /* synthetic */ AnonymousClass1Xp A03;
    public final /* synthetic */ C246453ed A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59368JGu(C278014w6 r2, C277994w4 r3, AnonymousClass1Xp r4, C246453ed r5, int i) {
        super(3);
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = i;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ICX icx;
        boolean A1a = AnonymousClass7TE.A1a(obj3);
        0qQ.A0B(obj, 0);
        C278014w6 r9 = this.A01;
        if (r9 != null) {
            Object obj4 = obj2;
            icx = new ICX(this.A00, 0, obj4, r9, this.A03, this.A04, A1a);
        } else {
            icx = null;
        }
        String description = this.A02.getDescription();
        if (description != null) {
            SpannableStringBuilder A0C = DbS.A0C(description);
            if (r9 != null) {
                String text = r9.getText();
                A0C.append(" ");
                if (text != null) {
                    A0C.append(text);
                    A0C.setSpan(new Q8I(3, obj, icx), DbX.A05(A0C.toString()) - text.length(), DbX.A05(A0C.toString()), 33);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            return A0C;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
