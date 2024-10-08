package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.rendercore.text.RCTextView;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.I6m  reason: case insensitive filesystem */
public final class C56657I6m {
    public static final C56657I6m A00 = new Object();
    public static final WeakHashMap A01 = new WeakHashMap();
    public static final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C58512It7.A00);
    public static final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C58513It8.A00);
    public static final AnonymousClass0eM A04 = AnonymousClass0eN.A01(C58514It9.A00);
    public static final Map A05 = DbY.A0p(C52505GVi.TOOLBAR, C54628HLl.TOOLBAR_OVERLAP, AnonymousClass7TE.A1L(C52505GVi.HEADER, C54628HLl.HEADER_OVERLAP));

    public static final void A01(Context context, ViewGroup viewGroup, AnonymousClass6LQ r29, Map map, float f, int i) {
        int i2;
        Rect A0W;
        int width;
        GAX gax;
        float f2;
        int i3;
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            if (A0v.next() == null) {
                return;
            }
        }
        AnonymousClass6LQ r11 = r29;
        if (!r11.A00) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            C56657I6m i6m = A00;
            ViewGroup viewGroup2 = viewGroup;
            A03(viewGroup2, i6m, A1C);
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view instanceof ScalingTextureView) {
                    gax = i6m.A00(view, C52505GVi.VIDEO);
                } else if (view instanceof RCTextView) {
                    C52505GVi gVi = C52505GVi.TEXT;
                    int hashCode = view.hashCode();
                    RCTextView rCTextView = (RCTextView) view;
                    int[] iArr = new int[2];
                    rCTextView.getLocationOnScreen(iArr);
                    int i4 = iArr[0];
                    Rect rect = new Rect(i4, iArr[1], rCTextView.getWidth() + i4, iArr[1] + rCTextView.getHeight());
                    Layout layout = rCTextView.A02;
                    0qQ.A07(layout);
                    int lineCount = layout.getLineCount();
                    int i5 = 0;
                    for (int i6 = 0; i6 < lineCount; i6++) {
                        int lineRight = (int) (layout.getLineRight(i6) - layout.getLineLeft(i6));
                        if (i5 < lineRight) {
                            i5 = lineRight;
                        }
                    }
                    if (rCTextView instanceof C307046Op) {
                        C307046Op r2 = (C307046Op) rCTextView;
                        A0W = AnonymousClass7TE.A0W();
                        float spanXPadding = ((float) i5) + (r2.getSpanXPadding() * 2.0f);
                        Layout.Alignment alignment = r2.A02.getAlignment();
                        0qQ.A07(alignment);
                        int i7 = VKG.A00[alignment.ordinal()];
                        if (i7 == 1) {
                            f2 = ((float) rect.left) + ((((float) rect.width()) - spanXPadding) / 2.0f);
                            i3 = (int) f2;
                        } else if (i7 == 2) {
                            f2 = ((float) rect.left) + (((float) rect.width()) - spanXPadding);
                            i3 = (int) f2;
                        } else if (i7 == 3) {
                            i3 = rect.left;
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                        A0W.left = i3;
                        float f3 = r2.A01;
                        float spanTopPadding = r2.getSpanTopPadding();
                        int i8 = (int) (((float) rect.top) + (f3 - spanTopPadding));
                        A0W.top = i8;
                        A0W.right = (int) (((float) i3) + spanXPadding);
                        float spanBottomPadding = ((float) i8) + spanTopPadding + r2.getSpanBottomPadding();
                        Layout layout2 = r2.A02;
                        int i9 = 0;
                        if (layout2 != null) {
                            i9 = layout2.getHeight();
                        }
                        A0W.bottom = (int) (spanBottomPadding + ((float) i9));
                    } else {
                        Rect A0W2 = AnonymousClass7TE.A0W();
                        A02(A0W2, rCTextView, 0);
                        A0W = AnonymousClass7TE.A0W();
                        A0W.top = (int) (((float) (A0W2.top + iArr[1])) + rCTextView.A01);
                        if (layout.getLineCount() > 1) {
                            A02(A0W2, rCTextView, layout.getLineCount() - 1);
                        }
                        A0W.bottom = (int) (((float) (A0W2.bottom + iArr[1])) + rCTextView.A01);
                        Layout.Alignment alignment2 = layout.getAlignment();
                        0qQ.A07(alignment2);
                        int i10 = VKG.A00[alignment2.ordinal()];
                        if (i10 == 1) {
                            width = rect.left + ((rect.width() - i5) / 2);
                        } else if (i10 == 2) {
                            int abs = (int) (((float) rect.right) - Math.abs(rCTextView.A00));
                            A0W.right = abs;
                            width = abs - i5;
                        } else if (i10 == 3) {
                            width = (int) (((float) rect.left) + Math.abs(rCTextView.A00));
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                        A0W.left = width;
                        if (alignment2 != Layout.Alignment.ALIGN_OPPOSITE) {
                            A0W.right = width + i5;
                        }
                    }
                    Rect rect2 = A0W;
                    gax = new GAX(rect2, gVi, Integer.valueOf(rCTextView.A02.getLineCount()), hashCode, rCTextView.isShown() ? 1 : 0);
                } else {
                    continue;
                }
                A1C2.add(gax);
            }
            GAX A002 = i6m.A00(viewGroup2, C52505GVi.PARENT);
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            Iterator it2 = A1C2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((GAX) next).A02 == 1) {
                    A1C3.add(next);
                }
            }
            ArrayList A1C4 = AnonymousClass7TE.A1C();
            int size = A1C3.size();
            int i11 = 0;
            while (true) {
                i2 = i;
                if (i11 >= size) {
                    break;
                }
                int i12 = i11 + 1;
                int size2 = A1C3.size();
                for (int i13 = i12; i13 < size2; i13++) {
                    GAX gax2 = (GAX) 00k.A0O(A1C3, i11);
                    GAX gax3 = (GAX) 00k.A0O(A1C3, i13);
                    if (!(gax2 == null || gax3 == null || !A04((Rect) gax2.A04, (Rect) gax3.A04, i2))) {
                        A1C4.add(new C59721JVf(C54628HLl.OVERLAP, 0sr.A1P(new Integer[]{Integer.valueOf(gax2.A01), Integer.valueOf(gax3.A01)})));
                    }
                }
                i11 = i12;
            }
            ArrayList A1C5 = AnonymousClass7TE.A1C();
            Iterator it3 = A1C2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (((GAX) next2).A02 == 0) {
                    A1C5.add(next2);
                }
            }
            ArrayList A1C6 = AnonymousClass7TE.A1C();
            Iterator it4 = A1C5.iterator();
            while (it4.hasNext()) {
                GAX gax4 = (GAX) it4.next();
                Rect rect3 = (Rect) gax4.A04;
                int i14 = rect3.left;
                Rect rect4 = (Rect) A002.A04;
                if (i14 < rect4.left || rect3.top < rect4.top || rect3.right > rect4.right || rect3.bottom > rect4.bottom) {
                    A1C6.add(new C59721JVf(C54628HLl.OFF_THE_SCREEN, AnonymousClass7TE.A1I(Integer.valueOf(gax4.A01))));
                }
            }
            ArrayList A1C7 = AnonymousClass7TE.A1C();
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                C52505GVi gVi2 = (C52505GVi) A1J.getKey();
                View view2 = (View) A1J.getValue();
                if (view2 != null) {
                    GAX A003 = i6m.A00(view2, gVi2);
                    A1C7.add(A003);
                    C54628HLl hLl = (C54628HLl) A05.get(gVi2);
                    if (hLl != null) {
                        ArrayList A1C8 = AnonymousClass7TE.A1C();
                        Iterator it5 = A1C2.iterator();
                        while (it5.hasNext()) {
                            GAX gax5 = (GAX) it5.next();
                            if (A04((Rect) A003.A04, (Rect) gax5.A04, i2)) {
                                A1C8.add(new C59721JVf(hLl, 0sr.A1P(new Integer[]{Integer.valueOf(A003.A01), Integer.valueOf(gax5.A01)})));
                            }
                        }
                        A1H.put(hLl, A1C8);
                    }
                }
            }
            int A012 = AnonymousClass0nB.A01(context);
            int A004 = AnonymousClass0nB.A00(context) - AnonymousClass2uJ.A00;
            int i15 = 0;
            if (C61290mR.A07()) {
                int A013 = C61290mR.A01();
                if (C226122ff.A03()) {
                    i15 = C226122ff.A01();
                }
                i15 = Math.max(A013, i15);
            }
            int i16 = A004 - i15;
            LinkedHashMap A0p = DbY.A0p(C54628HLl.TOOLBAR_OVERLAP, "toolbar_intersection_violations", AnonymousClass7TE.A1L(C54628HLl.HEADER_OVERLAP, "header_intersection_violations"));
            r11.A00 = true;
            long currentMonotonicTimestampNanos = r11.A01.currentMonotonicTimestampNanos();
            HashMap A1E = AnonymousClass7TE.A1E();
            AnonymousClass6Q8 r8 = r11.A02;
            A1E.put(AnonymousClass9NJ.A00(51, 10, 54), r8.A03);
            A1E.put("client_name", r8.A01);
            A1E.put("template_name", r8.A04);
            A1E.put(AnonymousClass000.A00(1561), r8.A02);
            A1E.put(AnonymousClass000.A00(1220), String.valueOf(r8.A00));
            LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
            Integer valueOf = Integer.valueOf(A002.A01);
            A1H2.put(valueOf, A002.A01((Integer) null));
            Iterator it6 = A1C7.iterator();
            while (it6.hasNext()) {
                GAX gax6 = (GAX) it6.next();
                A1H2.put(Integer.valueOf(gax6.A01), gax6.A01((Integer) null));
            }
            LinkedHashMap A1H3 = AnonymousClass7TE.A1H();
            Iterator it7 = A1C2.iterator();
            while (it7.hasNext()) {
                Object next3 = it7.next();
                Object obj = ((GAX) next3).A05;
                Object obj2 = A1H3.get(obj);
                if (obj2 == null) {
                    obj2 = AnonymousClass7TE.A1C();
                    A1H3.put(obj, obj2);
                }
                ((List) obj2).add(next3);
            }
            for (List it8 : A1H3.values()) {
                int i17 = 0;
                Iterator it9 = it8.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next4 = it9.next();
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                        GAX gax7 = (GAX) next4;
                        A1H2.put(Integer.valueOf(gax7.A01), gax7.A01(Integer.valueOf(i18)));
                        i17 = i18;
                    }
                }
            }
            LinkedHashMap A1H4 = AnonymousClass7TE.A1H();
            A1H4.put(002.A0R("render_info_", (String) A1H2.get(valueOf)), A002.A00());
            Iterator it10 = A1C7.iterator();
            while (it10.hasNext()) {
                GAX gax8 = (GAX) it10.next();
                A1H4.put(002.A0R("render_info_", (String) C51968G9o.A0z(A1H2, gax8.A01)), gax8.A00());
            }
            Iterator it11 = A1C2.iterator();
            while (it11.hasNext()) {
                GAX gax9 = (GAX) it11.next();
                A1H4.put(002.A0R("render_info_", (String) C51968G9o.A0z(A1H2, gax9.A01)), gax9.A00());
            }
            if (DbT.A1b(A1C4)) {
                A1H4.put("intersection_violations", DbT.A0z(", ", A1C4, new C74179PqL(A1H2, 18)));
            }
            if (DbT.A1b(A1C6)) {
                A1H4.put("out_of_bounds_violations", DbT.A0z(", ", A1C6, new C74179PqL(A1H2, 20)));
            }
            Iterator A0s = AnonymousClass7TF.A0s(A1H);
            while (A0s.hasNext()) {
                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s);
                Object key = A1J2.getKey();
                List list = (List) A1J2.getValue();
                if (AnonymousClass7TE.A1b(list)) {
                    String A0z = DbT.A0z(", ", list, new C74179PqL(A1H2, 19));
                    Object obj3 = A0p.get(key);
                    if (obj3 != null) {
                        A1H4.put(obj3, A0z);
                    }
                }
            }
            A1H4.put("screen_width", String.valueOf(A012));
            A1H4.put("screen_height", String.valueOf(i16));
            A1H4.put(C273654mx.A00(46), String.valueOf(f));
            A1E.putAll(A1H4);
            r11.A03.execute(new C57891Ii8(r11, A1E, currentMonotonicTimestampNanos));
        }
    }

    public static final void A02(Rect rect, RCTextView rCTextView, int i) {
        Layout layout = rCTextView.A02;
        0qQ.A07(layout);
        TextPaint paint = layout.getPaint();
        0qQ.A07(paint);
        CharSequence subSequence = rCTextView.A03.subSequence(layout.getLineStart(i), layout.getLineVisibleEnd(i));
        if (Build.VERSION.SDK_INT >= 29) {
            paint.getTextBounds(subSequence, 0, subSequence.length(), rect);
        } else {
            paint.getTextBounds(subSequence.toString(), 0, subSequence.length(), rect);
        }
        rect.top += layout.getLineBaseline(i);
        rect.bottom += layout.getLineBaseline(i);
    }

    public static final boolean A04(Rect rect, Rect rect2, int i) {
        boolean A1T = AnonymousClass7TF.A1T(Math.max(rect.left, rect2.left), Math.min(rect.right, rect2.right) - i);
        boolean A1T2 = AnonymousClass7TF.A1T(Math.max(rect.top, rect2.top), Math.min(rect.bottom, rect2.bottom) - i);
        if (!A1T || !A1T2) {
            return false;
        }
        return true;
    }

    private final GAX A00(View view, C52505GVi gVi) {
        RCTextView rCTextView;
        Layout layout;
        int hashCode = view.hashCode();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        boolean isShown = view.isShown();
        Integer num = null;
        if (!(!(view instanceof RCTextView) || (rCTextView = (RCTextView) view) == null || (layout = rCTextView.A02) == null)) {
            num = Integer.valueOf(layout.getLineCount());
        }
        return new GAX(rect, gVi, num, hashCode, isShown ? 1 : 0);
    }

    public static final void A03(ViewGroup viewGroup, C56657I6m i6m, List list) {
        if (viewGroup.getChildCount() == 0) {
            list.add(viewGroup);
        }
        int i = 0;
        int childCount = viewGroup.getChildCount();
        if (childCount >= 0) {
            while (true) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (childAt instanceof ViewGroup) {
                        A03((ViewGroup) childAt, i6m, list);
                    } else {
                        list.add(childAt);
                    }
                }
                if (i != childCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
