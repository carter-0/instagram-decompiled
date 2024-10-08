package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

public final class I8B implements DialogInterface.OnClickListener {
    public final /* synthetic */ C56525Hzw A00;

    public I8B(C56525Hzw hzw) {
        this.A00 = hzw;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C55761Hmw hmw;
        C56525Hzw hzw = this.A00;
        CharSequence charSequence = C56525Hzw.A00(hzw)[i];
        Context context = hzw.A02;
        if (context.getString(2131963394).contentEquals(charSequence) && (hmw = hzw.A00) != null) {
            C2357130x.A00(hmw.A00, hmw.A01, C266954ac.CLICKED_HIDE, hmw.A02);
        } else if (context.getString(2131951986).contentEquals(charSequence)) {
            C309516Yo A0M = DbS.A0M(hzw.A03.requireActivity(), hzw.A04);
            IgFragmentFactoryImpl.A00();
            A0M.A0E(new R8L());
            A0M.A04();
        }
    }
}
