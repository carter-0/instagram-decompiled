package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Gt  reason: invalid class name and case insensitive filesystem */
public final class C262984Gt implements C262994Gu {
    public 1wn A00;
    public C64709Lgi A01;
    public final 1Ng A02;
    public final UserSession A03;
    public final Fragment A04;
    public final AnonymousClass4DU A05;

    public C262984Gt(Fragment fragment, 1Ng r3, UserSession userSession, AnonymousClass4DU r5) {
        0qQ.A0B(r3, 3);
        this.A03 = userSession;
        this.A04 = fragment;
        this.A02 = r3;
        this.A05 = r5;
    }

    public final void CuO(1Xj r16, AnonymousClass3W1 r17, Integer num, String str, boolean z, boolean z2) {
        1Xj r2 = r16;
        0qQ.A0B(r2, 0);
        AnonymousClass3W1 r3 = r17;
        0qQ.A0B(r3, 1);
        Context context = this.A04.getContext();
        if (context != null) {
            UserSession userSession = this.A03;
            boolean z3 = z2;
            FEb.A01(context, userSession, new IWB(this, r2, r3, num, str, z3, z), false, false, z3, !C263014Gw.A00.A02(userSession, r2));
        }
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.L1X, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        if (r6 != null) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C262984Gt r25, X.1Xj r26, java.lang.Integer r27, java.lang.String r28, boolean r29) {
        /*
            r10 = r25
            r6 = r28
            androidx.fragment.app.Fragment r8 = r10.A04
            android.content.Context r4 = r8.getContext()
            if (r4 == 0) goto L_0x002b
            r7 = 0
            r3 = 0
            r19 = r29
            if (r29 == 0) goto L_0x002c
            com.instagram.common.session.UserSession r5 = r10.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342163288484683945(0x2081091a001720a9, double:4.0658226783470025E-152)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x002c
            androidx.fragment.app.FragmentActivity r1 = r8.getActivity()
            r0 = 2131953313(0x7f1306a1, float:1.9543093E38)
            X.C59689JTv.A01(r1, r3, r0, r7)
        L_0x002b:
            return
        L_0x002c:
            com.instagram.common.session.UserSession r5 = r10.A03
            r9 = r26
            boolean r0 = r9.A6S(r5)
            if (r0 == 0) goto L_0x0045
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            X.Hpj r1 = new X.Hpj
            r1.<init>(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1.A00(r3, r5, r9, r0)
            return
        L_0x0045:
            X.1Ng r11 = r10.A02
            java.lang.Class<X.DGo> r1 = X.C45959DGo.class
            X.IO1 r0 = new X.IO1
            r0.<init>(r4, r10, r9)
            r10.A00 = r0
            r11.A01(r0, r1)
            boolean r0 = r8 instanceof X.AnonymousClass4DH
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x007e
            X.0Tu r12 = X.0Tu.A05
            r0 = 2342163288483897504(0x2081091a000b20a0, double:4.065822677680167E-152)
            boolean r0 = X.182.A06(r12, r5, r0)
            if (r0 == 0) goto L_0x007e
            r12 = r8
            X.4DH r12 = (X.AnonymousClass4DH) r12
            X.Lgi r1 = new X.Lgi
            r0 = r19
            r1.<init>(r12, r11, r5, r0)
            r10.A01 = r1
            r12.registerLifecycleListener(r1)
            java.lang.Class<X.Lfw> r1 = X.C64670Lfw.class
            X.Lgi r0 = r10.A01
            if (r0 == 0) goto L_0x027d
            r11.A01(r0, r1)
        L_0x007e:
            r22 = r27
            if (r28 != 0) goto L_0x008e
            X.1Xj r0 = r9.A1c(r7)
            if (r0 == 0) goto L_0x026c
            java.lang.String r6 = r0.A2n()
            if (r6 == 0) goto L_0x026d
        L_0x008e:
            X.LRh r12 = new X.LRh
            r12.<init>(r5, r4)
            r14 = 1
            X.0qQ.A0B(r6, r14)
            com.instagram.common.session.UserSession r0 = r12.A07
            android.content.Context r13 = r12.A01
            r25 = 0
            r23 = r13
            r24 = r0
            r26 = r25
            r27 = r25
            r28 = r25
            X.27r r11 = X.27p.A00(r23, r24, r25, r26, r27, r28)
            X.4yP r0 = X.C279294yP.FEED
            X.283 r10 = r11.A04
            r10.A08 = r0
            X.JVj r0 = X.C59725JVj.OPEN_CAROUSEL
            r10.A0B = r0
            X.8fP r0 = X.C360948fP.NORMAL
            r10.A07 = r0
            r10.A0R = r6
            X.28t r0 = X.28t.A04
            r10.A0A = r0
            int r1 = r22.intValue()
            if (r1 == r14) goto L_0x0268
            if (r1 == r7) goto L_0x0264
            r0 = 2
            if (r1 != r0) goto L_0x0277
            X.28D r14 = X.28D.A3h
        L_0x00cc:
            int r18 = X.AnonymousClass4x3.A00(r13)
            X.JVj r0 = r12.A04
            r13 = r11
            r15 = r0
            r16 = r25
            r17 = r25
            r13.A17(r14, r15, r16, r17, r18)
            X.29f r0 = r11.A0A
            r0.A0R()
            java.lang.String r0 = r10.A0L
            r20 = r0
        L_0x00e4:
            androidx.fragment.app.FragmentActivity r18 = r8.requireActivity()
            java.lang.String r10 = r9.getId()
            if (r10 == 0) goto L_0x0271
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.Alu()
            if (r0 == 0) goto L_0x0260
            java.util.Iterator r8 = r0.iterator()
        L_0x00fa:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x025d
            java.lang.Object r2 = r8.next()
            r1 = r2
            X.1Xj r1 = (X.1Xj) r1
            boolean r0 = r1.A5p()
            if (r0 != 0) goto L_0x0113
            boolean r0 = r1.CeS()
            if (r0 == 0) goto L_0x00fa
        L_0x0113:
            X.1Xj r2 = (X.1Xj) r2
            if (r2 == 0) goto L_0x0260
            float r11 = r2.A0l()
        L_0x011b:
            X.1Xy r0 = r9.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0127
            java.lang.String r3 = r0.getUsername()
        L_0x0127:
            boolean r17 = r9.A5h()
            java.lang.String r14 = r9.A2o()
            r16 = 0
            X.L1X r9 = new X.L1X
            r9.<init>()
            X.37E r1 = X.AnonymousClass37D.A00
            r0 = r18
            X.37D r8 = r1.A01(r0)
            if (r8 == 0) goto L_0x002b
            X.IZu r0 = new X.IZu
            r0.<init>(r5, r4)
            r1 = r8
            X.37F r1 = (X.AnonymousClass37F) r1
            r1.A0F = r0
            X.Lz4 r0 = new X.Lz4
            r0.<init>(r4, r5, r9)
            r1.A0H = r0
            X.K6J r2 = new X.K6J
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            X.AnonymousClass0Dg.A00(r1, r5)
            r0 = 4312(0x10d8, float:6.042E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putFloat(r0, r11)
            r2.setArguments(r1)
            r12 = 1
            X.0Tu r13 = X.0Tu.A05
            r0 = 36320279271186604(0x81091a001a20ac, double:3.032429088899634E-306)
            boolean r0 = X.182.A06(r13, r5, r0)
            r29 = r16
            if (r0 == 0) goto L_0x017c
            r29 = r14
        L_0x017c:
            r15 = 0
            if (r14 == 0) goto L_0x0180
            r15 = 1
        L_0x0180:
            int r0 = X.AnonymousClass0nB.A00(r4)
            float r14 = (float) r0
            android.app.Activity r0 = X.C61270mF.A00(r4)
            X.2dZ r0 = X.2dY.A00(r0)
            if (r0 == 0) goto L_0x01d0
            int r0 = r0.AYI()
            float r0 = (float) r0
            float r14 = r14 - r0
            int r0 = X.AnonymousClass2uJ.A00
            float r0 = (float) r0
            float r14 = r14 - r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165286(0x7f070066, float:1.7944785E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 1
            if (r15 == 0) goto L_0x01a8
            r0 = 2
        L_0x01a8:
            int r1 = r1 * r0
            android.content.res.Resources r15 = r4.getResources()
            r0 = 2131165382(0x7f0700c6, float:1.794498E38)
            int r16 = r15.getDimensionPixelSize(r0)
            android.content.res.Resources r15 = r4.getResources()
            r0 = 2131165208(0x7f070018, float:1.7944627E38)
            int r0 = r15.getDimensionPixelSize(r0)
            int r1 = r1 + r16
            int r1 = r1 + r0
            float r1 = (float) r1
            float r1 = r1 / r14
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01cc
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x01cc:
            java.lang.Float r16 = java.lang.Float.valueOf(r1)
        L_0x01d0:
            java.lang.String r0 = "_"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = X.00l.A0R(r10, r0, r7)
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            X.LEB r14 = new X.LEB
            r23 = r6
            r24 = r10
            r25 = r20
            r26 = r11
            r27 = r17
            r28 = r19
            r19 = r14
            r20 = r4
            r21 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = 36320279270269089(0x81091a000c20a1, double:3.032429088319394E-306)
            boolean r0 = X.182.A06(r13, r5, r0)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x0205
            r6 = r11
        L_0x0205:
            com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig r1 = new com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig
            r0 = r17
            r1.<init>(r10, r3, r6, r0)
            X.L9o r3 = new X.L9o
            r19 = r4
            r20 = r5
            r21 = r1
            r22 = r9
            r23 = r0
            r17 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131968986(0x7f1343da, float:1.9574882E38)
            java.lang.String r1 = r1.getString(r0)
            r2.A0A = r14
            r2.A02 = r12
            r0 = r29
            r2.A0F = r0
            if (r16 == 0) goto L_0x0259
            float r0 = r16.floatValue()
        L_0x0236:
            r2.A01 = r0
            r2.A09 = r3
            r2.A0D = r1
            r2.A0E = r7
            X.9HD r1 = X.AnonymousClass9HC.A1b
            android.os.Parcelable$Creator r0 = com.instagram.direct.capabilities.Capabilities.CREATOR
            X.0sn r0 = X.0sn.A00
            com.instagram.direct.capabilities.Capabilities r0 = X.C376189Gz.A00(r0)
            X.9HC r0 = r1.A00(r5, r0)
            X.7L2 r0 = X.C250563lf.A06(r4, r0)
            X.7L0 r0 = r0.A07
            r2.ADi(r0)
            r8.A0J(r2)
            return
        L_0x0259:
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            goto L_0x0236
        L_0x025d:
            r2 = r3
            goto L_0x0113
        L_0x0260:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x011b
        L_0x0264:
            X.28D r14 = X.28D.A3i
            goto L_0x00cc
        L_0x0268:
            X.28D r14 = X.28D.A3g
            goto L_0x00cc
        L_0x026c:
            r6 = r3
        L_0x026d:
            r20 = r3
            goto L_0x00e4
        L_0x0271:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0277:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x027d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262984Gt.A00(X.4Gt, X.1Xj, java.lang.Integer, java.lang.String, boolean):void");
    }

    public final void Cx1(1Xj r8) {
        ArrayList arrayList = new ArrayList();
        1Xj r3 = r8;
        User CCd = r8.A0C.CCd();
        if (CCd != null) {
            arrayList.add(CCd);
        }
        List Aay = r8.A0C.Aay();
        if (Aay != null) {
            arrayList.addAll(Aay);
        }
        Fragment fragment = this.A04;
        AnonymousClass4DU r4 = this.A05;
        UserSession userSession = this.A03;
        String string = fragment.getString(2131975423);
        0qQ.A07(string);
        LTZ.A0C(fragment, userSession, r3, r4, string, arrayList);
    }
}
