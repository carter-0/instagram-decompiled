package X;

import android.app.Activity;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView;

/* renamed from: X.8ph  reason: invalid class name and case insensitive filesystem */
public final class C366798ph {
    public C351988Bf A00;
    public C366848pm A01;
    public EphemeralMediaToggleView A02;
    public final Context A03;
    public final ImmutableList A04;
    public final UserSession A05;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x016d, code lost:
        if (r1 != 0) goto L_0x016f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C366798ph(android.content.Context r15, com.google.common.collect.ImmutableList r16, com.instagram.common.session.UserSession r17, X.C351988Bf r18, com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView r19) {
        /*
            r14 = this;
            r0 = 5
            r1 = r18
            X.0qQ.A0B(r1, r0)
            r14.<init>()
            r14.A03 = r15
            r0 = r17
            r14.A05 = r0
            r0 = r19
            r14.A02 = r0
            r2 = r16
            r14.A04 = r2
            r14.A00 = r1
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.content.Context r0 = r14.A03
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.height = r0
            com.google.common.collect.ImmutableList$Builder r10 = com.google.common.collect.ImmutableList.builder()
            com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView r0 = r14.A02
            android.content.Context r1 = r0.getContext()
            X.0qQ.A07(r1)
            r5 = 2130970272(0x7f0406a0, float:1.754925E38)
            X.2Yu.A0H(r1, r5)
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            java.lang.String r13 = "null cannot be cast to non-null type android.graphics.drawable.Drawable"
            r3 = 2131237747(0x7f081b73, float:1.8091753E38)
            X.8pi r12 = new X.8pi
            r12.<init>(r1)
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.Resources$Theme r0 = r1.getTheme()
            android.graphics.drawable.Drawable r3 = r2.getDrawable(r3, r0)
            android.graphics.drawable.Drawable$Callback r0 = r12.A02
            r3.setCallback(r0)
            android.graphics.drawable.Drawable$ConstantState r2 = r3.getConstantState()
            X.8pl r0 = new X.8pl
            r0.<init>(r2)
            r12.A00 = r0
            r12.A00 = r3
            X.0qQ.A0C(r12, r13)
            X.2Yu.A0H(r1, r5)
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            com.google.common.collect.ImmutableList r3 = r14.A04
            X.8Bf r0 = X.C351988Bf.ONE_VIEW
            boolean r0 = r3.contains(r0)
            r4 = 2131237746(0x7f081b72, float:1.8091751E38)
            if (r0 != 0) goto L_0x0081
            r4 = 2131237745(0x7f081b71, float:1.809175E38)
        L_0x0081:
            X.8pi r11 = new X.8pi
            r11.<init>(r1)
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.Resources$Theme r0 = r1.getTheme()
            android.graphics.drawable.Drawable r4 = r2.getDrawable(r4, r0)
            android.graphics.drawable.Drawable$Callback r0 = r11.A02
            r4.setCallback(r0)
            android.graphics.drawable.Drawable$ConstantState r2 = r4.getConstantState()
            X.8pl r0 = new X.8pl
            r0.<init>(r2)
            r11.A00 = r0
            r11.A00 = r4
            X.0qQ.A0C(r11, r13)
            int r4 = X.2Yu.A0H(r1, r5)
            r2 = 2131231762(0x7f080412, float:1.8079614E38)
            r0 = 255(0xff, float:3.57E-43)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2)
            if (r2 == 0) goto L_0x018c
            r2.setAlpha(r0)
            int r0 = r1.getColor(r4)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
            int r8 = X.2Yu.A0H(r1, r5)
            r4 = 2131231759(0x7f08040f, float:1.8079608E38)
            r0 = 128(0x80, float:1.794E-43)
            android.graphics.drawable.Drawable r9 = r1.getDrawable(r4)
            if (r9 == 0) goto L_0x0184
            r9.setAlpha(r0)
            int r0 = r1.getColor(r8)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r9.setColorFilter(r0)
            X.2Yu.A0H(r1, r5)
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            X.8Bf r0 = X.C351988Bf.KEEP_IN_CHAT
            boolean r0 = r3.contains(r0)
            r4 = 2131237744(0x7f081b70, float:1.8091747E38)
            if (r0 != 0) goto L_0x00f4
            r4 = 2131237748(0x7f081b74, float:1.8091755E38)
        L_0x00f4:
            X.8pi r8 = new X.8pi
            r8.<init>(r1)
            android.content.res.Resources r3 = r1.getResources()
            android.content.res.Resources$Theme r0 = r1.getTheme()
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4, r0)
            android.graphics.drawable.Drawable$Callback r0 = r8.A02
            r4.setCallback(r0)
            android.graphics.drawable.Drawable$ConstantState r3 = r4.getConstantState()
            X.8pl r0 = new X.8pl
            r0.<init>(r3)
            r8.A00 = r0
            r8.A00 = r4
            X.0qQ.A0C(r8, r13)
            r0 = 2131971401(0x7f134d49, float:1.957978E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            r4 = 1
            X.9J1 r3 = new X.9J1
            r3.<init>((android.graphics.drawable.Drawable) r12, (android.graphics.drawable.Drawable) r2, (java.lang.Integer) r6, (java.lang.String) r0)
            r0 = 2131971399(0x7f134d47, float:1.9579776E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            X.9J1 r2 = new X.9J1
            r2.<init>((android.graphics.drawable.Drawable) r11, (android.graphics.drawable.Drawable) r9, (java.lang.Integer) r7, (java.lang.String) r0)
            r0 = 2131971404(0x7f134d4c, float:1.9579786E38)
            java.lang.String r1 = r1.getString(r0)
            X.0qQ.A07(r1)
            X.9J1 r0 = new X.9J1
            r0.<init>((android.graphics.drawable.Drawable) r8, (android.graphics.drawable.Drawable) r9, (java.lang.Integer) r5, (java.lang.String) r1)
            r10.add(r3)
            r10.add(r2)
            r10.add(r0)
            com.google.common.collect.ImmutableList r0 = r10.build()
            X.0qQ.A07(r0)
            com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView r3 = r14.A02
            X.8pm r2 = new X.8pm
            r2.<init>(r3, r0)
            r14.A01 = r2
            X.8Bf r0 = r14.A00
            int r1 = r0.ordinal()
            if (r1 == r4) goto L_0x017d
            r0 = 2
            if (r1 == r0) goto L_0x017f
            r0 = 0
            if (r1 == r0) goto L_0x0180
        L_0x016f:
            X.8Bf r0 = r14.A00
            r14.A00(r0)
            X.8pn r0 = new X.8pn
            r0.<init>(r14)
            X.AnonymousClass0fU.A00(r0, r3)
            return
        L_0x017d:
            r5 = r7
            goto L_0x0180
        L_0x017f:
            r5 = r6
        L_0x0180:
            r2.A00(r5)
            goto L_0x016f
        L_0x0184:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x018c:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366798ph.<init>(android.content.Context, com.google.common.collect.ImmutableList, com.instagram.common.session.UserSession, X.8Bf, com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView):void");
    }

    private final void A00(C351988Bf r12) {
        Activity activity;
        if (0sr.A1P(new String[]{"once", "replayable"}).contains(r12.A00)) {
            Context context = this.A03;
            if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                UserSession userSession = this.A05;
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36327464749971918L)) {
                    OIx oIx = OT1.A01;
                    if (oIx.A00(userSession).A00.getBoolean("KEY_SHOULD_SHOW_SCREENSHOT_BLOCKING_NUX", true)) {
                        C331157Pu A002 = new C331127Pr(userSession).A00();
                        String A042 = 182.A04(r2, userSession, 36890414703444850L);
                        H1X h1x = new H1X();
                        h1x.A01 = new C73913Plo(A002, 12);
                        C73673Phm phm = null;
                        if (00p.A0k(A042, "http", false)) {
                            phm = new C73673Phm(activity, h1x, A042, 12);
                        }
                        h1x.A00 = phm;
                        A002.A02(activity, h1x);
                        0xY AR4 = oIx.A00(userSession).A00.AR4();
                        AR4.E5T("KEY_SHOULD_SHOW_SCREENSHOT_BLOCKING_NUX", false);
                        AR4.apply();
                        0wc A012 = AnonymousClass0kN.A01(new 0xG("ig_nux_impression"), userSession);
                        0Aj A003 = A012.A00(A012.A00, "ig_nux_impression");
                        if (A003.isSampled()) {
                            A003.AAJ("identifier", "direct-view-once-screenshot-prevention-nux-key");
                            A003.Cgf();
                        }
                    }
                }
            }
        }
    }

    public static final boolean A01(C351988Bf r2, C366798ph r3, Integer num) {
        ImmutableList immutableList = r3.A04;
        if (!immutableList.contains(r2)) {
            return false;
        }
        C366848pm r0 = r3.A01;
        if (r0 == null) {
            0qQ.A0F("ephemeralMediaTogglePresenter");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A00(num);
        if (immutableList.contains(r2) && r3.A00 != r2) {
            r3.A00 = r2;
        }
        r3.A00(r2);
        return true;
    }
}
