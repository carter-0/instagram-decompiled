package X;

import android.os.Handler;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

public final class AUU implements C365328mu {
    public final 0sP A00;
    public final int A01;
    public final int A02;
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final UserSession A04;
    public final C364958mI A05;
    public final FilterGroupModel A06;
    public final C364808m2 A07;

    public AUU(UserSession userSession, C364958mI r3, FilterGroupModel filterGroupModel, C364808m2 r5, 0sP r6, int i, int i2) {
        0qQ.A0B(r5, 2);
        this.A04 = userSession;
        this.A07 = r5;
        this.A05 = r3;
        this.A06 = filterGroupModel;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = r6;
    }

    public final /* synthetic */ void CMb(C364988mL r1) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter] */
    public final void EEr(C364988mL r18) {
        int i;
        int i2;
        int i3;
        C364988mL r11 = r18;
        0qQ.A0B(r11, 0);
        ? obj = new Object();
        try {
            FilterGroupModel filterGroupModel = this.A06;
            if (filterGroupModel != null && (i = this.A02) > 0 && (i2 = this.A01) > 0) {
                FilterChain A002 = ((FilterGroupModelImpl) filterGroupModel).A02.deepCopy();
                UserSession userSession = this.A04;
                C364808m2 r10 = this.A07;
                LDP ldp = new LDP(userSession, r10, AnonymousClass05K.A01);
                FilterModel filterModel = (FilterModel) A002.A01.get(3);
                if (filterModel instanceof SurfaceCropFilterModel) {
                    SurfaceCropFilterModel surfaceCropFilterModel = (SurfaceCropFilterModel) filterModel;
                    ? obj2 = new Object();
                    obj2.A00 = surfaceCropFilterModel;
                    AnonymousClass9WF r1 = new AnonymousClass9WF(this.A05, obj2, r10, false);
                    r1.A00 = new AR6(A002, ldp);
                    r11.A0B(r1);
                    AnonymousClass9WF.A00(r1);
                    int i4 = surfaceCropFilterModel.A05;
                    r11.A06(i4, i4, 0, false, false);
                    float f = surfaceCropFilterModel.A01;
                    if (f > 0.0f) {
                        int i5 = i;
                        float f2 = (float) i;
                        float f3 = (float) i2;
                        if (f > f2 / f3) {
                            i5 = AnonymousClass7TE.A06(f3, f);
                            i3 = i2;
                        } else {
                            i3 = AnonymousClass1GB.A01(f2 / f);
                        }
                        r11.A05(i5, i3);
                        r11.A09((C346267ut) null, i, i2);
                        r11.A07(A002);
                        C344727sK.A00(r11.A0C, (Long) null);
                        obj.A00 = r11.A00();
                    }
                }
            }
        } finally {
            this.A03.post(new C40990Ama(this, obj));
            r11.A03();
        }
    }

    public final void cancel() {
        this.A03.post(new C40768Aiy(this));
    }
}
