package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.V1w  reason: case insensitive filesystem */
public final class C16693V1w extends Exception {
    public final ImmutableList A00;

    @Deprecated(message = "Do not use! OSS GraphQL responses can contain multiple errors, this returns only the first error and hides the rest.")
    public final String getMessage() {
        C13802ThL thL;
        ImmutableList immutableList = this.A00;
        if (immutableList != null) {
            thL = (C13802ThL) 00k.A0J(immutableList);
        } else {
            thL = null;
        }
        if (!(thL instanceof C15632Ufy)) {
            return null;
        }
        try {
            C15632Ufy ufy = (C15632Ufy) thL;
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, ufy.A00);
            String str = ufy.A06;
            if (str != null) {
                A0K.A0R("summary", str);
            }
            String str2 = ufy.A02;
            if (str2 != null) {
                A0K.A0R(DevServerEntity.COLUMN_DESCRIPTION, str2);
            }
            String str3 = ufy.A01;
            if (str3 != null) {
                A0K.A0R("debug_info", str3);
            }
            String str4 = ufy.A05;
            if (str4 != null) {
                A0K.A0R("severity", str4);
            }
            String str5 = ufy.A03;
            if (str5 != null) {
                A0K.A0R(DialogModule.KEY_MESSAGE, str5);
            }
            A0K.A0S("is_silent", ufy.A08);
            A0K.A0S("requires_reauth", ufy.A07);
            A0K.A0S("is_transient", ufy.A09);
            String str6 = ufy.A04;
            if (str6 != null) {
                A0K.A0R("query_path", str6);
            }
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException unused) {
            throw new IllegalArgumentException("exception on serialize to json");
        }
    }

    public C16693V1w(List list) {
        this.A00 = DbU.A0K(list);
    }
}
