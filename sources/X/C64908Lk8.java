package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lk8  reason: case insensitive filesystem */
public final class C64908Lk8 implements C66545MVz {
    public int A00;
    public C60478JmA A01;
    public C63611Kzz A02;
    public final U9d A03 = new U9d(this.A04.getContext(), 0);
    public final RecyclerView A04;
    public final UserSession A05;
    public final float A06 = 1.0f;
    public final C60436JlU A07;
    public final C60380JkZ A08;

    public final void AAf(View view) {
    }

    public final void CNC(C63610Kzy kzy, List list, int i, int i2, boolean z) {
        0qQ.A0B(list, 0);
        C60436JlU jlU = this.A07;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(new C61710KJa(JTO.A0Z(it)));
        }
        jlU.A03 = kzy;
        C60436JlU.A00(jlU, A0r);
        jlU.A02 = i;
        jlU.A00 = i2;
        if (z) {
            this.A04.setAdapter(jlU);
        }
    }

    public final void EDx(C60478JmA jmA) {
        0qQ.A0B(jmA, 0);
        this.A01 = null;
        this.A04.A16(jmA);
    }

    public final void EHO(L01 l01) {
        A00(l01, this, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r2 = (X.C60511Jmi) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EHc(X.C66539MVt r7) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            androidx.recyclerview.widget.RecyclerView r5 = r6.A04
            X.3pI r1 = r5.A0D
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            X.0qQ.A0C(r1, r0)
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r4 = r1.A1a()
            int r3 = r1.A1b()
            if (r4 > r3) goto L_0x004b
        L_0x0019:
            X.3kE r2 = r5.A0W(r4)
            if (r2 == 0) goto L_0x0046
            boolean r0 = r2 instanceof X.C60511Jmi
            if (r0 == 0) goto L_0x0046
            X.Jmi r2 = (X.C60511Jmi) r2
            X.MVt r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L_0x0046
            boolean r0 = r0.isVisible()
            if (r0 != r1) goto L_0x0046
            X.MVt r0 = r2.A00
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 == 0) goto L_0x0046
            X.MVt r0 = r2.A00
            if (r0 == 0) goto L_0x003f
            r0.Ee2()
        L_0x003f:
            X.MVt r0 = r2.A00
            if (r0 == 0) goto L_0x0046
            r0.Cn5()
        L_0x0046:
            if (r4 == r3) goto L_0x004b
            int r4 = r4 + 1
            goto L_0x0019
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64908Lk8.EHc(X.MVt):void");
    }

    public final void EU0(float f) {
    }

    public final void EjA(boolean z) {
        this.A04.setSaveEnabled(true);
    }

    public final void EjL(C71392co r1) {
    }

    public final void ElY(boolean z) {
    }

    public final void ElZ(C71392co r1) {
    }

    public final void addView(View view, int i) {
    }

    public final int indexOfChild(View view) {
        0qQ.A0B(view, 0);
        return RecyclerView.A03(view);
    }

    public final void removeView(View view) {
    }

    public final void A97(C60478JmA jmA) {
        this.A01 = jmA;
        this.A04.A15(jmA);
    }

    public final View AnC(int i) {
        C249703kE A0W = this.A04.A0W(i);
        if (A0W != null) {
            return A0W.itemView;
        }
        return null;
    }

    public final int AnH() {
        C60436JlU jlU = this.A07;
        boolean z = jlU.A05;
        int itemCount = jlU.getItemCount();
        if (z) {
            return itemCount - 1;
        }
        return itemCount;
    }

    public final int Atv() {
        return this.A00;
    }

    public final C66539MVt Au6() {
        boolean z;
        C60511Jmi jmi;
        C249703kE A0W = this.A04.A0W(this.A00);
        if (A0W == null) {
            z = true;
        } else {
            z = A0W instanceof C60511Jmi;
        }
        if (!z || (jmi = (C60511Jmi) A0W) == null) {
            return null;
        }
        return jmi.A00;
    }

    public final ViewGroup.LayoutParams BLw() {
        ViewGroup.LayoutParams layoutParams = this.A04.getLayoutParams();
        0qQ.A07(layoutParams);
        return layoutParams;
    }

    public final /* bridge */ /* synthetic */ View Bq9() {
        return this.A04;
    }

    public final float CDb() {
        return this.A06;
    }

    public final ViewTreeObserver CEp() {
        ViewTreeObserver viewTreeObserver = this.A04.getViewTreeObserver();
        0qQ.A07(viewTreeObserver);
        return viewTreeObserver;
    }

    public final void EDK() {
        C60436JlU jlU = this.A07;
        jlU.A01 = 0;
        DbW.A0z(jlU, 0sn.A00, jlU.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r2 = (X.C60511Jmi) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EFE() {
        /*
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r5 = r6.A04
            X.3pI r1 = r5.A0D
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            X.0qQ.A0C(r1, r0)
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r4 = r1.A1a()
            int r3 = r1.A1b()
            if (r4 > r3) goto L_0x003f
        L_0x0015:
            X.3kE r2 = r5.A0W(r4)
            if (r2 == 0) goto L_0x003a
            boolean r0 = r2 instanceof X.C60511Jmi
            if (r0 == 0) goto L_0x003a
            X.Jmi r2 = (X.C60511Jmi) r2
            X.MVt r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.isVisible()
            if (r0 != r1) goto L_0x003a
            X.MVt r0 = r2.A00
            if (r0 == 0) goto L_0x0033
            r0.Ee2()
        L_0x0033:
            X.MVt r0 = r2.A00
            if (r0 == 0) goto L_0x003a
            r0.Cn5()
        L_0x003a:
            if (r4 == r3) goto L_0x003f
            int r4 = r4 + 1
            goto L_0x0015
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64908Lk8.EFE():void");
    }

    public final void EKe(float f) {
        EKf(this.A00 + 1);
    }

    public final void EKf(int i) {
        this.A00 = i;
        this.A04.post(new M65(this, i));
    }

    public final void EKk(float f) {
        EKf(this.A00 - 1);
    }

    public final void EaX(C63611Kzz kzz) {
        this.A02 = kzz;
        this.A07.A04 = kzz;
    }

    public final void Ebw(ViewGroup.LayoutParams layoutParams) {
        this.A04.setLayoutParams(layoutParams);
    }

    public final void Etv() {
        C60436JlU jlU = this.A07;
        if (!jlU.A05) {
            jlU.A05 = true;
            C60436JlU.A00(jlU, jlU.A06);
        }
    }

    public final void EzF(int i, int i2) {
        C60436JlU jlU = this.A07;
        ArrayList A0U = 00k.A0U(jlU.A06);
        Collections.swap(A0U, i, i2);
        C60436JlU.A00(jlU, A0U);
    }

    public final int getWidth() {
        return this.A04.getWidth();
    }

    public final void removeItem(int i) {
        C66539MVt mVt;
        C60511Jmi jmi = (C60511Jmi) this.A04.A0W(i);
        if (!(jmi == null || (mVt = jmi.A00) == null)) {
            mVt.cleanup();
        }
        C60436JlU jlU = this.A07;
        ArrayList A0U = 00k.A0U(jlU.A06);
        A0U.remove(i);
        C60436JlU.A00(jlU, A0U);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.A04.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        this.A04.requestLayout();
    }

    public final void setVisibility(int i) {
        this.A04.setVisibility(i);
    }

    public C64908Lk8(RecyclerView recyclerView, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, recyclerView);
        this.A05 = userSession;
        this.A04 = recyclerView;
        C60436JlU jlU = new C60436JlU(182.A06(0Tu.A05, userSession, 36324080315543322L));
        this.A07 = jlU;
        C60380JkZ jkZ = new C60380JkZ(new C58727Iwa(this, 23));
        this.A08 = jkZ;
        RecyclerView recyclerView2 = this.A04;
        DbV.A1A(recyclerView2.getContext(), recyclerView2);
        this.A04.setAdapter(jlU);
        jkZ.A07(this.A04);
        LZ0.A00(this.A04.getViewTreeObserver(), this, 1);
    }

    public static final void A00(L01 l01, C64908Lk8 lk8, int i) {
        if (i >= lk8.AnH()) {
            l01.A00.A0U.A0L();
            return;
        }
        lk8.A04.A0o(i);
        lk8.CEp().addOnGlobalLayoutListener(new C64297LYx(i, 3, lk8, l01));
    }

    public final void EKa(int i, float f) {
        EKf(i);
    }
}
