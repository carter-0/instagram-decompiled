package X;

import android.graphics.Bitmap;
import java.io.File;
import java.io.IOException;
import pl.droidsonroids.gif.GifDecoder;
import pl.droidsonroids.gif.InputSource$FileSource;

public final class WXV implements C20997X8u, AnonymousClass734 {
    public final GifDecoder A00;

    public final int EL4(int i, Bitmap bitmap) {
        0qQ.A0B(bitmap, 1);
        this.A00.seekToTime(i, bitmap);
        return 0;
    }

    public final C20997X8u ALs() {
        return this;
    }

    public final int getDuration() {
        return this.A00.getDuration();
    }

    public final int getFrameCount() {
        return this.A00.getFrameCount();
    }

    public final int getHeight() {
        return this.A00.getHeight();
    }

    public final int getWidth() {
        return this.A00.getWidth();
    }

    public WXV(String str) {
        File file = new File(str);
        if (!file.exists() || file.length() <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid GIF input: exists={");
            sb.append(file.exists());
            sb.append(" length=");
            sb.append(file.length());
            sb.append(" path=\"");
            sb.append(str);
            throw new IOException(C51967G9n.A0r(sb, '\"'));
        }
        this.A00 = new GifDecoder(new InputSource$FileSource(str));
    }
}
