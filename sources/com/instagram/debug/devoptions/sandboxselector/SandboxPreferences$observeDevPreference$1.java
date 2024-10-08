package com.instagram.debug.devoptions.sandboxselector;

import X.0eS;
import X.0ki;
import X.0qQ;
import X.0sL;
import X.0tS;
import X.0xZ;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C239083Et;
import X.C252683pV;
import X.C60340gF;
import X.C62320sa;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeDevPreference$1", f = "SandboxPreferences.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
public final class SandboxPreferences$observeDevPreference$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ C62320sa $selector;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SandboxPreferences this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SandboxPreferences$observeDevPreference$1(SandboxPreferences sandboxPreferences, C62320sa r3, AnonymousClass4D7 r4) {
        super(2, r4);
        this.this$0 = sandboxPreferences;
        this.$selector = r3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeDevPreference$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        ? sandboxPreferences$observeDevPreference$1 = new SandboxPreferences$observeDevPreference$1(this.this$0, this.$selector, r5);
        sandboxPreferences$observeDevPreference$1.L$0 = obj;
        return sandboxPreferences$observeDevPreference$1;
    }

    public final Object invoke(C252683pV r3, AnonymousClass4D7 r4) {
        return ((SandboxPreferences$observeDevPreference$1) create(r3, r4)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeDevPreference$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r5 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            final C252683pV r3 = (C252683pV) this.L$0;
            final C62320sa r0 = this.$selector;
            0ki.A00("SandboxPreferences.kt-observeDevPreference-1", new C62320sa() {
                public final void invoke() {
                    C252683pV.this.FIG(r0.invoke());
                }
            });
            final SandboxPreferences$observeDevPreference$1$listener$1 sandboxPreferences$observeDevPreference$1$listener$1 = new SandboxPreferences$observeDevPreference$1$listener$1(r3, this.$selector);
            this.this$0.devPrefs.A00.EBr(sandboxPreferences$observeDevPreference$1$listener$1);
            final SandboxPreferences sandboxPreferences = this.this$0;
            AnonymousClass2 r02 = new C62320sa() {
                public final void invoke() {
                    0tS r2 = SandboxPreferences.this.devPrefs;
                    0xZ r1 = r2;
                    0qQ.A0B(r1, 0);
                    r2.A00.FJ1(r1);
                }
            };
            this.label = 1;
            if (C239083Et.A00(this, r02, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            0eS.A00(obj);
        } else {
            throw AnonymousClass7TE.A0x();
        }
        return C60340gF.A00;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeDevPreference$1, X.4D7] */
    public final Object invokeSuspend$$forInline(Object obj) {
        final C252683pV r3 = (C252683pV) this.L$0;
        final C62320sa r0 = this.$selector;
        0ki.A00("SandboxPreferences.kt-observeDevPreference-1", new C62320sa() {
            public final void invoke() {
                C252683pV.this.FIG(r0.invoke());
            }
        });
        final SandboxPreferences$observeDevPreference$1$listener$1 sandboxPreferences$observeDevPreference$1$listener$1 = new SandboxPreferences$observeDevPreference$1$listener$1(r3, this.$selector);
        this.this$0.devPrefs.A00.EBr(sandboxPreferences$observeDevPreference$1$listener$1);
        final SandboxPreferences sandboxPreferences = this.this$0;
        C239083Et.A00(this, new C62320sa() {
            public final void invoke() {
                0tS r2 = SandboxPreferences.this.devPrefs;
                0xZ r1 = sandboxPreferences$observeDevPreference$1$listener$1;
                0qQ.A0B(r1, 0);
                r2.A00.FJ1(r1);
            }
        }, r3);
        return C60340gF.A00;
    }
}
