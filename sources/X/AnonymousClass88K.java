package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.88K  reason: invalid class name */
public final class AnonymousClass88K implements View.OnTouchListener {
    public float A00;
    public float A01;
    public Bitmap A02;
    public FrameLayout A03;
    public ImageView A04;
    public boolean A05;
    public int A06 = -1;
    public final View A07;
    public final AnonymousClass88M A08;
    public final List A09 = new ArrayList();
    public final boolean A0A;
    public final ViewStub A0B;
    public final FrameLayout A0C;
    public final 1MD A0D;
    public final AnonymousClass030 A0E;
    public final C71662eb A0F;
    public final EyedropperColorPickerTool A0G;

    public AnonymousClass88K(View view, ViewStub viewStub, FrameLayout frameLayout, 1MD r9, C71662eb r10, EyedropperColorPickerTool eyedropperColorPickerTool, boolean z) {
        0qQ.A0B(view, 1);
        0qQ.A0B(viewStub, 4);
        0qQ.A0B(eyedropperColorPickerTool, 5);
        this.A07 = view;
        this.A0C = frameLayout;
        this.A0F = r10;
        this.A0B = viewStub;
        this.A0G = eyedropperColorPickerTool;
        this.A0D = r9;
        this.A0A = z;
        Resources resources = view.getResources();
        AnonymousClass030 r0 = new AnonymousClass030(view.getContext(), new AnonymousClass88L(this), new Handler(Looper.getMainLooper()));
        this.A0E = r0;
        r0.A00.setIsLongpressEnabled(false);
        this.A08 = new AnonymousClass88M(resources);
        AnonymousClass0fU.A00(new AnonymousClass88N(this), eyedropperColorPickerTool);
    }

    public final void A06(AnonymousClass8LV r3) {
        0qQ.A0B(r3, 0);
        List list = this.A09;
        if (!list.contains(r3)) {
            list.add(r3);
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            List<AnonymousClass8LV> list = this.A09;
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (AnonymousClass8LV DDs : list) {
                DDs.DDs(this.A06);
                arrayList.add(C60340gF.A00);
            }
            A00();
        }
        this.A0E.A00.onTouchEvent(motionEvent);
        return true;
    }

