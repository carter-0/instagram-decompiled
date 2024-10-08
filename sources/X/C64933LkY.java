package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.HashMap;

/* renamed from: X.LkY  reason: case insensitive filesystem */
public final class C64933LkY implements C66534MVo {
    public int A00;
    public MXP A01;
    public FilterGroupModel A02;
    public HashMap A03 = AnonymousClass7TE.A1E();
    public int A04;
    public int A05 = 100;
    public C60060Jeb A06;
    public final UserSession A07;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r9 != null) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(android.view.View r7, X.C353998Kg r8, com.instagram.filterkit.filter.VideoFilter r9, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r10) {
        /*
            r6 = this;
            r1 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r6.A02 = r10
            X.Jeb r7 = (X.C60060Jeb) r7
            r2 = 1
            if (r10 == 0) goto L_0x005d
            r0 = r10
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x005d
            r0 = 17
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = r10.B5u(r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter) r0
            if (r0 == 0) goto L_0x005a
            java.lang.String r4 = r0.A04
            java.lang.String r0 = "normal"
            boolean r0 = r4.equals(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            int r3 = r6.A04
            X.Jez r0 = r7.A05
            int r0 = X.C66568MWw.A00(r0)
            if (r3 == r0) goto L_0x0041
            int r4 = X.C366508p8.A00(r4)
            r3 = 1000(0x3e8, float:1.401E-42)
            r0 = 100
            if (r4 < r3) goto L_0x003f
            r0 = 50
        L_0x003f:
            r6.A00 = r0
        L_0x0041:
            X.MXP r8 = (X.MXP) r8
            r6.A01 = r8
            int r3 = r6.A04
            X.Jez r0 = r7.A05
            int r0 = X.C66568MWw.A00(r0)
            if (r3 != r0) goto L_0x0072
            boolean r0 = r5.booleanValue()
            if (r0 != 0) goto L_0x0072
            int r0 = r6.A00
            r6.A05 = r0
            return r2
        L_0x005a:
            if (r9 == 0) goto L_0x0079
            goto L_0x0041
        L_0x005d:
            if (r9 == 0) goto L_0x0079
            int r0 = r6.A00(r9)
            r6.A00 = r0
            r9.A03 = r0
            int r0 = r9.A0O
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            goto L_0x0041
        L_0x0072:
            X.Jeb r0 = r6.A06
            if (r0 == 0) goto L_0x0079
            r0.setChecked(r1)
        L_0x0079:
            boolean r0 = r5.booleanValue()
            r0 = r0 ^ 1
            r7.setShouldShowSlidersIcon(r0)
            r7.setChecked(r2)
            r7.refreshDrawableState()
            r6.A06 = r7
            X.Jez r0 = r7.A05
            int r0 = X.C66568MWw.A00(r0)
            r6.A04 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64933LkY.A01(android.view.View, X.8Kg, com.instagram.filterkit.filter.VideoFilter, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel):boolean");
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final int A00(VideoFilter videoFilter) {
        FilterGroupModel filterGroupModel = this.A02;
        if (filterGroupModel != null && ((FilterGroupModelImpl) filterGroupModel).A04) {
            return this.A00;
        }
        if (videoFilter == null) {
            return 100;
        }
        HashMap hashMap = this.A03;
        Integer valueOf = Integer.valueOf(videoFilter.A0O);
        if (hashMap.get(valueOf) != null) {
            return AnonymousClass7TE.A0M(this.A03.get(valueOf));
        }
        return 100;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CuZ(boolean r8) {
        /*
            r7 = this;
            X.MXP r0 = r7.A01
            r0.getClass()
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r7.A02
            if (r1 == 0) goto L_0x004c
            r0 = r1
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x004c
            r0 = 17
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r2 = r1.B5u(r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r2 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter) r2
            if (r2 == 0) goto L_0x0028
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r8 == 0) goto L_0x0045
            int r0 = r7.A00
            float r0 = (float) r0
            float r0 = r0 / r1
            r2.A00 = r0
        L_0x0024:
            int r0 = r7.A00
            r7.A05 = r0
        L_0x0028:
            r0 = 0
            r7.A01 = r0
            if (r8 == 0) goto L_0x0044
            com.instagram.common.session.UserSession r0 = r7.A07
            X.27r r3 = X.27p.A01(r0)
            X.28t r1 = X.28t.A06
            X.4yP r0 = r3.A0J()
            if (r0 == 0) goto L_0x0044
            X.JVj r2 = X.C59725JVj.POST_CAPTURE
            java.lang.String r4 = "FEED_COLOR_FILTER_STRENGTH_SINGLE_IN_CAROUSEL_DONE_TAP"
            r5 = 0
            r6 = r5
            X.27r.A03(r1, r2, r3, r4, r5, r6)
        L_0x0044:
            return
        L_0x0045:
            int r0 = r7.A05
            float r0 = (float) r0
            float r0 = r0 / r1
            r2.A00 = r0
            goto L_0x0028
        L_0x004c:
            if (r8 == 0) goto L_0x0069
            java.util.HashMap r2 = r7.A03
            X.MXP r0 = r7.A01
            com.instagram.filterkit.filter.VideoFilter r0 = r0.B5q()
            r0.getClass()
            int r0 = r0.A0O
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r0)
            goto L_0x0024
        L_0x0069:
            X.MXP r0 = r7.A01
            com.instagram.filterkit.filter.VideoFilter r0 = r0.B5q()
            if (r0 == 0) goto L_0x0028
            java.util.HashMap r2 = r7.A03
            X.MXP r0 = r7.A01
            com.instagram.filterkit.filter.VideoFilter r0 = r0.B5q()
            int r0 = r0.A0O
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r7.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r0)
            X.MXP r1 = r7.A01
            int r0 = r7.A05
            r1.EWp(r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64933LkY.CuZ(boolean):void");
    }

    public final String getTitle() {
        return C66568MWw.A02(this.A06);
    }

    public C64933LkY(UserSession userSession) {
        this.A07 = userSession;
    }

    public final View AZq(Context context) {
        View A0C = DbT.A0C(LayoutInflater.from(context), (ViewGroup) null, R.layout.filter_strength_adjuster);
        C14724U4o u4o = (C14724U4o) A0C.requireViewById(R.id.filter_strength_seek);
        u4o.setCurrentValue(this.A00);
        C65761LzF.A01(u4o, this, 9);
        return A0C;
    }

    public final /* synthetic */ boolean CIj(View view, MotionEvent motionEvent) {
        return false;
    }

    public final /* synthetic */ boolean CNF(C60060Jeb jeb, PhotoFilter photoFilter) {
        return false;
    }

    public final /* synthetic */ boolean CNG(C60060Jeb jeb, FilterGroupModel filterGroupModel) {
        return false;
    }

    public final /* synthetic */ boolean Dij(View view, ViewGroup viewGroup, C353998Kg r4, FilterGroupModel filterGroupModel) {
        return false;
    }
}
