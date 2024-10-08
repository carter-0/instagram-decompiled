package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.instagram.android.R;

/* renamed from: X.Gdi  reason: case insensitive filesystem */
public final class C52849Gdi extends ViewGroup implements AnonymousClass5R9, C268094ck, 0kz {
    public static final 0sP A0U = C58913Izc.A00;
    public int A00;
    public int A01;
    public Modifier A02;
    public C268024cd A03;
    public C62320sa A04 = C58252Iov.A00;
    public C62320sa A05 = C58253Iow.A00;
    public C62320sa A06 = C58254Iox.A00;
    public 0sP A07;
    public 0sP A08;
    public 0sP A09;
    public 0sP A0A;
    public 0sP A0B;
    public 0sP A0C;
    public boolean A0D;
    public boolean A0E;
    public C305556In A0F;
    public AnonymousClass07Z A0G;
    public AnonymousClass0g9 A0H;
    public final View A0I;
    public final View A0J;
    public final AnonymousClass5Y2 A0K;
    public final NestedScrollDispatcher A0L;
    public final NestedScrollDispatcher A0M;
    public final AnonymousClass5R6 A0N;
    public final C268124co A0O;
    public final AnonymousClass03P A0P;
    public final String A0Q;
    public final C62320sa A0R;
    public final C62320sa A0S;
    public final int[] A0T;

    public static final void A02(C52849Gdi gdi) {
        gdi.setSavableRegistryEntry((C305556In) null);
    }

    public final boolean DmW(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    public final boolean gatherTransparentRegion(Region region) {
        Region region2 = region;
        if (region != null) {
            int[] iArr = this.A0T;
            getLocationInWindow(iArr);
            int i = iArr[0];
            region2.op(i, iArr[1], i + getWidth(), iArr[1] + getHeight(), Region.Op.DIFFERENCE);
        }
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (this.A0J.isNestedScrollingEnabled()) {
            long A002 = GQF.A00(f * -1.0f, f2 * -1.0f);
            C262224Cq r0 = (C262224Cq) this.A0M.A01.invoke();
            if (r0 != null) {
                AnonymousClass7TE.A1Z(new MGA((Object) this, (AnonymousClass4D7) null, 3, A002), r0);
            } else {
                throw AnonymousClass7TE.A0z(C273654mx.A00(750));
            }
        }
        return false;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public static final int A00(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(C229632nm.A03(i3, i, i2), SN3.MAX_SIGNED_POWER_OF_TWO);
        }
        if (i3 == -2) {
            if (i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, AnonymousClass972.MUTABLE_FLAG_MASK);
            }
        } else if (i3 == -1 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, SN3.MAX_SIGNED_POWER_OF_TWO);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    private final void setSavableRegistryEntry(C305556In r2) {
        C305556In r0 = this.A0F;
        if (r0 != null) {
            r0.FIq();
        }
        this.A0F = r2;
    }

    public final void D7s() {
        this.A05.invoke();
        removeAllViewsInLayout();
    }

    public final void DTk(View view, int[] iArr, int i, int i2, int i3) {
        long j;
        if (this.A0J.isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.A0M;
            long A002 = C289325dP.A00(((float) i) * -1.0f, ((float) i2) * -1.0f);
            int i4 = 2;
            if (i3 == 0) {
                i4 = 1;
            }
            NestedScrollNode A003 = nestedScrollDispatcher.A00();
            if (A003 != null) {
                j = A003.DYf(A002, i4);
            } else {
                j = 0;
            }
            iArr[0] = GRV.A00(C289295dM.A01(j));
            iArr[1] = GRV.A00(C289295dM.A02(j));
        }
    }

    public final void DTl(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.A0J.isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.A0M;
            long A002 = C289325dP.A00(((float) i) * -1.0f, ((float) i2) * -1.0f);
            long A003 = C289325dP.A00(((float) i3) * -1.0f, ((float) i4) * -1.0f);
            int i6 = 2;
            if (i5 == 0) {
                i6 = 1;
            }
            NestedScrollNode A004 = nestedScrollDispatcher.A00();
            if (A004 != null) {
                A004.DYX(A002, A003, i6);
            }
        }
    }

    public final void DTm(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        long j;
        if (this.A0J.isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.A0M;
            long A002 = C289325dP.A00(((float) i) * -1.0f, ((float) i2) * -1.0f);
            long A003 = C289325dP.A00(((float) i3) * -1.0f, ((float) i4) * -1.0f);
            int i6 = 2;
            if (i5 == 0) {
                i6 = 1;
            }
            NestedScrollNode A004 = nestedScrollDispatcher.A00();
            if (A004 != null) {
                j = A004.DYX(A002, A003, i6);
            } else {
                j = 0;
            }
            iArr[0] = GRV.A00(C289295dM.A01(j));
            iArr[1] = GRV.A00(C289295dM.A02(j));
        }
    }