    private final void A00() {
        FrameLayout frameLayout = this.A03;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            FrameLayout frameLayout2 = this.A03;
            if (frameLayout2 != null) {
                C315596kB.A08(new View[]{frameLayout2}, true);
            }
            ((2cs) this.A0G.A04.getValue()).A04();
        }
    }

    public static final void A01(AnonymousClass88K r6) {
        float f;
        float f2;
        float f3;
        Bitmap bitmap = r6.A02;
        if (bitmap != null) {
            ImageView imageView = r6.A04;
            if (imageView != null) {
                float x = imageView.getX();
                AnonymousClass88M r2 = r6.A08;
                f = x + ((float) ((r2.A05 / 2) + r2.A04 + r2.A02));
            } else {
                f = 0.0f;
            }
            float width = (float) (bitmap.getWidth() - 1);
            if (f > width) {
                f = width;
            }
            float f4 = 0.0f;
            if (0.0f < f) {
                f4 = f;
            }
            ImageView imageView2 = r6.A04;
            if (imageView2 != null) {
                float y = imageView2.getY();
                AnonymousClass88M r22 = r6.A08;
                f2 = y + (((float) r22.A03) - r22.A01);
            } else {
                f2 = 0.0f;
            }
            if (r6.A0A) {
                f3 = r6.A07.getY();
            } else {
                f3 = 0.0f;
            }
            float f5 = f2 - f3;
            float height = (float) (bitmap.getHeight() - 1);
            if (f5 > height) {
                f5 = height;
            }
            float f6 = 0.0f;
            if (0.0f < f5) {
                f6 = f5;
            }
            int pixel = bitmap.getPixel((int) f4, (int) f6);
            r6.A06 = pixel;
            AnonymousClass88M r1 = r6.A08;
            r1.A07.setColor(pixel);
            r1.invalidateSelf();
            r6.A0G.setColor(r6.A06);
            List<AnonymousClass8LV> list = r6.A09;
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (AnonymousClass8LV DDv : list) {
                DDv.DDv(r6.A06);
                arrayList.add(C60340gF.A00);
            }
        }
    }

    public static final void A02(AnonymousClass88K r3, float f) {
        FrameLayout frameLayout = r3.A03;
        if (frameLayout != null) {
            float f2 = (float) ((-frameLayout.getWidth()) / 2);
            float width = (float) (frameLayout.getWidth() / 2);
            if (f > width) {
                f = width;
            }
            if (f2 < f) {
                f2 = f;
            }
            r3.A00 = f2;
            ImageView imageView = r3.A04;
            if (imageView != null) {
                imageView.setTranslationX(f2);
            }
            ImageView imageView2 = r3.A04;
            if (imageView2 != null) {
                imageView2.setTranslationY(r3.A01);
            }
        }
    }

    public static final void A03(AnonymousClass88K r6, float f) {
        FrameLayout frameLayout = r6.A03;
        if (frameLayout != null) {
            float f2 = (float) ((-frameLayout.getHeight()) / 2);
            AnonymousClass88M r1 = r6.A08;
            float f3 = ((float) r1.A03) - r1.A01;
            float intrinsicHeight = (float) (r1.getIntrinsicHeight() / 2);
            float f4 = (f2 - f3) + intrinsicHeight;
            float height = (((float) (frameLayout.getHeight() / 2)) - f3) + intrinsicHeight;
            if (f > height) {
                f = height;
            }
            if (f4 < f) {
                f4 = f;
            }
            r6.A01 = f4;
            ImageView imageView = r6.A04;
            if (imageView != null) {
                imageView.setTranslationX(r6.A00);
            }
            ImageView imageView2 = r6.A04;
            if (imageView2 != null) {
                imageView2.setTranslationY(r6.A01);
            }
        }
    }

    public final void A04() {
        FrameLayout frameLayout = this.A03;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            A00();
            List<AnonymousClass8LV> list = this.A09;
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (AnonymousClass8LV DDq : list) {
                DDq.DDq();
                arrayList.add(C60340gF.A00);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c8, code lost:
        if (r8 != null) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r11 = this;
            java.util.List r1 = r11.A09
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.next()
            X.8LV r0 = (X.AnonymousClass8LV) r0
            r0.DDt()
            X.0gF r0 = X.C60340gF.A00
            r2.add(r0)
            goto L_0x0011
        L_0x0026:
            android.widget.FrameLayout r0 = r11.A03
            r5 = 0
            if (r0 != 0) goto L_0x004e
            android.view.ViewStub r0 = r11.A0B
            android.view.View r2 = r0.inflate()
            boolean r0 = r2 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x0117
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            if (r2 == 0) goto L_0x0117
            r2.setOnTouchListener(r11)
            r0 = 2131432563(0x7f0b1473, float:1.8486887E38)
            android.view.View r1 = r2.requireViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            X.88M r0 = r11.A08
            r1.setImageDrawable(r0)
            r11.A04 = r1
        L_0x004c:
            r11.A03 = r2
        L_0x004e:
            r10 = 0
            A02(r11, r10)
            A03(r11, r10)
            android.graphics.Bitmap r0 = r11.A02
            r4 = 1
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.isRecycled()
            if (r0 != r4) goto L_0x0072
        L_0x0060:
            android.view.View r0 = r11.A07
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r11.A02 = r0
        L_0x0072:
            X.1MD r1 = r11.A0D
            android.graphics.Bitmap r0 = r11.A02
            java.lang.Object r2 = r1.apply(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            X.2eb r1 = r11.A0F
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x0113
            android.view.View r9 = r1.A01()
            android.view.TextureView r9 = (android.view.TextureView) r9
            if (r9 == 0) goto L_0x0114
            android.graphics.Bitmap r8 = r9.getBitmap()
        L_0x0090:
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r2)
            if (r0 == 0) goto L_0x0106
            android.widget.FrameLayout r6 = r11.A0C
            if (r6 == 0) goto L_0x0106
            if (r9 == 0) goto L_0x0106
            android.view.ViewParent r1 = r6.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0104
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x00a7:
            r3 = -1
            if (r1 == 0) goto L_0x0102
            int r2 = r1.indexOfChild(r6)
        L_0x00ae:
            android.view.ViewParent r1 = r9.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00be
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x00be
            int r3 = r1.indexOfChild(r9)
        L_0x00be:
            if (r2 <= r3) goto L_0x0106
            if (r8 == 0) goto L_0x00c5
            r7.drawBitmap(r8, r10, r10, r5)
        L_0x00c5:
            r6.draw(r7)
            if (r8 == 0) goto L_0x00cd
        L_0x00ca:
            r8.recycle()
        L_0x00cd:
            android.widget.ImageView r2 = r11.A04
            if (r2 == 0) goto L_0x00da
            boolean r0 = r2.isLaidOut()
            if (r0 == 0) goto L_0x00f5
            A01(r11)
        L_0x00da:
            android.widget.FrameLayout r0 = r11.A03
            if (r0 == 0) goto L_0x00e7
            android.view.View[] r1 = new android.view.View[]{r0}
            X.2co r0 = X.C315596kB.A02
            X.C294975nL.A04(r5, r1, r4)
        L_0x00e7:
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r0 = r11.A0G
            X.0eM r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.2cs r0 = (X.2cs) r0
            r0.A03()
            return
        L_0x00f5:
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            X.APH r0 = new X.APH
            r0.<init>(r2, r11)
            r1.addOnPreDrawListener(r0)
            goto L_0x00da
        L_0x0102:
            r2 = -1
            goto L_0x00ae
        L_0x0104:
            r1 = r5
            goto L_0x00a7
        L_0x0106:
            android.widget.FrameLayout r0 = r11.A0C
            if (r0 == 0) goto L_0x010d
            r0.draw(r7)
        L_0x010d:
            if (r8 == 0) goto L_0x00cd
            r7.drawBitmap(r8, r10, r10, r5)
            goto L_0x00ca
        L_0x0113:
            r9 = r5
        L_0x0114:
            r8 = r5
            goto L_0x0090
        L_0x0117:
            r2 = r5
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass88K.A05():void");
    }
}
