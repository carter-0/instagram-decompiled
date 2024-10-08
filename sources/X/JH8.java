package X;

import androidx.compose.foundation.ClickableElement;
import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

public final class JH8 extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JH8(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
        this.A05 = z;
        this.A04 = str;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4 = obj2;
        Object obj5 = obj3;
        if (this.A00 != 0) {
            C286575Wy r4 = (C286575Wy) obj4;
            if (C51968G9o.A0D(obj5) != 16 || !r4.Bwn()) {
                if (0fL.A02()) {
                    0fL.A01(308169355, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:1630)");
                }
                C299575vQ r3 = (C299575vQ) this.A03;
                C53486GpI gpI = (C53486GpI) r3;
                String str = gpI.A07;
                String str2 = gpI.A05;
                ImageUrl imageUrl = (ImageUrl) gpI.A01;
                LineType lineType = (LineType) this.A02;
                boolean z = this.A05;
                boolean A1Y = C51967G9n.A1Y(r4, r3, -1659118873);
                Object obj6 = this.A01;
                boolean A1Z = C51965G9l.A1Z(r4, obj6, A1Y);
                String str3 = this.A04;
                boolean A1Z2 = C51965G9l.A1Z(r4, str3, A1Z);
                Object ECw = r4.ECw();
                if (A1Z2 || ECw == AnonymousClass5XT.A00) {
                    ECw = new C58719IwS(obj6, r3, str3, 17);
                    r4.FLL(ECw);
                }
                I2L.A00(r4, (Modifier) null, lineType, imageUrl, str, str2, (C62320sa) ECw, C51968G9o.A1Y(r4) ? 1 : 0, 32, z);
                if (0fL.A02()) {
                    0fL.A00(-1839863762);
                }
            } else {
                r4.Evl();
            }
            return C60340gF.A00;
        }
        C286575Wy A0R = C51966G9m.A0R(obj4, obj5);
        if (C51967G9n.A1U(A0R, -1525724089)) {
            0fL.A01(1719201455, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
        }
        C287605aT r5 = (C287605aT) C51972G9s.A0l(A0R, A0R.ECw(), AnonymousClass5XT.A00);
        Modifier A002 = AnonymousClass5ZU.A00((C287095Yz) this.A01, r5, Modifier.A00);
        boolean z2 = this.A05;
        Modifier Ezh = A002.Ezh(new ClickableElement((C287085Yy) null, r5, (C287625aV) this.A03, this.A04, (C62320sa) this.A02, z2));
        if (0fL.A02()) {
            0fL.A00(-2059685459);
        }
        C51965G9l.A1V(A0R);
        return Ezh;
    }
}
