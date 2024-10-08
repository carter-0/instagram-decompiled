package com.instagram.debug.sandbox;

import X.0lg;
import X.0nA;
import X.0tS;
import X.1Ma;
import X.AnonymousClass1Qz;
import X.C59689JTv;
import X.DbV;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.instagram.realtimeclient.RealtimeClientManager;

public final class SandboxUtil$getSandboxDialog$builder$1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ 0tS $prefs;
    public final /* synthetic */ 0lg $session;
    public final /* synthetic */ ViewGroup $viewGroup;

    public SandboxUtil$getSandboxDialog$builder$1(ViewGroup viewGroup, 0tS r2, 0lg r3, Context context) {
        this.$viewGroup = viewGroup;
        this.$prefs = r2;
        this.$session = r3;
        this.$context = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SandboxUtil sandboxUtil = SandboxUtil.INSTANCE;
        sandboxUtil.processDevServerChange(this.$viewGroup, this.$prefs, this.$session);
        sandboxUtil.processMqttChange(this.$viewGroup, this.$prefs);
        0nA.A0N(this.$viewGroup);
        C59689JTv.A09(this.$context, DbV.A0u(this.$context, 1Ma.A00(), RealtimeClientManager.getLatestMqttHost(AnonymousClass1Qz.A00(this.$session)), 2131957662));
        dialogInterface.dismiss();
    }
}
