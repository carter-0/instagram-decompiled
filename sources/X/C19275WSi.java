package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.WSi  reason: case insensitive filesystem */
public final class C19275WSi implements C232262tL {
    public final UKZ A00;
    public final VPT A01;
    public final String A02;

    public final ExtendedImageUrl A00(Context context) {
        C18604Vux vux = this.A00.A01;
        if (vux == null) {
            return null;
        }
        ExtendedImageUrl extendedImageUrl = vux.A00;
        if (extendedImageUrl != null) {
            return extendedImageUrl;
        }
        ExtendedImageUrl extendedImageUrl2 = (ExtendedImageUrl) vux.A02.invoke(context);
        vux.A00 = extendedImageUrl2;
        return extendedImageUrl2;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public C19275WSi(UKZ ukz, VPT vpt, String str) {
        this.A02 = str;
        this.A00 = ukz;
        this.A01 = vpt;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
