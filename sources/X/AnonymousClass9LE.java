package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import java.util.Map;

/* renamed from: X.9LE  reason: invalid class name */
public final class AnonymousClass9LE extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9LE(Object obj, int i) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass30Y r8;
        C252093oY r7;
        String str;
        boolean z;
        Drawable ALw;
        Object obj4 = obj3;
        Object obj5 = obj2;
        Object obj6 = obj;
        switch (this.A00) {
            case 0:
                Resources resources = (Resources) obj6;
                C240483Lb r72 = (C240483Lb) obj5;
                1U1 r3 = (1U1) obj4;
                0qQ.A0B(resources, 0);
                0qQ.A0B(r72, 1);
                0qQ.A0B(r3, 2);
                1Tp r2 = (1Tp) this.A01;
                AnonymousClass1Sz.A00();
                String A002 = AnonymousClass000.A00(3457);
                Boolean bool = true;
                C64721Te r1 = r3.A0I;
                if (r1 == null || (ALw = r1.ALw(resources, r3, r72)) == null) {
                    if (r72 instanceof C240523Lf) {
                        Bitmap CBJ = ((C240523Lf) r72).CBJ();
                        0qQ.A07(CBJ);
                        return new AnonymousClass3OJ(CBJ, bool.equals(r72.B3S().get(A002)));
                    }
                    ALw = r2.A01.ALw(resources, r3, r72);
                    if (ALw == null) {
                        return null;
                    }
                }
                if (ALw instanceof Animatable) {
                    return new C381059b6((Animatable) ALw, ALw, r3.A0S);
                }
                return new AnonymousClass2i8(ALw);
            case 1:
                Modifier modifier = (Modifier) obj6;
                C286575Wy r73 = (C286575Wy) obj5;
                int intValue = ((Number) obj4).intValue();
                0qQ.A0B(modifier, 0);
                if ((intValue & 6) == 0) {
                    int i = 2;
                    if (r73.AGu(modifier)) {
                        i = 4;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) == 18 && r73.Bwn()) {
                    r73.Evl();
                    break;
                } else {
                    if (0fL.A02()) {
                        0fL.A01(-1655533909, "com.instagram.feed.adapter.row.ufi.compose.IconRow.<anonymous>.<anonymous>.<anonymous> (ComposeMediaUFIComponent.kt:180)");
                    }
                    C61084JwM jwM = (C61084JwM) this.A01;
                    AnonymousClass2DO r9 = (AnonymousClass2DO) jwM.A02;
                    r73.ExS(-850852332);
                    boolean AGu = r73.AGu(jwM);
                    Object ECw = r73.ECw();
                    if (AGu || ECw == AnonymousClass5XT.A00) {
                        ECw = new C58684Ivt(jwM, 40);
                        r73.FLL(ECw);
                    }
                    C62320sa r10 = (C62320sa) ECw;
                    C286565Wx r5 = (C286565Wx) r73;
                    C286565Wx.A0L(r5, false);
                    r73.ExS(-850847551);
                    Object obj7 = jwM.A01;
                    if (obj7 != null) {
                        r73.ExS(-334204616);
                        Object ECw2 = r73.ECw();
                        Object obj8 = AnonymousClass5XT.A00;
                        if (ECw2 == obj8) {
                            C284885Or A003 = C289465dd.A00();
                            AnonymousClass0eM r0 = C284905Ot.A01;
                            ECw2 = new ParcelableSnapshotMutableState(A003, (Object) null);
                            r73.FLL(ECw2);
                        }
                        C286565Wx.A0L(r5, false);
                        C285245Qk r22 = Modifier.A00;
                        r73.ExS(-334198408);
                        Object ECw3 = r73.ECw();
                        if (ECw3 == obj8) {
                            ECw3 = new J6H(ECw2, 42);
                            r73.FLL(ECw3);
                        }
                        C286565Wx.A0L(r5, false);
                        Modifier A004 = C288055bI.A00(r22, (0sP) ECw3);
                        r73.ExS(-334192016);
                        boolean AGu2 = r73.AGu(obj7);
                        Object ECw4 = r73.ECw();
                        if (AGu2 || ECw4 == obj8) {
                            ECw4 = new C58186Inq(0, ECw2, obj7);
                            r73.FLL(ECw4);
                        }
                        C286565Wx.A0L(r5, false);
                        modifier = modifier.Ezh(C288305bh.A00(A004, (C62320sa) ECw4));
                    }
                    C286565Wx.A0L(r5, false);
                    C56303HwG.A01(r73, modifier, r9, r10, 0, 0);
                    if (0fL.A02()) {
                        0fL.A00(1953962583);
                        break;
                    }
                }
                break;
            case 2:
                C244213ap r82 = (C244213ap) obj6;
                0qQ.A0B(r82, 0);
                11Z.A04(new C273154m4((Activity) obj5, (View) obj4, (C242923Ws) this.A01, r82), 100);
                break;
            case 3:
                int intValue2 = ((Number) obj6).intValue();
                int intValue3 = ((Number) obj5).intValue();
                C238123Aq r32 = (C238123Aq) obj4;
                0qQ.A0B(r32, 2);
                ((AnonymousClass339) this.A01).Evp(r32, intValue2, intValue3);
                break;
            case 4:
                r8 = (AnonymousClass30Y) obj6;
                r7 = (C252093oY) obj5;
                str = (String) obj4;
                z = false;
                0qQ.A0B(r8, 0);
                0qQ.A0B(r7, 1);
                0qQ.A0B(str, 2);
                break;
            case 5:
                r8 = (AnonymousClass30Y) obj6;
                r7 = (C252093oY) obj5;
                str = (String) obj4;
                0qQ.A0B(r8, 0);
                z = true;
                0qQ.A0B(r7, 1);
                0qQ.A0B(str, 2);
                Map map = AnonymousClass59A.A02;
                AnonymousClass59B r02 = (AnonymousClass59B) map.get(str);
                if (r02 == null) {
                    r02 = new AnonymousClass59B();
                }
                r02.A02 = true;
                map.put(str, r02);
                break;
            case 6:
                AnonymousClass3PG r74 = (AnonymousClass3PG) obj5;
                boolean booleanValue = ((Boolean) obj4).booleanValue();
                0qQ.A0B(r74, 1);
                ((C228062kj) this.A01).A20.A0O(r74, (C270374gd) obj6, booleanValue);
                break;
            default:
                return new J6Q(36, obj2, this.A01);
        }
        ((C230502pj) this.A01).A02(r8, r7, str, z);
        return C60340gF.A00;
    }
}
