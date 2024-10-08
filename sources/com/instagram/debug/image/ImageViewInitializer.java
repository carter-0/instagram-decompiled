package com.instagram.debug.image;

import X.C59689JTv;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.image.DebugImageViewsTrackerImpl;

public class ImageViewInitializer {
    public final ImageDebugConfiguration mConfiguration;
    public final DebugImageViewsTrackerImpl.ImageViewRunnable mImageViewInitializer = new DebugImageViewsTrackerImpl.ImageViewRunnable() {
        public void run(IgImageView igImageView) {
            if (ImageViewInitializer.this.mConfiguration.mLongClickToCopyUrl) {
                igImageView.setOnLongClickListener(new View.OnLongClickListener() {
                    public boolean onLongClick(View view) {
                        ImageViewInitializer.setCopyUrlOnLongClick((IgImageView) view);
                        return false;
                    }
                });
            }
        }
    };
    public final DebugImageViewsTrackerImpl.ImageViewRunnable mImageViewResetter = new DebugImageViewsTrackerImpl.ImageViewRunnable() {
        public void run(IgImageView igImageView) {
            if (ImageViewInitializer.this.mConfiguration.mLongClickToCopyUrl) {
                igImageView.setOnLongClickListener((View.OnLongClickListener) null);
            }
        }
    };

    public static void setCopyUrlOnLongClick(IgImageView igImageView) {
        String str;
        ImageUrl imageUrl = igImageView.A0C;
        if (imageUrl != null) {
            str = imageUrl.getUrl();
        } else {
            str = null;
        }
        Context context = igImageView.getContext();
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            if (str == null) {
                str = "null";
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Image URL", str));
            C59689JTv.A09(context, "Copied URL to clipboard");
        }
    }

    public DebugImageViewsTrackerImpl.ImageViewRunnable getInitializer() {
        return this.mImageViewInitializer;
    }

    public DebugImageViewsTrackerImpl.ImageViewRunnable getResetter() {
        return this.mImageViewResetter;
    }

    public ImageViewInitializer(ImageDebugConfiguration imageDebugConfiguration) {
        this.mConfiguration = imageDebugConfiguration;
    }
}
