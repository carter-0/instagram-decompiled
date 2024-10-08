package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.9N1  reason: invalid class name */
public final class AnonymousClass9N1 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        UserSession userSession;
        0Pl r6;
        int i = this.A00;
        View view = (View) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        0qQ.A0B(view, 0);
        Object obj3 = this.A06;
        if (i != 0) {
            C279094y4 r0 = (C279094y4) obj3;
            userSession = r0.A00;
            r6 = r0.A02;
        } else {
            C274134nl r02 = (C274134nl) obj3;
            userSession = r02.A00;
            r6 = r02.A02;
        }
        C246673ez.A06(view, userSession, (1Xj) this.A03, (1Xj) this.A04, r6, this.A07, ((AnonymousClass0iw) this.A05).getModuleName(), this.A02 + 1, this.A01, booleanValue);
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9N1(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A06 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A07 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = obj4;
    }
}
