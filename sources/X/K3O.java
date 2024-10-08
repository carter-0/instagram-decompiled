package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import java.util.List;

public final class K3O extends C61364K4g {
    public static final String __redex_internal_original_name = "ReelAvatarQuickReactionsMoreOptionsFragment";
    public LGV A00;
    public C255773uh A01;
    public C273384mU A02;
    public C314116hg A03;
    public C311506cn A04;
    public C62320sa A05;
    public boolean A06;
    public boolean A07;
    public String A08;
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(MM4.A00);
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public final void A0J(ULT ult, C62719KlJ klJ, C62723KlN klN, List list) {
        List list2 = list;
        0qQ.A0B(list2, 0);
        super.A0J(ult, (C62719KlJ) null, (C62723KlN) null, list2);
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            LGV lgv = this.A00;
            if (lgv != null) {
                String A0t = DbS.A0t(this.A09);
                Integer num = AnonymousClass05K.A00;
                String str = ((C317966o8) list2.get(i)).A0a;
                0qQ.A07(str);
                Integer num2 = num;
                lgv.A01(num, num2, AnonymousClass05K.A0C, A0t, str, "", "", 1, 1, i, i, list2.size(), false);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbT.A16(requireContext(), AnonymousClass7TF.A0G(view, R.id.avatar_sticker_grid_container), R.color.black);
        LGV A002 = C63061Kqq.A00(AnonymousClass7TE.A0l(this.A0A));
        this.A00 = A002;
        A002.A02(AnonymousClass05K.A0C, AnonymousClass05K.A00, DbS.A0t(this.A09));
    }

    public final String getModuleName() {
        String str = this.A08;
        if (str != null) {
            return 002.A0R(str, "_avatar_quick_reactions_more_options_sticker_grid");
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1481490113);
        K3O.super.onCreate(bundle);
        this.A04 = C317866ny.STORIES;
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A08 = string;
            this.A00 = 4;
            this.A0N = false;
            this.A0H = true;
            this.A0G = false;
            AnonymousClass0fD.A09(-2044865377, A022);
            return;
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("previous module required");
        AnonymousClass0fD.A09(1126907776, A022);
        throw A0z;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-788324474);
        super.onDestroy();
        LGV lgv = this.A00;
        if (lgv != null) {
            lgv.A03(DbS.A0t(this.A09), "");
        }
        AnonymousClass0fD.A09(-1581063111, A022);
    }
}
