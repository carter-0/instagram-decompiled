package X;

import android.content.Context;
import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LgU  reason: case insensitive filesystem */
public final class C64699LgU implements 1wn {
    public final Context A00;
    public final 0hq A01;
    public final 28D A02;
    public final UserSession A03;
    public final MediaCaptureActivity A04;
    public final C3499682q A05;
    public final UpcomingEvent A06;

    private void A04(Fragment fragment) {
        if (fragment instanceof AnonymousClass4DH) {
            ((AnonymousClass4DH) fragment).setContentInset(0, AnonymousClass3D4.A00(this.A00), 0, 0);
        }
        if (fragment instanceof AnonymousClass32G) {
            AnonymousClass32G r4 = (AnonymousClass32G) fragment;
            r4.A00 = new Rect(0, AnonymousClass3D4.A00(this.A00), 0, 0);
            r4.A0a();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.instagram.creation.activity.MediaCaptureActivity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C64699LgU(X.0hq r2, X.28D r3, com.instagram.common.session.UserSession r4, com.instagram.creation.activity.MediaCaptureActivity r5, X.C3499582p r6, com.instagram.user.model.UpcomingEvent r7) {
        /*
            r1 = this;
            r1.<init>()
            r1.A00 = r5
            r1.A03 = r4
            r1.A01 = r2
            X.82q r0 = r6.A00()
            r1.A05 = r0
            r1.A04 = r5
            r1.A02 = r3
            r1.A06 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64699LgU.<init>(X.0hq, X.28D, com.instagram.common.session.UserSession, com.instagram.creation.activity.MediaCaptureActivity, X.82p, com.instagram.user.model.UpcomingEvent):void");
    }

    public static final ArrayList A00(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass7TE.A1Y(A1C, JTO.A0Z(it).Afz());
        }
        return A1C;
    }

    public static final ArrayList A01(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1C.add(JTO.A0Z(it).B5g());
        }
        return A1C;
    }

    public static final ArrayList A02(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession A0Z = JTO.A0Z(it);
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            CropInfo Asr = A0Z.Asr();
            if (Asr != null) {
                Rect rect = Asr.A02;
                AnonymousClass7TE.A1Y(A1C2, (long) rect.height());
                AnonymousClass7TE.A1Y(A1C2, (long) rect.width());
            }
            A1C.add(A1C2);
        }
        return A1C;
    }

    public static final ArrayList A03(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession A0Z = JTO.A0Z(it);
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            CropInfo Asr = A0Z.Asr();
            if (Asr != null) {
                AnonymousClass7TE.A1Y(A1C2, (long) Asr.A00);
                AnonymousClass7TE.A1Y(A1C2, (long) Asr.A01);
            }
            A1C.add(A1C2);
        }
        return A1C;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03b0, code lost:
        r5.setArguments(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0429, code lost:
        r3.setArguments(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x048d, code lost:
        if (r0 == com.instagram.creation.state.CreationState.A07) goto L_0x048f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0590, code lost:
        r8.A0E(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x059b, code lost:
        A04(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x063b, code lost:
        if (r0 != com.instagram.creation.state.CreationState.A0S) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x063f, code lost:
        if (r0 == com.instagram.creation.state.CreationState.A0T) goto L_0x0641;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0641, code lost:
        r8.A0D = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x065b, code lost:
        r5.setArguments(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x065e, code lost:
        r8.A0E(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x06d1, code lost:
        r8.A0A = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x06d3, code lost:
        r8.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x06eb, code lost:
        if (r6 != null) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0206, code lost:
        if (r8 != com.instagram.creation.state.CreationState.A0S) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020a, code lost:
        if (r8 != com.instagram.creation.state.CreationState.A0T) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x022c, code lost:
        if (X.182.A06(r5, r1, 36323912812277348L) == false) goto L_0x023c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x06dd  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x06e5  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0701  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C59890JbF r39) {
        /*
            r38 = this;
            r0 = 358719993(0x1561a1f9, float:4.5566162E-26)
            int r16 = X.AnonymousClass0fD.A03(r0)
            r2 = r38
            com.instagram.common.session.UserSession r1 = r2.A03
            X.JbO r7 = X.JZM.A00(r1)
            X.82q r3 = r2.A05
            boolean r0 = r3.COf()
            if (r0 == 0) goto L_0x071c
            r0 = r3
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            java.lang.String r0 = r0.A0C
        L_0x001e:
            com.instagram.creation.activity.MediaCaptureActivity r13 = r2.A04
            X.3Q2 r6 = r13.BbQ(r0)
            r37 = r39
            r0 = r37
            com.instagram.creation.state.CreationState r0 = r0.A01
            int r5 = r0.ordinal()
            r4 = 26
            if (r5 == r4) goto L_0x0718
            r4 = 37
            if (r5 == r4) goto L_0x0714
            r4 = 3
            if (r5 == r4) goto L_0x0710
            r4 = 17
            if (r5 == r4) goto L_0x0718
            r5 = 0
        L_0x003e:
            r4 = r37
            com.instagram.creation.state.CreationState r8 = r4.A02
            int r4 = r8.ordinal()
            r9 = 26
            if (r4 == r9) goto L_0x070c
            r9 = 37
            if (r4 == r9) goto L_0x0708
            r9 = 3
            if (r4 == r9) goto L_0x0704
            r9 = 17
            if (r4 == r9) goto L_0x070c
            r19 = 0
        L_0x0057:
            if (r5 == 0) goto L_0x005c
            r7.A08(r5)
        L_0x005c:
            if (r19 == 0) goto L_0x009d
            com.instagram.creation.state.CreationState r9 = com.instagram.creation.state.CreationState.A0L
            if (r0 == r9) goto L_0x0066
            com.instagram.creation.state.CreationState r9 = com.instagram.creation.state.CreationState.A0F
            if (r0 != r9) goto L_0x009d
        L_0x0066:
            com.instagram.creation.state.CreationState r9 = com.instagram.creation.state.CreationState.A0I
            if (r8 == r9) goto L_0x009d
            if (r6 == 0) goto L_0x0701
            X.4yP r9 = r6.A0h
        L_0x006e:
            java.util.List r10 = r3.Co4()
            int r24 = r10.size()
            java.util.List r10 = r3.Co4()
            java.util.ArrayList r20 = A02(r10)
            java.util.List r10 = r3.Co4()
            java.util.ArrayList r21 = A03(r10)
            java.util.List r10 = r3.Co4()
            java.util.ArrayList r22 = A00(r10)
            java.util.List r10 = r3.Co4()
            java.util.ArrayList r23 = A01(r10)
            r17 = r7
            r18 = r9
            r17.A06(r18, r19, r20, r21, r22, r23, r24)
        L_0x009d:
            if (r5 != 0) goto L_0x00a7
            boolean r5 = r3.CZ4()
            if (r5 == 0) goto L_0x06f3
            X.28t r5 = X.28t.A05
        L_0x00a7:
            com.instagram.creation.state.CreationState r23 = com.instagram.creation.state.CreationState.A0W
            r9 = r23
            if (r8 != r9) goto L_0x01d8
            X.28D r10 = r2.A02
            java.util.List r9 = r3.Co4()
            java.util.ArrayList r22 = A02(r9)
            java.util.List r9 = r3.Co4()
            java.util.ArrayList r21 = A03(r9)
            java.util.List r9 = r3.Co4()
            java.util.ArrayList r20 = A00(r9)
            java.util.List r9 = r3.Co4()
            java.util.ArrayList r19 = A01(r9)
            r9 = r3
            X.JWE r9 = (X.JWE) r9
            com.instagram.creation.base.CreationSession r9 = r9.A01
            boolean r9 = r9.A0I
            r24 = r9
            r14 = 1
            X.0qQ.A0B(r10, r14)
            r7.A00 = r10
            com.instagram.common.session.UserSession r11 = r7.A05
            java.lang.String r9 = X.AnonymousClass7TF.A0g(r11)
            if (r9 == 0) goto L_0x00e8
            r7.A02 = r9
        L_0x00e8:
            r30 = 0
            if (r6 == 0) goto L_0x06e9
            com.instagram.music.common.model.MusicOverlayStickerModel r9 = r6.A1J
            if (r9 == 0) goto L_0x06e9
            java.lang.String r9 = r9.A0S
            r36 = r9
        L_0x00f4:
            com.instagram.music.common.model.MusicOverlayStickerModel r9 = r6.A1J
            if (r9 == 0) goto L_0x06ef
            java.lang.String r9 = r9.A0T
            r35 = r9
        L_0x00fc:
            android.util.Pair r25 = X.C59899JbO.A00(r6)
            X.29f r9 = X.JTO.A0c(r11)
            java.lang.String r15 = X.C59899JbO.A03(r7)
            if (r6 == 0) goto L_0x06e5
            int r11 = r6.A0K
            r18 = r11
        L_0x010e:
            X.28D r11 = r7.A00
            X.28D r7 = X.28D.A2d
            if (r11 != r7) goto L_0x06e1
            X.JYm r12 = X.C59793JYm.OTHER
        L_0x0116:
            if (r6 == 0) goto L_0x06dd
            X.4yP r11 = r6.A0h
        L_0x011a:
            r34 = -2147483648(0xffffffff80000000, float:-0.0)
            r33 = 0
            X.0wc r7 = r9.A01
            java.lang.String r6 = "ig_camera_share_sheet_load"
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r7, r6)
            r6 = 202(0xca, float:2.83E-43)
            X.1Ln r6 = X.C51965G9l.A0U(r7, r6)
            boolean r7 = X.DbT.A1Y(r6)
            if (r7 == 0) goto L_0x01d8
            X.4yP r17 = X.C279294yP.FEED
            r7 = r17
            r6.A0a(r7)
            java.lang.String r7 = "entry_point"
            r6.A0M(r10, r7)
            r6.A0W(r14)
            X.JVj r10 = X.C59725JVj.SHARE_SHEET
            java.lang.String r7 = "surface"
            r6.A0M(r10, r7)
            r6.A0c(r5)
            X.JTO.A1U(r6, r15)
            X.JTQ.A1A(r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r33)
            java.lang.String r5 = "funded_content_available"
            r6.A0O(r5, r7)
            java.lang.String r5 = "media_source"
            r6.A0M(r12, r5)
            X.8fP r10 = X.C360948fP.FEED
            java.lang.String r5 = "capture_type"
            r6.A0M(r10, r5)
            java.lang.String r5 = "is_panavision"
            r6.A0O(r5, r7)
            java.lang.String r5 = "is_feed_fork"
            r6.A0O(r5, r7)
            X.AnonymousClass7TF.A18(r6)
            java.lang.String r7 = "height_width"
            r5 = r22
            r6.A0S(r7, r5)
            java.lang.String r7 = "original_height_width"
            r5 = r21
            r6.A0S(r7, r5)
            java.lang.String r7 = "bitrate_list"
            r5 = r20
            r6.A0S(r7, r5)
            if (r11 != 0) goto L_0x018c
            r11 = r17
        L_0x018c:
            java.lang.String r5 = "bottom_camera_dial_selected"
            r6.A0M(r11, r5)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r18)
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r24)
            r28 = r9
            r29 = r30
            r31 = r30
            r32 = r14
            java.util.ArrayList r33 = r28.A0O(r29, r30, r31, r32, r33)
            r24 = r9
            r28 = r36
            r29 = r35
            r32 = r30
            X.Jqq r5 = r24.A0L(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            java.util.List r7 = X.AnonymousClass7TE.A1I(r5)
            r5 = 1583(0x62f, float:2.218E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r6.A0S(r5, r7)
            com.instagram.common.session.UserSession r5 = r9.A03
            java.lang.Boolean r5 = X.C367178qJ.A00(r5)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x06d8
            X.0nO r10 = X.0nY.A00()
            X.Ujw r7 = new X.Ujw
            r5 = r19
            r7.<init>(r6, r9, r5)
            r10.ATE(r7)
        L_0x01d8:
            com.instagram.creation.state.CreationState r5 = com.instagram.creation.state.CreationState.A0L
            if (r0 != r5) goto L_0x01e5
            r1 = 1684689908(0x646a53f4, float:1.729035E22)
        L_0x01df:
            r0 = r16
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x01e5:
            X.0hq r12 = r2.A01
            boolean r5 = X.AnonymousClass06S.A01(r12)
            if (r5 == 0) goto L_0x0238
            r13.A08()
            r5 = r37
            X.JbD r5 = r5.A00
            X.JbE r9 = r5.A00
            boolean r5 = r9 instanceof X.KPF
            if (r5 == 0) goto L_0x025d
            com.instagram.creation.state.CreationState r2 = com.instagram.creation.state.CreationState.A0c
            java.lang.String r4 = "back"
            if (r0 == r2) goto L_0x0208
            r2 = r23
            if (r0 != r2) goto L_0x020c
            com.instagram.creation.state.CreationState r2 = com.instagram.creation.state.CreationState.A0S
            if (r8 == r2) goto L_0x022e
        L_0x0208:
            com.instagram.creation.state.CreationState r2 = com.instagram.creation.state.CreationState.A0T
            if (r8 == r2) goto L_0x022e
        L_0x020c:
            com.instagram.creation.state.CreationState r2 = com.instagram.creation.state.CreationState.A0R
            if (r0 != r2) goto L_0x023c
            com.instagram.creation.state.CreationState r2 = com.instagram.creation.state.CreationState.A0F
            if (r8 != r2) goto L_0x023c
            X.0Tu r5 = X.AnonymousClass7TF.A0H(r1)
            r2 = 36323912811949666(0x810c6800022e62, double:3.034726954709289E-306)
            boolean r2 = X.182.A06(r5, r1, r2)
            if (r2 != 0) goto L_0x022e
            r2 = 36323912812277348(0x810c6800072e64, double:3.034726954916516E-306)
            boolean r2 = X.182.A06(r5, r1, r2)
            if (r2 == 0) goto L_0x023c
        L_0x022e:
            X.2cc r0 = X.C71342cb.A00(r1)
            r0.A0A(r13, r4)
            r13.onBackPressed()
        L_0x0238:
            r1 = 2085734365(0x7c51c7dd, float:4.356975E36)
            goto L_0x01df
        L_0x023c:
            com.instagram.creation.state.CreationState r2 = com.instagram.creation.state.CreationState.A02
            if (r0 == r2) goto L_0x0238
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            androidx.fragment.app.Fragment r0 = r12.A0P(r0)
            r0.getClass()
            X.2cc r1 = X.C71342cb.A00(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            r1.A0A(r0, r4)
            r12.A13()     // Catch:{ IllegalStateException -> 0x0259 }
            goto L_0x0238
        L_0x0259:
            r12.A0c()
            goto L_0x0238
        L_0x025d:
            boolean r5 = r9 instanceof X.KPP
            r10 = 1
            if (r5 == 0) goto L_0x0281
            java.lang.String r2 = r8.name()
            boolean r0 = r12.A19(r2, r10)
            if (r0 != 0) goto L_0x0238
            java.lang.String r1 = "Cannot find fragment transaction corresponding to "
            java.lang.String r0 = " state"
            java.lang.String r0 = X.002.A0g(r1, r2, r0)
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)
            r1 = 636684030(0x25f306fe, float:4.2158519E-16)
            r0 = r16
            X.AnonymousClass0fD.A0A(r1, r0)
            throw r2
        L_0x0281:
            X.6Yo r8 = X.DbS.A0M(r13, r1)
            java.lang.String r11 = r0.name()
            r8.A0A = r11
            java.lang.String r14 = "prior_surface"
            java.lang.String r15 = "next"
            r7 = 0
            java.lang.String r6 = "feed"
            r5 = 0
            switch(r4) {
                case 0: goto L_0x02c3;
                case 1: goto L_0x0296;
                case 2: goto L_0x02cd;
                case 3: goto L_0x0358;
                case 4: goto L_0x0386;
                case 5: goto L_0x03c8;
                case 6: goto L_0x03ff;
                case 7: goto L_0x042e;
                case 8: goto L_0x0467;
                case 9: goto L_0x0483;
                case 10: goto L_0x0296;
                case 11: goto L_0x03b5;
                case 12: goto L_0x03d5;
                case 13: goto L_0x0296;
                case 14: goto L_0x0297;
                case 15: goto L_0x04b0;
                case 16: goto L_0x0296;
                case 17: goto L_0x0296;
                case 18: goto L_0x04ca;
                case 19: goto L_0x0722;
                case 20: goto L_0x0296;
                case 21: goto L_0x04f0;
                case 22: goto L_0x0548;
                case 23: goto L_0x0296;
                case 24: goto L_0x02b9;
                case 25: goto L_0x055e;
                case 26: goto L_0x02f9;
                case 27: goto L_0x0296;
                case 28: goto L_0x0296;
                case 29: goto L_0x0595;
                case 30: goto L_0x05a0;
                case 31: goto L_0x05fa;
                case 32: goto L_0x0646;
                case 33: goto L_0x0662;
                case 34: goto L_0x0688;
                case 35: goto L_0x0296;
                case 36: goto L_0x02a8;
                case 37: goto L_0x05d1;
                default: goto L_0x0296;
            }
        L_0x0296:
            goto L_0x0238
        L_0x0297:
            X.AnonymousClass36R.A01()
            X.K6Y r1 = new X.K6Y
            r1.<init>()
            X.KPO r9 = (X.KPO) r9
            android.os.Bundle r0 = r9.A00
            r8.A0B(r0, r1)
            goto L_0x06d3
        L_0x02a8:
            X.AnonymousClass36R.A01()
            X.0qQ.A0B(r1, r5)
            X.K7x r5 = new X.K7x
            r5.<init>()
            android.os.Bundle r4 = X.DbY.A09(r1)
            goto L_0x065b
        L_0x02b9:
            X.LGR r0 = X.AnonymousClass36R.A01()
            X.4DH r5 = r0.A00(r1)
            goto L_0x059b
        L_0x02c3:
            X.AnonymousClass36R.A01()
            X.K7r r5 = new X.K7r
            r5.<init>()
            goto L_0x059b
        L_0x02cd:
            X.KPY r9 = (X.KPY) r9
            X.AnonymousClass36R.A01()
            java.lang.String r6 = r9.A02
            boolean r4 = r9.A05
            X.28D r1 = r9.A00
            X.0qQ.A0B(r6, r5)
            X.K5Y r5 = new X.K5Y
            r5.<init>()
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "ARGUMENT_RESULT_TAG"
            r3.putString(r0, r6)
            java.lang.String r0 = "IS_FACEBOOK_SHARING_DISABLED"
            r3.putBoolean(r0, r4)
            r0 = 413(0x19d, float:5.79E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putSerializable(r0, r1)
            goto L_0x03b0
        L_0x02f9:
            r4 = r9
            X.KPg r4 = (X.C61867KPg) r4
            boolean r13 = r4.A02
            X.Kgp r11 = r4.A00
            boolean r4 = r9 instanceof X.C61865KPe
            if (r4 == 0) goto L_0x034f
            X.KPe r9 = (X.C61865KPe) r9
            boolean r5 = r9.A00
        L_0x0308:
            X.LGR r6 = X.AnonymousClass36R.A01()
            int r4 = r11.ordinal()
            X.JcV r4 = r6.A03(r1, r4, r13, r5)
            r2.A04(r4)
            r8.A0E(r4)
            com.instagram.creation.state.CreationState r2 = com.instagram.creation.state.CreationState.A0J
            if (r0 != r2) goto L_0x032c
            X.JWE r3 = (X.JWE) r3
            com.instagram.creation.base.CreationSession r2 = r3.A01
            boolean r2 = r2.A0J
            if (r2 == 0) goto L_0x032c
            r12.A19(r7, r10)
            r2 = 0
            r8.A0D = r2
        L_0x032c:
            com.instagram.creation.state.CreationState r2 = com.instagram.creation.state.CreationState.A0F
            if (r0 != r2) goto L_0x06d3
            X.0Tu r4 = X.AnonymousClass7TF.A0H(r1)
            r2 = 36323912811949666(0x810c6800022e62, double:3.034726954709289E-306)
            boolean r0 = X.182.A06(r4, r1, r2)
            if (r0 != 0) goto L_0x034a
            r2 = 36323912812277348(0x810c6800072e64, double:3.034726954916516E-306)
            boolean r0 = X.182.A06(r4, r1, r2)
            if (r0 == 0) goto L_0x06d3
        L_0x034a:
            r12.A0c()
            goto L_0x0641
        L_0x034f:
            boolean r4 = r9 instanceof X.C61866KPf
            if (r4 == 0) goto L_0x0308
            X.KPf r9 = (X.C61866KPf) r9
            boolean r5 = r9.A00
            goto L_0x0308
        L_0x0358:
            X.KPg r9 = (X.C61867KPg) r9
            boolean r11 = r9.A02
            X.LGR r9 = X.AnonymousClass36R.A01()
            X.28D r6 = r2.A02
            X.28D r4 = X.28D.A42
            if (r6 == r4) goto L_0x036a
            X.28D r4 = X.28D.A5J
            if (r6 != r4) goto L_0x036b
        L_0x036a:
            r5 = 1
        L_0x036b:
            com.instagram.creation.fragment.AlbumEditFragment r1 = r9.A01(r1, r11, r5)
            r2.A04(r1)
            r8.A0E(r1)
            com.instagram.creation.state.CreationState r1 = com.instagram.creation.state.CreationState.A0J
            if (r0 != r1) goto L_0x06d3
            X.JWE r3 = (X.JWE) r3
            com.instagram.creation.base.CreationSession r0 = r3.A01
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x06d3
            r12.A19(r7, r10)
            goto L_0x0641
        L_0x0386:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.KPX r9 = (X.KPX) r9
            java.lang.String r1 = r9.A02
            java.lang.String r0 = "media_path_key"
            r3.putString(r0, r1)
            float r1 = r9.A00
            java.lang.String r0 = "media_aspect_ratio_key"
            r3.putFloat(r0, r1)
            java.lang.String r1 = r9.A01
            java.lang.String r0 = "media_key"
            r3.putString(r0, r1)
            java.util.LinkedHashMap r1 = r9.A03
            java.lang.String r0 = "media_to_caption_key"
            r3.putSerializable(r0, r1)
            X.AnonymousClass36R.A01()
            X.K6Z r5 = new X.K6Z
            r5.<init>()
        L_0x03b0:
            r5.setArguments(r3)
            goto L_0x059b
        L_0x03b5:
            X.KPR r9 = (X.KPR) r9
            X.1Y4 r0 = X.C3018960m.A00()
            r0.A00()
            X.4jy r1 = r9.A00
            java.lang.String r0 = r9.A01
            X.E30 r3 = X.C48776Ejz.A00(r1, r0, r10)
            goto L_0x0590
        L_0x03c8:
            X.C49892FBu.A02()
            X.KP8 r9 = (X.KP8) r9
            com.instagram.api.schemas.BrandedContentGatingInfo r0 = r9.A00
            X.K87 r3 = X.LSU.A01(r0, r6, r5, r5)
            goto L_0x0590
        L_0x03d5:
            X.KPS r9 = (X.KPS) r9
            X.1Y4 r0 = X.C3018960m.A00()
            r0.A00()
            java.lang.String r4 = r9.A00
            boolean r2 = r9.A01
            X.K50 r3 = new X.K50
            r3.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "args_comment_prompt_text"
            r1.putString(r0, r4)
            r0 = 254(0xfe, float:3.56E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putBoolean(r0, r10)
            java.lang.String r0 = "args_should_show_delete_prompt_button"
            r1.putBoolean(r0, r2)
            goto L_0x0429
        L_0x03ff:
            X.KPA r9 = (X.KPA) r9
            X.C49892FBu.A02()
            java.util.List r3 = r9.A02
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r2 = r9.A01
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r0 = r9.A00
            X.0qQ.A0B(r3, r5)
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs r1 = new com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs
            r1.<init>()
            r1.A03 = r6
            r1.A05 = r5
            r1.A00 = r0
            r1.A02 = r7
            r1.A04 = r3
            r1.A01 = r2
            X.K8Z r3 = new X.K8Z
            r3.<init>()
            java.lang.String r0 = "bc_disclosure_args"
            android.os.Bundle r1 = X.DbY.A0B(r0, r1)
        L_0x0429:
            r3.setArguments(r1)
            goto L_0x0590
        L_0x042e:
            X.KPD r9 = (X.KPD) r9
            com.instagram.creation.state.CreationState r1 = com.instagram.creation.state.CreationState.A09
            boolean r22 = X.AnonymousClass7TF.A1W(r0, r1)
            com.instagram.creation.state.CreationState r1 = com.instagram.creation.state.CreationState.A07
            boolean r27 = X.AnonymousClass7TF.A1W(r0, r1)
            X.C49892FBu.A02()
            java.util.List r12 = r9.A02
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r4 = r9.A01
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r3 = r9.A00
            boolean r2 = r9.A05
            boolean r1 = r9.A04
            boolean r0 = r9.A03
            r25 = r5
            r26 = r1
            r28 = r10
            r29 = r0
            r17 = r3
            r18 = r4
            r19 = r6
            r20 = r7
            r21 = r12
            r23 = r5
            r24 = r2
            X.K8V r3 = X.LSU.A04(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0590
        L_0x0467:
            X.KP9 r9 = (X.KP9) r9
            java.util.List r1 = r9.A01
            X.C49892FBu.A02()
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r0 = r9.A00
            X.0qQ.A0B(r1, r5)
            X.K8a r3 = new X.K8a
            r3.<init>()
            r3.A01 = r7
            r3.A07 = r5
            X.JTS.A1M(r0, r3, r6, r1, r5)
            r3.A08 = r5
            goto L_0x0590
        L_0x0483:
            X.KPB r9 = (X.KPB) r9
            com.instagram.creation.state.CreationState r1 = com.instagram.creation.state.CreationState.A09
            if (r0 == r1) goto L_0x048f
            com.instagram.creation.state.CreationState r1 = com.instagram.creation.state.CreationState.A07
            r21 = 0
            if (r0 != r1) goto L_0x0491
        L_0x048f:
            r21 = 1
        L_0x0491:
            X.C49892FBu.A02()
            java.util.List r2 = r9.A01
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r1 = r9.A00
            boolean r0 = r9.A02
            r18 = r6
            r19 = r7
            r20 = r2
            r22 = r5
            r23 = r10
            r24 = r5
            r25 = r0
            r17 = r1
            X.K8W r3 = X.LSU.A03(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0590
        L_0x04b0:
            X.AnonymousClass36R.A01()
            X.0qQ.A0B(r1, r5)
            X.K7s r2 = new X.K7s
            r2.<init>()
            android.os.Bundle r0 = X.DbY.A09(r1)
            r2.setArguments(r0)
            r8.A0E(r2)
            r8.A03()
            goto L_0x0238
        L_0x04ca:
            X.KPg r9 = (X.C61867KPg) r9
            boolean r3 = r9.A02
            X.AnonymousClass36R.A01()
            X.28D r1 = r2.A02
            r0 = 3
            X.0qQ.A0B(r1, r0)
            com.instagram.creation.capture.MediaCaptureFragment r5 = new com.instagram.creation.capture.MediaCaptureFragment
            r5.<init>()
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "standalone_mode"
            r4.putBoolean(r0, r3)
            r0 = 863(0x35f, float:1.21E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putSerializable(r0, r1)
            goto L_0x065b
        L_0x04f0:
            X.1Av r3 = X.1Au.A00(r1)
            java.util.Set r0 = r3.A0I(r6)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1D(r0)
            boolean r3 = r3.A24(r6)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "enableGeoGating"
            r5.putBoolean(r0, r3)
            java.lang.String r0 = "selectedRegions"
            r5.putStringArrayList(r0, r4)
            java.lang.String r0 = "settingType"
            r5.putString(r0, r6)
            X.1WM.getInstance()
            java.lang.String r4 = "IgMediaGeoGatingSettingsApp"
            X.T8B r3 = new X.T8B
            r3.<init>(r1, r4)
            android.content.Context r1 = r2.A00
            r0 = 2131973426(0x7f135532, float:1.9583887E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A07 = r0
            r3.A00(r5)
            X.1WM r0 = X.1WM.getInstance()
            r0.getFragmentFactory()
            android.os.Bundle r1 = r3.AEV()
            X.R8S r0 = new X.R8S
            r0.<init>()
            r0.setArguments(r1)
            r2.A04(r0)
            r8.A0E(r0)
            r8.A0C = r4
            goto L_0x06d3
        L_0x0548:
            X.KPT r9 = (X.KPT) r9
            X.AnonymousClass36R.A01()
            java.lang.String r10 = "POST"
            android.location.Location r2 = r9.A01
            long r0 = r9.A00
            r11 = r7
            r12 = r0
            r14 = r5
            r15 = r5
            r9 = r2
            X.K5H r5 = X.K5H.A00(r9, r10, r11, r12, r14, r15)
            goto L_0x065e
        L_0x055e:
            X.KPC r9 = (X.KPC) r9
            X.C49892FBu.A02()
            boolean r13 = r9.A03
            java.util.List r12 = r9.A02
            com.instagram.api.schemas.BrandedContentProjectMetadata r10 = r9.A01
            com.instagram.api.schemas.BrandedContentGatingInfo r4 = r9.A00
            boolean r1 = r9.A04
            r0 = 2
            X.0qQ.A0B(r12, r0)
            X.K5F r3 = new X.K5F
            r3.<init>()
            r17 = r4
            r18 = r10
            r19 = r6
            r20 = r7
            r21 = r12
            r22 = r13
            r23 = r5
            r24 = r1
            android.os.Bundle r0 = X.LSU.A00(r17, r18, r19, r20, r21, r22, r23, r24)
            r3.setArguments(r0)
            r2.A04(r3)
        L_0x0590:
            r8.A0E(r3)
            goto L_0x06d1
        L_0x0595:
            X.XQw r0 = X.C21251XQw.MAIN_SETTINGS_SCREEN
            X.JaK r5 = X.Eq6.A00(r0, r7)
        L_0x059b:
            r2.A04(r5)
            goto L_0x065e
        L_0x05a0:
            X.KPV r9 = (X.KPV) r9
            java.lang.String r6 = r9.A02
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r3 = r9.A01
            android.os.Bundle r4 = r9.A00
            java.lang.String r2 = X.AnonymousClass6SR.A02()
            X.KgC r1 = X.C62462KgC.FEED
            X.AnonymousClass7TF.A1C(r6, r5, r2)
            java.lang.String r0 = "publish_screen_category_parent_module_name"
            r4.putString(r0, r6)
            java.lang.String r0 = "publish_screen_category_type"
            r4.putParcelable(r0, r3)
            java.lang.String r0 = "ClipsConstants.ARGS_WATERFALL_ID"
            r4.putString(r0, r2)
            java.lang.String r0 = "publish_screen_type"
            r4.putSerializable(r0, r1)
            java.lang.String r0 = "should_show_customized_action_bar"
            r4.putBoolean(r0, r10)
            X.K5v r5 = new X.K5v
            r5.<init>()
            goto L_0x065b
        L_0x05d1:
            X.KPg r9 = (X.C61867KPg) r9
            boolean r6 = r9.A02
            X.AnonymousClass36R.A01()
            X.0qQ.A0B(r1, r10)
            X.K6A r5 = new X.K6A
            r5.<init>()
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r3 = "VideoEditFragment.standalone_mode"
            r4.putBoolean(r3, r6)
            X.DbU.A1D(r4, r1)
            r5.setArguments(r4)
            r2.A04(r5)
            r8.A0E(r5)
            r8.A0B = r15
            r8.A0G = r10
            goto L_0x063d
        L_0x05fa:
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            X.C59882Jb5.A01(r1, r4)
            X.AnonymousClass36R.A01()
            X.28D r9 = r2.A02
            X.JWE r3 = (X.JWE) r3
            com.instagram.creation.base.CreationSession r3 = r3.A01
            com.instagram.pendingmedia.model.recipients.PendingRecipient r7 = r3.A0B
            com.instagram.user.model.UpcomingEvent r6 = r2.A06
            X.0qQ.A0B(r1, r5)
            X.0qQ.A0B(r9, r10)
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r4 = new com.instagram.creation.fragment.followersshare.FollowersShareFragment
            r4.<init>()
            android.os.Bundle r3 = X.DbY.A09(r1)
            r1 = 413(0x19d, float:5.79E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putSerializable(r1, r9)
            java.lang.String r1 = "TARGET_GROUP_PROFILE"
            r3.putParcelable(r1, r7)
            java.lang.String r1 = "UPCOMING_EVENT"
            r3.putParcelable(r1, r6)
            r4.setArguments(r3)
            r2.A04(r4)
            r8.A0E(r4)
            r8.A0B = r15
            com.instagram.creation.state.CreationState r1 = com.instagram.creation.state.CreationState.A0S
            if (r0 == r1) goto L_0x0641
        L_0x063d:
            com.instagram.creation.state.CreationState r1 = com.instagram.creation.state.CreationState.A0T
            if (r0 != r1) goto L_0x06d3
        L_0x0641:
            r0 = 0
            r8.A0D = r0
            goto L_0x06d3
        L_0x0646:
            X.KPQ r9 = (X.KPQ) r9
            int r1 = r9.A00
            X.AnonymousClass36R.A01()
            com.instagram.creation.fragment.preview.ThumbnailPreviewFragment r5 = new com.instagram.creation.fragment.preview.ThumbnailPreviewFragment
            r5.<init>()
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "args_selected_thumbnail_index"
            r4.putInt(r0, r1)
        L_0x065b:
            r5.setArguments(r4)
        L_0x065e:
            r8.A0E(r5)
            goto L_0x06d3
        L_0x0662:
            X.KPU r9 = (X.KPU) r9
            X.K4S r3 = new X.K4S
            r3.<init>()
            X.MUQ r0 = r9.A00
            r3.A01 = r0
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            X.Khz r0 = X.C62569Khz.FOLLOWERS_SHARE
            r2.putSerializable(r14, r0)
            java.util.List r0 = r9.A01
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r0 = "upcoming_event_ids"
            r2.putStringArrayList(r0, r1)
            r3.setArguments(r2)
            r8.A0E(r3)
            goto L_0x06d1
        L_0x0688:
            X.KPW r9 = (X.KPW) r9
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x06b3
            com.instagram.user.model.UpcomingEvent r0 = r9.A01
            if (r0 == 0) goto L_0x06b0
            X.Khz r4 = X.C62569Khz.UPCOMING_EVENT_EDIT
        L_0x0694:
            com.instagram.user.model.UpcomingEvent r3 = r9.A01
            if (r3 == 0) goto L_0x06b6
            boolean r0 = X.C18810W3l.A0B(r3)
            if (r0 == 0) goto L_0x06b6
            X.1pS r6 = X.C2601144i.A00()
            java.lang.String r12 = r4.toString()
            r8 = r13
            r9 = r13
            r10 = r1
            r11 = r3
            r13 = r5
            r6.A01(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0238
        L_0x06b0:
            X.Khz r4 = X.C62569Khz.UPCOMING_EVENTS_LIST
            goto L_0x0694
        L_0x06b3:
            X.Khz r4 = X.C62569Khz.FOLLOWERS_SHARE
            goto L_0x0694
        L_0x06b6:
            X.K6D r2 = new X.K6D
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            r1.putSerializable(r14, r4)
            java.lang.String r0 = "initial_upcoming_event"
            r1.putParcelable(r0, r3)
            r2.setArguments(r1)
            X.MUQ r0 = r9.A00
            r2.A06 = r0
            r8.A0E(r2)
        L_0x06d1:
            r8.A0A = r11
        L_0x06d3:
            r8.A04()
            goto L_0x0238
        L_0x06d8:
            r6.Cgf()
            goto L_0x01d8
        L_0x06dd:
            r11 = r30
            goto L_0x011a
        L_0x06e1:
            X.JYm r12 = X.C59793JYm.GALLERY
            goto L_0x0116
        L_0x06e5:
            r18 = -1
            goto L_0x010e
        L_0x06e9:
            r36 = r30
            if (r6 == 0) goto L_0x06ef
            goto L_0x00f4
        L_0x06ef:
            r35 = r30
            goto L_0x00fc
        L_0x06f3:
            boolean r5 = r3.COf()
            if (r5 == 0) goto L_0x06fd
            X.28t r5 = X.28t.A02
            goto L_0x00a7
        L_0x06fd:
            X.28t r5 = X.28t.A04
            goto L_0x00a7
        L_0x0701:
            r9 = 0
            goto L_0x006e
        L_0x0704:
            X.28t r19 = X.28t.A02
            goto L_0x0057
        L_0x0708:
            X.28t r19 = X.28t.A06
            goto L_0x0057
        L_0x070c:
            X.28t r19 = X.28t.A05
            goto L_0x0057
        L_0x0710:
            X.28t r5 = X.28t.A02
            goto L_0x003e
        L_0x0714:
            X.28t r5 = X.28t.A06
            goto L_0x003e
        L_0x0718:
            X.28t r5 = X.28t.A05
            goto L_0x003e
        L_0x071c:
            java.lang.String r0 = r3.E2M()
            goto L_0x001e
        L_0x0722:
            X.AnonymousClass36R.A01()
            java.lang.String r0 = "delegate"
            java.lang.NullPointerException r2 = X.AnonymousClass7TE.A11(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64699LgU.A05(X.JbF):void");
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(-32732803);
        A05((C59890JbF) obj);
        AnonymousClass0fD.A0A(-901752710, A032);
    }
}
