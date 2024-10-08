package com.instagram.debug.devoptions.section.zerorating;

import android.view.View;

public final class ZeroE2ETestFragment$onCreateView$task$1 implements Runnable {
    public final /* synthetic */ View $view;
    public final /* synthetic */ ZeroE2ETestFragment this$0;

    public ZeroE2ETestFragment$onCreateView$task$1(ZeroE2ETestFragment zeroE2ETestFragment, View view) {
        this.this$0 = zeroE2ETestFragment;
        this.$view = view;
    }

    public void run() {
        ZeroE2ETestFragment zeroE2ETestFragment = this.this$0;
        if (!zeroE2ETestFragment.paused) {
            View view = this.$view;
            view.post(new ZeroE2ETestFragment$onCreateView$task$1$run$1(zeroE2ETestFragment, view));
        }
        this.this$0.autoUpdate.postDelayed(this, 2000);
    }
}
