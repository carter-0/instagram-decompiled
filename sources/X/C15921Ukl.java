package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.webrtc.CameraCapturer;

/* renamed from: X.Ukl  reason: case insensitive filesystem */
public final class C15921Ukl extends AnonymousClass91c {
    public int A00;
    public List A01;
    public final TimeInterpolator A02 = new AccelerateDecelerateInterpolator();
    public final ArrayList A03 = new ArrayList();
    public final List A04 = new ArrayList();
    public final C360728f3 A05 = C360728f3.CLASSIC;
    public final List A06 = new ArrayList();
    public final List A07 = new ArrayList();
    public final List A08 = new ArrayList();

    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, 0rN r32, float f, float f2, int i) {
        boolean z;
        int i2;
        int i3;
        int A002;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        C51974G9v.A1L(textPaint, spannable, r32);
        int A0W = i % A0W();
        ArrayList arrayList = this.A03;
        ArrayList arrayList2 = arrayList;
        int i4 = 0;
        0qQ.A0B(arrayList, 0);
        int i5 = 0;
        if (!(A0W() == 0 || A00(this) == 0)) {
            if (A0W >= (A0W() * CameraCapturer.OPEN_CAMERA_DELAY_MS) / this.A00) {
                if (A0W < (A0W() * 1118) / this.A00) {
                    i5 = 1;
                } else {
                    int A0W2 = (A0W - ((A0W() * 1118) / this.A00)) / A00(this);
                    int size = arrayList2.size() - 3;
                    if (A0W2 > size) {
                        A0W2 = size;
                    }
                    i5 = A0W2 + 2;
                }
            }
            int size2 = arrayList2.size() - 1;
            i4 = i5;
            if (i5 > size2) {
                i4 = size2;
            }
        }
        int i6 = A0W;
        if (A0W >= (A0W() * CameraCapturer.OPEN_CAMERA_DELAY_MS) / this.A00) {
            int A0W3 = (A0W() * 1118) / this.A00;
            int A0W4 = A0W();
            if (A0W < A0W3) {
                A002 = (A0W4 * CameraCapturer.OPEN_CAMERA_DELAY_MS) / this.A00;
            } else {
                i6 = A0W - ((A0W4 * 1118) / this.A00);
                A002 = (i4 - 2) * A00(this);
            }
            i6 -= A002;
        }
        boolean z2 = true;
        if (A0W < (A0W() * 1118) / this.A00 || i4 != arrayList2.size() - 1 || i6 <= ((A0W() * IgNetworkConsentStorage.MAX_ENTRIES) / this.A00) + ((A0W() * 118) / this.A00)) {
            z2 = false;
        }
        if (z2) {
            i4 = 0;
        }
        VVX vvx = (VVX) DbZ.A0g(arrayList2, i4);
        TextPaint textPaint2 = this.A0b;
        float textSize = textPaint2.getTextSize() / 4.0f;
        float textSize2 = textPaint2.getTextSize() * 0.3f;
        float textSize3 = textPaint2.getTextSize() * 0.2f;
        for (C19714WeG weG : this.A06) {
            if (z2) {
                List list = this.A04;
                int size3 = list.size();
                float f3 = 0.0f;
                RectF rectF = null;
                for (int i7 = 0; i7 < size3; i7++) {
                    int size4 = ((Collection) list.get(i7)).size();
                    for (int i8 = 0; i8 < size4; i8++) {
                        float width = ((RectF) C13991Tnr.A0Z(list, i7, i8)).width();
                        if (width > f3) {
                            rectF = (RectF) C13991Tnr.A0Z(list, i7, i8);
                            f3 = width;
                        }
                    }
                }
                if (rectF != null) {
                    float interpolation = this.A02.getInterpolation(((float) ((i6 - ((A0W() * IgNetworkConsentStorage.MAX_ENTRIES) / this.A00)) - ((A0W() * 118) / this.A00))) / ((float) ((A0W() * 300) / this.A00)));
                    float width2 = rectF.width();
                    float f4 = (1.0f - interpolation) * width2;
                    float f5 = (rectF.right - width2) + f4;
                    float f6 = (rectF.left + width2) - f4;
                    ListIterator listIterator = list.listIterator();
                    while (listIterator.hasNext()) {
                        List list2 = (List) listIterator.next();
                        ListIterator listIterator2 = list2.listIterator();
                        while (listIterator2.hasNext()) {
                            RectF rectF2 = (RectF) listIterator2.next();
                            if (A0O()) {
                                float f7 = rectF2.left;
                                if (f7 < f6) {
                                    f7 = f6;
                                }
                                float f8 = rectF2.right;
                                if (f7 > f8) {
                                    f7 = f8;
                                }
                                rectF2.left = f7;
                            } else {
                                float f9 = rectF2.right;
                                if (f9 > f5) {
                                    f9 = f5;
                                }
                                float f10 = rectF2.left;
                                if (f9 < f10) {
                                    f9 = f10;
                                }
                                rectF2.right = f9;
                            }
                            if (rectF2.width() <= 0.0f) {
                                listIterator2.remove();
                            }
                        }
                        if (list2.isEmpty()) {
                            listIterator.remove();
                        }
                    }
                }
            } else {
                List list3 = vvx.A01;
                if (list3.isEmpty() || i4 - 1 < 0) {
                    this.A04.clear();
                } else if (i6 <= (A0W() * 118) / this.A00) {
                    float A0W5 = ((float) i6) / (((float) ((A0W() * 118) / this.A00)) - 18.0f);
                    TimeInterpolator timeInterpolator = this.A02;
                    if (A0W5 > 1.0f) {
                        A0W5 = 1.0f;
                    }
                    float interpolation2 = timeInterpolator.getInterpolation(A0W5);
                    List list4 = this.A04;
                    int size5 = list3.size();
                    for (int i9 = 0; i9 < size5; i9++) {
                        if (i9 >= list4.size()) {
                            list4.add(new ArrayList());
                        }
                        List list5 = (List) list4.get(i9);
                        int size6 = ((Collection) list3.get(i9)).size();
                        for (int i10 = 0; i10 < size6; i10++) {
                            if (i10 >= list5.size()) {
                                list5.add(new RectF((RectF) C13991Tnr.A0Z(list3, i9, i10)));
                            }
                        }
                    }
                    List list6 = ((VVX) arrayList2.get(i3)).A01;
                    int A062 = C51966G9m.A06(list3);
                    List list7 = (List) list3.get(A062);
                    RectF rectF3 = (RectF) C13991Tnr.A0Z(list4, A062, C51966G9m.A06(list7));
                    RectF rectF4 = (RectF) C66582MXn.A0r(list7);
                    float f11 = rectF4.right - rectF4.left;
                    float f12 = 0.0f;
                    if (AnonymousClass7TE.A1b(list6)) {
                        List list8 = (List) C66582MXn.A0r(list6);
                        RectF rectF5 = (RectF) C66582MXn.A0r(list8);
                        if (list8.size() == list7.size() && list6.size() == list3.size()) {
                            f12 = rectF5.right - rectF5.left;
                        }
                    }
                    float f13 = ((f11 - f12) * interpolation2) + f12;
                    if (A0O()) {
                        rectF3.left = rectF4.right - f13;
                    } else {
                        rectF3.right = rectF4.left + f13;
                    }
                }
            }
            List list9 = this.A04;
            List list10 = (List) 00k.A0L(list9);
            if (list10 != null) {
                0qQ.A0B(list9, 0);
                int A063 = C51966G9m.A06(list9);
                RectF rectF6 = (RectF) 00k.A0L(list10);
                if (rectF6 != null) {
                    int A064 = C51966G9m.A06(list10);
                    List list11 = this.A01;
                    if (list11 != null) {
                        z = true;
                        if (A063 > C51966G9m.A06(list11)) {
                            continue;
                        } else {
                            List list12 = this.A01;
                            if (list12 != null) {
                                List list13 = (List) 00k.A0O(list12, A063);
                                if (list13 != null) {
                                    i2 = C51966G9m.A06(list13);
                                } else {
                                    i2 = -1;
                                }
                                if (A064 <= i2) {
                                    float f14 = rectF6.right;
                                    List list14 = this.A01;
                                    if (list14 != null) {
                                        if (f14 == ((RectF) C13991Tnr.A0Z(list14, A063, A064)).right) {
                                            float f15 = rectF6.left;
                                            List list15 = this.A01;
                                            if (list15 != null) {
                                                if (f15 == ((RectF) C13991Tnr.A0Z(list15, A063, A064)).left) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        weG.A03(C306496Mj.A03(list9, textSize2, textSize3, textSize3, textSize, z), textPaint2.getTextSize());
                        weG.onPreDraw();
                        weG.AQG(canvas2);
                    }
                    0qQ.A0F("fullTextBounds");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            z = false;
            weG.A03(C306496Mj.A03(list9, textSize2, textSize3, textSize3, textSize, z), textPaint2.getTextSize());
            weG.onPreDraw();
            weG.AQG(canvas2);
        }
        for (AnonymousClass91R r0 : this.A08) {
            r0.A04 = false;
        }
        List list16 = this.A07;
        0qQ.A0B(list16, 1);
        C17944ViZ viZ = vvx.A00;
        if (viZ != null) {
            W10.A01(canvas2, (Paint) null, viZ, (Integer) null, list16, 0.0f, 0.0f, vvx.A02);
        }
    }

    public final void A0R() {
        StaticLayout staticLayout;
        int next;
        int last;
        int next2;
        int i;
        int i2;
        super.A0R();
        List list = this.A06;
        list.clear();
        List list2 = this.A08;
        list2.clear();
        List list3 = this.A07;
        list3.clear();
        Spannable spannable = this.A0F;
        0qQ.A07(spannable);
        if (spannable.length() > 0 && (staticLayout = this.A0G) != null) {
            C19714WeG[] weGArr = (C19714WeG[]) C263324Kh.A06(spannable, C19714WeG.class);
            list.addAll(new ArrayList(0sr.A1P(Arrays.copyOf(weGArr, weGArr.length))));
            AnonymousClass91R[] r4 = (AnonymousClass91R[]) C263324Kh.A06(spannable, AnonymousClass91R.class);
            list2.addAll(new ArrayList(0sr.A1P(Arrays.copyOf(r4, r4.length))));
            StaticLayout staticLayout2 = this.A0G;
            if (staticLayout2 != null) {
                Spannable spannable2 = this.A0F;
                0qQ.A07(spannable2);
                this.A01 = C306496Mj.A01(staticLayout2, 1.0f);
                ArrayList arrayList = this.A03;
                arrayList.clear();
                TextPaint textPaint = this.A0b;
                0qQ.A07(textPaint);
                boolean A0O = A0O();
                0rN A082 = A08();
                Layout.Alignment alignment = this.A0E;
                0qQ.A07(alignment);
                TextPaint textPaint2 = textPaint;
                StaticLayout staticLayout3 = staticLayout2;
                Spannable spannable3 = spannable2;
                arrayList.add(new VVX(alignment, spannable3, staticLayout3, textPaint2, A082, 0, 0, A0O));
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                C13988Tno.A1P(spannable2, characterInstance);
                while (true) {
                    int next3 = characterInstance.next();
                    if (next3 == -1) {
                        break;
                    }
                    int i3 = next3 - 1;
                    if (!C13988Tno.A1Z(spannable2, i3)) {
                        int lineForOffset = staticLayout2.getLineForOffset(i3);
                        do {
                            next = characterInstance.next();
                            if (next == -1) {
                                break;
                            }
                            i2 = next - 1;
                            if (C13988Tno.A1Z(this.A0F, i2)) {
                                break;
                            }
                        } while (staticLayout2.getLineForOffset(i2) != lineForOffset);
                        if (staticLayout2.getLineForOffset(next - 1) == lineForOffset) {
                            if (next != -1) {
                                do {
                                    next2 = characterInstance.next();
                                    if (next2 == -1) {
                                        break;
                                    }
                                    i = next2 - 1;
                                    if (!C13988Tno.A1Z(spannable2, i)) {
                                        break;
                                    }
                                } while (staticLayout2.getLineForOffset(i) != lineForOffset);
                                if (staticLayout2.getLineForOffset(next2 - 1) != lineForOffset) {
                                    next = next2;
                                } else if (next2 != -1) {
                                    characterInstance.preceding(next);
                                    characterInstance.next();
                                }
                            }
                            last = characterInstance.last();
                            boolean A0O2 = A0O();
                            int lineForOffset2 = staticLayout2.getLineForOffset(last - 1);
                            0rN A083 = A08();
                            Layout.Alignment alignment2 = this.A0E;
                            0qQ.A07(alignment2);
                            arrayList.add(new VVX(alignment2, spannable3, staticLayout3, textPaint2, A083, last, lineForOffset2, A0O2));
                        }
                        if (next != -1) {
                            last = characterInstance.previous();
                            boolean A0O22 = A0O();
                            int lineForOffset22 = staticLayout2.getLineForOffset(last - 1);
                            0rN A0832 = A08();
                            Layout.Alignment alignment22 = this.A0E;
                            0qQ.A07(alignment22);
                            arrayList.add(new VVX(alignment22, spannable3, staticLayout3, textPaint2, A0832, last, lineForOffset22, A0O22));
                        }
                        last = characterInstance.last();
                        boolean A0O222 = A0O();
                        int lineForOffset222 = staticLayout2.getLineForOffset(last - 1);
                        0rN A08322 = A08();
                        Layout.Alignment alignment222 = this.A0E;
                        0qQ.A07(alignment222);
                        arrayList.add(new VVX(alignment222, spannable3, staticLayout3, textPaint2, A08322, last, lineForOffset222, A0O222));
                    }
                }
            }
            this.A00 = ((this.A03.size() - 2) * 368) + 1868 + 300;
            TextPaint textPaint3 = this.A0b;
            0qQ.A07(textPaint3);
            W10.A02(spannable, textPaint3);
            int lineCount = staticLayout.getLineCount();
            for (int i4 = 0; i4 < lineCount; i4++) {
                int lineEnd = staticLayout.getLineEnd(i4);
                0rN A084 = A08();
                Layout.Alignment alignment3 = this.A0E;
                0qQ.A07(alignment3);
                list3.add(new C17944ViZ(alignment3, spannable, textPaint3, A084, (float) staticLayout.getLineBottom(i4), (float) staticLayout.getLineTop(i4), staticLayout.getLineLeft(i4), staticLayout.getLineRight(i4), (float) staticLayout.getLineBaseline(i4), 0, lineEnd, i4));
            }
        }
    }

    public final C360728f3 A0X() {
        return this.A05;
    }

    public final void A0Y() {
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            for (C19714WeG weG : this.A06) {
                float textSize = this.A0b.getTextSize();
                AnonymousClass9UN r1 = AnonymousClass9UV.A00;
                Layout.Alignment alignment = this.A0E;
                0qQ.A07(alignment);
                weG.FLc(staticLayout, r1.A00(alignment), textSize, this.A0F.getSpanStart(weG), this.A0F.getSpanEnd(weG));
            }
            this.A04.clear();
        }
    }

    public final int getDurationInMs() {
        return this.A00;
    }

    public C15921Ukl(Context context, int i) {
        super(context, i);
    }

    public static int A00(C15921Ukl ukl) {
        return ((ukl.A0W() * 118) / ukl.A00) + ((ukl.A0W() * C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION) / ukl.A00);
    }
}
