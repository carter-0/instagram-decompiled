package X;

import android.content.Intent;
import android.os.Bundle;

public final class E10 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CollectionSelectMediaFragment";
    public C49519Ewy A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "instagram_shopping_collection_select_media";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            String str2 = null;
            if (intent != null) {
                str2 = intent.getStringExtra("arg_guide_selected_media_id");
                str = intent.getStringExtra("arg_guide_selected_image_path");
            } else {
                str = null;
            }
            C49519Ewy ewy = this.A00;
            if (ewy == null) {
                0qQ.A0F("mediaSelectedCallback");
                throw AnonymousClass00P.createAndThrow();
            }
            Dbc.A0t(ewy.A00, ewy.A01, str2, str);
        }
        0s1 r0 = new 0s1(getParentFragmentManager());
        r0.A03(this);
        r0.A00();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1098622856);
        E10.super.onCreate(bundle);
        AnonymousClass0fD.A09(-1039084858, A02);
    }
}
