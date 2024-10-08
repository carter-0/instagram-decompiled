package com.instagram.react.modules.exceptionmanager;

import X.0qQ;
import X.0wb;
import X.AnonymousClass0wW;
import X.AnonymousClass1WN;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C12220SpN;
import X.C13003THl;
import X.C13567Tcn;
import X.C18773W0w;
import X.C41845B3m;
import X.C66580MXl;
import X.QZK;
import X.S9G;
import X.SAV;
import X.SMN;
import X.T7S;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(canOverrideExistingModule = true, name = "ExceptionsManager", needsEagerInit = true)
public final class IgReactExceptionManager extends NativeExceptionsManagerSpec implements C13567Tcn {
    public static final SAV Companion = new Object();
    public static final String MODULE_NAME = "ExceptionsManager";
    public final Set exceptionHandlers;
    public final AnonymousClass0wW session;

    public IgReactExceptionManager(AnonymousClass0wW r2) {
        super((QZK) null);
        this.session = r2;
        this.exceptionHandlers = Collections.synchronizedSet(AnonymousClass7TE.A1F());
    }

    public /* synthetic */ IgReactExceptionManager(AnonymousClass0wW r1, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1);
    }

    public static final IgReactExceptionManager getInstance(AnonymousClass0wW r0) {
        return SAV.A00(r0);
    }

    public final void addExceptionHandler(C13567Tcn tcn) {
        0qQ.A0B(tcn, 0);
        this.exceptionHandlers.add(tcn);
    }

    public boolean canOverrideExistingModule() {
        return true;
    }

    public String getName() {
        return "ExceptionsManager";
    }

    public void handleException(Exception exc) {
        0qQ.A0B(exc, 0);
        T7S A00 = AnonymousClass1WN.A02.A00().A00(this.session);
        if (A00 != null && A00.A01 != null) {
            Set set = this.exceptionHandlers;
            0qQ.A06(set);
            synchronized (set) {
                if (!this.exceptionHandlers.isEmpty()) {
                    0wb.A01.EG7(exc);
                    A00.A02();
                    C18773W0w.A01(new C13003THl(exc, C66580MXl.A12(this.exceptionHandlers)));
                } else if (exc instanceof RuntimeException) {
                    throw exc;
                } else {
                    throw C41845B3m.A0j(exc);
                }
            }
        }
    }

    public final void removeExceptionHandler(C13567Tcn tcn) {
        0qQ.A0B(tcn, 0);
        this.exceptionHandlers.remove(tcn);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Throwable, com.facebook.react.common.JavascriptException, java.lang.RuntimeException] */
    public void reportSoftException(String str, ReadableArray readableArray, double d) {
        AnonymousClass7TF.A1H(str, readableArray);
        T7S A00 = AnonymousClass1WN.A02.A00().A00(this.session);
        if (A00 != null && A00.A01 != null) {
            ? runtimeException = new RuntimeException(SMN.A00(str, readableArray));
            runtimeException.extraDataAsJson = S9G.A00(new C12220SpN("isFatal", false));
            0wb.A01.EG7(runtimeException);
        }
    }

    public void reportFatalException(String str, ReadableArray readableArray, double d) {
        AnonymousClass7TG.A1N(str, readableArray);
        T7S A00 = AnonymousClass1WN.A02.A00().A00(this.session);
        if (A00 != null && A00.A01 != null) {
            throw new RuntimeException(SMN.A00(str, readableArray));
        }
    }

    public void updateExceptionMessage(String str, ReadableArray readableArray, double d) {
        AnonymousClass7TG.A1N(str, readableArray);
        AnonymousClass1WN.A02.A00().A00(this.session);
    }
}
