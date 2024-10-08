package com.instagram.creation.base.ui.feedcolorfilterpicker;

import X.0ng;
import X.0qQ;
import X.0xI;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C59882Jb5;
import X.C60010JdJ;
import X.C60060Jeb;
import X.C60070Jez;
import X.C61480nO;
import X.C61610nw;
import X.C61689KHx;
import X.C63515KyQ;
import X.C63805L7l;
import X.C63912LBx;
import X.C64943Lki;
import X.C66568MWw;
import X.JTP;
import X.JTR;
import X.KIT;
import X.MV0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

public class FilterPicker extends FeedColorFilterPicker implements MV0 {
    public long A00;
    public C63912LBx A01;
    public boolean A02;
    public float A03;
    public int A04;
    public View A05;
    public final Handler A06 = new C60010JdJ(Looper.getMainLooper(), this);
    public final List A07 = AnonymousClass7TE.A1C();
    public final C61480nO A08 = JTP.A0W(C61610nw.A00(), "FilterPicker");
    public final 0ng A09 = new KIT(this);

    public final void DAX(View view, boolean z) {
        this.A05 = null;
        this.A06.removeCallbacksAndMessages((Object) null);
        C63912LBx lBx = this.A01;
        int i = this.A04;
        C60070Jez jez = ((C60060Jeb) view).A05;
        C66568MWw mWw = jez.A01;
        0qQ.A07(mWw);
        String name = mWw.getName();
        int A002 = C66568MWw.A00(jez);
        0qQ.A0B(name, 1);
        0xI A003 = C59882Jb5.A00(AnonymousClass05K.A0g);
        A003.A08(Integer.valueOf(i), "index");
        A003.A0C("filter", name);
        A003.A08(Integer.valueOf(A002), "filter_type");
        A003.A0C("source", "editor_view");
        lBx.A00.EFq(A003);
        view.setVisibility(0);
        this.A08.ATE(this.A09);
    }

    private int getIndexFromDrag() {
        LinearLayout linearLayout = this.A03;
        linearLayout.getClass();
        int childCount = (linearLayout.getChildCount() - 1) - (this.A02 ? 1 : 0);
        int i = 0;
        int i2 = 1;
        while (i2 <= childCount) {
            i = (i2 + childCount) >>> 1;
            if (this.A03 >= ((float) ((this.A02 * i) - getScrollX()))) {
                if (this.A03 <= ((float) (((this.A02 * i) - getScrollX()) + this.A02))) {
                    break;
                }
                i2 = i + 1;
            } else {
                childCount = i - 1;
            }
        }
        return i;
    }

    public final void DAe(View view, float f, float f2) {
        this.A05 = view;
        this.A03 = f;
        this.A04 = getIndexFromDrag();
        C66568MWw mWw = ((C60060Jeb) view).A05.A01;
        0qQ.A07(mWw);
        C63912LBx lBx = this.A01;
        int i = this.A04;
        String name = mWw.getName();
        int BEU = mWw.BEU();
        0qQ.A0B(name, 1);
        0xI A002 = C59882Jb5.A00(AnonymousClass05K.A0f);
        A002.A08(Integer.valueOf(i), "index");
        A002.A0C("filter", name);
        A002.A08(Integer.valueOf(BEU), "filter_type");
        A002.A0C("source", "editor_view");
        lBx.A00.EFq(A002);
        view.setVisibility(4);
    }

    public final void DAi() {
        this.A06.removeCallbacksAndMessages((Object) null);
    }

    public final void DAj(View view, float f, float f2, boolean z, boolean z2) {
        this.A03 = f;
        this.A03.getClass();
        if (((float) (this.A02 / 2)) + f > AnonymousClass7TE.A02(this) && getScrollX() != JTR.A0B(this.A03, this)) {
            Handler handler = this.A06;
            if (!handler.hasMessages(2)) {
                this.A00 = System.currentTimeMillis();
                handler.sendEmptyMessage(2);
            }
        } else if (f - ((float) (this.A02 / 2)) >= 0.0f || getScrollX() == 0) {
            this.A06.removeCallbacksAndMessages((Object) null);
        } else {
            Handler handler2 = this.A06;
            if (!handler2.hasMessages(1)) {
                this.A00 = System.currentTimeMillis();
                handler2.sendEmptyMessage(1);
            }
        }
        A00(this);
    }

