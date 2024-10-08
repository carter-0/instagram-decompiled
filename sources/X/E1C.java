package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class E1C extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PotatoReplyBottomSheetFragment";
    public final String A00;
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C51802G2l((Object) this, 27));
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C51802G2l((Object) this, 36));
    public final AnonymousClass0eM A04;

    public final void onViewCreated(View view, Bundle bundle) {
        Object value;
        C47182Drx drx;
        String A35;
        long A1A;
        boolean A1X;
        String str;
        String str2;
        Integer num;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH5(r4, this, viewLifecycleOwner, (AnonymousClass4D7) null, 1), AnonymousClass07a.A00(viewLifecycleOwner));
        C46770Dkx dkx = (C46770Dkx) this.A04.getValue();
        Context requireContext = requireContext();
        C54434HDi hDi = dkx.A01;
        1Xj A0U = DbV.A0U(hDi.A01, dkx.A02);
        if (A0U != null) {
            C243363Yl A0L = 0q2.A00(dkx.A00).A0L(A0U);
            05G r1 = dkx.A06;
            do {
                value = r1.getValue();
                drx = (C47182Drx) value;
                A35 = A0U.A35(requireContext);
                if (A35 == null) {
                    A35 = "";
                }
                A1A = A0U.A1A();
                A1X = AnonymousClass7TG.A1X(A0U.A0C.AkR());
                str = drx.A05;
                str2 = drx.A06;
                num = drx.A03;
            } while (!r1.AIY(value, C47182Drx.A00(drx.A01, A0L, num, str, str2, A35, drx.A07, A1A, drx.A08, A1X)));
        }
    }

    public final String getModuleName() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public E1C() {
        C51802G2l g2l = new C51802G2l((Object) this, 37);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51802G2l((Object) new C51802G2l((Object) this, 33), 34));
        this.A04 = DbS.A0I(new C51802G2l((Object) A002, 35), g2l, new MJ4(13, (Object) null, A002), DbS.A0z(C46770Dkx.class));
        this.A02 = C227642jf.A02(this);
        this.A00 = "potato_reply_bottom_sheet_fragment";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1656141477);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 3), -2098047050);
        AnonymousClass0fD.A09(195199876, A022);
        return A0H;
    }
}
