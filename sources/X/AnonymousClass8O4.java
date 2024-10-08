package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.ui.widget.drawing.FloatingIndicator;
import com.instagram.ui.widget.drawing.StrokeWidthTool;
import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.8O4  reason: invalid class name */
public final class AnonymousClass8O4 implements AnonymousClass8LV, AnonymousClass8BB, AnonymousClass8O5, AnonymousClass89Y {
    public int A00;
    public int A01;
    public long A02;
    public View A03;
    public View A04;
    public C355148Ov A05;
    public Integer A06 = AnonymousClass05K.A00;
    public String A07 = "NoDisplayedBrush";
    public boolean A08 = false;
    public float A09 = -1.0f;
    public int A0A = -1;
    public int A0B = -1;
    public final Context A0C;
    public final Handler A0D = new Handler(Looper.getMainLooper());
    public final UserSession A0E;
    public final C71662eb A0F;
    public final C71662eb A0G;
    public final AnonymousClass8O1 A0H;
    public final AnonymousClass8O8 A0I = AnonymousClass8O8.PEN;
    public final AnonymousClass8O8 A0J = AnonymousClass8O8.ERASER;
    public final FittingTextView A0K;
    public final FittingTextView A0L;
    public final StrokeWidthTool A0M;
    public final AnonymousClass8O9 A0N;
    public final AnonymousClass8OA A0O;
    public final Runnable A0P = new AnonymousClass8O6(this);
    public final Runnable A0Q = new AnonymousClass8O7(this);
    public final ArrayList A0R = new ArrayList();
    public final HashMap A0S = new HashMap();
    public final List A0T = new ArrayList();
    public final Map A0U = new HashMap();
    public final Map A0V = new LinkedHashMap();
    public final float A0W;
    public final int A0X;
    public final Drawable A0Y;
    public final C71662eb A0Z;
    public final AnonymousClass8BQ A0a;
    public final AnonymousClass8O3 A0b;
    public final AnonymousClass88K A0c;
    public final C3502083s A0d;
    public final C314446iH A0e;
    public final EyedropperColorPickerTool A0f;
    public final FloatingIndicator A0g;
    public final boolean A0h;
    public volatile A56 A0i;

    public final /* synthetic */ void DDq() {
    }

    public final /* synthetic */ void DDt() {
    }

    public final /* synthetic */ void DDv(int i) {
    }

    public static A56 A00(AnonymousClass8O4 r1) {
        if (r1.A0i == null) {
            r1.A0G.A01();
        }
        A56 a56 = r1.A0i;
        a56.getClass();
        return a56;
    }

    private void A01() {
        C21006X9e x9e;
        String AiK;
        if (this.A0i != null) {
            x9e = A00(this).A00.getBrush();
        } else {
            x9e = null;
        }
        if (x9e == null) {
            AiK = "";
        } else {
            AiK = x9e.AiK();
        }
        if (!this.A08) {
            int i = 0;
            while (true) {
                List list = this.A0T;
                if (i < list.size()) {
                    View view = (View) list.get(i);
                    Object obj = this.A0U.get(view);
                    obj.getClass();
                    view.setActivated(AiK.equals(obj));
                    i++;
                } else {
                    return;
                }
            }
        } else if (!AiK.equals("")) {
            if (!this.A07.equals("NoDisplayedBrush")) {
                int i2 = 0;
                while (true) {
                    List list2 = this.A0T;
                    if (i2 >= list2.size()) {
                        break;
                    }
                    View view2 = (View) list2.get(i2);
                    view2.setActivated(false);
                    HashMap hashMap = this.A0S;
                    if (view2 == hashMap.get(this.A0J.A04) || view2 == hashMap.get(this.A07)) {
                        view2.setVisibility(0);
                    } else {
                        view2.setVisibility(8);
                    }
                    i2++;
                }
            }
            View view3 = (View) this.A0S.get(AiK);
            if (view3 != null) {
                view3.setActivated(true);
            }
        }
    }

