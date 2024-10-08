package com.facebook.traffic.knob;

import X.AnonymousClass7TE;
import java.util.Set;

public final class DebugStrOptions {
    public final Set allowListByFieldId;

    public final class Builder {
        public Set allowListByFieldId = AnonymousClass7TE.A1F();

        public DebugStrOptions build() {
            return new DebugStrOptions(this);
        }

        public Builder allowListByFieldId(Set set) {
            this.allowListByFieldId = set;
            return this;
        }
    }

    public DebugStrOptions(Set set) {
        this.allowListByFieldId = set;
    }

    public DebugStrOptions(Builder builder) {
        this.allowListByFieldId = builder.allowListByFieldId;
    }

    public Set getAllowListByFieldId() {
        return this.allowListByFieldId;
    }
}
