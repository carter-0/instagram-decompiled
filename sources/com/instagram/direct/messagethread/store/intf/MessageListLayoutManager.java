package com.instagram.direct.messagethread.store.intf;

import androidx.recyclerview.widget.LinearLayoutManager;

public abstract class MessageListLayoutManager extends LinearLayoutManager {
    public boolean A00;

    public final boolean A1H() {
        return false;
    }

    public final boolean A1Y() {
        if (!super.A1Y() || !this.A00) {
            return false;
        }
        return true;
    }
}
