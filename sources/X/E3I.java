package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.fx.access.sso.FxSsoViewModel;
import java.util.ArrayList;
import java.util.List;

public final class E3I extends AnonymousClass4DH implements AnonymousClass4DS, G7H {
    public static final String __redex_internal_original_name = "FxSsoAccountPickerFragment";
    public FxSsoViewModel A00;
    public C46822Dly A01;
    public EEM A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C73662Phb(this, 12));

    public final void FI9(C61079JwH jwH) {
    }

    public final void configureActionBar(2da r4) {
        View findViewById;
        0qQ.A0B(r4, 0);
        r4.Eu4(true);
        if (2eO.A01(getContext(), true) && (findViewById = ((2dZ) r4).A0S.findViewById(R.id.action_bar_button_back)) != null) {
            findViewById.setFocusable(1);
            findViewById.requestFocusFromTouch();
        }
    }

    public final String getModuleName() {
        return "fx_sso_account_picker";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r2 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r9 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        r9 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        r0 = (X.C60937Jtv) X.00k.A0J(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r0 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r10 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (r10 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r10 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        r4.A0A(X.C2612848z.A00, X.C257443xP.A01("fx_sso_account_picker"), r7, r8, r9, r10, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FI8(X.C61079JwH r13) {
        /*
            r12 = this;
            java.lang.Object r3 = r13.A00
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = X.00k.A0J(r3)
            X.Jtv r0 = (X.C60937Jtv) r0
            r1 = 0
            if (r0 == 0) goto L_0x0029
            java.lang.Object r2 = r0.A02
        L_0x000f:
            r0 = 10
            boolean r0 = X.QP8.A00(r0, r2)
            if (r0 == 0) goto L_0x0027
            X.QP8 r2 = (X.QP8) r2
        L_0x0019:
            X.EEM r4 = r12.A02
            if (r4 != 0) goto L_0x002b
            java.lang.String r0 = "facebookLoginHelper"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0027:
            r2 = r1
            goto L_0x0019
        L_0x0029:
            r2 = r1
            goto L_0x000f
        L_0x002b:
            X.0eM r0 = r12.A03
            java.lang.Object r7 = r0.getValue()
            X.0aP r7 = (X.AnonymousClass0aP) r7
            java.lang.String r1 = ""
            if (r2 == 0) goto L_0x003b
            java.lang.String r8 = r2.A03
            if (r8 != 0) goto L_0x003e
        L_0x003b:
            r8 = r1
            if (r2 == 0) goto L_0x0042
        L_0x003e:
            java.lang.String r9 = r2.A01
            if (r9 != 0) goto L_0x0043
        L_0x0042:
            r9 = r1
        L_0x0043:
            java.lang.Object r0 = X.00k.A0J(r3)
            X.Jtv r0 = (X.C60937Jtv) r0
            if (r0 == 0) goto L_0x004f
            java.lang.String r10 = r0.A04
            if (r10 != 0) goto L_0x0050
        L_0x004f:
            r10 = r1
        L_0x0050:
            X.48z r5 = X.C2612848z.A00
            java.lang.String r0 = "fx_sso_account_picker"
            X.3xQ r6 = X.C257443xP.A01(r0)
            r11 = 0
            r4.A0A(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3I.FI8(X.JwH):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1181046903);
        E3I.super.onCreate(bundle);
        this.A00 = DbY.A0V(requireActivity());
        CallerContext callerContext = EEM.A0B;
        this.A02 = new EEM(this, this, (AnonymousClass0aP) this.A03.getValue(), (FxSsoViewModel) null, C46634DiE.A0t, (String) null);
        AnonymousClass0fD.A09(-1290153356, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList;
        int A022 = AnonymousClass0fD.A02(-1788310896);
        0qQ.A0B(layoutInflater, 0);
        View A09 = DbW.A09(layoutInflater, viewGroup, R.layout.fx_multi_sso_account_picker, false);
        AnonymousClass7TE.A0b(A09, R.id.account_picker_title).setContentDescription(DbV.A0z(this, getString(2131962879), 2131963306));
        this.A01 = new C46822Dly(this);
        View findViewById = A09.findViewById(R.id.account_recycler_view);
        0qQ.A0C(findViewById, C273654mx.A00(4));
        RecyclerView recyclerView = (RecyclerView) findViewById;
        DbY.A16(this, recyclerView);
        C46822Dly dly = this.A01;
        String str = "aymhAdapter";
        if (dly != null) {
            recyclerView.setAdapter(dly);
            C46822Dly dly2 = this.A01;
            if (dly2 != null) {
                dly2.A01 = true;
                FxSsoViewModel fxSsoViewModel = this.A00;
                if (fxSsoViewModel == null) {
                    str = "fxSsoViewModel";
                } else {
                    List<C60937Jtv> list = (List) Dba.A0W(fxSsoViewModel.A02);
                    if (list != null) {
                        arrayList = AnonymousClass7TG.A0r(list);
                        for (C60937Jtv jtv : list) {
                            arrayList.add(new C61079JwH(jtv.A00, jtv.A03, AnonymousClass7TE.A1I(jtv)));
                        }
                    } else {
                        arrayList = 0sn.A00;
                    }
                    dly2.A00 = arrayList;
                    dly2.notifyDataSetChanged();
                    AnonymousClass0fD.A09(134041194, A022);
                    return A09;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
