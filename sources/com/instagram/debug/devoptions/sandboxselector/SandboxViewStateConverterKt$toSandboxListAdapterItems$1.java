package com.instagram.debug.devoptions.sandboxselector;

import X.0sP;
import X.AnonymousClass0fD;
import android.view.View;

public final class SandboxViewStateConverterKt$toSandboxListAdapterItems$1 implements View.OnClickListener {
    public final /* synthetic */ 0sP $onServerSelected;
    public final /* synthetic */ Sandbox $server;

    public SandboxViewStateConverterKt$toSandboxListAdapterItems$1(0sP r1, Sandbox sandbox) {
        this.$onServerSelected = r1;
        this.$server = sandbox;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1107423024);
        this.$onServerSelected.invoke(this.$server);
        AnonymousClass0fD.A0C(1780275864, A05);
    }
}
