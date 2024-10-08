package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.ERk  reason: case insensitive filesystem */
public final class C48021ERk extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SavingToGalleryFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "saving_to_gallery";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void configureActionBar(2da r2) {
        DbW.A1B(r2, 2131963005);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(956750143);
        super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        AnonymousClass0fD.A09(907002040, A02);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(-1504446146);
        super.onResume();
        ArrayList A1C = AnonymousClass7TE.A1C();
        1Av A002 = 1Au.A00(this.A00);
        A1C.add(DbS.A0f(new FQP(9, (Object) AnonymousClass05K.A00, (Object) this, (Object) 1Au.A00(this.A00)), 2131972567, A002.A1w()));
        FGF.A00(this, A1C, 2131969097);
        0s0 r1 = A002.A7E;
        AnonymousClass0YZ[] r8 = 1Av.A8a;
        A1C.add(DbS.A0f(new FQP(9, (Object) AnonymousClass05K.A01, (Object) this, (Object) 1Au.A00(this.A00)), 2131972573, AnonymousClass7TG.A1a(A002, r1, r8, 33)));
        A1C.add(DbS.A0f(new FQP(9, (Object) AnonymousClass05K.A0C, (Object) this, (Object) 1Au.A00(this.A00)), 2131972574, AnonymousClass7TG.A1a(A002, A002.A7p, r8, 31)));
        FGF.A00(this, A1C, 2131976518);
        setItems(A1C);
        AnonymousClass0fD.A09(-207396806, A02);
    }
}
