package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;

public final class E2N extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectManageFoldersAddChatsFragment";
    public AnonymousClass6HD A00;
    public C70933OSg A01;
    public List A02;
    public 0sP A03;
    public AnonymousClass62P A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final String A06 = "direct_manage_folders_add_chats";

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbW.A1B(r3, 2131959673);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A02(AnonymousClass05K.A1F);
        A0K.A03 = 2Yu.A0D(getContext());
        DbX.A19(FPI.A00(this, 47), A0K, r3);
    }

    public final String getModuleName() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1508626697);
        E2N.super.onCreate(bundle);
        AnonymousClass0eM r3 = this.A05;
        this.A01 = new C70933OSg(AnonymousClass7TE.A0l(r3));
        this.A04 = AnonymousClass62Q.A00(00k.A0d(2L2.A00(AnonymousClass7TE.A0l(r3)).A0C.A0F(AnonymousClass43A.A00), 40));
        AnonymousClass6HD r1 = new AnonymousClass6HD();
        List list = this.A02;
        if (list == null) {
            0qQ.A0F("initialSelectedThreads");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.addAll(list);
        this.A00 = r1;
        AnonymousClass0fD.A09(-344839742, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1812793001);
        ComposeView A0H = DbV.A0H(this, new C59110J6s(this, 21), 1788329066);
        AnonymousClass0fD.A09(-424421110, A022);
        return A0H;
    }
}
