package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Ov  reason: invalid class name and case insensitive filesystem */
public final class C355148Ov extends PopupWindow {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        if (r4 != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C355148Ov(android.content.Context r8, com.instagram.common.session.UserSession r9, java.lang.Integer r10, boolean r11) {
        /*
            r7 = this;
            r6 = 1
            X.0qQ.A0B(r8, r6)
            r3 = 2
            X.0qQ.A0B(r9, r3)
            r0 = -2
            r7.<init>(r0, r0)
            r7.A00 = r8
            r7.A01 = r9
            r7.A02 = r11
            X.0oa r5 = X.0ob.A02
            boolean r4 = X.C61670oa.A08()
            r7.A03 = r4
            r2 = 0
            if (r4 == 0) goto L_0x00b6
            if (r11 == 0) goto L_0x00b3
            android.content.Context r0 = X.2Yn.A01(r8)
        L_0x0023:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131624660(0x7f0e02d4, float:1.8876506E38)
        L_0x002a:
            android.view.View r0 = r1.inflate(r0, r2)
            r7.setContentView(r0)
            r7.setFocusable(r6)
            android.view.View r0 = r7.getContentView()
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r0 = r1 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L_0x0093
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L_0x0093
            if (r11 == 0) goto L_0x0055
            if (r4 != 0) goto L_0x0097
            r1.mutate()
            r0 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r0 = r8.getColor(r0)
            r1.setColor(r0)
        L_0x0055:
            r0 = 1106247680(0x41f00000, float:30.0)
            r7.setElevation(r0)
            if (r10 == 0) goto L_0x0083
            android.view.View r1 = r7.getContentView()
            int r0 = r10.intValue()
            r1.setBackgroundResource(r0)
            if (r4 == 0) goto L_0x0083
            android.view.View r2 = r7.getContentView()
            boolean r0 = r2 instanceof com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout
            if (r0 == 0) goto L_0x0083
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout r2 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout) r2
            if (r2 == 0) goto L_0x0083
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setCornerRadius(r0)
        L_0x0083:
            r7.setInputMethodMode(r3)
            boolean r0 = r5.A0J()
            if (r0 == 0) goto L_0x0092
            r0 = 2132018050(0x7f140382, float:1.9674396E38)
            r7.setAnimationStyle(r0)
        L_0x0092:
            return
        L_0x0093:
            if (r11 == 0) goto L_0x0055
            if (r4 == 0) goto L_0x0055
        L_0x0097:
            android.view.View r0 = r7.getContentView()
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.Drawable r2 = r0.mutate()
            X.0qQ.A07(r2)
            r0 = 2131100415(0x7f0602ff, float:1.781321E38)
            int r1 = r8.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            goto L_0x0055
        L_0x00b3:
            r0 = r8
            goto L_0x0023
        L_0x00b6:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131624656(0x7f0e02d0, float:1.8876498E38)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355148Ov.<init>(android.content.Context, com.instagram.common.session.UserSession, java.lang.Integer, boolean):void");
    }

    public final void A01(View view) {
        int i;
        int i2;
        0qQ.A0B(view, 0);
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = getContentView().getMeasuredWidth();
        int measuredHeight = getContentView().getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        Context context = this.A00;
        int i5 = context.getResources().getDisplayMetrics().widthPixels;
        int i6 = context.getResources().getDisplayMetrics().heightPixels;
        int i7 = measuredWidth + i3;
        if (i7 > i5 || view.getHeight() + i4 + measuredHeight > i6) {
            if (i7 <= i5 && view.getHeight() + i4 + measuredHeight > i6) {
                i2 = -(view.getHeight() + measuredHeight);
                if (0ob.A02.A0J()) {
                    setAnimationStyle(R.style.PrismContextMenuAnimationBottomLeft);
                }
                i = 0;
                showAsDropDown(view, i, i2, 0);
            } else if (i7 > i5 && view.getHeight() + i4 + measuredHeight <= i6) {
                i = -(measuredWidth - view.getWidth());
                if (0ob.A02.A0J()) {
                    setAnimationStyle(R.style.PrismContextMenuAnimationTopRight);
                }
                i2 = 0;
                showAsDropDown(view, i, i2, 0);
            } else if (i7 > i5 && i4 + view.getHeight() + measuredHeight > i6) {
                i = -(measuredWidth - view.getWidth());
                i2 = -(view.getHeight() + measuredHeight);
                if (0ob.A02.A0J()) {
                    setAnimationStyle(R.style.PrismContextMenuAnimationBottomRight);
                }
                showAsDropDown(view, i, i2, 0);
            }
        } else if (0ob.A02.A0J()) {
            setAnimationStyle(R.style.PrismContextMenuAnimationTopLeft);
        }
        i = 0;
        i2 = 0;
        showAsDropDown(view, i, i2, 0);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.3B3, java.lang.Object] */
    public final void A02(List list) {
        2Rw r2;
        Integer num;
        Integer num2;
        List list2 = list;
        0qQ.A0B(list2, 0);
        ArrayList arrayList = new ArrayList(list2);
        Context context = this.A00;
        if (2eO.A00(context)) {
            String string = context.getString(2131960862);
            0qQ.A07(string);
            arrayList.add(new C367618rI((Drawable) null, (Drawable) null, (C15048ULb) null, new C40540Adn(this), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false));
        }
        RecyclerView recyclerView = (RecyclerView) getContentView().requireViewById(R.id.context_menu_options_list);
        Context context2 = recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context2));
        if (this.A03) {
            0qQ.A07(context2);
            ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C367618rI r7 = (C367618rI) it.next();
                String str = r7.A08;
                Drawable drawable = r7.A03;
                C367608rH r12 = r7.A06;
                boolean z = r7.A0E;
                Integer num3 = r7.A07;
                C15048ULb uLb = r7.A05;
                boolean z2 = !r7.A09;
                if (z) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A00;
                }
                if (r7.A0D) {
                    num2 = AnonymousClass05K.A01;
                } else {
                    num2 = AnonymousClass05K.A00;
                }
                arrayList2.add(new C367628rJ(drawable, uLb, r12, num3, num3, num3, num, num2, str, z, z2, r7.A0F));
            }
            r2 = new C367578rE(context2, this, arrayList2, this.A02);
        } else {
            0qQ.A07(context2);
            r2 = new C368348sT(context2, this, arrayList, this.A02);
        }
        recyclerView.setAdapter(r2);
        recyclerView.A11(new Object());
        recyclerView.A11(new C367598rG());
    }

    public final 0eP A00() {
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return new 0eP(Integer.valueOf(getContentView().getMeasuredWidth()), Integer.valueOf(getContentView().getMeasuredHeight()));
    }
}
