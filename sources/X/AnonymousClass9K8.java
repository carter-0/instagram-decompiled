package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: X.9K8  reason: invalid class name */
public final class AnonymousClass9K8 extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public boolean A01;
    public final int A02 = 1;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K8(AnonymousClass8BQ r2, ArrayList arrayList, AnonymousClass4D7 r4, boolean z) {
        super(2, r4);
        this.A00 = arrayList;
        this.A03 = r2;
        this.A01 = z;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.9K8] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.9K8] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.4D7, X.9K8] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        switch (this.A02) {
            case 0:
                return new AnonymousClass9K8((AnonymousClass8BQ) this.A03, (ArrayList) this.A00, r6, this.A01);
            case 1:
                ? r3 = new AnonymousClass9K8((C3504884v) this.A03, r6, this.A01);
                r3.A00 = obj;
                return r3;
            default:
                ? r32 = new AnonymousClass9K8((AnonymousClass8IP) this.A00, (AnonymousClass8IQ) this.A03, r6);
                r32.A01 = ((Boolean) obj).booleanValue();
                return r32;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9K8) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A02) {
            case 0:
                0eS.A00(obj);
                ArrayList arrayList = (ArrayList) this.A00;
                if (!arrayList.isEmpty()) {
                    AnonymousClass8BQ r1 = (AnonymousClass8BQ) this.A03;
                    r1.A06.addAll(arrayList);
                    r1.A00(AnonymousClass8BT.A00(arrayList));
                }
                boolean z = this.A01;
                AnonymousClass8BQ r0 = (AnonymousClass8BQ) this.A03;
                C294975nL.A04((C295005nO) null, new View[]{r0.A00, r0.A02}, z);
                break;
            case 1:
                0eS.A00(obj);
                Object obj2 = this.A00;
                boolean z2 = this.A01;
                if (!z2) {
                    ((C3504884v) this.A03).A0J.A0B(C60340gF.A00);
                }
                if (obj2 instanceof C371578yd) {
                    C3504884v r3 = (C3504884v) this.A03;
                    05G r2 = r3.A05.A00;
                    if (!(((AnonymousClass84D) r2.getValue()).A00 == AnonymousClass84B.EFFECT_TRAY || ((AnonymousClass84D) r2.getValue()).A00 == AnonymousClass84B.MINI_GALLERY)) {
                        r3.A0N.A0B(new Integer(2131961942));
                    }
                    if (z2) {
                        r3.A0J.A0B(C60340gF.A00);
                        break;
                    }
                }
                break;
            default:
                0eS.A00(obj);
                if (this.A01) {
                    C3511387s r4 = ((AnonymousClass8IQ) this.A03).A03;
                    if (r4.A0N()) {
                        C353498Hw r32 = ((AnonymousClass8IP) this.A00).A00;
                        AnonymousClass85M r22 = r32.A1d;
                        FrameLayout frameLayout = r22.A00;
                        if (frameLayout != null) {
                            ViewParent parent = frameLayout.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(r22.A00);
                            }
                            r22.A00 = null;
                            C353498Hw.A0m(r32);
                        }
                        r4.A0E();
                        break;
                    }
                }
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K8(C3504884v r2, AnonymousClass4D7 r3, boolean z) {
        super(2, r3);
        this.A01 = z;
        this.A03 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K8(AnonymousClass8IP r2, AnonymousClass8IQ r3, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A03 = r3;
        this.A00 = r2;
    }
}
