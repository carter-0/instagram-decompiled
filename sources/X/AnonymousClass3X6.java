package X;

import android.content.Context;
import com.facebook.litho.ComponentTree;

/* renamed from: X.3X6  reason: invalid class name */
public final class AnonymousClass3X6 {
    public Context A00;
    public C251263mp A01;
    public C337997hF A02;
    public AnonymousClass2TL A03;
    public C251243mn A04 = null;
    public AnonymousClass3XI A05;
    public 2Sa A06;
    public Boolean A07 = null;
    @Deprecated
    public final 2VJ A08;
    public final 2VJ A09;

    public final ComponentTree A00() {
        boolean z;
        if (this.A01 == null) {
            this.A01 = new C251263mp();
        }
        Boolean bool = this.A07;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.A06.A0M;
        }
        2Sa r10 = this.A06;
        String str = r10.A07;
        2Sa A032 = 2Sa.A03(r10, (AnonymousClass3X7) null, (2Sd) null, (Integer) null, (Integer) null, -1, 15, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        boolean z2 = A032.A0P;
        AnonymousClass3X7 r24 = A032.A02;
        2Sd r20 = A032.A03;
        2Sf r39 = A032.A01;
        Integer num = A032.A05;
        boolean z3 = A032.A0X;
        boolean z4 = A032.A00;
        boolean z5 = A032.A09;
        boolean z6 = A032.A0J;
        boolean z7 = A032.A0C;
        boolean z8 = A032.A0A;
        boolean z9 = A032.A0L;
        boolean z10 = A032.A0T;
        Integer num2 = A032.A06;
        boolean z11 = A032.A0E;
        boolean z12 = A032.A0G;
        0sP r6 = A032.A08;
        boolean z13 = A032.A0W;
        boolean z14 = A032.A0I;
        boolean z15 = A032.A0F;
        boolean z16 = A032.A0H;
        boolean z17 = A032.A0D;
        boolean z18 = A032.A0N;
        if (str == null) {
            str = this.A01.A0J();
        }
        boolean z19 = false;
        if (z) {
            z19 = true;
        }
        boolean z20 = z3;
        2Sf r13 = r39;
        this.A06 = AnonymousClass3XC.A00(r13, A032, r24, r20, num, num2, str, r6, z5, z8, z7, z17, z11, z15, z12, z16, z4, z14, z6, z9, z19, z18, z2, z10, z13, z20);
        return new ComponentTree(this);
    }

    public AnonymousClass3X6(2V1 r2) {
        this.A06 = r2.A02.A01;
        this.A09 = r2.A07;
        this.A08 = r2.A06;
        this.A00 = r2.A0C;
    }
}
