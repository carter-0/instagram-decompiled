package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;

public final class JBJ extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JBJ(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i, int i2, int i3, long j) {
        super(2);
        this.A00 = i3;
        this.A08 = str;
        this.A07 = obj;
        this.A06 = obj2;
        this.A05 = obj3;
        this.A09 = str2;
        this.A03 = j;
        this.A04 = obj4;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            int i2 = this.A02;
            long j = this.A03;
            String str = this.A08;
            String str2 = this.A09;
            UserSession userSession = (UserSession) this.A07;
            AnonymousClass0iw r3 = (AnonymousClass0iw) this.A04;
            C55080Hbp.A00(A0R, (Modifier) this.A05, r3, userSession, str, str2, (C62320sa) this.A06, i2, C51966G9m.A01(this.A01), j);
        } else {
            Modifier modifier = (Modifier) this.A06;
            AnonymousClass2DO r4 = (AnonymousClass2DO) this.A05;
            String str3 = this.A09;
            long j2 = this.A03;
            C54893HXb.A00(A0R, modifier, (AnonymousClass5RW) this.A04, r4, this.A08, str3, (C62320sa) this.A07, C51966G9m.A01(this.A01), this.A02, j2);
        }
        return C60340gF.A00;
    }
}
