package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class P9S implements C333067Xn {
    public final UserSession A00;
    public final AnonymousClass0eK A01;
    public final AnonymousClass0eM A02 = C73909Plk.A00(this, 36);
    public final AnonymousClass0eM A03 = C73909Plk.A00(this, 37);
    public final C62320sa A04;
    public final Context A05;
    public final AnonymousClass0iw A06;
    public final OF1 A07;
    public final AnonymousClass7V2 A08;
    public final C72527P9k A09;
    public final AnonymousClass7XN A0A;

    public P9S(Context context, AnonymousClass0iw r3, UserSession userSession, OF1 of1, AnonymousClass7V2 r6, C72527P9k p9k, AnonymousClass7XN r8, AnonymousClass0eK r9, C62320sa r10) {
        C51974G9v.A1L(r6, r8, p9k);
        AnonymousClass7TF.A1E(r9, 5, r3);
        0qQ.A0B(r10, 9);
        this.A08 = r6;
        this.A0A = r8;
        this.A07 = of1;
        this.A09 = p9k;
        this.A01 = r9;
        this.A00 = userSession;
        this.A06 = r3;
        this.A05 = context;
        this.A04 = r10;
    }

    public static OVN A00(Activity activity, UserSession userSession, AnonymousClass7S7 r8) {
        C254743sy B8S = r8.B8S();
        0qQ.A07(B8S);
        return new OVN(activity, userSession, B8S, r8.BRZ(), r8.CVE());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.Npi] */
    /* JADX WARNING: type inference failed for: r4v17, types: [X.OMj, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        r5 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03c8, code lost:
        if (r23 != null) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0414, code lost:
        r2.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0417, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        r3 = new X.2YN(new X.KBR(r0.A02), r5.A01).A00(X.C314326i1.class);
        X.0qQ.A0B(r3, 1);
        r15 = new X.C71839Org(r3, r5.A02.A01.A00, r5);
        r7 = r5.A08.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0094, code lost:
        if (X.182.A06(X.0Tu.A06, r7, 2342157563291765419L) != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0096, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a7, code lost:
        if (X.2Lv.A00(r7).A03(com.facebook.common.callercontext.CallerContext.A00(X.C72206OyW.class), "ig_avatar_editor_upsell") != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a9, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00aa, code lost:
        r14 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ac, code lost:
        if (r6 == r14) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ae, code lost:
        if (r0 == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b0, code lost:
        r14 = (android.app.Activity) r5.A09.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        if (r14 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ba, code lost:
        X.C63556Kz5.A01.A01(r14, r15, r5.A04, "ig_direct_thread", "ig_direct_thread_sticker_tray");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c8, code lost:
        r0 = (android.app.Activity) r5.A09.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d0, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d2, code lost:
        r12 = X.DbT.A0i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d6, code lost:
        if (r12 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dc, code lost:
        if (r6.intValue() == 0) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00de, code lost:
        r5 = r5.A03.getModuleName();
        X.0qQ.A0B(r5, 2);
        r13 = new X.DxC();
        r1 = X.AnonymousClass7TE.A0a();
        r1.putString(X.AnonymousClass000.A00(43), "ig_direct_thread");
        r1.putString(X.AnonymousClass000.A00(509), "ig_direct_thread_aqr_consumption");
        r1.putString(X.AnonymousClass000.A00(253), r5);
        r13.setArguments(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0935, code lost:
        if (r4.length() == 0) goto L_0x0937;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0115, code lost:
        if ((r13 instanceof X.C47418E1m) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0941, code lost:
        if (r10.length() == 0) goto L_0x0943;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0117, code lost:
        r13.A06(r15);
        r12.A0N(r13, r14, 255, 255, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x09a2, code lost:
        if (r23 != null) goto L_0x08b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x09a7, code lost:
        if (r23 != null) goto L_0x08c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0126, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0127, code lost:
        r13 = r5.A07.A00(r5.A03, r5.A04, (java.lang.String) null, false, false, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:408:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E1A(X.C327627Bo r22, X.AnonymousClass7LQ r23, com.instagram.model.direct.messageid.MessageIdentifier r24) {
        /*
            r21 = this;
            r1 = 0
            int r3 = r22.ordinal()
            r10 = 0
            r0 = r21
            r2 = r23
            r6 = r24
            switch(r3) {
                case 2: goto L_0x0819;
                case 3: goto L_0x000f;
                case 4: goto L_0x000f;
                case 5: goto L_0x000f;
                case 6: goto L_0x000f;
                case 7: goto L_0x000f;
                case 8: goto L_0x067f;
                case 9: goto L_0x0053;
                case 10: goto L_0x0058;
                case 11: goto L_0x000f;
                case 12: goto L_0x000f;
                case 13: goto L_0x000f;
                case 14: goto L_0x000f;
                case 15: goto L_0x000f;
                case 16: goto L_0x0425;
                case 17: goto L_0x0729;
                case 18: goto L_0x0650;
                case 19: goto L_0x000f;
                case 20: goto L_0x001b;
                case 21: goto L_0x0137;
                case 22: goto L_0x03cf;
                case 23: goto L_0x041b;
                case 24: goto L_0x0544;
                case 25: goto L_0x000f;
                case 26: goto L_0x089c;
                case 27: goto L_0x059c;
                case 28: goto L_0x000f;
                case 29: goto L_0x0791;
                case 30: goto L_0x000f;
                case 31: goto L_0x016b;
                case 32: goto L_0x0321;
                case 33: goto L_0x02cf;
                case 34: goto L_0x0234;
                case 35: goto L_0x0840;
                case 36: goto L_0x01c1;
                case 37: goto L_0x000f;
                case 38: goto L_0x05b8;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "Got request to open link for unsupported nux type: "
            java.lang.String r1 = X.002.A0O(r0, r3)
            java.lang.String r0 = "DirectMessageNuxNavigator:invalidNuxType"
            X.0wb.A03(r0, r1)
        L_0x001a:
            return
        L_0x001b:
            X.0eM r3 = r0.A02
            X.1Ln r4 = X.C66584MXp.A0D(r3)
            boolean r3 = X.DbT.A1Y(r4)
            if (r3 == 0) goto L_0x0032
            X.C66583MXo.A1B(r4)
            java.lang.String r3 = "try_it_mustache"
            X.C66580MXl.A1L(r4, r3)
            r4.Cgf()
        L_0x0032:
            X.OF1 r0 = r0.A07
            X.1ps r3 = X.AnonymousClass9B9.A00()
            com.instagram.common.session.UserSession r6 = r0.A01
            X.4DH r0 = r0.A00
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            X.Nml r5 = X.C69503Nml.A08
            X.7JY r7 = X.AnonymousClass7JY.AI
            r8 = r1
            r9 = r1
            r3.A01(r4, r5, r6, r7, r8, r9)
            if (r23 == 0) goto L_0x001a
            java.util.List r0 = X.AnonymousClass7TE.A1I(r2)
            X.AnonymousClass7CX.A08(r0)
            return
        L_0x0053:
            X.7V2 r0 = r0.A08
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            goto L_0x005c
        L_0x0058:
            X.7V2 r0 = r0.A08
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x005c:
            X.OLt r5 = r0.A00
            if (r5 == 0) goto L_0x001a
            androidx.fragment.app.Fragment r3 = r5.A01
            com.instagram.common.session.UserSession r2 = r0.A02
            X.KBR r0 = new X.KBR
            r0.<init>(r2)
            X.2YN r2 = new X.2YN
            r2.<init>(r0, r3)
            java.lang.Class<X.6i1> r0 = X.C314326i1.class
            X.2YL r3 = r2.A00(r0)
            X.6i1 r3 = (X.C314326i1) r3
            r2 = 1
            X.0qQ.A0B(r3, r2)
            com.instagram.avatars.store.AvatarStore r0 = r5.A02
            X.27E r0 = r0.A01
            X.27H r0 = r0.A00
            X.Org r15 = new X.Org
            r15.<init>(r3, r0, r5)
            X.OyW r0 = r5.A08
            com.instagram.common.session.UserSession r7 = r0.A00
            X.0Tu r0 = X.0Tu.A06
            r3 = 2342157563291765419(0x208103e500000aab, double:4.060968200406579E-152)
            boolean r0 = X.182.A06(r0, r7, r3)
            if (r0 != 0) goto L_0x00a9
            X.2Ly r4 = X.2Lv.A00(r7)
            java.lang.Class<X.OyW> r0 = X.C72206OyW.class
            com.facebook.common.callercontext.CallerContext r3 = com.facebook.common.callercontext.CallerContext.A00(r0)
            java.lang.String r0 = "ig_avatar_editor_upsell"
            boolean r3 = r4.A03(r3, r0)
            r0 = 1
            if (r3 != 0) goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            if (r6 == r14) goto L_0x00c8
            if (r0 == 0) goto L_0x00c8
            java.lang.ref.WeakReference r0 = r5.A09
            java.lang.Object r14 = r0.get()
            android.app.Activity r14 = (android.app.Activity) r14
            if (r14 == 0) goto L_0x001a
            X.GUi r13 = X.C63556Kz5.A01
            com.instagram.common.session.UserSession r0 = r5.A04
            java.lang.String r17 = "ig_direct_thread"
            java.lang.String r18 = "ig_direct_thread_sticker_tray"
            r16 = r0
            r13.A01(r14, r15, r16, r17, r18)
            return
        L_0x00c8:
            java.lang.ref.WeakReference r0 = r5.A09
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x001a
            X.37D r12 = X.DbT.A0i(r0)
            if (r12 == 0) goto L_0x001a
            int r0 = r6.intValue()
            if (r0 == r1) goto L_0x0127
            X.0iw r0 = r5.A03
            java.lang.String r5 = r0.getModuleName()
            java.lang.String r4 = "ig_direct_thread"
            java.lang.String r3 = "ig_direct_thread_aqr_consumption"
            r0 = 2
            X.0qQ.A0B(r5, r0)
            X.DxC r13 = new X.DxC
            r13.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            r0 = 43
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putString(r0, r4)
            r0 = 509(0x1fd, float:7.13E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putString(r0, r3)
            r0 = 253(0xfd, float:3.55E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putString(r0, r5)
            r13.setArguments(r1)
        L_0x0113:
            boolean r0 = r13 instanceof X.C47418E1m
            if (r0 == 0) goto L_0x001a
            r0 = r13
            X.E1m r0 = (X.C47418E1m) r0
            r0.A06(r15)
            r15 = 255(0xff, float:3.57E-43)
            r16 = r15
            r17 = r2
            r12.A0N(r13, r14, r15, r16, r17)
            return
        L_0x0127:
            X.1ap r4 = r5.A07
            com.instagram.common.session.UserSession r6 = r5.A04
            X.0iw r5 = r5.A03
            r7 = r10
            r8 = r1
            r9 = r1
            r10 = r2
            r11 = r1
            X.DxG r13 = r4.A00(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0113
        L_0x0137:
            X.P9k r1 = r0.A09
            X.7JY r2 = X.AnonymousClass7JY.AI
            X.7SM r1 = r1.A00
            X.9H7 r1 = r1.A00
            X.7Hl r1 = X.AnonymousClass9H7.A06(r1)
            r1.A1N(r2)
            com.instagram.common.session.UserSession r1 = r0.A00
            boolean r1 = X.C331227Qb.A02(r1)
            X.0eM r0 = r0.A02
            X.1Ln r2 = X.C66584MXp.A0D(r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x001a
            X.C66583MXo.A1B(r2)
            if (r1 == 0) goto L_0x0168
            r0 = 1496(0x5d8, float:2.096E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
        L_0x0163:
            X.C66580MXl.A1L(r2, r0)
            goto L_0x0414
        L_0x0168:
            java.lang.String r0 = "try_it_mustache"
            goto L_0x0163
        L_0x016b:
            if (r23 == 0) goto L_0x001a
            X.3su r1 = r2.A0e
            if (r1 == 0) goto L_0x001a
            X.7AG r1 = r1.A0Q
            if (r1 == 0) goto L_0x001a
            java.lang.String r2 = r1.A08
            if (r2 == 0) goto L_0x001a
            X.P9k r1 = r0.A09
            X.7SM r1 = r1.A00
            X.9H7 r3 = r1.A00
            X.7Hl r1 = X.AnonymousClass9H7.A06(r3)
            r1.A1Q(r2)
            X.7JY r2 = X.AnonymousClass7JY.IMAGINE
            X.7Hl r1 = X.AnonymousClass9H7.A06(r3)
            r1.A1N(r2)
            com.instagram.common.session.UserSession r1 = r0.A00
            X.1Av r2 = X.1Au.A00(r1)
            r1 = 2430(0x97e, float:3.405E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r5 = 1
            r2.A13(r1, r5)
            X.0eK r1 = r0.A01
            X.7S7 r1 = X.C66582MXn.A0d(r1)
            X.3t3 r4 = r1.CBU()
            if (r4 == 0) goto L_0x001a
            X.0eM r0 = r0.A02
            java.lang.Object r3 = r0.getValue()
            X.7I3 r3 = (X.AnonymousClass7I3) r3
            java.lang.String r2 = X.AnonymousClass4KK.A02(r4)
            boolean r1 = r1.CUO()
            boolean r0 = r4 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            X.AnonymousClass7I3.A02(r3, r2, r1, r0, r5)
            return
        L_0x01c1:
            android.content.Context r6 = r0.A05
            boolean r2 = r6 instanceof android.app.Activity
            if (r2 == 0) goto L_0x001a
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L_0x001a
            X.0eK r2 = r0.A01
            X.7S7 r3 = X.C66582MXn.A0d(r2)
            X.0eM r2 = r0.A02
            java.lang.Object r2 = r2.getValue()
            X.7I3 r2 = (X.AnonymousClass7I3) r2
            java.lang.String r5 = r3.C6k()
            boolean r3 = r3.CUO()
            X.0wc r2 = r2.A01
            X.1Ln r4 = X.1Ln.A0J(r2)
            if (r3 == 0) goto L_0x0231
            X.XSV r3 = X.XSV.A05
        L_0x01eb:
            boolean r2 = X.DbT.A1Y(r4)
            if (r2 == 0) goto L_0x020a
            X.C66583MXo.A1B(r4)
            r2 = 3270(0xcc6, float:4.582E-42)
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.C66580MXl.A1L(r4, r2)
            java.lang.String r2 = "thread_id"
            r4.A0R(r2, r5)
            java.lang.String r2 = "thread_type"
            r4.A0M(r3, r2)
            r4.Cgf()
        L_0x020a:
            com.instagram.common.session.UserSession r3 = r0.A00
            X.HrX r2 = new X.HrX
            r2.<init>(r6, r3)
            X.HOj r9 = X.C54678HOj.MUSTACHE_TEXT
            X.0sa r0 = r0.A04
            java.lang.Object r12 = r0.invoke()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            X.HtW r8 = new X.HtW
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r1
            r18 = r1
            r19 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.A01(r8, r10)
            return
        L_0x0231:
            X.XSV r3 = X.XSV.A06
            goto L_0x01eb
        L_0x0234:
            android.content.Context r4 = r0.A05
            boolean r1 = r4 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001a
            android.app.Activity r4 = (android.app.Activity) r4
            if (r4 == 0) goto L_0x001a
            X.0eK r1 = r0.A01
            X.7S7 r3 = X.C66582MXn.A0d(r1)
            X.0eM r1 = r0.A02
            java.lang.Object r1 = r1.getValue()
            X.7I3 r1 = (X.AnonymousClass7I3) r1
            java.lang.String r7 = r3.C6k()
            boolean r5 = r3.CUO()
            X.0wc r1 = r1.A01
            X.1Ln r6 = X.1Ln.A0J(r1)
            if (r5 == 0) goto L_0x02cc
            X.XSV r5 = X.XSV.A05
        L_0x025e:
            boolean r1 = X.DbT.A1Y(r6)
            if (r1 == 0) goto L_0x027d
            X.C66583MXo.A1B(r6)
            r1 = 677(0x2a5, float:9.49E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.C66580MXl.A1L(r6, r1)
            java.lang.String r1 = "thread_id"
            r6.A0R(r1, r7)
            java.lang.String r1 = "thread_type"
            r6.A0M(r5, r1)
            r6.Cgf()
        L_0x027d:
            if (r23 == 0) goto L_0x001a
            X.3su r5 = r2.A0e
            if (r5 == 0) goto L_0x001a
            X.7AG r1 = r5.A0Q
            if (r1 == 0) goto L_0x0289
            java.lang.String r10 = r1.A08
        L_0x0289:
            X.77w r2 = X.C3267177w.A00
            java.lang.String r1 = X.C3267177w.A01(r5)
            if (r1 == 0) goto L_0x001a
            java.lang.String r15 = X.C3267177w.A02(r5, r1)
            if (r15 == 0) goto L_0x001a
            java.lang.String r16 = X.C3267177w.A00(r4, r5)
            if (r16 == 0) goto L_0x001a
            boolean r1 = r2.A03(r5)
            boolean r18 = r3.COb()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            r13 = 0
            X.HtR r11 = new X.HtR
            r14 = r13
            r17 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            com.instagram.common.session.UserSession r1 = r0.A00
            X.OVN r1 = A00(r4, r1, r3)
            X.Nky r2 = X.C69416Nky.A0L
            X.0sa r0 = r0.A04
            java.lang.Object r6 = r0.invoke()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r7 = 184(0xb8, float:2.58E-43)
            r3 = r11
            r4 = r13
            X.OVN.A00(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x02cc:
            X.XSV r5 = X.XSV.A06
            goto L_0x025e
        L_0x02cf:
            android.content.Context r4 = r0.A05
            boolean r2 = r4 instanceof android.app.Activity
            if (r2 == 0) goto L_0x001a
            android.app.Activity r4 = (android.app.Activity) r4
            if (r4 == 0) goto L_0x001a
            X.0eK r2 = r0.A01
            X.7S7 r6 = X.C66582MXn.A0d(r2)
            com.instagram.common.session.UserSession r3 = r0.A00
            X.OVN r7 = A00(r4, r3, r6)
            X.Nky r8 = X.C69416Nky.A0N
            X.0sa r2 = r0.A04
            java.lang.Object r2 = r2.invoke()
            java.lang.String r2 = (java.lang.String) r2
            r13 = 252(0xfc, float:3.53E-43)
            r9 = r10
            r11 = r10
            r12 = r2
            X.OVN.A00(r7, r8, r9, r10, r11, r12, r13)
            X.1Av r4 = X.1Au.A00(r3)
            r2 = 2429(0x97d, float:3.404E-42)
            java.lang.String r3 = X.C273654mx.A00(r2)
            r2 = 1
            r4.A13(r3, r2)
            X.3t3 r5 = r6.CBU()
            if (r5 == 0) goto L_0x001a
            X.0eM r0 = r0.A02
            java.lang.Object r4 = r0.getValue()
            X.7I3 r4 = (X.AnonymousClass7I3) r4
            java.lang.String r3 = X.AnonymousClass4KK.A02(r5)
            boolean r2 = r6.CUO()
            boolean r0 = r5 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            X.AnonymousClass7I3.A02(r4, r3, r2, r0, r1)
            return
        L_0x0321:
            android.content.Context r7 = r0.A05
            boolean r3 = r7 instanceof android.app.Activity
            if (r3 == 0) goto L_0x001a
            android.app.Activity r7 = (android.app.Activity) r7
            if (r7 == 0) goto L_0x001a
            X.0eK r3 = r0.A01
            X.7S7 r3 = X.C66582MXn.A0d(r3)
            if (r23 == 0) goto L_0x03c7
            X.3su r4 = r2.A0e
            if (r4 == 0) goto L_0x03c7
            X.BB8 r4 = r4.A0L()
            if (r4 == 0) goto L_0x03c7
            java.lang.String r6 = r4.A02
        L_0x033f:
            X.3su r2 = r2.A0e
            if (r2 == 0) goto L_0x03cc
            X.BB8 r2 = r2.A0L()
            if (r2 == 0) goto L_0x03cc
            java.lang.String r4 = r2.A01
            if (r4 == 0) goto L_0x03c4
            java.lang.String r2 = "Imagine "
            java.lang.String r17 = X.00l.A0F(r2, r4)
        L_0x0353:
            com.instagram.common.session.UserSession r5 = r0.A00
            X.OVN r8 = A00(r7, r5, r3)
            X.Nky r9 = X.C69416Nky.A0O
            X.0sa r2 = r0.A04
            java.lang.Object r13 = r2.invoke()
            java.lang.String r13 = (java.lang.String) r13
            r14 = 1
            X.7K7 r11 = new X.7K7
            r15 = r11
            r16 = r6
            r18 = r1
            r19 = r14
            r20 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            X.0Tu r4 = X.0Tu.A05
            r1 = 36328349513366798(0x81107100053d0e, double:3.037532742550646E-306)
            boolean r15 = X.182.A06(r4, r5, r1)
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r16 = r14
            r8.A01(r9, r10, r11, r12, r13, r14, r15, r16)
            X.0eM r0 = r0.A02
            java.lang.Object r2 = r0.getValue()
            X.7I3 r2 = (X.AnonymousClass7I3) r2
            X.3t3 r0 = r3.CBU()
            if (r0 == 0) goto L_0x0396
            java.lang.String r10 = X.AnonymousClass4KK.A02(r0)
        L_0x0396:
            boolean r1 = r3.CUO()
            X.0wc r0 = r2.A01
            X.1Ln r2 = X.1Ln.A0J(r0)
            if (r1 == 0) goto L_0x03c1
            X.XSV r1 = X.XSV.A05
        L_0x03a4:
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x001a
            X.C66583MXo.A1B(r2)
            r0 = 3020(0xbcc, float:4.232E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.C66580MXl.A1L(r2, r0)
            java.lang.String r0 = "thread_id"
            r2.A0R(r0, r10)
            java.lang.String r0 = "thread_type"
            r2.A0M(r1, r0)
            goto L_0x0414
        L_0x03c1:
            X.XSV r1 = X.XSV.A06
            goto L_0x03a4
        L_0x03c4:
            r17 = 0
            goto L_0x0353
        L_0x03c7:
            r6 = r10
            if (r23 == 0) goto L_0x03cc
            goto L_0x033f
        L_0x03cc:
            r17 = r10
            goto L_0x0353
        L_0x03cf:
            X.7JY r5 = X.AnonymousClass7JY.IMAGINE
            X.P9k r4 = r0.A09
            if (r23 == 0) goto L_0x03dd
            X.3su r2 = r2.A0e
            if (r2 == 0) goto L_0x03dd
            java.lang.String r3 = r2.A1q
            if (r3 != 0) goto L_0x03df
        L_0x03dd:
            java.lang.String r3 = ""
        L_0x03df:
            X.0qQ.A0B(r3, r1)
            X.7SM r1 = r4.A00
            X.9H7 r2 = r1.A00
            X.7Hl r1 = X.AnonymousClass9H7.A06(r2)
            r1.A1Q(r3)
            X.7Hl r1 = X.AnonymousClass9H7.A06(r2)
            r1.A1N(r5)
            com.instagram.common.session.UserSession r1 = r0.A00
            boolean r1 = X.C331227Qb.A02(r1)
            X.0eM r0 = r0.A02
            X.1Ln r2 = X.C66584MXp.A0D(r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x001a
            X.C66583MXo.A1B(r2)
            if (r1 == 0) goto L_0x0418
            r0 = 2864(0xb30, float:4.013E-42)
        L_0x040d:
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.C66580MXl.A1L(r2, r0)
        L_0x0414:
            r2.Cgf()
            return
        L_0x0418:
            r0 = 2865(0xb31, float:4.015E-42)
            goto L_0x040d
        L_0x041b:
            if (r23 == 0) goto L_0x001a
            X.7XN r1 = r0.A0A
            X.Njm r0 = X.C69347Njm.IMAGINE_ANIMATE
            r1.Eus(r2, r0)
            return
        L_0x0425:
            X.0eK r2 = r0.A01
            X.7S7 r3 = X.C66582MXn.A0d(r2)
            X.3t3 r2 = r3.CBU()
            if (r2 == 0) goto L_0x047a
            java.lang.String r9 = X.AnonymousClass4KK.A02(r2)
            if (r9 == 0) goto L_0x047a
            X.0eM r2 = r0.A03
            X.6gx r8 = X.DbZ.A0R(r2)
            java.lang.String r7 = r3.C6k()
            int r5 = r3.AdN()
            if (r24 == 0) goto L_0x0541
            java.lang.String r4 = r6.A01
        L_0x0449:
            X.1Ln r3 = X.DbT.A0J(r8)
            boolean r2 = X.DbT.A1Y(r3)
            if (r2 == 0) goto L_0x047a
            X.DbW.A17(r3, r8)
            java.lang.String r2 = "feed_post_nux_clicked"
            X.DbV.A1M(r3, r2)
            java.lang.String r2 = "feed_post_nux"
            r3.A0p(r2)
            java.lang.String r2 = "thread_view"
            java.lang.Long r2 = X.DbZ.A0b(r3, r2, r9, r7, r5)
            r3.A0i(r2)
            java.lang.String r2 = r8.A01
            r3.A0v(r2)
            java.lang.String r2 = "message_client_context_id"
            java.util.Map r2 = X.AnonymousClass7TF.A0w(r2, r4)
            r3.A0w(r2)
            r3.Cgf()
        L_0x047a:
            X.OF1 r5 = r0.A07
            if (r24 == 0) goto L_0x0480
            java.lang.String r10 = r6.A01
        L_0x0480:
            X.0eK r0 = r5.A02
            X.7Zg r2 = X.C66580MXl.A0V(r0)
            X.7S7 r8 = r2.C6l()
            X.3t3 r0 = r8.CBU()
            if (r0 == 0) goto L_0x001a
            X.3t0 r0 = X.C300965yF.A02(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.String r3 = r0.A00
            if (r3 == 0) goto L_0x001a
            X.7ZY r2 = r2.BSN()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.DirectMessageStoreImpl"
            X.0qQ.A0C(r2, r0)
            X.7ZX r2 = (X.AnonymousClass7ZX) r2
            X.7LQ r0 = r2.BSO(r10)
            if (r0 == 0) goto L_0x001a
            X.3su r6 = r0.A0e
            if (r6 == 0) goto L_0x001a
            X.2FW r2 = r6.A10
            X.NuU r0 = X.C69928NuU.$redex_init_class
            int r4 = r2.ordinal()
            r2 = 20
            r0 = 21
            if (r4 == r2) goto L_0x0536
            if (r4 != r0) goto L_0x001a
            X.3tC r0 = X.C3266377o.A01(r6)
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r0.A0u
            if (r0 == 0) goto L_0x001a
            android.net.Uri r0 = X.0cp.A03(r0)
            java.lang.String r0 = r0.getLastPathSegment()
            if (r0 == 0) goto L_0x001a
            java.lang.String r7 = X.C70282O0m.A00(r0)
        L_0x04d7:
            if (r7 == 0) goto L_0x001a
            X.4DH r0 = r5.A00
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r5.A01
            X.6Yo r6 = X.DbS.A0M(r2, r0)
            X.AnonymousClass36R.A01()
            X.1iA r0 = X.1iA.A0Q
            int r5 = r0.A00
            java.lang.String r2 = r8.C6f()
            if (r2 == 0) goto L_0x09ab
            int r0 = r8.BRT()
            com.instagram.creation.channels.model.AddChannelsRowChannelInfo r4 = new com.instagram.creation.channels.model.AddChannelsRowChannelInfo
            r4.<init>(r3, r2, r0)
            com.instagram.creation.fragment.EditMediaInfoFragment r3 = new com.instagram.creation.fragment.EditMediaInfoFragment
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "EditMediaFragment.ARGUMENT_MEDIA_ID"
            r2.putString(r0, r7)
            java.lang.String r0 = "EditMediaFragment.ARGUMENT_MEDIA_TYPE"
            r2.putInt(r0, r5)
            java.lang.String r0 = "EditMediaFragment.ARGUMENT_MEDIA_CAROUSEL_INDEX"
            r2.putInt(r0, r1)
            java.lang.String r0 = "EditMediaFragment.ARGUMENT_MEDIA_POSITION_IN_FEED"
            r2.putInt(r0, r1)
            java.lang.String r0 = "EditMediaFragment.ARGUMENT_MEDIA_IS_CAROUSEL_BUMPED_POST"
            r2.putBoolean(r0, r1)
            java.lang.String r0 = "EditMediaFragment.ARGUMENT_IS_FROM_BOOST_EDITABLE_CAPTION"
            r2.putBoolean(r0, r1)
            java.lang.String r0 = "EditMediaFragment.ARGUMENT_IS_MESSAGING_ADS_SELECTED"
            r2.putBoolean(r0, r1)
            java.lang.String r0 = "EditMediaFragment.ARGUMENT_CHANNEL_TO_TAG_INFO"
            r2.putParcelable(r0, r4)
            r3.setArguments(r2)
            r6.A0D(r3)
            r6.A04()
            return
        L_0x0536:
            X.1Xj r0 = r6.A0S()
            if (r0 == 0) goto L_0x001a
            java.lang.String r7 = r0.getId()
            goto L_0x04d7
        L_0x0541:
            r4 = r10
            goto L_0x0449
        L_0x0544:
            X.OF1 r3 = r0.A07
            X.0eK r0 = r3.A02
            X.7S7 r0 = X.C66582MXn.A0d(r0)
            X.3t3 r0 = r0.CBU()
            if (r0 == 0) goto L_0x001a
            X.3t0 r0 = X.C300965yF.A02(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.String r7 = r0.A00
            if (r7 == 0) goto L_0x001a
            com.instagram.common.session.UserSession r6 = r3.A01
            X.818 r5 = X.AnonymousClass818.IG_CHANNELS_XPOSTING_MESSAGE_FOOTER
            X.819 r2 = X.AnonymousClass819.MESSAGE_FOOTER_XPOSTING_CHANNELS
            X.8sM r0 = X.C368278sM.ACCEPT
            X.C368288sN.A00(r5, r0, r2, r10, r6)
            X.7Pr r2 = X.DbS.A0W(r6)
            r2.A16 = r1
            r0 = 1
            r2.A0t = r0
            r2.A0y = r1
            r2.A0k = r1
            r2.A1S = r0
            X.7Pu r4 = r2.A00()
            X.4DH r0 = r3.A00
            android.content.Context r3 = r0.requireContext()
            X.E3h r2 = new X.E3h
            r2.<init>()
            android.os.Bundle r1 = X.JTP.A0F(r6)
            java.lang.String r0 = "thread_id"
            r1.putString(r0, r7)
            r2.setArguments(r1)
            r4.A03(r3, r2)
            X.819 r1 = X.AnonymousClass819.BOTTOMSHEET_XPOSTING_CHANNELS
            X.8sM r0 = X.C368278sM.VIEW
            X.C368288sN.A00(r5, r0, r1, r10, r6)
            return
        L_0x059c:
            X.OF1 r0 = r0.A07
            X.37E r1 = X.AnonymousClass37D.A00
            X.4DH r0 = r0.A00
            android.content.Context r0 = r0.requireContext()
            X.37D r2 = r1.A02(r0)
            if (r2 == 0) goto L_0x001a
            java.lang.String r1 = "ig_direct_thread"
            java.lang.String r0 = "ig_direct_thread_moustache_nux"
            X.DxO r0 = X.C69762Nrl.A00(r1, r0)
            r2.A0J(r0)
            return
        L_0x05b8:
            X.OF1 r9 = r0.A07
            if (r23 == 0) goto L_0x001a
            X.3su r7 = r2.A0e
            if (r7 == 0) goto L_0x001a
            monitor-enter(r7)
            X.9Ib r0 = r7.A05     // Catch:{ all -> 0x09b0 }
            monitor-exit(r7)
            if (r0 == 0) goto L_0x001a
            java.lang.Object r1 = r0.A00
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            if (r1 == 0) goto L_0x001a
            java.lang.String r0 = "ib_id"
            java.lang.String r2 = X.DbS.A0r(r0, r1)
            if (r2 == 0) goto L_0x001a
            java.lang.String r0 = "question_text"
            java.lang.String r1 = X.DbS.A0r(r0, r1)
            java.lang.String r5 = ""
            if (r1 != 0) goto L_0x05df
            r1 = r5
        L_0x05df:
            java.lang.Object r0 = r7.A1T
            java.lang.String r8 = java.lang.String.valueOf(r0)
            X.OMj r4 = new X.OMj
            r4.<init>()
            r4.A01 = r2
            r4.A02 = r1
            r4.A03 = r5
            com.instagram.common.session.UserSession r3 = r9.A01
            X.OyN r6 = X.OyN.A00(r3)
            X.0qQ.A07(r6)
            X.4DH r2 = r9.A00
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            X.OKh r1 = new X.OKh
            r1.<init>(r3, r0)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r4)
            r6.A06(r0)
            java.lang.String r0 = "business_settings"
            r1.A00(r2, r4, r0, r8)
            X.0eK r0 = r9.A02
            X.7S7 r0 = X.C66582MXn.A0d(r0)
            X.3t3 r0 = r0.CBU()
            if (r0 == 0) goto L_0x0626
            X.3t0 r0 = X.C300965yF.A02(r0)
            if (r0 == 0) goto L_0x0626
            java.lang.String r4 = r0.A00
            if (r4 != 0) goto L_0x0627
        L_0x0626:
            r4 = r5
        L_0x0627:
            java.lang.String r3 = r7.A0g()
            if (r3 != 0) goto L_0x062e
            r3 = r5
        L_0x062e:
            java.lang.String r0 = r7.A1j
            if (r0 == 0) goto L_0x0633
            r5 = r0
        L_0x0633:
            com.instagram.common.session.UserSession r2 = r6.A0B
            java.lang.Class<X.1mM> r0 = X.C66351mM.class
            X.MaY r1 = X.C66669Mac.A07(r2, r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.1mM r0 = new X.1mM
            r0.<init>(r1)
            r0.A03 = r4
            r0.A01 = r3
            r0.A02 = r5
            r0.A00 = r10
            X.C66580MXl.A1P(r2, r0)
            return
        L_0x0650:
            X.0eM r1 = r0.A02
            X.1Ln r2 = X.C66584MXp.A0D(r1)
            boolean r1 = X.DbT.A1Y(r2)
            if (r1 == 0) goto L_0x066b
            X.C66583MXo.A1B(r2)
            r1 = 3261(0xcbd, float:4.57E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.C66580MXl.A1L(r2, r1)
            r2.Cgf()
        L_0x066b:
            X.OF1 r0 = r0.A07
            X.1ps r3 = X.AnonymousClass9B9.A00()
            com.instagram.common.session.UserSession r2 = r0.A01
            X.4DH r0 = r0.A00
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.Nml r0 = X.C69503Nml.A08
            r3.A00(r1, r0, r2)
            return
        L_0x067f:
            X.OF1 r4 = r0.A07
            com.instagram.common.session.UserSession r2 = r4.A01
            X.0kM r3 = new X.0kM
            r3.<init>(r2)
            java.lang.String r2 = "direct_thread"
            X.0wc r3 = X.C66580MXl.A0N(r3, r2)
            java.lang.String r2 = "direct_thread_action"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r3, r2)
            java.lang.String r2 = "saved_reply_nux_click"
            X.DbV.A1G(r3, r2)
            X.0sa r2 = r4.A03
            java.lang.Object r3 = r2.invoke()
            X.7Na r3 = (X.C330487Na) r3
            if (r3 == 0) goto L_0x0723
            X.7Bo r2 = X.C327627Bo.NUX_TYPE_SAVED_REPLY
            java.util.List r2 = X.AnonymousClass7TE.A1I(r2)
            java.util.HashSet r8 = X.C66580MXl.A12(r2)
            java.lang.ref.WeakReference r7 = r3.A00
            java.lang.Object r5 = r7.get()
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x070c
            X.2Rw r2 = r5.A0A
            if (r2 == 0) goto L_0x070c
            int r2 = r5.getChildCount()
            X.2HY r1 = X.C229632nm.A0C(r1, r2)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r1.iterator()
        L_0x06cb:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x070e
            r1 = r10
            X.0sh r1 = (X.0sh) r1
            int r1 = r1.A00()
            android.view.View r1 = r5.getChildAt(r1)
            X.3kE r4 = r5.A0Z(r1)
            boolean r1 = r4 instanceof X.AnonymousClass7PL
            if (r1 == 0) goto L_0x06cb
            X.7PL r4 = (X.AnonymousClass7PL) r4
            X.7So r3 = r4.A00
            boolean r1 = r3 instanceof X.AnonymousClass7LQ
            if (r1 == 0) goto L_0x06cb
            r1 = 26
            java.lang.String r2 = X.C273654mx.A00(r1)
            X.0qQ.A0C(r3, r2)
            X.7LQ r3 = (X.AnonymousClass7LQ) r3
            X.7Bo r1 = r3.A03()
            boolean r1 = r8.contains(r1)
            if (r1 == 0) goto L_0x06cb
            X.7So r1 = r4.A00
            X.0qQ.A0C(r1, r2)
            if (r1 == 0) goto L_0x06cb
            r9.add(r1)
            goto L_0x06cb
        L_0x070c:
            X.0sn r9 = X.0sn.A00
        L_0x070e:
            boolean r1 = X.AnonymousClass7CX.A08(r9)
            if (r1 == 0) goto L_0x0723
            java.lang.Object r1 = r7.get()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L_0x0723
            X.2Rw r1 = r1.A0A
            if (r1 == 0) goto L_0x0723
            r1.notifyDataSetChanged()
        L_0x0723:
            X.P9k r0 = r0.A09
            r0.EJu(r6)
            return
        L_0x0729:
            com.instagram.common.session.UserSession r7 = r0.A00
            X.0iw r3 = r0.A06
            if (r24 == 0) goto L_0x078f
            java.lang.String r2 = r6.A01
            java.lang.String r10 = r6.A00()
        L_0x0735:
            android.content.Context r1 = r0.A05
            boolean r5 = X.0oI.A0A(r1)
            r4 = 1
            X.0wc r1 = X.AnonymousClass0kN.A01(r3, r7)
            X.1Ln r3 = X.1Ln.A05(r1)
            java.lang.String r1 = "message_id"
            r3.A0R(r1, r2)
            java.lang.String r1 = "client_context"
            r3.A0R(r1, r10)
            java.lang.String r2 = "xma_barcelona_upsell_nux"
            java.lang.String r1 = "web_link_entry_source"
            r3.A0R(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            java.lang.String r1 = "is_barcelona_installed"
            r3.A0O(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r1 = 2904(0xb58, float:4.07E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r3.A0O(r1, r2)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x0774
            r3.Cgf()
        L_0x0774:
            X.OF1 r0 = r0.A07
            com.instagram.common.session.UserSession r2 = r0.A01
            X.4DH r0 = r0.A00
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            java.lang.String r4 = r2.A06
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r2)
            java.lang.String r5 = r0.getUsername()
            java.lang.String r6 = "direct_message_nux"
            r3 = 0
            X.C49965FGy.A01(r1, r2, r3, r4, r5, r6)
            return
        L_0x078f:
            r2 = r10
            goto L_0x0735
        L_0x0791:
            X.0eK r4 = r0.A01
            X.7S7 r3 = X.C66582MXn.A0d(r4)
            X.3t2 r3 = r3.C6c()
            X.0qQ.A07(r3)
            boolean r3 = X.AnonymousClass6W3.A07(r3)
            r3 = r3 ^ 1
            com.instagram.common.session.UserSession r7 = r0.A00
            X.LAh r9 = X.C331317Qk.A00(r7, r3)
            if (r9 == 0) goto L_0x07d7
            if (r23 == 0) goto L_0x0817
            X.3su r3 = r2.A0e
            if (r3 == 0) goto L_0x0817
            java.lang.String r8 = r3.A0g()
        L_0x07b6:
            X.7I3 r3 = r9.A05
            java.lang.String r6 = "mustache_clicked"
            X.0wc r5 = r3.A01
            java.lang.String r3 = "messaging_meta_ai_intent_detection_event"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r5, r3)
            X.DbS.A1I(r5, r6)
            java.lang.String r3 = "message_id"
            r5.AAJ(r3, r8)
            r5.Cgf()
            X.L6V r3 = r9.A06
            X.1Av r6 = r3.A02
            java.lang.String r5 = "meta_ai_intent_detection_nux_clicked"
            r3 = 1
            r6.A13(r5, r3)
        L_0x07d7:
            android.content.Context r5 = r0.A05
            boolean r3 = r5 instanceof android.app.Activity
            if (r3 == 0) goto L_0x080f
            android.app.Activity r5 = (android.app.Activity) r5
            if (r5 == 0) goto L_0x080f
            X.7S7 r3 = X.C66582MXn.A0d(r4)
            X.OVN r6 = A00(r5, r7, r3)
            X.Nky r7 = X.C69416Nky.A0Q
            X.0sa r0 = r0.A04
            java.lang.Object r11 = r0.invoke()
            java.lang.String r11 = (java.lang.String) r11
            r8 = 0
            if (r23 == 0) goto L_0x07fc
            X.3su r0 = r2.A0e
            if (r0 == 0) goto L_0x07fc
            java.lang.String r10 = r0.A1q
        L_0x07fc:
            r17 = 1
            X.7K7 r9 = new X.7K7
            r12 = r9
            r13 = r10
            r14 = r8
            r15 = r1
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r12 = 124(0x7c, float:1.74E-43)
            r10 = r8
            X.OVN.A00(r6, r7, r8, r9, r10, r11, r12)
        L_0x080f:
            X.7ZY r0 = X.C66582MXn.A0W(r4)
            r0.AHm(r2)
            return
        L_0x0817:
            r8 = r10
            goto L_0x07b6
        L_0x0819:
            X.OF1 r4 = r0.A07
            X.4DH r3 = r4.A00
            android.content.Context r1 = r3.requireContext()
            java.lang.Class<com.instagram.direct.avatar.socialstickers.ui.AvatarOptionsActivity> r0 = com.instagram.direct.avatar.socialstickers.ui.AvatarOptionsActivity.class
            android.content.Intent r2 = X.C66580MXl.A0A(r1, r0)
            com.instagram.common.session.UserSession r0 = r4.A01
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r2.putExtra(r0, r1)
            X.0b6 r0 = X.0b6.A00()
            X.0R3 r1 = r0.A07()
            android.content.Context r0 = r3.requireContext()
            r1.A0G(r0, r2)
            return
        L_0x0840:
            X.OF1 r9 = r0.A07
            com.instagram.common.session.UserSession r8 = r9.A01
            X.818 r7 = X.AnonymousClass818.IG_CHANNELS_XPOSTING_MESSAGE_FOOTER
            X.819 r4 = X.AnonymousClass819.MESSAGE_FOOTER_XPOSTING_CHANNELS
            X.8sM r3 = X.C368278sM.ACCEPT
            X.81A r2 = new X.81A
            r2.<init>()
            r0 = 2207(0x89f, float:3.093E-42)
            java.lang.String r6 = X.C273654mx.A00(r0)
            r0 = 402(0x192, float:5.63E-43)
            java.lang.String r5 = X.C273654mx.A00(r0)
            r2.A06(r5, r6)
            X.C368288sN.A00(r7, r3, r4, r2, r8)
            X.4DH r2 = r9.A00
            X.2nI r9 = X.C229382nI.A03(r2, r8, r10)
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>(r1)
            androidx.fragment.app.FragmentActivity r2 = r2.requireActivity()
            java.lang.String r0 = "com.bloks.www.igd.bc.fbm.bc.creation.upsell.async"
            X.FBO r1 = new X.FBO
            r1.<init>(r0)
            java.util.HashMap r0 = X.C359608dC.A01(r4)
            r1.A04 = r0
            r1.A03 = r3
            r1.A02 = r10
            r1.A01(r2, r9)
            X.819 r2 = X.AnonymousClass819.BOTTOMSHEET_XPOSTING_CHANNELS
            X.8sM r1 = X.C368278sM.VIEW
            X.81A r0 = new X.81A
            r0.<init>()
            r0.A06(r5, r6)
            X.C368288sN.A00(r7, r1, r2, r0, r8)
            return
        L_0x089c:
            if (r23 == 0) goto L_0x09a1
            X.5H7 r1 = r2.A0H
            if (r1 == 0) goto L_0x09a1
            java.util.List r1 = r1.A00
            if (r1 == 0) goto L_0x09a1
            java.lang.Object r1 = X.00k.A0L(r1)
            X.3uc r1 = (X.C255723uc) r1
            if (r1 == 0) goto L_0x09a1
            java.lang.String r4 = r1.A02
        L_0x08b0:
            X.5H7 r1 = r2.A0H
            if (r1 == 0) goto L_0x09a6
            java.util.List r1 = r1.A04
            if (r1 == 0) goto L_0x09a6
            java.lang.Object r1 = X.00k.A0L(r1)
            X.3uc r1 = (X.C255723uc) r1
            if (r1 == 0) goto L_0x09a6
            java.lang.String r7 = r1.A02
        L_0x08c2:
            X.5H7 r1 = r2.A0H
            if (r1 == 0) goto L_0x08d4
            java.util.List r1 = r1.A07
            if (r1 == 0) goto L_0x08d4
            java.lang.Object r1 = X.00k.A0L(r1)
            X.3uc r1 = (X.C255723uc) r1
            if (r1 == 0) goto L_0x08d4
            java.lang.String r10 = r1.A02
        L_0x08d4:
            X.OF1 r6 = r0.A07
            X.0eK r0 = r6.A02
            X.7S7 r1 = X.C66582MXn.A0d(r0)
            X.170 r0 = r1.BY7()
            r5 = 0
            if (r0 == 0) goto L_0x099e
            com.instagram.common.typedurl.ImageUrl r9 = r0.Bh3()
        L_0x08e7:
            X.170 r0 = r1.BY7()
            if (r0 == 0) goto L_0x099b
            java.lang.String r3 = r0.B8Q()
        L_0x08f1:
            X.3t3 r0 = r1.CBU()
            if (r0 == 0) goto L_0x08ff
            X.3t0 r0 = X.C300965yF.A02(r0)
            if (r0 == 0) goto L_0x08ff
            java.lang.String r5 = r0.A00
        L_0x08ff:
            com.instagram.common.session.UserSession r11 = r6.A01
            java.lang.String r8 = ""
            r1 = r5
            if (r5 != 0) goto L_0x0907
            r1 = r8
        L_0x0907:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.KWk r12 = new X.KWk
            r12.<init>(r11, r0, r1)
            if (r3 != 0) goto L_0x0911
            r3 = r8
        L_0x0911:
            r14 = 0
            X.05G r2 = r12.A05
            X.Npi r1 = new X.Npi
            r1.<init>()
            r1.A04 = r3
            r1.A00 = r9
            r1.A02 = r4
            r1.A05 = r10
            r1.A03 = r7
            r1.A01 = r14
            X.NW6 r0 = new X.NW6
            r0.<init>(r1)
            r2.Epw(r0)
            r3 = 0
            if (r4 == 0) goto L_0x0937
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x0938
        L_0x0937:
            r0 = 1
        L_0x0938:
            r4 = r0 ^ 1
            if (r10 == 0) goto L_0x0943
            int r1 = r10.length()
            r0 = 0
            if (r1 != 0) goto L_0x0944
        L_0x0943:
            r0 = 1
        L_0x0944:
            r2 = r0 ^ 1
            if (r7 == 0) goto L_0x094e
            int r0 = r7.length()
            if (r0 != 0) goto L_0x094f
        L_0x094e:
            r3 = 1
        L_0x094f:
            r7 = r3 ^ 1
            if (r5 != 0) goto L_0x0954
            r5 = r8
        L_0x0954:
            r3 = 3
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "has_address"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "has_phone_number"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "has_email"
            java.util.LinkedHashMap r1 = X.DbY.A0q(r0, r1, r4, r2)
            java.lang.String r0 = "customer_details_nux_click"
            X.OZ3.A00(r11, r0, r5, r1)
            X.4DH r0 = r6.A00
            android.content.Context r9 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r10 = r0.requireActivity()
            java.lang.String r13 = r0.getModuleName()
            X.0qQ.A0B(r13, r3)
            X.12T r1 = X.AnonymousClass12T.A00
            r0 = 994363717(0x3b44c945, float:0.0030027193)
            X.0nV r0 = r1.CO6(r0, r3)
            com.instagram.direct.inbox.customerdetails.navigator.BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1 r8 = new com.instagram.direct.inbox.customerdetails.navigator.BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.1ES.A07(r0, r8)
            return
        L_0x099b:
            r3 = r5
            goto L_0x08f1
        L_0x099e:
            r9 = r5
            goto L_0x08e7
        L_0x09a1:
            r4 = r10
            if (r23 == 0) goto L_0x09a6
            goto L_0x08b0
        L_0x09a6:
            r7 = r10
            if (r23 == 0) goto L_0x08d4
            goto L_0x08c2
        L_0x09ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x09b0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9S.E1A(X.7Bo, X.7LQ, com.instagram.model.direct.messageid.MessageIdentifier):void");
    }
}
