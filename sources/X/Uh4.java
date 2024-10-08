package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.search.SearchController;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public final class Uh4 extends C252233om implements C337237fw, C74502Pvw, X8O {
    public boolean A00 = false;
    public final C18068Vku A01;
    public final SearchController A02;
    public final WeakReference A03;
    public final C17204VMi A04;
    public final C18783W1j A05;
    public final C15481UdW A06;
    public final C337257fy A07;
    public final WeakReference A08;
    public final WeakReference A09;

    public final boolean AFd() {
        return true;
    }

    public final void DRx() {
    }

    public final void DRz() {
    }

    public final void Dhf(SearchController searchController, boolean z) {
    }

    public final void Dht(String str, boolean z) {
    }

    public final void Dmq(SearchController searchController, Integer num, Integer num2) {
    }

    public final void Dqf() {
    }

    public final void Dqm() {
    }

    public Uh4(Context context, View view, AnonymousClass07i r24, C18068Vku vku, C17204VMi vMi, AnonymousClass0iw r27, UserSession userSession, String str) {
        Context context2 = context;
        this.A08 = new WeakReference(context2);
        C18068Vku vku2 = vku;
        this.A01 = vku2;
        this.A04 = vMi;
        View view2 = view;
        this.A09 = new WeakReference(view2.findViewById(R.id.main_container));
        AnonymousClass07i r13 = r24;
        AnonymousClass0iw r17 = r27;
        UserSession userSession2 = userSession;
        UserSession userSession3 = userSession2;
        C15441Ucr ucr = new C15441Ucr(context2, r13, vku2, this, this, r17, userSession3, str);
        this.A05 = ucr;
        C15481UdW udW = new C15481UdW(context2, ucr, r17, userSession3, (G6T) null, AnonymousClass05K.A1F);
        this.A06 = udW;
        C228602lw r14 = new C228602lw(context2, r13);
        C336297eO A002 = C336237eI.A00(new Lc6(0, this, userSession2), userSession2, r14, new AfG(0, this, userSession2), AnonymousClass000.A00(1183), (List) null, true);
        this.A07 = A002;
        A002.EcJ(this);
        this.A02 = new SearchController((Activity) context2, (ViewGroup) view2, udW, userSession2, (C249383je) null, this, -1, 0, false);
        View requireViewById = view2.requireViewById(R.id.search_box);
        this.A03 = new WeakReference(view2.findViewById(R.id.header));
        WB8.A00(requireViewById, 21, this);
    }

    public final void A00() {
        Dc2 dc2 = this.A04.A00.A04;
        if (dc2 != null) {
            DbX.A1R(dc2);
        }
        View view = (View) this.A03.get();
        if (view != null) {
            this.A02.A02(true, (float) view.getHeight());
            List list = this.A01.A00;
            if (!DbU.A0K(list).isEmpty()) {
                this.A06.A02((String) null, Collections.EMPTY_LIST, DbU.A0K(list), false);
            } else {
                this.A07.EhX("");
            }
        }
    }

    public final float Abo(SearchController searchController, Integer num) {
        View view = (View) this.A03.get();
        if (view != null) {
            return (float) view.getHeight();
        }
        return 0.0f;
    }

    public final boolean CYR() {
        return this.A00;
    }

    public final void CvL(SearchController searchController, Integer num, float f, float f2) {
        View view = (View) this.A03.get();
        Context context = (Context) this.A08.get();
        View view2 = (View) this.A09.get();
        if (view != null && context != null && view2 != null) {
            float height = f2 - ((float) view.getHeight());
            DbT.A0K((Activity) context).A0P.setTranslationY(height);
            view2.setTranslationY(height);
        }
    }

    public final void DDU() {
        C15325UaY uaY = this.A04.A00;
        C15691Ugw ugw = uaY.A01;
        if (ugw == null) {
            0qQ.A0F("listController");
            throw AnonymousClass00P.createAndThrow();
        }
        ugw.A02();
        C15325UaY.A00(uaY);
    }

    public final void Dhw(String str, String str2) {
        this.A07.EhX(str);
    }

    public final void onDestroyView() {
        this.A02.onDestroyView();
    }

    public final void onPause() {
        this.A05.A05(this.A06);
        this.A02.onPause();
    }

    public final void onResume() {
        this.A05.A06.add(new WeakReference(this.A06));
        this.A02.onResume();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.A02.onViewCreated(view, bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r6.isEmpty() == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r6.isEmpty() != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0.isEmpty() != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dam(X.C337257fy r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.BiY()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.isEmpty()
            r5 = 0
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r5 = 1
        L_0x000e:
            java.lang.Object r0 = r9.Bo1()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r0.iterator()
        L_0x001d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0047
            com.instagram.user.model.User r3 = X.DbT.A0k(r4)
            X.Vku r0 = r8.A01
            java.util.List r2 = r0.A01
            if (r3 == 0) goto L_0x0045
            r1 = 1
            X.Vj0 r0 = new X.Vj0
            r0.<init>(r3, r1)
        L_0x0033:
            boolean r1 = r2.contains(r0)
            if (r5 == 0) goto L_0x003c
            if (r1 == 0) goto L_0x003c
            goto L_0x001d
        L_0x003c:
            X.Vj0 r0 = new X.Vj0
            r0.<init>(r3, r1)
            r6.add(r0)
            goto L_0x001d
        L_0x0045:
            r0 = 0
            goto L_0x0033
        L_0x0047:
            if (r5 != 0) goto L_0x0056
            boolean r0 = r9.isLoading()
            if (r0 != 0) goto L_0x0056
            boolean r0 = r6.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x0060
        L_0x0056:
            r1 = 0
            if (r5 == 0) goto L_0x0060
            boolean r0 = r6.isEmpty()
            r2 = 1
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            X.UdW r3 = r8.A06
            boolean r7 = r9.isLoading()
            java.lang.String r5 = r9.BjE()
            r0 = 0
            r3.clear()
            r3.A00 = r0
            r4 = 1
            if (r1 == 0) goto L_0x0081
            java.lang.String r1 = r3.A0A
            X.Dez r0 = r3.A05
            r3.addModel(r1, r0)
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
        L_0x0081:
            if (r2 == 0) goto L_0x0098
            r0 = 2131956202(0x7f1311ea, float:1.9548953E38)
            X.DfA r2 = new X.DfA
            r2.<init>((int) r0)
            X.A5l r1 = r3.A03
            X.7fR r0 = r3.A04
            r3.addModel(r2, r1, r0)
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
        L_0x0098:
            X.C15481UdW.A00(r3, r5, r6)
            if (r7 == 0) goto L_0x00b6
            X.TwD r2 = r3.A07
            java.lang.String r1 = r3.A0B
            int r0 = r3.A02
            r2.A01 = r1
            r2.A00 = r0
            X.Viv r1 = r3.A08
            r1.A00 = r4
            X.EAC r0 = r3.A06
            r3.addModel(r2, r1, r0)
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
        L_0x00b6:
            r3.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Uh4.Dam(X.7fy):void");
    }
}
