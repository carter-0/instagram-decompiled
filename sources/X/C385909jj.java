package X;

import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: X.9jj  reason: invalid class name and case insensitive filesystem */
public final class C385909jj extends 2Cn {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C385909jj(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    public final void onFail(Exception exc) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(exc, 0);
                ((2Cn) this.A01).onFail(exc);
                return;
            case 1:
                0wb.A06("VideoThumbnailLoader", "Failed while trying to generate thumbnail", exc);
                return;
            default:
                0qQ.A0B(exc, 0);
                I75.A05(exc);
                return;
        }
    }

    public final void onFinish() {
        switch (this.A00) {
            case 0:
                ((2Cn) this.A01).onFinish();
                return;
            case 1:
                ((C355628Qs) this.A01).A05.remove(this.A03);
                return;
            default:
                C385909jj.super.onFinish();
                return;
        }
    }

    public final void onStart() {
        if (this.A00 != 0) {
            C385909jj.super.onStart();
        } else {
            ((2Cn) this.A01).onStart();
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                File file = (File) obj;
                0qQ.A0B(file, 0);
                ((A9L) this.A02).A00.put(this.A03, file.getCanonicalPath());
                ((2Cn) this.A01).onSuccess(file);
                return;
            case 1:
                ImageUrl imageUrl = (ImageUrl) obj;
                if (!C253833rU.A02(imageUrl)) {
                    C355628Qs r3 = (C355628Qs) this.A01;
                    r3.A04.put(this.A03, imageUrl);
                    Object obj2 = this.A02;
                    1OO A0J = 1NK.A00().A0J(imageUrl, (String) null);
                    A0J.A08 = obj2;
                    A0J.A02(r3);
                    A0J.A01();
                    return;
                }
                return;
            default:
                List list = (List) obj;
                0qQ.A0B(list, 0);
                I75.A03((I75) this.A02, this.A03, list, (Map) this.A01);
                return;
        }
    }
}
