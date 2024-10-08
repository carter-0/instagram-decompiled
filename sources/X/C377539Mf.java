package X;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;

/* renamed from: X.9Mf  reason: invalid class name and case insensitive filesystem */
public final class C377539Mf extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377539Mf(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A07 = obj3;
        this.A05 = obj4;
        this.A06 = obj5;
        this.A03 = obj6;
        this.A02 = obj7;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C249453jo r2 = (C249453jo) this.A01;
                C73897PlY plY = new C73897PlY(this.A03, 15);
                C332887Wv r6 = (C332887Wv) ((AnonymousClass0eM) this.A04).getValue();
                return new AnonymousClass77W(r2, ((AnonymousClass9H6) this.A07).A01, (AnonymousClass7SM) this.A05, (AnonymousClass7TI) this.A02, r6, (C62320sa) this.A06, plY);
            case 1:
                return new C72540P9x((AnonymousClass4DH) this.A04, ((AnonymousClass9H6) this.A07).A01, (AnonymousClass7SM) this.A06, (C332247Uf) this.A01, (C62320sa) this.A05, new C73897PlY(this.A03, 20), new C73897PlY(this.A02, 21));
            case 2:
                AnonymousClass9H6 r1 = (AnonymousClass9H6) this.A07;
                C41396AtI atI = new C41396AtI(this.A03, 11);
                return new PA4(r1.A00.requireActivity(), (AnonymousClass0iw) this.A01, r1.A01, (AnonymousClass0eK) this.A02, new C3258674m((C62320sa) this.A04), (AnonymousClass0eK) this.A05, atI, (AnonymousClass0eK) this.A06);
            case 3:
                if (((Boolean) ((2Wa) this.A05).A03).booleanValue()) {
                    2Wa r5 = (2Wa) this.A03;
                    if (!((Boolean) r5.A03).booleanValue()) {
                        r5.A00();
                        C249213jJ.A02((Handler) this.A02, ((C248453hz) this.A07).A00, new C40285AZa((Animator) this.A01, (Animator) this.A04, (2Wa) this.A06, r5));
                    }
                }
                return new C245943dj(new C58684Ivt(this.A02, 36));
            default:
                AnonymousClass2rB r0 = (AnonymousClass2rB) this.A07;
                C229992ok r7 = (C229992ok) this.A03;
                return new C231712s9((Context) this.A01, (Fragment) this.A04, r0.A01, r0.A00, (C229992ok) this.A05, r7, (C230022on) this.A06, ((C229792oF) this.A02).A01, true);
        }
    }
}
