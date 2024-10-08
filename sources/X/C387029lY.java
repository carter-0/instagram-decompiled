package X;

import android.content.Context;
import com.instagram.debug.devoptions.apiperf.DebugHeadPlugin;

/* renamed from: X.9lY  reason: invalid class name and case insensitive filesystem */
public final class C387029lY extends 0vM {
    public final /* synthetic */ C637514f A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387029lY(C637514f r7) {
        super("initDebugHead", 1664189633, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        Context context = this.A00.A00;
        2RC.A00(context.getResources(), context.getFilesDir());
        if (1RH.A03 != null) {
            1RH A002 = 1RH.A00();
            1US r1 = 1US.A0M;
            if (!A002.A06(r1) && !1RH.A00().A07(r1)) {
                0KC.A0D("DebugHeadInitializer", "DebugHeadPlugin is enabled but downloadable-module isn't loaded");
                return;
            }
        }
        try {
            DebugHeadPlugin newInstance = Class.forName("com.instagram.debug.devoptions.debughead.DebugHeadPluginImpl").newInstance();
            0qQ.A0C(newInstance, "null cannot be cast to non-null type com.instagram.debug.devoptions.apiperf.DebugHeadPlugin");
            DebugHeadPlugin debugHeadPlugin = newInstance;
            DebugHeadPlugin.sInstance = debugHeadPlugin;
            debugHeadPlugin.onCreate(context);
            AnonymousClass2ZQ A003 = C71172bH.A00();
            0qQ.A0C(A003, C66579MXk.A00(1));
            DebugHeadPlugin.maybeAttachToWindow((Context) A003);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            0KC.A0F("DebugHeadInitializer", "Failed to initialize DebugHeapPluginImpl", e);
        }
    }
}
