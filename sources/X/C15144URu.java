package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.URu  reason: case insensitive filesystem */
public final class C15144URu extends C250663lr implements MXC {
    public final String AqT() {
        return A09("content");
    }

    public final C16658Uyu CAY() {
        return (C16658Uyu) getOptionalEnumField(0, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C16658Uyu.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final String getTitle() {
        return A08(DialogModule.KEY_TITLE);
    }

    public final String getUrl() {
        return A0A("url");
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
        return C41847B3o.A0j(r4, new AnonymousClass4L7(r4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), new AnonymousClass4L7(r4, DialogModule.KEY_TITLE), new AnonymousClass4L7(r4, "content"), "url");
    }

    public C15144URu(int i) {
        super(i);
    }

    public C15144URu() {
        super(-274625485);
    }
}
