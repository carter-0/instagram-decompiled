package X;

import android.content.Context;
import com.facebook.rsys.mediasync.gen.MediaSyncContent;
import com.facebook.rsys.mediasync.gen.MediaSyncState;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* renamed from: X.NfE  reason: case insensitive filesystem */
public final class C69133NfE extends OTZ {
    public MediaSyncState A00;
    public C74438Put A01;
    public C70959OTg A02;
    public String A03;
    public boolean A04;
    public final Context A05;
    public final UserSession A06;
    public final C72179Oxo A07;
    public final OH8 A08;
    public final O9Q A09;
    public final C71149Oe9 A0A;
    public final OWA A0B;
    public final O9Z A0C;
    public final C70501O9a A0D;
    public final C62320sa A0E;
    public final 05G A0F;

    public static final N32 A00(RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, String str) {
        String str2 = str;
        String str3 = rtcStartCoWatchPlaybackArguments.A04;
        int intValue = rtcStartCoWatchPlaybackArguments.A01.intValue();
        int i = 2;
        if (intValue == 0) {
            i = 1;
        } else if (intValue != 1) {
            if (intValue == 2) {
                i = 4;
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        Long A0m = C51971G9r.A0m();
        if (str == null) {
            str2 = C70897OQp.A00(rtcStartCoWatchPlaybackArguments.A03);
        }
        return new N32((MediaSyncContent) null, rtcStartCoWatchPlaybackArguments.A00, A0m, str3, str2, 0, i, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a5, code lost:
        if (r2 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.N32 A01(X.C74577PxQ r15) {
        /*
            r14 = this;
            r11 = 0
            X.0qQ.A0B(r15, r11)
            boolean r0 = r15 instanceof X.PP5
            if (r0 == 0) goto L_0x004f
            X.PP5 r15 = (X.PP5) r15
            X.Put r5 = r15.A00
            java.lang.String r10 = r15.A02
            java.lang.Integer r7 = r15.A01
            java.lang.Integer r4 = r5.Aqk()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r4 != r0) goto L_0x0048
            com.instagram.common.session.UserSession r3 = r14.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310336420184087(0x81000f00000017, double:3.026141189888995E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0048
            r6 = 0
        L_0x0028:
            java.lang.String r9 = r5.Aqe()
            int r1 = X.C51967G9n.A03(r4, r11)
            r12 = 2
            r0 = 1
            if (r1 == r0) goto L_0x0046
            if (r1 == r12) goto L_0x003b
            r0 = 3
            r12 = 4
            if (r1 == r0) goto L_0x003b
            r12 = 0
        L_0x003b:
            java.lang.Long r8 = X.C51971G9r.A0m()
        L_0x003f:
            X.N32 r5 = new X.N32
            r13 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0045:
            return r5
        L_0x0046:
            r12 = 1
            goto L_0x003b
        L_0x0048:
            X.Oe9 r0 = r14.A0A
            com.facebook.rsys.mediasync.gen.MediaSyncContent r6 = X.C71149Oe9.A04(r5, r0)
            goto L_0x0028
        L_0x004f:
            boolean r0 = r15 instanceof X.PP3
            if (r0 == 0) goto L_0x005e
            X.PP3 r15 = (X.PP3) r15
            com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments r1 = r15.A00
            java.lang.String r0 = r15.A01
            X.N32 r5 = A00(r1, r0)
            return r5
        L_0x005e:
            boolean r0 = r15 instanceof X.PP6
            if (r0 == 0) goto L_0x0086
            com.facebook.rsys.mediasync.gen.MediaSyncState r3 = r14.A00
            if (r3 == 0) goto L_0x0116
            r11 = 2
            java.lang.String r9 = r3.contentId
            X.0qQ.A06(r9)
            int r12 = r3.contentSource
            java.lang.Long r8 = X.C51971G9r.A0m()
        L_0x0072:
            com.facebook.rsys.mediasync.gen.MediaSyncContent r6 = r3.content
            if (r6 != 0) goto L_0x0080
            X.Oe9 r1 = r14.A0A
            X.Put r0 = r14.A01
            if (r0 == 0) goto L_0x0084
            com.facebook.rsys.mediasync.gen.MediaSyncContent r6 = X.C71149Oe9.A04(r0, r1)
        L_0x0080:
            java.lang.String r10 = r3.tabSource
            r7 = 0
            goto L_0x003f
        L_0x0084:
            r6 = 0
            goto L_0x0080
        L_0x0086:
            boolean r0 = r15 instanceof X.PP2
            if (r0 == 0) goto L_0x00d7
            X.PP2 r15 = (X.PP2) r15
            long r0 = r15.A00
            com.facebook.rsys.mediasync.gen.MediaSyncState r3 = r14.A00
            r5 = 0
            if (r3 == 0) goto L_0x0045
            com.facebook.rsys.mediasync.gen.MediaSyncContent r4 = r3.content
            if (r4 != 0) goto L_0x00bd
            X.Put r4 = r14.A01
            boolean r2 = r4 instanceof X.N53
            if (r2 != 0) goto L_0x00a7
            boolean r2 = r4 instanceof X.N52
            if (r2 == 0) goto L_0x00b4
            X.N52 r4 = (X.N52) r4
            X.N2c r2 = r4.A00
        L_0x00a5:
            if (r2 == 0) goto L_0x00cf
        L_0x00a7:
            r11 = 1
            java.lang.String r9 = r3.contentId
            X.0qQ.A06(r9)
            int r12 = r3.contentSource
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            goto L_0x0072
        L_0x00b4:
            boolean r2 = r4 instanceof X.N54
            if (r2 == 0) goto L_0x00cf
            X.N54 r4 = (X.N54) r4
            X.N2c r2 = r4.A02
            goto L_0x00a5
        L_0x00bd:
            com.facebook.rsys.mediasync.gen.FacebookVideoContent r2 = r4.facebookVideoContent
            if (r2 != 0) goto L_0x00a7
            com.facebook.rsys.mediasync.gen.Fallback r2 = r4.fallback
            if (r2 == 0) goto L_0x00c8
            com.facebook.rsys.mediasync.gen.Video r2 = r2.video
            goto L_0x00a5
        L_0x00c8:
            com.facebook.rsys.mediasync.gen.InstagramContent r2 = r4.instagramContent
            if (r2 == 0) goto L_0x00cf
            com.facebook.rsys.mediasync.gen.Video r2 = r2.video
            goto L_0x00a5
        L_0x00cf:
            java.lang.String r1 = "RtcCoWatchPlaybackInteractor"
            java.lang.String r0 = "Attempt to pause non-video content"
            X.0wb.A03(r1, r0)
            return r5
        L_0x00d7:
            boolean r0 = r15 instanceof X.PP4
            if (r0 == 0) goto L_0x0118
            X.PP4 r15 = (X.PP4) r15
            long r0 = r15.A01
            long r2 = r15.A00
            java.lang.Integer r7 = r15.A02
            com.facebook.rsys.mediasync.gen.MediaSyncState r5 = r14.A00
            if (r5 == 0) goto L_0x0116
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x010f
            r13 = 4
        L_0x00ec:
            java.lang.String r9 = r5.contentId
            X.0qQ.A06(r9)
            int r12 = r5.contentSource
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            com.facebook.rsys.mediasync.gen.MediaSyncContent r6 = r5.content
            if (r6 != 0) goto L_0x0105
            X.Oe9 r1 = r14.A0A
            X.Put r0 = r14.A01
            if (r0 == 0) goto L_0x010d
            com.facebook.rsys.mediasync.gen.MediaSyncContent r6 = X.C71149Oe9.A04(r0, r1)
        L_0x0105:
            java.lang.String r10 = r5.tabSource
            X.N32 r5 = new X.N32
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        L_0x010d:
            r6 = 0
            goto L_0x0105
        L_0x010f:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r13 = 3
            if (r4 >= 0) goto L_0x00ec
            r13 = 5
            goto L_0x00ec
        L_0x0116:
            r5 = 0
            return r5
        L_0x0118:
            java.lang.String r0 = "Unsupported action"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69133NfE.A01(X.PxQ):X.N32");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69133NfE(Context context, UserSession userSession, O9R o9r, OWA owa, O9Z o9z, C70501O9a o9a, C62320sa r10) {
        super(o9r);
        C71149Oe9 oe9 = new C71149Oe9(context, userSession);
        if (AnonymousClass1pW.A00 == null) {
            0qQ.A0F("plugin");
            throw AnonymousClass00P.createAndThrow();
        }
        C72179Oxo oxo = (C72179Oxo) userSession.A01(C72179Oxo.class, C73708PiV.A00);
        0qQ.A0B(oxo, 9);
        this.A05 = context;
        this.A06 = userSession;
        this.A0B = owa;
        this.A0C = o9z;
        this.A0D = o9a;
        this.A0E = r10;
        this.A0A = oe9;
        this.A07 = oxo;
        this.A08 = new OH8(userSession, owa);
        this.A0F = DbS.A10(new C61070Jw8((MediaSyncState) null, (RtcStartCoWatchPlaybackArguments) null, (String) null, 15));
        this.A09 = new O9Q(this);
        this.A03 = "";
    }
}
