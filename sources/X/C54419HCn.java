package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.MidCardLayoutType;

/* renamed from: X.HCn  reason: case insensitive filesystem */
public final class C54419HCn extends 17P implements C46242DRx {
    public JS6 A00;

    public final C46242DRx E7f(1E9 r3) {
        JS6 js6 = this.A00;
        if (js6 == null) {
            js6 = (JS6) A04(3076010, C54416HCk.class);
        }
        js6.E7d(r3);
        this.A00 = js6;
        return this;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.facebook.pando.TreeJNI, X.HCn, X.17P] */
    public final C53452Gok F6L(1E9 r15) {
        C53453Gol gol;
        String A0j = A0j(150595944);
        int intValueByHashCode = getIntValueByHashCode(-468163310);
        JS6 js6 = this.A00;
        if (js6 == null) {
            js6 = (JS6) A04(3076010, C54416HCk.class);
        }
        C53449Goh F6H = js6.F6H(r15);
        String A0h = A0h(-1245297597);
        MidCardLayoutType midCardLayoutType = (MidCardLayoutType) A0M(2011608879, J0B.A00);
        C59654JRw jRw = (C59654JRw) A05(-450004177, C54420HCo.class);
        if (jRw != null) {
            gol = jRw.F6M();
        } else {
            gol = null;
        }
        return new C53452Gok((ClipsMidCardSubtype) A0N(-664438814, J0C.A00), (ClipsMidCardType) A0N(2007145938, J0D.A00), (InstagramMidcardType) A0M(-853089887, J0E.A00), F6H, midCardLayoutType, gol, A0j, A0h, A0i(295607137), intValueByHashCode, getIntValueByHashCode(1709232679), getIntValueByHashCode(1496409374));
    }
}
