package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.Lkd  reason: case insensitive filesystem */
public final class C64938Lkd implements C66534MVo {
    public int A00;
    public C353998Kg A01;
    public FilterGroupModel A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public int A06;
    public C60060Jeb A07;
    public final UserSession A08;
    public final CreationSession A09;

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public static void A00(FilterGroupModel filterGroupModel, int i) {
        PhotoFilter A002 = C394999z2.A00(filterGroupModel, 002.A0R("FilterStrengthController", "_setPhotoFilterStrength()"));
        if (A002 != null) {
            A002.A00(i);
        }
    }

    public final boolean CNG(C60060Jeb jeb, FilterGroupModel filterGroupModel) {
        int i;
        PhotoFilter A002 = C394999z2.A00(filterGroupModel, 002.A0R("FilterStrengthController", "_initializeTile()"));
        if (A002 != null) {
            i = A002.A08;
        } else {
            i = -1;
        }
        C66568MWw mWw = jeb.A05.A01;
        0qQ.A07(mWw);
        C61715KJg kJg = (C61715KJg) mWw;
        PhotoFilter photoFilter = kJg.A00;
        if (photoFilter == null) {
            photoFilter = new PhotoFilter(kJg.A01, kJg.A00.A01, AnonymousClass05K.A00);
            kJg.A00 = photoFilter;
        }
        boolean z = true;
        boolean z2 = false;
        if (i == photoFilter.A08) {
            z2 = true;
            if (i == 0) {
                z = false;
            }
            jeb.setShouldShowSlidersIcon(z);
            this.A05 = i;
        }
        jeb.setChecked(z2);
        return z2;
    }

    public final void CuZ(boolean z) {
        if (z) {
            this.A06 = this.A00;
            if (this.A09.A0C != null) {
                27r A012 = 27p.A01(this.A08);
                28t r1 = 28t.A05;
                if (A012.A0J() != null) {
                    27r.A03(r1, C59725JVj.POST_CAPTURE, A012, "FEED_COLOR_FILTER_STRENGTH_SINGLE_IN_CAROUSEL_DONE_TAP", false, false);
                }
            }
        }
        A00(this.A02, this.A06);
        this.A02 = null;
        this.A01 = null;
        this.A04 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dij(android.view.View r9, android.view.ViewGroup r10, X.C353998Kg r11, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r12) {
        /*
            r8 = this;
            X.Jeb r9 = (X.C60060Jeb) r9
            java.lang.String r6 = "FilterStrengthController"
            java.lang.String r0 = "_onSelect()_1"
            java.lang.String r0 = X.002.A0R(r6, r0)
            com.instagram.creation.photo.edit.effectfilter.PhotoFilter r1 = X.C394999z2.A00(r12, r0)
            X.Jez r5 = r9.A05
            X.MWw r7 = r5.A01
            X.0qQ.A07(r7)
            X.KJg r7 = (X.C61715KJg) r7
            com.instagram.creation.photo.edit.effectfilter.PhotoFilter r4 = r7.A00
            if (r4 != 0) goto L_0x002a
            com.instagram.common.session.UserSession r3 = r7.A01
            X.L7l r0 = r7.A00
            X.8Kd r2 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            com.instagram.creation.photo.edit.effectfilter.PhotoFilter r4 = new com.instagram.creation.photo.edit.effectfilter.PhotoFilter
            r4.<init>(r3, r2, r0)
            r7.A00 = r4
        L_0x002a:
            int r2 = r8.A05
            int r0 = X.C66568MWw.A00(r5)
            r3 = 1
            if (r2 != r0) goto L_0x0060
            int r0 = r4.A08
            if (r0 == 0) goto L_0x0060
            r8.A02 = r12
            r8.A01 = r11
            java.lang.String r0 = "_onSelect()_2"
            java.lang.String r0 = X.002.A0R(r6, r0)
            com.instagram.creation.photo.edit.effectfilter.PhotoFilter r0 = X.C394999z2.A00(r12, r0)
            if (r0 == 0) goto L_0x0053
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r0 = r0.A03
            float r1 = r0.A00
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r8.A00 = r0
            r8.A06 = r0
        L_0x0053:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r8.A02
            r0 = 19
            boolean r0 = r1.CTc(r0)
            r8.A03 = r0
            r8.A07 = r9
            return r3
        L_0x0060:
            X.Jeb r0 = r8.A07
            r2 = 0
            if (r0 == 0) goto L_0x0068
            r0.setChecked(r2)
        L_0x0068:
            int r6 = r4.A08
            boolean r0 = X.AnonymousClass7TF.A1P(r6)
            r9.setShouldShowSlidersIcon(r0)
            r9.setChecked(r3)
            r9.refreshDrawableState()
            r8.A07 = r9
            int r0 = X.C66568MWw.A00(r5)
            r8.A05 = r0
            if (r1 == 0) goto L_0x00d6
            int r0 = r1.A01
            r4.A01 = r0
            boolean r0 = r4.A06
            r4.A06 = r0
            int r0 = r1.A02
            r4.A02 = r0
            float r0 = r1.A00
            r4.A00 = r0
            boolean r0 = r1.A06
            r4.A06 = r0
            boolean r0 = r1.A04
            r4.A04 = r0
            int r0 = r1.A08
            if (r6 != r0) goto L_0x00d6
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r0 = r1.A03
            float r1 = r0.A00
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r0 = (int) r1
        L_0x00a5:
            r4.A00(r0)
        L_0x00a8:
            r0 = r12
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x00bf
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r5 = r4.A03
            java.lang.String r1 = X.C366508p8.A01(r6)
            java.lang.String r0 = "normal"
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            r5.A02 = r0
        L_0x00bf:
            r0 = 17
            r12.EWk(r4, r0)
            r0 = 22
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = r12.B5u(r0)
            if (r0 == 0) goto L_0x00cd
            r3 = 0
        L_0x00cd:
            java.lang.String r0 = "FilterGroupModel has BorderFilter"
            X.02V.A06(r3, r0)
            r11.EEp()
            return r2
        L_0x00d6:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r0 = r4.A03
            float r1 = r0.A00
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r0 != 0) goto L_0x00a8
            r0 = 100
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64938Lkd.Dij(android.view.View, android.view.ViewGroup, X.8Kg, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel):boolean");
    }

    public final String getTitle() {
        return C66568MWw.A02(this.A07);
    }

    public C64938Lkd(UserSession userSession, CreationSession creationSession) {
        this.A08 = userSession;
        this.A09 = creationSession;
    }

    public final View AZq(Context context) {
        View A0C = DbT.A0C(LayoutInflater.from(context), (ViewGroup) null, R.layout.filter_strength_adjuster);
        C14724U4o u4o = (C14724U4o) A0C.requireViewById(R.id.filter_strength_seek);
        u4o.setCurrentValue(this.A06);
        C65761LzF.A01(u4o, this, 3);
        return A0C;
    }

    public final boolean CIj(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A04 = true;
            A00(this.A02, 0);
        } else {
            if (motionEvent.getAction() == 1) {
                this.A04 = false;
                A00(this.A02, this.A00);
            }
            return true;
        }
        C353998Kg r0 = this.A01;
        r0.getClass();
        r0.EEp();
        return true;
    }

    public final /* synthetic */ boolean CNF(C60060Jeb jeb, PhotoFilter photoFilter) {
        return false;
    }
}
