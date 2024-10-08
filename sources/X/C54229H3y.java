package X;

import android.content.Context;
import android.view.View;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.H3y  reason: case insensitive filesystem */
public final class C54229H3y extends 2Ru implements C231272rL, C231302rO, ListAdapter, C231322rQ, AnonymousClass7Q7 {
    public H44 A00;
    public C231622ry A01;
    public C46450DfD A02;
    public boolean A03;
    public final C273674n0 A04;
    public final C231602rw A05;
    public final AnonymousClass4DU A06;
    public final Map A07 = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A08;
    public final Context A09;
    public final Fragment A0A;
    public final AnonymousClass2s2 A0B;
    public final AnonymousClass2s2 A0C;
    public final UserSession A0D;
    public final GTP A0E;
    public final C322186vO A0F;
    public final AnonymousClass71R A0G;
    public final C336947fR A0H;
    public final C229122ms A0I;
    public final C231762sK A0J;

    public static final void A00(C54229H3y h3y) {
        h3y.A03 = true;
        C273674n0 r6 = h3y.A04;
        r6.A08(h3y.A0F);
        h3y.clear();
        H44 h44 = h3y.A00;
        if (h44 != null) {
            h3y.addModel((Object) null, h44);
        }
        h3y.addModel((Object) null, h3y.A0C);
        int A032 = C51966G9m.A03(r6);
        for (int i = 0; i < A032; i++) {
            1Xj r3 = (1Xj) r6.A01.get(i);
            AnonymousClass3W1 BQr = h3y.BQr(r3);
            BQr.A0D(i);
            C231622ry r1 = h3y.A01;
            h3y.addModel(r3, BQr, (r1 == null || 2eO.A00(h3y.A09) || !r1.A03(r3)) ? h3y.A0E : r1);
        }
        h3y.addModel(h3y.A0I, h3y.A0J);
        h3y.updateListView();
    }

    public final /* synthetic */ void A8l(Object obj, int i) {
    }

    public final boolean AJe(String str) {
        0qQ.A0B(str, 0);
        C273674n0 r4 = this.A04;
        int A032 = C51966G9m.A03(r4);
        for (int i = 0; i < A032; i++) {
            User A2A = ((1Xj) r4.A01.get(i)).A2A(this.A0D);
            if (A2A != null && 0qQ.A0K(A2A.getId(), str)) {
                return true;
            }
        }
        return false;
    }

