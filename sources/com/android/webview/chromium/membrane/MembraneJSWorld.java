package com.android.webview.chromium.membrane;

public class MembraneJSWorld {
    public final int mWorldId;

    public int toInt() {
        return this.mWorldId;
    }

    public MembraneJSWorld(int i) {
        this.mWorldId = i;
    }
}
