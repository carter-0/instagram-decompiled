package X;

import android.graphics.SurfaceTexture;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.Lbd  reason: case insensitive filesystem */
public final class C64422Lbd implements C365328mu {
    public final int A00;
    public final int A01;
    public final SurfaceTexture A02;
    public final FilterGroupModel A03 = AnonymousClass9TB.A00();
    public final C364808m2 A04;
    public final /* synthetic */ C64910LkA A05;

    public C64422Lbd(SurfaceTexture surfaceTexture, C64910LkA lkA, C364808m2 r4, int i, int i2) {
        0qQ.A0B(r4, 2);
        this.A05 = lkA;
        this.A04 = r4;
        this.A02 = surfaceTexture;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void CMb(C364988mL r10) {
        0qQ.A0B(r10, 0);
        AnonymousClass9WF r0 = new AnonymousClass9WF((C364958mI) null, (SurfaceCropFilter) null, this.A04, false);
        r10.A0B(r0);
        r10.A0A(r0.A02);
        int i = this.A01;
        int i2 = this.A00;
        r10.A06(i, i2, 0, false, false);
        C346037uU r1 = new C346037uU(C344407ro.A01, new C346027uT(this.A02, false));
        r10.A07 = r1;
        r10.A0C(new C40964AmA(r1, r10));
        r10.A05(i, i2);
        SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(false);
        surfaceCropFilter.A0P(false);
        this.A03.EWj(surfaceCropFilter.A00, 3);
    }

    public final void EEr(C364988mL r4) {
        0qQ.A0B(r4, 0);
        PhotoFilter photoFilter = this.A05.A03;
        if (photoFilter != null) {
            FilterGroupModel filterGroupModel = this.A03;
            filterGroupModel.EWj(photoFilter.A03, 17);
            r4.A07(((FilterGroupModelImpl) filterGroupModel).A02);
            C344727sK.A00(r4.A0C, (Long) null);
        }
    }

    public final /* synthetic */ void cancel() {
        throw AnonymousClass00P.createAndThrow();
    }
}
