package com.instagram.debug.image;

import X.AnonymousClass578;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C253833rU;
import X.C270224gO;
import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DebugImageViewsTrackerImpl implements C270224gO {
    public ImageViewRunnable mImageViewInitializer;
    public ImageViewRunnable mImageViewResetter;
    public final Map mUrlToViews = AnonymousClass7TE.A1E();

    public interface ImageViewRunnable {
        void run(IgImageView igImageView);
    }

    public void updateDebugInfo(String str, AnonymousClass578 r2) {
    }

    private void iterateAllImageViews(ImageViewRunnable imageViewRunnable) {
        if (imageViewRunnable != null) {
            Iterator A0v = AnonymousClass7TF.A0v(this.mUrlToViews);
            while (A0v.hasNext()) {
                Set<IgImageView> set = (Set) A0v.next();
                if (set != null) {
                    for (IgImageView run : set) {
                        imageViewRunnable.run(run);
                    }
                }
            }
        }
    }

    public void registerView(ImageView imageView) {
        ImageViewRunnable imageViewRunnable = this.mImageViewInitializer;
        if (imageViewRunnable != null && (imageView instanceof IgImageView)) {
            imageViewRunnable.run((IgImageView) imageView);
        }
    }

    public void reset() {
        iterateAllImageViews(this.mImageViewResetter);
        this.mUrlToViews.clear();
    }

    public void setImageViewInitializer(ImageViewInitializer imageViewInitializer) {
        iterateAllImageViews(this.mImageViewResetter);
        ImageViewRunnable imageViewRunnable = imageViewInitializer.mImageViewInitializer;
        this.mImageViewInitializer = imageViewRunnable;
        this.mImageViewResetter = imageViewInitializer.mImageViewResetter;
        iterateAllImageViews(imageViewRunnable);
    }

    public void unregisterView(ImageView imageView) {
        if (imageView instanceof IgImageView) {
            IgImageView igImageView = (IgImageView) imageView;
            removeViewFromUrl(igImageView, igImageView.A0C);
        }
    }

    private void removeViewFromUrl(IgImageView igImageView, ImageUrl imageUrl) {
        if (!C253833rU.A02(imageUrl)) {
            Map map = this.mUrlToViews;
            String url = imageUrl.getUrl();
            Set set = (Set) map.get(url);
            if (set != null) {
                set.remove(igImageView);
                if (set.isEmpty()) {
                    this.mUrlToViews.remove(url);
                }
            }
        }
    }

    public void updateUrl(ImageView imageView, ImageUrl imageUrl, ImageUrl imageUrl2) {
        registerView(imageView);
        if (imageView instanceof IgImageView) {
            IgImageView igImageView = (IgImageView) imageView;
            removeViewFromUrl(igImageView, imageUrl);
            Set set = (Set) this.mUrlToViews.get(imageUrl2);
            if (set == null) {
                set = AnonymousClass7TE.A1F();
                this.mUrlToViews.put(imageUrl2.getUrl(), set);
            }
            set.add(igImageView);
        }
    }
}
