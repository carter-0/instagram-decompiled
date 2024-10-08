package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ZP  reason: invalid class name */
public final class AnonymousClass3ZP {
    public final UserSession A00;
    public final C242813Wa A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 4));

    public static final JV5 A00(Context context, 1Xj r3) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(context, 1);
        ArrayList A0U = 00k.A0U(r3.A3Q());
        List coauthorProducers = r3.A0C.getCoauthorProducers();
        if (coauthorProducers != null) {
            A0U.removeAll(coauthorProducers);
        }
        return new JV5(new AnonymousClass3ZT(r3), (CharSequence) C49946FGa.A01(context, A0U, r3.A5l()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r4.A03 == r5.getColor(com.instagram.android.R.color.canvas_bottom_sheet_description_text_color)) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r0 = r2.A1O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r0 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        r6 = X.AnonymousClass3ZJ.A04(r1, r2.A1J());
        r0 = r2.A1O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r0 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r7 = X.AnonymousClass3ZJ.A03(r1, r2.A1J());
        X.0qQ.A07(r7);
        r0 = r2.A1O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r0 == null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r0 = r2.A1J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r1 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        r10 = r1.BUk().isExplicit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        return new X.N4R(29, (java.lang.Object) new X.AnonymousClass4Ke(X.AnonymousClass3ZJ.A00(r2.A1J()), (X.C67061rp) null, r6, r7, com.instagram.android.R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, r10, false, false, r13, r14, X.AnonymousClass3ZJ.A0D(r3, r2), X.C263304Kd.A03(r2.A0C.getClipsMetadata()), false), (java.lang.Object) new X.AnonymousClass3ZT(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r0 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009c, code lost:
        r10 = r0.isExplicit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a1, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r4.A0A != true) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r21 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        r14 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.N4R A01(android.content.Context r19, X.1Xj r20, X.C243683Zu r21) {
        /*
            r18 = this;
            r9 = 0
            r2 = r20
            X.0qQ.A0B(r2, r9)
            r1 = 1
            r5 = r19
            X.0qQ.A0B(r5, r1)
            r0 = r18
            com.instagram.common.session.UserSession r3 = r0.A00
            boolean r0 = r2.A4r()
            if (r0 != 0) goto L_0x0018
            r2 = 0
            return r2
        L_0x0018:
            r4 = r21
            if (r21 == 0) goto L_0x0021
            boolean r0 = r4.A0A
            r13 = 1
            if (r0 == r1) goto L_0x0024
        L_0x0021:
            r13 = 0
            if (r21 == 0) goto L_0x0030
        L_0x0024:
            int r1 = r4.A03
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r5.getColor(r0)
            r14 = 1
            if (r1 == r0) goto L_0x0031
        L_0x0030:
            r14 = 0
        L_0x0031:
            X.46h r0 = r2.A1O()
            if (r0 == 0) goto L_0x00a7
            com.instagram.api.schemas.MusicInfo r1 = r0.A00
        L_0x0039:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r2.A1J()
            java.lang.String r6 = X.AnonymousClass3ZJ.A04(r1, r0)
            X.46h r0 = r2.A1O()
            if (r0 == 0) goto L_0x00a5
            com.instagram.api.schemas.MusicInfo r1 = r0.A00
        L_0x0049:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r2.A1J()
            java.lang.String r7 = X.AnonymousClass3ZJ.A03(r1, r0)
            X.0qQ.A07(r7)
            X.46h r0 = r2.A1O()
            if (r0 == 0) goto L_0x00a3
            com.instagram.api.schemas.MusicInfo r1 = r0.A00
        L_0x005c:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r2.A1J()
            if (r1 == 0) goto L_0x009a
            com.instagram.api.schemas.TrackData r0 = r1.BUk()
            boolean r10 = r0.isExplicit()
        L_0x006a:
            r5 = 0
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r2.A1J()
            X.9Ie r4 = X.AnonymousClass3ZJ.A00(r0)
            boolean r15 = X.AnonymousClass3ZJ.A0D(r3, r2)
            X.1Xy r0 = r2.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            boolean r16 = X.C263304Kd.A03(r0)
            r8 = 2131165249(0x7f070041, float:1.794471E38)
            X.4Ke r3 = new X.4Ke
            r11 = r9
            r12 = r9
            r17 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.3ZT r1 = new X.3ZT
            r1.<init>(r2)
            r0 = 29
            X.N4R r2 = new X.N4R
            r2.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r1)
            return r2
        L_0x009a:
            if (r0 == 0) goto L_0x00a1
            boolean r10 = r0.isExplicit()
            goto L_0x006a
        L_0x00a1:
            r10 = 0
            goto L_0x006a
        L_0x00a3:
            r1 = 0
            goto L_0x005c
        L_0x00a5:
            r1 = 0
            goto L_0x0049
        L_0x00a7:
            r1 = 0
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZP.A01(android.content.Context, X.1Xj, X.3Zu):X.N4R");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        if (X.AnonymousClass3ZJ.A0A(r0) != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r4.A03 != r7.getColor(com.instagram.android.R.color.canvas_bottom_sheet_description_text_color)) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.N4R A02(android.content.Context r21, X.1Xj r22, X.C243683Zu r23, X.AnonymousClass3W1 r24) {
        /*
            r20 = this;
            r0 = 0
            r3 = r22
            X.0qQ.A0B(r3, r0)
            r0 = 1
            r2 = r24
            X.0qQ.A0B(r2, r0)
            r0 = 2
            r7 = r21
            X.0qQ.A0B(r7, r0)
            r0 = r20
            com.instagram.common.session.UserSession r5 = r0.A00
            X.3Wa r1 = r0.A01
            r11 = 0
            X.1Xy r0 = r3.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x00b3
            com.instagram.api.schemas.MusicInfo r4 = r0.BUr()
            if (r4 != 0) goto L_0x002d
            com.instagram.api.schemas.OriginalSoundDataIntf r4 = r0.BZB()
            if (r4 == 0) goto L_0x00b3
        L_0x002d:
            r4 = r23
            if (r23 == 0) goto L_0x003e
            int r6 = r4.A03
            r4 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r4 = r7.getColor(r4)
            r16 = 1
            if (r6 == r4) goto L_0x0040
        L_0x003e:
            r16 = 0
        L_0x0040:
            com.instagram.api.schemas.MusicInfo r6 = r0.BUr()
            com.instagram.api.schemas.OriginalSoundDataIntf r4 = r0.BZB()
            java.lang.String r8 = X.AnonymousClass3ZJ.A04(r6, r4)
            com.instagram.api.schemas.MusicInfo r6 = r0.BUr()
            com.instagram.api.schemas.OriginalSoundDataIntf r4 = r0.BZB()
            java.lang.String r9 = X.AnonymousClass3ZJ.A03(r6, r4)
            X.0qQ.A07(r9)
            com.instagram.api.schemas.OriginalSoundDataIntf r4 = r0.BZB()
            if (r4 == 0) goto L_0x007a
            com.instagram.api.schemas.OriginalAudioSubtype r4 = r4.BYy()
            if (r4 == 0) goto L_0x007a
            int r6 = r4.ordinal()
            r4 = 3
            if (r6 != r4) goto L_0x007a
            com.instagram.api.schemas.OriginalSoundDataIntf r4 = r0.BZB()
            if (r4 == 0) goto L_0x007a
            boolean r4 = r4.isExplicit()
            if (r4 != 0) goto L_0x0081
        L_0x007a:
            boolean r4 = X.AnonymousClass3ZJ.A0A(r0)
            r12 = 0
            if (r4 == 0) goto L_0x0082
        L_0x0081:
            r12 = 1
        L_0x0082:
            boolean r13 = X.AnonymousClass3ZJ.A0B(r0)
            X.1rp r7 = r0.AZY()
            com.instagram.api.schemas.OriginalSoundDataIntf r4 = r0.BZB()
            X.9Ie r6 = X.AnonymousClass3ZJ.A00(r4)
            boolean r17 = X.AnonymousClass3ZJ.A0D(r5, r3)
            boolean r18 = X.C263304Kd.A03(r0)
            r10 = 2131165249(0x7f070041, float:1.794471E38)
            X.4Ke r5 = new X.4Ke
            r14 = r11
            r15 = r11
            r19 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.5h0 r4 = new X.5h0
            r4.<init>(r0, r3, r1, r2)
            r1 = 28
            X.N4R r0 = new X.N4R
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r4)
            return r0
        L_0x00b3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZP.A02(android.content.Context, X.1Xj, X.3Zu, X.3W1):X.N4R");
    }

    public final void A03(1Xj r8, AnonymousClass3W1 r9, int i) {
        AnonymousClass3W1 r3 = r9;
        0qQ.A0B(r9, 1);
        1Xj r2 = r8;
        User A2A = r8.A2A(this.A00);
        C242813Wa r1 = this.A01;
        if (A2A != null) {
            r1.D3K(r2, r3, A2A.getId(), i, false);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass3ZP(UserSession userSession, C242813Wa r4) {
        this.A00 = userSession;
        this.A01 = r4;
    }
}
