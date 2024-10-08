package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JBq  reason: case insensitive filesystem */
public final class C59238JBq extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final String A09;
    public final boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59238JBq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A07 = obj;
        this.A06 = obj2;
        this.A05 = obj3;
        this.A04 = obj4;
        this.A08 = obj5;
        this.A0A = z;
        this.A09 = str;
        this.A02 = obj6;
        this.A03 = obj7;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            HLK hlk = (HLK) this.A08;
            boolean z = this.A0A;
            String str = this.A09;
            AnonymousClass0iw r3 = (AnonymousClass0iw) this.A02;
            C56592I2w.A02(A0R, (Modifier) this.A03, r3, hlk, str, (C62320sa) this.A07, (C62320sa) this.A06, (C62320sa) this.A05, (C62320sa) this.A04, C51966G9m.A01(this.A01), z);
        } else {
            C62320sa r7 = (C62320sa) this.A04;
            C62320sa r8 = (C62320sa) this.A06;
            String str2 = this.A09;
            ImageUrl imageUrl = (ImageUrl) this.A08;
            C61052Jvq jvq = (C61052Jvq) this.A05;
            boolean z2 = this.A0A;
            AnonymousClass0iw r4 = (AnonymousClass0iw) this.A02;
            I7S.A02(A0R, (Modifier) this.A03, jvq, r4, imageUrl, str2, r7, r8, (0sL) this.A07, C51966G9m.A01(this.A01), z2);
        }
        return C60340gF.A00;
    }
}
