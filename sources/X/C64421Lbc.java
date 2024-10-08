package X;

import android.view.Surface;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;

/* renamed from: X.Lbc  reason: case insensitive filesystem */
public final class C64421Lbc implements C365328mu {
    public int A00;
    public int A01;
    public final FilterChain A02;
    public final Surface A03;
    public final /* synthetic */ C65164LoT A04;

    public final void CMb(C364988mL r13) {
        int i;
        int i2;
        int A05;
        C364988mL r6 = r13;
        0qQ.A0B(r13, 0);
        C65164LoT loT = this.A04;
        AnonymousClass9WF r1 = new AnonymousClass9WF(loT.A0H, loT.A0O, loT.A0I, loT.A0G.A02);
        r1.A00 = new C64348LaQ(this, loT);
        r13.A0B(r1);
        r13.A0A(r1.A02);
        AnonymousClass9WF.A00(r1);
        SurfaceCropFilter surfaceCropFilter = loT.A0O;
        if (surfaceCropFilter != null) {
            SurfaceCropFilterModel surfaceCropFilterModel = surfaceCropFilter.A00;
            this.A01 = surfaceCropFilterModel.A05;
            this.A00 = surfaceCropFilterModel.A04;
            float f = surfaceCropFilterModel.A01;
            if (f > 0.0f && (i = loT.A01) > 0 && (i2 = loT.A00) > 0) {
                int max = Math.max(i, i2);
                float f2 = (float) max;
                if (f < 1.0f) {
                    int A06 = AnonymousClass7TE.A06(f2, f);
                    A05 = max;
                    max = A06;
                } else {
                    A05 = JTO.A05(f2, f);
                }
                loT.A0N = max;
                loT.A0M = A05;
            }
        }
        r6.A06(this.A01, this.A00, 0, false, false);
        C346037uU r12 = new C346037uU(C344407ro.A01, new C346027uT(this.A03, false));
        r13.A07 = r12;
        r13.A0C(new C40964AmA(r12, r13));
        r13.A05(loT.A0N, loT.A0M);
        r13.A07(this.A02);
    }

    public final void EEr(C364988mL r13) {
        float f;
        C364988mL r6 = r13;
        0qQ.A0B(r13, 0);
        int i = this.A01;
        int i2 = this.A00;
        C65164LoT loT = this.A04;
        int i3 = loT.A0N;
        int i4 = loT.A0M;
        if (!loT.A0Q || i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0) {
            loT.A0R = false;
            return;
        }
        AnonymousClass80G r2 = loT.A05;
        if (r2 != null) {
            LDP ldp = loT.A0G;
            if (ldp.A01) {
                f = ldp.A00;
            } else {
                f = 1.0f;
            }
            r2.A00 = f;
        }
        r6.A06(i, i2, 0, false, false);
        r13.A05(i3, i4);
        C344727sK.A00(r13.A0C, (Long) null);
        loT.A0R = false;
        if (!loT.A06) {
            loT.A06 = true;
            loT.A0B.post(new M2Q(loT));
        }
    }

    public final /* synthetic */ void cancel() {
        throw AnonymousClass00P.createAndThrow();
    }

    public C64421Lbc(Surface surface, FilterChain filterChain, C65164LoT loT) {
        this.A04 = loT;
        this.A02 = filterChain;
        this.A03 = surface;
    }
}
