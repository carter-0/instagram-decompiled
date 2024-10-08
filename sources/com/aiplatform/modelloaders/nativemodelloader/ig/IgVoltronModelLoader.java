package com.aiplatform.modelloaders.nativemodelloader.ig;

import X.0qQ;
import X.0sP;
import X.19B;
import X.19E;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass12U;
import X.AnonymousClass19S;
import X.AnonymousClass4D7;
import X.AnonymousClass8CJ;
import X.AnonymousClass8CK;
import X.AnonymousClass8CL;
import X.C3501083h;
import X.C376959Jz;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgVoltronModelLoader {
    public static final C3501083h Companion = new Object();
    public static final String TAG = "IgVoltronModelLoader";
    public final AtomicBoolean areExecuTorchLibrariesLoaded;
    public final AtomicBoolean arePytorchLibrariesLoaded;
    public final AtomicBoolean areSentencePieceLibrariesLoaded;
    public final UserSession userSession;

    public /* synthetic */ IgVoltronModelLoader(UserSession userSession2, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession2);
    }

    public final void fetchExecuTorchVoltronModule(0sP r6) {
        0qQ.A0B(r6, 0);
        AnonymousClass19S A02 = 19E.A02(new AnonymousClass12U().AOJ(497892810, 3));
        C376959Jz r2 = new C376959Jz((Object) this, (Object) r6, (AnonymousClass4D7) null, 4);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A02);
    }

    public final void fetchPytorchVoltronModule(0sP r6) {
        0qQ.A0B(r6, 0);
        AnonymousClass19S A02 = 19E.A02(new AnonymousClass12U().AOJ(497892810, 3));
        C376959Jz r2 = new C376959Jz((Object) this, (Object) r6, (AnonymousClass4D7) null, 5);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A02);
    }

    public final void fetchSentencePieceVoltronModule(0sP r6) {
        0qQ.A0B(r6, 0);
        AnonymousClass19S A02 = 19E.A02(new AnonymousClass12U().AOJ(497892810, 3));
        C376959Jz r2 = new C376959Jz((Object) this, (Object) r6, (AnonymousClass4D7) null, 6);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A02);
    }

    public static /* synthetic */ void fetchExecuTorchVoltronModule$default(IgVoltronModelLoader igVoltronModelLoader, AnonymousClass8CK r2, int i, Object obj) {
        if ((i & 1) != 0) {
            r2 = AnonymousClass8CK.A00;
        }
        igVoltronModelLoader.fetchExecuTorchVoltronModule(r2);
    }

    public static /* synthetic */ void fetchPytorchVoltronModule$default(IgVoltronModelLoader igVoltronModelLoader, AnonymousClass8CJ r2, int i, Object obj) {
        if ((i & 1) != 0) {
            r2 = AnonymousClass8CJ.A00;
        }
        igVoltronModelLoader.fetchPytorchVoltronModule(r2);
    }

    public static /* synthetic */ void fetchSentencePieceVoltronModule$default(IgVoltronModelLoader igVoltronModelLoader, AnonymousClass8CL r2, int i, Object obj) {
        if ((i & 1) != 0) {
            r2 = AnonymousClass8CL.A00;
        }
        igVoltronModelLoader.fetchSentencePieceVoltronModule(r2);
    }

    public static final synchronized IgVoltronModelLoader getInstance(UserSession userSession2) {
        IgVoltronModelLoader A00;
        synchronized (IgVoltronModelLoader.class) {
            A00 = Companion.A00(userSession2);
        }
        return A00;
    }

    public final void fetchAllModules() {
        fetchPytorchVoltronModule(AnonymousClass8CJ.A00);
        fetchExecuTorchVoltronModule(AnonymousClass8CK.A00);
        fetchSentencePieceVoltronModule(AnonymousClass8CL.A00);
    }

    public final AtomicBoolean getAreExecuTorchLibrariesLoaded() {
        return this.areExecuTorchLibrariesLoaded;
    }

    public final AtomicBoolean getArePytorchLibrariesLoaded() {
        return this.arePytorchLibrariesLoaded;
    }

    public final AtomicBoolean getAreSentencePieceLibrariesLoaded() {
        return this.areSentencePieceLibrariesLoaded;
    }

    public IgVoltronModelLoader(UserSession userSession2) {
        this.userSession = userSession2;
        this.arePytorchLibrariesLoaded = new AtomicBoolean(false);
        this.areExecuTorchLibrariesLoaded = new AtomicBoolean(false);
        this.areSentencePieceLibrariesLoaded = new AtomicBoolean(false);
    }
}
