package X;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.instagram.common.gallery.Medium;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.List;

/* renamed from: X.9lS  reason: invalid class name and case insensitive filesystem */
public final class C386969lS extends 0ng {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ 0lg A02;
    public final /* synthetic */ B2G A03;
    public final /* synthetic */ C365768ne A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386969lS(Activity activity, Uri uri, 0lg r5, B2G b2g, C365768ne r7, Integer num, String str, List list, int i) {
        super(i, 3, false, false);
        this.A07 = list;
        this.A04 = r7;
        this.A00 = activity;
        this.A02 = r5;
        this.A05 = num;
        this.A06 = str;
        this.A01 = uri;
        this.A03 = b2g;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0rm, java.lang.Object] */
    public final void run() {
        String str;
        String str2;
        ? obj = new Object();
        try {
            List<Uri> list = this.A07;
            if (list != null) {
                for (Uri uri : list) {
                    C365768ne r4 = this.A04;
                    Activity activity = this.A00;
                    0lg r7 = this.A02;
                    switch (this.A05.intValue()) {
                        case 1:
                            str2 = "reels_share_content_";
                            break;
                        case 2:
                            str2 = "feed_share_content_";
                            break;
                        default:
                            str2 = "story_share_content_";
                            break;
                    }
                    Medium A002 = r4.A00(activity, uri, r7, str2, this.A06);
                    if (A002 != null) {
                        r4.A09.add(A002);
                    }
                }
            }
            C365768ne r5 = this.A04;
            Uri uri2 = this.A01;
            Activity activity2 = this.A00;
            0lg r8 = this.A02;
            switch (this.A05.intValue()) {
                case 1:
                    str = "reels_share_content_interactive_";
                    break;
                case 2:
                    str = "feed_share_content_interactive_";
                    break;
                default:
                    str = "story_share_content_interactive_";
                    break;
            }
            Medium A003 = r5.A00(activity2, uri2, r8, str, (String) null);
            r5.A03 = A003;
            if (A003 != null) {
                A003.A0H = new BackgroundGradientColors(r5.A01, r5.A00);
                if (A003.A05()) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(A003.A0X, options);
                    int i = options.outWidth;
                    int i2 = options.outHeight;
                    A003.A0B = i;
                    A003.A04 = i2;
                }
            }
        } catch (Exception e) {
            0KC.A0F("ExternalShareMediator", "Exception in copyAsset", e);
            obj.A00 = e;
        }
        this.A00.runOnUiThread(new C41184Api(this.A03, this.A04, obj));
    }
}
