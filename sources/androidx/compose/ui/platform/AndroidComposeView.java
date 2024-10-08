package androidx.compose.ui.platform;

import X.002;
import X.03v;
import X.0Yw;
import X.0fg;
import X.0qQ;
import X.0sP;
import X.0vr;
import X.0vu;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass07V;
import X.AnonymousClass07Z;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0g9;
import X.AnonymousClass5PH;
import X.AnonymousClass5Q2;
import X.AnonymousClass5Q5;
import X.AnonymousClass5Q8;
import X.AnonymousClass5QG;
import X.AnonymousClass5QL;
import X.AnonymousClass5QM;
import X.AnonymousClass5QN;
import X.AnonymousClass5QS;
import X.AnonymousClass5QT;
import X.AnonymousClass5QU;
import X.AnonymousClass5QV;
import X.AnonymousClass5QW;
import X.AnonymousClass5QX;
import X.AnonymousClass5QY;
import X.AnonymousClass5QZ;
import X.AnonymousClass5Qo;
import X.AnonymousClass5R0;
import X.AnonymousClass5R2;
import X.AnonymousClass5R3;
import X.AnonymousClass5R5;
import X.AnonymousClass5R6;
import X.AnonymousClass5RG;
import X.AnonymousClass5RP;
import X.AnonymousClass5S4;
import X.AnonymousClass5SI;
import X.AnonymousClass5SJ;
import X.AnonymousClass5SN;
import X.AnonymousClass5SP;
import X.AnonymousClass5T0;
import X.AnonymousClass5T1;
import X.AnonymousClass5T2;
import X.AnonymousClass5T4;
import X.AnonymousClass5T8;
import X.AnonymousClass5T9;
import X.AnonymousClass5TA;
import X.AnonymousClass5TB;
import X.AnonymousClass5TD;
import X.AnonymousClass5TE;
import X.AnonymousClass5TF;
import X.AnonymousClass5TN;
import X.AnonymousClass5TO;
import X.AnonymousClass5TT;
import X.AnonymousClass5TV;
import X.AnonymousClass5TW;
import X.AnonymousClass5TX;
import X.AnonymousClass5V5;
import X.AnonymousClass5V6;
import X.AnonymousClass5V7;
import X.AnonymousClass5V8;
import X.AnonymousClass5V9;
import X.AnonymousClass5VA;
import X.AnonymousClass5VD;
import X.AnonymousClass5VL;
import X.AnonymousClass5VM;
import X.AnonymousClass5VN;
import X.AnonymousClass5VP;
import X.AnonymousClass5VQ;
import X.AnonymousClass5VR;
import X.AnonymousClass5VS;
import X.AnonymousClass5VT;
import X.AnonymousClass5WH;
import X.AnonymousClass5XH;
import X.AnonymousClass5XJ;
import X.AnonymousClass5XL;
import X.AnonymousClass6FQ;
import X.AnonymousClass9L8;
import X.C13907Tl7;
import X.C262094Cc;
import X.C267794cD;
import X.C267944cV;
import X.C268024cd;
import X.C268104cl;
import X.C268114cm;
import X.C268124co;
import X.C268134cp;
import X.C268144cr;
import X.C268794e0;
import X.C270284gU;
import X.C273654mx;
import X.C284895Os;
import X.C284905Ot;
import X.C284945Oz;
import X.C285045Pl;
import X.C285105Ps;
import X.C285195Qd;
import X.C285245Qk;
import X.C285265Qm;
import X.C285275Qn;
import X.C285335Qw;
import X.C285345Qx;
import X.C285355Qy;
import X.C285795Ss;
import X.C285805St;
import X.C285825Sw;
import X.C285845Sy;
import X.C285855Sz;
import X.C285865Ta;
import X.C285875Tb;
import X.C285885Tc;
import X.C285895Td;
import X.C285905Te;
import X.C286205Ui;
import X.C286215Uj;
import X.C286225Uk;
import X.C286235Ul;
import X.C286245Um;
import X.C286255Un;
import X.C286305Uu;
import X.C286385Wd;
import X.C286395We;
import X.C286405Wf;
import X.C288985co;
import X.C289195dB;
import X.C289295dM;
import X.C289325dP;
import X.C289385dV;
import X.C289465dd;
import X.C290045ef;
import X.C290175es;
import X.C290195eu;
import X.C298445tR;
import X.C305026Gd;
import X.C318126oR;
import X.C377189Kw;
import X.C41576Awq;
import X.C41674AyR;
import X.C54744HRc;
import X.C55795Hnb;
import X.C56608I4i;
import X.C56664I6t;
import X.C58718IwR;
import X.C60340gF;
import X.C62320sa;
import X.C63120yJ;
import X.C71362ch;
import X.C71372cj;
import X.GLV;
import X.GNF;
import X.GQJ;
import X.GQK;
import X.GSM;
import X.GSS;
import X.I1T;
import X.I2C;
import X.I2D;
import X.I2E;
import X.I6C;
import X.SN3;
import X.XY5;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.key.KeyInputElement;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Constraints;
import com.facebook.common.dextricks.Constants;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AndroidComposeView extends ViewGroup implements C268124co, C268134cp, C13907Tl7, ViewRootForTest {
    public static Class A1H;
    public static Method A1I;
    public long A00;
    public long A01;
    public long A02;
    public MotionEvent A03;
    public AndroidContentCaptureManager A04;
    public C262094Cc A05;
    public 0sP A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public long A0D;
    public long A0E = 9205357640488583168L;
    public C305026Gd A0F;
    public GSS A0G;
    public Constraints A0H;
    public List A0I;
    public 0sP A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O = true;
    public final AnonymousClass5T9 A0P;
    public final AnonymousClass5T0 A0Q;
    public final AnonymousClass5Qo A0R;
    public final AnonymousClass5QZ A0S;
    public final C285855Sz A0T;
    public final AnonymousClass5V6 A0U;
    public final AnonymousClass5V7 A0V;
    public final C286405Wf A0W;
    public final AnonymousClass5VA A0X;
    public final AnonymousClass5R6 A0Y;
    public final AnonymousClass5Q2 A0Z;
    public final AnonymousClass5TN A0a;
    public final AnonymousClass5TD A0b;
    public final C285825Sw A0c;
    public final AnonymousClass5TB A0d;
    public final AnonymousClass5VQ A0e;
    public final AndroidComposeViewAccessibilityDelegateCompat A0f;
    public final AnonymousClass5VT A0g;
    public final C286225Uk A0h;
    public final AnonymousClass5VM A0i;
    public final AnonymousClass5RG A0j;
    public final C285335Qw A0k;
    public final AnonymousClass5SP A0l;
    public final C286245Um A0m;
    public final C286205Ui A0n;
    public final float[] A0o;
    public final float[] A0p;
    public final ViewTreeObserver.OnGlobalLayoutListener A0q;
    public final ViewTreeObserver.OnScrollChangedListener A0r;
    public final ViewTreeObserver.OnTouchModeChangeListener A0s;
    public final C284945Oz A0t;
    public final C284945Oz A0u;
    public final C284945Oz A0v;
    public final C284945Oz A0w;
    public final C270284gU A0x;
    public final C285045Pl A0y;
    public final Modifier A0z;
    public final Modifier A10;
    public final AnonymousClass5R2 A11;
    public final AnonymousClass5T1 A12;
    public final AnonymousClass5T2 A13;
    public final C268144cr A14;
    public final C285275Qn A15;
    public final AnonymousClass5VP A16;
    public final C290045ef A17;
    public final EmptySemanticsElement A18;
    public final AnonymousClass5QN A19;
    public final C285895Td A1A;
    public final Runnable A1B;
    public final List A1C;
    public final AtomicReference A1D;
    public final C62320sa A1E;
    public final float[] A1F;
    public final int[] A1G;

    public static final void A06(MotionEvent motionEvent, AndroidComposeView androidComposeView, int i, long j, boolean z) {
        AndroidComposeView androidComposeView2;
        int buttonState;
        long downTime;
        int i2;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        int i3 = -1;
        int i4 = i;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent.getActionIndex();
            }
        } else if (!(i4 == 9 || i4 == 10)) {
            i3 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        int i5 = 0;
        if (i3 >= 0) {
            i5 = 1;
        }
        int i6 = pointerCount - i5;
        if (i6 != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                pointerPropertiesArr[i7] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i6];
            for (int i8 = 0; i8 < i6; i8++) {
                pointerCoordsArr[i8] = new MotionEvent.PointerCoords();
            }
            int i9 = 0;
            while (true) {
                androidComposeView2 = androidComposeView;
                if (i9 >= i6) {
                    break;
                }
                if (i3 >= 0) {
                    i2 = 1;
                    if (i9 >= i3) {
                        int i10 = i2 + i9;
                        motionEvent.getPointerProperties(i10, pointerPropertiesArr[i9]);
                        MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i9];
                        motionEvent.getPointerCoords(i10, pointerCoords);
                        long Cga = androidComposeView.Cga(C289325dP.A00(pointerCoords.x, pointerCoords.y));
                        pointerCoords.x = C289295dM.A01(Cga);
                        pointerCoords.y = C289295dM.A02(Cga);
                        i9++;
                    }
                }
                i2 = 0;
                int i102 = i2 + i9;
                motionEvent.getPointerProperties(i102, pointerPropertiesArr[i9]);
                MotionEvent.PointerCoords pointerCoords2 = pointerCoordsArr[i9];
                motionEvent.getPointerCoords(i102, pointerCoords2);
                long Cga2 = androidComposeView.Cga(C289325dP.A00(pointerCoords2.x, pointerCoords2.y));
                pointerCoords2.x = C289295dM.A01(Cga2);
                pointerCoords2.y = C289295dM.A02(Cga2);
                i9++;
            }
            if (z) {
                buttonState = 0;
            } else {
                buttonState = motionEvent.getButtonState();
            }
            long j2 = j;
            if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
                downTime = j2;
            } else {
                downTime = motionEvent.getDownTime();
            }
            MotionEvent obtain = MotionEvent.obtain(downTime, j2, i4, i6, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent2.getYPrecision(), motionEvent2.getDeviceId(), motionEvent2.getEdgeFlags(), motionEvent2.getSource(), motionEvent2.getFlags());
            GQK A002 = androidComposeView2.A12.A00(obtain, androidComposeView2);
            0qQ.A0A(A002);
            androidComposeView2.A13.A00(A002, androidComposeView2, true);
            obtain.recycle();
        }
    }

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.view.View, X.GSS] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C289195dB AMJ(androidx.compose.ui.graphics.layer.GraphicsLayer r8, X.C62320sa r9, X.0sL r10) {
        /*
            r7 = this;
            r4 = r7
            r3 = r8
            r5 = r9
            r6 = r10
            if (r8 == 0) goto L_0x000d
            r2 = 0
            X.5dK r1 = new X.5dK
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x000d:
            X.5VP r2 = r7.A16
        L_0x000f:
            java.lang.ref.ReferenceQueue r0 = r2.A01
            java.lang.ref.Reference r1 = r0.poll()
            if (r1 == 0) goto L_0x001d
            X.5Pl r0 = r2.A00
            r0.A0B(r1)
            goto L_0x000f
        L_0x001d:
            X.5Pl r1 = r2.A00
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0039
            int r0 = r0 + -1
            java.lang.Object r0 = r1.A00(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x001d
        L_0x0031:
            X.5dB r1 = (X.C289195dB) r1
            if (r1 == 0) goto L_0x003b
            r1.EJI(r9, r10)
            return r1
        L_0x0039:
            r1 = 0
            goto L_0x0031
        L_0x003b:
            boolean r0 = r7.isHardwareAccelerated()
            if (r0 == 0) goto L_0x0055
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 == r0) goto L_0x0055
            X.5Sz r2 = r7.A0T
            androidx.compose.ui.graphics.layer.GraphicsLayer r3 = r2.AM9()
            X.5dK r1 = new X.5dK
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0052:
            X.5dB r1 = (X.C289195dB) r1
            return r1
        L_0x0055:
            boolean r0 = r7.isHardwareAccelerated()
            if (r0 == 0) goto L_0x0068
            boolean r0 = r7.A0M
            if (r0 == 0) goto L_0x0068
            X.GWL r1 = new X.GWL     // Catch:{ all -> 0x0065 }
            r1.<init>(r7, r9, r10)     // Catch:{ all -> 0x0065 }
            goto L_0x00c2
        L_0x0065:
            r0 = 0
            r7.A0M = r0
        L_0x0068:
            X.GSS r0 = r7.A0G
            if (r0 != 0) goto L_0x00a0
            X.5dW r2 = X.C289385dV.A0K
            boolean r0 = X.C289385dV.A0H
            if (r0 != 0) goto L_0x007e
            android.content.Context r1 = r7.getContext()
            android.view.View r0 = new android.view.View
            r0.<init>(r1)
            r2.A00(r0)
        L_0x007e:
            boolean r1 = X.C289385dV.A0I
            android.content.Context r0 = r7.getContext()
            if (r1 == 0) goto L_0x00ad
            X.GSS r2 = new X.GSS
            r2.<init>(r0)
            r0 = 0
            r2.setClipChildren(r0)
            r1 = 2131433925(0x7f0b19c5, float:1.848965E38)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.setTag(r1, r0)
        L_0x009a:
            r7.A0G = r2
            r0 = -1
            r7.addView((android.view.View) r2, (int) r0)
        L_0x00a0:
            boolean r0 = X.C289385dV.A0H
            X.GSS r0 = r7.A0G
            X.0qQ.A0A(r0)
            X.5dV r1 = new X.5dV
            r1.<init>(r7, r0, r9, r10)
            goto L_0x0052
        L_0x00ad:
            X.GSh r2 = new X.GSh
            r2.<init>(r0)
            r0 = 0
            r2.setClipChildren(r0)
            r1 = 2131433925(0x7f0b19c5, float:1.848965E38)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.setTag(r1, r0)
            goto L_0x009a
        L_0x00c2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.AMJ(androidx.compose.ui.graphics.layer.GraphicsLayer, X.0sa, X.0sL):X.5dB");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JU, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1Hj Ezg(X.AnonymousClass4D7 r12, X.0sL r13) {
        /*
            r11 = this;
            r3 = 3
            boolean r0 = X.AnonymousClass9JU.A00(r3, r12)
            if (r0 == 0) goto L_0x0028
            r4 = r12
            X.9JU r4 = (X.AnonymousClass9JU) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 == r1) goto L_0x004c
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0028:
            r0 = 42
            X.9JU r4 = new X.9JU
            r4.<init>(r11, r12, r3, r0)
            goto L_0x0015
        L_0x0030:
            X.0eS.A00(r3)
            java.util.concurrent.atomic.AtomicReference r7 = r11.A1D
            r0 = 4
            X.9Kw r8 = new X.9Kw
            r8.<init>(r11, r0)
            r4.A00 = r1
            r9 = 0
            r10 = 5
            X.MHG r5 = new X.MHG
            r6 = r13
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
            java.lang.Object r0 = X.19E.A00(r4, r5)
            if (r0 != r2) goto L_0x004f
            return r2
        L_0x004c:
            X.0eS.A00(r3)
        L_0x004f:
            X.MCr r0 = new X.MCr
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.Ezg(X.4D7, X.0sL):X.1Hj");
    }

    public final void addView(View view) {
        addView(view, -1);
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return A03(this, i);
            }
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final void onDraw(Canvas canvas) {
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0141, code lost:
        if (r4 != r1) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0060, code lost:
        if (r8.getToolType(0) != 3) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A00(android.view.MotionEvent r21) {
        /*
            r20 = this;
            r9 = r20
            X.5VQ r0 = r9.A0e
            r9.removeCallbacks(r0)
            r2 = 0
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()     // Catch:{ all -> 0x0192 }
            r9.A00 = r0     // Catch:{ all -> 0x0192 }
            X.5VT r0 = r9.A0g     // Catch:{ all -> 0x0192 }
            float[] r3 = r9.A0o     // Catch:{ all -> 0x0192 }
            r0.AF3(r9, r3)     // Catch:{ all -> 0x0192 }
            float[] r0 = r9.A0p     // Catch:{ all -> 0x0192 }
            X.C298445tR.A00(r3, r0)     // Catch:{ all -> 0x0192 }
            r14 = r21
            float r1 = r14.getX()     // Catch:{ all -> 0x0192 }
            float r0 = r14.getY()     // Catch:{ all -> 0x0192 }
            long r0 = X.C289325dP.A00(r1, r0)     // Catch:{ all -> 0x0192 }
            long r4 = X.AnonymousClass5S4.A00(r3, r0)     // Catch:{ all -> 0x0192 }
            float r3 = r14.getRawX()     // Catch:{ all -> 0x0192 }
            float r0 = X.C289295dM.A01(r4)     // Catch:{ all -> 0x0192 }
            float r3 = r3 - r0
            float r1 = r14.getRawY()     // Catch:{ all -> 0x0192 }
            float r0 = X.C289295dM.A02(r4)     // Catch:{ all -> 0x0192 }
            float r1 = r1 - r0
            long r0 = X.C289325dP.A00(r3, r1)     // Catch:{ all -> 0x0192 }
            r9.A02 = r0     // Catch:{ all -> 0x0192 }
            r13 = 1
            r9.A0K = r13     // Catch:{ all -> 0x0192 }
            r9.Co0(r2)     // Catch:{ all -> 0x0192 }
            java.lang.String r1 = "AndroidOwner:onTouch"
            r0 = -1881957031(0xffffffff8fd39d59, float:-2.0866814E-29)
            X.0fg.A01(r1, r0)     // Catch:{ all -> 0x0192 }
            int r4 = r14.getActionMasked()     // Catch:{ all -> 0x018a }
            android.view.MotionEvent r8 = r9.A03     // Catch:{ all -> 0x018a }
            r3 = 3
            if (r8 == 0) goto L_0x0062
            int r0 = r8.getToolType(r2)     // Catch:{ all -> 0x018a }
            r5 = 1
            if (r0 == r3) goto L_0x0063
        L_0x0062:
            r5 = 0
        L_0x0063:
            r10 = 10
            if (r8 == 0) goto L_0x00b7
            int r1 = r8.getSource()     // Catch:{ all -> 0x018a }
            int r0 = r14.getSource()     // Catch:{ all -> 0x018a }
            if (r1 != r0) goto L_0x007b
            int r1 = r8.getToolType(r2)     // Catch:{ all -> 0x018a }
            int r0 = r14.getToolType(r2)     // Catch:{ all -> 0x018a }
            if (r1 == r0) goto L_0x00b7
        L_0x007b:
            int r0 = r8.getButtonState()     // Catch:{ all -> 0x018a }
            if (r0 != 0) goto L_0x0096
            int r1 = r8.getActionMasked()     // Catch:{ all -> 0x018a }
            if (r1 == 0) goto L_0x0096
            r0 = 2
            if (r1 == r0) goto L_0x0096
            r0 = 6
            if (r1 == r0) goto L_0x0096
            int r0 = r8.getActionMasked()     // Catch:{ all -> 0x018a }
            if (r0 == r10) goto L_0x00b7
            if (r5 == 0) goto L_0x00b7
            goto L_0x00b0
        L_0x0096:
            X.5T2 r1 = r9.A13     // Catch:{ all -> 0x018a }
            boolean r0 = r1.A00     // Catch:{ all -> 0x018a }
            if (r0 != 0) goto L_0x00b7
            X.5T6 r0 = r1.A02     // Catch:{ all -> 0x018a }
            X.01c r0 = r0.A00     // Catch:{ all -> 0x018a }
            r0.A07()     // Catch:{ all -> 0x018a }
            X.5T3 r0 = r1.A01     // Catch:{ all -> 0x018a }
            X.5T4 r0 = r0.A01     // Catch:{ all -> 0x018a }
            r0.A00()     // Catch:{ all -> 0x018a }
            X.5Pl r0 = r0.A00     // Catch:{ all -> 0x018a }
            r0.A01()     // Catch:{ all -> 0x018a }
            goto L_0x00b7
        L_0x00b0:
            long r11 = r8.getEventTime()     // Catch:{ all -> 0x018a }
            A06(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x018a }
        L_0x00b7:
            int r1 = r14.getToolType(r2)     // Catch:{ all -> 0x018a }
            r0 = 0
            if (r1 != r3) goto L_0x00bf
            r0 = 1
        L_0x00bf:
            r1 = 9
            if (r5 != 0) goto L_0x00db
            if (r0 == 0) goto L_0x00db
            if (r4 == r3) goto L_0x00db
            if (r4 == r1) goto L_0x00db
            boolean r0 = r9.A0G(r14)     // Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x00db
            long r17 = r14.getEventTime()     // Catch:{ all -> 0x018a }
            r15 = r9
            r16 = r1
            r19 = r13
            A06(r14, r15, r16, r17, r19)     // Catch:{ all -> 0x018a }
        L_0x00db:
            if (r8 == 0) goto L_0x00e0
            r8.recycle()     // Catch:{ all -> 0x018a }
        L_0x00e0:
            android.view.MotionEvent r0 = r9.A03     // Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x0177
            int r0 = r0.getAction()     // Catch:{ all -> 0x018a }
            if (r0 != r10) goto L_0x0177
            android.view.MotionEvent r0 = r9.A03     // Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x00ff
            int r8 = r0.getPointerId(r2)     // Catch:{ all -> 0x018a }
        L_0x00f2:
            int r0 = r14.getAction()     // Catch:{ all -> 0x018a }
            if (r0 != r1) goto L_0x0110
            int r0 = r14.getHistorySize()     // Catch:{ all -> 0x018a }
            if (r0 != 0) goto L_0x0110
            goto L_0x0101
        L_0x00ff:
            r8 = -1
            goto L_0x00f2
        L_0x0101:
            if (r8 < 0) goto L_0x0177
            X.5T1 r1 = r9.A12     // Catch:{ all -> 0x018a }
            android.util.SparseBooleanArray r0 = r1.A03     // Catch:{ all -> 0x018a }
            r0.delete(r8)     // Catch:{ all -> 0x018a }
            android.util.SparseLongArray r0 = r1.A04     // Catch:{ all -> 0x018a }
            r0.delete(r8)     // Catch:{ all -> 0x018a }
            goto L_0x0177
        L_0x0110:
            int r0 = r14.getAction()     // Catch:{ all -> 0x018a }
            if (r0 != 0) goto L_0x0177
            int r0 = r14.getHistorySize()     // Catch:{ all -> 0x018a }
            if (r0 != 0) goto L_0x0177
            android.view.MotionEvent r0 = r9.A03     // Catch:{ all -> 0x018a }
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L_0x013b
            float r3 = r0.getX()     // Catch:{ all -> 0x018a }
        L_0x0126:
            android.view.MotionEvent r0 = r9.A03     // Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x012e
            float r4 = r0.getY()     // Catch:{ all -> 0x018a }
        L_0x012e:
            float r0 = r14.getX()     // Catch:{ all -> 0x018a }
            float r1 = r14.getY()     // Catch:{ all -> 0x018a }
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0143
            goto L_0x013e
        L_0x013b:
            r3 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0126
        L_0x013e:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r7 = 0
            if (r0 == 0) goto L_0x0144
        L_0x0143:
            r7 = 1
        L_0x0144:
            android.view.MotionEvent r0 = r9.A03     // Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x0156
            long r5 = r0.getEventTime()     // Catch:{ all -> 0x018a }
        L_0x014c:
            long r3 = r14.getEventTime()     // Catch:{ all -> 0x018a }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x015a
            goto L_0x0159
        L_0x0156:
            r5 = -1
            goto L_0x014c
        L_0x0159:
            r0 = 1
        L_0x015a:
            if (r7 != 0) goto L_0x015e
            if (r0 == 0) goto L_0x0177
        L_0x015e:
            if (r8 < 0) goto L_0x016c
            X.5T1 r1 = r9.A12     // Catch:{ all -> 0x018a }
            android.util.SparseBooleanArray r0 = r1.A03     // Catch:{ all -> 0x018a }
            r0.delete(r8)     // Catch:{ all -> 0x018a }
            android.util.SparseLongArray r0 = r1.A04     // Catch:{ all -> 0x018a }
            r0.delete(r8)     // Catch:{ all -> 0x018a }
        L_0x016c:
            X.5T2 r0 = r9.A13     // Catch:{ all -> 0x018a }
            X.5T3 r0 = r0.A01     // Catch:{ all -> 0x018a }
            X.5T4 r0 = r0.A01     // Catch:{ all -> 0x018a }
            X.5Pl r0 = r0.A00     // Catch:{ all -> 0x018a }
            r0.A01()     // Catch:{ all -> 0x018a }
        L_0x0177:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r14)     // Catch:{ all -> 0x018a }
            r9.A03 = r0     // Catch:{ all -> 0x018a }
            int r1 = A01(r14, r9)     // Catch:{ all -> 0x018a }
            r0 = -1029101029(0xffffffffc2a92a1b, float:-84.58224)
            X.0fg.A00(r0)     // Catch:{ all -> 0x0192 }
            r9.A0K = r2
            return r1
        L_0x018a:
            r1 = move-exception
            r0 = 1318469015(0x4e963d97, float:1.26030938E9)
            X.0fg.A00(r0)     // Catch:{ all -> 0x0192 }
            throw r1     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r0 = move-exception
            r9.A0K = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A00(android.view.MotionEvent):int");
    }

    public static final int A01(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        Object obj;
        if (androidComposeView.A0N) {
            androidComposeView.A0N = false;
            C285335Qw.A01.Epw(new C285355Qy(motionEvent.getMetaState()));
        }
        AnonymousClass5T1 r3 = androidComposeView.A12;
        GQK A002 = r3.A00(motionEvent, androidComposeView);
        if (A002 != null) {
            List list = A002.A01;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    obj = list.get(size);
                    if (!((GQJ) obj).A0A) {
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    } else {
                        break;
                    }
                }
            }
            obj = null;
            GQJ gqj = (GQJ) obj;
            if (gqj != null) {
                androidComposeView.A0E = gqj.A04;
            }
            int A003 = androidComposeView.A13.A00(A002, androidComposeView, androidComposeView.A0G(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (A003 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                r3.A03.delete(pointerId);
                r3.A04.delete(pointerId);
            }
            return A003;
        }
        AnonymousClass5T2 r1 = androidComposeView.A13;
        if (r1.A00) {
            return 0;
        }
        r1.A02.A00.A07();
        AnonymousClass5T4 r0 = r1.A01.A01;
        r0.A00();
        r0.A00.A01();
        return 0;
    }

    private final View A03(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (0qQ.A0K(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View A032 = A03(viewGroup.getChildAt(i2), i);
                    if (A032 != null) {
                        return A032;
                    }
                }
            }
        }
        return null;
    }

    public static final void A08(AccessibilityNodeInfo accessibilityNodeInfo, AndroidComposeView androidComposeView, String str, int i) {
        C63120yJ r0;
        int i2;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = androidComposeView.A0f;
        if (str.equals(C273654mx.A00(538))) {
            r0 = androidComposeViewAccessibilityDelegateCompat.A05;
        } else if (str.equals(C273654mx.A00(537))) {
            r0 = androidComposeViewAccessibilityDelegateCompat.A04;
        } else {
            return;
        }
        int A032 = r0.A03(i);
        if (A032 >= 0 && (i2 = r0.A03[A032]) != -1) {
            accessibilityNodeInfo.getExtras().putInt(str, i2);
        }
    }

    private final void A0A(AnonymousClass5R6 r5) {
        int i = 0;
        this.A0a.A0C(r5, false);
        C285045Pl A0A2 = r5.A0A();
        int i2 = A0A2.A00;
        if (i2 > 0) {
            Object[] objArr = A0A2.A02;
            do {
                A0A((AnonymousClass5R6) objArr[i]);
                i++;
            } while (i < i2);
        }
    }

    public static final void A0D(AndroidComposeView androidComposeView) {
        if (!androidComposeView.A0K) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != androidComposeView.A00) {
                androidComposeView.A00 = currentAnimationTimeMillis;
                AnonymousClass5VT r0 = androidComposeView.A0g;
                float[] fArr = androidComposeView.A0o;
                r0.AF3(androidComposeView, fArr);
                C298445tR.A00(fArr, androidComposeView.A0p);
                ViewParent parent = androidComposeView.getParent();
                View view = androidComposeView;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = view.getParent();
                }
                int[] iArr = androidComposeView.A1G;
                view.getLocationOnScreen(iArr);
                float f = (float) iArr[0];
                float f2 = (float) iArr[1];
                view.getLocationInWindow(iArr);
                androidComposeView.A02 = C289325dP.A00(f - ((float) iArr[0]), f2 - ((float) iArr[1]));
            }
        }
    }

    public static final void A0E(AndroidComposeView androidComposeView) {
        int[] iArr = androidComposeView.A1G;
        androidComposeView.getLocationOnScreen(iArr);
        long j = androidComposeView.A0D;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        boolean z = false;
        int i3 = iArr[0];
        if (!(i == i3 && i2 == iArr[1])) {
            androidComposeView.A0D = AnonymousClass5TW.A00(i3, iArr[1]);
            if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
                androidComposeView.A0Y.A0U.A0J.A0M();
                z = true;
            }
        }
        AnonymousClass5TN r2 = androidComposeView.A0a;
        if (z) {
            AnonymousClass5TT r0 = r2.A06;
            AnonymousClass5R6 r1 = r2.A05;
            C285045Pl r02 = r0.A01;
            r02.A01();
            r02.A09(r1);
            r1.A0M = true;
        }
        r2.A06.A01();
    }

    /* access modifiers changed from: private */
    public final AnonymousClass5XH get_viewTreeOwners() {
        return (AnonymousClass5XH) this.A0t.getValue();
    }

    private void setDensity(C268024cd r2) {
        this.A0u.Epw(r2);
    }

    private void setFontFamilyResolver(C286305Uu r2) {
        this.A0v.Epw(r2);
    }

    private void setLayoutDirection(AnonymousClass5Q8 r2) {
        this.A0w.Epw(r2);
    }

    private final void set_viewTreeOwners(AnonymousClass5XH r2) {
        this.A0t.Epw(r2);
    }

    public final void A0K(C289195dB r5) {
        if (this.A0G != null) {
            boolean z = C289385dV.A0H;
        }
        AnonymousClass5VP r3 = this.A16;
        while (true) {
            ReferenceQueue referenceQueue = r3.A01;
            Reference poll = referenceQueue.poll();
            if (poll != null) {
                r3.A00.A0B(poll);
            } else {
                r3.A00.A09(new WeakReference(r5, referenceQueue));
                return;
            }
        }
    }

    public final void A0L(C289195dB r2, boolean z) {
        List list;
        boolean z2 = this.A0L;
        if (z) {
            if (!z2) {
                list = this.A1C;
            } else {
                list = this.A0I;
                if (list == null) {
                    list = new ArrayList();
                    this.A0I = list;
                }
            }
            list.add(r2);
        } else if (!z2) {
            this.A1C.remove(r2);
            List list2 = this.A0I;
            if (list2 != null) {
                list2.remove(r2);
            }
        }
    }

    public final void Co0(boolean z) {
        AnonymousClass5TN r2 = this.A0a;
        if ((!r2.A04.A01()) || r2.A06.A01.A00 != 0) {
            0fg.A01("AndroidOwner:measureAndLayout", 767398991);
            C62320sa r0 = null;
            if (z) {
                try {
                    r0 = this.A1E;
                } catch (Throwable th) {
                    0fg.A00(1535746549);
                    throw th;
                }
            }
            if (r2.A0D(r0)) {
                requestLayout();
            }
            r2.A06.A01();
            if (this.A08) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.A08 = false;
            }
            0fg.A00(-969295948);
        }
    }

    public final void Co1(AnonymousClass5R6 r6, long j) {
        AnonymousClass5TN r3;
        String A002;
        0fg.A01("AndroidOwner:measureAndLayout", 1618529064);
        try {
            r3 = this.A0a;
            if (!r6.A0L) {
                AnonymousClass5R6 r1 = r3.A05;
                if (!(!r6.equals(r1))) {
                    A002 = "measureAndLayout called on root";
                } else if (r1.A0A == null) {
                    A002 = C273654mx.A00(878);
                } else if (!r1.A0U.A0J.A0E) {
                    A002 = C273654mx.A00(879);
                } else if (!(!r3.A02)) {
                    A002 = C273654mx.A00(877);
                } else {
                    if (r3.A00 != null) {
                        r3.A02 = true;
                        r3.A01 = false;
                        AnonymousClass5TO r12 = r3.A04;
                        r12.A00.A00(r6);
                        r12.A01.A00(r6);
                        if ((AnonymousClass5TN.A08(r6, new Constraints(j)) || r6.A0U.A0E) && 0qQ.A0K(r6.A0D(), true)) {
                            r6.A0N();
                        }
                        AnonymousClass5TN.A00(r6, r3);
                        AnonymousClass5TN.A09(r6, new Constraints(j));
                        AnonymousClass5SI r13 = r6.A0U;
                        if (r13.A0A && r13.A0J.A0E) {
                            r6.A0Q();
                            r3.A06.A01.A09(r6);
                            r6.A0M = true;
                        }
                        AnonymousClass5TN.A05(r3);
                        r3.A02 = false;
                        r3.A01 = false;
                    }
                    AnonymousClass5TN.A04(r3);
                }
                I2E.A00(A002);
                th = AnonymousClass00P.createAndThrow();
                throw th;
            }
            if (!(!r3.A04.A01())) {
                r3.A06.A01();
                if (this.A08) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.A08 = false;
                }
            }
            0fg.A00(642791449);
        } catch (Throwable th) {
            0fg.A00(-1499958399);
            throw th;
        }
    }

    public final void DC6() {
        int i;
        if (this.A09) {
            AnonymousClass5TE r0 = this.A0b.A00;
            GNF gnf = GNF.A00;
            C285045Pl r9 = r0.A05;
            synchronized (r9) {
                int i2 = r9.A00;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    AnonymousClass5TF r5 = (AnonymousClass5TF) r9.A02[i4];
                    0vr r4 = r5.A04;
                    long[] jArr = r4.A02;
                    long[] jArr2 = jArr;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr2[i5];
                            if ((((j ^ -1) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i6 = 8 - (((i5 - length) ^ -1) >>> 31);
                                int i7 = 0;
                                while (true) {
                                    i = i6;
                                    if (i7 >= i) {
                                        break;
                                    }
                                    if ((j & 255) < 128) {
                                        int i8 = (i5 << 3) + i7;
                                        Object obj = r4.A03[i8];
                                        0vu r12 = (0vu) r4.A04[i8];
                                        boolean booleanValue = ((Boolean) gnf.invoke(obj)).booleanValue();
                                        if (booleanValue) {
                                            Object[] objArr = r12.A04;
                                            long[] jArr3 = r12.A03;
                                            long[] jArr4 = jArr3;
                                            int length2 = jArr3.length - 2;
                                            if (length2 >= 0) {
                                                int i9 = 0;
                                                while (true) {
                                                    long j2 = jArr4[i9];
                                                    if ((j2 & ((j2 ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                                                        int i10 = 8 - (((i9 - length2) ^ -1) >>> 31);
                                                        for (int i11 = 0; i11 < i10; i11++) {
                                                            if ((j2 & 255) < 128) {
                                                                AnonymousClass5TF.A01(r5, obj, objArr[(i9 << 3) + i11]);
                                                            }
                                                            j2 >>= 8;
                                                        }
                                                        if (i10 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i9 == length2) {
                                                        break;
                                                    }
                                                    i9++;
                                                }
                                            }
                                        }
                                        if (booleanValue) {
                                            r4.A06(i8);
                                        }
                                    }
                                    j >>= 8;
                                    i7++;
                                }
                                if (i != 8) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    if (r5.A04.A01 == 0) {
                        i3++;
                    } else if (i3 > 0) {
                        Object[] objArr2 = r9.A02;
                        objArr2[i4 - i3] = objArr2[i4];
                    }
                }
                int i12 = i2 - i3;
                0Yw.A0U(r9.A02, i12, i2);
                r9.A00 = i12;
            }
            this.A09 = false;
        }
        C305026Gd r02 = this.A0F;
        if (r02 != null) {
            A07(r02);
        }
        while (true) {
            C285045Pl r52 = this.A0y;
            int i13 = r52.A00;
            if (i13 != 0) {
                for (int i14 = 0; i14 < i13; i14++) {
                    Object[] objArr3 = r52.A02;
                    C62320sa r1 = (C62320sa) objArr3[i14];
                    objArr3[i14] = null;
                    if (r1 != null) {
                        r1.invoke();
                    }
                }
                r52.A03(0, i13);
            } else {
                return;
            }
        }
    }

    public final void DNA(AnonymousClass5R6 r4) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A0f;
        androidComposeViewAccessibilityDelegateCompat.A0G = true;
        if (androidComposeViewAccessibilityDelegateCompat.A0b()) {
            AndroidComposeViewAccessibilityDelegateCompat.A0F(r4, androidComposeViewAccessibilityDelegateCompat);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.A04;
        androidContentCaptureManager.A06 = true;
        if (androidContentCaptureManager.A03 != null && androidContentCaptureManager.A0A.add(r4)) {
            androidContentCaptureManager.A0F.FIG(C60340gF.A00);
        }
    }

    public final void Diy() {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A0f;
        androidComposeViewAccessibilityDelegateCompat.A0G = true;
        if (androidComposeViewAccessibilityDelegateCompat.A0b() && !androidComposeViewAccessibilityDelegateCompat.A0F) {
            androidComposeViewAccessibilityDelegateCompat.A0F = true;
            androidComposeViewAccessibilityDelegateCompat.A0L.post(androidComposeViewAccessibilityDelegateCompat.A0T);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.A04;
        androidContentCaptureManager.A06 = true;
        if (androidContentCaptureManager.A03 != null && !androidContentCaptureManager.A05) {
            androidContentCaptureManager.A05 = true;
            androidContentCaptureManager.A09.post(androidContentCaptureManager.A0E);
        }
    }

    public final void EBs(C62320sa r3) {
        C285045Pl r1 = this.A0y;
        if (!r1.A0A(r3)) {
            r1.A09(r3);
        }
    }

    public final void autofill(SparseArray sparseArray) {
        AnonymousClass5T9 r6 = this.A0P;
        if (r6 != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                if (autofillValue.isText()) {
                    AnonymousClass5T0 r1 = r6.A02;
                    autofillValue.getTextValue().toString();
                    r1.A00.get(Integer.valueOf(keyAt));
                } else {
                    boolean isDate = autofillValue.isDate();
                    String A002 = AnonymousClass000.A00(418);
                    if (isDate) {
                        throw new C318126oR(002.A0R(A002, "b/138604541: Add onFill() callback for date"));
                    } else if (autofillValue.isList()) {
                        throw new C318126oR(002.A0R(A002, "b/138604541: Add onFill() callback for list"));
                    } else if (autofillValue.isToggle()) {
                        throw new C318126oR(002.A0R(A002, "b/138604541:  Add onFill() callback for toggle"));
                    }
                }
            }
        }
    }

    public final boolean canScrollHorizontally(int i) {
        return this.A0f.A0c(this.A0E, i, false);
    }

    public final boolean canScrollVertically(int i) {
        return this.A0f.A0c(this.A0E, i, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:184:0x00d8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r2 = r19
            boolean r0 = r2.A07
            r4 = 8
            r3 = r20
            if (r0 == 0) goto L_0x0018
            java.lang.Runnable r1 = r2.A1B
            r2.removeCallbacks(r1)
            int r0 = r3.getActionMasked()
            if (r0 != r4) goto L_0x00ea
            r0 = 0
            r2.A07 = r0
        L_0x0018:
            int r0 = r3.getActionMasked()
            if (r0 != r4) goto L_0x0265
            boolean r0 = A0I(r3)
            if (r0 != 0) goto L_0x0265
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L_0x0265
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = r3.isFromSource(r0)
            if (r0 == 0) goto L_0x0259
            android.content.Context r0 = r2.getContext()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r0)
            r0 = 26
            float r0 = r3.getAxisValue(r0)
            float r15 = -r0
            float r0 = r1.getScaledVerticalScrollFactor()
            float r14 = r15 * r0
            float r0 = r1.getScaledHorizontalScrollFactor()
            float r15 = r15 * r0
            long r17 = r3.getEventTime()
            int r16 = r3.getDeviceId()
            X.Ht5 r13 = new X.Ht5
            r13.<init>(r14, r15, r16, r17)
            X.5QZ r1 = r2.A0S
            X.5QY r1 = (X.AnonymousClass5QY) r1
            X.5Qc r0 = r1.A03
            boolean r0 = r0.A01()
            r6 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0251
            X.4e0 r0 = r1.A01
            X.4e0 r1 = X.C56608I4i.A00(r0)
            r0 = 196(0xc4, float:2.75E-43)
            java.lang.String r3 = X.C273654mx.A00(r0)
            r12 = 16384(0x4000, float:2.2959E-41)
            r5 = 16
            r11 = 0
            if (r1 == 0) goto L_0x0263
            X.4cD r9 = r1.A03
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x024b
            X.5R6 r8 = X.AnonymousClass5WH.A02(r1)
            if (r8 == 0) goto L_0x00ef
        L_0x0087:
            X.5RP r0 = r8.A0W
            X.4cD r0 = r0.A02
            int r0 = r0.A00
            r0 = r0 & r12
            if (r0 == 0) goto L_0x00db
        L_0x0090:
            if (r9 == 0) goto L_0x00db
            int r0 = r9.A01
            r0 = r0 & r12
            if (r0 == 0) goto L_0x00d8
            r7 = r11
            r4 = r9
        L_0x0099:
            boolean r0 = r4 instanceof X.AnonymousClass5WD
            if (r0 != 0) goto L_0x00f0
            int r0 = r4.A01
            r0 = r0 & r12
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r4 instanceof X.C267944cV
            if (r0 == 0) goto L_0x00d1
            r0 = r4
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x00ac:
            if (r2 == 0) goto L_0x00ce
            int r0 = r2.A01
            r0 = r0 & r12
            if (r0 == 0) goto L_0x00b8
            int r1 = r1 + 1
            if (r1 != r6) goto L_0x00bb
            r4 = r2
        L_0x00b8:
            X.4cD r2 = r2.A02
            goto L_0x00ac
        L_0x00bb:
            if (r7 != 0) goto L_0x00c4
            X.4cD[] r0 = new X.C267794cD[r5]
            X.5Pl r7 = new X.5Pl
            r7.<init>(r0)
        L_0x00c4:
            if (r4 == 0) goto L_0x00ca
            r7.A09(r4)
            r4 = r11
        L_0x00ca:
            r7.A09(r2)
            goto L_0x00b8
        L_0x00ce:
            if (r1 != r6) goto L_0x00d1
            goto L_0x00d5
        L_0x00d1:
            X.4cD r4 = X.AnonymousClass5WH.A00(r7)
        L_0x00d5:
            if (r4 == 0) goto L_0x00d8
            goto L_0x0099
        L_0x00d8:
            X.4cD r9 = r9.A04
            goto L_0x0090
        L_0x00db:
            X.5R6 r8 = r8.A0B()
            if (r8 == 0) goto L_0x00ef
            X.5RP r0 = r8.A0W
            if (r0 == 0) goto L_0x00e8
            X.4cD r9 = r0.A05
            goto L_0x0087
        L_0x00e8:
            r9 = r11
            goto L_0x0087
        L_0x00ea:
            r1.run()
            goto L_0x0018
        L_0x00ef:
            r4 = r11
        L_0x00f0:
            X.5WD r4 = (X.AnonymousClass5WD) r4
            if (r4 == 0) goto L_0x0263
            r8 = r4
            X.4cD r8 = (X.C267794cD) r8
            X.4cD r1 = r8.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0245
            X.4cD r10 = r1.A04
            X.5R6 r9 = X.AnonymousClass5WH.A02(r4)
            r3 = r11
            if (r9 == 0) goto L_0x0186
        L_0x0106:
            X.5RP r0 = r9.A0W
            X.4cD r0 = r0.A02
            int r0 = r0.A00
            r0 = r0 & r12
            if (r0 == 0) goto L_0x0164
        L_0x010f:
            if (r10 == 0) goto L_0x0164
            int r0 = r10.A01
            r0 = r0 & r12
            if (r0 == 0) goto L_0x0161
            r4 = r10
            r7 = r11
        L_0x0118:
            boolean r0 = r4 instanceof X.AnonymousClass5WD
            if (r0 == 0) goto L_0x012d
            if (r3 != 0) goto L_0x0123
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0123:
            r3.add(r4)
        L_0x0126:
            X.4cD r4 = X.AnonymousClass5WH.A00(r7)
        L_0x012a:
            if (r4 == 0) goto L_0x0161
            goto L_0x0118
        L_0x012d:
            int r0 = r4.A01
            r0 = r0 & r12
            if (r0 == 0) goto L_0x0126
            boolean r0 = r4 instanceof X.C267944cV
            if (r0 == 0) goto L_0x0126
            r0 = r4
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x013c:
            if (r2 == 0) goto L_0x015e
            int r0 = r2.A01
            r0 = r0 & r12
            if (r0 == 0) goto L_0x0148
            int r1 = r1 + 1
            if (r1 != r6) goto L_0x014b
            r4 = r2
        L_0x0148:
            X.4cD r2 = r2.A02
            goto L_0x013c
        L_0x014b:
            if (r7 != 0) goto L_0x0154
            X.4cD[] r0 = new X.C267794cD[r5]
            X.5Pl r7 = new X.5Pl
            r7.<init>(r0)
        L_0x0154:
            if (r4 == 0) goto L_0x015a
            r7.A09(r4)
            r4 = r11
        L_0x015a:
            r7.A09(r2)
            goto L_0x0148
        L_0x015e:
            if (r1 != r6) goto L_0x0126
            goto L_0x012a
        L_0x0161:
            X.4cD r10 = r10.A04
            goto L_0x010f
        L_0x0164:
            X.5R6 r9 = r9.A0B()
            if (r9 == 0) goto L_0x0173
            X.5RP r0 = r9.A0W
            if (r0 == 0) goto L_0x0171
            X.4cD r10 = r0.A05
            goto L_0x0106
        L_0x0171:
            r10 = r11
            goto L_0x0106
        L_0x0173:
            if (r3 == 0) goto L_0x0186
            int r0 = r3.size()
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x0186
        L_0x017d:
            int r0 = r1 + -1
            r3.get(r1)
            if (r0 < 0) goto L_0x0186
            r1 = r0
            goto L_0x017d
        L_0x0186:
            X.4cD r7 = r8.A03
            r4 = r11
        L_0x0189:
            if (r7 == 0) goto L_0x01c8
            boolean r0 = r7 instanceof X.AnonymousClass5WD
            if (r0 != 0) goto L_0x01c3
            int r0 = r7.A01
            r0 = r0 & r12
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r7 instanceof X.C267944cV
            if (r0 == 0) goto L_0x01c3
            r0 = r7
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x019e:
            if (r2 == 0) goto L_0x01c0
            int r0 = r2.A01
            r0 = r0 & r12
            if (r0 == 0) goto L_0x01aa
            int r1 = r1 + 1
            if (r1 != r6) goto L_0x01ad
            r7 = r2
        L_0x01aa:
            X.4cD r2 = r2.A02
            goto L_0x019e
        L_0x01ad:
            if (r4 != 0) goto L_0x01b6
            X.4cD[] r0 = new X.C267794cD[r5]
            X.5Pl r4 = new X.5Pl
            r4.<init>(r0)
        L_0x01b6:
            if (r7 == 0) goto L_0x01bc
            r4.A09(r7)
            r7 = r11
        L_0x01bc:
            r4.A09(r2)
            goto L_0x01aa
        L_0x01c0:
            if (r1 != r6) goto L_0x01c3
            goto L_0x0189
        L_0x01c3:
            X.4cD r7 = X.AnonymousClass5WH.A00(r4)
            goto L_0x0189
        L_0x01c8:
            X.4cD r7 = r8.A03
            r4 = r11
        L_0x01cb:
            if (r7 == 0) goto L_0x0220
            boolean r0 = r7 instanceof X.AnonymousClass5WD
            if (r0 == 0) goto L_0x01e7
            X.5WD r7 = (X.AnonymousClass5WD) r7
            X.5WE r7 = (X.AnonymousClass5WE) r7
            X.0sP r0 = r7.A00
            if (r0 == 0) goto L_0x021b
            java.lang.Object r0 = r0.invoke(r13)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x021b
        L_0x01e5:
            r1 = 1
            return r1
        L_0x01e7:
            int r0 = r7.A01
            r0 = r0 & r12
            if (r0 == 0) goto L_0x021b
            boolean r0 = r7 instanceof X.C267944cV
            if (r0 == 0) goto L_0x021b
            r0 = r7
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x01f6:
            if (r2 == 0) goto L_0x0218
            int r0 = r2.A01
            r0 = r0 & r12
            if (r0 == 0) goto L_0x0202
            int r1 = r1 + 1
            if (r1 != r6) goto L_0x0205
            r7 = r2
        L_0x0202:
            X.4cD r2 = r2.A02
            goto L_0x01f6
        L_0x0205:
            if (r4 != 0) goto L_0x020e
            X.4cD[] r0 = new X.C267794cD[r5]
            X.5Pl r4 = new X.5Pl
            r4.<init>(r0)
        L_0x020e:
            if (r7 == 0) goto L_0x0214
            r4.A09(r7)
            r7 = r11
        L_0x0214:
            r4.A09(r2)
            goto L_0x0202
        L_0x0218:
            if (r1 != r6) goto L_0x021b
            goto L_0x01cb
        L_0x021b:
            X.4cD r7 = X.AnonymousClass5WH.A00(r4)
            goto L_0x01cb
        L_0x0220:
            if (r3 == 0) goto L_0x0263
            int r2 = r3.size()
            r1 = 0
        L_0x0227:
            if (r1 >= r2) goto L_0x0263
            java.lang.Object r0 = r3.get(r1)
            X.5WD r0 = (X.AnonymousClass5WD) r0
            X.5WE r0 = (X.AnonymousClass5WE) r0
            X.0sP r0 = r0.A00
            if (r0 == 0) goto L_0x0242
            java.lang.Object r0 = r0.invoke(r13)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0242
            goto L_0x01e5
        L_0x0242:
            int r1 = r1 + 1
            goto L_0x0227
        L_0x0245:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x024b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0251:
            java.lang.String r1 = "Dispatching rotary event while focus system is invalidated."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0259:
            int r0 = r2.A00(r3)
            r1 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0263
            return r1
        L_0x0263:
            r1 = 0
            return r1
        L_0x0265:
            boolean r1 = super.dispatchGenericMotionEvent(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c2, code lost:
        r1 = X.C290085ej.A02(r8, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f9, code lost:
        if (r5 == r7) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r4 = r17
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x000e
            java.lang.Runnable r0 = r4.A1B
            r4.removeCallbacks(r0)
            r0.run()
        L_0x000e:
            r2 = r18
            boolean r0 = A0I(r2)
            r3 = 0
            if (r0 != 0) goto L_0x006a
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L_0x006a
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = r4.A0f
            android.view.accessibility.AccessibilityManager r1 = r6.A0O
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x004c
            boolean r0 = r1.isTouchExplorationEnabled()
            if (r0 == 0) goto L_0x004c
            r15 = 1
            int r1 = r2.getAction()
            r0 = 7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x007d
            r0 = 9
            if (r1 == r0) goto L_0x007d
            r0 = 10
            if (r1 != r0) goto L_0x004c
            int r5 = r6.A02
            if (r5 != r7) goto L_0x00fd
            androidx.compose.ui.platform.AndroidComposeView r0 = r6.A0R
            X.6Gd r0 = r0.getAndroidViewsHandler$ui_release()
            r0.dispatchGenericMotionEvent(r2)
        L_0x004c:
            int r1 = r2.getActionMasked()
            r0 = 7
            if (r1 == r0) goto L_0x006b
            r0 = 10
            if (r1 != r0) goto L_0x0072
            boolean r0 = r4.A0G(r2)
            if (r0 == 0) goto L_0x0072
            int r1 = r2.getToolType(r3)
            r0 = 3
            if (r1 != r0) goto L_0x010c
            int r0 = r2.getButtonState()
            if (r0 == 0) goto L_0x010c
        L_0x006a:
            return r3
        L_0x006b:
            boolean r0 = r4.A0H(r2)
            if (r0 != 0) goto L_0x0072
            return r3
        L_0x0072:
            int r0 = r4.A00(r2)
            r3 = 1
            r0 = r0 & 1
            if (r0 != 0) goto L_0x006a
            r3 = 0
            return r3
        L_0x007d:
            float r1 = r2.getX()
            float r0 = r2.getY()
            androidx.compose.ui.platform.AndroidComposeView r5 = r6.A0R
            r5.Co0(r15)
            X.5T7 r11 = new X.5T7
            r11.<init>()
            X.5R6 r8 = r5.A0Y
            long r0 = X.C289325dP.A00(r1, r0)
            X.5RP r10 = r8.A0W
            X.4cg r9 = r10.A04
            float[] r8 = X.C268054cg.A0Q
            long r13 = r9.A0V(r0)
            X.4cg r10 = r10.A04
            X.5S6 r12 = X.C268054cg.A0N
            r16 = r15
            r10.A0n(r11, r12, r13, r15, r16)
            java.lang.Object r0 = X.00k.A0L(r11)
            X.4cD r0 = (X.C267794cD) r0
            if (r0 == 0) goto L_0x00f0
            X.5R6 r8 = X.AnonymousClass5WH.A02(r0)
            if (r8 == 0) goto L_0x00f0
            X.5RP r0 = r8.A0W
            if (r0 == 0) goto L_0x00f0
            X.4cD r0 = r0.A02
            int r0 = r0.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00f0
            X.5SX r1 = X.C290085ej.A02(r8, r3)
            X.4cg r0 = r1.A05()
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r0.A0p()
            if (r0 != 0) goto L_0x00f0
        L_0x00d2:
            X.5SV r0 = r1.A05
            X.5Sb r1 = X.AnonymousClass5SZ.A0B
            java.util.Map r0 = r0.A02
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x00f0
            X.6Gd r0 = r5.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.A01
            java.lang.Object r0 = r0.get(r8)
            if (r0 != 0) goto L_0x00f0
            int r0 = r8.A01
            int r7 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r0)
        L_0x00f0:
            X.6Gd r0 = r5.getAndroidViewsHandler$ui_release()
            r0.dispatchGenericMotionEvent(r2)
            int r5 = r6.A02
            if (r5 != r7) goto L_0x00fd
            goto L_0x004c
        L_0x00fd:
            r6.A02 = r7
            r1 = 0
            r0 = 128(0x80, float:1.794E-43)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r6, r1, r1, r7, r0)
            r0 = 256(0x100, float:3.59E-43)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r6, r1, r1, r5, r0)
            goto L_0x004c
        L_0x010c:
            android.view.MotionEvent r0 = r4.A03
            if (r0 == 0) goto L_0x0113
            r0.recycle()
        L_0x0113:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r2)
            r4.A03 = r0
            r0 = 1
            r4.A07 = r0
            java.lang.Runnable r2 = r4.A1B
            r0 = 8
            r4.postDelayed(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.A07) {
            Runnable runnable = this.A1B;
            removeCallbacks(runnable);
            MotionEvent motionEvent2 = this.A03;
            0qQ.A0A(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.A07 = false;
            } else {
                runnable.run();
            }
        }
        if (!A0I(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || A0H(motionEvent))) {
            int A002 = A00(motionEvent);
            if ((A002 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            z = true;
            if ((A002 & 1) == 0) {
                return false;
            }
        }
        return z;
    }

    public final View focusSearch(View view, int i) {
        int i2;
        if (view != null) {
            int[] iArr = XY5.A00;
            view.getLocationInWindow(iArr);
            float f = (float) iArr[0];
            AnonymousClass5VN r3 = new AnonymousClass5VN(f, (float) iArr[1], f + ((float) view.getWidth()), ((float) iArr[1]) + ((float) view.getHeight()));
            I1T A002 = I2C.A00(i);
            if (A002 != null) {
                i2 = A002.A00;
            } else {
                i2 = 6;
            }
            if (0qQ.A0K(this.A0S.AW7(r3, C41674AyR.A00, i2), true)) {
                return this;
            }
        }
        return super.focusSearch(view, i);
    }

    public final C305026Gd getAndroidViewsHandler$ui_release() {
        if (this.A0F == null) {
            C305026Gd r1 = new C305026Gd(getContext());
            this.A0F = r1;
            addView((View) r1, -1);
            requestLayout();
        }
        C305026Gd r0 = this.A0F;
        0qQ.A0A(r0);
        return r0;
    }

    public AnonymousClass5TA getAutofill() {
        return this.A0P;
    }

    public AnonymousClass5T0 getAutofillTree() {
        return this.A0Q;
    }

    public final 0sP getConfigurationChangeObserver() {
        return this.A06;
    }

    public final AndroidContentCaptureManager getContentCaptureManager$ui_release() {
        return this.A04;
    }

    public C262094Cc getCoroutineContext() {
        return this.A05;
    }

    public C268024cd getDensity() {
        return (C268024cd) this.A0u.getValue();
    }

    public AnonymousClass5Qo getDragAndDropManager() {
        return this.A0R;
    }

    public AnonymousClass5QZ getFocusOwner() {
        return this.A0S;
    }

    public C286305Uu getFontFamilyResolver() {
        return (C286305Uu) this.A0v.getValue();
    }

    public C286245Um getFontLoader() {
        return this.A0m;
    }

    public C285855Sz getGraphicsContext() {
        return this.A0T;
    }

    public AnonymousClass5V6 getHapticFeedBack() {
        return this.A0U;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !this.A0a.A04.A01();
    }

    public AnonymousClass5V8 getInputModeManager() {
        return this.A0V;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.A00;
    }

    public AnonymousClass5Q8 getLayoutDirection() {
        return (AnonymousClass5Q8) this.A0w.getValue();
    }

    public long getMeasureIteration() {
        if (this.A0a.A02) {
            return 1;
        }
        I2E.A00("measureIteration should be only used during the measure/layout pass");
        throw AnonymousClass00P.createAndThrow();
    }

    public AnonymousClass5VA getModifierLocalManager() {
        return this.A0X;
    }

    public C268104cl getPlacementScope() {
        return new C268114cm(this);
    }

    public C286405Wf getPointerIconService() {
        return this.A0W;
    }

    public AnonymousClass5R6 getRoot() {
        return this.A0Y;
    }

    public C268144cr getRootForTest() {
        return this.A14;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        C290045ef r0;
        if (Build.VERSION.SDK_INT < 31 || (r0 = this.A17) == null) {
            return false;
        }
        return r0.A01();
    }

    public AnonymousClass5SP getSemanticsOwner() {
        return this.A0l;
    }

    public AnonymousClass5Q2 getSharedDrawScope() {
        return this.A0Z;
    }

    public boolean getShowLayoutBounds() {
        return this.A0A;
    }

    public AnonymousClass5TD getSnapshotObserver() {
        return this.A0b;
    }

    public C286225Uk getSoftwareKeyboardController() {
        return this.A0h;
    }

    public C286205Ui getTextInputService() {
        return this.A0n;
    }

    public AnonymousClass5VM getTextToolbar() {
        return this.A0i;
    }

    public View getView() {
        return this;
    }

    public AnonymousClass5RG getViewConfiguration() {
        return this.A0j;
    }

    public final AnonymousClass5XH getViewTreeOwners() {
        return (AnonymousClass5XH) this.A0x.getValue();
    }

    public C285345Qx getWindowInfo() {
        return this.A0k;
    }

    public final boolean onCheckIsTextEditor() {
        Object obj;
        Object obj2;
        C290195eu r0 = (C290195eu) this.A1D.get();
        if (r0 != null) {
            obj = r0.A00;
        } else {
            obj = null;
        }
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) obj;
        if (androidPlatformTextInputSession == null) {
            return this.A1A.A06;
        }
        C290195eu r02 = (C290195eu) androidPlatformTextInputSession.A02.get();
        if (r02 != null) {
            obj2 = r02.A00;
        } else {
            obj2 = null;
        }
        C55795Hnb hnb = (C55795Hnb) obj2;
        if (hnb == null || !(!hnb.A01)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r14.A1D
            java.lang.Object r0 = r0.get()
            X.5eu r0 = (X.C290195eu) r0
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r0.A00
        L_0x000c:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession) r0
            if (r0 != 0) goto L_0x0103
            X.5Td r3 = r14.A1A
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x028f
            X.5Uc r6 = r3.A00
            X.5Tl r2 = r3.A01
            int r8 = r6.A01
            r0 = 1
            r9 = 0
            if (r8 != r0) goto L_0x0021
            r9 = 1
        L_0x0021:
            r5 = 3
            r4 = 2
            r7 = 6
            r1 = 1
            if (r9 == 0) goto L_0x00d6
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x002c
            r7 = 0
        L_0x002c:
            r15.imeOptions = r7
            int r8 = r6.A02
            if (r8 != r1) goto L_0x00af
            r15.inputType = r1
            r8 = 1
        L_0x0035:
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x0049
            r0 = r8 & 1
            if (r0 != r1) goto L_0x0049
            r0 = 131072(0x20000, float:1.83671E-40)
            r8 = r8 | r0
            r15.inputType = r8
            if (r9 == 0) goto L_0x0049
            r0 = 1073741824(0x40000000, float:2.0)
            r7 = r7 | r0
            r15.imeOptions = r7
        L_0x0049:
            r0 = r8 & 1
            if (r0 != r1) goto L_0x005f
            int r0 = r6.A00
            if (r0 != r1) goto L_0x00a5
            r8 = r8 | 4096(0x1000, float:5.74E-42)
        L_0x0053:
            r15.inputType = r8
        L_0x0055:
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x005f
            r0 = 32768(0x8000, float:4.5918E-41)
            r8 = r8 | r0
            r15.inputType = r8
        L_0x005f:
            long r4 = r2.A00
            r0 = 32
            long r0 = r4 >> r0
            int r6 = (int) r0
            r15.initialSelStart = r6
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r0
            int r0 = (int) r4
            r15.initialSelEnd = r0
            X.5Tq r0 = r2.A01
            java.lang.String r0 = r0.A00
            X.05P.A00(r15, r0)
            int r1 = r15.imeOptions
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r0
            r15.imeOptions = r1
            X.Tnu r0 = X.C13993Tnu.A09
            if (r0 == 0) goto L_0x008a
            X.Tnu r0 = X.C13993Tnu.A00()
            r0.A03(r15)
        L_0x008a:
            X.5Tl r2 = r3.A01
            X.5Uc r0 = r3.A00
            boolean r1 = r0.A04
            X.IGs r0 = new X.IGs
            r0.<init>(r3)
            X.IE7 r4 = new X.IE7
            r4.<init>(r0, r2, r1)
            java.util.List r1 = r3.A03
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r1.add(r0)
            return r4
        L_0x00a5:
            if (r0 != r4) goto L_0x00aa
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0053
        L_0x00aa:
            if (r0 != r5) goto L_0x0055
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            goto L_0x0053
        L_0x00af:
            if (r8 != r4) goto L_0x00bb
            r15.inputType = r1
            r8 = 1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r15.imeOptions = r7
            goto L_0x0035
        L_0x00bb:
            if (r8 != r5) goto L_0x00c2
            r15.inputType = r4
            r8 = 2
            goto L_0x0035
        L_0x00c2:
            r0 = 4
            if (r8 != r0) goto L_0x00ca
            r15.inputType = r5
            r8 = 3
            goto L_0x0035
        L_0x00ca:
            r0 = 5
            if (r8 != r0) goto L_0x00d3
            r8 = 17
        L_0x00cf:
            r15.inputType = r8
            goto L_0x0035
        L_0x00d3:
            r8 = 33
            goto L_0x00cf
        L_0x00d6:
            if (r8 != r4) goto L_0x00db
            r7 = 2
            goto L_0x002c
        L_0x00db:
            if (r8 != r7) goto L_0x00e0
            r7 = 5
            goto L_0x002c
        L_0x00e0:
            r0 = 5
            if (r8 != r0) goto L_0x00e6
            r7 = 7
            goto L_0x002c
        L_0x00e6:
            if (r8 != r5) goto L_0x00eb
            r7 = 3
            goto L_0x002c
        L_0x00eb:
            r0 = 4
            if (r8 != r0) goto L_0x00f1
            r7 = 4
            goto L_0x002c
        L_0x00f1:
            r0 = 7
            if (r8 == r0) goto L_0x002c
            r0 = 1488(0x5d0, float:2.085E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0100:
            r0 = 0
            goto L_0x000c
        L_0x0103:
            java.util.concurrent.atomic.AtomicReference r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.5eu r0 = (X.C290195eu) r0
            if (r0 == 0) goto L_0x0117
            java.lang.Object r3 = r0.A00
        L_0x010f:
            X.Hnb r3 = (X.C55795Hnb) r3
            if (r3 == 0) goto L_0x028f
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            goto L_0x0119
        L_0x0117:
            r3 = 0
            goto L_0x010f
        L_0x0119:
            boolean r0 = r3.A01     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x011f
            goto L_0x0289
        L_0x011f:
            X.JLO r6 = r3.A02     // Catch:{ all -> 0x028c }
            X.IGf r6 = (X.C56884IGf) r6     // Catch:{ all -> 0x028c }
            X.5Tl r1 = r6.A05     // Catch:{ all -> 0x028c }
            X.5Tq r0 = r1.A01     // Catch:{ all -> 0x028c }
            java.lang.String r9 = r0.A00     // Catch:{ all -> 0x028c }
            long r4 = r1.A00     // Catch:{ all -> 0x028c }
            X.5Uc r10 = r6.A04     // Catch:{ all -> 0x028c }
            int r11 = r10.A01     // Catch:{ all -> 0x028c }
            r0 = 1
            r12 = 0
            if (r11 != r0) goto L_0x0134
            r12 = 1
        L_0x0134:
            r8 = 3
            r1 = 6
            r7 = 1
            if (r12 == 0) goto L_0x013f
            boolean r0 = r10.A05     // Catch:{ all -> 0x028c }
            if (r0 != 0) goto L_0x0165
            r1 = 0
            goto L_0x0165
        L_0x013f:
            r0 = 2
            if (r11 != r0) goto L_0x0144
            r1 = 2
            goto L_0x0165
        L_0x0144:
            if (r11 != r1) goto L_0x0148
            r1 = 5
            goto L_0x0165
        L_0x0148:
            r0 = 5
            if (r11 != r0) goto L_0x014d
            r1 = 7
            goto L_0x0165
        L_0x014d:
            if (r11 != r8) goto L_0x0151
            r1 = 3
            goto L_0x0165
        L_0x0151:
            r0 = 4
            if (r11 != r0) goto L_0x0156
            r1 = 4
            goto L_0x0165
        L_0x0156:
            r0 = 7
            if (r11 == r0) goto L_0x0165
            r0 = 1488(0x5d0, float:2.085E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x028c }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x028c }
            r1.<init>(r0)     // Catch:{ all -> 0x028c }
            throw r1     // Catch:{ all -> 0x028c }
        L_0x0165:
            r15.imeOptions = r1     // Catch:{ all -> 0x028c }
            X.5Ud r11 = r10.A03     // Catch:{ all -> 0x028c }
            X.5Ud r0 = X.C286155Ud.A02     // Catch:{ all -> 0x028c }
            boolean r0 = X.0qQ.A0K(r11, r0)     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0173
            r1 = 0
            goto L_0x01a9
        L_0x0173:
            r0 = 10
            int r0 = X.0Yv.A1E(r11, r0)     // Catch:{ all -> 0x028c }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x028c }
            r1.<init>(r0)     // Catch:{ all -> 0x028c }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x028c }
        L_0x0182:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0194
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x028c }
            X.5hs r0 = (X.C291785hs) r0     // Catch:{ all -> 0x028c }
            java.util.Locale r0 = r0.A00     // Catch:{ all -> 0x028c }
            r1.add(r0)     // Catch:{ all -> 0x028c }
            goto L_0x0182
        L_0x0194:
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]     // Catch:{ all -> 0x028c }
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ all -> 0x028c }
            java.util.Locale[] r1 = (java.util.Locale[]) r1     // Catch:{ all -> 0x028c }
            int r0 = r1.length     // Catch:{ all -> 0x028c }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ all -> 0x028c }
            java.util.Locale[] r0 = (java.util.Locale[]) r0     // Catch:{ all -> 0x028c }
            android.os.LocaleList r1 = new android.os.LocaleList     // Catch:{ all -> 0x028c }
            r1.<init>(r0)     // Catch:{ all -> 0x028c }
        L_0x01a9:
            r15.hintLocales = r1     // Catch:{ all -> 0x028c }
            int r1 = r10.A02     // Catch:{ all -> 0x028c }
            if (r1 == r7) goto L_0x01ca
            r0 = 2
            if (r1 != r0) goto L_0x01ba
            int r1 = r15.imeOptions     // Catch:{ all -> 0x028c }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r15.imeOptions = r1     // Catch:{ all -> 0x028c }
            goto L_0x01ca
        L_0x01ba:
            if (r1 != r8) goto L_0x01be
            r8 = 2
            goto L_0x01cb
        L_0x01be:
            r0 = 4
            if (r1 == r0) goto L_0x01cb
            r0 = 5
            if (r1 != r0) goto L_0x01c7
            r8 = 17
            goto L_0x01cb
        L_0x01c7:
            r8 = 33
            goto L_0x01cb
        L_0x01ca:
            r8 = 1
        L_0x01cb:
            r15.inputType = r8     // Catch:{ all -> 0x028c }
            boolean r0 = r10.A05     // Catch:{ all -> 0x028c }
            if (r0 != 0) goto L_0x01e3
            r0 = r8 & 1
            if (r0 != r7) goto L_0x01e3
            r0 = 131072(0x20000, float:1.83671E-40)
            r8 = r8 | r0
            r15.inputType = r8     // Catch:{ all -> 0x028c }
            if (r12 == 0) goto L_0x01e3
            int r1 = r15.imeOptions     // Catch:{ all -> 0x028c }
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r0
            r15.imeOptions = r1     // Catch:{ all -> 0x028c }
        L_0x01e3:
            r0 = r8 & 1
            if (r0 != r7) goto L_0x0205
            int r1 = r10.A00     // Catch:{ all -> 0x028c }
            if (r1 != r7) goto L_0x01ee
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            goto L_0x01f9
        L_0x01ee:
            r0 = 2
            if (r1 != r0) goto L_0x01f4
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            goto L_0x01f9
        L_0x01f4:
            r0 = 3
            if (r1 != r0) goto L_0x01fb
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x01f9:
            r15.inputType = r8     // Catch:{ all -> 0x028c }
        L_0x01fb:
            boolean r0 = r10.A04     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0205
            r0 = 32768(0x8000, float:4.5918E-41)
            r8 = r8 | r0
            r15.inputType = r8     // Catch:{ all -> 0x028c }
        L_0x0205:
            r0 = 32
            long r0 = r4 >> r0
            int r8 = (int) r0     // Catch:{ all -> 0x028c }
            r15.initialSelStart = r8     // Catch:{ all -> 0x028c }
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r0
            int r0 = (int) r4     // Catch:{ all -> 0x028c }
            r15.initialSelEnd = r0     // Catch:{ all -> 0x028c }
            X.05P.A00(r15, r9)     // Catch:{ all -> 0x028c }
            int r1 = r15.imeOptions     // Catch:{ all -> 0x028c }
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r0
            r15.imeOptions = r1     // Catch:{ all -> 0x028c }
            boolean r0 = X.C55296HfP.A00     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0277
            android.os.Bundle r1 = r15.extras     // Catch:{ all -> 0x028c }
            if (r1 != 0) goto L_0x022e
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x028c }
            r1.<init>()     // Catch:{ all -> 0x028c }
            r15.extras = r1     // Catch:{ all -> 0x028c }
        L_0x022e:
            java.lang.String r0 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"
            r1.putBoolean(r0, r7)     // Catch:{ all -> 0x028c }
            X.HR9.A00(r15)     // Catch:{ all -> 0x028c }
        L_0x0236:
            X.Tnu r0 = X.C13993Tnu.A09     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0241
            X.Tnu r0 = X.C13993Tnu.A00()     // Catch:{ all -> 0x028c }
            r0.A03(r15)     // Catch:{ all -> 0x028c }
        L_0x0241:
            X.5Tl r12 = r6.A05     // Catch:{ all -> 0x028c }
            X.5Uc r0 = r6.A04     // Catch:{ all -> 0x028c }
            boolean r13 = r0.A04     // Catch:{ all -> 0x028c }
            X.IFa r9 = new X.IFa     // Catch:{ all -> 0x028c }
            r9.<init>(r6)     // Catch:{ all -> 0x028c }
            X.Gc7 r8 = r6.A01     // Catch:{ all -> 0x028c }
            X.Gb5 r10 = r6.A02     // Catch:{ all -> 0x028c }
            X.5RG r11 = r6.A03     // Catch:{ all -> 0x028c }
            X.IE8 r7 = new X.IE8     // Catch:{ all -> 0x028c }
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x028c }
            java.util.List r1 = r6.A06     // Catch:{ all -> 0x028c }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x028c }
            r0.<init>(r7)     // Catch:{ all -> 0x028c }
            r1.add(r0)     // Catch:{ all -> 0x028c }
            r1 = 38
            X.J6M r0 = new X.J6M     // Catch:{ all -> 0x028c }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x028c }
            X.Gg0 r4 = X.C54756HRo.A00(r7, r0)     // Catch:{ all -> 0x028c }
            X.5Pl r1 = r3.A00     // Catch:{ all -> 0x028c }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x028c }
            r0.<init>(r4)     // Catch:{ all -> 0x028c }
            r1.A09(r0)     // Catch:{ all -> 0x028c }
            goto L_0x028a
        L_0x0277:
            r4 = 0
            android.os.Bundle r1 = r15.extras     // Catch:{ all -> 0x028c }
            if (r1 != 0) goto L_0x0283
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x028c }
            r1.<init>()     // Catch:{ all -> 0x028c }
            r15.extras = r1     // Catch:{ all -> 0x028c }
        L_0x0283:
            java.lang.String r0 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"
            r1.putBoolean(r0, r4)     // Catch:{ all -> 0x028c }
            goto L_0x0236
        L_0x0289:
            r4 = 0
        L_0x028a:
            monitor-exit(r2)
            return r4
        L_0x028c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x028f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        I6C.A02(this.A04, consumer, jArr);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0a.A0D(this.A1E);
        this.A0H = null;
        A0E(this);
        if (this.A0F != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void onMeasure(int i, int i2) {
        AnonymousClass5TN r4;
        AnonymousClass00P th;
        String str;
        0fg.A01("AndroidOwner:onMeasure", 1325845068);
        try {
            if (!isAttachedToWindow()) {
                A0A(this.A0Y);
            }
            long A022 = A02(i);
            long A023 = A02(i2);
            long A032 = C288985co.A03((int) (A022 >>> 32), (int) (A022 & 4294967295L), (int) (A023 >>> 32), (int) (4294967295L & A023));
            Constraints constraints = this.A0H;
            if (constraints == null) {
                this.A0H = new Constraints(A032);
                this.A0B = false;
            } else if (constraints.A00 != A032) {
                this.A0B = true;
            }
            r4 = this.A0a;
            Constraints constraints2 = r4.A00;
            boolean z = false;
            if (constraints2 == null || constraints2.A00 != A032) {
                if (!(!r4.A02)) {
                    str = "updateRootConstraints called while measuring";
                    I2E.A00(str);
                    th = AnonymousClass00P.createAndThrow();
                    throw th;
                }
                r4.A00 = new Constraints(A032);
                AnonymousClass5R6 r5 = r4.A05;
                AnonymousClass5R6 r3 = r5.A08;
                if (r3 != null) {
                    r5.A0U.A0G = true;
                }
                r5.A0U.A0H = true;
                AnonymousClass5TO r0 = r4.A04;
                if (r3 != null) {
                    z = true;
                }
                r0.A00(r5, z);
            }
            AnonymousClass5TO r52 = r4.A04;
            if (!r52.A01()) {
                AnonymousClass5R6 r32 = r4.A05;
                if (r32.A0A == null) {
                    str = C273654mx.A00(878);
                } else if (!r32.A0U.A0J.A0E) {
                    str = C273654mx.A00(879);
                } else if (!(!r4.A02)) {
                    str = C273654mx.A00(877);
                } else if (r4.A00 != null) {
                    r4.A02 = true;
                    r4.A01 = false;
                    if (!r52.A00.A00.isEmpty()) {
                        if (r32.A08 == null) {
                            AnonymousClass5TN.A01(r32, r4);
                        } else if (!r32.A0L) {
                            Constraints constraints3 = r4.A00;
                            0qQ.A0A(constraints3);
                            AnonymousClass5TN.A08(r32, constraints3);
                        }
                    }
                    if (!r32.A0L) {
                        Constraints constraints4 = r4.A00;
                        0qQ.A0A(constraints4);
                        AnonymousClass5TN.A09(r32, constraints4);
                    }
                    r4.A02 = false;
                    r4.A01 = false;
                }
                I2E.A00(str);
                th = AnonymousClass00P.createAndThrow();
                throw th;
            }
            AnonymousClass5SJ r42 = this.A0Y.A0U.A0J;
            setMeasuredDimension(r42.A01, r42.A00);
            if (this.A0F != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(r42.A01, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(r42.A00, SN3.MAX_SIGNED_POWER_OF_TWO));
            }
            0fg.A00(134025815);
        } catch (Throwable th2) {
            0fg.A00(-1463227767);
            throw th2;
        }
    }

    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        AnonymousClass5T9 r6;
        if (viewStructure != null && (r6 = this.A0P) != null) {
            Map map = r6.A02.A00;
            int addChildCount = viewStructure.addChildCount(map.size());
            for (Map.Entry entry : map.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                entry.getValue();
                ViewStructure newChild = viewStructure.newChild(addChildCount);
                if (newChild != null) {
                    AutofillId autofillId = viewStructure.getAutofillId();
                    0qQ.A0A(autofillId);
                    newChild.setAutofillId(autofillId, intValue);
                    newChild.setId(intValue, r6.A00.getContext().getPackageName(), (String) null, (String) null);
                    newChild.setAutofillType(1);
                    throw new NullPointerException("getAutofillTypes");
                }
                addChildCount++;
            }
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        AnonymousClass5Q8 r0;
        if (this.A0O) {
            if (i == 0 || i != 1) {
                r0 = AnonymousClass5Q8.Ltr;
            } else {
                r0 = AnonymousClass5Q8.Rtl;
            }
            setLayoutDirection(r0);
        }
    }

    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C290045ef r2;
        if (Build.VERSION.SDK_INT >= 31 && (r2 = this.A17) != null) {
            r2.A00(this, this.A0l, consumer, this.A05);
        }
    }

    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        I6C.A00.A03(longSparseArray, this.A04);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.A0f.A03 = j;
    }

    public void setCoroutineContext(C262094Cc r14) {
        int i;
        int i2;
        this.A05 = r14;
        C267794cD r2 = this.A0Y.A0W.A02;
        if (r2 instanceof AnonymousClass6FQ) {
            ((AnonymousClass6FQ) r2).EI9();
        }
        C267794cD r1 = r2.A03;
        if (!r1.A08) {
            I2E.A01("visitSubtree called on an unattached node");
            throw AnonymousClass00P.createAndThrow();
        }
        C267794cD r11 = r1.A02;
        AnonymousClass5R6 A022 = AnonymousClass5WH.A02(r2);
        int i3 = 0;
        int[] iArr = new int[16];
        C285045Pl[] r12 = new C285045Pl[16];
        while (A022 != null) {
            if (r11 == null) {
                r11 = A022.A0W.A02;
            }
            if ((r11.A00 & 16) != 0) {
                do {
                    if ((r11.A01 & 16) != 0) {
                        C267794cD r10 = r11;
                        C285045Pl r9 = null;
                        do {
                            if (r10 instanceof AnonymousClass5VD) {
                                AnonymousClass5VD r102 = (AnonymousClass5VD) r10;
                                if (r102 instanceof AnonymousClass6FQ) {
                                    ((AnonymousClass6FQ) r102).EI9();
                                }
                            } else if ((r10.A01 & 16) != 0 && (r10 instanceof C267944cV)) {
                                int i4 = 0;
                                for (C267794cD r7 = ((C267944cV) r10).A00; r7 != null; r7 = r7.A02) {
                                    if ((r7.A01 & 16) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            r10 = r7;
                                        } else {
                                            if (r9 == null) {
                                                r9 = new C285045Pl(new C267794cD[16]);
                                            }
                                            if (r10 != null) {
                                                r9.A09(r10);
                                                r10 = null;
                                            }
                                            r9.A09(r7);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                    continue;
                                }
                            }
                            r10 = AnonymousClass5WH.A00(r9);
                            continue;
                        } while (r10 != null);
                    }
                    r11 = r11.A02;
                } while (r11 != null);
            }
            C285045Pl A0A2 = A022.A0A();
            if (A0A2.A00 != 0) {
                int length = iArr.length;
                if (i3 >= length) {
                    iArr = Arrays.copyOf(iArr, length * 2);
                    0qQ.A07(iArr);
                    Object[] copyOf = Arrays.copyOf(r12, r12.length * 2);
                    0qQ.A07(copyOf);
                    r12 = (C285045Pl[]) copyOf;
                }
                iArr[i3] = A0A2.A00 - 1;
                r12[i3] = A0A2;
                i3++;
            }
            if (i3 > 0 && (i2 = iArr[i]) >= 0) {
                C285045Pl r5 = r12[(i = i3 - 1)];
                0qQ.A0A(r5);
                if (i2 > 0) {
                    iArr[i] = iArr[i] - 1;
                } else {
                    r12[i] = null;
                    i3--;
                }
                A022 = (AnonymousClass5R6) r5.A02[i2];
                r11 = null;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.5QN, X.4cD] */
    /* JADX WARNING: type inference failed for: r9v0, types: [X.0sa, X.5QX] */
    public AndroidComposeView(Context context, C262094Cc r15) {
        super(context);
        int i;
        AnonymousClass5Q8 r0;
        AnonymousClass5VT r02;
        C290045ef r3 = null;
        this.A0Z = new AnonymousClass5Q2((AnonymousClass5Q5) null, (DefaultConstructorMarker) null, 1);
        AnonymousClass5QL A002 = AnonymousClass5QG.A00(context);
        AnonymousClass5QM r2 = AnonymousClass5QM.A00;
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        AnonymousClass0eM r03 = C284905Ot.A01;
        this.A0u = new ParcelableSnapshotMutableState(r2, A002);
        ? r1 = new C267794cD();
        this.A19 = r1;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(r1);
        this.A18 = emptySemanticsElement;
        this.A0S = new AnonymousClass5QY(new AnonymousClass5QV(this), new AnonymousClass5QW(this), new AnonymousClass5QX(this), new AnonymousClass5QS(this), new AnonymousClass5QU(this), new AnonymousClass5QT(this));
        C285275Qn r6 = new C285275Qn(new C285265Qm(this));
        this.A15 = r6;
        this.A05 = r15;
        this.A0R = r6;
        this.A0k = new C285335Qw();
        C285245Qk r10 = Modifier.A00;
        Modifier Ezh = r10.Ezh(new KeyInputElement(new C377189Kw(this, 2), (0sP) null));
        this.A0z = Ezh;
        Modifier Ezh2 = r10.Ezh(new RotaryInputElement(AnonymousClass5R0.A00));
        this.A10 = Ezh2;
        this.A11 = new AnonymousClass5R2();
        AnonymousClass5R6 r102 = new AnonymousClass5R6(false, AnonymousClass5R5.A00.addAndGet(1));
        r102.Ecq(AnonymousClass5SN.A00);
        r102.EUC(getDensity());
        r102.Edb(emptySemanticsElement.Ezh(Ezh2).Ezh(Ezh).Ezh(((AnonymousClass5QY) this.A0S).A02).Ezh(r6.A01));
        this.A0Y = r102;
        this.A14 = this;
        this.A0l = new AnonymousClass5SP(r102, r1);
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.A0f = androidComposeViewAccessibilityDelegateCompat;
        this.A04 = new AndroidContentCaptureManager(this, new C285795Ss(this));
        this.A0c = new C285825Sw(context);
        this.A0T = new C285845Sy(this);
        this.A0Q = new AnonymousClass5T0();
        this.A1C = new ArrayList();
        this.A12 = new AnonymousClass5T1();
        this.A13 = new AnonymousClass5T2(this.A0Y);
        this.A06 = AnonymousClass5T8.A00;
        this.A0P = new AnonymousClass5T9(this, this.A0Q);
        this.A0d = new AnonymousClass5TB(context);
        this.A0b = new AnonymousClass5TD(new C377189Kw(this, 3));
        this.A0a = new AnonymousClass5TN(this.A0Y);
        this.A0j = new AnonymousClass5TV(ViewConfiguration.get(context));
        this.A0D = AnonymousClass5TW.A00(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.A1G = new int[]{0, 0};
        float[] A062 = AnonymousClass5S4.A06();
        this.A1F = A062;
        this.A0o = AnonymousClass5S4.A06();
        this.A0p = AnonymousClass5S4.A06();
        this.A00 = -1;
        this.A02 = 9187343241974906880L;
        this.A0M = true;
        this.A0t = new ParcelableSnapshotMutableState(C289465dd.A00(), (Object) null);
        this.A0x = new AnonymousClass5TX((C284895Os) null, new AnonymousClass9L8(this, 34));
        this.A0q = new C285865Ta(this);
        this.A0r = new C285875Tb(this);
        this.A0s = new C285885Tc(this);
        C285895Td r12 = new C285895Td(this, this);
        this.A1A = r12;
        this.A0n = new C286205Ui((C285905Te) C285805St.A00.invoke(r12));
        this.A1D = new AtomicReference((Object) null);
        this.A0h = new C286215Uj(this.A0n);
        this.A0m = new C286235Ul(context);
        FontFamilyResolverImpl A003 = C286255Un.A00(context);
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        this.A0v = new ParcelableSnapshotMutableState(r2, A003);
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            i = configuration.fontWeightAdjustment;
        } else {
            i = 0;
        }
        this.A0C = i;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        if (layoutDirection == 0) {
            r0 = AnonymousClass5Q8.Ltr;
        } else if (layoutDirection != 1) {
            r0 = AnonymousClass5Q8.Ltr;
        } else {
            r0 = AnonymousClass5Q8.Rtl;
        }
        this.A0w = new ParcelableSnapshotMutableState(C289465dd.A00(), r0);
        this.A0U = new AnonymousClass5V5(this);
        this.A0V = new AnonymousClass5V7(isInTouchMode() ? 1 : 2, new C377189Kw(this, 1));
        this.A0X = new AnonymousClass5VA(this);
        this.A0i = new AnonymousClass5VL(this);
        this.A16 = new AnonymousClass5VP();
        this.A0y = new C285045Pl(new C62320sa[16]);
        this.A0e = new AnonymousClass5VQ(this);
        this.A1B = new AnonymousClass5VR(this);
        this.A1E = new AnonymousClass9L8(this, 33);
        if (i2 < 29) {
            r02 = new GSM(A062);
        } else {
            r02 = new AnonymousClass5VS();
        }
        this.A0g = r02;
        addOnAttachStateChangeListener(this.A04);
        setWillNotDraw(false);
        setFocusable(true);
        setFocusable(1);
        setDefaultFocusHighlightEnabled(false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        03v.A0B(this, androidComposeViewAccessibilityDelegateCompat);
        setOnDragListener(r6);
        this.A0Y.A0W(this);
        if (i2 >= 29) {
            C286385Wd.A00(this);
            if (i2 >= 31) {
                r3 = new C290045ef();
            }
        }
        this.A17 = r3;
        this.A0W = new C286395We(this);
    }

    private final long A02(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                size = Integer.MAX_VALUE;
            } else if (mode == 1073741824) {
                long j = (long) size;
                return j | (j << 32);
            } else {
                throw new IllegalStateException();
            }
        }
        return ((long) size) | (0 << 32);
    }

    public static final AnonymousClass5VN A04(AndroidComposeView androidComposeView) {
        if (androidComposeView.isFocused()) {
            C268794e0 A002 = C56608I4i.A00(((AnonymousClass5QY) androidComposeView.A0S).A01);
            if (A002 != null) {
                return C56608I4i.A02(A002);
            }
            return null;
        }
        View findFocus = androidComposeView.findFocus();
        if (findFocus == null) {
            return null;
        }
        int[] iArr = XY5.A00;
        findFocus.getLocationInWindow(iArr);
        float f = (float) iArr[0];
        return new AnonymousClass5VN(f, (float) iArr[1], f + ((float) findFocus.getWidth()), ((float) iArr[1]) + ((float) findFocus.getHeight()));
    }

    private final void A07(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).DC6();
            } else if (childAt instanceof ViewGroup) {
                A07((ViewGroup) childAt);
            }
        }
    }

    private final void A09(AnonymousClass5R6 r5) {
        r5.A0K();
        C285045Pl A0A2 = r5.A0A();
        int i = A0A2.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A2.A02;
            do {
                A09((AnonymousClass5R6) objArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r3 == r4.A0Y) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0B(X.AnonymousClass5R6 r3, androidx.compose.ui.platform.AndroidComposeView r4) {
        /*
            boolean r0 = r4.isLayoutRequested()
            if (r0 != 0) goto L_0x003b
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L_0x003b
            if (r3 == 0) goto L_0x0043
        L_0x000e:
            X.5SI r0 = r3.A0U
            X.5SJ r0 = r0.A0J
            java.lang.Integer r1 = r0.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0034
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x003c
            X.5R6 r0 = r3.A0B()
            if (r0 == 0) goto L_0x0034
            X.5RP r0 = r0.A0W
            X.4e4 r0 = r0.A06
            long r1 = r0.A04
            boolean r0 = androidx.compose.ui.unit.Constraints.A09(r1)
            if (r0 == 0) goto L_0x003c
            boolean r0 = androidx.compose.ui.unit.Constraints.A08(r1)
            if (r0 == 0) goto L_0x003c
        L_0x0034:
            X.5R6 r0 = r4.A0Y
            if (r3 != r0) goto L_0x0043
        L_0x0038:
            r4.requestLayout()
        L_0x003b:
            return
        L_0x003c:
            X.5R6 r3 = r3.A0B()
            if (r3 == 0) goto L_0x0034
            goto L_0x000e
        L_0x0043:
            int r0 = r4.getWidth()
            if (r0 == 0) goto L_0x0038
            int r0 = r4.getHeight()
            if (r0 == 0) goto L_0x0038
            r4.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A0B(X.5R6, androidx.compose.ui.platform.AndroidComposeView):void");
    }

    public static final void A0C(AndroidComposeView androidComposeView) {
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            super.clearFocus();
        }
    }

    private final boolean A0G(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f > x || x > ((float) getWidth()) || 0.0f > y || y > ((float) getHeight())) {
            return false;
        }
        return true;
    }

    private final boolean A0H(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.A03) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) {
            return false;
        }
        return true;
    }

    public static final boolean A0I(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y)) {
                float rawX = motionEvent.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = motionEvent.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        int pointerCount = motionEvent.getPointerCount();
                        int i = 1;
                        while (i < pointerCount) {
                            float x2 = motionEvent.getX(i);
                            if (!Float.isInfinite(x2) && !Float.isNaN(x2)) {
                                float y2 = motionEvent.getY(i);
                                if (!Float.isInfinite(y2) && !Float.isNaN(y2) && (Build.VERSION.SDK_INT < 29 || C54744HRc.A00(motionEvent, i))) {
                                    i++;
                                }
                            }
                        }
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean A0J(I1T i1t, AnonymousClass5VN r2, AndroidComposeView androidComposeView) {
        int i;
        Rect rect;
        Integer A012;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            return true;
        }
        if (i1t == null || (A012 = I2C.A01(i1t.A00)) == null) {
            i = 130;
        } else {
            i = A012.intValue();
        }
        if (r2 != null) {
            rect = I2D.A00(r2);
        } else {
            rect = null;
        }
        return super.requestFocus(i, rect);
    }

    public final void CgZ(float[] fArr) {
        A0D(this);
        AnonymousClass5S4.A05(fArr, this.A0o);
        long j = this.A02;
        float A012 = C289295dM.A01(j);
        float A022 = C289295dM.A02(j);
        float[] fArr2 = this.A1F;
        AnonymousClass5S4.A02(fArr2);
        AnonymousClass5S4.A04(fArr2, A012, A022);
        C285805St.A01(fArr, fArr2);
    }

    public final long Cga(long j) {
        A0D(this);
        long A002 = AnonymousClass5S4.A00(this.A0o, j);
        float A012 = C289295dM.A01(A002);
        long j2 = this.A02;
        return C289325dP.A00(A012 + C289295dM.A01(j2), C289295dM.A02(A002) + C289295dM.A02(j2));
    }

    public final long EKS(long j) {
        A0D(this);
        float A012 = C289295dM.A01(j);
        long j2 = this.A02;
        return AnonymousClass5S4.A00(this.A0p, C289325dP.A00(A012 - C289295dM.A01(j2), C289295dM.A02(j) - C289295dM.A02(j2)));
    }

    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            A09(this.A0Y);
        }
        Co0(true);
        AnonymousClass5PH.A05();
        this.A0L = true;
        AnonymousClass5R3 r2 = this.A11.A00;
        Canvas canvas2 = r2.A00;
        r2.A00 = canvas;
        this.A0Y.A0W.A04.A0k(r2, (GraphicsLayer) null);
        r2.A00 = canvas2;
        List list = this.A1C;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C289195dB) list.get(i)).FK9();
            }
        }
        if (C289385dV.A0I) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        list.clear();
        this.A0L = false;
        List list2 = this.A0I;
        if (list2 != null) {
            list.addAll(list2);
            list2.clear();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return this.A0S.APg(keyEvent, new C58718IwR(19, (Object) keyEvent, (Object) this));
        }
        C285335Qw.A01.Epw(new C285355Qy(keyEvent.getMetaState()));
        if (this.A0S.APg(keyEvent, C41576Awq.A00) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (isFocused()) {
            AnonymousClass5QY r1 = (AnonymousClass5QY) this.A0S;
            if (!r1.A03.A01()) {
                C268794e0 A002 = C56608I4i.A00(r1.A01);
                String A003 = C273654mx.A00(196);
                if (A002 != null) {
                    C267794cD r8 = A002.A03;
                    if (r8.A08) {
                        AnonymousClass5R6 A022 = AnonymousClass5WH.A02(A002);
                        if (A022 != null) {
                            while (true) {
                                if ((A022.A0W.A02.A00 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
                                    while (r8 != null) {
                                        if ((r8.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
                                            C285045Pl r4 = null;
                                            C267794cD r3 = r8;
                                            do {
                                                if ((r3.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 && (r3 instanceof C267944cV)) {
                                                    int i = 0;
                                                    for (C267794cD r2 = ((C267944cV) r3).A00; r2 != null; r2 = r2.A02) {
                                                        if ((r2.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
                                                            i++;
                                                            if (i == 1) {
                                                                r3 = r2;
                                                            } else {
                                                                if (r4 == null) {
                                                                    r4 = new C285045Pl(new C267794cD[16]);
                                                                }
                                                                if (r3 != null) {
                                                                    r4.A09(r3);
                                                                    r3 = null;
                                                                }
                                                                r4.A09(r2);
                                                            }
                                                        }
                                                    }
                                                    if (i == 1) {
                                                        continue;
                                                    }
                                                }
                                                r3 = AnonymousClass5WH.A00(r4);
                                                continue;
                                            } while (r3 != null);
                                        }
                                        r8 = r8.A04;
                                    }
                                }
                                A022 = A022.A0B();
                                if (A022 == null) {
                                    break;
                                }
                                AnonymousClass5RP r0 = A022.A0W;
                                if (r0 != null) {
                                    r8 = r0.A05;
                                } else {
                                    r8 = null;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException(A003);
                    }
                }
            } else {
                throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.");
            }
        }
        if (super.dispatchKeyEventPreIme(keyEvent)) {
            return true;
        }
        return false;
    }

    public final void getFocusedRect(Rect rect) {
        AnonymousClass5VN A042 = A04(this);
        if (A042 != null) {
            rect.left = Math.round(A042.A01);
            rect.top = Math.round(A042.A03);
            rect.right = Math.round(A042.A02);
            rect.bottom = Math.round(A042.A00);
            return;
        }
        super.getFocusedRect(rect);
    }

    public final void onAttachedToWindow() {
        AnonymousClass07V lifecycle;
        IllegalStateException illegalStateException;
        int i;
        AnonymousClass07V lifecycle2;
        AnonymousClass07Z r0;
        int A062 = AnonymousClass0fD.A06(-1959921902);
        super.onAttachedToWindow();
        this.A0k.A00.Epw(Boolean.valueOf(hasWindowFocus()));
        AnonymousClass5R6 r02 = this.A0Y;
        A0A(r02);
        A09(r02);
        AnonymousClass5TE r1 = this.A0b.A00;
        r1.A00 = AnonymousClass5PH.A01(r1.A08);
        AnonymousClass5T9 r03 = this.A0P;
        if (r03 != null) {
            r03.A01.registerCallback(AnonymousClass5XJ.A00);
        }
        AnonymousClass07Z A002 = C71362ch.A00(this);
        AnonymousClass0g9 A003 = C71372cj.A00(this);
        AnonymousClass5XH viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(A002 == null || A003 == null || (A002 == (r0 = viewTreeOwners.A00) && A003 == r0))) {
            if (A002 == null) {
                illegalStateException = new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                i = 300320207;
            } else if (A003 != null) {
                if (!(viewTreeOwners == null || (lifecycle2 = viewTreeOwners.A00.getLifecycle()) == null)) {
                    lifecycle2.A0A(this);
                }
                A002.getLifecycle().A09(this);
                AnonymousClass5XH r12 = new AnonymousClass5XH(A002, A003);
                set_viewTreeOwners(r12);
                0sP r04 = this.A0J;
                if (r04 != null) {
                    r04.invoke(r12);
                }
                this.A0J = null;
            } else {
                illegalStateException = new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                i = -1768683960;
            }
            AnonymousClass0fD.A0D(i, A062);
            throw illegalStateException;
        }
        AnonymousClass5V7 r13 = this.A0V;
        int i2 = 2;
        if (isInTouchMode()) {
            i2 = 1;
        }
        r13.A00.Epw(new AnonymousClass5V9(i2));
        AnonymousClass5XH viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 == null || (lifecycle = viewTreeOwners2.A00.getLifecycle()) == null) {
            I2E.A02("No lifecycle owner exists");
            throw AnonymousClass00P.createAndThrow();
        }
        lifecycle.A09(this);
        lifecycle.A09(this.A04);
        getViewTreeObserver().addOnGlobalLayoutListener(this.A0q);
        getViewTreeObserver().addOnScrollChangedListener(this.A0r);
        getViewTreeObserver().addOnTouchModeChangeListener(this.A0s);
        if (Build.VERSION.SDK_INT >= 31) {
            C290175es.A01(this);
        }
        AnonymousClass0fD.A0D(-1067590519, A062);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        setDensity(AnonymousClass5QG.A00(context));
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
        } else {
            i = 0;
        }
        if (i != this.A0C) {
            this.A0C = i;
            setFontFamilyResolver(C286255Un.A00(context));
        }
        this.A06.invoke(configuration);
    }

    public final void onDetachedFromWindow() {
        AnonymousClass07V lifecycle;
        int A062 = AnonymousClass0fD.A06(-1116022190);
        super.onDetachedFromWindow();
        AnonymousClass5TE r1 = this.A0b.A00;
        C285105Ps r0 = r1.A00;
        if (r0 != null) {
            r0.dispose();
        }
        r1.A01();
        AnonymousClass5XH viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (lifecycle = viewTreeOwners.A00.getLifecycle()) == null) {
            I2E.A02("No lifecycle owner exists");
            throw AnonymousClass00P.createAndThrow();
        }
        lifecycle.A0A(this.A04);
        lifecycle.A0A(this);
        AnonymousClass5T9 r02 = this.A0P;
        if (r02 != null) {
            r02.A01.unregisterCallback(AnonymousClass5XJ.A00);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.A0q);
        getViewTreeObserver().removeOnScrollChangedListener(this.A0r);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.A0s);
        if (Build.VERSION.SDK_INT >= 31) {
            C290175es.A00(this);
        }
        AnonymousClass0fD.A0D(-1851654044, A062);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A062 = AnonymousClass0fD.A06(-860137054);
        super.onFocusChanged(z, i, rect);
        if (!z && !hasFocus()) {
            AnonymousClass5QY r3 = (AnonymousClass5QY) this.A0S;
            C285195Qd r2 = r3.A04;
            if (r2.A00) {
                C56664I6t.A07(r3.A01, true);
            } else {
                try {
                    r2.A00 = true;
                    C56664I6t.A07(r3.A01, true);
                } finally {
                    C285195Qd.A01(r2);
                }
            }
        }
        AnonymousClass0fD.A0D(977271201, A062);
    }

    public final void onResume(AnonymousClass07Z r2) {
        this.A0A = AnonymousClass5XL.A00();
    }

    public final void onWindowFocusChanged(boolean z) {
        boolean A002;
        int A062 = AnonymousClass0fD.A06(-1134802228);
        this.A0k.A00.Epw(Boolean.valueOf(z));
        this.A0N = true;
        super.onWindowFocusChanged(z);
        if (z && this.A0A != (A002 = AnonymousClass5XL.A00())) {
            this.A0A = A002;
            A09(this.A0Y);
        }
        AnonymousClass0fD.A0D(-192035441, A062);
    }

    public final boolean requestFocus(int i, Rect rect) {
        int i2;
        AnonymousClass5VN r2;
        if (isFocused()) {
            return true;
        }
        AnonymousClass5QZ r6 = this.A0S;
        if (((AnonymousClass5QY) r6).A01.A0I().BBB()) {
            return super.requestFocus(i, rect);
        }
        if (isInTouchMode()) {
            return false;
        }
        I1T A002 = I2C.A00(i);
        if (A002 != null) {
            i2 = A002.A00;
        } else {
            i2 = 7;
        }
        if (rect != null) {
            r2 = new AnonymousClass5VN((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        } else {
            r2 = null;
        }
        Boolean AW7 = r6.AW7(r2, new GLV(i2, 3), i2);
        if (AW7 != null) {
            return AW7.booleanValue();
        }
        return false;
    }

    public final void setOnViewTreeOwnersAvailable(0sP r2) {
        AnonymousClass5XH viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            r2.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.A0J = r2;
        }
    }

    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        super.dispatchProvideStructure(viewStructure);
    }

    public final void setConfigurationChangeObserver(0sP r1) {
        this.A06 = r1;
    }

    public final void setContentCaptureManager$ui_release(AndroidContentCaptureManager androidContentCaptureManager) {
        this.A04 = androidContentCaptureManager;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.A00 = j;
    }

    public void setShowLayoutBounds(boolean z) {
        this.A0A = z;
    }

    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addView(view, -1, generateDefaultLayoutParams);
    }

    public C285825Sw getAccessibilityManager() {
        return this.A0c;
    }

    public AnonymousClass5TB getClipboardManager() {
        return this.A0d;
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    public final void addView(View view, int i) {
        0qQ.A0A(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i, layoutParams);
    }
}
