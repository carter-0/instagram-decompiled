package androidx.compose.ui.scrollcapture;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass00P;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass5SV;
import X.AnonymousClass5SZ;
import X.AnonymousClass6IQ;
import X.AnonymousClass7TE;
import X.C285765So;
import X.C289295dM;
import X.C290125en;
import X.C51965G9l;
import X.C51975G9x;
import X.C60340gF;
import X.I2E;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", i = {0}, l = {85}, m = "invokeSuspend", n = {"reverseScrolling"}, s = {"Z$0"})
public final class ComposeScrollCaptureCallback$scrollTracker$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public boolean A01;
    public /* synthetic */ float A02;
    public final /* synthetic */ ComposeScrollCaptureCallback A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A03 = composeScrollCaptureCallback;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        ? composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.A03, r4);
        composeScrollCaptureCallback$scrollTracker$1.A02 = AnonymousClass7TE.A04(obj);
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        1Hj r5 = 1Hj.A02;
        if (this.A00 != 0) {
            z = this.A01;
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            float f = this.A02;
            AnonymousClass5SV r2 = this.A03.A01.A05;
            0sL r1 = (0sL) C285765So.A00(r2, C290125en.A0K);
            if (r1 != null) {
                z = ((AnonymousClass6IQ) r2.A00(AnonymousClass5SZ.A0W)).A02;
                if (z) {
                    f = -f;
                }
                C289295dM A0J = C51975G9x.A0J(0.0f, f);
                this.A01 = z;
                this.A00 = 1;
                obj = r1.invoke(A0J, this);
                if (obj == r5) {
                    return r5;
                }
            } else {
                I2E.A02("Required value was null.");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        float A022 = C289295dM.A02(((C289295dM) obj).A00);
        if (z) {
            A022 = -A022;
        }
        return C51965G9l.A0q(A022);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(AnonymousClass7TE.A04(obj)), (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }
}
