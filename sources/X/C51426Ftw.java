package X;

import android.webkit.URLUtil;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ftw  reason: case insensitive filesystem */
public final class C51426Ftw implements Runnable {
    public final /* synthetic */ C49964FGx A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ List A02;

    public C51426Ftw(C49964FGx fGx, 0lg r2, List list) {
        this.A00 = fGx;
        this.A01 = r2;
        this.A02 = list;
    }

    public final void run() {
        String str;
        C49964FGx fGx = this.A00;
        0lg r11 = this.A01;
        List list = this.A02;
        02m r1 = fGx.A01;
        if (r1 != null) {
            r1.markerPoint(896612552, "add_nonpassword_saved_accounts_start");
            ArrayList A002 = FCR.A00();
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = A002.iterator();
            int i = 0;
            while (it.hasNext()) {
                F3D f3d = (F3D) it.next();
                String A003 = f3d.A00();
                if (!(A003 == null || A003.length() == 0)) {
                    list.add(DbY.A0q("token", "", AnonymousClass7TE.A1L("uid", A003), AnonymousClass7TE.A1L("credential_type", NetInfoModule.CONNECTION_TYPE_NONE)));
                    if (fGx.A07) {
                        List list2 = fGx.A06;
                        0eP A1L = AnonymousClass7TE.A1L("uid", A003);
                        0eP A1L2 = AnonymousClass7TE.A1L("credential_type", NetInfoModule.CONNECTION_TYPE_NONE);
                        0eP A1L3 = AnonymousClass7TE.A1L("token", "");
                        0eP A1L4 = AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, f3d.A01());
                        if (URLUtil.isValidUrl(f3d.A00)) {
                            str = f3d.A00;
                        } else {
                            str = null;
                        }
                        list2.add(0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, AnonymousClass7TE.A1L("profile_pic_url", str)}));
                    }
                }
                i++;
                A1C.add(C49964FGx.A03(A003));
            }
            C49880FBe fBe = fGx.A05;
            if (i == 0) {
                fBe.A01(r11, NetInfoModule.CONNECTION_TYPE_NONE);
            } else {
                fBe.A03(r11, NetInfoModule.CONNECTION_TYPE_NONE, A1C);
                02m r12 = fGx.A01;
                if (r12 != null) {
                    r12.markerAnnotate(896612552, "count_of_nonpassword_saved_accounts", i);
                }
            }
            02m r13 = fGx.A01;
            if (r13 != null) {
                r13.markerPoint(896612552, "add_nonpassword_saved_accounts_end");
                return;
            }
        }
        0qQ.A0F("qplLogger");
        throw AnonymousClass00P.createAndThrow();
    }
}
