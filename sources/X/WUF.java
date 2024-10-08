package X;

import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class WUF implements AnonymousClass2en {
    public C15884Uk8 A00;
    public final 2el A01;
    public final MediaMapFragment A02;
    public final MediaMapFragment A03;
    public final WU1 A04;
    public final WU2 A05;
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();
    public final Set A08 = new HashSet();
    public final Set A09 = new HashSet();

    public WUF(UserSession userSession, 2el r4, MediaMapFragment mediaMapFragment, MediaMapFragment mediaMapFragment2) {
        this.A01 = r4;
        this.A03 = mediaMapFragment;
        this.A02 = mediaMapFragment2;
        this.A05 = new WU2(mediaMapFragment2);
        this.A04 = new WU1(mediaMapFragment2);
        this.A00 = new C15884Uk8(1Bk.A00(C229272n7.A00(userSession, AnonymousClass000.A00(3574))), mediaMapFragment2);
        r4.A00 = this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0066 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dgu() {
        /*
            r13 = this;
            long r11 = java.lang.System.currentTimeMillis()
            java.util.Map r3 = r13.A07
            r3.clear()
            java.util.Set r4 = r13.A08
            r4.clear()
            java.util.Set r10 = r13.A09
            r10.clear()
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r9 = r13.A03
            android.view.View r1 = r9.mView
            X.VwL r0 = r9.mMapViewController
            if (r0 == 0) goto L_0x00ad
            if (r1 == 0) goto L_0x00ad
            com.instagram.discovery.mediamap.fragment.MapBottomSheetController r0 = r9.A0A
            if (r0 == 0) goto L_0x00ad
            android.graphics.Rect r8 = r9.A0d
            int r7 = r1.getLeft()
            int r6 = r1.getTop()
            int r5 = r1.getRight()
            com.instagram.discovery.mediamap.fragment.MapBottomSheetController r2 = r9.A0A
            android.view.View r0 = r2.mBottomSheet
            if (r0 != 0) goto L_0x00a4
            r1 = 0
        L_0x0036:
            int r0 = java.lang.Math.round(r1)
            r8.set(r7, r6, r5, r0)
            X.VwL r0 = r9.mMapViewController
            X.VZc r2 = r0.A04(r8)
        L_0x0043:
            X.VwL r1 = r9.mMapViewController
            if (r1 == 0) goto L_0x00af
            X.VZ8 r0 = r1.A00
            if (r0 == 0) goto L_0x00af
            X.Vjs r0 = r1.A01
            if (r0 == 0) goto L_0x00af
            if (r2 == 0) goto L_0x00af
            java.util.Set r0 = r1.A07()
            java.util.HashSet r5 = r1.A06(r0)
            com.facebook.android.maps.model.LatLng r1 = r2.A04
            com.facebook.android.maps.model.LatLng r0 = r2.A01
            com.facebook.android.maps.model.LatLngBounds r2 = new com.facebook.android.maps.model.LatLngBounds
            r2.<init>(r1, r0)
            java.util.Iterator r6 = r5.iterator()
        L_0x0066:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r5 = r6.next()
            X.UGt r5 = (X.C14955UGt) r5
            boolean r0 = r5 instanceof X.C16076Uo3
            if (r0 == 0) goto L_0x009f
            r0 = r5
            X.Uo3 r0 = (X.C16076Uo3) r0
            X.VwL r1 = r9.mMapViewController
            android.graphics.Rect r0 = X.C16076Uo3.A00(r0)
            X.VZc r1 = r1.A04(r0)
            if (r1 == 0) goto L_0x0066
            com.facebook.android.maps.model.LatLng r0 = r1.A01
            boolean r0 = r2.A01(r0)
            if (r0 != 0) goto L_0x0095
            com.facebook.android.maps.model.LatLng r0 = r1.A04
        L_0x008f:
            boolean r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0066
        L_0x0095:
            java.lang.String r0 = r5.A0J()
            if (r0 == 0) goto L_0x0066
            r10.add(r0)
            goto L_0x0066
        L_0x009f:
            com.facebook.android.maps.model.LatLng r0 = r5.Bdm()
            goto L_0x008f
        L_0x00a4:
            float r1 = r0.getTranslationY()
            int r0 = r2.A00
            float r0 = (float) r0
            float r1 = r1 + r0
            goto L_0x0036
        L_0x00ad:
            r2 = 0
            goto L_0x0043
        L_0x00af:
            java.util.Map r7 = r13.A06
            java.util.Iterator r8 = X.AnonymousClass7TF.A0u(r7)
        L_0x00b5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00de
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r8)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            long r5 = X.AnonymousClass7TE.A0R(r0)
            boolean r0 = r10.contains(r2)
            if (r0 != 0) goto L_0x00b5
            long r0 = r11 - r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r2, r0)
            r8.remove()
            goto L_0x00b5
        L_0x00de:
            java.util.Iterator r2 = r10.iterator()
        L_0x00e2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r1 = r2.next()
            boolean r0 = r7.containsKey(r1)
            if (r0 != 0) goto L_0x00e2
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r7.put(r1, r0)
            r4.add(r1)
            goto L_0x00e2
        L_0x00fd:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0109
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0114
        L_0x0109:
            r4.size()
            r3.size()
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = r13.A02
            r0.A0K(r3)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WUF.Dgu():void");
    }
}
