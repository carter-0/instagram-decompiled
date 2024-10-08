package pl.droidsonroids.gif;

import X.002;
import X.AnonymousClass7TF;
import X.V4F;
import android.graphics.Bitmap;

public class GifDecoder {
    public final GifInfoHandle mGifInfoHandle;

    public int getCurrentFrameDuration() {
        int currentFrameIndex;
        int frameDuration;
        GifInfoHandle gifInfoHandle = this.mGifInfoHandle;
        synchronized (gifInfoHandle) {
            currentFrameIndex = GifInfoHandle.getCurrentFrameIndex(gifInfoHandle.A00);
        }
        synchronized (gifInfoHandle) {
            float numberOfFrames = (float) GifInfoHandle.getNumberOfFrames(gifInfoHandle.A00);
            if (currentFrameIndex < 0 || ((float) currentFrameIndex) >= numberOfFrames) {
                throw new IndexOutOfBoundsException(002.A0F("Frame index is not in range <0;", '>', numberOfFrames));
            }
            frameDuration = GifInfoHandle.getFrameDuration(gifInfoHandle.A00, currentFrameIndex);
        }
        return frameDuration;
    }

    public int getDuration() {
        int duration;
        GifInfoHandle gifInfoHandle = this.mGifInfoHandle;
        synchronized (gifInfoHandle) {
            duration = GifInfoHandle.getDuration(gifInfoHandle.A00);
        }
        return duration;
    }

    public int getFrameCount() {
        int numberOfFrames;
        GifInfoHandle gifInfoHandle = this.mGifInfoHandle;
        synchronized (gifInfoHandle) {
            numberOfFrames = GifInfoHandle.getNumberOfFrames(gifInfoHandle.A00);
        }
        return numberOfFrames;
    }

    public int getHeight() {
        int height;
        GifInfoHandle gifInfoHandle = this.mGifInfoHandle;
        synchronized (gifInfoHandle) {
            height = GifInfoHandle.getHeight(gifInfoHandle.A00);
        }
        return height;
    }

    public int getWidth() {
        int width;
        GifInfoHandle gifInfoHandle = this.mGifInfoHandle;
        synchronized (gifInfoHandle) {
            width = GifInfoHandle.getWidth(gifInfoHandle.A00);
        }
        return width;
    }

    public GifDecoder(V4F v4f) {
        this.mGifInfoHandle = new GifInfoHandle(((InputSource$FileSource) v4f).mPath);
    }

    private void checkBuffer(Bitmap bitmap) {
        int width;
        int height;
        if (!bitmap.isRecycled()) {
            int width2 = bitmap.getWidth();
            GifInfoHandle gifInfoHandle = this.mGifInfoHandle;
            synchronized (gifInfoHandle) {
                width = GifInfoHandle.getWidth(gifInfoHandle.A00);
            }
            if (width2 >= width) {
                int height2 = bitmap.getHeight();
                GifInfoHandle gifInfoHandle2 = this.mGifInfoHandle;
                synchronized (gifInfoHandle2) {
                    height = GifInfoHandle.getHeight(gifInfoHandle2.A00);
                }
                if (height2 >= height) {
                    if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Only Config.ARGB_8888 is supported. Current bitmap config: ");
                        throw new IllegalArgumentException(AnonymousClass7TF.A0i(bitmap.getConfig(), sb));
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("Bitmap is too small, size must be greater than or equal to GIF size");
        }
        throw new IllegalArgumentException("Bitmap is recycled");
    }

    public void seekToFrame(int i, Bitmap bitmap) {
        checkBuffer(bitmap);
        GifInfoHandle gifInfoHandle = this.mGifInfoHandle;
        synchronized (gifInfoHandle) {
            GifInfoHandle.seekToFrame(gifInfoHandle.A00, i, bitmap);
        }
    }

    public void seekToTime(int i, Bitmap bitmap) {
        checkBuffer(bitmap);
        GifInfoHandle gifInfoHandle = this.mGifInfoHandle;
        synchronized (gifInfoHandle) {
            GifInfoHandle.seekToTime(gifInfoHandle.A00, i, bitmap);
        }
    }
}
