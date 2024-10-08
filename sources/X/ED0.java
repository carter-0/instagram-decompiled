package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

public final class ED0 extends 1P0 {
    public final C47292DuL A00;
    public final C320106rm A01;
    public final /* synthetic */ C47523E6j A02;

    public ED0(C47523E6j e6j, C47292DuL duL, C320106rm r3) {
        this.A02 = e6j;
        this.A00 = duL;
        this.A01 = r3;
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(1194847889);
        C47523E6j e6j = this.A02;
        Dbc.A10(e6j, 16909819);
        C320106rm r1 = this.A01;
        r1.A0E("fetch_request_fail");
        r1.A00.A01();
        e6j.A09 = false;
        C59689JTv.A01(e6j.getContext(), "tabbed_explore_people_fail", 2131974929, 0);
        this.A00.A00.A01();
        AnonymousClass0fD.A0A(-277266383, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(976653673);
        C47523E6j e6j = this.A02;
        e6j.A0A = false;
        AnonymousClass3AD r0 = e6j.A03;
        if (r0 == null) {
            0qQ.A0F("pullToRefresh");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.setIsLoading(false);
        C46445Df7.A01(e6j, false);
        AnonymousClass0fD.A0A(-2108114577, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-73844127);
        this.A00.A00.A04();
        C47523E6j e6j = this.A02;
        e6j.A0A = true;
        AnonymousClass3AD r1 = e6j.A03;
        if (r1 == null) {
            0qQ.A0F("pullToRefresh");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.setIsLoading(!e6j.A09);
        AnonymousClass0fD.A0A(578984264, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int i;
        List A03;
        List list;
        List list2;
        int i2;
        Integer num;
        List list3;
        int A032 = AnonymousClass0fD.A03(1045354657);
        C46417Dee dee = (C46417Dee) obj;
        int A033 = AnonymousClass0fD.A03(-952825220);
        int i3 = 0;
        0qQ.A0B(dee, 0);
        C47523E6j e6j = this.A02;
        Dbc.A10(e6j, 16912446);
        C320106rm r1 = this.A01;
        r1.A0E("fetch_request_end");
        C46329Dbx.A00(r1);
        if (e6j.A0D && dee.CPt()) {
            FEJ.A02(e6j.requireContext(), dee.A00);
        }
        if (e6j.getScrollingViewProxy().CWN()) {
            ViewGroup A0F = DbV.A0F(e6j);
            0qQ.A0C(A0F, AnonymousClass000.A00(176));
            AdapterView adapterView = (AdapterView) A0F;
            if (e6j.mView != null && adapterView.getEmptyView() == null) {
                View inflate = LayoutInflater.from(e6j.getContext()).inflate(R.layout.recommended_user_empty, (ViewGroup) e6j.mView, false);
                adapterView.setEmptyView(inflate);
                ViewGroup viewGroup = (ViewGroup) e6j.mView;
                if (viewGroup != null) {
                    viewGroup.addView(inflate);
                }
            }
        } else if (e6j.mView != null && e6j.mEmptyView == null) {
            e6j.setEmptyViewForRecyclerView(LayoutInflater.from(e6j.getContext()).inflate(R.layout.recommended_user_empty, (ViewGroup) e6j.mView, false));
        }
        e6j.A07 = dee.A03;
        e6j.A0C = dee.A07;
        AnonymousClass3UH r11 = dee.A01;
        0qQ.A07(r11);
        AnonymousClass3UH r7 = dee.A02;
        0qQ.A07(r7);
        boolean z = true;
        if (!e6j.A0E || (list3 = r11.A0P) == null || !AnonymousClass7TE.A1b(list3)) {
            str = "";
            i = 0;
            r11.A0K = str;
        } else {
            String string = e6j.requireContext().getString(2131968311);
            i = 0;
            0qQ.A0B(string, 0);
            r11.A0K = string;
            str = e6j.requireContext().getString(2131952880);
        }
        0qQ.A0B(str, 0);
        r7.A0K = str;
        ArrayList A1L = 0sr.A1L(new AnonymousClass3UH[]{r11, r7});
        E9K e9k = e6j.A01;
        if (e9k == null) {
            0qQ.A0F("explorePeopleAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        if (dee.A05 || (num = e6j.A05) == AnonymousClass05K.A0j || num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0C) {
            z = false;
        }
        e9k.A08 = z;
        if (e6j.A09) {
            e9k.A05(A1L);
            e6j.A09 = false;
            if (AnonymousClass000.A00(1615).equals(e6j.A06)) {
                List list4 = r11.A0M;
                if (list4 != null) {
                    i3 = list4.size();
                }
                List list5 = r7.A0M;
                if (list5 != null) {
                    i2 = list5.size();
                } else {
                    i2 = 0;
                }
                if (i3 + i2 > 20) {
                    e6j.getScrollingViewProxy().Ejl(20);
                }
            }
        } else if (e6j.A0D) {
            e9k.A05(A1L);
            e6j.EKl();
            e6j.A0D = false;
        } else {
            ArrayList arrayList = e9k.A0G;
            int size = arrayList.size();
            while (i < size) {
                AnonymousClass3UH r12 = (AnonymousClass3UH) A1L.get(i);
                AnonymousClass3UH r2 = (AnonymousClass3UH) DbZ.A0g(arrayList, i);
                if (r2.A07() || r12.A07()) {
                    if (!r2.A08() && !r12.A08()) {
                        List list6 = r12.A0P;
                        if (!(list6 == null || (list = r2.A0P) == null)) {
                            list.addAll(list6);
                        }
                        A03 = r2.A03();
                    }
                    i++;
                } else {
                    List list7 = r12.A0M;
                    if (!(list7 == null || (list2 = r2.A0M) == null)) {
                        list2.addAll(list7);
                    }
                    A03 = r2.A0M;
                }
                E9K.A02(e9k, A03);
                i++;
            }
            e9k.A07 = true;
            E9K.A00(e9k);
        }
        C47292DuL duL = this.A00;
        C46329Dbx.A00(duL);
        C47523E6j.A01(duL.A00, e6j, r11);
        C47523E6j.A01(duL.A01, e6j, r7);
        AnonymousClass0fD.A0A(-28314865, A033);
        AnonymousClass0fD.A0A(1242244447, A032);
    }
}
