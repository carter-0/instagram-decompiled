package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ugw  reason: case insensitive filesystem */
public final class C15691Ugw extends C252233om implements X8O, X7k, G6T, C238813Dn {
    public String A00;
    public List A01;
    public List A02;
    public boolean A03 = true;
    public boolean A04;
    public boolean A05 = false;
    public final AnonymousClass07i A06;
    public final C18068Vku A07;
    public final C17203VMh A08;
    public final C18783W1j A09;
    public final UserSession A0A;
    public final WeakReference A0B;
    public final C15481UdW A0C;
    public final WeakReference A0D;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.1qK, java.lang.Object] */
    public final void CtJ(C46448DfA dfA) {
        this.A03 = true;
        ImmutableList A002 = this.A07.A00();
        C15325UaY uaY = this.A08.A00;
        Context context = uaY.getContext();
        Context requireContext = uaY.requireContext();
        AnonymousClass0eM r4 = uaY.A0B;
        C46498Dg1 A003 = C46498Dg1.A00(requireContext, r4);
        A003.A08(uaY.getString(2131953167));
        A003.A0A(DbU.A0m(uaY, 2131971980), new WBH(70, (Object) A002, (Object) uaY));
        A003.A0C(DbU.A0m(uaY, 2131954722), C18882WAu.A00);
        if (context != null) {
            C13988Tno.A0r(context, A003);
        }
        C15325UaY.A00(uaY);
        DbX.A0R(r4).A00(new Object());
    }

    public final void Cxp() {
        this.A03 = false;
        Dc2 dc2 = this.A08.A00.A04;
        if (dc2 != null) {
            DbX.A1R(dc2);
        }
        A02();
    }

    public final void DNl(int i) {
    }

    public C15691Ugw(Context context, View view, AnonymousClass07i r20, LinearLayoutManager linearLayoutManager, C18068Vku vku, C17203VMh vMh, AnonymousClass0iw r24, UserSession userSession, String str) {
        Context context2 = context;
        this.A0B = new WeakReference(context2);
        UserSession userSession2 = userSession;
        this.A0A = userSession2;
        AnonymousClass07i r5 = r20;
        this.A06 = r5;
        this.A08 = vMh;
        C18068Vku vku2 = vku;
        this.A07 = vku2;
        this.A01 = new ArrayList();
        this.A02 = new ArrayList();
        AnonymousClass0iw r8 = r24;
        C18783W1j w1j = new C18783W1j(context2, r5, vku2, this, r8, userSession2, str);
        this.A09 = w1j;
        C15481UdW udW = new C15481UdW(context2, w1j, r8, userSession2, this, AnonymousClass05K.A1F);
        this.A0C = udW;
        udW.setHasStableIds(true);
        View view2 = view;
        RecyclerView A0K = DbX.A0K(view2);
        A0K.setLayoutManager(linearLayoutManager);
        A0K.setAdapter(udW);
        A0K.setClipToPadding(false);
        A0K.setItemAnimator((AnonymousClass3AS) null);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) view2.requireViewById(R.id.refreshable_container);
        refreshableNestedScrollingParent.A07 = this;
        C13990Tnq.A1O(refreshableNestedScrollingParent);
        this.A0D = new WeakReference(refreshableNestedScrollingParent);
    }

    public static void A00(C15691Ugw ugw) {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) ugw.A0D.get();
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        C15325UaY uaY = ugw.A08.A00;
        uaY.A06 = false;
        C15325UaY.A00(uaY);
    }

    public static void A01(C15691Ugw ugw) {
        Context context = (Context) ugw.A0B.get();
        if (context != null) {
            C59689JTv.A07(context, 2131952083);
            ugw.A0C.A01(context, new WB8((Object) ugw, 20), C320156rr.ERROR);
        }
    }

    public final void A02() {
        C15481UdW udW = this.A0C;
        C18068Vku vku = this.A07;
        udW.A02(this.A00, DbU.A0K(vku.A01), DbU.A0K(vku.A00), this.A05);
    }

    public final void A03(boolean z) {
        Context context = (Context) this.A0B.get();
        if (context != null) {
            this.A04 = true;
            if (z) {
                this.A0C.A01(context, (View.OnClickListener) null, C320156rr.LOADING);
            }
            AnonymousClass07i r3 = this.A06;
            1NY A0M = DbZ.A0M(this.A0A);
            A0M.A0A(AnonymousClass000.A00(3163));
            A0M.A0A = C273654mx.A00(695);
            A0M.A03();
            1OC A0S = DbU.A0S(A0M, C334247ax.class, C334257ay.class);
            C15621Ufn.A00(A0S, this, 26);
            1ES.A00(context, r3, A0S);
        }
    }

    public final boolean AFd() {
        return !this.A04;
    }

    public final boolean CYR() {
        return this.A05;
    }

    public final void DNk() {
        C15325UaY.A00(this.A08.A00);
    }

    public final void Dcp() {
        this.A08.A00.A06 = true;
        A03(false);
    }

    public final void Dqf() {
        Dc2 dc2 = this.A08.A00.A04;
        if (dc2 != null) {
            DbX.A1R(dc2);
        }
    }

    public final void Dqm() {
        Dc2 dc2 = this.A08.A00.A04;
        if (dc2 != null) {
            DbX.A1R(dc2);
        }
    }

    public final void onPause() {
        C18783W1j w1j = this.A09;
        w1j.A05(this.A0C);
        w1j.A05(this);
    }

    public final void onResume() {
        C18783W1j w1j = this.A09;
        C15481UdW udW = this.A0C;
        Set set = w1j.A06;
        set.add(new WeakReference(udW));
        set.add(new WeakReference(this));
    }
}
