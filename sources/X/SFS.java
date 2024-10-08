package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import java.io.File;
import java.io.IOException;

public final class SFS {
    public C307896Rx A00;
    public String A01 = null;
    public Fragment A02;
    public final Context A03;
    public final C10621RvF A04;

    public static void A00(SFS sfs) {
        C8777R9d r9d = new C8777R9d(sfs, 1);
        Intent A0G = Pxe.A0G("android.media.action.IMAGE_CAPTURE");
        try {
            Context context = sfs.A03;
            File A042 = 0mb.A04(context);
            Uri A002 = FileProvider.A00(context, A042);
            sfs.A01 = 002.A0R("file://", A042.getCanonicalPath());
            A0G.setFlags(1);
            A0G.putExtra("output", A002);
            C308206Td.A0K(sfs.A00, r9d);
            0kR.A06(sfs.A02, A0G, 1);
        } catch (ActivityNotFoundException | IOException e) {
            C10621RvF rvF = sfs.A04;
            C308206Td.A0E(rvF.A00, rvF.A01, Pxf.A1Z(e));
        }
    }

    public SFS(Context context, Fragment fragment, C10621RvF rvF, C307896Rx r5) {
        this.A02 = fragment;
        this.A03 = context;
        this.A00 = r5;
        this.A04 = rvF;
    }
}
