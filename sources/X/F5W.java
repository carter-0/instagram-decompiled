package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

public abstract class F5W {
    public static Intent A01(Context context, String str, String str2, String str3, String str4, String str5, List list) {
        Uri.Builder authority = new Uri.Builder().scheme("ig").authority("direct_v2");
        if (str2 != null) {
            authority.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        }
        if (list != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0K = AnonymousClass7TF.A0K(stringWriter);
                16P.A03(A0K, "recipients");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    PendingRecipient pendingRecipient = (PendingRecipient) it.next();
                    if (pendingRecipient != null) {
                        C330927Ou.A00(A0K, pendingRecipient);
                    }
                }
                A0K.A0Y();
                authority.appendQueryParameter("recipients", AnonymousClass7TG.A0k(A0K, stringWriter));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (str5 != null) {
            authority.appendQueryParameter("t", str5);
        }
        if (str3 != null) {
            authority.appendQueryParameter("x", str3);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            authority.appendQueryParameter(AnonymousClass000.A00(3770), (String) null);
        }
        Uri build = authority.build();
        AnonymousClass14B A00 = AnonymousClass14B.A00();
        0qQ.A0B(context, 0);
        Intent A03 = A00.A03(context, 335544320);
        OP0.A01(context, A03, build, str, str4);
        return A03;
    }

    public static Intent A00(Context context, String str, String str2, String str3, int i) {
        AnonymousClass14B A00 = AnonymousClass14B.A00();
        0qQ.A0B(context, 0);
        Intent A03 = A00.A03(context, i);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("ig").authority(str2).appendQueryParameter("filter_type", str);
        if (str3 != null) {
            appendQueryParameter.appendQueryParameter("DIRECT_SOURCE_MODULE_NAME", str3);
        }
        A03.setData(appendQueryParameter.build());
        return A03;
    }
}
