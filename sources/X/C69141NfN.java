package X;

import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.audiomodule.gen.AudioModuleFeatureFactory;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.connectfunnel.gen.ConnectFunnelFeatureFactory;
import com.facebook.rsys.metaaivoicestate.feature.gen.MetaAiVoiceStateFeatureFactory;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiMediaStatsProxy;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.rsys.proxies.IGRTCFeatureProviderProxy;
import java.util.ArrayList;

/* renamed from: X.NfN  reason: case insensitive filesystem */
public final class C69141NfN extends IGRTCFeatureProviderProxy {
    public final AudioModule A00;
    public final MetaAiVoiceStateProxy A01;
    public final UserSession A02;

    public C69141NfN(AudioModule audioModule, MetaAiVoiceStateProxy metaAiVoiceStateProxy, UserSession userSession) {
        0qQ.A0B(metaAiVoiceStateProxy, 3);
        this.A02 = userSession;
        this.A00 = audioModule;
        this.A01 = metaAiVoiceStateProxy;
    }

    public final ArrayList createFeatureHolders() {
        return 0sr.A1L(new FeatureHolder[]{AudioModuleFeatureFactory.CProxy.create(this.A00, true, true), ConnectFunnelFeatureFactory.CProxy.create(new C68367NCq(this.A02), false), MetaAiVoiceStateFeatureFactory.CProxy.create(this.A01, (MetaAiMediaStatsProxy) null)});
    }
}
