package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.Map;

public final class E5X extends AnonymousClass4DH implements C254093rv {
    public static final String __redex_internal_original_name = "QuickPromotionIGBottomsheetBloksFragment";
    public ViewGroup A00;
    public AnonymousClass6NS A01;
    public QuickPromotionSlot A02;
    public C231002qi A03;
    public boolean A04;
    public AnonymousClass4UC A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final String getModuleName() {
        return "quick_promotion_ig_bottomsheet_bloks_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass4UC r6;
        C229382nI r4;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C231002qi r5 = this.A03;
        if (r5 != null && (r6 = this.A05) != null && (r4 = (C229382nI) r5.A02.getValue()) != null) {
            r4.A01.put(R.id.bloks_action_listener, new C49599EzI(requireContext(), r4, r5, r6, this, (Map) null));
        }
    }

    public final void DJV(AnonymousClass6NS r3, C49599EzI ezI) {
        this.A01 = r3;
        AnonymousClass4UC r1 = this.A05;
        if (r1 != null) {
            C231002qi r0 = this.A03;
            if (r0 != null) {
                r0.DbK(r1);
            }
            C273694n2 r12 = new C273694n2(requireContext());
            AnonymousClass6NS r02 = this.A01;
            if (r02 != null) {
                r02.A07(r12);
            }
            ViewGroup viewGroup = this.A00;
            if (viewGroup != null) {
                viewGroup.addView(r12);
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public static final void A00(E5X e5x) {
        if (e5x.isAdded()) {
            DbX.A10(e5x.getActivity(), AnonymousClass37D.A00);
            DbT.A1I(e5x);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (r2.length() == 0) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = 721748054(0x2b050056, float:4.725156E-13)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r6 = r11
            X.E5X.super.onCreate(r12)
            X.Dbb.A1M(r11)
            android.os.Bundle r1 = r11.requireArguments()
            r0 = 3812(0xee4, float:5.342E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x0025
            r0 = 758803844(0x2d3a6d84, float:1.0597193E-11)
        L_0x0021:
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x0025:
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            r11.A02 = r0
            java.lang.String r0 = "quick_promotion"
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto L_0x003a
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x003b
        L_0x003a:
            r0 = 1
        L_0x003b:
            r3 = 0
            if (r0 != 0) goto L_0x004f
            X.16F r0 = X.16P.A00(r2)     // Catch:{ IOException -> 0x0047 }
            X.4UC r3 = X.AnonymousClass4V6.parseFromJson(r0)     // Catch:{ IOException -> 0x0047 }
            goto L_0x004f
        L_0x0047:
            r2 = move-exception
            java.lang.String r1 = "QuickPromotionIGBottomsheetBloksFragment"
            java.lang.String r0 = "Error parsing bloks bottomsheet promotion"
            X.0KC.A0F(r1, r0, r2)
        L_0x004f:
            r11.A05 = r3
            com.instagram.quickpromotion.intf.QuickPromotionSlot r10 = r11.A02
            X.0eM r1 = r11.A06
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x0081
            if (r10 == 0) goto L_0x0081
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            X.1YN r5 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r1)
            X.AnonymousClass2bO.A00()
            r1 = 1
            X.Fhc r0 = new X.Fhc
            r0.<init>(r1, r2, r11)
            X.2bW r9 = X.2bV.A08(r0)
            r7 = r11
            X.2qi r0 = r5.A01(r6, r7, r8, r9, r10)
        L_0x007b:
            r11.A03 = r0
            r0 = 102318143(0x619403f, float:2.8823302E-35)
            goto L_0x0021
        L_0x0081:
            r0 = 0
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E5X.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(15275454);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bloks_fragment, viewGroup, false);
        if (inflate != null) {
            this.A00 = DbS.A0E(inflate, R.id.bloks_container);
        } else {
            inflate = null;
        }
        AnonymousClass0fD.A09(-1009644830, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-142696513);
        AnonymousClass6NS r0 = this.A01;
        if (r0 != null) {
            r0.A04();
        }
        this.A01 = null;
        this.A00 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(1945772032, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-420851749);
        super.onResume();
        if (this.A05 == null) {
            A00(this);
            this.A04 = true;
        }
        AnonymousClass0fD.A09(271137863, A022);
    }

    public final void DOJ(String str) {
        A00(this);
    }
}
