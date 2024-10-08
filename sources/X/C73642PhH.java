package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.PhH  reason: case insensitive filesystem */
public final /* synthetic */ class C73642PhH extends 03J implements 0sL {
    public static final C73642PhH A00 = new C73642PhH();

    public C73642PhH() {
        super(2, C69613Nov.class, "generateMediaShare", "generateMediaShare(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/direct/model/DirectMediaShare;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        1Xj r0;
        ExtendedImageUrl extendedImageUrl;
        String str;
        int i;
        String str2;
        String str3;
        OTC otc = (OTC) obj;
        AnonymousClass9JI r2 = (AnonymousClass9JI) obj2;
        AnonymousClass7TF.A1H(otc, r2);
        Context context = (Context) otc.A00.invoke();
        1Xj r1 = (1Xj) r2.A00;
        if (!r1.A56() || (((str3 = r2.A02) == null || (r0 = r1.A1f(str3)) == null) && (r0 = r1.A1c(0)) == null)) {
            r0 = r1;
        }
        User A11 = C51966G9m.A11(r1);
        String str4 = null;
        if (A11 != null) {
            extendedImageUrl = C66581MXm.A0f(A11);
            str = A11.getUsername();
        } else {
            extendedImageUrl = null;
            str = null;
        }
        ExtendedImageUrl A1n = r0.A1n(context);
        if (r1.CeS()) {
            i = 2;
        } else if (r1.A56()) {
            i = 1;
        } else if (r1.A4u()) {
            i = 5;
        } else {
            i = 0;
            if (r1.A0C.CBy() != null) {
                i = 6;
            }
        }
        C247733gp A1T = r1.A1T();
        if (!(A1T == null || (str2 = A1T.A0d) == null || (A11 != null && (str4 = DbV.A0u(context, A11.getUsername(), str2, 2131969334)) != null))) {
            str4 = str2;
        }
        return C71152OeO.A04(extendedImageUrl, A1n, (ExtendedImageUrl) null, 2, str, str4, (String) null, OTC.A00(otc), (List) null, 0, i);
    }
}
