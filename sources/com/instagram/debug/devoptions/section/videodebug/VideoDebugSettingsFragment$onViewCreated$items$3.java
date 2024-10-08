package com.instagram.debug.devoptions.section.videodebug;

import android.widget.CompoundButton;

public final class VideoDebugSettingsFragment$onViewCreated$items$3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ VideoDebugSettingsFragment this$0;

    public VideoDebugSettingsFragment$onViewCreated$items$3(VideoDebugSettingsFragment videoDebugSettingsFragment) {
        this.this$0 = videoDebugSettingsFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r5 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r7, boolean r8) {
        /*
            r6 = this;
            com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment r0 = r6.this$0
            android.content.Context r0 = r0.requireContext()
            boolean r5 = android.provider.Settings.canDrawOverlays(r0)
            if (r8 == 0) goto L_0x001a
            if (r5 != 0) goto L_0x001a
            com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment r0 = r6.this$0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            java.lang.String r1 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
            r0 = 0
            X.W38.A07(r2, r0, r1)
        L_0x001a:
            X.0tS r4 = X.DbT.A0h()
            if (r8 == 0) goto L_0x0023
            r3 = 1
            if (r5 != 0) goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            X.0s0 r2 = r4.A2r
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 6
            X.AnonymousClass7TF.A1J(r4, r2, r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment$onViewCreated$items$3.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
