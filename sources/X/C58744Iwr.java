package X;

import android.graphics.Path;
import android.graphics.Shader;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;

/* renamed from: X.Iwr  reason: case insensitive filesystem */
public final class C58744Iwr extends 0Yg implements 0sP {
    public final float A00;
    public final int A01;
    public final long A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58744Iwr(Object obj, float f, int i, long j) {
        super(1);
        this.A01 = i;
        this.A00 = f;
        this.A02 = j;
        this.A03 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        Object obj2 = obj;
        switch (this.A01) {
            case 0:
                AnonymousClass5Q3 A0T = C51968G9o.A0T(obj2);
                C56848IEv iEv = (C56848IEv) ((C59661JSg) this.A03);
                C268024cd r1 = iEv.A01;
                long j = iEv.A00;
                if (Constraints.A07(j)) {
                    f = r1.Ezw(Constraints.A01(j));
                } else {
                    f = Float.POSITIVE_INFINITY;
                }
                long A002 = C289325dP.A00(A0T.F06(f * 0.55f), this.A00 - 6.0f);
                float A012 = C289295dM.A01(A002);
                float A003 = C51966G9m.A00(A0T, 4.0f, A012);
                float A022 = C289295dM.A02(A002);
                long A004 = C289325dP.A00(A003, C51966G9m.A00(A0T, 4.0f, A022));
                float A013 = C289295dM.A01(A004);
                float A023 = C289295dM.A02(A004);
                long A005 = C289325dP.A00(A013, C51966G9m.A00(A0T, 7.0f, A023));
                float A014 = C289295dM.A01(A005);
                float A006 = C51966G9m.A00(A0T, 5.5f, A014);
                float A024 = C289295dM.A02(A005);
                long A007 = C289325dP.A00(A006, C51966G9m.A00(A0T, 1.0f, A024));
                long A008 = C289325dP.A00(C51966G9m.A00(A0T, 16.0f, A013), C51966G9m.A00(A0T, 1.0f, A022));
                float A015 = C289295dM.A01(A008);
                long A009 = C289325dP.A00(C51966G9m.A00(A0T, 2.0f, A015), A022);
                C3018160e A0010 = C3026864w.A00();
                Path path = A0010.A03;
                path.moveTo(A012, A022);
                path.quadTo(C51966G9m.A00(A0T, 4.0f, A012), A022, A013, A023);
                path.lineTo(A014, A024);
                path.quadTo(C51966G9m.A00(A0T, 2.0f, A014), C51966G9m.A00(A0T, 3.0f, A024), C289295dM.A01(A007), C289295dM.A02(A007));
                float A025 = C289295dM.A02(A008);
                path.lineTo(A015, A025);
                path.quadTo(C51966G9m.A00(A0T, 1.0f, A015), A025, C289295dM.A01(A009), C289295dM.A02(A009));
                path.close();
                C3018160e r9 = A0010;
                A0T.AQn((C288195bW) null, r9, C289635dw.A00, 1.0f, 3, this.A02);
                break;
            case 1:
                AnonymousClass5Q3 A0T2 = C51968G9o.A0T(obj2);
                float F06 = A0T2.F06(this.A00);
                long A0011 = AnonymousClass6GR.A00(F06, F06);
                A0T2.AQv((C288195bW) null, (C289645dx) this.A03, 0.4f, 3, this.A02, 0, C51968G9o.A0H(A0T2), A0011);
                break;
            case 2:
                C55435Hhf hhf = (C55435Hhf) obj2;
                0qQ.A0B(hhf, 0);
                long j2 = this.A02;
                float f2 = this.A00;
                C53419GoB goB = new C53419GoB(j2, f2);
                C59721JVf jVf = ((C53687Gse) this.A03).A00;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                0qQ.A0B(jVf, 0);
                ((List) hhf.A00.A01).add(new C53405Gnx((C52710GbN) null, new C53416Go8(new C53404Gnw(tileMode, jVf, f2, j2)), goB, 3));
                break;
            default:
                C55544HjQ hjQ = (C55544HjQ) obj2;
                0qQ.A0B(hjQ, 0);
                C54624HLh hLh = C54624HLh.Hidden;
                float f3 = this.A00;
                Float valueOf = Float.valueOf(f3);
                Map map = hjQ.A00;
                map.put(hLh, valueOf);
                C56035Hri hri = (C56035Hri) this.A03;
                Float f4 = hri.A00;
                if (f4 != null) {
                    float A032 = (f3 - C51971G9r.A03(hri.A01)) * (1.0f - f4.floatValue());
                    if (((float) C289005cr.A00(this.A02)) > f3 - A032) {
                        map.put(C54624HLh.HalfExpanded, Float.valueOf(A032));
                    }
                }
                int A0012 = C289005cr.A00(this.A02);
                if (A0012 != 0) {
                    map.put(C54624HLh.Expanded, Float.valueOf(Math.max(0.0f, f3 - ((float) A0012))));
                    break;
                }
                break;
        }
        return C60340gF.A00;
    }
}
