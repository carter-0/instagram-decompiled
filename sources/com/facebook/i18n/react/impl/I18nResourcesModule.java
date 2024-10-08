package com.facebook.i18n.react.impl;

import X.002;
import X.0qQ;
import X.AnonymousClass0eK;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C262164Cj;
import X.C66580MXl;
import X.Pxe;
import X.QZK;
import X.RVR;
import com.facebook.fbreact.specs.NativeI18nResourcesSpec;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "I18nResources")
public final class I18nResourcesModule extends NativeI18nResourcesSpec {
    public static final RVR Companion = new Object();
    public static final int[] EMPTY_ARRAY = new int[0];
    public static final String NAME = "I18nResources";
    public final AnonymousClass0eK fbtEnabledProvider;
    public final C262164Cj stringResources;

    public String getName() {
        return "I18nResources";
    }

    public String getOverrideContent(String str) {
        return null;
    }

    public String getTranslation(String str, ReadableArray readableArray) {
        0qQ.A0B(str, 0);
        int[] iArr = EMPTY_ARRAY;
        if (readableArray != null) {
            int size = readableArray.size();
            iArr = new int[size];
            int i = 0;
            while (i < size) {
                try {
                    iArr[i] = readableArray.getInt(i);
                    i++;
                } catch (Exception e) {
                    IllegalStateException A0j = Pxe.A0j(002.A07(i, "Could not getTranslation: ", str, ": arg index "), e);
                    ReactSoftExceptionLogger.logSoftException("I18nResources", A0j);
                    throw A0j;
                }
            }
        }
        String AUt = this.stringResources.AUt(str, iArr);
        if (AUt == null) {
            return "";
        }
        return AUt;
    }

    public final AnonymousClass0eK getFbtEnabledProvider() {
        return this.fbtEnabledProvider;
    }

    public final C262164Cj getStringResources() {
        return this.stringResources;
    }

    public boolean isEnabled() {
        return AnonymousClass7TE.A1a(C66580MXl.A0s(this.fbtEnabledProvider));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public I18nResourcesModule(QZK qzk, C262164Cj r2, AnonymousClass0eK r3) {
        super(qzk);
        AnonymousClass7TG.A1Q(r2, r3);
        this.stringResources = r2;
        this.fbtEnabledProvider = r3;
    }
}
