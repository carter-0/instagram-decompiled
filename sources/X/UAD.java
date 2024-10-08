package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class UAD extends 2Rw {
    public List A00 = new ArrayList();
    public final C17325VRe A01;
    public final C17768Vff A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final List A06 = new ArrayList();
    public final List A07 = new ArrayList();
    public final List A08 = new ArrayList();
    public final AnonymousClass0eM A09 = C20694WxQ.A00(this, 26);
    public final Context A0A;
    public final VAX A0B = new Object();
    public final VAZ A0C = new Object();

    /* JADX WARNING: type inference failed for: r0v5, types: [X.VAX, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.VAZ, java.lang.Object] */
    public UAD(Context context, C17325VRe vRe, C17768Vff vff, UserSession userSession, String str, String str2) {
        DbW.A1N(userSession, 1, vff);
        this.A03 = userSession;
        this.A04 = str;
        this.A0A = context;
        this.A05 = str2;
        this.A02 = vff;
        this.A01 = vRe;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.UCX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.UCY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.UCX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.UCX} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00de, code lost:
        X.WBH.A01(r1, r0, r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e2, code lost:
        X.0qQ.A0F("interest");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00eb, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00fe, code lost:
        r5.A00.setText(X.AnonymousClass7TE.A16(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0107, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006c, code lost:
        X.AnonymousClass0fU.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0086, code lost:
        r2.setText(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r5, int r6) {
        /*
            r4 = this;
            r3 = 0
            int r0 = X.JTP.A07(r4, r5, r3, r6)
            switch(r0) {
                case 0: goto L_0x00ec;
                case 1: goto L_0x00be;
                case 2: goto L_0x00ab;
                case 3: goto L_0x008a;
                case 4: goto L_0x0070;
                case 5: goto L_0x004a;
                case 6: goto L_0x0027;
                case 7: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return
        L_0x0009:
            X.UCU r5 = (X.UCU) r5
            java.util.List r0 = r4.A07
            java.lang.Object r3 = r0.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.viewitem.PromoteHeaderWithSubHeaderRowViewItem"
            X.0qQ.A0C(r3, r0)
            X.VRg r3 = (X.C17327VRg) r3
            X.AnonymousClass7TF.A1H(r5, r3)
            android.widget.TextView r1 = r5.A00
            java.lang.String r0 = r3.A00
            r1.setText(r0)
            android.widget.TextView r2 = r5.A01
            java.lang.String r0 = r3.A01
            goto L_0x0086
        L_0x0027:
            X.UD1 r5 = (X.UD1) r5
            java.util.List r0 = r4.A07
            java.lang.Object r2 = r0.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.viewitem.PromoteLabelWithCircleIconViewItem"
            X.0qQ.A0C(r2, r0)
            X.VRi r2 = (X.C17329VRi) r2
            X.AnonymousClass7TF.A1H(r5, r2)
            android.widget.TextView r1 = r5.A02
            java.lang.String r0 = r2.A01
            r1.setText(r0)
            android.widget.ImageView r0 = r5.A01
            r0.setVisibility(r3)
            android.view.View$OnClickListener r1 = r2.A00
            android.view.View r0 = r5.A00
            goto L_0x006c
        L_0x004a:
            X.UD0 r5 = (X.UD0) r5
            java.util.List r0 = r4.A07
            java.lang.Object r2 = r0.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.viewitem.PromoteLabelWithCircleCheckFilledIconViewItem"
            X.0qQ.A0C(r2, r0)
            X.VRh r2 = (X.C17328VRh) r2
            X.AnonymousClass7TF.A1H(r5, r2)
            android.widget.TextView r1 = r5.A02
            java.lang.String r0 = r2.A01
            r1.setText(r0)
            android.widget.ImageView r0 = r5.A01
            r0.setVisibility(r3)
            android.view.View$OnClickListener r1 = r2.A00
            android.view.View r0 = r5.A00
        L_0x006c:
            X.AnonymousClass0fU.A00(r1, r0)
            return
        L_0x0070:
            X.UBi r5 = (X.C14829UBi) r5
            java.util.List r0 = r4.A07
            java.lang.Object r1 = r0.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.viewitem.PromoteHeaderRowViewItem"
            X.0qQ.A0C(r1, r0)
            X.VMX r1 = (X.VMX) r1
            X.AnonymousClass7TF.A1H(r5, r1)
            android.widget.TextView r2 = r5.A00
            java.lang.String r0 = r1.A00
        L_0x0086:
            r2.setText(r0)
            return
        L_0x008a:
            java.util.List r0 = r4.A07
            java.lang.Object r1 = r0.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.model.SuggestedInterestRowItem"
            X.0qQ.A0C(r1, r0)
            com.instagram.business.promote.model.SuggestedInterestRowItem r1 = (com.instagram.business.promote.model.SuggestedInterestRowItem) r1
            X.UCY r5 = (X.UCY) r5
            com.instagram.business.promote.model.AudienceInterest r2 = r1.A00
            if (r2 == 0) goto L_0x00e2
            android.widget.TextView r1 = r5.A00
            java.lang.String r0 = r2.A01()
            r1.setText(r0)
            android.view.View r1 = r5.itemView
            r0 = 49
            goto L_0x00de
        L_0x00ab:
            java.util.List r0 = r4.A07
            java.lang.Object r1 = r0.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.model.SuggestedInterestHeaderRowItem"
            X.0qQ.A0C(r1, r0)
            X.UBj r5 = (X.C14830UBj) r5
            android.content.Context r1 = r4.A0A
            r0 = 2131970345(0x7f134929, float:1.9577638E38)
            goto L_0x00fe
        L_0x00be:
            java.util.List r0 = r4.A07
            java.lang.Object r1 = r0.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.model.SelectedInterestRowItem"
            X.0qQ.A0C(r1, r0)
            com.instagram.business.promote.model.SelectedInterestRowItem r1 = (com.instagram.business.promote.model.SelectedInterestRowItem) r1
            X.UCX r5 = (X.UCX) r5
            com.instagram.business.promote.model.AudienceInterest r2 = r1.A00
            if (r2 == 0) goto L_0x00e2
            android.widget.TextView r1 = r5.A00
            java.lang.String r0 = r2.A01()
            r1.setText(r0)
            android.view.View r1 = r5.itemView
            r0 = 48
        L_0x00de:
            X.WBH.A01(r1, r0, r2, r5)
            return
        L_0x00e2:
            java.lang.String r0 = "interest"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ec:
            java.util.List r0 = r4.A07
            java.lang.Object r1 = r0.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.model.SelectedInterestHeaderRowItem"
            X.0qQ.A0C(r1, r0)
            X.UBj r5 = (X.C14830UBj) r5
            android.content.Context r1 = r4.A0A
            r0 = 2131970350(0x7f13492e, float:1.9577649E38)
        L_0x00fe:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            android.widget.TextView r0 = r5.A00
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAD.onBindViewHolder(X.3kE, int):void");
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object obj;
        LayoutInflater A0F = DbX.A0F(viewGroup, 0);
        switch (i) {
            case 0:
            case 2:
                obj = new C14830UBj(A0F.inflate(R.layout.interest_header_item_view, viewGroup, false));
                break;
            case 1:
                obj = new UCX(A0F.inflate(R.layout.selected_interest_item_view, viewGroup, false), this.A02);
                break;
            case 3:
                obj = new UCY(A0F.inflate(R.layout.suggested_interest_item_view, viewGroup, false), this.A02);
                break;
            case 4:
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                View A092 = DbW.A09(LayoutInflater.from(this.A0A), viewGroup, R.layout.promote_recycler_row_header, false);
                A092.setTag(new C14829UBi(A092));
                obj = new C14829UBi(A092);
                break;
            case 5:
                View A093 = DbW.A09(LayoutInflater.from(this.A0A), viewGroup, R.layout.promote_recycler_row_label_with_circle_check_filled_icon, false);
                obj = C13988Tno.A0U(A093, new UD0(A093));
                if (obj == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                break;
            case 6:
                View A094 = DbW.A09(LayoutInflater.from(this.A0A), viewGroup, R.layout.promote_recycler_row_label_with_circle_icon, false);
                obj = C13988Tno.A0U(A094, new UD1(A094));
                if (obj == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                break;
            case 7:
                View A095 = DbW.A09(LayoutInflater.from(this.A0A), viewGroup, R.layout.promote_recycler_row_header_with_sub_header, false);
                obj = C13988Tno.A0U(A095, new UCU(A095));
                if (obj == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown View Type");
        }
        return (C249703kE) obj;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, com.instagram.business.promote.model.SuggestedInterestRowItem] */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, com.instagram.business.promote.model.SelectedInterestRowItem] */
    public final void A00() {
        Object vmx;
        List list = this.A07;
        list.clear();
        UserSession userSession = this.A03;
        boolean A062 = 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36312402299454567L);
        List<AudienceInterest> list2 = this.A08;
        boolean isEmpty = list2.isEmpty();
        if (A062) {
            if (!isEmpty) {
                ArrayList arrayList = new ArrayList();
                for (AudienceInterest A022 : list2) {
                    arrayList.add(A022.A02());
                }
                List<AudienceInterest> list3 = this.A06;
                ArrayList arrayList2 = new ArrayList();
                for (AudienceInterest A023 : list3) {
                    arrayList2.add(A023.A02());
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C13991Tnr.A1M(arrayList2, arrayList3, it);
                }
                boolean A1b = DbT.A1b(arrayList3);
                Context context = this.A0A;
                if (A1b) {
                    vmx = new C17327VRg(AnonymousClass7TE.A16(context, 2131970343), AnonymousClass7TE.A16(context, 2131970344));
                } else {
                    vmx = new VMX(AnonymousClass7TE.A16(context, 2131970343));
                }
                list.add(vmx);
                for (AudienceInterest audienceInterest : list2) {
                    list.add(new C17328VRh(audienceInterest.A01(), new WBH(50, (Object) audienceInterest, (Object) this)));
                }
            }
            List list4 = this.A00;
            if (list4 != null && !list4.isEmpty()) {
                list.add(new VMX(AnonymousClass7TE.A16(this.A0A, 2131970304)));
                for (AudienceInterest audienceInterest2 : this.A00) {
                    list.add(new C17329VRi(audienceInterest2.A01(), new WBH(51, (Object) audienceInterest2, (Object) this)));
                }
            }
        } else if (!isEmpty) {
            list.add(this.A0B);
            for (AudienceInterest audienceInterest3 : list2) {
                0qQ.A0B(audienceInterest3, 1);
                ? obj = new Object();
                obj.A00 = audienceInterest3;
                list.add(obj);
            }
            List list5 = this.A00;
            if (list5 != null && !list5.isEmpty()) {
                list.add(this.A0C);
                for (AudienceInterest audienceInterest4 : this.A00) {
                    0qQ.A0B(audienceInterest4, 1);
                    ? obj2 = new Object();
                    obj2.A00 = audienceInterest4;
                    list.add(obj2);
                }
            }
        }
        notifyDataSetChanged();
    }

    public final void A01(AudienceInterest audienceInterest) {
        List list = this.A08;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C13991Tnr.A1Y(audienceInterest, it)) {
                return;
            }
        }
        list.add(audienceInterest);
        A00();
        C17325VRe vRe = this.A01;
        UserSession userSession = this.A03;
        String str = this.A04;
        List A022 = C256393vh.A02(new C19131WMm(2, (0sP) C20740WyD.A00), list);
        1OC A052 = W2V.A05(userSession, str, this.A05, A022, false);
        A052.A00 = (1P0) this.A09.getValue();
        vRe.A00.schedule(A052);
    }

    public final void A02(List list) {
        List list2 = this.A08;
        list2.clear();
        this.A06.clear();
        list2.addAll(list);
        A00();
        C17325VRe vRe = this.A01;
        UserSession userSession = this.A03;
        String str = this.A04;
        List A022 = C256393vh.A02(new C19131WMm(2, (0sP) C20740WyD.A00), list2);
        boolean isEmpty = list.isEmpty();
        1OC A052 = W2V.A05(userSession, str, this.A05, A022, isEmpty);
        A052.A00 = (1P0) this.A09.getValue();
        vRe.A00.schedule(A052);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(197879091);
        int size = this.A07.size();
        AnonymousClass0fD.A0A(-2110016139, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(1993700493);
        short A0V = C13992Tns.A0V(this.A07, i);
        AnonymousClass0fD.A0A(342293499, A032);
        return A0V;
    }
}
