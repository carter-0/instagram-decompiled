package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;

/* renamed from: X.34v  reason: invalid class name and case insensitive filesystem */
public final class C2367234v {
    public int A00;
    public View A01;
    public boolean A02;
    public final Activity A03;
    public final Context A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C2366734q A07;
    public final C2365134a A08;
    public final boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0089, code lost:
        if ((!r22.isEmpty()) == false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.view.View r20, X.C2367234v r21, java.util.List r22, long r23, boolean r25, boolean r26) {
        /*
            r15 = r20
            android.view.ViewParent r0 = r15.getParent()
            if (r0 == 0) goto L_0x00cd
            r9 = r21
            r21 = r25
            if (r25 != 0) goto L_0x002a
            com.instagram.common.session.UserSession r0 = r9.A06
            X.1Av r0 = X.1Au.A00(r0)
            X.0xa r0 = r0.A01
            X.0xY r3 = r0.AR4()
            long r1 = java.lang.System.currentTimeMillis()
            r0 = 3205(0xc85, float:4.491E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.E5c(r0, r1)
            r3.apply()
        L_0x002a:
            android.view.ViewParent r8 = r15.getParent()
            r0 = 25
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r8, r0)
            com.instagram.common.ui.base.IgFrameLayout r8 = (com.instagram.common.ui.base.IgFrameLayout) r8
            android.content.Context r14 = r9.A04
            com.instagram.common.session.UserSession r2 = r9.A06
            X.0iw r13 = r9.A05
            r12 = 2
            X.0qQ.A0B(r8, r12)
            r11 = 0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r14)
            if (r25 == 0) goto L_0x00d7
            r0 = 2131628807(0x7f0e1307, float:1.8884917E38)
            android.view.View r7 = r1.inflate(r0, r8, r11)
        L_0x0051:
            r0 = 2131443595(0x7f0b3f8b, float:1.8509263E38)
            android.view.View r1 = r7.findViewById(r0)
            X.0qQ.A07(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131954711(0x7f130c17, float:1.9545929E38)
            java.lang.String r0 = r14.getString(r0)
            r1.setText(r0)
            int r0 = android.view.View.generateViewId()
            r9.A00 = r0
            r7.setId(r0)
            boolean r4 = r9.A09
            r2 = 1
            if (r4 != 0) goto L_0x0090
            r8.addView(r7)
            X.34q r5 = r9.A07
            X.34a r0 = r9.A08
            X.2pH r0 = r0.A03
            java.lang.String r3 = r0.A04
            if (r25 != 0) goto L_0x008b
            boolean r0 = r22.isEmpty()
            r0 = r0 ^ 1
            r1 = 1
            if (r0 != 0) goto L_0x008c
        L_0x008b:
            r1 = 0
        L_0x008c:
            r0 = 0
            r5.A02(r0, r3, r1)
        L_0x0090:
            r9.A02 = r2
            android.content.res.Resources r1 = r14.getResources()
            if (r4 == 0) goto L_0x00ce
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
        L_0x009b:
            float r5 = r1.getDimension(r0)
            X.5nL r0 = X.C294975nL.A01(r15, r11)
            r0.A0G()
            X.5nL r4 = r0.A0F(r2)
            r2 = 4616189618054758400(0x4010000000000000, double:4.0)
            r0 = 4624633867356078080(0x402e000000000000, double:15.0)
            X.2co r0 = X.C71392co.A03(r2, r0)
            X.5nL r0 = r4.A0E(r0)
            r0.A0J(r5)
            X.Flv r13 = new X.Flv
            r18 = r23
            r20 = r26
            r16 = r8
            r17 = r9
            r14 = r15
            r15 = r7
            r13.<init>(r14, r15, r16, r17, r18, r20, r21)
            r0.A05 = r13
            r0.A0H()
        L_0x00cd:
            return
        L_0x00ce:
            r0 = 2131165229(0x7f07002d, float:1.794467E38)
            if (r25 == 0) goto L_0x009b
            r0 = 2131165282(0x7f070062, float:1.7944777E38)
            goto L_0x009b
        L_0x00d7:
            r0 = 2131625938(0x7f0e07d2, float:1.8879098E38)
            android.view.View r7 = r1.inflate(r0, r8, r11)
            r0 = 2131433710(0x7f0b18ee, float:1.8489213E38)
            android.view.View r10 = r7.findViewById(r0)
            X.0qQ.A07(r10)
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r10 = (com.instagram.igds.components.faceswarm.IgdsFaceSwarm) r10
            X.0qQ.A0B(r10, r11)
            r6 = 1
            r5 = 3
            java.util.List r17 = X.FFN.A02(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r16 = r17.iterator()
        L_0x00fc:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x011f
            java.lang.Object r0 = r16.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r3 = 0
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bh3()
            java.lang.String r0 = r13.getModuleName()
            X.3ay r2 = X.FFN.A01(r14, r1, r0)
            r1 = 5
            X.9Iz r0 = new X.9Iz
            r0.<init>((android.graphics.drawable.Drawable) r2, (com.instagram.common.typedurl.ImageUrl) r3, (java.lang.String) r3, (int) r1)
            r4.add(r0)
            goto L_0x00fc
        L_0x011f:
            int r0 = r4.size()
            if (r0 >= r12) goto L_0x013a
            r3 = 0
            android.content.Context r1 = r10.getContext()
            r0 = 2131239746(0x7f082342, float:1.8095808E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            r1 = 5
            X.9Iz r0 = new X.9Iz
            r0.<init>((android.graphics.drawable.Drawable) r2, (com.instagram.common.typedurl.ImageUrl) r3, (java.lang.String) r3, (int) r1)
            r4.add(r0)
        L_0x013a:
            int r0 = r4.size()
            if (r0 != r6) goto L_0x0176
            r2 = 74
            android.content.Context r0 = r10.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165264(0x7f070050, float:1.794474E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r10.setPadding(r0, r0, r0, r0)
        L_0x0154:
            r10.setBackgroundCircleColor(r11)
            r10.setCustomSizeDp(r2)
            r10.A08 = r11
            int r0 = r17.size()
            if (r0 > r12) goto L_0x016b
            r1 = -85
        L_0x0164:
            r10.A04 = r1
            r10.setFaceSwarmItems(r4, r13)
            goto L_0x0051
        L_0x016b:
            int r0 = r17.size()
            r1 = -55
            if (r0 != r5) goto L_0x0164
            r1 = -75
            goto L_0x0164
        L_0x0176:
            r2 = 90
            android.content.Context r0 = r10.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r10.setPadding(r11, r0, r11, r0)
            goto L_0x0154
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2367234v.A00(android.view.View, X.34v, java.util.List, long, boolean, boolean):void");
    }

    public static final void A01(C2367234v r8, boolean z) {
        View view;
        View view2 = r8.A01;
        if (view2 != null && z) {
            UserSession userSession = r8.A06;
            if (!1Au.A00(userSession).A01.getBoolean("has_seen_group_stories_tray_tooltip", false)) {
                ViewParent parent = view2.getParent();
                if ((parent instanceof View) && (view = (View) parent) != null) {
                    Activity activity = r8.A03;
                    String string = view.getContext().getString(2131954687);
                    0qQ.A07(string);
                    AnonymousClass5Gt r2 = new AnonymousClass5Gt(activity, new C315476jx((CharSequence) string));
                    r2.A04(view, (-view.getWidth()) / 2, 0, true);
                    r2.A06(C226262fy.RIGHT_ANCHOR);
                    r2.A0A = true;
                    r2.A00().A07(userSession);
                    0xY AR4 = 1Au.A00(userSession).A01.AR4();
                    AR4.E5T("has_seen_group_stories_tray_tooltip", true);
                    AR4.apply();
                }
            }
        }
    }

    public C2367234v(Activity activity, Context context, AnonymousClass0iw r6, UserSession userSession, C2365134a r8) {
        this.A06 = userSession;
        this.A04 = context;
        this.A03 = activity;
        this.A08 = r8;
        this.A05 = r6;
        this.A07 = new C2366734q(r6, userSession);
        this.A09 = 182.A06(0Tu.A05, userSession, 36320313631645948L);
    }
}
