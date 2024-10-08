package X;

import android.os.Bundle;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

public final class K06 extends AnonymousClass8GD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Bundle A02;
    public final /* synthetic */ EXF A03;
    public final /* synthetic */ AnonymousClass36U A04;
    public final /* synthetic */ MediaCaptureConfig A05;
    public final /* synthetic */ AnonymousClass36W A06;
    public final /* synthetic */ UpcomingEvent A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public final void A01(Exception exc) {
    }

    public K06(Bundle bundle, EXF exf, AnonymousClass36U r3, MediaCaptureConfig mediaCaptureConfig, AnonymousClass36W r5, UpcomingEvent upcomingEvent, String str, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = r3;
        this.A05 = mediaCaptureConfig;
        this.A0A = z;
        this.A0B = z2;
        this.A06 = r5;
        this.A01 = i;
        this.A02 = bundle;
        this.A03 = exf;
        this.A0D = z3;
        this.A07 = upcomingEvent;
        this.A08 = str;
        this.A09 = list;
        this.A0C = z4;
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        if (X.0qg.A00(r15, false) < 78643200) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A02(java.lang.Object r20) {
        /*
            r19 = this;
            int r16 = X.AnonymousClass7TE.A0M(r20)
            r4 = r19
            X.36U r6 = r4.A04
            com.instagram.model.creation.MediaCaptureConfig r3 = r4.A05
            boolean r15 = r4.A0A
            boolean r0 = r4.A0B
            X.36W r14 = r4.A06
            int r1 = r4.A01
            android.os.Bundle r10 = r4.A02
            X.EXF r7 = r4.A03
            boolean r8 = r4.A0D
            com.instagram.user.model.UpcomingEvent r13 = r4.A07
            java.lang.String r12 = r4.A08
            java.util.List r2 = r4.A09
            boolean r9 = r4.A0C
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            int r5 = r4.A00
            java.lang.String r4 = "openBuiltInGallery"
            if (r15 != 0) goto L_0x002c
            if (r0 == 0) goto L_0x0043
        L_0x002c:
            if (r16 == 0) goto L_0x0043
            X.EXF r0 = X.EXF.A0J
            if (r7 != r0) goto L_0x0066
            android.content.Context r15 = r6.A03
            r0 = 0
            X.0qg.A01()
            long r17 = X.0qg.A00(r15, r0)
            r15 = 78643200(0x4b00000, double:3.88549034E-316)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0066
        L_0x0043:
            java.lang.Integer r0 = X.AnonymousClass05K.A0I
            com.instagram.common.session.UserSession r3 = r6.A04
            X.C59882Jb5.A01(r3, r0)
            android.content.Context r0 = r6.A03
            java.io.File r2 = X.0mb.A04(r0)
            r6.A01 = r2
            if (r2 == 0) goto L_0x005b
            X.36P r1 = r6.A05
            r0 = 10002(0x2712, float:1.4016E-41)
            r1.Ewk(r2, r0)
        L_0x005b:
            X.JVm r0 = X.AnonymousClass9PJ.A00(r3)
            X.0JA.A01()
            X.C59728JVm.A01(r0, r4)
            return
        L_0x0066:
            X.14C r0 = X.AnonymousClass14B.A03
            r0.A00()
            android.content.Context r15 = r6.A03
            java.lang.Class<com.instagram.creation.activity.MediaCaptureActivity> r0 = com.instagram.creation.activity.MediaCaptureActivity.class
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r15, r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            r4.setFlags(r0)
            java.lang.String r0 = "captureType"
            r4.putExtra(r0, r14)
            java.lang.String r0 = "captureConfig"
            r4.putExtra(r0, r3)
            java.lang.String r0 = "mediaCaptureTab"
            r4.putExtra(r0, r1)
            com.instagram.common.session.UserSession r3 = r6.A04
            java.lang.String r1 = r3.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r4.putExtra(r0, r1)
            boolean r1 = X.C48787EkA.A00(r7)
            java.lang.String r0 = "newGalleryEligibleEntryPoint"
            r4.putExtra(r0, r1)
            if (r13 == 0) goto L_0x00a1
            java.lang.String r0 = "upcoming_event"
            r4.putExtra(r0, r13)
        L_0x00a1:
            if (r12 == 0) goto L_0x00a8
            java.lang.String r0 = "linked_highlight_id"
            r4.putExtra(r0, r12)
        L_0x00a8:
            if (r2 == 0) goto L_0x00b7
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r2)
            r0 = 1411(0x583, float:1.977E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putStringArrayListExtra(r0, r1)
        L_0x00b7:
            r2 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r11, r2)
            if (r0 == 0) goto L_0x00c7
            r0 = 35
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putExtra(r0, r9)
        L_0x00c7:
            if (r10 == 0) goto L_0x00cc
            r4.putExtras(r10)
        L_0x00cc:
            android.os.Bundle r0 = r4.getExtras()
            java.lang.String r1 = "cameraEntryPoint"
            if (r0 == 0) goto L_0x00e1
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x00e1
            X.28D r0 = X.AnonymousClass36U.A00(r7, r6)
            r4.putExtra(r1, r0)
        L_0x00e1:
            if (r8 == 0) goto L_0x00f0
            X.JbO r1 = X.JZM.A00(r3)
            r1.A03 = r2
            X.28D r0 = X.AnonymousClass36U.A00(r7, r6)
            r1.A07(r0)
        L_0x00f0:
            X.36P r0 = r6.A05
            r0.ExB(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K06.A02(java.lang.Object):void");
    }
}
