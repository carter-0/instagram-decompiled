package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;

public final class W0R {
    public HashMap A00;
    public final RectF A01 = new RectF();
    public final SparseArray A02;
    public final SparseArray A03;
    public final SparseBooleanArray A04;
    public final C19061WIq A05 = new C19061WIq();
    public final RootViewManager A06;
    public final W4T A07;
    public final C18613Vv6 A08 = new C18613Vv6();
    public volatile boolean A09;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.react.uimanager.ViewManager, com.facebook.react.uimanager.RootViewManager] */
    public W0R(W4T w4t) {
        ? viewManager = new ViewManager((QZK) null);
        this.A07 = w4t;
        this.A03 = new SparseArray();
        this.A02 = new SparseArray();
        this.A04 = new SparseBooleanArray();
        this.A06 = viewManager;
    }

    public final synchronized View A02(int i) {
        View view;
        view = (View) this.A03.get(i);
        if (view == null) {
            throw new QZA(002.A0c("Trying to resolve view with tag ", " which doesn't exist", i));
        }
        return view;
    }

    public final synchronized ViewManager A03(int i) {
        ViewManager viewManager;
        viewManager = (ViewManager) this.A02.get(i);
        if (viewManager == null) {
            throw new QZA(002.A0c("ViewManager for tag ", " could not be found.\n", i));
        }
        return viewManager;
    }

    @Deprecated
    public final synchronized void A04(int i, int i2, ReadableArray readableArray) {
        View view = (View) this.A03.get(i);
        if (view != null) {
            A03(i).receiveCommand(view, i2, readableArray);
        } else {
            throw new RuntimeException(002.A02(i, i2, "Trying to send command to a non-existing view with tag [", "] and command "));
        }
    }

    public final synchronized void A05(int i, String str, ReadableArray readableArray) {
        View view = (View) this.A03.get(i);
        if (view != null) {
            A03(i).receiveCommand(view, str, readableArray);
        } else {
            throw new RuntimeException(002.A05(i, "Trying to send command to a non-existing view with tag [", "] and command ", str));
        }
    }

    public final synchronized void A06(int i, int[] iArr) {
        RuntimeException runtimeException;
        View view = (View) this.A03.get(i);
        if (view != null) {
            View view2 = (View) C18101VlV.A00(view);
            if (view2 != null) {
                A01(view2, iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                A01(view, iArr);
                iArr[0] = iArr[0] - i2;
                iArr[1] = iArr[1] - i3;
            } else {
                String A0c = 002.A0c("Native view ", " is no longer on screen", i);
                0qQ.A0B(A0c, 1);
                runtimeException = new RuntimeException(A0c);
            }
        } else {
            String A0c2 = 002.A0c("No native view for ", " currently exists", i);
            0qQ.A0B(A0c2, 1);
            runtimeException = new RuntimeException(A0c2);
        }
        throw runtimeException;
    }

    public final synchronized void A07(View view) {
        if (view != null) {
            SparseArray sparseArray = this.A02;
            if (sparseArray.get(view.getId()) != null) {
                if (!this.A04.get(view.getId())) {
                    A03(view.getId()).onDropViewInstance(view);
                }
                ViewManager viewManager = (ViewManager) sparseArray.get(view.getId());
                if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                    int childCount = viewGroupManager.getChildCount(viewGroup);
                    while (true) {
                        childCount--;
                        if (childCount < 0) {
                            break;
                        }
                        View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                        if (childAt == null) {
                            0I1.A03("NativeViewHierarchyManager", "Unable to drop null child view");
                        } else if (this.A03.get(childAt.getId()) != null) {
                            A07(childAt);
                        }
                    }
                    viewGroupManager.removeAllViews(viewGroup);
                }
                this.A03.remove(view.getId());
                sparseArray.remove(view.getId());
            }
        }
    }

    public final synchronized void A08(C17763VfZ vfZ, int i) {
        try {
            A03(i).updateProperties(A02(i), vfZ);
        } catch (QZA e) {
            0I1.A05("NativeViewHierarchyManager", 002.A0O("Unable to update properties for view tag ", i), e);
        }
        return;
    }

    public static String A00(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, int[] iArr2, C18600Vut[] vutArr) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append(002.A08(viewGroup.getId(), "View tag:", " View Type:", viewGroup.getClass().toString(), "\n"));
            sb.append(002.A0c("  children(", "): [\n", viewGroupManager.getChildCount(viewGroup)));
            for (int i = 0; viewGroupManager.getChildAt(viewGroup, i) != null; i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (viewGroupManager.getChildAt(viewGroup, i3) == null || i2 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(002.A03(viewGroupManager.getChildAt(viewGroup, i3).getId(), ","));
                        i2++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            int length = iArr.length;
            sb.append(002.A0c("  indicesToRemove(", "): [\n", length));
            for (int i4 = 0; i4 < length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 >= length || i5 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(002.A03(iArr[i6], ","));
                        i5++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (vutArr != null) {
            int length2 = vutArr.length;
            sb.append(002.A0c("  viewsToAdd(", "): [\n", length2));
            for (int i7 = 0; i7 < length2; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 >= length2 || i8 >= 16) {
                        sb.append("\n");
                    } else {
                        C18600Vut vut = vutArr[i9];
                        sb.append(002.A0n("[", ",", "],", vut.A00, vut.A01));
                        i8++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            int length3 = iArr2.length;
            sb.append(002.A0c("  tagsToDelete(", "): [\n", length3));
            for (int i10 = 0; i10 < length3; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 >= length3 || i11 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(002.A03(iArr2[i12], ","));
                        i11++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    private void A01(View view, int[] iArr) {
        RectF rectF = this.A01;
        C13990Tnq.A0q(rectF, (float) view.getWidth(), view.getHeight());
        while (true) {
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                matrix.mapRect(rectF);
            }
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
                rectF.offset((float) (-view.getScrollX()), (float) (-view.getScrollY()));
            } else {
                float f = rectF.left;
                iArr[0] = Math.round(f);
                float f2 = rectF.top;
                iArr[1] = Math.round(f2);
                iArr[2] = Math.round(rectF.right - f);
                iArr[3] = Math.round(rectF.bottom - f2);
                return;
            }
        }
    }
}
