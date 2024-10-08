package androidx.compose.ui.window;

import X.0fL;
import X.0qQ;
import X.0sL;
import X.0sP;
import X.AnonymousClass0fD;
import X.AnonymousClass54O;
import X.AnonymousClass5PH;
import X.AnonymousClass5PL;
import X.AnonymousClass5Q8;
import X.AnonymousClass5TE;
import X.AnonymousClass5TW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass972;
import X.C268064ch;
import X.C270284gU;
import X.C284945Oz;
import X.C285105Ps;
import X.C286575Wy;
import X.C286625Xd;
import X.C289005cr;
import X.C289155d7;
import X.C289295dM;
import X.C41848B3p;
import X.C51967G9n;
import X.C51968G9o;
import X.C51971G9r;
import X.C56020HrS;
import X.C56558I1m;
import X.C56610I4k;
import X.C58196Io0;
import X.C58920Izj;
import X.C59528JNa;
import X.C59529JNb;
import X.C62320sa;
import X.I5L;
import X.JGC;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

public final class PopupLayout extends AnonymousClass54O {
    public static final 0sP A0J = C58920Izj.A00;
    public AnonymousClass5Q8 A00;
    public C59529JNb A01;
    public C56020HrS A02;
    public Object A03;
    public String A04;
    public C62320sa A05;
    public C56558I1m A06;
    public boolean A07;
    public final Rect A08;
    public final View A09;
    public final WindowManager.LayoutParams A0A;
    public final WindowManager A0B;
    public final C284945Oz A0C;
    public final C284945Oz A0D;
    public final C284945Oz A0E;
    public final C270284gU A0F;
    public final AnonymousClass5TE A0G;
    public final C59528JNa A0H;
    public final int[] A0I;

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.0rl, java.lang.Object] */
    public final void A09() {
        C289005cr r0;
        C56558I1m i1m = this.A06;
        if (i1m != null && (r0 = m65getPopupContentSizebOM6tXw()) != null) {
            long j = r0.A00;
            Rect rect = this.A08;
            C59528JNa jNa = this.A0H;
            this.A09.getWindowVisibleDisplayFrame(rect);
            int i = rect.left;
            int i2 = rect.top;
            long A002 = C289155d7.A00(rect.right - i, rect.bottom - i2);
            ? obj = new Object();
            obj.A00 = 0;
            this.A0G.A02(this, new C58196Io0(i1m, this, obj, A002, j), A0J);
            WindowManager.LayoutParams layoutParams = this.A0A;
            long j2 = obj.A00;
            layoutParams.x = (int) (j2 >> 32);
            layoutParams.y = C51968G9o.A02(j2);
            jNa.EXW(this, (int) (A002 >> 32), C289005cr.A00(A002));
            this.A0B.updateViewLayout(this, layoutParams);
        }
    }

    public void setLayoutDirection(int i) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: X.Gg2} */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.JNa] */
    /* JADX WARNING: type inference failed for: r0v39 */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PopupLayout(android.view.View r7, X.C268024cd r8, X.C59529JNb r9, X.C56020HrS r10, java.lang.String r11, java.util.UUID r12, X.C62320sa r13) {
        /*
            r6 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x00f3
            X.Gg2 r0 = new X.Gg2
            r0.<init>()
        L_0x000b:
            android.content.Context r1 = r7.getContext()
            r2 = 0
            r4 = 0
            r6.<init>(r1, r2, r4)
            r6.A05 = r13
            r6.A02 = r10
            r6.A04 = r11
            r6.A09 = r7
            r6.A0H = r0
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            r0 = 14
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            r6.A0B = r1
            android.view.WindowManager$LayoutParams r3 = new android.view.WindowManager$LayoutParams
            r3.<init>()
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r3.gravity = r0
            X.HrS r5 = r6.A02
            android.view.View r1 = r6.A09
            boolean r0 = X.I5L.A02(r1)
            if (r0 == 0) goto L_0x00ed
            int r0 = r5.A00
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
        L_0x0049:
            r3.flags = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            r3.type = r0
            android.os.IBinder r0 = r1.getApplicationWindowToken()
            r3.token = r0
            r0 = -2
            r3.width = r0
            r3.height = r0
            r0 = -3
            r3.format = r0
            android.content.res.Resources r1 = X.DbU.A05(r1)
            r0 = 2131957523(0x7f131713, float:1.9551632E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setTitle(r0)
            r6.A0A = r3
            r6.A01 = r9
            X.5Q8 r0 = X.AnonymousClass5Q8.Ltr
            r6.A00 = r0
            r3 = 2
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.C51970G9q.A0S(r2)
            r6.A0E = r0
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.C51969G9p.A0S(r2)
            r6.A0D = r0
            r1 = 8
            X.TVu r0 = new X.TVu
            r0.<init>((java.lang.Object) r6, (int) r1)
            X.5TX r0 = X.C51965G9l.A0I(r2, r0)
            r6.A0F = r0
            r5 = 1090519040(0x41000000, float:8.0)
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            r6.A08 = r0
            r0 = 47
            X.J6M r1 = X.J6M.A00(r6, r0)
            X.5TE r0 = new X.5TE
            r0.<init>(r1)
            r6.A0G = r0
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            r6.setId(r0)
            X.07Z r0 = X.C71362ch.A00(r7)
            X.C71362ch.A01(r6, r0)
            X.07g r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner.A00(r7)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.A01(r6, r0)
            X.0g9 r0 = X.C71372cj.A00(r7)
            X.C71372cj.A01(r6, r0)
            r2 = 2131430553(0x7f0b0c99, float:1.848281E38)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Popup:"
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r12, r0, r1)
            r6.setTag(r2, r0)
            r6.setClipChildren(r4)
            float r0 = r8.F06(r5)
            r6.setElevation(r0)
            r1 = 1
            X.Gdj r0 = new X.Gdj
            r0.<init>(r1)
            r6.setOutlineProvider(r0)
            X.0sL r0 = X.C45170CrX.A00
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.C51969G9p.A0S(r0)
            r6.A0C = r0
            int[] r0 = new int[r3]
            r6.A0I = r0
            return
        L_0x00ed:
            int r0 = r5.A00
            r0 = r0 & -8193(0xffffffffffffdfff, float:NaN)
            goto L_0x0049
        L_0x00f3:
            X.IH2 r0 = new X.IH2
            r0.<init>()
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupLayout.<init>(android.view.View, X.4cd, X.JNb, X.HrS, java.lang.String, java.util.UUID, X.0sa):void");
    }

    private final 0sL getContent() {
        return (0sL) this.A0C.getValue();
    }

    /* access modifiers changed from: private */
    public final C268064ch getParentLayoutCoordinates() {
        return (C268064ch) this.A0D.getValue();
    }

    private final void setParentLayoutCoordinates(C268064ch r2) {
        this.A0D.Epw(r2);
    }

    public final void A0B(AnonymousClass5Q8 r4, C56020HrS hrS, String str, C62320sa r7) {
        int i;
        this.A05 = r7;
        this.A04 = str;
        if (!0qQ.A0K(this.A02, hrS)) {
            this.A02 = hrS;
            WindowManager.LayoutParams layoutParams = this.A0A;
            if (I5L.A02(this.A09)) {
                i = hrS.A00 | 8192;
            } else {
                i = hrS.A00 & -8193;
            }
            layoutParams.flags = i;
            this.A0B.updateViewLayout(this, layoutParams);
        }
        int ordinal = r4.ordinal();
        int i2 = 1;
        if (ordinal == 0) {
            i2 = 0;
        } else if (ordinal != 1) {
            throw AnonymousClass7TE.A1K();
        }
        super.setLayoutDirection(i2);
    }

    public final boolean getCanCalculatePosition() {
        return C51971G9r.A1X(this.A0F);
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.A0A;
    }

    public final AnonymousClass5Q8 getParentLayoutDirection() {
        return this.A00;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final C289005cr m65getPopupContentSizebOM6tXw() {
        return (C289005cr) this.A0E.getValue();
    }

    public final C59529JNb getPositionProvider() {
        return this.A01;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A07;
    }

    public AnonymousClass54O getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.A04;
    }

    public /* synthetic */ View getViewRoot() {
        return null;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m66setPopupContentSizefhxjrPA(C289005cr r2) {
        this.A0E.Epw(r2);
    }

    private final int getDisplayHeight() {
        Context context = getContext();
        return AnonymousClass7TE.A05((float) context.getResources().getConfiguration().screenHeightDp, AnonymousClass7TF.A0E(context).density);
    }

    private final int getDisplayWidth() {
        Context context = getContext();
        return AnonymousClass7TE.A05((float) context.getResources().getConfiguration().screenWidthDp, AnonymousClass7TF.A0E(context).density);
    }

    public final void A05(int i, int i2) {
        super.A05(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), AnonymousClass972.MUTABLE_FLAG_MASK), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), AnonymousClass972.MUTABLE_FLAG_MASK));
    }

    public final void A06(C286575Wy r3, int i) {
        int i2;
        r3.ExV(-857613600);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r3, this) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1782097177, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            C51967G9n.A1P(r3, getContent(), 0);
            if (0fL.A02()) {
                0fL.A00(-751951531);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, this, i, 8);
        }
    }

    public final void A07(boolean z, int i, int i2, int i3, int i4) {
        super.A07(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            WindowManager.LayoutParams layoutParams = this.A0A;
            layoutParams.width = childAt.getMeasuredWidth();
            layoutParams.height = childAt.getMeasuredHeight();
            this.A0B.updateViewLayout(this, layoutParams);
        }
    }

    public final void A08() {
        C268064ch parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null && parentLayoutCoordinates.COx()) {
            long Bwh = parentLayoutCoordinates.Bwh();
            long Cgb = parentLayoutCoordinates.Cgb(0);
            long A002 = AnonymousClass5TW.A00(Math.round(C289295dM.A01(Cgb)), Math.round(C289295dM.A02(Cgb)));
            int i = (int) (A002 >> 32);
            int A022 = C51968G9o.A02(A002);
            C56558I1m i1m = new C56558I1m(i, A022, i + ((int) (Bwh >> 32)), C289005cr.A00(Bwh) + A022);
            if (!i1m.equals(this.A06)) {
                this.A06 = i1m;
                A09();
            }
        }
    }

    public final void A0A(C268064ch r1) {
        setParentLayoutCoordinates(r1);
        A08();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && getKeyDispatcherState() != null) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                C62320sa r0 = this.A05;
                if (r0 != null) {
                    r0.invoke();
                    return true;
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(2139524641);
        super.onAttachedToWindow();
        AnonymousClass5TE r1 = this.A0G;
        r1.A00 = AnonymousClass5PH.A01(r1.A08);
        if (Build.VERSION.SDK_INT >= 33) {
            Object obj = this.A03;
            if (obj == null) {
                obj = C56610I4k.A00(this.A05);
                this.A03 = obj;
            }
            C56610I4k.A01(this, obj);
        }
        AnonymousClass0fD.A0D(-723691854, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-335423979);
        super.onDetachedFromWindow();
        AnonymousClass5TE r1 = this.A0G;
        C285105Ps r0 = r1.A00;
        if (r0 != null) {
            r0.dispose();
        }
        r1.A01();
        if (Build.VERSION.SDK_INT >= 33) {
            C56610I4k.A02(this, this.A03);
        }
        this.A03 = null;
        AnonymousClass0fD.A0D(1433102861, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A052 = AnonymousClass0fD.A05(-958499268);
        boolean z = true;
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= AnonymousClass7TE.A02(this) || motionEvent.getY() < 0.0f || motionEvent.getY() >= AnonymousClass7TE.A03(this))) {
                C62320sa r0 = this.A05;
                if (r0 != null) {
                    r0.invoke();
                }
                i = -240948272;
                AnonymousClass0fD.A0C(i, A052);
                return z;
            } else if (motionEvent.getAction() == 4) {
                C62320sa r02 = this.A05;
                if (r02 != null) {
                    r02.invoke();
                }
                i = -2012280296;
                AnonymousClass0fD.A0C(i, A052);
                return z;
            }
        }
        z = super.onTouchEvent(motionEvent);
        i = 1611794680;
        AnonymousClass0fD.A0C(i, A052);
        return z;
    }

    public final void setContent(AnonymousClass5PL r2, 0sL r3) {
        setParentCompositionContext(r2);
        setContent(r3);
        this.A07 = true;
    }

    public final void setParentLayoutDirection(AnonymousClass5Q8 r1) {
        this.A00 = r1;
    }

    public final void setPositionProvider(C59529JNb jNb) {
        this.A01 = jNb;
    }

    public final void setTestTag(String str) {
        this.A04 = str;
    }

    private final void setContent(0sL r2) {
        this.A0C.Epw(r2);
    }
}
