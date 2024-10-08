package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Qm  reason: invalid class name and case insensitive filesystem */
public final class C355568Qm extends AnonymousClass3B3 implements C2366234l {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06 = 0;
    public int A07 = -1;
    public int A08;
    public int A09;
    public long A0A;
    public Rect A0B;
    public VelocityTracker A0C;
    public View A0D = null;
    public AnonymousClass030 A0E;
    public C355538Qj A0F;
    public C355648Qu A0G;
    public C249703kE A0H = null;
    public RecyclerView A0I;
    public List A0J;
    public List A0K = new ArrayList();
    public List A0L;
    public float A0M;
    public float A0N;
    public final C331097Pn A0O = new C355588Qo(this);
    public final Runnable A0P = new C355578Qn(this);
    public final List A0Q = new ArrayList();
    public final float[] A0R = new float[2];

    public final void D1l(View view) {
    }

    private int A00(C249703kE r9, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = 8;
        int i3 = 4;
        if (this.A00 > 0.0f) {
            i3 = 8;
        }
        VelocityTracker velocityTracker = this.A0C;
        if (velocityTracker != null && this.A07 > -1) {
            C355538Qj r6 = this.A0F;
            velocityTracker.computeCurrentVelocity(IgNetworkConsentStorage.MAX_ENTRIES, this.A0M);
            float xVelocity = this.A0C.getXVelocity(this.A07);
            float yVelocity = this.A0C.getYVelocity(this.A07);
            if (xVelocity <= 0.0f) {
                i2 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i2 & i) != 0 && i3 == i2 && abs >= r6.getSwipeEscapeVelocity(this.A0N) && abs > Math.abs(yVelocity)) {
                return i2;
            }
        }
        float width = ((float) this.A0I.getWidth()) * this.A0F.getSwipeThreshold(r9);
        if ((i & i3) == 0 || Math.abs(this.A00) <= width) {
            return 0;
        }
        return i3;
    }

    private int A01(C249703kE r8, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = 2;
        int i3 = 1;
        if (this.A01 > 0.0f) {
            i3 = 2;
        }
        VelocityTracker velocityTracker = this.A0C;
        if (velocityTracker != null && this.A07 > -1) {
            C355538Qj r5 = this.A0F;
            velocityTracker.computeCurrentVelocity(IgNetworkConsentStorage.MAX_ENTRIES, this.A0M);
            float xVelocity = this.A0C.getXVelocity(this.A07);
            float yVelocity = this.A0C.getYVelocity(this.A07);
            if (yVelocity <= 0.0f) {
                i2 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i2 & i) != 0 && i2 == i3 && abs >= r5.getSwipeEscapeVelocity(this.A0N) && abs > Math.abs(xVelocity)) {
                return i2;
            }
        }
        float height = ((float) this.A0I.getHeight()) * this.A0F.getSwipeThreshold(r8);
        if ((i & i3) == 0 || Math.abs(this.A01) <= height) {
            return 0;
        }
        return i3;
    }

    private void A02(float[] fArr) {
        float translationX;
        float translationY;
        if ((this.A08 & 12) != 0) {
            translationX = (this.A04 + this.A00) - ((float) this.A0H.itemView.getLeft());
        } else {
            translationX = this.A0H.itemView.getTranslationX();
        }
        fArr[0] = translationX;
        if ((this.A08 & 3) != 0) {
            translationY = (this.A05 + this.A01) - ((float) this.A0H.itemView.getTop());
        } else {
            translationY = this.A0H.itemView.getTranslationY();
        }
        fArr[1] = translationY;
    }

    public final void A04(MotionEvent motionEvent, int i, int i2) {
        View A032;
        C249703kE A0Z;
        int absoluteMovementFlags;
        int i3;
        if (this.A0H == null && i == 2 && this.A06 != 2) {
            C355538Qj r4 = this.A0F;
            if (r4.isItemViewSwipeEnabled()) {
                RecyclerView recyclerView = this.A0I;
                if (recyclerView.getScrollState() != 1) {
                    C252553pI r6 = recyclerView.A0D;
                    int i4 = this.A07;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.A02);
                        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.A03);
                        float f = (float) this.A09;
                        if (abs < f && abs2 < f) {
                            return;
                        }
                        if (abs > abs2 && r6.A1X()) {
                            return;
                        }
                        if ((abs2 <= abs || !r6.A1Y()) && (A032 = A03(motionEvent)) != null && (A0Z = this.A0I.A0Z(A032)) != null && (absoluteMovementFlags = (r4.getAbsoluteMovementFlags(this.A0I, A0Z) & 65280) >> 8) != 0) {
                            float x = motionEvent.getX(i2);
                            float y = motionEvent.getY(i2);
                            float f2 = x - this.A02;
                            float f3 = y - this.A03;
                            float abs3 = Math.abs(f2);
                            float abs4 = Math.abs(f3);
                            float f4 = (float) this.A09;
                            if (abs3 >= f4 || abs4 >= f4) {
                                if (abs3 > abs4) {
                                    if (f2 >= 0.0f || (absoluteMovementFlags & 4) != 0) {
                                        if (f2 > 0.0f) {
                                            i3 = absoluteMovementFlags & 8;
                                        }
                                        this.A01 = 0.0f;
                                        this.A00 = 0.0f;
                                        this.A07 = motionEvent.getPointerId(0);
                                        A08(A0Z, 1);
                                    }
                                    return;
                                } else if (f3 >= 0.0f || (absoluteMovementFlags & 1) != 0) {
                                    if (f3 > 0.0f) {
                                        i3 = absoluteMovementFlags & 2;
                                    }
                                    this.A01 = 0.0f;
                                    this.A00 = 0.0f;
                                    this.A07 = motionEvent.getPointerId(0);
                                    A08(A0Z, 1);
                                } else {
                                    return;
                                }
                                if (i3 == 0) {
                                    return;
                                }
                                this.A01 = 0.0f;
                                this.A00 = 0.0f;
                                this.A07 = motionEvent.getPointerId(0);
                                A08(A0Z, 1);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void A06(C249703kE r21) {
        if (!this.A0I.isLayoutRequested() && this.A06 == 2) {
            C355538Qj r4 = this.A0F;
            int i = (int) (this.A04 + this.A00);
            int i2 = (int) (this.A05 + this.A01);
            C249703kE r5 = r21;
            if (((float) Math.abs(i2 - r5.itemView.getTop())) >= ((float) r5.itemView.getHeight()) * 0.5f || ((float) Math.abs(i - r5.itemView.getLeft())) >= ((float) r5.itemView.getWidth()) * 0.5f) {
                List list = this.A0L;
                if (list == null) {
                    this.A0L = new ArrayList();
                    this.A0J = new ArrayList();
                } else {
                    list.clear();
                    this.A0J.clear();
                }
                int round = Math.round(this.A04 + this.A00);
                int round2 = Math.round(this.A05 + this.A01);
                int width = r5.itemView.getWidth() + round;
                int height = r5.itemView.getHeight() + round2;
                int i3 = (round + width) / 2;
                int i4 = (round2 + height) / 2;
                C252553pI r19 = this.A0I.A0D;
                int A0T = r19.A0T();
                for (int i5 = 0; i5 < A0T; i5++) {
                    View A0X = r19.A0X(i5);
                    if (A0X != r5.itemView && A0X.getBottom() >= round2 && A0X.getTop() <= height && A0X.getRight() >= round && A0X.getLeft() <= width) {
                        C249703kE A0Z = this.A0I.A0Z(A0X);
                        if (r4.canDropOver(this.A0I, this.A0H, A0Z)) {
                            int abs = Math.abs(i3 - ((A0X.getLeft() + A0X.getRight()) / 2));
                            int abs2 = Math.abs(i4 - ((A0X.getTop() + A0X.getBottom()) / 2));
                            int i6 = (abs * abs) + (abs2 * abs2);
                            int size = this.A0L.size();
                            int i7 = 0;
                            int i8 = 0;
                            while (i7 < size && i6 > ((Number) this.A0J.get(i7)).intValue()) {
                                i8++;
                                i7++;
                            }
                            this.A0L.add(i8, A0Z);
                            this.A0J.add(i8, Integer.valueOf(i6));
                        }
                    }
                }
                List list2 = this.A0L;
                if (list2.size() != 0) {
                    C249703kE chooseDropTarget = r4.chooseDropTarget(r5, list2, i, i2);
                    if (chooseDropTarget == null) {
                        this.A0L.clear();
                        this.A0J.clear();
                        return;
                    }
                    int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
                    int absoluteAdapterPosition2 = r5.getAbsoluteAdapterPosition();
                    if (r4.onMove(this.A0I, r5, chooseDropTarget)) {
                        r4.onMoved(this.A0I, r5, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i, i2);
                    }
                }
            }
        }
    }

    public final void A07(C249703kE r4) {
        String str;
        if (!this.A0F.hasDragFlag(this.A0I, r4)) {
            str = "Start drag has been called but dragging is not enabled";
        } else if (r4.itemView.getParent() != this.A0I) {
            str = "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.";
        } else {
            VelocityTracker velocityTracker = this.A0C;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.A0C = VelocityTracker.obtain();
            this.A01 = 0.0f;
            this.A00 = 0.0f;
            A08(r4, 2);
            return;
        }
        Log.e("ItemTouchHelper", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r7 > 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015b, code lost:
        if (r7 > 0) goto L_0x015d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C249703kE r23, int r24) {
        /*
            r22 = this;
            r13 = r22
            X.3kE r0 = r13.A0H
            r6 = r23
            r5 = r24
            if (r6 != r0) goto L_0x000f
            int r0 = r13.A06
            if (r5 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r13.A0A = r0
            int r1 = r13.A06
            r4 = 1
            r13.A09(r6, r4)
            r13.A06 = r5
            r3 = 2
            if (r5 != r3) goto L_0x0024
            if (r23 == 0) goto L_0x0181
            android.view.View r0 = r6.itemView
            r13.A0D = r0
        L_0x0024:
            int r0 = r24 * 8
            r8 = 8
            int r0 = r0 + 8
            int r0 = r4 << r0
            int r11 = r0 + -1
            X.3kE r14 = r13.A0H
            r2 = 0
            if (r14 == 0) goto L_0x00d4
            android.view.View r0 = r14.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x016f
            if (r1 == r3) goto L_0x016c
            int r0 = r13.A06
            if (r0 == r3) goto L_0x016c
            X.8Qj r7 = r13.A0F
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0I
            int r10 = r7.getMovementFlags(r0, r14)
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0I
            int r0 = r0.getLayoutDirection()
            int r7 = r7.convertToAbsoluteDirection(r10, r0)
            r0 = 65280(0xff00, float:9.1477E-41)
            r7 = r7 & r0
            int r9 = r7 >> 8
            if (r9 == 0) goto L_0x016c
            r10 = r10 & r0
            int r10 = r10 >> 8
            float r0 = r13.A00
            float r7 = java.lang.Math.abs(r0)
            float r0 = r13.A01
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0151
            int r7 = r13.A00(r14, r9)
            if (r7 > 0) goto L_0x015d
            int r7 = r13.A01(r14, r9)
            if (r7 <= 0) goto L_0x016c
        L_0x007a:
            android.view.VelocityTracker r0 = r13.A0C
            if (r0 == 0) goto L_0x0084
            r0.recycle()
            r0 = 0
            r13.A0C = r0
        L_0x0084:
            r0 = 4
            if (r7 == r4) goto L_0x0140
            if (r7 == r3) goto L_0x0140
            if (r7 == r0) goto L_0x0130
            if (r7 == r8) goto L_0x0130
            r0 = 16
            if (r7 == r0) goto L_0x0130
            r0 = 32
            if (r7 == r0) goto L_0x0130
            r9 = 0
        L_0x0096:
            r8 = 0
        L_0x0097:
            if (r1 != r3) goto L_0x012a
            r10 = 8
        L_0x009b:
            float[] r0 = r13.A0R
            r13.A02(r0)
            r16 = r0[r2]
            r17 = r0[r4]
            X.AJN r12 = new X.AJN
            r15 = r14
            r19 = r8
            r20 = r1
            r21 = r7
            r18 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.8Qj r1 = r13.A0F
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0I
            float r9 = r9 - r16
            float r8 = r8 - r17
            long r0 = r1.getAnimationDuration(r0, r10, r9, r8)
            android.animation.ValueAnimator r7 = r12.A0B
            r7.setDuration(r0)
            java.util.List r0 = r13.A0K
            r0.add(r12)
            X.3kE r0 = r12.A0C
            r0.setIsRecyclable(r2)
            r7.start()
            r2 = 1
        L_0x00d1:
            r0 = 0
            r13.A0H = r0
        L_0x00d4:
            if (r23 == 0) goto L_0x0102
            X.8Qj r1 = r13.A0F
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0I
            int r1 = r1.getAbsoluteMovementFlags(r0, r6)
            r1 = r1 & r11
            int r0 = r13.A06
            int r0 = r0 * 8
            int r1 = r1 >> r0
            r13.A08 = r1
            android.view.View r0 = r6.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r13.A04 = r0
            android.view.View r0 = r6.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r13.A05 = r0
            r13.A0H = r6
            if (r5 != r3) goto L_0x0102
            android.view.View r1 = r6.itemView
            r0 = 0
            r1.performHapticFeedback(r0)
        L_0x0102:
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0I
            android.view.ViewParent r3 = r0.getParent()
            if (r3 == 0) goto L_0x0113
            X.3kE r1 = r13.A0H
            r0 = 0
            if (r1 == 0) goto L_0x0110
            r0 = 1
        L_0x0110:
            r3.requestDisallowInterceptTouchEvent(r0)
        L_0x0113:
            if (r2 != 0) goto L_0x011b
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0I
            X.3pI r0 = r0.A0D
            r0.A0F = r4
        L_0x011b:
            X.8Qj r2 = r13.A0F
            X.3kE r1 = r13.A0H
            int r0 = r13.A06
            r2.onSelectedChanged(r1, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0I
            r0.invalidate()
            return
        L_0x012a:
            r10 = 4
            if (r7 <= 0) goto L_0x009b
            r10 = 2
            goto L_0x009b
        L_0x0130:
            float r0 = r13.A00
            float r9 = java.lang.Math.signum(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0I
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r9 = r9 * r0
            goto L_0x0096
        L_0x0140:
            float r0 = r13.A01
            float r8 = java.lang.Math.signum(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0I
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r8 = r8 * r0
            r9 = 0
            goto L_0x0097
        L_0x0151:
            int r7 = r13.A01(r14, r9)
            if (r7 > 0) goto L_0x007a
            int r7 = r13.A00(r14, r9)
            if (r7 <= 0) goto L_0x016c
        L_0x015d:
            r10 = r10 & r7
            if (r10 != 0) goto L_0x007a
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0I
            int r0 = r0.getLayoutDirection()
            int r7 = X.C355538Qj.convertToRelativeDirection(r7, r0)
            goto L_0x007a
        L_0x016c:
            r7 = 0
            goto L_0x007a
        L_0x016f:
            android.view.View r1 = r14.itemView
            android.view.View r0 = r13.A0D
            if (r1 != r0) goto L_0x0178
            r0 = 0
            r13.A0D = r0
        L_0x0178:
            X.8Qj r1 = r13.A0F
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0I
            r1.clearView(r0, r14)
            goto L_0x00d1
        L_0x0181:
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355568Qm.A08(X.3kE, int):void");
    }

    public final void A09(C249703kE r5, boolean z) {
        AJN ajn;
        List list = this.A0K;
        int size = list.size();
        do {
            size--;
            if (size >= 0) {
                ajn = (AJN) list.get(size);
            } else {
                return;
            }
        } while (ajn.A0C != r5);
        ajn.A04 |= z;
        if (!ajn.A05) {
            ajn.A0B.cancel();
        }
        list.remove(size);
    }

    public final void A0A(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A0I;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A12(this);
                this.A0I.A14(this.A0O);
                List list = this.A0I.A0L;
                if (list != null) {
                    list.remove(this);
                }
                List list2 = this.A0K;
                int size = list2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    AJN ajn = (AJN) list2.get(0);
                    ajn.A0B.cancel();
                    this.A0F.clearView(this.A0I, ajn.A0C);
                }
                list2.clear();
                this.A0D = null;
                VelocityTracker velocityTracker = this.A0C;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.A0C = null;
                }
                C355648Qu r1 = this.A0G;
                if (r1 != null) {
                    r1.A00 = false;
                    this.A0G = null;
                }
                if (this.A0E != null) {
                    this.A0E = null;
                }
            }
            this.A0I = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.A0N = resources.getDimension(R.dimen.avatar_sticker_max_height);
                this.A0M = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                this.A09 = ViewConfiguration.get(this.A0I.getContext()).getScaledTouchSlop();
                this.A0I.A11(this);
                RecyclerView recyclerView3 = this.A0I;
                recyclerView3.A13(this.A0O);
                List list3 = recyclerView3.A0L;
                if (list3 == null) {
                    list3 = new ArrayList();
                    recyclerView3.A0L = list3;
                }
                list3.add(this);
                C355648Qu r2 = new C355648Qu(this);
                this.A0G = r2;
                this.A0E = new AnonymousClass030(this.A0I.getContext(), r2);
            }
        }
    }

    public final void D1m(View view) {
        if (view == this.A0D) {
            this.A0D = null;
        }
        C249703kE A0Z = this.A0I.A0Z(view);
        if (A0Z != null) {
            C249703kE r0 = this.A0H;
            if (r0 == null || A0Z != r0) {
                A09(A0Z, false);
                if (this.A0Q.remove(A0Z.itemView)) {
                    this.A0F.clearView(this.A0I, A0Z);
                    return;
                }
                return;
            }
            A08((C249703kE) null, 0);
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r11) {
        float f;
        float f2;
        if (this.A0H != null) {
            float[] fArr = this.A0R;
            A02(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.A0F.onDraw(canvas, recyclerView, this.A0H, this.A0K, this.A06, f, f2);
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r11) {
        float f;
        float f2;
        if (this.A0H != null) {
            float[] fArr = this.A0R;
            A02(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.A0F.onDrawOver(canvas, recyclerView, this.A0H, this.A0K, this.A06, f, f2);
    }

    public C355568Qm(C355538Qj r3) {
        this.A0F = r3;
    }

    public final View A03(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C249703kE r0 = this.A0H;
        if (r0 != null) {
            View view = r0.itemView;
            float f = this.A04 + this.A00;
            float f2 = this.A05 + this.A01;
            if (x >= f && x <= f + ((float) view.getWidth()) && y >= f2 && y <= f2 + ((float) view.getHeight())) {
                return view;
            }
        }
        List list = this.A0K;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.A0I.A0U(x, y);
            }
            AJN ajn = (AJN) list.get(size);
            View view2 = ajn.A0C.itemView;
            float f3 = ajn.A01;
            float f4 = ajn.A02;
            if (x >= f3 && x <= f3 + ((float) view2.getWidth()) && y >= f4 && y <= f4 + ((float) view2.getHeight())) {
                return view2;
            }
        }
    }

    public final void A05(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.A02;
        this.A00 = f;
        float f2 = y - this.A03;
        this.A01 = f2;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.A00 = f;
        }
        if ((i & 8) == 0) {
            this.A00 = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            f2 = Math.max(0.0f, f2);
            this.A01 = f2;
        }
        if ((i & 2) == 0) {
            this.A01 = Math.min(0.0f, f2);
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r4) {
        rect.setEmpty();
    }
}
