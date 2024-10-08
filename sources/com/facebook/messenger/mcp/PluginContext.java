package com.facebook.messenger.mcp;

import X.0qQ;
import com.facebook.msys.mca.Mailbox;

public final class PluginContext {
    public final Mailbox A00;

    public PluginContext(Mailbox mailbox) {
        0qQ.A0B(mailbox, 1);
        this.A00 = mailbox;
    }

    public final Mailbox getMailbox() {
        return this.A00;
    }
}