    public final void DTn(View view, View view2, int i, int i2) {
        AnonymousClass03P r1 = this.A0P;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
    }

    public final void Dcz() {
        this.A04.invoke();
    }

    public final void Dfm() {
        View view = this.A0J;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.A05.invoke();
        }
    }

    public final void DnO(View view, int i) {
        AnonymousClass03P r2 = this.A0P;
        if (i == 1) {
            r2.A00 = 0;
        } else {
            r2.A01 = 0;
        }
    }

    public final C268024cd getDensity() {
        return this.A03;
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.A0L;
    }

    public final View getInteropView() {
        return this.A0J;
    }

    public final AnonymousClass5R6 getLayoutNode() {
        return this.A0N;
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.A0J.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final AnonymousClass07Z getLifecycleOwner() {
        return this.A0G;
    }

    public final Modifier getModifier() {
        return this.A02;
    }

    public int getNestedScrollAxes() {
        AnonymousClass03P r0 = this.A0P;
        return r0.A01 | r0.A00;
    }

    public final 0sP getOnDensityChanged$ui_release() {
        return this.A07;
    }

    public final 0sP getOnModifierChanged$ui_release() {
        return this.A08;
    }

    public final 0sP getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.A09;
    }

    public final C62320sa getRelease() {
        return this.A04;
    }

    public final 0sP getReleaseBlock() {
        return this.A0A;
    }

    public final C62320sa getReset() {
        return this.A05;
    }

    public final 0sP getResetBlock() {
        return this.A0B;
    }

    public final AnonymousClass0g9 getSavedStateRegistryOwner() {
        return this.A0H;
    }

    public /* synthetic */ AnonymousClass54O getSubCompositionView() {
        return null;
    }

    public final C62320sa getUpdate() {
        return this.A06;
    }

    public final 0sP getUpdateBlock() {
        return this.A0C;
    }

    public final View getView() {
        return this.A0J;
    }

    public View getViewRoot() {
        return this;
    }

    public final boolean isNestedScrollingEnabled() {
        return this.A0J.isNestedScrollingEnabled();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0J.layout(0, 0, i3 - i, i4 - i2);
    }

    public final void onMeasure(int i, int i2) {
        View view = this.A0J;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        } else if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
        } else {
            view.measure(i, i2);
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
            this.A01 = i;
            this.A00 = i2;
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.A0J.isNestedScrollingEnabled()) {
            long A002 = GQF.A00(f * -1.0f, f2 * -1.0f);
            C262224Cq r0 = (C262224Cq) this.A0M.A01.invoke();
            if (r0 != null) {
                AnonymousClass7TE.A1Z(new MFZ(this, (AnonymousClass4D7) null, A002, z), r0);
            } else {
                throw AnonymousClass7TE.A0z(C273654mx.A00(750));
            }
        }
        return false;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        0sP r0 = this.A09;
        if (r0 != null) {
            C51968G9o.A1O(r0, z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(C268024cd r2) {
        if (r2 != this.A03) {
            this.A03 = r2;
            0sP r0 = this.A07;
            if (r0 != null) {
                r0.invoke(r2);
            }
        }
    }

    public final void setLifecycleOwner(AnonymousClass07Z r2) {
        if (r2 != this.A0G) {
            this.A0G = r2;
            C71362ch.A01(this, r2);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.A02) {
            this.A02 = modifier;
            0sP r0 = this.A08;
            if (r0 != null) {
                r0.invoke(modifier);
            }
        }
    }

    public final void setReleaseBlock(0sP r3) {
        this.A0A = r3;
        this.A04 = new C13347TVu((Object) this, 5);
    }

    public final void setResetBlock(0sP r3) {
        this.A0B = r3;
        this.A05 = new C13347TVu((Object) this, 6);
    }

    public final void setSavedStateRegistryOwner(AnonymousClass0g9 r2) {
        if (r2 != this.A0H) {
            this.A0H = r2;
            C71372cj.A01(this, r2);
        }
    }

    public final void setUpdate(C62320sa r2) {
        this.A06 = r2;
        this.A0D = true;
        this.A0S.invoke();
    }

    public final void setUpdateBlock(0sP r3) {
        this.A0C = r3;
        setUpdate(new C13347TVu((Object) this, 7));
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.03P] */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, X.5bj, X.0sP] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52849Gdi(Context context, AnonymousClass5PL r12, AnonymousClass5Y2 r13, C268124co r14, 0sP r15, int i) {
        super(context);
        SparseArray sparseArray;
        View view = (View) r15.invoke(context);
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.A0M = nestedScrollDispatcher;
        this.A0J = view;
        this.A0O = r14;
        setTag(R.id.androidx_compose_ui_view_composition_context, r12);
        setSaveFromParentEnabled(false);
        addView(view);
        C285245Qk r8 = Modifier.A00;
        this.A02 = r8;
        this.A03 = new AnonymousClass5Q7(1.0f, 1.0f);
        this.A0S = new C13347TVu((Object) this, 3);
        this.A0R = new C13347TVu((Object) this, 2);
        this.A0T = new int[2];
        this.A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A0P = new Object();
        AnonymousClass5R6 r4 = new AnonymousClass5R6(false, AnonymousClass5R5.A00.addAndGet(1));
        r4.A0E = this;
        Modifier A002 = AnonymousClass5R5.A00(C51970G9q.A0V(r8, C56387Hxg.A00, this.A0M), C58915Ize.A00, true);
        C288335bk r82 = new C288335bk();
        r82.A01 = J6M.A00(this, 32);
        ? obj = new Object();
        C288325bj r3 = r82.A00;
        if (r3 != null) {
            r3.A00 = null;
        }
        r82.A00 = obj;
        obj.A00 = r82;
        this.A09 = obj;
        Modifier A0W = C51970G9q.A0W(C289575dp.A00(A002.Ezh(r82), new C58751Iwy(12, r4, this, this)), new TYA(6, (Object) this, (Object) r4));
        r4.Edb(this.A02.Ezh(A0W));
        this.A08 = new TYA(3, (Object) r4, (Object) A0W);
        r4.EUC(this.A03);
        this.A07 = J6M.A00(r4, 41);
        r4.A0G = new TYA(4, (Object) this, (Object) r4);
        r4.A0H = J6M.A00(this, 42);
        r4.Ecq(new IGS(0, r4, this));
        this.A0N = r4;
        this.A0I = view;
        this.A0L = nestedScrollDispatcher;
        this.A0K = r13;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        this.A0Q = valueOf;
        Object AJV = r13 != null ? r13.AJV(valueOf) : null;
        if ((AJV instanceof SparseArray) && (sparseArray = (SparseArray) AJV) != null) {
            view.restoreHierarchyState(sparseArray);
        }
        AnonymousClass5Y2 r2 = this.A0K;
        if (r2 != null) {
            setSavableRegistryEntry(r2.EC0(this.A0Q, new C13347TVu((Object) this, 4)));
        }
        0sP r0 = I63.A00;
        this.A0C = r0;
        this.A0B = r0;
        this.A0A = r0;
    }

    /* access modifiers changed from: private */
    public final AnonymousClass5TD getSnapshotObserver() {
        if (isAttachedToWindow()) {
            return ((AndroidComposeView) this.A0O).A0b;
        }
        I2E.A01("Expected AndroidViewHolder to be attached when observing reads.");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CeH() {
        return isAttachedToWindow();
    }

    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (this.A0E) {
            this.A0J.postOnAnimation(new C57701If4(this.A0R));
            return null;
        }
        this.A0N.A0J();
        return null;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-49646196);
        super.onAttachedToWindow();
        this.A0S.invoke();
        AnonymousClass0fD.A0D(612489332, A062);
    }

    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (this.A0E) {
            this.A0J.postOnAnimation(new C57701If4(this.A0R));
        } else {
            this.A0N.A0J();
        }
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(580764336);
        super.onDetachedFromWindow();
        C285045Pl r6 = getSnapshotObserver().A00.A05;
        synchronized (r6) {
            int i = r6.A00;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                AnonymousClass5TF r13 = (AnonymousClass5TF) r6.A02[i3];
                0vu r0 = (0vu) r13.A04.A07(this);
                if (r0 != null) {
                    Object[] objArr = r0.A04;
                    long[] jArr = r0.A03;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i5 = 8 - (((i4 - length) ^ -1) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((255 & j) < 128) {
                                        AnonymousClass5TF.A01(r13, this, objArr[(i4 << 3) + i6]);
                                    }
                                    j >>= 8;
                                }
                                if (i5 != 8) {
                                    break;
                                }
                            }
                            if (i4 == length) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
                if (r13.A04.A01 == 0) {
                    i2++;
                } else if (i2 > 0) {
                    Object[] objArr2 = r6.A02;
                    objArr2[i3 - i2] = objArr2[i3];
                }
            }
            int i7 = i - i2;
            0Yw.A0U(r6.A02, i7, i);
            r6.A00 = i7;
        }
        AnonymousClass0fD.A0D(-1556579525, A062);
    }

    public final void onWindowVisibilityChanged(int i) {
        int A062 = AnonymousClass0fD.A06(-162848620);
        super.onWindowVisibilityChanged(i);
        AnonymousClass0fD.A0D(46239234, A062);
    }

    public final void setOnDensityChanged$ui_release(0sP r1) {
        this.A07 = r1;
    }

    public final void setOnModifierChanged$ui_release(0sP r1) {
        this.A08 = r1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(0sP r1) {
        this.A09 = r1;
    }

    public final void setRelease(C62320sa r1) {
        this.A04 = r1;
    }

    public final void setReset(C62320sa r1) {
        this.A05 = r1;
    }
}
