package X;

import com.facebook.litho.LithoView;

/* renamed from: X.LZc  reason: case insensitive filesystem */
public final class C64302LZc implements C13907Tl7, AnonymousClass07Y {
    public final int A00;
    public final Object A01;

    public C64302LZc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onDestroy(AnonymousClass07Z r5) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(r5, 0);
                ((LithoView) this.A01).A0j();
                return;
            case 1:
                C65225LpV lpV = (C65225LpV) this.A01;
                AnonymousClass1Nd.A00(lpV.A05).A02(lpV.A04, C64639LfR.class);
                return;
            case 2:
                return;
            default:
                ((C64311LZl) this.A01).A00.A0B(07T.ON_DESTROY);
                return;
        }
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r5) {
        if (2 - this.A00 == 0) {
            C65219LpP lpP = (C65219LpP) this.A01;
            AnonymousClass1Nd.A00(lpP.A03).A02(lpP.A02, C354838No.class);
        }
    }

    public final /* synthetic */ void onResume(AnonymousClass07Z r9) {
        if (2 - this.A00 == 0) {
            if (C64584LeQ.A06) {
                C65219LpP lpP = (C65219LpP) this.A01;
                if (VH4.A00(lpP.A03)) {
                    C64584LeQ.A06 = false;
                    C64584LeQ leQ = lpP.A07;
                    C61837KOb kOb = lpP.A08;
                    leQ.A00((String) null, "tag_people_row", kOb.A00, kOb.A04, kOb.A01);
                }
            }
            C65219LpP lpP2 = (C65219LpP) this.A01;
            AnonymousClass1Nd.A00(lpP2.A03).A01(lpP2.A02, C354838No.class);
        }
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r4) {
        if (2 - this.A00 == 0) {
            C65219LpP lpP = (C65219LpP) this.A01;
            LFP lfp = lpP.A00;
            if (lfp != null) {
                if (lfp.A01.A03()) {
                    LFP lfp2 = lpP.A00;
                    if (lfp2 != null) {
                        lfp2.A01.A0D.A02();
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F("tagProductsSection");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }
}
