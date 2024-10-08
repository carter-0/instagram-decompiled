package X;

import android.os.Bundle;

public final class K3P extends C61364K4g implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AvatarNuxStickerGridFragment";
    public C317866ny A00 = C317866ny.POST_AVATAR_CREATION;
    public String A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbW.A1C(r3, DbV.A05(this).getString(2131953507));
        Dbc.A0k(r3);
    }

    public final String getModuleName() {
        String str = this.A01;
        if (str != null) {
            return 002.A0R(str, "_context_sheet_post_avatar_creation");
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1726305092);
        K3P.super.onCreate(bundle);
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A01 = string;
            this.A0L = false;
            this.A0H = false;
            this.A0G = false;
            if (182.A06(0Tu.A05, DbT.A0X(this.A02), 36319471815630248L)) {
                this.A00 = 4;
            }
            AnonymousClass0fD.A09(959283415, A022);
            return;
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("previous module required");
        AnonymousClass0fD.A09(107889511, A022);
        throw A0z;
    }
}
