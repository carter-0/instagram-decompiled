package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass7TG;
import X.C250663lr;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DevServerInfoDescriptionImpl extends C250663lr implements DevServerInfoDescription {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -1327467523;

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return DevServerInfoDescriptionImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public String getDescription() {
        return A07(DevServerEntity.COLUMN_DESCRIPTION);
    }

    public AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, DevServerEntity.COLUMN_DESCRIPTION);
    }

    public DevServerInfoDescriptionImpl(int i) {
        super(i);
    }

    public DevServerInfoDescriptionImpl() {
        super(TYPE_TAG);
    }
}
