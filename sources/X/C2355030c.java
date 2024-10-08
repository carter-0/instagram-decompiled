package X;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.listview.StickyHeaderListView;

/* renamed from: X.30c  reason: invalid class name and case insensitive filesystem */
public final class C2355030c extends C252233om implements C2355130d {
    public Rect A00;
    public StickyHeaderListView A01;
    public final Fragment A02;
    public final UserSession A03;
    public final C230532pm A04;
    public final AnonymousClass4DU A05;
    public final C231332rR A06;
    public final boolean A07;

    /* renamed from: A00 */
    public final void Cs1(1Xj r8, int i) {
        ExtendedImageUrl extendedImageUrl;
        int height;
        int width;
        1Xj r3 = r8;
        if (r8.A1p() != null) {
            extendedImageUrl = r8.A1n(this.A02.requireContext());
        } else {
            extendedImageUrl = null;
        }
        C230532pm r1 = this.A04;
        if (extendedImageUrl == null) {
            height = 0;
            width = 0;
        } else {
            height = extendedImageUrl.getHeight();
            width = extendedImageUrl.getWidth();
        }
        r1.Dv0((0jB) null, r3, i, height, width);
    }

    public final void onDestroyView() {
        this.A01 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.1Xj r24, X.AnonymousClass345 r25, int r26) {
        /*
            r23 = this;
            r12 = r23
            android.graphics.Rect r0 = r12.A00
            if (r0 != 0) goto L_0x001a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.A00 = r0
            androidx.fragment.app.Fragment r0 = r12.A02
            X.4DV r0 = (X.AnonymousClass4DV) r0
            X.3Ar r1 = r0.getScrollingViewProxy()
            android.graphics.Rect r0 = r12.A00
            r1.B9Z(r0)
        L_0x001a:
            androidx.fragment.app.Fragment r1 = r12.A02
            r3 = r1
            X.4DV r3 = (X.AnonymousClass4DV) r3
            X.3Ar r9 = r3.getScrollingViewProxy()
            X.2rR r8 = r12.A06
            r11 = r24
            X.3W1 r7 = r8.BQr(r11)
            int r5 = r7.getPosition()
            java.lang.String r4 = r11.getId()
            boolean r0 = r12.A07
            r6 = 0
            if (r0 == 0) goto L_0x01bb
            if (r1 == 0) goto L_0x01bb
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x01bb
            android.widget.FrameLayout r1 = r0.A0S
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r6, r6, r6, r6)
            r1.getGlobalVisibleRect(r0)
            int r2 = r0.bottom
        L_0x004e:
            com.instagram.ui.listview.StickyHeaderListView r15 = r12.A01
            r14 = -2
            r13 = r25
            r10 = r26
            if (r15 == 0) goto L_0x006b
            X.3Ar r0 = r3.getScrollingViewProxy()
            android.view.View r1 = r0.AnE(r10)
            if (r1 == 0) goto L_0x0073
            android.graphics.Rect r0 = r12.A00
            int r0 = X.C253923rd.A00(r0, r1, r15, r2)
            if (r0 == r14) goto L_0x006b
            if (r0 <= 0) goto L_0x0073
        L_0x006b:
            r1 = -1
            r0 = r10
            if (r5 == r1) goto L_0x0070
            r0 = r5
        L_0x0070:
            r13.FNB(r4, r11, r0)
        L_0x0073:
            X.0qQ.A0B(r9, r6)
            X.3s4 r1 = X.C253923rd.A0B(r9, r10)
            X.3s4 r0 = X.C254183s4.HOLDOUT
            if (r1 == r0) goto L_0x0172
            X.3Ar r0 = r3.getScrollingViewProxy()
            android.view.View r18 = r0.AnE(r10)
            r16 = 0
            if (r18 == 0) goto L_0x01b7
            android.graphics.Rect r14 = r12.A00
            com.instagram.ui.listview.StickyHeaderListView r3 = r12.A01
            X.0qQ.A0B(r14, r6)
            java.lang.Object r0 = r18.getTag()
            if (r0 == 0) goto L_0x01b3
            android.view.View r1 = X.C253923rd.A05(r11, r0)
            boolean r0 = r0 instanceof X.C254163s2
            if (r0 == 0) goto L_0x00a7
            X.4EA r0 = X.C253923rd.A07(r18)
            if (r0 == 0) goto L_0x00a7
            android.view.View r1 = r0.itemView
        L_0x00a7:
            if (r1 == 0) goto L_0x01b3
            int r0 = X.C253923rd.A00(r14, r1, r3, r2)
            double r2 = (double) r0
            int r0 = r1.getHeight()
            double r0 = (double) r0
            double r2 = r2 / r0
        L_0x00b4:
            r14 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x00c2
            r1 = -1
            r0 = r10
            if (r5 == r1) goto L_0x00bf
            r0 = r5
        L_0x00bf:
            r13.FNA(r4, r11, r0)
        L_0x00c2:
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d1
            r21 = r2
            r19 = r11
            r20 = r4
            r17 = r13
            r17.FNC(r18, r19, r20, r21)
        L_0x00d1:
            X.4DU r0 = r12.A05
            boolean r0 = X.AnonymousClass3WX.A02(r11, r0)
            if (r0 == 0) goto L_0x00ef
            android.graphics.Rect r14 = r12.A00
            com.instagram.ui.listview.StickyHeaderListView r1 = r12.A01
            X.0qQ.A0B(r14, r6)
            r13 = 1
            java.lang.Object r4 = r18.getTag()
            if (r4 == 0) goto L_0x00ef
            boolean r0 = r7.A2j
            if (r0 == 0) goto L_0x0173
            boolean r0 = r7.A2c
            if (r0 == 0) goto L_0x0173
        L_0x00ef:
            com.instagram.common.session.UserSession r4 = r12.A03
            if (r4 == 0) goto L_0x0172
            X.3s4 r1 = X.C253923rd.A0B(r9, r10)
            X.3s4 r0 = X.C254183s4.MEDIA_CONTENT
            if (r1 == r0) goto L_0x010b
            X.3s4 r0 = X.C254183s4.CAROUSEL
            if (r1 == r0) goto L_0x010b
            X.3s4 r0 = X.C254183s4.COLLECTION_TOP_MAIN_BOTTOM_THREE
            if (r1 == r0) goto L_0x010b
            X.3s4 r0 = X.C254183s4.FULL_HEIGHT_MEDIA
            if (r1 == r0) goto L_0x010b
            X.3s4 r0 = X.C254183s4.SERVER_RENDERED_CONTENT
            if (r1 != r0) goto L_0x0172
        L_0x010b:
            if (r18 == 0) goto L_0x0172
            X.32g r1 = X.C2360432f.A00(r4)
            X.3W1 r0 = r8.BQr(r11)
            boolean r0 = r1.A03(r11, r0)
            if (r0 == 0) goto L_0x0172
            boolean r1 = X.AnonymousClass3YF.A00(r4, r11)
            int r0 = r7.A02
            boolean r0 = X.C253933re.A00(r11, r0)
            if (r1 != 0) goto L_0x0129
            if (r0 == 0) goto L_0x0172
        L_0x0129:
            X.C2360432f.A00(r4)
            r13 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            android.graphics.Rect r9 = r12.A00
            X.0qQ.A0B(r9, r6)
            java.lang.Object r0 = r18.getTag()
            r8 = 0
            if (r0 == 0) goto L_0x015c
            android.view.View r5 = X.C253923rd.A05(r11, r0)
            if (r5 == 0) goto L_0x015c
            android.graphics.Rect r4 = X.C253923rd.A00
            boolean r0 = r5.getGlobalVisibleRect(r4)
            if (r0 == 0) goto L_0x015c
            int r1 = r4.bottom
            int r0 = r9.bottom
            if (r1 < r0) goto L_0x015b
            int r1 = r4.height()
            int r0 = r5.getHeight()
            if (r1 != r0) goto L_0x015c
        L_0x015b:
            r8 = 1
        L_0x015c:
            int r1 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            r0 = 0
            if (r1 < 0) goto L_0x0162
            r0 = 1
        L_0x0162:
            if (r8 == 0) goto L_0x0167
            if (r0 == 0) goto L_0x0167
            r6 = 1
        L_0x0167:
            boolean r0 = r7.A2d
            if (r0 == r6) goto L_0x0172
            r7.A2d = r6
            r0 = 41
            X.AnonymousClass3W1.A00(r7, r0)
        L_0x0172:
            return
        L_0x0173:
            android.view.View r5 = X.C253923rd.A05(r11, r4)
            if (r5 == 0) goto L_0x00ef
            android.graphics.Rect r4 = X.C253923rd.A00
            boolean r0 = r5.getGlobalVisibleRect(r4)
            if (r0 == 0) goto L_0x00ef
            if (r1 == 0) goto L_0x01ad
            android.graphics.Rect r1 = r1.getTopChromeArea()
        L_0x0187:
            int r0 = r4.top
            int r15 = r14.top
            int r15 = java.lang.Math.max(r0, r15)
            int r1 = r1.bottom
            int r1 = java.lang.Math.max(r15, r1)
            if (r1 != r0) goto L_0x0199
            r7.A2j = r13
        L_0x0199:
            int r1 = r4.bottom
            int r0 = r14.bottom
            if (r1 < r0) goto L_0x01a9
            int r1 = r4.height()
            int r0 = r5.getHeight()
            if (r1 != r0) goto L_0x00ef
        L_0x01a9:
            r7.A2c = r13
            goto L_0x00ef
        L_0x01ad:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            goto L_0x0187
        L_0x01b3:
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x00b4
        L_0x01b7:
            r2 = 0
            goto L_0x00ef
        L_0x01bb:
            r2 = 0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2355030c.A01(X.1Xj, X.345, int):void");
    }

    public final Class C9I() {
        return 1Xj.class;
    }

    public final /* bridge */ /* synthetic */ void Cry(Object obj) {
        this.A04.DMB((1Xj) obj);
    }

    public final /* bridge */ /* synthetic */ void Crz(Object obj) {
        this.A04.Duz((1Xj) obj);
    }

    public final /* bridge */ /* synthetic */ void Cs0(Object obj, int i) {
        this.A04.DMS((1Xj) obj, i);
    }

    public final /* bridge */ /* synthetic */ void Cs3(View view, Object obj, double d) {
        this.A04.DMV(view, (1Xj) obj, d);
    }

    public final void FN9(AnonymousClass345 r2, int i) {
        Object item = this.A06.getItem(i);
        item.getClass();
        A01(((1Xl) item).BPf(), r2, i);
    }

    public C2355030c(Fragment fragment, C230532pm r3, AnonymousClass4DU r4, C231332rR r5, boolean z) {
        this.A02 = fragment;
        this.A05 = r4;
        this.A06 = r5;
        this.A04 = r3;
        this.A07 = z;
        this.A03 = (UserSession) C227642jf.A02(fragment).getValue();
    }

    public final void D6z(View view) {
        this.A01 = (StickyHeaderListView) view.findViewById(R.id.sticky_header_list);
    }
}
