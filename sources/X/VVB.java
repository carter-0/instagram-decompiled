package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.Date;

public final class VVB {
    public final ImageUrl A00;
    public final Reel A01;
    public final Date A02;

    public VVB(ImageUrl imageUrl, Reel reel, Date date) {
        this.A01 = reel;
        this.A02 = date;
        this.A00 = imageUrl;
    }
}