    public final AnonymousClass3W1 BQr(1Xj r6) {
        0qQ.A0B(r6, 0);
        Map map = this.A07;
        AnonymousClass3W1 r3 = (AnonymousClass3W1) map.get(r6.getId());
        if (r3 == null) {
            r3 = G9t.A18(r6);
            String id = r6.getId();
            if (id != null) {
                map.put(id, r3);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        UserSession userSession = this.A0D;
        if (1sd.A00(userSession).A00(r6) != -1) {
            AnonymousClass3WA r0 = AnonymousClass3WA.values()[1sd.A00(userSession).A00(r6)];
            0qQ.A0B(r0, 0);
            r3.A0m = r0;
        }
        return r3;
    }

    public final void Crn() {
        this.A03 = false;
    }

    public final void EU8(AnonymousClass310 r2) {
        0qQ.A0B(r2, 0);
        this.A0E.A03(r2);
        C231622ry r0 = this.A01;
        if (r0 != null) {
            r0.A02(r2);
        }
    }

    public final void EWg(AnonymousClass2xS r2) {
        0qQ.A0B(r2, 0);
        this.A0E.A03 = r2;
        C231622ry r0 = this.A01;
        if (r0 != null) {
            r0.A01 = r2;
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        AnonymousClass2u0 r0 = (AnonymousClass2u0) this.A08.getValue();
        if (r0 != null) {
            r0.A00 = recyclerView;
        }
    }

    public final void onBindViewHolder(AnonymousClass3MY r3, int i) {
        0qQ.A0B(r3, 0);
        AnonymousClass0eM r1 = this.A08;
        if (r1.getValue() != null) {
            0qQ.A06(r3.itemView);
            Set set = AnonymousClass2u0.A05;
        }
        C54229H3y.super.onBindViewHolder(r3, i);
        AnonymousClass2u0 r12 = (AnonymousClass2u0) r1.getValue();
        if (r12 != null) {
            View view = r3.itemView;
            0qQ.A06(view);
            r12.A01(view);
        }
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        AnonymousClass2u0 r1 = (AnonymousClass2u0) this.A08.getValue();
        if (r1 != null) {
            r1.A00 = null;
        }
    }

    public final void onViewRecycled(AnonymousClass3MY r2) {
        0qQ.A0B(r2, 0);
        C54229H3y.super.onViewRecycled(r2);
        if (this.A08.getValue() != null) {
            View view = r2.itemView;
            0qQ.A06(view);
            AnonymousClass2u0.A00(view);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.2s2, java.lang.Object] */
    public C54229H3y(Fragment fragment, FragmentActivity fragmentActivity, C229382nI r47, C322186vO r48, AnonymousClass2kR r49, AnonymousClass32J r50, AnonymousClass32K r51, G88 g88, AnonymousClass32Q r53, C229122ms r54, C249763kK r55, 0sP r56, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass32Q r9 = r53;
        0qQ.A0B(r9, 15);
        Fragment fragment2 = fragment;
        this.A0A = fragment2;
        this.A0F = r48;
        AnonymousClass2kR r5 = r49;
        UserSession userSession = r5.A01;
        this.A0D = userSession;
        AnonymousClass4DU r7 = r5.A02;
        this.A06 = r7;
        Context context = r5.A00;
        this.A09 = context;
        ? obj = new Object();
        this.A0C = obj;
        ? obj2 = new Object();
        this.A0B = obj2;
        this.A04 = new C273674n0((C324266yu) null, r9, AnonymousClass05K.A00);
        this.A0I = r54;
        this.A05 = new C231602rw(userSession);
        this.A08 = AnonymousClass0eN.A01(C58711IwK.A00(this, 47));
        int i2 = i;
        if (i != 0) {
            0sP r10 = r56;
            if (r56 != null) {
                this.A00 = new H44(i2, r10);
            }
        }
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0Pk r8 = 0Pl.A0n;
        C46450DfD dfD = null;
        C249763kK r22 = r55;
        boolean z5 = z3;
        C229382nI r14 = r47;
        boolean z6 = z2;
        boolean z7 = z;
        this.A01 = new C231622ry(fragmentActivity2, fragment2, (C249453jo) fragmentActivity2, r14, r5, r8.A00(context, userSession), r22, (String) null, z5, z7, z6);
        AnonymousClass2kR r18 = r5;
        GTP gtp = new GTP(fragmentActivity2, fragment2, r14, (0xF) null, (AnonymousClass57L) null, (AnonymousClass2oD) null, r18, (C243393Yp) null, r8.A00(context, userSession), (SearchContext) null, r22, AnonymousClass05K.A01, AnonymousClass05K.A0C, (String) null, z5, true, false, z7, z4, z6, false);
        this.A0E = gtp;
        C231762sK r82 = new C231762sK(context);
        this.A0J = r82;
        C336947fR r52 = new C336947fR(context);
        this.A0H = r52;
        G88 g882 = g88;
        if (g88 != null) {
            AnonymousClass32K r20 = r51;
            if (r51 != null) {
                dfD = new C46450DfD(context, r7, userSession, r20, g882, false, false, false);
            }
        }
        this.A02 = dfD;
        AnonymousClass71R r12 = new AnonymousClass71R(r7, userSession, (C267644bx) null, r50, r9, (String) null, (String) null);
        this.A0G = r12;
        ArrayList A1C = AnonymousClass7TE.A1C();
        H44 h44 = this.A00;
        if (h44 != null) {
            A1C.add(h44);
        }
        A1C.add(obj);
        C231622ry r0 = this.A01;
        if (r0 != null) {
            A1C.add(r0);
        }
        A1C.add(gtp);
        A1C.add(r82);
        C46450DfD dfD2 = this.A02;
        if (dfD2 != null) {
            A1C.add(dfD2);
        }
        C51970G9q.A1P(r52, r12, obj2, A1C);
        init(A1C);
    }

    public final boolean CRD() {
        return this.A03;
    }

    public final void EZ4(int i) {
        this.A0C.A03 = i;
        A00(this);
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final C232642u8 getLithoPrepareHelperCallback() {
        AnonymousClass2u0 r0 = (AnonymousClass2u0) this.A08.getValue();
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public final boolean isEmpty() {
        if (this.A04.A02() == 0) {
            return true;
        }
        return false;
    }

    public final void AV9() {
        A00(this);
    }

    public final /* synthetic */ List CBH() {
        return AnonymousClass7TE.A1C();
    }

    public final void FK4() {
        notifyDataSetChangedSmart();
    }

    public final /* synthetic */ int BJU(String str) {
        return -1;
    }

    public final void Cs9(1Xj r1) {
        notifyDataSetChanged();
    }

    public final /* synthetic */ Object EDl(int i) {
        return null;
    }
}
