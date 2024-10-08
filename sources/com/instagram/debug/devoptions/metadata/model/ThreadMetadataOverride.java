package com.instagram.debug.devoptions.metadata.model;

import X.0qQ;
import X.0sL;
import X.AnonymousClass7TG;
import X.C232262tL;

public final class ThreadMetadataOverride implements C232262tL {
    public boolean hasOverridden;
    public final String name;
    public final 0sL onSave;
    public final Class returnType;
    public Object value;

    public ThreadMetadataOverride(String str, Object obj, Class cls, 0sL r5) {
        AnonymousClass7TG.A0w(1, str, cls, r5);
        this.name = str;
        this.value = obj;
        this.returnType = cls;
        this.onSave = r5;
    }

    public final boolean getHasOverridden() {
        return this.hasOverridden;
    }

    public final String getName() {
        return this.name;
    }

    public final 0sL getOnSave() {
        return this.onSave;
    }

    public final Class getReturnType() {
        return this.returnType;
    }

    public final Object getValue() {
        return this.value;
    }

    public final void update(Object obj) {
        this.value = obj;
        this.hasOverridden = true;
    }

    public boolean isContentSame(ThreadMetadataOverride threadMetadataOverride) {
        return 0qQ.A0K(threadMetadataOverride, this);
    }

    public String getKey() {
        return this.name;
    }

    public /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return 0qQ.A0K(obj, this);
    }
}
