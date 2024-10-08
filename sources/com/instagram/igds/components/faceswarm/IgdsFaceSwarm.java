package com.instagram.igds.components.faceswarm;

import X.002;
import X.00k;
import X.0Yv;
import X.0eP;
import X.0mk;
import X.0nA;
import X.0qQ;
import X.0sP;
import X.0sr;
import X.2Yu;
import X.Ag3;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0iw;
import X.AnonymousClass1YB;
import X.AnonymousClass9L3;
import X.C21257XRc;
import X.C22027Xta;
import X.C240923Ne;
import X.C294975nL;
import X.C376699Iz;
import X.C53338GmO;
import X.C54654HMl;
import X.C55640Hkz;
import X.C57841IhK;
import X.C57947Ij2;
import X.C57948Ij3;
import X.C58185Inp;
import X.C60340gF;
import X.C63529Kye;
import X.C71382cm;
import X.GNY;
import X.HMS;
import X.N4R;
import X.PQF;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsFaceSwarm extends FrameLayout {
    public static final List A0K = 0sr.A1P(new Float[]{Float.valueOf(32.0f), Float.valueOf(24.0f), Float.valueOf(20.0f), Float.valueOf(16.0f)});
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Runnable A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public float A0B;
    public int A0C;
    public Drawable A0D;
    public Drawable A0E;
    public View A0F;
    public final List A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final boolean A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsFaceSwarm(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        this.A0C = 4;
        this.A09 = true;
        this.A0A = true;
        this.A0B = 1.0f;
        this.A0J = 0mk.A02(context);
        this.A08 = true;
        this.A0G = new ArrayList();
        this.A0H = AnonymousClass1YB.A00(new AnonymousClass9L3(this, 8));
        this.A0I = AnonymousClass1YB.A00(new AnonymousClass9L3(context, 9));
        View.inflate(context, R.layout.igds_faceswarm, this);
        this.A0F = requireViewById(R.id.faceswarm_container);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A1R, 0, 0);
            0qQ.A07(obtainStyledAttributes);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(6, (int) 0nA.A00(context, 72.0f));
            this.A09 = obtainStyledAttributes.getBoolean(3, true);
            this.A0A = obtainStyledAttributes.getBoolean(5, true);
            this.A06 = obtainStyledAttributes.getInt(7, 0);
            this.A05 = obtainStyledAttributes.getInt(2, 0);
            this.A04 = obtainStyledAttributes.getInt(4, 0);
            this.A08 = obtainStyledAttributes.getBoolean(0, true);
            this.A02 = context.getColor(obtainStyledAttributes.getResourceId(1, 2Yu.A0H(context, R.attr.igds_color_pill_background)));
            obtainStyledAttributes.recycle();
            A03();
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        Drawable drawable = this.A0D;
        Drawable drawable2 = this.A0E;
        if (drawable != null) {
            A04(canvas2, drawable, this.A00, this.A01, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else if (drawable2 != null) {
            Rect bounds = drawable2.getBounds();
            0qQ.A07(bounds);
            Canvas canvas3 = canvas;
            A04(canvas3, drawable2, this.A00, this.A01, bounds.right - bounds.left, bounds.bottom - bounds.top);
        }
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v10, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r8v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void setFaceSwarmItems(List list, AnonymousClass0iw r13) {
        int i;
        0qQ.A0B(list, 0);
        0qQ.A0B(r13, 1);
        List<C376699Iz> A0d = 00k.A0d(list, this.A0C);
        ArrayList arrayList = new ArrayList(0Yv.A1E(A0d, 10));
        for (C376699Iz A012 : A0d) {
            arrayList.add(A012.A01());
        }
        boolean z = this.A08;
        int size = arrayList.size();
        if (z) {
            List<C55640Hkz> list2 = this.A0G;
            int i2 = -1;
            if (size == list2.size()) {
                ArrayList<Number> arrayList2 = new ArrayList<>(0Yv.A1E(list2, 10));
                for (C55640Hkz hkz : list2) {
                    arrayList2.add(Integer.valueOf(arrayList.indexOf(hkz.A00.A01())));
                }
                if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                    int i3 = 0;
                    for (Number intValue : arrayList2) {
                        if (intValue.intValue() == -1 && (i3 = i3 + 1) < 0) {
                            0sr.A1S();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                    if (i3 != 0) {
                        if (i3 == 1) {
                            Iterator it = arrayList2.iterator();
                            int i4 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    if (((Number) it.next()).intValue() == -1) {
                                        break;
                                    }
                                    i4++;
                                } else {
                                    i4 = -1;
                                    break;
                                }
                            }
                            C55640Hkz hkz2 = (C55640Hkz) list2.get(i4);
                            int A002 = A00(arrayList);
                            if (A002 != -1) {
                                A02();
                                ? r8 = hkz2.A01;
                                list2.set(i4, new C55640Hkz((C376699Iz) list.get(A002), r8));
                                this.A07 = new C57947Ij2(r13, hkz2, list, A002);
                                C58185Inp inp = new C58185Inp(39, arrayList, this);
                                C294975nL A0F2 = C294975nL.A01(r8, 0).A0E(C63529Kye.A00).A0F(true);
                                A0F2.A0O(r8.getRotation(), r8.getRotation());
                                A0F2.A0P(0.5f, -1.0f);
                                A0F2.A0Q(0.5f, -1.0f);
                                A0F2.A05 = new PQF(inp);
                                A0F2.A0H();
                                return;
                            }
                            return;
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList(0Yv.A1E(A0d, 10));
                for (C376699Iz r0 : A0d) {
                    Object obj = r0.A01;
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    arrayList3.add(Integer.valueOf(i));
                }
                ArrayList arrayList4 = new ArrayList(0Yv.A1E(list2, 10));
                for (C55640Hkz hkz3 : list2) {
                    arrayList4.add(hkz3.A00.A01());
                }
                if (arrayList3.equals(arrayList4)) {
                    return;
                }
            } else {
                if (arrayList.size() == list2.size() + 1) {
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (C55640Hkz hkz4 : list2) {
                            if (!arrayList.contains(hkz4.A00.A01())) {
                            }
                        }
                    }
                    int A003 = A00(arrayList);
                    ? r2 = (CircularImageView) getImageViews().get(list2.size());
                    Context context = getContext();
                    0qQ.A07(context);
                    int A004 = (int) (((float) ((int) 0nA.A00(context, ((Number) A0K.get(A003)).floatValue()))) * this.A0B);
                    C240923Ne.A01((C376699Iz) list.get(A003), r13, r2);
                    r2.setScaleX(0.1f);
                    r2.setScaleY(0.1f);
                    float f = ((float) A004) / 2.0f;
                    r2.setX(((float) (getWidth() / 2)) - f);
                    r2.setY(((float) (getHeight() / 2)) - f);
                    r2.getLayoutParams().height = A004;
                    r2.getLayoutParams().width = A004;
                    r2.setAlpha(0.0f);
                    r2.setRotation(-this.A0F.getRotation());
                    r2.setVisibility(0);
                    A02();
                    list2.add(A003, new C55640Hkz((C376699Iz) list.get(A003), r2));
                    r2.post(new C57841IhK(this, arrayList));
                    return;
                } else if (arrayList.size() == list2.size() - 1) {
                    ArrayList<Number> arrayList5 = new ArrayList<>(0Yv.A1E(list2, 10));
                    for (C55640Hkz hkz5 : list2) {
                        arrayList5.add(Integer.valueOf(arrayList.indexOf(hkz5.A00.A01())));
                    }
                    if (!(arrayList5 instanceof Collection) || !arrayList5.isEmpty()) {
                        int i5 = 0;
                        for (Number intValue2 : arrayList5) {
                            if (intValue2.intValue() == -1 && (i5 = i5 + 1) < 0) {
                                0sr.A1S();
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                        if (i5 == 1) {
                            Iterator it2 = arrayList5.iterator();
                            int i6 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (((Number) it2.next()).intValue() == -1) {
                                    i2 = i6;
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                            A02();
                            ? r82 = ((C55640Hkz) list2.get(i2)).A01;
                            float width = (float) (getWidth() / 2);
                            float height = (float) (getHeight() / 2);
                            int width2 = r82.getWidth() / 2;
                            C294975nL A0F3 = C294975nL.A01(r82, 0).A0F(true);
                            float f2 = (float) width2;
                            A0F3.A0P(0.0f, f2);
                            A0F3.A0Q(0.0f, f2);
                            A0F3.A0M(1.0f, 0.0f);
                            A0F3.A0J(width - f2);
                            A0F3.A0K(height - f2);
                            A0F3.A0O(r82.getRotation(), r82.getRotation());
                            A0F3.A05 = new Ag3(r82);
                            A0F3.A0H();
                            list2.remove(i2);
                        }
                    }
                }
                A06(list, r13);
                return;
            }
            A05(this, arrayList);
            return;
        }
        List<C55640Hkz> list3 = this.A0G;
        if (size == list3.size()) {
            ArrayList<Number> arrayList6 = new ArrayList<>(0Yv.A1E(list3, 10));
            for (C55640Hkz hkz6 : list3) {
                arrayList6.add(Integer.valueOf(arrayList.indexOf(hkz6.A00.A01())));
            }
            if (!(arrayList6 instanceof Collection) || !arrayList6.isEmpty()) {
                int i7 = 0;
                for (Number intValue3 : arrayList6) {
                    if (intValue3.intValue() == -1 && (i7 = i7 + 1) < 0) {
                        0sr.A1S();
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                if (i7 == 0) {
                    return;
                }
            } else {
                return;
            }
        }
        A06(A0d, r13);
    }

    public final void setImageUrls(List list, AnonymousClass0iw r8) {
        C376699Iz r3;
        0qQ.A0B(list, 0);
        0qQ.A0B(r8, 1);
        List<ImageUrl> A0d = 00k.A0d(list, this.A0C);
        ArrayList arrayList = new ArrayList(0Yv.A1E(A0d, 10));
        for (ImageUrl imageUrl : A0d) {
            if (imageUrl != null) {
                r3 = new C376699Iz((Drawable) null, imageUrl, (String) null, 6);
            } else {
                r3 = new C376699Iz(getPlaceholderDrawable(), (ImageUrl) null, (String) null, 5);
            }
            arrayList.add(r3);
        }
        setFaceSwarmItems(arrayList, r8);
    }

    public final void setPreferredFourItemTemplate(C54654HMl hMl) {
        0qQ.A0B(hMl, 0);
        this.A05 = hMl.A00;
    }

    public final void setPreferredThreeItemTemplate(HMS hms) {
        0qQ.A0B(hms, 0);
        this.A06 = hms.A00;
    }

    private final void A02() {
        Runnable runnable = this.A07;
        if (runnable != null) {
            runnable.run();
        }
        this.A07 = null;
        List<View> imageViews = getImageViews();
        ArrayList arrayList = new ArrayList(0Yv.A1E(imageViews, 10));
        for (View A012 : imageViews) {
            C294975nL A013 = C294975nL.A01(A012, 0);
            A013.A0G();
            arrayList.add(A013);
        }
        C294975nL.A01(this.A0F, 0).A0G();
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v16, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static final void A05(IgdsFaceSwarm igdsFaceSwarm, List list) {
        List<C55640Hkz> list2 = igdsFaceSwarm.A0G;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
        for (C55640Hkz hkz : list2) {
            arrayList.add(Integer.valueOf(list.indexOf(hkz.A00.A01())));
        }
        float f = igdsFaceSwarm.A0B;
        int i = igdsFaceSwarm.A04;
        Map map = C22027Xta.A00;
        String A0P = 00k.A0P("", "", "", arrayList, (0sP) null);
        for (C21257XRc xRc : C21257XRc.values()) {
            if (0qQ.A0K(xRc.A00, A0P)) {
                GNY gny = (GNY) C22027Xta.A00.get(xRc);
                if (gny != null) {
                    GNY A012 = C22027Xta.A01(gny, f, i);
                    ArrayList arrayList2 = new ArrayList();
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C53338GmO gmO = (C53338GmO) ((List) A012.A01).get(i2);
                        ? r1 = ((C55640Hkz) list2.get(i2)).A01;
                        GNY gny2 = new GNY((Object) new Point((int) r1.getX(), (int) r1.getY()), (float) r1.getWidth(), 5);
                        Context context = igdsFaceSwarm.getContext();
                        0qQ.A07(context);
                        float A002 = 0nA.A00(context, gmO.A00);
                        Point point = gmO.A02;
                        arrayList2.add(new N4R(35, (Object) gny2, (Object) new GNY((Object) new Point((int) 0nA.A04(context, point.x), (int) 0nA.A04(context, point.y)), A002, 5)));
                    }
                    View view = igdsFaceSwarm.A0F;
                    float f2 = A012.A00;
                    0qQ.A0B(view, 2);
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ? r10 = ((C55640Hkz) list2.get(i3)).A01;
                        GNY gny3 = (GNY) ((N4R) arrayList2.get(i3)).A00;
                        float f3 = gny3.A00;
                        float f4 = ((GNY) ((N4R) arrayList2.get(i3)).A02).A00;
                        float f5 = f3 / f4;
                        Point point2 = (Point) gny3.A01;
                        float f6 = (f3 - f4) * 0.5f;
                        C294975nL A0E2 = C294975nL.A00(r10).A0E(C63529Kye.A00);
                        A0E2.A0P(f5, -1.0f);
                        A0E2.A0Q(f5, -1.0f);
                        A0E2.A0J(((float) point2.x) + f6);
                        A0E2.A0K(((float) point2.y) + f6);
                        A0E2.A0O(r10.getRotation(), -f2);
                        A0E2.A0M(r10.getAlpha(), 1.0f);
                        A0E2.A0H();
                    }
                    C294975nL A0E3 = C294975nL.A00(view).A0E(C63529Kye.A00);
                    A0E3.A0O(view.getRotation(), f2);
                    A0E3.A0H();
                    return;
                }
                throw new IllegalArgumentException(002.A0R("IgdsFaceSwarm: Invalid template key for rank description ", A0P));
            }
        }
        throw new IllegalArgumentException("IgdsFaceSwarm: Given rank list does not match any template");
    }

    private final void A06(List list, AnonymousClass0iw r7) {
        this.A0G.clear();
        GNY A002 = C22027Xta.A00(this.A0B, list.size(), this.A06, this.A05, this.A04);
        A02();
        List<View> imageViews = getImageViews();
        ArrayList arrayList = new ArrayList(0Yv.A1E(imageViews, 10));
        for (View view : imageViews) {
            view.setVisibility(8);
            view.setRotation(0.0f);
            arrayList.add(C60340gF.A00);
        }
        View view2 = this.A0F;
        view2.setRotation(A002.A00);
        view2.post(new C57948Ij3(A002, r7, this, list));
    }

    /* access modifiers changed from: private */
    public final List getImageViews() {
        return (List) this.A0H.getValue();
    }

    private final Drawable getPlaceholderDrawable() {
        return (Drawable) this.A0I.getValue();
    }

    public final Drawable getBottomBadgeDrawable() {
        return this.A0D;
    }

    public final void setBackgroundCircleColor(int i) {
        this.A02 = i;
        A03();
    }

    public final void setBottomBadgeDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.A0D = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
            invalidate();
        }
    }

    public final void setCustomSizePx(int i) {
        this.A03 = i;
        A03();
    }

    public final void setIsContained(boolean z) {
        this.A09 = z;
        A03();
    }

    public final void setPresenceBadgeDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0E;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.A0E = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
            invalidate();
        }
    }

    public final void setScaleUpWhenNotContained(boolean z) {
        this.A0A = z;
        A03();
    }

    private final int A00(List list) {
        int i = 0;
        for (Object next : list) {
            List<C55640Hkz> list2 = this.A0G;
            ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
            for (C55640Hkz hkz : list2) {
                arrayList.add(hkz.A00.A01());
            }
            if (!arrayList.contains(next)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final void A03() {
        View view;
        Context context = getContext();
        0qQ.A07(context);
        0eP A002 = C240923Ne.A00(0nA.A01(context, (float) this.A03), this.A09, this.A0A);
        this.A0B = ((Number) A002.A00).floatValue();
        this.A0C = ((Number) A002.A01).intValue();
        if (this.A09) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(this.A02);
            view = this.A0F;
            view.setBackground(shapeDrawable);
        } else {
            view = this.A0F;
            view.setBackground((Drawable) null);
        }
        float f = this.A0B;
        if (f != 1.0f) {
            int A003 = (int) 0nA.A00(context, f * 72.0f);
            view.setLayoutParams(new FrameLayout.LayoutParams(A003, A003));
        }
        this.A00 = 0nA.A00(context, 10.0f) * this.A0B;
        this.A01 = 0nA.A00(context, 10.0f) * this.A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r5.A0A == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(android.graphics.Canvas r6, android.graphics.drawable.Drawable r7, float r8, float r9, int r10, int r11) {
        /*
            r5 = this;
            r4 = 1022739087(0x3cf5c28f, float:0.03)
            r6.save()
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x0011
            boolean r0 = r5.A0A
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            if (r0 != 0) goto L_0x0013
        L_0x0011:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0013:
            int r0 = r5.getWidth()
            float r3 = (float) r0
            float r3 = r3 * r1
            int r0 = r5.getHeight()
            float r2 = (float) r0
            float r2 = r2 * r1
            float r0 = (float) r11
            float r1 = r2 - r0
            float r2 = r2 * r4
            float r1 = r1 - r2
            float r1 = r1 + r9
            boolean r0 = r5.A0J
            if (r0 == 0) goto L_0x0035
            float r3 = r3 * r4
            float r3 = r3 - r8
        L_0x002b:
            r6.translate(r3, r1)
            r7.draw(r6)
            r6.restore()
            return
        L_0x0035:
            float r0 = (float) r10
            float r0 = r3 - r0
            float r3 = r3 * r4
            float r0 = r0 - r3
            float r3 = r0 + r8
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.faceswarm.IgdsFaceSwarm.A04(android.graphics.Canvas, android.graphics.drawable.Drawable, float, float, int, int):void");
    }

    public final void setCustomSizeDp(int i) {
        Context context = getContext();
        0qQ.A07(context);
        this.A03 = (int) 0nA.A04(context, i);
        A03();
    }

    public final void setAdditionalRotation(int i) {
        this.A04 = i;
    }

    public final void setAnimateChanges(boolean z) {
        this.A08 = z;
    }

    public final void setBottomBadgeAdditionalHorizontalOffset(float f) {
        this.A00 = f;
    }

    public final void setBottomBadgeAdditionalVerticalOffset(float f) {
        this.A01 = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsFaceSwarm(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsFaceSwarm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsFaceSwarm(Context context) {
        this(context, (AttributeSet) null, 0, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsFaceSwarm(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
