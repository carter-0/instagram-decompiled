package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import java.util.ArrayList;

/* renamed from: X.WpN  reason: case insensitive filesystem */
public final class C20326WpN implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ VT7 A01;
    public final /* synthetic */ IgReactCommentModerationModule A02;
    public final /* synthetic */ ArrayList A03;

    public C20326WpN(FragmentActivity fragmentActivity, VT7 vt7, IgReactCommentModerationModule igReactCommentModerationModule, ArrayList arrayList) {
        this.A02 = igReactCommentModerationModule;
        this.A00 = fragmentActivity;
        this.A03 = arrayList;
        this.A01 = vt7;
    }

    public final void run() {
        C309516Yo A0M = DbS.A0M(this.A00, this.A02.mSession);
        C3018960m.A00().A00();
        ArrayList arrayList = this.A03;
        VT7 vt7 = this.A01;
        AnonymousClass7TG.A1N(arrayList, vt7);
        C15395Uby uby = new C15395Uby();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelableArrayList("BlockCommentersSettingFragment.BLOCKED_COMMENTERS_LIST", arrayList);
        uby.setArguments(A0a);
        uby.A01 = vt7;
        A0M.A0E(uby);
        A0M.A04();
    }
}
