package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;

public final class NV3 extends C68495NKo {
    public static final String __redex_internal_original_name = "DirectQuestionsCardGalleryFragment";

    public final String getModuleName() {
        return "direct_questions_card_gallery_fragment";
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, X.NKo, java.lang.Object, X.NV3, X.MYR] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0I = 2131952436;
        this.A0H = 2131971032;
        this.A01 = R.drawable.instagram_comment_outline_96;
        Dba.A15(this, A0E().A03, new C74191PqX(40, (Object) AnonymousClass7TF.A0G(view, R.id.spinner), (Object) this), 39);
        getRecyclerView().A15(new C67836Mvg(getAdapter(), new C73656PhV(this, 2)));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C68495NKo.A00(intent, this, i, i2);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-211292842);
        super.onCreate(bundle);
        this.A04 = new ODX(AnonymousClass7TF.A0d(DbV.A05(this), 2131971061), new C73656PhV(this, 1), true);
        AnonymousClass0fD.A09(732867444, A02);
    }
}
