package X;

import android.content.Context;
import android.view.View;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.GcJ  reason: case insensitive filesystem */
public final class C52766GcJ extends HDB implements ListAdapter, G72, AnonymousClass7Q7, C231342rT {
    public View A00;
    public C54620HLd A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final AnonymousClass2s3 A06;
    public final AnonymousClass2u0 A07;
    public final AnonymousClass4DU A08;
    public final List A09 = AnonymousClass7TE.A1C();
    public final Map A0A = AnonymousClass7TE.A1E();
    public final Map A0B = AnonymousClass7TE.A1E();
    public final Set A0C = AnonymousClass7TE.A1F();
    public final Set A0D = AnonymousClass7TE.A1F();
    public final Context A0E;
    public final AnonymousClass2s2 A0F;
    public final C231622ry A0G;
    public final C232462tl A0H;
    public final 1sy A0I;
    public final C232392td A0J;
    public final H43 A0K;
    public final C231842sV A0L;
    public final AnonymousClass71T A0M;
    public final C229122ms A0N;
    public final C231762sK A0O;
    public final AnonymousClass3VN A0P;
    public final HashSet A0Q = AnonymousClass7TE.A1F();

    /* JADX WARNING: type inference failed for: r7v0, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.2td, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52766GcJ(androidx.fragment.app.Fragment r27, androidx.fragment.app.FragmentActivity r28, X.C229382nI r29, X.AnonymousClass2s3 r30, X.AnonymousClass2kR r31, X.C230772qF r32, X.1sy r33, X.C229782oC r34, X.C230792qH r35, X.C229122ms r36, X.C249763kK r37, X.AnonymousClass3VN r38) {
        /*
            r26 = this;
            r2 = 1
            r3 = r31
            com.instagram.common.session.UserSession r11 = r3.A01
            X.2rV r4 = new X.2rV
            r4.<init>(r11)
            android.content.Context r10 = r3.A00
            X.4DU r5 = r3.A02
            X.2lX r1 = new X.2lX
            r1.<init>()
            X.2lZ r0 = new X.2lZ
            r0.<init>(r10, r5, r11, r1)
            r9 = r26
            r9.<init>(r0, r4, r2, r2)
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r9.A0B = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r9.A0A = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r9.A09 = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r9.A0Q = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r9.A0C = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r9.A0D = r0
            r9.enableItemIdFromBinderGroup()
            r9.setHasStableIds(r2)
            r9.A05 = r11
            r9.A08 = r5
            r9.A0E = r10
            r0 = r33
            r9.A0I = r0
            r0 = r36
            r9.A0N = r0
            r0 = r38
            r9.A0P = r0
            X.2rX r1 = r9.A00
            X.2rW r1 = (X.AnonymousClass2rW) r1
            X.ISf r0 = new X.ISf
            r0.<init>(r9)
            r1.A00 = r0
            X.2rw r4 = new X.2rw
            r4.<init>(r11)
            java.lang.String r1 = r5.getModuleName()
            r0 = 48
            X.IwK r0 = X.C58711IwK.A00(r9, r0)
            X.2u0 r0 = r4.A00(r1, r0)
            r9.A07 = r0
            X.2s2 r7 = new X.2s2
            r7.<init>()
            r9.A0F = r7
            X.2sb r6 = new X.2sb
            r0 = r35
            r6.<init>(r10, r5, r11, r0)
            r8 = r30
            r9.A06 = r8
            X.0rQ r1 = X.C231512rn.A00(r11)
            java.lang.String r0 = r5.getModuleName()
            boolean r0 = r1.A07(r0)
            r5 = 0
            r15 = r28
            if (r0 == 0) goto L_0x00f4
            r14 = r5
        L_0x009d:
            r9.A0G = r14
            X.2sK r13 = new X.2sK
            r13.<init>(r10)
            r9.A0O = r13
            X.71T r12 = new X.71T
            r12.<init>(r10)
            r9.A0M = r12
            X.2sV r4 = new X.2sV
            r4.<init>(r15, r11)
            r9.A0L = r4
            r0 = r32
            if (r32 == 0) goto L_0x00bd
            X.2tl r5 = new X.2tl
            r5.<init>(r10, r11, r0)
        L_0x00bd:
            r9.A0H = r5
            X.2td r3 = new X.2td
            r3.<init>()
            r9.A0J = r3
            r0 = r34
            r3.A00 = r0
            X.2tt r2 = new X.2tt
            r2.<init>(r10, r11)
            X.H43 r1 = new X.H43
            r1.<init>(r10)
            r9.A0K = r1
            java.util.ArrayList r0 = X.DbV.A14(r7)
            r0.add(r8)
            if (r14 == 0) goto L_0x00e2
            r0.add(r14)
        L_0x00e2:
            X.C51970G9q.A1P(r6, r13, r12, r0)
            if (r5 == 0) goto L_0x00ea
            r0.add(r5)
        L_0x00ea:
            X.C51970G9q.A1P(r3, r1, r2, r0)
            r0.add(r4)
            r9.init(r0)
            return
        L_0x00f4:
            X.2ry r14 = new X.2ry
            r1 = r15
            X.3jo r1 = (X.C249453jo) r1
            X.0Pk r0 = X.0Pl.A0n
            X.0Pl r20 = r0.A00(r10, r11)
            r24 = 0
            r16 = r27
            r18 = r29
            r21 = r37
            r22 = r5
            r23 = r2
            r25 = r24
            r17 = r1
            r19 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52766GcJ.<init>(androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity, X.2nI, X.2s3, X.2kR, X.2qF, X.1sy, X.2oC, X.2qH, X.2ms, X.3kK, X.3VN):void");
    }

    public final void AHs() {
        this.A00 = null;
    }

    public final AnonymousClass3W1 BQr(1Xj r5) {
        boolean z;
        0qQ.A0B(r5, 0);
        Map map = this.A0B;
        AnonymousClass3W1 r2 = (AnonymousClass3W1) map.get(r5.getId());
        if (r2 == null) {
            r2 = new AnonymousClass3W1(r5.A0o(), r5.A4o());
            1sy r0 = this.A0I;
            if (r0 != null) {
                r2.A0o = r0;
            }
            if (!this.A03 || (!r5.A5a() && r5.A4K())) {
                z = false;
            } else {
                z = true;
            }
            r2.A37 = z;
            String id = r5.getId();
            if (id != null) {
                map.put(id, r2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return r2;
    }

    public final void Crn() {
        this.A04 = false;
    }

    public final void EU8(AnonymousClass310 r2) {
        0qQ.A0B(r2, 0);
        AnonymousClass2s3 r0 = this.A06;
        if (r0 != null) {
            r0.A08(r2);
        }
        C231622ry r02 = this.A0G;
        if (r02 != null) {
            r02.A02(r2);
        }
    }

    public final void EWg(AnonymousClass2xS r2) {
        0qQ.A0B(r2, 0);
        AnonymousClass2s3 r0 = this.A06;
        if (r0 != null) {
            r0.A03 = r2;
        }
        C231622ry r02 = this.A0G;
        if (r02 != null) {
            r02.A01 = r2;
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        AnonymousClass2u0 r0 = this.A07;
        if (r0 != null) {
            r0.A00 = recyclerView;
        }
    }

    public final void onBindViewHolder(AnonymousClass3MY r3, int i) {
        0qQ.A0B(r3, 0);
        AnonymousClass2u0 r1 = this.A07;
        if (r1 != null) {
            0qQ.A06(r3.itemView);
            Set set = AnonymousClass2u0.A05;
        }
        C52766GcJ.super.onBindViewHolder(r3, i);
        if (r1 != null) {
            View view = r3.itemView;
            0qQ.A06(view);
            r1.A01(view);
        }
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        AnonymousClass2u0 r1 = this.A07;
        if (r1 != null) {
            r1.A00 = null;
        }
    }

    public final void onViewRecycled(AnonymousClass3MY r2) {
        0qQ.A0B(r2, 0);
        C52766GcJ.super.onViewRecycled(r2);
        if (this.A07 != null) {
            View view = r2.itemView;
            0qQ.A06(view);
            AnonymousClass2u0.A00(view);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c1, code lost:
        r8 = r8 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C52766GcJ r19) {
        /*
            r2 = r19
            java.util.List r0 = r2.A09
            r19 = r0
            r19.clear()
            java.util.HashSet r5 = r2.A0Q
            r5.clear()
            java.util.Set r0 = r2.A0C
            r18 = r0
            r18.clear()
            java.util.Set r0 = r2.A0D
            r0.clear()
            r6 = 1
            r2.A04 = r6
            X.2rX r4 = r2.A00
            X.2rW r4 = (X.AnonymousClass2rW) r4
            X.3VN r0 = r2.A0P
            r4.A08(r0)
            r2.clear()
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x004b
            X.2ms r0 = r2.A0N
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto L_0x004b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x004b
            X.72b r3 = new X.72b
            r3.<init>()
            X.6rr r1 = X.C320156rr.LOADING
            X.71T r0 = r2.A0M
        L_0x0044:
            r2.addModel(r3, r1, r0)
        L_0x0047:
            r2.notifyDataSetChangedSmart()
            return
        L_0x004b:
            X.2s2 r0 = r2.A0F
            r3 = 0
            r2.addModel(r3, r0)
            android.view.View r0 = r2.A00
            if (r0 == 0) goto L_0x006e
            com.instagram.common.session.UserSession r8 = r2.A05
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318857635306003(0x8107cf00001a13, double:3.031530040644274E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x006e
            X.3Ba r1 = new X.3Ba
            r1.<init>(r2)
            X.2sV r0 = r2.A0L
            r2.addModel(r1, r0)
        L_0x006e:
            int r17 = X.C51966G9m.A03(r4)
            r8 = 0
            r7 = 0
        L_0x0074:
            r0 = r17
            if (r8 >= r0) goto L_0x0157
            java.util.List r0 = r4.A01
            java.lang.Object r10 = r0.get(r8)
            X.1Xg r10 = (X.1Xg) r10
            X.1UQ r0 = r10.A06
            int r0 = r0.ordinal()
            r16 = -1
            switch(r0) {
                case 1: goto L_0x00cb;
                case 13: goto L_0x00cb;
                case 29: goto L_0x00fa;
                case 30: goto L_0x00fa;
                case 31: goto L_0x00fa;
                case 43: goto L_0x00c1;
                case 45: goto L_0x0148;
                default: goto L_0x008b;
            }
        L_0x008b:
            X.1Xn r0 = r10.A05
            X.1Xj r11 = X.1Xi.A02(r0)
            if (r11 == 0) goto L_0x0157
            X.3W1 r9 = r2.BQr(r11)
            r9.A0D(r7)
            X.2ry r1 = r2.A0G
            if (r1 == 0) goto L_0x00c4
            boolean r0 = r1.A03(r11)
            if (r0 != r6) goto L_0x00c4
            int r9 = r2.addModel(r11, r9, r1)
        L_0x00a8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r5.add(r0)
            r11.A3r()
        L_0x00b2:
            int r7 = r7 + 1
            r0 = r16
            if (r9 == r0) goto L_0x00c1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0 = r19
            r0.add(r1)
        L_0x00c1:
            int r8 = r8 + 1
            goto L_0x0074
        L_0x00c4:
            X.2s3 r0 = r2.A06
            int r9 = r2.addModel(r10, r9, r0)
            goto L_0x00a8
        L_0x00cb:
            X.1Xn r0 = r10.A05
            X.1Xj r11 = X.1Xi.A02(r0)
            if (r11 == 0) goto L_0x0157
            X.3W1 r9 = r2.BQr(r11)
            r9.A0D(r7)
            X.2ry r1 = r2.A0G
            if (r1 == 0) goto L_0x00f3
            boolean r0 = r1.A03(r11)
            if (r0 != r6) goto L_0x00f3
            int r9 = r2.addModel(r11, r9, r1)
        L_0x00e8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r5.add(r0)
            r11.A3r()
            goto L_0x00b2
        L_0x00f3:
            X.2s3 r0 = r2.A06
            int r9 = r2.addModel(r10, r9, r0)
            goto L_0x00e8
        L_0x00fa:
            X.1Xn r14 = r10.A05
            java.lang.String r13 = "null cannot be cast to non-null type com.instagram.feed.feeditem.EndOfFeedDemarcatorUnit"
            X.0qQ.A0C(r14, r13)
            r12 = r14
            X.1sU r12 = (X.1sU) r12
            com.instagram.api.schemas.DemarcatorStyleEnum r1 = r12.A03
            com.instagram.api.schemas.DemarcatorStyleEnum r0 = com.instagram.api.schemas.DemarcatorStyleEnum.ON_TOP_V1
            if (r1 == r0) goto L_0x00c1
            X.0qQ.A0C(r14, r13)
            java.util.Map r11 = r2.A0A
            X.4ZE r0 = r12.A04
            java.lang.String r10 = r0.A0B
            java.lang.Object r9 = r11.get(r10)
            X.523 r9 = (X.AnonymousClass523) r9
            if (r9 != 0) goto L_0x012f
            r0 = 500(0x1f4, double:2.47E-321)
            com.instagram.common.session.UserSession r15 = r2.A05
            X.523 r9 = new X.523
            r9.<init>(r15, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.A00 = r0
            if (r10 != 0) goto L_0x012c
            java.lang.String r10 = ""
        L_0x012c:
            r11.put(r10, r9)
        L_0x012f:
            r9.A01(r7)
            X.0qQ.A0C(r14, r13)
            X.2td r0 = r2.A0J
            int r9 = r2.addModel(r12, r9, r0)
            if (r9 == 0) goto L_0x00b2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0 = r18
            r0.add(r1)
            goto L_0x00b2
        L_0x0148:
            X.1Xn r1 = r10.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.SimpleBannerItem"
            X.0qQ.A0C(r1, r0)
            X.H43 r0 = r2.A0K
            int r9 = r2.addModel(r1, r3, r0)
            goto L_0x00b2
        L_0x0157:
            if (r7 != 0) goto L_0x0163
            X.HLd r1 = r2.A01
            if (r1 == 0) goto L_0x0163
            X.2tl r0 = r2.A0H
            if (r0 == 0) goto L_0x0163
            goto L_0x0044
        L_0x0163:
            X.2ms r1 = r2.A0N
            X.2sK r0 = r2.A0O
            r2.addModel(r1, r0)
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52766GcJ.A00(X.GcJ):void");
    }

    public final View C02() {
        return this.A00;
    }

    public final boolean CRD() {
        return this.A04;
    }

    public final void EZ4(int i) {
        this.A0F.A03 = i;
        A00(this);
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final C232642u8 getLithoPrepareHelperCallback() {
        AnonymousClass2u0 r0 = this.A07;
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

    public final List BQW() {
        return 1Xi.A03(A03());
    }

    public final void Cs9(1Xj r1) {
        A00(this);
    }

    public final void Em4(View view) {
        this.A00 = view;
    }
}
