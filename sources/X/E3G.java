package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.Address;
import com.instagram.model.business.ProfileAddressData;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

public final class E3G extends AnonymousClass4DH implements AnonymousClass4DS, G5T {
    public static final String __redex_internal_original_name = "ProfileMultipleAddressesEditListFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final String getModuleName() {
        return "profile_multiple_addresses_edit_list";
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UserSession A0S = DbW.A0S(this.A00, 0);
        C49075Eot.A00(this, A0S, "impression", "screen", "subscriber", "ig_profile_edit_address_list_page", A0S.A06, (Map) null);
        Context requireContext = requireContext();
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(requireContext);
        A002.A01(new C47787EGy(this));
        A002.A01(new C47788EGz(this));
        AnonymousClass2t9 A0U = DbU.A0U(A002, new Object());
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.multiple_addresses_edit_list_recycler_view);
        recyclerView.setAdapter(A0U);
        DbV.A1B(requireContext, recyclerView);
        recyclerView.A11(new C46856DmY(this, 2));
        DbV.A1F(getViewLifecycleOwner(), DbT.A0G(((C46778Dl5) this.A01.getValue()).A00), new C59104J6m(19, (Object) requireContext, (Object) A0U, (Object) this), 36);
    }

    public static final Address A00(ProfileAddressData profileAddressData, E3G e3g) {
        if (profileAddressData == null) {
            return null;
        }
        String str = profileAddressData.A03;
        String str2 = profileAddressData.A05;
        String str3 = profileAddressData.A04;
        if (str3 == null) {
            str3 = "0";
        }
        String str4 = profileAddressData.A08;
        return new Address(str, str2, str3, str4, AnonymousClass703.A05(e3g.requireContext(), str, str4, str2));
    }

    public static final Integer A01(E3G e3g, List list) {
        User A0l = DbX.A0l(AnonymousClass0t1.A01, e3g.A00);
        if (list == null && (list = (List) DbT.A0G(((C46778Dl5) e3g.A01.getValue()).A00).A02()) == null) {
            return null;
        }
        return AnonymousClass703.A03(e3g.requireContext(), A0l, list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.instagram.model.business.ProfileAddressData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.instagram.model.business.ProfileAddressData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.instagram.model.business.ProfileAddressData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.instagram.model.business.ProfileAddressData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.instagram.model.business.ProfileAddressData} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FKj(com.instagram.model.business.Address r25, java.lang.String r26) {
        /*
            r24 = this;
            r5 = r25
            java.lang.String r12 = "update_primary_address_result_bundle_address_key"
            java.lang.String r11 = "update_primary_address_result_key"
            r10 = 0
            r9 = 1
            r14 = r24
            r13 = r26
            if (r25 == 0) goto L_0x008d
            java.lang.String r0 = r5.A01
            if (r0 == 0) goto L_0x008d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x008d
            com.instagram.model.business.ProfileAddressData r2 = X.C48991EnT.A00(r5, r13)
            java.lang.String r0 = r2.A06
            java.lang.String r4 = "primary"
            boolean r1 = X.0qQ.A0K(r0, r4)
            X.0eM r8 = r14.A01
            java.lang.Object r0 = r8.getValue()
            X.Dl5 r0 = (X.C46778Dl5) r0
            if (r1 == 0) goto L_0x0083
            boolean r1 = r0.A02()
            java.lang.Object r0 = r8.getValue()
            X.Dl5 r0 = (X.C46778Dl5) r0
            if (r1 == 0) goto L_0x007f
            r0.A01(r2)
        L_0x003d:
            X.0hq r3 = r14.getParentFragmentManager()
            X.0eP[] r6 = new X.0eP[r9]
        L_0x0043:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r12, r5)
            r6[r10] = r0
            android.os.Bundle r0 = X.Q21.A00(r6)
            r3.A0z(r11, r0)
        L_0x0050:
            java.lang.Object r0 = r8.getValue()
            X.Dl5 r0 = (X.C46778Dl5) r0
            X.05G r0 = r0.A00
            androidx.lifecycle.CoroutineLiveData r0 = X.DbT.A0G(r0)
            java.lang.Object r0 = r0.A02()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0168
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x006c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0169
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.model.business.ProfileAddressData r0 = (com.instagram.model.business.ProfileAddressData) r0
            java.lang.String r0 = r0.A06
            X.DbY.A1T(r0, r4, r1, r3)
            goto L_0x006c
        L_0x007f:
            r0.A00(r2)
            goto L_0x003d
        L_0x0083:
            if (r26 != 0) goto L_0x0089
            r0.A00(r2)
            goto L_0x0050
        L_0x0089:
            r0.A01(r2)
            goto L_0x0050
        L_0x008d:
            if (r26 == 0) goto L_0x0178
            X.0eM r8 = r14.A01
            java.lang.Object r0 = r8.getValue()
            X.Dl5 r0 = (X.C46778Dl5) r0
            X.05G r7 = r0.A00
            java.lang.Object r4 = r7.getValue()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0106
            java.util.Iterator r3 = r4.iterator()
            r2 = 0
        L_0x00a6:
            boolean r0 = r3.hasNext()
            r1 = -1
            if (r0 == 0) goto L_0x0106
            java.lang.Object r0 = r3.next()
            com.instagram.model.business.ProfileAddressData r0 = (com.instagram.model.business.ProfileAddressData) r0
            java.lang.String r0 = r0.A06
            boolean r0 = X.0qQ.A0K(r0, r13)
            if (r0 == 0) goto L_0x0164
            if (r2 == r1) goto L_0x0106
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1D(r4)
            r6.remove(r2)
            boolean r0 = X.DbT.A1b(r6)
            if (r0 == 0) goto L_0x0103
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0147
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0147
        L_0x00d4:
            java.lang.Object r1 = r6.get(r10)
            com.instagram.model.business.ProfileAddressData r1 = (com.instagram.model.business.ProfileAddressData) r1
            java.lang.String r0 = r1.A03
            r16 = r0
            java.lang.String r15 = r1.A04
            java.lang.String r5 = r1.A05
            java.lang.String r4 = r1.A08
            java.lang.Float r3 = r1.A00
            java.lang.Float r2 = r1.A01
            java.lang.String r1 = r1.A07
            java.lang.String r18 = "primary"
            com.instagram.model.business.ProfileAddressData r0 = new com.instagram.model.business.ProfileAddressData
            r22 = r4
            r23 = r1
            r20 = r15
            r21 = r5
            r19 = r16
            r17 = r2
            r16 = r3
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r6.set(r10, r0)
        L_0x0103:
            r7.Epw(r6)
        L_0x0106:
            java.lang.String r4 = "primary"
            boolean r0 = r13.equals(r4)
            if (r0 == 0) goto L_0x0050
            X.0hq r3 = r14.getParentFragmentManager()
            X.0eP[] r6 = new X.0eP[r9]
            java.lang.Object r0 = r8.getValue()
            X.Dl5 r0 = (X.C46778Dl5) r0
            X.05G r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            if (r0 == 0) goto L_0x0141
            java.util.Iterator r2 = r0.iterator()
        L_0x0129:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x013f
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.model.business.ProfileAddressData r0 = (com.instagram.model.business.ProfileAddressData) r0
            java.lang.String r0 = r0.A06
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0129
            r5 = r1
        L_0x013f:
            com.instagram.model.business.ProfileAddressData r5 = (com.instagram.model.business.ProfileAddressData) r5
        L_0x0141:
            com.instagram.model.business.Address r5 = A00(r5, r14)
            goto L_0x0043
        L_0x0147:
            java.util.Iterator r2 = r6.iterator()
        L_0x014b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r0 = r2.next()
            com.instagram.model.business.ProfileAddressData r0 = (com.instagram.model.business.ProfileAddressData) r0
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "primary"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x014b
            goto L_0x0103
        L_0x0164:
            int r2 = r2 + 1
            goto L_0x00a6
        L_0x0168:
            r3 = 0
        L_0x0169:
            X.0hq r2 = r14.getParentFragmentManager()
            java.lang.String r0 = "update_additional_business_addresses_bundle_addresses_key"
            android.os.Bundle r1 = X.DbY.A0B(r0, r3)
            java.lang.String r0 = "update_additional_business_addresses_result_key"
            r2.A0z(r0, r1)
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3G.FKj(com.instagram.model.business.Address, java.lang.String):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public E3G() {
        C51800G2j A002 = C51800G2j.A00(this, 27);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C51800G2j.A00(C51800G2j.A00(this, 24), 25));
        this.A01 = DbS.A0I(C51800G2j.A00(A003, 26), A002, new MJ4(34, (Object) null, A003), DbS.A0z(C46778Dl5.class));
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131966467);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1559385212);
        E3G.super.onCreate(bundle);
        AnonymousClass0fD.A09(431964799, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-2102995008);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_profile_multiple_addresses_edit_list_fragment, false);
        AnonymousClass0fD.A09(-1734207929, A02);
        return A0D;
    }
}
