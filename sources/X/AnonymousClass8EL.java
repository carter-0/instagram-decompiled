package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8EL  reason: invalid class name */
public final class AnonymousClass8EL implements AnonymousClass8EM {
    public double A00;
    public float A01;
    public int A02;
    public View A03;
    public ViewGroup A04;
    public ViewGroup A05;
    public C3494580l A06;
    public CameraToolMenuItem A07;
    public boolean A08;
    public boolean A09;
    public final FrameLayout A0A;
    public final 2cs A0B;
    public final 2cs A0C;
    public final 2cs A0D;
    public final UserSession A0E;
    public final C279284yO A0F;
    public final AnonymousClass8EE A0G;
    public final AnonymousClass8EP A0H;
    public final LinkedHashMap A0I = new LinkedHashMap();
    public final List A0J = new ArrayList();
    public final Set A0K = new HashSet();
    public final 2cs A0L;
    public final C252203oj A0M;
    public final AnonymousClass8EA A0N;
    public final Runnable A0O;
    public final Runnable A0P = new AnonymousClass8EN(this);
    public final Map A0Q = new HashMap();
    public final Map A0R = new HashMap();

    public AnonymousClass8EL(FrameLayout frameLayout, UserSession userSession, C279284yO r19, AnonymousClass8EE r20, AnonymousClass8EA r21) {
        C279284yO r2 = r19;
        0qQ.A0B(r2, 4);
        AnonymousClass8EE r1 = r20;
        0qQ.A0B(r1, 5);
        UserSession userSession2 = userSession;
        this.A0E = userSession2;
        AnonymousClass8EA r11 = r21;
        this.A0N = r11;
        FrameLayout frameLayout2 = frameLayout;
        this.A0A = frameLayout2;
        this.A0F = r2;
        this.A0G = r1;
        AnonymousClass8EO r9 = new AnonymousClass8EO(this);
        this.A0M = r9;
        this.A0H = new AnonymousClass8EP(r11, userSession2, r11.getCameraToolMenuDelegate(), this, false);
        this.A0C = AnonymousClass8EF.A00(new AnonymousClass8ER(this), 2.0d, 20.0d);
        this.A0L = AnonymousClass8EF.A00(r9, 5.0d, 10.0d);
        this.A0D = AnonymousClass8EF.A00(new AnonymousClass8ES(this), 2.0d, 20.0d);
        this.A0B = AnonymousClass8EF.A00(new AnonymousClass8ET(this), 2.0d, 20.0d);
        0nA.A0p(frameLayout2, new AnonymousClass8EU(this));
        this.A0O = new AnonymousClass8EV(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x004e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C3494580l r10) {
        /*
            r9 = this;
            r7 = 0
            X.0qQ.A0B(r10, r7)
            java.util.LinkedHashMap r5 = r9.A0I
            java.util.Set r0 = r5.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x000e:
            boolean r0 = r2.hasNext()
            r4 = 1
            if (r0 == 0) goto L_0x0037
            java.lang.Object r1 = r2.next()
            X.0qQ.A07(r1)
            X.8aL r1 = (X.C358088aL) r1
            X.0qQ.A0B(r1, r7)
            java.util.LinkedHashMap r0 = r10.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0033
            boolean r0 = r10.A03(r1)
            if (r0 != 0) goto L_0x0033
            r9.A03(r1, r7)
            goto L_0x000e
        L_0x0033:
            r9.A03(r1, r4)
            goto L_0x000e
        L_0x0037:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r5)
            r5.clear()
            java.util.List r6 = r9.A0J
            r6.clear()
            r9.A06 = r10
            java.util.LinkedHashSet r0 = r10.A00()
            java.util.Iterator r8 = r0.iterator()
        L_0x004e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r1 = r8.next()
            X.8aL r1 = (X.C358088aL) r1
            X.0qQ.A0B(r1, r7)
            int r0 = r1.ordinal()
            switch(r0) {
                case 47: goto L_0x0077;
                case 50: goto L_0x0077;
                case 56: goto L_0x0077;
                default: goto L_0x0064;
            }
        L_0x0064:
            java.lang.Object r0 = r3.get(r1)
            if (r0 != 0) goto L_0x0071
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r0 = r9.A02(r1)
            if (r0 != 0) goto L_0x0071
            goto L_0x004e
        L_0x0071:
            r5.put(r1, r0)
            r6.add(r0)
        L_0x0077:
            X.80l r0 = r9.A06
            if (r0 == 0) goto L_0x004e
            java.util.LinkedHashSet r0 = r0.A01(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x0083:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = r2.next()
            X.8aL r1 = (X.C358088aL) r1
            X.80l r0 = r9.A06
            if (r0 == 0) goto L_0x009f
            X.0qQ.A0B(r1, r7)
            java.util.LinkedHashMap r0 = r0.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 != r4) goto L_0x009f
            goto L_0x0083
        L_0x009f:
            java.lang.Object r0 = r3.get(r1)
            if (r0 != 0) goto L_0x00ac
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r0 = r9.A02(r1)
            if (r0 != 0) goto L_0x00ac
            goto L_0x0083
        L_0x00ac:
            r5.put(r1, r0)
            r6.add(r0)
            goto L_0x0083
        L_0x00b3:
            X.80l r0 = r9.A06
            if (r0 == 0) goto L_0x00d2
            java.util.Set r1 = r0.A01
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x00c2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = r1.next()
            X.8aL r0 = (X.C358088aL) r0
            r9.A03(r0, r7)
            goto L_0x00c2
        L_0x00d2:
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r0 = r9.A07
            if (r0 != 0) goto L_0x0108
            android.widget.FrameLayout r5 = r9.A0A
            android.content.Context r1 = r5.getContext()
            X.0qQ.A07(r1)
            r0 = 0
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r4 = new com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem
            r4.<init>(r1, r0, r7, r0)
            r9.A07 = r4
            r3 = 2131954631(0x7f130bc7, float:1.9545767E38)
            r2 = 2131238073(0x7f081cb9, float:1.8092414E38)
            r1 = 2131954632(0x7f130bc8, float:1.9545769E38)
            X.8EZ r0 = new X.8EZ
            r0.<init>(r3, r2, r1, r7)
            r4.setCameraToolResources(r0)
            X.8Ea r0 = new X.8Ea
            r0.<init>(r9)
            X.AnonymousClass0fU.A00(r0, r4)
            int r0 = r9.A02
            X.0nA.A0W(r4, r0)
            r5.addView(r4)
        L_0x0108:
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r0 = r9.A07
            if (r0 == 0) goto L_0x010f
            r6.add(r0)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EL.A08(X.80l):void");
    }

    public final void A09(Set set) {
        C3494580l r0;
        for (Map.Entry entry : this.A0I.entrySet()) {
            Object key = entry.getKey();
            CameraToolMenuItem cameraToolMenuItem = (CameraToolMenuItem) entry.getValue();
            0qQ.A0B(key, 0);
            if (C358088aL.A0g != key && ((r0 = this.A06) == null || !new LinkedHashSet(r0.A01).contains(key))) {
                boolean contains = set.contains(key);
                if (cameraToolMenuItem != null) {
                    cameraToolMenuItem.A04(contains, true);
                }
            }
        }
        Map map = this.A0Q;
        for (2cs A062 : map.values()) {
            A062.A06(0.0d);
        }
        C3494580l r02 = this.A06;
        if (!(r02 == null || r02.A00().isEmpty())) {
            Set set2 = this.A0K;
            set2.clear();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C358088aL r9 = (C358088aL) it.next();
                0qQ.A0B(r9, 0);
                switch (r9.ordinal()) {
                    case 47:
                    case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                    case 56:
                        break;
                    default:
                        C3494580l r03 = this.A06;
                        if (r03 != null && new LinkedHashSet(r03.A01).contains(r9)) {
                            break;
                        } else {
                            set2.add(r9);
                            2cs r2 = (2cs) map.get(r9);
                            if (r2 == null) {
                                r2 = AnonymousClass8EF.A00(this.A0M, 2.0d, 20.0d);
                                map.put(r9, r2);
                            }
                            r2.A06(1.0d);
                            break;
                        }
                        break;
                }
            }
        }
        EBG();
    }

    public final int BlJ(View view) {
        View view2;
        if (view == null) {
            return 0;
        }
        if (view.getParent() == this.A0N) {
            return view.getLeft();
        }
        if (this.A09) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            if (Integer.valueOf(i) != null) {
                return i;
            }
            return 0;
        }
        int left = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        return left + BlJ(view2);
    }

    private final int A00() {
        boolean A062;
        int i;
        C279284yO r2 = this.A0F;
        if (!0qQ.A0K(r2, AnonymousClass9QA.A00) && !0qQ.A0K(r2, AnonymousClass80M.A00)) {
            if (r2 instanceof AnonymousClass80O) {
                A062 = 182.A06(0Tu.A06, this.A0E, 36317998641911520L);
                i = 7;
            } else if (0qQ.A0K(r2, AnonymousClass80L.A00)) {
                A062 = 182.A06(0Tu.A05, this.A0E, 36322817595353549L);
                i = 6;
            } else if (0qQ.A0K(r2, C3494280i.A00) || 0qQ.A0K(r2, C3494180h.A00) || 0qQ.A0K(r2, C3493980f.A00) || 0qQ.A0K(r2, C363138jC.A00) || 0qQ.A0K(r2, C3494080g.A00) || 0qQ.A0K(r2, AnonymousClass80K.A00) || 0qQ.A0K(r2, AnonymousClass80J.A00)) {
                return 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("unknown camera destination ");
                sb.append(r2);
                0kD.A00("CameraToolMenuAdapter", sb.toString());
                return 0;
            }
            if (A062) {
                return 3;
            }
            return i;
        }
        return 3;
    }

    private final int A01(View view) {
        View view2;
        if (view == null) {
            return 0;
        }
        if (view.getParent() == this.A0N) {
            return view.getTop();
        }
        int top = view.getTop();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        return A01(view2) + top;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem A02(X.C358088aL r9) {
        /*
            r8 = this;
            java.util.LinkedHashMap r0 = r8.A0I
            boolean r0 = r0.containsKey(r9)
            r3 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "cannot handle duplicate tools in the menu: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "CameraToolMenuAdapter"
            X.0kD.A00(r0, r1)
        L_0x001f:
            return r3
        L_0x0020:
            X.8EF r0 = X.AnonymousClass8EF.A00
            com.instagram.common.session.UserSession r5 = r8.A0E
            X.8EZ r7 = r0.A02(r5, r9)
            if (r7 == 0) goto L_0x001f
            android.widget.FrameLayout r2 = r8.A0A
            android.content.Context r1 = r2.getContext()
            X.0qQ.A07(r1)
            r0 = 0
            r4 = 0
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r3 = new com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem
            r3.<init>(r1, r0, r4, r0)
            int r0 = r8.A02
            X.0nA.A0W(r3, r0)
            X.8EP r0 = r8.A0H
            r0.A01(r9)
            r0 = 1
            X.0qQ.A0B(r9, r0)
            int r6 = X.C352618Eb.A01(r9)
            r1 = 3
            r0 = 0
            if (r6 != r1) goto L_0x0051
            r0 = 1
        L_0x0051:
            r3.A0A = r0
            int r6 = r9.ordinal()
            r0 = 14
            r1 = 0
            if (r6 == r0) goto L_0x0061
            r0 = 13
            if (r6 == r0) goto L_0x0061
            r1 = 1
        L_0x0061:
            r3.A09 = r1
            r3.setCameraToolResources(r7)
            X.3NG r1 = new X.3NG
            r1.<init>(r3)
            X.8Ec r0 = new X.8Ec
            r0.<init>(r9, r8, r3)
            r1.A04 = r0
            r1.A00()
            r0 = 26
            if (r6 == r0) goto L_0x00eb
            if (r6 == r4) goto L_0x00d8
            r0 = 42
            if (r6 == r0) goto L_0x00f4
            r0 = 59
            if (r6 != r0) goto L_0x00d4
            X.1Av r4 = X.1Au.A00(r5)
            X.0s0 r1 = r4.A1w
            X.0YZ[] r7 = X.1Av.A8a
            r0 = 208(0xd0, float:2.91E-43)
            r0 = r7[r0]
            java.lang.Object r0 = r1.CDM(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d4
            X.1Av r4 = X.1Au.A00(r5)
            X.0s0 r1 = r4.A86
            r6 = 209(0xd1, float:2.93E-43)
            r0 = r7[r6]
            java.lang.Object r0 = r1.CDM(r4, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 5
            if (r1 >= r0) goto L_0x00d4
            X.7ii r0 = X.C338897ii.NEW
            r3.setMerchandiseBadge(r0)
            X.1Av r5 = X.1Au.A00(r5)
            X.0s0 r4 = r5.A86
            r0 = r7[r6]
            java.lang.Object r0 = r4.CDM(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            r1 = r7[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.Epx(r5, r0, r1)
        L_0x00d4:
            r2.addView(r3)
            return r3
        L_0x00d8:
            X.4yO r1 = r8.A0F
            X.80N r0 = X.AnonymousClass80N.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00d4
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "dismissed_new_clips_boomerang_tool_badge"
            goto L_0x0106
        L_0x00eb:
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "dismissed_new_audience_controls_tool_badge"
            goto L_0x0106
        L_0x00f4:
            X.4yO r1 = r8.A0F
            X.80N r0 = X.AnonymousClass80N.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00d4
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "dismissed_new_clips_green_screen_tool_badge"
        L_0x0106:
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x00d4
            X.7ii r0 = X.C338897ii.NEW
            r3.setMerchandiseBadge(r0)
            goto L_0x00d4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EL.A02(X.8aL):com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem");
    }

    private final void A03(C358088aL r9, boolean z) {
        Map map = this.A0R;
        Object obj = map.get(r9);
        double d = 1.0d;
        2cs r1 = obj;
        if (obj == null) {
            if (!z) {
                2cs A002 = AnonymousClass8EF.A00(this.A0M, 2.0d, 20.0d);
                A002.A08(1.0d, true);
                r1 = A002;
                if (r9 != null) {
                    map.put(r9, A002);
                    r1 = A002;
                }
            } else {
                return;
            }
        }
        2cs r12 = (2cs) r1;
        if (!z) {
            d = 0.0d;
        }
        r12.A06(d);
    }

    public static final void A04(AnonymousClass8EL r4, CameraToolMenuItem cameraToolMenuItem, float f) {
        if (!0qQ.A0K(cameraToolMenuItem, r4.A07) || r4.A0C.A01 != 0.0d) {
            if (cameraToolMenuItem == null) {
                return;
            }
        } else if (cameraToolMenuItem != null) {
            f = 0.0f;
        } else {
            return;
        }
        cameraToolMenuItem.setLabelDisplayPercentage(f);
    }

    public final void A05() {
        this.A0D.A06(0.0d);
        11Z.A01(this.A0P);
    }

    public final void A06() {
        this.A0D.A06(1.0d);
        Runnable runnable = this.A0P;
        11Z.A01(runnable);
        11Z.A04(runnable, 6000);
        this.A0G.A00(true);
    }

    public final void A07(double d) {
        int i;
        int i2;
        int i3;
        this.A0C.A06(d);
        this.A0L.A06(d);
        CameraToolMenuItem cameraToolMenuItem = this.A07;
        if (cameraToolMenuItem != null) {
            if (d == 0.0d) {
                i = 2131954631;
                i2 = R.drawable.instagram_chevron_down_outline_44;
                i3 = 2131954632;
            } else if (d == 1.0d) {
                i = 2131954581;
                i2 = R.drawable.instagram_chevron_down_outline_44;
                i3 = 2131954582;
            } else {
                return;
            }
            cameraToolMenuItem.setCameraToolResources(new AnonymousClass8EZ(i, i2, i3, false));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(boolean r4) {
        /*
            r3 = this;
            android.view.ViewGroup r0 = r3.A05
            if (r0 == 0) goto L_0x0061
            android.view.ViewGroup r0 = r3.A04
            if (r0 == 0) goto L_0x0061
            r1 = 0
            if (r4 == 0) goto L_0x0055
            int r0 = r0.getChildCount()
            if (r0 > 0) goto L_0x0061
        L_0x0011:
            r3.A09 = r4
            X.8EP r0 = r3.A0H
            r0.A02 = r4
            if (r4 == 0) goto L_0x0047
            android.widget.FrameLayout r0 = r3.A0A
            r0.removeAllViews()
            android.view.ViewGroup r0 = r3.A05
            if (r0 == 0) goto L_0x0025
        L_0x0022:
            r0.setVisibility(r1)
        L_0x0025:
            java.util.List r0 = r3.A0J
            java.util.Iterator r2 = r0.iterator()
        L_0x002b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r1 = r2.next()
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r1 = (com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem) r1
            if (r4 == 0) goto L_0x0044
            android.view.ViewGroup r0 = r3.A04
            if (r0 == 0) goto L_0x0040
        L_0x003d:
            r0.addView(r1)
        L_0x0040:
            r1.setIsFlexModeBackgroundEnabled(r4)
            goto L_0x002b
        L_0x0044:
            android.widget.FrameLayout r0 = r3.A0A
            goto L_0x003d
        L_0x0047:
            android.view.ViewGroup r0 = r3.A04
            if (r0 == 0) goto L_0x004e
            r0.removeAllViews()
        L_0x004e:
            android.view.ViewGroup r0 = r3.A05
            if (r0 == 0) goto L_0x0025
            r1 = 8
            goto L_0x0022
        L_0x0055:
            android.widget.FrameLayout r0 = r3.A0A
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L_0x0011
            return
        L_0x005e:
            r3.EBG()
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EL.A0A(boolean):void");
    }

    public final float Bqg(CameraToolMenuItem cameraToolMenuItem) {
        ViewGroup viewGroup = this.A05;
        if (viewGroup != null) {
            Float valueOf = Float.valueOf(viewGroup.getY());
            if (this.A09 && valueOf != null) {
                return valueOf.floatValue();
            }
        }
        return (float) (A01(cameraToolMenuItem) + ((int) cameraToolMenuItem.getTranslationY()));
    }

    public final int Bro(C358088aL r2) {
        AnonymousClass8E8 r0 = this.A0N.A04;
        if (r0 != null) {
            return r0.A03.A04(r2);
        }
        0qQ.A0F("delegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C39637A3b Brs(C358088aL r2) {
        AnonymousClass8E8 r0 = this.A0N.A04;
        if (r0 != null) {
            return (C39637A3b) C357638Yz.A01(r2, r0.A03).A00;
        }
        0qQ.A0F("delegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Di6() {
        AnonymousClass8EA.A01(this.A0G.A00);
    }

    public final void Di7(C358088aL r2, int i) {
        AnonymousClass8E8 r0 = this.A0G.A00.A04;
        if (r0 == null) {
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A03.A0N(r2, i);
        }
    }

    public final void Di8(C358088aL r3, int i) {
        AnonymousClass8E8 r0 = this.A0G.A00.A04;
        if (r0 == null) {
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        }
        C3494680m A012 = C357638Yz.A01(r3, r0.A03);
        C39637A3b a3b = (C39637A3b) A012.A00;
        a3b.A00 = i;
        A012.A03(a3b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01ea, code lost:
        if (r20 != false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0216, code lost:
        if (r5 != X.C358088aL.A0k) goto L_0x01b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EBG() {
        /*
            r29 = this;
            r10 = r29
            android.widget.FrameLayout r0 = r10.A0A
            r28 = r0
            android.content.res.Resources r1 = r28.getResources()
            r0 = 2131165293(0x7f07006d, float:1.79448E38)
            float r25 = r1.getDimension(r0)
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            float r24 = r1.getDimension(r0)
            float r9 = r1.getDimension(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r25
            float r9 = r9 + r0
            X.2cs r1 = r10.A0C
            X.2ct r0 = r1.A09
            double r3 = r0.A00
            double r0 = r1.A01
            r16 = r0
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r0 = r10.A07
            r5 = 0
            if (r0 == 0) goto L_0x0055
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x0055
            X.80l r0 = r10.A06
            if (r0 == 0) goto L_0x0246
            java.util.LinkedHashSet r2 = r0.A00()
        L_0x003c:
            X.80l r0 = r10.A06
            if (r0 == 0) goto L_0x004a
            java.util.Set r1 = r0.A01
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            r2.removeAll(r0)
        L_0x004a:
            int r1 = r2.size()
            int r0 = r10.A00()
            if (r1 <= r0) goto L_0x0055
            r5 = 1
        L_0x0055:
            r1 = 8
            r8 = 0
            if (r5 == 0) goto L_0x023c
            r0 = r24
            int r7 = (int) r0
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r0 = r10.A07
            if (r0 == 0) goto L_0x0064
            r0.setVisibility(r8)
        L_0x0064:
            java.util.LinkedHashMap r0 = r10.A0I
            r27 = r0
            java.util.Set r0 = r27.entrySet()
            java.util.Iterator r23 = r0.iterator()
            r22 = 0
            r26 = 1065353216(0x3f800000, float:1.0)
        L_0x0074:
            boolean r0 = r23.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x024d
            java.lang.Object r0 = r23.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            X.8aL r5 = (X.C358088aL) r5
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0074
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L_0x0074
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x00a1
            int r1 = r10.A00()
            r0 = r22
            if (r0 >= r1) goto L_0x0238
        L_0x00a1:
            X.80l r0 = r10.A06
            if (r0 == 0) goto L_0x0238
            java.util.LinkedHashSet r0 = r0.A00()
            boolean r0 = r0.contains(r5)
            if (r0 != r6) goto L_0x0238
            X.80l r0 = r10.A06
            if (r0 == 0) goto L_0x0238
            java.util.Set r1 = r0.A01
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x0238
            r21 = 1
            int r22 = r22 + 1
        L_0x00c4:
            boolean r0 = r10.A08
            r20 = r0
            java.util.Map r0 = r10.A0Q
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r19 = r0.iterator()
            r18 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r15 = 0
        L_0x00d6:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0153
            java.lang.Object r0 = r19.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r13 = r0.getKey()
            X.8aL r13 = (X.C358088aL) r13
            java.lang.Object r12 = r0.getValue()
            X.2cs r12 = (X.2cs) r12
            X.80l r0 = r10.A06
            if (r0 == 0) goto L_0x0110
            X.0qQ.A0B(r13, r8)
            java.util.LinkedHashMap r0 = r0.A00
            boolean r0 = r0.containsKey(r13)
            if (r0 != r6) goto L_0x0110
            X.80l r0 = r10.A06
            if (r0 == 0) goto L_0x0110
            java.util.LinkedHashSet r0 = r0.A01(r13)
            boolean r0 = r0.contains(r5)
            if (r0 != r6) goto L_0x0110
            X.2ct r0 = r12.A09
            double r0 = r0.A00
            float r15 = (float) r0
        L_0x0110:
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x012c
            X.80l r0 = r10.A06
            if (r0 == 0) goto L_0x012c
            boolean r0 = r0.A04(r13, r5)
            if (r0 != r6) goto L_0x012c
            X.2ct r0 = r12.A09
            double r0 = r0.A00
            float r14 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r14
            int r0 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x012c
            r18 = r1
        L_0x012c:
            if (r5 != r13) goto L_0x00d6
            if (r21 == 0) goto L_0x0145
            java.util.Set r0 = r10.A0K
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0145
            X.2ct r0 = r12.A09
            double r13 = r0.A00
            double r0 = r12.A01
            int r11 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x0145
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00d6
        L_0x0145:
            X.2ct r0 = r12.A09
            double r0 = r0.A00
            float r11 = (float) r0
            double r0 = r12.A01
            float r12 = (float) r0
            int r0 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d6
            r11 = r12
            goto L_0x00d6
        L_0x0153:
            java.util.Map r0 = r10.A0R
            java.lang.Object r0 = r0.get(r5)
            X.2cs r0 = (X.2cs) r0
            if (r0 == 0) goto L_0x016e
            X.2ct r0 = r0.A09
            double r0 = r0.A00
            float r12 = (float) r0
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0168
            r18 = r12
        L_0x0168:
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x016e
            r18 = r12
        L_0x016e:
            if (r21 == 0) goto L_0x018d
            java.util.Set r0 = r10.A0K
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x018d
            r12 = 0
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x018d
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x018d
            float r0 = (float) r3
            float r18 = r18 + r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x018d
            r18 = 1065353216(0x3f800000, float:1.0)
        L_0x018d:
            X.80l r0 = r10.A06
            if (r0 == 0) goto L_0x0219
            java.util.LinkedHashSet r0 = r0.A00()
            boolean r0 = r0.contains(r5)
            if (r0 != r6) goto L_0x0219
            X.80l r0 = r10.A06
            if (r0 == 0) goto L_0x0219
            java.util.Set r1 = r0.A01
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x0219
            float r1 = (float) r3
        L_0x01ad:
            if (r21 == 0) goto L_0x0214
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b5
            r1 = r18
        L_0x01b5:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ba
            r1 = r11
        L_0x01ba:
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c2
            r20 = 0
        L_0x01c2:
            r11 = 0
            r14 = 1050253722(0x3e99999a, float:0.3)
            r13 = 1065353216(0x3f800000, float:1.0)
            float r6 = r13 - r14
            float r13 = r13 - r11
            r12 = 0
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x01d3
            float r12 = r1 - r14
            float r12 = r12 / r6
        L_0x01d3:
            float r12 = r12 * r13
            float r12 = r12 + r11
            float r6 = r9 * r1
            float r1 = r1 * r25
            int r1 = (int) r1
            float r13 = r9 - r6
            r0 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r0
            r0 = r20
            r2.setEnabled(r0)
            boolean r0 = r10.A09
            if (r0 == 0) goto L_0x01ec
            r0 = 8
            if (r20 == 0) goto L_0x01ed
        L_0x01ec:
            r0 = 0
        L_0x01ed:
            r2.setVisibility(r0)
            float r0 = r10.A01
            float r12 = r12 * r0
            X.8EP r0 = r10.A0H
            X.8aL r0 = r0.A00
            if (r0 != r5) goto L_0x01fb
            r26 = r12
        L_0x01fb:
            r2.setAlpha(r12)
            int r0 = (int) r9
            X.0nA.A0V(r2, r0)
            X.0nA.A0i(r2, r1, r1)
            boolean r0 = r10.A09
            if (r0 == 0) goto L_0x0229
            r2.setY(r11)
            X.0nA.A0d(r2, r1)
            X.0nA.A0U(r2, r1)
            goto L_0x0074
        L_0x0214:
            X.8aL r0 = X.C358088aL.A0k
            if (r5 == r0) goto L_0x01ba
            goto L_0x01b5
        L_0x0219:
            r1 = 0
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ad
            float r0 = (float) r3
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0227
            r15 = r1
        L_0x0227:
            r1 = r15
            goto L_0x01ad
        L_0x0229:
            float r0 = (float) r7
            float r0 = r0 - r13
            r2.setY(r0)
            int r0 = (int) r6
            int r7 = r7 + r0
            X.0nA.A0d(r2, r8)
            X.0nA.A0U(r2, r8)
            goto L_0x0074
        L_0x0238:
            r21 = 0
            goto L_0x00c4
        L_0x023c:
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r0 = r10.A07
            if (r0 == 0) goto L_0x0243
            r0.setVisibility(r1)
        L_0x0243:
            r7 = 0
            goto L_0x0064
        L_0x0246:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            goto L_0x003c
        L_0x024d:
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r4 = r10.A07
            if (r4 == 0) goto L_0x027e
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L_0x027e
            X.2cs r0 = r10.A0L
            X.2ct r0 = r0.A09
            double r2 = r0.A00
            float r1 = (float) r2
            r0 = 1127481344(0x43340000, float:180.0)
            float r1 = r1 * r0
            r4.setIconRotation(r1)
            r0 = r24
            int r1 = (int) r0
            X.0nA.A0V(r4, r1)
            float r0 = r10.A01
            r4.setAlpha(r0)
            float r0 = (float) r7
            r4.setY(r0)
            boolean r0 = r10.A08
            r4.setEnabled(r0)
            boolean r0 = r10.A08
            r4.setClickable(r0)
            int r7 = r7 + r1
        L_0x027e:
            X.8EP r4 = r10.A0H
            X.8aL r1 = r4.A00
            r0 = r27
            java.lang.Object r3 = r0.get(r1)
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r3 = (com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem) r3
            if (r3 == 0) goto L_0x029b
            double r1 = r10.A00
            float r0 = r10.A01
            r22 = r4
            r23 = r3
            r24 = r1
            r27 = r0
            r22.A02(r23, r24, r26, r27)
        L_0x029b:
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x02a4
            r0 = r28
            X.0nA.A0V(r0, r7)
        L_0x02a4:
            int r3 = r28.getChildCount()
        L_0x02a8:
            if (r6 >= r3) goto L_0x02c1
            r0 = r28
            android.view.View r2 = X.AnonymousClass046.A00(r0, r6)
            int r1 = r6 + -1
            android.view.View r1 = X.AnonymousClass046.A00(r0, r1)
            X.8Ef r0 = new X.8Ef
            r0.<init>(r1, r2)
            X.03v.A0B(r2, r0)
            int r6 = r6 + 1
            goto L_0x02a8
        L_0x02c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EL.EBG():void");
    }

    public final LinkedHashMap getCameraToolMenuItemMap() {
        return this.A0I;
    }

    public final View getCameraToolMenuShadow() {
        return this.A03;
    }

    public final Set getSelectedCameraTools() {
        return this.A0K;
    }
}
