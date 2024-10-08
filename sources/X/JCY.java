package X;

import com.instagram.api.schemas.MetaPlaceDict;
import com.instagram.common.typedurl.ImageUrl;

public final class JCY extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MetaPlaceDict A02;
    public final /* synthetic */ C55860Hoh A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ Double A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ C62320sa A08;
    public final /* synthetic */ C62320sa A09;
    public final /* synthetic */ C62320sa A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JCY(MetaPlaceDict metaPlaceDict, C55860Hoh hoh, ImageUrl imageUrl, Double d, String str, String str2, C62320sa r8, C62320sa r9, C62320sa r10, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A04 = imageUrl;
        this.A07 = str;
        this.A05 = d;
        this.A0D = z;
        this.A0C = z2;
        this.A0B = z3;
        this.A06 = str2;
        this.A03 = hoh;
        this.A0A = r8;
        this.A08 = r9;
        this.A02 = metaPlaceDict;
        this.A09 = r10;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        ImageUrl imageUrl = this.A04;
        String str = this.A07;
        Double d = this.A05;
        boolean z = this.A0D;
        boolean z2 = this.A0C;
        boolean z3 = this.A0B;
        String str2 = this.A06;
        boolean z4 = z;
        C56614I4p.A02(A0R, this.A02, this.A03, imageUrl, d, str, str2, this.A0A, this.A08, this.A09, C51966G9m.A01(this.A00), C301445zH.A00(this.A01), z4, z2, z3);
        return C60340gF.A00;
    }
}