    public List getTileFrames() {
        return this.A06;
    }

    public void setEffects(List list, boolean z, UserSession userSession) {
        List list2 = this.A07;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66568MWw mWw = (C66568MWw) it.next();
            if ((mWw instanceof C64943Lki) && mWw.BEU() != 0) {
                C63805L7l l7l = ((C64943Lki) mWw).A00;
                list2.add(l7l);
                if (l7l.A02) {
                    it.remove();
                }
            } else if (mWw.BEU() == -1) {
                this.A02 = true;
            }
        }
        super.setEffects(list, z, userSession);
    }

    public void setFilterStateToOld(C60060Jeb jeb) {
        int A002 = C66568MWw.A00(jeb.A05);
        for (C63805L7l l7l : this.A07) {
            if (l7l.A00 == A002 && l7l.A03) {
                l7l.A03 = false;
                jeb.A02();
                this.A08.ATE(this.A09);
                return;
            }
        }
    }

    public FilterPicker(Context context) {
        super(context);
    }

    public static void A00(FilterPicker filterPicker) {
        int width;
        List list;
        int indexFromDrag = filterPicker.getIndexFromDrag();
        LinearLayout linearLayout = filterPicker.A03;
        linearLayout.getClass();
        View childAt = linearLayout.getChildAt(indexFromDrag);
        View view = filterPicker.A05;
        if (childAt != view) {
            view.getClass();
            C60060Jeb jeb = (C60060Jeb) view;
            if (jeb.getLayoutParams().width >= 0) {
                width = jeb.getLayoutParams().width;
            } else {
                width = jeb.getWidth();
            }
            if (filterPicker.A04 > indexFromDrag) {
                width = -width;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation((float) width, 0.0f, 0.0f, 0.0f);
            translateAnimation.setDuration(300);
            childAt.startAnimation(translateAnimation);
            if (filterPicker.A05.getAnimation() != null) {
                filterPicker.A05.clearAnimation();
            }
            filterPicker.A03.removeView(filterPicker.A05);
            List list2 = filterPicker.A06;
            list2.remove(filterPicker.A05);
            filterPicker.A03.addView(filterPicker.A05, indexFromDrag);
            list2.add(indexFromDrag, filterPicker.A05);
            filterPicker.A03.requestLayout();
            int A002 = C66568MWw.A00(((C60060Jeb) childAt).A05);
            int A003 = C66568MWw.A00(jeb.A05);
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                list = filterPicker.A07;
                if (i >= list.size()) {
                    break;
                }
                if (((C63805L7l) list.get(i)).A00 == A002) {
                    i3 = i;
                } else if (((C63805L7l) list.get(i)).A00 == A003) {
                    i2 = i;
                }
                i++;
            }
            list.add(i3, list.remove(i2));
        }
        filterPicker.A04 = indexFromDrag;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-920838021);
        super.onAttachedToWindow();
        C63515KyQ.A00.A02(this, C61689KHx.class);
        AnonymousClass0fD.A0D(-1612637574, A062);
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-2006864500);
        setFilterStateToOld((C60060Jeb) view);
        super.onClick(view);
        AnonymousClass0fD.A0C(-1239629874, A052);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-1767842461);
        super.onDetachedFromWindow();
        C63515KyQ.A00.A03(this, C61689KHx.class);
        AnonymousClass0fD.A0D(1405955361, A062);
    }

    public void setFilterLogger(C63912LBx lBx) {
        this.A01 = lBx;
    }

    public FilterPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FilterPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