    public static void A03(AnonymousClass8O8 r1, AnonymousClass8O4 r2, boolean z) {
        AnonymousClass8O9 r0 = r2.A0N;
        C21006X9e x9e = (C21006X9e) r0.A01.get(r1.A04);
        if (x9e != null) {
            A06(r2, x9e, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r4 != r9.A0J) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass8O4 r9) {
        /*
            java.util.List r8 = r9.A0T
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0021
            java.util.Iterator r2 = r8.iterator()
        L_0x000c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r1 = r2.next()
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x000c
        L_0x001e:
            r8.clear()
        L_0x0021:
            X.8O8[] r7 = X.AnonymousClass8O8.values()
            int r6 = r7.length
            r5 = 0
        L_0x0027:
            if (r5 >= r6) goto L_0x006d
            r4 = r7[r5]
            android.view.View r1 = r9.A03
            r1.getClass()
            int r0 = r4.A00
            android.view.View r3 = r1.requireViewById(r0)
            java.util.Map r1 = r9.A0U
            java.lang.String r0 = r4.A04
            r1.put(r3, r0)
            boolean r0 = r4.A05
            r2 = 8
            if (r0 == 0) goto L_0x005f
            X.3NG r1 = new X.3NG
            r1.<init>(r3)
            X.9RM r0 = new X.9RM
            r0.<init>(r4, r9)
            r1.A04 = r0
            r1.A00()
            boolean r0 = r9.A08
            r1 = 0
            if (r0 == 0) goto L_0x0068
            X.8O8 r0 = r9.A0I
            if (r4 == r0) goto L_0x0069
            X.8O8 r0 = r9.A0J
            if (r4 == r0) goto L_0x0069
        L_0x005f:
            r3.setVisibility(r2)
        L_0x0062:
            r8.add(r3)
            int r5 = r5 + 1
            goto L_0x0027
        L_0x0068:
            r1 = 4
        L_0x0069:
            r3.setVisibility(r1)
            goto L_0x0062
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8O4.A04(X.8O4):void");
    }

    public static void A05(AnonymousClass8O4 r3, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(r3.A0V);
        linkedHashMap.remove(Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : linkedHashMap.entrySet()) {
            arrayList.add(value.getValue());
        }
        C355148Ov r0 = r3.A05;
        r0.getClass();
        r0.A02(arrayList);
    }

    public static void A06(AnonymousClass8O4 r6, C21006X9e x9e, boolean z) {
        if (x9e == null) {
            AnonymousClass8O9 r2 = r6.A0N;
            x9e = (C21006X9e) r2.A01.get(r6.A0I.A04);
            if (x9e == null) {
                return;
            }
        }
        String AiK = x9e.AiK();
        if (r6.A08 && !AiK.equals(r6.A0J.A04)) {
            r6.A07 = AiK;
        }
        A00(r6).A00.setBrush(x9e);
        x9e.ESC(r6.A0B);
        StrokeWidthTool strokeWidthTool = r6.A0M;
        float BTE = x9e.BTE();
        float BPO = x9e.BPO();
        float f = strokeWidthTool.A07;
        float f2 = strokeWidthTool.A05;
        strokeWidthTool.A05 = BTE;
        strokeWidthTool.A04 = BPO;
        strokeWidthTool.A07 = BTE + (((f - f2) / (strokeWidthTool.A04 - f2)) * (BPO - BTE));
        StrokeWidthTool.A03(strokeWidthTool);
        r6.A07(z);
        A00(r6).A00.setBrushSize(((C19723WeP) x9e).A00);
        r6.A01();
        r6.A02();
    }

    public static boolean A08(AnonymousClass8O4 r2) {
        Integer num = r2.A06;
        if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0Y || num == AnonymousClass05K.A0j || num == AnonymousClass05K.A0u) {
            return true;
        }
        return false;
    }

    public final C354988Od A09() {
        C354998Oe r1;
        if (this.A0i != null) {
            C20366Wq6 wq6 = A00(this).A00.A0E;
            if (!wq6.A0H.isEmpty()) {
                r1 = new C354998Oe(new ArrayList(wq6.A0G));
                return new C354988Od(r1);
            }
        }
        r1 = null;
        return new C354988Od(r1);
    }

    public final void A0A() {
        AnonymousClass88K r0 = this.A0c;
        if (r0 != null) {
            r0.A04();
        }
        int i = this.A0X;
        FittingTextView fittingTextView = this.A0L;
        if (fittingTextView != null) {
            fittingTextView.setMaxWidth(i);
        }
        FittingTextView fittingTextView2 = this.A0K;
        if (fittingTextView2 != null) {
            fittingTextView2.setMaxWidth(i);
        }
        A0E(AnonymousClass05K.A01);
    }

    public final void A0D(int i) {
        this.A0A = i;
        this.A0B = i;
        if (this.A0G.A04() && A00(this).A00.getBrush() != null) {
            A00(this).A00.getBrush().ESC(i);
        }
        this.A0M.setColour(i);
        EyedropperColorPickerTool eyedropperColorPickerTool = this.A0f;
        eyedropperColorPickerTool.getClass();
        eyedropperColorPickerTool.setColor(i);
        AnonymousClass88K r0 = this.A0c;
        if (r0 != null) {
            r0.A04();
        }
    }

    public final void A0E(Integer num) {
        int i;
        StrokeWidthTool strokeWidthTool;
        C295005nO r2;
        Bitmap bitmap;
        Integer num2 = num;
        if (this.A06 != num2) {
            if (this.A03 == null) {
                this.A0Z.A01();
            }
            Integer num3 = this.A06;
            boolean z = false;
            if (num3 == AnonymousClass05K.A00) {
                z = true;
            }
            boolean A082 = A08(this);
            this.A06 = num2;
            switch (num2.intValue()) {
                case 0:
                    if (this.A0G.A04()) {
                        this.A0a.A02(false);
                        GLDrawingView gLDrawingView = A00(this).A00;
                        View view = this.A03;
                        view.getClass();
                        C315596kB.A08(new View[]{gLDrawingView, view, this.A0K, this.A0M, this.A0L, this.A0f}, false);
                        A00(this).A00.setEnabled(false);
                        GLDrawingView gLDrawingView2 = A00(this).A00;
                        C41092AoE aoE = new C41092AoE(gLDrawingView2, (Runnable) null);
                        C20565Wui wui = gLDrawingView2.A05;
                        if (wui != null) {
                            wui.A07(aoE);
                        }
                    }
                    AnonymousClass88K r22 = this.A0c;
                    if (!(r22 == null || (bitmap = r22.A02) == null)) {
                        bitmap.recycle();
                        r22.A02 = null;
                        break;
                    }
                case 1:
                    if (num3 == AnonymousClass05K.A0C || num3 == AnonymousClass05K.A0Y) {
                        if (this.A0i != null) {
                            List marks = A00(this).A00.getMarks();
                            0qQ.A0B(marks, 0);
                            ArrayList<XCG> arrayList = new ArrayList<>();
                            for (Object next : marks) {
                                XCG xcg = (XCG) next;
                                if (xcg != null && ((C19724WeQ) xcg).A04 > this.A02) {
                                    arrayList.add(next);
                                }
                            }
                            HashSet hashSet = new HashSet();
                            TreeSet treeSet = new TreeSet();
                            HashSet hashSet2 = new HashSet();
                            for (XCG xcg2 : arrayList) {
                                C19724WeQ weQ = (C19724WeQ) xcg2;
                                int i2 = weQ.A02;
                                float f = weQ.A01;
                                C21006X9e x9e = weQ.A03;
                                17k.A07(x9e, "must initialize with brush before retrieving brush");
                                hashSet.add(x9e.AiK());
                                treeSet.add(Float.valueOf(f));
                                hashSet2.add(Integer.valueOf(i2));
                            }
                            AnonymousClass8O1 r15 = this.A0H;
                            boolean z2 = !arrayList.isEmpty();
                            int size = hashSet2.size();
                            if (!treeSet.isEmpty()) {
                                Object last = treeSet.last();
                                last.getClass();
                                i = ((Number) last).intValue();
                            } else {
                                i = -1;
                            }
                            r15.Cht(size, i, treeSet.size(), arrayList.size(), hashSet.size(), this.A01, z2);
                        } else {
                            this.A0H.Cht(0, -1, 0, 0, 0, 0, false);
                        }
                    }
                    AnonymousClass88K r1 = this.A0c;
                    if (r1 != null) {
                        r1.A04();
                    }
                    StrokeWidthTool strokeWidthTool2 = this.A0M;
                    strokeWidthTool2.setStrokeWidthButtonShowing(true);
                    this.A0a.A02(false);
                    View view2 = this.A03;
                    view2.getClass();
                    C315596kB.A08(new View[]{view2, strokeWidthTool2, this.A0K, this.A0L, this.A0f}, false);
                    if (this.A0G.A04()) {
                        boolean z3 = this.A0h;
                        View[] viewArr = {A00(this).A00};
                        if (!z3) {
                            C294975nL.A04((C295005nO) null, viewArr, false);
                        } else {
                            C315596kB.A08(viewArr, false);
                        }
                        A00(this).A00.setEnabled(false);
                    }
                    if (z) {
                        if (this.A0i != null) {
                            GLDrawingView gLDrawingView3 = A00(this).A00;
                            C41092AoE aoE2 = new C41092AoE(gLDrawingView3, (Runnable) null);
                            C20565Wui wui2 = gLDrawingView3.A05;
                            if (wui2 != null) {
                                wui2.A07(aoE2);
                            }
                        }
                        A0D(-1);
                        A03(this.A0I, this, true);
                        break;
                    }
                    break;
                case 2:
                    C315596kB.A08(new View[]{this.A0L}, true);
                    strokeWidthTool = this.A0M;
                    strokeWidthTool.setStrokeWidthButtonShowing(false);
                    View view3 = this.A03;
                    view3.getClass();
                    r2 = null;
                    C294975nL.A04((C295005nO) null, new View[]{view3, this.A0K, strokeWidthTool, this.A0f}, true);
                    A02();
                    A07(false);
                    break;
                case 3:
                    this.A0a.A02(true);
                    View view4 = this.A03;
                    view4.getClass();
                    C315596kB.A08(new View[]{view4, this.A0K, this.A0f, this.A0M, this.A0L}, true);
                    C294975nL.A04((C295005nO) null, new View[]{A00(this).A00}, false);
                    A00(this).A00.setEnabled(true);
                    break;
                case 4:
                    strokeWidthTool = this.A0M;
                    strokeWidthTool.setStrokeWidthButtonShowing(false);
                    View view5 = this.A03;
                    view5.getClass();
                    View[] viewArr2 = {view5, this.A0K, strokeWidthTool, this.A0L, this.A0f};
                    C71392co r12 = C315596kB.A02;
                    r2 = null;
                    C294975nL.A04((C295005nO) null, viewArr2, true);
                    A07(false);
                    A02();
                    break;
                default:
                    this.A0a.A02(true);
                    View view6 = this.A03;
                    view6.getClass();
                    C315596kB.A08(new View[]{view6, this.A0K, this.A0f, this.A0M, this.A0L}, true);
                    break;
            }
            C294975nL.A04(r2, new View[]{A00(this).A00}, false);
            A00(this).A00.setEnabled(true);
            strokeWidthTool.setCollapsedIcon(this.A0Y);
            if (A08(this)) {
                if (!A082) {
                    this.A0e.DV9(this);
                    A01();
                    this.A0M.A0J = this;
                    AnonymousClass88K r13 = this.A0c;
                    if (r13 != null) {
                        r13.A06(this);
                    }
                }
            } else if (A082) {
                this.A0e.D48(this);
                AnonymousClass88K r14 = this.A0c;
                if (r14 != null) {
                    r14.A09.remove(this);
                }
            }
            C3502083s r23 = this.A0d;
            if (r23 == null) {
                return;
            }
            if (this.A06 == AnonymousClass05K.A0N) {
                r23.CLd();
            } else {
                r23.EvX();
            }
        }
    }

    public final boolean CJj() {
        if (this.A0i == null || !(!A00(this).A00.A0E.A0H.isEmpty())) {
            return false;
        }
        return true;
    }

    public final void DDu() {
        A0E(AnonymousClass05K.A0j);
    }

    public final void DrL() {
        FloatingIndicator floatingIndicator = this.A0g;
        floatingIndicator.getClass();
        floatingIndicator.A00();
    }

    public final void DrM(float f, float f2) {
        FloatingIndicator floatingIndicator = this.A0g;
        floatingIndicator.getClass();
        float f3 = f + this.A0W;
        StrokeWidthTool strokeWidthTool = this.A0M;
        floatingIndicator.A01(f, f2, f3, f2, strokeWidthTool.A07 * strokeWidthTool.A0U, this.A0A, 0, 0, true);
    }

    public final void Dwz(float f, float f2) {
        this.A09 = this.A0M.A07;
        A00(this).A00.setBrushSize(this.A09);
    }

    public final boolean onBackPressed() {
        Integer num = this.A06;
        if (num == AnonymousClass05K.A0Y || num == AnonymousClass05K.A0N) {
            GLDrawingView gLDrawingView = A00(this).A00;
            C41091AoD aoD = new C41091AoD(gLDrawingView, new C40802AjY(this));
            C20565Wui wui = gLDrawingView.A05;
            if (wui != null) {
                wui.A07(aoD);
                return true;
            }
        } else if (num != AnonymousClass05K.A0C) {
            return false;
        } else {
            A0E(AnonymousClass05K.A01);
        }
        return true;
    }

    private void A02() {
        Integer num;
        C21006X9e brush = A00(this).A00.getBrush();
        if (brush == null) {
            return;
        }
        if (!(!brush.CLz()) || !((num = this.A06) == AnonymousClass05K.A0Y || num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0u)) {
            AnonymousClass88K r0 = this.A0c;
            if (r0 != null) {
                r0.A04();
            }
            this.A0a.A02(true);
            C315596kB.A08(new View[]{this.A0f}, true);
            this.A0A = -1;
            this.A0M.setColour(-1);
            return;
        }
        this.A0a.A03(true, this.A0b.Etk());
        EyedropperColorPickerTool eyedropperColorPickerTool = this.A0f;
        C71392co r02 = C315596kB.A02;
        C294975nL.A04((C295005nO) null, new View[]{eyedropperColorPickerTool}, true);
        int i = this.A0B;
        this.A0A = i;
        this.A0M.setColour(i);
        eyedropperColorPickerTool.getClass();
        eyedropperColorPickerTool.setColor(this.A0A);
    }

    private void A07(boolean z) {
        C21006X9e brush = A00(this).A00.getBrush();
        if (brush != null) {
            float f = this.A09;
            if (f == -1.0f || z) {
                f = brush.Aw0();
                this.A09 = f;
            }
            this.A0M.setStrokeWidthDp(f);
            brush.ElQ(this.A09);
        }
    }

    public final void A0B() {
        if (A08(this)) {
            GLDrawingView gLDrawingView = A00(this).A00;
            C41091AoD aoD = new C41091AoD(gLDrawingView, new C40802AjY(this));
            C20565Wui wui = gLDrawingView.A05;
            if (wui != null) {
                wui.A07(aoD);
            }
            AnonymousClass88K r0 = this.A0c;
            if (r0 != null) {
                r0.A04();
            }
        }
    }

    public final void A0C() {
        Integer num;
        this.A02 = System.currentTimeMillis();
        this.A01 = 0;
        this.A0H.CkX();
        int i = this.A00;
        FittingTextView fittingTextView = this.A0L;
        if (fittingTextView != null) {
            fittingTextView.setMaxWidth(i);
        }
        FittingTextView fittingTextView2 = this.A0K;
        if (fittingTextView2 != null) {
            fittingTextView2.setMaxWidth(i);
        }
        if (!A00(this).A00.A0E.A0H.isEmpty()) {
            num = AnonymousClass05K.A0Y;
        } else {
            num = AnonymousClass05K.A0C;
        }
        A0E(num);
        this.A0M.A07();
    }

    public final Bitmap Az7(int i, int i2) {
        return A00(this).A00.getBitmap(i, i2);
    }

    public final Bitmap Az8(Bitmap bitmap) {
        return A00(this).A00.getBitmap();
    }

    public final void DDs(int i) {
        Integer num;
        A0D(i);
        if (!A00(this).A00.A0E.A0H.isEmpty()) {
            num = AnonymousClass05K.A0Y;
        } else {
            num = AnonymousClass05K.A0C;
        }
        A0E(num);
    }

    public AnonymousClass8O4(Context context, Resources resources, ViewStub viewStub, ViewStub viewStub2, UserSession userSession, C71662eb r15, AnonymousClass8BQ r16, AnonymousClass8O3 r17, AnonymousClass8O1 r18, AnonymousClass88K r19, C3502083s r20, C314446iH r21, FittingTextView fittingTextView, FittingTextView fittingTextView2, EyedropperColorPickerTool eyedropperColorPickerTool, FloatingIndicator floatingIndicator, StrokeWidthTool strokeWidthTool, boolean z) {
        this.A0E = userSession;
        this.A0C = context;
        this.A0e = r21;
        this.A0G = r15;
        this.A0c = r19;
        this.A0H = r18;
        this.A0b = r17;
        this.A0h = z;
        EyedropperColorPickerTool eyedropperColorPickerTool2 = eyedropperColorPickerTool;
        this.A0f = eyedropperColorPickerTool2;
        this.A0Y = resources.getDrawable(R.drawable.overlay_brush_size);
        AnonymousClass8O9 r0 = new AnonymousClass8O9(this);
        this.A0N = r0;
        AnonymousClass8OA r3 = new AnonymousClass8OA(userSession, r0);
        this.A0O = r3;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = 0nA.A01;
        this.A0W = TypedValue.applyDimension(1, 100.0f, displayMetrics);
        this.A0g = floatingIndicator;
        StrokeWidthTool strokeWidthTool2 = strokeWidthTool;
        this.A0M = strokeWidthTool2;
        strokeWidthTool2.setColour(-1);
        this.A0a = r16;
        FittingTextView fittingTextView3 = fittingTextView;
        this.A0K = fittingTextView3;
        FittingTextView fittingTextView4 = fittingTextView2;
        this.A0L = fittingTextView4;
        this.A0X = resources.getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        this.A0d = r20;
        r15.A02 = new AnonymousClass8OK(this);
        C71662eb r1 = new C71662eb(viewStub);
        this.A0Z = r1;
        this.A0F = new C71662eb(viewStub2);
        r1.A02 = new AnonymousClass8OL(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(AnonymousClass8OM.A00("Pen"));
        arrayList.add(AnonymousClass8OM.A00("Marker"));
        arrayList.add(AnonymousClass8OM.A00("Neon"));
        arrayList.add(AnonymousClass8OM.A00("Eraser"));
        arrayList.add(AnonymousClass8OM.A00("Special"));
        arrayList.add(AnonymousClass8OM.A00("Arrow"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass8OD r12 = r3.A05;
            AnonymousClass8OO r2 = new AnonymousClass8OO(r3.A03, r3, r12, (AnonymousClass8OM) it.next());
            r3.A06.add(r2);
            C20565Wui wui = r3.A00;
            if (wui != null) {
                r2.DHL(wui, r3.A02);
            }
            r2.A05.A04(new Object());
        }
        View[] viewArr = {fittingTextView3, fittingTextView4, eyedropperColorPickerTool2};
        int i = 0;
        do {
            View view = viewArr[i];
            if (view != null) {
                2eS.A04(view, AnonymousClass05K.A01);
            }
            i++;
        } while (i < 3);
    }
}
