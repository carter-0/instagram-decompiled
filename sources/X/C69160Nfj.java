package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;

/* renamed from: X.Nfj  reason: case insensitive filesystem */
public final class C69160Nfj extends C66942Mfb {
    public HashtagImpl A00;
    public boolean A01;

    public C69160Nfj() {
        super(1);
        this.A00 = new HashtagImpl((ImageUrl) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C69160Nfj) {
            return 0qQ.A0K(this.A00, ((C69160Nfj) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C69160Nfj(Hashtag hashtag) {
        super(1);
        this.A00 = hashtag.FEY();
    }
}
