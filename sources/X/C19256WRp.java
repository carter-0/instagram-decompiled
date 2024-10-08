package X;

import android.app.Activity;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.WRp  reason: case insensitive filesystem */
public final class C19256WRp implements 1DN {
    public ViewGroup A00;
    public C17766Vfd A01;
    public C339797kB A02;
    public C18500Vsv A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Activity A09;
    public final ViewGroup A0A;
    public final C39749A7p A0B;
    public final WT1 A0C;
    public final UserSession A0D;
    public final String A0E;
    public final String A0F;
    public final ArrayList A0G = new ArrayList();
    public final HashMap A0H = new HashMap();

    /* JADX WARNING: type inference failed for: r0v21, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DWm(java.util.Map r14) {
        /*
            r13 = this;
            r2 = 0
            r12 = r14
            X.0qQ.A0B(r14, r2)
            r0 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r0)
            if (r0 == 0) goto L_0x0016
            r0 = 643(0x283, float:9.01E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0lq.A04(r0, r2)
        L_0x0016:
            r13.A08 = r2
            java.util.HashMap r8 = r13.A0H
            r8.putAll(r14)
            boolean r0 = r13.A07
            if (r0 == 0) goto L_0x00c3
            r13.A05 = r2
            java.lang.String r7 = "android.permission.CAMERA"
            java.lang.String r6 = "android.permission.RECORD_AUDIO"
            java.lang.String[] r11 = new java.lang.String[]{r7, r6}
            r5 = 2
            r4 = 1
            r3 = 0
            r10 = 1
        L_0x002f:
            r9 = r11[r3]
            X.7vz r2 = X.C346927vz.GRANTED
            java.lang.Object r0 = r8.get(r9)
            if (r2 == r0) goto L_0x003a
            r10 = 0
        L_0x003a:
            X.7vz r1 = X.C346927vz.DENIED_DONT_ASK_AGAIN
            java.lang.Object r0 = r8.get(r9)
            if (r1 != r0) goto L_0x0044
            r13.A05 = r4
        L_0x0044:
            java.util.ArrayList r0 = r13.A0G
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r8.get(r9)
            boolean r2 = X.AnonymousClass7TF.A1W(r2, r0)
            boolean r0 = X.0qQ.A0K(r9, r7)
            if (r0 == 0) goto L_0x013e
            X.WT1 r1 = r13.A0C
            if (r2 == 0) goto L_0x013a
            X.Uy8 r0 = X.C16612Uy8.CAMERA_PERMISSION_GRANTED
        L_0x0060:
            X.WT1.A00(r0, r1)
        L_0x0063:
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x002f
            if (r10 == 0) goto L_0x00c4
            X.7kB r0 = r13.A02
            if (r0 == 0) goto L_0x0070
            r0.A00()
        L_0x0070:
            r2 = 0
            r13.A02 = r2
            X.Vsv r0 = r13.A03
            if (r0 == 0) goto L_0x007e
            android.view.ViewGroup r1 = r0.A03
            android.view.ViewGroup r0 = r0.A04
            r1.removeView(r0)
        L_0x007e:
            r13.A03 = r2
            r13.A00()
            X.Vfd r0 = r13.A01
            if (r0 == 0) goto L_0x008a
            r0.A00()
        L_0x008a:
            X.4O9 r0 = X.AnonymousClass4O9.CAMERA
            X.4OA r3 = X.AnonymousClass4OA.UNSPECIFIED
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r0, r3)
            X.4O9 r1 = X.AnonymousClass4O9.MICROPHONE
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r3)
            android.util.Pair[] r0 = new android.util.Pair[]{r2, r0}
            java.util.List r10 = X.0sr.A1P(r0)
            com.instagram.common.session.UserSession r2 = r13.A0D
            r0 = 882(0x372, float:1.236E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.0xG r0 = new X.0xG
            r0.<init>(r1)
            X.4O6 r7 = new X.4O6
            r7.<init>(r0, r2)
            java.lang.Long r8 = X.AnonymousClass4O7.A00(r2)
            X.4O8 r0 = X.AnonymousClass4O8.UNKNOWN
            java.util.List r11 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r9 = "CAMERA_INITIALIZATION_CONTROLLER"
            r7.A01(r8, r9, r10, r11, r12)
        L_0x00c3:
            return
        L_0x00c4:
            X.7kB r3 = r13.A02
            if (r3 != 0) goto L_0x011e
            android.view.ViewGroup r1 = r13.A00
            if (r1 != 0) goto L_0x00dd
            android.view.ViewGroup r1 = r13.A0A
            r0 = 2131429450(0x7f0b084a, float:1.8480573E38)
            android.view.View r0 = r1.requireViewById(r0)
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r13.A00 = r1
            X.0qQ.A07(r0)
        L_0x00dd:
            r0 = 2131628171(0x7f0e108b, float:1.8883627E38)
            X.7kB r3 = new X.7kB
            r3.<init>(r1, r0)
            android.view.ViewGroup r0 = r13.A0A
            android.content.Context r2 = r0.getContext()
            java.lang.String r1 = X.2Yu.A0K(r2)
            X.0qQ.A07(r1)
            r3.A06(r14)
            r0 = 2131954560(0x7f130b80, float:1.9545623E38)
            java.lang.String r0 = X.DbW.A0h(r2, r1, r0)
            r3.A05(r0)
            r0 = 2131954559(0x7f130b7f, float:1.954562E38)
            java.lang.String r0 = X.DbW.A0h(r2, r1, r0)
            r3.A04(r0)
            r0 = 2131954558(0x7f130b7e, float:1.9545619E38)
            r3.A02(r0)
            r1 = 38
            X.WAz r0 = new X.WAz
            r0.<init>(r13, r1)
            r3.A03(r0)
            r3.A01()
            r13.A02 = r3
        L_0x011e:
            r3.A06(r14)
            X.Vfd r0 = r13.A01
            if (r0 == 0) goto L_0x008a
            X.UYH r0 = r0.A00
            X.Vu7 r0 = r0.A02
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = "ar3dToggleController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0135:
            r0.A01()
            goto L_0x008a
        L_0x013a:
            X.Uy8 r0 = X.C16612Uy8.CAMERA_PERMISSION_DENIED
            goto L_0x0060
        L_0x013e:
            boolean r0 = X.0qQ.A0K(r9, r6)
            if (r0 == 0) goto L_0x0063
            X.WT1 r1 = r13.A0C
            if (r2 == 0) goto L_0x014c
            X.Uy8 r0 = X.C16612Uy8.MICROPHONE_PERMISSION_GRANTED
            goto L_0x0060
        L_0x014c:
            X.Uy8 r0 = X.C16612Uy8.MICROPHONE_PERMISSION_DENIED
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19256WRp.DWm(java.util.Map):void");
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r9 = this;
            boolean r0 = r9.A06
            if (r0 != 0) goto L_0x005a
            r0 = 1
            r9.A06 = r0
            X.A7p r8 = r9.A0B
            java.lang.String r7 = r9.A0E
            java.lang.String r6 = r9.A0F
            X.VM0 r0 = r8.A05
            X.Uag r0 = r0.A00
            X.WT1 r1 = r0.A02()
            X.Uy8 r0 = X.C16612Uy8.EFFECT_FETCH_STARTED
            X.WT1.A00(r0, r1)
            X.AH4 r5 = r8.A03
            X.A9C r0 = r8.A06
            android.content.Context r4 = r0.A03
            com.instagram.common.session.UserSession r3 = r0.A06
            X.WNg r2 = new X.WNg
            r2.<init>(r0)
            X.12T r0 = X.AnonymousClass12T.A00
            X.LFK r1 = new X.LFK
            r1.<init>(r4, r2, r0, r3)
            X.ART r0 = new X.ART
            r0.<init>(r8)
            r5.A03 = r0
            r1.A01(r7, r6)
            X.ARQ r0 = r5.A0D
            r1.A00(r0)
            r5.A02()
            android.view.ViewGroup r1 = r9.A00
            if (r1 != 0) goto L_0x0055
            android.view.ViewGroup r1 = r9.A0A
            r0 = 2131429450(0x7f0b084a, float:1.8480573E38)
            android.view.View r0 = r1.requireViewById(r0)
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r9.A00 = r1
            X.0qQ.A07(r0)
        L_0x0055:
            r0 = 8
            r1.setVisibility(r0)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19256WRp.A00():void");
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C19256WRp r14, boolean r15) {
        /*
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x002a
            if (r15 == 0) goto L_0x015c
            X.Vsv r3 = r14.A03
            if (r3 == 0) goto L_0x015c
            java.util.Map r0 = r3.A05
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r0)
        L_0x0010:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015c
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.C18500Vsv.A00(r0, r3, r1)
            goto L_0x0010
        L_0x002a:
            r9 = 1
            r14.A08 = r9
            X.WT1 r3 = r14.A0C
            X.Uy8 r1 = X.C16612Uy8.PERMISSIONS_REQUESTED
            r8 = 0
            r2 = 0
            java.lang.String r0 = ""
            r3.A02(r1, r0, r8)
            android.view.ViewGroup r0 = r14.A00
            if (r0 == 0) goto L_0x003f
            r0.setVisibility(r2)
        L_0x003f:
            r0 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r0)
            if (r0 == 0) goto L_0x0050
            r0 = 643(0x283, float:9.01E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0lq.A03(r0, r2)
        L_0x0050:
            com.instagram.common.session.UserSession r3 = r14.A0D
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313849703434505(0x81034100000909, double:3.0283630043634154E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x016d
            X.Vsv r7 = r14.A03
            if (r7 != 0) goto L_0x0081
            android.app.Activity r2 = r14.A09
            android.view.ViewGroup r0 = r14.A00
            if (r0 != 0) goto L_0x007a
            android.view.ViewGroup r1 = r14.A0A
            r0 = 2131429450(0x7f0b084a, float:1.8480573E38)
            android.view.View r1 = r1.requireViewById(r0)
            r0 = r1
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r14.A00 = r0
            X.0qQ.A07(r1)
        L_0x007a:
            X.Vsv r7 = new X.Vsv
            r7.<init>(r2, r0)
            r14.A03 = r7
        L_0x0081:
            android.app.Activity r5 = r14.A09
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r11 = "android.permission.CAMERA"
            java.lang.String r10 = "android.permission.RECORD_AUDIO"
            java.lang.String[] r13 = new java.lang.String[]{r11, r10}
            r6 = 2
            r4 = 0
        L_0x0092:
            r3 = r13[r4]
            X.0qQ.A0B(r3, r9)
            boolean r1 = r3.equals(r11)
            if (r1 == 0) goto L_0x014c
            r0 = 2131969360(0x7f134550, float:1.957564E38)
        L_0x00a0:
            java.lang.String r12 = X.AnonymousClass7TE.A16(r5, r0)
            if (r1 == 0) goto L_0x0141
            r0 = 2131969361(0x7f134551, float:1.9575643E38)
        L_0x00a9:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r5, r0)
            X.VW8 r0 = new X.VW8
            r0.<init>(r3, r12, r1)
            r2.add(r0)
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x0092
            r0 = 2131969365(0x7f134555, float:1.957565E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r5, r0)
            r0 = 2131969364(0x7f134554, float:1.9575649E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r5, r0)
            android.view.ViewGroup r6 = r7.A03
            android.view.ViewGroup r5 = r7.A04
            r6.removeView(r5)
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r5, r0)
            r0.setText(r3)
            r0 = 2131436153(0x7f0b2279, float:1.8494168E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r5, r0)
            r0.setText(r1)
            r0 = 2131443515(0x7f0b3f3b, float:1.85091E38)
            android.view.ViewGroup r4 = X.DbS.A0E(r5, r0)
            r4.removeAllViews()
            java.util.Map r3 = r7.A05
            r3.clear()
            java.util.Iterator r11 = r2.iterator()
        L_0x00f5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r10 = r11.next()
            X.VW8 r10 = (X.VW8) r10
            android.content.Context r0 = r7.A02
            X.0qQ.A06(r0)
            com.instagram.common.ui.base.IgTextView r2 = new com.instagram.common.ui.base.IgTextView
            r2.<init>(r0)
            java.lang.String r0 = r10.A01
            r2.setText(r0)
            r2.setFocusable(r9)
            java.lang.String r0 = r10.A00
            r2.setContentDescription(r0)
            r0 = 2132018633(0x7f1405c9, float:1.9675578E38)
            r2.setTextAppearance(r0)
            r0 = -2
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r0, r0)
            android.content.res.Resources r0 = r2.getResources()
            int r0 = X.AnonymousClass7TE.A0C(r0)
            r1.setMargins(r0, r0, r0, r0)
            r2.setLayoutParams(r1)
            r2.setTypeface(r8, r9)
            java.lang.String r0 = r10.A02
            X.C18500Vsv.A00(r2, r7, r0)
            r3.put(r0, r2)
            r4.addView(r2)
            goto L_0x00f5
        L_0x0141:
            boolean r0 = r3.equals(r10)
            if (r0 == 0) goto L_0x015d
            r0 = 2131969363(0x7f134553, float:1.9575647E38)
            goto L_0x00a9
        L_0x014c:
            boolean r0 = r3.equals(r10)
            if (r0 == 0) goto L_0x0165
            r0 = 2131969363(0x7f134553, float:1.9575647E38)
            goto L_0x00a0
        L_0x0157:
            r7.A00 = r14
            r6.addView(r5)
        L_0x015c:
            return
        L_0x015d:
            java.lang.String r1 = "No hint found for permission"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0165:
            java.lang.String r1 = "No title found for permission"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x016d:
            android.app.Activity r2 = r14.A09
            java.lang.String r1 = "android.permission.CAMERA"
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            java.lang.String[] r1 = new java.lang.String[]{r1, r0}
            r0 = 2
            X.C13990Tnq.A0k(r2, r14, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19256WRp.A01(X.WRp, boolean):void");
    }

    public final void A02(C17766Vfd vfd, Integer num) {
        String str;
        Class<C19256WRp> cls = C19256WRp.class;
        if (num != AnonymousClass05K.A01) {
            this.A01 = vfd;
            ArrayList arrayList = new ArrayList();
            String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
            int i = 0;
            do {
                String str2 = strArr[i];
                if (!1DL.A07(this.A09, str2)) {
                    arrayList.add(str2);
                }
                i++;
            } while (i < 2);
            if (arrayList.isEmpty()) {
                C17766Vfd vfd2 = this.A01;
                if (vfd2 != null) {
                    vfd2.A00();
                }
            } else if (!this.A04) {
                ArrayList arrayList2 = this.A0G;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                this.A04 = true;
                A01(this, false);
                return;
            } else {
                C18500Vsv vsv = this.A03;
                WT1 wt1 = this.A0C;
                C16612Uy8 uy8 = C16612Uy8.CAMERA_PERMISSION_DENIED;
                String obj = new 0Yh(cls).toString();
                if (vsv == null) {
                    str = "Not starting the camera, permissions were requested by denied since last hide";
                } else {
                    str = "Got into unexpected position";
                }
                wt1.A02(uy8, obj, str);
                C17766Vfd vfd3 = this.A01;
                if (vfd3 != null) {
                    C18555Vu7 vu7 = vfd3.A00.A02;
                    if (vu7 == null) {
                        0qQ.A0F("ar3dToggleController");
                        throw AnonymousClass00P.createAndThrow();
                    } else {
                        vu7.A01();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        A00();
    }

    public C19256WRp(Activity activity, ViewGroup viewGroup, C39749A7p a7p, WT1 wt1, UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1Q(userSession, viewGroup);
        0qQ.A0B(wt1, 7);
        this.A09 = activity;
        this.A0D = userSession;
        this.A0A = viewGroup;
        this.A0E = str;
        this.A0F = str2;
        this.A0B = a7p;
        this.A0C = wt1;
    }
}
