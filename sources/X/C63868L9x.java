package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.L9x  reason: case insensitive filesystem */
public final class C63868L9x {
    public final long A00;
    public final ImageUrl A01;
    public final ImageInfo A02;
    public final Integer A03;
    public final String A04;
    public final List A05;

    public C63868L9x(ImageUrl imageUrl, ImageInfo imageInfo, Integer num, String str, List list, long j) {
        C51972G9s.A1B(str, num);
        this.A04 = str;
        this.A00 = j;
        this.A05 = list;
        this.A03 = num;
        this.A01 = imageUrl;
        this.A02 = imageInfo;
    }
}
