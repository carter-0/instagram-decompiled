package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Ubl  reason: case insensitive filesystem */
public final class C15386Ubl extends AnonymousClass32G implements C21048XBp {
    public static final String __redex_internal_original_name = "HighlightsMediaGridFragment";
    public C15461UdC A00;
    public UserSession A01;
    public int A02;
    public C227762js A03;
    public final C228172ku A04 = new C228172ku();

    public final void DW7() {
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(594);
    }

    public static void A01(C15386Ubl ubl, Reel reel) {
        C64184LSr.A00(ubl.A01).A07(reel);
        C15461UdC udC = ubl.A00;
        ArrayList arrayList = new ArrayList(new ArrayList(C64184LSr.A00(ubl.A01).A07.values()));
        UlS ulS = udC.A00;
        ulS.A04();
        udC.A02.clear();
        ulS.A0A(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            1Xj A0t = C51966G9m.A0t(it);
            udC.A03.put(Long.valueOf(A0t.A1A()), A0t);
        }
        udC.A0C();
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A01;
    }

    public final void DVy() {
        DbS.A1D(this);
    }

    public final void EKl() {
        0S7.A00(this);
        C17118VIo.A00(this.A04, this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-557114909);
        C15386Ubl.super.onCreate(bundle);
        this.A01 = DbX.A0U(this);
        C15461UdC udC = new C15461UdC(requireContext(), this, this, this.A01);
        this.A00 = udC;
        A0V(udC);
        String string = requireArguments().getString("edit_highlights_reel_id");
        Reel A0L = Dba.A0L(this.A01, string);
        if (A0L != null) {
            A01(this, A0L);
        } else {
            UserSession userSession = this.A01;
            0qQ.A0B(userSession, 0);
            AnonymousClass3PP A002 = AnonymousClass3PO.A00(userSession);
            C19478WaQ waQ = new C19478WaQ(string, this, 0);
            HashMap hashMap = new HashMap();
            A002.A00(AnonymousClass3BU.ON_TAP, waQ, string, AnonymousClass000.A00(594), hashMap);
        }
        this.A02 = C66582MXn.A01(requireContext());
        Context requireContext = requireContext();
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C227762js A003 = C227752jr.A00(requireContext, (Float) null, false);
        this.A03 = A003;
        this.A04.A01(A003);
        AnonymousClass0fD.A09(1733694971, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1130593271);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_feed);
        AnonymousClass0fD.A09(571127266, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(5672411);
        super.onDestroyView();
        C64184LSr A002 = C64184LSr.A00(this.A01);
        A002.A06.remove(this.A00);
        AnonymousClass0fD.A09(686907666, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1796964403);
        C15386Ubl.super.onPause();
        DbS.A1D(this);
        AnonymousClass0fD.A09(-1220706044, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A03.A06(this.A00, getScrollingViewProxy(), this.A02);
        C64184LSr A002 = C64184LSr.A00(this.A01);
        A002.A06.add(this.A00);
        Dbb.A0u(this);
    }
}
