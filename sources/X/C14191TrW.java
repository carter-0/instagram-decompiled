package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TrW  reason: case insensitive filesystem */
public abstract class C14191TrW extends 2Rw implements X0G {
    public C14224Ts4 A00;
    public boolean A01;
    public boolean A02;
    public C14220Ts0 A03;
    public final 01c A04;
    public final 01c A05;
    public final 01c A06;
    public final 0hq A07;
    public final AnonymousClass07V A08;

    private Long A00(int i) {
        Long l = null;
        int i2 = 0;
        while (true) {
            01c r1 = this.A05;
            if (i2 >= r1.A00()) {
                return l;
            }
            if (((Number) r1.A04(i2)).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(r1.A02(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
            i2++;
        }
    }

    private void A01(long j) {
        ViewParent parent;
        01c r5 = this.A04;
        Fragment fragment = (Fragment) r5.A05(j);
        if (fragment != null) {
            View view = fragment.mView;
            if (!(view == null || (parent = view.getParent()) == null)) {
                ((ViewGroup) parent).removeAllViews();
            }
            if (!A06(j)) {
                this.A06.A08(j);
            }
            if (!fragment.isAdded()) {
                r5.A08(j);
                return;
            }
            0hq r3 = this.A07;
            if (r3.A12()) {
                this.A01 = true;
                return;
            }
            if (A06(j)) {
                C14224Ts4 ts4 = this.A00;
                ArrayList arrayList = new ArrayList();
                Iterator it = ts4.A00.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw new NullPointerException("onFragmentPreSavedInstanceState");
                }
                Fragment.SavedState A0O = r3.A0O(fragment);
                C14224Ts4.A00(arrayList);
                this.A06.A09(j, A0O);
            }
            C14224Ts4 ts42 = this.A00;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = ts42.A00.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new NullPointerException("onFragmentPreRemoved");
            }
            try {
                0s1 r0 = new 0s1(r3);
                r0.A03(fragment);
                r0.A0K();
                r5.A08(j);
            } finally {
                C14224Ts4.A00(arrayList2);
            }
        }
    }

    public Fragment A03(int i) {
        UFU ufu = (UFU) this;
        int A082 = C13989Tnp.A08(2, i);
        if (A082 == 0) {
            UserSession userSession = ufu.A02;
            0qQ.A0B(userSession, 0);
            boolean A062 = 182.A06(0Tu.A05, userSession, 36320893449806777L);
            C18079Vl8 A0N = C13990Tnq.A0N();
            XIGIGBoostDestination xIGIGBoostDestination = ufu.A01;
            List list = ufu.A06;
            String str = ufu.A04;
            XIGIGBoostCallToAction xIGIGBoostCallToAction = ufu.A00;
            boolean z = ufu.A09;
            boolean z2 = ufu.A0A;
            boolean z3 = ufu.A08;
            boolean z4 = ufu.A0C;
            boolean z5 = ufu.A0D;
            String str2 = ufu.A05;
            if (A062) {
                return A0N.A07(xIGIGBoostCallToAction, xIGIGBoostDestination, userSession, ufu.A03, str, str2, list, ufu.A07, true, z, z2, z3, z4, z5);
            }
            return A0N.A06(xIGIGBoostCallToAction, xIGIGBoostDestination, userSession, (ImageUrl) null, ufu.A03, str, str2, (String) null, list, true, z, z2, z3, z4, z5);
        } else if (A082 == 1) {
            C13990Tnq.A0h();
            UserSession userSession2 = ufu.A02;
            XIGIGBoostDestination xIGIGBoostDestination2 = ufu.A01;
            String str3 = ufu.A04;
            XIGIGBoostCallToAction xIGIGBoostCallToAction2 = ufu.A00;
            boolean z6 = ufu.A0B;
            0qQ.A0B(userSession2, 0);
            0qQ.A0B(xIGIGBoostDestination2, 1);
            AnonymousClass7TF.A1C(str3, 2, xIGIGBoostCallToAction2);
            Bundle A09 = DbY.A09(userSession2);
            A09.putString("destination", xIGIGBoostDestination2.toString());
            A09.putString("media_id", str3);
            A09.putString("call_to_action", xIGIGBoostCallToAction2.toString());
            A09.putBoolean("is_political_ads", z6);
            C47415E1j e1j = new C47415E1j();
            e1j.setArguments(A09);
            return e1j;
        } else {
            throw new RuntimeException();
        }
    }

    public final void A04() {
        01c r5;
        Fragment fragment;
        View view;
        if (this.A01 && !this.A07.A12()) {
            04u r4 = new 04u(0);
            int i = 0;
            while (true) {
                r5 = this.A04;
                if (i >= r5.A00()) {
                    break;
                }
                long A022 = r5.A02(i);
                if (!A06(A022)) {
                    r4.add(Long.valueOf(A022));
                    this.A05.A08(A022);
                }
                i++;
            }
            if (!this.A02) {
                this.A01 = false;
                for (int i2 = 0; i2 < r5.A00(); i2++) {
                    long A023 = r5.A02(i2);
                    if (this.A05.A01(A023) < 0 && ((fragment = (Fragment) r5.A05(A023)) == null || (view = fragment.mView) == null || view.getParent() == null)) {
                        r4.add(Long.valueOf(A023));
                    }
                }
            }
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                A01(((Number) it.next()).longValue());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.UB4 r8) {
        /*
            r7 = this;
            X.01c r2 = r7.A04
            long r0 = r8.mItemId
            java.lang.Object r5 = r2.A05(r0)
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.String r2 = "Design assumption violated."
            if (r5 == 0) goto L_0x00ae
            android.view.View r3 = r8.itemView
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            android.view.View r1 = r5.mView
            boolean r0 = r5.isAdded()
            if (r0 != 0) goto L_0x0022
            if (r1 == 0) goto L_0x0040
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0022:
            if (r1 != 0) goto L_0x0030
            X.0hq r2 = r7.A07
            X.U7y r1 = new X.U7y
            r1.<init>(r3, r5, r7)
            r0 = 0
            r2.A0r(r1, r0)
            return
        L_0x0030:
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x0040
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == r3) goto L_0x003f
        L_0x003c:
            A02(r1, r3)
        L_0x003f:
            return
        L_0x0040:
            boolean r0 = r5.isAdded()
            if (r0 != 0) goto L_0x003c
            X.0hq r2 = r7.A07
            boolean r0 = r2.A12()
            if (r0 != 0) goto L_0x0075
            X.U7y r0 = new X.U7y
            r0.<init>(r3, r5, r7)
            r6 = 0
            r2.A0r(r0, r6)
            X.Ts4 r0 = r7.A00
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0085
            r1.next()
            java.lang.String r1 = "onFragmentPreAdded"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0075:
            boolean r0 = r2.A0G
            if (r0 != 0) goto L_0x003f
            X.07V r2 = r7.A08
            r1 = 1
            X.SdS r0 = new X.SdS
            r0.<init>(r1, r8, r7)
            r2.A09(r0)
            return
        L_0x0085:
            r5.setMenuVisibility(r6)     // Catch:{ all -> 0x00a9 }
            X.0s1 r3 = new X.0s1     // Catch:{ all -> 0x00a9 }
            r3.<init>(r2)     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "f"
            long r0 = r8.mItemId     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = X.002.A0Q(r2, r0)     // Catch:{ all -> 0x00a9 }
            r3.A0B(r5, r0)     // Catch:{ all -> 0x00a9 }
            X.07U r0 = X.07U.A05     // Catch:{ all -> 0x00a9 }
            r3.A04(r5, r0)     // Catch:{ all -> 0x00a9 }
            r3.A0K()     // Catch:{ all -> 0x00a9 }
            X.Ts0 r0 = r7.A03     // Catch:{ all -> 0x00a9 }
            r0.A00(r6)     // Catch:{ all -> 0x00a9 }
            X.C14224Ts4.A00(r4)
            return
        L_0x00a9:
            r0 = move-exception
            X.C14224Ts4.A00(r4)
            throw r0
        L_0x00ae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14191TrW.A05(X.UB4):void");
    }

    public boolean A06(long j) {
        if (j < 0 || j >= ((long) getItemCount())) {
            return false;
        }
        return true;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        02V.A05(DbW.A1a(this.A03));
        C14220Ts0 ts0 = new C14220Ts0(this);
        this.A03 = ts0;
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            ViewPager2 viewPager2 = (ViewPager2) parent;
            ts0.A03 = viewPager2;
            C60731JqK jqK = new C60731JqK(ts0, 0);
            ts0.A02 = jqK;
            viewPager2.A05(jqK);
            UAY uay = new UAY(ts0, 2);
            ts0.A01 = uay;
            C14191TrW trW = ts0.A05;
            trW.registerAdapterDataObserver(uay);
            C64306LZg lZg = new C64306LZg(ts0, 0);
            ts0.A00 = lZg;
            trW.A08.A09(lZg);
            return;
        }
        throw C66582MXn.A0k(parent, "Expected ViewPager2 instance. Got: ", new StringBuilder());
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        UB4 ub4 = (UB4) r7;
        long j = ub4.mItemId;
        int id = ub4.itemView.getId();
        Long A002 = A00(id);
        if (A002 != null) {
            long longValue = A002.longValue();
            if (longValue != j) {
                A01(longValue);
                this.A05.A08(longValue);
            }
        }
        this.A05.A09(j, Integer.valueOf(id));
        long itemId = getItemId(i);
        01c r4 = this.A04;
        if (r4.A01(itemId) < 0) {
            Fragment A032 = A03(i);
            A032.setInitialSavedState((Fragment.SavedState) this.A06.A05(itemId));
            r4.A09(itemId, A032);
        }
        if (ub4.itemView.isAttachedToWindow()) {
            A05(ub4);
        }
        A04();
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C51968G9o.A1D(frameLayout, -1);
        JTP.A13(frameLayout);
        frameLayout.setSaveEnabled(false);
        return new C249703kE(frameLayout);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C14220Ts0 ts0 = this.A03;
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            ((ViewPager2) parent).A05.A00.remove(ts0.A02);
            C14191TrW trW = ts0.A05;
            trW.unregisterAdapterDataObserver(ts0.A01);
            trW.A08.A0A(ts0.A00);
            ts0.A03 = null;
            this.A03 = null;
            return;
        }
        throw C66582MXn.A0k(parent, "Expected ViewPager2 instance. Got: ", new StringBuilder());
    }

    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(C249703kE r2) {
        return true;
    }

    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(C249703kE r1) {
        A05((UB4) r1);
        A04();
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r4) {
        Long A002 = A00(r4.itemView.getId());
        if (A002 != null) {
            long longValue = A002.longValue();
            A01(longValue);
            this.A05.A08(longValue);
        }
    }

    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public C14191TrW(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.mLifecycleRegistry);
    }

    public static final void A02(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public long getItemId(int i) {
        long j = (long) i;
        AnonymousClass0fD.A0A(1079919963, AnonymousClass0fD.A03(1149236248));
        return j;
    }

    public C14191TrW(0hq r2, AnonymousClass07V r3) {
        this.A04 = new 01c();
        this.A06 = new 01c();
        this.A05 = new 01c();
        this.A00 = new C14224Ts4();
        this.A02 = false;
        this.A01 = false;
        this.A07 = r2;
        this.A08 = r3;
        C14191TrW.super.setHasStableIds(true);
    }
}
