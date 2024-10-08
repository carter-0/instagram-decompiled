package X;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class U4i extends FrameLayout {
    public int A00;
    public int A01;
    public U39 A02;
    public SpritesheetInfo A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public C18799W2m A07;
    public float[] A08;
    public final FrameLayout A09;
    public final List A0A = new ArrayList();
    public final List A0B = new ArrayList();
    public final List A0C = new ArrayList();
    public final List A0D = new ArrayList();
    public final List A0E = new ArrayList();
    public final int A0F;
    public final int A0G;
    public final int A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U4i(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        View requireViewById = LayoutInflater.from(context).inflate(R.layout.insights_line_chart_layout, this).requireViewById(R.id.insights_line_chart_container);
        0qQ.A0C(requireViewById, C273654mx.A00(2));
        this.A09 = (FrameLayout) requireViewById;
        this.A0H = JTR.A07(context);
        this.A0G = context.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
        this.A0F = AnonymousClass7TG.A02(context);
    }

    public static final int A00(U4i u4i, float f, boolean z) {
        float[] fArr;
        int i = 0;
        if (z) {
            fArr = ((U3X) u4i.A0B.get(0)).getXPositions();
        } else {
            fArr = u4i.A08;
        }
        if (fArr == null) {
            return -1;
        }
        float f2 = f - ((float) (u4i.A0H + u4i.A0F));
        if (f2 > fArr[0]) {
            int length = fArr.length;
            i = length - 1;
            if (f2 < fArr[i]) {
                for (int i2 = 1; i2 < length; i2++) {
                    float f3 = fArr[i2];
                    if (f2 < f3) {
                        int i3 = i2 - 1;
                        if (AnonymousClass7TE.A00(f2, fArr[i3]) < AnonymousClass7TE.A00(f2, f3)) {
                            return i3;
                        }
                        return i2;
                    }
                }
                return -1;
            }
        }
        return i;
    }

    public static final C17483VXk A01(U4i u4i, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        List<C17729Vcy> list = u4i.A0C;
        if (AnonymousClass7TE.A1b(list)) {
            for (C17729Vcy vcy : list) {
                arrayList.add(new VRV(vcy.A0D[i], vcy.A06));
            }
        }
        List<C17729Vcy> list2 = u4i.A0E;
        if (AnonymousClass7TE.A1b(list2)) {
            for (C17729Vcy vcy2 : list2) {
                arrayList.add(new VRV(vcy2.A0D[i], vcy2.A06));
            }
        }
        if (z) {
            ((U3X) u4i.A0B.get(0)).getXPositions();
        }
        return new C17483VXk(arrayList, (float) u4i.A01, (float) u4i.A00, i);
    }

    public static final void A04(U3X u3x, U4i u4i) {
        FrameLayout frameLayout = u4i.A09;
        int i = u4i.A0H;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMarginStart(i);
        frameLayout.addView(u3x, layoutParams);
    }

    public final void A05() {
        this.A09.removeAllViews();
        if (this.A02 != null) {
            this.A02 = null;
        }
        C18799W2m w2m = this.A07;
        if (w2m != null) {
            w2m.A07.dismiss();
            this.A07 = null;
        }
        setOnTouchListener((View.OnTouchListener) null);
        this.A0B.clear();
        this.A0D.clear();
        this.A0C.clear();
        this.A0E.clear();
        this.A0A.clear();
    }

    public final void A06() {
        U39 u39 = this.A02;
        if (u39 != null) {
            this.A09.removeView(u39);
            this.A02 = null;
        }
        List list = this.A0D;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A09.removeView(JTO.A0H(it));
            }
            list.clear();
        }
        C18799W2m w2m = this.A07;
        if (w2m != null) {
            w2m.A07.dismiss();
            this.A07 = null;
        }
    }

    public final void A07(int i) {
        C18799W2m w2m = this.A07;
        if (w2m == null) {
            Context A0S = AnonymousClass7TE.A0S(this);
            int length = ((U3X) this.A0B.get(0)).getXPositions().length;
            List list = this.A0C;
            float f = ((C17729Vcy) list.get(0)).A02;
            float f2 = ((C17729Vcy) list.get(0)).A01;
            float[] fArr = ((C17729Vcy) list.get(0)).A0C;
            if (fArr != null) {
                float[] fArr2 = ((C17729Vcy) list.get(0)).A0D;
                List list2 = this.A0A;
                this.A07 = new C18799W2m(A0S, new C17682VcD(this.A03, list2, fArr, fArr2, ((C17729Vcy) list.get(0)).A0E, f, f2, length, this.A04, this.A06), this, i);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        w2m.A05(i);
    }

    public final void A08(C17483VXk vXk) {
        U39 u39 = this.A02;
        if (u39 != null) {
            this.A09.removeView(u39);
            this.A02 = null;
        }
        U39 u392 = new U39(AnonymousClass7TE.A0S(this));
        this.A02 = u392;
        u392.A03 = vXk;
        u392.A04 = new float[DbU.A0K(vXk.A03).size()];
        List list = this.A0C;
        if (list != null && !list.isEmpty()) {
            float f = ((C17729Vcy) list.get(0)).A02;
            float f2 = ((C17729Vcy) list.get(0)).A01;
            float[] fArr = ((C17729Vcy) list.get(0)).A0C;
            U39 u393 = this.A02;
            if (u393 != null) {
                Float valueOf = Float.valueOf(f);
                Float valueOf2 = Float.valueOf(f2);
                if (!(valueOf == null || valueOf2 == null || fArr == null)) {
                    u393.A01 = f;
                    u393.A00 = f2;
                    u393.A05 = fArr;
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        FrameLayout frameLayout = this.A09;
        U39 u394 = this.A02;
        int i = this.A0G;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMarginStart(i);
        frameLayout.addView(u394, layoutParams);
    }

    public final void setIsDistributionChart(boolean z) {
        this.A04 = z;
    }

    public final void setIsRetentionChart(boolean z) {
        this.A05 = z;
    }

    public final void setIsTappableChart(boolean z) {
        this.A06 = z;
    }

    public final void setSpriteSheetInfo(SpritesheetInfo spritesheetInfo) {
        this.A03 = spritesheetInfo;
    }

    public static final U3X A02(C17729Vcy vcy, C17729Vcy vcy2, C17729Vcy vcy3, U4i u4i) {
        C17729Vcy vcy4;
        U3X u3x = new U3X(AnonymousClass7TE.A0S(u4i));
        0qQ.A0B(vcy, 0);
        u3x.A05 = vcy;
        u3x.A06 = vcy2;
        u3x.A07 = vcy3;
        Paint paint = u3x.A0P;
        Context A0S = AnonymousClass7TE.A0S(u3x);
        float f = vcy.A00;
        paint.setStrokeWidth(0nA.A00(A0S, f));
        int i = vcy.A06;
        paint.setColor(i);
        Paint paint2 = u3x.A0N;
        paint2.setStrokeWidth(0nA.A00(A0S, f));
        int i2 = vcy.A08;
        if (i2 == -1) {
            i2 = i;
        }
        paint2.setColor(i2);
        u3x.A0I = vcy.A0C;
        float[] fArr = vcy.A0D;
        u3x.A0K = fArr;
        int length = fArr.length;
        u3x.A03 = length;
        u3x.A0H = new float[length];
        u3x.A0J = new float[length];
        C17729Vcy vcy5 = u3x.A06;
        if (!(vcy5 == null || (vcy4 = u3x.A07) == null)) {
            u3x.A0A = vcy5.A0C;
            float[] fArr2 = vcy5.A0D;
            u3x.A0C = fArr2;
            int length2 = fArr2.length;
            u3x.A02 = length2;
            u3x.A09 = new float[length2];
            u3x.A0B = new float[length2];
            u3x.A0E = vcy4.A0C;
            float[] fArr3 = vcy4.A0D;
            u3x.A0G = fArr3;
            int length3 = fArr3.length;
            u3x.A04 = length3;
            u3x.A0D = new float[length3];
            u3x.A0F = new float[length3];
        }
        if (vcy.A09) {
            float A002 = 0nA.A00(A0S, 8.0f);
            paint.setPathEffect(new DashPathEffect(new float[]{A002, A002}, 0.0f));
        }
        if (vcy.A0A) {
            paint.setStrokeCap(Paint.Cap.ROUND);
        }
        if (vcy.A0B) {
            u3x.A08 = true;
            u3x.A0O.setColor(vcy.A05);
            u3x.A0M.setColor(vcy.A07);
        }
        return u3x;
    }

    public static final void A03(VRU vru, U4i u4i) {
        U3B u3b = new U3B(AnonymousClass7TE.A0S(u4i), u4i.A04);
        u3b.setRulersAndMarks(vru);
        u4i.A08 = u3b.getXMarksPositions();
        FrameLayout frameLayout = u4i.A09;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMarginStart(0);
        frameLayout.addView(u3b, layoutParams);
    }
}
