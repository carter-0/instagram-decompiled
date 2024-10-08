package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JCm  reason: case insensitive filesystem */
public final class C59260JCm extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ C53398GnV A04;
    public final /* synthetic */ C53398GnV A05;
    public final /* synthetic */ C53398GnV A06;
    public final /* synthetic */ ImageUrl A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ C62320sa A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59260JCm(View view, C53398GnV gnV, C53398GnV gnV2, C53398GnV gnV3, ImageUrl imageUrl, Integer num, String str, String str2, C62320sa r10, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A0B = r10;
        this.A0A = str;
        this.A09 = str2;
        this.A04 = gnV;
        this.A05 = gnV2;
        this.A06 = gnV3;
        this.A03 = view;
        this.A0C = z;
        this.A0D = z2;
        this.A0E = z3;
        this.A07 = imageUrl;
        this.A08 = num;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        C62320sa r14 = this.A0B;
        String str = this.A0A;
        String str2 = this.A09;
        C53398GnV gnV = this.A04;
        C53398GnV gnV2 = this.A05;
        C53398GnV gnV3 = this.A06;
        View view = this.A03;
        boolean z = this.A0C;
        boolean z2 = this.A0D;
        boolean z3 = this.A0E;
        int i = this.A02;
        C56632I5m.A00(view, A0R, gnV, gnV2, gnV3, this.A07, this.A08, str, str2, r14, C51966G9m.A01(this.A00), C301445zH.A00(this.A01), i, z, z2, z3);
        return C60340gF.A00;
    }
}
