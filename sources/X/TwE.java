package X;

import android.content.Context;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class TwE implements X9P {
    public C14198Trd A00;
    public C14451TwZ A01;
    public Context A02;
    public Parcelable A03;
    public ViewGroup A04;
    public RecyclerView A05;
    public RecyclerView A06;
    public UserSession A07;
    public X4Z A08;
    public C66987MgL A09;
    public final Handler A0A;
    public final AnonymousClass2t9 A0B;
    public final AnonymousClass2t9 A0C;
    public final C3728292s A0D = C3728192r.A00(this.A07);
    public final boolean A0E = C13988Tno.A1Y(this.A07);
    public final boolean A0F;
    public final boolean A0G;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Tx9, X.Tre] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (X.C14442TwQ.A00.A00(r2) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r8 = this;
            r5 = 0
            X.Tx9 r6 = new X.Tx9
            r6.<init>(r5)
            com.instagram.common.session.UserSession r2 = r8.A07
            X.Mmz r0 = X.C14408Tvb.A00(r2)
            int r1 = r0.A01
            r0 = 3
            if (r1 != r0) goto L_0x0074
            boolean r0 = r8.A0F
            if (r0 != 0) goto L_0x0074
            X.Mmz r0 = X.C14408Tvb.A00(r2)
            X.8jb r0 = r0.A02
            java.util.List r1 = r0.A04
            boolean r0 = r8.A0E
            if (r0 == 0) goto L_0x002a
            X.TwQ r0 = X.C14442TwQ.A00
            boolean r0 = r0.A00(r2)
            r7 = 1
            if (r0 != 0) goto L_0x002b
        L_0x002a:
            r7 = 0
        L_0x002b:
            X.0qQ.A0B(r1, r5)
            java.util.Iterator r4 = r1.iterator()
        L_0x0032:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r3 = r4.next()
            X.Mfb r3 = (X.C66942Mfb) r3
            boolean r0 = r3 instanceof X.C67387Mn4
            if (r0 == 0) goto L_0x0053
            r0 = r3
            X.Mn4 r0 = (X.C67387Mn4) r0
            com.instagram.model.keyword.Keyword r0 = r0.A01
            java.lang.String r1 = r0.A07
            java.lang.String r0 = "meta_ai_suggestion"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0053
            if (r7 == 0) goto L_0x0032
        L_0x0053:
            X.Mfz r2 = new X.Mfz
            r2.<init>()
            java.lang.String r0 = "null_state_popular_pill"
            r2.A09 = r0
            java.lang.String r1 = "POPULAR"
            r2.A08 = r1
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.0qQ.A07(r0)
            java.lang.String r0 = r1.toLowerCase(r0)
            X.0qQ.A07(r0)
            r2.A05 = r0
            r6.A02(r2, r3)
            goto L_0x0032
        L_0x0074:
            boolean r0 = r8.A0G
            if (r0 == 0) goto L_0x00b1
            X.92s r0 = r8.A0D
            java.util.List r0 = r0.A00()
            java.util.List r0 = X.C67393MnA.A01(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0086:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r3 = r4.next()
            X.Mfz r2 = new X.Mfz
            r2.<init>()
            java.lang.String r0 = "bootstrap"
            r2.A09 = r0
            java.lang.String r1 = ""
            r2.A08 = r1
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.0qQ.A07(r0)
            java.lang.String r0 = r1.toLowerCase(r0)
            X.0qQ.A07(r0)
            r2.A05 = r0
            r6.A02(r2, r3)
            goto L_0x0086
        L_0x00b1:
            X.TwG r1 = new X.TwG
            r1.<init>(r6)
            X.Tx9 r0 = r1.A00
            X.Trd r0 = r0.A01()
            X.0qQ.A0B(r0, r5)
            r8.A00 = r0
            X.MgL r0 = new X.MgL
            r0.<init>(r1, r5)
            r8.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TwE.A01():void");
    }

    public final void AJ9(C227762js r2, C231302rO r3, C238133Ar r4) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void AJA(C227762js r2, X46 x46) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D6y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(layoutInflater, viewGroup, R.layout.search_header, false);
        this.A04 = viewGroup2;
        String str = "headerView";
        if (viewGroup2 != null) {
            RecyclerView A0I = DbT.A0I(viewGroup2, R.id.hscroll_rv);
            this.A06 = A0I;
            if (A0I != null) {
                C14396TvP.A01(A0I);
                RecyclerView recyclerView = this.A06;
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.A0C);
                    ViewGroup viewGroup3 = this.A04;
                    if (viewGroup3 != null) {
                        RecyclerView A0I2 = DbT.A0I(viewGroup3, R.id.pinned_account_hscroll_rv);
                        this.A05 = A0I2;
                        str = "pinnedAccountHScrollView";
                        if (A0I2 != null) {
                            C14396TvP.A01(A0I2);
                            RecyclerView recyclerView2 = this.A05;
                            if (recyclerView2 != null) {
                                recyclerView2.setAdapter(this.A0B);
                                A01();
                                Parcelable parcelable = this.A03;
                                if (parcelable != null) {
                                    RecyclerView recyclerView3 = this.A06;
                                    if (recyclerView3 != null) {
                                        C252553pI r0 = recyclerView3.A0D;
                                        if (r0 != null) {
                                            r0.A1P(parcelable);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F("popularKeywordHScrollView");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EKZ() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (X.AnonymousClass7TE.A1b(r0.A01()) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.TwE r6) {
        /*
            X.X4Z r0 = r6.A08
            boolean r0 = r0.CYJ()
            r5 = 0
            if (r0 == 0) goto L_0x0022
            X.MgL r0 = r6.A09
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "recyclerDataSource"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0017:
            java.util.List r0 = r0.A01()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x006c
            X.92s r0 = r6.A0D
            java.util.List r0 = r0.A00()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x006c
            android.content.Context r1 = r6.A02
            r0 = 1118830592(0x42b00000, float:88.0)
            float r4 = X.0nA.A00(r1, r0)
        L_0x003b:
            X.TwZ r3 = r6.A01
            if (r3 == 0) goto L_0x006b
            if (r2 == 0) goto L_0x0052
            android.content.Context r2 = r6.A02
            r0 = 26
            float r1 = X.0nA.A04(r2, r0)
            r0 = 1101004800(0x41a00000, float:20.0)
            float r0 = X.0nA.A03(r2, r0)
            float r1 = r1 + r0
            float r1 = r1 + r4
            int r5 = (int) r1
        L_0x0052:
            X.TqX r0 = r3.A00
            X.TxA r0 = r0.A0F()
            androidx.recyclerview.widget.RecyclerView r3 = r0.A00
            if (r3 == 0) goto L_0x006b
            int r2 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r0 = r3.getPaddingBottom()
            r3.setPadding(r2, r5, r1, r0)
        L_0x006b:
            return
        L_0x006c:
            r4 = 0
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TwE.A00(X.TwE):void");
    }

    public final void A02() {
        String str = "pinnedAccountHScrollView";
        if (!this.A08.CYJ()) {
            RecyclerView recyclerView = this.A06;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            0qQ.A0F("popularKeywordHScrollView");
            throw AnonymousClass00P.createAndThrow();
        }
        C66987MgL mgL = this.A09;
        if (mgL == null) {
            str = "recyclerDataSource";
        } else {
            List A012 = mgL.A01();
            ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
            ArrayList arrayList = new ArrayList();
            for (Object next : A012) {
                0qQ.A0C(next, "null cannot be cast to non-null type com.instagram.search.common.recyclerview.model.SearchItemModel");
                if (next instanceof C67441Mnw) {
                    arrayList.add(next);
                }
            }
            viewModelListUpdate.A01(arrayList);
            if (viewModelListUpdate.A00.isEmpty()) {
                RecyclerView recyclerView2 = this.A06;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(8);
                }
                0qQ.A0F("popularKeywordHScrollView");
                throw AnonymousClass00P.createAndThrow();
            }
            this.A0C.A05(viewModelListUpdate);
            RecyclerView recyclerView3 = this.A06;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(0);
            }
            0qQ.A0F("popularKeywordHScrollView");
            throw AnonymousClass00P.createAndThrow();
            ViewModelListUpdate viewModelListUpdate2 = new ViewModelListUpdate();
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : A012) {
                0qQ.A0C(next2, "null cannot be cast to non-null type com.instagram.search.common.recyclerview.model.SearchItemModel");
                if (next2 instanceof C66974Mg7) {
                    arrayList2.add(next2);
                }
            }
            viewModelListUpdate2.A01(arrayList2);
            if (!viewModelListUpdate2.A00.isEmpty()) {
                this.A0B.A05(viewModelListUpdate2);
                RecyclerView recyclerView4 = this.A05;
                if (recyclerView4 != null) {
                    recyclerView4.setVisibility(0);
                    A00(this);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
        RecyclerView recyclerView5 = this.A05;
        if (recyclerView5 != null) {
            recyclerView5.setVisibility(8);
            A00(this);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r3) {
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null) {
            if (viewGroup.getParent() == null) {
                ViewGroup viewGroup2 = this.A04;
                if (viewGroup2 != null) {
                    r3.A7r(viewGroup2);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("headerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
    }

    public final void onPause() {
        RecyclerView recyclerView = this.A06;
        Parcelable parcelable = null;
        if (recyclerView == null) {
            0qQ.A0F("popularKeywordHScrollView");
            throw AnonymousClass00P.createAndThrow();
        }
        C252553pI r0 = recyclerView.A0D;
        if (r0 != null) {
            parcelable = r0.A1M();
        }
        this.A03 = parcelable;
    }

    public TwE(Context context, AnonymousClass2tC r6, UserSession userSession, X4Z x4z) {
        C51972G9s.A1C(userSession, x4z);
        this.A02 = context;
        this.A07 = userSession;
        this.A08 = x4z;
        this.A0C = r6.A00();
        UserSession userSession2 = this.A07;
        0Tu r3 = 0Tu.A05;
        this.A0G = 182.A06(r3, userSession2, 36321009413923856L);
        this.A0B = r6.A00();
        UserSession userSession3 = this.A07;
        0qQ.A0B(userSession3, 0);
        this.A0F = 182.A06(r3, userSession3, 36328044570360710L);
        this.A0A = AnonymousClass7TF.A0D();
    }

    public final String ArD() {
        throw AnonymousClass00P.createAndThrow();
    }
}
