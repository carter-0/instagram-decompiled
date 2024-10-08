package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.util.ExifImageData;
import java.io.IOException;

/* renamed from: X.JaV  reason: case insensitive filesystem */
public final class C59854JaV extends C228952mb {
    public static final Bitmap.CompressFormat A01 = Bitmap.CompressFormat.JPEG;
    public final C59855JaW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59854JaV(Context context, Uri uri, Uri uri2, UserSession userSession) {
        super(context);
        Context context2 = context;
        Uri uri3 = uri;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1U(userSession, context, uri);
        if (this.A07) {
            A09();
        } else {
            this.A04 = true;
        }
        this.A00 = new C59855JaW(context2, uri3, uri2, userSession2, false);
    }

    public final /* bridge */ /* synthetic */ Object A06() {
        try {
            return this.A00.call();
        } catch (IOException unused) {
            return new C59861Jad((Bitmap) null, (ExifImageData) null, (C364808m2) null);
        } catch (Exception e) {
            0kD.A0C("LoadImageTask_UnknownError", "Caught unknown error", e);
            return new C59861Jad((Bitmap) null, (ExifImageData) null, (C364808m2) null);
        }
    }
}
