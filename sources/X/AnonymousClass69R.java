package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.HashSet;

/* renamed from: X.69R  reason: invalid class name */
public final class AnonymousClass69R extends C250663lr implements C250673ls {
    public final User A0E(1E6 r5) {
        Parcelable.Creator creator = User.CREATOR;
        return 1aC.A01(new 1E9(r5, new HashSet(), false), (ImmutablePandoUserDict) reinterpret(ImmutablePandoUserDict.class));
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r3, "pk"), new AnonymousClass4L7(r3, "full_name"), new AnonymousClass4L7(r3, "profile_pic_url"), new AnonymousClass4L7(r3, C66643MaC.A01(22, 8, 34)), new AnonymousClass4L7(r3, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new AnonymousClass4L7(r3, "birthday_today_visibility_for_viewer")});
    }

    public AnonymousClass69R(int i) {
        super(i);
    }

    public AnonymousClass69R() {
        super(-1791809412);
    }
}
