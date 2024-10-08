package X;

import com.instagram.camera.effect.models.CameraAREffect;
import java.util.Collection;
import java.util.List;

/* renamed from: X.8xv  reason: invalid class name and case insensitive filesystem */
public final class C371278xv extends AnonymousClass0T0 {
    public final int A00;
    public final AnonymousClass87G A01;
    public final List A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9LC(this, 10));
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C371278xv(AnonymousClass87G r3, List list, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(list, 2);
        this.A01 = r3;
        this.A02 = list;
        this.A05 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C371278xv) {
                C371278xv r5 = (C371278xv) obj;
                if (!(0qQ.A0K(this.A01, r5.A01) && 0qQ.A0K(this.A02, r5.A02) && this.A05 == r5.A05 && this.A04 == r5.A04 && this.A06 == r5.A06 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final float A00() {
        AnonymousClass0eM r4 = this.A03;
        if (!(!((List) r4.getValue()).isEmpty())) {
            return 0.0f;
        }
        List<CameraAREffect> list = (List) r4.getValue();
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (CameraAREffect cameraAREffect : list) {
                if ("25025320".equals(cameraAREffect.A0B) && (i = i + 1) < 0) {
                    0sr.A1S();
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        return ((float) i) / ((float) ((List) r4.getValue()).size());
    }

    public final int hashCode() {
        int hashCode;
        AnonymousClass87G r0 = this.A01;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A06) {
            i5 = 1231;
        }
        return ((i4 + i5) * 31) + this.A00;
    }
}
