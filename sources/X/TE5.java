package X;

import com.instagram.share.handleractivity.CustomStoryShareHandlerActivity;

public final class TE5 implements Runnable {
    public final /* synthetic */ CustomStoryShareHandlerActivity A00;

    public TE5(CustomStoryShareHandlerActivity customStoryShareHandlerActivity) {
        this.A00 = customStoryShareHandlerActivity;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.share.handleractivity.CustomStoryShareHandlerActivity, android.app.Activity] */
    public final void run() {
        this.A00.finish();
    }
}
