package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.Ulu  reason: case insensitive filesystem */
public final class C15978Ulu extends C253103qD {
    public final /* synthetic */ WWP A00;
    public final /* synthetic */ C230192p8 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15978Ulu(WWP wwp, C230192p8 r4, int i) {
        super("", i, false);
        this.A01 = r4;
        this.A00 = wwp;
    }

    public final void onClick(View view) {
        C230192p8 r4 = this.A01;
        WWP wwp = this.A00;
        C309516Yo r2 = new C309516Yo(r4.A02.requireActivity(), r4.A03);
        IgFragmentFactoryImpl.A00();
        String str = wwp.A01.A07;
        if (str == null) {
            str = "";
        }
        String string = r4.A01.getResources().getString(2131963313);
        Bundle bundle = new Bundle();
        bundle.putParcelable(Pxd.A00(12), new SimpleWebViewConfig(str, (String) null, string, (String) null, false, false, false, false, false, true, false, true, false, false, false, false));
        DbW.A0y(bundle, new AnonymousClass4DH(), r2);
    }
}
