package com.meta.foa.performancelogging.lss;

import X.0oU;
import com.facebook.proxygen.TraceFieldType;
import kotlin.enums.EnumEntries;

public enum LocalSendSpeedAnnotations {
    MESSAGE_TYPE("message_type"),
    TRANSPORT_TYPE(TraceFieldType.TransportType),
    IS_GROUP("is_group"),
    IS_ENCRYPTED("is_encrypted"),
    SEND_SURFACE("send_surface"),
    IS_BUNDLE_WITH_MEDIA_SEND("is_bundle_with_media_send"),
    MEDIA_SOURCE("media_source");
    
    public final String annotation;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        LocalSendSpeedAnnotations[] $values;
        $ENTRIES = 0oU.A00($values);
    }

    public final String getAnnotation() {
        return this.annotation;
    }

    /* access modifiers changed from: public */
    LocalSendSpeedAnnotations(String str) {
        this.annotation = str;
    }
}
