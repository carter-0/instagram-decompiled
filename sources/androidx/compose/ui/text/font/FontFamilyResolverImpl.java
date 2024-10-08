package androidx.compose.ui.text.font;

import X.0sP;
import X.19B;
import X.AnonymousClass5V2;
import X.AnonymousClass5ZD;
import X.C268454dQ;
import X.C270284gU;
import X.C270304gW;
import X.C286265Up;
import X.C286285Ur;
import X.C286295Us;
import X.C286305Uu;
import X.C286315Uv;
import X.C286325Uw;
import X.C286335Ux;
import X.C286345Uy;
import X.C291915i5;
import X.C377189Kw;
import X.C377469Ly;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

public final class FontFamilyResolverImpl implements C286305Uu {
    public final AnonymousClass5V2 A00;
    public final C286265Up A01;
    public final C286295Us A02;
    public final C286325Uw A03;
    public final 0sP A04 = new C377189Kw(this, 13);

    public final C270284gU EIX(C268454dQ r8, AnonymousClass5ZD r9, int i, int i2) {
        AnonymousClass5ZD r3 = r9;
        int i3 = ((C286285Ur) this.A02).A00;
        if (!(i3 == 0 || i3 == Integer.MAX_VALUE)) {
            int i4 = r9.A00 + i3;
            if (i4 < 1) {
                i4 = 1;
            } else if (i4 > 1000) {
                i4 = IgNetworkConsentStorage.MAX_ENTRIES;
            }
            r3 = new AnonymousClass5ZD(i4);
        }
        return A00(this, new C291915i5(r8, r3, (Object) null, i, i2));
    }

    public /* synthetic */ FontFamilyResolverImpl(C286265Up r5, C286295Us r6) {
        C286325Uw r3 = C286315Uv.A01;
        AnonymousClass5V2 r0 = new AnonymousClass5V2(C286315Uv.A00, 19B.A00);
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r3;
        this.A00 = r0;
    }

    public static final C270304gW A00(FontFamilyResolverImpl fontFamilyResolverImpl, C291915i5 r7) {
        C286345Uy r2;
        C270304gW r1;
        C286325Uw r5 = fontFamilyResolverImpl.A03;
        C377469Ly r4 = new C377469Ly(18, (Object) fontFamilyResolverImpl, (Object) r7);
        C286335Ux r3 = r5.A01;
        synchronized (r3) {
            r2 = r5.A00;
            r1 = (C270304gW) r2.A01(r7);
        }
        if (r1 == null) {
            try {
                r1 = (C270304gW) r4.invoke(new C377469Ly(19, (Object) r5, (Object) r7));
                synchronized (r3) {
                    if (r2.A01(r7) == null) {
                        r2.A02(r7, r1);
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
        return r1;
    }
}
