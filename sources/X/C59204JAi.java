package X;

import androidx.compose.ui.Modifier;
import com.instagram.schools.management.data.SchoolInfo;

/* renamed from: X.JAi  reason: case insensitive filesystem */
public final class C59204JAi extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59204JAi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A08 = z;
        this.A06 = obj5;
        this.A07 = obj6;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                boolean z = this.A08;
                C62520KhB khB = (C62520KhB) this.A07;
                AnonymousClass0iw r3 = (AnonymousClass0iw) this.A02;
                I7S.A04(A0R, (Modifier) this.A03, r3, khB, (C62320sa) this.A06, (C62320sa) this.A05, (C62320sa) this.A04, C51966G9m.A01(this.A01), z);
                break;
            case 1:
                SchoolInfo schoolInfo = (SchoolInfo) this.A05;
                boolean z2 = this.A08;
                I39.A01(A0R, schoolInfo, (Integer) this.A06, (Integer) this.A07, (C62320sa) this.A03, (C62320sa) this.A02, (C62320sa) this.A04, C51966G9m.A01(this.A01), z2);
                break;
            default:
                I7T.A08(A0R, (C53312Gly) this.A07, (C62320sa) this.A06, (C62320sa) this.A04, (C62320sa) this.A02, (C62320sa) this.A03, (0sL) this.A05, C51966G9m.A01(this.A01), this.A08);
                break;
        }
        return C60340gF.A00;
    }
}
