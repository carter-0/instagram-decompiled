package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.user.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.36O  reason: invalid class name */
public final class AnonymousClass36O implements AnonymousClass36P, CallerContextable {
    public static boolean A09 = true;
    public static Uri A0A = null;
    public static AnonymousClass36X A0B = null;
    public static String A0C = null;
    public static String A0D = null;
    public static String A0E = null;
    public static boolean A0F = false;
    public static boolean A0G = false;
    public static final Handler A0H = new Handler(Looper.getMainLooper());
    public static final CallerContext A0I = CallerContext.A00(AnonymousClass36O.class);
    public static final AnonymousClass36Q A0J = new Object();
    public static final String __redex_internal_original_name = "UpdateProfilePictureHelper";
    public boolean A00;
    public final Fragment A01;
    public final 0hq A02;
    public final AnonymousClass57Y A03;
    public final UserSession A04;
    public final User A05;
    public final 0sP A06;
    public final AnonymousClass36V A07;
    public final Integer A08;

    public AnonymousClass36O(Fragment fragment, 0hq r3, AnonymousClass57Y r4, UserSession userSession, User user, Integer num, 0sP r8) {
        AnonymousClass36X r0;
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A01 = fragment;
        this.A02 = r3;
        this.A05 = user;
        this.A03 = r4;
        this.A08 = num;
        this.A06 = r8;
        AnonymousClass36Q.A00();
        this.A07 = AnonymousClass36R.A00(fragment.requireContext(), userSession, this);
        if (num == AnonymousClass05K.A0s) {
            r0 = AnonymousClass36X.IG_EDIT_PROFILE;
        } else if (num == AnonymousClass05K.A0r) {
            r0 = AnonymousClass36X.IG_PROFILE_PHOTO_LONG_PRESS;
        } else {
            return;
        }
        A0B = r0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.7yS, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (X.DE2.A0G() == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(android.content.Context r10) {
        /*
            r9 = this;
            r4 = 0
            com.instagram.common.session.UserSession r2 = r9.A04
            X.FYr r1 = X.C48927EmR.A00(r2)
            X.7yS r0 = new X.7yS
            r0.<init>()
            r1.A00 = r0
            boolean r0 = X.DE2.A0F()
            if (r0 == 0) goto L_0x001b
            boolean r0 = X.DE2.A0G()
            r8 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r8 = 0
        L_0x001c:
            r7 = r8 ^ 1
            if (r8 == 0) goto L_0x0130
            java.lang.Boolean r0 = X.DE2.A0A()
        L_0x0024:
            X.0qQ.A0A(r0)
            boolean r6 = r0.booleanValue()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r8 == 0) goto L_0x0127
            X.G9V r1 = X.DE2.A01()
            java.lang.String r0 = r1.BlV()
            if (r0 == 0) goto L_0x025c
            java.lang.String r5 = r1.BlV()
        L_0x0040:
            X.0qQ.A0A(r5)
            X.FLx r1 = new X.FLx
            r1.<init>(r10, r9)
            X.Cuc r0 = new X.Cuc
            r0.<init>(r5, r4, r1)
            r3.add(r0)
            if (r7 == 0) goto L_0x0069
            r0 = 2131964180(0x7f133114, float:1.9565134E38)
            java.lang.String r5 = r10.getString(r0)
            X.0qQ.A07(r5)
            X.FKp r1 = new X.FKp
            r1.<init>(r9)
            X.Cuc r0 = new X.Cuc
            r0.<init>(r5, r4, r1)
            r3.add(r0)
        L_0x0069:
            if (r6 == 0) goto L_0x008c
            if (r8 == 0) goto L_0x011e
            X.G9V r1 = X.DE2.A01()
            java.lang.String r0 = r1.BFZ()
            if (r0 == 0) goto L_0x0250
            java.lang.String r6 = r1.BFZ()
        L_0x007b:
            X.0qQ.A0A(r6)
            X.FLy r5 = new X.FLy
            r5.<init>(r10, r9)
            r1 = 1
            X.Cuc r0 = new X.Cuc
            r0.<init>(r6, r1, r5)
            r3.add(r0)
        L_0x008c:
            if (r8 == 0) goto L_0x00ac
            X.G9V r1 = X.DE2.A01()
            java.lang.String r0 = r1.BlY()
            if (r0 == 0) goto L_0x0244
            java.lang.String r5 = r1.BlY()
            X.0qQ.A07(r5)
            X.FLz r1 = new X.FLz
            r1.<init>(r10, r9)
            X.Cuc r0 = new X.Cuc
            r0.<init>(r5, r4, r1)
            r3.add(r0)
        L_0x00ac:
            X.FcL r6 = new X.FcL
            r6.<init>()
            X.3JC r0 = X.DE2.A00
            if (r0 == 0) goto L_0x013e
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x013e
            X.DZP r0 = (X.DZP) r0
            X.DYD r0 = r0.Aia()
            if (r0 == 0) goto L_0x013e
            X.3JC r0 = X.DE2.A00
            java.lang.Object r0 = r0.A01
            X.DZP r0 = (X.DZP) r0
            X.DYD r0 = r0.Aia()
            boolean r0 = r0.BJ2()
            if (r0 == 0) goto L_0x013e
            X.Dg1 r5 = new X.Dg1
            r5.<init>(r10, r2)
            java.lang.String r1 = X.DE2.A0B()
            java.lang.String r0 = X.DE2.A0C()
            r5.A0D(r1, r0)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r2)
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            java.lang.String r0 = r0.getUrl()
            android.net.Uri r1 = X.0cp.A03(r0)
            X.0qQ.A0B(r1, r4)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A00(r1, r0, r0)
            r5.A07(r0)
            java.util.Iterator r4 = r3.iterator()
        L_0x0102:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x021b
            java.lang.Object r0 = r4.next()
            X.Cuc r0 = (X.C45334Cuc) r0
            boolean r3 = r0.A02
            java.lang.String r1 = r0.A01
            android.view.View$OnClickListener r0 = r0.A00
            if (r3 == 0) goto L_0x011a
            r5.A0A(r1, r0)
            goto L_0x0102
        L_0x011a:
            r5.A0C(r1, r0)
            goto L_0x0102
        L_0x011e:
            r0 = 2131972084(0x7f134ff4, float:1.9581166E38)
            java.lang.String r6 = r10.getString(r0)
            goto L_0x007b
        L_0x0127:
            r0 = 2131968292(0x7f134124, float:1.9573474E38)
            java.lang.String r5 = r10.getString(r0)
            goto L_0x0040
        L_0x0130:
            com.instagram.user.model.User r0 = r9.A05
            boolean r0 = r0.A1n()
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0024
        L_0x013e:
            boolean r0 = X.DE2.A0F()
            if (r0 == 0) goto L_0x01d8
            boolean r0 = X.DE2.A0G()
            if (r0 == 0) goto L_0x01d8
            X.EZm r1 = X.C48144EZm.EDIT_PHOTO_REMINDER
            r0 = 3876(0xf24, float:5.431E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.FGS.A02(r1, r2, r0)
            java.lang.String r0 = "reminder_shown"
            X.FGS.A02(r1, r2, r0)
            X.Dg1 r5 = new X.Dg1
            r5.<init>(r10, r2)
            java.lang.String r1 = X.DE2.A0B()
            java.lang.String r0 = X.DE2.A0C()
            r5.A0D(r1, r0)
            com.google.common.collect.ImmutableList r0 = X.DE2.A00()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.3kO r1 = r0.iterator()
        L_0x0177:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x018b
            java.lang.Object r0 = r1.next()
            X.DYE r0 = (X.DYE) r0
            com.google.common.collect.ImmutableList r0 = r0.AY1()
            r7.addAll(r0)
            goto L_0x0177
        L_0x018b:
            boolean r1 = r7.isEmpty()
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x01a9
            java.lang.Object r1 = r7.get(r4)
            X.DYy r1 = (X.DYy) r1
            java.lang.String r1 = r1.Bh8()
            if (r1 == 0) goto L_0x01a9
            java.lang.Object r0 = r7.get(r4)
            X.DYy r0 = (X.DYy) r0
            java.lang.String r0 = r0.Bh8()
        L_0x01a9:
            android.net.Uri r1 = X.0cp.A03(r0)
            X.0qQ.A0B(r1, r4)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A00(r1, r0, r0)
            r5.A07(r0)
            java.util.Iterator r4 = r3.iterator()
        L_0x01bc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0222
            java.lang.Object r0 = r4.next()
            X.Cuc r0 = (X.C45334Cuc) r0
            boolean r3 = r0.A02
            java.lang.String r1 = r0.A01
            android.view.View$OnClickListener r0 = r0.A00
            if (r3 == 0) goto L_0x01d4
            r5.A0A(r1, r0)
            goto L_0x01bc
        L_0x01d4:
            r5.A0C(r1, r0)
            goto L_0x01bc
        L_0x01d8:
            X.EZm r1 = X.C48144EZm.CHANGE_PROFILE_PICTURE_FIRST_TIME
            java.lang.String r0 = "reminder_default_view_shown"
            X.FGS.A02(r1, r2, r0)
            X.Dg1 r5 = new X.Dg1
            r5.<init>(r10, r2)
            r0 = 2131954991(0x7f130d2f, float:1.9546497E38)
            r5.A01(r0)
            java.util.Iterator r4 = r3.iterator()
        L_0x01ee:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x020a
            java.lang.Object r0 = r4.next()
            X.Cuc r0 = (X.C45334Cuc) r0
            boolean r3 = r0.A02
            java.lang.String r1 = r0.A01
            android.view.View$OnClickListener r0 = r0.A00
            if (r3 == 0) goto L_0x0206
            r5.A0A(r1, r0)
            goto L_0x01ee
        L_0x0206:
            r5.A0C(r1, r0)
            goto L_0x01ee
        L_0x020a:
            r5.A03 = r6
            X.FFy r1 = new X.FFy
            r1.<init>(r5)
            androidx.fragment.app.Fragment r0 = r9.A01
            android.content.Context r0 = r0.requireContext()
            r1.A05(r0)
            goto L_0x022c
        L_0x021b:
            X.EZm r1 = X.C48144EZm.BIZ_EDIT_PHOTO_PASSIVE
            java.lang.String r0 = "reminder_shown"
            X.FGS.A01(r1, r2, r0)
        L_0x0222:
            r5.A03 = r6
            X.FFy r0 = new X.FFy
            r0.<init>(r5)
            r0.A05(r10)
        L_0x022c:
            com.instagram.user.model.User r0 = r9.A05
            X.4Cl r0 = r0.A03
            java.lang.String r0 = r0.getFbidV2()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            X.F9X.A00 = r0
            X.EBP r0 = new X.EBP
            r0.<init>()
            X.F9X.A01(r0, r2, r1)
            return
        L_0x0244:
            r0 = 981(0x3d5, float:1.375E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0250:
            r0 = 981(0x3d5, float:1.375E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x025c:
            r0 = 981(0x3d5, float:1.375E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36O.A05(android.content.Context):void");
    }

    public final void A06(Context context, Tab tab) {
        0qQ.A0B(tab, 1);
        UserSession userSession = this.A04;
        if (FG3.A04(userSession)) {
            0eE r1 = AnonymousClass0t1.A01;
            Boolean BBe = r1.A01(userSession).A03.BBe();
            if (BBe == null || !BBe.booleanValue()) {
                Boolean CY6 = r1.A01(userSession).A03.CY6();
                if (CY6 == null || !CY6.booleanValue()) {
                    Boolean CY4 = r1.A01(userSession).A03.CY4();
                    if (CY4 == null || !(!CY4.booleanValue())) {
                        FG3.A03(context, new C58696Iw5(37, context, tab, this));
                    } else {
                        FG3.A02(context);
                    }
                } else {
                    FG3.A01(context);
                }
            } else {
                FG3.A00(context);
            }
        } else if (FFU.A02(userSession)) {
            FFU.A00(context);
        } else if (FFU.A03(userSession)) {
            FFU.A01(context, new C58696Iw5(38, context, tab, this));
        } else {
            A07(context, tab);
        }
    }

    public final void A07(Context context, Tab tab) {
        0qQ.A0B(tab, 1);
        UserSession userSession = this.A04;
        C49061Eof.A00(userSession).A02(EWT.EDIT_PROFILE_PIC_FLOW, AnonymousClass05K.A0Y);
        C322316vd.A00(userSession).A06(C273654mx.A00(146));
        Fragment fragment = this.A01;
        Integer num = AnonymousClass05K.A00;
        C50464FcC fcC = new C50464FcC(this, tab);
        if (!DE2.A01 || !DE2.A0F()) {
            fcC.D5S();
        } else {
            C48928EmS.A00(context, new FIL(fragment, userSession, num), userSession, fcC, num);
        }
    }

    public final void A09(Tab tab) {
        0qQ.A0B(tab, 0);
        UserSession userSession = this.A04;
        02m.A0p.markerStart(18297178);
        C50335FYr A002 = C48927EmR.A00(userSession);
        UserSession userSession2 = A002.A01;
        if (182.A06(0Tu.A05, userSession2, 2342155969858897461L) && (!C50335FYr.A00(A002, true))) {
            CallerContext callerContext = C347337we.A00;
            C347347wf r5 = new C347347wf();
            2IS r4 = r5.A01.A00;
            r4.A02("ig_profile_photo_change", true);
            ArrayList arrayList = r5.A02;
            arrayList.add(AnonymousClass000.A00(4355));
            r4.A02("ig_profile_photo_completeness", true);
            arrayList.add("IG_PROFILE_PHOTO_CHANGE_IS_COMPLETENESS_UPSELL");
            0Tu r2 = 0Tu.A06;
            if (!182.A06(r2, userSession2, 36314450998856242L) && 182.A06(r2, userSession2, 36314450999052853L)) {
                r5.A00();
                if (!182.A06(r2, userSession2, 2342157460212615731L)) {
                    r4.A01(AnonymousClass000.A00(3337));
                }
                if (!182.A06(r2, userSession2, 2342157460212681268L)) {
                    r4.A01(AnonymousClass000.A00(3840));
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            boolean z = r5.A00;
            0qQ.A0B(strArr, 2);
            C347337we.A00(userSession2, new C46657Dic(A002), r5, strArr, z);
        }
        boolean A062 = C322606w6.A06(userSession);
        if (tab.equals(JXL.A01)) {
            A0C = "take_photo";
            AnonymousClass36V r42 = this.A07;
            AnonymousClass36W r3 = AnonymousClass36W.PROFILE_PHOTO;
            JWU jwu = new JWU(r3);
            jwu.A0A = false;
            jwu.A06 = !A062;
            r42.Exx(EXF.A0J, new MediaCaptureConfig(jwu), r3);
            return;
        }
        boolean equals = tab.equals(JXL.A00);
        A0C = "choose_from_library";
        AnonymousClass36V r43 = this.A07;
        if (equals) {
            AnonymousClass36W r32 = AnonymousClass36W.PROFILE_PHOTO;
            JWU jwu2 = new JWU(r32);
            jwu2.A0A = false;
            boolean z2 = !A062;
            jwu2.A09 = z2;
            jwu2.A05 = z2;
            jwu2.A0E = A062;
            r43.Exv(EXF.A0J, new MediaCaptureConfig(jwu2), r32);
            return;
        }
        AnonymousClass36W r22 = AnonymousClass36W.PROFILE_PHOTO;
        JWU jwu3 = new JWU(r22);
        jwu3.A0A = false;
        r43.Ewc(EXF.A0J, new MediaCaptureConfig(jwu3), r22);
    }

    public final void CJ6(Intent intent) {
        0qQ.A0B(intent, 0);
        Activity parent = this.A01.requireActivity().getParent();
        if (parent != null) {
            ((AnonymousClass2ZQ) parent).BPn().CJ6(intent);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* synthetic */ void Ctk(int i, int i2) {
    }

    public final /* synthetic */ void Ctl(int i, int i2) {
    }

    public final /* synthetic */ void Ewk(File file, int i) {
    }

    public final void ExB(Intent intent, int i) {
        0qQ.A0B(intent, 0);
        UserSession userSession = this.A04;
        2cc A002 = C71342cb.A00(userSession);
        Fragment fragment = this.A01;
        A002.A0A(fragment.getActivity(), "new_profile_photo");
        C59882Jb5.A01(userSession, this.A08);
        Context context = fragment.getContext();
        if (context != null && C250563lf.A0o(context, intent)) {
            0kR.A05(fragment, intent, i);
        }
    }

    public static final void A00(Uri uri, AnonymousClass36O r12, int i) {
        A0A = uri;
        0sP r10 = r12.A06;
        if (r10 != null) {
            r10.invoke(true);
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        Fragment fragment = r12.A01;
        Context context = fragment.getContext();
        if (context != null) {
            UserSession userSession = r12.A04;
            C49061Eof.A00(userSession).A00(EWT.EDIT_PROFILE_PIC_FLOW, AnonymousClass05K.A1F);
            C290815g0 A012 = C49736F4b.A01(context, uri, userSession, valueOf, i);
            A012.A00 = new EHP(new EDH(fragment, r12.A02, r12.A03, userSession, r12.A05, r10), new 1Fc(), userSession, valueOf);
            1ES.A03(A012);
            return;
        }
        throw new IllegalStateException("cannot operate with null context");
    }

    public final void A01() {
        UserSession userSession = this.A04;
        C50326FYg A002 = C48926EmQ.A00(userSession);
        UserSession userSession2 = A002.A01;
        if (!182.A06(0Tu.A06, userSession2, 36314519718333084L) && 182.A06(0Tu.A05, userSession2, 36314519718398621L)) {
            CallerContext callerContext = C347337we.A00;
            C347347wf r3 = new C347347wf();
            r3.A01.A00.A02("ig_import_from_fb", true);
            ArrayList arrayList = r3.A02;
            arrayList.add(AnonymousClass000.A00(2306));
            r3.A00();
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            boolean z = r3.A00;
            0qQ.A0B(strArr, 2);
            C347337we.A00(userSession2, new C50460Fc8(A002), r3, strArr, z);
        }
        A0C = "import_from_facebook";
        AnonymousClass36X r5 = A0B;
        00y.A0n(10, userSession.A06);
        C46653DiY.A00(r5, userSession, AnonymousClass000.A00(748), "photo_editing", A0C, (String) null, (Map) null);
        2Ly A003 = 2Lv.A00(userSession);
        CallerContext callerContext2 = A0I;
        String A004 = C273654mx.A00(527);
        if (!A003.A00(callerContext2, A004)) {
            FFL.A00(C48152EZu.A05, userSession, C273654mx.A00(3464));
        }
        if (C48926EmQ.A00(userSession).A00()) {
            AnonymousClass36Q.A02(this.A01, this.A02);
        }
        EXN exn = EXN.PROFILE_PIC;
        if (2Lv.A00(userSession).A00(callerContext2, A004)) {
            A00((Uri) null, this, 0);
            return;
        }
        C48920EmK.A00().A01(this.A01, userSession, new C51128Fp0(this)).A06(exn.A01(), (List) null);
    }

    public final void A02() {
        if (this.A00) {
            this.A00 = false;
            AnonymousClass36Q.A02(this.A01, this.A02);
        }
        if (A0G) {
            A0H.post(new C51159FpV(this));
        }
    }

    public final void A03(Context context) {
        UserSession userSession = this.A04;
        if (FG3.A04(userSession)) {
            0eE r1 = AnonymousClass0t1.A01;
            Boolean BBe = r1.A01(userSession).A03.BBe();
            if (BBe == null || !BBe.booleanValue()) {
                Boolean CY6 = r1.A01(userSession).A03.CY6();
                if (CY6 == null || !CY6.booleanValue()) {
                    Boolean CY4 = r1.A01(userSession).A03.CY4();
                    if (CY4 == null || !(!CY4.booleanValue())) {
                        FG3.A03(context, new C51801G2k(this, 23));
                    } else {
                        FG3.A02(context);
                    }
                } else {
                    FG3.A01(context);
                }
            } else {
                FG3.A00(context);
            }
        } else if (FFU.A02(userSession)) {
            FFU.A00(context);
        } else if (FFU.A03(userSession)) {
            FFU.A01(context, new C51801G2k(this, 24));
        } else {
            A01();
        }
    }

    public final void A04(Context context) {
        C250663lr optionalTreeField;
        A0C = AnonymousClass000.A00(3879);
        UserSession userSession = this.A04;
        AnonymousClass36X r9 = A0B;
        00y.A0n(10, userSession.A06);
        C46653DiY.A00(r9, userSession, AnonymousClass000.A00(748), "photo_editing", A0C, (String) null, (Map) null);
        C50462FcA fcA = new C50462FcA(this);
        C43751C7v A002 = F9X.A00();
        Context context2 = context;
        if (A002 != null) {
            Class<BpP> cls = BpP.class;
            String A003 = AnonymousClass000.A00(2989);
            if (A002.getOptionalTreeField(3, A003, cls, -1883645928) != null) {
                C43751C7v A004 = F9X.A00();
                if (!(A004 == null || (optionalTreeField = A004.getOptionalTreeField(3, A003, cls, -1883645928)) == null || optionalTreeField.A09("header") == null || optionalTreeField.A08("confirm_cta") == null || optionalTreeField.A07("cancel_cta") == null || optionalTreeField.getOptionalStringField(3, "subtext") == null)) {
                    C48144EZm eZm = C48144EZm.BIZ_REMOVE_PHOTO;
                    String A092 = optionalTreeField.A09("header");
                    String optionalStringField = optionalTreeField.getOptionalStringField(3, "subtext");
                    String A082 = optionalTreeField.A08("confirm_cta");
                    String A072 = optionalTreeField.A07("cancel_cta");
                    C358248ab r1 = new C358248ab(context2);
                    r1.A05 = A092;
                    r1.A0q(optionalStringField);
                    r1.A0d(new FIK(eZm, userSession, fcA), A082);
                    r1.A0b(new FI6(eZm, userSession), A072);
                    Dialog A022 = r1.A02();
                    FGS.A01(eZm, userSession, "reminder_shown");
                    AnonymousClass0fN.A00(A022);
                    return;
                }
                fcA.D5S();
            }
        }
        Fragment fragment = this.A01;
        Integer num = AnonymousClass05K.A0N;
        if (DE2.A0F()) {
            C48928EmS.A00(context2, new FIL(fragment, userSession, num), userSession, fcA, num);
            return;
        }
        fcA.D5S();
    }

    public final void A08(Intent intent, int i, int i2, boolean z) {
        C250663lr optionalTreeField;
        Bundle extras;
        LoginClient$Result loginClient$Result;
        if (!z && i2 != 0) {
            Fragment fragment = this.A01;
            0mb.A01(new 0mZ(), new File(fragment.requireContext().getFilesDir(), "avatar_temp/").getAbsolutePath(), (Set) null);
            if (i2 == -1) {
                CallerContext callerContext = 1KM.A00;
                if (i == 64206) {
                    UserSession userSession = this.A04;
                    String str = null;
                    boolean z2 = false;
                    if (!(intent == null || (extras = intent.getExtras()) == null)) {
                        Object obj = extras.get(AnonymousClass000.A00(554));
                        if ((obj instanceof LoginClient$Result) && (loginClient$Result = (LoginClient$Result) obj) != null) {
                            LoginClient$Request loginClient$Request = loginClient$Result.A01;
                            str = loginClient$Request.A01;
                            z2 = loginClient$Request.A02;
                        }
                    }
                    C49822F8k.A00();
                    HashMap hashMap = new HashMap();
                    hashMap.put(AnonymousClass000.A00(601), String.valueOf(AnonymousClass1G3.A03()));
                    hashMap.put("exception", (Object) null);
                    C9831Rht.A00(userSession, AnonymousClass000.A00(1336), str, hashMap, z2);
                    return;
                } else if (!(i != 10001 || intent == null || intent.getAction() == null)) {
                    String action = intent.getAction();
                    Context context = fragment.getContext();
                    UserSession userSession2 = this.A04;
                    C50465FcD fcD = new C50465FcD(this, action);
                    C43751C7v A002 = F9X.A00();
                    if (A002 == null || (optionalTreeField = A002.getOptionalTreeField(2, AnonymousClass000.A00(3744), BpQ.class, 450216751)) == null || optionalTreeField.getOptionalStringField(2, "header") == null || optionalTreeField.A08("confirm_cta") == null || optionalTreeField.A07("cancel_cta") == null || optionalTreeField.A0A("subtext") == null) {
                        fcD.D5S();
                        return;
                    }
                    C48144EZm eZm = C48144EZm.BIZ_EDIT_PHOTO;
                    String optionalStringField = optionalTreeField.getOptionalStringField(2, "header");
                    String A0A2 = optionalTreeField.A0A("subtext");
                    String A082 = optionalTreeField.A08("confirm_cta");
                    String A072 = optionalTreeField.A07("cancel_cta");
                    if (context != null) {
                        C358248ab r3 = new C358248ab(context);
                        r3.A05 = optionalStringField;
                        r3.A0q(A0A2);
                        r3.A0Y(new FIK(eZm, userSession2, fcD), C358278ae.BLUE_BOLD, A082, true);
                        r3.A0b(new FI6(eZm, userSession2), A072);
                        Dialog A022 = r3.A02();
                        FGS.A01(eZm, userSession2, "reminder_shown");
                        AnonymousClass0fN.A00(A022);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        AnonymousClass36Q.A00();
    }
}
