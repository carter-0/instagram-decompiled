package X;

import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.3cL  reason: invalid class name and case insensitive filesystem */
public final class C245113cL extends AnonymousClass2TY {
    public final /* bridge */ /* synthetic */ 2TR A04() {
        2TR r1 = this.A01;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.facebook.litho.NestedTreeHolder");
        return r1;
    }

    public final int CGw(int i) {
        float f;
        if (i <= 0) {
            AnonymousClass2TY r0 = this.A02.A04;
            if (r0 == null) {
                return 0;
            }
            float[] fArr = ((YogaNodeJNIBase) r0.A02.A0K).arr;
            if (fArr != null) {
                f = fArr[3];
            } else {
                f = 0.0f;
            }
            return (int) f;
        }
        throw new IllegalArgumentException("NestedTreeHolder Result has only one child");
    }

    public final int CHT(int i) {
        float f;
        if (i <= 0) {
            AnonymousClass2TY r0 = this.A02.A04;
            if (r0 == null) {
                return 0;
            }
            float[] fArr = ((YogaNodeJNIBase) r0.A02.A0K).arr;
            if (fArr != null) {
                f = fArr[4];
            } else {
                f = 0.0f;
            }
            return (int) f;
        }
        throw new IllegalArgumentException("NestedTreeHolder Result has only one child");
    }

    public final void A05() {
        super.A05();
        AnonymousClass2TY r0 = this.A02.A04;
        if (r0 != null) {
            r0.A05();
        }
    }
}
