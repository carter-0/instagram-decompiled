package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.IxR  reason: case insensitive filesystem */
public final class C58780IxR extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1q5 A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ 0sL A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58780IxR(Context context, UserSession userSession, 1q5 r4, Integer num, 0sL r6, int i) {
        super(1);
        this.A03 = r4;
        this.A02 = userSession;
        this.A04 = num;
        this.A05 = r6;
        this.A01 = context;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0089, code lost:
        if (com.instagram.friendmap.data.FriendMapRepository.A02(new com.facebook.android.maps.model.LatLng(r11.getLatitude(), r11.getLongitude()), r7) != null) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            android.location.Location r11 = (android.location.Location) r11
            X.1q5 r1 = r10.A03
            com.instagram.common.session.UserSession r7 = r10.A02
            java.lang.Integer r0 = r10.A04
            X.1q5.A00(r11, r7, r1, r0)
            X.0sL r6 = r10.A05
            android.content.Context r0 = r10.A01
            int r9 = r10.A00
            android.content.res.Resources r8 = r0.getResources()
            java.lang.String r5 = X.2R6.A03
            java.lang.String r0 = "notes_tray_friend_map_pog"
            com.facebook.android.maps.StaticMapView$StaticMapOptions r4 = new com.facebook.android.maps.StaticMapView$StaticMapOptions
            r4.<init>(r0)
            r2 = 0
            if (r11 == 0) goto L_0x009b
            double r0 = r11.getLatitude()
            double r2 = r11.getLongitude()
        L_0x002a:
            r4.A01(r0, r2)
            if (r11 == 0) goto L_0x0099
            r3 = 0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36603244601611146(0x820a75001b138a, double:3.2113775032700445E-306)
            int r2 = X.DbS.A04(r2, r7, r0)
            r1 = 12
            X.2HY r0 = new X.2HY
            r0.<init>(r3, r1)
            int r0 = X.C229632nm.A05(r0, r2)
        L_0x0046:
            r4.A03(r0)
            boolean r0 = X.AnonymousClass1GD.A03()
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "dark"
        L_0x0051:
            r4.A09 = r0
            android.net.Uri r0 = com.instagram.maps.ui.IgStaticMapView.A00(r8, r4, r5, r9, r9)
            java.lang.String r0 = r0.toString()
            com.instagram.common.typedurl.SimpleImageUrl r5 = X.DbS.A0V(r0)
            if (r11 == 0) goto L_0x008b
            com.instagram.friendmap.data.FriendMapRepository r7 = X.AnonymousClass4A3.A00(r7)
            X.0Ud r0 = r7.A0N
            java.lang.Object r0 = r0.getValue()
            X.4A6 r0 = (X.AnonymousClass4A6) r0
            X.4A5 r1 = r0.A04
            X.4A5 r0 = X.AnonymousClass4A5.UNSET
            if (r1 == r0) goto L_0x008b
            X.4A5 r0 = X.AnonymousClass4A5.PRIVATE
            if (r1 == r0) goto L_0x008b
            double r3 = r11.getLatitude()
            double r1 = r11.getLongitude()
            com.facebook.android.maps.model.LatLng r0 = new com.facebook.android.maps.model.LatLng
            r0.<init>(r3, r1)
            java.lang.String r0 = com.instagram.friendmap.data.FriendMapRepository.A02(r0, r7)
            r1 = 1
            if (r0 == 0) goto L_0x008c
        L_0x008b:
            r1 = 0
        L_0x008c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.invoke(r5, r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0096:
            java.lang.String r0 = "default"
            goto L_0x0051
        L_0x0099:
            r0 = 0
            goto L_0x0046
        L_0x009b:
            r0 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58780IxR.invoke(java.lang.Object):java.lang.Object");
    }
}
