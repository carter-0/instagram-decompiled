package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.callercontext.CallerContext;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.Guk  reason: case insensitive filesystem */
public final class C53817Guk extends C251343mx {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final 2WX A03;
    public final String A04 = "SpotlightMediaItemComponent";
    public final List A05;
    public final boolean A06;

    public final C251263mp A0X(AnonymousClass3Y5 r8) {
        0qQ.A0B(r8, 0);
        AnonymousClass1U3 A002 = AnonymousClass1UL.A00(1U1.A0b);
        Drawable drawable = this.A02;
        if (drawable == null) {
            drawable = null;
        }
        A002.A0C = drawable;
        A002.A0R = null;
        A002.A03 = 0;
        A002.A0H = AnonymousClass1U5.A01;
        1U1 r5 = new 1U1(A002);
        C53612GrR grR = new C53612GrR(new C53997Gxf(), r8.A05);
        int i = this.A00;
        C53997Gxf gxf = grR.A00;
        gxf.A00 = i;
        BitSet bitSet = grR.A02;
        bitSet.set(0);
        gxf.A01 = this.A01;
        bitSet.set(1);
        gxf.A05 = this.A06;
        List list = this.A05;
        if (list != null) {
            if (gxf.A04.isEmpty()) {
                gxf.A04 = list;
            } else {
                gxf.A04.addAll(list);
            }
        }
        gxf.A03 = CallerContext.A01(this.A04);
        gxf.A02 = r5;
        C244123ag.A00(grR, this.A03);
        C244113af.A00(bitSet, grR.A03, 2);
        grR.A02();
        return gxf;
    }

    public C53817Guk(Drawable drawable, 2WX r5, List list, boolean z) {
        this.A05 = list;
        this.A02 = drawable;
        this.A06 = z;
        this.A00 = 1750;
        this.A01 = 2500;
        this.A03 = r5;
    }
}
