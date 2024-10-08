package X;

import android.graphics.Bitmap;
import com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl;

/* renamed from: X.Ou3  reason: case insensitive filesystem */
public final class C71978Ou3 implements C232262tL {
    public final int A00;
    public final Bitmap A01;
    public final IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A01.getGenerationId());
    }

    public C71978Ou3(Bitmap bitmap, IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response response, String str, int i) {
        AnonymousClass7TG.A1Q(response, str);
        this.A01 = bitmap;
        this.A02 = response;
        this.A03 = str;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
