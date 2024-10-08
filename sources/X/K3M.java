package X;

import android.os.Bundle;

public final class K3M extends C61364K4g {
    public static final String __redex_internal_original_name = "CommentAvatarStickerGridFragment";
    public String A00 = "ig_comments";
    public String A01;
    public final AnonymousClass0eM A02 = DbS.A0I(new C58680Ivp(this, 22), new C58680Ivp(this, 19), new C58188Ins(21, (Object) null, this), DbS.A0z(C314326i1.class));
    public final AnonymousClass0eM A03 = DbS.A0I(new C58680Ivp(this, 21), new C58680Ivp(this, 20), new C58188Ins(20, (Object) null, this), DbS.A0z(C335127cR.class));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        String str = this.A01;
        if (str != null) {
            return 002.A0R(str, "_avatar_sticker_grid");
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1196100047);
        K3M.super.onCreate(bundle);
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A01 = string;
            this.A04 = C317866ny.COMMENTS;
            this.A0H = true;
            this.A0J = true;
            this.A0F = true;
            AnonymousClass0fD.A09(-1646538573, A022);
            return;
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("previous module required");
        AnonymousClass0fD.A09(-1885466775, A022);
        throw A0z;
    }
}
