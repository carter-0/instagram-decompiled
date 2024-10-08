package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;

public final class ES5 extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ContactOptionsFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final 1wn A01 = FXZ.A00(this, 12);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131963002);
    }

    public final String getModuleName() {
        return "contacts_import_settings";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public static final ArrayList A06(ES5 es5) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Context context = es5.getContext();
        if (context != null) {
            AnonymousClass0eM r4 = es5.A00;
            C47518E6c.A05(es5, A1C, 9, 2131956510, C267044ar.A01(context, AnonymousClass7TE.A0l(r4)));
            String A0m = DbU.A0m(es5, 2131964884);
            SpannableStringBuilder A0E = DbY.A0E(es5, A0m, 2131956517);
            0lg A0X = DbT.A0X(r4);
            String A012 = SQU.A01(context, "https://help.instagram.com/227486307449481");
            0qQ.A07(A012);
            AnonymousClass7AV.A05(A0E, new C69192Ngq(context, A0X, (OAJ) null, A012, DbV.A02(context)), A0m);
            A1C.add(new FGF(A0E));
        }
        return A1C;
    }

    public final void onPause() {
        int A02 = AnonymousClass0fD.A02(770423163);
        ES5.super.onPause();
        DbX.A0R(this.A00).A02(this.A01, C50277FWi.class);
        AnonymousClass0fD.A09(-774425165, A02);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(504721859);
        super.onResume();
        DbX.A0R(this.A00).A01(this.A01, C50277FWi.class);
        setItems(A06(this));
        AnonymousClass0fD.A09(2081868493, A02);
    }
}
