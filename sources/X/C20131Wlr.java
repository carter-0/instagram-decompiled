package X;

import android.widget.FrameLayout;
import com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit;

/* renamed from: X.Wlr  reason: case insensitive filesystem */
public final class C20131Wlr implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ BKBloksAvatarEditorSparkAvatarPreviewRenderUnit A01;

    public C20131Wlr(FrameLayout frameLayout, BKBloksAvatarEditorSparkAvatarPreviewRenderUnit bKBloksAvatarEditorSparkAvatarPreviewRenderUnit) {
        this.A01 = bKBloksAvatarEditorSparkAvatarPreviewRenderUnit;
        this.A00 = frameLayout;
    }

    public final void run() {
        BKBloksAvatarEditorSparkAvatarPreviewRenderUnit bKBloksAvatarEditorSparkAvatarPreviewRenderUnit = this.A01;
        FrameLayout frameLayout = this.A00;
        frameLayout.isAttachedToWindow();
        if (!frameLayout.isAttachedToWindow()) {
            bKBloksAvatarEditorSparkAvatarPreviewRenderUnit.A0P(frameLayout);
        }
    }
}
