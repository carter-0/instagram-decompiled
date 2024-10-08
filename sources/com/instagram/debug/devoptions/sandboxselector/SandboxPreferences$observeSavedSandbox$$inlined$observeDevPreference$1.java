package com.instagram.debug.devoptions.sandboxselector;

import X.0eS;
import X.0ki;
import X.0qQ;
import X.0sL;
import X.0tS;
import X.0xZ;
import X.0xa;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C239083Et;
import X.C252683pV;
import X.C60340gF;
import X.C62320sa;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeSavedSandbox$$inlined$observeDevPreference$1", f = "SandboxPreferences.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
public final class SandboxPreferences$observeSavedSandbox$$inlined$observeDevPreference$1 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SandboxPreferences this$0;
    public final /* synthetic */ SandboxPreferences this$0$inline_fun;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SandboxPreferences$observeSavedSandbox$$inlined$observeDevPreference$1(SandboxPreferences sandboxPreferences, AnonymousClass4D7 r3, SandboxPreferences sandboxPreferences2) {
        super(2, r3);
        this.this$0$inline_fun = sandboxPreferences;
        this.this$0 = sandboxPreferences2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeSavedSandbox$$inlined$observeDevPreference$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        ? sandboxPreferences$observeSavedSandbox$$inlined$observeDevPreference$1 = new SandboxPreferences$observeSavedSandbox$$inlined$observeDevPreference$1(this.this$0$inline_fun, r5, this.this$0);
        sandboxPreferences$observeSavedSandbox$$inlined$observeDevPreference$1.L$0 = obj;
        return sandboxPreferences$observeSavedSandbox$$inlined$observeDevPreference$1;
    }

    public final Object invoke(C252683pV r3, AnonymousClass4D7 r4) {
        return ((SandboxPreferences$observeSavedSandbox$$inlined$observeDevPreference$1) create(r3, r4)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.debug.devoptions.sandboxselector.SandboxPreferences$observeSavedSandbox$$inlined$observeDevPreference$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r5 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            final C252683pV r3 = (C252683pV) this.L$0;
            final SandboxPreferences sandboxPreferences = this.this$0;
            0ki.A00("SandboxPreferences.kt-observeDevPreference-1", new C62320sa() {
                public final void invoke() {
                    r3.FIG(sandboxPreferences.getSavedSandbox());
                }
            });
            final SandboxPreferences sandboxPreferences2 = this.this$0;
            final AnonymousClass2 r2 = new 0xZ() {
                public final void onChanged(0xa r4, String str) {
                    if (0qQ.A0K(str, "using_dev_server") || 0qQ.A0K(str, "dev_server_name")) {
                        final C252683pV r2 = r3;
                        final SandboxPreferences sandboxPreferences = sandboxPreferences2;
                        0ki.A00("SandboxPreferences.kt-observeDevPReference-2", new C62320sa() {
                            public final void invoke() {
                                r2.FIG(sandboxPreferences.getSavedSandbox());
                            }
                        });
                    }
                }
            };
            this.this$0$inline_fun.devPrefs.A00.EBr(r2);
            final SandboxPreferences sandboxPreferences3 = this.this$0$inline_fun;
            AnonymousClass3 r0 = new C62320sa() {
                public final void invoke() {
                    0tS r2 = SandboxPreferences.this.devPrefs;
                    0xZ r1 = r2;
                    0qQ.A0B(r1, 0);
                    r2.A00.FJ1(r1);
                }
            };
            this.label = 1;
            if (C239083Et.A00(this, r0, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            0eS.A00(obj);
        } else {
            throw AnonymousClass7TE.A0x();
        }
        return C60340gF.A00;
    }
}
