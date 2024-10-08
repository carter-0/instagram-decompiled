package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.A9t  reason: case insensitive filesystem */
public final class C39798A9t {
    public long A00;
    public ImageUrl A01;
    public ExtendedImageUrl A02;
    public User A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public final String A00() {
        String str = this.A05;
        if (str != null) {
            return str;
        }
        0qQ.A0F("replyText");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A01() {
        String str = this.A06;
        if (str != null) {
            return str;
        }
        0qQ.A0F("subtitle");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A02() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        0qQ.A0F(DialogModule.KEY_TITLE);
        throw AnonymousClass00P.createAndThrow();
    }
}
