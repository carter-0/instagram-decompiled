package pl.droidsonroids.gif;

import X.V4F;

public final class InputSource$FileSource extends V4F {
    public final String mPath;

    public GifInfoHandle open() {
        return new GifInfoHandle(this.mPath);
    }

    public InputSource$FileSource(String str) {
        this.mPath = str;
    }
}
