package X;

import androidx.compose.animation.core.SuspendAnimationKt;
import com.meta.compose.component.swipeable.SwipeableState;

/* renamed from: X.ImH  reason: case insensitive filesystem */
public final class C58095ImH extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final float A03;
    public final int A04 = 0;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58095ImH(AnonymousClass5b9 r2, AnonymousClass4D7 r3, 0rh r4, float f) {
        super(2, r3);
        this.A03 = f;
        this.A05 = r2;
        this.A01 = r4;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.ImH, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.ImH, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        if (this.A04 != 0) {
            float f = this.A03;
            ? imH = new C58095ImH((AnonymousClass5b9) this.A05, (SwipeableState) this.A02, r6, f);
            imH.A01 = obj;
            return imH;
        }
        ? imH2 = new C58095ImH((AnonymousClass5b9) this.A05, r6, (0rh) this.A01, this.A03);
        imH2.A02 = obj;
        return imH2;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.ImH, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.0rh] */
    public final Object invokeSuspend(Object obj) {
        if (this.A04 != 0) {
            Object obj2 = 1Hj.A02;
            if (this.A00 != 0) {
                try {
                    0eS.A00(obj);
                } catch (Throwable th) {
                    SwipeableState swipeableState = (SwipeableState) this.A02;
                    swipeableState.A06.Epw((Object) null);
                    C51967G9n.A16(swipeableState.A08, false);
                    throw th;
                }
            } else {
                0eS.A00(obj);
                Object obj3 = this.A01;
                ? obj4 = new Object();
                SwipeableState swipeableState2 = (SwipeableState) this.A02;
                obj4.A00 = C51971G9r.A02(swipeableState2.A04);
                C284945Oz r4 = swipeableState2.A06;
                float f = this.A03;
                r4.Epw(C51965G9l.A0q(f));
                C51967G9n.A16(swipeableState2.A08, true);
                AnonymousClass5b4 A002 = C287705ad.A00(obj4.A00);
                Float A0q = C51965G9l.A0q(f);
                J6T j6t = new J6T(33, obj3, (Object) obj4);
                this.A00 = 1;
                if (A002.A04((AnonymousClass5b9) this.A05, A0q, A002.A02(), this, j6t) == obj2) {
                    return obj2;
                }
            }
            SwipeableState swipeableState3 = (SwipeableState) this.A02;
            swipeableState3.A06.Epw((Object) null);
            C51967G9n.A16(swipeableState3.A08, false);
        } else {
            Object obj5 = 1Hj.A02;
            if (this.A00 != 0) {
                0eS.A00(obj);
            } else {
                0eS.A00(obj);
                Object obj6 = this.A02;
                float f2 = this.A03;
                JGF jgf = new JGF(1, obj6, this.A01);
                this.A00 = 1;
                if (SuspendAnimationKt.A03((AnonymousClass5b9) this.A05, this, jgf, 0.0f, f2, 0.0f) == obj5) {
                    return obj5;
                }
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58095ImH) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58095ImH(AnonymousClass5b9 r2, SwipeableState swipeableState, AnonymousClass4D7 r4, float f) {
        super(2, r4);
        this.A02 = swipeableState;
        this.A03 = f;
        this.A05 = r2;
    }
}
