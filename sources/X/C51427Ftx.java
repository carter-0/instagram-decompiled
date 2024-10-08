package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ftx  reason: case insensitive filesystem */
public final class C51427Ftx implements Runnable {
    public final /* synthetic */ C49964FGx A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ List A02;

    public C51427Ftx(C49964FGx fGx, 0lg r2, List list) {
        this.A00 = fGx;
        this.A01 = r2;
        this.A02 = list;
    }

    public final void run() {
        String str;
        String str2;
        C49964FGx fGx = this.A00;
        0lg r6 = this.A01;
        List list = this.A02;
        02m r1 = fGx.A01;
        if (r1 != null) {
            r1.markerPoint(896612552, "add_nonce_and_local_auth_account_start");
            ArrayList A06 = C319606qt.A01(r6).A06(r6);
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = A06.iterator();
            int i = 0;
            while (it.hasNext()) {
                C319646qx r3 = (C319646qx) it.next();
                list.add(DbY.A0q("account_type", "nonce", AnonymousClass7TE.A1L("uid", r3.A06), AnonymousClass7TE.A1L("token", r3.A05)));
                list.add(DbY.A0q("token", r3.A02(), AnonymousClass7TE.A1L("uid", r3.A06), AnonymousClass7TE.A1L("credential_type", "local_auth")));
                if (fGx.A07) {
                    List list2 = fGx.A06;
                    0eP A1L = AnonymousClass7TE.A1L("uid", r3.A06);
                    0eP A1L2 = AnonymousClass7TE.A1L("token", r3.A05);
                    0eP A1L3 = AnonymousClass7TE.A1L("account_type", "nonce");
                    ImageUrl imageUrl = r3.A02;
                    if (imageUrl != null) {
                        str = imageUrl.getUrl();
                    } else {
                        str = null;
                    }
                    list2.add(0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, AnonymousClass7TE.A1L("profile_pic_url", str), AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r3.A07)}));
                    0eP A1L4 = AnonymousClass7TE.A1L("uid", r3.A06);
                    0eP A1L5 = AnonymousClass7TE.A1L("credential_type", "local_auth");
                    0eP A1L6 = AnonymousClass7TE.A1L("token", r3.A02());
                    ImageUrl imageUrl2 = r3.A02;
                    if (imageUrl2 != null) {
                        str2 = imageUrl2.getUrl();
                    } else {
                        str2 = null;
                    }
                    list2.add(0Yt.A06(new 0eP[]{A1L4, A1L5, A1L6, AnonymousClass7TE.A1L("profile_pic_url", str2), AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r3.A07)}));
                }
                i++;
                String str3 = r3.A06;
                0qQ.A0A(str3);
                A1C.add(str3);
            }
            C49880FBe fBe = fGx.A05;
            if (i == 0) {
                fBe.A01(r6, "nonce");
                fBe.A01(r6, "local_auth");
            } else {
                fBe.A03(r6, "nonce", A1C);
                fBe.A03(r6, "local_auth", A1C);
                02m r12 = fGx.A01;
                if (r12 != null) {
                    r12.markerAnnotate(896612552, "count_of_nonce_and_local_accounts", i);
                }
            }
            02m r13 = fGx.A01;
            if (r13 != null) {
                r13.markerPoint(896612552, "add_nonce_and_local_auth_account_end");
                return;
            }
        }
        0qQ.A0F("qplLogger");
        throw AnonymousClass00P.createAndThrow();
    }
}
