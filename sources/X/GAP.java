package X;

import android.content.Context;
import android.view.View;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class GAP extends HDB implements ListAdapter, G72, AnonymousClass7Q7 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final Fragment A04;
    public final UserSession A05;
    public final AnonymousClass2s3 A06;
    public final AnonymousClass2kR A07;
    public final C231602rw A08;
    public final AnonymousClass4DU A09;
    public final SearchContext A0A;
    public final String A0B;
    public final ArrayList A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final AnonymousClass2s2 A0I;
    public final AnonymousClass2s2 A0J;
    public final C228162kt A0K;
    public final C322186vO A0L;
    public final 1sy A0M;
    public final 0rQ A0N;
    public final C232542tt A0O;
    public final C231902sb A0P;
    public final AnonymousClass57M A0Q;
    public final AnonymousClass71T A0R;
    public final C229122ms A0S;
    public final C231762sK A0T;
    public final String A0U;
    public final Map A0V = AnonymousClass7TE.A1E();
    public final boolean A0W;
    public final boolean A0X;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b3, code lost:
        if (r10 == false) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.GAP r12) {
        /*
            r0 = 1
            r12.A02 = r0
            X.2rX r7 = r12.A00
            X.2rW r7 = (X.AnonymousClass2rW) r7
            X.6vO r0 = r12.A0L
            r7.A08(r0)
            java.util.ArrayList r6 = r12.A0C
            r6.clear()
            r12.clear()
            X.2s2 r0 = r12.A0J
            r5 = 0
            r12.addModel(r5, r0)
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x0045
            X.2ms r0 = r12.A0S
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto L_0x0045
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0045
            X.72b r2 = new X.72b
            r2.<init>()
            X.6rr r1 = X.C320156rr.LOADING
            X.71T r0 = r12.A0R
            r12.addModel(r2, r1, r0)
        L_0x0038:
            boolean r0 = r12.A0W
            if (r0 == 0) goto L_0x0041
            X.2s2 r0 = r12.A0I
            r12.addModel(r5, r0)
        L_0x0041:
            r12.notifyDataSetChangedSmart()
            return
        L_0x0045:
            X.3Bb r0 = X.C238233Bb.A02
            X.0qQ.A07(r0)
            android.util.SparseArray r4 = r0.A00
            r4.clear()
            android.util.SparseArray r3 = r0.A01
            r3.clear()
            int r2 = X.C51966G9m.A03(r7)
            r1 = 0
        L_0x0059:
            if (r1 >= r2) goto L_0x00f2
            java.util.List r0 = r7.A01
            java.lang.Object r8 = r0.get(r1)
            X.1Xj r8 = (X.1Xj) r8
            java.util.List r0 = r7.A01
            java.lang.Object r0 = r0.get(r1)
            X.1Xj r0 = (X.1Xj) r0
            X.3W1 r9 = r12.BQr(r0)
            r9.A0D(r1)
            boolean r0 = r8.CcK()
            if (r0 == 0) goto L_0x0084
            X.Gmc r0 = r8.A0A
            if (r0 != 0) goto L_0x0084
            X.4ai r0 = X.C267004ai.AD
            r4.put(r1, r0)
            r3.put(r1, r0)
        L_0x0084:
            X.AnonymousClass4FX.A01(r8, r9)
            boolean r0 = r12.A0X
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = r12.A0U
            int r10 = X.C55090Hbz.A00(r8, r0)
            boolean r0 = r8.A56()
            if (r0 == 0) goto L_0x009d
            r9.A0B(r10)
            r9.A0A(r10)
        L_0x009d:
            X.0rQ r10 = r12.A0N
            X.4DU r0 = r12.A09
            r0.getModuleName()
            boolean r11 = r10.A05(r8)
            if (r11 == 0) goto L_0x00b5
            java.lang.String r0 = r0.getModuleName()
            boolean r10 = r10.A07(r0)
            r0 = 1
            if (r10 != 0) goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            java.lang.String r10 = "Required value was null."
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r12.A0H
            if (r0 != 0) goto L_0x00e5
            if (r11 == 0) goto L_0x00d8
            X.0eM r0 = r12.A0D
            java.lang.Object r0 = r0.getValue()
            X.2rz r0 = (X.C231632rz) r0
            if (r0 == 0) goto L_0x00fb
            int r0 = r12.addModel(r8, r9, r0)
        L_0x00ce:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x0059
        L_0x00d8:
            X.0eM r0 = r12.A0F
            java.lang.Object r0 = r0.getValue()
            X.2rz r0 = (X.C231632rz) r0
            int r0 = r12.addModel(r8, r9, r0)
            goto L_0x00ce
        L_0x00e5:
            X.1Xg r8 = X.1Xi.A01(r8)
            X.2s3 r0 = r12.A06
            if (r0 == 0) goto L_0x0100
            int r0 = r12.addModel(r8, r9, r0)
            goto L_0x00ce
        L_0x00f2:
            X.2ms r1 = r12.A0S
            X.2sK r0 = r12.A0T
            r12.addModel(r1, r0)
            goto L_0x0038
        L_0x00fb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0100:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAP.A00(X.GAP):void");
    }

    public final void AHs() {
    }

    public final AnonymousClass3W1 BQr(1Xj r8) {
        boolean z;
        C247733gp A1T;
        0qQ.A0B(r8, 0);
        Map map = this.A0V;
        AnonymousClass3W1 r4 = (AnonymousClass3W1) map.get(r8.getId());
        if (r4 == null) {
            r4 = new AnonymousClass3W1(r8.A0o(), r8.A4o());
            1sy r0 = this.A0M;
            if (r0 != null) {
                r4.A0o = r0;
            }
            if (!this.A01 || (!r8.A5a() && r8.A4K())) {
                z = false;
            } else {
                z = true;
            }
            r4.A37 = z;
            UserSession userSession = this.A05;
            if (AnonymousClass3WP.A08(userSession, r8)) {
                0qQ.A0B(userSession, 0);
                if (!182.A06(0Tu.A05, userSession, 2342165929888656048L) || r8.A1T() == null || ((A1T = r8.A1T()) != null && !A1T.A0h)) {
                    AnonymousClass3W9 r1 = AnonymousClass3W9.Translated;
                    0qQ.A0B(r1, 0);
                    r4.A3b.A00(r4, r1);
                }
            }
            String id = r8.getId();
            if (id != null) {
                map.put(id, r4);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return r4;
    }

    public final void Crn() {
        this.A02 = false;
    }

    public final void EU8(AnonymousClass310 r2) {
        0qQ.A0B(r2, 0);
        GTP gtp = (GTP) this.A0F.getValue();
        if (gtp != null) {
            gtp.A03(r2);
        }
        C231622ry r0 = (C231622ry) this.A0D.getValue();
        if (r0 != null) {
            r0.A02(r2);
        }
        AnonymousClass2s3 r02 = this.A06;
        if (r02 != null) {
            r02.A08(r2);
        }
    }

    public final void EWg(AnonymousClass2xS r2) {
        0qQ.A0B(r2, 0);
        GTP gtp = (GTP) this.A0F.getValue();
        if (gtp != null) {
            gtp.A03 = r2;
        }
        AnonymousClass2s3 r0 = this.A06;
        if (r0 != null) {
            r0.A03 = r2;
        }
        C231622ry r02 = (C231622ry) this.A0D.getValue();
        if (r02 != null) {
            r02.A01 = r2;
        }
    }

    public final void Em4(View view) {
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        AnonymousClass2u0 r0 = (AnonymousClass2u0) this.A0E.getValue();
        if (r0 != null) {
            r0.A00 = recyclerView;
        }
    }

    public final void onBindViewHolder(AnonymousClass3MY r3, int i) {
        0qQ.A0B(r3, 0);
        AnonymousClass0eM r1 = this.A0E;
        if (r1.getValue() != null) {
            0qQ.A06(r3.itemView);
            Set set = AnonymousClass2u0.A05;
        }
        GAP.super.onBindViewHolder(r3, i);
        AnonymousClass2u0 r12 = (AnonymousClass2u0) r1.getValue();
        if (r12 != null) {
            View view = r3.itemView;
            0qQ.A06(view);
            r12.A01(view);
        }
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        AnonymousClass2u0 r1 = (AnonymousClass2u0) this.A0E.getValue();
        if (r1 != null) {
            r1.A00 = null;
        }
    }

    public final void onViewRecycled(AnonymousClass3MY r2) {
        0qQ.A0B(r2, 0);
        GAP.super.onViewRecycled(r2);
        if (this.A0E.getValue() != null) {
            View view = r2.itemView;
            0qQ.A06(view);
            AnonymousClass2u0.A00(view);
        }
    }

    public final List BQW() {
        return ((AnonymousClass2rW) this.A00).A01;
    }

    public final boolean CRD() {
        return this.A02;
    }

    public final void Cs9(1Xj r2) {
        if (r2 != null && DbX.A1a(r2.A0C.BBA())) {
            notifyItemChanged(r2);
        }
        A00(this);
    }

    public final void EZ4(int i) {
        this.A0J.A03 = i;
        A00(this);
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final C232642u8 getLithoPrepareHelperCallback() {
        AnonymousClass2u0 r0 = (AnonymousClass2u0) this.A0E.getValue();
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public final boolean isEmpty() {
        if (((AnonymousClass2rW) this.A00).A02() == 0) {
            return true;
        }
        return false;
    }

    public final void AV9() {
        A00(this);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x00a2, code lost:
        if (r45 != false) goto L_0x00a4;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GAP(androidx.fragment.app.Fragment r24, androidx.fragment.app.FragmentActivity r25, X.C229382nI r26, X.AnonymousClass2s3 r27, X.C228162kt r28, X.C322186vO r29, X.AnonymousClass2kR r30, X.1sy r31, X.AnonymousClass57M r32, com.instagram.search.common.analytics.SearchContext r33, X.AnonymousClass32Q r34, X.C229122ms r35, X.C249763kK r36, java.lang.Integer r37, java.lang.String r38, java.lang.String r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47) {
        /*
            r23 = this;
            r0 = r27
            r9 = 0
            r1 = 13
            r2 = r34
            r4 = r28
            X.C51969G9p.A1R(r2, r1, r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.4n0 r3 = new X.4n0
            r3.<init>(r9, r2, r1)
            r12 = r30
            android.content.Context r8 = r12.A00
            com.instagram.common.session.UserSession r7 = r12.A01
            X.4DU r6 = r12.A02
            r5 = 0
            X.IWJ r2 = new X.IWJ
            r2.<init>(r5)
            X.2lZ r1 = new X.2lZ
            r1.<init>(r8, r6, r7, r2)
            r2 = r43
            r10 = r42
            r11 = r23
            r11.<init>(r1, r3, r2, r10)
            r1 = r24
            r11.A04 = r1
            r11.A06 = r0
            r1 = r29
            r11.A0L = r1
            r1 = r31
            r11.A0M = r1
            r1 = r35
            r11.A0S = r1
            r11.A07 = r12
            r11.A0K = r4
            r11.A0G = r10
            r1 = r38
            r11.A0B = r1
            r2 = r46
            r11.A0W = r2
            r1 = r47
            r11.A0X = r1
            r1 = r39
            r11.A0U = r1
            r1 = r33
            r11.A0A = r1
            r12 = r32
            r11.A0Q = r12
            r11.A03 = r8
            r11.A05 = r7
            r11.A09 = r6
            X.0rQ r1 = X.C231512rn.A00(r7)
            r11.A0N = r1
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            r11.A0V = r1
            X.2s2 r4 = new X.2s2
            r4.<init>()
            r11.A0J = r4
            if (r46 == 0) goto L_0x015d
            X.2s2 r3 = new X.2s2
            r3.<init>()
            android.content.res.Resources r2 = r8.getResources()
            r1 = 2131165354(0x7f0700aa, float:1.7944923E38)
            int r1 = r2.getDimensionPixelSize(r1)
            r3.A03 = r1
        L_0x008c:
            r11.A0I = r3
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r11.A0C = r1
            X.0Tu r13 = X.0Tu.A05
            r1 = 36319626434584103(0x81088200021e27, double:3.0320162324034505E-306)
            boolean r1 = X.182.A06(r13, r7, r1)
            if (r1 != 0) goto L_0x00a4
            r1 = 0
            if (r45 == 0) goto L_0x00a5
        L_0x00a4:
            r1 = 1
        L_0x00a5:
            r11.A0H = r1
            X.GUT r13 = new X.GUT
            r15 = r26
            r14 = r25
            r21 = r44
            r20 = r41
            r19 = r40
            r18 = r37
            r16 = r36
            r17 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            X.0t0 r2 = X.AnonymousClass0eN.A01(r13)
            r11.A0F = r2
            r18 = 9
            X.IoB r17 = new X.IoB
            r19 = r14
            r20 = r11
            r21 = r15
            r22 = r16
            r17.<init>(r18, r19, r20, r21, r22)
            X.0t0 r2 = X.AnonymousClass0eN.A01(r17)
            r11.A0D = r2
            X.2sK r13 = new X.2sK
            r13.<init>((android.content.Context) r8, (X.AnonymousClass57M) r12)
            r11.A0T = r13
            X.2sb r12 = new X.2sb
            r12.<init>(r8, r6, r7, r9)
            r11.A0P = r12
            X.71T r9 = new X.71T
            r9.<init>(r8)
            r11.A0R = r9
            X.2tt r2 = new X.2tt
            r2.<init>(r8, r7)
            r11.A0O = r2
            X.2rw r8 = new X.2rw
            r8.<init>(r7)
            r11.A08 = r8
            X.0eO r14 = X.0eO.A02
            X.Wvo r8 = new X.Wvo
            r8.<init>(r11, r5)
            X.0eM r5 = X.AnonymousClass0eN.A00(r14, r8)
            r11.A0E = r5
            if (r42 == 0) goto L_0x0110
            r11.enableItemIdFromBinderGroup()
            r5 = 1
            r11.setHasStableIds(r5)
        L_0x0110:
            X.2rX r8 = r11.A00
            X.2rW r8 = (X.AnonymousClass2rW) r8
            X.GUS r5 = new X.GUS
            r5.<init>(r11)
            r8.A00 = r5
            X.0rQ r7 = X.C231512rn.A00(r7)
            java.lang.String r5 = r6.getModuleName()
            boolean r5 = r7.A07(r5)
            r5 = r5 ^ 1
            if (r1 == 0) goto L_0x0156
            r1 = r0
        L_0x012c:
            X.2rz r1 = (X.C231632rz) r1
            if (r5 == 0) goto L_0x0136
            X.0eM r0 = r11.A0D
            java.lang.Object r0 = r0.getValue()
        L_0x0136:
            X.2rz r0 = (X.C231632rz) r0
            r14 = r4
            r15 = r1
            r16 = r12
            r17 = r13
            r18 = r9
            r19 = r0
            r20 = r2
            r21 = r3
            X.2rz[] r0 = new X.C231632rz[]{r14, r15, r16, r17, r18, r19, r20, r21}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            java.util.List r0 = X.00k.A0X(r0)
            r11.init(r0)
            return
        L_0x0156:
            X.0eM r1 = r11.A0F
            java.lang.Object r1 = r1.getValue()
            goto L_0x012c
        L_0x015d:
            r3 = 0
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAP.<init>(androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity, X.2nI, X.2s3, X.2kt, X.6vO, X.2kR, X.1sy, X.57M, com.instagram.search.common.analytics.SearchContext, X.32Q, X.2ms, X.3kK, java.lang.Integer, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
