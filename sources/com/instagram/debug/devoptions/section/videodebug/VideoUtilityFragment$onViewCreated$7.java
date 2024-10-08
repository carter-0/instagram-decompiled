package com.instagram.debug.devoptions.section.videodebug;

import android.widget.SeekBar;

public final class VideoUtilityFragment$onViewCreated$7 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ VideoUtilityFragment this$0;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public VideoUtilityFragment$onViewCreated$7(VideoUtilityFragment videoUtilityFragment) {
        this.this$0 = videoUtilityFragment;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            VideoUtilityFragment videoUtilityFragment = this.this$0;
            videoUtilityFragment.mainHandler.post(new VideoUtilityFragment$onViewCreated$7$onProgressChanged$1(videoUtilityFragment, i));
        }
    }
}
